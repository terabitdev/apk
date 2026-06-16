package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.CommunityVoicesApi;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_CommunityVoicesApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_CommunityVoicesApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static CommunityVoicesApi communityVoicesApi(s0 s0Var) {
        CommunityVoicesApi communityVoicesApi = NetworkModule.INSTANCE.communityVoicesApi(s0Var);
        m0.n(communityVoicesApi);
        return communityVoicesApi;
    }

    public static NetworkModule_CommunityVoicesApiFactory create(f fVar) {
        return new NetworkModule_CommunityVoicesApiFactory(fVar);
    }

    @Override // rn.a
    public CommunityVoicesApi get() {
        return communityVoicesApi((s0) this.retrofitProvider.get());
    }
}
