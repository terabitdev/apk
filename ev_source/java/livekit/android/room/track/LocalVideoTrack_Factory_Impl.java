package io.livekit.android.room.track;

import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.room.track.video.CaptureDispatchObserver;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoSource;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class LocalVideoTrack_Factory_Impl implements LocalVideoTrack.Factory {
    private final C0068LocalVideoTrack_Factory delegateFactory;

    public LocalVideoTrack_Factory_Impl(C0068LocalVideoTrack_Factory c0068LocalVideoTrack_Factory) {
        this.delegateFactory = c0068LocalVideoTrack_Factory;
    }

    @Override // io.livekit.android.room.track.LocalVideoTrack.Factory
    public LocalVideoTrack create(VideoCapturer videoCapturer, VideoSource videoSource, String str, LocalVideoTrackOptions localVideoTrackOptions, livekit.org.webrtc.VideoTrack videoTrack, CaptureDispatchObserver captureDispatchObserver) {
        return this.delegateFactory.get(videoCapturer, videoSource, str, localVideoTrackOptions, videoTrack, captureDispatchObserver);
    }

    public static rn.a create(C0068LocalVideoTrack_Factory c0068LocalVideoTrack_Factory) {
        return d.a(new LocalVideoTrack_Factory_Impl(c0068LocalVideoTrack_Factory));
    }
}
