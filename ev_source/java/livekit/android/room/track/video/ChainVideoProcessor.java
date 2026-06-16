package io.livekit.android.room.track.video;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoProcessor;
import livekit.org.webrtc.VideoSink;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R.\u0010\u0017\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/livekit/android/room/track/video/ChainVideoProcessor;", "Llivekit/org/webrtc/VideoProcessor;", "<init>", "()V", "", "started", "Lsn/z;", "onCapturerStarted", "(Z)V", "onCapturerStopped", "Llivekit/org/webrtc/VideoSink;", "videoSink", "setSink", "(Llivekit/org/webrtc/VideoSink;)V", "Llivekit/org/webrtc/VideoFrame;", "frame", "continueChain", "(Llivekit/org/webrtc/VideoFrame;)V", "<set-?>", "Llivekit/org/webrtc/VideoSink;", "getVideoSink", "()Llivekit/org/webrtc/VideoSink;", "value", "childVideoProcessor", "Llivekit/org/webrtc/VideoProcessor;", "getChildVideoProcessor", "()Llivekit/org/webrtc/VideoProcessor;", "setChildVideoProcessor", "(Llivekit/org/webrtc/VideoProcessor;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class ChainVideoProcessor implements VideoProcessor {
    private VideoProcessor childVideoProcessor;
    private VideoSink videoSink;

    public final void continueChain(VideoFrame frame) {
        frame.getClass();
        VideoProcessor videoProcessor = this.childVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.onFrameCaptured(frame);
            return;
        }
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onFrame(frame);
        }
    }

    public final VideoProcessor getChildVideoProcessor() {
        return this.childVideoProcessor;
    }

    public final VideoSink getVideoSink() {
        return this.videoSink;
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean started) {
        VideoProcessor videoProcessor = this.childVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.onCapturerStarted(started);
        }
    }

    @Override // livekit.org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        VideoProcessor videoProcessor = this.childVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.onCapturerStopped();
        }
    }

    public final void setChildVideoProcessor(VideoProcessor videoProcessor) {
        if (videoProcessor != null) {
            videoProcessor.setSink(this.videoSink);
        }
        this.childVideoProcessor = videoProcessor;
    }

    @Override // livekit.org.webrtc.VideoProcessor
    public final void setSink(VideoSink videoSink) {
        VideoProcessor videoProcessor = this.childVideoProcessor;
        if (videoProcessor != null) {
            videoProcessor.setSink(videoSink);
        }
        this.videoSink = videoSink;
    }
}
