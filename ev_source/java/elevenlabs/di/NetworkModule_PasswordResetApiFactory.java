package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.PasswordResetAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_PasswordResetApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_PasswordResetApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_PasswordResetApiFactory create(f fVar) {
        return new NetworkModule_PasswordResetApiFactory(fVar);
    }

    public static PasswordResetAPI passwordResetApi(s0 s0Var) {
        PasswordResetAPI passwordResetApi = NetworkModule.INSTANCE.passwordResetApi(s0Var);
        m0.n(passwordResetApi);
        return passwordResetApi;
    }

    @Override // rn.a
    public PasswordResetAPI get() {
        return passwordResetApi((s0) this.retrofitProvider.get());
    }
}
