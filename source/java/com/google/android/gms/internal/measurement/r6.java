package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class r6 {

    /* renamed from: a, reason: collision with root package name */
    public static final m5 f3945a;

    static {
        n6 n6Var = n6.f3904c;
        f3945a = new m5(6);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void b(Object obj, Object obj2) {
        o5 o5Var = (o5) obj;
        v6 v6Var = o5Var.zzc;
        v6 v6Var2 = ((o5) obj2).zzc;
        v6 v6Var3 = v6.f3995f;
        if (!v6Var3.equals(v6Var2)) {
            if (v6Var3.equals(v6Var)) {
                int i = v6Var.f3996a + v6Var2.f3996a;
                int[] copyOf = Arrays.copyOf(v6Var.f3997b, i);
                System.arraycopy(v6Var2.f3997b, 0, copyOf, v6Var.f3996a, v6Var2.f3996a);
                Object[] copyOf2 = Arrays.copyOf(v6Var.f3998c, i);
                System.arraycopy(v6Var2.f3998c, 0, copyOf2, v6Var.f3996a, v6Var2.f3996a);
                v6Var = new v6(i, copyOf, copyOf2, true);
            } else {
                v6Var.getClass();
                if (!v6Var2.equals(v6Var3)) {
                    if (v6Var.f4000e) {
                        int i3 = v6Var.f3996a + v6Var2.f3996a;
                        v6Var.e(i3);
                        System.arraycopy(v6Var2.f3997b, 0, v6Var.f3997b, v6Var.f3996a, v6Var2.f3996a);
                        System.arraycopy(v6Var2.f3998c, 0, v6Var.f3998c, v6Var.f3996a, v6Var2.f3996a);
                        v6Var.f3996a = i3;
                    } else {
                        androidx.compose.ui.graphics.f.i();
                        return;
                    }
                }
            }
        }
        o5Var.zzc = v6Var;
    }

    public static void c(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            if (!(list instanceof f5)) {
                int i3 = 0;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        ((Double) list.get(i10)).getClass();
                        i8 += 8;
                    }
                    d5Var.m(i8);
                    while (i3 < list.size()) {
                        d5Var.p(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    d5Var.h(i, Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
                    i3++;
                }
                return;
            }
            a8.c.i();
        }
    }

    public static void d(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            if (!(list instanceof k5)) {
                int i3 = 0;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        ((Float) list.get(i10)).getClass();
                        i8 += 4;
                    }
                    d5Var.m(i8);
                    while (i3 < list.size()) {
                        d5Var.n(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    d5Var.f(i, Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
                    i3++;
                }
                return;
            }
            a8.c.i();
        }
    }

    public static void e(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof b6) {
                b6 b6Var = (b6) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < b6Var.l; i10++) {
                        i8 += d5.a(b6Var.c(i10));
                    }
                    d5Var.m(i8);
                    while (i3 < b6Var.l) {
                        d5Var.o(b6Var.c(i3));
                        i3++;
                    }
                    return;
                }
                while (i3 < b6Var.l) {
                    d5Var.g(i, b6Var.c(i3));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += d5.a(((Long) list.get(i12)).longValue());
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    d5Var.o(((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                d5Var.g(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public static void f(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof b6) {
                b6 b6Var = (b6) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < b6Var.l; i10++) {
                        i8 += d5.a(b6Var.c(i10));
                    }
                    d5Var.m(i8);
                    while (i3 < b6Var.l) {
                        d5Var.o(b6Var.c(i3));
                        i3++;
                    }
                    return;
                }
                while (i3 < b6Var.l) {
                    d5Var.g(i, b6Var.c(i3));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += d5.a(((Long) list.get(i12)).longValue());
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    d5Var.o(((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                d5Var.g(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public static void g(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof b6) {
                b6 b6Var = (b6) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < b6Var.l; i10++) {
                        long c10 = b6Var.c(i10);
                        i8 += d5.a((c10 >> 63) ^ (c10 + c10));
                    }
                    d5Var.m(i8);
                    while (i3 < b6Var.l) {
                        long c11 = b6Var.c(i3);
                        d5Var.o((c11 >> 63) ^ (c11 + c11));
                        i3++;
                    }
                    return;
                }
                while (i3 < b6Var.l) {
                    long c12 = b6Var.c(i3);
                    d5Var.g(i, (c12 >> 63) ^ (c12 + c12));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    long longValue = ((Long) list.get(i12)).longValue();
                    i11 += d5.a((longValue >> 63) ^ (longValue + longValue));
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    long longValue2 = ((Long) list.get(i3)).longValue();
                    d5Var.o((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                long longValue3 = ((Long) list.get(i3)).longValue();
                d5Var.g(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i3++;
            }
        }
    }

    public static void h(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof b6) {
                b6 b6Var = (b6) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < b6Var.l; i10++) {
                        b6Var.c(i10);
                        i8 += 8;
                    }
                    d5Var.m(i8);
                    while (i3 < b6Var.l) {
                        d5Var.p(b6Var.c(i3));
                        i3++;
                    }
                    return;
                }
                while (i3 < b6Var.l) {
                    d5Var.h(i, b6Var.c(i3));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    i11 += 8;
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    d5Var.p(((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                d5Var.h(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public static void i(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof b6) {
                b6 b6Var = (b6) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < b6Var.l; i10++) {
                        b6Var.c(i10);
                        i8 += 8;
                    }
                    d5Var.m(i8);
                    while (i3 < b6Var.l) {
                        d5Var.p(b6Var.c(i3));
                        i3++;
                    }
                    return;
                }
                while (i3 < b6Var.l) {
                    d5Var.h(i, b6Var.c(i3));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Long) list.get(i12)).getClass();
                    i11 += 8;
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    d5Var.p(((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                d5Var.h(i, ((Long) list.get(i3)).longValue());
                i3++;
            }
        }
    }

    public static void j(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof p5) {
                p5 p5Var = (p5) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < p5Var.l; i10++) {
                        i8 += d5.a(p5Var.d(i10));
                    }
                    d5Var.m(i8);
                    while (i3 < p5Var.l) {
                        d5Var.l(p5Var.d(i3));
                        i3++;
                    }
                    return;
                }
                while (i3 < p5Var.l) {
                    d5Var.d(i, p5Var.d(i3));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += d5.a(((Integer) list.get(i12)).intValue());
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    d5Var.l(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                d5Var.d(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void k(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof p5) {
                p5 p5Var = (p5) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < p5Var.l; i10++) {
                        i8 += d5.s(p5Var.d(i10));
                    }
                    d5Var.m(i8);
                    while (i3 < p5Var.l) {
                        d5Var.m(p5Var.d(i3));
                        i3++;
                    }
                    return;
                }
                while (i3 < p5Var.l) {
                    d5Var.e(i, p5Var.d(i3));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += d5.s(((Integer) list.get(i12)).intValue());
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    d5Var.m(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                d5Var.e(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void l(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof p5) {
                p5 p5Var = (p5) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < p5Var.l; i10++) {
                        int d10 = p5Var.d(i10);
                        i8 += d5.s((d10 >> 31) ^ (d10 + d10));
                    }
                    d5Var.m(i8);
                    while (i3 < p5Var.l) {
                        int d11 = p5Var.d(i3);
                        d5Var.m((d11 >> 31) ^ (d11 + d11));
                        i3++;
                    }
                    return;
                }
                while (i3 < p5Var.l) {
                    int d12 = p5Var.d(i3);
                    d5Var.e(i, (d12 >> 31) ^ (d12 + d12));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    i11 += d5.s((intValue >> 31) ^ (intValue + intValue));
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    int intValue2 = ((Integer) list.get(i3)).intValue();
                    d5Var.m((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                int intValue3 = ((Integer) list.get(i3)).intValue();
                d5Var.e(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i3++;
            }
        }
    }

    public static void m(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof p5) {
                p5 p5Var = (p5) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < p5Var.l; i10++) {
                        p5Var.d(i10);
                        i8 += 4;
                    }
                    d5Var.m(i8);
                    while (i3 < p5Var.l) {
                        d5Var.n(p5Var.d(i3));
                        i3++;
                    }
                    return;
                }
                while (i3 < p5Var.l) {
                    d5Var.f(i, p5Var.d(i3));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    i11 += 4;
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    d5Var.n(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                d5Var.f(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void n(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof p5) {
                p5 p5Var = (p5) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < p5Var.l; i10++) {
                        p5Var.d(i10);
                        i8 += 4;
                    }
                    d5Var.m(i8);
                    while (i3 < p5Var.l) {
                        d5Var.n(p5Var.d(i3));
                        i3++;
                    }
                    return;
                }
                while (i3 < p5Var.l) {
                    d5Var.f(i, p5Var.d(i3));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    ((Integer) list.get(i12)).getClass();
                    i11 += 4;
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    d5Var.n(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                d5Var.f(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void o(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            int i3 = 0;
            if (list instanceof p5) {
                p5 p5Var = (p5) list;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < p5Var.l; i10++) {
                        i8 += d5.a(p5Var.d(i10));
                    }
                    d5Var.m(i8);
                    while (i3 < p5Var.l) {
                        d5Var.l(p5Var.d(i3));
                        i3++;
                    }
                    return;
                }
                while (i3 < p5Var.l) {
                    d5Var.d(i, p5Var.d(i3));
                    i3++;
                }
                return;
            }
            if (z10) {
                d5Var.c(i, 2);
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    i11 += d5.a(((Integer) list.get(i12)).intValue());
                }
                d5Var.m(i11);
                while (i3 < list.size()) {
                    d5Var.l(((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            while (i3 < list.size()) {
                d5Var.d(i, ((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
    }

    public static void p(int i, List list, c6 c6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            d5 d5Var = (d5) c6Var.f3726a;
            if (!(list instanceof y4)) {
                int i3 = 0;
                if (z10) {
                    d5Var.c(i, 2);
                    int i8 = 0;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        ((Boolean) list.get(i10)).getClass();
                        i8++;
                    }
                    d5Var.m(i8);
                    while (i3 < list.size()) {
                        d5Var.k(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    boolean booleanValue = ((Boolean) list.get(i3)).booleanValue();
                    d5Var.m(i << 3);
                    d5Var.k(booleanValue ? (byte) 1 : (byte) 0);
                    i3++;
                }
                return;
            }
            a8.c.i();
        }
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b6) {
            b6 b6Var = (b6) list;
            int i3 = 0;
            while (i < size) {
                i3 += d5.a(b6Var.c(i));
                i++;
            }
            return i3;
        }
        int i8 = 0;
        while (i < size) {
            i8 += d5.a(((Long) list.get(i)).longValue());
            i++;
        }
        return i8;
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b6) {
            b6 b6Var = (b6) list;
            int i3 = 0;
            while (i < size) {
                i3 += d5.a(b6Var.c(i));
                i++;
            }
            return i3;
        }
        int i8 = 0;
        while (i < size) {
            i8 += d5.a(((Long) list.get(i)).longValue());
            i++;
        }
        return i8;
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b6) {
            b6 b6Var = (b6) list;
            int i3 = 0;
            while (i < size) {
                long c10 = b6Var.c(i);
                i3 += d5.a((c10 >> 63) ^ (c10 + c10));
                i++;
            }
            return i3;
        }
        int i8 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i8 += d5.a((longValue >> 63) ^ (longValue + longValue));
            i++;
        }
        return i8;
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p5) {
            p5 p5Var = (p5) list;
            int i3 = 0;
            while (i < size) {
                i3 += d5.a(p5Var.d(i));
                i++;
            }
            return i3;
        }
        int i8 = 0;
        while (i < size) {
            i8 += d5.a(((Integer) list.get(i)).intValue());
            i++;
        }
        return i8;
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p5) {
            p5 p5Var = (p5) list;
            int i3 = 0;
            while (i < size) {
                i3 += d5.a(p5Var.d(i));
                i++;
            }
            return i3;
        }
        int i8 = 0;
        while (i < size) {
            i8 += d5.a(((Integer) list.get(i)).intValue());
            i++;
        }
        return i8;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p5) {
            p5 p5Var = (p5) list;
            int i3 = 0;
            while (i < size) {
                i3 += d5.s(p5Var.d(i));
                i++;
            }
            return i3;
        }
        int i8 = 0;
        while (i < size) {
            i8 += d5.s(((Integer) list.get(i)).intValue());
            i++;
        }
        return i8;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof p5) {
            p5 p5Var = (p5) list;
            int i3 = 0;
            while (i < size) {
                int d10 = p5Var.d(i);
                i3 += d5.s((d10 >> 31) ^ (d10 + d10));
                i++;
            }
            return i3;
        }
        int i8 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i8 += d5.s((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i8;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d5.s(i << 3) + 4) * size;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d5.s(i << 3) + 8) * size;
    }
}
