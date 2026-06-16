package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import d2.a;
import d2.b;
import d2.c;
import e2.j;
import e2.r;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import l8.f;
import p3.d;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4194d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final r f4195a = new r(a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    public final r f4196b = new r(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    public final r f4197c = new r(c.class, ExecutorService.class);

    static {
        Map map = p3.c.f9384b;
        d dVar = d.f9385a;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new p3.a(new f(true)));
        Log.d("FirebaseSessions", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        e2.a b10 = e2.b.b(g2.c.class);
        b10.f4815c = "fire-cls";
        b10.c(j.b(z1.f.class));
        b10.c(j.b(f3.d.class));
        b10.c(new j(this.f4195a, 1, 0));
        b10.c(new j(this.f4196b, 1, 0));
        b10.c(new j(this.f4197c, 1, 0));
        b10.c(new j(0, 2, h2.b.class));
        b10.c(new j(0, 2, b2.a.class));
        b10.c(new j(0, 2, n3.a.class));
        b10.g = new androidx.core.view.inputmethod.b(this, 10);
        b10.e(2);
        return Arrays.asList(b10.d(), a.a.k("fire-cls", "20.0.4"));
    }
}
