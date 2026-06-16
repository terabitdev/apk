package io.elevenlabs.domain.usecase;

import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.services.FeatureFlagService;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/usecase/IsAudioBookmarksAllowedUseCase;", "", "Lio/elevenlabs/domain/services/FeatureFlagService;", "featureFlagService", "<init>", "(Lio/elevenlabs/domain/services/FeatureFlagService;)V", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "", "invoke", "(Lio/elevenlabs/domain/model/ReadMeta;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/FeatureFlagService;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class IsAudioBookmarksAllowedUseCase {
    private final FeatureFlagService featureFlagService;

    public IsAudioBookmarksAllowedUseCase(FeatureFlagService featureFlagService) {
        featureFlagService.getClass();
        this.featureFlagService = featureFlagService;
    }

    public final Object invoke(ReadMeta readMeta, c<? super Boolean> cVar) {
        if (!ReadMetaKt.isMediaType(readMeta)) {
            return Boolean.TRUE;
        }
        return r.u(FeatureFlagService.isFlagEnabled$default(this.featureFlagService, FeatureFlagService.Flag.AUDIO_BOOKMARKS_ENABLED, false, false, 6, null), cVar);
    }
}
