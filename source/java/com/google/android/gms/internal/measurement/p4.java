package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class p4 implements m2.k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3927a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3928b;

    public /* synthetic */ p4(Object obj) {
        this.f3928b = obj;
        this.f3927a = true;
    }

    @Override // m2.k
    public void a(m2.j jVar, int i) {
        StringBuilder sb = (StringBuilder) this.f3928b;
        if (this.f3927a) {
            this.f3927a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void b() {
        this.f3927a = false;
    }

    public void c(byte b10) {
        ((g9.d0) this.f3928b).i(String.valueOf(b10));
    }

    public void d(char c10) {
        g9.d0 d0Var = (g9.d0) this.f3928b;
        d0Var.b(d0Var.f5762b, 1);
        char[] cArr = (char[]) d0Var.f5763c;
        int i = d0Var.f5762b;
        d0Var.f5762b = i + 1;
        cArr[i] = c10;
    }

    public void e(int i) {
        ((g9.d0) this.f3928b).i(String.valueOf(i));
    }

    public void f(long j) {
        ((g9.d0) this.f3928b).i(String.valueOf(j));
    }

    public void g(short s) {
        ((g9.d0) this.f3928b).i(String.valueOf(s));
    }

    public void h(String str) {
        int i;
        str.getClass();
        g9.d0 d0Var = (g9.d0) this.f3928b;
        d0Var.b(d0Var.f5762b, str.length() + 2);
        char[] cArr = (char[]) d0Var.f5763c;
        int i3 = d0Var.f5762b;
        int i8 = i3 + 1;
        cArr[i3] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i8);
        int i10 = length + i8;
        int i11 = i8;
        while (i11 < i10) {
            char c10 = cArr[i11];
            byte[] bArr = t8.w.f10745b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = str.length();
                for (int i12 = i11 - i8; i12 < length2; i12++) {
                    d0Var.b(i11, 2);
                    char charAt = str.charAt(i12);
                    byte[] bArr2 = t8.w.f10745b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i = i11 + 1;
                            ((char[]) d0Var.f5763c)[i11] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str2 = t8.w.f10744a[charAt];
                                str2.getClass();
                                d0Var.b(i11, str2.length());
                                str2.getChars(0, str2.length(), (char[]) d0Var.f5763c, i11);
                                int length3 = str2.length() + i11;
                                d0Var.f5762b = length3;
                                i11 = length3;
                            } else {
                                char[] cArr2 = (char[]) d0Var.f5763c;
                                cArr2[i11] = '\\';
                                cArr2[i11 + 1] = (char) b10;
                                i11 += 2;
                                d0Var.f5762b = i11;
                            }
                        }
                    } else {
                        i = i11 + 1;
                        ((char[]) d0Var.f5763c)[i11] = charAt;
                    }
                    i11 = i;
                }
                d0Var.b(i11, 1);
                ((char[]) d0Var.f5763c)[i11] = '\"';
                d0Var.f5762b = i11 + 1;
                return;
            }
            i11++;
        }
        cArr[i10] = '\"';
        d0Var.f5762b = i10 + 1;
    }

    public o4 k(long j, String str) {
        Long valueOf = Long.valueOf(j);
        Object obj = o4.g;
        return new o4(this, str, valueOf, 0);
    }

    public o4 l(String str, boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        Object obj = o4.g;
        return new o4(this, str, valueOf, 1);
    }

    public o4 m(String str, String str2) {
        Object obj = o4.g;
        return new o4(this, str, str2, 3);
    }

    public p4(Uri uri, boolean z10, boolean z11) {
        this.f3928b = uri;
        this.f3927a = z10;
    }

    public void i() {
    }

    public void j() {
    }
}
