package com.google.android.gms.internal.measurement;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class j6 implements q6 {
    public static final int[] j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f3822k = a7.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3823a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3824b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3825c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3826d;

    /* renamed from: e, reason: collision with root package name */
    public final u4 f3827e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f3828f;
    public final int g;
    public final int h;
    public final m5 i;

    public j6(int[] iArr, Object[] objArr, int i, int i3, u4 u4Var, int[] iArr2, int i8, int i10, m5 m5Var, m5 m5Var2) {
        this.f3823a = iArr;
        this.f3824b = objArr;
        this.f3825c = i;
        this.f3826d = i3;
        this.f3828f = iArr2;
        this.g = i8;
        this.h = i10;
        this.i = m5Var;
        this.f3827e = u4Var;
    }

    public static int F(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof o5) {
            return ((o5) obj).e();
        }
        return true;
    }

    public static int k(Object obj, long j10) {
        return ((Integer) a7.j(obj, j10)).intValue();
    }

    public static long l(Object obj, long j10) {
        return ((Long) a7.j(obj, j10)).longValue();
    }

    public static final int s(byte[] bArr, int i, int i3, d7 d7Var, Class cls, x4 x4Var) {
        d7 d7Var2 = d7.l;
        boolean z10 = false;
        switch (d7Var.ordinal()) {
            case 0:
                int i8 = i + 8;
                x4Var.f4043c = Double.valueOf(Double.longBitsToDouble(s7.a.f0(i, bArr)));
                return i8;
            case 1:
                int i10 = i + 4;
                x4Var.f4043c = Float.valueOf(Float.intBitsToFloat(s7.a.e0(i, bArr)));
                return i10;
            case 2:
            case 3:
                int d02 = s7.a.d0(bArr, i, x4Var);
                x4Var.f4043c = Long.valueOf(x4Var.f4042b);
                return d02;
            case 4:
            case 12:
            case 13:
                int a02 = s7.a.a0(bArr, i, x4Var);
                x4Var.f4043c = Integer.valueOf(x4Var.f4041a);
                return a02;
            case 5:
            case 15:
                int i11 = i + 8;
                x4Var.f4043c = Long.valueOf(s7.a.f0(i, bArr));
                return i11;
            case 6:
            case 14:
                int i12 = i + 4;
                x4Var.f4043c = Integer.valueOf(s7.a.e0(i, bArr));
                return i12;
            case 7:
                int d03 = s7.a.d0(bArr, i, x4Var);
                if (x4Var.f4042b != 0) {
                    z10 = true;
                }
                x4Var.f4043c = Boolean.valueOf(z10);
                return d03;
            case 8:
                return s7.a.g0(bArr, i, x4Var);
            case 9:
            default:
                a8.c.m("unsupported field type.");
                return 0;
            case 10:
                q6 a10 = n6.f3904c.a(cls);
                o5 a11 = a10.a();
                int i02 = s7.a.i0(a11, a10, bArr, i, i3, x4Var);
                a10.g(a11);
                x4Var.f4043c = a11;
                return i02;
            case 11:
                return s7.a.h0(bArr, i, x4Var);
            case 16:
                int a03 = s7.a.a0(bArr, i, x4Var);
                x4Var.f4043c = Integer.valueOf(z1.b.M(x4Var.f4041a));
                return a03;
            case 17:
                int d04 = s7.a.d0(bArr, i, x4Var);
                x4Var.f4043c = Long.valueOf(z1.b.N(x4Var.f4042b));
                return d04;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j6 u(p6 p6Var, m5 m5Var, m5 m5Var2) {
        int i;
        int charAt;
        int i3;
        int[] iArr;
        int i8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt2;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        char charAt6;
        int i19;
        char charAt7;
        int i20;
        char charAt8;
        int i21;
        char charAt9;
        int i22;
        int i23;
        Object[] objArr;
        int i24;
        Class<?> cls;
        int objectFieldOffset;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Field v;
        char charAt10;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field v6;
        Object obj2;
        Field v10;
        int i38;
        char charAt11;
        int i39;
        char charAt12;
        int i40;
        char charAt13;
        int i41;
        char charAt14;
        if (p6Var instanceof p6) {
            String str = p6Var.f3932b;
            int length = str.length();
            int i42 = 55296;
            if (str.charAt(0) >= 55296) {
                int i43 = 1;
                while (true) {
                    i = i43 + 1;
                    if (str.charAt(i43) < 55296) {
                        break;
                    }
                    i43 = i;
                }
            } else {
                i = 1;
            }
            int i44 = i + 1;
            int charAt15 = str.charAt(i);
            if (charAt15 >= 55296) {
                int i45 = charAt15 & 8191;
                int i46 = 13;
                while (true) {
                    i41 = i44 + 1;
                    charAt14 = str.charAt(i44);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i45 |= (charAt14 & 8191) << i46;
                    i46 += 13;
                    i44 = i41;
                }
                charAt15 = i45 | (charAt14 << i46);
                i44 = i41;
            }
            if (charAt15 == 0) {
                i10 = 0;
                i12 = 0;
                charAt = 0;
                i8 = 0;
                i11 = 0;
                i13 = 0;
                iArr = j;
                i3 = 0;
            } else {
                int i47 = i44 + 1;
                int charAt16 = str.charAt(i44);
                if (charAt16 >= 55296) {
                    int i48 = charAt16 & 8191;
                    int i49 = 13;
                    while (true) {
                        i21 = i47 + 1;
                        charAt9 = str.charAt(i47);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i48 |= (charAt9 & 8191) << i49;
                        i49 += 13;
                        i47 = i21;
                    }
                    charAt16 = i48 | (charAt9 << i49);
                    i47 = i21;
                }
                int i50 = i47 + 1;
                int charAt17 = str.charAt(i47);
                if (charAt17 >= 55296) {
                    int i51 = charAt17 & 8191;
                    int i52 = 13;
                    while (true) {
                        i20 = i50 + 1;
                        charAt8 = str.charAt(i50);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i51 |= (charAt8 & 8191) << i52;
                        i52 += 13;
                        i50 = i20;
                    }
                    charAt17 = i51 | (charAt8 << i52);
                    i50 = i20;
                }
                int i53 = i50 + 1;
                int charAt18 = str.charAt(i50);
                if (charAt18 >= 55296) {
                    int i54 = charAt18 & 8191;
                    int i55 = 13;
                    while (true) {
                        i19 = i53 + 1;
                        charAt7 = str.charAt(i53);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i54 |= (charAt7 & 8191) << i55;
                        i55 += 13;
                        i53 = i19;
                    }
                    charAt18 = i54 | (charAt7 << i55);
                    i53 = i19;
                }
                int i56 = i53 + 1;
                int charAt19 = str.charAt(i53);
                if (charAt19 >= 55296) {
                    int i57 = charAt19 & 8191;
                    int i58 = 13;
                    while (true) {
                        i18 = i56 + 1;
                        charAt6 = str.charAt(i56);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i57 |= (charAt6 & 8191) << i58;
                        i58 += 13;
                        i56 = i18;
                    }
                    charAt19 = i57 | (charAt6 << i58);
                    i56 = i18;
                }
                int i59 = i56 + 1;
                charAt = str.charAt(i56);
                if (charAt >= 55296) {
                    int i60 = charAt & 8191;
                    int i61 = 13;
                    while (true) {
                        i17 = i59 + 1;
                        charAt5 = str.charAt(i59);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i60 |= (charAt5 & 8191) << i61;
                        i61 += 13;
                        i59 = i17;
                    }
                    charAt = i60 | (charAt5 << i61);
                    i59 = i17;
                }
                int i62 = i59 + 1;
                int charAt20 = str.charAt(i59);
                if (charAt20 >= 55296) {
                    int i63 = charAt20 & 8191;
                    int i64 = 13;
                    while (true) {
                        i16 = i62 + 1;
                        charAt4 = str.charAt(i62);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i63 |= (charAt4 & 8191) << i64;
                        i64 += 13;
                        i62 = i16;
                    }
                    charAt20 = i63 | (charAt4 << i64);
                    i62 = i16;
                }
                int i65 = i62 + 1;
                int charAt21 = str.charAt(i62);
                if (charAt21 >= 55296) {
                    int i66 = charAt21 & 8191;
                    int i67 = 13;
                    while (true) {
                        i15 = i65 + 1;
                        charAt3 = str.charAt(i65);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i66 |= (charAt3 & 8191) << i67;
                        i67 += 13;
                        i65 = i15;
                    }
                    charAt21 = i66 | (charAt3 << i67);
                    i65 = i15;
                }
                int i68 = i65 + 1;
                int charAt22 = str.charAt(i65);
                if (charAt22 >= 55296) {
                    int i69 = charAt22 & 8191;
                    int i70 = 13;
                    while (true) {
                        i14 = i68 + 1;
                        charAt2 = str.charAt(i68);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i69 |= (charAt2 & 8191) << i70;
                        i70 += 13;
                        i68 = i14;
                    }
                    charAt22 = i69 | (charAt2 << i70);
                    i68 = i14;
                }
                int i71 = charAt16 + charAt16 + charAt17;
                i3 = charAt16;
                i44 = i68;
                iArr = new int[charAt22 + charAt20 + charAt21];
                int i72 = charAt20;
                i8 = charAt18;
                i10 = i72;
                i11 = charAt19;
                i12 = i71;
                i13 = charAt22;
            }
            Unsafe unsafe = f3822k;
            Object[] objArr2 = p6Var.f3933c;
            Class<?> cls2 = p6Var.f3931a.getClass();
            int i73 = i13 + i10;
            int i74 = charAt + charAt;
            int[] iArr2 = new int[charAt * 3];
            Object[] objArr3 = new Object[i74];
            int i75 = i73;
            int i76 = i13;
            int i77 = 0;
            int i78 = 0;
            while (i44 < length) {
                int i79 = i44 + 1;
                int charAt23 = str.charAt(i44);
                if (charAt23 >= i42) {
                    int i80 = charAt23 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i40 = i81 + 1;
                        charAt13 = str.charAt(i81);
                        i22 = length;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i80 |= (charAt13 & 8191) << i82;
                        i82 += 13;
                        i81 = i40;
                        length = i22;
                    }
                    charAt23 = i80 | (charAt13 << i82);
                    i23 = i40;
                } else {
                    i22 = length;
                    i23 = i79;
                }
                int i83 = i23 + 1;
                int charAt24 = str.charAt(i23);
                Object[] objArr4 = objArr2;
                char c10 = 55296;
                if (charAt24 >= 55296) {
                    int i84 = charAt24 & 8191;
                    int i85 = 13;
                    while (true) {
                        i39 = i83 + 1;
                        charAt12 = str.charAt(i83);
                        if (charAt12 < c10) {
                            break;
                        }
                        i84 |= (charAt12 & 8191) << i85;
                        i85 += 13;
                        i83 = i39;
                        c10 = 55296;
                    }
                    charAt24 = i84 | (charAt12 << i85);
                    i83 = i39;
                }
                if ((charAt24 & 1024) != 0) {
                    iArr[i77] = i78;
                    i77++;
                }
                int i86 = charAt24 & 255;
                int i87 = charAt23;
                int i88 = charAt24 & 2048;
                if (i86 >= 51) {
                    int i89 = i83 + 1;
                    int charAt25 = str.charAt(i83);
                    char c11 = 55296;
                    if (charAt25 >= 55296) {
                        int i90 = charAt25 & 8191;
                        int i91 = i89;
                        int i92 = 13;
                        while (true) {
                            i38 = i91 + 1;
                            charAt11 = str.charAt(i91);
                            if (charAt11 < c11) {
                                break;
                            }
                            i90 |= (charAt11 & 8191) << i92;
                            i92 += 13;
                            i91 = i38;
                            c11 = 55296;
                        }
                        charAt25 = i90 | (charAt11 << i92);
                        i35 = i38;
                    } else {
                        i35 = i89;
                    }
                    int i93 = i35;
                    int i94 = i86 - 51;
                    int i95 = charAt25;
                    if (i94 != 9 && i94 != 17) {
                        if (i94 == 12) {
                            if (p6Var.a() != 1 && i88 == 0) {
                                i37 = 0;
                                int i96 = i95 + i95;
                                i88 = i37;
                                obj = objArr4[i96];
                                if (obj instanceof Field) {
                                    v6 = (Field) obj;
                                } else {
                                    v6 = v(cls2, (String) obj);
                                    objArr4[i96] = v6;
                                }
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(v6);
                                int i97 = i96 + 1;
                                obj2 = objArr4[i97];
                                if (obj2 instanceof Field) {
                                    v10 = (Field) obj2;
                                } else {
                                    v10 = v(cls2, (String) obj2);
                                    objArr4[i97] = v10;
                                }
                                i27 = i93;
                                i30 = objectFieldOffset2;
                                i26 = 55296;
                                objArr = objArr3;
                                i24 = i3;
                                cls = cls2;
                                i29 = 0;
                                i25 = (int) unsafe.objectFieldOffset(v10);
                            } else {
                                i36 = i12 + 1;
                                int i98 = i78 / 3;
                                objArr3[i98 + i98 + 1] = objArr4[i12];
                            }
                        }
                        i37 = i88;
                        int i962 = i95 + i95;
                        i88 = i37;
                        obj = objArr4[i962];
                        if (obj instanceof Field) {
                        }
                        int objectFieldOffset22 = (int) unsafe.objectFieldOffset(v6);
                        int i972 = i962 + 1;
                        obj2 = objArr4[i972];
                        if (obj2 instanceof Field) {
                        }
                        i27 = i93;
                        i30 = objectFieldOffset22;
                        i26 = 55296;
                        objArr = objArr3;
                        i24 = i3;
                        cls = cls2;
                        i29 = 0;
                        i25 = (int) unsafe.objectFieldOffset(v10);
                    } else {
                        i36 = i12 + 1;
                        int i99 = i78 / 3;
                        objArr3[i99 + i99 + 1] = objArr4[i12];
                    }
                    i12 = i36;
                    i37 = i88;
                    int i9622 = i95 + i95;
                    i88 = i37;
                    obj = objArr4[i9622];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset222 = (int) unsafe.objectFieldOffset(v6);
                    int i9722 = i9622 + 1;
                    obj2 = objArr4[i9722];
                    if (obj2 instanceof Field) {
                    }
                    i27 = i93;
                    i30 = objectFieldOffset222;
                    i26 = 55296;
                    objArr = objArr3;
                    i24 = i3;
                    cls = cls2;
                    i29 = 0;
                    i25 = (int) unsafe.objectFieldOffset(v10);
                } else {
                    int i100 = i12 + 1;
                    Field v11 = v(cls2, (String) objArr4[i12]);
                    objArr = objArr3;
                    if (i86 == 9 || i86 == 17) {
                        i24 = i3;
                        int i101 = i78 / 3;
                        objArr[i101 + i101 + 1] = v11.getType();
                    } else {
                        if (i86 != 27) {
                            if (i86 == 49) {
                                i12 += 2;
                                i24 = i3;
                                i31 = 1;
                            } else {
                                if (i86 != 12 && i86 != 30 && i86 != 44) {
                                    if (i86 == 50) {
                                        int i102 = i12 + 2;
                                        int i103 = i76 + 1;
                                        iArr[i76] = i78;
                                        int i104 = i78 / 3;
                                        int i105 = i104 + i104;
                                        objArr[i105] = objArr4[i100];
                                        if (i88 != 0) {
                                            i12 += 3;
                                            objArr[i105 + 1] = objArr4[i102];
                                            cls = cls2;
                                            i76 = i103;
                                        } else {
                                            i12 = i102;
                                            cls = cls2;
                                            i76 = i103;
                                            i88 = 0;
                                        }
                                        i24 = i3;
                                    } else {
                                        i24 = i3;
                                    }
                                } else {
                                    i24 = i3;
                                    if (p6Var.a() != 1 && i88 == 0) {
                                        cls = cls2;
                                        i12 = i100;
                                        i88 = 0;
                                    } else {
                                        i12 += 2;
                                        int i106 = i78 / 3;
                                        objArr[i106 + i106 + 1] = objArr4[i100];
                                        cls = cls2;
                                    }
                                }
                                objectFieldOffset = (int) unsafe.objectFieldOffset(v11);
                                i25 = 1048575;
                                if ((charAt24 & 4096) == 0 && i86 <= 17) {
                                    int i107 = i83 + 1;
                                    int charAt26 = str.charAt(i83);
                                    if (charAt26 >= 55296) {
                                        int i108 = charAt26 & 8191;
                                        int i109 = 13;
                                        while (true) {
                                            i27 = i107 + 1;
                                            charAt10 = str.charAt(i107);
                                            if (charAt10 < 55296) {
                                                break;
                                            }
                                            i108 |= (charAt10 & 8191) << i109;
                                            i109 += 13;
                                            i107 = i27;
                                        }
                                        charAt26 = i108 | (charAt10 << i109);
                                    } else {
                                        i27 = i107;
                                    }
                                    int i110 = (charAt26 / 32) + i24 + i24;
                                    Object obj3 = objArr4[i110];
                                    if (obj3 instanceof Field) {
                                        v = (Field) obj3;
                                    } else {
                                        v = v(cls, (String) obj3);
                                        objArr4[i110] = v;
                                    }
                                    i28 = charAt26 % 32;
                                    i25 = (int) unsafe.objectFieldOffset(v);
                                    i26 = 55296;
                                } else {
                                    i26 = 55296;
                                    i27 = i83;
                                    i28 = 0;
                                }
                                if (i86 >= 18 && i86 <= 49) {
                                    iArr[i75] = objectFieldOffset;
                                    i75++;
                                }
                                i29 = i28;
                                i30 = objectFieldOffset;
                            }
                        } else {
                            i24 = i3;
                            i31 = 1;
                            i12 += 2;
                        }
                        int i111 = i78 / 3;
                        objArr[i111 + i111 + i31] = objArr4[i100];
                        cls = cls2;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(v11);
                        i25 = 1048575;
                        if ((charAt24 & 4096) == 0) {
                        }
                        i26 = 55296;
                        i27 = i83;
                        i28 = 0;
                        if (i86 >= 18) {
                            iArr[i75] = objectFieldOffset;
                            i75++;
                        }
                        i29 = i28;
                        i30 = objectFieldOffset;
                    }
                    cls = cls2;
                    i12 = i100;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(v11);
                    i25 = 1048575;
                    if ((charAt24 & 4096) == 0) {
                    }
                    i26 = 55296;
                    i27 = i83;
                    i28 = 0;
                    if (i86 >= 18) {
                    }
                    i29 = i28;
                    i30 = objectFieldOffset;
                }
                int i112 = i88;
                int i113 = i78 + 1;
                iArr2[i78] = i87;
                int i114 = i78 + 2;
                String str2 = str;
                if ((charAt24 & 512) != 0) {
                    i32 = GroupFlagsKt.HasMovableContentFlag;
                } else {
                    i32 = 0;
                }
                if ((charAt24 & 256) != 0) {
                    i33 = GroupFlagsKt.IsMovableContentFlag;
                } else {
                    i33 = 0;
                }
                if (i112 != 0) {
                    i34 = Integer.MIN_VALUE;
                } else {
                    i34 = 0;
                }
                iArr2[i113] = i32 | i33 | i34 | (i86 << 20) | i30;
                i78 += 3;
                iArr2[i114] = (i29 << 20) | i25;
                cls2 = cls;
                objArr2 = objArr4;
                i42 = i26;
                length = i22;
                objArr3 = objArr;
                i3 = i24;
                i44 = i27;
                str = str2;
            }
            return new j6(iArr2, objArr3, i8, i11, p6Var.f3931a, iArr, i13, i73, m5Var, m5Var2);
        }
        p6Var.getClass();
        a8.c.i();
        return null;
    }

    public static Field v(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            androidx.compose.ui.b.Q(sb, "Field ", str, " for ", name);
            androidx.privacysandbox.ads.adservices.customaudience.a.l(i6.q(sb, " not found. Known fields are ", arrays), e10);
            return null;
        }
    }

    public final Object A(int i, Object obj) {
        q6 y10 = y(i);
        int E = E(i) & 1048575;
        if (!o(i, obj)) {
            return y10.a();
        }
        Object object = f3822k.getObject(obj, E);
        if (j(object)) {
            return object;
        }
        o5 a10 = y10.a();
        if (object != null) {
            y10.b(a10, object);
        }
        return a10;
    }

    public final void B(int i, Object obj, Object obj2) {
        f3822k.putObject(obj, E(i) & 1048575, obj2);
        p(i, obj);
    }

    public final Object C(int i, int i3, Object obj) {
        q6 y10 = y(i3);
        if (!q(i, i3, obj)) {
            return y10.a();
        }
        Object object = f3822k.getObject(obj, E(i3) & 1048575);
        if (j(object)) {
            return object;
        }
        o5 a10 = y10.a();
        if (object != null) {
            y10.b(a10, object);
        }
        return a10;
    }

    public final void D(int i, int i3, Object obj, Object obj2) {
        f3822k.putObject(obj, E(i3) & 1048575, obj2);
        a7.g(obj, i, this.f3823a[i3 + 2] & 1048575);
    }

    public final int E(int i) {
        return this.f3823a[i + 1];
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final o5 a() {
        return (o5) ((o5) this.f3827e).n(4);
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (j(obj)) {
            obj2.getClass();
            int i = 0;
            while (true) {
                int[] iArr = this.f3823a;
                if (i < iArr.length) {
                    int E = E(i);
                    int i3 = E & 1048575;
                    int F = F(E);
                    int i8 = iArr[i];
                    long j10 = i3;
                    switch (F) {
                        case 0:
                            if (o(i, obj2)) {
                                z6 z6Var = a7.f3702c;
                                obj3 = obj;
                                z6Var.g(obj3, j10, z6Var.f(obj2, j10));
                                p(i, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (o(i, obj2)) {
                                z6 z6Var2 = a7.f3702c;
                                z6Var2.e(obj, j10, z6Var2.d(obj2, j10));
                                p(i, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (o(i, obj2)) {
                                a7.i(obj, j10, a7.h(obj2, j10));
                                p(i, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (o(i, obj2)) {
                                a7.i(obj, j10, a7.h(obj2, j10));
                                p(i, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (o(i, obj2)) {
                                a7.g(obj, a7.f(obj2, j10), j10);
                                p(i, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (o(i, obj2)) {
                                a7.i(obj, j10, a7.h(obj2, j10));
                                p(i, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (o(i, obj2)) {
                                a7.g(obj, a7.f(obj2, j10), j10);
                                p(i, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (o(i, obj2)) {
                                z6 z6Var3 = a7.f3702c;
                                z6Var3.c(obj, j10, z6Var3.b(obj2, j10));
                                p(i, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (o(i, obj2)) {
                                a7.k(j10, obj, a7.j(obj2, j10));
                                p(i, obj);
                                break;
                            }
                            break;
                        case 9:
                            w(i, obj, obj2);
                            break;
                        case 10:
                            if (o(i, obj2)) {
                                a7.k(j10, obj, a7.j(obj2, j10));
                                p(i, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (o(i, obj2)) {
                                a7.g(obj, a7.f(obj2, j10), j10);
                                p(i, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (o(i, obj2)) {
                                a7.g(obj, a7.f(obj2, j10), j10);
                                p(i, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (o(i, obj2)) {
                                a7.g(obj, a7.f(obj2, j10), j10);
                                p(i, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (o(i, obj2)) {
                                a7.i(obj, j10, a7.h(obj2, j10));
                                p(i, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (o(i, obj2)) {
                                a7.g(obj, a7.f(obj2, j10), j10);
                                p(i, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (o(i, obj2)) {
                                a7.i(obj, j10, a7.h(obj2, j10));
                                p(i, obj);
                                break;
                            }
                            break;
                        case 17:
                            w(i, obj, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            t5 t5Var = (t5) a7.j(obj, j10);
                            t5 t5Var2 = (t5) a7.j(obj2, j10);
                            int size = t5Var.size();
                            int size2 = t5Var2.size();
                            if (size > 0 && size2 > 0) {
                                if (!((v4) t5Var).f3994a) {
                                    t5Var = t5Var.k(size2 + size);
                                }
                                t5Var.addAll(t5Var2);
                            }
                            if (size > 0) {
                                t5Var2 = t5Var;
                            }
                            a7.k(j10, obj, t5Var2);
                            break;
                        case 50:
                            m5 m5Var = r6.f3945a;
                            a7.k(j10, obj, m5.c(a7.j(obj, j10), a7.j(obj2, j10)));
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (q(i8, i, obj2)) {
                                a7.k(j10, obj, a7.j(obj2, j10));
                                a7.g(obj, i8, iArr[i + 2] & 1048575);
                                break;
                            }
                            break;
                        case RectListKt.BitOffsetForUpdated /* 60 */:
                            x(i, obj, obj2);
                            break;
                        case RectListKt.BitOffsetForFocusable /* 61 */:
                        case RectListKt.BitOffsetForGesturable /* 62 */:
                        case 63:
                        case 64:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            if (q(i8, i, obj2)) {
                                a7.k(j10, obj, a7.j(obj2, j10));
                                a7.g(obj, i8, iArr[i + 2] & 1048575);
                                break;
                            }
                            break;
                        case 68:
                            x(i, obj, obj2);
                            break;
                    }
                    obj3 = obj;
                    i += 3;
                    obj = obj3;
                } else {
                    r6.b(obj, obj2);
                    return;
                }
            }
        } else {
            f2.i.k("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.q6
    public final int c(u4 u4Var) {
        int i;
        int s;
        int a10;
        int i3;
        int i8;
        int b10;
        int s3;
        int size;
        int r;
        int s10;
        int s11;
        int s12;
        int i10;
        int s13;
        int a11;
        j6 j6Var = this;
        u4 u4Var2 = u4Var;
        Unsafe unsafe = f3822k;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = j6Var.f3823a;
            if (i13 < iArr.length) {
                int E = j6Var.E(i13);
                int F = F(E);
                int i16 = iArr[i13];
                int i17 = iArr[i13 + 2];
                int i18 = i17 & i11;
                if (F <= 17) {
                    if (i18 != i12) {
                        if (i18 == i11) {
                            i14 = 0;
                        } else {
                            i14 = unsafe.getInt(u4Var2, i18);
                        }
                        i12 = i18;
                    }
                    i = 1 << (i17 >>> 20);
                } else {
                    i = 0;
                }
                int i19 = E & i11;
                if (F >= j5.f3819b.f3821a) {
                    j5.l.getClass();
                }
                long j10 = i19;
                switch (F) {
                    case 0:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            i15 = i6.h(i16 << 3, 8, i15);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            i15 = i6.h(i16 << 3, 4, i15);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            long j11 = unsafe.getLong(u4Var2, j10);
                            s = d5.s(i16 << 3);
                            a10 = d5.a(j11);
                            i3 = a10 + s;
                            i15 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            long j12 = unsafe.getLong(u4Var2, j10);
                            s = d5.s(i16 << 3);
                            a10 = d5.a(j12);
                            i3 = a10 + s;
                            i15 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            long j13 = unsafe.getInt(u4Var2, j10);
                            s = d5.s(i16 << 3);
                            a10 = d5.a(j13);
                            i3 = a10 + s;
                            i15 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            i15 = i6.h(i16 << 3, 8, i15);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            i15 = i6.h(i16 << 3, 4, i15);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            i15 = i6.h(i16 << 3, 1, i15);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            int i20 = i16 << 3;
                            Object object = unsafe.getObject(u4Var2, j10);
                            if (object instanceof c5) {
                                int s14 = d5.s(i20);
                                int d10 = ((c5) object).d();
                                i15 = i6.i(d10, d10, s14, i15);
                                break;
                            } else {
                                s = d5.s(i20);
                                a10 = d5.b((String) object);
                                i3 = a10 + s;
                                i15 += i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            Object object2 = unsafe.getObject(u4Var2, j10);
                            q6 y10 = j6Var.y(i13);
                            m5 m5Var = r6.f3945a;
                            int s15 = d5.s(i16 << 3);
                            int b11 = ((u4) object2).b(y10);
                            i15 = i6.i(b11, b11, s15, i15);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            c5 c5Var = (c5) unsafe.getObject(u4Var2, j10);
                            int s16 = d5.s(i16 << 3);
                            int d11 = c5Var.d();
                            i15 = i6.i(d11, d11, s16, i15);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            i15 = i6.h(unsafe.getInt(u4Var2, j10), d5.s(i16 << 3), i15);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            long j14 = unsafe.getInt(u4Var2, j10);
                            s = d5.s(i16 << 3);
                            a10 = d5.a(j14);
                            i3 = a10 + s;
                            i15 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            i15 = i6.h(i16 << 3, 4, i15);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            i15 = i6.h(i16 << 3, 8, i15);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            int i21 = unsafe.getInt(u4Var2, j10);
                            i15 = i6.h((i21 >> 31) ^ (i21 + i21), d5.s(i16 << 3), i15);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            long j15 = unsafe.getLong(u4Var2, j10);
                            s = d5.s(i16 << 3);
                            a10 = d5.a((j15 >> 63) ^ (j15 + j15));
                            i3 = a10 + s;
                            i15 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (j6Var.n(u4Var2, i13, i12, i14, i)) {
                            u4 u4Var3 = (u4) unsafe.getObject(u4Var2, j10);
                            q6 y11 = j6Var.y(i13);
                            int s17 = d5.s(i16 << 3);
                            i8 = s17 + s17;
                            b10 = u4Var3.b(y11);
                            i3 = b10 + i8;
                            i15 += i3;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i3 = r6.y(i16, (List) unsafe.getObject(u4Var2, j10));
                        i15 += i3;
                        break;
                    case 19:
                        i3 = r6.x(i16, (List) unsafe.getObject(u4Var2, j10));
                        i15 += i3;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var2 = r6.f3945a;
                        if (list.size() != 0) {
                            s3 = (d5.s(i16 << 3) * list.size()) + r6.q(list);
                            i15 += s3;
                            break;
                        }
                        s3 = 0;
                        i15 += s3;
                    case 21:
                        List list2 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var3 = r6.f3945a;
                        size = list2.size();
                        if (size != 0) {
                            r = r6.r(list2);
                            s10 = d5.s(i16 << 3);
                            s11 = (s10 * size) + r;
                            i15 += s11;
                            break;
                        }
                        s11 = 0;
                        i15 += s11;
                    case 22:
                        List list3 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var4 = r6.f3945a;
                        size = list3.size();
                        if (size != 0) {
                            r = r6.u(list3);
                            s10 = d5.s(i16 << 3);
                            s11 = (s10 * size) + r;
                            i15 += s11;
                            break;
                        }
                        s11 = 0;
                        i15 += s11;
                    case 23:
                        i3 = r6.y(i16, (List) unsafe.getObject(u4Var2, j10));
                        i15 += i3;
                        break;
                    case 24:
                        i3 = r6.x(i16, (List) unsafe.getObject(u4Var2, j10));
                        i15 += i3;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var5 = r6.f3945a;
                        int size2 = list4.size();
                        if (size2 != 0) {
                            s3 = (d5.s(i16 << 3) + 1) * size2;
                            i15 += s3;
                            break;
                        }
                        s3 = 0;
                        i15 += s3;
                    case 26:
                        List list5 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var6 = r6.f3945a;
                        int size3 = list5.size();
                        if (size3 != 0) {
                            s11 = d5.s(i16 << 3) * size3;
                            if (list5 instanceof y5) {
                                y5 y5Var = (y5) list5;
                                for (int i22 = 0; i22 < size3; i22++) {
                                    Object f7 = y5Var.f();
                                    if (f7 instanceof c5) {
                                        int d12 = ((c5) f7).d();
                                        s11 = i6.h(d12, d12, s11);
                                    } else {
                                        s11 = d5.b((String) f7) + s11;
                                    }
                                }
                            } else {
                                for (int i23 = 0; i23 < size3; i23++) {
                                    Object obj = list5.get(i23);
                                    if (obj instanceof c5) {
                                        int d13 = ((c5) obj).d();
                                        s11 = i6.h(d13, d13, s11);
                                    } else {
                                        s11 = d5.b((String) obj) + s11;
                                    }
                                }
                            }
                            i15 += s11;
                            break;
                        }
                        s11 = 0;
                        i15 += s11;
                    case 27:
                        List list6 = (List) unsafe.getObject(u4Var2, j10);
                        q6 y12 = j6Var.y(i13);
                        m5 m5Var7 = r6.f3945a;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            s12 = 0;
                        } else {
                            s12 = d5.s(i16 << 3) * size4;
                            for (int i24 = 0; i24 < size4; i24++) {
                                int b12 = ((u4) list6.get(i24)).b(y12);
                                s12 = i6.h(b12, b12, s12);
                            }
                        }
                        i15 += s12;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var8 = r6.f3945a;
                        int size5 = list7.size();
                        if (size5 != 0) {
                            s11 = d5.s(i16 << 3) * size5;
                            for (int i25 = 0; i25 < list7.size(); i25++) {
                                int d14 = ((c5) list7.get(i25)).d();
                                s11 = i6.h(d14, d14, s11);
                            }
                            i15 += s11;
                            break;
                        }
                        s11 = 0;
                        i15 += s11;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        List list8 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var9 = r6.f3945a;
                        size = list8.size();
                        if (size != 0) {
                            r = r6.v(list8);
                            s10 = d5.s(i16 << 3);
                            s11 = (s10 * size) + r;
                            i15 += s11;
                            break;
                        }
                        s11 = 0;
                        i15 += s11;
                    case 30:
                        List list9 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var10 = r6.f3945a;
                        size = list9.size();
                        if (size != 0) {
                            r = r6.t(list9);
                            s10 = d5.s(i16 << 3);
                            s11 = (s10 * size) + r;
                            i15 += s11;
                            break;
                        }
                        s11 = 0;
                        i15 += s11;
                    case 31:
                        i3 = r6.x(i16, (List) unsafe.getObject(u4Var2, j10));
                        i15 += i3;
                        break;
                    case 32:
                        i3 = r6.y(i16, (List) unsafe.getObject(u4Var2, j10));
                        i15 += i3;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var11 = r6.f3945a;
                        size = list10.size();
                        if (size != 0) {
                            r = r6.w(list10);
                            s10 = d5.s(i16 << 3);
                            s11 = (s10 * size) + r;
                            i15 += s11;
                            break;
                        }
                        s11 = 0;
                        i15 += s11;
                    case 34:
                        List list11 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var12 = r6.f3945a;
                        size = list11.size();
                        if (size != 0) {
                            r = r6.s(list11);
                            s10 = d5.s(i16 << 3);
                            s11 = (s10 * size) + r;
                            i15 += s11;
                            break;
                        }
                        s11 = 0;
                        i15 += s11;
                    case 35:
                        List list12 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var13 = r6.f3945a;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            i15 = i6.i(size6, d5.s(i16 << 3), size6, i15);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        List list13 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var14 = r6.f3945a;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            i15 = i6.i(size7, d5.s(i16 << 3), size7, i15);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int q = r6.q((List) unsafe.getObject(u4Var2, j10));
                        if (q > 0) {
                            i15 = i6.i(q, d5.s(i16 << 3), q, i15);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int r10 = r6.r((List) unsafe.getObject(u4Var2, j10));
                        if (r10 > 0) {
                            i15 = i6.i(r10, d5.s(i16 << 3), r10, i15);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int u = r6.u((List) unsafe.getObject(u4Var2, j10));
                        if (u > 0) {
                            i15 = i6.i(u, d5.s(i16 << 3), u, i15);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        List list14 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var15 = r6.f3945a;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            i15 = i6.i(size8, d5.s(i16 << 3), size8, i15);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        List list15 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var16 = r6.f3945a;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            i15 = i6.i(size9, d5.s(i16 << 3), size9, i15);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list16 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var17 = r6.f3945a;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            i15 = i6.i(size10, d5.s(i16 << 3), size10, i15);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int v = r6.v((List) unsafe.getObject(u4Var2, j10));
                        if (v > 0) {
                            i15 = i6.i(v, d5.s(i16 << 3), v, i15);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int t = r6.t((List) unsafe.getObject(u4Var2, j10));
                        if (t > 0) {
                            i15 = i6.i(t, d5.s(i16 << 3), t, i15);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        List list17 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var18 = r6.f3945a;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            i15 = i6.i(size11, d5.s(i16 << 3), size11, i15);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        List list18 = (List) unsafe.getObject(u4Var2, j10);
                        m5 m5Var19 = r6.f3945a;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            i15 = i6.i(size12, d5.s(i16 << 3), size12, i15);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int w6 = r6.w((List) unsafe.getObject(u4Var2, j10));
                        if (w6 > 0) {
                            i15 = i6.i(w6, d5.s(i16 << 3), w6, i15);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int s18 = r6.s((List) unsafe.getObject(u4Var2, j10));
                        if (s18 > 0) {
                            i15 = i6.i(s18, d5.s(i16 << 3), s18, i15);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list19 = (List) unsafe.getObject(u4Var2, j10);
                        q6 y13 = j6Var.y(i13);
                        m5 m5Var20 = r6.f3945a;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            for (int i26 = 0; i26 < size13; i26++) {
                                u4 u4Var4 = (u4) list19.get(i26);
                                int s19 = d5.s(i16 << 3);
                                i10 += u4Var4.b(y13) + s19 + s19;
                            }
                        }
                        i15 += i10;
                        break;
                    case 50:
                        int i27 = i13 / 3;
                        e6 e6Var = (e6) unsafe.getObject(u4Var2, j10);
                        d6 d6Var = (d6) j6Var.f3824b[i27 + i27];
                        if (!e6Var.isEmpty()) {
                            s11 = 0;
                            for (Map.Entry entry : e6Var.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                t tVar = d6Var.f3743a;
                                int s20 = d5.s(i16 << 3);
                                int b13 = d6.b(tVar, key, value);
                                s11 = i6.i(b13, b13, s20, s11);
                            }
                            i15 += s11;
                            break;
                        }
                        s11 = 0;
                        i15 += s11;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            i15 = i6.h(i16 << 3, 8, i15);
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            i15 = i6.h(i16 << 3, 4, i15);
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            long l = l(u4Var2, j10);
                            s13 = d5.s(i16 << 3);
                            a11 = d5.a(l);
                            i15 += a11 + s13;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            long l10 = l(u4Var2, j10);
                            s13 = d5.s(i16 << 3);
                            a11 = d5.a(l10);
                            i15 += a11 + s13;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            long k10 = k(u4Var2, j10);
                            s13 = d5.s(i16 << 3);
                            a11 = d5.a(k10);
                            i15 += a11 + s13;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            i15 = i6.h(i16 << 3, 8, i15);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            i15 = i6.h(i16 << 3, 4, i15);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            i15 = i6.h(i16 << 3, 1, i15);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            int i28 = i16 << 3;
                            Object object3 = unsafe.getObject(u4Var2, j10);
                            if (object3 instanceof c5) {
                                int s21 = d5.s(i28);
                                int d15 = ((c5) object3).d();
                                i15 = i6.i(d15, d15, s21, i15);
                                break;
                            } else {
                                s13 = d5.s(i28);
                                a11 = d5.b((String) object3);
                                i15 += a11 + s13;
                                break;
                            }
                        } else {
                            break;
                        }
                    case RectListKt.BitOffsetForUpdated /* 60 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            Object object4 = unsafe.getObject(u4Var2, j10);
                            q6 y14 = j6Var.y(i13);
                            m5 m5Var21 = r6.f3945a;
                            int s22 = d5.s(i16 << 3);
                            int b14 = ((u4) object4).b(y14);
                            i15 = i6.i(b14, b14, s22, i15);
                            break;
                        } else {
                            break;
                        }
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            c5 c5Var2 = (c5) unsafe.getObject(u4Var2, j10);
                            int s23 = d5.s(i16 << 3);
                            int d16 = c5Var2.d();
                            i15 = i6.i(d16, d16, s23, i15);
                            break;
                        } else {
                            break;
                        }
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            i15 = i6.h(k(u4Var2, j10), d5.s(i16 << 3), i15);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            long k11 = k(u4Var2, j10);
                            s13 = d5.s(i16 << 3);
                            a11 = d5.a(k11);
                            i15 += a11 + s13;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            i15 = i6.h(i16 << 3, 4, i15);
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            i15 = i6.h(i16 << 3, 8, i15);
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            int k12 = k(u4Var2, j10);
                            i15 = i6.h((k12 >> 31) ^ (k12 + k12), d5.s(i16 << 3), i15);
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            long l11 = l(u4Var2, j10);
                            s13 = d5.s(i16 << 3);
                            a11 = d5.a((l11 >> 63) ^ (l11 + l11));
                            i15 += a11 + s13;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (j6Var.q(i16, i13, u4Var2)) {
                            u4 u4Var5 = (u4) unsafe.getObject(u4Var2, j10);
                            q6 y15 = j6Var.y(i13);
                            int s24 = d5.s(i16 << 3);
                            i8 = s24 + s24;
                            b10 = u4Var5.b(y15);
                            i3 = b10 + i8;
                            i15 += i3;
                            break;
                        } else {
                            break;
                        }
                }
                i13 += 3;
                j6Var = this;
                u4Var2 = u4Var;
                i11 = 1048575;
            } else {
                return ((o5) u4Var).zzc.c() + i15;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void d(Object obj, c6 c6Var) {
        int i;
        j6 j6Var = this;
        Unsafe unsafe = f3822k;
        int i3 = 1048575;
        int i8 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = j6Var.f3823a;
            if (i8 < iArr.length) {
                int E = j6Var.E(i8);
                int F = F(E);
                int i12 = iArr[i8];
                if (F <= 17) {
                    int i13 = iArr[i8 + 2];
                    int i14 = i13 & i3;
                    if (i14 != i11) {
                        if (i14 == i3) {
                            i10 = 0;
                        } else {
                            i10 = unsafe.getInt(obj, i14);
                        }
                        i11 = i14;
                    }
                    i = 1 << (i13 >>> 20);
                } else {
                    i = 0;
                }
                long j10 = E & i3;
                switch (F) {
                    case 0:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).h(i12, Double.doubleToRawLongBits(a7.f3702c.f(obj, j10)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).f(i12, Float.floatToRawIntBits(a7.f3702c.d(obj, j10)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).g(i12, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).g(i12, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).d(i12, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).h(i12, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).f(i12, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            boolean b10 = a7.f3702c.b(obj, j10);
                            d5 d5Var = (d5) c6Var.f3726a;
                            d5Var.m(i12 << 3);
                            d5Var.k(b10 ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            Object object = unsafe.getObject(obj, j10);
                            if (object instanceof String) {
                                d5 d5Var2 = (d5) c6Var.f3726a;
                                d5Var2.m((i12 << 3) | 2);
                                d5Var2.r((String) object);
                                break;
                            } else {
                                ((d5) c6Var.f3726a).i(i12, (c5) object);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            c6Var.d(i12, unsafe.getObject(obj, j10), j6Var.y(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).i(i12, (c5) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).e(i12, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).d(i12, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).f(i12, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            ((d5) c6Var.f3726a).h(i12, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            int i15 = unsafe.getInt(obj, j10);
                            ((d5) c6Var.f3726a).e(i12, (i15 >> 31) ^ (i15 + i15));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            long j11 = unsafe.getLong(obj, j10);
                            ((d5) c6Var.f3726a).g(i12, (j11 >> 63) ^ (j11 + j11));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (j6Var.n(obj, i8, i11, i10, i)) {
                            c6Var.e(i12, unsafe.getObject(obj, j10), j6Var.y(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        r6.c(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 19:
                        r6.d(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 20:
                        r6.e(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 21:
                        r6.f(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 22:
                        r6.j(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 23:
                        r6.h(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 24:
                        r6.m(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 25:
                        r6.p(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 26:
                        int i16 = iArr[i8];
                        List list = (List) unsafe.getObject(obj, j10);
                        m5 m5Var = r6.f3945a;
                        if (list != null && !list.isEmpty()) {
                            d5 d5Var3 = (d5) c6Var.f3726a;
                            if (list instanceof y5) {
                                y5 y5Var = (y5) list;
                                for (int i17 = 0; i17 < list.size(); i17++) {
                                    Object f7 = y5Var.f();
                                    if (f7 instanceof String) {
                                        d5Var3.m((i16 << 3) | 2);
                                        d5Var3.r((String) f7);
                                    } else {
                                        d5Var3.i(i16, (c5) f7);
                                    }
                                }
                                break;
                            } else {
                                for (int i18 = 0; i18 < list.size(); i18++) {
                                    String str = (String) list.get(i18);
                                    d5Var3.m((i16 << 3) | 2);
                                    d5Var3.r(str);
                                }
                                break;
                            }
                        }
                        break;
                    case 27:
                        int i19 = iArr[i8];
                        List list2 = (List) unsafe.getObject(obj, j10);
                        q6 y10 = j6Var.y(i8);
                        m5 m5Var2 = r6.f3945a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i20 = 0; i20 < list2.size(); i20++) {
                                c6Var.d(i19, list2.get(i20), y10);
                            }
                            break;
                        }
                        break;
                    case 28:
                        int i21 = iArr[i8];
                        List list3 = (List) unsafe.getObject(obj, j10);
                        m5 m5Var3 = r6.f3945a;
                        if (list3 != null && !list3.isEmpty()) {
                            c6Var.getClass();
                            for (int i22 = 0; i22 < list3.size(); i22++) {
                                ((d5) c6Var.f3726a).i(i21, (c5) list3.get(i22));
                            }
                            break;
                        }
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        r6.k(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 30:
                        r6.o(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 31:
                        r6.n(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 32:
                        r6.i(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 33:
                        r6.l(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 34:
                        r6.g(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, false);
                        break;
                    case 35:
                        r6.c(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 36:
                        r6.d(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 37:
                        r6.e(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 38:
                        r6.f(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 39:
                        r6.j(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 40:
                        r6.h(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 41:
                        r6.m(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 42:
                        r6.p(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 43:
                        r6.k(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 44:
                        r6.o(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 45:
                        r6.n(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 46:
                        r6.i(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 47:
                        r6.l(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 48:
                        r6.g(iArr[i8], (List) unsafe.getObject(obj, j10), c6Var, true);
                        break;
                    case 49:
                        int i23 = iArr[i8];
                        List list4 = (List) unsafe.getObject(obj, j10);
                        q6 y11 = j6Var.y(i8);
                        m5 m5Var4 = r6.f3945a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i24 = 0; i24 < list4.size(); i24++) {
                                c6Var.e(i23, list4.get(i24), y11);
                            }
                            break;
                        }
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 != null) {
                            int i25 = i8 / 3;
                            t tVar = ((d6) j6Var.f3824b[i25 + i25]).f3743a;
                            c6Var.getClass();
                            for (Map.Entry entry : ((e6) object2).entrySet()) {
                                d5 d5Var4 = (d5) c6Var.f3726a;
                                d5Var4.c(i12, 2);
                                d5Var4.m(d6.b(tVar, entry.getKey(), entry.getValue()));
                                d6.a(d5Var4, tVar, entry.getKey(), entry.getValue());
                            }
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).h(i12, Double.doubleToRawLongBits(((Double) a7.j(obj, j10)).doubleValue()));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).f(i12, Float.floatToRawIntBits(((Float) a7.j(obj, j10)).floatValue()));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).g(i12, l(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).g(i12, l(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).d(i12, k(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).h(i12, l(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).f(i12, k(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (j6Var.q(i12, i8, obj)) {
                            boolean booleanValue = ((Boolean) a7.j(obj, j10)).booleanValue();
                            d5 d5Var5 = (d5) c6Var.f3726a;
                            d5Var5.m(i12 << 3);
                            d5Var5.k(booleanValue ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (j6Var.q(i12, i8, obj)) {
                            Object object3 = unsafe.getObject(obj, j10);
                            if (object3 instanceof String) {
                                d5 d5Var6 = (d5) c6Var.f3726a;
                                d5Var6.m((i12 << 3) | 2);
                                d5Var6.r((String) object3);
                                break;
                            } else {
                                ((d5) c6Var.f3726a).i(i12, (c5) object3);
                                break;
                            }
                        } else {
                            break;
                        }
                    case RectListKt.BitOffsetForUpdated /* 60 */:
                        if (j6Var.q(i12, i8, obj)) {
                            c6Var.d(i12, unsafe.getObject(obj, j10), j6Var.y(i8));
                            break;
                        } else {
                            break;
                        }
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).i(i12, (c5) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).e(i12, k(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).d(i12, k(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).f(i12, k(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                        if (j6Var.q(i12, i8, obj)) {
                            ((d5) c6Var.f3726a).h(i12, l(obj, j10));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        if (j6Var.q(i12, i8, obj)) {
                            int k10 = k(obj, j10);
                            ((d5) c6Var.f3726a).e(i12, (k10 >> 31) ^ (k10 + k10));
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (j6Var.q(i12, i8, obj)) {
                            long l = l(obj, j10);
                            ((d5) c6Var.f3726a).g(i12, (l >> 63) ^ (l + l));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (j6Var.q(i12, i8, obj)) {
                            c6Var.e(i12, unsafe.getObject(obj, j10), j6Var.y(i8));
                            break;
                        } else {
                            break;
                        }
                }
                i8 += 3;
                i3 = 1048575;
                j6Var = this;
            } else {
                ((o5) obj).zzc.b(c6Var);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final boolean e(Object obj) {
        int i;
        int i3;
        int i8;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i11 < this.g) {
            int i13 = this.f3828f[i11];
            int[] iArr = this.f3823a;
            int i14 = iArr[i13];
            int E = E(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i10 = f3822k.getInt(obj, i16);
                }
                i3 = i13;
                i8 = i10;
                i = i16;
            } else {
                int i18 = i10;
                i = i12;
                i3 = i13;
                i8 = i18;
            }
            if ((268435456 & E) == 0 || n(obj, i3, i, i8, i17)) {
                int F = F(E);
                if (F != 9 && F != 17) {
                    if (F != 27) {
                        if (F != 60 && F != 68) {
                            if (F != 49) {
                                if (F != 50) {
                                    continue;
                                } else {
                                    e6 e6Var = (e6) a7.j(obj, E & 1048575);
                                    if (e6Var.isEmpty()) {
                                        continue;
                                    } else {
                                        int i19 = i3 / 3;
                                        if (((d7) ((d6) this.f3824b[i19 + i19]).f3743a.f3961b).f3745a == e7.r) {
                                            q6 q6Var = null;
                                            for (Object obj2 : e6Var.values()) {
                                                if (q6Var == null) {
                                                    q6Var = n6.f3904c.a(obj2.getClass());
                                                }
                                                if (!q6Var.e(obj2)) {
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                i11++;
                                i12 = i;
                                i10 = i8;
                            }
                        } else {
                            if (q(i14, i3, obj) && !y(i3).e(a7.j(obj, E & 1048575))) {
                            }
                            i11++;
                            i12 = i;
                            i10 = i8;
                        }
                    }
                    List list = (List) a7.j(obj, E & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        q6 y10 = y(i3);
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            if (y10.e(list.get(i20))) {
                            }
                        }
                    }
                    i11++;
                    i12 = i;
                    i10 = i8;
                } else {
                    if (n(obj, i3, i, i8, i17) && !y(i3).e(a7.j(obj, E & 1048575))) {
                    }
                    i11++;
                    i12 = i;
                    i10 = i8;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(o5 o5Var, o5 o5Var2) {
        boolean a10;
        int i = 0;
        while (true) {
            int[] iArr = this.f3823a;
            if (i < iArr.length) {
                int E = E(i);
                long j10 = E & 1048575;
                switch (F(E)) {
                    case 0:
                        if (!m(o5Var, o5Var2, i)) {
                            break;
                        } else {
                            z6 z6Var = a7.f3702c;
                            if (Double.doubleToLongBits(z6Var.f(o5Var, j10)) != Double.doubleToLongBits(z6Var.f(o5Var2, j10))) {
                                break;
                            } else {
                                i += 3;
                            }
                        }
                    case 1:
                        if (!m(o5Var, o5Var2, i)) {
                            break;
                        } else {
                            z6 z6Var2 = a7.f3702c;
                            if (Float.floatToIntBits(z6Var2.d(o5Var, j10)) != Float.floatToIntBits(z6Var2.d(o5Var2, j10))) {
                                break;
                            } else {
                                i += 3;
                            }
                        }
                    case 2:
                        if (m(o5Var, o5Var2, i) && a7.h(o5Var, j10) == a7.h(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 3:
                        if (m(o5Var, o5Var2, i) && a7.h(o5Var, j10) == a7.h(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 4:
                        if (m(o5Var, o5Var2, i) && a7.f(o5Var, j10) == a7.f(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 5:
                        if (m(o5Var, o5Var2, i) && a7.h(o5Var, j10) == a7.h(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 6:
                        if (m(o5Var, o5Var2, i) && a7.f(o5Var, j10) == a7.f(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!m(o5Var, o5Var2, i)) {
                            break;
                        } else {
                            z6 z6Var3 = a7.f3702c;
                            if (z6Var3.b(o5Var, j10) != z6Var3.b(o5Var2, j10)) {
                                break;
                            } else {
                                i += 3;
                            }
                        }
                    case 8:
                        if (m(o5Var, o5Var2, i) && r6.a(a7.j(o5Var, j10), a7.j(o5Var2, j10))) {
                            i += 3;
                        }
                        break;
                    case 9:
                        if (m(o5Var, o5Var2, i) && r6.a(a7.j(o5Var, j10), a7.j(o5Var2, j10))) {
                            i += 3;
                        }
                        break;
                    case 10:
                        if (m(o5Var, o5Var2, i) && r6.a(a7.j(o5Var, j10), a7.j(o5Var2, j10))) {
                            i += 3;
                        }
                        break;
                    case 11:
                        if (m(o5Var, o5Var2, i) && a7.f(o5Var, j10) == a7.f(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 12:
                        if (m(o5Var, o5Var2, i) && a7.f(o5Var, j10) == a7.f(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 13:
                        if (m(o5Var, o5Var2, i) && a7.f(o5Var, j10) == a7.f(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 14:
                        if (m(o5Var, o5Var2, i) && a7.h(o5Var, j10) == a7.h(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 15:
                        if (m(o5Var, o5Var2, i) && a7.f(o5Var, j10) == a7.f(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 16:
                        if (m(o5Var, o5Var2, i) && a7.h(o5Var, j10) == a7.h(o5Var2, j10)) {
                            i += 3;
                        }
                        break;
                    case 17:
                        if (m(o5Var, o5Var2, i) && r6.a(a7.j(o5Var, j10), a7.j(o5Var2, j10))) {
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        a10 = r6.a(a7.j(o5Var, j10), a7.j(o5Var2, j10));
                        if (a10) {
                            break;
                        } else {
                            i += 3;
                        }
                    case 50:
                        a10 = r6.a(a7.j(o5Var, j10), a7.j(o5Var2, j10));
                        if (a10) {
                        }
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case RectListKt.BitOffsetForUpdated /* 60 */:
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                    case 63:
                    case 64:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    case 68:
                        long j11 = iArr[i + 2] & 1048575;
                        if (a7.f(o5Var, j11) == a7.f(o5Var2, j11) && r6.a(a7.j(o5Var, j10), a7.j(o5Var2, j10))) {
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
            } else if (o5Var.zzc.equals(o5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void g(Object obj) {
        if (j(obj)) {
            if (obj instanceof o5) {
                o5 o5Var = (o5) obj;
                o5Var.i();
                o5Var.zza = 0;
                o5Var.f();
            }
            int i = 0;
            while (true) {
                int[] iArr = this.f3823a;
                if (i < iArr.length) {
                    int E = E(i);
                    int i3 = 1048575 & E;
                    int F = F(E);
                    long j10 = i3;
                    if (F != 9) {
                        if (F != 60 && F != 68) {
                            switch (F) {
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                    v4 v4Var = (v4) ((t5) a7.j(obj, j10));
                                    if (!v4Var.f3994a) {
                                        break;
                                    } else {
                                        v4Var.f3994a = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = f3822k;
                                    Object object = unsafe.getObject(obj, j10);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((e6) object).f3759a = false;
                                        unsafe.putObject(obj, j10, object);
                                        break;
                                    }
                            }
                        } else if (q(iArr[i], i, obj)) {
                            y(i).g(f3822k.getObject(obj, j10));
                        }
                        i += 3;
                    }
                    if (o(i, obj)) {
                        y(i).g(f3822k.getObject(obj, j10));
                    }
                    i += 3;
                } else {
                    this.i.getClass();
                    v6 v6Var = ((o5) obj).zzc;
                    if (v6Var.f4000e) {
                        v6Var.f4000e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.q6
    public final void h(Object obj, byte[] bArr, int i, int i3, x4 x4Var) {
        t(obj, bArr, i, i3, 0, x4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(o5 o5Var) {
        int i;
        long doubleToLongBits;
        int i3;
        int floatToIntBits;
        int i8;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f3823a;
            if (i11 < iArr.length) {
                int E = E(i11);
                int i13 = 1048575 & E;
                int F = F(E);
                int i14 = iArr[i11];
                long j10 = i13;
                int i15 = 1237;
                int i16 = 37;
                switch (F) {
                    case 0:
                        i = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(a7.f3702c.f(o5Var, j10));
                        Charset charset = u5.f3981a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i3 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(a7.f3702c.d(o5Var, j10));
                        i12 = floatToIntBits + i3;
                        break;
                    case 2:
                        i = i12 * 53;
                        doubleToLongBits = a7.h(o5Var, j10);
                        Charset charset2 = u5.f3981a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i = i12 * 53;
                        doubleToLongBits = a7.h(o5Var, j10);
                        Charset charset3 = u5.f3981a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i3 = i12 * 53;
                        floatToIntBits = a7.f(o5Var, j10);
                        i12 = floatToIntBits + i3;
                        break;
                    case 5:
                        i = i12 * 53;
                        doubleToLongBits = a7.h(o5Var, j10);
                        Charset charset4 = u5.f3981a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i3 = i12 * 53;
                        floatToIntBits = a7.f(o5Var, j10);
                        i12 = floatToIntBits + i3;
                        break;
                    case 7:
                        i8 = i12 * 53;
                        boolean b10 = a7.f3702c.b(o5Var, j10);
                        Charset charset5 = u5.f3981a;
                        break;
                    case 8:
                        i3 = i12 * 53;
                        floatToIntBits = ((String) a7.j(o5Var, j10)).hashCode();
                        i12 = floatToIntBits + i3;
                        break;
                    case 9:
                        i10 = i12 * 53;
                        Object j11 = a7.j(o5Var, j10);
                        if (j11 != null) {
                            i16 = j11.hashCode();
                        }
                        i12 = i10 + i16;
                        break;
                    case 10:
                        i3 = i12 * 53;
                        floatToIntBits = a7.j(o5Var, j10).hashCode();
                        i12 = floatToIntBits + i3;
                        break;
                    case 11:
                        i3 = i12 * 53;
                        floatToIntBits = a7.f(o5Var, j10);
                        i12 = floatToIntBits + i3;
                        break;
                    case 12:
                        i3 = i12 * 53;
                        floatToIntBits = a7.f(o5Var, j10);
                        i12 = floatToIntBits + i3;
                        break;
                    case 13:
                        i3 = i12 * 53;
                        floatToIntBits = a7.f(o5Var, j10);
                        i12 = floatToIntBits + i3;
                        break;
                    case 14:
                        i = i12 * 53;
                        doubleToLongBits = a7.h(o5Var, j10);
                        Charset charset6 = u5.f3981a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 15:
                        i3 = i12 * 53;
                        floatToIntBits = a7.f(o5Var, j10);
                        i12 = floatToIntBits + i3;
                        break;
                    case 16:
                        i = i12 * 53;
                        doubleToLongBits = a7.h(o5Var, j10);
                        Charset charset7 = u5.f3981a;
                        i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 17:
                        i10 = i12 * 53;
                        Object j12 = a7.j(o5Var, j10);
                        if (j12 != null) {
                            i16 = j12.hashCode();
                        }
                        i12 = i10 + i16;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i3 = i12 * 53;
                        floatToIntBits = a7.j(o5Var, j10).hashCode();
                        i12 = floatToIntBits + i3;
                        break;
                    case 50:
                        i3 = i12 * 53;
                        floatToIntBits = a7.j(o5Var, j10).hashCode();
                        i12 = floatToIntBits + i3;
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i = i12 * 53;
                            doubleToLongBits = Double.doubleToLongBits(((Double) a7.j(o5Var, j10)).doubleValue());
                            Charset charset8 = u5.f3981a;
                            i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = Float.floatToIntBits(((Float) a7.j(o5Var, j10)).floatValue());
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i = i12 * 53;
                            doubleToLongBits = l(o5Var, j10);
                            Charset charset9 = u5.f3981a;
                            i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i = i12 * 53;
                            doubleToLongBits = l(o5Var, j10);
                            Charset charset10 = u5.f3981a;
                            i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = k(o5Var, j10);
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case 56:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i = i12 * 53;
                            doubleToLongBits = l(o5Var, j10);
                            Charset charset11 = u5.f3981a;
                            i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 57:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = k(o5Var, j10);
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case 58:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i8 = i12 * 53;
                            boolean booleanValue = ((Boolean) a7.j(o5Var, j10)).booleanValue();
                            Charset charset12 = u5.f3981a;
                            break;
                        }
                    case 59:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = ((String) a7.j(o5Var, j10)).hashCode();
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case RectListKt.BitOffsetForUpdated /* 60 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = a7.j(o5Var, j10).hashCode();
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = a7.j(o5Var, j10).hashCode();
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = k(o5Var, j10);
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case 63:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = k(o5Var, j10);
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case 64:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = k(o5Var, j10);
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i = i12 * 53;
                            doubleToLongBits = l(o5Var, j10);
                            Charset charset13 = u5.f3981a;
                            i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = k(o5Var, j10);
                            i12 = floatToIntBits + i3;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i = i12 * 53;
                            doubleToLongBits = l(o5Var, j10);
                            Charset charset14 = u5.f3981a;
                            i12 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                            break;
                        }
                    case 68:
                        if (!q(i14, i11, o5Var)) {
                            break;
                        } else {
                            i3 = i12 * 53;
                            floatToIntBits = a7.j(o5Var, j10).hashCode();
                            i12 = floatToIntBits + i3;
                            break;
                        }
                }
                i11 += 3;
            } else {
                return o5Var.zzc.hashCode() + (i12 * 53);
            }
        }
    }

    public final boolean m(o5 o5Var, o5 o5Var2, int i) {
        if (o(i, o5Var) == o(i, o5Var2)) {
            return true;
        }
        return false;
    }

    public final boolean n(Object obj, int i, int i3, int i8, int i10) {
        if (i3 == 1048575) {
            return o(i, obj);
        }
        if ((i8 & i10) != 0) {
            return true;
        }
        return false;
    }

    public final boolean o(int i, Object obj) {
        int i3 = this.f3823a[i + 2];
        long j10 = i3 & 1048575;
        if (j10 == 1048575) {
            int E = E(i);
            long j11 = E & 1048575;
            switch (F(E)) {
                case 0:
                    if (Double.doubleToRawLongBits(a7.f3702c.f(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(a7.f3702c.d(obj, j11)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (a7.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (a7.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (a7.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (a7.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (a7.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return a7.f3702c.b(obj, j11);
                case 8:
                    Object j12 = a7.j(obj, j11);
                    if (j12 instanceof String) {
                        if (((String) j12).isEmpty()) {
                            return false;
                        }
                    } else if (j12 instanceof c5) {
                        if (c5.l.equals(j12)) {
                            return false;
                        }
                    } else {
                        f2.i.n();
                        return false;
                    }
                    break;
                case 9:
                    if (a7.j(obj, j11) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (c5.l.equals(a7.j(obj, j11))) {
                        return false;
                    }
                    break;
                case 11:
                    if (a7.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (a7.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (a7.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (a7.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (a7.f(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (a7.h(obj, j11) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (a7.j(obj, j11) == null) {
                        return false;
                    }
                    break;
                default:
                    f2.i.n();
                    return false;
            }
        } else if (((1 << (i3 >>> 20)) & a7.f(obj, j10)) == 0) {
            return false;
        }
        return true;
    }

    public final void p(int i, Object obj) {
        int i3 = this.f3823a[i + 2];
        long j10 = 1048575 & i3;
        if (j10 == 1048575) {
            return;
        }
        a7.g(obj, (1 << (i3 >>> 20)) | a7.f(obj, j10), j10);
    }

    public final boolean q(int i, int i3, Object obj) {
        if (a7.f(obj, this.f3823a[i3 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final int r(int i, int i3) {
        int[] iArr = this.f3823a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i8 = (length + i3) >>> 1;
            int i10 = i8 * 3;
            int i11 = iArr[i10];
            if (i == i11) {
                return i10;
            }
            if (i < i11) {
                length = i8 - 1;
            } else {
                i3 = i8 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int t(java.lang.Object r42, byte[] r43, int r44, int r45, int r46, com.google.android.gms.internal.measurement.x4 r47) {
        /*
            Method dump skipped, instructions count: 4130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j6.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.x4):int");
    }

    public final void w(int i, Object obj, Object obj2) {
        if (!o(i, obj2)) {
            return;
        }
        int E = E(i) & 1048575;
        Unsafe unsafe = f3822k;
        long j10 = E;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            q6 y10 = y(i);
            if (!o(i, obj)) {
                if (!j(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    o5 a10 = y10.a();
                    y10.b(a10, object);
                    unsafe.putObject(obj, j10, a10);
                }
                p(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!j(object2)) {
                o5 a11 = y10.a();
                y10.b(a11, object2);
                unsafe.putObject(obj, j10, a11);
                object2 = a11;
            }
            y10.b(object2, object);
            return;
        }
        int i3 = this.f3823a[i];
        String obj3 = obj2.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
        sb.append("Source subfield ");
        sb.append(i3);
        sb.append(" is present but null: ");
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.f3823a;
        int i3 = iArr[i];
        if (!q(i3, i, obj2)) {
            return;
        }
        int E = E(i) & 1048575;
        Unsafe unsafe = f3822k;
        long j10 = E;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            q6 y10 = y(i);
            if (!q(i3, i, obj)) {
                if (!j(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    o5 a10 = y10.a();
                    y10.b(a10, object);
                    unsafe.putObject(obj, j10, a10);
                }
                a7.g(obj, i3, iArr[i + 2] & 1048575);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!j(object2)) {
                o5 a11 = y10.a();
                y10.b(a11, object2);
                unsafe.putObject(obj, j10, a11);
                object2 = a11;
            }
            y10.b(object2, object);
            return;
        }
        int i8 = iArr[i];
        String obj3 = obj2.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 38 + obj3.length());
        sb.append("Source subfield ");
        sb.append(i8);
        sb.append(" is present but null: ");
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    public final q6 y(int i) {
        int i3 = i / 3;
        int i8 = i3 + i3;
        Object[] objArr = this.f3824b;
        q6 q6Var = (q6) objArr[i8];
        if (q6Var != null) {
            return q6Var;
        }
        q6 a10 = n6.f3904c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a10;
        return a10;
    }

    public final t1 z(int i) {
        int i3 = i / 3;
        return (t1) this.f3824b[i3 + i3 + 1];
    }
}
