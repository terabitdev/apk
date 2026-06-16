package io.livekit.android.events;

import as.l7;
import com.google.firebase.messaging.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.participant.ParticipantPermission;
import io.livekit.android.room.participant.RemoteParticipant;
import io.livekit.android.room.track.LocalTrackPublication;
import io.livekit.android.room.track.RemoteTrackPublication;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackException;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.room.types.TranscriptionSegment;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0015\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0015\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0¨\u00061"}, d2 = {"Lio/livekit/android/events/ParticipantEvent;", "Lio/livekit/android/events/Event;", "participant", "Lio/livekit/android/room/participant/Participant;", "(Lio/livekit/android/room/participant/Participant;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "AttributesChanged", "DataReceived", "LocalTrackPublicationFailed", "LocalTrackPublished", "LocalTrackSubscribed", "LocalTrackUnpublished", "MetadataChanged", "NameChanged", "ParticipantPermissionsChanged", "SpeakingChanged", "StateChanged", "TrackMuted", "TrackPublished", "TrackStreamStateChanged", "TrackSubscribed", "TrackSubscriptionFailed", "TrackSubscriptionPermissionChanged", "TrackUnmuted", "TrackUnpublished", "TrackUnsubscribed", "TranscriptionReceived", "Lio/livekit/android/events/ParticipantEvent$AttributesChanged;", "Lio/livekit/android/events/ParticipantEvent$DataReceived;", "Lio/livekit/android/events/ParticipantEvent$LocalTrackPublicationFailed;", "Lio/livekit/android/events/ParticipantEvent$LocalTrackPublished;", "Lio/livekit/android/events/ParticipantEvent$LocalTrackSubscribed;", "Lio/livekit/android/events/ParticipantEvent$LocalTrackUnpublished;", "Lio/livekit/android/events/ParticipantEvent$MetadataChanged;", "Lio/livekit/android/events/ParticipantEvent$NameChanged;", "Lio/livekit/android/events/ParticipantEvent$ParticipantPermissionsChanged;", "Lio/livekit/android/events/ParticipantEvent$SpeakingChanged;", "Lio/livekit/android/events/ParticipantEvent$StateChanged;", "Lio/livekit/android/events/ParticipantEvent$TrackMuted;", "Lio/livekit/android/events/ParticipantEvent$TrackPublished;", "Lio/livekit/android/events/ParticipantEvent$TrackStreamStateChanged;", "Lio/livekit/android/events/ParticipantEvent$TrackSubscribed;", "Lio/livekit/android/events/ParticipantEvent$TrackSubscriptionFailed;", "Lio/livekit/android/events/ParticipantEvent$TrackSubscriptionPermissionChanged;", "Lio/livekit/android/events/ParticipantEvent$TrackUnmuted;", "Lio/livekit/android/events/ParticipantEvent$TrackUnpublished;", "Lio/livekit/android/events/ParticipantEvent$TrackUnsubscribed;", "Lio/livekit/android/events/ParticipantEvent$TranscriptionReceived;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class ParticipantEvent extends Event {
    private final Participant participant;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$AttributesChanged;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", "changedAttributes", "", "", "oldAttributes", "(Lio/livekit/android/room/participant/Participant;Ljava/util/Map;Ljava/util/Map;)V", "getChangedAttributes", "()Ljava/util/Map;", "getOldAttributes", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class AttributesChanged extends ParticipantEvent {
        private final Map<String, String> changedAttributes;
        private final Map<String, String> oldAttributes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttributesChanged(Participant participant, Map<String, String> map, Map<String, String> map2) {
            super(participant, null);
            participant.getClass();
            map.getClass();
            map2.getClass();
            this.changedAttributes = map;
            this.oldAttributes = map2;
        }

        public final Map<String, String> getChangedAttributes() {
            return this.changedAttributes;
        }

        public final Map<String, String> getOldAttributes() {
            return this.oldAttributes;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$MetadataChanged;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", "prevMetadata", "", "(Lio/livekit/android/room/participant/Participant;Ljava/lang/String;)V", "getPrevMetadata", "()Ljava/lang/String;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class MetadataChanged extends ParticipantEvent {
        private final String prevMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MetadataChanged(Participant participant, String str) {
            super(participant, null);
            participant.getClass();
            this.prevMetadata = str;
        }

        public final String getPrevMetadata() {
            return this.prevMetadata;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$NameChanged;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", DiagnosticsEntry.NAME_KEY, "", "(Lio/livekit/android/room/participant/Participant;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class NameChanged extends ParticipantEvent {
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NameChanged(Participant participant, String str) {
            super(participant, null);
            participant.getClass();
            this.name = str;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$ParticipantPermissionsChanged;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", "newPermissions", "Lio/livekit/android/room/participant/ParticipantPermission;", "oldPermissions", "(Lio/livekit/android/room/participant/Participant;Lio/livekit/android/room/participant/ParticipantPermission;Lio/livekit/android/room/participant/ParticipantPermission;)V", "getNewPermissions", "()Lio/livekit/android/room/participant/ParticipantPermission;", "getOldPermissions", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ParticipantPermissionsChanged extends ParticipantEvent {
        private final ParticipantPermission newPermissions;
        private final ParticipantPermission oldPermissions;
        private final Participant participant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParticipantPermissionsChanged(Participant participant, ParticipantPermission participantPermission, ParticipantPermission participantPermission2) {
            super(participant, null);
            participant.getClass();
            this.participant = participant;
            this.newPermissions = participantPermission;
            this.oldPermissions = participantPermission2;
        }

        public final ParticipantPermission getNewPermissions() {
            return this.newPermissions;
        }

        public final ParticipantPermission getOldPermissions() {
            return this.oldPermissions;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public Participant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$SpeakingChanged;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", "isSpeaking", "", "(Lio/livekit/android/room/participant/Participant;Z)V", "()Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class SpeakingChanged extends ParticipantEvent {
        private final boolean isSpeaking;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SpeakingChanged(Participant participant, boolean z6) {
            super(participant, null);
            participant.getClass();
            this.isSpeaking = z6;
        }

        /* renamed from: isSpeaking, reason: from getter */
        public final boolean getIsSpeaking() {
            return this.isSpeaking;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$StateChanged;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", "newState", "Lio/livekit/android/room/participant/Participant$State;", "oldState", "(Lio/livekit/android/room/participant/Participant;Lio/livekit/android/room/participant/Participant$State;Lio/livekit/android/room/participant/Participant$State;)V", "getNewState", "()Lio/livekit/android/room/participant/Participant$State;", "getOldState", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class StateChanged extends ParticipantEvent {
        private final Participant.State newState;
        private final Participant.State oldState;
        private final Participant participant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateChanged(Participant participant, Participant.State state, Participant.State state2) {
            super(participant, null);
            participant.getClass();
            state.getClass();
            state2.getClass();
            this.participant = participant;
            this.newState = state;
            this.oldState = state2;
        }

        public final Participant.State getNewState() {
            return this.newState;
        }

        public final Participant.State getOldState() {
            return this.oldState;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public Participant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TrackMuted;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "(Lio/livekit/android/room/participant/Participant;Lio/livekit/android/room/track/TrackPublication;)V", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackMuted extends ParticipantEvent {
        private final TrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackMuted(Participant participant, TrackPublication trackPublication) {
            super(participant, null);
            participant.getClass();
            trackPublication.getClass();
            this.publication = trackPublication;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TrackStreamStateChanged;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", "trackPublication", "Lio/livekit/android/room/track/TrackPublication;", "streamState", "Lio/livekit/android/room/track/Track$StreamState;", "(Lio/livekit/android/room/participant/Participant;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/track/Track$StreamState;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getStreamState", "()Lio/livekit/android/room/track/Track$StreamState;", "getTrackPublication", "()Lio/livekit/android/room/track/TrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackStreamStateChanged extends ParticipantEvent {
        private final Participant participant;
        private final Track.StreamState streamState;
        private final TrackPublication trackPublication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackStreamStateChanged(Participant participant, TrackPublication trackPublication, Track.StreamState streamState) {
            super(participant, null);
            participant.getClass();
            trackPublication.getClass();
            streamState.getClass();
            this.participant = participant;
            this.trackPublication = trackPublication;
            this.streamState = streamState;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public Participant getParticipant() {
            return this.participant;
        }

        public final Track.StreamState getStreamState() {
            return this.streamState;
        }

        public final TrackPublication getTrackPublication() {
            return this.trackPublication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TrackUnmuted;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "(Lio/livekit/android/room/participant/Participant;Lio/livekit/android/room/track/TrackPublication;)V", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackUnmuted extends ParticipantEvent {
        private final TrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackUnmuted(Participant participant, TrackPublication trackPublication) {
            super(participant, null);
            participant.getClass();
            trackPublication.getClass();
            this.publication = trackPublication;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TranscriptionReceived;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/Participant;", "transcriptions", "", "Lio/livekit/android/room/types/TranscriptionSegment;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "(Lio/livekit/android/room/participant/Participant;Ljava/util/List;Lio/livekit/android/room/track/TrackPublication;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "getTranscriptions", "()Ljava/util/List;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TranscriptionReceived extends ParticipantEvent {
        private final Participant participant;
        private final TrackPublication publication;
        private final List<TranscriptionSegment> transcriptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TranscriptionReceived(Participant participant, List<TranscriptionSegment> list, TrackPublication trackPublication) {
            super(participant, null);
            participant.getClass();
            list.getClass();
            this.participant = participant;
            this.transcriptions = list;
            this.publication = trackPublication;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public Participant getParticipant() {
            return this.participant;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }

        public final List<TranscriptionSegment> getTranscriptions() {
            return this.transcriptions;
        }
    }

    private ParticipantEvent(Participant participant) {
        super(null);
        this.participant = participant;
    }

    public Participant getParticipant() {
        return this.participant;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$DataReceived;", "Lio/livekit/android/events/ParticipantEvent;", "Lio/livekit/android/room/participant/RemoteParticipant;", "participant", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "topic", "Las/l7;", "encryptionType", "<init>", "(Lio/livekit/android/room/participant/RemoteParticipant;[BLjava/lang/String;Las/l7;)V", "Lio/livekit/android/room/participant/RemoteParticipant;", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "[B", "getData", "()[B", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "Las/l7;", "getEncryptionType", "()Las/l7;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DataReceived extends ParticipantEvent {
        private final byte[] data;
        private final l7 encryptionType;
        private final RemoteParticipant participant;
        private final String topic;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataReceived(RemoteParticipant remoteParticipant, byte[] bArr, String str, l7 l7Var) {
            super(remoteParticipant, null);
            remoteParticipant.getClass();
            bArr.getClass();
            l7Var.getClass();
            this.participant = remoteParticipant;
            this.data = bArr;
            this.topic = str;
            this.encryptionType = l7Var;
        }

        public final byte[] getData() {
            return this.data;
        }

        public final l7 getEncryptionType() {
            return this.encryptionType;
        }

        public final String getTopic() {
            return this.topic;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public RemoteParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$LocalTrackPublicationFailed;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/LocalParticipant;", "track", "Lio/livekit/android/room/track/Track;", "e", "Lio/livekit/android/room/track/TrackException$PublishException;", "(Lio/livekit/android/room/participant/LocalParticipant;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/TrackException$PublishException;)V", "getE", "()Lio/livekit/android/room/track/TrackException$PublishException;", "getParticipant", "()Lio/livekit/android/room/participant/LocalParticipant;", "getTrack", "()Lio/livekit/android/room/track/Track;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class LocalTrackPublicationFailed extends ParticipantEvent {
        private final TrackException.PublishException e;
        private final LocalParticipant participant;
        private final Track track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalTrackPublicationFailed(LocalParticipant localParticipant, Track track, TrackException.PublishException publishException) {
            super(localParticipant, null);
            localParticipant.getClass();
            track.getClass();
            publishException.getClass();
            this.participant = localParticipant;
            this.track = track;
            this.e = publishException;
        }

        public final TrackException.PublishException getE() {
            return this.e;
        }

        public final Track getTrack() {
            return this.track;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public LocalParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$LocalTrackPublished;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/LocalParticipant;", "publication", "Lio/livekit/android/room/track/LocalTrackPublication;", "(Lio/livekit/android/room/participant/LocalParticipant;Lio/livekit/android/room/track/LocalTrackPublication;)V", "getParticipant", "()Lio/livekit/android/room/participant/LocalParticipant;", "getPublication", "()Lio/livekit/android/room/track/LocalTrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class LocalTrackPublished extends ParticipantEvent {
        private final LocalParticipant participant;
        private final LocalTrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalTrackPublished(LocalParticipant localParticipant, LocalTrackPublication localTrackPublication) {
            super(localParticipant, null);
            localParticipant.getClass();
            localTrackPublication.getClass();
            this.participant = localParticipant;
            this.publication = localTrackPublication;
        }

        public final LocalTrackPublication getPublication() {
            return this.publication;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public LocalParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$LocalTrackSubscribed;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/LocalParticipant;", "publication", "Lio/livekit/android/room/track/LocalTrackPublication;", "(Lio/livekit/android/room/participant/LocalParticipant;Lio/livekit/android/room/track/LocalTrackPublication;)V", "getParticipant", "()Lio/livekit/android/room/participant/LocalParticipant;", "getPublication", "()Lio/livekit/android/room/track/LocalTrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class LocalTrackSubscribed extends ParticipantEvent {
        private final LocalParticipant participant;
        private final LocalTrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalTrackSubscribed(LocalParticipant localParticipant, LocalTrackPublication localTrackPublication) {
            super(localParticipant, null);
            localParticipant.getClass();
            localTrackPublication.getClass();
            this.participant = localParticipant;
            this.publication = localTrackPublication;
        }

        public final LocalTrackPublication getPublication() {
            return this.publication;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public LocalParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$LocalTrackUnpublished;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/LocalParticipant;", "publication", "Lio/livekit/android/room/track/LocalTrackPublication;", "(Lio/livekit/android/room/participant/LocalParticipant;Lio/livekit/android/room/track/LocalTrackPublication;)V", "getParticipant", "()Lio/livekit/android/room/participant/LocalParticipant;", "getPublication", "()Lio/livekit/android/room/track/LocalTrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class LocalTrackUnpublished extends ParticipantEvent {
        private final LocalParticipant participant;
        private final LocalTrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalTrackUnpublished(LocalParticipant localParticipant, LocalTrackPublication localTrackPublication) {
            super(localParticipant, null);
            localParticipant.getClass();
            localTrackPublication.getClass();
            this.participant = localParticipant;
            this.publication = localTrackPublication;
        }

        public final LocalTrackPublication getPublication() {
            return this.publication;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public LocalParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TrackPublished;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "publication", "Lio/livekit/android/room/track/RemoteTrackPublication;", "(Lio/livekit/android/room/participant/RemoteParticipant;Lio/livekit/android/room/track/RemoteTrackPublication;)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getPublication", "()Lio/livekit/android/room/track/RemoteTrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackPublished extends ParticipantEvent {
        private final RemoteParticipant participant;
        private final RemoteTrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackPublished(RemoteParticipant remoteParticipant, RemoteTrackPublication remoteTrackPublication) {
            super(remoteParticipant, null);
            remoteParticipant.getClass();
            remoteTrackPublication.getClass();
            this.participant = remoteParticipant;
            this.publication = remoteTrackPublication;
        }

        public final RemoteTrackPublication getPublication() {
            return this.publication;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public RemoteParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TrackSubscribed;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "track", "Lio/livekit/android/room/track/Track;", "publication", "Lio/livekit/android/room/track/RemoteTrackPublication;", "(Lio/livekit/android/room/participant/RemoteParticipant;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/RemoteTrackPublication;)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getPublication", "()Lio/livekit/android/room/track/RemoteTrackPublication;", "getTrack", "()Lio/livekit/android/room/track/Track;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackSubscribed extends ParticipantEvent {
        private final RemoteParticipant participant;
        private final RemoteTrackPublication publication;
        private final Track track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackSubscribed(RemoteParticipant remoteParticipant, Track track, RemoteTrackPublication remoteTrackPublication) {
            super(remoteParticipant, null);
            remoteParticipant.getClass();
            track.getClass();
            remoteTrackPublication.getClass();
            this.participant = remoteParticipant;
            this.track = track;
            this.publication = remoteTrackPublication;
        }

        public final RemoteTrackPublication getPublication() {
            return this.publication;
        }

        public final Track getTrack() {
            return this.track;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public RemoteParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0002\u0010\tR\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TrackSubscriptionFailed;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lio/livekit/android/room/participant/RemoteParticipant;Ljava/lang/String;Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getSid", "()Ljava/lang/String;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackSubscriptionFailed extends ParticipantEvent {
        private final Exception exception;
        private final RemoteParticipant participant;
        private final String sid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackSubscriptionFailed(RemoteParticipant remoteParticipant, String str, Exception exc) {
            super(remoteParticipant, null);
            remoteParticipant.getClass();
            str.getClass();
            exc.getClass();
            this.participant = remoteParticipant;
            this.sid = str;
            this.exception = exc;
        }

        public final Exception getException() {
            return this.exception;
        }

        public final String getSid() {
            return this.sid;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public RemoteParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TrackSubscriptionPermissionChanged;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "trackPublication", "Lio/livekit/android/room/track/RemoteTrackPublication;", "subscriptionAllowed", "", "(Lio/livekit/android/room/participant/RemoteParticipant;Lio/livekit/android/room/track/RemoteTrackPublication;Z)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getSubscriptionAllowed", "()Z", "getTrackPublication", "()Lio/livekit/android/room/track/RemoteTrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackSubscriptionPermissionChanged extends ParticipantEvent {
        private final RemoteParticipant participant;
        private final boolean subscriptionAllowed;
        private final RemoteTrackPublication trackPublication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackSubscriptionPermissionChanged(RemoteParticipant remoteParticipant, RemoteTrackPublication remoteTrackPublication, boolean z6) {
            super(remoteParticipant, null);
            remoteParticipant.getClass();
            remoteTrackPublication.getClass();
            this.participant = remoteParticipant;
            this.trackPublication = remoteTrackPublication;
            this.subscriptionAllowed = z6;
        }

        public final boolean getSubscriptionAllowed() {
            return this.subscriptionAllowed;
        }

        public final RemoteTrackPublication getTrackPublication() {
            return this.trackPublication;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public RemoteParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TrackUnpublished;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "publication", "Lio/livekit/android/room/track/RemoteTrackPublication;", "(Lio/livekit/android/room/participant/RemoteParticipant;Lio/livekit/android/room/track/RemoteTrackPublication;)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getPublication", "()Lio/livekit/android/room/track/RemoteTrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackUnpublished extends ParticipantEvent {
        private final RemoteParticipant participant;
        private final RemoteTrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackUnpublished(RemoteParticipant remoteParticipant, RemoteTrackPublication remoteTrackPublication) {
            super(remoteParticipant, null);
            remoteParticipant.getClass();
            remoteTrackPublication.getClass();
            this.participant = remoteParticipant;
            this.publication = remoteTrackPublication;
        }

        public final RemoteTrackPublication getPublication() {
            return this.publication;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public RemoteParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/livekit/android/events/ParticipantEvent$TrackUnsubscribed;", "Lio/livekit/android/events/ParticipantEvent;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "track", "Lio/livekit/android/room/track/Track;", "publication", "Lio/livekit/android/room/track/RemoteTrackPublication;", "(Lio/livekit/android/room/participant/RemoteParticipant;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/RemoteTrackPublication;)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getPublication", "()Lio/livekit/android/room/track/RemoteTrackPublication;", "getTrack", "()Lio/livekit/android/room/track/Track;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackUnsubscribed extends ParticipantEvent {
        private final RemoteParticipant participant;
        private final RemoteTrackPublication publication;
        private final Track track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackUnsubscribed(RemoteParticipant remoteParticipant, Track track, RemoteTrackPublication remoteTrackPublication) {
            super(remoteParticipant, null);
            remoteParticipant.getClass();
            track.getClass();
            remoteTrackPublication.getClass();
            this.participant = remoteParticipant;
            this.track = track;
            this.publication = remoteTrackPublication;
        }

        public final RemoteTrackPublication getPublication() {
            return this.publication;
        }

        public final Track getTrack() {
            return this.track;
        }

        @Override // io.livekit.android.events.ParticipantEvent
        public RemoteParticipant getParticipant() {
            return this.participant;
        }
    }

    public /* synthetic */ ParticipantEvent(Participant participant, f fVar) {
        this(participant);
    }
}
