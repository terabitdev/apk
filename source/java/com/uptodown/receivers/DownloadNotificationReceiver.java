package com.uptodown.receivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import k5.r;
import n5.b;
import w5.g;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class DownloadNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        int intExtra;
        String str2;
        int intExtra2;
        r b10;
        String str3;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1919974852:
                    if (str.equals("CANCEL_ALL") && (intExtra = intent.getIntExtra("notificationID", -1)) == 261 && context != null) {
                        r b11 = b.b();
                        ArrayList arrayList = new ArrayList();
                        g f7 = g.D.f(context);
                        f7.b();
                        Iterator it = f7.P().iterator();
                        it.getClass();
                        while (it.hasNext()) {
                            Object next = it.next();
                            next.getClass();
                            r rVar = (r) next;
                            if (rVar.m()) {
                                arrayList.add(rVar);
                            }
                        }
                        f7.d();
                        if (b11 != null && (str2 = b11.f7495b) != null && str2.length() != 0) {
                            b.f();
                            b11.s(context);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((r) obj).s(context);
                            }
                        }
                        Object systemService = context.getSystemService("notification");
                        systemService.getClass();
                        ((NotificationManager) systemService).cancel(intExtra);
                        return;
                    }
                    return;
                case -1881097171:
                    if (str.equals("RESUME")) {
                        b.h();
                        return;
                    }
                    return;
                case 75902422:
                    if (str.equals("PAUSE")) {
                        b.g();
                        return;
                    }
                    return;
                case 1980572282:
                    if (str.equals("CANCEL") && (intExtra2 = intent.getIntExtra("notificationID", -1)) == 261 && (b10 = b.b()) != null && (str3 = b10.f7495b) != null && str3.length() != 0) {
                        b.f();
                        if (context != null) {
                            b10.s(context);
                            ArrayList arrayList2 = new ArrayList();
                            g f10 = g.D.f(context);
                            f10.b();
                            Iterator it2 = f10.P().iterator();
                            it2.getClass();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                next2.getClass();
                                r rVar2 = (r) next2;
                                if (rVar2.m()) {
                                    arrayList2.add(rVar2);
                                }
                            }
                            f10.d();
                            if (arrayList2.isEmpty()) {
                                Object systemService2 = context.getSystemService("notification");
                                systemService2.getClass();
                                ((NotificationManager) systemService2).cancel(intExtra2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
