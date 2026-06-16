package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.ListenableWorker;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.uptodown.UptodownApp;
import java.util.HashMap;
import k5.g2;
import n4.e;
import org.json.JSONObject;
import s4.c;
import s7.a;
import w5.r;
import w5.s;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SendUserUsageStatsWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4541a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendUserUsageStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4541a = context;
        Activity activity = c.o;
        this.f4541a = b.j(context);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        String str;
        Context context = this.f4541a;
        if (r.b(context)) {
            int w6 = a.w(context, 0, "stats_downloads");
            int w10 = a.w(context, 0, "stats_installs");
            int w11 = a.w(context, 0, "stats_updates");
            a.x(0L, context, "stats_time");
            long a10 = r.a(context);
            s sVar = new s(context);
            HashMap hashMap = new HashMap();
            hashMap.put("usageTime", String.valueOf(a10));
            hashMap.put("downloads", String.valueOf(w6));
            hashMap.put("installations", String.valueOf(w10));
            hashMap.put("updates", String.valueOf(w11));
            hashMap.put("lastUpdate", String.valueOf(System.currentTimeMillis() / 1000));
            g2 k10 = sVar.k("https://www.uptodown.app:443".concat("/eapi/user-data/native-app-usage"), hashMap, ShareTarget.METHOD_POST, false);
            k10.f7392d = sVar.i(k10, "/eapi/user-data/native-app-usage");
            if (!k10.b() && (str = k10.f7389a) != null && str.length() != 0) {
                String str2 = k10.f7389a;
                str2.getClass();
                if (new JSONObject(str2).optInt("success") == 1) {
                    a.O(context, 0, "stats_downloads");
                    a.O(context, 0, "stats_installs");
                    a.O(context, 0, "stats_updates");
                    a.Q(0L, context, "stats_time");
                }
            }
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("stats_enabled", false);
            edit.apply();
            float f7 = UptodownApp.G;
            if (e.o(context, "SendUserUsageStatsWorker")) {
                WorkManager.Companion.getInstance(context).cancelAllWorkByTag("SendUserUsageStatsWorker");
            }
        }
        ListenableWorker.Result success = ListenableWorker.Result.success();
        success.getClass();
        return success;
    }
}
