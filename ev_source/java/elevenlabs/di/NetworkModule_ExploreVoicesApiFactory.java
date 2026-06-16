package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ExploreVoicesApi;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ExploreVoicesApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ExploreVoicesApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ExploreVoicesApiFactory create(f fVar) {
        return new NetworkModule_ExploreVoicesApiFactory(fVar);
    }

    public static ExploreVoicesApi exploreVoicesApi(s0 s0Var) {
        ExploreVoicesApi exploreVoicesApi = NetworkModule.INSTANCE.exploreVoicesApi(s0Var);
        m0.n(exploreVoicesApi);
        return exploreVoicesApi;
    }

    @Override // rn.a
    public ExploreVoicesApi get() {
        return exploreVoicesApi((s0) this.retrofitProvider.get());
    }
}
