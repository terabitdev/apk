package io.livekit.android.room.track.video;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.VideoFrame;
import livekit.org.webrtc.VideoProcessor;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR(\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/livekit/android/room/track/video/NoDropVideoProcessor;", "Llivekit/org/webrtc/VideoProcessor;", "<init>", "()V", "Llivekit/org/webrtc/VideoFrame;", "frame", "Llivekit/org/webrtc/VideoProcessor$FrameAdaptationParameters;", "parameters", "Lsn/z;", "onFrameCaptured", "(Llivekit/org/webrtc/VideoFrame;Llivekit/org/webrtc/VideoProcessor$FrameAdaptationParameters;)V", "", "allowDropping", "Z", "getAllowDropping", "()Z", "setAllowDropping", "(Z)V", "getAllowDropping$annotations", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class NoDropVideoProcessor implements VideoProcessor {
    private boolean allowDropping;

    public final boolean getAllowDropping() {
        return this.allowDropping;
    }

    @Override // livekit.org.webrtc.VideoProcessor
    public void onFrameCaptured(VideoFrame frame, VideoProcessor.FrameAdaptationParameters parameters) {
        frame.getClass();
        parameters.getClass();
        if (this.allowDropping) {
            super.onFrameCaptured(frame, parameters);
            return;
        }
        VideoFrame applyFrameAdaptationParameters = VideoProcessor.applyFrameAdaptationParameters(frame, parameters);
        if (applyFrameAdaptationParameters != null) {
            onFrameCaptured(applyFrameAdaptationParameters);
            applyFrameAdaptationParameters.release();
        } else {
            onFrameCaptured(frame);
        }
    }

    public final void setAllowDropping(boolean z6) {
        this.allowDropping = z6;
    }

    public static /* synthetic */ void getAllowDropping$annotations() {
    }
}
