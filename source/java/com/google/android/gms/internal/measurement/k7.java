package com.google.android.gms.internal.measurement;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.WorkRequest;
import androidx.work.multiprocess.RemoteWorkManager;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class k7 {
    public static final o4 A;
    public static final o4 B;
    public static final o4 C;
    public static final o4 D;
    public static final o4 E;
    public static final o4 F;
    public static final o4 G;
    public static final o4 H;
    public static final o4 I;
    public static final o4 J;
    public static final o4 K;
    public static final o4 L;
    public static final o4 M;
    public static final o4 N;
    public static final o4 O;
    public static final o4 P;
    public static final o4 Q;
    public static final o4 R;
    public static final o4 S;
    public static final o4 T;
    public static final o4 U;
    public static final o4 V;
    public static final o4 W;
    public static final o4 X;
    public static final o4 Y;
    public static final o4 Z;

    /* renamed from: a, reason: collision with root package name */
    public static final o4 f3838a;

    /* renamed from: a0, reason: collision with root package name */
    public static final o4 f3839a0;

    /* renamed from: b, reason: collision with root package name */
    public static final o4 f3840b;

    /* renamed from: b0, reason: collision with root package name */
    public static final o4 f3841b0;

    /* renamed from: c, reason: collision with root package name */
    public static final o4 f3842c;

    /* renamed from: c0, reason: collision with root package name */
    public static final o4 f3843c0;

    /* renamed from: d, reason: collision with root package name */
    public static final o4 f3844d;

    /* renamed from: d0, reason: collision with root package name */
    public static final o4 f3845d0;

    /* renamed from: e, reason: collision with root package name */
    public static final o4 f3846e;

    /* renamed from: e0, reason: collision with root package name */
    public static final o4 f3847e0;

    /* renamed from: f, reason: collision with root package name */
    public static final o4 f3848f;

    /* renamed from: f0, reason: collision with root package name */
    public static final o4 f3849f0;
    public static final o4 g;

    /* renamed from: g0, reason: collision with root package name */
    public static final o4 f3850g0;
    public static final o4 h;
    public static final o4 h0;
    public static final o4 i;

    /* renamed from: i0, reason: collision with root package name */
    public static final o4 f3851i0;
    public static final o4 j;

    /* renamed from: j0, reason: collision with root package name */
    public static final o4 f3852j0;

    /* renamed from: k, reason: collision with root package name */
    public static final o4 f3853k;

    /* renamed from: k0, reason: collision with root package name */
    public static final o4 f3854k0;
    public static final o4 l;

    /* renamed from: l0, reason: collision with root package name */
    public static final o4 f3855l0;
    public static final o4 m;
    public static final o4 m0;

    /* renamed from: n, reason: collision with root package name */
    public static final o4 f3856n;

    /* renamed from: n0, reason: collision with root package name */
    public static final o4 f3857n0;
    public static final o4 o;

    /* renamed from: o0, reason: collision with root package name */
    public static final o4 f3858o0;
    public static final o4 p;

    /* renamed from: p0, reason: collision with root package name */
    public static final o4 f3859p0;
    public static final o4 q;

    /* renamed from: q0, reason: collision with root package name */
    public static final o4 f3860q0;
    public static final o4 r;

    /* renamed from: r0, reason: collision with root package name */
    public static final o4 f3861r0;
    public static final o4 s;

    /* renamed from: s0, reason: collision with root package name */
    public static final o4 f3862s0;
    public static final o4 t;

    /* renamed from: t0, reason: collision with root package name */
    public static final o4 f3863t0;
    public static final o4 u;

    /* renamed from: u0, reason: collision with root package name */
    public static final o4 f3864u0;
    public static final o4 v;

    /* renamed from: v0, reason: collision with root package name */
    public static final o4 f3865v0;

    /* renamed from: w, reason: collision with root package name */
    public static final o4 f3866w;

    /* renamed from: w0, reason: collision with root package name */
    public static final o4 f3867w0;

    /* renamed from: x, reason: collision with root package name */
    public static final o4 f3868x;

    /* renamed from: y, reason: collision with root package name */
    public static final o4 f3869y;

    /* renamed from: z, reason: collision with root package name */
    public static final o4 f3870z;

    static {
        p4 p4Var = new p4(n4.a(), true, true);
        f3838a = p4Var.k(WorkRequest.MIN_BACKOFF_MILLIS, "measurement.ad_id_cache_time");
        f3840b = p4Var.k(3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time");
        f3842c = p4Var.l("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        f3844d = p4Var.k(100L, "measurement.max_bundles_per_iteration");
        f3846e = p4Var.m("measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid");
        f3848f = p4Var.k(CalendarModelKt.MillisecondsIn24Hours, "measurement.config.cache_time");
        p4Var.m("measurement.log_tag", "FA");
        g = p4Var.m("measurement.config.url_authority", "app-measurement.com");
        h = p4Var.m("measurement.config.url_scheme", "https");
        i = p4Var.k(1000L, "measurement.upload.debug_upload_interval");
        p4Var.l("measurement.config.default_flag_values", true);
        j = p4Var.k(3600000L, "measurement.session.engagement_interval");
        f3853k = p4Var.m("measurement.rb.attribution.event_params", "value|currency");
        l = p4Var.m("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp");
        m = p4Var.k(605000L, "measurement.upload.google_signal_max_queue_time");
        f3856n = p4Var.m("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        p4Var.k(0L, "measurement.id.upload.max_conversions_per_day");
        o = p4Var.k(4L, "measurement.lifetimevalue.max_currency_tracked");
        p = p4Var.k(1L, "measurement.dma_consent.max_daily_dcu_realtime_events");
        q = p4Var.k(500L, "measurement.upload.max_event_parameter_value_length");
        r = p4Var.k(100000L, "measurement.store.max_stored_events_per_app");
        s = p4Var.k(50L, "measurement.experiment.max_ids");
        t = p4Var.k(200L, "measurement.audience.filter_result_max_count");
        u = p4Var.k(27L, "measurement.upload.max_item_scoped_custom_parameters");
        v = p4Var.k(1000L, "measurement.rb.max_trigger_registrations_per_day");
        f3866w = p4Var.k(0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once");
        f3868x = p4Var.k(7L, "measurement.rb.attribution.client.min_ad_services_version");
        f3869y = p4Var.k(60000L, "measurement.alarm_manager.minimum_interval");
        f3870z = p4Var.k(500L, "measurement.upload.minimum_delay");
        A = p4Var.k(CalendarModelKt.MillisecondsIn24Hours, "measurement.monitoring.sample_period_millis");
        B = p4Var.k(3000L, "measurement.rb.attribution.notify_app_delay_millis");
        C = p4Var.l("measurement.config.notify_trigger_uris_on_backgrounded", true);
        D = p4Var.m("measurement.rb.attribution.app_allowlist", "");
        E = p4Var.k(WorkRequest.MIN_BACKOFF_MILLIS, "measurement.upload.realtime_upload_interval");
        F = p4Var.k(604800000L, "measurement.upload.refresh_blacklisted_config_interval");
        p4Var.k(3600000L, "measurement.config.cache_time.service");
        G = p4Var.k(CoroutineLiveDataKt.DEFAULT_TIMEOUT, "measurement.service_client.idle_disconnect_millis");
        p4Var.m("measurement.log_tag.service", "FA-SVC");
        H = p4Var.k(1000L, "measurement.service_client.reconnect_millis");
        p4Var.m("measurement.sgtm.app_allowlist", "*");
        I = p4Var.k(240000L, "measurement.sgtm.batch.long_queuing_threshold");
        J = p4Var.k(1800000L, "measurement.sgtm.batch.retry_interval");
        K = p4Var.k(10L, "measurement.sgtm.batch.retry_max_count");
        L = p4Var.k(21600000L, "measurement.sgtm.batch.retry_max_wait");
        M = p4Var.m("measurement.sgtm.service_upload_apps_list", "");
        N = p4Var.m("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504");
        O = p4Var.k(5L, "measurement.sgtm.upload.batches_retrieval_limit");
        P = p4Var.k(CoroutineLiveDataKt.DEFAULT_TIMEOUT, "measurement.sgtm.upload.max_queued_batches");
        Q = p4Var.k(RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS, "measurement.sgtm.upload.min_delay_after_background");
        R = p4Var.k(1000L, "measurement.sgtm.upload.min_delay_after_broadcast");
        S = p4Var.k(CoroutineLiveDataKt.DEFAULT_TIMEOUT, "measurement.sgtm.upload.min_delay_after_startup");
        T = p4Var.k(RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS, "measurement.sgtm.upload.retry_interval");
        U = p4Var.k(21600000L, "measurement.sgtm.upload.retry_max_wait");
        V = p4Var.k(CalendarModelKt.MillisecondsIn24Hours, "measurement.upload.stale_data_deletion_interval");
        W = p4Var.k(16L, "measurement.rb.attribution.max_retry_delay_seconds");
        X = p4Var.k(90L, "measurement.rb.attribution.client.min_time_after_boot_seconds");
        Y = p4Var.m("measurement.rb.attribution.uri_authority", "google-analytics.com");
        Z = p4Var.k(864000000L, "measurement.rb.attribution.max_queue_time");
        f3839a0 = p4Var.m("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        f3841b0 = p4Var.m("measurement.rb.attribution.query_parameters_to_remove", "");
        f3843c0 = p4Var.m("measurement.rb.attribution.uri_scheme", "https");
        f3845d0 = p4Var.k(604800000L, "measurement.sdk.attribution.cache.ttl");
        f3847e0 = p4Var.k(7200000L, "measurement.redaction.app_instance_id.ttl");
        f3849f0 = p4Var.k(43200000L, "measurement.upload.backoff_period");
        f3850g0 = p4Var.k(15000L, "measurement.upload.initial_upload_delay_time");
        h0 = p4Var.k(3600000L, "measurement.upload.interval");
        f3851i0 = p4Var.k(65536L, "measurement.upload.max_bundle_size");
        f3852j0 = p4Var.k(100L, "measurement.upload.max_bundles");
        f3854k0 = p4Var.k(500L, "measurement.upload.max_conversions_per_day");
        f3855l0 = p4Var.k(1000L, "measurement.upload.max_error_events_per_day");
        m0 = p4Var.k(1000L, "measurement.upload.max_events_per_bundle");
        f3857n0 = p4Var.k(100000L, "measurement.upload.max_events_per_day");
        f3858o0 = p4Var.k(50000L, "measurement.upload.max_public_events_per_day");
        f3859p0 = p4Var.k(518400000L, "measurement.upload.max_queue_time");
        f3860q0 = p4Var.k(10L, "measurement.upload.max_realtime_events_per_day");
        f3861r0 = p4Var.k(65536L, "measurement.upload.max_batch_size");
        f3862s0 = p4Var.k(6L, "measurement.upload.retry_count");
        f3863t0 = p4Var.k(1800000L, "measurement.upload.retry_time");
        f3864u0 = p4Var.m("measurement.upload.url", "https://app-measurement.com/a");
        f3865v0 = p4Var.k(3600000L, "measurement.upload.window_interval");
        f3867w0 = p4Var.m("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }
}
