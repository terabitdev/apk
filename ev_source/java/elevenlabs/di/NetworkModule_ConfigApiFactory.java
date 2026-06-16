package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ConfigAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ConfigApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ConfigApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static ConfigAPI configApi(s0 s0Var) {
        ConfigAPI configApi = NetworkModule.INSTANCE.configApi(s0Var);
        m0.n(configApi);
        return configApi;
    }

    public static NetworkModule_ConfigApiFactory create(f fVar) {
        return new NetworkModule_ConfigApiFactory(fVar);
    }

    @Override // rn.a
    public ConfigAPI get() {
        return configApi((s0) this.retrofitProvider.get());
    }
}
