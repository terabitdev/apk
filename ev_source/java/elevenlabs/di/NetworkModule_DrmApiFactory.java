package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.DrmAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_DrmApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_DrmApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_DrmApiFactory create(f fVar) {
        return new NetworkModule_DrmApiFactory(fVar);
    }

    public static DrmAPI drmApi(s0 s0Var) {
        DrmAPI drmApi = NetworkModule.INSTANCE.drmApi(s0Var);
        m0.n(drmApi);
        return drmApi;
    }

    @Override // rn.a
    public DrmAPI get() {
        return drmApi((s0) this.retrofitProvider.get());
    }
}
