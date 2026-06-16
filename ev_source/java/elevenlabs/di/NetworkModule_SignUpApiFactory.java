package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.SignUpAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_SignUpApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_SignUpApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_SignUpApiFactory create(f fVar) {
        return new NetworkModule_SignUpApiFactory(fVar);
    }

    public static SignUpAPI signUpApi(s0 s0Var) {
        SignUpAPI signUpApi = NetworkModule.INSTANCE.signUpApi(s0Var);
        m0.n(signUpApi);
        return signUpApi;
    }

    @Override // rn.a
    public SignUpAPI get() {
        return signUpApi((s0) this.retrofitProvider.get());
    }
}
