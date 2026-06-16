package io.livekit.android.room.track;

import j0.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.RtpParameters;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u001c\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/livekit/android/room/track/VideoEncoding;", "", "maxBitrate", "", "maxFps", "(II)V", "getMaxBitrate", "()I", "getMaxFps", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toRtpEncoding", "Llivekit/org/webrtc/RtpParameters$Encoding;", "rid", "", "scaleDownBy", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class VideoEncoding {
    private final int maxBitrate;
    private final int maxFps;

    public VideoEncoding(int i10, int i11) {
        this.maxBitrate = i10;
        this.maxFps = i11;
    }

    public static /* synthetic */ VideoEncoding copy$default(VideoEncoding videoEncoding, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = videoEncoding.maxBitrate;
        }
        if ((i12 & 2) != 0) {
            i11 = videoEncoding.maxFps;
        }
        return videoEncoding.copy(i10, i11);
    }

    public static /* synthetic */ RtpParameters.Encoding toRtpEncoding$default(VideoEncoding videoEncoding, String str, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            d10 = 1.0d;
        }
        return videoEncoding.toRtpEncoding(str, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxBitrate() {
        return this.maxBitrate;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxFps() {
        return this.maxFps;
    }

    public final VideoEncoding copy(int maxBitrate, int maxFps) {
        return new VideoEncoding(maxBitrate, maxFps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoEncoding)) {
            return false;
        }
        VideoEncoding videoEncoding = (VideoEncoding) other;
        if (this.maxBitrate == videoEncoding.maxBitrate && this.maxFps == videoEncoding.maxFps) {
            return true;
        }
        return false;
    }

    public final int getMaxBitrate() {
        return this.maxBitrate;
    }

    public final int getMaxFps() {
        return this.maxFps;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxFps) + (Integer.hashCode(this.maxBitrate) * 31);
    }

    public final RtpParameters.Encoding toRtpEncoding(String rid, double scaleDownBy) {
        RtpParameters.Encoding encoding = new RtpParameters.Encoding(rid, true, Double.valueOf(scaleDownBy));
        encoding.numTemporalLayers = 1;
        encoding.maxBitrateBps = Integer.valueOf(this.maxBitrate);
        encoding.maxFramerate = Integer.valueOf(this.maxFps);
        if (scaleDownBy == 1.0d) {
            encoding.networkPriority = 3;
            encoding.bitratePriority = 4.0d;
            return encoding;
        }
        encoding.networkPriority = 1;
        encoding.bitratePriority = 1.0d;
        return encoding;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoding(maxBitrate=");
        sb.append(this.maxBitrate);
        sb.append(", maxFps=");
        return c.m(sb, this.maxFps, ')');
    }
}
