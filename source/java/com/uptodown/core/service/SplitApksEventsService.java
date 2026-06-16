package com.uptodown.core.service;

import a5.n;
import a5.o;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.compose.foundation.gestures.x;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.google.android.gms.internal.measurement.l5;
import com.uptodown.core.activities.ConfirmationIntentWrapperActivity;
import j$.util.concurrent.ConcurrentHashMap;
import s4.a;
import s4.c;
import y4.d;
import y4.e;
import y4.f;
import y4.g;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class SplitApksEventsService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r8 == null) goto L40;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int onStartCommand(Intent intent, int i, int i3) {
        Parcelable parcelableExtra;
        String str;
        String str2;
        String concat;
        intent.getClass();
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", -999);
        int intExtra2 = intent.getIntExtra("android.content.pm.extra.SESSION_ID", -1);
        d dVar = new d(intExtra);
        d dVar2 = c.p;
        if (dVar2 == null || dVar2.f11403a != intExtra || dVar.f11404b - dVar2.f11404b >= 600) {
            c.p = dVar;
            a aVar = a.f10430a;
            y4.a c10 = aVar.c();
            if (intExtra != -1) {
                if (intExtra != 0) {
                    if (intExtra != 3) {
                        ConcurrentHashMap concurrentHashMap = n.f152c;
                        l5.p(intExtra2, true);
                        String str3 = null;
                        switch (intExtra) {
                            case 1:
                                String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                                str = "Installation failed";
                                if (stringExtra != null && stringExtra.length() != 0 && v.e0(stringExtra, "-3001", false)) {
                                    str3 = "Version not compatible";
                                } else {
                                    str3 = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                                }
                                concat = str;
                                break;
                            case 2:
                                String stringExtra2 = intent.getStringExtra("android.content.pm.extra.OTHER_PACKAGE_NAME");
                                if (stringExtra2 != null) {
                                    Context applicationContext = getApplicationContext();
                                    applicationContext.getClass();
                                    try {
                                        PackageManager packageManager = applicationContext.getPackageManager();
                                        packageManager.getClass();
                                        str2 = packageManager.getApplicationLabel(o.b(packageManager, stringExtra2, 0)).toString();
                                        break;
                                    } catch (Exception unused) {
                                        str2 = null;
                                        break;
                                    }
                                }
                                str2 = "device";
                                concat = "Installation was blocked by ".concat(str2);
                                break;
                            case 3:
                                concat = "Installation canceled";
                                break;
                            case 4:
                                String stringExtra3 = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                                str = "Invalid apk";
                                if (stringExtra3 != null && stringExtra3.length() != 0 && v.e0(stringExtra3, "INSTALL_FAILED_VERSION_DOWNGRADE", false)) {
                                    str3 = "It could not be installed because it is a lower version.";
                                } else {
                                    str3 = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                                }
                                concat = str;
                                break;
                            case 5:
                                concat = "Conflict with a package already installed";
                                break;
                            case 6:
                                concat = "No free space on disk";
                                break;
                            case 7:
                                concat = "Application not compatible";
                                break;
                            default:
                                str3 = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                                concat = "Unexpected error";
                                break;
                        }
                        if (str3 != null) {
                            concat = x.m(concat, ": ", str3);
                        }
                        a aVar2 = a.f10430a;
                        a.f10433d.c(new f(c10, concat, intExtra));
                        aVar2.a();
                        ConcurrentHashMap concurrentHashMap2 = n.f152c;
                        l5.o(intExtra2, false);
                    } else {
                        ConcurrentHashMap concurrentHashMap3 = n.f152c;
                        l5.p(intExtra2, true);
                        a.f10433d.c(new e(c10));
                        aVar.a();
                        l5.o(intExtra2, false);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap4 = n.f152c;
                    l5.p(intExtra2, true);
                    a.f10433d.c(new g(c10));
                    aVar.a();
                    l5.o(intExtra2, true);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelableExtra = (Parcelable) intent.getParcelableExtra("android.intent.extra.INTENT", Intent.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
                }
                Intent intent2 = new Intent(this, (Class<?>) ConfirmationIntentWrapperActivity.class);
                intent2.putExtra("com.uptodown.sapk.confirmation_intent", (Intent) parcelableExtra);
                intent2.putExtra("com.uptodown.sapk.session_id", intExtra2);
                intent2.addFlags(GroupFlagsKt.IsMovableContentFlag);
                try {
                    startActivity(intent2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    a aVar3 = a.f10430a;
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    a.f10433d.c(new f(c10, message, 1));
                    a.f10430a.a();
                    ConcurrentHashMap concurrentHashMap5 = n.f152c;
                    l5.p(intExtra2, false);
                }
            }
        }
        stopSelf();
        return 2;
    }
}
