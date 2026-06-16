package io.livekit.android.webrtc;

import io.livekit.android.webrtc.SimulcastVideoEncoderFactoryWrapper;
import java.util.concurrent.Callable;
import livekit.org.webrtc.VideoCodecStatus;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoFrame;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper f17826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17827c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17828d;

    public /* synthetic */ e(SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper streamEncoderWrapper, Object obj, Object obj2, int i10) {
        this.f17825a = i10;
        this.f17826b = streamEncoderWrapper;
        this.f17827c = obj;
        this.f17828d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VideoCodecStatus encode$lambda$3;
        VideoCodecStatus initEncode$lambda$1;
        switch (this.f17825a) {
            case 0:
                encode$lambda$3 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.encode$lambda$3(this.f17826b, (VideoFrame) this.f17827c, (VideoEncoder.EncodeInfo) this.f17828d);
                return encode$lambda$3;
            default:
                initEncode$lambda$1 = SimulcastVideoEncoderFactoryWrapper.StreamEncoderWrapper.initEncode$lambda$1(this.f17826b, (VideoEncoder.Settings) this.f17827c, (VideoEncoder.Callback) this.f17828d);
                return initEncode$lambda$1;
        }
    }
}
