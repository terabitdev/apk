package com.google.gson.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public k f4323a;

    /* renamed from: b, reason: collision with root package name */
    public k f4324b = null;
    public int l;
    public final /* synthetic */ l m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4325n;

    public i(l lVar, int i) {
        this.f4325n = i;
        this.m = lVar;
        this.f4323a = lVar.o.m;
        this.l = lVar.f4333n;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f4323a;
        l lVar = this.m;
        if (kVar != lVar.o) {
            if (lVar.f4333n == this.l) {
                this.f4323a = kVar.m;
                this.f4324b = kVar;
                return kVar;
            }
            a8.c.w();
            return null;
        }
        o2.a.g();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4323a != this.m.o) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f4325n) {
            case 1:
                return b().o;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        k kVar = this.f4324b;
        if (kVar != null) {
            l lVar = this.m;
            lVar.d(kVar, true);
            this.f4324b = null;
            this.l = lVar.f4333n;
            return;
        }
        a8.c.s();
    }
}
