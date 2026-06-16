package io.livekit.android.room.track.video;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.VideoFrame;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/livekit/android/room/track/video/ScaleCropVideoProcessor;", "Lio/livekit/android/room/track/video/ChainVideoProcessor;", "", "targetWidth", "targetHeight", "<init>", "(II)V", "Llivekit/org/webrtc/VideoFrame;", "frame", "Lsn/z;", "onFrameCaptured", "(Llivekit/org/webrtc/VideoFrame;)V", TokenNames.I, "getTargetWidth", "()I", "setTargetWidth", "(I)V", "getTargetHeight", "setTargetHeight", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ScaleCropVideoProcessor extends ChainVideoProcessor {
    private int targetHeight;
    private int targetWidth;

    public ScaleCropVideoProcessor(int i10, int i11) {
        this.targetWidth = i10;
        this.targetHeight = i11;
    }

    public final int getTargetHeight() {
        return this.targetHeight;
    }

    public final int getTargetWidth() {
        return this.targetWidth;
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame frame) {
        int x10;
        int i10;
        int i11;
        int i12;
        frame.getClass();
        if (frame.getRotatedWidth() == this.targetWidth && frame.getRotatedHeight() == this.targetHeight) {
            continueChain(frame);
            return;
        }
        int width = frame.getBuffer().getWidth();
        int height = frame.getBuffer().getHeight();
        int i13 = this.targetWidth;
        if (i13 <= width && (x10 = this.targetHeight) <= height) {
            i10 = i13;
        } else {
            double max = Math.max(i13 / width, this.targetHeight / height);
            int x11 = jo.a.x(this.targetWidth / max);
            x10 = jo.a.x(this.targetHeight / max);
            i10 = x11;
        }
        int i14 = x10;
        double d10 = width;
        double d11 = height;
        double d12 = i10 / i14;
        if (d10 / d11 > d12) {
            i12 = height;
            i11 = jo.a.x(d11 * d12);
        } else {
            int x12 = jo.a.x(d10 / d12);
            i11 = width;
            i12 = x12;
        }
        VideoFrame videoFrame = new VideoFrame(frame.getBuffer().cropAndScale((width - i11) / 2, (height - i12) / 2, i11, i12, i10, i14), frame.getRotation(), frame.getTimestampNs());
        continueChain(videoFrame);
        videoFrame.release();
    }

    public final void setTargetHeight(int i10) {
        this.targetHeight = i10;
    }

    public final void setTargetWidth(int i10) {
        this.targetWidth = i10;
    }
}
