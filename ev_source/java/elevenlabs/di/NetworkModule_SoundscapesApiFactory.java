package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.SoundscapesAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_SoundscapesApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_SoundscapesApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_SoundscapesApiFactory create(f fVar) {
        return new NetworkModule_SoundscapesApiFactory(fVar);
    }

    public static SoundscapesAPI soundscapesApi(s0 s0Var) {
        SoundscapesAPI soundscapesApi = NetworkModule.INSTANCE.soundscapesApi(s0Var);
        m0.n(soundscapesApi);
        return soundscapesApi;
    }

    @Override // rn.a
    public SoundscapesAPI get() {
        return soundscapesApi((s0) this.retrofitProvider.get());
    }
}
