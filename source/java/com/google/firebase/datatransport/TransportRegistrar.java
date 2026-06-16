package com.google.firebase.datatransport;

import a0.f;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b0.a;
import com.google.firebase.components.ComponentRegistrar;
import d0.s;
import e2.b;
import e2.c;
import e2.j;
import e2.r;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@Keep
/* loaded from: classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        s.b((Context) cVar.a(Context.class));
        return s.a().c(a.f3256f);
    }

    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        s.b((Context) cVar.a(Context.class));
        return s.a().c(a.f3256f);
    }

    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        s.b((Context) cVar.a(Context.class));
        return s.a().c(a.f3255e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<b> getComponents() {
        e2.a b10 = b.b(f.class);
        b10.f4815c = LIBRARY_NAME;
        b10.c(j.b(Context.class));
        b10.g = new o2.a(15);
        b d10 = b10.d();
        e2.a a10 = b.a(new r(v2.a.class, f.class));
        a10.c(j.b(Context.class));
        a10.g = new o2.a(16);
        b d11 = a10.d();
        e2.a a11 = b.a(new r(v2.b.class, f.class));
        a11.c(j.b(Context.class));
        a11.g = new o2.a(17);
        return Arrays.asList(d10, d11, a11.d(), a.a.k(LIBRARY_NAME, "19.0.0"));
    }
}
