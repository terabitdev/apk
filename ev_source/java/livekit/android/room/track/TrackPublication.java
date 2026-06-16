package io.livekit.android.room.track;

import android.gov.nist.javax.sip.header.ParameterNames;
import as.d9;
import as.e9;
import as.l7;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.events.TrackPublicationEvent;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.track.Track;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.MutableStateFlowDelegate;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$TrackInfo;
import oo.u;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R5\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048W@PX\u0097\u008e\u0002¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u001b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR$\u0010%\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020*0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R1\u0010;\u001a\u0002042\u0006\u0010\u0012\u001a\u0002048W@PX\u0097\u008e\u0002¢\u0006\u0018\n\u0004\b5\u0010\u0014\u0012\u0004\b:\u0010\u001a\u001a\u0004\b6\u00107\"\u0004\b8\u00109R.\u0010<\u001a\u0004\u0018\u0001042\b\u0010\u0012\u001a\u0004\u0018\u0001048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR.\u0010C\u001a\u0004\u0018\u00010B2\b\u0010\u0012\u001a\u0004\u0018\u00010B8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010J\u001a\u00020I2\u0006\u0010\u0012\u001a\u00020I8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR.\u0010P\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u001d\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010!R$\u0010S\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010\fR(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0014\u0010a\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u00107¨\u0006d"}, d2 = {"Lio/livekit/android/room/track/TrackPublication;", "", "Llivekit/LivekitModels$TrackInfo;", ParameterNames.INFO, "Lio/livekit/android/room/track/Track;", "track", "Lio/livekit/android/room/participant/Participant;", "participant", "<init>", "(Llivekit/LivekitModels$TrackInfo;Lio/livekit/android/room/track/Track;Lio/livekit/android/room/participant/Participant;)V", "Lsn/z;", "updateFromInfo", "(Llivekit/LivekitModels$TrackInfo;)V", "Lio/livekit/android/events/RoomEvent$TranscriptionReceived;", "transcription", "onTranscriptionReceived$livekit_android_sdk_release", "(Lio/livekit/android/events/RoomEvent$TranscriptionReceived;)V", "onTranscriptionReceived", "<set-?>", "track$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getTrack", "()Lio/livekit/android/room/track/Track;", "setTrack$livekit_android_sdk_release", "(Lio/livekit/android/room/track/Track;)V", "getTrack$annotations", "()V", "", DiagnosticsEntry.NAME_KEY, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName$livekit_android_sdk_release", "(Ljava/lang/String;)V", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "getSid", "Lio/livekit/android/room/track/Track$Kind;", "kind", "Lio/livekit/android/room/track/Track$Kind;", "getKind", "()Lio/livekit/android/room/track/Track$Kind;", "Lio/livekit/android/events/BroadcastEventBus;", "Lio/livekit/android/events/TrackPublicationEvent;", "eventBus", "Lio/livekit/android/events/BroadcastEventBus;", "getEventBus", "()Lio/livekit/android/events/BroadcastEventBus;", "Lio/livekit/android/events/EventListenable;", "events", "Lio/livekit/android/events/EventListenable;", "getEvents", "()Lio/livekit/android/events/EventListenable;", "", "muted$delegate", "getMuted", "()Z", "setMuted$livekit_android_sdk_release", "(Z)V", "getMuted$annotations", "muted", "simulcasted", "Ljava/lang/Boolean;", "getSimulcasted", "()Ljava/lang/Boolean;", "setSimulcasted$livekit_android_sdk_release", "(Ljava/lang/Boolean;)V", "Lio/livekit/android/room/track/Track$Dimensions;", "dimensions", "Lio/livekit/android/room/track/Track$Dimensions;", "getDimensions", "()Lio/livekit/android/room/track/Track$Dimensions;", "setDimensions$livekit_android_sdk_release", "(Lio/livekit/android/room/track/Track$Dimensions;)V", "Lio/livekit/android/room/track/Track$Source;", "source", "Lio/livekit/android/room/track/Track$Source;", "getSource", "()Lio/livekit/android/room/track/Track$Source;", "setSource$livekit_android_sdk_release", "(Lio/livekit/android/room/track/Track$Source;)V", "mimeType", "getMimeType", "setMimeType$livekit_android_sdk_release", "trackInfo", "Llivekit/LivekitModels$TrackInfo;", "getTrackInfo$livekit_android_sdk_release", "()Llivekit/LivekitModels$TrackInfo;", "setTrackInfo$livekit_android_sdk_release", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "getParticipant", "()Ljava/lang/ref/WeakReference;", "setParticipant", "(Ljava/lang/ref/WeakReference;)V", "Las/l7;", "getEncryptionType", "()Las/l7;", "encryptionType", "getSubscribed", "subscribed", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class TrackPublication {
    static final /* synthetic */ u[] $$delegatedProperties;
    private Track.Dimensions dimensions;
    private final BroadcastEventBus<TrackPublicationEvent> eventBus;
    private final EventListenable<TrackPublicationEvent> events;
    private Track.Kind kind;
    private String mimeType;

    /* renamed from: muted$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate muted;
    private String name;
    private WeakReference<Participant> participant;
    private String sid;
    private Boolean simulcasted;
    private Track.Source source;

    /* renamed from: track$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate track;
    private LivekitModels$TrackInfo trackInfo;

    static {
        q qVar = new q(TrackPublication.class, "track", "getTrack()Lio/livekit/android/room/track/Track;", 0);
        f0 f0Var = e0.f20562a;
        $$delegatedProperties = new u[]{f0Var.e(qVar), n.l(TrackPublication.class, "muted", "getMuted()Z", 0, f0Var)};
    }

    public TrackPublication(LivekitModels$TrackInfo livekitModels$TrackInfo, Track track, Participant participant) {
        livekitModels$TrackInfo.getClass();
        participant.getClass();
        this.track = FlowDelegateKt.flowDelegate$default(track, null, 2, null);
        BroadcastEventBus<TrackPublicationEvent> broadcastEventBus = new BroadcastEventBus<>();
        this.eventBus = broadcastEventBus;
        this.events = broadcastEventBus.readOnly();
        this.muted = FlowDelegateKt.flowDelegate$default(Boolean.FALSE, null, 2, null);
        this.source = Track.Source.UNKNOWN;
        String sid = livekitModels$TrackInfo.getSid();
        sid.getClass();
        this.sid = sid;
        String name = livekitModels$TrackInfo.getName();
        name.getClass();
        this.name = name;
        Track.Kind.Companion companion = Track.Kind.INSTANCE;
        e9 type = livekitModels$TrackInfo.getType();
        type.getClass();
        this.kind = companion.fromProto(type);
        this.participant = new WeakReference<>(participant);
        updateFromInfo(livekitModels$TrackInfo);
    }

    public final Track.Dimensions getDimensions() {
        return this.dimensions;
    }

    public l7 getEncryptionType() {
        l7 l7Var;
        LivekitModels$TrackInfo livekitModels$TrackInfo = this.trackInfo;
        if (livekitModels$TrackInfo != null) {
            l7Var = livekitModels$TrackInfo.getEncryption();
        } else {
            l7Var = null;
        }
        if (l7Var == null) {
            return l7.NONE;
        }
        return l7Var;
    }

    public final BroadcastEventBus<TrackPublicationEvent> getEventBus() {
        return this.eventBus;
    }

    public final EventListenable<TrackPublicationEvent> getEvents() {
        return this.events;
    }

    public final Track.Kind getKind() {
        return this.kind;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public boolean getMuted() {
        return ((Boolean) this.muted.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final String getName() {
        return this.name;
    }

    public final WeakReference<Participant> getParticipant() {
        return this.participant;
    }

    public final String getSid() {
        return this.sid;
    }

    public final Boolean getSimulcasted() {
        return this.simulcasted;
    }

    public final Track.Source getSource() {
        return this.source;
    }

    public boolean getSubscribed() {
        if (getTrack() != null) {
            return true;
        }
        return false;
    }

    public Track getTrack() {
        return (Track) this.track.getValue(this, $$delegatedProperties[0]);
    }

    /* renamed from: getTrackInfo$livekit_android_sdk_release, reason: from getter */
    public final LivekitModels$TrackInfo getTrackInfo() {
        return this.trackInfo;
    }

    public final void onTranscriptionReceived$livekit_android_sdk_release(RoomEvent.TranscriptionReceived transcription) {
        transcription.getClass();
        if (!m.c(transcription.getPublication(), this)) {
            return;
        }
        this.eventBus.tryPostEvent(new TrackPublicationEvent.TranscriptionReceived(this, transcription.getTranscriptionSegments()));
    }

    public final void setDimensions$livekit_android_sdk_release(Track.Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public final void setMimeType$livekit_android_sdk_release(String str) {
        this.mimeType = str;
    }

    public void setMuted$livekit_android_sdk_release(boolean z6) {
        this.muted.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z6));
    }

    public final void setName$livekit_android_sdk_release(String str) {
        str.getClass();
        this.name = str;
    }

    public final void setParticipant(WeakReference<Participant> weakReference) {
        weakReference.getClass();
        this.participant = weakReference;
    }

    public final void setSimulcasted$livekit_android_sdk_release(Boolean bool) {
        this.simulcasted = bool;
    }

    public final void setSource$livekit_android_sdk_release(Track.Source source) {
        source.getClass();
        this.source = source;
    }

    public void setTrack$livekit_android_sdk_release(Track track) {
        this.track.setValue(this, $$delegatedProperties[0], track);
    }

    public final void setTrackInfo$livekit_android_sdk_release(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        this.trackInfo = livekitModels$TrackInfo;
    }

    public final void updateFromInfo(LivekitModels$TrackInfo info) {
        info.getClass();
        String sid = info.getSid();
        sid.getClass();
        this.sid = sid;
        String name = info.getName();
        name.getClass();
        this.name = name;
        Track.Kind.Companion companion = Track.Kind.INSTANCE;
        e9 type = info.getType();
        type.getClass();
        this.kind = companion.fromProto(type);
        setMuted$livekit_android_sdk_release(info.getMuted());
        Track.Source.Companion companion2 = Track.Source.INSTANCE;
        d9 source = info.getSource();
        source.getClass();
        this.source = companion2.fromProto(source);
        if (this.kind == Track.Kind.VIDEO) {
            this.simulcasted = Boolean.valueOf(info.getSimulcast());
            this.dimensions = new Track.Dimensions(info.getWidth(), info.getHeight());
        }
        this.mimeType = info.getMimeType();
        this.trackInfo = info;
    }

    public static /* synthetic */ void getMuted$annotations() {
    }

    public static /* synthetic */ void getTrack$annotations() {
    }
}
