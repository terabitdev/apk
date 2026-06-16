package io.livekit.android.webrtc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoEncoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/livekit/android/webrtc/CustomVideoEncoderFactory;", "Llivekit/org/webrtc/VideoEncoderFactory;", "Llivekit/org/webrtc/EglBase$Context;", "sharedContext", "", "enableIntelVp8Encoder", "enableH264HighProfile", "forceSWCodec", "", "", "forceSWCodecs", "<init>", "(Llivekit/org/webrtc/EglBase$Context;ZZZLjava/util/List;)V", "Lsn/z;", "setForceSWCodec", "(Z)V", "setForceSWCodecList", "(Ljava/util/List;)V", "Llivekit/org/webrtc/VideoCodecInfo;", "videoCodecInfo", "Llivekit/org/webrtc/VideoEncoder;", "createEncoder", "(Llivekit/org/webrtc/VideoCodecInfo;)Llivekit/org/webrtc/VideoEncoder;", "", "getSupportedCodecs", "()[Llivekit/org/webrtc/VideoCodecInfo;", "Z", "Ljava/util/List;", "Llivekit/org/webrtc/SoftwareVideoEncoderFactory;", "softwareVideoEncoderFactory", "Llivekit/org/webrtc/SoftwareVideoEncoderFactory;", "Lio/livekit/android/webrtc/SimulcastVideoEncoderFactoryWrapper;", "simulcastVideoEncoderFactoryWrapper", "Lio/livekit/android/webrtc/SimulcastVideoEncoderFactoryWrapper;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class CustomVideoEncoderFactory implements VideoEncoderFactory {
    private boolean forceSWCodec;
    private List<String> forceSWCodecs;
    private final SimulcastVideoEncoderFactoryWrapper simulcastVideoEncoderFactoryWrapper;
    private final SoftwareVideoEncoderFactory softwareVideoEncoderFactory;

    public CustomVideoEncoderFactory(EglBase.Context context, boolean z6, boolean z10, boolean z11, List<String> list) {
        list.getClass();
        this.forceSWCodec = z11;
        this.forceSWCodecs = list;
        this.softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
        this.simulcastVideoEncoderFactoryWrapper = new SimulcastVideoEncoderFactoryWrapper(context, z6, z10);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        videoCodecInfo.getClass();
        if (this.forceSWCodec) {
            return this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        }
        if (!this.forceSWCodecs.isEmpty() && this.forceSWCodecs.contains(videoCodecInfo.name)) {
            return this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        }
        return this.simulcastVideoEncoderFactoryWrapper.createEncoder(videoCodecInfo);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        if (this.forceSWCodec && this.forceSWCodecs.isEmpty()) {
            VideoCodecInfo[] supportedCodecs = this.softwareVideoEncoderFactory.getSupportedCodecs();
            supportedCodecs.getClass();
            return supportedCodecs;
        }
        return this.simulcastVideoEncoderFactoryWrapper.getSupportedCodecs();
    }

    public final void setForceSWCodec(boolean forceSWCodec) {
        this.forceSWCodec = forceSWCodec;
    }

    public final void setForceSWCodecList(List<String> forceSWCodecs) {
        forceSWCodecs.getClass();
        this.forceSWCodecs = forceSWCodecs;
    }

    public /* synthetic */ CustomVideoEncoderFactory(EglBase.Context context, boolean z6, boolean z10, boolean z11, List list, int i10, f fVar) {
        this(context, z6, z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? ig.f.H("VP9") : list);
    }
}
