package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class t6 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f3973a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3974b;
    public final /* synthetic */ s6 l;

    public t6(s6 s6Var, Comparable comparable, Object obj) {
        this.l = s6Var;
        this.f3973a = comparable;
        this.f3974b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f3973a.compareTo(((t6) obj).f3973a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f3973a;
                if (comparable == null) {
                    if (key != null) {
                        equals = false;
                    } else {
                        equals = true;
                    }
                } else {
                    equals = comparable.equals(key);
                }
                if (equals) {
                    Object obj2 = this.f3974b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        if (value != null) {
                            equals2 = false;
                        } else {
                            equals2 = true;
                        }
                    } else {
                        equals2 = obj2.equals(value);
                    }
                    if (equals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f3973a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3974b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        Comparable comparable = this.f3973a;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f3974b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.l.g();
        Object obj2 = this.f3974b;
        this.f3974b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3973a);
        String valueOf2 = String.valueOf(this.f3974b);
        return androidx.compose.ui.b.O(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
