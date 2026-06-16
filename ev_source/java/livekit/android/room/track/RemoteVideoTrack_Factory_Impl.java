package io.livekit.android.room.track;

import io.livekit.android.room.track.RemoteVideoTrack;
import livekit.org.webrtc.RtpReceiver;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RemoteVideoTrack_Factory_Impl implements RemoteVideoTrack.Factory {
    private final C0070RemoteVideoTrack_Factory delegateFactory;

    public RemoteVideoTrack_Factory_Impl(C0070RemoteVideoTrack_Factory c0070RemoteVideoTrack_Factory) {
        this.delegateFactory = c0070RemoteVideoTrack_Factory;
    }

    public static rn.a create(C0070RemoteVideoTrack_Factory c0070RemoteVideoTrack_Factory) {
        return d.a(new RemoteVideoTrack_Factory_Impl(c0070RemoteVideoTrack_Factory));
    }

    @Override // io.livekit.android.room.track.RemoteVideoTrack.Factory
    public RemoteVideoTrack create(String str, livekit.org.webrtc.VideoTrack videoTrack, boolean z6, RtpReceiver rtpReceiver) {
        return this.delegateFactory.get(str, videoTrack, z6, rtpReceiver);
    }
}
