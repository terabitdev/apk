package io.elevenlabs.analytics;

import io.elevenlabs.analytics.AnalyticsModule;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.CertificateMismatchReporter;
import io.elevenlabs.domain.services.FeatureFlagService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/analytics/AnalyticsModule;", "", "bindPostHogAnalytics", "Lio/elevenlabs/domain/Analytics;", "impl", "Lio/elevenlabs/analytics/PostHogAnalytics;", "bindFeatureFlagService", "Lio/elevenlabs/domain/services/FeatureFlagService;", "Lio/elevenlabs/analytics/PostHogFeatureFlagService;", "Companion", "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AnalyticsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/analytics/AnalyticsModule$Companion;", "", "<init>", "()V", "Ljl/a;", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/CertificateMismatchReporter;", "provideCertificateMismatchReporter", "(Ljl/a;)Lio/elevenlabs/domain/CertificateMismatchReporter;", "analytics_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void provideCertificateMismatchReporter$lambda$0(jl.a aVar, String str, String str2) {
            str.getClass();
            str2.getClass();
            ((Analytics) aVar.get()).log(new Analytics.Event.CertificateHashMismatch(str, str2));
        }

        public final CertificateMismatchReporter provideCertificateMismatchReporter(final jl.a analytics) {
            analytics.getClass();
            return new CertificateMismatchReporter() { // from class: io.elevenlabs.analytics.a
                @Override // io.elevenlabs.domain.CertificateMismatchReporter
                public final void report(String str, String str2) {
                    AnalyticsModule.Companion.provideCertificateMismatchReporter$lambda$0(jl.a.this, str, str2);
                }
            };
        }
    }

    FeatureFlagService bindFeatureFlagService(PostHogFeatureFlagService impl);

    Analytics bindPostHogAnalytics(PostHogAnalytics impl);
}
