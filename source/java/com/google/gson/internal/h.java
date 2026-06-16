package com.google.gson.internal;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class h extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f4322a;

    public h(String str) {
        this.f4322a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f4322a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f4322a.equals(((h) obj).f4322a);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f4322a);
    }

    public final int hashCode() {
        return this.f4322a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f4322a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return f.i(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f4322a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return f.i(str).longValue();
        }
    }

    public final String toString() {
        return this.f4322a;
    }
}
