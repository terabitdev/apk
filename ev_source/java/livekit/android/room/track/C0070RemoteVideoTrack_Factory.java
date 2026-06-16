package io.livekit.android.room.track;

import fr.z;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import livekit.org.webrtc.RtpReceiver;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.track.RemoteVideoTrack_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0070RemoteVideoTrack_Factory {
    private final rn.a dispatcherProvider;
    private final rn.a rtcThreadTokenProvider;

    public C0070RemoteVideoTrack_Factory(rn.a aVar, rn.a aVar2) {
        this.dispatcherProvider = aVar;
        this.rtcThreadTokenProvider = aVar2;
    }

    public static C0070RemoteVideoTrack_Factory create(rn.a aVar, rn.a aVar2) {
        return new C0070RemoteVideoTrack_Factory(aVar, aVar2);
    }

    public static RemoteVideoTrack newInstance(String str, livekit.org.webrtc.VideoTrack videoTrack, boolean z6, z zVar, RtpReceiver rtpReceiver, RTCThreadToken rTCThreadToken) {
        return new RemoteVideoTrack(str, videoTrack, z6, zVar, rtpReceiver, rTCThreadToken);
    }

    public RemoteVideoTrack get(String str, livekit.org.webrtc.VideoTrack videoTrack, boolean z6, RtpReceiver rtpReceiver) {
        return newInstance(str, videoTrack, z6, (z) this.dispatcherProvider.get(), rtpReceiver, (RTCThreadToken) this.rtcThreadTokenProvider.get());
    }
}
