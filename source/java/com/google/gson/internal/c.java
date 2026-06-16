package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class c implements GenericArrayType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f4315a;

    public c(Type type) {
        Objects.requireNonNull(type);
        this.f4315a = f.a(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && f.d(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f4315a;
    }

    public final int hashCode() {
        return this.f4315a.hashCode();
    }

    public final String toString() {
        return f.k(this.f4315a) + "[]";
    }
}
