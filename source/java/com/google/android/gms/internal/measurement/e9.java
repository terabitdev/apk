package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class e9 extends h {
    public final c6 l;
    public final HashMap m;

    public e9(c6 c6Var) {
        super("require");
        this.m = new HashMap();
        this.l = c6Var;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n a(k3.t tVar, List list) {
        n nVar;
        f1.g.X(1, "require", list);
        String f7 = ((t) tVar.l).c(tVar, (n) list.get(0)).f();
        HashMap hashMap = this.m;
        if (hashMap.containsKey(f7)) {
            return (n) hashMap.get(f7);
        }
        HashMap hashMap2 = (HashMap) this.l.f3726a;
        if (hashMap2.containsKey(f7)) {
            try {
                nVar = (n) ((Callable) hashMap2.get(f7)).call();
            } catch (Exception unused) {
                b.d.j("Failed to create API implementation: ".concat(String.valueOf(f7)));
                return null;
            }
        } else {
            nVar = n.f3896c;
        }
        if (nVar instanceof h) {
            hashMap.put(f7, (h) nVar);
        }
        return nVar;
    }
}
