package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class i8 {

    /* renamed from: a, reason: collision with root package name */
    public static final o4 f3808a;

    /* renamed from: b, reason: collision with root package name */
    public static final o4 f3809b;

    /* renamed from: c, reason: collision with root package name */
    public static final o4 f3810c;

    /* renamed from: d, reason: collision with root package name */
    public static final o4 f3811d;

    /* renamed from: e, reason: collision with root package name */
    public static final o4 f3812e;

    /* renamed from: f, reason: collision with root package name */
    public static final o4 f3813f;

    static {
        p4 p4Var = new p4(n4.a(), true, true);
        f3808a = p4Var.l("measurement.test.boolean_flag", false);
        f3809b = p4Var.k(-1L, "measurement.test.cached_long_flag");
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = o4.g;
        f3810c = new o4(p4Var, "measurement.test.double_flag", valueOf, 2);
        f3811d = p4Var.k(-2L, "measurement.test.int_flag");
        f3812e = p4Var.k(-1L, "measurement.test.long_flag");
        f3813f = p4Var.m("measurement.test.string_flag", "---");
    }
}
