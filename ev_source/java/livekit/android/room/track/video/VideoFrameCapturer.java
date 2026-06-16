package io.livekit.android.room.track.video;

import android.content.Context;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.SurfaceTextureHelper;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoFrame;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/livekit/android/room/track/video/VideoFrameCapturer;", "Llivekit/org/webrtc/VideoCapturer;", "<init>", "()V", "Llivekit/org/webrtc/SurfaceTextureHelper;", "helper", "Landroid/content/Context;", "context", "Llivekit/org/webrtc/CapturerObserver;", "capturerObserver", "Lsn/z;", "initialize", "(Llivekit/org/webrtc/SurfaceTextureHelper;Landroid/content/Context;Llivekit/org/webrtc/CapturerObserver;)V", "", "width", "height", "framerate", "startCapture", "(III)V", "stopCapture", "changeCaptureFormat", "dispose", "", "isScreencast", "()Z", "Llivekit/org/webrtc/VideoFrame;", "frame", "pushVideoFrame", "(Llivekit/org/webrtc/VideoFrame;)V", "Llivekit/org/webrtc/CapturerObserver;", "getCapturerObserver", "()Llivekit/org/webrtc/CapturerObserver;", "setCapturerObserver", "(Llivekit/org/webrtc/CapturerObserver;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class VideoFrameCapturer implements VideoCapturer {
    private CapturerObserver capturerObserver;

    public final CapturerObserver getCapturerObserver() {
        return this.capturerObserver;
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper helper, Context context, CapturerObserver capturerObserver) {
        helper.getClass();
        capturerObserver.getClass();
        this.capturerObserver = capturerObserver;
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    public final void pushVideoFrame(VideoFrame frame) {
        frame.getClass();
        CapturerObserver capturerObserver = this.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(frame);
        }
    }

    public final void setCapturerObserver(CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void startCapture(int width, int height, int framerate) {
        CapturerObserver capturerObserver = this.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStarted(true);
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void stopCapture() {
        CapturerObserver capturerObserver = this.capturerObserver;
        if (capturerObserver != null) {
            capturerObserver.onCapturerStopped();
        }
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void dispose() {
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public void changeCaptureFormat(int width, int height, int framerate) {
    }
}
