package io.elevenlabs.player.di;

import androidx.room.m0;
import io.elevenlabs.player.drm.AxinomDrmProvider;
import j8.s;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PlayerServiceModule_ProvideDrmSessionManagerProviderFactory implements c {
    private final f axinomDrmProvider;

    private PlayerServiceModule_ProvideDrmSessionManagerProviderFactory(f fVar) {
        this.axinomDrmProvider = fVar;
    }

    public static PlayerServiceModule_ProvideDrmSessionManagerProviderFactory create(f fVar) {
        return new PlayerServiceModule_ProvideDrmSessionManagerProviderFactory(fVar);
    }

    public static s provideDrmSessionManagerProvider(AxinomDrmProvider axinomDrmProvider) {
        s provideDrmSessionManagerProvider = PlayerServiceModule.INSTANCE.provideDrmSessionManagerProvider(axinomDrmProvider);
        m0.n(provideDrmSessionManagerProvider);
        return provideDrmSessionManagerProvider;
    }

    @Override // rn.a
    public s get() {
        return provideDrmSessionManagerProvider((AxinomDrmProvider) this.axinomDrmProvider.get());
    }
}
