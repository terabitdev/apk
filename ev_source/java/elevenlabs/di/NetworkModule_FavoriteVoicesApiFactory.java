package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.FavoriteVoicesApi;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_FavoriteVoicesApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_FavoriteVoicesApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_FavoriteVoicesApiFactory create(f fVar) {
        return new NetworkModule_FavoriteVoicesApiFactory(fVar);
    }

    public static FavoriteVoicesApi favoriteVoicesApi(s0 s0Var) {
        FavoriteVoicesApi favoriteVoicesApi = NetworkModule.INSTANCE.favoriteVoicesApi(s0Var);
        m0.n(favoriteVoicesApi);
        return favoriteVoicesApi;
    }

    @Override // rn.a
    public FavoriteVoicesApi get() {
        return favoriteVoicesApi((s0) this.retrofitProvider.get());
    }
}
