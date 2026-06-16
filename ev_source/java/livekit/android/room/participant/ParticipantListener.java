package io.livekit.android.room.participant;

import com.google.firebase.messaging.Constants;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.track.LocalTrackPublication;
import io.livekit.android.room.track.RemoteTrackPublication;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackPublication;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u0017J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u001f\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/livekit/android/room/participant/ParticipantListener;", "", "Lio/livekit/android/room/participant/Participant;", "participant", "", "prevMetadata", "Lsn/z;", "onMetadataChanged", "(Lio/livekit/android/room/participant/Participant;Ljava/lang/String;)V", "onSpeakingChanged", "(Lio/livekit/android/room/participant/Participant;)V", "Lio/livekit/android/room/track/TrackPublication;", "publication", "onTrackMuted", "(Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/Participant;)V", "onTrackUnmuted", "Lio/livekit/android/room/track/LocalTrackPublication;", "Lio/livekit/android/room/participant/LocalParticipant;", "onTrackPublished", "(Lio/livekit/android/room/track/LocalTrackPublication;Lio/livekit/android/room/participant/LocalParticipant;)V", "onTrackUnpublished", "Lio/livekit/android/room/track/RemoteTrackPublication;", "Lio/livekit/android/room/participant/RemoteParticipant;", "(Lio/livekit/android/room/track/RemoteTrackPublication;Lio/livekit/android/room/participant/RemoteParticipant;)V", "Lio/livekit/android/room/track/Track;", "track", "onTrackSubscribed", "(Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/RemoteTrackPublication;Lio/livekit/android/room/participant/RemoteParticipant;)V", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "onTrackSubscriptionFailed", "(Ljava/lang/String;Ljava/lang/Exception;Lio/livekit/android/room/participant/RemoteParticipant;)V", "onTrackUnsubscribed", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onDataReceived", "([BLio/livekit/android/room/participant/RemoteParticipant;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes4.dex */
public interface ParticipantListener {
    void onDataReceived(byte[] data, RemoteParticipant participant);

    void onMetadataChanged(Participant participant, String prevMetadata);

    void onSpeakingChanged(Participant participant);

    void onTrackMuted(TrackPublication publication, Participant participant);

    void onTrackPublished(LocalTrackPublication publication, LocalParticipant participant);

    void onTrackPublished(RemoteTrackPublication publication, RemoteParticipant participant);

    void onTrackSubscribed(Track track, RemoteTrackPublication publication, RemoteParticipant participant);

    void onTrackSubscriptionFailed(String sid, Exception exception, RemoteParticipant participant);

    void onTrackUnmuted(TrackPublication publication, Participant participant);

    void onTrackUnpublished(LocalTrackPublication publication, LocalParticipant participant);

    void onTrackUnpublished(RemoteTrackPublication publication, RemoteParticipant participant);

    void onTrackUnsubscribed(Track track, RemoteTrackPublication publication, RemoteParticipant participant);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void onDataReceived(ParticipantListener participantListener, byte[] bArr, RemoteParticipant remoteParticipant) {
            bArr.getClass();
            remoteParticipant.getClass();
        }

        public static void onMetadataChanged(ParticipantListener participantListener, Participant participant, String str) {
            participant.getClass();
        }

        public static void onSpeakingChanged(ParticipantListener participantListener, Participant participant) {
            participant.getClass();
        }

        public static void onTrackMuted(ParticipantListener participantListener, TrackPublication trackPublication, Participant participant) {
            trackPublication.getClass();
            participant.getClass();
        }

        public static void onTrackPublished(ParticipantListener participantListener, LocalTrackPublication localTrackPublication, LocalParticipant localParticipant) {
            localTrackPublication.getClass();
            localParticipant.getClass();
        }

        public static void onTrackSubscribed(ParticipantListener participantListener, Track track, RemoteTrackPublication remoteTrackPublication, RemoteParticipant remoteParticipant) {
            track.getClass();
            remoteTrackPublication.getClass();
            remoteParticipant.getClass();
        }

        public static void onTrackSubscriptionFailed(ParticipantListener participantListener, String str, Exception exc, RemoteParticipant remoteParticipant) {
            str.getClass();
            exc.getClass();
            remoteParticipant.getClass();
        }

        public static void onTrackUnmuted(ParticipantListener participantListener, TrackPublication trackPublication, Participant participant) {
            trackPublication.getClass();
            participant.getClass();
        }

        public static void onTrackUnpublished(ParticipantListener participantListener, LocalTrackPublication localTrackPublication, LocalParticipant localParticipant) {
            localTrackPublication.getClass();
            localParticipant.getClass();
        }

        public static void onTrackUnsubscribed(ParticipantListener participantListener, Track track, RemoteTrackPublication remoteTrackPublication, RemoteParticipant remoteParticipant) {
            track.getClass();
            remoteTrackPublication.getClass();
            remoteParticipant.getClass();
        }

        public static void onTrackPublished(ParticipantListener participantListener, RemoteTrackPublication remoteTrackPublication, RemoteParticipant remoteParticipant) {
            remoteTrackPublication.getClass();
            remoteParticipant.getClass();
        }

        public static void onTrackUnpublished(ParticipantListener participantListener, RemoteTrackPublication remoteTrackPublication, RemoteParticipant remoteParticipant) {
            remoteTrackPublication.getClass();
            remoteParticipant.getClass();
        }
    }
}
