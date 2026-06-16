package com.google.gson.internal;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class n implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public char[] f4334a;

    /* renamed from: b, reason: collision with root package name */
    public String f4335b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4334a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4334a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i3) {
        return new String(this.f4334a, i, i3 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f4335b == null) {
            this.f4335b = new String(this.f4334a);
        }
        return this.f4335b;
    }
}
