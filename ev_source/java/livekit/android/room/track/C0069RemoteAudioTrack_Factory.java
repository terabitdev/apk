package io.livekit.android.room.track;

import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import livekit.org.webrtc.RtpReceiver;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.livekit.android.room.track.RemoteAudioTrack_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0069RemoteAudioTrack_Factory {
    private final rn.a rtcThreadTokenProvider;

    public C0069RemoteAudioTrack_Factory(rn.a aVar) {
        this.rtcThreadTokenProvider = aVar;
    }

    public static C0069RemoteAudioTrack_Factory create(rn.a aVar) {
        return new C0069RemoteAudioTrack_Factory(aVar);
    }

    public static RemoteAudioTrack newInstance(String str, livekit.org.webrtc.AudioTrack audioTrack, RtpReceiver rtpReceiver, RTCThreadToken rTCThreadToken) {
        return new RemoteAudioTrack(str, audioTrack, rtpReceiver, rTCThreadToken);
    }

    public RemoteAudioTrack get(String str, livekit.org.webrtc.AudioTrack audioTrack, RtpReceiver rtpReceiver) {
        return newInstance(str, audioTrack, rtpReceiver, (RTCThreadToken) this.rtcThreadTokenProvider.get());
    }
}
