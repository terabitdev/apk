package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class a5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f3698a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f3699b;
    public final /* synthetic */ c5 l;

    public a5(c5 c5Var) {
        this.l = c5Var;
        this.f3699b = c5Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3698a < this.f3699b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3698a;
        if (i < this.f3699b) {
            this.f3698a = i + 1;
            return Byte.valueOf(this.l.c(i));
        }
        o2.a.g();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
