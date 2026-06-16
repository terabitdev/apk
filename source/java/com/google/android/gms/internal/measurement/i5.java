package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class i5 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3804c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final s6 f3805a = new s6();

    /* renamed from: b, reason: collision with root package name */
    public boolean f3806b;

    static {
        new i5(0);
    }

    public i5(int i) {
        a();
        a();
    }

    public static void b(d5 d5Var, d7 d7Var, int i, Object obj) {
        if (d7Var != d7.m) {
            d5Var.c(i, d7Var.f3746b);
            e7 e7Var = e7.f3760a;
            switch (d7Var.ordinal()) {
                case 0:
                    d5Var.p(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    d5Var.n(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    d5Var.o(((Long) obj).longValue());
                    return;
                case 3:
                    d5Var.o(((Long) obj).longValue());
                    return;
                case 4:
                    d5Var.l(((Integer) obj).intValue());
                    return;
                case 5:
                    d5Var.p(((Long) obj).longValue());
                    return;
                case 6:
                    d5Var.n(((Integer) obj).intValue());
                    return;
                case 7:
                    d5Var.k(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof c5) {
                        d5Var.j((c5) obj);
                        return;
                    } else {
                        d5Var.r((String) obj);
                        return;
                    }
                case 9:
                    ((o5) ((u4) obj)).d(d5Var);
                    return;
                case 10:
                    o5 o5Var = (o5) ((u4) obj);
                    d5Var.m(o5Var.j());
                    o5Var.d(d5Var);
                    return;
                case 11:
                    if (obj instanceof c5) {
                        d5Var.j((c5) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    d5Var.m(length);
                    d5Var.q(length, bArr);
                    return;
                case 12:
                    d5Var.m(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof q5) {
                        d5Var.l(((q5) obj).a());
                        return;
                    } else {
                        d5Var.l(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    d5Var.n(((Integer) obj).intValue());
                    return;
                case 15:
                    d5Var.p(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    d5Var.m((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    d5Var.o((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        Charset charset = u5.f3981a;
        d5Var.c(i, 3);
        ((o5) ((u4) obj)).d(d5Var);
        d5Var.c(i, 4);
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f3806b) {
            return;
        }
        s6 s6Var = this.f3805a;
        int i = s6Var.f3956b;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = s6Var.a(i3).f3974b;
            if (obj instanceof o5) {
                o5 o5Var = (o5) obj;
                n6.f3904c.a(o5Var.getClass()).g(o5Var);
                o5Var.f();
            }
        }
        Iterator it = s6Var.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof o5) {
                o5 o5Var2 = (o5) value;
                n6.f3904c.a(o5Var2.getClass()).g(o5Var2);
                o5Var2.f();
            }
        }
        if (!s6Var.m) {
            if (s6Var.f3956b <= 0) {
                Iterator it2 = s6Var.c().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    a8.c.i();
                    return;
                }
            } else {
                s6Var.a(0).f3973a.getClass();
                a8.c.i();
                return;
            }
        }
        if (!s6Var.m) {
            if (s6Var.l.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(s6Var.l);
            }
            s6Var.l = unmodifiableMap;
            if (s6Var.o.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(s6Var.o);
            }
            s6Var.o = unmodifiableMap2;
            s6Var.m = true;
        }
        this.f3806b = true;
    }

    public final Object clone() {
        i5 i5Var = new i5();
        s6 s6Var = this.f3805a;
        if (s6Var.f3956b <= 0) {
            Iterator it = s6Var.c().iterator();
            if (!it.hasNext()) {
                return i5Var;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                a8.c.i();
                return null;
            }
            entry.getValue();
            throw null;
        }
        s6Var.a(0).f3973a.getClass();
        a8.c.i();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        return this.f3805a.equals(((i5) obj).f3805a);
    }

    public final int hashCode() {
        return this.f3805a.hashCode();
    }

    public i5() {
    }
}
