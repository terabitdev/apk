package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class c extends d implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4228a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof c) || !((c) obj).f4228a.equals(this.f4228a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4228a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4228a.iterator();
    }
}
