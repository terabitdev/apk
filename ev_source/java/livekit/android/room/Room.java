package io.livekit.android.room;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.ConnectivityManager;
import android.net.Network;
import as.ad;
import as.b7;
import as.c7;
import as.d7;
import as.l7;
import as.q7;
import as.t7;
import as.vc;
import as.w7;
import as.zd;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.a3;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import fr.d0;
import fr.g0;
import fr.z;
import ho.l;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.livekit.android.ConnectOptions;
import io.livekit.android.RoomOptions;
import io.livekit.android.audio.AudioHandler;
import io.livekit.android.audio.AudioProcessingController;
import io.livekit.android.audio.AudioRecordPrewarmer;
import io.livekit.android.audio.AudioSwitchHandler;
import io.livekit.android.audio.CommunicationWorkaround;
import io.livekit.android.e2ee.E2EEManager;
import io.livekit.android.e2ee.E2EEOptions;
import io.livekit.android.e2ee.KeyProvider;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.DisconnectReason;
import io.livekit.android.events.EventListenable;
import io.livekit.android.events.RoomEvent;
import io.livekit.android.memory.CloseableManager;
import io.livekit.android.renderer.TextureViewRenderer;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.RegionUrlProvider;
import io.livekit.android.room.Room;
import io.livekit.android.room.RoomException;
import io.livekit.android.room.datastream.incoming.IncomingDataStreamManager;
import io.livekit.android.room.network.NetworkCallbackManager;
import io.livekit.android.room.participant.AudioTrackPublishDefaults;
import io.livekit.android.room.participant.ConnectionQuality;
import io.livekit.android.room.participant.LocalParticipant;
import io.livekit.android.room.participant.LocalParticipantKt;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.participant.ParticipantListener;
import io.livekit.android.room.participant.RemoteParticipant;
import io.livekit.android.room.participant.VideoTrackPublishDefaults;
import io.livekit.android.room.provisions.LKObjects;
import io.livekit.android.room.rpc.RpcManager;
import io.livekit.android.room.track.LocalAudioTrackOptions;
import io.livekit.android.room.track.LocalTrackPublication;
import io.livekit.android.room.track.LocalVideoTrackOptions;
import io.livekit.android.room.track.RemoteTrackPublication;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.room.types.TranscriptionSegment;
import io.livekit.android.room.types.TranscriptionSegmentKt;
import io.livekit.android.room.util.ConnectionWarmer;
import io.livekit.android.util.CoroutineUtilKt;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.util.MutableStateFlowDelegate;
import ir.a1;
import ir.r;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$Codec;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$DataStream;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$ParticipantTracks;
import livekit.LivekitModels$Room;
import livekit.LivekitModels$SpeakerInfo;
import livekit.LivekitModels$Transcription;
import livekit.LivekitModels$TranscriptionSegment;
import livekit.LivekitModels$UserPacket;
import livekit.LivekitRtc$ConnectionQualityInfo;
import livekit.LivekitRtc$JoinResponse;
import livekit.LivekitRtc$SimulateScenario;
import livekit.LivekitRtc$StreamStateInfo;
import livekit.LivekitRtc$SubscribedQualityUpdate;
import livekit.LivekitRtc$SubscriptionPermissionUpdate;
import livekit.LivekitRtc$TrackPublishedResponse;
import livekit.LivekitRtc$TrackSubscribed;
import livekit.LivekitRtc$TrackUnpublishedResponse;
import livekit.LivekitRtc$UpdateSubscription;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.MediaStream;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RendererCommon;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.SurfaceViewRenderer;
import livekit.org.webrtc.audio.AudioDeviceModule;
import oo.u;
import or.a;
import or.d;
import p.n;
import qr.g;
import rd.c1;
import sn.k;
import tn.a0;
import tn.o;
import tn.p;
import tn.t;
import wn.c;
import wn.e;
import wn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000°\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\bÈ\u0003É\u0003Ê\u0003Ë\u0003B¿\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001ej\u0002`!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200H\u0096\u0001¢\u0006\u0004\b1\u00102J \u00107\u001a\u0002002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0096\u0001¢\u0006\u0004\b7\u00108J+\u0010?\u001a\u0002002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u00106\u001a\u000205H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J \u0010B\u001a\u0002002\u0006\u0010A\u001a\u00020@2\u0006\u00106\u001a\u000205H\u0096\u0001¢\u0006\u0004\bB\u0010CJ6\u0010J\u001a\u0002002\u0006\u0010E\u001a\u00020D2\u001c\u0010I\u001a\u0018\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u0002000Fj\u0002`HH\u0096\u0001¢\u0006\u0004\bJ\u0010KJ6\u0010N\u001a\u0002002\u0006\u0010E\u001a\u00020D2\u001c\u0010I\u001a\u0018\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u0002000Fj\u0002`MH\u0096\u0001¢\u0006\u0004\bN\u0010KJ\u0018\u0010O\u001a\u0002002\u0006\u0010E\u001a\u00020DH\u0096\u0001¢\u0006\u0004\bO\u0010PJ\u0018\u0010Q\u001a\u0002002\u0006\u0010E\u001a\u00020DH\u0096\u0001¢\u0006\u0004\bQ\u0010PJ\u0016\u0010U\u001a\u00020RH\u0086@ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ$\u0010X\u001a\u0002002\u0006\u0010V\u001a\u00020D2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010DH\u0086@¢\u0006\u0004\bX\u0010YJ,\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010V\u001a\u00020D2\u0006\u0010W\u001a\u00020D2\b\b\u0002\u0010[\u001a\u00020ZH\u0086@¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u000200¢\u0006\u0004\b_\u00102J\u0015\u0010a\u001a\u0002002\u0006\u0010[\u001a\u00020`¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u000200¢\u0006\u0004\bc\u00102J\u0017\u0010f\u001a\u0002002\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u0004\u0018\u00010i2\u0006\u0010h\u001a\u00020D¢\u0006\u0004\bj\u0010kJ\u001a\u0010j\u001a\u0004\u0018\u00010i2\u0006\u0010h\u001a\u00020lø\u0001\u0000¢\u0006\u0004\bm\u0010kJ\u0017\u0010o\u001a\u0004\u0018\u00010i2\u0006\u0010n\u001a\u00020D¢\u0006\u0004\bo\u0010kJ\u001a\u0010o\u001a\u0004\u0018\u00010i2\u0006\u0010n\u001a\u00020;ø\u0001\u0000¢\u0006\u0004\bp\u0010kJ\u0015\u0010s\u001a\u0002002\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bs\u0010tJ\u0015\u0010s\u001a\u0002002\u0006\u0010r\u001a\u00020u¢\u0006\u0004\bs\u0010vJ\u0015\u0010y\u001a\u0002002\u0006\u0010x\u001a\u00020w¢\u0006\u0004\by\u0010zJ\u0015\u0010{\u001a\u0002002\u0006\u0010x\u001a\u00020w¢\u0006\u0004\b{\u0010zJ=\u0010\u0080\u0001\u001a\u0002002\u0006\u0010|\u001a\u00020D2\"\u0010I\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020}\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0~\u0012\u0006\u0012\u0004\u0018\u00010\u007f0FH\u0016¢\u0006\u0005\b\u0080\u0001\u0010KJ\u0019\u0010\u0081\u0001\u001a\u0002002\u0006\u0010|\u001a\u00020DH\u0016¢\u0006\u0005\b\u0081\u0001\u0010PJ:\u0010\u0088\u0001\u001a\u00020D2\u0007\u0010\u0082\u0001\u001a\u00020;2\u0006\u0010|\u001a\u00020D2\u0007\u0010\u0083\u0001\u001a\u00020D2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0089\u0001\u001a\u000200H\u0016¢\u0006\u0005\b\u0089\u0001\u00102J\u0011\u0010\u008a\u0001\u001a\u000200H\u0016¢\u0006\u0005\b\u008a\u0001\u00102J\u0011\u0010\u008b\u0001\u001a\u000200H\u0016¢\u0006\u0005\b\u008b\u0001\u00102J9\u0010\u0093\u0001\u001a\u0002002\b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0011\u0010\u0092\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u0091\u00010\u0090\u0001H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J#\u0010\u0098\u0001\u001a\u0002002\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u0001H\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J#\u0010\u009c\u0001\u001a\u0002002\u000f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0095\u0001H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u0099\u0001J#\u0010\u009e\u0001\u001a\u0002002\u0007\u0010\u009d\u0001\u001a\u00020D2\u0006\u0010x\u001a\u00020wH\u0016¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010¢\u0001\u001a\u0002002\b\u0010¡\u0001\u001a\u00030 \u0001H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J#\u0010¥\u0001\u001a\u0002002\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010\u0095\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010\u0099\u0001J#\u0010¦\u0001\u001a\u0002002\u000f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0095\u0001H\u0016¢\u0006\u0006\b¦\u0001\u0010\u0099\u0001J.\u0010«\u0001\u001a\u0002002\b\u0010¨\u0001\u001a\u00030§\u00012\b\u0010ª\u0001\u001a\u00030©\u00012\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J$\u0010¯\u0001\u001a\u0002002\b\u0010®\u0001\u001a\u00030\u00ad\u00012\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001c\u0010³\u0001\u001a\u0002002\b\u0010²\u0001\u001a\u00030±\u0001H\u0016¢\u0006\u0006\b³\u0001\u0010´\u0001J\u001c\u0010µ\u0001\u001a\u0002002\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J#\u0010¹\u0001\u001a\u0002002\u000f\u0010¸\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010\u0095\u0001H\u0016¢\u0006\u0006\b¹\u0001\u0010\u0099\u0001J\u001c\u0010¼\u0001\u001a\u0002002\b\u0010»\u0001\u001a\u00030º\u0001H\u0016¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001c\u0010À\u0001\u001a\u0002002\b\u0010¿\u0001\u001a\u00030¾\u0001H\u0016¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001c\u0010Ä\u0001\u001a\u0002002\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0016¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001c\u0010È\u0001\u001a\u0002002\b\u0010Ç\u0001\u001a\u00030Æ\u0001H\u0016¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001a\u0010Ë\u0001\u001a\u0002002\u0007\u0010Ê\u0001\u001a\u00020wH\u0016¢\u0006\u0005\bË\u0001\u0010zJ\u0011\u0010Ì\u0001\u001a\u000200H\u0016¢\u0006\u0005\bÌ\u0001\u00102J\u001c\u0010Î\u0001\u001a\u0002002\u0007\u0010Í\u0001\u001a\u00020wH\u0096@¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u001b\u0010Ñ\u0001\u001a\u0002002\u0007\u0010e\u001a\u00030Ð\u0001H\u0016¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u001c\u0010Õ\u0001\u001a\u0002002\b\u0010Ô\u0001\u001a\u00030Ó\u0001H\u0016¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J&\u0010Ù\u0001\u001a\u0002002\u0007\u0010×\u0001\u001a\u00020i2\t\u0010Ø\u0001\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J%\u0010Ý\u0001\u001a\u0002002\b\u0010Ü\u0001\u001a\u00030Û\u00012\u0007\u0010×\u0001\u001a\u00020iH\u0016¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J%\u0010ß\u0001\u001a\u0002002\b\u0010Ü\u0001\u001a\u00030Û\u00012\u0007\u0010×\u0001\u001a\u00020iH\u0016¢\u0006\u0006\bß\u0001\u0010Þ\u0001J&\u0010â\u0001\u001a\u0002002\b\u0010Ü\u0001\u001a\u00030à\u00012\b\u0010×\u0001\u001a\u00030á\u0001H\u0016¢\u0006\u0006\bâ\u0001\u0010ã\u0001J&\u0010æ\u0001\u001a\u0002002\b\u0010Ü\u0001\u001a\u00030ä\u00012\b\u0010×\u0001\u001a\u00030å\u0001H\u0016¢\u0006\u0006\bæ\u0001\u0010ç\u0001J&\u0010â\u0001\u001a\u0002002\b\u0010Ü\u0001\u001a\u00030ä\u00012\b\u0010×\u0001\u001a\u00030å\u0001H\u0016¢\u0006\u0006\bâ\u0001\u0010ç\u0001J0\u0010é\u0001\u001a\u0002002\b\u0010\u008f\u0001\u001a\u00030è\u00012\b\u0010Ü\u0001\u001a\u00030à\u00012\b\u0010×\u0001\u001a\u00030á\u0001H\u0016¢\u0006\u0006\bé\u0001\u0010ê\u0001J3\u0010î\u0001\u001a\u0002002\u0006\u0010h\u001a\u00020D2\r\u0010í\u0001\u001a\b0ë\u0001j\u0003`ì\u00012\b\u0010×\u0001\u001a\u00030á\u0001H\u0016¢\u0006\u0006\bî\u0001\u0010ï\u0001J0\u0010ð\u0001\u001a\u0002002\b\u0010\u008f\u0001\u001a\u00030è\u00012\b\u0010Ü\u0001\u001a\u00030à\u00012\b\u0010×\u0001\u001a\u00030á\u0001H\u0016¢\u0006\u0006\bð\u0001\u0010ê\u0001J\u001a\u0010ó\u0001\u001a\u0002002\b\u0010ò\u0001\u001a\u00030ñ\u0001¢\u0006\u0006\bó\u0001\u0010ô\u0001J\u001a\u0010ó\u0001\u001a\u0002002\b\u0010ò\u0001\u001a\u00030õ\u0001¢\u0006\u0006\bó\u0001\u0010ö\u0001J\u001a\u0010ù\u0001\u001a\u0002002\b\u0010ø\u0001\u001a\u00030÷\u0001¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u001a\u0010û\u0001\u001a\u0002002\b\u0010ø\u0001\u001a\u00030÷\u0001¢\u0006\u0006\bû\u0001\u0010ú\u0001J\u001c\u0010þ\u0001\u001a\u0002002\b\u0010ý\u0001\u001a\u00030ü\u0001H\u0007¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J\u0012\u0010\u0080\u0002\u001a\u00020`H\u0002¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u0011\u0010\u0082\u0002\u001a\u000200H\u0002¢\u0006\u0005\b\u0082\u0002\u00102J\u001c\u0010\u0084\u0002\u001a\u0002002\u0006\u0010n\u001a\u00020;H\u0002ø\u0001\u0000¢\u0006\u0005\b\u0083\u0002\u0010PJ(\u0010\u0088\u0002\u001a\u00030á\u00012\u0006\u0010n\u001a\u00020;2\b\u0010\u0085\u0002\u001a\u00030\u0096\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J#\u0010\u008a\u0002\u001a\u0002002\u000f\u0010\u0089\u0002\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0095\u0001H\u0002¢\u0006\u0006\b\u008a\u0002\u0010\u0099\u0001J#\u0010\u008b\u0002\u001a\u0002002\u000f\u0010\u0089\u0002\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0095\u0001H\u0002¢\u0006\u0006\b\u008b\u0002\u0010\u0099\u0001J\u0011\u0010\u008c\u0002\u001a\u000200H\u0002¢\u0006\u0005\b\u008c\u0002\u00102J\u001c\u0010\u008d\u0002\u001a\u0002002\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\b\u008d\u0002\u0010Å\u0001J\u0011\u0010\u008e\u0002\u001a\u000200H\u0002¢\u0006\u0005\b\u008e\u0002\u00102J\u0011\u0010\u008f\u0002\u001a\u000200H\u0002¢\u0006\u0005\b\u008f\u0002\u00102J\u001d\u0010\u0092\u0002\u001a\u0002002\b\u0010\u0091\u0002\u001a\u00030\u0090\u0002H\u0082@¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0094\u0002R\u001d\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\b\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0098\u0002R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0099\u0002R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u009a\u0002R\u0015\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u009a\u0002R\u001a\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\u000f\n\u0005\b\u0013\u0010\u009b\u0002\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u009e\u0002R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010\u009f\u0002R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010 \u0002R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\u000f\n\u0005\b\u001b\u0010¡\u0002\u001a\u0006\b¢\u0002\u0010£\u0002R\u001a\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\u000f\n\u0005\b\u001d\u0010¤\u0002\u001a\u0006\b¥\u0002\u0010¦\u0002R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010§\u0002R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010¨\u0002R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010©\u0002R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010ª\u0002R\u0015\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010«\u0002R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010¬\u0002R\u001a\u0010®\u0002\u001a\u00030\u00ad\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R\u001f\u0010±\u0002\u001a\n\u0012\u0005\u0012\u00030\u0090\u00020°\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R$\u0010´\u0002\u001a\n\u0012\u0005\u0012\u00030\u0090\u00020³\u00028\u0006¢\u0006\u0010\n\u0006\b´\u0002\u0010µ\u0002\u001a\u0006\b¶\u0002\u0010·\u0002RB\u0010h\u001a\u0004\u0018\u00010R2\t\u0010¸\u0002\u001a\u0004\u0018\u00010R8G@BX\u0087\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u001e\n\u0006\b¹\u0002\u0010º\u0002\u0012\u0005\b¾\u0002\u00102\u001a\u0006\b»\u0002\u0010¼\u0002\"\u0005\b½\u0002\u0010PR=\u0010Ã\u0002\u001a\u0004\u0018\u00010D2\t\u0010¸\u0002\u001a\u0004\u0018\u00010D8G@BX\u0087\u008e\u0002¢\u0006\u001e\n\u0006\b¿\u0002\u0010º\u0002\u0012\u0005\bÂ\u0002\u00102\u001a\u0006\bÀ\u0002\u0010¼\u0002\"\u0005\bÁ\u0002\u0010PR<\u0010Ë\u0002\u001a\u00030Ä\u00022\b\u0010¸\u0002\u001a\u00030Ä\u00028G@BX\u0087\u008e\u0002¢\u0006\u001f\n\u0006\bÅ\u0002\u0010º\u0002\u0012\u0005\bÊ\u0002\u00102\u001a\u0006\bÆ\u0002\u0010Ç\u0002\"\u0006\bÈ\u0002\u0010É\u0002R=\u0010Ð\u0002\u001a\u0004\u0018\u00010D2\t\u0010¸\u0002\u001a\u0004\u0018\u00010D8G@BX\u0087\u008e\u0002¢\u0006\u001e\n\u0006\bÌ\u0002\u0010º\u0002\u0012\u0005\bÏ\u0002\u00102\u001a\u0006\bÍ\u0002\u0010¼\u0002\"\u0005\bÎ\u0002\u0010PR9\u0010Ò\u0002\u001a\u00020w2\u0007\u0010¸\u0002\u001a\u00020w8G@BX\u0087\u008e\u0002¢\u0006\u001e\n\u0006\bÑ\u0002\u0010º\u0002\u0012\u0005\bÕ\u0002\u00102\u001a\u0006\bÒ\u0002\u0010Ó\u0002\"\u0005\bÔ\u0002\u0010zR/\u0010Ö\u0002\u001a\u00020w8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0006\bÖ\u0002\u0010×\u0002\u0012\u0005\bÚ\u0002\u00102\u001a\u0006\bØ\u0002\u0010Ó\u0002\"\u0005\bÙ\u0002\u0010zR,\u0010Ü\u0002\u001a\u0005\u0018\u00010Û\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÜ\u0002\u0010Ý\u0002\u001a\u0006\bÞ\u0002\u0010ß\u0002\"\u0006\bà\u0002\u0010á\u0002R(\u0010â\u0002\u001a\u00020w8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bâ\u0002\u0010×\u0002\u001a\u0006\bã\u0002\u0010Ó\u0002\"\u0005\bä\u0002\u0010zR(\u0010å\u0002\u001a\u00020w8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bå\u0002\u0010×\u0002\u001a\u0006\bæ\u0002\u0010Ó\u0002\"\u0005\bç\u0002\u0010zR,\u0010é\u0002\u001a\u0005\u0018\u00010è\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bé\u0002\u0010ê\u0002\u001a\u0006\bë\u0002\u0010ì\u0002\"\u0006\bí\u0002\u0010î\u0002R\u001d\u0010ï\u0002\u001a\u00030å\u00018\u0006¢\u0006\u0010\n\u0006\bï\u0002\u0010ð\u0002\u001a\u0006\bñ\u0002\u0010ò\u0002RO\u0010ù\u0002\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030á\u00010ó\u00022\u0015\u0010¸\u0002\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030á\u00010ó\u00028B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bô\u0002\u0010º\u0002\u001a\u0006\bõ\u0002\u0010ö\u0002\"\u0006\b÷\u0002\u0010ø\u0002R&\u0010û\u0002\u001a\u000f\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020;0ú\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0002\u0010ü\u0002RA\u0010\u0081\u0003\u001a\t\u0012\u0004\u0012\u00020i0\u0095\u00012\u000e\u0010¸\u0002\u001a\t\u0012\u0004\u0012\u00020i0\u0095\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bý\u0002\u0010º\u0002\u001a\u0006\bþ\u0002\u0010ÿ\u0002\"\u0006\b\u0080\u0003\u0010\u0099\u0001R\u0019\u0010\u0082\u0003\u001a\u00020w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0003\u0010×\u0002R\u0019\u0010\u0083\u0003\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0003\u0010\u0084\u0003R\u001a\u0010\u0086\u0003\u001a\u00030\u0085\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0003\u0010\u0087\u0003R\u001c\u0010\u0089\u0003\u001a\u0005\u0018\u00010\u0088\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0003\u0010\u008a\u0003R\u001b\u0010\u008b\u0003\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0003\u0010\u008c\u0003R'\u0010\u008e\u0003\u001a\u0010\u0012\u0004\u0012\u00020D\u0012\u0005\u0012\u00030\u008d\u00030ú\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0003\u0010ü\u0002R\u0017\u0010\u008f\u0003\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0003\u0010\u0090\u0003R)\u0010\u0094\u0003\u001a\u00020w2\u0007\u0010\u0091\u0003\u001a\u00020w8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0092\u0003\u0010Ó\u0002\"\u0005\b\u0093\u0003\u0010zR5\u0010\u009c\u0003\u001a\u00030\u0095\u00032\b\u0010¸\u0002\u001a\u00030\u0095\u00038F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u0096\u0003\u0010\u0097\u0003\"\u0006\b\u0098\u0003\u0010\u0099\u0003*\u0006\b\u009a\u0003\u0010\u009b\u0003R5\u0010£\u0003\u001a\u00030\u009d\u00032\b\u0010¸\u0002\u001a\u00030\u009d\u00038F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u009e\u0003\u0010\u009f\u0003\"\u0006\b \u0003\u0010¡\u0003*\u0006\b¢\u0003\u0010\u009b\u0003R5\u0010ª\u0003\u001a\u00030¤\u00032\b\u0010¸\u0002\u001a\u00030¤\u00038F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¥\u0003\u0010¦\u0003\"\u0006\b§\u0003\u0010¨\u0003*\u0006\b©\u0003\u0010\u009b\u0003R5\u0010±\u0003\u001a\u00030«\u00032\b\u0010¸\u0002\u001a\u00030«\u00038F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¬\u0003\u0010\u00ad\u0003\"\u0006\b®\u0003\u0010¯\u0003*\u0006\b°\u0003\u0010\u009b\u0003R5\u0010µ\u0003\u001a\u00030¤\u00032\b\u0010¸\u0002\u001a\u00030¤\u00038F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b²\u0003\u0010¦\u0003\"\u0006\b³\u0003\u0010¨\u0003*\u0006\b´\u0003\u0010\u009b\u0003R5\u0010¹\u0003\u001a\u00030«\u00032\b\u0010¸\u0002\u001a\u00030«\u00038F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¶\u0003\u0010\u00ad\u0003\"\u0006\b·\u0003\u0010¯\u0003*\u0006\b¸\u0003\u0010\u009b\u0003R,\u0010¼\u0003\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0005\u0012\u00030á\u00010ó\u00028GX\u0087\u0004¢\u0006\u000f\u0012\u0005\b»\u0003\u00102\u001a\u0006\bº\u0003\u0010ö\u0002R\u0017\u0010À\u0003\u001a\u0005\u0018\u00010½\u00038F¢\u0006\b\u001a\u0006\b¾\u0003\u0010¿\u0003R%\u0010Ã\u0003\u001a\t\u0012\u0004\u0012\u00020i0\u0095\u00018GX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÂ\u0003\u00102\u001a\u0006\bÁ\u0003\u0010ÿ\u0002R2\u0010Ç\u0003\u001a\u00020w2\u0007\u0010¸\u0002\u001a\u00020w8@@@X\u0080\u008e\u0002¢\u0006\u0017\u001a\u0006\bÄ\u0003\u0010Ó\u0002\"\u0005\bÅ\u0003\u0010z*\u0006\bÆ\u0003\u0010\u009b\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ì\u0003"}, d2 = {"Lio/livekit/android/room/Room;", "Lio/livekit/android/room/RTCEngine$Listener;", "Lio/livekit/android/room/participant/ParticipantListener;", "Lio/livekit/android/room/rpc/RpcManager;", "Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManager;", "Landroid/content/Context;", "context", "Lio/livekit/android/room/RTCEngine;", "engine", "Llivekit/org/webrtc/EglBase;", "eglBase", "Lio/livekit/android/room/participant/LocalParticipant$Factory;", "localParticipantFactory", "Lio/livekit/android/room/DefaultsManager;", "defaultsManager", "Lfr/z;", "defaultDispatcher", "ioDispatcher", "Lio/livekit/android/audio/AudioHandler;", "audioHandler", "Lio/livekit/android/memory/CloseableManager;", "closeableManager", "Lio/livekit/android/e2ee/E2EEManager$Factory;", "e2EEManagerFactory", "Lio/livekit/android/audio/CommunicationWorkaround;", "communicationWorkaround", "Lio/livekit/android/audio/AudioProcessingController;", "audioProcessingController", "Lio/livekit/android/room/provisions/LKObjects;", "lkObjects", "Lkotlin/Function1;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lio/livekit/android/room/network/NetworkCallbackManager;", "Lio/livekit/android/room/network/NetworkCallbackManagerFactory;", "networkCallbackManagerFactory", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "audioDeviceModule", "Lio/livekit/android/room/RegionUrlProvider$Factory;", "regionUrlProviderFactory", "Lio/livekit/android/room/util/ConnectionWarmer;", "connectionWarmer", "Lio/livekit/android/audio/AudioRecordPrewarmer;", "audioRecordPrewarmer", "incomingDataStreamManager", "Lio/livekit/android/room/participant/RemoteParticipant$Factory;", "remoteParticipantFactory", "<init>", "(Landroid/content/Context;Lio/livekit/android/room/RTCEngine;Llivekit/org/webrtc/EglBase;Lio/livekit/android/room/participant/LocalParticipant$Factory;Lio/livekit/android/room/DefaultsManager;Lfr/z;Lfr/z;Lio/livekit/android/audio/AudioHandler;Lio/livekit/android/memory/CloseableManager;Lio/livekit/android/e2ee/E2EEManager$Factory;Lio/livekit/android/audio/CommunicationWorkaround;Lio/livekit/android/audio/AudioProcessingController;Lio/livekit/android/room/provisions/LKObjects;Lho/l;Llivekit/org/webrtc/audio/AudioDeviceModule;Lio/livekit/android/room/RegionUrlProvider$Factory;Lio/livekit/android/room/util/ConnectionWarmer;Lio/livekit/android/audio/AudioRecordPrewarmer;Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManager;Lio/livekit/android/room/participant/RemoteParticipant$Factory;)V", "Lsn/z;", "clearOpenStreams", "()V", "Llivekit/LivekitModels$DataStream$Chunk;", "chunk", "Las/l7;", "encryptionType", "handleDataChunk", "(Llivekit/LivekitModels$DataStream$Chunk;Las/l7;)V", "Llivekit/LivekitModels$DataStream$Header;", "header", "Lio/livekit/android/room/participant/Participant$Identity;", "fromIdentity", "handleStreamHeader-qaitkU4", "(Llivekit/LivekitModels$DataStream$Header;Ljava/lang/String;Las/l7;)V", "handleStreamHeader", "Llivekit/LivekitModels$DataStream$Trailer;", "trailer", "handleStreamTrailer", "(Llivekit/LivekitModels$DataStream$Trailer;Las/l7;)V", "", "topic", "Lkotlin/Function2;", "Lio/livekit/android/room/datastream/incoming/ByteStreamReceiver;", "Lio/livekit/android/room/datastream/incoming/ByteStreamHandler;", "handler", "registerByteStreamHandler", "(Ljava/lang/String;Lho/p;)V", "Lio/livekit/android/room/datastream/incoming/TextStreamReceiver;", "Lio/livekit/android/room/datastream/incoming/TextStreamHandler;", "registerTextStreamHandler", "unregisterByteStreamHandler", "(Ljava/lang/String;)V", "unregisterTextStreamHandler", "Lio/livekit/android/room/Room$Sid;", "getSid-sxOGYxU", "(Lwn/c;)Ljava/lang/Object;", "getSid", "url", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "prepareConnection", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/ConnectOptions;", "options", "", "connect", "(Ljava/lang/String;Ljava/lang/String;Lio/livekit/android/ConnectOptions;Lwn/c;)Ljava/lang/Object;", "disconnect", "Lio/livekit/android/RoomOptions;", "setRoomOptions", "(Lio/livekit/android/RoomOptions;)V", "release", "Llivekit/LivekitRtc$JoinResponse;", "response", "onJoinResponse", "(Llivekit/LivekitRtc$JoinResponse;)V", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "Lio/livekit/android/room/participant/Participant;", "getParticipantBySid", "(Ljava/lang/String;)Lio/livekit/android/room/participant/Participant;", "Lio/livekit/android/room/participant/Participant$Sid;", "getParticipantBySid-yvz9xIM", "identity", "getParticipantByIdentity", "getParticipantByIdentity-p2YI31Y", "Llivekit/LivekitRtc$SimulateScenario;", "scenario", "sendSimulateScenario", "(Llivekit/LivekitRtc$SimulateScenario;)V", "Lio/livekit/android/room/Room$SimulateScenario;", "(Lio/livekit/android/room/Room$SimulateScenario;)V", "", "muted", "setSpeakerMute", "(Z)V", "setMicrophoneMute", FirebaseAnalytics.Param.METHOD, "Lio/livekit/android/room/participant/RpcInvocationData;", "Lwn/c;", "", "registerRpcMethod", "unregisterRpcMethod", "destinationIdentity", "payload", "Lxq/b;", "responseTimeout", "performRpc-9o0yd6Q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "performRpc", "onEngineConnected", "onEngineReconnected", "onEngineReconnecting", "Llivekit/org/webrtc/RtpReceiver;", "receiver", "Llivekit/org/webrtc/MediaStreamTrack;", "track", "", "Llivekit/org/webrtc/MediaStream;", "streams", "onAddTrack", "(Llivekit/org/webrtc/RtpReceiver;Llivekit/org/webrtc/MediaStreamTrack;[Llivekit/org/webrtc/MediaStream;)V", "", "Llivekit/LivekitModels$ParticipantInfo;", "updates", "onUpdateParticipants", "(Ljava/util/List;)V", "Llivekit/LivekitModels$SpeakerInfo;", "speakers", "onActiveSpeakersUpdate", "trackSid", "onRemoteMuteChanged", "(Ljava/lang/String;Z)V", "Llivekit/LivekitModels$Room;", "update", "onRoomUpdate", "(Llivekit/LivekitModels$Room;)V", "Llivekit/LivekitRtc$ConnectionQualityInfo;", "onConnectionQuality", "onSpeakersChanged", "Llivekit/LivekitModels$UserPacket;", "packet", "Las/c7;", "kind", "onUserPacket", "(Llivekit/LivekitModels$UserPacket;Las/c7;Las/l7;)V", "Llivekit/LivekitModels$DataPacket;", "dp", "onDataStreamPacket", "(Llivekit/LivekitModels$DataPacket;Las/l7;)V", "Llivekit/LivekitModels$Transcription;", "transcription", "onTranscriptionReceived", "(Llivekit/LivekitModels$Transcription;)V", "onRpcPacketReceived", "(Llivekit/LivekitModels$DataPacket;)V", "Llivekit/LivekitRtc$StreamStateInfo;", "streamStates", "onStreamStateUpdate", "Llivekit/LivekitRtc$SubscribedQualityUpdate;", "subscribedQualityUpdate", "onSubscribedQualityUpdate", "(Llivekit/LivekitRtc$SubscribedQualityUpdate;)V", "Llivekit/LivekitRtc$SubscriptionPermissionUpdate;", "subscriptionPermissionUpdate", "onSubscriptionPermissionUpdate", "(Llivekit/LivekitRtc$SubscriptionPermissionUpdate;)V", "Lio/livekit/android/events/DisconnectReason;", "reason", "onEngineDisconnected", "(Lio/livekit/android/events/DisconnectReason;)V", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onFailToConnect", "(Ljava/lang/Throwable;)V", "isResume", "onSignalConnected", "onFullReconnecting", "isFullReconnect", "onPostReconnect", "(ZLwn/c;)Ljava/lang/Object;", "Llivekit/LivekitRtc$TrackSubscribed;", "onLocalTrackSubscribed", "(Llivekit/LivekitRtc$TrackSubscribed;)V", "Llivekit/LivekitRtc$TrackUnpublishedResponse;", "trackUnpublished", "onLocalTrackUnpublished", "(Llivekit/LivekitRtc$TrackUnpublishedResponse;)V", "participant", "prevMetadata", "onMetadataChanged", "(Lio/livekit/android/room/participant/Participant;Ljava/lang/String;)V", "Lio/livekit/android/room/track/TrackPublication;", "publication", "onTrackMuted", "(Lio/livekit/android/room/track/TrackPublication;Lio/livekit/android/room/participant/Participant;)V", "onTrackUnmuted", "Lio/livekit/android/room/track/RemoteTrackPublication;", "Lio/livekit/android/room/participant/RemoteParticipant;", "onTrackUnpublished", "(Lio/livekit/android/room/track/RemoteTrackPublication;Lio/livekit/android/room/participant/RemoteParticipant;)V", "Lio/livekit/android/room/track/LocalTrackPublication;", "Lio/livekit/android/room/participant/LocalParticipant;", "onTrackPublished", "(Lio/livekit/android/room/track/LocalTrackPublication;Lio/livekit/android/room/participant/LocalParticipant;)V", "Lio/livekit/android/room/track/Track;", "onTrackSubscribed", "(Lio/livekit/android/room/track/Track;Lio/livekit/android/room/track/RemoteTrackPublication;Lio/livekit/android/room/participant/RemoteParticipant;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "onTrackSubscriptionFailed", "(Ljava/lang/String;Ljava/lang/Exception;Lio/livekit/android/room/participant/RemoteParticipant;)V", "onTrackUnsubscribed", "Llivekit/org/webrtc/SurfaceViewRenderer;", "viewRenderer", "initVideoRenderer", "(Llivekit/org/webrtc/SurfaceViewRenderer;)V", "Lio/livekit/android/renderer/TextureViewRenderer;", "(Lio/livekit/android/renderer/TextureViewRenderer;)V", "Llivekit/org/webrtc/RTCStatsCollectorCallback;", "callback", "getPublisherRTCStats", "(Llivekit/org/webrtc/RTCStatsCollectorCallback;)V", "getSubscriberRTCStats", "Lio/livekit/android/room/ReconnectType;", "reconnectType", "setReconnectionType", "(Lio/livekit/android/room/ReconnectType;)V", "getCurrentRoomOptions", "()Lio/livekit/android/RoomOptions;", "setupLocalParticipantEventHandling", "handleParticipantDisconnect-p2YI31Y", "handleParticipantDisconnect", ParameterNames.INFO, "getOrCreateRemoteParticipant-tq5M0Po", "(Ljava/lang/String;Llivekit/LivekitModels$ParticipantInfo;)Lio/livekit/android/room/participant/RemoteParticipant;", "getOrCreateRemoteParticipant", "speakerInfos", "handleActiveSpeakersUpdate", "handleSpeakersChanged", SignalClient.CONNECT_QUERY_RECONNECT, "handleDisconnect", "cleanupRoom", "sendSyncState", "Lio/livekit/android/events/RoomEvent;", "event", "emitWhenConnected", "(Lio/livekit/android/events/RoomEvent;Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/livekit/android/room/RTCEngine;", "getEngine$livekit_android_sdk_release", "()Lio/livekit/android/room/RTCEngine;", "Llivekit/org/webrtc/EglBase;", "Lio/livekit/android/room/DefaultsManager;", "Lfr/z;", "Lio/livekit/android/audio/AudioHandler;", "getAudioHandler", "()Lio/livekit/android/audio/AudioHandler;", "Lio/livekit/android/memory/CloseableManager;", "Lio/livekit/android/e2ee/E2EEManager$Factory;", "Lio/livekit/android/audio/CommunicationWorkaround;", "Lio/livekit/android/audio/AudioProcessingController;", "getAudioProcessingController", "()Lio/livekit/android/audio/AudioProcessingController;", "Lio/livekit/android/room/provisions/LKObjects;", "getLkObjects", "()Lio/livekit/android/room/provisions/LKObjects;", "Llivekit/org/webrtc/audio/AudioDeviceModule;", "Lio/livekit/android/room/RegionUrlProvider$Factory;", "Lio/livekit/android/room/util/ConnectionWarmer;", "Lio/livekit/android/audio/AudioRecordPrewarmer;", "Lio/livekit/android/room/datastream/incoming/IncomingDataStreamManager;", "Lio/livekit/android/room/participant/RemoteParticipant$Factory;", "Lfr/d0;", "coroutineScope", "Lfr/d0;", "Lio/livekit/android/events/BroadcastEventBus;", "eventBus", "Lio/livekit/android/events/BroadcastEventBus;", "Lio/livekit/android/events/EventListenable;", "events", "Lio/livekit/android/events/EventListenable;", "getEvents", "()Lio/livekit/android/events/EventListenable;", "<set-?>", "sid$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getSid-CC6JpwI", "()Ljava/lang/String;", "setSid-JVmrIBo", "getSid-CC6JpwI$annotations", "name$delegate", "getName", "setName", "getName$annotations", DiagnosticsEntry.NAME_KEY, "Lio/livekit/android/room/Room$State;", "state$delegate", "getState", "()Lio/livekit/android/room/Room$State;", "setState", "(Lio/livekit/android/room/Room$State;)V", "getState$annotations", RemoteConfigConstants.ResponseFieldKey.STATE, "metadata$delegate", "getMetadata", "setMetadata", "getMetadata$annotations", "metadata", "isRecording$delegate", "isRecording", "()Z", "setRecording", "isRecording$annotations", "enableMetrics", "Z", "getEnableMetrics", "setEnableMetrics", "getEnableMetrics$annotations", "Lio/livekit/android/e2ee/E2EEManager;", "e2eeManager", "Lio/livekit/android/e2ee/E2EEManager;", "getE2eeManager", "()Lio/livekit/android/e2ee/E2EEManager;", "setE2eeManager", "(Lio/livekit/android/e2ee/E2EEManager;)V", "adaptiveStream", "getAdaptiveStream", "setAdaptiveStream", "audioProcessorIsEnabled", "getAudioProcessorIsEnabled", "setAudioProcessorIsEnabled", "Lio/livekit/android/e2ee/E2EEOptions;", "e2eeOptions", "Lio/livekit/android/e2ee/E2EEOptions;", "getE2eeOptions", "()Lio/livekit/android/e2ee/E2EEOptions;", "setE2eeOptions", "(Lio/livekit/android/e2ee/E2EEOptions;)V", "localParticipant", "Lio/livekit/android/room/participant/LocalParticipant;", "getLocalParticipant", "()Lio/livekit/android/room/participant/LocalParticipant;", "", "mutableRemoteParticipants$delegate", "getMutableRemoteParticipants", "()Ljava/util/Map;", "setMutableRemoteParticipants", "(Ljava/util/Map;)V", "mutableRemoteParticipants", "", "sidToIdentity", "Ljava/util/Map;", "mutableActiveSpeakers$delegate", "getMutableActiveSpeakers", "()Ljava/util/List;", "setMutableActiveSpeakers", "mutableActiveSpeakers", "hasLostConnectivity", "connectOptions", "Lio/livekit/android/ConnectOptions;", "Lor/a;", "stateLock", "Lor/a;", "Lio/livekit/android/room/RegionUrlProvider;", "regionUrlProvider", "Lio/livekit/android/room/RegionUrlProvider;", "regionUrl", "Ljava/lang/String;", "", "transcriptionReceivedTimes", "networkCallbackManager", "Lio/livekit/android/room/network/NetworkCallbackManager;", "value", "getDynacast", "setDynacast", "dynacast", "Lio/livekit/android/room/track/LocalAudioTrackOptions;", "getAudioTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalAudioTrackOptions;", "setAudioTrackCaptureDefaults", "(Lio/livekit/android/room/track/LocalAudioTrackOptions;)V", "getAudioTrackCaptureDefaults$delegate", "(Lio/livekit/android/room/Room;)Ljava/lang/Object;", "audioTrackCaptureDefaults", "Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "getAudioTrackPublishDefaults", "()Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "setAudioTrackPublishDefaults", "(Lio/livekit/android/room/participant/AudioTrackPublishDefaults;)V", "getAudioTrackPublishDefaults$delegate", "audioTrackPublishDefaults", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "getVideoTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalVideoTrackOptions;", "setVideoTrackCaptureDefaults", "(Lio/livekit/android/room/track/LocalVideoTrackOptions;)V", "getVideoTrackCaptureDefaults$delegate", "videoTrackCaptureDefaults", "Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "getVideoTrackPublishDefaults", "()Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "setVideoTrackPublishDefaults", "(Lio/livekit/android/room/participant/VideoTrackPublishDefaults;)V", "getVideoTrackPublishDefaults$delegate", "videoTrackPublishDefaults", "getScreenShareTrackCaptureDefaults", "setScreenShareTrackCaptureDefaults", "getScreenShareTrackCaptureDefaults$delegate", "screenShareTrackCaptureDefaults", "getScreenShareTrackPublishDefaults", "setScreenShareTrackPublishDefaults", "getScreenShareTrackPublishDefaults$delegate", "screenShareTrackPublishDefaults", "getRemoteParticipants", "getRemoteParticipants$annotations", "remoteParticipants", "Lio/livekit/android/audio/AudioSwitchHandler;", "getAudioSwitchHandler", "()Lio/livekit/android/audio/AudioSwitchHandler;", "audioSwitchHandler", "getActiveSpeakers", "getActiveSpeakers$annotations", "activeSpeakers", "isPrerecording$livekit_android_sdk_release", "setPrerecording$livekit_android_sdk_release", "isPrerecording$livekit_android_sdk_release$delegate", "isPrerecording", "Factory", "Sid", "SimulateScenario", "State", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class Room implements RTCEngine.Listener, ParticipantListener, RpcManager, IncomingDataStreamManager {
    static final /* synthetic */ u[] $$delegatedProperties;
    private boolean adaptiveStream;
    private final AudioDeviceModule audioDeviceModule;
    private final AudioHandler audioHandler;
    private final AudioProcessingController audioProcessingController;
    private boolean audioProcessorIsEnabled;
    private final AudioRecordPrewarmer audioRecordPrewarmer;
    private final CloseableManager closeableManager;
    private final CommunicationWorkaround communicationWorkaround;
    private ConnectOptions connectOptions;
    private final ConnectionWarmer connectionWarmer;
    private final Context context;
    private d0 coroutineScope;
    private final z defaultDispatcher;
    private final DefaultsManager defaultsManager;
    private final E2EEManager.Factory e2EEManagerFactory;
    private E2EEManager e2eeManager;
    private E2EEOptions e2eeOptions;
    private final EglBase eglBase;
    private boolean enableMetrics;
    private final RTCEngine engine;
    private final BroadcastEventBus<RoomEvent> eventBus;
    private final EventListenable<RoomEvent> events;
    private boolean hasLostConnectivity;
    private final IncomingDataStreamManager incomingDataStreamManager;
    private final z ioDispatcher;

    /* renamed from: isRecording$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate isRecording;
    private final LKObjects lkObjects;
    private final LocalParticipant localParticipant;

    /* renamed from: metadata$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate metadata;

    /* renamed from: mutableActiveSpeakers$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate mutableActiveSpeakers;

    /* renamed from: mutableRemoteParticipants$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate mutableRemoteParticipants;

    /* renamed from: name$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate name;
    private final NetworkCallbackManager networkCallbackManager;
    private String regionUrl;
    private RegionUrlProvider regionUrlProvider;
    private final RegionUrlProvider.Factory regionUrlProviderFactory;
    private final RemoteParticipant.Factory remoteParticipantFactory;

    /* renamed from: sid$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate sid;
    private Map<Participant.Sid, Participant.Identity> sidToIdentity;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate state;
    private a stateLock;
    private Map<String, Long> transcriptionReceivedTimes;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/Room$Factory;", "", "create", "Lio/livekit/android/room/Room;", "context", "Landroid/content/Context;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        Room create(Context context);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/livekit/android/room/Room$SimulateScenario;", "", "(Ljava/lang/String;I)V", "SPEAKER_UPDATE", "NODE_FAILURE", "MIGRATION", "SERVER_LEAVE", "SERVER_LEAVE_FULL_RECONNECT", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class SimulateScenario {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ SimulateScenario[] $VALUES;
        public static final SimulateScenario SPEAKER_UPDATE = new SimulateScenario("SPEAKER_UPDATE", 0);
        public static final SimulateScenario NODE_FAILURE = new SimulateScenario("NODE_FAILURE", 1);
        public static final SimulateScenario MIGRATION = new SimulateScenario("MIGRATION", 2);
        public static final SimulateScenario SERVER_LEAVE = new SimulateScenario("SERVER_LEAVE", 3);
        public static final SimulateScenario SERVER_LEAVE_FULL_RECONNECT = new SimulateScenario("SERVER_LEAVE_FULL_RECONNECT", 4);

        private static final /* synthetic */ SimulateScenario[] $values() {
            return new SimulateScenario[]{SPEAKER_UPDATE, NODE_FAILURE, MIGRATION, SERVER_LEAVE, SERVER_LEAVE_FULL_RECONNECT};
        }

        static {
            SimulateScenario[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private SimulateScenario(String str, int i10) {
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static SimulateScenario valueOf(String str) {
            return (SimulateScenario) Enum.valueOf(SimulateScenario.class, str);
        }

        public static SimulateScenario[] values() {
            return (SimulateScenario[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/Room$State;", "", "(Ljava/lang/String;I)V", "CONNECTING", "CONNECTED", "DISCONNECTED", "RECONNECTING", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class State {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CONNECTING = new State("CONNECTING", 0);
        public static final State CONNECTED = new State("CONNECTED", 1);
        public static final State DISCONNECTED = new State("DISCONNECTED", 2);
        public static final State RECONNECTING = new State("RECONNECTING", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{CONNECTING, CONNECTED, DISCONNECTED, RECONNECTING};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private State(String str, int i10) {
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
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SimulateScenario.values().length];
            try {
                iArr[SimulateScenario.SPEAKER_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SimulateScenario.NODE_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SimulateScenario.MIGRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SimulateScenario.SERVER_LEAVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SimulateScenario.SERVER_LEAVE_FULL_RECONNECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[d7.values().length];
            try {
                iArr2[9] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[10] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[11] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        q qVar = new q(Room.class, SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "getSid-CC6JpwI()Ljava/lang/String;", 0);
        f0 f0Var = e0.f20562a;
        $$delegatedProperties = new u[]{f0Var.e(qVar), n.l(Room.class, DiagnosticsEntry.NAME_KEY, "getName()Ljava/lang/String;", 0, f0Var), n.l(Room.class, RemoteConfigConstants.ResponseFieldKey.STATE, "getState()Lio/livekit/android/room/Room$State;", 0, f0Var), n.l(Room.class, "metadata", "getMetadata()Ljava/lang/String;", 0, f0Var), n.l(Room.class, "isRecording", "isRecording()Z", 0, f0Var), n.l(Room.class, "mutableRemoteParticipants", "getMutableRemoteParticipants()Ljava/util/Map;", 0, f0Var), n.l(Room.class, "mutableActiveSpeakers", "getMutableActiveSpeakers()Ljava/util/List;", 0, f0Var)};
    }

    public Room(Context context, RTCEngine rTCEngine, EglBase eglBase, LocalParticipant.Factory factory, DefaultsManager defaultsManager, z zVar, z zVar2, AudioHandler audioHandler, CloseableManager closeableManager, E2EEManager.Factory factory2, CommunicationWorkaround communicationWorkaround, AudioProcessingController audioProcessingController, LKObjects lKObjects, l lVar, AudioDeviceModule audioDeviceModule, RegionUrlProvider.Factory factory3, ConnectionWarmer connectionWarmer, AudioRecordPrewarmer audioRecordPrewarmer, IncomingDataStreamManager incomingDataStreamManager, RemoteParticipant.Factory factory4) {
        context.getClass();
        rTCEngine.getClass();
        eglBase.getClass();
        factory.getClass();
        defaultsManager.getClass();
        zVar.getClass();
        zVar2.getClass();
        audioHandler.getClass();
        closeableManager.getClass();
        factory2.getClass();
        communicationWorkaround.getClass();
        audioProcessingController.getClass();
        lKObjects.getClass();
        lVar.getClass();
        audioDeviceModule.getClass();
        factory3.getClass();
        connectionWarmer.getClass();
        audioRecordPrewarmer.getClass();
        incomingDataStreamManager.getClass();
        factory4.getClass();
        this.context = context;
        this.engine = rTCEngine;
        this.eglBase = eglBase;
        this.defaultsManager = defaultsManager;
        this.defaultDispatcher = zVar;
        this.ioDispatcher = zVar2;
        this.audioHandler = audioHandler;
        this.closeableManager = closeableManager;
        this.e2EEManagerFactory = factory2;
        this.communicationWorkaround = communicationWorkaround;
        this.audioProcessingController = audioProcessingController;
        this.lkObjects = lKObjects;
        this.audioDeviceModule = audioDeviceModule;
        this.regionUrlProviderFactory = factory3;
        this.connectionWarmer = connectionWarmer;
        this.audioRecordPrewarmer = audioRecordPrewarmer;
        this.incomingDataStreamManager = incomingDataStreamManager;
        this.remoteParticipantFactory = factory4;
        BroadcastEventBus<RoomEvent> broadcastEventBus = new BroadcastEventBus<>();
        this.eventBus = broadcastEventBus;
        this.events = broadcastEventBus.readOnly();
        rTCEngine.setListener$livekit_android_sdk_release(this);
        this.sid = FlowDelegateKt.flowDelegate$default(null, null, 2, null);
        this.name = FlowDelegateKt.flowDelegate$default(null, null, 2, null);
        this.state = FlowDelegateKt.flowDelegate(State.DISCONNECTED, new Room$state$2(this));
        this.metadata = FlowDelegateKt.flowDelegate$default(null, null, 2, null);
        this.isRecording = FlowDelegateKt.flowDelegate$default(Boolean.FALSE, null, 2, null);
        this.enableMetrics = true;
        LocalParticipant create = factory.create(false);
        create.setInternalListener(this);
        this.localParticipant = create;
        this.mutableRemoteParticipants = FlowDelegateKt.flowDelegate$default(tn.u.f33548a, null, 2, null);
        this.sidToIdentity = new LinkedHashMap();
        this.mutableActiveSpeakers = FlowDelegateKt.flowDelegate$default(t.f33547a, null, 2, null);
        this.connectOptions = new ConnectOptions(false, null, null, false, false, null, 63, null);
        this.stateLock = d.a();
        this.transcriptionReceivedTimes = new LinkedHashMap();
        this.networkCallbackManager = (NetworkCallbackManager) lVar.invoke(new ConnectivityManager.NetworkCallback() { // from class: io.livekit.android.room.Room$networkCallbackManager$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                boolean z6;
                network.getClass();
                z6 = Room.this.hasLostConnectivity;
                if (!z6) {
                    return;
                }
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                    et.d.c(null, "network connection available, reconnecting", new Object[0]);
                }
                Room.this.reconnect();
                Room.this.hasLostConnectivity = false;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                network.getClass();
                Room.this.hasLostConnectivity = true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupRoom() {
        E2EEManager e2EEManager = this.e2eeManager;
        if (e2EEManager != null) {
            e2EEManager.dispose$livekit_android_sdk_release();
        }
        this.e2eeManager = null;
        this.localParticipant.cleanup();
        Iterator it = o.k1(getRemoteParticipants().keySet()).iterator();
        while (it.hasNext()) {
            m2533handleParticipantDisconnectp2YI31Y(((Participant.Identity) it.next()).m2610unboximpl());
        }
        m2534setSidJVmrIBo(null);
        setMetadata(null);
        setName(null);
        setRecording(false);
        this.sidToIdentity.clear();
        this.incomingDataStreamManager.clearOpenStreams();
    }

    public static /* synthetic */ Object connect$default(Room room, String str, String str2, ConnectOptions connectOptions, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            connectOptions = new ConnectOptions(false, null, null, false, false, null, 63, null);
        }
        return room.connect(str, str2, connectOptions, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitWhenConnected(RoomEvent roomEvent, c<? super sn.z> cVar) {
        Object postEvent;
        State state = getState();
        State state2 = State.CONNECTED;
        sn.z zVar = sn.z.f31622a;
        if (state == state2 && (postEvent = this.eventBus.postEvent((BroadcastEventBus<RoomEvent>) roomEvent, cVar)) == xn.a.f37986a) {
            return postEvent;
        }
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoomOptions getCurrentRoomOptions() {
        return new RoomOptions(this.adaptiveStream, getDynacast(), this.e2eeOptions, getAudioTrackCaptureDefaults(), getVideoTrackCaptureDefaults(), getAudioTrackPublishDefaults(), getVideoTrackPublishDefaults(), getScreenShareTrackCaptureDefaults(), getScreenShareTrackPublishDefaults());
    }

    private final List<Participant> getMutableActiveSpeakers() {
        return (List) this.mutableActiveSpeakers.getValue(this, $$delegatedProperties[6]);
    }

    private final Map<Participant.Identity, RemoteParticipant> getMutableRemoteParticipants() {
        return (Map) this.mutableRemoteParticipants.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* renamed from: getOrCreateRemoteParticipant-tq5M0Po, reason: not valid java name */
    private final synchronized RemoteParticipant m2531getOrCreateRemoteParticipanttq5M0Po(String identity, LivekitModels$ParticipantInfo info) {
        ?? obj = new Object();
        RemoteParticipant remoteParticipant = getRemoteParticipants().get(Participant.Identity.m2604boximpl(identity));
        obj.f20559a = remoteParticipant;
        if (remoteParticipant != null) {
            return remoteParticipant;
        }
        RemoteParticipant create = this.remoteParticipantFactory.create(info);
        obj.f20559a = create;
        create.setInternalListener(this);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            g0.D(d0Var, null, null, new Room$getOrCreateRemoteParticipant$1(obj, this, null), 3);
            ((RemoteParticipant) obj.f20559a).updateFromInfo(info);
            LinkedHashMap T = a0.T(getMutableRemoteParticipants());
            T.put(Participant.Identity.m2604boximpl(identity), obj.f20559a);
            setMutableRemoteParticipants(T);
            this.sidToIdentity.put(Participant.Sid.m2611boximpl(((RemoteParticipant) obj.f20559a).getSid()), Participant.Identity.m2604boximpl(identity));
            return (RemoteParticipant) obj.f20559a;
        }
        m.i("coroutineScope");
        throw null;
    }

    private final void handleActiveSpeakersUpdate(List<LivekitModels$SpeakerInfo> speakerInfos) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LocalParticipant localParticipant = this.localParticipant;
        for (LivekitModels$SpeakerInfo livekitModels$SpeakerInfo : speakerInfos) {
            String sid = livekitModels$SpeakerInfo.getSid();
            sid.getClass();
            String m2612constructorimpl = Participant.Sid.m2612constructorimpl(sid);
            linkedHashSet.add(Participant.Sid.m2611boximpl(m2612constructorimpl));
            Participant m2536getParticipantBySidyvz9xIM = m2536getParticipantBySidyvz9xIM(m2612constructorimpl);
            if (m2536getParticipantBySidyvz9xIM != null) {
                m2536getParticipantBySidyvz9xIM.setAudioLevel(livekitModels$SpeakerInfo.getLevel());
                m2536getParticipantBySidyvz9xIM.setSpeaking(true);
                arrayList.add(m2536getParticipantBySidyvz9xIM);
            }
        }
        if (!linkedHashSet.contains(Participant.Sid.m2611boximpl(localParticipant.getSid()))) {
            localParticipant.setAudioLevel(t2.u.P);
            localParticipant.setSpeaking(false);
        }
        Collection<RemoteParticipant> values = getRemoteParticipants().values();
        ArrayList<RemoteParticipant> arrayList2 = new ArrayList();
        for (Object obj : values) {
            if (!linkedHashSet.contains(Participant.Sid.m2611boximpl(((RemoteParticipant) obj).getSid()))) {
                arrayList2.add(obj);
            }
        }
        for (RemoteParticipant remoteParticipant : arrayList2) {
            remoteParticipant.setAudioLevel(t2.u.P);
            remoteParticipant.setSpeaking(false);
        }
        setMutableActiveSpeakers(o.g1(arrayList));
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.ActiveSpeakersChanged activeSpeakersChanged = new RoomEvent.ActiveSpeakersChanged(this, getMutableActiveSpeakers());
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) activeSpeakersChanged, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    private final void handleDisconnect(DisconnectReason reason) {
        if (getState() != State.DISCONNECTED) {
            g0.I(i.f37087a, new Room$handleDisconnect$1(this, reason, null));
        }
    }

    /* renamed from: handleParticipantDisconnect-p2YI31Y, reason: not valid java name */
    private final void m2533handleParticipantDisconnectp2YI31Y(String identity) {
        LinkedHashMap T = a0.T(getMutableRemoteParticipants());
        RemoteParticipant remove = T.remove(Participant.Identity.m2604boximpl(identity));
        if (remove == null) {
            return;
        }
        Iterator it = o.g1(remove.getTrackPublications().values()).iterator();
        while (it.hasNext()) {
            remove.unpublishTrack(((TrackPublication) it.next()).getSid(), true);
        }
        setMutableRemoteParticipants(T);
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.ParticipantDisconnected participantDisconnected = new RoomEvent.ParticipantDisconnected(this, remove);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) participantDisconnected, d0Var);
            this.localParticipant.m2591handleParticipantDisconnectp2YI31Y$livekit_android_sdk_release(identity);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    private final void handleSpeakersChanged(List<LivekitModels$SpeakerInfo> speakerInfos) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Participant participant : getActiveSpeakers()) {
            linkedHashMap.put(Participant.Sid.m2611boximpl(participant.getSid()), participant);
        }
        for (LivekitModels$SpeakerInfo livekitModels$SpeakerInfo : speakerInfos) {
            String sid = livekitModels$SpeakerInfo.getSid();
            sid.getClass();
            String m2612constructorimpl = Participant.Sid.m2612constructorimpl(sid);
            Participant m2536getParticipantBySidyvz9xIM = m2536getParticipantBySidyvz9xIM(m2612constructorimpl);
            if (m2536getParticipantBySidyvz9xIM != null) {
                m2536getParticipantBySidyvz9xIM.setAudioLevel(livekitModels$SpeakerInfo.getLevel());
                m2536getParticipantBySidyvz9xIM.setSpeaking(livekitModels$SpeakerInfo.getActive());
                if (livekitModels$SpeakerInfo.getActive()) {
                    linkedHashMap.put(Participant.Sid.m2611boximpl(m2612constructorimpl), m2536getParticipantBySidyvz9xIM);
                } else {
                    linkedHashMap.remove(Participant.Sid.m2611boximpl(m2612constructorimpl));
                }
            }
        }
        setMutableActiveSpeakers(o.g1(o.a1(new Comparator() { // from class: io.livekit.android.room.Room$handleSpeakersChanged$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.g(Float.valueOf(((Participant) t10).getAudioLevel()), Float.valueOf(((Participant) t11).getAudioLevel()));
            }
        }, o.g1(linkedHashMap.values()))));
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.ActiveSpeakersChanged activeSpeakersChanged = new RoomEvent.ActiveSpeakersChanged(this, getMutableActiveSpeakers());
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) activeSpeakersChanged, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    public static /* synthetic */ Object prepareConnection$default(Room room, String str, String str2, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return room.prepareConnection(str, str2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reconnect() {
        if (getState() == State.RECONNECTING) {
            return;
        }
        this.engine.reconnect();
    }

    private final void sendSyncState() {
        RemoteTrackPublication remoteTrackPublication;
        boolean autoSubscribe = this.connectOptions.getAutoSubscribe();
        ArrayList arrayList = new ArrayList();
        for (RemoteParticipant remoteParticipant : getRemoteParticipants().values()) {
            w7 newBuilder = LivekitModels$ParticipantTracks.newBuilder();
            newBuilder.d(remoteParticipant.getSid());
            for (TrackPublication trackPublication : remoteParticipant.getTrackPublications().values()) {
                if (trackPublication instanceof RemoteTrackPublication) {
                    remoteTrackPublication = (RemoteTrackPublication) trackPublication;
                } else {
                    remoteTrackPublication = null;
                }
                if (remoteTrackPublication != null && remoteTrackPublication.getSubscribed() != autoSubscribe) {
                    newBuilder.b(remoteTrackPublication.getSid());
                }
            }
            if (newBuilder.c() > 0) {
                a3 build = newBuilder.build();
                build.getClass();
                arrayList.add(build);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LivekitModels$ParticipantTracks) it.next()).getTrackSidsList());
        }
        ArrayList b02 = p.b0(arrayList2);
        zd newBuilder2 = LivekitRtc$UpdateSubscription.newBuilder();
        newBuilder2.d(!autoSubscribe);
        newBuilder2.b(arrayList);
        newBuilder2.c(b02);
        LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription = (LivekitRtc$UpdateSubscription) newBuilder2.build();
        List<LivekitRtc$TrackPublishedResponse> publishTracksInfo = LocalParticipantKt.publishTracksInfo(this.localParticipant);
        RTCEngine rTCEngine = this.engine;
        livekitRtc$UpdateSubscription.getClass();
        rTCEngine.sendSyncState(livekitRtc$UpdateSubscription, publishTracksInfo);
    }

    private final void setMetadata(String str) {
        this.metadata.setValue(this, $$delegatedProperties[3], str);
    }

    private final void setMutableActiveSpeakers(List<? extends Participant> list) {
        this.mutableActiveSpeakers.setValue(this, $$delegatedProperties[6], list);
    }

    private final void setMutableRemoteParticipants(Map<Participant.Identity, RemoteParticipant> map) {
        this.mutableRemoteParticipants.setValue(this, $$delegatedProperties[5], map);
    }

    private final void setName(String str) {
        this.name.setValue(this, $$delegatedProperties[1], str);
    }

    private final void setRecording(boolean z6) {
        this.isRecording.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSid-JVmrIBo, reason: not valid java name */
    public final void m2534setSidJVmrIBo(String str) {
        Sid sid;
        MutableStateFlowDelegate mutableStateFlowDelegate = this.sid;
        u uVar = $$delegatedProperties[0];
        if (str != null) {
            sid = Sid.m2543boximpl(str);
        } else {
            sid = null;
        }
        mutableStateFlowDelegate.setValue(this, uVar, sid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(State state) {
        this.state.setValue(this, $$delegatedProperties[2], state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupLocalParticipantEventHandling() {
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            g0.D(d0Var, null, null, new Room$setupLocalParticipantEventHandling$1(this, null), 3);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void clearOpenStreams() {
        this.incomingDataStreamManager.clearOpenStreams();
    }

    public final Object connect(String str, String str2, ConnectOptions connectOptions, c cVar) {
        return g0.l(new Room$connect$2(this, connectOptions, str, str2, null), cVar);
    }

    public final void disconnect() {
        if (getState() == State.DISCONNECTED) {
            return;
        }
        this.engine.getClient().sendLeave();
        handleDisconnect(DisconnectReason.CLIENT_INITIATED);
    }

    public final List<Participant> getActiveSpeakers() {
        return getMutableActiveSpeakers();
    }

    public final boolean getAdaptiveStream() {
        return this.adaptiveStream;
    }

    public final AudioHandler getAudioHandler() {
        return this.audioHandler;
    }

    public final AudioProcessingController getAudioProcessingController() {
        return this.audioProcessingController;
    }

    public final boolean getAudioProcessorIsEnabled() {
        return this.audioProcessorIsEnabled;
    }

    public final AudioSwitchHandler getAudioSwitchHandler() {
        AudioHandler audioHandler = this.audioHandler;
        if (audioHandler instanceof AudioSwitchHandler) {
            return (AudioSwitchHandler) audioHandler;
        }
        return null;
    }

    public final LocalAudioTrackOptions getAudioTrackCaptureDefaults() {
        return this.defaultsManager.getAudioTrackCaptureDefaults();
    }

    public final AudioTrackPublishDefaults getAudioTrackPublishDefaults() {
        return this.defaultsManager.getAudioTrackPublishDefaults();
    }

    public final boolean getDynacast() {
        return this.localParticipant.getDynacast();
    }

    public final E2EEManager getE2eeManager() {
        return this.e2eeManager;
    }

    public final E2EEOptions getE2eeOptions() {
        return this.e2eeOptions;
    }

    public final boolean getEnableMetrics() {
        return this.enableMetrics;
    }

    /* renamed from: getEngine$livekit_android_sdk_release, reason: from getter */
    public final RTCEngine getEngine() {
        return this.engine;
    }

    public final EventListenable<RoomEvent> getEvents() {
        return this.events;
    }

    public final LKObjects getLkObjects() {
        return this.lkObjects;
    }

    public final LocalParticipant getLocalParticipant() {
        return this.localParticipant;
    }

    public final String getMetadata() {
        return (String) this.metadata.getValue(this, $$delegatedProperties[3]);
    }

    public final String getName() {
        return (String) this.name.getValue(this, $$delegatedProperties[1]);
    }

    public final Participant getParticipantByIdentity(String identity) {
        identity.getClass();
        return m2535getParticipantByIdentityp2YI31Y(Participant.Identity.m2605constructorimpl(identity));
    }

    /* renamed from: getParticipantByIdentity-p2YI31Y, reason: not valid java name */
    public final Participant m2535getParticipantByIdentityp2YI31Y(String identity) {
        boolean m2607equalsimpl0;
        identity.getClass();
        String m2596getIdentity4WamZwg = this.localParticipant.m2596getIdentity4WamZwg();
        if (m2596getIdentity4WamZwg == null) {
            m2607equalsimpl0 = false;
        } else {
            m2607equalsimpl0 = Participant.Identity.m2607equalsimpl0(identity, m2596getIdentity4WamZwg);
        }
        if (m2607equalsimpl0) {
            return this.localParticipant;
        }
        return getRemoteParticipants().get(Participant.Identity.m2604boximpl(identity));
    }

    public final Participant getParticipantBySid(String sid) {
        sid.getClass();
        return m2536getParticipantBySidyvz9xIM(Participant.Sid.m2612constructorimpl(sid));
    }

    /* renamed from: getParticipantBySid-yvz9xIM, reason: not valid java name */
    public final Participant m2536getParticipantBySidyvz9xIM(String sid) {
        sid.getClass();
        if (Participant.Sid.m2614equalsimpl0(sid, this.localParticipant.getSid())) {
            return this.localParticipant;
        }
        return getRemoteParticipants().get(this.sidToIdentity.get(Participant.Sid.m2611boximpl(sid)));
    }

    public final void getPublisherRTCStats(RTCStatsCollectorCallback callback) {
        callback.getClass();
        this.engine.getPublisherRTCStats(callback);
    }

    public final Map<Participant.Identity, RemoteParticipant> getRemoteParticipants() {
        return getMutableRemoteParticipants();
    }

    public final LocalVideoTrackOptions getScreenShareTrackCaptureDefaults() {
        return this.defaultsManager.getScreenShareTrackCaptureDefaults();
    }

    public final VideoTrackPublishDefaults getScreenShareTrackPublishDefaults() {
        return this.defaultsManager.getScreenShareTrackPublishDefaults();
    }

    /* renamed from: getSid-CC6JpwI, reason: not valid java name */
    public final String m2537getSidCC6JpwI() {
        Sid sid = (Sid) this.sid.getValue(this, $$delegatedProperties[0]);
        if (sid != null) {
            return sid.m2549unboximpl();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: getSid-sxOGYxU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2538getSidsxOGYxU(c<? super Sid> cVar) {
        Room$getSid$1 room$getSid$1;
        int i10;
        if (cVar instanceof Room$getSid$1) {
            room$getSid$1 = (Room$getSid$1) cVar;
            int i11 = room$getSid$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                room$getSid$1.label = i11 - Integer.MIN_VALUE;
                Object obj = room$getSid$1.result;
                i10 = room$getSid$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    a1 a1Var = new a1(FlowDelegateKt.getFlow(new kotlin.jvm.internal.p(this) { // from class: io.livekit.android.room.Room$getSid$2
                        @Override // kotlin.jvm.internal.p, oo.r
                        public Object get() {
                            String m2537getSidCC6JpwI = ((Room) this.receiver).m2537getSidCC6JpwI();
                            if (m2537getSidCC6JpwI != null) {
                                return Room.Sid.m2543boximpl(m2537getSidCC6JpwI);
                            }
                            return null;
                        }

                        public void set(Object obj2) {
                            String str;
                            Room room = (Room) this.receiver;
                            Room.Sid sid = (Room.Sid) obj2;
                            if (sid != null) {
                                str = sid.m2549unboximpl();
                            } else {
                                str = null;
                            }
                            room.m2534setSidJVmrIBo(str);
                        }
                    }), 0);
                    room$getSid$1.label = 1;
                    obj = r.u(a1Var, room$getSid$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ((Sid) obj).m2549unboximpl();
            }
        }
        room$getSid$1 = new Room$getSid$1(this, cVar);
        Object obj2 = room$getSid$1.result;
        i10 = room$getSid$1.label;
        if (i10 == 0) {
        }
        return ((Sid) obj2).m2549unboximpl();
    }

    public final State getState() {
        return (State) this.state.getValue(this, $$delegatedProperties[2]);
    }

    public final void getSubscriberRTCStats(RTCStatsCollectorCallback callback) {
        callback.getClass();
        this.engine.getSubscriberRTCStats(callback);
    }

    public final LocalVideoTrackOptions getVideoTrackCaptureDefaults() {
        return this.defaultsManager.getVideoTrackCaptureDefaults();
    }

    public final VideoTrackPublishDefaults getVideoTrackPublishDefaults() {
        return this.defaultsManager.getVideoTrackPublishDefaults();
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void handleDataChunk(LivekitModels$DataStream.Chunk chunk, l7 encryptionType) {
        chunk.getClass();
        encryptionType.getClass();
        this.incomingDataStreamManager.handleDataChunk(chunk, encryptionType);
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    /* renamed from: handleStreamHeader-qaitkU4, reason: not valid java name */
    public void mo2539handleStreamHeaderqaitkU4(LivekitModels$DataStream.Header header, String fromIdentity, l7 encryptionType) {
        header.getClass();
        fromIdentity.getClass();
        encryptionType.getClass();
        this.incomingDataStreamManager.mo2539handleStreamHeaderqaitkU4(header, fromIdentity, encryptionType);
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void handleStreamTrailer(LivekitModels$DataStream.Trailer trailer, l7 encryptionType) {
        trailer.getClass();
        encryptionType.getClass();
        this.incomingDataStreamManager.handleStreamTrailer(trailer, encryptionType);
    }

    public final void initVideoRenderer(TextureViewRenderer viewRenderer) {
        viewRenderer.getClass();
        TextureViewRenderer.init$default(viewRenderer, this.eglBase.getEglBaseContext(), null, null, null, 12, null);
        viewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        viewRenderer.setEnableHardwareScaler(false);
    }

    public final boolean isPrerecording$livekit_android_sdk_release() {
        return this.defaultsManager.getIsPrerecording();
    }

    public final boolean isRecording() {
        return ((Boolean) this.isRecording.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onActiveSpeakersUpdate(List<LivekitModels$SpeakerInfo> speakers) {
        speakers.getClass();
        handleActiveSpeakersUpdate(speakers);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onAddTrack(RtpReceiver receiver, MediaStreamTrack track, MediaStream[] streams) {
        String str;
        RemoteParticipant remoteParticipant;
        receiver.getClass();
        track.getClass();
        streams.getClass();
        if (streams.length < 0) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.c(null, "add track with empty streams?", new Object[0]);
                return;
            }
            return;
        }
        String id2 = ((MediaStream) tn.n.G0(streams)).getId();
        id2.getClass();
        k unpackStreamId = RoomKt.unpackStreamId(id2);
        Object obj = unpackStreamId.f31600a;
        String str2 = (String) unpackStreamId.f31601b;
        String id3 = track.id();
        if (str2 != null && wq.u.W(str2, "TR", false)) {
            str = str2;
        } else {
            str = id3;
        }
        String str3 = (String) obj;
        Participant participantBySid = getParticipantBySid(str3);
        if (participantBySid instanceof RemoteParticipant) {
            remoteParticipant = (RemoteParticipant) participantBySid;
        } else {
            remoteParticipant = null;
        }
        if (remoteParticipant == null) {
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.b(null, f.i("Tried to add a track for a participant that is not present. sid: ", str3), new Object[0]);
                return;
            }
            return;
        }
        l createStatsGetter = this.engine.createStatsGetter(receiver);
        str.getClass();
        RemoteParticipant.addSubscribedMediaTrack$default(remoteParticipant, track, str, createStatsGetter, receiver, this.adaptiveStream, 0, 32, null);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onConnectionQuality(List<LivekitRtc$ConnectionQualityInfo> updates) {
        updates.getClass();
        for (LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo : updates) {
            ConnectionQuality.Companion companion = ConnectionQuality.INSTANCE;
            b7 quality = livekitRtc$ConnectionQualityInfo.getQuality();
            quality.getClass();
            ConnectionQuality fromProto = companion.fromProto(quality);
            String participantSid = livekitRtc$ConnectionQualityInfo.getParticipantSid();
            participantSid.getClass();
            Participant participantBySid = getParticipantBySid(participantSid);
            if (participantBySid != null) {
                participantBySid.setConnectionQuality$livekit_android_sdk_release(fromProto);
                BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
                RoomEvent.ConnectionQualityChanged connectionQualityChanged = new RoomEvent.ConnectionQualityChanged(this, participantBySid, fromProto);
                d0 d0Var = this.coroutineScope;
                if (d0Var != null) {
                    broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) connectionQualityChanged, d0Var);
                } else {
                    m.i("coroutineScope");
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onDataReceived(byte[] bArr, RemoteParticipant remoteParticipant) {
        ParticipantListener.DefaultImpls.onDataReceived(this, bArr, remoteParticipant);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onDataStreamPacket(LivekitModels$DataPacket dp2, l7 encryptionType) {
        int i10;
        dp2.getClass();
        encryptionType.getClass();
        d7 valueCase = dp2.getValueCase();
        if (valueCase == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$1[valueCase.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                IncomingDataStreamManager incomingDataStreamManager = this.incomingDataStreamManager;
                LivekitModels$DataStream.Trailer streamTrailer = dp2.getStreamTrailer();
                streamTrailer.getClass();
                incomingDataStreamManager.handleStreamTrailer(streamTrailer, encryptionType);
                return;
            }
            IncomingDataStreamManager incomingDataStreamManager2 = this.incomingDataStreamManager;
            LivekitModels$DataStream.Chunk streamChunk = dp2.getStreamChunk();
            streamChunk.getClass();
            incomingDataStreamManager2.handleDataChunk(streamChunk, encryptionType);
            return;
        }
        IncomingDataStreamManager incomingDataStreamManager3 = this.incomingDataStreamManager;
        LivekitModels$DataStream.Header streamHeader = dp2.getStreamHeader();
        streamHeader.getClass();
        String participantIdentity = dp2.getParticipantIdentity();
        participantIdentity.getClass();
        incomingDataStreamManager3.mo2539handleStreamHeaderqaitkU4(streamHeader, Participant.Identity.m2605constructorimpl(participantIdentity), encryptionType);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onEngineConnected() {
        setState(State.CONNECTED);
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.Connected connected = new RoomEvent.Connected(this);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) connected, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onEngineDisconnected(DisconnectReason reason) {
        reason.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.e(null, "engine did disconnect: " + reason, new Object[0]);
        }
        handleDisconnect(reason);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onEngineReconnected() {
        setState(State.CONNECTED);
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.Reconnected reconnected = new RoomEvent.Reconnected(this);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) reconnected, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onEngineReconnecting() {
        setState(State.RECONNECTING);
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.Reconnecting reconnecting = new RoomEvent.Reconnecting(this);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) reconnecting, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onEngineResumed() {
        RTCEngine.Listener.DefaultImpls.onEngineResumed(this);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onEngineResuming() {
        RTCEngine.Listener.DefaultImpls.onEngineResuming(this);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onFailToConnect(Throwable error) {
        error.getClass();
        this.eventBus.tryPostEvent(new RoomEvent.FailedToConnect(this, error));
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onFullReconnecting() {
        this.localParticipant.prepareForFullReconnect$livekit_android_sdk_release();
        Iterator it = o.k1(getRemoteParticipants().keySet()).iterator();
        while (it.hasNext()) {
            m2533handleParticipantDisconnectp2YI31Y(((Participant.Identity) it.next()).m2610unboximpl());
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onJoinResponse(LivekitRtc$JoinResponse response) {
        response.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.c(null, "Connected to server, server version: " + response.getServerVersion() + ", client version: 2.22.0", new Object[0]);
        }
        if (response.getRoom().getSid() != null) {
            String sid = response.getRoom().getSid();
            sid.getClass();
            m2534setSidJVmrIBo(Sid.m2544constructorimpl(sid));
        } else {
            m2534setSidJVmrIBo(null);
        }
        setName(response.getRoom().getName());
        setMetadata(response.getRoom().getMetadata());
        if (this.e2eeManager != null && response.getSifTrailer().size() != 0) {
            E2EEManager e2EEManager = this.e2eeManager;
            e2EEManager.getClass();
            KeyProvider keyProvider = e2EEManager.keyProvider();
            byte[] m10 = response.getSifTrailer().m();
            m10.getClass();
            keyProvider.setSifTrailer(m10);
        }
        if (response.getRoom().getActiveRecording() != isRecording()) {
            setRecording(response.getRoom().getActiveRecording());
            BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
            RoomEvent.RecordingStatusChanged recordingStatusChanged = new RoomEvent.RecordingStatusChanged(this, isRecording());
            d0 d0Var = this.coroutineScope;
            if (d0Var != null) {
                broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) recordingStatusChanged, d0Var);
            } else {
                m.i("coroutineScope");
                throw null;
            }
        }
        if (response.hasParticipant()) {
            LocalParticipant localParticipant = this.localParticipant;
            LivekitModels$ParticipantInfo participant = response.getParticipant();
            participant.getClass();
            localParticipant.updateFromInfo(participant);
            LocalParticipant localParticipant2 = this.localParticipant;
            List<LivekitModels$Codec> enabledPublishCodecsList = response.getEnabledPublishCodecsList();
            enabledPublishCodecsList.getClass();
            localParticipant2.setEnabledPublishCodecs$livekit_android_sdk_release(enabledPublishCodecsList);
            List<LivekitModels$ParticipantInfo> otherParticipantsList = response.getOtherParticipantsList();
            otherParticipantsList.getClass();
            if (!otherParticipantsList.isEmpty()) {
                List<LivekitModels$ParticipantInfo> otherParticipantsList2 = response.getOtherParticipantsList();
                otherParticipantsList2.getClass();
                for (LivekitModels$ParticipantInfo livekitModels$ParticipantInfo : otherParticipantsList2) {
                    String identity = livekitModels$ParticipantInfo.getIdentity();
                    identity.getClass();
                    m2531getOrCreateRemoteParticipanttq5M0Po(Participant.Identity.m2605constructorimpl(identity), livekitModels$ParticipantInfo);
                }
                return;
            }
            return;
        }
        throw new RoomException.ConnectException("server didn't return a local participant", null, 2, null);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onLocalTrackSubscribed(LivekitRtc$TrackSubscribed response) {
        LocalTrackPublication localTrackPublication;
        response.getClass();
        TrackPublication trackPublication = this.localParticipant.getTrackPublications().get(response.getTrackSid());
        if (trackPublication instanceof LocalTrackPublication) {
            localTrackPublication = (LocalTrackPublication) trackPublication;
        } else {
            localTrackPublication = null;
        }
        if (localTrackPublication == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "Could not find local track publication for subscribed event ", new Object[0]);
                return;
            }
            return;
        }
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            g0.D(d0Var, null, null, new Room$onLocalTrackSubscribed$2(this, localTrackPublication, null), 3);
            this.localParticipant.onLocalTrackSubscribed$livekit_android_sdk_release(localTrackPublication);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onLocalTrackUnpublished(LivekitRtc$TrackUnpublishedResponse trackUnpublished) {
        trackUnpublished.getClass();
        this.localParticipant.handleLocalTrackUnpublished$livekit_android_sdk_release(trackUnpublished);
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onMetadataChanged(Participant participant, String prevMetadata) {
        participant.getClass();
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public Object onPostReconnect(boolean z6, c<? super sn.z> cVar) {
        RemoteTrackPublication remoteTrackPublication;
        sn.z zVar = sn.z.f31622a;
        if (z6) {
            Object republishTracks$livekit_android_sdk_release = this.localParticipant.republishTracks$livekit_android_sdk_release(cVar);
            if (republishTracks$livekit_android_sdk_release == xn.a.f37986a) {
                return republishTracks$livekit_android_sdk_release;
            }
            return zVar;
        }
        Iterator it = o.g1(getRemoteParticipants().values()).iterator();
        while (it.hasNext()) {
            for (TrackPublication trackPublication : o.g1(((RemoteParticipant) it.next()).getTrackPublications().values())) {
                if (trackPublication instanceof RemoteTrackPublication) {
                    remoteTrackPublication = (RemoteTrackPublication) trackPublication;
                } else {
                    remoteTrackPublication = null;
                }
                if (remoteTrackPublication != null && remoteTrackPublication.getSubscribed()) {
                    CoroutineUtilKt.invoke(remoteTrackPublication.getSendUpdateTrackSettings());
                }
            }
        }
        return zVar;
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onRemoteMuteChanged(String trackSid, boolean muted) {
        trackSid.getClass();
        this.localParticipant.onRemoteMuteChanged$livekit_android_sdk_release(trackSid, muted);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onRoomUpdate(LivekitModels$Room update) {
        update.getClass();
        if (update.getSid() != null) {
            String sid = update.getSid();
            sid.getClass();
            m2534setSidJVmrIBo(Sid.m2544constructorimpl(sid));
        }
        String metadata = getMetadata();
        setMetadata(update.getMetadata());
        boolean isRecording = isRecording();
        setRecording(update.getActiveRecording());
        if (!m.c(metadata, getMetadata())) {
            BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
            RoomEvent.RoomMetadataChanged roomMetadataChanged = new RoomEvent.RoomMetadataChanged(this, getMetadata(), metadata);
            d0 d0Var = this.coroutineScope;
            if (d0Var != null) {
                broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) roomMetadataChanged, d0Var);
            } else {
                m.i("coroutineScope");
                throw null;
            }
        }
        if (isRecording != isRecording()) {
            BroadcastEventBus<RoomEvent> broadcastEventBus2 = this.eventBus;
            RoomEvent.RecordingStatusChanged recordingStatusChanged = new RoomEvent.RecordingStatusChanged(this, isRecording());
            d0 d0Var2 = this.coroutineScope;
            if (d0Var2 != null) {
                broadcastEventBus2.postEvent((BroadcastEventBus<RoomEvent>) recordingStatusChanged, d0Var2);
            } else {
                m.i("coroutineScope");
                throw null;
            }
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onRpcPacketReceived(LivekitModels$DataPacket dp2) {
        dp2.getClass();
        this.localParticipant.handleDataPacket$livekit_android_sdk_release(dp2);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onSignalConnected(boolean isResume) {
        if (isResume) {
            sendSyncState();
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onSpeakersChanged(List<LivekitModels$SpeakerInfo> speakers) {
        speakers.getClass();
        handleSpeakersChanged(speakers);
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onSpeakingChanged(Participant participant) {
        ParticipantListener.DefaultImpls.onSpeakingChanged(this, participant);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onStreamStateUpdate(List<LivekitRtc$StreamStateInfo> streamStates) {
        TrackPublication trackPublication;
        Track track;
        streamStates.getClass();
        for (LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo : streamStates) {
            String participantSid = livekitRtc$StreamStateInfo.getParticipantSid();
            participantSid.getClass();
            Participant participantBySid = getParticipantBySid(participantSid);
            if (participantBySid != null && (trackPublication = participantBySid.getTrackPublications().get(livekitRtc$StreamStateInfo.getTrackSid())) != null && (track = trackPublication.getTrack()) != null) {
                Track.StreamState.Companion companion = Track.StreamState.INSTANCE;
                ad state = livekitRtc$StreamStateInfo.getState();
                state.getClass();
                track.setStreamState$livekit_android_sdk_release(companion.fromProto(state));
            }
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onSubscribedQualityUpdate(LivekitRtc$SubscribedQualityUpdate subscribedQualityUpdate) {
        subscribedQualityUpdate.getClass();
        this.localParticipant.handleSubscribedQualityUpdate$livekit_android_sdk_release(subscribedQualityUpdate);
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onSubscriptionPermissionUpdate(LivekitRtc$SubscriptionPermissionUpdate subscriptionPermissionUpdate) {
        RemoteParticipant remoteParticipant;
        subscriptionPermissionUpdate.getClass();
        String participantSid = subscriptionPermissionUpdate.getParticipantSid();
        participantSid.getClass();
        Participant participantBySid = getParticipantBySid(participantSid);
        if (participantBySid instanceof RemoteParticipant) {
            remoteParticipant = (RemoteParticipant) participantBySid;
        } else {
            remoteParticipant = null;
        }
        if (remoteParticipant == null) {
            return;
        }
        remoteParticipant.onSubscriptionPermissionUpdate$livekit_android_sdk_release(subscriptionPermissionUpdate);
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onTrackMuted(TrackPublication publication, Participant participant) {
        publication.getClass();
        participant.getClass();
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.TrackMuted trackMuted = new RoomEvent.TrackMuted(this, publication, participant);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) trackMuted, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onTrackPublished(LocalTrackPublication publication, LocalParticipant participant) {
        publication.getClass();
        participant.getClass();
        E2EEManager e2EEManager = this.e2eeManager;
        if (e2EEManager != null) {
            e2EEManager.getClass();
            Track track = publication.getTrack();
            track.getClass();
            e2EEManager.addPublishedTrack(track, publication, participant, this);
        }
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.TrackPublished trackPublished = new RoomEvent.TrackPublished(this, publication, participant);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) trackPublished, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onTrackSubscribed(Track track, RemoteTrackPublication publication, RemoteParticipant participant) {
        track.getClass();
        publication.getClass();
        participant.getClass();
        E2EEManager e2EEManager = this.e2eeManager;
        if (e2EEManager != null) {
            e2EEManager.getClass();
            e2EEManager.addSubscribedTrack(track, publication, participant, this);
        }
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.TrackSubscribed trackSubscribed = new RoomEvent.TrackSubscribed(this, track, publication, participant);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) trackSubscribed, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onTrackSubscriptionFailed(String sid, Exception exception, RemoteParticipant participant) {
        sid.getClass();
        exception.getClass();
        participant.getClass();
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.TrackSubscriptionFailed trackSubscriptionFailed = new RoomEvent.TrackSubscriptionFailed(this, sid, exception, participant);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) trackSubscriptionFailed, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onTrackUnmuted(TrackPublication publication, Participant participant) {
        publication.getClass();
        participant.getClass();
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.TrackUnmuted trackUnmuted = new RoomEvent.TrackUnmuted(this, publication, participant);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) trackUnmuted, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onTrackUnpublished(LocalTrackPublication publication, LocalParticipant participant) {
        publication.getClass();
        participant.getClass();
        E2EEManager e2EEManager = this.e2eeManager;
        if (e2EEManager != null) {
            Track track = publication.getTrack();
            track.getClass();
            e2EEManager.removePublishedTrack(track, publication, participant, this);
        }
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.TrackUnpublished trackUnpublished = new RoomEvent.TrackUnpublished(this, publication, participant);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) trackUnpublished, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onTrackUnsubscribed(Track track, RemoteTrackPublication publication, RemoteParticipant participant) {
        track.getClass();
        publication.getClass();
        participant.getClass();
        E2EEManager e2EEManager = this.e2eeManager;
        if (e2EEManager != null) {
            e2EEManager.removeSubscribedTrack(track, publication, participant, this);
        }
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.TrackUnsubscribed trackUnsubscribed = new RoomEvent.TrackUnsubscribed(this, track, publication, participant);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) trackUnsubscribed, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onTranscriptionReceived(LivekitModels$Transcription transcription) {
        long time;
        Map<String, TrackPublication> trackPublications;
        transcription.getClass();
        TrackPublication trackPublication = null;
        if (transcription.getSegmentsList().isEmpty()) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.a(null, "Received transcription segments are empty.", new Object[0]);
                return;
            }
            return;
        }
        String transcribedParticipantIdentity = transcription.getTranscribedParticipantIdentity();
        transcribedParticipantIdentity.getClass();
        Participant participantByIdentity = getParticipantByIdentity(transcribedParticipantIdentity);
        if (participantByIdentity != null && (trackPublications = participantByIdentity.getTrackPublications()) != null) {
            trackPublication = trackPublications.get(transcription.getTrackId());
        }
        List<LivekitModels$TranscriptionSegment> segmentsList = transcription.getSegmentsList();
        segmentsList.getClass();
        ArrayList arrayList = new ArrayList(p.a0(segmentsList, 10));
        for (LivekitModels$TranscriptionSegment livekitModels$TranscriptionSegment : segmentsList) {
            livekitModels$TranscriptionSegment.getClass();
            Long l4 = this.transcriptionReceivedTimes.get(livekitModels$TranscriptionSegment.getId());
            if (l4 != null) {
                time = l4.longValue();
            } else {
                time = new Date().getTime();
            }
            arrayList.add(TranscriptionSegmentKt.toSDKType(livekitModels$TranscriptionSegment, time));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TranscriptionSegment transcriptionSegment = (TranscriptionSegment) it.next();
            boolean z6 = transcriptionSegment.getFinal();
            Map<String, Long> map = this.transcriptionReceivedTimes;
            if (z6) {
                map.remove(transcriptionSegment.getId());
            } else {
                map.put(transcriptionSegment.getId(), Long.valueOf(transcriptionSegment.getFirstReceivedTime()));
            }
        }
        RoomEvent.TranscriptionReceived transcriptionReceived = new RoomEvent.TranscriptionReceived(this, arrayList, participantByIdentity, trackPublication);
        this.eventBus.tryPostEvent(transcriptionReceived);
        if (participantByIdentity != null) {
            participantByIdentity.onTranscriptionReceived$livekit_android_sdk_release(transcriptionReceived);
        }
        if (trackPublication != null) {
            trackPublication.onTranscriptionReceived$livekit_android_sdk_release(transcriptionReceived);
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onUpdateParticipants(List<LivekitModels$ParticipantInfo> updates) {
        String str;
        boolean m2607equalsimpl0;
        updates.getClass();
        for (LivekitModels$ParticipantInfo livekitModels$ParticipantInfo : updates) {
            String sid = livekitModels$ParticipantInfo.getSid();
            sid.getClass();
            String m2612constructorimpl = Participant.Sid.m2612constructorimpl(sid);
            String identity = livekitModels$ParticipantInfo.getIdentity();
            if (identity == null || wq.n.m0(identity)) {
                q7 q7Var = (q7) livekitModels$ParticipantInfo.toBuilder();
                Participant.Identity identity2 = this.sidToIdentity.get(Participant.Sid.m2611boximpl(m2612constructorimpl));
                if (identity2 != null) {
                    str = identity2.m2610unboximpl();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                q7Var.b(str);
                livekitModels$ParticipantInfo = (LivekitModels$ParticipantInfo) q7Var.build();
                livekitModels$ParticipantInfo.getClass();
            }
            String identity3 = livekitModels$ParticipantInfo.getIdentity();
            identity3.getClass();
            String m2605constructorimpl = Participant.Identity.m2605constructorimpl(identity3);
            String m2596getIdentity4WamZwg = this.localParticipant.m2596getIdentity4WamZwg();
            if (m2596getIdentity4WamZwg == null) {
                m2607equalsimpl0 = false;
            } else {
                m2607equalsimpl0 = Participant.Identity.m2607equalsimpl0(m2596getIdentity4WamZwg, m2605constructorimpl);
            }
            if (m2607equalsimpl0) {
                this.localParticipant.updateFromInfo(livekitModels$ParticipantInfo);
            } else {
                boolean containsKey = getRemoteParticipants().containsKey(Participant.Identity.m2604boximpl(m2605constructorimpl));
                if (livekitModels$ParticipantInfo.getState() == t7.DISCONNECTED) {
                    m2533handleParticipantDisconnectp2YI31Y(m2605constructorimpl);
                } else {
                    RemoteParticipant m2531getOrCreateRemoteParticipanttq5M0Po = m2531getOrCreateRemoteParticipanttq5M0Po(m2605constructorimpl, livekitModels$ParticipantInfo);
                    if (!containsKey) {
                        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
                        RoomEvent.ParticipantConnected participantConnected = new RoomEvent.ParticipantConnected(this, m2531getOrCreateRemoteParticipanttq5M0Po);
                        d0 d0Var = this.coroutineScope;
                        if (d0Var != null) {
                            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) participantConnected, d0Var);
                        } else {
                            m.i("coroutineScope");
                            throw null;
                        }
                    } else {
                        m2531getOrCreateRemoteParticipanttq5M0Po.updateFromInfo(livekitModels$ParticipantInfo);
                        this.sidToIdentity.put(Participant.Sid.m2611boximpl(m2612constructorimpl), Participant.Identity.m2604boximpl(m2605constructorimpl));
                    }
                }
            }
        }
    }

    @Override // io.livekit.android.room.RTCEngine.Listener
    public void onUserPacket(LivekitModels$UserPacket packet, c7 kind, l7 encryptionType) {
        RemoteParticipant remoteParticipant;
        String str;
        packet.getClass();
        kind.getClass();
        encryptionType.getClass();
        String participantSid = packet.getParticipantSid();
        participantSid.getClass();
        Participant participantBySid = getParticipantBySid(participantSid);
        if (participantBySid instanceof RemoteParticipant) {
            remoteParticipant = (RemoteParticipant) participantBySid;
        } else {
            remoteParticipant = null;
        }
        byte[] m10 = packet.getPayload().m();
        if (packet.hasTopic()) {
            str = packet.getTopic();
        } else {
            str = null;
        }
        m10.getClass();
        RoomEvent.DataReceived dataReceived = new RoomEvent.DataReceived(this, m10, remoteParticipant, str, encryptionType);
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) dataReceived, d0Var);
            if (remoteParticipant != null) {
                remoteParticipant.onDataReceived$livekit_android_sdk_release(dataReceived);
                return;
            }
            return;
        }
        m.i("coroutineScope");
        throw null;
    }

    @Override // io.livekit.android.room.rpc.RpcManager
    /* renamed from: performRpc-9o0yd6Q, reason: not valid java name */
    public Object mo2540performRpc9o0yd6Q(String str, String str2, String str3, long j4, c<? super String> cVar) {
        return this.localParticipant.mo2540performRpc9o0yd6Q(str, str2, str3, j4, cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(5:17|18|19|(2:23|24)|25))(2:26|27))(3:37|(2:39|(2:43|44))(5:45|(1:49)|50|(2:57|(0))(2:53|(1:55)(1:56))|35)|25)|28|(2:32|(2:34|35)(3:36|19|(3:21|23|24)))|25))|65|6|7|(0)(0)|28|(3:30|32|(0)(0))|25) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0033, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
    
        r12 = io.livekit.android.util.LKLog.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        if (io.livekit.android.util.LoggingLevel.ERROR.compareTo(io.livekit.android.util.LKLog.INSTANCE.getLoggingLevel()) >= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
    
        et.d.b(r11, "Error while preparing connection:", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prepareConnection(String str, String str2, c<? super sn.z> cVar) {
        Room$prepareConnection$1 room$prepareConnection$1;
        int i10;
        xn.a aVar;
        Room room;
        String str3;
        ConnectionWarmer connectionWarmer;
        String str4;
        if (cVar instanceof Room$prepareConnection$1) {
            room$prepareConnection$1 = (Room$prepareConnection$1) cVar;
            int i11 = room$prepareConnection$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                room$prepareConnection$1.label = i11 - Integer.MIN_VALUE;
                Object obj = room$prepareConnection$1.result;
                i10 = room$prepareConnection$1.label;
                sn.z zVar = sn.z.f31622a;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sn.a.g(obj);
                                return zVar;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str4 = (String) room$prepareConnection$1.L$0;
                        sn.a.g(obj);
                        LKLog.Companion companion = LKLog.INSTANCE;
                        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                            et.d.a(null, "prepared connection to " + str4, new Object[0]);
                            return zVar;
                        }
                        return zVar;
                    }
                    room = (Room) room$prepareConnection$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    if (getState() != State.DISCONNECTED) {
                        LKLog.Companion companion2 = LKLog.INSTANCE;
                        if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                            et.d.c(null, "Room is not in disconnected state, ignoring prepareConnection call.", new Object[0]);
                            return zVar;
                        }
                    } else {
                        LKLog.Companion companion3 = LKLog.INSTANCE;
                        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                            et.d.a(null, f.i("preparing connection to ", str), new Object[0]);
                        }
                        URI uri = new URI(str);
                        if (RegionUrlProviderKt.isLKCloud(uri) && str2 != null) {
                            RegionUrlProvider create = this.regionUrlProviderFactory.create(uri, str2);
                            this.regionUrlProvider = create;
                            room$prepareConnection$1.L$0 = this;
                            room$prepareConnection$1.label = 1;
                            obj = create.getNextBestRegionUrl(room$prepareConnection$1);
                            if (obj != aVar) {
                                room = this;
                            }
                        } else {
                            ConnectionWarmer connectionWarmer2 = this.connectionWarmer;
                            room$prepareConnection$1.label = 3;
                            if (connectionWarmer2.fetch(str, room$prepareConnection$1) == aVar) {
                            }
                        }
                        return aVar;
                    }
                    return zVar;
                }
                str3 = (String) obj;
                if (str3 != null && room.getState() == State.DISCONNECTED) {
                    room.regionUrl = str3;
                    connectionWarmer = room.connectionWarmer;
                    room$prepareConnection$1.L$0 = str3;
                    room$prepareConnection$1.label = 2;
                    if (connectionWarmer.fetch(str3, room$prepareConnection$1) == aVar) {
                        str4 = str3;
                        LKLog.Companion companion4 = LKLog.INSTANCE;
                        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                            et.d.a(null, "prepared connection to " + str4, new Object[0]);
                            return zVar;
                        }
                    } else {
                        return aVar;
                    }
                }
                return zVar;
            }
        }
        room$prepareConnection$1 = new Room$prepareConnection$1(this, cVar);
        Object obj2 = room$prepareConnection$1.result;
        i10 = room$prepareConnection$1.label;
        sn.z zVar2 = sn.z.f31622a;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        str3 = (String) obj2;
        if (str3 != null) {
            room.regionUrl = str3;
            connectionWarmer = room.connectionWarmer;
            room$prepareConnection$1.L$0 = str3;
            room$prepareConnection$1.label = 2;
            if (connectionWarmer.fetch(str3, room$prepareConnection$1) == aVar) {
            }
        }
        return zVar2;
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void registerByteStreamHandler(String topic, ho.p handler) {
        topic.getClass();
        handler.getClass();
        this.incomingDataStreamManager.registerByteStreamHandler(topic, handler);
    }

    @Override // io.livekit.android.room.rpc.RpcManager
    public void registerRpcMethod(String method, ho.p handler) {
        method.getClass();
        handler.getClass();
        this.localParticipant.registerRpcMethod(method, handler);
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void registerTextStreamHandler(String topic, ho.p handler) {
        topic.getClass();
        handler.getClass();
        this.incomingDataStreamManager.registerTextStreamHandler(topic, handler);
    }

    public final void release() {
        disconnect();
        this.closeableManager.close();
    }

    public final void sendSimulateScenario(SimulateScenario scenario) {
        scenario.getClass();
        vc newBuilder = LivekitRtc$SimulateScenario.newBuilder();
        int i10 = WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            newBuilder.b();
                        }
                    } else {
                        newBuilder.e();
                    }
                } else {
                    newBuilder.c();
                }
            } else {
                newBuilder.d();
            }
        } else {
            newBuilder.f();
        }
        a3 build = newBuilder.build();
        build.getClass();
        sendSimulateScenario((LivekitRtc$SimulateScenario) build);
    }

    public final void setAdaptiveStream(boolean z6) {
        this.adaptiveStream = z6;
    }

    public final void setAudioProcessorIsEnabled(boolean z6) {
        this.audioProcessorIsEnabled = z6;
    }

    public final void setAudioTrackCaptureDefaults(LocalAudioTrackOptions localAudioTrackOptions) {
        localAudioTrackOptions.getClass();
        this.defaultsManager.setAudioTrackCaptureDefaults(localAudioTrackOptions);
    }

    public final void setAudioTrackPublishDefaults(AudioTrackPublishDefaults audioTrackPublishDefaults) {
        audioTrackPublishDefaults.getClass();
        this.defaultsManager.setAudioTrackPublishDefaults(audioTrackPublishDefaults);
    }

    public final void setDynacast(boolean z6) {
        this.localParticipant.setDynacast$livekit_android_sdk_release(z6);
    }

    public final void setE2eeManager(E2EEManager e2EEManager) {
        this.e2eeManager = e2EEManager;
    }

    public final void setE2eeOptions(E2EEOptions e2EEOptions) {
        this.e2eeOptions = e2EEOptions;
    }

    public final void setEnableMetrics(boolean z6) {
        this.enableMetrics = z6;
    }

    public final void setMicrophoneMute(boolean muted) {
        this.audioDeviceModule.setMicrophoneMute(muted);
    }

    public final void setPrerecording$livekit_android_sdk_release(boolean z6) {
        this.defaultsManager.setPrerecording(z6);
    }

    public final void setReconnectionType(ReconnectType reconnectType) {
        reconnectType.getClass();
        this.engine.setReconnectType$livekit_android_sdk_release(reconnectType);
    }

    public final void setRoomOptions(RoomOptions options) {
        options.getClass();
        LocalAudioTrackOptions audioTrackCaptureDefaults = options.getAudioTrackCaptureDefaults();
        if (audioTrackCaptureDefaults != null) {
            setAudioTrackCaptureDefaults(audioTrackCaptureDefaults);
        }
        LocalVideoTrackOptions videoTrackCaptureDefaults = options.getVideoTrackCaptureDefaults();
        if (videoTrackCaptureDefaults != null) {
            setVideoTrackCaptureDefaults(videoTrackCaptureDefaults);
        }
        AudioTrackPublishDefaults audioTrackPublishDefaults = options.getAudioTrackPublishDefaults();
        if (audioTrackPublishDefaults != null) {
            setAudioTrackPublishDefaults(audioTrackPublishDefaults);
        }
        VideoTrackPublishDefaults videoTrackPublishDefaults = options.getVideoTrackPublishDefaults();
        if (videoTrackPublishDefaults != null) {
            setVideoTrackPublishDefaults(videoTrackPublishDefaults);
        }
        LocalVideoTrackOptions screenShareTrackCaptureDefaults = options.getScreenShareTrackCaptureDefaults();
        if (screenShareTrackCaptureDefaults != null) {
            setScreenShareTrackCaptureDefaults(screenShareTrackCaptureDefaults);
        }
        VideoTrackPublishDefaults screenShareTrackPublishDefaults = options.getScreenShareTrackPublishDefaults();
        if (screenShareTrackPublishDefaults != null) {
            setScreenShareTrackPublishDefaults(screenShareTrackPublishDefaults);
        }
        this.adaptiveStream = options.getAdaptiveStream();
        setDynacast(options.getDynacast());
        this.e2eeOptions = options.getE2eeOptions();
    }

    public final void setScreenShareTrackCaptureDefaults(LocalVideoTrackOptions localVideoTrackOptions) {
        localVideoTrackOptions.getClass();
        this.defaultsManager.setScreenShareTrackCaptureDefaults(localVideoTrackOptions);
    }

    public final void setScreenShareTrackPublishDefaults(VideoTrackPublishDefaults videoTrackPublishDefaults) {
        videoTrackPublishDefaults.getClass();
        this.defaultsManager.setScreenShareTrackPublishDefaults(videoTrackPublishDefaults);
    }

    public final void setSpeakerMute(boolean muted) {
        this.audioDeviceModule.setSpeakerMute(muted);
    }

    public final void setVideoTrackCaptureDefaults(LocalVideoTrackOptions localVideoTrackOptions) {
        localVideoTrackOptions.getClass();
        this.defaultsManager.setVideoTrackCaptureDefaults(localVideoTrackOptions);
    }

    public final void setVideoTrackPublishDefaults(VideoTrackPublishDefaults videoTrackPublishDefaults) {
        videoTrackPublishDefaults.getClass();
        this.defaultsManager.setVideoTrackPublishDefaults(videoTrackPublishDefaults);
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void unregisterByteStreamHandler(String topic) {
        topic.getClass();
        this.incomingDataStreamManager.unregisterByteStreamHandler(topic);
    }

    @Override // io.livekit.android.room.rpc.RpcManager
    public void unregisterRpcMethod(String method) {
        method.getClass();
        this.localParticipant.unregisterRpcMethod(method);
    }

    @Override // io.livekit.android.room.datastream.incoming.IncomingDataStreamManager
    public void unregisterTextStreamHandler(String topic) {
        topic.getClass();
        this.incomingDataStreamManager.unregisterTextStreamHandler(topic);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lio/livekit/android/room/Room$Sid;", "", SignalClient.CONNECT_QUERY_PARTICIPANT_SID, "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getSid", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @go.a
    @g
    /* loaded from: classes4.dex */
    public static final class Sid {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String sid;

        private /* synthetic */ Sid(String str) {
            this.sid = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Sid m2543boximpl(String str) {
            return new Sid(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m2544constructorimpl(String str) {
            str.getClass();
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m2545equalsimpl(String str, Object obj) {
            if (!(obj instanceof Sid) || !m.c(str, ((Sid) obj).m2549unboximpl())) {
                return false;
            }
            return true;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2546equalsimpl0(String str, String str2) {
            return m.c(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m2547hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m2548toStringimpl(String str) {
            return f.c(')', "Sid(sid=", str);
        }

        public boolean equals(Object obj) {
            return m2545equalsimpl(this.sid, obj);
        }

        public final String getSid() {
            return this.sid;
        }

        public int hashCode() {
            return m2547hashCodeimpl(this.sid);
        }

        public String toString() {
            return m2548toStringimpl(this.sid);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m2549unboximpl() {
            return this.sid;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/Room$Sid$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/Room$Sid;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return Room$Sid$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    public static /* synthetic */ void getActiveSpeakers$annotations() {
    }

    public static /* synthetic */ void getEnableMetrics$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getRemoteParticipants$annotations() {
    }

    /* renamed from: getSid-CC6JpwI$annotations, reason: not valid java name */
    public static /* synthetic */ void m2532getSidCC6JpwI$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    public static /* synthetic */ void isRecording$annotations() {
    }

    public final void initVideoRenderer(SurfaceViewRenderer viewRenderer) {
        viewRenderer.getClass();
        viewRenderer.init(this.eglBase.getEglBaseContext(), null);
        viewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        viewRenderer.setEnableHardwareScaler(false);
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onTrackUnpublished(RemoteTrackPublication publication, RemoteParticipant participant) {
        publication.getClass();
        participant.getClass();
        BroadcastEventBus<RoomEvent> broadcastEventBus = this.eventBus;
        RoomEvent.TrackUnpublished trackUnpublished = new RoomEvent.TrackUnpublished(this, publication, participant);
        d0 d0Var = this.coroutineScope;
        if (d0Var != null) {
            broadcastEventBus.postEvent((BroadcastEventBus<RoomEvent>) trackUnpublished, d0Var);
        } else {
            m.i("coroutineScope");
            throw null;
        }
    }

    @Override // io.livekit.android.room.participant.ParticipantListener
    public void onTrackPublished(RemoteTrackPublication remoteTrackPublication, RemoteParticipant remoteParticipant) {
        ParticipantListener.DefaultImpls.onTrackPublished(this, remoteTrackPublication, remoteParticipant);
    }

    public final void sendSimulateScenario(LivekitRtc$SimulateScenario scenario) {
        scenario.getClass();
        this.engine.getClient().sendSimulateScenario$livekit_android_sdk_release(scenario);
    }
}
