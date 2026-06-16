package com.google.gson.internal;

import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class k implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public k f4328a;

    /* renamed from: b, reason: collision with root package name */
    public k f4329b;
    public k l;
    public k m;

    /* renamed from: n, reason: collision with root package name */
    public k f4330n;
    public final Object o;
    public final boolean p;
    public Object q;
    public int r;

    public k(boolean z10, k kVar, Object obj, k kVar2, k kVar3) {
        this.f4328a = kVar;
        this.o = obj;
        this.p = z10;
        this.r = 1;
        this.m = kVar2;
        this.f4330n = kVar3;
        kVar3.m = this;
        kVar2.f4330n = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.o;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.q;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.q;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.o;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.q;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.p) {
            o2.a.h("value == null");
            return null;
        }
        Object obj2 = this.q;
        this.q = obj;
        return obj2;
    }

    public final String toString() {
        return this.o + "=" + this.q;
    }

    public k(boolean z10) {
        this.o = null;
        this.p = z10;
        this.f4330n = this;
        this.m = this;
    }
}
