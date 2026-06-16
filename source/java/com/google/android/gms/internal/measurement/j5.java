package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class j5 {

    /* renamed from: b, reason: collision with root package name */
    public static final j5 f3819b;
    public static final j5 l;
    public static final j5[] m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ j5[] f3820n;

    /* renamed from: a, reason: collision with root package name */
    public final int f3821a;

    /* JADX INFO: Fake field, exist only in values array */
    j5 EF0;

    static {
        x5 x5Var = x5.f4047n;
        j5 j5Var = new j5("DOUBLE", 0, 0, 1, x5Var);
        x5 x5Var2 = x5.m;
        j5 j5Var2 = new j5("FLOAT", 1, 1, 1, x5Var2);
        x5 x5Var3 = x5.l;
        j5 j5Var3 = new j5("INT64", 2, 2, 1, x5Var3);
        j5 j5Var4 = new j5("UINT64", 3, 3, 1, x5Var3);
        x5 x5Var4 = x5.f4046b;
        j5 j5Var5 = new j5("INT32", 4, 4, 1, x5Var4);
        j5 j5Var6 = new j5("FIXED64", 5, 5, 1, x5Var3);
        j5 j5Var7 = new j5("FIXED32", 6, 6, 1, x5Var4);
        x5 x5Var5 = x5.o;
        j5 j5Var8 = new j5("BOOL", 7, 7, 1, x5Var5);
        x5 x5Var6 = x5.p;
        j5 j5Var9 = new j5("STRING", 8, 8, 1, x5Var6);
        x5 x5Var7 = x5.s;
        j5 j5Var10 = new j5("MESSAGE", 9, 9, 1, x5Var7);
        x5 x5Var8 = x5.q;
        j5 j5Var11 = new j5("BYTES", 10, 10, 1, x5Var8);
        j5 j5Var12 = new j5("UINT32", 11, 11, 1, x5Var4);
        x5 x5Var9 = x5.r;
        j5 j5Var13 = new j5("ENUM", 12, 12, 1, x5Var9);
        j5 j5Var14 = new j5("SFIXED32", 13, 13, 1, x5Var4);
        j5 j5Var15 = new j5("SFIXED64", 14, 14, 1, x5Var3);
        j5 j5Var16 = new j5("SINT32", 15, 15, 1, x5Var4);
        j5 j5Var17 = new j5("SINT64", 16, 16, 1, x5Var3);
        j5 j5Var18 = new j5("GROUP", 17, 17, 1, x5Var7);
        j5 j5Var19 = new j5("DOUBLE_LIST", 18, 18, 2, x5Var);
        j5 j5Var20 = new j5("FLOAT_LIST", 19, 19, 2, x5Var2);
        j5 j5Var21 = new j5("INT64_LIST", 20, 20, 2, x5Var3);
        j5 j5Var22 = new j5("UINT64_LIST", 21, 21, 2, x5Var3);
        j5 j5Var23 = new j5("INT32_LIST", 22, 22, 2, x5Var4);
        j5 j5Var24 = new j5("FIXED64_LIST", 23, 23, 2, x5Var3);
        j5 j5Var25 = new j5("FIXED32_LIST", 24, 24, 2, x5Var4);
        j5 j5Var26 = new j5("BOOL_LIST", 25, 25, 2, x5Var5);
        j5 j5Var27 = new j5("STRING_LIST", 26, 26, 2, x5Var6);
        j5 j5Var28 = new j5("MESSAGE_LIST", 27, 27, 2, x5Var7);
        j5 j5Var29 = new j5("BYTES_LIST", 28, 28, 2, x5Var8);
        j5 j5Var30 = new j5("UINT32_LIST", 29, 29, 2, x5Var4);
        j5 j5Var31 = new j5("ENUM_LIST", 30, 30, 2, x5Var9);
        j5 j5Var32 = new j5("SFIXED32_LIST", 31, 31, 2, x5Var4);
        j5 j5Var33 = new j5("SFIXED64_LIST", 32, 32, 2, x5Var3);
        j5 j5Var34 = new j5("SINT32_LIST", 33, 33, 2, x5Var4);
        j5 j5Var35 = new j5("SINT64_LIST", 34, 34, 2, x5Var3);
        j5 j5Var36 = new j5("DOUBLE_LIST_PACKED", 35, 35, 3, x5Var);
        f3819b = j5Var36;
        j5 j5Var37 = new j5("FLOAT_LIST_PACKED", 36, 36, 3, x5Var2);
        j5 j5Var38 = new j5("INT64_LIST_PACKED", 37, 37, 3, x5Var3);
        j5 j5Var39 = new j5("UINT64_LIST_PACKED", 38, 38, 3, x5Var3);
        j5 j5Var40 = new j5("INT32_LIST_PACKED", 39, 39, 3, x5Var4);
        j5 j5Var41 = new j5("FIXED64_LIST_PACKED", 40, 40, 3, x5Var3);
        j5 j5Var42 = new j5("FIXED32_LIST_PACKED", 41, 41, 3, x5Var4);
        j5 j5Var43 = new j5("BOOL_LIST_PACKED", 42, 42, 3, x5Var5);
        j5 j5Var44 = new j5("UINT32_LIST_PACKED", 43, 43, 3, x5Var4);
        j5 j5Var45 = new j5("ENUM_LIST_PACKED", 44, 44, 3, x5Var9);
        j5 j5Var46 = new j5("SFIXED32_LIST_PACKED", 45, 45, 3, x5Var4);
        j5 j5Var47 = new j5("SFIXED64_LIST_PACKED", 46, 46, 3, x5Var3);
        j5 j5Var48 = new j5("SINT32_LIST_PACKED", 47, 47, 3, x5Var4);
        j5 j5Var49 = new j5("SINT64_LIST_PACKED", 48, 48, 3, x5Var3);
        l = j5Var49;
        f3820n = new j5[]{j5Var, j5Var2, j5Var3, j5Var4, j5Var5, j5Var6, j5Var7, j5Var8, j5Var9, j5Var10, j5Var11, j5Var12, j5Var13, j5Var14, j5Var15, j5Var16, j5Var17, j5Var18, j5Var19, j5Var20, j5Var21, j5Var22, j5Var23, j5Var24, j5Var25, j5Var26, j5Var27, j5Var28, j5Var29, j5Var30, j5Var31, j5Var32, j5Var33, j5Var34, j5Var35, j5Var36, j5Var37, j5Var38, j5Var39, j5Var40, j5Var41, j5Var42, j5Var43, j5Var44, j5Var45, j5Var46, j5Var47, j5Var48, j5Var49, new j5("GROUP_LIST", 49, 49, 2, x5Var7), new j5("MAP", 50, 50, 4, x5.f4045a)};
        j5[] values = values();
        m = new j5[values.length];
        for (j5 j5Var50 : values) {
            m[j5Var50.f3821a] = j5Var50;
        }
    }

    public j5(String str, int i, int i3, int i8, x5 x5Var) {
        this.f3821a = i3;
        int i10 = i8 - 1;
        if (i10 != 1) {
            if (i10 == 3) {
                x5Var.getClass();
            }
        } else {
            x5Var.getClass();
        }
        if (i8 == 1) {
            x5 x5Var2 = x5.f4045a;
            x5Var.ordinal();
        }
    }

    public static j5[] values() {
        return (j5[]) f3820n.clone();
    }
}
