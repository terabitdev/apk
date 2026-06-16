package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class o7 {

    /* renamed from: a, reason: collision with root package name */
    public static final o4 f3922a;

    /* renamed from: b, reason: collision with root package name */
    public static final o4 f3923b;

    static {
        p4 p4Var = new p4(n4.a(), true, true);
        p4Var.l("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        p4Var.l("measurement.set_default_event_parameters_with_backfill.service", true);
        p4Var.k(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        f3922a = p4Var.l("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f3923b = p4Var.l("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        p4Var.l("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
