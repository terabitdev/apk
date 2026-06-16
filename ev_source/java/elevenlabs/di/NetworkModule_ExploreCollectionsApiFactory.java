package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ExploreCollectionsAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ExploreCollectionsApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ExploreCollectionsApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ExploreCollectionsApiFactory create(f fVar) {
        return new NetworkModule_ExploreCollectionsApiFactory(fVar);
    }

    public static ExploreCollectionsAPI exploreCollectionsApi(s0 s0Var) {
        ExploreCollectionsAPI exploreCollectionsApi = NetworkModule.INSTANCE.exploreCollectionsApi(s0Var);
        m0.n(exploreCollectionsApi);
        return exploreCollectionsApi;
    }

    @Override // rn.a
    public ExploreCollectionsAPI get() {
        return exploreCollectionsApi((s0) this.retrofitProvider.get());
    }
}
