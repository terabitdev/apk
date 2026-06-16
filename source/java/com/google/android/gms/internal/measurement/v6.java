package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class v6 {

    /* renamed from: f, reason: collision with root package name */
    public static final v6 f3995f = new v6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f3996a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3997b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f3998c;

    /* renamed from: d, reason: collision with root package name */
    public int f3999d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4000e;

    public v6(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.f3996a = i;
        this.f3997b = iArr;
        this.f3998c = objArr;
        this.f4000e = z10;
    }

    public static v6 a() {
        return new v6(0, new int[8], new Object[8], true);
    }

    public final void b(c6 c6Var) {
        if (this.f3996a != 0) {
            for (int i = 0; i < this.f3996a; i++) {
                int i3 = this.f3997b[i];
                Object obj = this.f3998c[i];
                int i8 = i3 & 7;
                int i10 = i3 >>> 3;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 == 5) {
                                    ((d5) c6Var.f3726a).f(i10, ((Integer) obj).intValue());
                                } else {
                                    a8.c.p(new v5());
                                    return;
                                }
                            } else {
                                ((d5) c6Var.f3726a).c(i10, 3);
                                ((v6) obj).b(c6Var);
                                ((d5) c6Var.f3726a).c(i10, 4);
                            }
                        } else {
                            ((d5) c6Var.f3726a).i(i10, (c5) obj);
                        }
                    } else {
                        ((d5) c6Var.f3726a).h(i10, ((Long) obj).longValue());
                    }
                } else {
                    ((d5) c6Var.f3726a).g(i10, ((Long) obj).longValue());
                }
            }
        }
    }

    public final int c() {
        int s;
        int a10;
        int s3;
        int i = this.f3999d;
        if (i == -1) {
            int i3 = 0;
            for (int i8 = 0; i8 < this.f3996a; i8++) {
                int i10 = this.f3997b[i8];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    ((Integer) this.f3998c[i8]).getClass();
                                    s3 = d5.s(i11 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new v5());
                                }
                            } else {
                                int s10 = d5.s(i11 << 3);
                                s = s10 + s10;
                                a10 = ((v6) this.f3998c[i8]).c();
                            }
                        } else {
                            int i13 = i11 << 3;
                            c5 c5Var = (c5) this.f3998c[i8];
                            int s11 = d5.s(i13);
                            int d10 = c5Var.d();
                            i3 = i6.i(d10, d10, s11, i3);
                        }
                    } else {
                        ((Long) this.f3998c[i8]).getClass();
                        s3 = d5.s(i11 << 3) + 8;
                    }
                    i3 = s3 + i3;
                } else {
                    int i14 = i11 << 3;
                    long longValue = ((Long) this.f3998c[i8]).longValue();
                    s = d5.s(i14);
                    a10 = d5.a(longValue);
                }
                i3 = a10 + s + i3;
            }
            this.f3999d = i3;
            return i3;
        }
        return i;
    }

    public final void d(int i, Object obj) {
        if (this.f4000e) {
            e(this.f3996a + 1);
            int[] iArr = this.f3997b;
            int i3 = this.f3996a;
            iArr[i3] = i;
            this.f3998c[i3] = obj;
            this.f3996a = i3 + 1;
            return;
        }
        androidx.compose.ui.graphics.f.i();
    }

    public final void e(int i) {
        int[] iArr = this.f3997b;
        if (i > iArr.length) {
            int i3 = this.f3996a;
            int i8 = (i3 / 2) + i3;
            if (i8 >= i) {
                i = i8;
            }
            if (i < 8) {
                i = 8;
            }
            this.f3997b = Arrays.copyOf(iArr, i);
            this.f3998c = Arrays.copyOf(this.f3998c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof v6)) {
                v6 v6Var = (v6) obj;
                int i = this.f3996a;
                if (i == v6Var.f3996a) {
                    int[] iArr = this.f3997b;
                    int[] iArr2 = v6Var.f3997b;
                    int i3 = 0;
                    while (true) {
                        if (i3 < i) {
                            if (iArr[i3] != iArr2[i3]) {
                                break;
                            }
                            i3++;
                        } else {
                            Object[] objArr = this.f3998c;
                            Object[] objArr2 = v6Var.f3998c;
                            int i8 = this.f3996a;
                            for (int i10 = 0; i10 < i8; i10++) {
                                if (objArr[i10].equals(objArr2[i10])) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f3996a;
        int i3 = i + 527;
        int[] iArr = this.f3997b;
        int i8 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = ((i3 * 31) + i10) * 31;
        Object[] objArr = this.f3998c;
        int i13 = this.f3996a;
        for (int i14 = 0; i14 < i13; i14++) {
            i8 = (i8 * 31) + objArr[i14].hashCode();
        }
        return i12 + i8;
    }
}
