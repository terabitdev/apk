package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.RecentVoicesApi;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_RecentVoicesApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_RecentVoicesApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_RecentVoicesApiFactory create(f fVar) {
        return new NetworkModule_RecentVoicesApiFactory(fVar);
    }

    public static RecentVoicesApi recentVoicesApi(s0 s0Var) {
        RecentVoicesApi recentVoicesApi = NetworkModule.INSTANCE.recentVoicesApi(s0Var);
        m0.n(recentVoicesApi);
        return recentVoicesApi;
    }

    @Override // rn.a
    public RecentVoicesApi get() {
        return recentVoicesApi((s0) this.retrofitProvider.get());
    }
}
