package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.audio.AudioProcessingController;
import io.livekit.android.webrtc.CustomAudioProcessingFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_AudioProcessingControllerFactory implements c {
    private final rn.a customAudioProcessingFactoryProvider;

    public RTCModule_AudioProcessingControllerFactory(rn.a aVar) {
        this.customAudioProcessingFactoryProvider = aVar;
    }

    public static AudioProcessingController audioProcessingController(CustomAudioProcessingFactory customAudioProcessingFactory) {
        AudioProcessingController audioProcessingController = RTCModule.INSTANCE.audioProcessingController(customAudioProcessingFactory);
        m0.n(audioProcessingController);
        return audioProcessingController;
    }

    public static RTCModule_AudioProcessingControllerFactory create(rn.a aVar) {
        return new RTCModule_AudioProcessingControllerFactory(aVar);
    }

    @Override // rn.a
    public AudioProcessingController get() {
        return audioProcessingController((CustomAudioProcessingFactory) this.customAudioProcessingFactoryProvider.get());
    }
}
