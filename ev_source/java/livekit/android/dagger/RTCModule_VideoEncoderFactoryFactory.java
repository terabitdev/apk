package io.livekit.android.dagger;

import androidx.room.m0;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.VideoEncoderFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_VideoEncoderFactoryFactory implements c {
    private final rn.a eglContextProvider;
    private final rn.a videoEncoderFactoryOverrideProvider;
    private final rn.a videoHwAccelProvider;
    private final rn.a webrtcInitializationProvider;

    public RTCModule_VideoEncoderFactoryFactory(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4) {
        this.webrtcInitializationProvider = aVar;
        this.videoHwAccelProvider = aVar2;
        this.eglContextProvider = aVar3;
        this.videoEncoderFactoryOverrideProvider = aVar4;
    }

    public static RTCModule_VideoEncoderFactoryFactory create(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4) {
        return new RTCModule_VideoEncoderFactoryFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static VideoEncoderFactory videoEncoderFactory(LibWebrtcInitialization libWebrtcInitialization, boolean z6, EglBase.Context context, VideoEncoderFactory videoEncoderFactory) {
        VideoEncoderFactory videoEncoderFactory2 = RTCModule.INSTANCE.videoEncoderFactory(libWebrtcInitialization, z6, context, videoEncoderFactory);
        m0.n(videoEncoderFactory2);
        return videoEncoderFactory2;
    }

    @Override // rn.a
    public VideoEncoderFactory get() {
        return videoEncoderFactory((LibWebrtcInitialization) this.webrtcInitializationProvider.get(), ((Boolean) this.videoHwAccelProvider.get()).booleanValue(), (EglBase.Context) this.eglContextProvider.get(), (VideoEncoderFactory) this.videoEncoderFactoryOverrideProvider.get());
    }
}
