package io.livekit.android.room.track;

import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lio/livekit/android/room/track/VideoPreset169;", "", "Lio/livekit/android/room/track/VideoPreset;", "capture", "Lio/livekit/android/room/track/VideoCaptureParameter;", "encoding", "Lio/livekit/android/room/track/VideoEncoding;", "(Ljava/lang/String;ILio/livekit/android/room/track/VideoCaptureParameter;Lio/livekit/android/room/track/VideoEncoding;)V", "getCapture", "()Lio/livekit/android/room/track/VideoCaptureParameter;", "getEncoding", "()Lio/livekit/android/room/track/VideoEncoding;", "H90", "H180", "H216", "H360", "H540", "H720", "H1080", "H1440", "H2160", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VideoPreset169 implements VideoPreset {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ VideoPreset169[] $VALUES;
    private final VideoCaptureParameter capture;
    private final VideoEncoding encoding;
    public static final VideoPreset169 H90 = new VideoPreset169("H90", 0, new VideoCaptureParameter(160, 90, 15, false, 8, null), new VideoEncoding(90000, 15));
    public static final VideoPreset169 H180 = new VideoPreset169("H180", 1, new VideoCaptureParameter(320, SensibleDefaults.X_OFFSET, 15, false, 8, null), new VideoEncoding(160000, 15));
    public static final VideoPreset169 H216 = new VideoPreset169("H216", 2, new VideoCaptureParameter(384, 216, 15, false, 8, null), new VideoEncoding(180000, 15));
    public static final VideoPreset169 H360 = new VideoPreset169("H360", 3, new VideoCaptureParameter(640, 360, 30, false, 8, null), new VideoEncoding(450000, 30));
    public static final VideoPreset169 H540 = new VideoPreset169("H540", 4, new VideoCaptureParameter(960, 540, 30, false, 8, null), new VideoEncoding(800000, 30));
    public static final VideoPreset169 H720 = new VideoPreset169("H720", 5, new VideoCaptureParameter(1280, 720, 30, false, 8, null), new VideoEncoding(1700000, 30));
    public static final VideoPreset169 H1080 = new VideoPreset169("H1080", 6, new VideoCaptureParameter(1920, 1080, 30, false, 8, null), new VideoEncoding(3000000, 30));
    public static final VideoPreset169 H1440 = new VideoPreset169("H1440", 7, new VideoCaptureParameter(2560, 1440, 30, false, 8, null), new VideoEncoding(5000000, 30));
    public static final VideoPreset169 H2160 = new VideoPreset169("H2160", 8, new VideoCaptureParameter(3840, 2160, 30, false, 8, null), new VideoEncoding(8000000, 30));

    private static final /* synthetic */ VideoPreset169[] $values() {
        return new VideoPreset169[]{H90, H180, H216, H360, H540, H720, H1080, H1440, H2160};
    }

    static {
        VideoPreset169[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private VideoPreset169(String str, int i10, VideoCaptureParameter videoCaptureParameter, VideoEncoding videoEncoding) {
        this.capture = videoCaptureParameter;
        this.encoding = videoEncoding;
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static VideoPreset169 valueOf(String str) {
        return (VideoPreset169) Enum.valueOf(VideoPreset169.class, str);
    }

    public static VideoPreset169[] values() {
        return (VideoPreset169[]) $VALUES.clone();
    }

    @Override // io.livekit.android.room.track.VideoPreset
    public VideoCaptureParameter getCapture() {
        return this.capture;
    }

    @Override // io.livekit.android.room.track.VideoPreset
    public VideoEncoding getEncoding() {
        return this.encoding;
    }
}
