package io.livekit.android.dagger;

import android.media.AudioAttributes;
import androidx.room.m0;
import io.livekit.android.AudioType;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AudioHandlerModule_AudioOutputAttributesFactory implements c {
    private final rn.a audioTypeProvider;

    public AudioHandlerModule_AudioOutputAttributesFactory(rn.a aVar) {
        this.audioTypeProvider = aVar;
    }

    public static AudioAttributes audioOutputAttributes(AudioType audioType) {
        AudioAttributes audioOutputAttributes = AudioHandlerModule.INSTANCE.audioOutputAttributes(audioType);
        m0.n(audioOutputAttributes);
        return audioOutputAttributes;
    }

    public static AudioHandlerModule_AudioOutputAttributesFactory create(rn.a aVar) {
        return new AudioHandlerModule_AudioOutputAttributesFactory(aVar);
    }

    @Override // rn.a
    public AudioAttributes get() {
        return audioOutputAttributes((AudioType) this.audioTypeProvider.get());
    }
}
