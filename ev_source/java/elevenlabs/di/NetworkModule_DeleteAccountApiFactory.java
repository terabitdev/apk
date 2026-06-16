package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.DeleteAccountAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_DeleteAccountApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_DeleteAccountApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_DeleteAccountApiFactory create(f fVar) {
        return new NetworkModule_DeleteAccountApiFactory(fVar);
    }

    public static DeleteAccountAPI deleteAccountApi(s0 s0Var) {
        DeleteAccountAPI deleteAccountApi = NetworkModule.INSTANCE.deleteAccountApi(s0Var);
        m0.n(deleteAccountApi);
        return deleteAccountApi;
    }

    @Override // rn.a
    public DeleteAccountAPI get() {
        return deleteAccountApi((s0) this.retrofitProvider.get());
    }
}
