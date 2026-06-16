package io.livekit.android.dagger;

import androidx.room.m0;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.VideoDecoderFactory;
import ul.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RTCModule_VideoDecoderFactoryFactory implements c {
    private final rn.a eglContextProvider;
    private final rn.a videoDecoderFactoryOverrideProvider;
    private final rn.a videoHwAccelProvider;
    private final rn.a webrtcInitializationProvider;

    public RTCModule_VideoDecoderFactoryFactory(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4) {
        this.webrtcInitializationProvider = aVar;
        this.videoHwAccelProvider = aVar2;
        this.eglContextProvider = aVar3;
        this.videoDecoderFactoryOverrideProvider = aVar4;
    }

    public static RTCModule_VideoDecoderFactoryFactory create(rn.a aVar, rn.a aVar2, rn.a aVar3, rn.a aVar4) {
        return new RTCModule_VideoDecoderFactoryFactory(aVar, aVar2, aVar3, aVar4);
    }

    public static VideoDecoderFactory videoDecoderFactory(LibWebrtcInitialization libWebrtcInitialization, boolean z6, EglBase.Context context, VideoDecoderFactory videoDecoderFactory) {
        VideoDecoderFactory videoDecoderFactory2 = RTCModule.INSTANCE.videoDecoderFactory(libWebrtcInitialization, z6, context, videoDecoderFactory);
        m0.n(videoDecoderFactory2);
        return videoDecoderFactory2;
    }

    @Override // rn.a
    public VideoDecoderFactory get() {
        return videoDecoderFactory((LibWebrtcInitialization) this.webrtcInitializationProvider.get(), ((Boolean) this.videoHwAccelProvider.get()).booleanValue(), (EglBase.Context) this.eglContextProvider.get(), (VideoDecoderFactory) this.videoDecoderFactoryOverrideProvider.get());
    }
}
