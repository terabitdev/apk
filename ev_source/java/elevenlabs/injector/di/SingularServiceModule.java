package io.elevenlabs.injector.di;

import io.elevenlabs.analytics.SingularServiceImpl;
import io.elevenlabs.domain.services.SingularService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/injector/di/SingularServiceModule;", "", "bindSingularService", "Lio/elevenlabs/domain/services/SingularService;", "impl", "Lio/elevenlabs/analytics/SingularServiceImpl;", "injector_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface SingularServiceModule {
    SingularService bindSingularService(SingularServiceImpl impl);
}
