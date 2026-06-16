package io.elevenlabs.analytics;

import androidx.room.m0;
import io.elevenlabs.domain.CertificateMismatchReporter;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AnalyticsModule_Companion_ProvideCertificateMismatchReporterFactory implements c {
    private final f analyticsProvider;

    private AnalyticsModule_Companion_ProvideCertificateMismatchReporterFactory(f fVar) {
        this.analyticsProvider = fVar;
    }

    public static AnalyticsModule_Companion_ProvideCertificateMismatchReporterFactory create(f fVar) {
        return new AnalyticsModule_Companion_ProvideCertificateMismatchReporterFactory(fVar);
    }

    public static CertificateMismatchReporter provideCertificateMismatchReporter(jl.a aVar) {
        CertificateMismatchReporter provideCertificateMismatchReporter = AnalyticsModule.INSTANCE.provideCertificateMismatchReporter(aVar);
        m0.n(provideCertificateMismatchReporter);
        return provideCertificateMismatchReporter;
    }

    @Override // rn.a
    public CertificateMismatchReporter get() {
        return provideCertificateMismatchReporter(ul.b.a(this.analyticsProvider));
    }
}
