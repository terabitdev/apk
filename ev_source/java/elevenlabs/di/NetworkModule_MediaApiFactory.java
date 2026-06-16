package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.MediaAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_MediaApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_MediaApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_MediaApiFactory create(f fVar) {
        return new NetworkModule_MediaApiFactory(fVar);
    }

    public static MediaAPI mediaApi(s0 s0Var) {
        MediaAPI mediaApi = NetworkModule.INSTANCE.mediaApi(s0Var);
        m0.n(mediaApi);
        return mediaApi;
    }

    @Override // rn.a
    public MediaAPI get() {
        return mediaApi((s0) this.retrofitProvider.get());
    }
}
