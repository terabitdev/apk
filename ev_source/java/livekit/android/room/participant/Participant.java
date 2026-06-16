package io.livekit.android.room.participant;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import as.r7;
import as.t7;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import fr.d0;
import fr.g0;
import fr.z;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.ParticipantEvent;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.events.TrackEvent;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.participant.ParticipantPermission;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.MutableStateFlowDelegate;
import io.livekit.android.util.StateFlowDelegate;
import ir.i;
import ir.j;
import ir.r;
import ir.t1;
import ir.v1;
import ir.z1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$ParticipantPermission;
import oo.u;
import p.n;
import qr.g;
import rd.c1;
import sn.a;
import sn.k;
import tn.a0;
import tn.t;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\b\u0016\u0018\u00002\u00020\u0001:\bË\u0001Ì\u0001Í\u0001Î\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0004\b#\u0010\u000eJ\u0017\u0010&\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u00100\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00103\u001a\u00020\fH\u0000¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u00020\fH\u0017¢\u0006\u0004\b4\u00102J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J?\u0010=\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010<0;0:08*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0908H\u0002¢\u0006\u0004\b=\u0010>J/\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001c08*\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010<0;08H\u0002¢\u0006\u0004\b?\u0010>R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0014\u0010F\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR$\u0010I\u001a\u0002052\u0006\u0010H\u001a\u0002058\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u00107R \u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020L0Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR5\u0010\\\u001a\u0004\u0018\u00010\u00172\b\u0010H\u001a\u0004\u0018\u00010\u00178G@BX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bV\u0010W\u0012\u0004\b[\u00102\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010\u001aR;\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010H\u001a\u0004\u0018\u00010\u00048G@GX\u0087\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0004\b]\u0010W\u0012\u0004\b`\u00102\u001a\u0004\b^\u0010B\"\u0004\b_\u0010DR1\u0010h\u001a\u00020a2\u0006\u0010H\u001a\u00020a8G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bb\u0010W\u0012\u0004\bg\u00102\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR1\u0010p\u001a\u00020i2\u0006\u0010H\u001a\u00020i8G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bj\u0010W\u0012\u0004\bo\u00102\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR1\u0010r\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bq\u0010W\u0012\u0004\bv\u00102\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR5\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010H\u001a\u0004\u0018\u00010\u00138G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bw\u0010W\u0012\u0004\bz\u00102\u001a\u0004\bx\u0010B\"\u0004\by\u0010DR5\u0010\u007f\u001a\u0004\u0018\u00010\u00132\b\u0010H\u001a\u0004\u0018\u00010\u00138G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b{\u0010W\u0012\u0004\b~\u00102\u001a\u0004\b|\u0010B\"\u0004\b}\u0010DRP\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013092\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013098G@GX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0080\u0001\u0010W\u0012\u0005\b\u0085\u0001\u00102\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R>\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0087\u00012\t\u0010H\u001a\u0005\u0018\u00010\u0087\u00018G@@X\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0088\u0001\u0010W\u0012\u0005\b\u008d\u0001\u00102\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R:\u0010\u0096\u0001\u001a\u00030\u008f\u00012\u0007\u0010H\u001a\u00030\u008f\u00018G@@X\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0090\u0001\u0010W\u0012\u0005\b\u0095\u0001\u00102\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R>\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0097\u00012\t\u0010H\u001a\u0005\u0018\u00010\u0097\u00018G@@X\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b\u0098\u0001\u0010W\u0012\u0005\b\u009d\u0001\u00102\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R:\u0010¦\u0001\u001a\u00030\u009f\u00012\u0007\u0010H\u001a\u00030\u009f\u00018G@@X\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b \u0001\u0010W\u0012\u0005\b¥\u0001\u00102\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R3\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b¨\u0001\u0010©\u0001\u0012\u0005\b®\u0001\u00102\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001RP\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n092\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n098G@DX\u0087\u008e\u0002¢\u0006\u001e\n\u0005\b¯\u0001\u0010W\u0012\u0005\b²\u0001\u00102\u001a\u0006\b°\u0001\u0010\u0082\u0001\"\u0006\b±\u0001\u0010\u0084\u0001R;\u0010¹\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010<0;0:8GX\u0087\u0084\u0002¢\u0006\u0017\n\u0006\b´\u0001\u0010µ\u0001\u0012\u0005\b¸\u0001\u00102\u001a\u0006\b¶\u0001\u0010·\u0001R;\u0010½\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010<0;0:8GX\u0087\u0084\u0002¢\u0006\u0017\n\u0006\bº\u0001\u0010µ\u0001\u0012\u0005\b¼\u0001\u00102\u001a\u0006\b»\u0001\u0010·\u0001R&\u0010¿\u0001\u001a\u00020\u001c8GX\u0087\u0084\u0002¢\u0006\u0016\n\u0006\b¾\u0001\u0010µ\u0001\u0012\u0005\bÀ\u0001\u00102\u001a\u0005\b¿\u0001\u0010sR&\u0010Â\u0001\u001a\u00020\u001c8GX\u0087\u0084\u0002¢\u0006\u0016\n\u0006\bÁ\u0001\u0010µ\u0001\u0012\u0005\bÃ\u0001\u00102\u001a\u0005\bÂ\u0001\u0010sR&\u0010Å\u0001\u001a\u00020\u001c8GX\u0087\u0084\u0002¢\u0006\u0016\n\u0006\bÄ\u0001\u0010µ\u0001\u0012\u0005\bÆ\u0001\u00102\u001a\u0005\bÅ\u0001\u0010sR\u0017\u0010È\u0001\u001a\u0005\u0018\u00010\u0097\u00018F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010\u009a\u0001R\u0013\u0010Ê\u0001\u001a\u00020\u001c8F¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010s\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ï\u0001"}, d2 = {"Lio/livekit/android/room/participant/Participant;", "", "Lio/livekit/android/room/participant/Participant$Sid;", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "Lio/livekit/android/room/participant/Participant$Identity;", "identity", "Lfr/z;", "coroutineDispatcher", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfr/z;Lkotlin/jvm/internal/f;)V", "Lio/livekit/android/room/track/TrackPublication;", "publication", "Lsn/z;", "addTrackPublication", "(Lio/livekit/android/room/track/TrackPublication;)V", "Lio/livekit/android/room/track/Track$Source;", "source", "getTrackPublication", "(Lio/livekit/android/room/track/Track$Source;)Lio/livekit/android/room/track/TrackPublication;", "", DiagnosticsEntry.NAME_KEY, "getTrackPublicationByName", "(Ljava/lang/String;)Lio/livekit/android/room/track/TrackPublication;", "Llivekit/LivekitModels$ParticipantInfo;", ParameterNames.INFO, "updateFromInfo", "(Llivekit/LivekitModels$ParticipantInfo;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "trackPublication", "onTrackMuted$livekit_android_sdk_release", "onTrackMuted", "onTrackUnmuted$livekit_android_sdk_release", "onTrackUnmuted", "Lio/livekit/android/events/TrackEvent$StreamStateChanged;", "trackEvent", "onTrackStreamStateChanged$livekit_android_sdk_release", "(Lio/livekit/android/events/TrackEvent$StreamStateChanged;)V", "onTrackStreamStateChanged", "Lio/livekit/android/events/RoomEvent$TranscriptionReceived;", "transcription", "onTranscriptionReceived$livekit_android_sdk_release", "(Lio/livekit/android/events/RoomEvent$TranscriptionReceived;)V", "onTranscriptionReceived", "reinitialize$livekit_android_sdk_release", "()V", "reinitialize", "dispose", "Lfr/d0;", "createScope", "()Lfr/d0;", "Lir/i;", "", "", "Lsn/k;", "Lio/livekit/android/room/track/Track;", "trackUpdateFlow", "(Lir/i;)Lir/i;", "isTrackEnabledDetector", "Ljava/lang/String;", "getSid-Iza8KQI", "()Ljava/lang/String;", "setSid-yvz9xIM", "(Ljava/lang/String;)V", "Lfr/z;", "delegateScope", "Lfr/d0;", "<set-?>", "scope", "getScope", "Lio/livekit/android/events/BroadcastEventBus;", "Lio/livekit/android/events/ParticipantEvent;", "eventBus", "Lio/livekit/android/events/BroadcastEventBus;", "getEventBus", "()Lio/livekit/android/events/BroadcastEventBus;", "Lio/livekit/android/events/EventListenable;", "events", "Lio/livekit/android/events/EventListenable;", "getEvents", "()Lio/livekit/android/events/EventListenable;", "participantInfo$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getParticipantInfo", "()Llivekit/LivekitModels$ParticipantInfo;", "setParticipantInfo", "getParticipantInfo$annotations", "participantInfo", "identity$delegate", "getIdentity-4WamZwg", "setIdentity-iHk7GY8", "getIdentity-4WamZwg$annotations", "Lio/livekit/android/room/participant/Participant$State;", "state$delegate", "getState", "()Lio/livekit/android/room/participant/Participant$State;", "setState", "(Lio/livekit/android/room/participant/Participant$State;)V", "getState$annotations", RemoteConfigConstants.ResponseFieldKey.STATE, "", "audioLevel$delegate", "getAudioLevel", "()F", "setAudioLevel", "(F)V", "getAudioLevel$annotations", "audioLevel", "isSpeaking$delegate", "isSpeaking", "()Z", "setSpeaking", "(Z)V", "isSpeaking$annotations", "name$delegate", "getName", "setName", "getName$annotations", "metadata$delegate", "getMetadata", "setMetadata", "getMetadata$annotations", "metadata", "attributes$delegate", "getAttributes", "()Ljava/util/Map;", "setAttributes", "(Ljava/util/Map;)V", "getAttributes$annotations", "attributes", "Lio/livekit/android/room/participant/ParticipantPermission;", "permissions$delegate", "getPermissions", "()Lio/livekit/android/room/participant/ParticipantPermission;", "setPermissions$livekit_android_sdk_release", "(Lio/livekit/android/room/participant/ParticipantPermission;)V", "getPermissions$annotations", "permissions", "Lio/livekit/android/room/participant/ConnectionQuality;", "connectionQuality$delegate", "getConnectionQuality", "()Lio/livekit/android/room/participant/ConnectionQuality;", "setConnectionQuality$livekit_android_sdk_release", "(Lio/livekit/android/room/participant/ConnectionQuality;)V", "getConnectionQuality$annotations", "connectionQuality", "", "lastSpokeAt$delegate", "getLastSpokeAt", "()Ljava/lang/Long;", "setLastSpokeAt$livekit_android_sdk_release", "(Ljava/lang/Long;)V", "getLastSpokeAt$annotations", "lastSpokeAt", "Lio/livekit/android/room/participant/Participant$Kind;", "kind$delegate", "getKind", "()Lio/livekit/android/room/participant/Participant$Kind;", "setKind$livekit_android_sdk_release", "(Lio/livekit/android/room/participant/Participant$Kind;)V", "getKind$annotations", "kind", "Lio/livekit/android/room/participant/ParticipantListener;", "internalListener", "Lio/livekit/android/room/participant/ParticipantListener;", "getInternalListener", "()Lio/livekit/android/room/participant/ParticipantListener;", "setInternalListener", "(Lio/livekit/android/room/participant/ParticipantListener;)V", "getInternalListener$annotations", "trackPublications$delegate", "getTrackPublications", "setTrackPublications", "getTrackPublications$annotations", "trackPublications", "audioTrackPublications$delegate", "Lio/livekit/android/util/StateFlowDelegate;", "getAudioTrackPublications", "()Ljava/util/List;", "getAudioTrackPublications$annotations", "audioTrackPublications", "videoTrackPublications$delegate", "getVideoTrackPublications", "getVideoTrackPublications$annotations", "videoTrackPublications", "isMicrophoneEnabled$delegate", "isMicrophoneEnabled", "isMicrophoneEnabled$annotations", "isCameraEnabled$delegate", "isCameraEnabled", "isCameraEnabled$annotations", "isScreenShareEnabled$delegate", "isScreenShareEnabled", "isScreenShareEnabled$annotations", "getJoinedAt", "joinedAt", "getHasInfo", "hasInfo", "Identity", "Kind", "Sid", "State", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public class Participant {
    static final /* synthetic */ u[] $$delegatedProperties;

    /* renamed from: attributes$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate attributes;

    /* renamed from: audioLevel$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate audioLevel;

    /* renamed from: audioTrackPublications$delegate, reason: from kotlin metadata */
    private final StateFlowDelegate audioTrackPublications;

    /* renamed from: connectionQuality$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate connectionQuality;
    private final z coroutineDispatcher;
    private final d0 delegateScope;
    private final BroadcastEventBus<ParticipantEvent> eventBus;
    private final EventListenable<ParticipantEvent> events;

    /* renamed from: identity$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate identity;
    private ParticipantListener internalListener;

    /* renamed from: isCameraEnabled$delegate, reason: from kotlin metadata */
    private final StateFlowDelegate isCameraEnabled;

    /* renamed from: isMicrophoneEnabled$delegate, reason: from kotlin metadata */
    private final StateFlowDelegate isMicrophoneEnabled;

    /* renamed from: isScreenShareEnabled$delegate, reason: from kotlin metadata */
    private final StateFlowDelegate isScreenShareEnabled;

    /* renamed from: isSpeaking$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate isSpeaking;

    /* renamed from: kind$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate kind;

    /* renamed from: lastSpokeAt$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate lastSpokeAt;

    /* renamed from: metadata$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate metadata;

    /* renamed from: name$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.NAME_KEY java.lang.String;

    /* renamed from: participantInfo$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate participantInfo;

    /* renamed from: permissions$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate permissions;
    private d0 scope;
    private String sid;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String;

    /* renamed from: trackPublications$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate trackPublications;

    /* renamed from: videoTrackPublications$delegate, reason: from kotlin metadata */
    private final StateFlowDelegate videoTrackPublications;

    static {
        q qVar = new q(Participant.class, "participantInfo", "getParticipantInfo()Llivekit/LivekitModels$ParticipantInfo;", 0);
        f0 f0Var = e0.f20562a;
        $$delegatedProperties = new u[]{f0Var.e(qVar), n.l(Participant.class, "identity", "getIdentity-4WamZwg()Ljava/lang/String;", 0, f0Var), n.l(Participant.class, RemoteConfigConstants.ResponseFieldKey.STATE, "getState()Lio/livekit/android/room/participant/Participant$State;", 0, f0Var), n.l(Participant.class, "audioLevel", "getAudioLevel()F", 0, f0Var), n.l(Participant.class, "isSpeaking", "isSpeaking()Z", 0, f0Var), n.l(Participant.class, DiagnosticsEntry.NAME_KEY, "getName()Ljava/lang/String;", 0, f0Var), n.l(Participant.class, "metadata", "getMetadata()Ljava/lang/String;", 0, f0Var), n.l(Participant.class, "attributes", "getAttributes()Ljava/util/Map;", 0, f0Var), n.l(Participant.class, "permissions", "getPermissions()Lio/livekit/android/room/participant/ParticipantPermission;", 0, f0Var), n.l(Participant.class, "connectionQuality", "getConnectionQuality()Lio/livekit/android/room/participant/ConnectionQuality;", 0, f0Var), n.l(Participant.class, "lastSpokeAt", "getLastSpokeAt()Ljava/lang/Long;", 0, f0Var), n.l(Participant.class, "kind", "getKind()Lio/livekit/android/room/participant/Participant$Kind;", 0, f0Var), n.l(Participant.class, "trackPublications", "getTrackPublications()Ljava/util/Map;", 0, f0Var), f0Var.h(new w(Participant.class, "audioTrackPublications", "getAudioTrackPublications()Ljava/util/List;", 0)), f0Var.h(new w(Participant.class, "videoTrackPublications", "getVideoTrackPublications()Ljava/util/List;", 0)), f0Var.h(new w(Participant.class, "isMicrophoneEnabled", "isMicrophoneEnabled()Z", 0)), f0Var.h(new w(Participant.class, "isCameraEnabled", "isCameraEnabled()Z", 0)), f0Var.h(new w(Participant.class, "isScreenShareEnabled", "isScreenShareEnabled()Z", 0))};
    }

    private Participant(String str, String str2, z zVar) {
        Identity identity;
        str.getClass();
        zVar.getClass();
        this.sid = str;
        this.coroutineDispatcher = zVar;
        d0 createScope = createScope();
        this.delegateScope = createScope;
        this.scope = createScope();
        BroadcastEventBus<ParticipantEvent> broadcastEventBus = new BroadcastEventBus<>();
        this.eventBus = broadcastEventBus;
        this.events = broadcastEventBus.readOnly();
        this.participantInfo = FlowDelegateKt.flowDelegate$default(null, null, 2, null);
        if (str2 != null) {
            identity = Identity.m2604boximpl(str2);
        } else {
            identity = null;
        }
        this.identity = FlowDelegateKt.flowDelegate$default(identity, null, 2, null);
        this.com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String = FlowDelegateKt.flowDelegate(State.UNKNOWN, new Participant$state$2(this));
        this.audioLevel = FlowDelegateKt.flowDelegate$default(Float.valueOf(t2.u.P), null, 2, null);
        Boolean bool = Boolean.FALSE;
        this.isSpeaking = FlowDelegateKt.flowDelegate(bool, new Participant$isSpeaking$2(this));
        this.com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.NAME_KEY java.lang.String = FlowDelegateKt.flowDelegate(null, new Participant$name$2(this));
        this.metadata = FlowDelegateKt.flowDelegate(null, new Participant$metadata$2(this));
        Participant$attributes$2 participant$attributes$2 = new Participant$attributes$2(this);
        tn.u uVar = tn.u.f33548a;
        this.attributes = FlowDelegateKt.flowDelegate(uVar, participant$attributes$2);
        this.permissions = FlowDelegateKt.flowDelegate(null, new Participant$permissions$2(this));
        this.connectionQuality = FlowDelegateKt.flowDelegate$default(ConnectionQuality.UNKNOWN, null, 2, null);
        this.lastSpokeAt = FlowDelegateKt.flowDelegate$default(null, null, 2, null);
        this.kind = FlowDelegateKt.flowDelegate$default(Kind.UNKNOWN, null, 2, null);
        this.trackPublications = FlowDelegateKt.flowDelegate$default(uVar, null, 2, null);
        final z1 flow = FlowDelegateKt.getFlow(new v(this) { // from class: io.livekit.android.room.participant.Participant$audioTrackPublications$2
            @Override // oo.r
            public Object get() {
                return ((Participant) this.receiver).getTrackPublications();
            }
        });
        i trackUpdateFlow = trackUpdateFlow(new i() { // from class: io.livekit.android.room.participant.Participant$special$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @e(c = "io.livekit.android.room.participant.Participant$special$$inlined$map$1$2", f = "Participant.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                a.g(obj2);
                                j jVar = this.$this_unsafeFlow;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : ((Map) obj).entrySet()) {
                                    if (((TrackPublication) entry.getValue()).getKind() == Track.Kind.AUDIO) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(linkedHashMap, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return sn.z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return sn.z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return sn.z.f31622a;
            }
        });
        v1 v1Var = t1.f18063a;
        t tVar = t.f33547a;
        this.audioTrackPublications = FlowDelegateKt.flowDelegate(r.E(trackUpdateFlow, createScope, v1Var, tVar));
        final z1 flow2 = FlowDelegateKt.getFlow(new v(this) { // from class: io.livekit.android.room.participant.Participant$videoTrackPublications$2
            @Override // oo.r
            public Object get() {
                return ((Participant) this.receiver).getTrackPublications();
            }
        });
        this.videoTrackPublications = FlowDelegateKt.flowDelegate(r.E(trackUpdateFlow(new i() { // from class: io.livekit.android.room.participant.Participant$special$$inlined$map$2

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$2$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @e(c = "io.livekit.android.room.participant.Participant$special$$inlined$map$2$2", f = "Participant.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$2$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                a.g(obj2);
                                j jVar = this.$this_unsafeFlow;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : ((Map) obj).entrySet()) {
                                    if (((TrackPublication) entry.getValue()).getKind() == Track.Kind.VIDEO) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(linkedHashMap, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return sn.z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return sn.z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return sn.z.f31622a;
            }
        }), createScope, v1Var, tVar));
        final z1 flow3 = FlowDelegateKt.getFlow(new v(this) { // from class: io.livekit.android.room.participant.Participant$isMicrophoneEnabled$2
            @Override // oo.r
            public Object get() {
                return ((Participant) this.receiver).getAudioTrackPublications();
            }
        });
        this.isMicrophoneEnabled = FlowDelegateKt.flowDelegate(r.E(isTrackEnabledDetector(new i() { // from class: io.livekit.android.room.participant.Participant$special$$inlined$map$3

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$3$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @e(c = "io.livekit.android.room.participant.Participant$special$$inlined$map$3$2", f = "Participant.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$3$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    Object obj2;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    a.g(obj3);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                a.g(obj3);
                                j jVar = this.$this_unsafeFlow;
                                Iterator<T> it = ((List) obj).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (((TrackPublication) ((k) obj2).f31600a).getSource() == Track.Source.MICROPHONE) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                k kVar = (k) obj2;
                                if (kVar == null) {
                                    kVar = new k(null, null);
                                }
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(kVar, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return sn.z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj32 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return sn.z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return sn.z.f31622a;
            }
        }), createScope, v1Var, bool));
        final z1 flow4 = FlowDelegateKt.getFlow(new v(this) { // from class: io.livekit.android.room.participant.Participant$isCameraEnabled$2
            @Override // oo.r
            public Object get() {
                return ((Participant) this.receiver).getVideoTrackPublications();
            }
        });
        this.isCameraEnabled = FlowDelegateKt.flowDelegate(r.E(isTrackEnabledDetector(new i() { // from class: io.livekit.android.room.participant.Participant$special$$inlined$map$4

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$4$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @e(c = "io.livekit.android.room.participant.Participant$special$$inlined$map$4$2", f = "Participant.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$4$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    Object obj2;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    a.g(obj3);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                a.g(obj3);
                                j jVar = this.$this_unsafeFlow;
                                Iterator<T> it = ((List) obj).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (((TrackPublication) ((k) obj2).f31600a).getSource() == Track.Source.CAMERA) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                k kVar = (k) obj2;
                                if (kVar == null) {
                                    kVar = new k(null, null);
                                }
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(kVar, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return sn.z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj32 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return sn.z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return sn.z.f31622a;
            }
        }), createScope, v1Var, bool));
        final z1 flow5 = FlowDelegateKt.getFlow(new v(this) { // from class: io.livekit.android.room.participant.Participant$isScreenShareEnabled$2
            @Override // oo.r
            public Object get() {
                return ((Participant) this.receiver).getVideoTrackPublications();
            }
        });
        this.isScreenShareEnabled = FlowDelegateKt.flowDelegate(r.E(isTrackEnabledDetector(new i() { // from class: io.livekit.android.room.participant.Participant$special$$inlined$map$5

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$5$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @e(c = "io.livekit.android.room.participant.Participant$special$$inlined$map$5$2", f = "Participant.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.livekit.android.room.participant.Participant$special$$inlined$map$5$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    Object obj2;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    a.g(obj3);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                a.g(obj3);
                                j jVar = this.$this_unsafeFlow;
                                Iterator<T> it = ((List) obj).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (((TrackPublication) ((k) obj2).f31600a).getSource() == Track.Source.SCREEN_SHARE) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                k kVar = (k) obj2;
                                if (kVar == null) {
                                    kVar = new k(null, null);
                                }
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(kVar, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return sn.z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj32 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return sn.z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return sn.z.f31622a;
            }
        }), createScope, v1Var, bool));
    }

    private final d0 createScope() {
        return g0.c(this.coroutineDispatcher.plus(g0.f()));
    }

    private final i isTrackEnabledDetector(i iVar) {
        final jr.j G = r.G(iVar, new Participant$isTrackEnabledDetector$$inlined$flatMapLatest$1(null));
        return new i() { // from class: io.livekit.android.room.participant.Participant$isTrackEnabledDetector$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {TokenNames.T, TokenNames.R, "value", "Lsn/z;", "emit", "(Ljava/lang/Object;Lwn/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: io.livekit.android.room.participant.Participant$isTrackEnabledDetector$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                @e(c = "io.livekit.android.room.participant.Participant$isTrackEnabledDetector$$inlined$map$1$2", f = "Participant.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.livekit.android.room.participant.Participant$isTrackEnabledDetector$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z6;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                a.g(obj2);
                                j jVar = this.$this_unsafeFlow;
                                k kVar = (k) obj;
                                boolean booleanValue = ((Boolean) kVar.f31600a).booleanValue();
                                Track track = (Track) kVar.f31601b;
                                if (!booleanValue && track != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z6);
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(valueOf, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return sn.z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return sn.z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(j jVar, wn.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return sn.z.f31622a;
            }
        };
    }

    private final void setParticipantInfo(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        this.participantInfo.setValue(this, $$delegatedProperties[0], livekitModels$ParticipantInfo);
    }

    private final i trackUpdateFlow(i iVar) {
        return r.G(iVar, new Participant$trackUpdateFlow$$inlined$flatMapLatest$1(null));
    }

    public final void addTrackPublication(TrackPublication publication) {
        publication.getClass();
        Track track = publication.getTrack();
        if (track != null) {
            track.setSid$livekit_android_sdk_release(publication.getSid());
        }
        LinkedHashMap T = a0.T(getTrackPublications());
        T.put(publication.getSid(), publication);
        setTrackPublications(T);
    }

    public void dispose() {
        g0.i(this.scope, null);
        this.sid = Sid.m2612constructorimpl("");
        setName(null);
        m2598setIdentityiHk7GY8(null);
        setMetadata(null);
        setParticipantInfo(null);
        setPermissions$livekit_android_sdk_release(null);
        setConnectionQuality$livekit_android_sdk_release(ConnectionQuality.UNKNOWN);
    }

    public boolean equals(Object other) {
        Class<?> cls;
        if (this == other) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (other != null) {
            cls = other.getClass();
        } else {
            cls = null;
        }
        if (!cls2.equals(cls)) {
            return false;
        }
        other.getClass();
        return Sid.m2614equalsimpl0(this.sid, ((Participant) other).sid);
    }

    public final Map<String, String> getAttributes() {
        return (Map) this.attributes.getValue(this, $$delegatedProperties[7]);
    }

    public final float getAudioLevel() {
        return ((Number) this.audioLevel.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final List<k> getAudioTrackPublications() {
        return (List) this.audioTrackPublications.getValue(this, $$delegatedProperties[13]);
    }

    public final ConnectionQuality getConnectionQuality() {
        return (ConnectionQuality) this.connectionQuality.getValue(this, $$delegatedProperties[9]);
    }

    public final BroadcastEventBus<ParticipantEvent> getEventBus() {
        return this.eventBus;
    }

    public final EventListenable<ParticipantEvent> getEvents() {
        return this.events;
    }

    public final boolean getHasInfo() {
        if (getParticipantInfo() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: getIdentity-4WamZwg */
    public final String m2596getIdentity4WamZwg() {
        Identity identity = (Identity) this.identity.getValue(this, $$delegatedProperties[1]);
        if (identity != null) {
            return identity.m2610unboximpl();
        }
        return null;
    }

    public final ParticipantListener getInternalListener() {
        return this.internalListener;
    }

    public final Long getJoinedAt() {
        LivekitModels$ParticipantInfo participantInfo = getParticipantInfo();
        if (participantInfo != null) {
            return Long.valueOf(participantInfo.getJoinedAt() * SignalClient.CLOSE_REASON_NORMAL_CLOSURE);
        }
        return null;
    }

    public final Kind getKind() {
        return (Kind) this.kind.getValue(this, $$delegatedProperties[11]);
    }

    public final Long getLastSpokeAt() {
        return (Long) this.lastSpokeAt.getValue(this, $$delegatedProperties[10]);
    }

    public final String getMetadata() {
        return (String) this.metadata.getValue(this, $$delegatedProperties[6]);
    }

    public final String getName() {
        return (String) this.com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.NAME_KEY java.lang.String.getValue(this, $$delegatedProperties[5]);
    }

    public final LivekitModels$ParticipantInfo getParticipantInfo() {
        return (LivekitModels$ParticipantInfo) this.participantInfo.getValue(this, $$delegatedProperties[0]);
    }

    public final ParticipantPermission getPermissions() {
        return (ParticipantPermission) this.permissions.getValue(this, $$delegatedProperties[8]);
    }

    public final d0 getScope() {
        return this.scope;
    }

    /* renamed from: getSid-Iza8KQI, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    public final State getState() {
        return (State) this.com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String.getValue(this, $$delegatedProperties[2]);
    }

    public TrackPublication getTrackPublication(Track.Source source) {
        source.getClass();
        if (source == Track.Source.UNKNOWN) {
            return null;
        }
        Iterator<Map.Entry<String, TrackPublication>> it = getTrackPublications().entrySet().iterator();
        while (it.hasNext()) {
            TrackPublication value = it.next().getValue();
            if (value.getSource() == source || (value.getSource() == Track.Source.UNKNOWN && ((source == Track.Source.MICROPHONE && value.getKind() == Track.Kind.AUDIO) || ((source == Track.Source.CAMERA && value.getKind() == Track.Kind.VIDEO && !m.c(value.getName(), "screen")) || (source == Track.Source.SCREEN_SHARE && value.getKind() == Track.Kind.VIDEO && m.c(value.getName(), "screen")))))) {
                return value;
            }
        }
        return null;
    }

    public TrackPublication getTrackPublicationByName(String r42) {
        r42.getClass();
        Iterator<Map.Entry<String, TrackPublication>> it = getTrackPublications().entrySet().iterator();
        while (it.hasNext()) {
            TrackPublication value = it.next().getValue();
            if (m.c(value.getName(), r42)) {
                return value;
            }
        }
        return null;
    }

    public final Map<String, TrackPublication> getTrackPublications() {
        return (Map) this.trackPublications.getValue(this, $$delegatedProperties[12]);
    }

    public final List<k> getVideoTrackPublications() {
        return (List) this.videoTrackPublications.getValue(this, $$delegatedProperties[14]);
    }

    public int hashCode() {
        return Sid.m2615hashCodeimpl(this.sid);
    }

    public final boolean isCameraEnabled() {
        return ((Boolean) this.isCameraEnabled.getValue(this, $$delegatedProperties[16])).booleanValue();
    }

    public final boolean isMicrophoneEnabled() {
        return ((Boolean) this.isMicrophoneEnabled.getValue(this, $$delegatedProperties[15])).booleanValue();
    }

    public final boolean isScreenShareEnabled() {
        return ((Boolean) this.isScreenShareEnabled.getValue(this, $$delegatedProperties[17])).booleanValue();
    }

    public final boolean isSpeaking() {
        return ((Boolean) this.isSpeaking.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final void onTrackMuted$livekit_android_sdk_release(TrackPublication trackPublication) {
        trackPublication.getClass();
        ParticipantListener participantListener = this.internalListener;
        if (participantListener != null) {
            participantListener.onTrackMuted(trackPublication, this);
        }
        this.eventBus.postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TrackMuted(this, trackPublication), this.scope);
    }

    public final void onTrackStreamStateChanged$livekit_android_sdk_release(TrackEvent.StreamStateChanged trackEvent) {
        trackEvent.getClass();
        TrackPublication trackPublication = getTrackPublications().get(trackEvent.getTrack().getSid());
        if (trackPublication == null) {
            return;
        }
        this.eventBus.postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TrackStreamStateChanged(this, trackPublication, trackEvent.getStreamState()), this.scope);
    }

    public final void onTrackUnmuted$livekit_android_sdk_release(TrackPublication trackPublication) {
        trackPublication.getClass();
        ParticipantListener participantListener = this.internalListener;
        if (participantListener != null) {
            participantListener.onTrackUnmuted(trackPublication, this);
        }
        this.eventBus.postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TrackUnmuted(this, trackPublication), this.scope);
    }

    public final void onTranscriptionReceived$livekit_android_sdk_release(RoomEvent.TranscriptionReceived transcription) {
        transcription.getClass();
        if (!m.c(transcription.getParticipant(), this)) {
            return;
        }
        this.eventBus.postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.TranscriptionReceived(this, transcription.getTranscriptionSegments(), transcription.getPublication()), this.scope);
    }

    public final void reinitialize$livekit_android_sdk_release() {
        if (!g0.y(this.scope)) {
            this.scope = createScope();
        }
    }

    public final void setAttributes(Map<String, String> map) {
        map.getClass();
        this.attributes.setValue(this, $$delegatedProperties[7], map);
    }

    public final void setAudioLevel(float f10) {
        this.audioLevel.setValue(this, $$delegatedProperties[3], Float.valueOf(f10));
    }

    public final void setConnectionQuality$livekit_android_sdk_release(ConnectionQuality connectionQuality) {
        connectionQuality.getClass();
        this.connectionQuality.setValue(this, $$delegatedProperties[9], connectionQuality);
    }

    /* renamed from: setIdentity-iHk7GY8 */
    public final void m2598setIdentityiHk7GY8(String str) {
        Identity identity;
        MutableStateFlowDelegate mutableStateFlowDelegate = this.identity;
        u uVar = $$delegatedProperties[1];
        if (str != null) {
            identity = Identity.m2604boximpl(str);
        } else {
            identity = null;
        }
        mutableStateFlowDelegate.setValue(this, uVar, identity);
    }

    public final void setInternalListener(ParticipantListener participantListener) {
        this.internalListener = participantListener;
    }

    public final void setKind$livekit_android_sdk_release(Kind kind) {
        kind.getClass();
        this.kind.setValue(this, $$delegatedProperties[11], kind);
    }

    public final void setLastSpokeAt$livekit_android_sdk_release(Long l4) {
        this.lastSpokeAt.setValue(this, $$delegatedProperties[10], l4);
    }

    public final void setMetadata(String str) {
        this.metadata.setValue(this, $$delegatedProperties[6], str);
    }

    public final void setName(String str) {
        this.com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.NAME_KEY java.lang.String.setValue(this, $$delegatedProperties[5], str);
    }

    public final void setPermissions$livekit_android_sdk_release(ParticipantPermission participantPermission) {
        this.permissions.setValue(this, $$delegatedProperties[8], participantPermission);
    }

    /* renamed from: setSid-yvz9xIM */
    public final void m2599setSidyvz9xIM(String str) {
        str.getClass();
        this.sid = str;
    }

    public final void setSpeaking(boolean z6) {
        this.isSpeaking.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z6));
    }

    public final void setState(State state) {
        state.getClass();
        this.com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String.setValue(this, $$delegatedProperties[2], state);
    }

    public final void setTrackPublications(Map<String, ? extends TrackPublication> map) {
        map.getClass();
        this.trackPublications.setValue(this, $$delegatedProperties[12], map);
    }

    public void updateFromInfo(LivekitModels$ParticipantInfo r32) {
        r32.getClass();
        String sid = r32.getSid();
        sid.getClass();
        this.sid = Sid.m2612constructorimpl(sid);
        String identity = r32.getIdentity();
        identity.getClass();
        m2598setIdentityiHk7GY8(Identity.m2605constructorimpl(identity));
        setParticipantInfo(r32);
        setMetadata(r32.getMetadata());
        setName(r32.getName());
        Kind.Companion companion = Kind.INSTANCE;
        r7 kind = r32.getKind();
        kind.getClass();
        setKind$livekit_android_sdk_release(companion.fromProto(kind));
        if (r32.hasPermission()) {
            ParticipantPermission.Companion companion2 = ParticipantPermission.INSTANCE;
            LivekitModels$ParticipantPermission permission = r32.getPermission();
            permission.getClass();
            setPermissions$livekit_android_sdk_release(companion2.fromProto(permission));
        }
        Map<String, String> attributesMap = r32.getAttributesMap();
        attributesMap.getClass();
        setAttributes(attributesMap);
        State.Companion companion3 = State.INSTANCE;
        t7 state = r32.getState();
        state.getClass();
        setState(companion3.fromProto(state));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lio/livekit/android/room/participant/Participant$Identity;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @go.a
    @g
    /* loaded from: classes4.dex */
    public static final class Identity {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        private /* synthetic */ Identity(String str) {
            this.value = str;
        }

        /* renamed from: box-impl */
        public static final /* synthetic */ Identity m2604boximpl(String str) {
            return new Identity(str);
        }

        /* renamed from: constructor-impl */
        public static String m2605constructorimpl(String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl */
        public static boolean m2606equalsimpl(String str, Object obj) {
            if (!(obj instanceof Identity) || !m.c(str, ((Identity) obj).m2610unboximpl())) {
                return false;
            }
            return true;
        }

        /* renamed from: equals-impl0 */
        public static final boolean m2607equalsimpl0(String str, String str2) {
            return m.c(str, str2);
        }

        /* renamed from: hashCode-impl */
        public static int m2608hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl */
        public static String m2609toStringimpl(String str) {
            return f.c(')', "Identity(value=", str);
        }

        public boolean equals(Object obj) {
            return m2606equalsimpl(this.value, obj);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m2608hashCodeimpl(this.value);
        }

        public String toString() {
            return m2609toStringimpl(this.value);
        }

        /* renamed from: unbox-impl */
        public final /* synthetic */ String m2610unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/participant/Participant$Identity$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/participant/Participant$Identity;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return Participant$Identity$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lio/livekit/android/room/participant/Participant$Kind;", "", "(Ljava/lang/String;I)V", "AGENT", "STANDARD", "INGRESS", "EGRESS", "SIP", "UNKNOWN", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Kind extends Enum<Kind> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Kind AGENT = new Kind("AGENT", 0);
        public static final Kind STANDARD = new Kind("STANDARD", 1);
        public static final Kind INGRESS = new Kind("INGRESS", 2);
        public static final Kind EGRESS = new Kind("EGRESS", 3);
        public static final Kind SIP = new Kind("SIP", 4);
        public static final Kind UNKNOWN = new Kind("UNKNOWN", 5);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{AGENT, STANDARD, INGRESS, EGRESS, SIP, UNKNOWN};
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
            INSTANCE = new Companion(null);
        }

        private Kind(String str, int i10) {
            super(str, i10);
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/room/participant/Participant$Kind$Companion;", "", "<init>", "()V", "Las/r7;", "proto", "Lio/livekit/android/room/participant/Participant$Kind;", "fromProto", "(Las/r7;)Lio/livekit/android/room/participant/Participant$Kind;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[r7.values().length];
                    try {
                        iArr[4] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[0] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[1] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[2] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[3] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[5] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final Kind fromProto(r7 proto) {
                proto.getClass();
                int ordinal = proto.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        return Kind.UNKNOWN;
                                    }
                                    c6.p();
                                    return null;
                                }
                                return Kind.AGENT;
                            }
                            return Kind.SIP;
                        }
                        return Kind.EGRESS;
                    }
                    return Kind.INGRESS;
                }
                return Kind.STANDARD;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lio/livekit/android/room/participant/Participant$Sid;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @go.a
    @g
    /* loaded from: classes4.dex */
    public static final class Sid {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        private /* synthetic */ Sid(String str) {
            this.value = str;
        }

        /* renamed from: box-impl */
        public static final /* synthetic */ Sid m2611boximpl(String str) {
            return new Sid(str);
        }

        /* renamed from: constructor-impl */
        public static String m2612constructorimpl(String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl */
        public static boolean m2613equalsimpl(String str, Object obj) {
            if (!(obj instanceof Sid) || !m.c(str, ((Sid) obj).m2617unboximpl())) {
                return false;
            }
            return true;
        }

        /* renamed from: equals-impl0 */
        public static final boolean m2614equalsimpl0(String str, String str2) {
            return m.c(str, str2);
        }

        /* renamed from: hashCode-impl */
        public static int m2615hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl */
        public static String m2616toStringimpl(String str) {
            return f.c(')', "Sid(value=", str);
        }

        public boolean equals(Object obj) {
            return m2613equalsimpl(this.value, obj);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m2615hashCodeimpl(this.value);
        }

        public String toString() {
            return m2616toStringimpl(this.value);
        }

        /* renamed from: unbox-impl */
        public final /* synthetic */ String m2617unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/participant/Participant$Sid$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/participant/Participant$Sid;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return Participant$Sid$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lio/livekit/android/room/participant/Participant$State;", "", "(Ljava/lang/String;I)V", "JOINING", "JOINED", "ACTIVE", "DISCONNECTED", "UNKNOWN", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class State extends Enum<State> {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final State JOINING = new State("JOINING", 0);
        public static final State JOINED = new State("JOINED", 1);
        public static final State ACTIVE = new State("ACTIVE", 2);
        public static final State DISCONNECTED = new State("DISCONNECTED", 3);
        public static final State UNKNOWN = new State("UNKNOWN", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{JOINING, JOINED, ACTIVE, DISCONNECTED, UNKNOWN};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
            INSTANCE = new Companion(null);
        }

        private State(String str, int i10) {
            super(str, i10);
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/livekit/android/room/participant/Participant$State$Companion;", "", "<init>", "()V", "Las/t7;", "proto", "Lio/livekit/android/room/participant/Participant$State;", "fromProto", "(Las/t7;)Lio/livekit/android/room/participant/Participant$State;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[t7.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[3] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[4] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final State fromProto(t7 proto) {
                proto.getClass();
                int ordinal = proto.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    return State.UNKNOWN;
                                }
                                c6.p();
                                return null;
                            }
                            return State.DISCONNECTED;
                        }
                        return State.ACTIVE;
                    }
                    return State.JOINED;
                }
                return State.JOINING;
            }

            private Companion() {
            }
        }
    }

    public static /* synthetic */ void getAttributes$annotations() {
    }

    public static /* synthetic */ void getAudioLevel$annotations() {
    }

    public static /* synthetic */ void getAudioTrackPublications$annotations() {
    }

    public static /* synthetic */ void getConnectionQuality$annotations() {
    }

    /* renamed from: getIdentity-4WamZwg$annotations */
    public static /* synthetic */ void m2595getIdentity4WamZwg$annotations() {
    }

    @sn.c
    public static /* synthetic */ void getInternalListener$annotations() {
    }

    public static /* synthetic */ void getKind$annotations() {
    }

    public static /* synthetic */ void getLastSpokeAt$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getParticipantInfo$annotations() {
    }

    public static /* synthetic */ void getPermissions$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    public static /* synthetic */ void getTrackPublications$annotations() {
    }

    public static /* synthetic */ void getVideoTrackPublications$annotations() {
    }

    public static /* synthetic */ void isCameraEnabled$annotations() {
    }

    public static /* synthetic */ void isMicrophoneEnabled$annotations() {
    }

    public static /* synthetic */ void isScreenShareEnabled$annotations() {
    }

    public static /* synthetic */ void isSpeaking$annotations() {
    }

    public /* synthetic */ Participant(String str, String str2, z zVar, kotlin.jvm.internal.f fVar) {
        this(str, str2, zVar);
    }

    public /* synthetic */ Participant(String str, String str2, z zVar, int i10, kotlin.jvm.internal.f fVar) {
        this(str, (i10 & 2) != 0 ? null : str2, zVar, null);
    }
}
