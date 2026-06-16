package io.livekit.android.room.track;

import io.livekit.android.room.track.RemoteAudioTrack;
import livekit.org.webrtc.RtpReceiver;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RemoteAudioTrack_Factory_Impl implements RemoteAudioTrack.Factory {
    private final C0069RemoteAudioTrack_Factory delegateFactory;

    public RemoteAudioTrack_Factory_Impl(C0069RemoteAudioTrack_Factory c0069RemoteAudioTrack_Factory) {
        this.delegateFactory = c0069RemoteAudioTrack_Factory;
    }

    public static rn.a create(C0069RemoteAudioTrack_Factory c0069RemoteAudioTrack_Factory) {
        return d.a(new RemoteAudioTrack_Factory_Impl(c0069RemoteAudioTrack_Factory));
    }

    @Override // io.livekit.android.room.track.RemoteAudioTrack.Factory
    public RemoteAudioTrack create(String str, livekit.org.webrtc.AudioTrack audioTrack, RtpReceiver rtpReceiver) {
        return this.delegateFactory.get(str, audioTrack, rtpReceiver);
    }
}
