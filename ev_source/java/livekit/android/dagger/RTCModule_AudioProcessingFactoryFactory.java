package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.webrtc.CustomAudioProcessingFactory;
import livekit.org.webrtc.AudioProcessingFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_AudioProcessingFactoryFactory implements c {
    private final rn.a customAudioProcessingFactoryProvider;

    public RTCModule_AudioProcessingFactoryFactory(rn.a aVar) {
        this.customAudioProcessingFactoryProvider = aVar;
    }

    public static AudioProcessingFactory audioProcessingFactory(CustomAudioProcessingFactory customAudioProcessingFactory) {
        AudioProcessingFactory audioProcessingFactory = RTCModule.INSTANCE.audioProcessingFactory(customAudioProcessingFactory);
        m0.n(audioProcessingFactory);
        return audioProcessingFactory;
    }

    public static RTCModule_AudioProcessingFactoryFactory create(rn.a aVar) {
        return new RTCModule_AudioProcessingFactoryFactory(aVar);
    }

    @Override // rn.a
    public AudioProcessingFactory get() {
        return audioProcessingFactory((CustomAudioProcessingFactory) this.customAudioProcessingFactoryProvider.get());
    }
}
