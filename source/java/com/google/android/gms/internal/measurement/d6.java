package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public final t f3743a;

    public d6(d7 d7Var, d7 d7Var2) {
        this.f3743a = new t(d7Var, d7Var2);
    }

    public static void a(d5 d5Var, t tVar, Object obj, Object obj2) {
        i5.b(d5Var, (d7) tVar.f3960a, 1, obj);
        i5.b(d5Var, (d7) tVar.f3961b, 2, obj2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0125. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(t tVar, Object obj, Object obj2) {
        int a10;
        int d10;
        int s;
        int d11;
        int s3;
        d7 d7Var = (d7) tVar.f3960a;
        d7 d7Var2 = (d7) tVar.f3961b;
        int i = i5.f3804c;
        int i3 = 8;
        int s10 = d5.s(8);
        d7 d7Var3 = d7.m;
        if (d7Var == d7Var3) {
            Charset charset = u5.f3981a;
            s10 += s10;
        }
        e7 e7Var = e7.f3760a;
        switch (d7Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                a10 = 8;
                int i8 = a10 + s10;
                int s11 = d5.s(16);
                if (d7Var2 == d7Var3) {
                    Charset charset2 = u5.f3981a;
                    s11 += s11;
                }
                switch (d7Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return i3 + s11 + i8;
                    case 1:
                        ((Float) obj2).getClass();
                        i3 = 4;
                        return i3 + s11 + i8;
                    case 2:
                        i3 = d5.a(((Long) obj2).longValue());
                        return i3 + s11 + i8;
                    case 3:
                        i3 = d5.a(((Long) obj2).longValue());
                        return i3 + s11 + i8;
                    case 4:
                        i3 = d5.a(((Integer) obj2).intValue());
                        return i3 + s11 + i8;
                    case 5:
                        ((Long) obj2).getClass();
                        return i3 + s11 + i8;
                    case 6:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        return i3 + s11 + i8;
                    case 7:
                        ((Boolean) obj2).getClass();
                        i3 = 1;
                        return i3 + s11 + i8;
                    case 8:
                        if (obj2 instanceof c5) {
                            d11 = ((c5) obj2).d();
                            s3 = d5.s(d11);
                            i3 = s3 + d11;
                            return i3 + s11 + i8;
                        }
                        i3 = d5.b((String) obj2);
                        return i3 + s11 + i8;
                    case 9:
                        i3 = ((o5) ((u4) obj2)).j();
                        return i3 + s11 + i8;
                    case 10:
                        d11 = ((o5) ((u4) obj2)).j();
                        s3 = d5.s(d11);
                        i3 = s3 + d11;
                        return i3 + s11 + i8;
                    case 11:
                        if (obj2 instanceof c5) {
                            d11 = ((c5) obj2).d();
                            s3 = d5.s(d11);
                        } else {
                            d11 = ((byte[]) obj2).length;
                            s3 = d5.s(d11);
                        }
                        i3 = s3 + d11;
                        return i3 + s11 + i8;
                    case 12:
                        i3 = d5.s(((Integer) obj2).intValue());
                        return i3 + s11 + i8;
                    case 13:
                        i3 = obj2 instanceof q5 ? d5.a(((q5) obj2).a()) : d5.a(((Integer) obj2).intValue());
                        return i3 + s11 + i8;
                    case 14:
                        ((Integer) obj2).getClass();
                        i3 = 4;
                        return i3 + s11 + i8;
                    case 15:
                        ((Long) obj2).getClass();
                        return i3 + s11 + i8;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i3 = d5.s((intValue >> 31) ^ (intValue + intValue));
                        return i3 + s11 + i8;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i3 = d5.a((longValue >> 63) ^ (longValue + longValue));
                        return i3 + s11 + i8;
                    default:
                        a8.c.m("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 1:
                ((Float) obj).getClass();
                a10 = 4;
                int i82 = a10 + s10;
                int s112 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 2:
                a10 = d5.a(((Long) obj).longValue());
                int i822 = a10 + s10;
                int s1122 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 3:
                a10 = d5.a(((Long) obj).longValue());
                int i8222 = a10 + s10;
                int s11222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 4:
                a10 = d5.a(((Integer) obj).intValue());
                int i82222 = a10 + s10;
                int s112222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                a10 = 8;
                int i822222 = a10 + s10;
                int s1122222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                a10 = 4;
                int i8222222 = a10 + s10;
                int s11222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                a10 = 1;
                int i82222222 = a10 + s10;
                int s112222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 8:
                if (obj instanceof c5) {
                    d10 = ((c5) obj).d();
                    s = d5.s(d10);
                    a10 = d10 + s;
                    int i822222222 = a10 + s10;
                    int s1122222222 = d5.s(16);
                    if (d7Var2 == d7Var3) {
                    }
                    switch (d7Var2.ordinal()) {
                    }
                } else {
                    a10 = d5.b((String) obj);
                    int i8222222222 = a10 + s10;
                    int s11222222222 = d5.s(16);
                    if (d7Var2 == d7Var3) {
                    }
                    switch (d7Var2.ordinal()) {
                    }
                }
            case 9:
                a10 = ((o5) ((u4) obj)).j();
                int i82222222222 = a10 + s10;
                int s112222222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 10:
                d10 = ((o5) ((u4) obj)).j();
                s = d5.s(d10);
                a10 = d10 + s;
                int i822222222222 = a10 + s10;
                int s1122222222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 11:
                if (obj instanceof c5) {
                    d10 = ((c5) obj).d();
                    s = d5.s(d10);
                } else {
                    d10 = ((byte[]) obj).length;
                    s = d5.s(d10);
                }
                a10 = d10 + s;
                int i8222222222222 = a10 + s10;
                int s11222222222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 12:
                a10 = d5.s(((Integer) obj).intValue());
                int i82222222222222 = a10 + s10;
                int s112222222222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 13:
                if (obj instanceof q5) {
                    a10 = d5.a(((q5) obj).a());
                } else {
                    a10 = d5.a(((Integer) obj).intValue());
                }
                int i822222222222222 = a10 + s10;
                int s1122222222222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                a10 = 4;
                int i8222222222222222 = a10 + s10;
                int s11222222222222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                a10 = 8;
                int i82222222222222222 = a10 + s10;
                int s112222222222222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                a10 = d5.s((intValue2 >> 31) ^ (intValue2 + intValue2));
                int i822222222222222222 = a10 + s10;
                int s1122222222222222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                a10 = d5.a((longValue2 >> 63) ^ (longValue2 + longValue2));
                int i8222222222222222222 = a10 + s10;
                int s11222222222222222222 = d5.s(16);
                if (d7Var2 == d7Var3) {
                }
                switch (d7Var2.ordinal()) {
                }
            default:
                a8.c.m("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }
}
