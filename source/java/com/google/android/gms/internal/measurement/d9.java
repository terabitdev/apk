package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o4.bd;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class d9 extends h {
    public final boolean l;
    public final boolean m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l4 f3749n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(l4 l4Var, boolean z10, boolean z11) {
        super("log");
        this.f3749n = l4Var;
        this.l = z10;
        this.m = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    @Override // com.google.android.gms.internal.measurement.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a(k3.t tVar, List list) {
        int i;
        int i3;
        f1.g.Y(1, "log", list);
        int size = list.size();
        r rVar = n.f3896c;
        l4 l4Var = this.f3749n;
        if (size == 1) {
            ((bd) l4Var.m).N(3, ((t) tVar.l).c(tVar, (n) list.get(0)).f(), Collections.EMPTY_LIST, this.l, this.m);
            return rVar;
        }
        n nVar = (n) list.get(0);
        t tVar2 = (t) tVar.l;
        t tVar3 = (t) tVar.l;
        int d02 = f1.g.d0(tVar2.c(tVar, nVar).h().doubleValue());
        if (d02 != 2) {
            i = 3;
            if (d02 != 3) {
                if (d02 != 5) {
                    if (d02 == 6) {
                        i3 = 2;
                    }
                } else {
                    i3 = 5;
                }
            } else {
                i3 = 1;
            }
            String f7 = tVar3.c(tVar, (n) list.get(1)).f();
            if (list.size() != 2) {
                ((bd) l4Var.m).N(i3, f7, Collections.EMPTY_LIST, this.l, this.m);
                return rVar;
            }
            ArrayList arrayList = new ArrayList();
            for (int i8 = 2; i8 < Math.min(list.size(), 5); i8++) {
                arrayList.add(tVar3.c(tVar, (n) list.get(i8)).f());
            }
            ((bd) l4Var.m).N(i3, f7, arrayList, this.l, this.m);
            return rVar;
        }
        i = 4;
        i3 = i;
        String f72 = tVar3.c(tVar, (n) list.get(1)).f();
        if (list.size() != 2) {
        }
    }
}
