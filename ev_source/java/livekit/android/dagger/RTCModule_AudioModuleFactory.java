package io.livekit.android.dagger;

import android.content.Context;
import android.media.AudioAttributes;
import androidx.room.m0;
import ho.l;
import io.livekit.android.audio.AudioBufferCallbackDispatcher;
import io.livekit.android.audio.AudioRecordSamplesDispatcher;
import io.livekit.android.audio.CommunicationWorkaround;
import io.livekit.android.memory.CloseableManager;
import livekit.org.webrtc.audio.AudioDeviceModule;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_AudioModuleFactory implements c {
    private final rn.a appContextProvider;
    private final rn.a audioBufferCallbackDispatcherProvider;
    private final rn.a audioDeviceModuleOverrideProvider;
    private final rn.a audioOutputAttributesProvider;
    private final rn.a audioRecordSamplesDispatcherProvider;
    private final rn.a closeableManagerProvider;
    private final rn.a communicationWorkaroundProvider;
    private final rn.a moduleCustomizerProvider;

    public RTCModule_AudioModuleFactory(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6, rn.a aVar7, rn.a aVar8) {
        this.audioDeviceModuleOverrideProvider = aVar;
        this.moduleCustomizerProvider = aVar2;
        this.audioOutputAttributesProvider = aVar3;
        this.appContextProvider = aVar4;
        this.closeableManagerProvider = aVar5;
        this.communicationWorkaroundProvider = aVar6;
        this.audioRecordSamplesDispatcherProvider = aVar7;
        this.audioBufferCallbackDispatcherProvider = aVar8;
    }

    public static AudioDeviceModule audioModule(AudioDeviceModule audioDeviceModule, l lVar, AudioAttributes audioAttributes, Context context, CloseableManager closeableManager, CommunicationWorkaround communicationWorkaround, AudioRecordSamplesDispatcher audioRecordSamplesDispatcher, AudioBufferCallbackDispatcher audioBufferCallbackDispatcher) {
        AudioDeviceModule audioModule = RTCModule.INSTANCE.audioModule(audioDeviceModule, lVar, audioAttributes, context, closeableManager, communicationWorkaround, audioRecordSamplesDispatcher, audioBufferCallbackDispatcher);
        m0.n(audioModule);
        return audioModule;
    }

    public static RTCModule_AudioModuleFactory create(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6, rn.a aVar7, rn.a aVar8) {
        return new RTCModule_AudioModuleFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    @Override // rn.a
    public AudioDeviceModule get() {
        return audioModule((AudioDeviceModule) this.audioDeviceModuleOverrideProvider.get(), (l) this.moduleCustomizerProvider.get(), (AudioAttributes) this.audioOutputAttributesProvider.get(), (Context) this.appContextProvider.get(), (CloseableManager) this.closeableManagerProvider.get(), (CommunicationWorkaround) this.communicationWorkaroundProvider.get(), (AudioRecordSamplesDispatcher) this.audioRecordSamplesDispatcherProvider.get(), (AudioBufferCallbackDispatcher) this.audioBufferCallbackDispatcherProvider.get());
    }
}
