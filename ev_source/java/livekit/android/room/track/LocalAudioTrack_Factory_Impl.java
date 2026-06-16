package io.livekit.android.room.track;

import io.livekit.android.room.track.LocalAudioTrack;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class LocalAudioTrack_Factory_Impl implements LocalAudioTrack.Factory {
    private final C0066LocalAudioTrack_Factory delegateFactory;

    public LocalAudioTrack_Factory_Impl(C0066LocalAudioTrack_Factory c0066LocalAudioTrack_Factory) {
        this.delegateFactory = c0066LocalAudioTrack_Factory;
    }

    public static rn.a create(C0066LocalAudioTrack_Factory c0066LocalAudioTrack_Factory) {
        return d.a(new LocalAudioTrack_Factory_Impl(c0066LocalAudioTrack_Factory));
    }

    @Override // io.livekit.android.room.track.LocalAudioTrack.Factory
    public LocalAudioTrack create(String str, livekit.org.webrtc.AudioTrack audioTrack, LocalAudioTrackOptions localAudioTrackOptions) {
        return this.delegateFactory.get(str, audioTrack, localAudioTrackOptions);
    }
}
