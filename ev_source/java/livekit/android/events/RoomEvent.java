package io.livekit.android.events;

import as.l7;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.e2ee.E2EEState;
import io.livekit.android.room.Room;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.participant.ConnectionQuality;
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
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u001e\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u001e%&'()*+,-./0123456789:;<=>?@AB¨\u0006C"}, d2 = {"Lio/livekit/android/events/RoomEvent;", "Lio/livekit/android/events/Event;", "room", "Lio/livekit/android/room/Room;", "(Lio/livekit/android/room/Room;)V", "getRoom", "()Lio/livekit/android/room/Room;", "ActiveSpeakersChanged", "Connected", "ConnectionQualityChanged", "DataReceived", "Disconnected", "FailedToConnect", "LocalTrackSubscribed", "ParticipantAttributesChanged", "ParticipantConnected", "ParticipantDisconnected", "ParticipantMetadataChanged", "ParticipantNameChanged", "ParticipantPermissionsChanged", "ParticipantStateChanged", "Reconnected", "Reconnecting", "RecordingStatusChanged", "RoomMetadataChanged", "TrackE2EEStateEvent", "TrackMuted", "TrackPublicationFailed", "TrackPublished", "TrackStreamStateChanged", "TrackSubscribed", "TrackSubscriptionFailed", "TrackSubscriptionPermissionChanged", "TrackUnmuted", "TrackUnpublished", "TrackUnsubscribed", "TranscriptionReceived", "Lio/livekit/android/events/RoomEvent$ActiveSpeakersChanged;", "Lio/livekit/android/events/RoomEvent$Connected;", "Lio/livekit/android/events/RoomEvent$ConnectionQualityChanged;", "Lio/livekit/android/events/RoomEvent$DataReceived;", "Lio/livekit/android/events/RoomEvent$Disconnected;", "Lio/livekit/android/events/RoomEvent$FailedToConnect;", "Lio/livekit/android/events/RoomEvent$LocalTrackSubscribed;", "Lio/livekit/android/events/RoomEvent$ParticipantAttributesChanged;", "Lio/livekit/android/events/RoomEvent$ParticipantConnected;", "Lio/livekit/android/events/RoomEvent$ParticipantDisconnected;", "Lio/livekit/android/events/RoomEvent$ParticipantMetadataChanged;", "Lio/livekit/android/events/RoomEvent$ParticipantNameChanged;", "Lio/livekit/android/events/RoomEvent$ParticipantPermissionsChanged;", "Lio/livekit/android/events/RoomEvent$ParticipantStateChanged;", "Lio/livekit/android/events/RoomEvent$Reconnected;", "Lio/livekit/android/events/RoomEvent$Reconnecting;", "Lio/livekit/android/events/RoomEvent$RecordingStatusChanged;", "Lio/livekit/android/events/RoomEvent$RoomMetadataChanged;", "Lio/livekit/android/events/RoomEvent$TrackE2EEStateEvent;", "Lio/livekit/android/events/RoomEvent$TrackMuted;", "Lio/livekit/android/events/RoomEvent$TrackPublicationFailed;", "Lio/livekit/android/events/RoomEvent$TrackPublished;", "Lio/livekit/android/events/RoomEvent$TrackStreamStateChanged;", "Lio/livekit/android/events/RoomEvent$TrackSubscribed;", "Lio/livekit/android/events/RoomEvent$TrackSubscriptionFailed;", "Lio/livekit/android/events/RoomEvent$TrackSubscriptionPermissionChanged;", "Lio/livekit/android/events/RoomEvent$TrackUnmuted;", "Lio/livekit/android/events/RoomEvent$TrackUnpublished;", "Lio/livekit/android/events/RoomEvent$TrackUnsubscribed;", "Lio/livekit/android/events/RoomEvent$TranscriptionReceived;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class RoomEvent extends Event {
    private final Room room;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/livekit/android/events/RoomEvent$ActiveSpeakersChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "speakers", "", "Lio/livekit/android/room/participant/Participant;", "(Lio/livekit/android/room/Room;Ljava/util/List;)V", "getSpeakers", "()Ljava/util/List;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ActiveSpeakersChanged extends RoomEvent {
        private final List<Participant> speakers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActiveSpeakersChanged(Room room, List<? extends Participant> list) {
            super(room, null);
            room.getClass();
            list.getClass();
            this.speakers = list;
        }

        public final List<Participant> getSpeakers() {
            return this.speakers;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/livekit/android/events/RoomEvent$Connected;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "(Lio/livekit/android/room/Room;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Connected extends RoomEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Connected(Room room) {
            super(room, null);
            room.getClass();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/RoomEvent$ConnectionQualityChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "participant", "Lio/livekit/android/room/participant/Participant;", "quality", "Lio/livekit/android/room/participant/ConnectionQuality;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/participant/Participant;Lio/livekit/android/room/participant/ConnectionQuality;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getQuality", "()Lio/livekit/android/room/participant/ConnectionQuality;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ConnectionQualityChanged extends RoomEvent {
        private final Participant participant;
        private final ConnectionQuality quality;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectionQualityChanged(Room room, Participant participant, ConnectionQuality connectionQuality) {
            super(room, null);
            room.getClass();
            participant.getClass();
            connectionQuality.getClass();
            this.participant = participant;
            this.quality = connectionQuality;
        }

        public final Participant getParticipant() {
            return this.participant;
        }

        public final ConnectionQuality getQuality() {
            return this.quality;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/livekit/android/events/RoomEvent$DataReceived;", "Lio/livekit/android/events/RoomEvent;", "Lio/livekit/android/room/Room;", "room", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/livekit/android/room/participant/RemoteParticipant;", "participant", "", "topic", "Las/l7;", "encryptionType", "<init>", "(Lio/livekit/android/room/Room;[BLio/livekit/android/room/participant/RemoteParticipant;Ljava/lang/String;Las/l7;)V", "[B", "getData", "()[B", "Lio/livekit/android/room/participant/RemoteParticipant;", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "Ljava/lang/String;", "getTopic", "()Ljava/lang/String;", "Las/l7;", "getEncryptionType", "()Las/l7;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DataReceived extends RoomEvent {
        private final byte[] data;
        private final l7 encryptionType;
        private final RemoteParticipant participant;
        private final String topic;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataReceived(Room room, byte[] bArr, RemoteParticipant remoteParticipant, String str, l7 l7Var) {
            super(room, null);
            room.getClass();
            bArr.getClass();
            l7Var.getClass();
            this.data = bArr;
            this.participant = remoteParticipant;
            this.topic = str;
            this.encryptionType = l7Var;
        }

        public final byte[] getData() {
            return this.data;
        }

        public final l7 getEncryptionType() {
            return this.encryptionType;
        }

        public final RemoteParticipant getParticipant() {
            return this.participant;
        }

        public final String getTopic() {
            return this.topic;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/livekit/android/events/RoomEvent$Disconnected;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "Lio/livekit/android/events/DisconnectReason;", "(Lio/livekit/android/room/Room;Ljava/lang/Exception;Lio/livekit/android/events/DisconnectReason;)V", "getError", "()Ljava/lang/Exception;", "getReason", "()Lio/livekit/android/events/DisconnectReason;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Disconnected extends RoomEvent {
        private final Exception error;
        private final DisconnectReason reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disconnected(Room room, Exception exc, DisconnectReason disconnectReason) {
            super(room, null);
            room.getClass();
            disconnectReason.getClass();
            this.error = exc;
            this.reason = disconnectReason;
        }

        public final Exception getError() {
            return this.error;
        }

        public final DisconnectReason getReason() {
            return this.reason;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/RoomEvent$FailedToConnect;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "(Lio/livekit/android/room/Room;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class FailedToConnect extends RoomEvent {
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToConnect(Room room, Throwable th) {
            super(room, null);
            room.getClass();
            th.getClass();
            this.error = th;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/RoomEvent$LocalTrackSubscribed;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "publication", "Lio/livekit/android/room/track/LocalTrackPublication;", "participant", "Lio/livekit/android/room/participant/LocalParticipant;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/LocalTrackPublication;Lio/livekit/android/room/participant/LocalParticipant;)V", "getParticipant", "()Lio/livekit/android/room/participant/LocalParticipant;", "getPublication", "()Lio/livekit/android/room/track/LocalTrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class LocalTrackSubscribed extends RoomEvent {
        private final LocalParticipant participant;
        private final LocalTrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalTrackSubscribed(Room room, LocalTrackPublication localTrackPublication, LocalParticipant localParticipant) {
            super(room, null);
            room.getClass();
            localTrackPublication.getClass();
            localParticipant.getClass();
            this.publication = localTrackPublication;
            this.participant = localParticipant;
        }

        public final LocalParticipant getParticipant() {
            return this.participant;
        }

        public final LocalTrackPublication getPublication() {
            return this.publication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/livekit/android/events/RoomEvent$ParticipantAttributesChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "participant", "Lio/livekit/android/room/participant/Participant;", "changedAttributes", "", "", "oldAttributes", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/participant/Participant;Ljava/util/Map;Ljava/util/Map;)V", "getChangedAttributes", "()Ljava/util/Map;", "getOldAttributes", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ParticipantAttributesChanged extends RoomEvent {
        private final Map<String, String> changedAttributes;
        private final Map<String, String> oldAttributes;
        private final Participant participant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParticipantAttributesChanged(Room room, Participant participant, Map<String, String> map, Map<String, String> map2) {
            super(room, null);
            room.getClass();
            participant.getClass();
            map.getClass();
            map2.getClass();
            this.participant = participant;
            this.changedAttributes = map;
            this.oldAttributes = map2;
        }

        public final Map<String, String> getChangedAttributes() {
            return this.changedAttributes;
        }

        public final Map<String, String> getOldAttributes() {
            return this.oldAttributes;
        }

        public final Participant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/RoomEvent$ParticipantConnected;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/participant/RemoteParticipant;)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ParticipantConnected extends RoomEvent {
        private final RemoteParticipant participant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParticipantConnected(Room room, RemoteParticipant remoteParticipant) {
            super(room, null);
            room.getClass();
            remoteParticipant.getClass();
            this.participant = remoteParticipant;
        }

        public final RemoteParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/events/RoomEvent$ParticipantDisconnected;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/participant/RemoteParticipant;)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ParticipantDisconnected extends RoomEvent {
        private final RemoteParticipant participant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParticipantDisconnected(Room room, RemoteParticipant remoteParticipant) {
            super(room, null);
            room.getClass();
            remoteParticipant.getClass();
            this.participant = remoteParticipant;
        }

        public final RemoteParticipant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/RoomEvent$ParticipantMetadataChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "participant", "Lio/livekit/android/room/participant/Participant;", "prevMetadata", "", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/participant/Participant;Ljava/lang/String;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getPrevMetadata", "()Ljava/lang/String;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ParticipantMetadataChanged extends RoomEvent {
        private final Participant participant;
        private final String prevMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParticipantMetadataChanged(Room room, Participant participant, String str) {
            super(room, null);
            room.getClass();
            participant.getClass();
            this.participant = participant;
            this.prevMetadata = str;
        }

        public final Participant getParticipant() {
            return this.participant;
        }

        public final String getPrevMetadata() {
            return this.prevMetadata;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/RoomEvent$ParticipantNameChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "participant", "Lio/livekit/android/room/participant/Participant;", DiagnosticsEntry.NAME_KEY, "", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/participant/Participant;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ParticipantNameChanged extends RoomEvent {
        private final String name;
        private final Participant participant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParticipantNameChanged(Room room, Participant participant, String str) {
            super(room, null);
            room.getClass();
            participant.getClass();
            this.participant = participant;
            this.name = str;
        }

        public final String getName() {
            return this.name;
        }

        public final Participant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/livekit/android/events/RoomEvent$ParticipantPermissionsChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "participant", "Lio/livekit/android/room/participant/Participant;", "newPermissions", "Lio/livekit/android/room/participant/ParticipantPermission;", "oldPermissions", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/participant/Participant;Lio/livekit/android/room/participant/ParticipantPermission;Lio/livekit/android/room/participant/ParticipantPermission;)V", "getNewPermissions", "()Lio/livekit/android/room/participant/ParticipantPermission;", "getOldPermissions", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ParticipantPermissionsChanged extends RoomEvent {
        private final ParticipantPermission newPermissions;
        private final ParticipantPermission oldPermissions;
        private final Participant participant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParticipantPermissionsChanged(Room room, Participant participant, ParticipantPermission participantPermission, ParticipantPermission participantPermission2) {
            super(room, null);
            room.getClass();
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

        public final Participant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/livekit/android/events/RoomEvent$ParticipantStateChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "participant", "Lio/livekit/android/room/participant/Participant;", "newState", "Lio/livekit/android/room/participant/Participant$State;", "oldState", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/participant/Participant;Lio/livekit/android/room/participant/Participant$State;Lio/livekit/android/room/participant/Participant$State;)V", "getNewState", "()Lio/livekit/android/room/participant/Participant$State;", "getOldState", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ParticipantStateChanged extends RoomEvent {
        private final Participant.State newState;
        private final Participant.State oldState;
        private final Participant participant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParticipantStateChanged(Room room, Participant participant, Participant.State state, Participant.State state2) {
            super(room, null);
            room.getClass();
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

        public final Participant getParticipant() {
            return this.participant;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/livekit/android/events/RoomEvent$Reconnected;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "(Lio/livekit/android/room/Room;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Reconnected extends RoomEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reconnected(Room room) {
            super(room, null);
            room.getClass();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/livekit/android/events/RoomEvent$Reconnecting;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "(Lio/livekit/android/room/Room;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Reconnecting extends RoomEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reconnecting(Room room) {
            super(room, null);
            room.getClass();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/events/RoomEvent$RecordingStatusChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "isRecording", "", "(Lio/livekit/android/room/Room;Z)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class RecordingStatusChanged extends RoomEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordingStatusChanged(Room room, boolean z6) {
            super(room, null);
            room.getClass();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lio/livekit/android/events/RoomEvent$RoomMetadataChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "newMetadata", "", "prevMetadata", "(Lio/livekit/android/room/Room;Ljava/lang/String;Ljava/lang/String;)V", "getNewMetadata", "()Ljava/lang/String;", "getPrevMetadata", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class RoomMetadataChanged extends RoomEvent {
        private final String newMetadata;
        private final String prevMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoomMetadataChanged(Room room, String str, String str2) {
            super(room, null);
            room.getClass();
            this.newMetadata = str;
            this.prevMetadata = str2;
        }

        public final String getNewMetadata() {
            return this.newMetadata;
        }

        public final String getPrevMetadata() {
            return this.prevMetadata;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackE2EEStateEvent;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "track", "Lio/livekit/android/room/track/Track;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "participant", "Lio/livekit/android/room/participant/Participant;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/livekit/android/e2ee/E2EEState;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/Participant;Lio/livekit/android/e2ee/E2EEState;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "getState", "()Lio/livekit/android/e2ee/E2EEState;", "setState", "(Lio/livekit/android/e2ee/E2EEState;)V", "getTrack", "()Lio/livekit/android/room/track/Track;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackE2EEStateEvent extends RoomEvent {
        private final Participant participant;
        private final TrackPublication publication;
        private E2EEState state;
        private final Track track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackE2EEStateEvent(Room room, Track track, TrackPublication trackPublication, Participant participant, E2EEState e2EEState) {
            super(room, null);
            room.getClass();
            track.getClass();
            trackPublication.getClass();
            participant.getClass();
            e2EEState.getClass();
            this.track = track;
            this.publication = trackPublication;
            this.participant = participant;
            this.state = e2EEState;
        }

        public final Participant getParticipant() {
            return this.participant;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }

        public final E2EEState getState() {
            return this.state;
        }

        public final Track getTrack() {
            return this.track;
        }

        public final void setState(E2EEState e2EEState) {
            e2EEState.getClass();
            this.state = e2EEState;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackMuted;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "participant", "Lio/livekit/android/room/participant/Participant;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/Participant;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackMuted extends RoomEvent {
        private final Participant participant;
        private final TrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackMuted(Room room, TrackPublication trackPublication, Participant participant) {
            super(room, null);
            room.getClass();
            trackPublication.getClass();
            participant.getClass();
            this.publication = trackPublication;
            this.participant = participant;
        }

        public final Participant getParticipant() {
            return this.participant;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackPublicationFailed;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "track", "Lio/livekit/android/room/track/Track;", "participant", "Lio/livekit/android/room/participant/LocalParticipant;", "e", "Lio/livekit/android/room/track/TrackException$PublishException;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/participant/LocalParticipant;Lio/livekit/android/room/track/TrackException$PublishException;)V", "getParticipant", "()Lio/livekit/android/room/participant/LocalParticipant;", "getTrack", "()Lio/livekit/android/room/track/Track;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackPublicationFailed extends RoomEvent {
        private final LocalParticipant participant;
        private final Track track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackPublicationFailed(Room room, Track track, LocalParticipant localParticipant, TrackException.PublishException publishException) {
            super(room, null);
            room.getClass();
            track.getClass();
            localParticipant.getClass();
            publishException.getClass();
            this.track = track;
            this.participant = localParticipant;
        }

        public final LocalParticipant getParticipant() {
            return this.participant;
        }

        public final Track getTrack() {
            return this.track;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackPublished;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "participant", "Lio/livekit/android/room/participant/Participant;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/Participant;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackPublished extends RoomEvent {
        private final Participant participant;
        private final TrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackPublished(Room room, TrackPublication trackPublication, Participant participant) {
            super(room, null);
            room.getClass();
            trackPublication.getClass();
            participant.getClass();
            this.publication = trackPublication;
            this.participant = participant;
        }

        public final Participant getParticipant() {
            return this.participant;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackStreamStateChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "trackPublication", "Lio/livekit/android/room/track/TrackPublication;", "streamState", "Lio/livekit/android/room/track/Track$StreamState;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/track/Track$StreamState;)V", "getStreamState", "()Lio/livekit/android/room/track/Track$StreamState;", "getTrackPublication", "()Lio/livekit/android/room/track/TrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackStreamStateChanged extends RoomEvent {
        private final Track.StreamState streamState;
        private final TrackPublication trackPublication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackStreamStateChanged(Room room, TrackPublication trackPublication, Track.StreamState streamState) {
            super(room, null);
            room.getClass();
            trackPublication.getClass();
            streamState.getClass();
            this.trackPublication = trackPublication;
            this.streamState = streamState;
        }

        public final Track.StreamState getStreamState() {
            return this.streamState;
        }

        public final TrackPublication getTrackPublication() {
            return this.trackPublication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackSubscribed;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "track", "Lio/livekit/android/room/track/Track;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/RemoteParticipant;)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "getTrack", "()Lio/livekit/android/room/track/Track;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackSubscribed extends RoomEvent {
        private final RemoteParticipant participant;
        private final TrackPublication publication;
        private final Track track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackSubscribed(Room room, Track track, TrackPublication trackPublication, RemoteParticipant remoteParticipant) {
            super(room, null);
            room.getClass();
            track.getClass();
            trackPublication.getClass();
            remoteParticipant.getClass();
            this.track = track;
            this.publication = trackPublication;
            this.participant = remoteParticipant;
        }

        public final RemoteParticipant getParticipant() {
            return this.participant;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }

        public final Track getTrack() {
            return this.track;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackSubscriptionFailed;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "(Lio/livekit/android/room/Room;Ljava/lang/String;Ljava/lang/Exception;Lio/livekit/android/room/participant/RemoteParticipant;)V", "getException", "()Ljava/lang/Exception;", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getSid", "()Ljava/lang/String;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackSubscriptionFailed extends RoomEvent {
        private final Exception exception;
        private final RemoteParticipant participant;
        private final String sid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackSubscriptionFailed(Room room, String str, Exception exc, RemoteParticipant remoteParticipant) {
            super(room, null);
            room.getClass();
            str.getClass();
            exc.getClass();
            remoteParticipant.getClass();
            this.sid = str;
            this.exception = exc;
            this.participant = remoteParticipant;
        }

        public final Exception getException() {
            return this.exception;
        }

        public final RemoteParticipant getParticipant() {
            return this.participant;
        }

        public final String getSid() {
            return this.sid;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackSubscriptionPermissionChanged;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "trackPublication", "Lio/livekit/android/room/track/RemoteTrackPublication;", "subscriptionAllowed", "", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/participant/RemoteParticipant;Lio/livekit/android/room/track/RemoteTrackPublication;Z)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getSubscriptionAllowed", "()Z", "getTrackPublication", "()Lio/livekit/android/room/track/RemoteTrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackSubscriptionPermissionChanged extends RoomEvent {
        private final RemoteParticipant participant;
        private final boolean subscriptionAllowed;
        private final RemoteTrackPublication trackPublication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackSubscriptionPermissionChanged(Room room, RemoteParticipant remoteParticipant, RemoteTrackPublication remoteTrackPublication, boolean z6) {
            super(room, null);
            room.getClass();
            remoteParticipant.getClass();
            remoteTrackPublication.getClass();
            this.participant = remoteParticipant;
            this.trackPublication = remoteTrackPublication;
            this.subscriptionAllowed = z6;
        }

        public final RemoteParticipant getParticipant() {
            return this.participant;
        }

        public final boolean getSubscriptionAllowed() {
            return this.subscriptionAllowed;
        }

        public final RemoteTrackPublication getTrackPublication() {
            return this.trackPublication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackUnmuted;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "participant", "Lio/livekit/android/room/participant/Participant;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/Participant;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackUnmuted extends RoomEvent {
        private final Participant participant;
        private final TrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackUnmuted(Room room, TrackPublication trackPublication, Participant participant) {
            super(room, null);
            room.getClass();
            trackPublication.getClass();
            participant.getClass();
            this.publication = trackPublication;
            this.participant = participant;
        }

        public final Participant getParticipant() {
            return this.participant;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackUnpublished;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "participant", "Lio/livekit/android/room/participant/Participant;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/Participant;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackUnpublished extends RoomEvent {
        private final Participant participant;
        private final TrackPublication publication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackUnpublished(Room room, TrackPublication trackPublication, Participant participant) {
            super(room, null);
            room.getClass();
            trackPublication.getClass();
            participant.getClass();
            this.publication = trackPublication;
            this.participant = participant;
        }

        public final Participant getParticipant() {
            return this.participant;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/livekit/android/events/RoomEvent$TrackUnsubscribed;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "track", "Lio/livekit/android/room/track/Track;", "publications", "Lio/livekit/android/room/track/TrackPublication;", "participant", "Lio/livekit/android/room/participant/RemoteParticipant;", "(Lio/livekit/android/room/Room;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/RemoteParticipant;)V", "getParticipant", "()Lio/livekit/android/room/participant/RemoteParticipant;", "getPublications", "()Lio/livekit/android/room/track/TrackPublication;", "getTrack", "()Lio/livekit/android/room/track/Track;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TrackUnsubscribed extends RoomEvent {
        private final RemoteParticipant participant;
        private final TrackPublication publications;
        private final Track track;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackUnsubscribed(Room room, Track track, TrackPublication trackPublication, RemoteParticipant remoteParticipant) {
            super(room, null);
            room.getClass();
            track.getClass();
            trackPublication.getClass();
            remoteParticipant.getClass();
            this.track = track;
            this.publications = trackPublication;
            this.participant = remoteParticipant;
        }

        public final RemoteParticipant getParticipant() {
            return this.participant;
        }

        public final TrackPublication getPublications() {
            return this.publications;
        }

        public final Track getTrack() {
            return this.track;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/livekit/android/events/RoomEvent$TranscriptionReceived;", "Lio/livekit/android/events/RoomEvent;", "room", "Lio/livekit/android/room/Room;", "transcriptionSegments", "", "Lio/livekit/android/room/types/TranscriptionSegment;", "participant", "Lio/livekit/android/room/participant/Participant;", "publication", "Lio/livekit/android/room/track/TrackPublication;", "(Lio/livekit/android/room/Room;Ljava/util/List;Lio/livekit/android/room/participant/Participant;Lio/livekit/android/room/track/TrackPublication;)V", "getParticipant", "()Lio/livekit/android/room/participant/Participant;", "getPublication", "()Lio/livekit/android/room/track/TrackPublication;", "getTranscriptionSegments", "()Ljava/util/List;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TranscriptionReceived extends RoomEvent {
        private final Participant participant;
        private final TrackPublication publication;
        private final List<TranscriptionSegment> transcriptionSegments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TranscriptionReceived(Room room, List<TranscriptionSegment> list, Participant participant, TrackPublication trackPublication) {
            super(room, null);
            room.getClass();
            list.getClass();
            this.transcriptionSegments = list;
            this.participant = participant;
            this.publication = trackPublication;
        }

        public final Participant getParticipant() {
            return this.participant;
        }

        public final TrackPublication getPublication() {
            return this.publication;
        }

        public final List<TranscriptionSegment> getTranscriptionSegments() {
            return this.transcriptionSegments;
        }
    }

    private RoomEvent(Room room) {
        super(null);
        this.room = room;
    }

    public final Room getRoom() {
        return this.room;
    }

    public /* synthetic */ RoomEvent(Room room, f fVar) {
        this(room);
    }
}
