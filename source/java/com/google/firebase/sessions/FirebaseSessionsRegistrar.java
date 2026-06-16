package com.google.firebase.sessions;

import a5.w;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import c8.y;
import com.google.firebase.components.ComponentRegistrar;
import d2.a;
import d2.b;
import e2.c;
import e2.j;
import e2.r;
import f1.g;
import f3.d;
import g7.h;
import java.util.List;
import k0.e;
import o3.i;
import o3.m;
import o3.o;
import o3.s;
import o3.s0;
import o3.t;
import o3.v;
import o4.bd;
import q1.p4;
import z1.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final v Companion = new Object();
    private static final r appContext = r.a(Context.class);
    private static final r firebaseApp = r.a(f.class);
    private static final r firebaseInstallationsApi = r.a(d.class);
    private static final r backgroundDispatcher = new r(a.class, y.class);
    private static final r blockingDispatcher = new r(b.class, y.class);
    private static final r transportFactory = r.a(a0.f.class);
    private static final r firebaseSessionsComponent = r.a(o3.r.class);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o3.v] */
    static {
        try {
            MultiProcessDataStoreFactory.INSTANCE.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    public static final o getComponents$lambda$0(c cVar) {
        return (o) ((i) ((o3.r) cVar.f(firebaseSessionsComponent))).p.get();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, o3.r, o3.i] */
    public static final o3.r getComponents$lambda$1(c cVar) {
        Object f7 = cVar.f(appContext);
        f7.getClass();
        Object f10 = cVar.f(backgroundDispatcher);
        f10.getClass();
        Object f11 = cVar.f(blockingDispatcher);
        f11.getClass();
        Object f12 = cVar.f(firebaseApp);
        f12.getClass();
        Object f13 = cVar.f(firebaseInstallationsApi);
        f13.getClass();
        e3.b c10 = cVar.c(transportFactory);
        c10.getClass();
        ?? obj = new Object();
        obj.f8416a = bd.E((f) f12);
        bd E = bd.E((Context) f7);
        obj.f8417b = E;
        obj.f8418c = q3.a.a(new m(E, 1));
        obj.f8419d = q3.a.a(t.f8467a);
        obj.f8420e = bd.E((d) f13);
        obj.f8421f = q3.a.a(new m3.c(obj.f8416a, 13));
        bd E2 = bd.E((h) f11);
        obj.g = E2;
        obj.h = q3.a.a(new s(obj.f8421f, E2));
        obj.i = bd.E((h) f10);
        obj.j = q3.a.a(new s0(obj.f8418c, q3.a.a(new w(obj.f8419d, obj.f8420e, obj.f8421f, obj.h, q3.a.a(new p4(obj.i, obj.f8419d, q3.a.a(new s(obj.f8417b, obj.g, 0)))), 12)), 1));
        q3.c a10 = q3.a.a(t.f8468b);
        obj.f8422k = a10;
        obj.l = q3.a.a(new s0(obj.f8419d, a10, 0));
        obj.m = q3.a.a(new w(obj.f8416a, obj.f8420e, obj.j, q3.a.a(new m(bd.E(c10), 0)), obj.i, 10));
        obj.f8423n = q3.a.a(new a3.i(obj.f8417b, obj.g, q3.a.a(new e(obj.l, 1)), 20));
        q3.c a11 = q3.a.a(new q2.c(obj.j, obj.l, obj.m, obj.f8419d, obj.f8423n, q3.a.a(new s(obj.f8417b, obj.f8422k, 1)), obj.i, 12));
        obj.o = a11;
        obj.p = q3.a.a(new k3.t(obj.f8416a, obj.j, obj.i, q3.a.a(new m3.c(a11, 14)), 17));
        return obj;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<e2.b> getComponents() {
        e2.a b10 = e2.b.b(o.class);
        b10.f4815c = LIBRARY_NAME;
        b10.c(j.a(firebaseSessionsComponent));
        b10.g = new o2.a(7);
        b10.e(2);
        e2.b d10 = b10.d();
        e2.a b11 = e2.b.b(o3.r.class);
        b11.f4815c = "fire-sessions-component";
        b11.c(j.a(appContext));
        b11.c(j.a(backgroundDispatcher));
        b11.c(j.a(blockingDispatcher));
        b11.c(j.a(firebaseApp));
        b11.c(j.a(firebaseInstallationsApi));
        b11.c(new j(transportFactory, 1, 1));
        b11.g = new o2.a(8);
        return g.G(d10, b11.d(), a.a.k(LIBRARY_NAME, "3.0.4"));
    }
}
