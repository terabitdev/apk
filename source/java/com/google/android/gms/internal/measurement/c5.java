package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class c5 implements Iterable, Serializable {
    public static final c5 l = new c5(u5.f3982b);

    /* renamed from: a, reason: collision with root package name */
    public int f3723a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3724b;

    static {
        int i = w4.f4033a;
    }

    public c5(byte[] bArr) {
        bArr.getClass();
        this.f3724b = bArr;
    }

    public static c5 e(int i, int i3, byte[] bArr) {
        g(i, i + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new c5(bArr2);
    }

    public static int g(int i, int i3, int i8) {
        int i10 = i3 - i;
        if ((i | i3 | i10 | (i8 - i3)) < 0) {
            if (i >= 0) {
                if (i3 < i) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i3).length());
                    sb.append("Beginning index larger than ending index: ");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i3);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 15 + String.valueOf(i8).length());
                sb2.append("End index: ");
                sb2.append(i3);
                sb2.append(" >= ");
                sb2.append(i8);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 21);
            sb3.append("Beginning index: ");
            sb3.append(i);
            sb3.append(" < 0");
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        return i10;
    }

    public byte b(int i) {
        return this.f3724b[i];
    }

    public byte c(int i) {
        return this.f3724b[i];
    }

    public int d() {
        return this.f3724b.length;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof c5) && d() == ((c5) obj).d()) {
                if (d() != 0) {
                    if (obj instanceof c5) {
                        c5 c5Var = (c5) obj;
                        int i = this.f3723a;
                        int i3 = c5Var.f3723a;
                        if (i == 0 || i3 == 0 || i == i3) {
                            int d10 = d();
                            if (d10 <= c5Var.d()) {
                                if (d10 <= c5Var.d()) {
                                    byte[] bArr = c5Var.f3724b;
                                    int i8 = 0;
                                    int i10 = 0;
                                    while (i8 < d10) {
                                        if (this.f3724b[i8] == bArr[i10]) {
                                            i8++;
                                            i10++;
                                        }
                                    }
                                    return true;
                                }
                                int d11 = c5Var.d();
                                StringBuilder sb = new StringBuilder(String.valueOf(d10).length() + 27 + String.valueOf(d11).length());
                                sb.append("Ran off end of other: 0, ");
                                sb.append(d10);
                                sb.append(", ");
                                sb.append(d11);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            int d12 = d();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 18 + String.valueOf(d12).length());
                            sb2.append("Length too large: ");
                            sb2.append(d10);
                            sb2.append(d12);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        return obj.equals(this);
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f3723a;
        if (i == 0) {
            int d10 = d();
            int i3 = d10;
            for (int i8 = 0; i8 < d10; i8++) {
                i3 = (i3 * 31) + this.f3724b[i8];
            }
            if (i3 == 0) {
                i3 = 1;
            }
            this.f3723a = i3;
            return i3;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new a5(this);
    }

    public final String toString() {
        c5 b5Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d10 = d();
        if (d() <= 50) {
            concat = a.a.S(this);
        } else {
            int g = g(0, 47, d());
            if (g == 0) {
                b5Var = l;
            } else {
                b5Var = new b5(this.f3724b, g);
            }
            concat = a.a.S(b5Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d10);
        sb.append(" contents=\"");
        return i6.q(sb, concat, "\">");
    }
}
