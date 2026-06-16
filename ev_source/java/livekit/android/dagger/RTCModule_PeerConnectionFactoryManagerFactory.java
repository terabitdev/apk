package io.livekit.android.dagger;

import androidx.room.m0;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.webrtc.PeerConnectionFactoryManager;
import livekit.org.webrtc.AudioProcessingFactory;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.audio.AudioDeviceModule;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_PeerConnectionFactoryManagerFactory implements c {
    private final rn.a audioDeviceModuleProvider;
    private final rn.a audioProcessingFactoryProvider;
    private final rn.a memoryManagerProvider;
    private final rn.a peerConnectionFactoryOptionsProvider;
    private final rn.a videoDecoderFactoryProvider;
    private final rn.a videoEncoderFactoryProvider;
    private final rn.a webrtcInitializationProvider;

    public RTCModule_PeerConnectionFactoryManagerFactory(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6, rn.a aVar7) {
        this.webrtcInitializationProvider = aVar;
        this.audioDeviceModuleProvider = aVar2;
        this.videoEncoderFactoryProvider = aVar3;
        this.videoDecoderFactoryProvider = aVar4;
        this.peerConnectionFactoryOptionsProvider = aVar5;
        this.memoryManagerProvider = aVar6;
        this.audioProcessingFactoryProvider = aVar7;
    }

    public static RTCModule_PeerConnectionFactoryManagerFactory create(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4, rn.a aVar5, rn.a aVar6, rn.a aVar7) {
        return new RTCModule_PeerConnectionFactoryManagerFactory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static PeerConnectionFactoryManager peerConnectionFactoryManager(LibWebrtcInitialization libWebrtcInitialization, AudioDeviceModule audioDeviceModule, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, PeerConnectionFactory.Options options, CloseableManager closeableManager, AudioProcessingFactory audioProcessingFactory) {
        PeerConnectionFactoryManager peerConnectionFactoryManager = RTCModule.INSTANCE.peerConnectionFactoryManager(libWebrtcInitialization, audioDeviceModule, videoEncoderFactory, videoDecoderFactory, options, closeableManager, audioProcessingFactory);
        m0.n(peerConnectionFactoryManager);
        return peerConnectionFactoryManager;
    }

    @Override // rn.a
    public PeerConnectionFactoryManager get() {
        return peerConnectionFactoryManager((LibWebrtcInitialization) this.webrtcInitializationProvider.get(), (AudioDeviceModule) this.audioDeviceModuleProvider.get(), (VideoEncoderFactory) this.videoEncoderFactoryProvider.get(), (VideoDecoderFactory) this.videoDecoderFactoryProvider.get(), (PeerConnectionFactory.Options) this.peerConnectionFactoryOptionsProvider.get(), (CloseableManager) this.memoryManagerProvider.get(), (AudioProcessingFactory) this.audioProcessingFactoryProvider.get());
    }
}
