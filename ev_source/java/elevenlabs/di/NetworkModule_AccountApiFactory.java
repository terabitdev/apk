package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.AccountAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_AccountApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_AccountApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static AccountAPI accountApi(s0 s0Var) {
        AccountAPI accountApi = NetworkModule.INSTANCE.accountApi(s0Var);
        m0.n(accountApi);
        return accountApi;
    }

    public static NetworkModule_AccountApiFactory create(f fVar) {
        return new NetworkModule_AccountApiFactory(fVar);
    }

    @Override // rn.a
    public AccountAPI get() {
        return accountApi((s0) this.retrofitProvider.get());
    }
}
