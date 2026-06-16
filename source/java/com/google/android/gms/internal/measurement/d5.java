package com.google.android.gms.internal.measurement;

import androidx.work.WorkInfo;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class d5 {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f3737e = Logger.getLogger(d5.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f3738f = a7.f3704e;

    /* renamed from: a, reason: collision with root package name */
    public c6 f3739a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3740b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3741c;

    /* renamed from: d, reason: collision with root package name */
    public int f3742d;

    public d5(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.f3740b = bArr;
            this.f3742d = 0;
            this.f3741c = i;
        } else {
            Locale locale = Locale.US;
            f2.i.k(androidx.compose.ui.b.J(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
    }

    public static int a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = c7.b(str);
        } catch (b7 unused) {
            length = str.getBytes(u5.f3981a).length;
        }
        return s(length) + length;
    }

    public static int s(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void c(int i, int i3) {
        m((i << 3) | i3);
    }

    public final void d(int i, int i3) {
        m(i << 3);
        l(i3);
    }

    public final void e(int i, int i3) {
        m(i << 3);
        m(i3);
    }

    public final void f(int i, int i3) {
        m((i << 3) | 5);
        n(i3);
    }

    public final void g(int i, long j) {
        m(i << 3);
        o(j);
    }

    public final void h(int i, long j) {
        m((i << 3) | 1);
        p(j);
    }

    public final void i(int i, c5 c5Var) {
        m((i << 3) | 2);
        j(c5Var);
    }

    public final void j(c5 c5Var) {
        m(c5Var.d());
        q(c5Var.d(), c5Var.f3724b);
    }

    public final void k(byte b10) {
        int i = this.f3742d;
        try {
            int i3 = i + 1;
            try {
                this.f3740b[i] = b10;
                this.f3742d = i3;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i = i3;
                throw new e5(i, this.f3741c, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    public final void l(int i) {
        if (i >= 0) {
            m(i);
        } else {
            o(i);
        }
    }

    public final void m(int i) {
        int i3;
        int i8 = this.f3742d;
        while (true) {
            int i10 = i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            byte[] bArr = this.f3740b;
            if (i10 == 0) {
                i3 = i8 + 1;
                bArr[i8] = (byte) i;
                this.f3742d = i3;
                return;
            } else {
                i3 = i8 + 1;
                try {
                    bArr[i8] = (byte) (i | 128);
                    i >>>= 7;
                    i8 = i3;
                } catch (IndexOutOfBoundsException e10) {
                    throw new e5(i3, this.f3741c, 1, e10);
                }
            }
            throw new e5(i3, this.f3741c, 1, e10);
        }
    }

    public final void n(int i) {
        int i3 = this.f3742d;
        try {
            byte[] bArr = this.f3740b;
            bArr[i3] = (byte) i;
            bArr[i3 + 1] = (byte) (i >> 8);
            bArr[i3 + 2] = (byte) (i >> 16);
            bArr[i3 + 3] = (byte) (i >> 24);
            this.f3742d = i3 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new e5(i3, this.f3741c, 4, e10);
        }
    }

    public final void o(long j) {
        int i;
        int i3 = this.f3742d;
        byte[] bArr = this.f3740b;
        int i8 = this.f3741c;
        if (f3738f && i8 - i3 >= 10) {
            while ((j & (-128)) != 0) {
                a7.f3702c.a(bArr, a7.f3705f + i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            a7.f3702c.a(bArr, a7.f3705f + i3, (byte) j);
        } else {
            while ((j & (-128)) != 0) {
                int i10 = i3 + 1;
                try {
                    bArr[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i = i10;
                    throw new e5(i, i8, 1, e);
                }
            }
            i = i3 + 1;
            try {
                bArr[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                throw new e5(i, i8, 1, e);
            }
        }
        this.f3742d = i;
    }

    public final void p(long j) {
        int i = this.f3742d;
        try {
            byte[] bArr = this.f3740b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f3742d = i + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new e5(i, this.f3741c, 8, e10);
        }
    }

    public final void q(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f3740b, this.f3742d, i);
            this.f3742d += i;
        } catch (IndexOutOfBoundsException e10) {
            throw new e5(this.f3742d, this.f3741c, i, e10);
        }
    }

    public final void r(String str) {
        int i = this.f3742d;
        try {
            int s = s(str.length() * 3);
            int s3 = s(str.length());
            int i3 = this.f3741c;
            byte[] bArr = this.f3740b;
            if (s3 == s) {
                int i8 = i + s3;
                this.f3742d = i8;
                int c10 = c7.c(str, bArr, i8, i3 - i8);
                this.f3742d = i;
                m((c10 - i) - s3);
                this.f3742d = c10;
                return;
            }
            m(c7.b(str));
            int i10 = this.f3742d;
            this.f3742d = c7.c(str, bArr, i10, i3 - i10);
        } catch (b7 e10) {
            this.f3742d = i;
            f3737e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(u5.f3981a);
            try {
                int length = bytes.length;
                m(length);
                q(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new e5(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new e5(e12);
        }
    }
}
