package com.uptodown.workers;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.provider.Settings;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.a4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k5.g2;
import k5.q;
import org.json.JSONArray;
import org.json.JSONObject;
import w5.g;
import w5.s;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DeviceStatusWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4522a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceStatusWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4522a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0138, code lost:
    
        if (r9.moveToFirst() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013a, code lost:
    
        r17 = r9.getLong(r9.getColumnIndexOrThrow("id"));
        r19 = r9.getLong(r9.getColumnIndexOrThrow("timestamp"));
        r21 = r9.getInt(r9.getColumnIndexOrThrow("batteryLevel"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015f, code lost:
    
        if (r9.getInt(r9.getColumnIndexOrThrow("isCharging")) != 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016e, code lost:
    
        if (r9.getInt(r9.getColumnIndexOrThrow("isWifiConnected")) != 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0170, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0175, code lost:
    
        r8.add(new k5.q(r17, r19, r21, r22, r23, r9.getInt(r9.getColumnIndexOrThrow("uploadSpeedKbps"))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0189, code lost:
    
        if (r9.moveToNext() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0173, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0164, code lost:
    
        r22 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018e, code lost:
    
        r9.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // androidx.work.Worker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableWorker.Result doWork() {
        int i;
        int i3;
        int i8;
        int i10;
        int i11;
        NetworkCapabilities networkCapabilities;
        ?? r10;
        NetworkCapabilities networkCapabilities2;
        int linkUpstreamBandwidthKbps;
        long j;
        Cursor cursor;
        String string;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Context context = this.f4522a;
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("level", -1);
        } else {
            i = -1;
        }
        if (registerReceiver != null) {
            i3 = registerReceiver.getIntExtra("scale", -1);
        } else {
            i3 = -1;
        }
        if (i >= 0 && i3 > 0) {
            i8 = (i * 100) / i3;
        } else {
            i8 = -1;
        }
        Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver2 != null) {
            i10 = registerReceiver2.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        } else {
            i10 = -1;
        }
        if (i10 != 2 && i10 != 5) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            r10 = 0;
        } else {
            r10 = networkCapabilities.hasTransport(1);
        }
        Object systemService2 = context.getSystemService("connectivity");
        systemService2.getClass();
        ConnectivityManager connectivityManager2 = (ConnectivityManager) systemService2;
        Network activeNetwork2 = connectivityManager2.getActiveNetwork();
        if (activeNetwork2 == null || (networkCapabilities2 = connectivityManager2.getNetworkCapabilities(activeNetwork2)) == null) {
            linkUpstreamBandwidthKbps = 0;
        } else {
            linkUpstreamBandwidthKbps = networkCapabilities2.getLinkUpstreamBandwidthKbps();
        }
        long currentTimeMillis = System.currentTimeMillis();
        g f7 = g.D.f(context);
        f7.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(currentTimeMillis));
        contentValues.put("batteryLevel", Integer.valueOf(i8));
        contentValues.put("isCharging", Integer.valueOf(i11));
        contentValues.put("isWifiConnected", Integer.valueOf((int) r10));
        contentValues.put("uploadSpeedKbps", Integer.valueOf(linkUpstreamBandwidthKbps));
        SQLiteDatabase sQLiteDatabase = f7.f11192a;
        sQLiteDatabase.getClass();
        sQLiteDatabase.insert("device_status", null, contentValues);
        f7.d();
        SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
        try {
            try {
                j = sharedPreferences.getLong("last_device_status_send_timestamp", 0L);
            } catch (ClassCastException unused) {
                j = sharedPreferences.getInt("last_device_status_send_timestamp", -1);
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences2.getClass();
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.putLong("last_device_status_send_timestamp", j);
                edit.apply();
            }
        } catch (ClassCastException unused2) {
            j = 0;
        }
        if (System.currentTimeMillis() - j >= CalendarModelKt.MillisecondsIn24Hours && a4.f3693b) {
            g f10 = g.D.f(context);
            f10.b();
            ArrayList arrayList = new ArrayList();
            try {
                SQLiteDatabase sQLiteDatabase2 = f10.f11192a;
                sQLiteDatabase2.getClass();
                cursor = sQLiteDatabase2.query("device_status", null, null, null, null, null, "timestamp DESC");
                try {
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    if (!arrayList.isEmpty() && (string = Settings.Secure.getString(context.getContentResolver(), "android_id")) != null) {
                        s sVar = new s(context);
                        String concat = "https://www.uptodown.app:443".concat("/eapi/v3/device/daily-stats");
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = arrayList.iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            q qVar = (q) next;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("hourTimestamp", qVar.f7482b);
                            jSONObject.put("batteryLevel", qVar.f7483c);
                            jSONObject.put("isCharging", qVar.f7484d);
                            jSONObject.put("wifiConnected", qVar.f7485e);
                            jSONObject.put("uploadSpeedKbps", qVar.f7486f);
                            jSONArray.put(jSONObject);
                            sVar = sVar;
                            it = it;
                        }
                        s sVar2 = sVar;
                        HashMap hashMap = new HashMap();
                        hashMap.put("identifier", string);
                        hashMap.put("date", String.valueOf(System.currentTimeMillis() / 1000));
                        hashMap.put("hourlyStats", jSONArray.toString());
                        g2 k10 = sVar2.k(concat, hashMap, ShareTarget.METHOD_POST, false);
                        k10.f7392d = sVar2.i(k10, concat);
                        if (!k10.b()) {
                            SQLiteDatabase sQLiteDatabase3 = f10.f11192a;
                            sQLiteDatabase3.getClass();
                            sQLiteDatabase3.delete("device_status", null, null);
                            long currentTimeMillis2 = System.currentTimeMillis();
                            SharedPreferences sharedPreferences3 = context.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences3.getClass();
                            SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                            edit2.putLong("last_device_status_send_timestamp", currentTimeMillis2);
                            edit2.apply();
                        }
                    }
                    f10.d();
                    ListenableWorker.Result success = ListenableWorker.Result.success();
                    success.getClass();
                    return success;
                }
            } catch (Exception e11) {
                e = e11;
                cursor = null;
            }
        }
        ListenableWorker.Result success2 = ListenableWorker.Result.success();
        success2.getClass();
        return success2;
    }
}
