package com.uptodown.receivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.uptodown.UptodownApp;
import k5.r;
import n4.e;
import n5.d;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class DownloadUpdateNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        int intExtra;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1881097171) {
                if (hashCode != 75902422) {
                    if (hashCode == 1980572282 && str.equals("CANCEL") && (intExtra = intent.getIntExtra("notificationID", -1)) == 262 && context != null) {
                        float f7 = UptodownApp.G;
                        e.f();
                        r a10 = d.a();
                        if (a10 != null) {
                            a10.d();
                        }
                        Object systemService = context.getSystemService("notification");
                        systemService.getClass();
                        ((NotificationManager) systemService).cancel(intExtra);
                        return;
                    }
                    return;
                }
                if (str.equals("PAUSE")) {
                    d.e();
                    return;
                }
                return;
            }
            if (str.equals("RESUME")) {
                d.f();
            }
        }
    }
}
