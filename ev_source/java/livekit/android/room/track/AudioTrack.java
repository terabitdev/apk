package io.livekit.android.room.track;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.room.track.Track;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.AudioTrackSink;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/livekit/android/room/track/AudioTrack;", "Lio/livekit/android/room/track/Track;", "", DiagnosticsEntry.NAME_KEY, "Llivekit/org/webrtc/AudioTrack;", "rtcTrack", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Ljava/lang/String;Llivekit/org/webrtc/AudioTrack;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "Llivekit/org/webrtc/AudioTrackSink;", "sink", "Lsn/z;", "addSink", "(Llivekit/org/webrtc/AudioTrackSink;)V", "removeSink", "Llivekit/org/webrtc/AudioTrack;", "getRtcTrack", "()Llivekit/org/webrtc/AudioTrack;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class AudioTrack extends Track {
    private final livekit.org.webrtc.AudioTrack rtcTrack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioTrack(String str, livekit.org.webrtc.AudioTrack audioTrack, RTCThreadToken rTCThreadToken) {
        super(str, Track.Kind.AUDIO, audioTrack, rTCThreadToken);
        str.getClass();
        audioTrack.getClass();
        rTCThreadToken.getClass();
        this.rtcTrack = audioTrack;
    }

    public abstract void addSink(AudioTrackSink sink);

    public abstract void removeSink(AudioTrackSink sink);

    @Override // io.livekit.android.room.track.Track
    public livekit.org.webrtc.AudioTrack getRtcTrack() {
        return this.rtcTrack;
    }
}
