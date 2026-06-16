package io.livekit.android.room.track;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.participant.TrackPublishOptions;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$TrackInfo;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/livekit/android/room/track/LocalTrackPublication;", "Lio/livekit/android/room/track/TrackPublication;", ParameterNames.INFO, "Llivekit/LivekitModels$TrackInfo;", "track", "Lio/livekit/android/room/track/Track;", "participant", "Lio/livekit/android/room/participant/LocalParticipant;", "options", "Lio/livekit/android/room/participant/TrackPublishOptions;", "(Llivekit/LivekitModels$TrackInfo;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/participant/LocalParticipant;Lio/livekit/android/room/participant/TrackPublishOptions;)V", "muted", "", "getMuted", "()Z", "setMuted", "(Z)V", "getOptions", "()Lio/livekit/android/room/participant/TrackPublishOptions;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LocalTrackPublication extends TrackPublication {
    private final TrackPublishOptions options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTrackPublication(LivekitModels$TrackInfo livekitModels$TrackInfo, Track track, LocalParticipant localParticipant, TrackPublishOptions trackPublishOptions) {
        super(livekitModels$TrackInfo, track, localParticipant);
        livekitModels$TrackInfo.getClass();
        track.getClass();
        localParticipant.getClass();
        trackPublishOptions.getClass();
        this.options = trackPublishOptions;
    }

    @Override // io.livekit.android.room.track.TrackPublication
    public boolean getMuted() {
        return super.getMuted();
    }

    public final TrackPublishOptions getOptions() {
        return this.options;
    }

    @Override // io.livekit.android.room.track.TrackPublication
    /* renamed from: setMuted, reason: merged with bridge method [inline-methods] */
    public void setMuted$livekit_android_sdk_release(boolean z6) {
        Track track;
        LocalParticipant localParticipant;
        if (z6 != getMuted() && (track = getTrack()) != null) {
            track.setEnabled(!z6);
            super.setMuted$livekit_android_sdk_release(z6);
            Participant participant = getParticipant().get();
            if (participant instanceof LocalParticipant) {
                localParticipant = (LocalParticipant) participant;
            } else {
                localParticipant = null;
            }
            if (localParticipant == null) {
                return;
            }
            localParticipant.getEngine().updateMuteStatus(getSid(), z6);
            if (z6) {
                localParticipant.onTrackMuted$livekit_android_sdk_release(this);
            } else {
                localParticipant.onTrackUnmuted$livekit_android_sdk_release(this);
            }
        }
    }
}
