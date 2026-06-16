package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.AudioType;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AudioHandlerModule_AudioOutputTypeFactory implements c {
    private final rn.a audioOutputOverrideProvider;

    public AudioHandlerModule_AudioOutputTypeFactory(rn.a aVar) {
        this.audioOutputOverrideProvider = aVar;
    }

    public static AudioType audioOutputType(AudioType audioType) {
        AudioType audioOutputType = AudioHandlerModule.INSTANCE.audioOutputType(audioType);
        m0.n(audioOutputType);
        return audioOutputType;
    }

    public static AudioHandlerModule_AudioOutputTypeFactory create(rn.a aVar) {
        return new AudioHandlerModule_AudioOutputTypeFactory(aVar);
    }

    @Override // rn.a
    public AudioType get() {
        return audioOutputType((AudioType) this.audioOutputOverrideProvider.get());
    }
}
