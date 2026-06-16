package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class m extends h {
    public final ArrayList l;
    public final ArrayList m;

    /* renamed from: n, reason: collision with root package name */
    public final k3.t f3889n;

    public m(String str, ArrayList arrayList, List list, k3.t tVar) {
        super(str);
        this.l = new ArrayList();
        this.f3889n = tVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.l.add(((n) obj).f());
            }
        }
        this.m = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n a(k3.t tVar, List list) {
        r rVar;
        k3.t L = this.f3889n.L();
        t tVar2 = (t) L.l;
        int i = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            rVar = n.f3896c;
            if (i3 >= size) {
                break;
            }
            if (i3 < list.size()) {
                L.O((String) arrayList.get(i3), ((t) tVar.l).c(tVar, (n) list.get(i3)));
            } else {
                L.O((String) arrayList.get(i3), rVar);
            }
            i3++;
        }
        ArrayList arrayList2 = this.m;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            n nVar = (n) obj;
            n c10 = tVar2.c(L, nVar);
            if (c10 instanceof o) {
                c10 = tVar2.c(L, nVar);
            }
            if (c10 instanceof f) {
                return ((f) c10).f3764a;
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.h, com.google.android.gms.internal.measurement.n
    public final n l() {
        return new m(this);
    }

    public m(m mVar) {
        super(mVar.f3791a);
        ArrayList arrayList = new ArrayList(mVar.l.size());
        this.l = arrayList;
        arrayList.addAll(mVar.l);
        ArrayList arrayList2 = new ArrayList(mVar.m.size());
        this.m = arrayList2;
        arrayList2.addAll(mVar.m);
        this.f3889n = mVar.f3889n;
    }
}
