package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.VoiceDesignAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_VoiceDesignApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_VoiceDesignApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_VoiceDesignApiFactory create(f fVar) {
        return new NetworkModule_VoiceDesignApiFactory(fVar);
    }

    public static VoiceDesignAPI voiceDesignApi(s0 s0Var) {
        VoiceDesignAPI voiceDesignApi = NetworkModule.INSTANCE.voiceDesignApi(s0Var);
        m0.n(voiceDesignApi);
        return voiceDesignApi;
    }

    @Override // rn.a
    public VoiceDesignAPI get() {
        return voiceDesignApi((s0) this.retrofitProvider.get());
    }
}
