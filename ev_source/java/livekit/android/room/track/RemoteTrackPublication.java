package io.livekit.android.room.track;

import android.gov.nist.javax.sip.header.ParameterNames;
import as.p9;
import as.w7;
import fr.g0;
import fr.k1;
import fr.z;
import ho.l;
import io.livekit.android.events.TrackEvent;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.participant.RemoteParticipant;
import io.livekit.android.room.track.Track;
import io.livekit.android.util.CoroutineUtilKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$ParticipantTracks;
import livekit.LivekitModels$TrackInfo;
import livekit.org.webrtc.MediaStreamTrack;
import rd.c1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001NB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0010J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010'\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00104R*\u00106\u001a\u00020\f2\u0006\u00105\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u0010R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0:8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010?\u001a\u0004\u0018\u00010\u00048V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0011\u0010D\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bD\u00108R\u0014\u0010\u001b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u00108R\u0011\u0010I\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR$\u0010M\u001a\u00020\f2\u0006\u0010J\u001a\u00020\f8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\bK\u00108\"\u0004\bL\u0010\u0010¨\u0006O"}, d2 = {"Lio/livekit/android/room/track/RemoteTrackPublication;", "Lio/livekit/android/room/track/TrackPublication;", "Llivekit/LivekitModels$TrackInfo;", ParameterNames.INFO, "Lio/livekit/android/room/track/Track;", "track", "Lio/livekit/android/room/participant/RemoteParticipant;", "participant", "Lfr/z;", "ioDispatcher", "<init>", "(Llivekit/LivekitModels$TrackInfo;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/participant/RemoteParticipant;Lfr/z;)V", "", "isVisible", "Lsn/z;", "handleVisibilityChanged", "(Z)V", "Lio/livekit/android/room/track/Track$Dimensions;", "newDimensions", "handleVideoDimensionsChanged", "(Lio/livekit/android/room/track/Track$Dimensions;)V", "Lio/livekit/android/events/TrackEvent$StreamStateChanged;", "trackEvent", "handleStreamStateChanged", "(Lio/livekit/android/events/TrackEvent$StreamStateChanged;)V", "sendUpdateTrackSettingsImpl", "()V", "subscribed", "setSubscribed", "enabled", "setEnabled", "Lio/livekit/android/room/track/VideoQuality;", "quality", "setVideoQuality", "(Lio/livekit/android/room/track/VideoQuality;)V", "dimensions", "setVideoDimensions", "", "fps", "setVideoFps", "(Ljava/lang/Integer;)V", "Lfr/z;", "Lfr/k1;", "trackJob", "Lfr/k1;", "unsubscribed", "Z", "disabled", "videoQuality", "Lio/livekit/android/room/track/VideoQuality;", "videoDimensions", "Lio/livekit/android/room/track/Track$Dimensions;", "Ljava/lang/Integer;", "<set-?>", "subscriptionAllowed", "getSubscriptionAllowed", "()Z", "setSubscriptionAllowed$livekit_android_sdk_release", "Lkotlin/Function1;", "sendUpdateTrackSettings", "Lho/l;", "getSendUpdateTrackSettings$livekit_android_sdk_release", "()Lho/l;", "value", "getTrack", "()Lio/livekit/android/room/track/Track;", "setTrack$livekit_android_sdk_release", "(Lio/livekit/android/room/track/Track;)V", "isAutoManaged", "getSubscribed", "Lio/livekit/android/room/track/RemoteTrackPublication$SubscriptionStatus;", "getSubscriptionStatus", "()Lio/livekit/android/room/track/RemoteTrackPublication$SubscriptionStatus;", "subscriptionStatus", "v", "getMuted", "setMuted$livekit_android_sdk_release", "muted", "SubscriptionStatus", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RemoteTrackPublication extends TrackPublication {
    private boolean disabled;
    private Integer fps;
    private final z ioDispatcher;
    private final l sendUpdateTrackSettings;
    private boolean subscriptionAllowed;
    private k1 trackJob;
    private boolean unsubscribed;
    private Track.Dimensions videoDimensions;
    private VideoQuality videoQuality;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/track/RemoteTrackPublication$SubscriptionStatus;", "", "(Ljava/lang/String;I)V", "SUBSCRIBED", "SUBSCRIBED_AND_NOT_ALLOWED", "UNSUBSCRIBED", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class SubscriptionStatus {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ SubscriptionStatus[] $VALUES;
        public static final SubscriptionStatus SUBSCRIBED = new SubscriptionStatus("SUBSCRIBED", 0);
        public static final SubscriptionStatus SUBSCRIBED_AND_NOT_ALLOWED = new SubscriptionStatus("SUBSCRIBED_AND_NOT_ALLOWED", 1);
        public static final SubscriptionStatus UNSUBSCRIBED = new SubscriptionStatus("UNSUBSCRIBED", 2);

        private static final /* synthetic */ SubscriptionStatus[] $values() {
            return new SubscriptionStatus[]{SUBSCRIBED, SUBSCRIBED_AND_NOT_ALLOWED, UNSUBSCRIBED};
        }

        static {
            SubscriptionStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private SubscriptionStatus(String str, int i10) {
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static SubscriptionStatus valueOf(String str) {
            return (SubscriptionStatus) Enum.valueOf(SubscriptionStatus.class, str);
        }

        public static SubscriptionStatus[] values() {
            return (SubscriptionStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteTrackPublication(LivekitModels$TrackInfo livekitModels$TrackInfo, Track track, RemoteParticipant remoteParticipant, z zVar) {
        super(livekitModels$TrackInfo, track, remoteParticipant);
        livekitModels$TrackInfo.getClass();
        remoteParticipant.getClass();
        zVar.getClass();
        this.ioDispatcher = zVar;
        this.videoQuality = VideoQuality.HIGH;
        this.subscriptionAllowed = true;
        this.sendUpdateTrackSettings = CoroutineUtilKt.debounce(100L, g0.c(zVar), new RemoteTrackPublication$sendUpdateTrackSettings$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStreamStateChanged(TrackEvent.StreamStateChanged trackEvent) {
        Participant participant = getParticipant().get();
        if (participant != null) {
            participant.onTrackStreamStateChanged$livekit_android_sdk_release(trackEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleVideoDimensionsChanged(Track.Dimensions newDimensions) {
        this.videoDimensions = newDimensions;
        CoroutineUtilKt.invoke(this.sendUpdateTrackSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleVisibilityChanged(boolean isVisible) {
        this.disabled = !isVisible;
        CoroutineUtilKt.invoke(this.sendUpdateTrackSettings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendUpdateTrackSettingsImpl() {
        RemoteParticipant remoteParticipant;
        MediaStreamTrack mediaStreamTrack;
        Participant participant = getParticipant().get();
        p9 p9Var = null;
        if (participant instanceof RemoteParticipant) {
            remoteParticipant = (RemoteParticipant) participant;
        } else {
            remoteParticipant = null;
        }
        if (remoteParticipant == null) {
            return;
        }
        Track track = getTrack();
        if (track != null) {
            mediaStreamTrack = track.getRtcTrack();
        } else {
            mediaStreamTrack = null;
        }
        if (mediaStreamTrack instanceof livekit.org.webrtc.VideoTrack) {
            ((livekit.org.webrtc.VideoTrack) mediaStreamTrack).setShouldReceive(!this.disabled);
        }
        SignalClient signalClient = remoteParticipant.getSignalClient();
        String sid = getSid();
        boolean z6 = this.disabled;
        Track.Dimensions dimensions = this.videoDimensions;
        VideoQuality videoQuality = this.videoQuality;
        if (videoQuality != null) {
            p9Var = videoQuality.toProto();
        }
        signalClient.sendUpdateTrackSettings(sid, z6, dimensions, p9Var, this.fps);
    }

    @Override // io.livekit.android.room.track.TrackPublication
    public boolean getMuted() {
        return super.getMuted();
    }

    /* renamed from: getSendUpdateTrackSettings$livekit_android_sdk_release, reason: from getter */
    public final l getSendUpdateTrackSettings() {
        return this.sendUpdateTrackSettings;
    }

    @Override // io.livekit.android.room.track.TrackPublication
    public boolean getSubscribed() {
        if (!this.unsubscribed && this.subscriptionAllowed) {
            return super.getSubscribed();
        }
        return false;
    }

    public final boolean getSubscriptionAllowed() {
        return this.subscriptionAllowed;
    }

    public final SubscriptionStatus getSubscriptionStatus() {
        if (this.unsubscribed && getTrack() != null) {
            if (!this.subscriptionAllowed) {
                return SubscriptionStatus.SUBSCRIBED_AND_NOT_ALLOWED;
            }
            return SubscriptionStatus.SUBSCRIBED;
        }
        return SubscriptionStatus.UNSUBSCRIBED;
    }

    @Override // io.livekit.android.room.track.TrackPublication
    public Track getTrack() {
        return super.getTrack();
    }

    public final boolean isAutoManaged() {
        RemoteVideoTrack remoteVideoTrack;
        Track track = getTrack();
        if (track instanceof RemoteVideoTrack) {
            remoteVideoTrack = (RemoteVideoTrack) track;
        } else {
            remoteVideoTrack = null;
        }
        if (remoteVideoTrack != null) {
            return remoteVideoTrack.getAutoManageVideo();
        }
        return false;
    }

    public final void setEnabled(boolean enabled) {
        if (!isAutoManaged() && getSubscribed() && enabled != (!this.disabled)) {
            this.disabled = !enabled;
            CoroutineUtilKt.invoke(this.sendUpdateTrackSettings);
        }
    }

    @Override // io.livekit.android.room.track.TrackPublication
    public void setMuted$livekit_android_sdk_release(boolean z6) {
        RemoteParticipant remoteParticipant;
        if (super.getMuted() != z6) {
            super.setMuted$livekit_android_sdk_release(z6);
            Participant participant = getParticipant().get();
            if (participant instanceof RemoteParticipant) {
                remoteParticipant = (RemoteParticipant) participant;
            } else {
                remoteParticipant = null;
            }
            if (remoteParticipant == null) {
                return;
            }
            if (z6) {
                remoteParticipant.onTrackMuted$livekit_android_sdk_release(this);
            } else {
                remoteParticipant.onTrackUnmuted$livekit_android_sdk_release(this);
            }
        }
    }

    public final void setSubscribed(boolean subscribed) {
        RemoteParticipant remoteParticipant;
        this.unsubscribed = !subscribed;
        Participant participant = getParticipant().get();
        if (participant instanceof RemoteParticipant) {
            remoteParticipant = (RemoteParticipant) participant;
        } else {
            remoteParticipant = null;
        }
        if (remoteParticipant == null) {
            return;
        }
        w7 newBuilder = LivekitModels$ParticipantTracks.newBuilder();
        newBuilder.d(remoteParticipant.getSid());
        newBuilder.b(getSid());
        LivekitModels$ParticipantTracks livekitModels$ParticipantTracks = (LivekitModels$ParticipantTracks) newBuilder.build();
        SignalClient signalClient = remoteParticipant.getSignalClient();
        boolean z6 = !this.unsubscribed;
        livekitModels$ParticipantTracks.getClass();
        signalClient.sendUpdateSubscription(z6, livekitModels$ParticipantTracks);
    }

    public final void setSubscriptionAllowed$livekit_android_sdk_release(boolean z6) {
        this.subscriptionAllowed = z6;
    }

    @Override // io.livekit.android.room.track.TrackPublication
    public void setTrack$livekit_android_sdk_release(Track track) {
        if (!m.c(track, super.getTrack())) {
            k1 k1Var = this.trackJob;
            if (k1Var != null) {
                k1Var.cancel((CancellationException) null);
            }
            this.trackJob = null;
        }
        super.setTrack$livekit_android_sdk_release(track);
        if (track != null) {
            this.trackJob = g0.D(g0.c(this.ioDispatcher), null, null, new RemoteTrackPublication$track$1(track, this, null), 3);
            if (track instanceof RemoteVideoTrack) {
                RemoteVideoTrack remoteVideoTrack = (RemoteVideoTrack) track;
                if (remoteVideoTrack.getAutoManageVideo()) {
                    handleVideoDimensionsChanged(remoteVideoTrack.getLastDimensions());
                    handleVisibilityChanged(remoteVideoTrack.getLastVisibility());
                }
            }
        }
    }

    public final void setVideoDimensions(Track.Dimensions dimensions) {
        dimensions.getClass();
        if (!isAutoManaged() && getSubscribed() && !m.c(this.videoDimensions, dimensions) && (getTrack() instanceof VideoTrack)) {
            this.videoQuality = null;
            this.videoDimensions = dimensions;
            CoroutineUtilKt.invoke(this.sendUpdateTrackSettings);
        }
    }

    public final void setVideoFps(Integer fps) {
        if (!isAutoManaged() && getSubscribed() && !m.c(this.fps, fps) && (getTrack() instanceof VideoTrack)) {
            this.fps = fps;
            CoroutineUtilKt.invoke(this.sendUpdateTrackSettings);
        }
    }

    public final void setVideoQuality(VideoQuality quality) {
        quality.getClass();
        if (!isAutoManaged() && getSubscribed() && quality != this.videoQuality && (getTrack() instanceof VideoTrack)) {
            this.videoQuality = quality;
            this.videoDimensions = null;
            CoroutineUtilKt.invoke(this.sendUpdateTrackSettings);
        }
    }

    public /* synthetic */ RemoteTrackPublication(LivekitModels$TrackInfo livekitModels$TrackInfo, Track track, RemoteParticipant remoteParticipant, z zVar, int i10, f fVar) {
        this(livekitModels$TrackInfo, (i10 & 2) != 0 ? null : track, remoteParticipant, zVar);
    }
}
