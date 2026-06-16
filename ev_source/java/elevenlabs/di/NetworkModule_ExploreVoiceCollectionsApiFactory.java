package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ExploreVoiceCollectionsApi;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ExploreVoiceCollectionsApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ExploreVoiceCollectionsApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ExploreVoiceCollectionsApiFactory create(f fVar) {
        return new NetworkModule_ExploreVoiceCollectionsApiFactory(fVar);
    }

    public static ExploreVoiceCollectionsApi exploreVoiceCollectionsApi(s0 s0Var) {
        ExploreVoiceCollectionsApi exploreVoiceCollectionsApi = NetworkModule.INSTANCE.exploreVoiceCollectionsApi(s0Var);
        m0.n(exploreVoiceCollectionsApi);
        return exploreVoiceCollectionsApi;
    }

    @Override // rn.a
    public ExploreVoiceCollectionsApi get() {
        return exploreVoiceCollectionsApi((s0) this.retrofitProvider.get());
    }
}
