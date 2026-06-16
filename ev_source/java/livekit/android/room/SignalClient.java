package io.livekit.android.room;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import as.ac;
import as.ae;
import as.cc;
import as.e9;
import as.ec;
import as.jb;
import as.kd;
import as.l7;
import as.p9;
import as.qc;
import as.rc;
import as.s6;
import as.sc;
import as.tc;
import as.uc;
import as.ud;
import as.vd;
import as.yd;
import as.zd;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import et.d;
import fr.g0;
import fr.k1;
import fr.l;
import fr.n;
import fr.z;
import gg.b;
import gl.a;
import ig.f;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.livekit.android.ConnectOptions;
import io.livekit.android.RoomOptions;
import io.livekit.android.e2ee.E2EEOptions;
import io.livekit.android.room.participant.ParticipantTrackPermission;
import io.livekit.android.room.track.Track;
import io.livekit.android.stats.ClientInfoKt;
import io.livekit.android.stats.NetworkInfo;
import io.livekit.android.util.CloseableCoroutineScope;
import io.livekit.android.util.Either;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.util.UrlUtilsKt;
import io.livekit.android.webrtc.SessionDescriptionExtKt;
import ir.i1;
import ir.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$ClientInfo;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$ParticipantTracks;
import livekit.LivekitModels$Room;
import livekit.LivekitModels$SpeakerInfo;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.LivekitRtc$ConnectionQualityInfo;
import livekit.LivekitRtc$JoinResponse;
import livekit.LivekitRtc$LeaveRequest;
import livekit.LivekitRtc$MuteTrackRequest;
import livekit.LivekitRtc$Ping;
import livekit.LivekitRtc$ReconnectResponse;
import livekit.LivekitRtc$SessionDescription;
import livekit.LivekitRtc$SignalRequest;
import livekit.LivekitRtc$SignalResponse;
import livekit.LivekitRtc$SimulateScenario;
import livekit.LivekitRtc$StreamStateInfo;
import livekit.LivekitRtc$SubscribedQualityUpdate;
import livekit.LivekitRtc$SubscriptionPermission;
import livekit.LivekitRtc$SubscriptionPermissionUpdate;
import livekit.LivekitRtc$SyncState;
import livekit.LivekitRtc$TrackPublishedResponse;
import livekit.LivekitRtc$TrackSubscribed;
import livekit.LivekitRtc$TrackUnpublishedResponse;
import livekit.LivekitRtc$TrickleRequest;
import livekit.LivekitRtc$UpdateLocalAudioTrack;
import livekit.LivekitRtc$UpdateParticipantMetadata;
import livekit.LivekitRtc$UpdateSubscription;
import livekit.LivekitRtc$UpdateTrackSettings;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.connection.RealCall;
import sn.k;
import tn.p;
import tn.u;
import vr.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 Ù\u00012\u00020\u0001:\u0004Ù\u0001Ú\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J6\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0087@¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b$\u0010(J'\u0010,\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010-J)\u00103\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u001b2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u001b2\u0006\u00109\u001a\u000205¢\u0006\u0004\b:\u00108J\u001d\u0010?\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u001d\u0010D\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ9\u0010M\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020H2\b\u0010J\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ;\u0010V\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020B2\b\u0010R\u001a\u0004\u0018\u00010Q2\b\u0010T\u001a\u0004\u0018\u00010S2\b\u0010U\u001a\u0004\u0018\u00010)¢\u0006\u0004\bV\u0010WJ)\u0010\\\u001a\u00020\u001b2\u0006\u0010X\u001a\u00020B2\u0012\u0010[\u001a\n\u0012\u0006\b\u0001\u0012\u00020Z0Y\"\u00020Z¢\u0006\u0004\b\\\u0010]J#\u0010b\u001a\u00020\u001b2\u0006\u0010^\u001a\u00020B2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020`0_¢\u0006\u0004\bb\u0010cJ9\u0010g\u001a\u00020\u001b2\b\u0010d\u001a\u0004\u0018\u00010\u000e2\b\u0010G\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010e¢\u0006\u0004\bg\u0010hJ\u0015\u0010k\u001a\u00020\u001b2\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u0017\u0010q\u001a\u00020\u001b2\u0006\u0010n\u001a\u00020mH\u0000¢\u0006\u0004\bo\u0010pJ\r\u0010r\u001a\u00020\u001b¢\u0006\u0004\br\u0010\u001fJ\r\u0010t\u001a\u00020s¢\u0006\u0004\bt\u0010uJ#\u0010y\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u000e2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020w0v¢\u0006\u0004\by\u0010zJ+\u0010|\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010{\u001a\u00020B¢\u0006\u0004\b|\u0010}JH\u0010~\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b~\u0010\u0017J+\u0010\u0081\u0001\u001a\u00020\u000e2\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0011\u0010\u0083\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0083\u0001\u0010\u001fJ\"\u0010\u0084\u0001\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001c\u0010\u0088\u0001\u001a\u0002052\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008c\u0001\u001a\u00020\u001b2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001c\u0010\u008e\u0001\u001a\u00020\u001b2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008d\u0001J$\u0010\u0091\u0001\u001a\u00020\u001b2\u0007\u0010\u008f\u0001\u001a\u00020!2\u0007\u00102\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J$\u0010\u0093\u0001\u001a\u00020\u001b2\u0007\u0010\u008f\u0001\u001a\u00020!2\u0007\u00102\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0092\u0001J\u0011\u0010\u0094\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0094\u0001\u0010\u001fJ\u001b\u0010\u0096\u0001\u001a\u00020\u001b2\u0007\u0010\u0095\u0001\u001a\u00020sH\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0098\u0001\u0010\u001fR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0099\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u009a\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u009b\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u009c\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u009d\u0001R*\u0010\u009f\u0001\u001a\u00020B2\u0007\u0010\u009e\u0001\u001a\u00020B8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b\u009f\u0001\u0010¡\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010¤\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010 \u0001R,\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R,\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001b\u0010µ\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001b\u0010·\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R:\u0010º\u0001\u001a#\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\u0019\u0018\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001a\u0010½\u0001\u001a\u00030¼\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ã\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001c\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R,\u0010É\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0005\u0012\u00030\u0090\u00010È\u00010¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Á\u0001R\u0018\u0010Ê\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ä\u0001R\u001c\u0010Ë\u0001\u001a\u0005\u0018\u00010Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ç\u0001R\u001c\u0010Ì\u0001\u001a\u0005\u0018\u00010Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Ç\u0001R\u001c\u0010Í\u0001\u001a\u0005\u0018\u00010Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Ç\u0001R\u0019\u0010Î\u0001\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0019\u0010Ð\u0001\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ï\u0001R\u0019\u0010Ñ\u0001\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ï\u0001R*\u0010Ó\u0001\u001a\u00030Ò\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001¨\u0006Û\u0001"}, d2 = {"Lio/livekit/android/room/SignalClient;", "Lokhttp3/WebSocketListener;", "Lokhttp3/WebSocket$Factory;", "websocketFactory", "Lvr/c;", "json", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lfr/z;", "ioDispatcher", "Lio/livekit/android/stats/NetworkInfo;", "networkInfo", "<init>", "(Lokhttp3/WebSocket$Factory;Lvr/c;Lokhttp3/OkHttpClient;Lfr/z;Lio/livekit/android/stats/NetworkInfo;)V", "", "url", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Lio/livekit/android/ConnectOptions;", "options", "Lio/livekit/android/RoomOptions;", "roomOptions", "Llivekit/LivekitRtc$JoinResponse;", "join", "(Ljava/lang/String;Ljava/lang/String;Lio/livekit/android/ConnectOptions;Lio/livekit/android/RoomOptions;Lwn/c;)Ljava/lang/Object;", "participantSid", "Lio/livekit/android/util/Either;", "Llivekit/LivekitRtc$ReconnectResponse;", "Lsn/z;", SignalClient.CONNECT_QUERY_RECONNECT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "onReadyForResponses", "()V", "onPCConnected", "Lokhttp3/WebSocket;", "webSocket", ParameterNames.TEXT, "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "Lfs/k;", "bytes", "(Lokhttp3/WebSocket;Lfs/k;)V", "", "code", "reason", "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "onClosing", "", "t", "Lokhttp3/Response;", "response", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "Llivekit/org/webrtc/SessionDescription;", SignalClient.SD_TYPE_OFFER, "sendOffer", "(Llivekit/org/webrtc/SessionDescription;)V", SignalClient.SD_TYPE_ANSWER, "sendAnswer", "Llivekit/org/webrtc/IceCandidate;", "candidate", "Las/uc;", "target", "sendCandidate", "(Llivekit/org/webrtc/IceCandidate;Las/uc;)V", "trackSid", "", "muted", "sendMuteTrack", "(Ljava/lang/String;Z)V", "cid", DiagnosticsEntry.NAME_KEY, "Las/e9;", "type", "stream", "Las/jb;", "builder", "sendAddTrack", "(Ljava/lang/String;Ljava/lang/String;Las/e9;Ljava/lang/String;Las/jb;)V", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "disabled", "Lio/livekit/android/room/track/Track$Dimensions;", "videoDimensions", "Las/p9;", "videoQuality", "fps", "sendUpdateTrackSettings", "(Ljava/lang/String;ZLio/livekit/android/room/track/Track$Dimensions;Las/p9;Ljava/lang/Integer;)V", "subscribe", "", "Llivekit/LivekitModels$ParticipantTracks;", "participantTracks", "sendUpdateSubscription", "(Z[Llivekit/LivekitModels$ParticipantTracks;)V", "allParticipants", "", "Lio/livekit/android/room/participant/ParticipantTrackPermission;", "participantTrackPermissions", "sendUpdateSubscriptionPermissions", "(ZLjava/util/List;)V", "metadata", "", "attributes", "sendUpdateLocalMetadata", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Llivekit/LivekitRtc$SyncState;", "syncState", "sendSyncState", "(Llivekit/LivekitRtc$SyncState;)V", "Llivekit/LivekitRtc$SimulateScenario;", "scenario", "sendSimulateScenario$livekit_android_sdk_release", "(Llivekit/LivekitRtc$SimulateScenario;)V", "sendSimulateScenario", "sendLeave", "", "sendPing", "()J", "", "Las/s6;", "features", "sendUpdateLocalAudioTrack", "(Ljava/lang/String;Ljava/util/Collection;)V", "shouldClearQueuedRequests", "close", "(ILjava/lang/String;Z)V", "connect", "Llivekit/LivekitModels$ClientInfo;", "clientInfo", "createConnectionParams", "(Llivekit/LivekitModels$ClientInfo;Lio/livekit/android/ConnectOptions;Lio/livekit/android/RoomOptions;)Ljava/lang/String;", "startRequestQueue", "handleWebSocketClose", "(Ljava/lang/String;I)V", "Llivekit/LivekitRtc$SessionDescription;", "sd", "fromProtoSessionDescription", "(Llivekit/LivekitRtc$SessionDescription;)Llivekit/org/webrtc/SessionDescription;", "Llivekit/LivekitRtc$SignalRequest;", "request", "sendRequest", "(Llivekit/LivekitRtc$SignalRequest;)V", "sendRequestImpl", "ws", "Llivekit/LivekitRtc$SignalResponse;", "handleSignalResponse", "(Lokhttp3/WebSocket;Llivekit/LivekitRtc$SignalResponse;)V", "handleSignalResponseImpl", "startPingJob", DiagnosticsEntry.TIMESTAMP_KEY, "startPingTimeout", "(J)V", "resetPingTimeout", "Lokhttp3/WebSocket$Factory;", "Lvr/c;", "Lokhttp3/OkHttpClient;", "Lfr/z;", "Lio/livekit/android/stats/NetworkInfo;", "<set-?>", "isConnected", "Z", "()Z", "currentWs", "Lokhttp3/WebSocket;", "isReconnecting", "Lio/livekit/android/room/SignalClient$Listener;", "listener", "Lio/livekit/android/room/SignalClient$Listener;", "getListener", "()Lio/livekit/android/room/SignalClient$Listener;", "setListener", "(Lio/livekit/android/room/SignalClient$Listener;)V", "Lgl/a;", "serverVersion", "Lgl/a;", "getServerVersion$livekit_android_sdk_release", "()Lgl/a;", "setServerVersion$livekit_android_sdk_release", "(Lgl/a;)V", "lastUrl", "Ljava/lang/String;", "lastOptions", "Lio/livekit/android/ConnectOptions;", "lastRoomOptions", "Lio/livekit/android/RoomOptions;", "Lfr/l;", "joinContinuation", "Lfr/l;", "Lio/livekit/android/util/CloseableCoroutineScope;", "coroutineScope", "Lio/livekit/android/util/CloseableCoroutineScope;", "Lir/i1;", "requestFlow", "Lir/i1;", "Ljava/lang/Object;", "requestFlowJobLock", "Ljava/lang/Object;", "Lfr/k1;", "requestFlowJob", "Lfr/k1;", "Lsn/k;", "responseFlow", "responseFlowJobLock", "responseFlowJob", "pingJob", "pongJob", "pingTimeoutDurationMillis", "J", "pingIntervalDurationMillis", "rtt", "Lio/livekit/android/room/ConnectionState;", "connectionState", "Lio/livekit/android/room/ConnectionState;", "getConnectionState", "()Lio/livekit/android/room/ConnectionState;", "setConnectionState", "(Lio/livekit/android/room/ConnectionState;)V", "Companion", "Listener", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SignalClient extends WebSocketListener {
    public static final int CLOSE_REASON_NORMAL_CLOSURE = 1000;
    public static final int CLOSE_REASON_PING_TIMEOUT = 3000;
    public static final int CLOSE_REASON_WEBSOCKET_FAILURE = 3500;
    public static final String CONNECT_QUERY_ADAPTIVE_STREAM = "adaptive_stream";
    public static final String CONNECT_QUERY_AUTOSUBSCRIBE = "auto_subscribe";
    public static final String CONNECT_QUERY_DEVICE_MODEL = "device_model";
    public static final String CONNECT_QUERY_NETWORK_TYPE = "network";
    public static final String CONNECT_QUERY_OS = "os";
    public static final String CONNECT_QUERY_OS_VERSION = "os_version";
    public static final String CONNECT_QUERY_PARTICIPANT_SID = "sid";
    public static final String CONNECT_QUERY_PROTOCOL = "protocol";
    public static final String CONNECT_QUERY_RECONNECT = "reconnect";
    public static final String CONNECT_QUERY_SDK = "sdk";
    public static final String CONNECT_QUERY_TOKEN = "access_token";
    public static final String CONNECT_QUERY_VERSION = "version";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final List<PeerConnection.IceServer> DEFAULT_ICE_SERVERS;
    public static final String SDK_TYPE = "android";
    public static final String SD_TYPE_ANSWER = "answer";
    public static final String SD_TYPE_OFFER = "offer";
    public static final String SD_TYPE_PRANSWER = "pranswer";
    public static final String SD_TYPE_ROLLBACK = "rollback";
    private static final List<rc> skipQueueTypes;
    private ConnectionState connectionState;
    private CloseableCoroutineScope coroutineScope;
    private WebSocket currentWs;
    private final z ioDispatcher;
    private boolean isConnected;
    private boolean isReconnecting;
    private l joinContinuation;
    private final c json;
    private ConnectOptions lastOptions;
    private RoomOptions lastRoomOptions;
    private String lastUrl;
    private Listener listener;
    private final NetworkInfo networkInfo;
    private final OkHttpClient okHttpClient;
    private long pingIntervalDurationMillis;
    private k1 pingJob;
    private long pingTimeoutDurationMillis;
    private k1 pongJob;
    private final i1 requestFlow;
    private k1 requestFlowJob;
    private final Object requestFlowJobLock;
    private final i1 responseFlow;
    private k1 responseFlowJob;
    private final Object responseFlowJobLock;
    private long rtt;
    private a serverVersion;
    private final WebSocket.Factory websocketFactory;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012H&¢\u0006\u0004\b\u0019\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H&¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020)0\u0012H&¢\u0006\u0004\b*\u0010\u0016J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H&¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0012H&¢\u0006\u0004\b5\u0010\u0016J\u0017\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206H&¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H&¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u001aH&¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020AH&¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lio/livekit/android/room/SignalClient$Listener;", "", "Llivekit/org/webrtc/SessionDescription;", "sessionDescription", "Lsn/z;", "onAnswer", "(Llivekit/org/webrtc/SessionDescription;)V", "onOffer", "Llivekit/org/webrtc/IceCandidate;", "candidate", "Las/uc;", "target", "onTrickle", "(Llivekit/org/webrtc/IceCandidate;Las/uc;)V", "Llivekit/LivekitRtc$TrackPublishedResponse;", "response", "onLocalTrackPublished", "(Llivekit/LivekitRtc$TrackPublishedResponse;)V", "", "Llivekit/LivekitModels$ParticipantInfo;", "updates", "onParticipantUpdate", "(Ljava/util/List;)V", "Llivekit/LivekitModels$SpeakerInfo;", "speakers", "onSpeakersChanged", "", "reason", "", "code", "onClose", "(Ljava/lang/String;I)V", "trackSid", "", "muted", "onRemoteMuteChanged", "(Ljava/lang/String;Z)V", "Llivekit/LivekitModels$Room;", "update", "onRoomUpdate", "(Llivekit/LivekitModels$Room;)V", "Llivekit/LivekitRtc$ConnectionQualityInfo;", "onConnectionQuality", "Llivekit/LivekitRtc$LeaveRequest;", "leave", "onLeave", "(Llivekit/LivekitRtc$LeaveRequest;)V", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onError", "(Ljava/lang/Throwable;)V", "Llivekit/LivekitRtc$StreamStateInfo;", "streamStates", "onStreamStateUpdate", "Llivekit/LivekitRtc$SubscribedQualityUpdate;", "subscribedQualityUpdate", "onSubscribedQualityUpdate", "(Llivekit/LivekitRtc$SubscribedQualityUpdate;)V", "Llivekit/LivekitRtc$SubscriptionPermissionUpdate;", "subscriptionPermissionUpdate", "onSubscriptionPermissionUpdate", "(Llivekit/LivekitRtc$SubscriptionPermissionUpdate;)V", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "onRefreshToken", "(Ljava/lang/String;)V", "Llivekit/LivekitRtc$TrackUnpublishedResponse;", "trackUnpublished", "onLocalTrackUnpublished", "(Llivekit/LivekitRtc$TrackUnpublishedResponse;)V", "Llivekit/LivekitRtc$TrackSubscribed;", "trackSubscribed", "onLocalTrackSubscribed", "(Llivekit/LivekitRtc$TrackSubscribed;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Listener {
        void onAnswer(SessionDescription sessionDescription);

        void onClose(String reason, int code);

        void onConnectionQuality(List<LivekitRtc$ConnectionQualityInfo> updates);

        void onError(Throwable r12);

        void onLeave(LivekitRtc$LeaveRequest leave);

        void onLocalTrackPublished(LivekitRtc$TrackPublishedResponse response);

        void onLocalTrackSubscribed(LivekitRtc$TrackSubscribed trackSubscribed);

        void onLocalTrackUnpublished(LivekitRtc$TrackUnpublishedResponse trackUnpublished);

        void onOffer(SessionDescription sessionDescription);

        void onParticipantUpdate(List<LivekitModels$ParticipantInfo> updates);

        void onRefreshToken(String r12);

        void onRemoteMuteChanged(String trackSid, boolean muted);

        void onRoomUpdate(LivekitModels$Room update);

        void onSpeakersChanged(List<LivekitModels$SpeakerInfo> speakers);

        void onStreamStateUpdate(List<LivekitRtc$StreamStateInfo> streamStates);

        void onSubscribedQualityUpdate(LivekitRtc$SubscribedQualityUpdate subscribedQualityUpdate);

        void onSubscriptionPermissionUpdate(LivekitRtc$SubscriptionPermissionUpdate subscriptionPermissionUpdate);

        void onTrickle(IceCandidate candidate, uc target);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[tc.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[21] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[8] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[0] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[6] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[7] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[10] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[11] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[12] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[13] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[14] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[16] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[17] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[19] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[20] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[25] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[22] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[23] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[24] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        skipQueueTypes = f.I(rc.f3913z0, rc.f3907c, rc.f3905a, rc.f3906b, rc.A0, rc.Z);
        DEFAULT_ICE_SERVERS = f.I(companion.iceServer("stun:stun.l.google.com:19302"), companion.iceServer("stun:stun1.l.google.com:19302"));
    }

    public SignalClient(WebSocket.Factory factory, c cVar, OkHttpClient okHttpClient, z zVar, NetworkInfo networkInfo) {
        factory.getClass();
        cVar.getClass();
        okHttpClient.getClass();
        zVar.getClass();
        networkInfo.getClass();
        this.websocketFactory = factory;
        this.json = cVar;
        this.okHttpClient = okHttpClient;
        this.ioDispatcher = zVar;
        this.networkInfo = networkInfo;
        this.requestFlow = r.b(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, null, 6);
        this.requestFlowJobLock = new Object();
        this.responseFlow = r.b(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, null, 6);
        this.responseFlowJobLock = new Object();
        this.connectionState = ConnectionState.DISCONNECTED;
    }

    public static /* synthetic */ void close$default(SignalClient signalClient, int i10, String str, boolean z6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = CLOSE_REASON_NORMAL_CLOSURE;
        }
        if ((i11 & 2) != 0) {
            str = "Normal Closure";
        }
        if ((i11 & 4) != 0) {
            z6 = true;
        }
        signalClient.close(i10, str, z6);
    }

    public final Object connect(String str, String str2, ConnectOptions connectOptions, RoomOptions roomOptions, wn.c<? super Either<LivekitRtc$JoinResponse, ? extends Either<LivekitRtc$ReconnectResponse, sn.z>>> cVar) {
        close$default(this, 0, "Starting new connection", false, 1, null);
        StringBuilder sb = new StringBuilder();
        sb.append(UrlUtilsKt.toWebsocketUrl(str));
        sb.append("/rtc");
        LivekitModels$ClientInfo clientInfo = ClientInfoKt.getClientInfo();
        clientInfo.getClass();
        sb.append(createConnectionParams(clientInfo, connectOptions, roomOptions));
        String sb2 = sb.toString();
        this.isReconnecting = connectOptions.getReconnect();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.c(null, "connecting to ".concat(sb2), new Object[0]);
        }
        this.coroutineScope = new CloseableCoroutineScope(n0.l.J(g0.f(), this.ioDispatcher));
        this.lastUrl = sb2;
        this.lastOptions = connectOptions;
        this.lastRoomOptions = roomOptions;
        Request.Builder builder = new Request.Builder();
        builder.f(sb2);
        builder.a(SIPHeaderNames.AUTHORIZATION, "Bearer " + str2);
        Request request = new Request(builder);
        n nVar = new n(1, b.V(cVar));
        nVar.t();
        this.joinContinuation = nVar;
        this.currentWs = this.websocketFactory.b(request, this);
        return nVar.s();
    }

    private final String createConnectionParams(LivekitModels$ClientInfo clientInfo, ConnectOptions options, RoomOptions roomOptions) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k(CONNECT_QUERY_PROTOCOL, String.valueOf(options.getProtocolVersion().getValue())));
        if (options.getReconnect()) {
            arrayList.add(new k(CONNECT_QUERY_RECONNECT, "1"));
            String participantSid = options.getParticipantSid();
            if (participantSid != null) {
                arrayList.add(new k(CONNECT_QUERY_PARTICIPANT_SID, participantSid));
            }
        }
        arrayList.add(new k(CONNECT_QUERY_AUTOSUBSCRIBE, String.valueOf(options.getAutoSubscribe() ? 1 : 0)));
        arrayList.add(new k(CONNECT_QUERY_ADAPTIVE_STREAM, String.valueOf(roomOptions.getAdaptiveStream() ? 1 : 0)));
        arrayList.add(new k(CONNECT_QUERY_SDK, SDK_TYPE));
        arrayList.add(new k("version", clientInfo.getVersion()));
        arrayList.add(new k(CONNECT_QUERY_DEVICE_MODEL, clientInfo.getDeviceModel()));
        arrayList.add(new k(CONNECT_QUERY_OS, clientInfo.getOs()));
        arrayList.add(new k(CONNECT_QUERY_OS_VERSION, clientInfo.getOsVersion()));
        arrayList.add(new k(CONNECT_QUERY_NETWORK_TYPE, this.networkInfo.getNetworkType().getProtoName()));
        String str2 = "";
        int i10 = 0;
        for (Object obj : arrayList) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                k kVar = (k) obj;
                if (i10 == 0) {
                    str = Separators.QUESTION;
                } else {
                    str = Separators.AND;
                }
                StringBuilder q = defpackage.f.q(str2, str);
                q.append((String) kVar.f31600a);
                q.append('=');
                q.append((String) kVar.f31601b);
                str2 = q.toString();
                i10 = i11;
            } else {
                f.U();
                throw null;
            }
        }
        return str2;
    }

    private final SessionDescription fromProtoSessionDescription(LivekitRtc$SessionDescription sd2) {
        SessionDescription.Type type;
        String type2 = sd2.getType();
        if (type2 != null) {
            switch (type2.hashCode()) {
                case -1412808770:
                    if (type2.equals(SD_TYPE_ANSWER)) {
                        type = SessionDescription.Type.ANSWER;
                        return new SessionDescription(type, sd2.getSdp());
                    }
                    break;
                case -1395375040:
                    if (type2.equals(SD_TYPE_PRANSWER)) {
                        type = SessionDescription.Type.PRANSWER;
                        return new SessionDescription(type, sd2.getSdp());
                    }
                    break;
                case -259719452:
                    if (type2.equals(SD_TYPE_ROLLBACK)) {
                        type = SessionDescription.Type.ROLLBACK;
                        return new SessionDescription(type, sd2.getSdp());
                    }
                    break;
                case 105650780:
                    if (type2.equals(SD_TYPE_OFFER)) {
                        type = SessionDescription.Type.OFFER;
                        return new SessionDescription(type, sd2.getSdp());
                    }
                    break;
            }
        }
        c6.k(sd2.getType(), "invalid RTC SdpType: ");
        return null;
    }

    private final void handleSignalResponse(WebSocket ws2, LivekitRtc$SignalResponse response) {
        if (m.c(ws2, this.currentWs)) {
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.VERBOSE;
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (loggingLevel.compareTo(companion2.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.e(null, "response: " + response, new Object[0]);
            }
            if (!this.isConnected) {
                if (response.hasJoin()) {
                    this.isConnected = true;
                    startRequestQueue();
                    long pingTimeout = response.getJoin().getPingTimeout();
                    long j4 = CLOSE_REASON_NORMAL_CLOSURE;
                    this.pingTimeoutDurationMillis = pingTimeout * j4;
                    this.pingIntervalDurationMillis = response.getJoin().getPingInterval() * j4;
                    startPingJob();
                    try {
                        this.serverVersion = new a(response.getJoin().getServerVersion());
                    } catch (Throwable th) {
                        LKLog.Companion companion3 = LKLog.INSTANCE;
                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                            d.f(th, "Thrown while trying to parse server version.", new Object[0]);
                        }
                    }
                    l lVar = this.joinContinuation;
                    if (lVar != null) {
                        lVar.resumeWith(new Either.Left(response.getJoin()));
                        return;
                    }
                    return;
                }
                if (response.hasLeave()) {
                    handleSignalResponseImpl(ws2, response);
                    return;
                }
                if (this.isReconnecting) {
                    this.isReconnecting = false;
                    this.isConnected = true;
                    startPingJob();
                    boolean hasReconnect = response.hasReconnect();
                    l lVar2 = this.joinContinuation;
                    if (hasReconnect) {
                        if (lVar2 != null) {
                            lVar2.resumeWith(new Either.Right(new Either.Left(response.getReconnect())));
                            return;
                        }
                        return;
                    } else if (lVar2 != null) {
                        lVar2.resumeWith(new Either.Right(new Either.Right(sn.z.f31622a)));
                    }
                } else {
                    if (LoggingLevel.ERROR.compareTo(companion2.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.b(null, "Received response while not connected. " + response, new Object[0]);
                        return;
                    }
                    return;
                }
            }
            this.responseFlow.tryEmit(new k(ws2, response));
        }
    }

    public final void handleSignalResponseImpl(WebSocket ws2, LivekitRtc$SignalResponse response) {
        int i10;
        int i11;
        Listener listener;
        if (!m.c(ws2, this.currentWs)) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.e(null, "received message from old websocket, discarding.", new Object[0]);
                return;
            }
            return;
        }
        tc messageCase = response.getMessageCase();
        if (messageCase == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[messageCase.ordinal()];
        }
        if (i10 != -1 && i10 != 23) {
            switch (i10) {
                case 1:
                    LivekitRtc$SessionDescription answer = response.getAnswer();
                    answer.getClass();
                    SessionDescription fromProtoSessionDescription = fromProtoSessionDescription(answer);
                    Listener listener2 = this.listener;
                    if (listener2 != null) {
                        listener2.onAnswer(fromProtoSessionDescription);
                        return;
                    }
                    return;
                case 2:
                    LivekitRtc$SessionDescription offer = response.getOffer();
                    offer.getClass();
                    SessionDescription fromProtoSessionDescription2 = fromProtoSessionDescription(offer);
                    Listener listener3 = this.listener;
                    if (listener3 != null) {
                        listener3.onOffer(fromProtoSessionDescription2);
                        return;
                    }
                    return;
                case 3:
                    c cVar = this.json;
                    String candidateInit = response.getTrickle().getCandidateInit();
                    candidateInit.getClass();
                    cVar.getClass();
                    IceCandidateJSON iceCandidateJSON = (IceCandidateJSON) cVar.b(candidateInit, IceCandidateJSON.INSTANCE.serializer());
                    IceCandidate iceCandidate = new IceCandidate(iceCandidateJSON.getSdpMid(), iceCandidateJSON.getSdpMLineIndex(), iceCandidateJSON.getCandidate());
                    Listener listener4 = this.listener;
                    if (listener4 != null) {
                        uc target = response.getTrickle().getTarget();
                        target.getClass();
                        listener4.onTrickle(iceCandidate, target);
                        return;
                    }
                    return;
                case 4:
                    Listener listener5 = this.listener;
                    if (listener5 != null) {
                        List<LivekitModels$ParticipantInfo> participantsList = response.getUpdate().getParticipantsList();
                        participantsList.getClass();
                        listener5.onParticipantUpdate(participantsList);
                        return;
                    }
                    return;
                case 5:
                    Listener listener6 = this.listener;
                    if (listener6 != null) {
                        LivekitRtc$TrackSubscribed trackSubscribed = response.getTrackSubscribed();
                        trackSubscribed.getClass();
                        listener6.onLocalTrackSubscribed(trackSubscribed);
                        return;
                    }
                    return;
                case 6:
                    Listener listener7 = this.listener;
                    if (listener7 != null) {
                        LivekitRtc$TrackPublishedResponse trackPublished = response.getTrackPublished();
                        trackPublished.getClass();
                        listener7.onLocalTrackPublished(trackPublished);
                        return;
                    }
                    return;
                case 7:
                    Listener listener8 = this.listener;
                    if (listener8 != null) {
                        List<LivekitModels$SpeakerInfo> speakersList = response.getSpeakersChanged().getSpeakersList();
                        speakersList.getClass();
                        listener8.onSpeakersChanged(speakersList);
                        return;
                    }
                    return;
                case 8:
                    LKLog.Companion companion2 = LKLog.INSTANCE;
                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                        d.a(null, "received unexpected extra join message?", new Object[0]);
                        return;
                    }
                    return;
                case 9:
                    Listener listener9 = this.listener;
                    if (listener9 != null) {
                        LivekitRtc$LeaveRequest leave = response.getLeave();
                        leave.getClass();
                        listener9.onLeave(leave);
                        return;
                    }
                    return;
                case 10:
                    Listener listener10 = this.listener;
                    if (listener10 != null) {
                        String sid = response.getMute().getSid();
                        sid.getClass();
                        listener10.onRemoteMuteChanged(sid, response.getMute().getMuted());
                        return;
                    }
                    return;
                case 11:
                    Listener listener11 = this.listener;
                    if (listener11 != null) {
                        LivekitModels$Room room = response.getRoomUpdate().getRoom();
                        room.getClass();
                        listener11.onRoomUpdate(room);
                        return;
                    }
                    return;
                case 12:
                    Listener listener12 = this.listener;
                    if (listener12 != null) {
                        List<LivekitRtc$ConnectionQualityInfo> updatesList = response.getConnectionQuality().getUpdatesList();
                        updatesList.getClass();
                        listener12.onConnectionQuality(updatesList);
                        return;
                    }
                    return;
                case 13:
                    Listener listener13 = this.listener;
                    if (listener13 != null) {
                        List<LivekitRtc$StreamStateInfo> streamStatesList = response.getStreamStateUpdate().getStreamStatesList();
                        streamStatesList.getClass();
                        listener13.onStreamStateUpdate(streamStatesList);
                        return;
                    }
                    return;
                case 14:
                    a aVar = new a("0.15.1");
                    a aVar2 = this.serverVersion;
                    if (aVar2 != null) {
                        i11 = aVar2.compareTo(aVar);
                    } else {
                        i11 = 1;
                    }
                    if (i11 > 0 && (listener = this.listener) != null) {
                        LivekitRtc$SubscribedQualityUpdate subscribedQualityUpdate = response.getSubscribedQualityUpdate();
                        subscribedQualityUpdate.getClass();
                        listener.onSubscribedQualityUpdate(subscribedQualityUpdate);
                        return;
                    }
                    return;
                case 15:
                    Listener listener14 = this.listener;
                    if (listener14 != null) {
                        LivekitRtc$SubscriptionPermissionUpdate subscriptionPermissionUpdate = response.getSubscriptionPermissionUpdate();
                        subscriptionPermissionUpdate.getClass();
                        listener14.onSubscriptionPermissionUpdate(subscriptionPermissionUpdate);
                        return;
                    }
                    return;
                case 16:
                    Listener listener15 = this.listener;
                    if (listener15 != null) {
                        String refreshToken = response.getRefreshToken();
                        refreshToken.getClass();
                        listener15.onRefreshToken(refreshToken);
                        return;
                    }
                    return;
                case 17:
                    Listener listener16 = this.listener;
                    if (listener16 != null) {
                        LivekitRtc$TrackUnpublishedResponse trackUnpublished = response.getTrackUnpublished();
                        trackUnpublished.getClass();
                        listener16.onLocalTrackUnpublished(trackUnpublished);
                        return;
                    }
                    return;
                case 18:
                    resetPingTimeout();
                    return;
                case 19:
                    this.rtt = new Date().getTime() - response.getPongResp().getLastPingTimestamp();
                    resetPingTimeout();
                    return;
                default:
                    return;
            }
        }
        LKLog.Companion companion3 = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "empty messageCase!", new Object[0]);
        }
    }

    private final void handleWebSocketClose(String reason, int code) {
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "websocket closed", new Object[0]);
        }
        this.isConnected = false;
        Listener listener = this.listener;
        if (listener != null) {
            listener.onClose(reason, code);
        }
        this.requestFlow.resetReplayCache();
        this.responseFlow.resetReplayCache();
        k1 k1Var = this.pingJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        k1 k1Var2 = this.pongJob;
        if (k1Var2 != null) {
            k1Var2.cancel((CancellationException) null);
        }
    }

    public static /* synthetic */ Object join$default(SignalClient signalClient, String str, String str2, ConnectOptions connectOptions, RoomOptions roomOptions, wn.c cVar, int i10, Object obj) {
        ConnectOptions connectOptions2;
        RoomOptions roomOptions2;
        if ((i10 & 4) != 0) {
            connectOptions2 = new ConnectOptions(false, null, null, false, false, null, 63, null);
        } else {
            connectOptions2 = connectOptions;
        }
        if ((i10 & 8) != 0) {
            roomOptions2 = new RoomOptions(false, false, null, null, null, null, null, null, null, 511, null);
        } else {
            roomOptions2 = roomOptions;
        }
        return signalClient.join(str, str2, connectOptions2, roomOptions2, cVar);
    }

    private final void resetPingTimeout() {
        k1 k1Var = this.pongJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.pongJob = null;
    }

    public static /* synthetic */ void sendAddTrack$default(SignalClient signalClient, String str, String str2, e9 e9Var, String str3, jb jbVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            jbVar = LivekitRtc$AddTrackRequest.newBuilder();
            jbVar.getClass();
        }
        signalClient.sendAddTrack(str, str2, e9Var, str3, jbVar);
    }

    private final void sendRequest(LivekitRtc$SignalRequest request) {
        if (skipQueueTypes.contains(request.getMessageCase())) {
            sendRequestImpl(request);
        } else {
            this.requestFlow.tryEmit(request);
        }
    }

    public final void sendRequestImpl(LivekitRtc$SignalRequest request) {
        boolean z6;
        LKLog.Companion companion = LKLog.INSTANCE;
        LoggingLevel loggingLevel = LoggingLevel.VERBOSE;
        LKLog.Companion companion2 = LKLog.INSTANCE;
        if (loggingLevel.compareTo(companion2.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "sending request: " + request, new Object[0]);
        }
        if (this.isConnected && this.currentWs != null) {
            fs.k kVar = fs.k.f9979d;
            byte[] byteArray = request.toByteArray();
            byteArray.getClass();
            fs.k w6 = fj.a.w(byteArray);
            WebSocket webSocket = this.currentWs;
            if (webSocket != null) {
                z6 = webSocket.d(w6);
            } else {
                z6 = false;
            }
            if (!z6 && LoggingLevel.ERROR.compareTo(companion2.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.b(null, "error sending request: " + request, new Object[0]);
                return;
            }
            return;
        }
        if (LoggingLevel.WARN.compareTo(companion2.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.f(null, "not connected, could not send request " + request, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendUpdateLocalMetadata$default(SignalClient signalClient, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = u.f33548a;
        }
        signalClient.sendUpdateLocalMetadata(str, str2, map);
    }

    private final void startPingJob() {
        if (this.pingJob == null && this.pingIntervalDurationMillis != 0) {
            CloseableCoroutineScope closeableCoroutineScope = this.coroutineScope;
            if (closeableCoroutineScope != null) {
                this.pingJob = g0.D(closeableCoroutineScope, null, null, new SignalClient$startPingJob$1(this, null), 3);
            } else {
                m.i("coroutineScope");
                throw null;
            }
        }
    }

    public final void startPingTimeout(long r42) {
        if (this.pongJob != null) {
            return;
        }
        CloseableCoroutineScope closeableCoroutineScope = this.coroutineScope;
        if (closeableCoroutineScope != null) {
            this.pongJob = g0.D(closeableCoroutineScope, null, null, new SignalClient$startPingTimeout$1(this, r42, null), 3);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    private final void startRequestQueue() {
        if (this.requestFlowJob != null) {
            return;
        }
        synchronized (this.requestFlowJobLock) {
            try {
                if (this.requestFlowJob == null) {
                    CloseableCoroutineScope closeableCoroutineScope = this.coroutineScope;
                    if (closeableCoroutineScope != null) {
                        this.requestFlowJob = g0.D(closeableCoroutineScope, null, null, new SignalClient$startRequestQueue$1$1(this, null), 3);
                    } else {
                        m.i("coroutineScope");
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void close(int code, String reason, boolean shouldClearQueuedRequests) {
        reason.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        Exception exc = new Exception();
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(exc, p.n.h(code, "Closing SignalClient: code = ", ", reason = ", reason), new Object[0]);
        }
        this.isConnected = false;
        this.isReconnecting = false;
        CloseableCoroutineScope closeableCoroutineScope = this.coroutineScope;
        if (closeableCoroutineScope != null) {
            closeableCoroutineScope.close();
        }
        k1 k1Var = this.requestFlowJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.requestFlowJob = null;
        k1 k1Var2 = this.responseFlowJob;
        if (k1Var2 != null) {
            k1Var2.cancel((CancellationException) null);
        }
        this.responseFlowJob = null;
        k1 k1Var3 = this.pingJob;
        if (k1Var3 != null) {
            k1Var3.cancel((CancellationException) null);
        }
        this.pingJob = null;
        k1 k1Var4 = this.pongJob;
        if (k1Var4 != null) {
            k1Var4.cancel((CancellationException) null);
        }
        this.pongJob = null;
        WebSocket webSocket = this.currentWs;
        if (webSocket != null) {
            webSocket.f(code, reason);
        }
        this.currentWs = null;
        l lVar = this.joinContinuation;
        if (lVar != null) {
            lVar.cancel(null);
        }
        this.joinContinuation = null;
        if (shouldClearQueuedRequests) {
            this.requestFlow.resetReplayCache();
        }
        this.responseFlow.resetReplayCache();
        this.lastUrl = null;
        this.lastOptions = null;
        this.lastRoomOptions = null;
        this.serverVersion = null;
    }

    public final ConnectionState getConnectionState() {
        return this.connectionState;
    }

    public final Listener getListener() {
        return this.listener;
    }

    /* renamed from: getServerVersion$livekit_android_sdk_release, reason: from getter */
    public final a getServerVersion() {
        return this.serverVersion;
    }

    /* renamed from: isConnected, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object join(String str, String str2, ConnectOptions connectOptions, RoomOptions roomOptions, wn.c<? super LivekitRtc$JoinResponse> cVar) {
        SignalClient$join$1 signalClient$join$1;
        int i10;
        if (cVar instanceof SignalClient$join$1) {
            signalClient$join$1 = (SignalClient$join$1) cVar;
            int i11 = signalClient$join$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                signalClient$join$1.label = i11 - Integer.MIN_VALUE;
                SignalClient$join$1 signalClient$join$12 = signalClient$join$1;
                Object obj = signalClient$join$12.result;
                i10 = signalClient$join$12.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    signalClient$join$12.label = 1;
                    obj = connect(str, str2, connectOptions, roomOptions, signalClient$join$12);
                    Object obj2 = xn.a.f37986a;
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                Either either = (Either) obj;
                either.getClass();
                return ((Either.Left) either).getValue();
            }
        }
        signalClient$join$1 = new SignalClient$join$1(this, cVar);
        SignalClient$join$1 signalClient$join$122 = signalClient$join$1;
        Object obj3 = signalClient$join$122.result;
        i10 = signalClient$join$122.label;
        if (i10 == 0) {
        }
        Either either2 = (Either) obj3;
        either2.getClass();
        return ((Either.Left) either2).getValue();
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int code, String reason) {
        webSocket.getClass();
        reason.getClass();
        if (!webSocket.equals(this.currentWs)) {
            return;
        }
        handleWebSocketClose(reason, code);
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(WebSocket webSocket, int code, String reason) {
        webSocket.getClass();
        reason.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "websocket closing", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    @Override // okhttp3.WebSocketListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFailure(WebSocket webSocket, Throwable t10, Response response) {
        String str;
        String str2;
        int i10;
        webSocket.getClass();
        t10.getClass();
        if (webSocket.equals(this.currentWs)) {
            String str3 = null;
            try {
                Request f25882a = webSocket.getF25882a();
                f25882a.getClass();
                String b10 = f25882a.f25401c.b(SIPHeaderNames.AUTHORIZATION);
                String str4 = this.lastUrl;
                if (str4 != null) {
                    String U = wq.u.U(UrlUtilsKt.toHttpUrl(str4), "/rtc?", "/rtc/validate?");
                    Request.Builder builder = new Request.Builder();
                    builder.f(U);
                    if (b10 != null) {
                        builder.a(SIPHeaderNames.AUTHORIZATION, b10);
                    }
                    Request request = new Request(builder);
                    OkHttpClient okHttpClient = this.okHttpClient;
                    okHttpClient.getClass();
                    Response execute = FirebasePerfOkHttpClient.execute(new RealCall(okHttpClient, request, false));
                    ResponseBody responseBody = execute.Y;
                    if (!execute.F0 && responseBody != null) {
                        str2 = responseBody.E();
                    } else {
                        str2 = null;
                    }
                    if (responseBody != null) {
                        try {
                            responseBody.close();
                        } catch (Throwable th) {
                            str = str2;
                            th = th;
                            LKLog.Companion companion = LKLog.INSTANCE;
                            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                                d.b(th, "failed to validate connection", new Object[0]);
                            }
                            str2 = str;
                            if (str2 == null) {
                            }
                            if (!this.isConnected) {
                            }
                        }
                    }
                } else {
                    str2 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
            }
            if (str2 == null) {
                LKLog.Companion companion2 = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(t10, "websocket failure: ".concat(str2), new Object[0]);
                }
                Exception exc = new Exception(str2);
                Listener listener = this.listener;
                if (listener != null) {
                    listener.onError(exc);
                }
                l lVar = this.joinContinuation;
                if (lVar != null) {
                    lVar.cancel(exc);
                }
            } else {
                LKLog.Companion companion3 = LKLog.INSTANCE;
                if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.b(t10, "websocket failure: " + response, new Object[0]);
                }
                Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onError(t10);
                }
                l lVar2 = this.joinContinuation;
                if (lVar2 != null) {
                    lVar2.cancel(t10);
                }
            }
            if (!this.isConnected) {
                if (str2 == null) {
                    if (response != null) {
                        str3 = response.toString();
                    }
                    if (str3 == null) {
                        str2 = t10.getLocalizedMessage();
                    } else {
                        str2 = str3;
                    }
                }
                if (str2 == null) {
                    str2 = "websocket failure";
                }
                if (response != null) {
                    i10 = response.f25426d;
                } else {
                    i10 = CLOSE_REASON_WEBSOCKET_FAILURE;
                }
                handleWebSocketClose(str2, i10);
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String r32) {
        webSocket.getClass();
        r32.getClass();
        if (webSocket.equals(this.currentWs)) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.f(null, "received JSON message, unsupported in this version.", new Object[0]);
            }
        }
    }

    public final void onPCConnected() {
        startRequestQueue();
    }

    public final void onReadyForResponses() {
        if (this.responseFlowJob != null) {
            return;
        }
        synchronized (this.responseFlowJobLock) {
            try {
                if (this.responseFlowJob == null) {
                    CloseableCoroutineScope closeableCoroutineScope = this.coroutineScope;
                    if (closeableCoroutineScope != null) {
                        this.responseFlowJob = g0.D(closeableCoroutineScope, null, null, new SignalClient$onReadyForResponses$1$1(this, null), 3);
                    } else {
                        m.i("coroutineScope");
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reconnect(String str, String str2, String str3, wn.c<? super Either<LivekitRtc$ReconnectResponse, sn.z>> cVar) {
        SignalClient$reconnect$1 signalClient$reconnect$1;
        int i10;
        ConnectOptions connectOptions;
        RoomOptions roomOptions;
        if (cVar instanceof SignalClient$reconnect$1) {
            signalClient$reconnect$1 = (SignalClient$reconnect$1) cVar;
            int i11 = signalClient$reconnect$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                signalClient$reconnect$1.label = i11 - Integer.MIN_VALUE;
                SignalClient$reconnect$1 signalClient$reconnect$12 = signalClient$reconnect$1;
                Object obj = signalClient$reconnect$12.result;
                i10 = signalClient$reconnect$12.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ConnectOptions connectOptions2 = this.lastOptions;
                    if (connectOptions2 == null) {
                        connectOptions = new ConnectOptions(false, null, null, false, false, null, 63, null);
                    } else {
                        connectOptions = connectOptions2;
                    }
                    ConnectOptions copy$default = ConnectOptions.copy$default(connectOptions, false, null, null, false, false, null, 63, null);
                    copy$default.setReconnect$livekit_android_sdk_release(true);
                    copy$default.setParticipantSid$livekit_android_sdk_release(str3);
                    RoomOptions roomOptions2 = this.lastRoomOptions;
                    if (roomOptions2 == null) {
                        roomOptions = new RoomOptions(false, false, null, null, null, null, null, null, null, 511, null);
                    } else {
                        roomOptions = roomOptions2;
                    }
                    signalClient$reconnect$12.label = 1;
                    obj = connect(str, str2, copy$default, roomOptions, signalClient$reconnect$12);
                    Object obj2 = xn.a.f37986a;
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                Either either = (Either) obj;
                either.getClass();
                return ((Either.Right) either).getValue();
            }
        }
        signalClient$reconnect$1 = new SignalClient$reconnect$1(this, cVar);
        SignalClient$reconnect$1 signalClient$reconnect$122 = signalClient$reconnect$1;
        Object obj3 = signalClient$reconnect$122.result;
        i10 = signalClient$reconnect$122.label;
        if (i10 == 0) {
        }
        Either either2 = (Either) obj3;
        either2.getClass();
        return ((Either.Right) either2).getValue();
    }

    public final void sendAddTrack(String cid, String r32, e9 type, String stream, jb builder) {
        l7 l7Var;
        E2EEOptions e2eeOptions;
        cid.getClass();
        r32.getClass();
        type.getClass();
        builder.getClass();
        RoomOptions roomOptions = this.lastRoomOptions;
        if (roomOptions == null || (e2eeOptions = roomOptions.getE2eeOptions()) == null || (l7Var = e2eeOptions.getEncryptionType()) == null) {
            l7Var = l7.NONE;
        }
        builder.g(cid);
        builder.m(r32);
        builder.q(type);
        if (stream != null) {
            builder.p(stream);
        } else {
            builder.e();
        }
        builder.j(l7Var);
        qc newBuilder = LivekitRtc$SignalRequest.newBuilder();
        newBuilder.b(builder);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendAnswer(SessionDescription r22) {
        r22.getClass();
        LivekitRtc$SessionDescription protoSessionDescription = SessionDescriptionExtKt.toProtoSessionDescription(r22);
        qc newBuilder = LivekitRtc$SignalRequest.newBuilder();
        newBuilder.c(protoSessionDescription);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendCandidate(IceCandidate candidate, uc target) {
        candidate.getClass();
        target.getClass();
        String str = candidate.sdp;
        String str2 = candidate.sdpMid;
        int i10 = candidate.sdpMLineIndex;
        str.getClass();
        IceCandidateJSON iceCandidateJSON = new IceCandidateJSON(str, i10, str2);
        ud newBuilder = LivekitRtc$TrickleRequest.newBuilder();
        c cVar = this.json;
        cVar.getClass();
        newBuilder.b(cVar.d(IceCandidateJSON.INSTANCE.serializer(), iceCandidateJSON));
        newBuilder.c(target);
        LivekitRtc$TrickleRequest livekitRtc$TrickleRequest = (LivekitRtc$TrickleRequest) newBuilder.build();
        qc newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
        newBuilder2.n(livekitRtc$TrickleRequest);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder2.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendLeave() {
        qc newBuilder = LivekitRtc$SignalRequest.newBuilder();
        ac newBuilder2 = LivekitRtc$LeaveRequest.newBuilder();
        newBuilder2.c();
        newBuilder2.b();
        newBuilder.d((LivekitRtc$LeaveRequest) newBuilder2.build());
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendMuteTrack(String trackSid, boolean muted) {
        trackSid.getClass();
        cc newBuilder = LivekitRtc$MuteTrackRequest.newBuilder();
        newBuilder.c(trackSid);
        newBuilder.b(muted);
        LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest = (LivekitRtc$MuteTrackRequest) newBuilder.build();
        qc newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
        newBuilder2.e(livekitRtc$MuteTrackRequest);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder2.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendOffer(SessionDescription r22) {
        r22.getClass();
        LivekitRtc$SessionDescription protoSessionDescription = SessionDescriptionExtKt.toProtoSessionDescription(r22);
        qc newBuilder = LivekitRtc$SignalRequest.newBuilder();
        newBuilder.f(protoSessionDescription);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final long sendPing() {
        long time = new Date().getTime();
        qc newBuilder = LivekitRtc$SignalRequest.newBuilder();
        newBuilder.g(time);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
        qc newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
        ec newBuilder3 = LivekitRtc$Ping.newBuilder();
        newBuilder3.b(this.rtt);
        newBuilder3.c(time);
        newBuilder2.h((LivekitRtc$Ping) newBuilder3.build());
        LivekitRtc$SignalRequest livekitRtc$SignalRequest2 = (LivekitRtc$SignalRequest) newBuilder2.build();
        livekitRtc$SignalRequest2.getClass();
        sendRequest(livekitRtc$SignalRequest2);
        return time;
    }

    public final void sendSimulateScenario$livekit_android_sdk_release(LivekitRtc$SimulateScenario scenario) {
        scenario.getClass();
        qc newBuilder = LivekitRtc$SignalRequest.newBuilder();
        newBuilder.i(scenario);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendSyncState(LivekitRtc$SyncState syncState) {
        syncState.getClass();
        qc newBuilder = LivekitRtc$SignalRequest.newBuilder();
        newBuilder.l(syncState);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendUpdateLocalAudioTrack(String trackSid, Collection<? extends s6> features) {
        trackSid.getClass();
        features.getClass();
        qc newBuilder = LivekitRtc$SignalRequest.newBuilder();
        vd newBuilder2 = LivekitRtc$UpdateLocalAudioTrack.newBuilder();
        newBuilder2.c(trackSid);
        newBuilder2.b(features);
        newBuilder.o((LivekitRtc$UpdateLocalAudioTrack) newBuilder2.build());
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendUpdateLocalMetadata(String metadata, String r42, Map<String, String> attributes) {
        yd newBuilder = LivekitRtc$UpdateParticipantMetadata.newBuilder();
        if (metadata == null) {
            metadata = "";
        }
        newBuilder.c(metadata);
        if (r42 == null) {
            r42 = "";
        }
        newBuilder.d(r42);
        newBuilder.b(attributes);
        qc newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
        newBuilder2.p(newBuilder);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder2.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendUpdateSubscription(boolean subscribe, LivekitModels$ParticipantTracks... participantTracks) {
        participantTracks.getClass();
        List d12 = tn.n.d1(participantTracks);
        ArrayList arrayList = new ArrayList(p.a0(d12, 10));
        Iterator it = d12.iterator();
        while (it.hasNext()) {
            arrayList.add(((LivekitModels$ParticipantTracks) it.next()).getTrackSidsList());
        }
        ArrayList b02 = p.b0(arrayList);
        zd newBuilder = LivekitRtc$UpdateSubscription.newBuilder();
        newBuilder.b(tn.n.d1(participantTracks));
        newBuilder.c(b02);
        newBuilder.d(subscribe);
        qc newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
        newBuilder2.j(newBuilder);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder2.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendUpdateSubscriptionPermissions(boolean allParticipants, List<ParticipantTrackPermission> participantTrackPermissions) {
        participantTrackPermissions.getClass();
        kd newBuilder = LivekitRtc$SubscriptionPermission.newBuilder();
        newBuilder.c(allParticipants);
        ArrayList arrayList = new ArrayList(p.a0(participantTrackPermissions, 10));
        Iterator<T> it = participantTrackPermissions.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParticipantTrackPermission) it.next()).toProto$livekit_android_sdk_release());
        }
        newBuilder.b(arrayList);
        qc newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
        newBuilder2.k(newBuilder);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder2.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void sendUpdateTrackSettings(String r22, boolean disabled, Track.Dimensions videoDimensions, p9 videoQuality, Integer fps) {
        r22.getClass();
        ae newBuilder = LivekitRtc$UpdateTrackSettings.newBuilder();
        newBuilder.b(r22);
        newBuilder.c(disabled);
        if (videoDimensions != null) {
            newBuilder.g(videoDimensions.getWidth());
            newBuilder.e(videoDimensions.getHeight());
        } else if (videoQuality != null) {
            newBuilder.f(videoQuality);
        } else {
            newBuilder.f(p9.HIGH);
        }
        if (fps != null) {
            newBuilder.d(fps.intValue());
        }
        qc newBuilder2 = LivekitRtc$SignalRequest.newBuilder();
        newBuilder2.m(newBuilder);
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = (LivekitRtc$SignalRequest) newBuilder2.build();
        livekitRtc$SignalRequest.getClass();
        sendRequest(livekitRtc$SignalRequest);
    }

    public final void setConnectionState(ConnectionState connectionState) {
        connectionState.getClass();
        this.connectionState = connectionState;
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
    }

    public final void setServerVersion$livekit_android_sdk_release(a aVar) {
        this.serverVersion = aVar;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tR%\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0015R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\f¨\u0006("}, d2 = {"Lio/livekit/android/room/SignalClient$Companion;", "", "<init>", "()V", "", "url", "Llivekit/org/webrtc/PeerConnection$IceServer;", "kotlin.jvm.PlatformType", "iceServer", "(Ljava/lang/String;)Llivekit/org/webrtc/PeerConnection$IceServer;", "", "DEFAULT_ICE_SERVERS", "Ljava/util/List;", "getDEFAULT_ICE_SERVERS", "()Ljava/util/List;", "", "CLOSE_REASON_NORMAL_CLOSURE", TokenNames.I, "CLOSE_REASON_PING_TIMEOUT", "CLOSE_REASON_WEBSOCKET_FAILURE", "CONNECT_QUERY_ADAPTIVE_STREAM", "Ljava/lang/String;", "CONNECT_QUERY_AUTOSUBSCRIBE", "CONNECT_QUERY_DEVICE_MODEL", "CONNECT_QUERY_NETWORK_TYPE", "CONNECT_QUERY_OS", "CONNECT_QUERY_OS_VERSION", "CONNECT_QUERY_PARTICIPANT_SID", "CONNECT_QUERY_PROTOCOL", "CONNECT_QUERY_RECONNECT", "CONNECT_QUERY_SDK", "CONNECT_QUERY_TOKEN", "CONNECT_QUERY_VERSION", "SDK_TYPE", "SD_TYPE_ANSWER", "SD_TYPE_OFFER", "SD_TYPE_PRANSWER", "SD_TYPE_ROLLBACK", "Las/rc;", "skipQueueTypes", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final PeerConnection.IceServer iceServer(String url) {
            return PeerConnection.IceServer.builder(url).createIceServer();
        }

        public final List<PeerConnection.IceServer> getDEFAULT_ICE_SERVERS() {
            return SignalClient.DEFAULT_ICE_SERVERS;
        }

        private Companion() {
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, fs.k bytes) {
        webSocket.getClass();
        bytes.getClass();
        if (webSocket.equals(this.currentWs)) {
            LivekitRtc$SignalResponse livekitRtc$SignalResponse = (LivekitRtc$SignalResponse) ((sc) LivekitRtc$SignalResponse.newBuilder().m89mergeFrom(bytes.r())).build();
            livekitRtc$SignalResponse.getClass();
            handleSignalResponse(webSocket, livekitRtc$SignalResponse);
        }
    }
}
