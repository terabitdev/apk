package io.livekit.android.room;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.SystemClock;
import as.c7;
import as.d7;
import as.e9;
import as.i7;
import as.jb;
import as.l7;
import as.nd;
import as.qb;
import as.s6;
import as.sb;
import as.uc;
import as.v6;
import as.zb;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.a3;
import com.google.protobuf.c6;
import com.google.protobuf.o;
import com.google.protobuf.p;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import fr.d2;
import fr.g0;
import fr.k1;
import fr.z;
import ib.i;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.livekit.android.ConnectOptions;
import io.livekit.android.RoomOptions;
import io.livekit.android.dagger.InjectionNames;
import io.livekit.android.e2ee.DataPacketCryptorManager;
import io.livekit.android.e2ee.E2EEManager;
import io.livekit.android.e2ee.EncryptedPacket;
import io.livekit.android.events.DisconnectReason;
import io.livekit.android.events.RoomEventKt;
import io.livekit.android.room.PeerConnectionTransport;
import io.livekit.android.room.RegionSettings;
import io.livekit.android.room.RoomException;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.participant.ParticipantTrackPermission;
import io.livekit.android.room.track.TrackException;
import io.livekit.android.room.util.MediaConstraintKeys;
import io.livekit.android.util.CloseableCoroutineScope;
import io.livekit.android.util.Either;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.util.MutableStateFlowDelegate;
import io.livekit.android.util.TTLMap;
import io.livekit.android.webrtc.DataChannelManager;
import io.livekit.android.webrtc.DataPacketBuffer;
import io.livekit.android.webrtc.DataPacketItem;
import io.livekit.android.webrtc.PeerConnectionExtKt;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$ClientConfiguration;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$EncryptedPacket;
import livekit.LivekitModels$EncryptedPacketPayload;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$Room;
import livekit.LivekitModels$SpeakerInfo;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitModels$Transcription;
import livekit.LivekitModels$UserPacket;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.LivekitRtc$ConnectionQualityInfo;
import livekit.LivekitRtc$DataChannelInfo;
import livekit.LivekitRtc$DataChannelReceiveState;
import livekit.LivekitRtc$ICEServer;
import livekit.LivekitRtc$JoinResponse;
import livekit.LivekitRtc$LeaveRequest;
import livekit.LivekitRtc$ReconnectResponse;
import livekit.LivekitRtc$RegionSettings;
import livekit.LivekitRtc$SessionDescription;
import livekit.LivekitRtc$StreamStateInfo;
import livekit.LivekitRtc$SubscribedQualityUpdate;
import livekit.LivekitRtc$SubscriptionPermissionUpdate;
import livekit.LivekitRtc$SyncState;
import livekit.LivekitRtc$TrackPublishedResponse;
import livekit.LivekitRtc$TrackSubscribed;
import livekit.LivekitRtc$TrackUnpublishedResponse;
import livekit.LivekitRtc$UpdateSubscription;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.MediaStream;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.SessionDescription;
import n0.l;
import oo.u;
import or.a;
import rd.c1;
import sn.m;
import wn.c;
import xq.b;
import xq.d;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¢\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 À\u00022\u00020\u0001:\u0006À\u0002Á\u0002Â\u0002B3\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0018\u0010\u0017J<\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b!\u0010\"J\"\u0010*\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0080@¢\u0006\u0004\b(\u0010)J#\u00101\u001a\u0002002\u0006\u0010,\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u0002002\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020+¢\u0006\u0004\b5\u00106J#\u0010:\u001a\u0002002\u0006\u00103\u001a\u00020\u000e2\f\u00109\u001a\b\u0012\u0004\u0012\u00020807¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u0002002\b\b\u0002\u0010<\u001a\u00020\u000e¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u000200H\u0007¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u000200H\u0000¢\u0006\u0004\bA\u0010@J$\u0010H\u001a\b\u0012\u0004\u0012\u0002000E2\u0006\u0010D\u001a\u00020CH\u0081@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010GJ$\u0010M\u001a\b\u0012\u0004\u0012\u0002000E2\u0006\u0010J\u001a\u00020IH\u0080@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ\u0018\u0010Q\u001a\u0002002\u0006\u0010\u001c\u001a\u00020NH\u0080@¢\u0006\u0004\bO\u0010PJ\u0017\u0010T\u001a\u0002002\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u0002002\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bV\u0010UJ\u001f\u0010[\u001a\u0002002\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u0002002\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u0002002\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u001d\u0010g\u001a\u0002002\f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0-H\u0016¢\u0006\u0004\bg\u0010hJ\u001d\u0010k\u001a\u0002002\f\u0010j\u001a\b\u0012\u0004\u0012\u00020i0-H\u0016¢\u0006\u0004\bk\u0010hJ\u001f\u0010m\u001a\u0002002\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010l\u001a\u00020IH\u0016¢\u0006\u0004\bm\u0010nJ\u001f\u0010p\u001a\u0002002\u0006\u0010o\u001a\u00020\u000e2\u0006\u00104\u001a\u00020+H\u0016¢\u0006\u0004\bp\u00106J\u0017\u0010s\u001a\u0002002\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bs\u0010tJ\u001d\u0010v\u001a\u0002002\f\u0010f\u001a\b\u0012\u0004\u0012\u00020u0-H\u0016¢\u0006\u0004\bv\u0010hJ\u0017\u0010y\u001a\u0002002\u0006\u0010x\u001a\u00020wH\u0016¢\u0006\u0004\by\u0010zJ\u0017\u0010}\u001a\u0002002\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0004\b}\u0010~J \u0010\u0081\u0001\u001a\u0002002\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0-H\u0016¢\u0006\u0005\b\u0081\u0001\u0010hJ\u001c\u0010\u0084\u0001\u001a\u0002002\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001c\u0010\u0088\u0001\u001a\u0002002\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0019\u0010\u008a\u0001\u001a\u0002002\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u008a\u0001\u0010>J\u001c\u0010\u008d\u0001\u001a\u0002002\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J$\u0010\u0093\u0001\u001a\u0002002\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001a\u0010\u0095\u0001\u001a\u0002002\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J&\u0010\u0099\u0001\u001a\u0002002\b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J)\u0010\u009e\u0001\u001a\u0002002\b\u0010\u009c\u0001\u001a\u00030\u009b\u00012\r\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020]0-¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001a\u0010¢\u0001\u001a\u0002002\b\u0010¡\u0001\u001a\u00030 \u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001a\u0010¤\u0001\u001a\u0002002\b\u0010¡\u0001\u001a\u00030 \u0001¢\u0006\u0006\b¤\u0001\u0010£\u0001J-\u0010©\u0001\u001a\u0015\u0012\u0005\u0012\u00030 \u0001\u0012\u0004\u0012\u0002000§\u0001j\u0003`¨\u00012\b\u0010¦\u0001\u001a\u00030¥\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001J-\u0010©\u0001\u001a\u0015\u0012\u0005\u0012\u00030 \u0001\u0012\u0004\u0012\u0002000§\u0001j\u0003`¨\u00012\b\u0010¬\u0001\u001a\u00030«\u0001¢\u0006\u0006\b©\u0001\u0010\u00ad\u0001J$\u0010²\u0001\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010¯\u0001\u001a\u00030®\u0001H\u0000¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001a\u0010µ\u0001\u001a\u0002002\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0013\u0010·\u0001\u001a\u00030¶\u0001H\u0007¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0013\u0010¹\u0001\u001a\u00030¶\u0001H\u0007¢\u0006\u0006\b¹\u0001\u0010¸\u0001J%\u0010¼\u0001\u001a\u0002002\u0007\u0010º\u0001\u001a\u00020\u00152\u0007\u0010»\u0001\u001a\u00020\u0011H\u0082@¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0019\u0010¾\u0001\u001a\u0002002\u0006\u0010<\u001a\u00020\u000eH\u0002¢\u0006\u0005\b¾\u0001\u0010>J\u0011\u0010¿\u0001\u001a\u000200H\u0002¢\u0006\u0005\b¿\u0001\u0010@J\u001a\u0010À\u0001\u001a\u0002002\u0006\u0010\u001c\u001a\u00020NH\u0082@¢\u0006\u0005\bÀ\u0001\u0010PJ\u001d\u0010Á\u0001\u001a\u0005\u0018\u00010\u008f\u00012\u0006\u0010\u001c\u001a\u00020NH\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u0013\u0010Ä\u0001\u001a\u00030Ã\u0001H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J3\u0010Ê\u0001\u001a\u00030É\u00012\u0015\u0010È\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0005\u0012\u00030Ç\u00010Æ\u00012\u0007\u0010»\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010Ï\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Ð\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Ñ\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010Ò\u0001R,\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R<\u0010ã\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ú\u00018G@FX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\bÜ\u0001\u0010Ý\u0001\u0012\u0005\bâ\u0001\u0010@\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R*\u0010å\u0001\u001a\u00030ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R\u001c\u0010ì\u0001\u001a\u0005\u0018\u00010ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0019\u0010î\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R+\u0010ò\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020 0ñ\u00010ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R,\u0010õ\u0001\u001a\u0005\u0018\u00010ô\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R\u001b\u0010û\u0001\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R\u001b\u0010ý\u0001\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010ü\u0001R\u001b\u0010»\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010þ\u0001R\u001b\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u001b\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010ü\u0001R\u0018\u0010\u0083\u0002\u001a\u00030\u0082\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0018\u0010\u0086\u0002\u001a\u00030\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R,\u0010\u0089\u0002\u001a\u0005\u0018\u00010\u0088\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R\u001c\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u0088\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u008a\u0002R\u001c\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001c\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0091\u0002R\u001c\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0091\u0002R\u001c\u0010\u0094\u0002\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0091\u0002R\u001c\u0010\u0096\u0002\u001a\u0005\u0018\u00010\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R\u001c\u0010\u0098\u0002\u001a\u0005\u0018\u00010ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010í\u0001R\u001c\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u0097\u0002R\u001c\u0010\u009a\u0002\u001a\u0005\u0018\u00010\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u0097\u0002R\u001c\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u0097\u0002R\u0018\u0010\u009d\u0002\u001a\u00030\u009c\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0019\u0010\u009f\u0002\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R\u0018\u0010¢\u0002\u001a\u00030¡\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R$\u0010¥\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020I0¤\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0019\u0010§\u0002\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010ï\u0001R\u0019\u0010¨\u0002\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010ï\u0001R\u0019\u0010©\u0002\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010ï\u0001R\u001a\u0010«\u0002\u001a\u00030ª\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R,\u0010®\u0002\u001a\u0005\u0018\u00010\u00ad\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0002\u0010¯\u0002\u001a\u0006\b°\u0002\u0010±\u0002\"\u0006\b²\u0002\u0010³\u0002R\u001a\u0010µ\u0002\u001a\u00030´\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R\u0018\u0010·\u0002\u001a\u00030´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0002\u0010¶\u0002R\u001a\u0010»\u0002\u001a\u0005\u0018\u00010¸\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010º\u0002R\u001a\u0010¿\u0002\u001a\u0005\u0018\u00010¼\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006Ã\u0002"}, d2 = {"Lio/livekit/android/room/RTCEngine;", "Lio/livekit/android/room/SignalClient$Listener;", "Lio/livekit/android/room/SignalClient;", "client", "Lio/livekit/android/room/PeerConnectionTransport$Factory;", "pctFactory", "Lfr/z;", "ioDispatcher", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;", "dataPacketCryptorFactory", "<init>", "(Lio/livekit/android/room/SignalClient;Lio/livekit/android/room/PeerConnectionTransport$Factory;Lfr/z;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;)V", "", "url", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Lio/livekit/android/ConnectOptions;", "options", "Lio/livekit/android/RoomOptions;", "roomOptions", "Llivekit/LivekitRtc$JoinResponse;", "join", "(Ljava/lang/String;Ljava/lang/String;Lio/livekit/android/ConnectOptions;Lio/livekit/android/RoomOptions;Lwn/c;)Ljava/lang/Object;", "joinImpl", "cid", DiagnosticsEntry.NAME_KEY, "Las/e9;", "kind", "stream", "Las/jb;", "builder", "Llivekit/LivekitModels$TrackInfo;", "addTrack", "(Ljava/lang/String;Ljava/lang/String;Las/e9;Ljava/lang/String;Las/jb;Lwn/c;)Ljava/lang/Object;", "Llivekit/org/webrtc/MediaStreamTrack;", "rtcTrack", "Llivekit/org/webrtc/RtpTransceiver$RtpTransceiverInit;", "transInit", "Llivekit/org/webrtc/RtpTransceiver;", "createSenderTransceiver$livekit_android_sdk_release", "(Llivekit/org/webrtc/MediaStreamTrack;Llivekit/org/webrtc/RtpTransceiver$RtpTransceiverInit;Lwn/c;)Ljava/lang/Object;", "createSenderTransceiver", "", "allParticipants", "", "Lio/livekit/android/room/participant/ParticipantTrackPermission;", "participantTrackPermissions", "Lsn/z;", "updateSubscriptionPermissions", "(ZLjava/util/List;)V", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "muted", "updateMuteStatus", "(Ljava/lang/String;Z)V", "", "Las/s6;", "features", "updateLocalAudioTrack", "(Ljava/lang/String;Ljava/util/Collection;)V", "reason", "close", "(Ljava/lang/String;)V", SignalClient.CONNECT_QUERY_RECONNECT, "()V", "negotiatePublisher$livekit_android_sdk_release", "negotiatePublisher", "Llivekit/LivekitModels$DataPacket;", "dataPacket", "Lsn/m;", "sendData-gIAlu-s$livekit_android_sdk_release", "(Llivekit/LivekitModels$DataPacket;Lwn/c;)Ljava/lang/Object;", "sendData", "", "lastMessageSeq", "resendReliableMessagesForResume-gIAlu-s$livekit_android_sdk_release", "(ILwn/c;)Ljava/lang/Object;", "resendReliableMessagesForResume", "Las/c7;", "waitForBufferStatusLow$livekit_android_sdk_release", "(Las/c7;Lwn/c;)Ljava/lang/Object;", "waitForBufferStatusLow", "Llivekit/org/webrtc/SessionDescription;", "sessionDescription", "onAnswer", "(Llivekit/org/webrtc/SessionDescription;)V", "onOffer", "Llivekit/org/webrtc/IceCandidate;", "candidate", "Las/uc;", "target", "onTrickle", "(Llivekit/org/webrtc/IceCandidate;Las/uc;)V", "Llivekit/LivekitRtc$TrackPublishedResponse;", "response", "onLocalTrackPublished", "(Llivekit/LivekitRtc$TrackPublishedResponse;)V", "Llivekit/LivekitRtc$TrackSubscribed;", "trackSubscribed", "onLocalTrackSubscribed", "(Llivekit/LivekitRtc$TrackSubscribed;)V", "Llivekit/LivekitModels$ParticipantInfo;", "updates", "onParticipantUpdate", "(Ljava/util/List;)V", "Llivekit/LivekitModels$SpeakerInfo;", "speakers", "onSpeakersChanged", "code", "onClose", "(Ljava/lang/String;I)V", "trackSid", "onRemoteMuteChanged", "Llivekit/LivekitModels$Room;", "update", "onRoomUpdate", "(Llivekit/LivekitModels$Room;)V", "Llivekit/LivekitRtc$ConnectionQualityInfo;", "onConnectionQuality", "Llivekit/LivekitRtc$LeaveRequest;", "leave", "onLeave", "(Llivekit/LivekitRtc$LeaveRequest;)V", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onError", "(Ljava/lang/Throwable;)V", "Llivekit/LivekitRtc$StreamStateInfo;", "streamStates", "onStreamStateUpdate", "Llivekit/LivekitRtc$SubscribedQualityUpdate;", "subscribedQualityUpdate", "onSubscribedQualityUpdate", "(Llivekit/LivekitRtc$SubscribedQualityUpdate;)V", "Llivekit/LivekitRtc$SubscriptionPermissionUpdate;", "subscriptionPermissionUpdate", "onSubscriptionPermissionUpdate", "(Llivekit/LivekitRtc$SubscriptionPermissionUpdate;)V", "onRefreshToken", "Llivekit/LivekitRtc$TrackUnpublishedResponse;", "trackUnpublished", "onLocalTrackUnpublished", "(Llivekit/LivekitRtc$TrackUnpublishedResponse;)V", "Llivekit/org/webrtc/DataChannel;", "dataChannel", "", "previousAmount", "onBufferedAmountChange", "(Llivekit/org/webrtc/DataChannel;J)V", "onStateChange", "(Llivekit/org/webrtc/DataChannel;)V", "Llivekit/org/webrtc/DataChannel$Buffer;", "buffer", "onMessage", "(Llivekit/org/webrtc/DataChannel;Llivekit/org/webrtc/DataChannel$Buffer;)V", "Llivekit/LivekitRtc$UpdateSubscription;", "subscription", "publishedTracks", "sendSyncState", "(Llivekit/LivekitRtc$UpdateSubscription;Ljava/util/List;)V", "Llivekit/org/webrtc/RTCStatsCollectorCallback;", "callback", "getPublisherRTCStats", "(Llivekit/org/webrtc/RTCStatsCollectorCallback;)V", "getSubscriberRTCStats", "Llivekit/org/webrtc/RtpSender;", InjectionNames.SENDER, "Lkotlin/Function1;", "Lio/livekit/android/webrtc/RTCStatsGetter;", "createStatsGetter", "(Llivekit/org/webrtc/RtpSender;)Lho/l;", "Llivekit/org/webrtc/RtpReceiver;", "receiver", "(Llivekit/org/webrtc/RtpReceiver;)Lho/l;", "Lio/livekit/android/room/TrackBitrateInfo;", "trackBitrateInfo", "registerTrackBitrateInfo$livekit_android_sdk_release", "(Ljava/lang/String;Lio/livekit/android/room/TrackBitrateInfo;)V", "registerTrackBitrateInfo", "removeTrack$livekit_android_sdk_release", "(Llivekit/org/webrtc/MediaStreamTrack;)V", "removeTrack", "Llivekit/org/webrtc/PeerConnection;", "getPublisherPeerConnection", "()Llivekit/org/webrtc/PeerConnection;", "getSubscriberPeerConnection", "joinResponse", "connectOptions", "configure", "(Llivekit/LivekitRtc$JoinResponse;Lio/livekit/android/ConnectOptions;Lwn/c;)Ljava/lang/Object;", "closeResources", "abortPendingPublishTracks", "ensurePublisherConnected", "dataChannelForKind", "(Las/c7;)Llivekit/org/webrtc/DataChannel;", "Llivekit/org/webrtc/MediaConstraints;", "getPublisherOfferConstraints", "()Llivekit/org/webrtc/MediaConstraints;", "Lio/livekit/android/util/Either;", "Llivekit/LivekitRtc$ReconnectResponse;", "serverResponse", "Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "makeRTCConfig", "(Lio/livekit/android/util/Either;Lio/livekit/android/ConnectOptions;)Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "Lio/livekit/android/room/SignalClient;", "getClient", "()Lio/livekit/android/room/SignalClient;", "Lio/livekit/android/room/PeerConnectionTransport$Factory;", "Lfr/z;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "Lio/livekit/android/e2ee/DataPacketCryptorManager$Factory;", "Lio/livekit/android/room/RTCEngine$Listener;", "listener", "Lio/livekit/android/room/RTCEngine$Listener;", "getListener$livekit_android_sdk_release", "()Lio/livekit/android/room/RTCEngine$Listener;", "setListener$livekit_android_sdk_release", "(Lio/livekit/android/room/RTCEngine$Listener;)V", "Lio/livekit/android/room/ConnectionState;", "<set-?>", "connectionState$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getConnectionState", "()Lio/livekit/android/room/ConnectionState;", "setConnectionState", "(Lio/livekit/android/room/ConnectionState;)V", "getConnectionState$annotations", "connectionState", "Lio/livekit/android/room/ReconnectType;", "reconnectType", "Lio/livekit/android/room/ReconnectType;", "getReconnectType$livekit_android_sdk_release", "()Lio/livekit/android/room/ReconnectType;", "setReconnectType$livekit_android_sdk_release", "(Lio/livekit/android/room/ReconnectType;)V", "Lfr/k1;", "reconnectingJob", "Lfr/k1;", "fullReconnectOnNext", "Z", "", "Lwn/c;", "pendingTrackResolvers", "Ljava/util/Map;", "Lio/livekit/android/room/RegionUrlProvider;", "regionUrlProvider", "Lio/livekit/android/room/RegionUrlProvider;", "getRegionUrlProvider$livekit_android_sdk_release", "()Lio/livekit/android/room/RegionUrlProvider;", "setRegionUrlProvider$livekit_android_sdk_release", "(Lio/livekit/android/room/RegionUrlProvider;)V", "sessionUrl", "Ljava/lang/String;", "sessionToken", "Lio/livekit/android/ConnectOptions;", "lastRoomOptions", "Lio/livekit/android/RoomOptions;", "participantSid", "Lio/livekit/android/room/PublisherTransportObserver;", "publisherObserver", "Lio/livekit/android/room/PublisherTransportObserver;", "Lio/livekit/android/room/SubscriberTransportObserver;", "subscriberObserver", "Lio/livekit/android/room/SubscriberTransportObserver;", "Lio/livekit/android/room/PeerConnectionTransport;", "publisher", "Lio/livekit/android/room/PeerConnectionTransport;", "getPublisher$livekit_android_sdk_release", "()Lio/livekit/android/room/PeerConnectionTransport;", "setPublisher$livekit_android_sdk_release", "(Lio/livekit/android/room/PeerConnectionTransport;)V", CustomerInfoResponseJsonKeys.SUBSCRIBER, "reliableDataChannel", "Llivekit/org/webrtc/DataChannel;", "reliableDataChannelSub", "lossyDataChannel", "lossyDataChannelSub", "Lio/livekit/android/webrtc/DataChannelManager;", "reliableDataChannelManager", "Lio/livekit/android/webrtc/DataChannelManager;", "reliableBufferedAmountJob", "reliableDataChannelSubManager", "lossyDataChannelManager", "lossyDataChannelSubManager", "Ljava/lang/Object;", "reliableStateLock", "Ljava/lang/Object;", "reliableDataSequence", TokenNames.I, "Lio/livekit/android/webrtc/DataPacketBuffer;", "reliableMessageBuffer", "Lio/livekit/android/webrtc/DataPacketBuffer;", "Lio/livekit/android/util/TTLMap;", "reliableReceivedState", "Lio/livekit/android/util/TTLMap;", "isSubscriberPrimary", "isClosed", "hasPublished", "Lio/livekit/android/util/CloseableCoroutineScope;", "coroutineScope", "Lio/livekit/android/util/CloseableCoroutineScope;", "Lio/livekit/android/e2ee/E2EEManager;", "e2EEManager", "Lio/livekit/android/e2ee/E2EEManager;", "getE2EEManager$livekit_android_sdk_release", "()Lio/livekit/android/e2ee/E2EEManager;", "setE2EEManager$livekit_android_sdk_release", "(Lio/livekit/android/e2ee/E2EEManager;)V", "Lor/a;", "configurationLock", "Lor/a;", "negotiatePublisherMutex", "Lgl/a;", "getServerVersion$livekit_android_sdk_release", "()Lgl/a;", "serverVersion", "Lio/livekit/android/e2ee/DataPacketCryptorManager;", "getDataPacketCryptorManager", "()Lio/livekit/android/e2ee/DataPacketCryptorManager;", "dataPacketCryptorManager", "Companion", "DataChannelObserver", "Listener", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCEngine implements SignalClient.Listener {
    private static final MediaConstraints CONN_CONSTRAINTS;
    private static final int DATA_CHANNEL_LOW_THRESHOLD = 2097152;
    public static final String LOSSY_DATA_CHANNEL_LABEL = "_lossy";
    public static final int MAX_DATA_PACKET_SIZE = 15360;
    private static final int MAX_ICE_CONNECT_TIMEOUT_MS = 20000;
    private static final int MAX_RECONNECT_RETRIES = 10;
    private static final int MAX_RECONNECT_TIMEOUT = 60000;
    public static final String RELIABLE_DATA_CHANNEL_LABEL = "_reliable";
    private static final long RELIABLE_RECEIVE_STATE_TTL_MS;
    private static final long RELIABLE_RETRY_AMOUNT;
    private final SignalClient client;
    private a configurationLock;
    private ConnectOptions connectOptions;

    /* renamed from: connectionState$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate connectionState;
    private CloseableCoroutineScope coroutineScope;
    private final DataPacketCryptorManager.Factory dataPacketCryptorFactory;
    private E2EEManager e2EEManager;
    private boolean fullReconnectOnNext;
    private boolean hasPublished;
    private final z ioDispatcher;
    private boolean isClosed;
    private boolean isSubscriberPrimary;
    private RoomOptions lastRoomOptions;
    private Listener listener;
    private DataChannel lossyDataChannel;
    private DataChannelManager lossyDataChannelManager;
    private DataChannel lossyDataChannelSub;
    private DataChannelManager lossyDataChannelSubManager;
    private final a negotiatePublisherMutex;
    private String participantSid;
    private final PeerConnectionTransport.Factory pctFactory;
    private final Map<String, c<LivekitModels$TrackInfo>> pendingTrackResolvers;
    private PeerConnectionTransport publisher;
    private final PublisherTransportObserver publisherObserver;
    private ReconnectType reconnectType;
    private k1 reconnectingJob;
    private RegionUrlProvider regionUrlProvider;
    private k1 reliableBufferedAmountJob;
    private DataChannel reliableDataChannel;
    private DataChannelManager reliableDataChannelManager;
    private DataChannel reliableDataChannelSub;
    private DataChannelManager reliableDataChannelSubManager;
    private int reliableDataSequence;
    private final DataPacketBuffer reliableMessageBuffer;
    private final TTLMap<String, Integer> reliableReceivedState;
    private final Object reliableStateLock;
    private final RTCThreadToken rtcThreadToken;
    private String sessionToken;
    private String sessionUrl;
    private PeerConnectionTransport subscriber;
    private final SubscriberTransportObserver subscriberObserver;
    static final /* synthetic */ u[] $$delegatedProperties = {e0.f20562a.e(new q(RTCEngine.class, "connectionState", "getConnectionState()Lio/livekit/android/room/ConnectionState;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/livekit/android/room/RTCEngine$DataChannelObserver;", "Llivekit/org/webrtc/DataChannel$Observer;", "Llivekit/org/webrtc/DataChannel;", "dataChannel", "<init>", "(Lio/livekit/android/room/RTCEngine;Llivekit/org/webrtc/DataChannel;)V", "", "p0", "Lsn/z;", "onBufferedAmountChange", "(J)V", "onStateChange", "()V", "Llivekit/org/webrtc/DataChannel$Buffer;", "onMessage", "(Llivekit/org/webrtc/DataChannel$Buffer;)V", "Llivekit/org/webrtc/DataChannel;", "getDataChannel", "()Llivekit/org/webrtc/DataChannel;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public final class DataChannelObserver implements DataChannel.Observer {
        private final DataChannel dataChannel;
        final /* synthetic */ RTCEngine this$0;

        public DataChannelObserver(RTCEngine rTCEngine, DataChannel dataChannel) {
            dataChannel.getClass();
            this.this$0 = rTCEngine;
            this.dataChannel = dataChannel;
        }

        public final DataChannel getDataChannel() {
            return this.dataChannel;
        }

        @Override // livekit.org.webrtc.DataChannel.Observer
        public void onBufferedAmountChange(long p02) {
            this.this$0.onBufferedAmountChange(this.dataChannel, p02);
        }

        @Override // livekit.org.webrtc.DataChannel.Observer
        public void onMessage(DataChannel.Buffer p02) {
            p02.getClass();
            this.this$0.onMessage(this.dataChannel, p02);
        }

        @Override // livekit.org.webrtc.DataChannel.Observer
        public void onStateChange() {
            this.this$0.onStateChange(this.dataChannel);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ zn.a entries$0 = c1.q(c7.values());
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[c7.values().length];
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
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[uc.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[d7.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[0] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[6] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[7] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[8] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[9] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[10] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[11] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[12] = 13;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[13] = 14;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        xq.a aVar = b.f38124b;
        RELIABLE_RECEIVE_STATE_TTL_MS = g.n(30, d.SECONDS);
        RELIABLE_RETRY_AMOUNT = 2621440L;
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair("DtlsSrtpKeyAgreement", MediaConstraintKeys.TRUE));
        CONN_CONSTRAINTS = mediaConstraints;
    }

    public RTCEngine(SignalClient signalClient, PeerConnectionTransport.Factory factory, z zVar, RTCThreadToken rTCThreadToken, DataPacketCryptorManager.Factory factory2) {
        signalClient.getClass();
        factory.getClass();
        zVar.getClass();
        rTCThreadToken.getClass();
        factory2.getClass();
        this.client = signalClient;
        this.pctFactory = factory;
        this.ioDispatcher = zVar;
        this.rtcThreadToken = rTCThreadToken;
        this.dataPacketCryptorFactory = factory2;
        this.connectionState = FlowDelegateKt.flowDelegate(ConnectionState.DISCONNECTED, new RTCEngine$connectionState$2(this));
        this.reconnectType = ReconnectType.DEFAULT;
        this.pendingTrackResolvers = new LinkedHashMap();
        this.publisherObserver = new PublisherTransportObserver(this, signalClient, rTCThreadToken);
        this.subscriberObserver = new SubscriberTransportObserver(this, signalClient, rTCThreadToken);
        this.reliableStateLock = new Object();
        this.reliableDataSequence = 1;
        this.reliableMessageBuffer = new DataPacketBuffer(RELIABLE_RETRY_AMOUNT);
        this.reliableReceivedState = new TTLMap<>(RELIABLE_RECEIVE_STATE_TTL_MS, null, 2, null);
        this.isClosed = true;
        this.coroutineScope = new CloseableCoroutineScope(l.J(g0.f(), zVar));
        this.configurationLock = or.d.a();
        this.negotiatePublisherMutex = or.d.a();
        signalClient.setListener(this);
    }

    private final void abortPendingPublishTracks() {
        synchronized (this.pendingTrackResolvers) {
            try {
                Iterator<T> it = this.pendingTrackResolvers.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).resumeWith(new sn.l(new TrackException.PublishException("pending track aborted", null, 2, null)));
                }
                this.pendingTrackResolvers.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object addTrack$default(RTCEngine rTCEngine, String str, String str2, e9 e9Var, String str3, jb jbVar, c cVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            jbVar = LivekitRtc$AddTrackRequest.newBuilder();
            jbVar.getClass();
        }
        return rTCEngine.addTrack(str, str2, e9Var, str3, jbVar, cVar);
    }

    public static /* synthetic */ void close$default(RTCEngine rTCEngine, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Normal Closure";
        }
        rTCEngine.close(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeResources(String reason) {
        final RTCThreadToken rTCThreadToken = this.rtcThreadToken;
        if (!rTCThreadToken.isDisposed()) {
            if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                g0.I(wn.i.f37087a, new RTCEngine$closeResources$1$1(this, null));
            } else {
                RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.room.RTCEngine$closeResources$$inlined$executeBlockingOnRTCThread$1
                    @Override // java.util.concurrent.Callable
                    public final sn.z call() {
                        if (!RTCThreadToken.this.isDisposed()) {
                            g0.I(wn.i.f37087a, new RTCEngine$closeResources$1$1(this, null));
                            return sn.z.f31622a;
                        }
                        return null;
                    }
                }).get();
            }
        }
        SignalClient.close$default(this.client, 0, reason, false, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object configure(LivekitRtc$JoinResponse livekitRtc$JoinResponse, ConnectOptions connectOptions, c<? super sn.z> cVar) {
        return RTCThreadUtilsKt.launchBlockingOnRTCThread(this.rtcThreadToken, new RTCEngine$configure$2(this, livekitRtc$JoinResponse, connectOptions, null), cVar);
    }

    private final DataChannel dataChannelForKind(c7 kind) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    c6.p();
                    return null;
                }
                c6.t("Unknown data packet kind!");
                return null;
            }
            return this.lossyDataChannel;
        }
        return this.reliableDataChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f2, code lost:
    
        if (r1 == r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0119, code lost:
    
        if (fr.g0.m(50, r2) == r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b2, code lost:
    
        if (r1 == r12) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0119 -> B:13:0x011c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensurePublisherConnected(c7 c7Var, c<? super sn.z> cVar) {
        RTCEngine$ensurePublisherConnected$1 rTCEngine$ensurePublisherConnected$1;
        Object obj;
        int i10;
        c7 c7Var2;
        RTCEngine rTCEngine;
        boolean z6;
        PeerConnection.IceConnectionState iceConnectionState;
        DataChannel dataChannelForKind;
        long elapsedRealtime;
        RTCEngine rTCEngine2;
        DataChannel dataChannel;
        boolean z10;
        if (cVar instanceof RTCEngine$ensurePublisherConnected$1) {
            rTCEngine$ensurePublisherConnected$1 = (RTCEngine$ensurePublisherConnected$1) cVar;
            int i11 = rTCEngine$ensurePublisherConnected$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rTCEngine$ensurePublisherConnected$1.label = i11 - Integer.MIN_VALUE;
                obj = rTCEngine$ensurePublisherConnected$1.result;
                i10 = rTCEngine$ensurePublisherConnected$1.label;
                int i12 = 4;
                int i13 = 3;
                sn.z zVar = sn.z.f31622a;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    elapsedRealtime = rTCEngine$ensurePublisherConnected$1.J$0;
                                    dataChannel = (DataChannel) rTCEngine$ensurePublisherConnected$1.L$1;
                                    rTCEngine2 = (RTCEngine) rTCEngine$ensurePublisherConnected$1.L$0;
                                    sn.a.g(obj);
                                    i12 = 4;
                                    i13 = 3;
                                    if (SystemClock.elapsedRealtime() < elapsedRealtime) {
                                        PeerConnectionTransport peerConnectionTransport = rTCEngine2.publisher;
                                        if (peerConnectionTransport != null) {
                                            rTCEngine$ensurePublisherConnected$1.L$0 = rTCEngine2;
                                            rTCEngine$ensurePublisherConnected$1.L$1 = dataChannel;
                                            rTCEngine$ensurePublisherConnected$1.J$0 = elapsedRealtime;
                                            rTCEngine$ensurePublisherConnected$1.label = i13;
                                            obj = peerConnectionTransport.isConnected(rTCEngine$ensurePublisherConnected$1);
                                        }
                                        z10 = false;
                                        if (!z10 && dataChannel.state() == DataChannel.State.OPEN) {
                                            return zVar;
                                        }
                                        rTCEngine$ensurePublisherConnected$1.L$0 = rTCEngine2;
                                        rTCEngine$ensurePublisherConnected$1.L$1 = dataChannel;
                                        rTCEngine$ensurePublisherConnected$1.J$0 = elapsedRealtime;
                                        rTCEngine$ensurePublisherConnected$1.label = i12;
                                    } else {
                                        throw new RoomException.ConnectException("could not establish publisher connection", null, 2, null);
                                    }
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                elapsedRealtime = rTCEngine$ensurePublisherConnected$1.J$0;
                                dataChannel = (DataChannel) rTCEngine$ensurePublisherConnected$1.L$1;
                                rTCEngine2 = (RTCEngine) rTCEngine$ensurePublisherConnected$1.L$0;
                                sn.a.g(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    z10 = true;
                                    if (!z10) {
                                    }
                                    rTCEngine$ensurePublisherConnected$1.L$0 = rTCEngine2;
                                    rTCEngine$ensurePublisherConnected$1.L$1 = dataChannel;
                                    rTCEngine$ensurePublisherConnected$1.J$0 = elapsedRealtime;
                                    rTCEngine$ensurePublisherConnected$1.label = i12;
                                }
                                z10 = false;
                                if (!z10) {
                                }
                                rTCEngine$ensurePublisherConnected$1.L$0 = rTCEngine2;
                                rTCEngine$ensurePublisherConnected$1.L$1 = dataChannel;
                                rTCEngine$ensurePublisherConnected$1.J$0 = elapsedRealtime;
                                rTCEngine$ensurePublisherConnected$1.label = i12;
                            }
                        } else {
                            c7Var2 = (c7) rTCEngine$ensurePublisherConnected$1.L$1;
                            rTCEngine = (RTCEngine) rTCEngine$ensurePublisherConnected$1.L$0;
                            sn.a.g(obj);
                            iceConnectionState = (PeerConnection.IceConnectionState) obj;
                            if (iceConnectionState != PeerConnection.IceConnectionState.CHECKING) {
                                rTCEngine.negotiatePublisher$livekit_android_sdk_release();
                            }
                            dataChannelForKind = rTCEngine.dataChannelForKind(c7Var2);
                            if (dataChannelForKind != null) {
                                if (dataChannelForKind.state() == DataChannel.State.OPEN) {
                                    return zVar;
                                }
                                elapsedRealtime = SystemClock.elapsedRealtime() + MAX_ICE_CONNECT_TIMEOUT_MS;
                                rTCEngine2 = rTCEngine;
                                dataChannel = dataChannelForKind;
                                if (SystemClock.elapsedRealtime() < elapsedRealtime) {
                                }
                            } else {
                                throw new RoomException.ConnectException("Publisher isn't setup yet! Is room not connected?!", null, 2, null);
                            }
                        }
                    } else {
                        c7Var2 = (c7) rTCEngine$ensurePublisherConnected$1.L$1;
                        rTCEngine = (RTCEngine) rTCEngine$ensurePublisherConnected$1.L$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    if (!this.isSubscriberPrimary) {
                        return zVar;
                    }
                    PeerConnectionTransport peerConnectionTransport2 = this.publisher;
                    if (peerConnectionTransport2 != null) {
                        if (peerConnectionTransport2 != null) {
                            rTCEngine$ensurePublisherConnected$1.L$0 = this;
                            c7Var2 = c7Var;
                            rTCEngine$ensurePublisherConnected$1.L$1 = c7Var2;
                            rTCEngine$ensurePublisherConnected$1.label = 1;
                            obj = peerConnectionTransport2.isConnected(rTCEngine$ensurePublisherConnected$1);
                            if (obj != aVar) {
                                rTCEngine = this;
                            }
                            return aVar;
                        }
                        c7Var2 = c7Var;
                        rTCEngine = this;
                        z6 = false;
                        if (!z6) {
                            PeerConnectionTransport peerConnectionTransport3 = rTCEngine.publisher;
                            if (peerConnectionTransport3 != null) {
                                rTCEngine$ensurePublisherConnected$1.L$0 = rTCEngine;
                                rTCEngine$ensurePublisherConnected$1.L$1 = c7Var2;
                                rTCEngine$ensurePublisherConnected$1.label = 2;
                                obj = peerConnectionTransport3.iceConnectionState(rTCEngine$ensurePublisherConnected$1);
                            } else {
                                iceConnectionState = null;
                                if (iceConnectionState != PeerConnection.IceConnectionState.CHECKING) {
                                }
                            }
                        }
                        dataChannelForKind = rTCEngine.dataChannelForKind(c7Var2);
                        if (dataChannelForKind != null) {
                        }
                    } else {
                        throw new RoomException.ConnectException("Publisher isn't setup yet! Is room not connected?!", null, 2, null);
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    z6 = true;
                    if (!z6) {
                    }
                    dataChannelForKind = rTCEngine.dataChannelForKind(c7Var2);
                    if (dataChannelForKind != null) {
                    }
                }
                z6 = false;
                if (!z6) {
                }
                dataChannelForKind = rTCEngine.dataChannelForKind(c7Var2);
                if (dataChannelForKind != null) {
                }
            }
        }
        rTCEngine$ensurePublisherConnected$1 = new RTCEngine$ensurePublisherConnected$1(this, cVar);
        obj = rTCEngine$ensurePublisherConnected$1.result;
        i10 = rTCEngine$ensurePublisherConnected$1.label;
        int i122 = 4;
        int i132 = 3;
        sn.z zVar2 = sn.z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z6 = false;
        if (!z6) {
        }
        dataChannelForKind = rTCEngine.dataChannelForKind(c7Var2);
        if (dataChannelForKind != null) {
        }
    }

    private final DataPacketCryptorManager getDataPacketCryptorManager() {
        E2EEManager e2EEManager = this.e2EEManager;
        if (e2EEManager != null) {
            return e2EEManager.getDataPacketCryptorManager();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaConstraints getPublisherOfferConstraints() {
        MediaConstraints mediaConstraints = new MediaConstraints();
        List<MediaConstraints.KeyValuePair> list = mediaConstraints.mandatory;
        list.add(new MediaConstraints.KeyValuePair(MediaConstraintKeys.OFFER_TO_RECV_AUDIO, MediaConstraintKeys.FALSE));
        list.add(new MediaConstraints.KeyValuePair(MediaConstraintKeys.OFFER_TO_RECV_VIDEO, MediaConstraintKeys.FALSE));
        if (getConnectionState() != ConnectionState.RECONNECTING && getConnectionState() != ConnectionState.RESUMING) {
            return mediaConstraints;
        }
        list.add(new MediaConstraints.KeyValuePair(MediaConstraintKeys.ICE_RESTART, MediaConstraintKeys.TRUE));
        return mediaConstraints;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PeerConnection.RTCConfiguration makeRTCConfig(Either<LivekitRtc$JoinResponse, LivekitRtc$ReconnectResponse> serverResponse, ConnectOptions connectOptions) {
        List<LivekitRtc$ICEServer> iceServersList;
        PeerConnection.RTCConfiguration rTCConfiguration;
        ArrayList arrayList = new ArrayList();
        boolean z6 = serverResponse instanceof Either.Left;
        if (z6) {
            iceServersList = ((LivekitRtc$JoinResponse) ((Either.Left) serverResponse).getValue()).getIceServersList();
        } else if (serverResponse instanceof Either.Right) {
            iceServersList = ((LivekitRtc$ReconnectResponse) ((Either.Right) serverResponse).getValue()).getIceServersList();
        } else {
            c6.p();
            return null;
        }
        for (LivekitRtc$ICEServer livekitRtc$ICEServer : iceServersList) {
            livekitRtc$ICEServer.getClass();
            arrayList.add(RTCEngineKt.toWebrtc(livekitRtc$ICEServer));
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(SignalClient.INSTANCE.getDEFAULT_ICE_SERVERS());
        }
        PeerConnection.RTCConfiguration rtcConfig = connectOptions.getRtcConfig();
        if (rtcConfig != null && (rTCConfiguration = PeerConnectionExtKt.copy(rtcConfig)) != null) {
            List<PeerConnection.IceServer> list = rTCConfiguration.iceServers;
            list.getClass();
            ArrayList arrayList2 = new ArrayList(list);
            List<PeerConnection.IceServer> iceServers = connectOptions.getIceServers();
            if (iceServers != null) {
                for (PeerConnection.IceServer iceServer : iceServers) {
                    if (!arrayList2.contains(iceServer)) {
                        arrayList2.add(iceServer);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                List<PeerConnection.IceServer> list2 = rTCConfiguration.iceServers;
                list2.getClass();
                for (PeerConnection.IceServer iceServer2 : list2) {
                    if (!arrayList2.contains(iceServer2)) {
                        arrayList2.add(iceServer2);
                    }
                }
            }
            rTCConfiguration.iceServers = arrayList2;
        } else {
            rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
            rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
            rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        }
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration = null;
        if (z6) {
            Either.Left left = (Either.Left) serverResponse;
            if (((LivekitRtc$JoinResponse) left.getValue()).hasClientConfiguration()) {
                livekitModels$ClientConfiguration = ((LivekitRtc$JoinResponse) left.getValue()).getClientConfiguration();
            }
        } else if (serverResponse instanceof Either.Right) {
            Either.Right right = (Either.Right) serverResponse;
            if (((LivekitRtc$ReconnectResponse) right.getValue()).hasClientConfiguration()) {
                livekitModels$ClientConfiguration = ((LivekitRtc$ReconnectResponse) right.getValue()).getClientConfiguration();
            }
        } else {
            c6.p();
            return null;
        }
        if (livekitModels$ClientConfiguration != null && livekitModels$ClientConfiguration.getForceRelay() == v6.ENABLED) {
            rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.RELAY;
        }
        return rTCConfiguration;
    }

    private static final Object sendData_gIAlu_s$sendDataImpl(RTCEngine rTCEngine, LivekitModels$DataPacket livekitModels$DataPacket) {
        boolean z6;
        LivekitModels$EncryptedPacketPayload asEncryptedPacketPayload;
        try {
            E2EEManager e2EEManager = rTCEngine.e2EEManager;
            if (e2EEManager != null) {
                z6 = e2EEManager.isDataChannelEncryptionEnabled();
            } else {
                z6 = false;
            }
            if (z6 && e2EEManager != null && (asEncryptedPacketPayload = RTCEngineKt.asEncryptedPacketPayload(livekitModels$DataPacket)) != null) {
                byte[] byteArray = asEncryptedPacketPayload.toByteArray();
                byteArray.getClass();
                EncryptedPacket encrypt = e2EEManager.encrypt(byteArray);
                if (encrypt != null) {
                    livekit.a aVar = (livekit.a) livekitModels$DataPacket.toBuilder();
                    i7 newBuilder = LivekitModels$EncryptedPacket.newBuilder();
                    byte[] payload = encrypt.getPayload();
                    o oVar = p.f7115b;
                    newBuilder.b(p.d(payload, 0, payload.length));
                    byte[] iv = encrypt.getIv();
                    newBuilder.d(p.d(iv, 0, iv.length));
                    newBuilder.e(encrypt.getKeyIndex());
                    newBuilder.c();
                    aVar.e((LivekitModels$EncryptedPacket) newBuilder.build());
                    livekitModels$DataPacket = (LivekitModels$DataPacket) aVar.build();
                    livekitModels$DataPacket.getClass();
                }
            }
            c7 kind = livekitModels$DataPacket.getKind();
            c7 c7Var = c7.RELIABLE;
            if (kind == c7Var) {
                livekit.a aVar2 = (livekit.a) livekitModels$DataPacket.toBuilder();
                aVar2.k(rTCEngine.reliableDataSequence);
                a3 build = aVar2.build();
                build.getClass();
                livekitModels$DataPacket = (LivekitModels$DataPacket) build;
                rTCEngine.reliableDataSequence++;
            }
            ByteBuffer wrap = ByteBuffer.wrap(livekitModels$DataPacket.toByteArray());
            c7 kind2 = livekitModels$DataPacket.getKind();
            sn.z zVar = sn.z.f31622a;
            if (kind2 == c7Var) {
                DataPacketBuffer dataPacketBuffer = rTCEngine.reliableMessageBuffer;
                wrap.getClass();
                dataPacketBuffer.queue(new DataPacketItem(wrap, livekitModels$DataPacket.getSequence()));
                if (rTCEngine.getConnectionState() == ConnectionState.RECONNECTING) {
                    return zVar;
                }
            }
            DataChannel.Buffer buffer = new DataChannel.Buffer(wrap, true);
            c7 kind3 = livekitModels$DataPacket.getKind();
            kind3.getClass();
            DataChannel dataChannelForKind = rTCEngine.dataChannelForKind(kind3);
            if (dataChannelForKind != null) {
                dataChannelForKind.send(buffer);
                return zVar;
            }
            throw new RoomException.ConnectException("channel not established for " + livekitModels$DataPacket.getKind().name(), null, 2, null);
        } catch (Exception e10) {
            return new sn.l(e10);
        }
    }

    public final Object addTrack(String str, String str2, e9 e9Var, String str3, jb jbVar, c<? super LivekitModels$TrackInfo> cVar) {
        synchronized (this.pendingTrackResolvers) {
            if (this.pendingTrackResolvers.get(str) != null) {
                throw new TrackException.DuplicateTrackException("Track with same ID " + str + " has already been published!", null, 2, null);
            }
        }
        xq.a aVar = b.f38124b;
        return g0.R(g0.N(g.n(20, d.SECONDS)), new RTCEngine$addTrack$3(this, str, str2, e9Var, str3, jbVar, null), cVar);
    }

    public final void close(String reason) {
        reason.getClass();
        if (this.isClosed) {
            return;
        }
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.e(null, "Close - ".concat(reason), new Object[0]);
        }
        this.isClosed = true;
        k1 k1Var = this.reconnectingJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        this.reconnectingJob = null;
        this.coroutineScope.close();
        this.hasPublished = false;
        this.sessionUrl = null;
        this.sessionToken = null;
        this.connectOptions = null;
        this.lastRoomOptions = null;
        this.participantSid = null;
        this.regionUrlProvider = null;
        abortPendingPublishTracks();
        closeResources(reason);
        setConnectionState(ConnectionState.DISCONNECTED);
        synchronized (this.reliableStateLock) {
            this.reliableDataSequence = 1;
            this.reliableMessageBuffer.clear();
            this.reliableReceivedState.clear();
        }
    }

    public final Object createSenderTransceiver$livekit_android_sdk_release(MediaStreamTrack mediaStreamTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit, c<? super RtpTransceiver> cVar) {
        PeerConnectionTransport peerConnectionTransport = this.publisher;
        if (peerConnectionTransport == null) {
            return null;
        }
        return peerConnectionTransport.withPeerConnection(new RTCEngine$createSenderTransceiver$2(mediaStreamTrack, rtpTransceiverInit, null), cVar);
    }

    public final ho.l createStatsGetter(RtpSender sender) {
        sender.getClass();
        return new RTCEngine$createStatsGetter$1(this.publisher, sender);
    }

    public final SignalClient getClient() {
        return this.client;
    }

    public final ConnectionState getConnectionState() {
        return (ConnectionState) this.connectionState.getValue(this, $$delegatedProperties[0]);
    }

    /* renamed from: getE2EEManager$livekit_android_sdk_release, reason: from getter */
    public final E2EEManager getE2EEManager() {
        return this.e2EEManager;
    }

    /* renamed from: getListener$livekit_android_sdk_release, reason: from getter */
    public final Listener getListener() {
        return this.listener;
    }

    /* renamed from: getPublisher$livekit_android_sdk_release, reason: from getter */
    public final PeerConnectionTransport getPublisher() {
        return this.publisher;
    }

    public final PeerConnection getPublisherPeerConnection() {
        PeerConnectionTransport peerConnectionTransport = this.publisher;
        peerConnectionTransport.getClass();
        return peerConnectionTransport.getPeerConnection();
    }

    public final void getPublisherRTCStats(RTCStatsCollectorCallback callback) {
        callback.getClass();
        g0.I(wn.i.f37087a, new RTCEngine$getPublisherRTCStats$1(this, callback, null));
    }

    /* renamed from: getReconnectType$livekit_android_sdk_release, reason: from getter */
    public final ReconnectType getReconnectType() {
        return this.reconnectType;
    }

    /* renamed from: getRegionUrlProvider$livekit_android_sdk_release, reason: from getter */
    public final RegionUrlProvider getRegionUrlProvider() {
        return this.regionUrlProvider;
    }

    public final gl.a getServerVersion$livekit_android_sdk_release() {
        return this.client.getServerVersion();
    }

    public final PeerConnection getSubscriberPeerConnection() {
        PeerConnectionTransport peerConnectionTransport = this.subscriber;
        peerConnectionTransport.getClass();
        return peerConnectionTransport.getPeerConnection();
    }

    public final void getSubscriberRTCStats(RTCStatsCollectorCallback callback) {
        callback.getClass();
        g0.I(wn.i.f37087a, new RTCEngine$getSubscriberRTCStats$1(this, callback, null));
    }

    public final Object join(String str, String str2, ConnectOptions connectOptions, RoomOptions roomOptions, c<? super LivekitRtc$JoinResponse> cVar) {
        this.coroutineScope.close();
        this.coroutineScope = new CloseableCoroutineScope(l.J(g0.f(), this.ioDispatcher));
        this.sessionUrl = str;
        this.sessionToken = str2;
        this.connectOptions = connectOptions;
        this.lastRoomOptions = roomOptions;
        return joinImpl(str, str2, connectOptions, roomOptions, cVar);
    }

    public final Object joinImpl(String str, String str2, ConnectOptions connectOptions, RoomOptions roomOptions, c<? super LivekitRtc$JoinResponse> cVar) {
        return g0.l(new RTCEngine$joinImpl$2(this, str, str2, connectOptions, roomOptions, null), cVar);
    }

    public final void negotiatePublisher$livekit_android_sdk_release() {
        if (!this.client.getIsConnected()) {
            return;
        }
        this.hasPublished = true;
        g0.D(this.coroutineScope, null, null, new RTCEngine$negotiatePublisher$1(this, null), 3);
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onAnswer(SessionDescription sessionDescription) {
        sessionDescription.getClass();
        PeerConnection.SignalingState signalingState = (PeerConnection.SignalingState) g0.I(wn.i.f37087a, new RTCEngine$onAnswer$signalingState$1(this, null));
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.e(null, "received server answer: " + sessionDescription.type + ", " + signalingState, new Object[0]);
        }
        g0.D(this.coroutineScope, null, null, new RTCEngine$onAnswer$2(this, sessionDescription, null), 3);
    }

    public final void onBufferedAmountChange(DataChannel dataChannel, long previousAmount) {
        dataChannel.getClass();
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onClose(String reason, int code) {
        reason.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.c(null, "received close event: " + reason + ", code: " + code, new Object[0]);
        }
        abortPendingPublishTracks();
        reconnect();
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onConnectionQuality(List<LivekitRtc$ConnectionQualityInfo> updates) {
        updates.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onConnectionQuality(updates);
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onError(Throwable error) {
        Listener listener;
        error.getClass();
        if (getConnectionState() == ConnectionState.CONNECTING && (listener = this.listener) != null) {
            listener.onFailToConnect(error);
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onLeave(LivekitRtc$LeaveRequest leave) {
        RegionUrlProvider regionUrlProvider;
        leave.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.a(null, "leave request received: reason = " + leave.getReason().name(), new Object[0]);
        }
        abortPendingPublishTracks();
        if (leave.hasRegions() && (regionUrlProvider = this.regionUrlProvider) != null) {
            RegionSettings.Companion companion2 = RegionSettings.INSTANCE;
            LivekitRtc$RegionSettings regions = leave.getRegions();
            regions.getClass();
            regionUrlProvider.setServerReportedRegions(companion2.fromProto(regions));
        }
        if (leave.getAction() == zb.RESUME) {
            this.fullReconnectOnNext = false;
            return;
        }
        if (leave.getAction() != zb.RECONNECT && !leave.getCanReconnect()) {
            close$default(this, null, 1, null);
            DisconnectReason convert = RoomEventKt.convert(leave.getReason());
            Listener listener = this.listener;
            if (listener != null) {
                listener.onEngineDisconnected(convert);
                return;
            }
            return;
        }
        this.fullReconnectOnNext = true;
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onLocalTrackPublished(LivekitRtc$TrackPublishedResponse response) {
        c<LivekitModels$TrackInfo> remove;
        response.getClass();
        String cid = response.getCid();
        if (cid == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.b(null, "local track published with null cid?", new Object[0]);
                return;
            }
            return;
        }
        if (response.getTrack() == null) {
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.a(null, "local track published with null track info?", new Object[0]);
            }
        }
        LKLog.Companion companion3 = LKLog.INSTANCE;
        LoggingLevel loggingLevel = LoggingLevel.VERBOSE;
        LKLog.Companion companion4 = LKLog.INSTANCE;
        if (loggingLevel.compareTo(companion4.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.e(null, "local track published ".concat(cid), new Object[0]);
        }
        synchronized (this.pendingTrackResolvers) {
            remove = this.pendingTrackResolvers.remove(cid);
        }
        if (remove == null) {
            if (LoggingLevel.DEBUG.compareTo(companion4.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.a(null, "missing track resolver for: ".concat(cid), new Object[0]);
                return;
            }
            return;
        }
        remove.resumeWith(response.getTrack());
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onLocalTrackSubscribed(LivekitRtc$TrackSubscribed trackSubscribed) {
        trackSubscribed.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onLocalTrackSubscribed(trackSubscribed);
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onLocalTrackUnpublished(LivekitRtc$TrackUnpublishedResponse trackUnpublished) {
        trackUnpublished.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onLocalTrackUnpublished(trackUnpublished);
        }
    }

    public final void onMessage(DataChannel dataChannel, DataChannel.Buffer buffer) {
        int i10;
        dataChannel.getClass();
        if (buffer != null) {
            ByteBuffer byteBuffer = buffer.data;
            o oVar = p.f7115b;
            int remaining = byteBuffer.remaining();
            p.c(0, remaining, byteBuffer.remaining());
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            LivekitModels$DataPacket parseFrom = LivekitModels$DataPacket.parseFrom(new o(bArr));
            if (parseFrom.getSequence() > 0) {
                String participantSid = parseFrom.getParticipantSid();
                participantSid.getClass();
                if (participantSid.length() > 0) {
                    synchronized (this.reliableStateLock) {
                        Integer num = this.reliableReceivedState.get(parseFrom.getParticipantSid());
                        if (num != null && parseFrom.getSequence() <= num.intValue()) {
                            return;
                        }
                        TTLMap<String, Integer> tTLMap = this.reliableReceivedState;
                        String participantSid2 = parseFrom.getParticipantSid();
                        participantSid2.getClass();
                        tTLMap.put(participantSid2, Integer.valueOf(parseFrom.getSequence()));
                    }
                }
            }
            DataPacketCryptorManager dataPacketCryptorManager = getDataPacketCryptorManager();
            l7 l7Var = l7.NONE;
            if (parseFrom.hasEncryptedPacket() && dataPacketCryptorManager != null) {
                byte[] m10 = parseFrom.getEncryptedPacket().getEncryptedValue().m();
                m10.getClass();
                byte[] m11 = parseFrom.getEncryptedPacket().getIv().m();
                m11.getClass();
                EncryptedPacket encryptedPacket = new EncryptedPacket(m10, m11, parseFrom.getEncryptedPacket().getKeyIndex());
                l7 encryptionType = parseFrom.getEncryptedPacket().getEncryptionType();
                encryptionType.getClass();
                String participantIdentity = parseFrom.getParticipantIdentity();
                participantIdentity.getClass();
                byte[] mo2519decrypttq5M0Po = dataPacketCryptorManager.mo2519decrypttq5M0Po(Participant.Identity.m2605constructorimpl(participantIdentity), encryptedPacket);
                if (mo2519decrypttq5M0Po == null) {
                    LKLog.Companion companion = LKLog.INSTANCE;
                    if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                        et.d.c(null, "Failed to decrypt data packet.", new Object[0]);
                        return;
                    }
                    return;
                }
                LivekitModels$EncryptedPacketPayload parseFrom2 = LivekitModels$EncryptedPacketPayload.parseFrom(mo2519decrypttq5M0Po);
                livekit.a aVar = (livekit.a) parseFrom.toBuilder();
                aVar.getClass();
                parseFrom2.getClass();
                RTCEngineKt.setFromEncryptedPayload(aVar, parseFrom2);
                parseFrom = (LivekitModels$DataPacket) aVar.build();
                l7Var = encryptionType;
            }
            d7 valueCase = parseFrom.getValueCase();
            if (valueCase == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$2[valueCase.ordinal()];
            }
            if (i10 != -1) {
                if (i10 != 4) {
                    if (i10 != 14) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                switch (i10) {
                                    case 7:
                                    case 8:
                                    case 9:
                                        Listener listener = this.listener;
                                        if (listener != null) {
                                            listener.onRpcPacketReceived(parseFrom);
                                            return;
                                        }
                                        return;
                                    case 10:
                                    case 11:
                                    case 12:
                                        Listener listener2 = this.listener;
                                        if (listener2 != null) {
                                            listener2.onDataStreamPacket(parseFrom, l7Var);
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            }
                            Listener listener3 = this.listener;
                            if (listener3 != null) {
                                LivekitModels$UserPacket user = parseFrom.getUser();
                                user.getClass();
                                c7 kind = parseFrom.getKind();
                                kind.getClass();
                                listener3.onUserPacket(user, kind, l7Var);
                                return;
                            }
                            return;
                        }
                        Listener listener4 = this.listener;
                        if (listener4 != null) {
                            List<LivekitModels$SpeakerInfo> speakersList = parseFrom.getSpeaker().getSpeakersList();
                            speakersList.getClass();
                            listener4.onActiveSpeakersUpdate(speakersList);
                            return;
                        }
                        return;
                    }
                } else {
                    Listener listener5 = this.listener;
                    if (listener5 != null) {
                        LivekitModels$Transcription transcription = parseFrom.getTranscription();
                        transcription.getClass();
                        listener5.onTranscriptionReceived(transcription);
                        return;
                    }
                    return;
                }
            }
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.e(null, "invalid value for data packet", new Object[0]);
            }
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onOffer(SessionDescription sessionDescription) {
        sessionDescription.getClass();
        PeerConnection.SignalingState signalingState = (PeerConnection.SignalingState) g0.I(wn.i.f37087a, new RTCEngine$onOffer$signalingState$1(this, null));
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.e(null, "received server offer: " + sessionDescription.type + ", " + signalingState, new Object[0]);
        }
        g0.D(this.coroutineScope, null, null, new RTCEngine$onOffer$2(this, sessionDescription, null), 3);
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onParticipantUpdate(List<LivekitModels$ParticipantInfo> updates) {
        updates.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onUpdateParticipants(updates);
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onRefreshToken(String token) {
        token.getClass();
        this.sessionToken = token;
        RegionUrlProvider regionUrlProvider = this.regionUrlProvider;
        if (regionUrlProvider == null) {
            return;
        }
        regionUrlProvider.setToken(token);
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onRemoteMuteChanged(String trackSid, boolean muted) {
        trackSid.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onRemoteMuteChanged(trackSid, muted);
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onRoomUpdate(LivekitModels$Room update) {
        update.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onRoomUpdate(update);
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onSpeakersChanged(List<LivekitModels$SpeakerInfo> speakers) {
        speakers.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onSpeakersChanged(speakers);
        }
    }

    public final void onStateChange(DataChannel dataChannel) {
        dataChannel.getClass();
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onStreamStateUpdate(List<LivekitRtc$StreamStateInfo> streamStates) {
        streamStates.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onStreamStateUpdate(streamStates);
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onSubscribedQualityUpdate(LivekitRtc$SubscribedQualityUpdate subscribedQualityUpdate) {
        subscribedQualityUpdate.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onSubscribedQualityUpdate(subscribedQualityUpdate);
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onSubscriptionPermissionUpdate(LivekitRtc$SubscriptionPermissionUpdate subscriptionPermissionUpdate) {
        subscriptionPermissionUpdate.getClass();
        Listener listener = this.listener;
        if (listener != null) {
            listener.onSubscriptionPermissionUpdate(subscriptionPermissionUpdate);
        }
    }

    @Override // io.livekit.android.room.SignalClient.Listener
    public void onTrickle(IceCandidate candidate, uc target) {
        candidate.getClass();
        target.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        LoggingLevel loggingLevel = LoggingLevel.VERBOSE;
        LKLog.Companion companion2 = LKLog.INSTANCE;
        if (loggingLevel.compareTo(companion2.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.e(null, "received ice candidate from peer: " + candidate + ", " + target, new Object[0]);
        }
        int ordinal = target.ordinal();
        sn.z zVar = sn.z.f31622a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (LoggingLevel.INFO.compareTo(companion2.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                    et.d.c(null, "unknown ice candidate target?", new Object[0]);
                    return;
                }
                return;
            }
            PeerConnectionTransport peerConnectionTransport = this.subscriber;
            if (peerConnectionTransport != null) {
                peerConnectionTransport.addIceCandidate(candidate);
            } else {
                zVar = null;
            }
            if (zVar == null && LoggingLevel.WARN.compareTo(companion2.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "received candidate for subscriber when we don't have one. ignoring.", new Object[0]);
                return;
            }
            return;
        }
        PeerConnectionTransport peerConnectionTransport2 = this.publisher;
        if (peerConnectionTransport2 != null) {
            peerConnectionTransport2.addIceCandidate(candidate);
        } else {
            zVar = null;
        }
        if (zVar == null && LoggingLevel.WARN.compareTo(companion2.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.f(null, "received candidate for publisher when we don't have one. ignoring.", new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    public final synchronized void reconnect() {
        try {
            try {
                k1 k1Var = this.reconnectingJob;
                if (k1Var != null && k1Var.isActive()) {
                    LKLog.Companion companion = LKLog.INSTANCE;
                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                        et.d.a(null, "Reconnection is already in progress", new Object[0]);
                    }
                    return;
                }
                if (this.isClosed) {
                    LKLog.Companion companion2 = LKLog.INSTANCE;
                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                        et.d.a(null, "Skip reconnection - engine is closed", new Object[0]);
                    }
                    return;
                }
                ?? obj = new Object();
                String str = this.sessionUrl;
                obj.f20559a = str;
                String str2 = this.sessionToken;
                if (str != null && str2 != null) {
                    boolean z6 = this.fullReconnectOnNext;
                    this.fullReconnectOnNext = false;
                    d2 D = g0.D(this.coroutineScope, null, null, new RTCEngine$reconnect$job$1(obj, this, z6, str2, null), 3);
                    this.reconnectingJob = D;
                    D.invokeOnCompletion(new RTCEngine$reconnect$4(this, D));
                    return;
                }
                LKLog.Companion companion3 = LKLog.INSTANCE;
                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                    et.d.f(null, "couldn't reconnect, no url or no token", new Object[0]);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void registerTrackBitrateInfo$livekit_android_sdk_release(String cid, TrackBitrateInfo trackBitrateInfo) {
        cid.getClass();
        trackBitrateInfo.getClass();
        PeerConnectionTransport peerConnectionTransport = this.publisher;
        if (peerConnectionTransport != null) {
            peerConnectionTransport.registerTrackBitrateInfo(cid, trackBitrateInfo);
        }
    }

    public final void removeTrack$livekit_android_sdk_release(MediaStreamTrack rtcTrack) {
        rtcTrack.getClass();
        g0.I(wn.i.f37087a, new RTCEngine$removeTrack$1(this, rtcTrack, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: resendReliableMessagesForResume-gIAlu-s$livekit_android_sdk_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2528x959ac91f(int i10, c<? super m> cVar) {
        RTCEngine$resendReliableMessagesForResume$1 rTCEngine$resendReliableMessagesForResume$1;
        int i11;
        RTCEngine rTCEngine;
        DataChannel dataChannelForKind;
        if (cVar instanceof RTCEngine$resendReliableMessagesForResume$1) {
            rTCEngine$resendReliableMessagesForResume$1 = (RTCEngine$resendReliableMessagesForResume$1) cVar;
            int i12 = rTCEngine$resendReliableMessagesForResume$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                rTCEngine$resendReliableMessagesForResume$1.label = i12 - Integer.MIN_VALUE;
                Object obj = rTCEngine$resendReliableMessagesForResume$1.result;
                xn.a aVar = xn.a.f37986a;
                i11 = rTCEngine$resendReliableMessagesForResume$1.label;
                if (i11 == 0) {
                    if (i11 == 1) {
                        i10 = rTCEngine$resendReliableMessagesForResume$1.I$0;
                        rTCEngine = (RTCEngine) rTCEngine$resendReliableMessagesForResume$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    c7 c7Var = c7.RELIABLE;
                    rTCEngine$resendReliableMessagesForResume$1.L$0 = this;
                    rTCEngine$resendReliableMessagesForResume$1.I$0 = i10;
                    rTCEngine$resendReliableMessagesForResume$1.label = 1;
                    if (ensurePublisherConnected(c7Var, rTCEngine$resendReliableMessagesForResume$1) == aVar) {
                        return aVar;
                    }
                    rTCEngine = this;
                }
                dataChannelForKind = rTCEngine.dataChannelForKind(c7.RELIABLE);
                if (dataChannelForKind != null) {
                    return new sn.l(new NullPointerException("reliable channel not established!"));
                }
                synchronized (rTCEngine.reliableStateLock) {
                    rTCEngine.reliableMessageBuffer.popToSequence(i10);
                    Iterator<T> it = rTCEngine.reliableMessageBuffer.getAll().iterator();
                    while (it.hasNext()) {
                        dataChannelForKind.send(new DataChannel.Buffer(((DataPacketItem) it.next()).getData(), true));
                    }
                }
                return sn.z.f31622a;
            }
        }
        rTCEngine$resendReliableMessagesForResume$1 = new RTCEngine$resendReliableMessagesForResume$1(this, cVar);
        Object obj2 = rTCEngine$resendReliableMessagesForResume$1.result;
        xn.a aVar2 = xn.a.f37986a;
        i11 = rTCEngine$resendReliableMessagesForResume$1.label;
        if (i11 == 0) {
        }
        dataChannelForKind = rTCEngine.dataChannelForKind(c7.RELIABLE);
        if (dataChannelForKind != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: sendData-gIAlu-s$livekit_android_sdk_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2529sendDatagIAlus$livekit_android_sdk_release(LivekitModels$DataPacket livekitModels$DataPacket, c<? super m> cVar) {
        RTCEngine$sendData$1 rTCEngine$sendData$1;
        int i10;
        RTCEngine rTCEngine;
        Object sendData_gIAlu_s$sendDataImpl;
        if (cVar instanceof RTCEngine$sendData$1) {
            rTCEngine$sendData$1 = (RTCEngine$sendData$1) cVar;
            int i11 = rTCEngine$sendData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rTCEngine$sendData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = rTCEngine$sendData$1.result;
                xn.a aVar = xn.a.f37986a;
                i10 = rTCEngine$sendData$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        livekitModels$DataPacket = (LivekitModels$DataPacket) rTCEngine$sendData$1.L$1;
                        rTCEngine = (RTCEngine) rTCEngine$sendData$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    c7 kind = livekitModels$DataPacket.getKind();
                    kind.getClass();
                    rTCEngine$sendData$1.L$0 = this;
                    rTCEngine$sendData$1.L$1 = livekitModels$DataPacket;
                    rTCEngine$sendData$1.label = 1;
                    if (ensurePublisherConnected(kind, rTCEngine$sendData$1) == aVar) {
                        return aVar;
                    }
                    rTCEngine = this;
                }
                if (livekitModels$DataPacket.getKind() != c7.RELIABLE) {
                    synchronized (rTCEngine.reliableStateLock) {
                        sendData_gIAlu_s$sendDataImpl = sendData_gIAlu_s$sendDataImpl(rTCEngine, livekitModels$DataPacket);
                    }
                    return sendData_gIAlu_s$sendDataImpl;
                }
                return sendData_gIAlu_s$sendDataImpl(rTCEngine, livekitModels$DataPacket);
            }
        }
        rTCEngine$sendData$1 = new RTCEngine$sendData$1(this, cVar);
        Object obj2 = rTCEngine$sendData$1.result;
        xn.a aVar2 = xn.a.f37986a;
        i10 = rTCEngine$sendData$1.label;
        if (i10 == 0) {
        }
        if (livekitModels$DataPacket.getKind() != c7.RELIABLE) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    public final void sendSyncState(LivekitRtc$UpdateSubscription subscription, List<LivekitRtc$TrackPublishedResponse> publishedTracks) {
        subscription.getClass();
        publishedTracks.getClass();
        ?? obj = new Object();
        ?? obj2 = new Object();
        g0.I(wn.i.f37087a, new RTCEngine$sendSyncState$1(this, obj, obj2, null));
        zn.a aVar = EntriesMappings.entries$0;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : aVar) {
            if (((c7) obj3) != c7.UNRECOGNIZED) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DataChannel dataChannelForKind = dataChannelForKind((c7) it.next());
            if (dataChannelForKind != null) {
                arrayList2.add(dataChannelForKind);
            }
        }
        ArrayList arrayList3 = new ArrayList(tn.p.a0(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            DataChannel dataChannel = (DataChannel) it2.next();
            qb newBuilder = LivekitRtc$DataChannelInfo.newBuilder();
            newBuilder.b(dataChannel.id());
            newBuilder.c(dataChannel.label());
            arrayList3.add((LivekitRtc$DataChannelInfo) newBuilder.build());
        }
        TTLMap<String, Integer> tTLMap = this.reliableReceivedState;
        ArrayList arrayList4 = new ArrayList(tTLMap.size());
        for (Map.Entry<String, Integer> entry : tTLMap.entrySet()) {
            String key = entry.getKey();
            int intValue = entry.getValue().intValue();
            sb newBuilder2 = LivekitRtc$DataChannelReceiveState.newBuilder();
            newBuilder2.c(key);
            newBuilder2.b(intValue);
            arrayList4.add((LivekitRtc$DataChannelReceiveState) newBuilder2.build());
        }
        nd newBuilder3 = LivekitRtc$SyncState.newBuilder();
        Object obj4 = obj.f20559a;
        if (obj4 != null) {
            newBuilder3.e((LivekitRtc$SessionDescription) obj4);
        }
        Object obj5 = obj2.f20559a;
        if (obj5 != null) {
            newBuilder3.f((LivekitRtc$SessionDescription) obj5);
        }
        newBuilder3.g(subscription);
        newBuilder3.d(publishedTracks);
        newBuilder3.b(arrayList3);
        newBuilder3.c(arrayList4);
        LivekitRtc$SyncState livekitRtc$SyncState = (LivekitRtc$SyncState) newBuilder3.build();
        SignalClient signalClient = this.client;
        livekitRtc$SyncState.getClass();
        signalClient.sendSyncState(livekitRtc$SyncState);
    }

    public final void setConnectionState(ConnectionState connectionState) {
        connectionState.getClass();
        this.connectionState.setValue(this, $$delegatedProperties[0], connectionState);
    }

    public final void setE2EEManager$livekit_android_sdk_release(E2EEManager e2EEManager) {
        this.e2EEManager = e2EEManager;
    }

    public final void setListener$livekit_android_sdk_release(Listener listener) {
        this.listener = listener;
    }

    public final void setPublisher$livekit_android_sdk_release(PeerConnectionTransport peerConnectionTransport) {
        this.publisher = peerConnectionTransport;
    }

    public final void setReconnectType$livekit_android_sdk_release(ReconnectType reconnectType) {
        reconnectType.getClass();
        this.reconnectType = reconnectType;
    }

    public final void setRegionUrlProvider$livekit_android_sdk_release(RegionUrlProvider regionUrlProvider) {
        this.regionUrlProvider = regionUrlProvider;
    }

    public final void updateLocalAudioTrack(String sid, Collection<? extends s6> features) {
        sid.getClass();
        features.getClass();
        this.client.sendUpdateLocalAudioTrack(sid, features);
    }

    public final void updateMuteStatus(String sid, boolean muted) {
        sid.getClass();
        this.client.sendMuteTrack(sid, muted);
    }

    public final void updateSubscriptionPermissions(boolean allParticipants, List<ParticipantTrackPermission> participantTrackPermissions) {
        participantTrackPermissions.getClass();
        this.client.sendUpdateSubscriptionPermissions(allParticipants, participantTrackPermissions);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(4:34|35|(1:37)|31)|18|(1:(1:(2:22|23)(2:24|25))(1:26))(1:32)|(1:28)(2:29|(1:31)(1:12))))|39|6|7|(0)(0)|18|(0)(0)|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForBufferStatusLow$livekit_android_sdk_release(c7 c7Var, c<? super sn.z> cVar) {
        RTCEngine$waitForBufferStatusLow$1 rTCEngine$waitForBufferStatusLow$1;
        int i10;
        RTCEngine rTCEngine;
        int ordinal;
        DataChannelManager dataChannelManager;
        if (cVar instanceof RTCEngine$waitForBufferStatusLow$1) {
            rTCEngine$waitForBufferStatusLow$1 = (RTCEngine$waitForBufferStatusLow$1) cVar;
            int i11 = rTCEngine$waitForBufferStatusLow$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rTCEngine$waitForBufferStatusLow$1.label = i11 - Integer.MIN_VALUE;
                Object obj = rTCEngine$waitForBufferStatusLow$1.result;
                i10 = rTCEngine$waitForBufferStatusLow$1.label;
                sn.z zVar = sn.z.f31622a;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c7Var = (c7) rTCEngine$waitForBufferStatusLow$1.L$1;
                    rTCEngine = (RTCEngine) rTCEngine$waitForBufferStatusLow$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    rTCEngine$waitForBufferStatusLow$1.L$0 = this;
                    rTCEngine$waitForBufferStatusLow$1.L$1 = c7Var;
                    rTCEngine$waitForBufferStatusLow$1.label = 1;
                    if (ensurePublisherConnected(c7Var, rTCEngine$waitForBufferStatusLow$1) != aVar) {
                        rTCEngine = this;
                    }
                    return aVar;
                }
                ordinal = c7Var.ordinal();
                if (ordinal == 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            c6.p();
                            return null;
                        }
                        c6.y();
                        return null;
                    }
                    dataChannelManager = rTCEngine.lossyDataChannelManager;
                } else {
                    dataChannelManager = rTCEngine.reliableDataChannelManager;
                }
                if (dataChannelManager != null) {
                    return zVar;
                }
                rTCEngine$waitForBufferStatusLow$1.L$0 = null;
                rTCEngine$waitForBufferStatusLow$1.L$1 = null;
                rTCEngine$waitForBufferStatusLow$1.label = 2;
                if (dataChannelManager.waitForBufferedAmountLow(2097152L, rTCEngine$waitForBufferStatusLow$1) == aVar) {
                    return aVar;
                }
                return zVar;
            }
        }
        rTCEngine$waitForBufferStatusLow$1 = new RTCEngine$waitForBufferStatusLow$1(this, cVar);
        Object obj2 = rTCEngine$waitForBufferStatusLow$1.result;
        i10 = rTCEngine$waitForBufferStatusLow$1.label;
        sn.z zVar2 = sn.z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        ordinal = c7Var.ordinal();
        if (ordinal == 0) {
        }
        if (dataChannelManager != null) {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\b\u0010\u0006\u0012\u0004\b\t\u0010\u0003R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lio/livekit/android/room/RTCEngine$Companion;", "", "<init>", "()V", "", "RELIABLE_DATA_CHANNEL_LABEL", "Ljava/lang/String;", "getRELIABLE_DATA_CHANNEL_LABEL$annotations", "LOSSY_DATA_CHANNEL_LABEL", "getLOSSY_DATA_CHANNEL_LABEL$annotations", "Llivekit/org/webrtc/MediaConstraints;", "CONN_CONSTRAINTS", "Llivekit/org/webrtc/MediaConstraints;", "getCONN_CONSTRAINTS$livekit_android_sdk_release", "()Llivekit/org/webrtc/MediaConstraints;", "", "DATA_CHANNEL_LOW_THRESHOLD", TokenNames.I, "MAX_DATA_PACKET_SIZE", "MAX_ICE_CONNECT_TIMEOUT_MS", "MAX_RECONNECT_RETRIES", "MAX_RECONNECT_TIMEOUT", "Lxq/b;", "RELIABLE_RECEIVE_STATE_TTL_MS", "J", "", "RELIABLE_RETRY_AMOUNT", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final MediaConstraints getCONN_CONSTRAINTS$livekit_android_sdk_release() {
            return RTCEngine.CONN_CONSTRAINTS;
        }

        private Companion() {
        }

        public static /* synthetic */ void getLOSSY_DATA_CHANNEL_LABEL$annotations() {
        }

        public static /* synthetic */ void getRELIABLE_DATA_CHANNEL_LABEL$annotations() {
        }
    }

    public final ho.l createStatsGetter(RtpReceiver receiver) {
        receiver.getClass();
        return new RTCEngine$createStatsGetter$2(this.subscriber, receiver);
    }

    public static /* synthetic */ void getConnectionState$annotations() {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH&¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH&¢\u0006\u0004\b%\u0010\"J\u001f\u0010*\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H&¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u0002000\u001eH&¢\u0006\u0004\b1\u0010\"J\u001d\u00102\u001a\u00020\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH&¢\u0006\u0004\b2\u0010\"J'\u00109\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\u00020\u00022\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u001eH&¢\u0006\u0004\b=\u0010\"J\u0017\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020>H&¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00022\u0006\u0010C\u001a\u00020BH&¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00022\u0006\u0010F\u001a\u00020(H&¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0002H&¢\u0006\u0004\bI\u0010\u0004J\u0018\u0010K\u001a\u00020\u00022\u0006\u0010J\u001a\u00020(H¦@¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00022\u0006\u0010N\u001a\u00020MH&¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00022\u0006\u0010R\u001a\u00020QH&¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020\u00022\u0006\u0010V\u001a\u00020UH&¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020YH&¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020Y2\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b]\u0010^¨\u0006_"}, d2 = {"Lio/livekit/android/room/RTCEngine$Listener;", "", "Lsn/z;", "onEngineConnected", "()V", "onEngineReconnected", "onEngineReconnecting", "onEngineResuming", "onEngineResumed", "Lio/livekit/android/events/DisconnectReason;", "reason", "onEngineDisconnected", "(Lio/livekit/android/events/DisconnectReason;)V", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onFailToConnect", "(Ljava/lang/Throwable;)V", "Llivekit/LivekitRtc$JoinResponse;", "response", "onJoinResponse", "(Llivekit/LivekitRtc$JoinResponse;)V", "Llivekit/org/webrtc/RtpReceiver;", "receiver", "Llivekit/org/webrtc/MediaStreamTrack;", "track", "", "Llivekit/org/webrtc/MediaStream;", "streams", "onAddTrack", "(Llivekit/org/webrtc/RtpReceiver;Llivekit/org/webrtc/MediaStreamTrack;[Llivekit/org/webrtc/MediaStream;)V", "", "Llivekit/LivekitModels$ParticipantInfo;", "updates", "onUpdateParticipants", "(Ljava/util/List;)V", "Llivekit/LivekitModels$SpeakerInfo;", "speakers", "onActiveSpeakersUpdate", "", "trackSid", "", "muted", "onRemoteMuteChanged", "(Ljava/lang/String;Z)V", "Llivekit/LivekitModels$Room;", "update", "onRoomUpdate", "(Llivekit/LivekitModels$Room;)V", "Llivekit/LivekitRtc$ConnectionQualityInfo;", "onConnectionQuality", "onSpeakersChanged", "Llivekit/LivekitModels$UserPacket;", "packet", "Las/c7;", "kind", "Las/l7;", "encryptionType", "onUserPacket", "(Llivekit/LivekitModels$UserPacket;Las/c7;Las/l7;)V", "Llivekit/LivekitRtc$StreamStateInfo;", "streamStates", "onStreamStateUpdate", "Llivekit/LivekitRtc$SubscribedQualityUpdate;", "subscribedQualityUpdate", "onSubscribedQualityUpdate", "(Llivekit/LivekitRtc$SubscribedQualityUpdate;)V", "Llivekit/LivekitRtc$SubscriptionPermissionUpdate;", "subscriptionPermissionUpdate", "onSubscriptionPermissionUpdate", "(Llivekit/LivekitRtc$SubscriptionPermissionUpdate;)V", "isResume", "onSignalConnected", "(Z)V", "onFullReconnecting", "isFullReconnect", "onPostReconnect", "(ZLwn/c;)Ljava/lang/Object;", "Llivekit/LivekitRtc$TrackUnpublishedResponse;", "trackUnpublished", "onLocalTrackUnpublished", "(Llivekit/LivekitRtc$TrackUnpublishedResponse;)V", "Llivekit/LivekitModels$Transcription;", "transcription", "onTranscriptionReceived", "(Llivekit/LivekitModels$Transcription;)V", "Llivekit/LivekitRtc$TrackSubscribed;", "trackSubscribed", "onLocalTrackSubscribed", "(Llivekit/LivekitRtc$TrackSubscribed;)V", "Llivekit/LivekitModels$DataPacket;", "dp", "onRpcPacketReceived", "(Llivekit/LivekitModels$DataPacket;)V", "onDataStreamPacket", "(Llivekit/LivekitModels$DataPacket;Las/l7;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Listener {
        void onActiveSpeakersUpdate(List<LivekitModels$SpeakerInfo> speakers);

        void onAddTrack(RtpReceiver receiver, MediaStreamTrack track, MediaStream[] streams);

        void onConnectionQuality(List<LivekitRtc$ConnectionQualityInfo> updates);

        void onDataStreamPacket(LivekitModels$DataPacket dp2, l7 encryptionType);

        void onEngineConnected();

        void onEngineDisconnected(DisconnectReason reason);

        void onEngineReconnected();

        void onEngineReconnecting();

        void onEngineResumed();

        void onEngineResuming();

        void onFailToConnect(Throwable error);

        void onFullReconnecting();

        void onJoinResponse(LivekitRtc$JoinResponse response);

        void onLocalTrackSubscribed(LivekitRtc$TrackSubscribed trackSubscribed);

        void onLocalTrackUnpublished(LivekitRtc$TrackUnpublishedResponse trackUnpublished);

        Object onPostReconnect(boolean z6, c<? super sn.z> cVar);

        void onRemoteMuteChanged(String trackSid, boolean muted);

        void onRoomUpdate(LivekitModels$Room update);

        void onRpcPacketReceived(LivekitModels$DataPacket dp2);

        void onSignalConnected(boolean isResume);

        void onSpeakersChanged(List<LivekitModels$SpeakerInfo> speakers);

        void onStreamStateUpdate(List<LivekitRtc$StreamStateInfo> streamStates);

        void onSubscribedQualityUpdate(LivekitRtc$SubscribedQualityUpdate subscribedQualityUpdate);

        void onSubscriptionPermissionUpdate(LivekitRtc$SubscriptionPermissionUpdate subscriptionPermissionUpdate);

        void onTranscriptionReceived(LivekitModels$Transcription transcription);

        void onUpdateParticipants(List<LivekitModels$ParticipantInfo> updates);

        void onUserPacket(LivekitModels$UserPacket packet, c7 kind, l7 encryptionType);

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class DefaultImpls {
            public static void onEngineResumed(Listener listener) {
            }

            public static void onEngineResuming(Listener listener) {
            }
        }
    }
}
