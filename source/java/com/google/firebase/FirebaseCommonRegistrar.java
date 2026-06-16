package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import c3.e;
import c3.g;
import c3.h;
import com.google.firebase.components.ComponentRegistrar;
import e2.a;
import e2.b;
import e2.j;
import e2.r;
import f2.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import z1.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a b10 = b.b(m3.b.class);
        b10.c(new j(2, 0, m3.a.class));
        b10.g = new i(27);
        arrayList.add(b10.d());
        r rVar = new r(d2.a.class, Executor.class);
        a aVar = new a(e.class, new Class[]{g.class, h.class});
        aVar.c(j.b(Context.class));
        aVar.c(j.b(f.class));
        aVar.c(new j(2, 0, c3.f.class));
        aVar.c(new j(1, 1, m3.b.class));
        aVar.c(new j(rVar, 1, 0));
        aVar.g = new c3.b(rVar, 0);
        arrayList.add(aVar.d());
        arrayList.add(a.a.k("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(a.a.k("fire-core", "22.0.1"));
        arrayList.add(a.a.k("device-name", b(Build.PRODUCT)));
        arrayList.add(a.a.k("device-model", b(Build.DEVICE)));
        arrayList.add(a.a.k("device-brand", b(Build.BRAND)));
        arrayList.add(a.a.u("android-target-sdk", new o2.a(19)));
        arrayList.add(a.a.u("android-min-sdk", new o2.a(20)));
        arrayList.add(a.a.u("android-platform", new o2.a(21)));
        arrayList.add(a.a.u("android-installer", new o2.a(22)));
        try {
            c7.f.f3513b.getClass();
            str = "2.2.10";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(a.a.k("kotlin", str));
        }
        return arrayList;
    }
}
