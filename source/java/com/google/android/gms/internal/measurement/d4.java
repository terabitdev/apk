package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class d4 {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f3735a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f3736b = !a();

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(Context context) {
        boolean z10;
        if (f3736b) {
            return true;
        }
        synchronized (d4.class) {
            try {
                if (f3736b) {
                    return true;
                }
                int i = 1;
                while (true) {
                    z10 = false;
                    if (i > 2) {
                        break;
                    }
                    if (f3735a == null) {
                        f3735a = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = f3735a;
                    if (userManager == null) {
                        z10 = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e10) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                        f3735a = null;
                        i++;
                    }
                }
                if (z10) {
                    f3735a = null;
                }
                if (z10) {
                    f3736b = true;
                }
                return z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
