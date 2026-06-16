package io.livekit.android.room.track;

import android.content.Context;
import as.p9;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import et.d;
import io.livekit.android.dagger.InjectionNames;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.memory.SurfaceTextureHelperCloser;
import io.livekit.android.room.DefaultsManager;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.VideoCodec;
import io.livekit.android.room.track.video.CameraCapturerUtils;
import io.livekit.android.room.track.video.CameraCapturerWithSize;
import io.livekit.android.room.track.video.CameraEventsDispatchHandler;
import io.livekit.android.room.track.video.CaptureDispatchObserver;
import io.livekit.android.room.track.video.ScaleCropVideoProcessor;
import io.livekit.android.room.track.video.VideoCapturerWithSize;
import io.livekit.android.room.util.EncodingUtils;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.util.MutableStateFlowDelegate;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitRtc$SubscribedCodec;
import livekit.LivekitRtc$SubscribedQuality;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpParameters;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.SurfaceTextureHelper;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoProcessor;
import livekit.org.webrtc.VideoSink;
import livekit.org.webrtc.VideoSource;
import oo.u;
import sn.c;
import sn.j;
import sn.k;
import tn.n;
import tn.o;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 y2\u00020\u0001:\u0002yzBw\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010)J%\u0010,\u001a\u00020\u001c2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J#\u00100\u001a\u00020\u001c2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u001d\u00107\u001a\u00020\u001c2\f\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0000¢\u0006\u0004\b5\u00106J#\u0010=\u001a\b\u0012\u0004\u0012\u00020:022\f\u00109\u001a\b\u0012\u0004\u0012\u00020802H\u0000¢\u0006\u0004\b;\u0010<J%\u0010D\u001a\u00020A2\u0006\u0010>\u001a\u00020:2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?02H\u0000¢\u0006\u0004\bB\u0010CJ%\u0010G\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020E2\f\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0002¢\u0006\u0004\bG\u0010HR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010KR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010MR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010NR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010OR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010SR*\u0010\u000b\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010>\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010)R\u001e\u0010]\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R \u0010`\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020A0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR1\u0010\t\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b8G@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bb\u0010c\u0012\u0004\bh\u0010\u001e\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010j\u001a\u0004\u0018\u00010i8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0011\u0010v\u001a\u00020s8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0016\u0010F\u001a\u0004\u0018\u00010E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006{"}, d2 = {"Lio/livekit/android/room/track/LocalVideoTrack;", "Lio/livekit/android/room/track/VideoTrack;", "Llivekit/org/webrtc/VideoCapturer;", "capturer", "Llivekit/org/webrtc/VideoSource;", "source", "", DiagnosticsEntry.NAME_KEY, "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "options", "Llivekit/org/webrtc/VideoTrack;", "rtcTrack", "Llivekit/org/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "Landroid/content/Context;", "context", "Llivekit/org/webrtc/EglBase;", "eglBase", "Lio/livekit/android/room/DefaultsManager;", "defaultsManager", "Lio/livekit/android/room/track/LocalVideoTrack$Factory;", "trackFactory", "Lio/livekit/android/room/track/video/CaptureDispatchObserver;", "dispatchObserver", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Llivekit/org/webrtc/VideoCapturer;Llivekit/org/webrtc/VideoSource;Ljava/lang/String;Lio/livekit/android/room/track/LocalVideoTrackOptions;Llivekit/org/webrtc/VideoTrack;Llivekit/org/webrtc/PeerConnectionFactory;Landroid/content/Context;Llivekit/org/webrtc/EglBase;Lio/livekit/android/room/DefaultsManager;Lio/livekit/android/room/track/LocalVideoTrack$Factory;Lio/livekit/android/room/track/video/CaptureDispatchObserver;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "Lsn/z;", "startCapture", "()V", "stopCapture", "stop", "dispose", "Llivekit/org/webrtc/VideoSink;", "renderer", "addRenderer", "(Llivekit/org/webrtc/VideoSink;)V", "removeRenderer", "deviceId", "setDeviceId", "(Ljava/lang/String;)V", "Lio/livekit/android/room/track/CameraPosition;", "position", "switchCamera", "(Ljava/lang/String;Lio/livekit/android/room/track/CameraPosition;)V", "Llivekit/org/webrtc/VideoProcessor;", "videoProcessor", "restartTrack", "(Lio/livekit/android/room/track/LocalVideoTrackOptions;Llivekit/org/webrtc/VideoProcessor;)V", "", "Llivekit/LivekitRtc$SubscribedQuality;", "qualities", "setPublishingLayers$livekit_android_sdk_release", "(Ljava/util/List;)V", "setPublishingLayers", "Llivekit/LivekitRtc$SubscribedCodec;", "codecs", "Lio/livekit/android/room/track/VideoCodec;", "setPublishingCodecs$livekit_android_sdk_release", "(Ljava/util/List;)Ljava/util/List;", "setPublishingCodecs", "codec", "Llivekit/org/webrtc/RtpParameters$Encoding;", "encodings", "Lio/livekit/android/room/track/SimulcastTrackInfo;", "addSimulcastTrack$livekit_android_sdk_release", "(Lio/livekit/android/room/track/VideoCodec;Ljava/util/List;)Lio/livekit/android/room/track/SimulcastTrackInfo;", "addSimulcastTrack", "Llivekit/org/webrtc/RtpSender;", InjectionNames.SENDER, "setPublishingLayersForSender", "(Llivekit/org/webrtc/RtpSender;Ljava/util/List;)V", "Llivekit/org/webrtc/VideoSource;", "Llivekit/org/webrtc/PeerConnectionFactory;", "Landroid/content/Context;", "Llivekit/org/webrtc/EglBase;", "Lio/livekit/android/room/DefaultsManager;", "Lio/livekit/android/room/track/LocalVideoTrack$Factory;", "Lio/livekit/android/room/track/video/CaptureDispatchObserver;", "<set-?>", "Llivekit/org/webrtc/VideoCapturer;", "getCapturer", "()Llivekit/org/webrtc/VideoCapturer;", "Llivekit/org/webrtc/VideoTrack;", "getRtcTrack", "()Llivekit/org/webrtc/VideoTrack;", "setRtcTrack$livekit_android_sdk_release", "(Llivekit/org/webrtc/VideoTrack;)V", "Ljava/lang/String;", "getCodec$livekit_android_sdk_release", "()Ljava/lang/String;", "setCodec$livekit_android_sdk_release", "subscribedCodecs", "Ljava/util/List;", "", "simulcastCodecs", "Ljava/util/Map;", "options$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getOptions", "()Lio/livekit/android/room/track/LocalVideoTrackOptions;", "setOptions", "(Lio/livekit/android/room/track/LocalVideoTrackOptions;)V", "getOptions$annotations", "Llivekit/org/webrtc/RtpTransceiver;", "transceiver", "Llivekit/org/webrtc/RtpTransceiver;", "getTransceiver$livekit_android_sdk_release", "()Llivekit/org/webrtc/RtpTransceiver;", "setTransceiver$livekit_android_sdk_release", "(Llivekit/org/webrtc/RtpTransceiver;)V", "Lio/livekit/android/memory/CloseableManager;", "closeableManager", "Lio/livekit/android/memory/CloseableManager;", "Lio/livekit/android/room/track/Track$Dimensions;", "getDimensions", "()Lio/livekit/android/room/track/Track$Dimensions;", "dimensions", "getSender$livekit_android_sdk_release", "()Llivekit/org/webrtc/RtpSender;", "Companion", "Factory", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class LocalVideoTrack extends VideoTrack {
    static final /* synthetic */ u[] $$delegatedProperties = {e0.f20562a.e(new q(LocalVideoTrack.class, "options", "getOptions()Lio/livekit/android/room/track/LocalVideoTrackOptions;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private VideoCapturer capturer;
    private final CloseableManager closeableManager;
    private String codec;
    private final Context context;
    private final DefaultsManager defaultsManager;
    private CaptureDispatchObserver dispatchObserver;
    private final EglBase eglBase;

    /* renamed from: options$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate options;
    private final PeerConnectionFactory peerConnectionFactory;
    private livekit.org.webrtc.VideoTrack rtcTrack;
    private final Map<VideoCodec, SimulcastTrackInfo> simulcastCodecs;
    private VideoSource source;
    private List<LivekitRtc$SubscribedCodec> subscribedCodecs;
    private final Factory trackFactory;
    private RtpTransceiver transceiver;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¨\u0006\u0010"}, d2 = {"Lio/livekit/android/room/track/LocalVideoTrack$Factory;", "", "create", "Lio/livekit/android/room/track/LocalVideoTrack;", "capturer", "Llivekit/org/webrtc/VideoCapturer;", "source", "Llivekit/org/webrtc/VideoSource;", DiagnosticsEntry.NAME_KEY, "", "options", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "rtcTrack", "Llivekit/org/webrtc/VideoTrack;", "dispatchObserver", "Lio/livekit/android/room/track/video/CaptureDispatchObserver;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        LocalVideoTrack create(VideoCapturer capturer, VideoSource source, String name, LocalVideoTrackOptions options, livekit.org.webrtc.VideoTrack rtcTrack, CaptureDispatchObserver dispatchObserver);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalVideoTrack(VideoCapturer videoCapturer, VideoSource videoSource, String str, LocalVideoTrackOptions localVideoTrackOptions, livekit.org.webrtc.VideoTrack videoTrack, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, DefaultsManager defaultsManager, Factory factory, CaptureDispatchObserver captureDispatchObserver, RTCThreadToken rTCThreadToken) {
        super(str, videoTrack, rTCThreadToken);
        videoCapturer.getClass();
        videoSource.getClass();
        str.getClass();
        localVideoTrackOptions.getClass();
        videoTrack.getClass();
        peerConnectionFactory.getClass();
        context.getClass();
        eglBase.getClass();
        defaultsManager.getClass();
        factory.getClass();
        rTCThreadToken.getClass();
        this.source = videoSource;
        this.peerConnectionFactory = peerConnectionFactory;
        this.context = context;
        this.eglBase = eglBase;
        this.defaultsManager = defaultsManager;
        this.trackFactory = factory;
        this.dispatchObserver = captureDispatchObserver;
        this.capturer = videoCapturer;
        this.rtcTrack = videoTrack;
        this.simulcastCodecs = new LinkedHashMap();
        this.options = FlowDelegateKt.flowDelegate$default(localVideoTrackOptions, null, 2, null);
        this.closeableManager = new CloseableManager();
    }

    public static /* synthetic */ void restartTrack$default(LocalVideoTrack localVideoTrack, LocalVideoTrackOptions localVideoTrackOptions, VideoProcessor videoProcessor, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                localVideoTrackOptions = LocalVideoTrackOptions.copy$default(localVideoTrack.defaultsManager.getVideoTrackCaptureDefaults(), false, null, null, null, 15, null);
            }
            if ((i10 & 2) != 0) {
                videoProcessor = null;
            }
            localVideoTrack.restartTrack(localVideoTrackOptions, videoProcessor);
            return;
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: restartTrack");
    }

    private final void setPublishingLayersForSender(RtpSender sender, List<LivekitRtc$SubscribedQuality> qualities) {
        List<RtpParameters.Encoding> list;
        String str;
        Object obj;
        List<RtpParameters.Encoding> list2;
        if (isDisposed$livekit_android_sdk_release()) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.c(null, "attempted to set publishing layer for disposed video track.", new Object[0]);
                return;
            }
            return;
        }
        try {
            RtpParameters parameters = sender.getParameters();
            if (parameters != null && (list = parameters.encodings) != null) {
                RtpParameters.Encoding encoding = (RtpParameters.Encoding) o.y0(list);
                if (encoding != null) {
                    str = encoding.scalabilityMode;
                } else {
                    str = null;
                }
                boolean z6 = true;
                if (str != null) {
                    RtpParameters.Encoding encoding2 = (RtpParameters.Encoding) o.w0(list);
                    p9 p9Var = p9.OFF;
                    p9 p9Var2 = p9Var;
                    for (LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality : qualities) {
                        if (livekitRtc$SubscribedQuality.getEnabled() && (p9Var2 == p9Var || livekitRtc$SubscribedQuality.getQuality().getNumber() > p9Var2.getNumber())) {
                            p9Var2 = livekitRtc$SubscribedQuality.getQuality();
                            p9Var2.getClass();
                        }
                    }
                    if (p9Var2 == p9Var) {
                        if (encoding2.active) {
                            LKLog.Companion companion2 = LKLog.INSTANCE;
                            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                d.e(null, "setting svc track to disabled", new Object[0]);
                            }
                            encoding2.active = false;
                        }
                        z6 = false;
                    } else {
                        if (!encoding2.active) {
                            LKLog.Companion companion3 = LKLog.INSTANCE;
                            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                d.e(null, "setting svc track to enabled", new Object[0]);
                            }
                            encoding2.active = true;
                        }
                        z6 = false;
                    }
                } else {
                    boolean z10 = false;
                    for (LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality2 : qualities) {
                        EncodingUtils encodingUtils = EncodingUtils.INSTANCE;
                        p9 quality = livekitRtc$SubscribedQuality2.getQuality();
                        quality.getClass();
                        String ridForVideoQuality = encodingUtils.ridForVideoQuality(quality);
                        if (ridForVideoQuality != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (m.c(((RtpParameters.Encoding) obj).rid, ridForVideoQuality)) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            RtpParameters.Encoding encoding3 = (RtpParameters.Encoding) obj;
                            if (encoding3 == null) {
                                if (list.size() == 1 && livekitRtc$SubscribedQuality2.getQuality() == p9.LOW) {
                                    list2 = list;
                                } else {
                                    list2 = null;
                                }
                                if (list2 != null) {
                                    encoding3 = (RtpParameters.Encoding) o.w0(list2);
                                } else {
                                    encoding3 = null;
                                }
                                if (encoding3 == null) {
                                }
                            }
                            if (encoding3.active != livekitRtc$SubscribedQuality2.getEnabled()) {
                                encoding3.active = livekitRtc$SubscribedQuality2.getEnabled();
                                LKLog.Companion companion4 = LKLog.INSTANCE;
                                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                    d.e(null, "setting layer " + livekitRtc$SubscribedQuality2.getQuality() + " to " + livekitRtc$SubscribedQuality2.getEnabled(), new Object[0]);
                                }
                                z10 = true;
                            }
                        }
                    }
                    z6 = z10;
                }
                if (z6) {
                    sender.setParameters(parameters);
                }
            }
        } catch (Exception e10) {
            LKLog.Companion companion5 = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(e10, "Exception caught while setting publishing layers.", new Object[0]);
            }
        }
    }

    public static /* synthetic */ void switchCamera$default(LocalVideoTrack localVideoTrack, String str, CameraPosition cameraPosition, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                cameraPosition = null;
            }
            localVideoTrack.switchCamera(str, cameraPosition);
            return;
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: switchCamera");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchCamera$updateCameraOptions(LocalVideoTrack localVideoTrack, String str, d0 d0Var) {
        CameraPosition cameraPosition;
        LocalVideoTrackOptions options = localVideoTrack.getOptions();
        CameraCapturerUtils.CameraDeviceInfo cameraDeviceInfo = (CameraCapturerUtils.CameraDeviceInfo) d0Var.f20559a;
        if (cameraDeviceInfo != null) {
            cameraPosition = cameraDeviceInfo.getPosition();
        } else {
            cameraPosition = null;
        }
        localVideoTrack.setOptions(LocalVideoTrackOptions.copy$default(options, false, str, cameraPosition, null, 9, null));
    }

    @Override // io.livekit.android.room.track.VideoTrack
    public void addRenderer(VideoSink renderer) {
        renderer.getClass();
        CaptureDispatchObserver captureDispatchObserver = this.dispatchObserver;
        if (captureDispatchObserver != null) {
            if (captureDispatchObserver != null) {
                captureDispatchObserver.registerSink(renderer);
                return;
            }
            return;
        }
        super.addRenderer(renderer);
    }

    public final SimulcastTrackInfo addSimulcastTrack$livekit_android_sdk_release(VideoCodec codec, List<? extends RtpParameters.Encoding> encodings) {
        codec.getClass();
        encodings.getClass();
        if (!this.simulcastCodecs.containsKey(codec)) {
            SimulcastTrackInfo simulcastTrackInfo = new SimulcastTrackInfo(codec.getCodecName(), getRtcTrack(), null, encodings, 4, null);
            this.simulcastCodecs.put(codec, simulcastTrackInfo);
            return simulcastTrackInfo;
        }
        throw new IllegalStateException(codec + " already added!");
    }

    @Override // io.livekit.android.room.track.Track
    public void dispose() {
        super.dispose();
        this.capturer.dispose();
        this.closeableManager.close();
    }

    public final VideoCapturer getCapturer() {
        return this.capturer;
    }

    /* renamed from: getCodec$livekit_android_sdk_release, reason: from getter */
    public final String getCodec() {
        return this.codec;
    }

    public final Track.Dimensions getDimensions() {
        VideoCapturerWithSize videoCapturerWithSize;
        VideoCapturer videoCapturer = this.capturer;
        if (videoCapturer instanceof VideoCapturerWithSize) {
            videoCapturerWithSize = (VideoCapturerWithSize) videoCapturer;
        } else {
            videoCapturerWithSize = null;
        }
        if (videoCapturerWithSize != null) {
            Size findCaptureFormat = videoCapturerWithSize.findCaptureFormat(getOptions().getCaptureParams().getWidth(), getOptions().getCaptureParams().getHeight());
            return new Track.Dimensions(findCaptureFormat.width, findCaptureFormat.height);
        }
        return new Track.Dimensions(getOptions().getCaptureParams().getWidth(), getOptions().getCaptureParams().getHeight());
    }

    public final LocalVideoTrackOptions getOptions() {
        return (LocalVideoTrackOptions) this.options.getValue(this, $$delegatedProperties[0]);
    }

    public final RtpSender getSender$livekit_android_sdk_release() {
        RtpTransceiver rtpTransceiver = this.transceiver;
        if (rtpTransceiver != null) {
            return rtpTransceiver.getSender();
        }
        return null;
    }

    /* renamed from: getTransceiver$livekit_android_sdk_release, reason: from getter */
    public final RtpTransceiver getTransceiver() {
        return this.transceiver;
    }

    @Override // io.livekit.android.room.track.VideoTrack
    public void removeRenderer(VideoSink renderer) {
        renderer.getClass();
        CaptureDispatchObserver captureDispatchObserver = this.dispatchObserver;
        if (captureDispatchObserver != null) {
            if (captureDispatchObserver != null) {
                captureDispatchObserver.unregisterSink(renderer);
                return;
            }
            return;
        }
        super.removeRenderer(renderer);
    }

    public final void restartTrack(LocalVideoTrackOptions options, VideoProcessor videoProcessor) {
        options.getClass();
        if (isDisposed$livekit_android_sdk_release()) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.b(null, "Attempting to restart track that was already disposed, aborting.", new Object[0]);
                return;
            }
            return;
        }
        VideoCapturer videoCapturer = this.capturer;
        VideoSource videoSource = this.source;
        livekit.org.webrtc.VideoTrack rtcTrack = getRtcTrack();
        videoCapturer.stopCapture();
        videoCapturer.dispose();
        videoSource.dispose();
        rtcTrack.setEnabled(false);
        rtcTrack.dispose();
        Closeable unregisterResource = this.closeableManager.unregisterResource(rtcTrack);
        if (unregisterResource != null) {
            unregisterResource.close();
        }
        LocalVideoTrack createCameraTrack$livekit_android_sdk_release = INSTANCE.createCameraTrack$livekit_android_sdk_release(this.peerConnectionFactory, this.context, getName(), options, this.eglBase, this.trackFactory, videoProcessor);
        for (VideoSink videoSink : getSinks()) {
            rtcTrack.removeSink(videoSink);
            createCameraTrack$livekit_android_sdk_release.addRenderer(videoSink);
        }
        this.capturer = createCameraTrack$livekit_android_sdk_release.capturer;
        this.source = createCameraTrack$livekit_android_sdk_release.source;
        setRtcTrack$livekit_android_sdk_release(createCameraTrack$livekit_android_sdk_release.getRtcTrack());
        setOptions(options);
        startCapture();
        RtpSender sender$livekit_android_sdk_release = getSender$livekit_android_sdk_release();
        if (sender$livekit_android_sdk_release != null) {
            sender$livekit_android_sdk_release.setTrack(createCameraTrack$livekit_android_sdk_release.getRtcTrack(), false);
        }
    }

    public final void setCodec$livekit_android_sdk_release(String str) {
        this.codec = str;
    }

    @c
    public final void setDeviceId(String deviceId) {
        deviceId.getClass();
        restartTrack$default(this, LocalVideoTrackOptions.copy$default(getOptions(), false, deviceId, null, null, 13, null), null, 2, null);
    }

    public final void setOptions(LocalVideoTrackOptions localVideoTrackOptions) {
        localVideoTrackOptions.getClass();
        this.options.setValue(this, $$delegatedProperties[0], localVideoTrackOptions);
    }

    public final List<VideoCodec> setPublishingCodecs$livekit_android_sdk_release(List<LivekitRtc$SubscribedCodec> codecs) {
        RtpSender rtpSender;
        codecs.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "setting publishing codecs: " + codecs, new Object[0]);
        }
        if (this.codec == null && !codecs.isEmpty()) {
            List<LivekitRtc$SubscribedQuality> qualitiesList = ((LivekitRtc$SubscribedCodec) o.w0(codecs)).getQualitiesList();
            qualitiesList.getClass();
            setPublishingLayers$livekit_android_sdk_release(qualitiesList);
            return t.f33547a;
        }
        this.subscribedCodecs = codecs;
        ArrayList arrayList = new ArrayList();
        for (LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec : codecs) {
            if (m.c(this.codec, livekitRtc$SubscribedCodec.getCodec())) {
                List<LivekitRtc$SubscribedQuality> qualitiesList2 = livekitRtc$SubscribedCodec.getQualitiesList();
                qualitiesList2.getClass();
                setPublishingLayers$livekit_android_sdk_release(qualitiesList2);
            } else {
                try {
                    VideoCodec.Companion companion2 = VideoCodec.INSTANCE;
                    String codec = livekitRtc$SubscribedCodec.getCodec();
                    codec.getClass();
                    VideoCodec fromCodecName = companion2.fromCodecName(codec);
                    LKLog.Companion companion3 = LKLog.INSTANCE;
                    LoggingLevel loggingLevel = LoggingLevel.DEBUG;
                    LKLog.Companion companion4 = LKLog.INSTANCE;
                    if (loggingLevel.compareTo(companion4.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.a(null, "try setPublishingCodec for " + livekitRtc$SubscribedCodec.getCodec(), new Object[0]);
                    }
                    SimulcastTrackInfo simulcastTrackInfo = this.simulcastCodecs.get(fromCodecName);
                    if (simulcastTrackInfo != null) {
                        rtpSender = simulcastTrackInfo.getSender();
                    } else {
                        rtpSender = null;
                    }
                    if (rtpSender == null) {
                        Iterator<LivekitRtc$SubscribedQuality> it = livekitRtc$SubscribedCodec.getQualitiesList().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (it.next().getEnabled()) {
                                arrayList.add(fromCodecName);
                                break;
                            }
                        }
                    } else {
                        if (loggingLevel.compareTo(companion4.getLoggingLevel()) >= 0 && d.d() > 0) {
                            d.a(null, "try setPublishingLayersForSender " + livekitRtc$SubscribedCodec.getCodec(), new Object[0]);
                        }
                        RtpSender sender = simulcastTrackInfo.getSender();
                        sender.getClass();
                        List<LivekitRtc$SubscribedQuality> qualitiesList3 = livekitRtc$SubscribedCodec.getQualitiesList();
                        qualitiesList3.getClass();
                        setPublishingLayersForSender(sender, qualitiesList3);
                    }
                } catch (Exception unused) {
                    LKLog.Companion companion5 = LKLog.INSTANCE;
                    if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.f(null, "unknown publishing codec " + livekitRtc$SubscribedCodec.getCodec() + '!', new Object[0]);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void setPublishingLayers$livekit_android_sdk_release(List<LivekitRtc$SubscribedQuality> qualities) {
        RtpSender rtpSender;
        qualities.getClass();
        RtpTransceiver rtpTransceiver = this.transceiver;
        if (rtpTransceiver != null) {
            rtpSender = rtpTransceiver.getSender();
        } else {
            rtpSender = null;
        }
        if (rtpSender == null) {
            return;
        }
        setPublishingLayersForSender(rtpSender, qualities);
    }

    public void setRtcTrack$livekit_android_sdk_release(livekit.org.webrtc.VideoTrack videoTrack) {
        videoTrack.getClass();
        this.rtcTrack = videoTrack;
    }

    public final void setTransceiver$livekit_android_sdk_release(RtpTransceiver rtpTransceiver) {
        this.transceiver = rtpTransceiver;
    }

    public void startCapture() {
        this.capturer.startCapture(getOptions().getCaptureParams().getWidth(), getOptions().getCaptureParams().getHeight(), getOptions().getCaptureParams().getMaxFps());
    }

    @Override // io.livekit.android.room.track.VideoTrack, io.livekit.android.room.track.Track
    public void stop() {
        this.capturer.stopCapture();
        super.stop();
    }

    public void stopCapture() {
        this.capturer.stopCapture();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    public final void switchCamera(String deviceId, CameraPosition position) {
        final CameraVideoCapturer cameraVideoCapturer;
        final String str;
        VideoCapturer videoCapturer = this.capturer;
        if (videoCapturer instanceof CameraVideoCapturer) {
            cameraVideoCapturer = (CameraVideoCapturer) videoCapturer;
        } else {
            cameraVideoCapturer = null;
        }
        if (cameraVideoCapturer == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "Attempting to switch camera on a non-camera video track!", new Object[0]);
                return;
            }
            return;
        }
        final ?? obj = new Object();
        CameraCapturerUtils cameraCapturerUtils = CameraCapturerUtils.INSTANCE;
        CameraEnumerator createCameraEnumerator = cameraCapturerUtils.createCameraEnumerator(this.context);
        if (deviceId != null || position != null) {
            obj.f20559a = cameraCapturerUtils.findCamera(createCameraEnumerator, deviceId, position, false);
        }
        if (obj.f20559a == null) {
            String[] deviceNames = createCameraEnumerator.getDeviceNames();
            if (deviceNames.length < 2) {
                LKLog.Companion companion2 = LKLog.INSTANCE;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.f(null, "No available cameras to switch to!", new Object[0]);
                    return;
                }
                return;
            }
            obj.f20559a = CameraCapturerUtils.findCamera$default(cameraCapturerUtils, createCameraEnumerator, deviceNames[(n.N0(getOptions().getDeviceId(), deviceNames) + 1) % deviceNames.length], null, false, 2, null);
        }
        CameraCapturerUtils.CameraDeviceInfo cameraDeviceInfo = (CameraCapturerUtils.CameraDeviceInfo) obj.f20559a;
        if (cameraDeviceInfo != null) {
            str = cameraDeviceInfo.getDeviceId();
        } else {
            str = null;
        }
        CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler = new CameraVideoCapturer.CameraSwitchHandler() { // from class: io.livekit.android.room.track.LocalVideoTrack$switchCamera$cameraSwitchHandler$1
            @Override // livekit.org.webrtc.CameraVideoCapturer.CameraSwitchHandler
            public void onCameraSwitchDone(boolean isFrontFacing) {
                VideoCapturer videoCapturer2 = CameraVideoCapturer.this;
                if (!(videoCapturer2 instanceof CameraCapturerWithSize)) {
                    LocalVideoTrack.switchCamera$updateCameraOptions(this, str, obj);
                    return;
                }
                CameraEventsDispatchHandler cameraEventsDispatchHandler = ((CameraCapturerWithSize) videoCapturer2).getCameraEventsDispatchHandler();
                final CameraVideoCapturer cameraVideoCapturer2 = CameraVideoCapturer.this;
                final LocalVideoTrack localVideoTrack = this;
                final String str2 = str;
                final d0 d0Var = obj;
                cameraEventsDispatchHandler.registerHandler(new CameraVideoCapturer.CameraEventsHandler() { // from class: io.livekit.android.room.track.LocalVideoTrack$switchCamera$cameraSwitchHandler$1$onCameraSwitchDone$1
                    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onCameraClosed() {
                        ((CameraCapturerWithSize) CameraVideoCapturer.this).getCameraEventsDispatchHandler().unregisterHandler(this);
                    }

                    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onCameraDisconnected() {
                        ((CameraCapturerWithSize) CameraVideoCapturer.this).getCameraEventsDispatchHandler().unregisterHandler(this);
                    }

                    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onCameraError(String p02) {
                        ((CameraCapturerWithSize) CameraVideoCapturer.this).getCameraEventsDispatchHandler().unregisterHandler(this);
                    }

                    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onFirstFrameAvailable() {
                        LocalVideoTrack.switchCamera$updateCameraOptions(localVideoTrack, str2, d0Var);
                        ((CameraCapturerWithSize) CameraVideoCapturer.this).getCameraEventsDispatchHandler().unregisterHandler(this);
                    }

                    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onCameraFreezed(String p02) {
                    }

                    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
                    public void onCameraOpening(String p02) {
                    }
                });
            }

            @Override // livekit.org.webrtc.CameraVideoCapturer.CameraSwitchHandler
            public void onCameraSwitchError(String errorDescription) {
                LKLog.Companion companion3 = LKLog.INSTANCE;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.f(null, f.i("switching camera failed: ", errorDescription), new Object[0]);
                }
            }
        };
        if (obj.f20559a == null) {
            LKLog.Companion companion3 = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "No target camera found!", new Object[0]);
                return;
            }
            return;
        }
        cameraVideoCapturer.switchCamera(cameraSwitchHandler, str);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JI\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013JS\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lio/livekit/android/room/track/LocalVideoTrack$Companion;", "", "()V", "createCameraTrack", "Lio/livekit/android/room/track/LocalVideoTrack;", "peerConnectionFactory", "Llivekit/org/webrtc/PeerConnectionFactory;", "context", "Landroid/content/Context;", DiagnosticsEntry.NAME_KEY, "", "options", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "rootEglBase", "Llivekit/org/webrtc/EglBase;", "trackFactory", "Lio/livekit/android/room/track/LocalVideoTrack$Factory;", "videoProcessor", "Llivekit/org/webrtc/VideoProcessor;", "createCameraTrack$livekit_android_sdk_release", "createTrack", "capturer", "Llivekit/org/webrtc/VideoCapturer;", "createTrack$livekit_android_sdk_release", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public static /* synthetic */ LocalVideoTrack createCameraTrack$livekit_android_sdk_release$default(Companion companion, PeerConnectionFactory peerConnectionFactory, Context context, String str, LocalVideoTrackOptions localVideoTrackOptions, EglBase eglBase, Factory factory, VideoProcessor videoProcessor, int i10, Object obj) {
            VideoProcessor videoProcessor2;
            if ((i10 & 64) != 0) {
                videoProcessor2 = null;
            } else {
                videoProcessor2 = videoProcessor;
            }
            return companion.createCameraTrack$livekit_android_sdk_release(peerConnectionFactory, context, str, localVideoTrackOptions, eglBase, factory, videoProcessor2);
        }

        public static /* synthetic */ LocalVideoTrack createTrack$livekit_android_sdk_release$default(Companion companion, PeerConnectionFactory peerConnectionFactory, Context context, String str, VideoCapturer videoCapturer, LocalVideoTrackOptions localVideoTrackOptions, EglBase eglBase, Factory factory, VideoProcessor videoProcessor, int i10, Object obj) {
            LocalVideoTrackOptions localVideoTrackOptions2;
            VideoProcessor videoProcessor2;
            if ((i10 & 16) != 0) {
                localVideoTrackOptions2 = new LocalVideoTrackOptions(false, null, null, null, 15, null);
            } else {
                localVideoTrackOptions2 = localVideoTrackOptions;
            }
            if ((i10 & 128) != 0) {
                videoProcessor2 = null;
            } else {
                videoProcessor2 = videoProcessor;
            }
            return companion.createTrack$livekit_android_sdk_release(peerConnectionFactory, context, str, videoCapturer, localVideoTrackOptions2, eglBase, factory, videoProcessor2);
        }

        public final LocalVideoTrack createCameraTrack$livekit_android_sdk_release(PeerConnectionFactory peerConnectionFactory, Context context, String name, LocalVideoTrackOptions options, EglBase rootEglBase, Factory trackFactory, VideoProcessor videoProcessor) {
            peerConnectionFactory.getClass();
            context.getClass();
            name.getClass();
            options.getClass();
            rootEglBase.getClass();
            trackFactory.getClass();
            if (y5.c.a(context, "android.permission.CAMERA") == 0) {
                k createCameraCapturer = CameraCapturerUtils.INSTANCE.createCameraCapturer(context, options);
                if (createCameraCapturer != null) {
                    return createTrack$livekit_android_sdk_release(peerConnectionFactory, context, name, (VideoCapturer) createCameraCapturer.f31600a, (LocalVideoTrackOptions) createCameraCapturer.f31601b, rootEglBase, trackFactory, videoProcessor);
                }
                throw new j(0);
            }
            throw new SecurityException("Camera permissions are required to create a camera video track.");
        }

        public final LocalVideoTrack createTrack$livekit_android_sdk_release(PeerConnectionFactory peerConnectionFactory, Context context, String name, VideoCapturer capturer, LocalVideoTrackOptions options, EglBase rootEglBase, Factory trackFactory, VideoProcessor videoProcessor) {
            VideoProcessor videoProcessor2;
            CaptureDispatchObserver captureDispatchObserver;
            CapturerObserver capturerObserver;
            peerConnectionFactory.getClass();
            context.getClass();
            name.getClass();
            capturer.getClass();
            options.getClass();
            rootEglBase.getClass();
            trackFactory.getClass();
            VideoSource createVideoSource = peerConnectionFactory.createVideoSource(options.isScreencast());
            if (options.getCaptureParams().getAdaptOutputToDimensions()) {
                ScaleCropVideoProcessor scaleCropVideoProcessor = new ScaleCropVideoProcessor(options.getCaptureParams().getWidth(), options.getCaptureParams().getHeight());
                scaleCropVideoProcessor.setChildVideoProcessor(videoProcessor);
                videoProcessor2 = scaleCropVideoProcessor;
            } else {
                videoProcessor2 = videoProcessor;
            }
            createVideoSource.setVideoProcessor(videoProcessor2);
            SurfaceTextureHelper create = SurfaceTextureHelper.create("VideoCaptureThread", rootEglBase.getEglBaseContext());
            if (videoProcessor == null) {
                captureDispatchObserver = new CaptureDispatchObserver();
                CapturerObserver capturerObserver2 = createVideoSource.getCapturerObserver();
                capturerObserver2.getClass();
                captureDispatchObserver.registerObserver(capturerObserver2);
            } else {
                captureDispatchObserver = null;
            }
            if (captureDispatchObserver != null) {
                capturerObserver = captureDispatchObserver;
            } else {
                capturerObserver = createVideoSource.getCapturerObserver();
            }
            capturer.initialize(create, context, capturerObserver);
            livekit.org.webrtc.VideoTrack createVideoTrack = peerConnectionFactory.createVideoTrack(UUID.randomUUID().toString(), createVideoSource);
            createVideoTrack.getClass();
            LocalVideoTrack create2 = trackFactory.create(capturer, createVideoSource, name, options, createVideoTrack, captureDispatchObserver);
            create2.closeableManager.registerResource(createVideoTrack, new SurfaceTextureHelperCloser(create));
            return create2;
        }

        private Companion() {
        }
    }

    @Override // io.livekit.android.room.track.VideoTrack, io.livekit.android.room.track.Track
    public livekit.org.webrtc.VideoTrack getRtcTrack() {
        return this.rtcTrack;
    }

    public static /* synthetic */ void getOptions$annotations() {
    }

    public /* synthetic */ LocalVideoTrack(VideoCapturer videoCapturer, VideoSource videoSource, String str, LocalVideoTrackOptions localVideoTrackOptions, livekit.org.webrtc.VideoTrack videoTrack, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, DefaultsManager defaultsManager, Factory factory, CaptureDispatchObserver captureDispatchObserver, RTCThreadToken rTCThreadToken, int i10, kotlin.jvm.internal.f fVar) {
        this(videoCapturer, videoSource, str, localVideoTrackOptions, videoTrack, peerConnectionFactory, context, eglBase, defaultsManager, factory, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : captureDispatchObserver, rTCThreadToken);
    }
}
