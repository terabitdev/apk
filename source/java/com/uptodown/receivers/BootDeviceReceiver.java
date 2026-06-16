package com.uptodown.receivers;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.uptodown.UptodownApp;
import n4.e;
import s4.c;
import w5.l;
import z1.b;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class BootDeviceReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                if (intent.getAction() != null && v.a0(intent.getAction(), "android.intent.action.BOOT_COMPLETED", true) && context != null) {
                    float f7 = UptodownApp.G;
                    e.z(context);
                    Activity activity = c.o;
                    l.l(b.j(context));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
