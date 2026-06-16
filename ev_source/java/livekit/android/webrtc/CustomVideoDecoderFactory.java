package io.livekit.android.webrtc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoDecoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoDecoder;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.WrappedVideoDecoderFactory;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/livekit/android/webrtc/CustomVideoDecoderFactory;", "Llivekit/org/webrtc/VideoDecoderFactory;", "Llivekit/org/webrtc/EglBase$Context;", "sharedContext", "", "forceSWCodec", "", "", "forceSWCodecs", "<init>", "(Llivekit/org/webrtc/EglBase$Context;ZLjava/util/List;)V", "Lsn/z;", "setForceSWCodec", "(Z)V", "setForceSWCodecList", "(Ljava/util/List;)V", "Llivekit/org/webrtc/VideoCodecInfo;", "videoCodecInfo", "Llivekit/org/webrtc/VideoDecoder;", "createDecoder", "(Llivekit/org/webrtc/VideoCodecInfo;)Llivekit/org/webrtc/VideoDecoder;", "", "getSupportedCodecs", "()[Llivekit/org/webrtc/VideoCodecInfo;", "Z", "Ljava/util/List;", "Llivekit/org/webrtc/SoftwareVideoDecoderFactory;", "softwareVideoDecoderFactory", "Llivekit/org/webrtc/SoftwareVideoDecoderFactory;", "Llivekit/org/webrtc/WrappedVideoDecoderFactory;", "wrappedVideoDecoderFactory", "Llivekit/org/webrtc/WrappedVideoDecoderFactory;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class CustomVideoDecoderFactory implements VideoDecoderFactory {
    private boolean forceSWCodec;
    private List<String> forceSWCodecs;
    private final SoftwareVideoDecoderFactory softwareVideoDecoderFactory;
    private final WrappedVideoDecoderFactory wrappedVideoDecoderFactory;

    public CustomVideoDecoderFactory(EglBase.Context context, boolean z6, List<String> list) {
        list.getClass();
        this.forceSWCodec = z6;
        this.forceSWCodecs = list;
        this.softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();
        this.wrappedVideoDecoderFactory = new WrappedVideoDecoderFactory(context);
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        videoCodecInfo.getClass();
        if (this.forceSWCodec) {
            return this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        }
        if (!this.forceSWCodecs.isEmpty() && this.forceSWCodecs.contains(videoCodecInfo.name)) {
            return this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        }
        return this.wrappedVideoDecoderFactory.createDecoder(videoCodecInfo);
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        if (this.forceSWCodec && this.forceSWCodecs.isEmpty()) {
            VideoCodecInfo[] supportedCodecs = this.softwareVideoDecoderFactory.getSupportedCodecs();
            supportedCodecs.getClass();
            return supportedCodecs;
        }
        VideoCodecInfo[] supportedCodecs2 = this.wrappedVideoDecoderFactory.getSupportedCodecs();
        supportedCodecs2.getClass();
        return supportedCodecs2;
    }

    public final void setForceSWCodec(boolean forceSWCodec) {
        this.forceSWCodec = forceSWCodec;
    }

    public final void setForceSWCodecList(List<String> forceSWCodecs) {
        forceSWCodecs.getClass();
        this.forceSWCodecs = forceSWCodecs;
    }

    public /* synthetic */ CustomVideoDecoderFactory(EglBase.Context context, boolean z6, List list, int i10, f fVar) {
        this(context, (i10 & 2) != 0 ? false : z6, (i10 & 4) != 0 ? ig.f.H("VP9") : list);
    }
}
