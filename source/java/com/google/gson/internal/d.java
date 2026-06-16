package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class d implements ParameterizedType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f4316a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f4317b;
    public final Type[] l;

    public d(Type type, Class cls, Type... typeArr) {
        Type a10;
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            b.d.k(cls, "Must specify owner type for ");
            throw null;
        }
        if (type == null) {
            a10 = null;
        } else {
            a10 = f.a(type);
        }
        this.f4316a = a10;
        this.f4317b = f.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.l = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.l[i]);
            f.b(this.l[i]);
            Type[] typeArr3 = this.l;
            typeArr3[i] = f.a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && f.d(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.l.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f4316a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f4317b;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.l) ^ this.f4317b.hashCode();
        Type type = this.f4316a;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        Type[] typeArr = this.l;
        int length = typeArr.length;
        Type type = this.f4317b;
        if (length == 0) {
            return f.k(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(f.k(type));
        sb.append("<");
        sb.append(f.k(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(f.k(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
