package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.HomeAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_HomeApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_HomeApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_HomeApiFactory create(f fVar) {
        return new NetworkModule_HomeApiFactory(fVar);
    }

    public static HomeAPI homeApi(s0 s0Var) {
        HomeAPI homeApi = NetworkModule.INSTANCE.homeApi(s0Var);
        m0.n(homeApi);
        return homeApi;
    }

    @Override // rn.a
    public HomeAPI get() {
        return homeApi((s0) this.retrofitProvider.get());
    }
}
