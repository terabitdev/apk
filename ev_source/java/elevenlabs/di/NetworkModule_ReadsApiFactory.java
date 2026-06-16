package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ReadsAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ReadsApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ReadsApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ReadsApiFactory create(f fVar) {
        return new NetworkModule_ReadsApiFactory(fVar);
    }

    public static ReadsAPI readsApi(s0 s0Var) {
        ReadsAPI readsApi = NetworkModule.INSTANCE.readsApi(s0Var);
        m0.n(readsApi);
        return readsApi;
    }

    @Override // rn.a
    public ReadsAPI get() {
        return readsApi((s0) this.retrofitProvider.get());
    }
}
