package io.livekit.android.room.util;

import ae.l;
import as.m9;
import as.p9;
import ig.f;
import io.livekit.android.room.track.CustomVideoPreset;
import io.livekit.android.room.track.ScreenSharePresets;
import io.livekit.android.room.track.VideoCaptureParameter;
import io.livekit.android.room.track.VideoEncoding;
import io.livekit.android.room.track.VideoPreset;
import io.livekit.android.room.track.VideoPreset169;
import io.livekit.android.room.track.VideoPreset43;
import io.livekit.android.room.track.video.ScalabilityMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$VideoLayer;
import livekit.org.webrtc.RtpParameters;
import no.g;
import sn.k;
import tn.o;
import tn.p;
import tn.y;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020-0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,¨\u00063"}, d2 = {"Lio/livekit/android/room/util/EncodingUtils;", "", "<init>", "()V", "", "isScreenShare", "", "width", "height", "Lio/livekit/android/room/track/VideoEncoding;", "determineAppropriateEncoding", "(ZII)Lio/livekit/android/room/track/VideoEncoding;", "", "Lio/livekit/android/room/track/VideoPreset;", "computeSuggestedPresets", "(ZII)Ljava/util/List;", "originalEncoding", "defaultSimulcastLayers", "(ZIILio/livekit/android/room/track/VideoEncoding;)Ljava/util/List;", "computeDefaultScreenshareSimulcastLayers", "(IILio/livekit/android/room/track/VideoEncoding;)Ljava/util/List;", "trackWidth", "trackHeight", "Llivekit/org/webrtc/RtpParameters$Encoding;", "encodings", "isSVC", "Llivekit/LivekitModels$VideoLayer;", "videoLayersFromEncodings", "(IILjava/util/List;Z)Ljava/util/List;", "", "rid", "Las/p9;", "videoQualityForRid", "(Ljava/lang/String;)Las/p9;", "quality", "ridForVideoQuality", "(Las/p9;)Ljava/lang/String;", "", "VIDEO_RIDS", "[Ljava/lang/String;", "getVIDEO_RIDS", "()[Ljava/lang/String;", "Lio/livekit/android/room/track/ScreenSharePresets;", "SCREENSHARE_PRESETS", "Ljava/util/List;", "Lio/livekit/android/room/track/VideoPreset169;", "PRESETS_16_9", "Lio/livekit/android/room/track/VideoPreset43;", "PRESETS_4_3", "DEFAULT_SIMULCAST_LAYERS_169", "DEFAULT_SIMULCAST_LAYERS_43", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EncodingUtils {
    private static final List<VideoPreset169> DEFAULT_SIMULCAST_LAYERS_169;
    private static final List<VideoPreset43> DEFAULT_SIMULCAST_LAYERS_43;
    private static final List<VideoPreset169> PRESETS_16_9;
    private static final List<VideoPreset43> PRESETS_4_3;
    public static final EncodingUtils INSTANCE = new EncodingUtils();
    private static final String[] VIDEO_RIDS = {"q", "h", "f"};
    private static final List<ScreenSharePresets> SCREENSHARE_PRESETS = f.I(ScreenSharePresets.H360_FPS3, ScreenSharePresets.H720_FPS5, ScreenSharePresets.H720_FPS15, ScreenSharePresets.H1080_FPS15, ScreenSharePresets.H1080_FPS30);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[p9.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        VideoPreset169 videoPreset169 = VideoPreset169.H90;
        VideoPreset169 videoPreset1692 = VideoPreset169.H180;
        VideoPreset169 videoPreset1693 = VideoPreset169.H216;
        VideoPreset169 videoPreset1694 = VideoPreset169.H360;
        PRESETS_16_9 = f.I(videoPreset169, videoPreset1692, videoPreset1693, videoPreset1694, VideoPreset169.H540, VideoPreset169.H720, VideoPreset169.H1080, VideoPreset169.H1440, VideoPreset169.H2160);
        VideoPreset43 videoPreset43 = VideoPreset43.H120;
        VideoPreset43 videoPreset432 = VideoPreset43.H180;
        VideoPreset43 videoPreset433 = VideoPreset43.H240;
        VideoPreset43 videoPreset434 = VideoPreset43.H360;
        PRESETS_4_3 = f.I(videoPreset43, videoPreset432, videoPreset433, videoPreset434, VideoPreset43.H480, VideoPreset43.H540, VideoPreset43.H720, VideoPreset43.H1080, VideoPreset43.H1440);
        DEFAULT_SIMULCAST_LAYERS_169 = f.I(videoPreset1692, videoPreset1694);
        DEFAULT_SIMULCAST_LAYERS_43 = f.I(videoPreset432, videoPreset434);
    }

    private EncodingUtils() {
    }

    public final List<VideoPreset> computeDefaultScreenshareSimulcastLayers(int width, int height, VideoEncoding originalEncoding) {
        originalEncoding.getClass();
        List<k> H = f.H(new k(2, 3));
        ArrayList arrayList = new ArrayList(p.a0(H, 10));
        for (k kVar : H) {
            int intValue = ((Number) kVar.f31600a).intValue();
            int intValue2 = ((Number) kVar.f31601b).intValue();
            arrayList.add(new CustomVideoPreset(new VideoCaptureParameter(width / intValue, height / intValue, intValue2, false), new VideoEncoding(originalEncoding.getMaxBitrate() / ((originalEncoding.getMaxFps() / intValue2) * a.y((float) Math.pow(intValue, 2))), intValue2)));
        }
        return arrayList;
    }

    public final List<VideoPreset> computeSuggestedPresets(boolean isScreenShare, int width, int height) {
        if (isScreenShare) {
            return SCREENSHARE_PRESETS;
        }
        float max = Math.max(width, height) / Math.min(width, height);
        if (Math.abs(max - 1.7777778f) < Math.abs(max - 1.3333334f)) {
            return PRESETS_16_9;
        }
        return PRESETS_4_3;
    }

    public final List<VideoPreset> defaultSimulcastLayers(boolean isScreenShare, int width, int height, VideoEncoding originalEncoding) {
        originalEncoding.getClass();
        if (isScreenShare) {
            return computeDefaultScreenshareSimulcastLayers(width, height, originalEncoding);
        }
        float max = Math.max(width, height) / Math.min(width, height);
        if (Math.abs(max - 1.7777778f) < Math.abs(max - 1.3333334f)) {
            return DEFAULT_SIMULCAST_LAYERS_169;
        }
        return DEFAULT_SIMULCAST_LAYERS_43;
    }

    public final VideoEncoding determineAppropriateEncoding(boolean isScreenShare, int width, int height) {
        Object obj;
        List<VideoPreset> computeSuggestedPresets = computeSuggestedPresets(isScreenShare, width, height);
        int max = Math.max(width, height);
        Iterator<T> it = computeSuggestedPresets.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((VideoPreset) obj).getCapture().getWidth() >= max) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        VideoPreset videoPreset = (VideoPreset) obj;
        if (videoPreset == null) {
            videoPreset = (VideoPreset) o.G0(computeSuggestedPresets);
        }
        return videoPreset.getEncoding();
    }

    public final String[] getVIDEO_RIDS() {
        return VIDEO_RIDS;
    }

    public final String ridForVideoQuality(p9 quality) {
        quality.getClass();
        int ordinal = quality.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return null;
                }
                return "f";
            }
            return "h";
        }
        return "q";
    }

    public final List<LivekitModels$VideoLayer> videoLayersFromEncodings(int trackWidth, int trackHeight, List<? extends RtpParameters.Encoding> encodings, boolean isSVC) {
        int intValue;
        encodings.getClass();
        boolean isEmpty = encodings.isEmpty();
        p9 p9Var = p9.HIGH;
        if (isEmpty) {
            m9 newBuilder = LivekitModels$VideoLayer.newBuilder();
            newBuilder.f(trackWidth);
            newBuilder.c(trackHeight);
            newBuilder.d(p9Var);
            newBuilder.b(0);
            newBuilder.e();
            return f.H(newBuilder.build());
        }
        if (isSVC) {
            String str = ((RtpParameters.Encoding) o.w0(encodings)).scalabilityMode;
            str.getClass();
            ScalabilityMode parseFromString = ScalabilityMode.INSTANCE.parseFromString(str);
            Integer num = ((RtpParameters.Encoding) o.w0(encodings)).maxBitrateBps;
            if (num == null) {
                num = 0;
            }
            int intValue2 = num.intValue();
            g f02 = l.f0(0, parseFromString.getSpatial());
            ArrayList arrayList = new ArrayList(p.a0(f02, 10));
            Iterator it = f02.iterator();
            while (((no.f) it).f24561c) {
                int nextInt = ((y) it).nextInt();
                m9 newBuilder2 = LivekitModels$VideoLayer.newBuilder();
                double d10 = 2.0f;
                double d11 = nextInt;
                newBuilder2.f(a.y((float) Math.ceil(trackWidth / ((float) Math.pow(d10, d11)))));
                newBuilder2.c(a.y((float) Math.ceil(trackHeight / ((float) Math.pow(d10, d11)))));
                newBuilder2.d(p9.a(p9Var.getNumber() - nextInt));
                newBuilder2.b(a.y((float) Math.ceil(intValue2 / ((float) Math.pow(3.0f, d11)))));
                newBuilder2.e();
                arrayList.add((LivekitModels$VideoLayer) newBuilder2.build());
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(p.a0(encodings, 10));
        for (RtpParameters.Encoding encoding : encodings) {
            Double d12 = encoding.scaleResolutionDownBy;
            if (d12 == null) {
                d12 = Double.valueOf(1.0d);
            }
            double doubleValue = d12.doubleValue();
            EncodingUtils encodingUtils = INSTANCE;
            String str2 = encoding.rid;
            if (str2 == null) {
                str2 = "";
            }
            p9 videoQualityForRid = encodingUtils.videoQualityForRid(str2);
            if (videoQualityForRid == p9.UNRECOGNIZED && encodings.size() == 1) {
                videoQualityForRid = p9Var;
            }
            m9 newBuilder3 = LivekitModels$VideoLayer.newBuilder();
            newBuilder3.f((int) (trackWidth / doubleValue));
            newBuilder3.c((int) (trackHeight / doubleValue));
            newBuilder3.d(videoQualityForRid);
            Integer num2 = encoding.maxBitrateBps;
            if (num2 == null) {
                intValue = 0;
            } else {
                intValue = num2.intValue();
            }
            newBuilder3.b(intValue);
            newBuilder3.e();
            arrayList2.add((LivekitModels$VideoLayer) newBuilder3.build());
        }
        return arrayList2;
    }

    public final p9 videoQualityForRid(String rid) {
        rid.getClass();
        int hashCode = rid.hashCode();
        if (hashCode != 102) {
            if (hashCode != 104) {
                if (hashCode == 113 && rid.equals("q")) {
                    return p9.LOW;
                }
            } else if (rid.equals("h")) {
                return p9.MEDIUM;
            }
        } else if (rid.equals("f")) {
            return p9.HIGH;
        }
        return p9.UNRECOGNIZED;
    }
}
