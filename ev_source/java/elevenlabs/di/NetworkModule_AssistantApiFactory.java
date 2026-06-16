package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.AssistantAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_AssistantApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_AssistantApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static AssistantAPI assistantApi(s0 s0Var) {
        AssistantAPI assistantApi = NetworkModule.INSTANCE.assistantApi(s0Var);
        m0.n(assistantApi);
        return assistantApi;
    }

    public static NetworkModule_AssistantApiFactory create(f fVar) {
        return new NetworkModule_AssistantApiFactory(fVar);
    }

    @Override // rn.a
    public AssistantAPI get() {
        return assistantApi((s0) this.retrofitProvider.get());
    }
}
