package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.VoicesAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_VoicesApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_VoicesApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_VoicesApiFactory create(f fVar) {
        return new NetworkModule_VoicesApiFactory(fVar);
    }

    public static VoicesAPI voicesApi(s0 s0Var) {
        VoicesAPI voicesApi = NetworkModule.INSTANCE.voicesApi(s0Var);
        m0.n(voicesApi);
        return voicesApi;
    }

    @Override // rn.a
    public VoicesAPI get() {
        return voicesApi((s0) this.retrofitProvider.get());
    }
}
