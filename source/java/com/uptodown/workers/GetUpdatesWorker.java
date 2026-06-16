package com.uptodown.workers;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import b.d;
import b6.h;
import b6.i;
import b6.t;
import c8.f0;
import c8.p0;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import g7.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import k5.j0;
import k5.p;
import k5.p2;
import k5.r;
import k5.s1;
import n4.e;
import o4.a0;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.e0;
import s7.a;
import w5.g;
import w5.l;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GetUpdatesWorker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4534a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f4535b;

    /* renamed from: c, reason: collision with root package name */
    public int f4536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUpdatesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4534a = context;
        this.f4535b = new a0(context, 22);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(GetUpdatesWorker getUpdatesWorker, JSONObject jSONObject) {
        r rVar;
        Cursor cursor;
        s1 s1Var;
        Uri fromFile;
        e0 e0Var = g.D;
        Context context = getUpdatesWorker.f4534a;
        g f7 = e0Var.f(context);
        f7.b();
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("updates");
        int i = 0;
        if (optJSONArray != null) {
            arrayList.addAll(getUpdatesWorker.d(optJSONArray, f7, false));
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("partialUpdates");
        if (optJSONArray2 != null) {
            JSONArray jSONArray = new JSONArray();
            int length = optJSONArray2.length();
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObject2 = optJSONArray2.getJSONObject(i3);
                if (optJSONArray != null) {
                    int length2 = optJSONArray.length();
                    for (int i8 = i; i8 < length2; i8++) {
                        if (v.a0(jSONObject2.optString("packagename"), optJSONArray.getJSONObject(i8).optString("packagename"), true)) {
                            break;
                        }
                    }
                }
                jSONArray.put(jSONObject2);
                i3++;
                i = 0;
            }
            arrayList.addAll(getUpdatesWorker.d(jSONArray, f7, true));
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            if (v.a0(context.getPackageName(), ((p2) next).f7479b, true)) {
                z10 = true;
            }
        }
        Iterator it2 = f7.a0().iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            String str = ((p2) next2).f7479b;
            Iterator it3 = arrayList.iterator();
            it3.getClass();
            while (true) {
                if (it3.hasNext()) {
                    Object next3 = it3.next();
                    next3.getClass();
                    if (v.a0(str, ((p2) next3).f7479b, true)) {
                        break;
                    }
                } else {
                    f7.w(str);
                    break;
                }
            }
        }
        f7.d();
        String str2 = null;
        if (a.v(context, "is_status_code_526", false)) {
            if (l.a(context)) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
                builder.setSmallIcon(R.drawable.vector_uptodown_notification);
                String string = context.getString(R.string.new_update_available);
                string.getClass();
                builder.setContentTitle(string);
                String string2 = context.getString(R.string.dialog_updates_available);
                string2.getClass();
                builder.setContentText(string2);
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                    if (sharedPreferences.contains("url_526")) {
                        str2 = sharedPreferences.getString("url_526", null);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (str2 != null) {
                    builder.setContentIntent(PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse(str2)), 201326592));
                }
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                ((NotificationManager) systemService).notify(264, builder.build());
                l.k(string, String.valueOf(System.currentTimeMillis()), string2, null, null, context);
            }
            if (z10) {
                float f10 = UptodownApp.G;
                if (!e.o(context, "GenerateQueueWorker")) {
                    WorkManager.Companion.getInstance(context).enqueue(((OneTimeWorkRequest.Builder) i6.l(GenerateQueueWorker.class, "GenerateQueueWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", true).putBoolean("downloadUptodown", true).build()).build());
                    return;
                }
                return;
            }
            return;
        }
        if (!a.v(context, "install_apk_rooted", false) && !a.l(context)) {
            l.l(context);
            t.a(context, null);
        } else {
            float f11 = UptodownApp.G;
            if (!e.o(context, "GenerateQueueWorker")) {
                WorkManager.Companion.getInstance(context).enqueue(((OneTimeWorkRequest.Builder) i6.l(GenerateQueueWorker.class, "GenerateQueueWorker")).setInputData(new Data.Builder().putBoolean("downloadAnyway", false).putString("packagename", null).build()).build());
            }
        }
        if (z10) {
            f7.b();
            String packageName = context.getPackageName();
            packageName.getClass();
            p2 Y = f7.Y(packageName);
            f7.d();
            if (Y != null) {
                rVar = Y.s;
            } else {
                rVar = null;
            }
            if (rVar != null && rVar.c()) {
                g f12 = g.D.f(context);
                f12.b();
                try {
                    SQLiteDatabase sQLiteDatabase = f12.f11192a;
                    sQLiteDatabase.getClass();
                    cursor = sQLiteDatabase.query("notifications", f12.s, "actions=?", new String[]{"update_uptodown"}, null, null, "id DESC");
                    try {
                        if (cursor.moveToFirst()) {
                            s1 s1Var2 = new s1();
                            s1Var2.a(cursor);
                            s1Var = s1Var2;
                        } else {
                            s1Var = null;
                        }
                        try {
                            cursor.close();
                        } catch (Exception e11) {
                            e = e11;
                            e.printStackTrace();
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            f12.d();
                            if (s1Var != null) {
                            }
                            if (str2 == null) {
                                return;
                            } else {
                                return;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        s1Var = null;
                    }
                } catch (Exception e13) {
                    e = e13;
                    cursor = null;
                    s1Var = null;
                }
                f12.d();
                if (s1Var != null) {
                    str2 = s1Var.f7513b;
                }
                if (str2 == null && !rVar.F.isEmpty() && ((j0) rVar.F.get(0)).q != null) {
                    String str3 = ((j0) rVar.F.get(0)).q;
                    str3.getClass();
                    File file = new File(str3);
                    if (file.exists()) {
                        String str4 = s1Var.f7513b;
                        str4.getClass();
                        if (System.currentTimeMillis() - Long.parseLong(str4) > 604800000) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                fromFile = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
                                fromFile.getClass();
                            } else {
                                fromFile = Uri.fromFile(file);
                                fromFile.getClass();
                            }
                            l.j(context, fromFile);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            UptodownApp.f4376a0.send(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, null);
        }
    }

    public final void c(p2 p2Var) {
        ArrayList arrayList = p2Var.t;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = p2Var.t;
            arrayList2.getClass();
            ArrayList c10 = p.c(this.f4534a, arrayList2);
            if (!c10.isEmpty()) {
                Iterator it = c10.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putInt("update", 1);
                    bundle.putString("feature", (String) next);
                    this.f4535b.u(bundle, "required_features_not_supported");
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r5 != 4) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(JSONArray jSONArray, g gVar, boolean z10) {
        p2 H;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (!optJSONObject.isNull("packagename")) {
                String optString = optJSONObject.optString("packagename");
                optString.getClass();
                k5.e B = gVar.B(optString);
                if (B != null && (H = f1.g.H(B, optJSONObject)) != null) {
                    if (z10) {
                        H.p = 1;
                    }
                    String str = H.f7479b;
                    p2 Y = gVar.Y(str);
                    if (Y != null) {
                        if (Y.b(H)) {
                            gVar.w(str);
                            gVar.e0(H);
                            c(H);
                        }
                    } else {
                        gVar.e0(H);
                        c(H);
                        Context context = this.f4534a;
                        context.getClass();
                        try {
                            int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting(str);
                            if (applicationEnabledSetting != 2) {
                                if (applicationEnabledSetting != 3) {
                                }
                            }
                        } catch (Error e10) {
                            e10.printStackTrace();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    arrayList.add(H);
                }
            }
        }
        return arrayList;
        this.f4536c++;
        arrayList.add(H);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(c cVar) {
        h hVar;
        int i;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i3 = hVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.l = i3 - Integer.MIN_VALUE;
                Object obj = hVar.f3318a;
                i = hVar.l;
                if (i == 0) {
                    if (i == 1) {
                        c7.a.e(obj);
                    } else {
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    c7.a.e(obj);
                    j8.e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    i iVar = new i(this, null);
                    hVar.l = 1;
                    obj = f0.K(dVar, iVar, hVar);
                    h7.a aVar = h7.a.f6117a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                obj.getClass();
                return obj;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f3318a;
        i = hVar.l;
        if (i == 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
