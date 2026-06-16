package com.google.firebase.installations;

import androidx.annotation.Keep;
import c3.g;
import com.google.firebase.components.ComponentRegistrar;
import d2.a;
import d2.b;
import e2.c;
import e2.r;
import f2.i;
import f2.j;
import f3.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import z1.f;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static d lambda$getComponents$0(c cVar) {
        return new f3.c((f) cVar.a(f.class), cVar.d(g.class), (ExecutorService) cVar.f(new r(a.class, ExecutorService.class)), new j((Executor) cVar.f(new r(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<e2.b> getComponents() {
        e2.a b10 = e2.b.b(d.class);
        b10.f4815c = LIBRARY_NAME;
        b10.c(e2.j.b(f.class));
        b10.c(new e2.j(0, 1, g.class));
        b10.c(new e2.j(new r(a.class, ExecutorService.class), 1, 0));
        b10.c(new e2.j(new r(b.class, Executor.class), 1, 0));
        b10.g = new i(1);
        e2.b d10 = b10.d();
        c3.f fVar = new c3.f(0);
        e2.a b11 = e2.b.b(c3.f.class);
        b11.f4814b = 1;
        b11.g = new androidx.core.view.inputmethod.b(fVar, 9);
        return Arrays.asList(d10, b11.d(), a.a.k(LIBRARY_NAME, "19.0.1"));
    }
}
