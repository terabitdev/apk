package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class m4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile w1.b f3890a = w1.a.f11123a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3891b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context, Uri uri) {
        int i;
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (f3890a.b()) {
            return ((Boolean) f3890a.a()).booleanValue();
        }
        synchronized (f3891b) {
            try {
                if (f3890a.b()) {
                    return ((Boolean) f3890a.a()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    PackageManager packageManager = context.getPackageManager();
                    if (Build.VERSION.SDK_INT < 29) {
                        i = 0;
                    } else {
                        i = GroupFlagsKt.IsMovableContentFlag;
                    }
                    ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.phenotype", i);
                    if (resolveContentProvider != null) {
                    }
                    f3890a = new w1.c(Boolean.valueOf(z10));
                    return ((Boolean) f3890a.a()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z10 = true;
                }
                f3890a = new w1.c(Boolean.valueOf(z10));
                return ((Boolean) f3890a.a()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
