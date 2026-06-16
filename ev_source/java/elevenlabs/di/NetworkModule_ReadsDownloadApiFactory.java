package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ReadsDownloadAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ReadsDownloadApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ReadsDownloadApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ReadsDownloadApiFactory create(f fVar) {
        return new NetworkModule_ReadsDownloadApiFactory(fVar);
    }

    public static ReadsDownloadAPI readsDownloadApi(s0 s0Var) {
        ReadsDownloadAPI readsDownloadApi = NetworkModule.INSTANCE.readsDownloadApi(s0Var);
        m0.n(readsDownloadApi);
        return readsDownloadApi;
    }

    @Override // rn.a
    public ReadsDownloadAPI get() {
        return readsDownloadApi((s0) this.retrofitProvider.get());
    }
}
