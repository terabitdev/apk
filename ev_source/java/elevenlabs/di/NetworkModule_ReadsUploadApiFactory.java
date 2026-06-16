package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ReadsUploadAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ReadsUploadApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ReadsUploadApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ReadsUploadApiFactory create(f fVar) {
        return new NetworkModule_ReadsUploadApiFactory(fVar);
    }

    public static ReadsUploadAPI readsUploadApi(s0 s0Var) {
        ReadsUploadAPI readsUploadApi = NetworkModule.INSTANCE.readsUploadApi(s0Var);
        m0.n(readsUploadApi);
        return readsUploadApi;
    }

    @Override // rn.a
    public ReadsUploadAPI get() {
        return readsUploadApi((s0) this.retrofitProvider.get());
    }
}
