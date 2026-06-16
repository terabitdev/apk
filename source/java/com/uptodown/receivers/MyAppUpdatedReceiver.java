package com.uptodown.receivers;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.uptodown.workers.MyAppUpdatedWorker;
import kotlin.jvm.internal.p;
import s4.c;
import s7.a;
import z1.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MyAppUpdatedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Activity activity = c.o;
        Context j = b.j(context);
        if (p.b(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED")) {
            a.S(context, "device_status", null);
            a.S(j, "last_notification_timestamp", "0");
            a.M(j, "settings_utd_sended", false);
            a.M(j, "is_status_code_526", false);
            a.S(j, "url_526", null);
            Object systemService = j.getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancel(259);
            WorkManager.Companion.getInstance(j).enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) MyAppUpdatedWorker.class).addTag("MyAppUpdatedWorker").build());
        }
    }
}
