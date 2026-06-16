package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.GooglePlayAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_GooglePlayApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_GooglePlayApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_GooglePlayApiFactory create(f fVar) {
        return new NetworkModule_GooglePlayApiFactory(fVar);
    }

    public static GooglePlayAPI googlePlayApi(s0 s0Var) {
        GooglePlayAPI googlePlayApi = NetworkModule.INSTANCE.googlePlayApi(s0Var);
        m0.n(googlePlayApi);
        return googlePlayApi;
    }

    @Override // rn.a
    public GooglePlayAPI get() {
        return googlePlayApi((s0) this.retrofitProvider.get());
    }
}
