package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.audio.AudioRecordPrewarmer;
import livekit.org.webrtc.audio.AudioDeviceModule;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_AudioPrewarmerFactory implements c {
    private final rn.a audioDeviceModuleProvider;

    public RTCModule_AudioPrewarmerFactory(rn.a aVar) {
        this.audioDeviceModuleProvider = aVar;
    }

    public static AudioRecordPrewarmer audioPrewarmer(AudioDeviceModule audioDeviceModule) {
        AudioRecordPrewarmer audioPrewarmer = RTCModule.INSTANCE.audioPrewarmer(audioDeviceModule);
        m0.n(audioPrewarmer);
        return audioPrewarmer;
    }

    public static RTCModule_AudioPrewarmerFactory create(rn.a aVar) {
        return new RTCModule_AudioPrewarmerFactory(aVar);
    }

    @Override // rn.a
    public AudioRecordPrewarmer get() {
        return audioPrewarmer((AudioDeviceModule) this.audioDeviceModuleProvider.get());
    }
}
