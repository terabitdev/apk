package com.google.firebase.messaging;

import androidx.annotation.Keep;
import c3.h;
import com.google.firebase.components.ComponentRegistrar;
import d3.a;
import e2.c;
import e2.j;
import e2.r;
import f3.d;
import java.util.Arrays;
import java.util.List;
import m3.b;
import z1.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r rVar, c cVar) {
        f fVar = (f) cVar.a(f.class);
        if (cVar.a(a.class) == null) {
            return new FirebaseMessaging(fVar, cVar.d(b.class), cVar.d(h.class), (d) cVar.a(d.class), cVar.c(rVar), (b3.c) cVar.a(b3.c.class));
        }
        a8.c.i();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<e2.b> getComponents() {
        r rVar = new r(v2.b.class, a0.f.class);
        e2.a b10 = e2.b.b(FirebaseMessaging.class);
        b10.f4815c = LIBRARY_NAME;
        b10.c(j.b(f.class));
        b10.c(new j(0, 0, a.class));
        b10.c(new j(0, 1, b.class));
        b10.c(new j(0, 1, h.class));
        b10.c(j.b(d.class));
        b10.c(new j(rVar, 0, 1));
        b10.c(j.b(b3.c.class));
        b10.g = new c3.b(rVar, 1);
        b10.e(1);
        return Arrays.asList(b10.d(), a.a.k(LIBRARY_NAME, "25.0.1"));
    }
}
