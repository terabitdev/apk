package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final k3.t f3751a;

    /* renamed from: b, reason: collision with root package name */
    public k3.t f3752b;

    /* renamed from: c, reason: collision with root package name */
    public final a3.i f3753c;

    /* renamed from: d, reason: collision with root package name */
    public final t f3754d;

    public e0() {
        k3.t tVar = new k3.t(3);
        this.f3751a = tVar;
        this.f3752b = ((k3.t) tVar.l).L();
        this.f3753c = new a3.i();
        this.f3754d = new t(3);
        final int i = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f3690b;

            {
                this.f3690b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i) {
                    case 0:
                        return new l4(this.f3690b.f3753c);
                    default:
                        return new l4(this.f3690b.f3754d);
                }
            }
        };
        c6 c6Var = (c6) tVar.f7248n;
        ((HashMap) c6Var.f3726a).put("internal.registerCallback", callable);
        final int i3 = 0;
        ((HashMap) c6Var.f3726a).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f3690b;

            {
                this.f3690b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i3) {
                    case 0:
                        return new l4(this.f3690b.f3753c);
                    default:
                        return new l4(this.f3690b.f3754d);
                }
            }
        });
    }

    public final boolean a(b bVar) {
        a3.i iVar = this.f3753c;
        try {
            iVar.f69b = bVar;
            iVar.l = bVar.clone();
            ((ArrayList) iVar.m).clear();
            ((k3.t) this.f3751a.m).N("runtime.counter", new g(Double.valueOf(0.0d)));
            this.f3754d.d(this.f3752b.L(), iVar);
            if (((b) iVar.l).equals((b) iVar.f69b)) {
                if (((ArrayList) iVar.m).isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final void b(w3 w3Var) {
        h hVar;
        try {
            k3.t tVar = this.f3751a;
            this.f3752b = ((k3.t) tVar.l).L();
            if (!(tVar.I(this.f3752b, (x3[]) w3Var.o().toArray(new x3[0])) instanceof f)) {
                for (v3 v3Var : w3Var.p().o()) {
                    List p = v3Var.p();
                    String o = v3Var.o();
                    Iterator it = p.iterator();
                    while (it.hasNext()) {
                        n I = tVar.I(this.f3752b, (x3) it.next());
                        if (I instanceof k) {
                            k3.t tVar2 = this.f3752b;
                            if (!tVar2.M(o)) {
                                hVar = null;
                            } else {
                                n P = tVar2.P(o);
                                if (P instanceof h) {
                                    hVar = (h) P;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(o)));
                                }
                            }
                            if (hVar != null) {
                                hVar.a(this.f3752b, Collections.singletonList(I));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(o)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
