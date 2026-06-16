package com.google.firebase;

import androidx.annotation.Keep;
import c8.y;
import com.google.firebase.components.ComponentRegistrar;
import d2.c;
import d2.d;
import e2.a;
import e2.b;
import e2.j;
import e2.r;
import java.util.List;
import java.util.concurrent.Executor;
import z1.g;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a a10 = b.a(new r(d2.a.class, y.class));
        a10.c(new j(new r(d2.a.class, Executor.class), 1, 0));
        a10.g = g.f11492b;
        b d10 = a10.d();
        a a11 = b.a(new r(c.class, y.class));
        a11.c(new j(new r(c.class, Executor.class), 1, 0));
        a11.g = g.l;
        b d11 = a11.d();
        a a12 = b.a(new r(d2.b.class, y.class));
        a12.c(new j(new r(d2.b.class, Executor.class), 1, 0));
        a12.g = g.m;
        b d12 = a12.d();
        a a13 = b.a(new r(d.class, y.class));
        a13.c(new j(new r(d.class, Executor.class), 1, 0));
        a13.g = g.f11493n;
        return f1.g.G(d10, d11, d12, a13.d());
    }
}
