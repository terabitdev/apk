package io.livekit.android.room.track;

import io.livekit.android.room.track.LocalScreencastVideoTrack;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoSource;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class LocalScreencastVideoTrack_Factory_Impl implements LocalScreencastVideoTrack.Factory {
    private final C0067LocalScreencastVideoTrack_Factory delegateFactory;

    public LocalScreencastVideoTrack_Factory_Impl(C0067LocalScreencastVideoTrack_Factory c0067LocalScreencastVideoTrack_Factory) {
        this.delegateFactory = c0067LocalScreencastVideoTrack_Factory;
    }

    @Override // io.livekit.android.room.track.LocalScreencastVideoTrack.Factory
    public LocalScreencastVideoTrack create(VideoCapturer videoCapturer, VideoSource videoSource, String str, LocalVideoTrackOptions localVideoTrackOptions, livekit.org.webrtc.VideoTrack videoTrack, LocalScreencastVideoTrack.MediaProjectionCallback mediaProjectionCallback) {
        return this.delegateFactory.get(videoCapturer, videoSource, str, localVideoTrackOptions, videoTrack, mediaProjectionCallback);
    }

    public static rn.a create(C0067LocalScreencastVideoTrack_Factory c0067LocalScreencastVideoTrack_Factory) {
        return d.a(new LocalScreencastVideoTrack_Factory_Impl(c0067LocalScreencastVideoTrack_Factory));
    }
}
