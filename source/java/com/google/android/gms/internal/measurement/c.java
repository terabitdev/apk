package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f3721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f3722b;

    public c(d dVar, Iterator it, Iterator it2) {
        this.f3721a = it;
        this.f3722b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3721a.hasNext()) {
            return true;
        }
        return this.f3722b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f3721a;
        if (it.hasNext()) {
            return new q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f3722b;
        if (it2.hasNext()) {
            return new q((String) it2.next());
        }
        o2.a.g();
        return null;
    }
}
