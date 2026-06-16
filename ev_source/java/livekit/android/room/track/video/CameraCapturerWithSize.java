package io.livekit.android.room.track.video;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/video/CameraCapturerWithSize;", "Lio/livekit/android/room/track/video/VideoCapturerWithSize;", "cameraEventsDispatchHandler", "Lio/livekit/android/room/track/video/CameraEventsDispatchHandler;", "(Lio/livekit/android/room/track/video/CameraEventsDispatchHandler;)V", "getCameraEventsDispatchHandler", "()Lio/livekit/android/room/track/video/CameraEventsDispatchHandler;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class CameraCapturerWithSize implements VideoCapturerWithSize {
    private final CameraEventsDispatchHandler cameraEventsDispatchHandler;

    public CameraCapturerWithSize(CameraEventsDispatchHandler cameraEventsDispatchHandler) {
        cameraEventsDispatchHandler.getClass();
        this.cameraEventsDispatchHandler = cameraEventsDispatchHandler;
    }

    public final CameraEventsDispatchHandler getCameraEventsDispatchHandler() {
        return this.cameraEventsDispatchHandler;
    }
}
