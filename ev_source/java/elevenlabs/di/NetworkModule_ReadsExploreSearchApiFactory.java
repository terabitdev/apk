package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ReadsExploreSearchAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ReadsExploreSearchApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ReadsExploreSearchApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ReadsExploreSearchApiFactory create(f fVar) {
        return new NetworkModule_ReadsExploreSearchApiFactory(fVar);
    }

    public static ReadsExploreSearchAPI readsExploreSearchApi(s0 s0Var) {
        ReadsExploreSearchAPI readsExploreSearchApi = NetworkModule.INSTANCE.readsExploreSearchApi(s0Var);
        m0.n(readsExploreSearchApi);
        return readsExploreSearchApi;
    }

    @Override // rn.a
    public ReadsExploreSearchAPI get() {
        return readsExploreSearchApi((s0) this.retrofitProvider.get());
    }
}
