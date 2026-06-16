package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.audio.AudioProcessorOptions;
import io.livekit.android.webrtc.CustomAudioProcessingFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_CustomAudioProcessingFactoryFactory implements c {
    private final rn.a audioProcessorOptionsProvider;
    private final rn.a webrtcInitializationProvider;

    public RTCModule_CustomAudioProcessingFactoryFactory(rn.a aVar, rn.a aVar2) {
        this.webrtcInitializationProvider = aVar;
        this.audioProcessorOptionsProvider = aVar2;
    }

    public static RTCModule_CustomAudioProcessingFactoryFactory create(rn.a aVar, rn.a aVar2) {
        return new RTCModule_CustomAudioProcessingFactoryFactory(aVar, aVar2);
    }

    public static CustomAudioProcessingFactory customAudioProcessingFactory(LibWebrtcInitialization libWebrtcInitialization, AudioProcessorOptions audioProcessorOptions) {
        CustomAudioProcessingFactory customAudioProcessingFactory = RTCModule.INSTANCE.customAudioProcessingFactory(libWebrtcInitialization, audioProcessorOptions);
        m0.n(customAudioProcessingFactory);
        return customAudioProcessingFactory;
    }

    @Override // rn.a
    public CustomAudioProcessingFactory get() {
        return customAudioProcessingFactory((LibWebrtcInitialization) this.webrtcInitializationProvider.get(), (AudioProcessorOptions) this.audioProcessorOptionsProvider.get());
    }
}
