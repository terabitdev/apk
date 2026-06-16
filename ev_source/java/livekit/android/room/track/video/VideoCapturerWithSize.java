package io.livekit.android.room.track.video;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.VideoCapturer;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/video/VideoCapturerWithSize;", "Llivekit/org/webrtc/VideoCapturer;", "findCaptureFormat", "Llivekit/org/webrtc/Size;", "width", "", "height", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface VideoCapturerWithSize extends VideoCapturer {
    Size findCaptureFormat(int width, int height);
}
