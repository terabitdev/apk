package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f3803a;

    public i(Iterator it) {
        this.f3803a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3803a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new q((String) this.f3803a.next());
    }
}
