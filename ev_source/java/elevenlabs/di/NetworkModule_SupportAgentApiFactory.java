package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.SupportAgentAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_SupportAgentApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_SupportAgentApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_SupportAgentApiFactory create(f fVar) {
        return new NetworkModule_SupportAgentApiFactory(fVar);
    }

    public static SupportAgentAPI supportAgentApi(s0 s0Var) {
        SupportAgentAPI supportAgentApi = NetworkModule.INSTANCE.supportAgentApi(s0Var);
        m0.n(supportAgentApi);
        return supportAgentApi;
    }

    @Override // rn.a
    public SupportAgentAPI get() {
        return supportAgentApi((s0) this.retrofitProvider.get());
    }
}
