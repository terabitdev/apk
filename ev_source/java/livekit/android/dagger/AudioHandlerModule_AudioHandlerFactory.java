package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.AudioType;
import io.livekit.android.audio.AudioHandler;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AudioHandlerModule_AudioHandlerFactory implements c {
    private final rn.a audioHandlerOverrideProvider;
    private final rn.a audioOutputTypeProvider;
    private final rn.a audioSwitchHandlerProvider;

    public AudioHandlerModule_AudioHandlerFactory(rn.a aVar, rn.a aVar2, rn.a aVar3) {
        this.audioSwitchHandlerProvider = aVar;
        this.audioHandlerOverrideProvider = aVar2;
        this.audioOutputTypeProvider = aVar3;
    }

    public static AudioHandler audioHandler(rn.a aVar, AudioHandler audioHandler, AudioType audioType) {
        AudioHandler audioHandler2 = AudioHandlerModule.INSTANCE.audioHandler(aVar, audioHandler, audioType);
        m0.n(audioHandler2);
        return audioHandler2;
    }

    public static AudioHandlerModule_AudioHandlerFactory create(rn.a aVar, rn.a aVar2, rn.a aVar3) {
        return new AudioHandlerModule_AudioHandlerFactory(aVar, aVar2, aVar3);
    }

    @Override // rn.a
    public AudioHandler get() {
        return audioHandler(this.audioSwitchHandlerProvider, (AudioHandler) this.audioHandlerOverrideProvider.get(), (AudioType) this.audioOutputTypeProvider.get());
    }
}
