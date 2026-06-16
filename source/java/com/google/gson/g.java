package com.google.gson;

import com.google.gson.internal.l;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class g extends d {

    /* renamed from: a, reason: collision with root package name */
    public final l f4230a = new l(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof g) || !((g) obj).f4230a.equals(this.f4230a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4230a.hashCode();
    }
}
