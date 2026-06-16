package io.elevenlabs.domain.usecase;

import io.elevenlabs.domain.services.FeatureFlagService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class IsAudioBookmarksAllowedUseCase_Factory implements c {
    private final f featureFlagServiceProvider;

    private IsAudioBookmarksAllowedUseCase_Factory(f fVar) {
        this.featureFlagServiceProvider = fVar;
    }

    public static IsAudioBookmarksAllowedUseCase_Factory create(f fVar) {
        return new IsAudioBookmarksAllowedUseCase_Factory(fVar);
    }

    public static IsAudioBookmarksAllowedUseCase newInstance(FeatureFlagService featureFlagService) {
        return new IsAudioBookmarksAllowedUseCase(featureFlagService);
    }

    @Override // rn.a
    public IsAudioBookmarksAllowedUseCase get() {
        return newInstance((FeatureFlagService) this.featureFlagServiceProvider.get());
    }
}
