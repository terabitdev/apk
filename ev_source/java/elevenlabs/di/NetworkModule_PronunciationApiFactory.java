package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.PronunciationsAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_PronunciationApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_PronunciationApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_PronunciationApiFactory create(f fVar) {
        return new NetworkModule_PronunciationApiFactory(fVar);
    }

    public static PronunciationsAPI pronunciationApi(s0 s0Var) {
        PronunciationsAPI pronunciationApi = NetworkModule.INSTANCE.pronunciationApi(s0Var);
        m0.n(pronunciationApi);
        return pronunciationApi;
    }

    @Override // rn.a
    public PronunciationsAPI get() {
        return pronunciationApi((s0) this.retrofitProvider.get());
    }
}
