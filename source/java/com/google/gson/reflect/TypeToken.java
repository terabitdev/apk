package com.google.gson.reflect;

import b.d;
import com.google.gson.internal.f;
import f2.i;
import j$.util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class TypeToken<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class f4354a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f4355b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4356c;

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                Type a10 = f.a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(a10);
                }
                this.f4355b = a10;
                this.f4354a = f.g(a10);
                this.f4356c = a10.hashCode();
                return;
            }
        } else if (genericSuperclass == TypeToken.class) {
            d.j("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw")));
            throw null;
        }
        d.j("Must only create direct subclasses of TypeToken");
        throw null;
    }

    public static void a(Type type) {
        if (!(type instanceof TypeVariable)) {
            if (type instanceof GenericArrayType) {
                a(((GenericArrayType) type).getGenericComponentType());
                return;
            }
            int i = 0;
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType != null) {
                    a(ownerType);
                }
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                int length = actualTypeArguments.length;
                while (i < length) {
                    a(actualTypeArguments[i]);
                    i++;
                }
                return;
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                for (Type type2 : wildcardType.getLowerBounds()) {
                    a(type2);
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length2 = upperBounds.length;
                while (i < length2) {
                    a(upperBounds[i]);
                    i++;
                }
                return;
            }
            if (type != null) {
                return;
            }
            i.k("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            return;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        StringBuilder sb = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
        sb.append(typeVariable.getName());
        sb.append(" declared by ");
        sb.append(typeVariable.getGenericDeclaration());
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable");
        sb.append("\nSee ");
        sb.append(concat);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            if (f.d(this.f4355b, ((TypeToken) obj).f4355b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4356c;
    }

    public final String toString() {
        return f.k(this.f4355b);
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type a10 = f.a(type);
        this.f4355b = a10;
        this.f4354a = f.g(a10);
        this.f4356c = a10.hashCode();
    }
}
