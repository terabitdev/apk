package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class e implements WildcardType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f4318a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f4319b;

    public e(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    Objects.requireNonNull(typeArr2[0]);
                    f.b(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f4319b = f.a(typeArr2[0]);
                        this.f4318a = Object.class;
                        return;
                    } else {
                        f2.i.k("When lower bound is specified, upper bound must be Object");
                        throw null;
                    }
                }
                Objects.requireNonNull(typeArr[0]);
                f.b(typeArr[0]);
                this.f4319b = null;
                this.f4318a = f.a(typeArr[0]);
                return;
            }
            f2.i.k("Exactly one upper bound must be specified");
            throw null;
        }
        f2.i.k("At most one lower bound is supported");
        throw null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && f.d(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f4319b;
        if (type != null) {
            return new Type[]{type};
        }
        return f.f4320a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f4318a};
    }

    public final int hashCode() {
        int i;
        Type type = this.f4319b;
        if (type != null) {
            i = type.hashCode() + 31;
        } else {
            i = 1;
        }
        return i ^ (this.f4318a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f4319b;
        if (type != null) {
            return "? super " + f.k(type);
        }
        Type type2 = this.f4318a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + f.k(type2);
    }
}
