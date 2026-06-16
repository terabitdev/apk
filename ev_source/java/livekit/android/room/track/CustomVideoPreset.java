package io.livekit.android.room.track;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lio/livekit/android/room/track/CustomVideoPreset;", "Lio/livekit/android/room/track/VideoPreset;", "capture", "Lio/livekit/android/room/track/VideoCaptureParameter;", "encoding", "Lio/livekit/android/room/track/VideoEncoding;", "(Lio/livekit/android/room/track/VideoCaptureParameter;Lio/livekit/android/room/track/VideoEncoding;)V", "getCapture", "()Lio/livekit/android/room/track/VideoCaptureParameter;", "getEncoding", "()Lio/livekit/android/room/track/VideoEncoding;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class CustomVideoPreset implements VideoPreset {
    private final VideoCaptureParameter capture;
    private final VideoEncoding encoding;

    public CustomVideoPreset(VideoCaptureParameter videoCaptureParameter, VideoEncoding videoEncoding) {
        videoCaptureParameter.getClass();
        videoEncoding.getClass();
        this.capture = videoCaptureParameter;
        this.encoding = videoEncoding;
    }

    public static /* synthetic */ CustomVideoPreset copy$default(CustomVideoPreset customVideoPreset, VideoCaptureParameter videoCaptureParameter, VideoEncoding videoEncoding, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            videoCaptureParameter = customVideoPreset.capture;
        }
        if ((i10 & 2) != 0) {
            videoEncoding = customVideoPreset.encoding;
        }
        return customVideoPreset.copy(videoCaptureParameter, videoEncoding);
    }

    /* renamed from: component1, reason: from getter */
    public final VideoCaptureParameter getCapture() {
        return this.capture;
    }

    /* renamed from: component2, reason: from getter */
    public final VideoEncoding getEncoding() {
        return this.encoding;
    }

    public final CustomVideoPreset copy(VideoCaptureParameter capture, VideoEncoding encoding) {
        capture.getClass();
        encoding.getClass();
        return new CustomVideoPreset(capture, encoding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomVideoPreset)) {
            return false;
        }
        CustomVideoPreset customVideoPreset = (CustomVideoPreset) other;
        if (m.c(this.capture, customVideoPreset.capture) && m.c(this.encoding, customVideoPreset.encoding)) {
            return true;
        }
        return false;
    }

    @Override // io.livekit.android.room.track.VideoPreset
    public VideoCaptureParameter getCapture() {
        return this.capture;
    }

    @Override // io.livekit.android.room.track.VideoPreset
    public VideoEncoding getEncoding() {
        return this.encoding;
    }

    public int hashCode() {
        return this.encoding.hashCode() + (this.capture.hashCode() * 31);
    }

    public String toString() {
        return "CustomVideoPreset(capture=" + this.capture + ", encoding=" + this.encoding + ')';
    }
}
