package io.livekit.android.room.participant;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sip.header.ParameterNames;
import as.c7;
import as.d9;
import as.e9;
import as.i9;
import as.jb;
import as.k8;
import as.m8;
import as.n8;
import as.t8;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import fr.g0;
import fr.k1;
import fr.z;
import ho.l;
import ho.p;
import ib.i;
import io.livekit.android.events.BroadcastEventBus;
import io.livekit.android.events.ParticipantEvent;
import io.livekit.android.room.ConnectionState;
import io.livekit.android.room.DefaultsManager;
import io.livekit.android.room.PeerConnectionTransportKt;
import io.livekit.android.room.RTCEngine;
import io.livekit.android.room.SignalClient;
import io.livekit.android.room.TrackBitrateInfo;
import io.livekit.android.room.datastream.StreamBytesOptions;
import io.livekit.android.room.datastream.StreamTextOptions;
import io.livekit.android.room.datastream.outgoing.ByteStreamSender;
import io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager;
import io.livekit.android.room.datastream.outgoing.TextStreamSender;
import io.livekit.android.room.participant.Participant;
import io.livekit.android.room.rpc.RpcManager;
import io.livekit.android.room.track.DataPublishReliability;
import io.livekit.android.room.track.LocalAudioTrack;
import io.livekit.android.room.track.LocalAudioTrackOptions;
import io.livekit.android.room.track.LocalScreencastVideoTrack;
import io.livekit.android.room.track.LocalTrackPublication;
import io.livekit.android.room.track.LocalVideoTrack;
import io.livekit.android.room.track.LocalVideoTrackOptions;
import io.livekit.android.room.track.SimulcastTrackInfo;
import io.livekit.android.room.track.Track;
import io.livekit.android.room.track.TrackException;
import io.livekit.android.room.track.TrackPublication;
import io.livekit.android.room.track.VideoCaptureParameter;
import io.livekit.android.room.track.VideoCodec;
import io.livekit.android.room.track.VideoEncoding;
import io.livekit.android.room.track.VideoPreset;
import io.livekit.android.room.track.screencapture.ScreenCaptureParams;
import io.livekit.android.room.util.EncodingUtils;
import io.livekit.android.rpc.RpcError;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.util.StringByteUtilsKt;
import io.livekit.android.webrtc.RtpTransceiverExtKt;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.LivekitModels$Codec;
import livekit.LivekitModels$DataPacket;
import livekit.LivekitModels$ParticipantInfo;
import livekit.LivekitModels$RpcAck;
import livekit.LivekitModels$RpcError;
import livekit.LivekitModels$RpcRequest;
import livekit.LivekitModels$RpcResponse;
import livekit.LivekitModels$SimulcastCodecInfo;
import livekit.LivekitModels$SipDTMF;
import livekit.LivekitModels$TrackInfo;
import livekit.LivekitModels$UserPacket;
import livekit.LivekitModels$VideoLayer;
import livekit.LivekitRtc$AddTrackRequest;
import livekit.LivekitRtc$SubscribedCodec;
import livekit.LivekitRtc$SubscribedQuality;
import livekit.LivekitRtc$SubscribedQualityUpdate;
import livekit.LivekitRtc$TrackUnpublishedResponse;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpParameters;
import livekit.org.webrtc.RtpSender;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.VideoCapturer;
import livekit.org.webrtc.VideoProcessor;
import or.a;
import or.d;
import sn.k;
import tn.a0;
import tn.o;
import tn.t;
import wn.c;
import wn.e;
import wq.n;
import xq.b;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000â\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004Â\u0002Ã\u0002B\u007f\b\u0001\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\u0018\b\u0001\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018j\u0002`\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"H\u0097Aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J.\u0010/\u001a\b\u0012\u0004\u0012\u00020,0$2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010#\u001a\u00020+H\u0097Aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u0002002\u0006\u0010#\u001a\u00020\"H\u0096A¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u0002032\b\b\u0002\u0010#\u001a\u00020+H\u0096A¢\u0006\u0004\b4\u00105J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J!\u0010>\u001a\u0002062\b\b\u0002\u0010<\u001a\u00020)2\b\b\u0002\u0010#\u001a\u00020=¢\u0006\u0004\b>\u0010?J5\u0010E\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020)2\u0006\u0010A\u001a\u00020@2\b\b\u0002\u0010#\u001a\u00020B2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ-\u0010E\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020)2\b\b\u0002\u0010#\u001a\u00020B2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010GJI\u0010N\u001a\u00020M2\b\b\u0002\u0010<\u001a\u00020)2\u0006\u0010I\u001a\u00020H2\b\b\u0002\u0010#\u001a\u00020B2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0\u0018¢\u0006\u0004\bN\u0010OJ\u0019\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u0004\u0018\u00010R2\u0006\u0010<\u001a\u00020)H\u0016¢\u0006\u0004\bU\u0010VJ\u0018\u0010X\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bX\u0010YJ\u0018\u0010Z\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u0004H\u0086@¢\u0006\u0004\bZ\u0010YJ$\u0010]\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u00042\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010[H\u0086@¢\u0006\u0004\b]\u0010^J.\u0010c\u001a\u00020\u00042\u0006\u0010_\u001a\u0002062\b\b\u0002\u0010#\u001a\u00020`2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010aH\u0086@¢\u0006\u0004\bc\u0010dJ.\u0010f\u001a\u00020\u00042\u0006\u0010_\u001a\u0002092\b\b\u0002\u0010#\u001a\u00020e2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010aH\u0086@¢\u0006\u0004\bf\u0010gJ%\u0010l\u001a\u00020K2\u0006\u0010h\u001a\u00020\u00042\u000e\b\u0002\u0010k\u001a\b\u0012\u0004\u0012\u00020j0i¢\u0006\u0004\bl\u0010mJ\u001f\u0010o\u001a\u00020K2\u0006\u0010_\u001a\u00020J2\b\b\u0002\u0010n\u001a\u00020\u0004¢\u0006\u0004\bo\u0010pJL\u0010z\u001a\b\u0012\u0004\u0012\u00020K0$2\u0006\u0010r\u001a\u00020q2\b\b\u0002\u0010t\u001a\u00020s2\n\b\u0002\u0010u\u001a\u0004\u0018\u00010)2\u0010\b\u0002\u0010w\u001a\n\u0012\u0004\u0012\u00020v\u0018\u00010iH\u0087@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010yJ-\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020K0$2\u0006\u0010|\u001a\u00020{2\u0006\u0010}\u001a\u00020)H\u0087@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b~\u0010\u007fJD\u0010\u0087\u0001\u001a\u00020K2\u0007\u0010\u0081\u0001\u001a\u00020)2'\u0010\u0086\u0001\u001a\"\b\u0001\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020)0\u0084\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u00010\u0082\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u0089\u0001\u001a\u00020K2\u0007\u0010\u0081\u0001\u001a\u00020)H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001c\u0010\u008f\u0001\u001a\u00020K2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J;\u0010\u0096\u0001\u001a\u00020)2\u0007\u0010\u0090\u0001\u001a\u00020v2\u0007\u0010\u0081\u0001\u001a\u00020)2\u0007\u0010\u0091\u0001\u001a\u00020)2\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0096@ø\u0001\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001e\u0010\u0099\u0001\u001a\u00020K2\u0007\u0010\u0097\u0001\u001a\u00020vH\u0000ø\u0001\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u008a\u0001J\u001c\u0010\u009c\u0001\u001a\u00020K2\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0017¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0019\u0010\u009f\u0001\u001a\u00020K2\u0007\u0010\u009e\u0001\u001a\u00020)¢\u0006\u0006\b\u009f\u0001\u0010\u008a\u0001J\u0018\u0010 \u0001\u001a\u00020K2\u0006\u0010<\u001a\u00020)¢\u0006\u0006\b \u0001\u0010\u008a\u0001J&\u0010£\u0001\u001a\u00020K2\u0014\u0010¢\u0001\u001a\u000f\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)0¡\u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001J$\u0010©\u0001\u001a\u00020K2\u0007\u0010¥\u0001\u001a\u00020)2\u0007\u0010¦\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001c\u0010®\u0001\u001a\u00020K2\b\u0010«\u0001\u001a\u00030ª\u0001H\u0000¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u001c\u0010³\u0001\u001a\u00020K2\b\u0010°\u0001\u001a\u00030¯\u0001H\u0000¢\u0006\u0006\b±\u0001\u0010²\u0001J\u0012\u0010¶\u0001\u001a\u00020KH\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0013\u0010¹\u0001\u001a\u00020KH\u0080@¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001b\u0010½\u0001\u001a\u00020K2\u0007\u0010º\u0001\u001a\u00020RH\u0000¢\u0006\u0006\b»\u0001\u0010¼\u0001J\"\u0010Â\u0001\u001a\u00020K2\u000e\u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030¾\u00010iH\u0000¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0010\u0010Ã\u0001\u001a\u00020K¢\u0006\u0006\bÃ\u0001\u0010µ\u0001J\u0012\u0010Ä\u0001\u001a\u00020KH\u0016¢\u0006\u0006\bÄ\u0001\u0010µ\u0001J/\u0010Å\u0001\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020P2\u0006\u0010W\u001a\u00020\u00042\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010[H\u0082@¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001a\u0010Ç\u0001\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001JZ\u0010Î\u0001\u001a\u0004\u0018\u00010R2\u0006\u0010_\u001a\u00020J2\u0007\u0010#\u001a\u00030É\u00012\u0014\u0010Ë\u0001\u001a\u000f\u0012\u0005\u0012\u00030Ê\u0001\u0012\u0004\u0012\u00020K0\u00182\u0010\b\u0002\u0010Í\u0001\u001a\t\u0012\u0005\u0012\u00030Ì\u00010i2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010aH\u0082@¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J4\u0010Ó\u0001\u001a\t\u0012\u0005\u0012\u00030Ì\u00010i2\u0007\u0010Ð\u0001\u001a\u00020\u00042\b\u0010Ò\u0001\u001a\u00030Ñ\u00012\u0006\u0010#\u001a\u00020eH\u0002¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001JB\u0010Ø\u0001\u001a\u0018\u0012\u0004\u0012\u00020e\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ì\u00010i\u0018\u00010×\u00012\u0006\u0010_\u001a\u0002092\b\u0010Ö\u0001\u001a\u00030Õ\u00012\u0006\u0010#\u001a\u00020eH\u0002¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J)\u0010Ý\u0001\u001a\b\u0012\u0004\u0012\u00020K0$2\b\u0010Ú\u0001\u001a\u00030\u008b\u0001H\u0083@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001JL\u0010á\u0001\u001a\b\u0012\u0004\u0012\u00020K0$2\u0007\u0010\u0090\u0001\u001a\u00020v2\u0007\u0010Þ\u0001\u001a\u00020)2\u0007\u0010\u0081\u0001\u001a\u00020)2\u0007\u0010\u0091\u0001\u001a\u00020)2\n\b\u0002\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0083@ø\u0001\u0001¢\u0006\u0006\bß\u0001\u0010à\u0001JE\u0010æ\u0001\u001a\b\u0012\u0004\u0012\u00020K0$2\u0007\u0010\u0090\u0001\u001a\u00020v2\u0007\u0010Þ\u0001\u001a\u00020)2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010)2\n\u0010ã\u0001\u001a\u0005\u0018\u00010â\u0001H\u0083@ø\u0001\u0001¢\u0006\u0006\bä\u0001\u0010å\u0001J.\u0010é\u0001\u001a\b\u0012\u0004\u0012\u00020K0$2\u0007\u0010\u0090\u0001\u001a\u00020v2\u0007\u0010Þ\u0001\u001a\u00020)H\u0083@ø\u0001\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J\u001b\u0010ê\u0001\u001a\u00020K2\u0007\u0010Þ\u0001\u001a\u00020)H\u0002¢\u0006\u0006\bê\u0001\u0010\u008a\u0001J2\u0010ë\u0001\u001a\u00020K2\u0007\u0010Þ\u0001\u001a\u00020)2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010)2\n\u0010ã\u0001\u001a\u0005\u0018\u00010â\u0001H\u0002¢\u0006\u0006\bë\u0001\u0010ì\u0001JM\u0010ñ\u0001\u001a\u00020K2\u0007\u0010í\u0001\u001a\u00020v2\u0007\u0010Þ\u0001\u001a\u00020)2\u0007\u0010\u0081\u0001\u001a\u00020)2\u0007\u0010\u0091\u0001\u001a\u00020)2\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0007\u0010î\u0001\u001a\u00020{H\u0082@ø\u0001\u0001¢\u0006\u0006\bï\u0001\u0010ð\u0001J,\u0010ó\u0001\u001a\u00020K2\u0006\u0010_\u001a\u0002092\b\u0010ò\u0001\u001a\u00030Õ\u00012\u0006\u0010#\u001a\u00020eH\u0002¢\u0006\u0006\bó\u0001\u0010ô\u0001R'\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0005\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001R\u001d\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0007\u0010ú\u0001\u001a\u0006\bû\u0001\u0010ü\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010ý\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010þ\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010ÿ\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0080\u0002R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0081\u0002R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0082\u0002R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0083\u0002R%\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018j\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u0084\u0002R\u0015\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0085\u0002R!\u0010\u0086\u0002\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R&\u0010\u008a\u0002\u001a\u0011\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0089\u00020\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002Rß\u0001\u0010\u008d\u0002\u001aÉ\u0001\u0012\r\u0012\u000b \u008c\u0002*\u0004\u0018\u00010)0)\u0012M\u0012K\b\u0001\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020)0\u0084\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u0001 \u008c\u0002*$\b\u0001\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020)0\u0084\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u0001\u0018\u00010\u0082\u00010\u0082\u0001 \u008c\u0002*c\u0012\r\u0012\u000b \u008c\u0002*\u0004\u0018\u00010)0)\u0012M\u0012K\b\u0001\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020)0\u0084\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u0001 \u008c\u0002*$\b\u0001\u0012\u0005\u0012\u00030\u0083\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020)0\u0084\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u0001\u0018\u00010\u0082\u00010\u0082\u0001\u0018\u00010¡\u00010\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008b\u0002Rb\u0010\u008f\u0002\u001aM\u0012\r\u0012\u000b \u008c\u0002*\u0004\u0018\u00010)0)\u0012\u000f\u0012\r \u008c\u0002*\u0005\u0018\u00010\u008e\u00020\u008e\u0002 \u008c\u0002*%\u0012\r\u0012\u000b \u008c\u0002*\u0004\u0018\u00010)0)\u0012\u000f\u0012\r \u008c\u0002*\u0005\u0018\u00010\u008e\u00020\u008e\u0002\u0018\u00010¡\u00010\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u008b\u0002Rb\u0010\u0091\u0002\u001aM\u0012\r\u0012\u000b \u008c\u0002*\u0004\u0018\u00010)0)\u0012\u000f\u0012\r \u008c\u0002*\u0005\u0018\u00010\u0090\u00020\u0090\u0002 \u008c\u0002*%\u0012\r\u0012\u000b \u008c\u0002*\u0004\u0018\u00010)0)\u0012\u000f\u0012\r \u008c\u0002*\u0005\u0018\u00010\u0090\u00020\u0090\u0002\u0018\u00010¡\u00010\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u008b\u0002R%\u0010\u0093\u0002\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0005\u0012\u00030\u0092\u00020¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u008b\u0002RK\u0010\u0095\u0002\u001a.\u0012\u000f\u0012\r \u008c\u0002*\u0005\u0018\u00010¾\u00010¾\u0001 \u008c\u0002*\u0015\u0012\u000f\u0012\r \u008c\u0002*\u0005\u0018\u00010¾\u00010¾\u0001\u0018\u00010i0\u0094\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0095\u0002\u0010\u0087\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R\u001b\u0010\u0098\u0002\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R\u001b\u0010\u009a\u0002\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R3\u0010£\u0002\u001a\u00020=2\u0007\u0010\u009c\u0002\u001a\u00020=8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002\"\u0006\b\u009f\u0002\u0010 \u0002*\u0006\b¡\u0002\u0010¢\u0002R5\u0010ª\u0002\u001a\u00030¤\u00022\b\u0010\u009c\u0002\u001a\u00030¤\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¥\u0002\u0010¦\u0002\"\u0006\b§\u0002\u0010¨\u0002*\u0006\b©\u0002\u0010¢\u0002R3\u0010°\u0002\u001a\u00020B2\u0007\u0010\u009c\u0002\u001a\u00020B8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b«\u0002\u0010¬\u0002\"\u0006\b\u00ad\u0002\u0010®\u0002*\u0006\b¯\u0002\u0010¢\u0002R5\u0010·\u0002\u001a\u00030±\u00022\b\u0010\u009c\u0002\u001a\u00030±\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b²\u0002\u0010³\u0002\"\u0006\b´\u0002\u0010µ\u0002*\u0006\b¶\u0002\u0010¢\u0002R3\u0010»\u0002\u001a\u00020B2\u0007\u0010\u009c\u0002\u001a\u00020B8F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¸\u0002\u0010¬\u0002\"\u0006\b¹\u0002\u0010®\u0002*\u0006\bº\u0002\u0010¢\u0002R5\u0010¿\u0002\u001a\u00030±\u00022\b\u0010\u009c\u0002\u001a\u00030±\u00028F@FX\u0086\u008e\u0002¢\u0006\u0018\u001a\u0006\b¼\u0002\u0010³\u0002\"\u0006\b½\u0002\u0010µ\u0002*\u0006\b¾\u0002\u0010¢\u0002R\u001d\u0010Á\u0002\u001a\b\u0012\u0004\u0012\u00020R0i8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0002\u0010\u0097\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006Ä\u0002"}, d2 = {"Lio/livekit/android/room/participant/LocalParticipant;", "Lio/livekit/android/room/participant/Participant;", "Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManager;", "Lio/livekit/android/room/rpc/RpcManager;", "", "dynacast", "Lio/livekit/android/room/RTCEngine;", "engine", "Llivekit/org/webrtc/PeerConnectionFactory;", "peerConnectionFactory", "Landroid/content/Context;", "context", "Llivekit/org/webrtc/EglBase;", "eglBase", "Lio/livekit/android/room/track/LocalScreencastVideoTrack$Factory;", "screencastVideoTrackFactory", "Lio/livekit/android/room/track/LocalVideoTrack$Factory;", "videoTrackFactory", "Lio/livekit/android/room/track/LocalAudioTrack$Factory;", "audioTrackFactory", "Lio/livekit/android/room/DefaultsManager;", "defaultsManager", "Lfr/z;", "coroutineDispatcher", "Lkotlin/Function1;", "Llivekit/org/webrtc/MediaStreamTrack$MediaType;", "Llivekit/org/webrtc/RtpCapabilities;", "Lio/livekit/android/dagger/CapabilitiesGetter;", "capabilitiesGetter", "outgoingDataStreamManager", "<init>", "(ZLio/livekit/android/room/RTCEngine;Llivekit/org/webrtc/PeerConnectionFactory;Landroid/content/Context;Llivekit/org/webrtc/EglBase;Lio/livekit/android/room/track/LocalScreencastVideoTrack$Factory;Lio/livekit/android/room/track/LocalVideoTrack$Factory;Lio/livekit/android/room/track/LocalAudioTrack$Factory;Lio/livekit/android/room/DefaultsManager;Lfr/z;Lho/l;Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManager;)V", "Ljava/io/File;", "file", "Lio/livekit/android/room/datastream/StreamBytesOptions;", "options", "Lsn/m;", "Lio/livekit/android/room/datastream/ByteStreamInfo;", "sendFile-0E7RQCE", "(Ljava/io/File;Lio/livekit/android/room/datastream/StreamBytesOptions;Lwn/c;)Ljava/lang/Object;", "sendFile", "", ParameterNames.TEXT, "Lio/livekit/android/room/datastream/StreamTextOptions;", "Lio/livekit/android/room/datastream/TextStreamInfo;", "sendText-0E7RQCE", "(Ljava/lang/String;Lio/livekit/android/room/datastream/StreamTextOptions;Lwn/c;)Ljava/lang/Object;", "sendText", "Lio/livekit/android/room/datastream/outgoing/ByteStreamSender;", "streamBytes", "(Lio/livekit/android/room/datastream/StreamBytesOptions;Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/room/datastream/outgoing/TextStreamSender;", "streamText", "(Lio/livekit/android/room/datastream/StreamTextOptions;Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/room/track/LocalAudioTrack;", "getOrCreateDefaultAudioTrack", "()Lio/livekit/android/room/track/LocalAudioTrack;", "Lio/livekit/android/room/track/LocalVideoTrack;", "getOrCreateDefaultVideoTrack", "()Lio/livekit/android/room/track/LocalVideoTrack;", DiagnosticsEntry.NAME_KEY, "Lio/livekit/android/room/track/LocalAudioTrackOptions;", "createAudioTrack", "(Ljava/lang/String;Lio/livekit/android/room/track/LocalAudioTrackOptions;)Lio/livekit/android/room/track/LocalAudioTrack;", "Llivekit/org/webrtc/VideoCapturer;", "capturer", "Lio/livekit/android/room/track/LocalVideoTrackOptions;", "Llivekit/org/webrtc/VideoProcessor;", "videoProcessor", "createVideoTrack", "(Ljava/lang/String;Llivekit/org/webrtc/VideoCapturer;Lio/livekit/android/room/track/LocalVideoTrackOptions;Llivekit/org/webrtc/VideoProcessor;)Lio/livekit/android/room/track/LocalVideoTrack;", "(Ljava/lang/String;Lio/livekit/android/room/track/LocalVideoTrackOptions;Llivekit/org/webrtc/VideoProcessor;)Lio/livekit/android/room/track/LocalVideoTrack;", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "Lio/livekit/android/room/track/Track;", "Lsn/z;", "onStop", "Lio/livekit/android/room/track/LocalScreencastVideoTrack;", "createScreencastTrack", "(Ljava/lang/String;Landroid/content/Intent;Lio/livekit/android/room/track/LocalVideoTrackOptions;Llivekit/org/webrtc/VideoProcessor;Lho/l;)Lio/livekit/android/room/track/LocalScreencastVideoTrack;", "Lio/livekit/android/room/track/Track$Source;", "source", "Lio/livekit/android/room/track/LocalTrackPublication;", "getTrackPublication", "(Lio/livekit/android/room/track/Track$Source;)Lio/livekit/android/room/track/LocalTrackPublication;", "getTrackPublicationByName", "(Ljava/lang/String;)Lio/livekit/android/room/track/LocalTrackPublication;", "enabled", "setCameraEnabled", "(ZLwn/c;)Ljava/lang/Object;", "setMicrophoneEnabled", "Lio/livekit/android/room/track/screencapture/ScreenCaptureParams;", "screenCaptureParams", "setScreenShareEnabled", "(ZLio/livekit/android/room/track/screencapture/ScreenCaptureParams;Lwn/c;)Ljava/lang/Object;", "track", "Lio/livekit/android/room/participant/AudioTrackPublishOptions;", "Lio/livekit/android/room/participant/LocalParticipant$PublishListener;", "publishListener", "publishAudioTrack", "(Lio/livekit/android/room/track/LocalAudioTrack;Lio/livekit/android/room/participant/AudioTrackPublishOptions;Lio/livekit/android/room/participant/LocalParticipant$PublishListener;Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/room/participant/VideoTrackPublishOptions;", "publishVideoTrack", "(Lio/livekit/android/room/track/LocalVideoTrack;Lio/livekit/android/room/participant/VideoTrackPublishOptions;Lio/livekit/android/room/participant/LocalParticipant$PublishListener;Lwn/c;)Ljava/lang/Object;", "allParticipantsAllowed", "", "Lio/livekit/android/room/participant/ParticipantTrackPermission;", "participantTrackPermissions", "setTrackSubscriptionPermissions", "(ZLjava/util/List;)V", "stopOnUnpublish", "unpublishTrack", "(Lio/livekit/android/room/track/Track;Z)V", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/livekit/android/room/track/DataPublishReliability;", "reliability", "topic", "Lio/livekit/android/room/participant/Participant$Identity;", "identities", "publishData-yxL6bBk", "([BLio/livekit/android/room/track/DataPublishReliability;Ljava/lang/String;Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "publishData", "", "code", "digit", "publishDtmf-0E7RQCE", "(ILjava/lang/String;Lwn/c;)Ljava/lang/Object;", "publishDtmf", FirebaseAnalytics.Param.METHOD, "Lkotlin/Function2;", "Lio/livekit/android/room/participant/RpcInvocationData;", "Lwn/c;", "", "handler", "registerRpcMethod", "(Ljava/lang/String;Lho/p;)V", "unregisterRpcMethod", "(Ljava/lang/String;)V", "Llivekit/LivekitModels$DataPacket;", "packet", "handleDataPacket$livekit_android_sdk_release", "(Llivekit/LivekitModels$DataPacket;)V", "handleDataPacket", "destinationIdentity", "payload", "Lxq/b;", "responseTimeout", "performRpc-9o0yd6Q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "performRpc", "identity", "handleParticipantDisconnect-p2YI31Y$livekit_android_sdk_release", "handleParticipantDisconnect", "Llivekit/LivekitModels$ParticipantInfo;", ParameterNames.INFO, "updateFromInfo", "(Llivekit/LivekitModels$ParticipantInfo;)V", "metadata", "updateMetadata", "updateName", "", "attributes", "updateAttributes", "(Ljava/util/Map;)V", "trackSid", "muted", "onRemoteMuteChanged$livekit_android_sdk_release", "(Ljava/lang/String;Z)V", "onRemoteMuteChanged", "Llivekit/LivekitRtc$SubscribedQualityUpdate;", "subscribedQualityUpdate", "handleSubscribedQualityUpdate$livekit_android_sdk_release", "(Llivekit/LivekitRtc$SubscribedQualityUpdate;)V", "handleSubscribedQualityUpdate", "Llivekit/LivekitRtc$TrackUnpublishedResponse;", "unpublishedResponse", "handleLocalTrackUnpublished$livekit_android_sdk_release", "(Llivekit/LivekitRtc$TrackUnpublishedResponse;)V", "handleLocalTrackUnpublished", "prepareForFullReconnect$livekit_android_sdk_release", "()V", "prepareForFullReconnect", "republishTracks$livekit_android_sdk_release", "(Lwn/c;)Ljava/lang/Object;", "republishTracks", "publication", "onLocalTrackSubscribed$livekit_android_sdk_release", "(Lio/livekit/android/room/track/LocalTrackPublication;)V", "onLocalTrackSubscribed", "Llivekit/LivekitModels$Codec;", "codecs", "setEnabledPublishCodecs$livekit_android_sdk_release", "(Ljava/util/List;)V", "setEnabledPublishCodecs", "cleanup", "dispose", "setTrackEnabled", "(Lio/livekit/android/room/track/Track$Source;ZLio/livekit/android/room/track/screencapture/ScreenCaptureParams;Lwn/c;)Ljava/lang/Object;", "hasPermissionsToPublish", "(Lio/livekit/android/room/track/Track$Source;)Z", "Lio/livekit/android/room/participant/TrackPublishOptions;", "Las/jb;", "requestConfig", "Llivekit/org/webrtc/RtpParameters$Encoding;", "encodings", "publishTrackImpl", "(Lio/livekit/android/room/track/Track;Lio/livekit/android/room/participant/TrackPublishOptions;Lho/l;Ljava/util/List;Lio/livekit/android/room/participant/LocalParticipant$PublishListener;Lwn/c;)Ljava/lang/Object;", "isScreenShare", "Lio/livekit/android/room/track/Track$Dimensions;", "dimensions", "computeVideoEncodings", "(ZLio/livekit/android/room/track/Track$Dimensions;Lio/livekit/android/room/participant/VideoTrackPublishOptions;)Ljava/util/List;", "Lio/livekit/android/room/track/VideoCodec;", "videoCodec", "Lsn/k;", "computeTrackBackupOptionsAndEncodings", "(Lio/livekit/android/room/track/LocalVideoTrack;Lio/livekit/android/room/track/VideoCodec;Lio/livekit/android/room/participant/VideoTrackPublishOptions;)Lsn/k;", "dataPacket", "rpcSendData-gIAlu-s", "(Llivekit/LivekitModels$DataPacket;Lwn/c;)Ljava/lang/Object;", "rpcSendData", "requestId", "publishRpcRequest-k7jHMGI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "publishRpcRequest", "Lio/livekit/android/rpc/RpcError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "publishRpcResponse-iYZDETE", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/livekit/android/rpc/RpcError;Lwn/c;)Ljava/lang/Object;", "publishRpcResponse", "publishRpcAck-sjKNNEs", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "publishRpcAck", "handleIncomingRpcAck", "handleIncomingRpcResponse", "(Ljava/lang/String;Ljava/lang/String;Lio/livekit/android/rpc/RpcError;)V", "callerIdentity", "version", "handleIncomingRpcRequest-OYFzt6o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILwn/c;)Ljava/lang/Object;", "handleIncomingRpcRequest", "codec", "publishAdditionalCodecForTrack", "(Lio/livekit/android/room/track/LocalVideoTrack;Lio/livekit/android/room/track/VideoCodec;Lio/livekit/android/room/participant/VideoTrackPublishOptions;)V", "Z", "getDynacast$livekit_android_sdk_release", "()Z", "setDynacast$livekit_android_sdk_release", "(Z)V", "Lio/livekit/android/room/RTCEngine;", "getEngine$livekit_android_sdk_release", "()Lio/livekit/android/room/RTCEngine;", "Llivekit/org/webrtc/PeerConnectionFactory;", "Landroid/content/Context;", "Llivekit/org/webrtc/EglBase;", "Lio/livekit/android/room/track/LocalScreencastVideoTrack$Factory;", "Lio/livekit/android/room/track/LocalVideoTrack$Factory;", "Lio/livekit/android/room/track/LocalAudioTrack$Factory;", "Lio/livekit/android/room/DefaultsManager;", "Lho/l;", "Lio/livekit/android/room/datastream/outgoing/OutgoingDataStreamManager;", "republishes", "Ljava/util/List;", "", "Lfr/k1;", "jobs", "Ljava/util/Map;", "kotlin.jvm.PlatformType", "rpcHandlers", "Lio/livekit/android/room/participant/PendingRpcAck;", "pendingAcks", "Lio/livekit/android/room/participant/PendingRpcResponse;", "pendingResponses", "Lor/a;", "sourcePubLocks", "", "enabledPublishVideoCodecs", "getEnabledPublishVideoCodecs$livekit_android_sdk_release", "()Ljava/util/List;", "defaultAudioTrack", "Lio/livekit/android/room/track/LocalAudioTrack;", "defaultVideoTrack", "Lio/livekit/android/room/track/LocalVideoTrack;", "<set-?>", "getAudioTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalAudioTrackOptions;", "setAudioTrackCaptureDefaults", "(Lio/livekit/android/room/track/LocalAudioTrackOptions;)V", "getAudioTrackCaptureDefaults$delegate", "(Lio/livekit/android/room/participant/LocalParticipant;)Ljava/lang/Object;", "audioTrackCaptureDefaults", "Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "getAudioTrackPublishDefaults", "()Lio/livekit/android/room/participant/AudioTrackPublishDefaults;", "setAudioTrackPublishDefaults", "(Lio/livekit/android/room/participant/AudioTrackPublishDefaults;)V", "getAudioTrackPublishDefaults$delegate", "audioTrackPublishDefaults", "getVideoTrackCaptureDefaults", "()Lio/livekit/android/room/track/LocalVideoTrackOptions;", "setVideoTrackCaptureDefaults", "(Lio/livekit/android/room/track/LocalVideoTrackOptions;)V", "getVideoTrackCaptureDefaults$delegate", "videoTrackCaptureDefaults", "Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "getVideoTrackPublishDefaults", "()Lio/livekit/android/room/participant/VideoTrackPublishDefaults;", "setVideoTrackPublishDefaults", "(Lio/livekit/android/room/participant/VideoTrackPublishDefaults;)V", "getVideoTrackPublishDefaults$delegate", "videoTrackPublishDefaults", "getScreenShareTrackCaptureDefaults", "setScreenShareTrackCaptureDefaults", "getScreenShareTrackCaptureDefaults$delegate", "screenShareTrackCaptureDefaults", "getScreenShareTrackPublishDefaults", "setScreenShareTrackPublishDefaults", "getScreenShareTrackPublishDefaults$delegate", "screenShareTrackPublishDefaults", "getLocalTrackPublications", "localTrackPublications", "Factory", "PublishListener", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LocalParticipant extends Participant implements OutgoingDataStreamManager, RpcManager {
    private final LocalAudioTrack.Factory audioTrackFactory;
    private final l capabilitiesGetter;
    private final Context context;
    private LocalAudioTrack defaultAudioTrack;
    private LocalVideoTrack defaultVideoTrack;
    private final DefaultsManager defaultsManager;
    private boolean dynacast;
    private final EglBase eglBase;
    private final List<LivekitModels$Codec> enabledPublishVideoCodecs;
    private final RTCEngine engine;
    private final Map<Object, k1> jobs;
    private final OutgoingDataStreamManager outgoingDataStreamManager;
    private final PeerConnectionFactory peerConnectionFactory;
    private final Map<String, PendingRpcAck> pendingAcks;
    private final Map<String, PendingRpcResponse> pendingResponses;
    private List<LocalTrackPublication> republishes;
    private final Map<String, p> rpcHandlers;
    private final LocalScreencastVideoTrack.Factory screencastVideoTrackFactory;
    private final Map<Track.Source, a> sourcePubLocks;
    private final LocalVideoTrack.Factory videoTrackFactory;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/participant/LocalParticipant$Factory;", "", "create", "Lio/livekit/android/room/participant/LocalParticipant;", "dynacast", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        LocalParticipant create(boolean dynacast);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/livekit/android/room/participant/LocalParticipant$PublishListener;", "", "Lio/livekit/android/room/track/TrackPublication;", "publication", "Lsn/z;", "onPublishSuccess", "(Lio/livekit/android/room/track/TrackPublication;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "onPublishFailure", "(Ljava/lang/Exception;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface PublishListener {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes4.dex */
        public static final class DefaultImpls {
            public static void onPublishFailure(PublishListener publishListener, Exception exc) {
                exc.getClass();
            }

            public static void onPublishSuccess(PublishListener publishListener, TrackPublication trackPublication) {
                trackPublication.getClass();
            }
        }

        void onPublishFailure(Exception exception);

        void onPublishSuccess(TrackPublication publication);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Track.Source.values().length];
            try {
                iArr[Track.Source.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Track.Source.MICROPHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Track.Source.SCREEN_SHARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DataPublishReliability.values().length];
            try {
                iArr2[DataPublishReliability.RELIABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DataPublishReliability.LOSSY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocalParticipant(boolean z6, RTCEngine rTCEngine, PeerConnectionFactory peerConnectionFactory, Context context, EglBase eglBase, LocalScreencastVideoTrack.Factory factory, LocalVideoTrack.Factory factory2, LocalAudioTrack.Factory factory3, DefaultsManager defaultsManager, z zVar, l lVar, OutgoingDataStreamManager outgoingDataStreamManager) {
        super(Participant.Sid.m2612constructorimpl(""), null, zVar, 0 == true ? 1 : 0);
        rTCEngine.getClass();
        peerConnectionFactory.getClass();
        context.getClass();
        eglBase.getClass();
        factory.getClass();
        factory2.getClass();
        factory3.getClass();
        defaultsManager.getClass();
        zVar.getClass();
        lVar.getClass();
        outgoingDataStreamManager.getClass();
        this.dynacast = z6;
        this.engine = rTCEngine;
        this.peerConnectionFactory = peerConnectionFactory;
        this.context = context;
        this.eglBase = eglBase;
        this.screencastVideoTrackFactory = factory;
        this.videoTrackFactory = factory2;
        this.audioTrackFactory = factory3;
        this.defaultsManager = defaultsManager;
        this.capabilitiesGetter = lVar;
        this.outgoingDataStreamManager = outgoingDataStreamManager;
        this.jobs = new LinkedHashMap();
        this.rpcHandlers = Collections.synchronizedMap(new LinkedHashMap());
        this.pendingAcks = Collections.synchronizedMap(new LinkedHashMap());
        this.pendingResponses = Collections.synchronizedMap(new LinkedHashMap());
        zn.a entries = Track.Source.getEntries();
        int H = a0.H(tn.p.a0(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(H < 16 ? 16 : H);
        for (Object obj : entries) {
            linkedHashMap.put(obj, d.a());
        }
        this.sourcePubLocks = linkedHashMap;
        this.enabledPublishVideoCodecs = Collections.synchronizedList(new ArrayList());
    }

    private final k computeTrackBackupOptionsAndEncodings(LocalVideoTrack track, VideoCodec videoCodec, VideoTrackPublishOptions options) {
        String str;
        VideoCodec videoCodec2;
        String str2;
        if (!LocalParticipantKt.hasBackupCodec(options)) {
            return null;
        }
        String codecName = videoCodec.getCodecName();
        BackupVideoCodec backupCodec = options.getBackupCodec();
        if (backupCodec != null) {
            str = backupCodec.getCodec();
        } else {
            str = null;
        }
        if (!m.c(codecName, str)) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                StringBuilder sb = new StringBuilder("Server requested different codec than specified backup. server: ");
                videoCodec2 = videoCodec;
                sb.append(videoCodec2);
                sb.append(", specified: ");
                BackupVideoCodec backupCodec2 = options.getBackupCodec();
                if (backupCodec2 != null) {
                    str2 = backupCodec2.getCodec();
                } else {
                    str2 = null;
                }
                sb.append(str2);
                et.d.f(null, sb.toString(), new Object[0]);
                String codecName2 = videoCodec2.getCodecName();
                BackupVideoCodec backupCodec3 = options.getBackupCodec();
                backupCodec3.getClass();
                VideoTrackPublishOptions copy$default = VideoTrackPublishOptions.copy$default(options, null, backupCodec3.getEncoding(), false, codecName2, null, null, null, null, null, null, 1013, null);
                return new k(copy$default, computeVideoEncodings(track.getOptions().isScreencast(), track.getDimensions(), copy$default));
            }
        }
        videoCodec2 = videoCodec;
        String codecName22 = videoCodec2.getCodecName();
        BackupVideoCodec backupCodec32 = options.getBackupCodec();
        backupCodec32.getClass();
        VideoTrackPublishOptions copy$default2 = VideoTrackPublishOptions.copy$default(options, null, backupCodec32.getEncoding(), false, codecName22, null, null, null, null, null, null, 1013, null);
        return new k(copy$default2, computeVideoEncodings(track.getOptions().isScreencast(), track.getDimensions(), copy$default2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    private final List<RtpParameters.Encoding> computeVideoEncodings(boolean isScreenShare, Track.Dimensions dimensions, VideoTrackPublishOptions options) {
        int width = dimensions.getWidth();
        int height = dimensions.getHeight();
        ?? obj = new Object();
        obj.f20559a = options.getVideoEncoding();
        boolean simulcast = options.getSimulcast();
        String scalabilityMode = options.getScalabilityMode();
        Object obj2 = obj.f20559a;
        if ((obj2 != null || simulcast) && width != 0 && height != 0) {
            if (obj2 == null) {
                obj.f20559a = EncodingUtils.INSTANCE.determineAppropriateEncoding(isScreenShare, width, height);
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                    et.d.a(null, "using video encoding: " + obj.f20559a, new Object[0]);
                }
            }
            ArrayList arrayList = new ArrayList();
            if (scalabilityMode != null && PeerConnectionTransportKt.isSVCCodec(options.getVideoCodec())) {
                RtpParameters.Encoding rtpEncoding$default = VideoEncoding.toRtpEncoding$default((VideoEncoding) obj.f20559a, null, 0.0d, 3, null);
                rtpEncoding$default.scalabilityMode = scalabilityMode;
                arrayList.add(rtpEncoding$default);
                return arrayList;
            }
            if (simulcast) {
                List<VideoPreset> simulcastLayers = options.getSimulcastLayers();
                if (simulcastLayers == null) {
                    simulcastLayers = EncodingUtils.INSTANCE.defaultSimulcastLayers(isScreenShare, width, height, (VideoEncoding) obj.f20559a);
                }
                if (simulcastLayers.isEmpty()) {
                    LKLog.Companion companion2 = LKLog.INSTANCE;
                    if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                        et.d.f(null, "Simulcast is enabled but an empty list was set for simulcastLayers!", new Object[0]);
                    }
                }
                final int max = Math.max(width, height);
                int maxFps = ((VideoEncoding) obj.f20559a).getMaxFps();
                List a12 = o.a1(new Comparator() { // from class: io.livekit.android.room.participant.LocalParticipant$computeVideoEncodings$$inlined$sortedByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        double computeVideoEncodings$calculateScaleDown;
                        double computeVideoEncodings$calculateScaleDown2;
                        computeVideoEncodings$calculateScaleDown = LocalParticipant.computeVideoEncodings$calculateScaleDown(max, ((VideoPreset) t11).getCapture());
                        Double valueOf = Double.valueOf(computeVideoEncodings$calculateScaleDown);
                        computeVideoEncodings$calculateScaleDown2 = LocalParticipant.computeVideoEncodings$calculateScaleDown(max, ((VideoPreset) t10).getCapture());
                        return e.g(valueOf, Double.valueOf(computeVideoEncodings$calculateScaleDown2));
                    }
                }, simulcastLayers);
                VideoPreset videoPreset = (VideoPreset) o.z0(0, a12);
                VideoPreset videoPreset2 = (VideoPreset) o.z0(1, a12);
                if (max >= 480 && videoPreset != null) {
                    computeVideoEncodings$addEncoding(obj, arrayList, VideoEncoding.copy$default(videoPreset.getEncoding(), 0, Math.min(videoPreset.getEncoding().getMaxFps(), maxFps), 1, null), computeVideoEncodings$calculateScaleDown(max, videoPreset.getCapture()));
                }
                if (max >= 960 && videoPreset2 != null) {
                    computeVideoEncodings$addEncoding(obj, arrayList, VideoEncoding.copy$default(videoPreset2.getEncoding(), 0, Math.min(videoPreset2.getEncoding().getMaxFps(), maxFps), 1, null), computeVideoEncodings$calculateScaleDown(max, videoPreset2.getCapture()));
                }
                computeVideoEncodings$addEncoding(obj, arrayList, (VideoEncoding) obj.f20559a, 1.0d);
            } else {
                arrayList.add(VideoEncoding.toRtpEncoding$default((VideoEncoding) obj.f20559a, null, 0.0d, 3, null));
            }
            Collections.reverse(arrayList);
            return arrayList;
        }
        return t.f33547a;
    }

    private static final void computeVideoEncodings$addEncoding(d0 d0Var, List<RtpParameters.Encoding> list, VideoEncoding videoEncoding, double d10) {
        if (d10 < 1.0d) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "Discarding encoding with a scale down < 1.0: " + d10 + '.', new Object[0]);
                return;
            }
            return;
        }
        if (d10 == 1.0d && videoEncoding != d0Var.f20559a) {
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "Discarding duplicate encoding with a scale down == 1.0: " + d10 + '.', new Object[0]);
                return;
            }
            return;
        }
        int size = list.size();
        EncodingUtils encodingUtils = EncodingUtils.INSTANCE;
        if (size < encodingUtils.getVIDEO_RIDS().length) {
            list.add(videoEncoding.toRtpEncoding(encodingUtils.getVIDEO_RIDS()[list.size()], d10));
        } else {
            c6.x("Attempting to add more encodings than we have rids for!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double computeVideoEncodings$calculateScaleDown(int i10, VideoCaptureParameter videoCaptureParameter) {
        return i10 / Math.max(videoCaptureParameter.getWidth(), videoCaptureParameter.getHeight());
    }

    public static /* synthetic */ LocalAudioTrack createAudioTrack$default(LocalParticipant localParticipant, String str, LocalAudioTrackOptions localAudioTrackOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            localAudioTrackOptions = localParticipant.getAudioTrackCaptureDefaults();
        }
        return localParticipant.createAudioTrack(str, localAudioTrackOptions);
    }

    public static /* synthetic */ LocalScreencastVideoTrack createScreencastTrack$default(LocalParticipant localParticipant, String str, Intent intent, LocalVideoTrackOptions localVideoTrackOptions, VideoProcessor videoProcessor, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            localVideoTrackOptions = LocalVideoTrackOptions.copy$default(localParticipant.getScreenShareTrackCaptureDefaults(), false, null, null, null, 15, null);
        }
        if ((i10 & 8) != 0) {
            videoProcessor = null;
        }
        LocalVideoTrackOptions localVideoTrackOptions2 = localVideoTrackOptions;
        return localParticipant.createScreencastTrack(str, intent, localVideoTrackOptions2, videoProcessor, lVar);
    }

    public static /* synthetic */ LocalVideoTrack createVideoTrack$default(LocalParticipant localParticipant, String str, VideoCapturer videoCapturer, LocalVideoTrackOptions localVideoTrackOptions, VideoProcessor videoProcessor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 4) != 0) {
            localVideoTrackOptions = LocalVideoTrackOptions.copy$default(localParticipant.getVideoTrackCaptureDefaults(), false, null, null, null, 15, null);
        }
        if ((i10 & 8) != 0) {
            videoProcessor = null;
        }
        return localParticipant.createVideoTrack(str, videoCapturer, localVideoTrackOptions, videoProcessor);
    }

    private final List<LocalTrackPublication> getLocalTrackPublications() {
        LocalTrackPublication localTrackPublication;
        Collection<TrackPublication> values = getTrackPublications().values();
        ArrayList arrayList = new ArrayList();
        for (TrackPublication trackPublication : values) {
            if (trackPublication instanceof LocalTrackPublication) {
                localTrackPublication = (LocalTrackPublication) trackPublication;
            } else {
                localTrackPublication = null;
            }
            if (localTrackPublication != null) {
                arrayList.add(localTrackPublication);
            }
        }
        return o.g1(arrayList);
    }

    private final void handleIncomingRpcAck(String requestId) {
        PendingRpcAck remove = this.pendingAcks.remove(requestId);
        if (remove != null) {
            remove.getOnResolve().invoke();
            return;
        }
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.b(null, f.i("Ack received for unexpected RPC request, id = ", requestId), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0292, code lost:
    
        if (r2 != r14) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f6 A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:27:0x0066, B:28:0x01ec, B:30:0x01f6, B:32:0x020e, B:34:0x0214), top: B:26:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* renamed from: handleIncomingRpcRequest-OYFzt6o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2584handleIncomingRpcRequestOYFzt6o(String str, String str2, String str3, String str4, long j4, int i10, c<? super sn.z> cVar) {
        LocalParticipant$handleIncomingRpcRequest$1 localParticipant$handleIncomingRpcRequest$1;
        int i11;
        String str5;
        long j10;
        Object m2586publishRpcAcksjKNNEs;
        String str6;
        int i12;
        String str7;
        String str8;
        LocalParticipant localParticipant;
        String str9;
        String str10;
        LocalParticipant localParticipant2;
        String str11;
        String str12;
        String str13;
        Object m2589publishRpcResponseiYZDETE;
        String str14;
        Object m2589publishRpcResponseiYZDETE2;
        String str15;
        Object obj;
        RpcError create$default;
        String str16;
        Object m2589publishRpcResponseiYZDETE3;
        String str17;
        String str18;
        if (cVar instanceof LocalParticipant$handleIncomingRpcRequest$1) {
            localParticipant$handleIncomingRpcRequest$1 = (LocalParticipant$handleIncomingRpcRequest$1) cVar;
            int i13 = localParticipant$handleIncomingRpcRequest$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                localParticipant$handleIncomingRpcRequest$1.label = i13 - Integer.MIN_VALUE;
                Object obj2 = localParticipant$handleIncomingRpcRequest$1.result;
                i11 = localParticipant$handleIncomingRpcRequest$1.label;
                sn.z zVar = sn.z.f31622a;
                xn.a aVar = xn.a.f37986a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 == 5) {
                                        str17 = (String) localParticipant$handleIncomingRpcRequest$1.L$0;
                                        sn.a.g(obj2);
                                        m2589publishRpcResponseiYZDETE3 = ((sn.m) obj2).f31603a;
                                        if (m2589publishRpcResponseiYZDETE3 instanceof sn.l) {
                                            LKLog.Companion companion = LKLog.INSTANCE;
                                            Throwable a10 = sn.m.a(m2589publishRpcResponseiYZDETE3);
                                            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                                et.d.f(a10, f.c('.', "Error sending error response for request ", str17), new Object[0]);
                                            }
                                        }
                                        return zVar;
                                    }
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                str9 = (String) localParticipant$handleIncomingRpcRequest$1.L$3;
                                str10 = (String) localParticipant$handleIncomingRpcRequest$1.L$2;
                                str11 = (String) localParticipant$handleIncomingRpcRequest$1.L$1;
                                localParticipant2 = (LocalParticipant) localParticipant$handleIncomingRpcRequest$1.L$0;
                                try {
                                    sn.a.g(obj2);
                                    str18 = (String) obj2;
                                } catch (Exception e10) {
                                    e = e10;
                                    if (!(e instanceof RpcError)) {
                                        create$default = (RpcError) e;
                                        obj = null;
                                        str16 = null;
                                        localParticipant$handleIncomingRpcRequest$1.L$0 = str10;
                                        localParticipant$handleIncomingRpcRequest$1.L$1 = obj;
                                        localParticipant$handleIncomingRpcRequest$1.L$2 = obj;
                                        localParticipant$handleIncomingRpcRequest$1.L$3 = obj;
                                        localParticipant$handleIncomingRpcRequest$1.L$4 = obj;
                                        localParticipant$handleIncomingRpcRequest$1.label = 5;
                                        String str19 = str10;
                                        m2589publishRpcResponseiYZDETE3 = localParticipant2.m2589publishRpcResponseiYZDETE(str11, str19, str16, create$default, localParticipant$handleIncomingRpcRequest$1);
                                        str17 = str19;
                                    } else {
                                        LKLog.Companion companion2 = LKLog.INSTANCE;
                                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                            et.d.f(e, f.C("Uncaught error returned by RPC handler for ", str9, ". Returning APPLICATION_ERROR instead."), new Object[0]);
                                        }
                                        obj = null;
                                        create$default = RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.APPLICATION_ERROR, null, null, 3, null);
                                        str16 = null;
                                        localParticipant$handleIncomingRpcRequest$1.L$0 = str10;
                                        localParticipant$handleIncomingRpcRequest$1.L$1 = obj;
                                        localParticipant$handleIncomingRpcRequest$1.L$2 = obj;
                                        localParticipant$handleIncomingRpcRequest$1.L$3 = obj;
                                        localParticipant$handleIncomingRpcRequest$1.L$4 = obj;
                                        localParticipant$handleIncomingRpcRequest$1.label = 5;
                                        String str192 = str10;
                                        m2589publishRpcResponseiYZDETE3 = localParticipant2.m2589publishRpcResponseiYZDETE(str11, str192, str16, create$default, localParticipant$handleIncomingRpcRequest$1);
                                        str17 = str192;
                                    }
                                }
                                if (StringByteUtilsKt.byteLength(str18) <= 15360) {
                                    create$default = RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.RESPONSE_PAYLOAD_TOO_LARGE, null, null, 3, null);
                                    LKLog.Companion companion3 = LKLog.INSTANCE;
                                    if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                        et.d.f(null, "RPC Response payload too large for " + str9, new Object[0]);
                                    }
                                    obj = null;
                                    str16 = null;
                                    localParticipant$handleIncomingRpcRequest$1.L$0 = str10;
                                    localParticipant$handleIncomingRpcRequest$1.L$1 = obj;
                                    localParticipant$handleIncomingRpcRequest$1.L$2 = obj;
                                    localParticipant$handleIncomingRpcRequest$1.L$3 = obj;
                                    localParticipant$handleIncomingRpcRequest$1.L$4 = obj;
                                    localParticipant$handleIncomingRpcRequest$1.label = 5;
                                    String str1922 = str10;
                                    m2589publishRpcResponseiYZDETE3 = localParticipant2.m2589publishRpcResponseiYZDETE(str11, str1922, str16, create$default, localParticipant$handleIncomingRpcRequest$1);
                                    str17 = str1922;
                                } else {
                                    str16 = str18;
                                    create$default = null;
                                    obj = null;
                                    localParticipant$handleIncomingRpcRequest$1.L$0 = str10;
                                    localParticipant$handleIncomingRpcRequest$1.L$1 = obj;
                                    localParticipant$handleIncomingRpcRequest$1.L$2 = obj;
                                    localParticipant$handleIncomingRpcRequest$1.L$3 = obj;
                                    localParticipant$handleIncomingRpcRequest$1.L$4 = obj;
                                    localParticipant$handleIncomingRpcRequest$1.label = 5;
                                    String str19222 = str10;
                                    m2589publishRpcResponseiYZDETE3 = localParticipant2.m2589publishRpcResponseiYZDETE(str11, str19222, str16, create$default, localParticipant$handleIncomingRpcRequest$1);
                                    str17 = str19222;
                                }
                            } else {
                                str14 = (String) localParticipant$handleIncomingRpcRequest$1.L$0;
                                sn.a.g(obj2);
                                m2589publishRpcResponseiYZDETE = ((sn.m) obj2).f31603a;
                                if (m2589publishRpcResponseiYZDETE instanceof sn.l) {
                                    LKLog.Companion companion4 = LKLog.INSTANCE;
                                    Throwable a11 = sn.m.a(m2589publishRpcResponseiYZDETE);
                                    if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                        et.d.f(a11, f.c('.', "Error sending error response for request ", str14), new Object[0]);
                                        return zVar;
                                    }
                                }
                                return zVar;
                            }
                        } else {
                            str15 = (String) localParticipant$handleIncomingRpcRequest$1.L$0;
                            sn.a.g(obj2);
                            m2589publishRpcResponseiYZDETE2 = ((sn.m) obj2).f31603a;
                            if (m2589publishRpcResponseiYZDETE2 instanceof sn.l) {
                                LKLog.Companion companion5 = LKLog.INSTANCE;
                                Throwable a12 = sn.m.a(m2589publishRpcResponseiYZDETE2);
                                if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                    et.d.f(a12, f.c('.', "Error sending error response for request ", str15), new Object[0]);
                                    return zVar;
                                }
                            }
                            return zVar;
                        }
                    } else {
                        i12 = localParticipant$handleIncomingRpcRequest$1.I$0;
                        j10 = localParticipant$handleIncomingRpcRequest$1.J$0;
                        str8 = (String) localParticipant$handleIncomingRpcRequest$1.L$4;
                        String str20 = (String) localParticipant$handleIncomingRpcRequest$1.L$3;
                        str7 = (String) localParticipant$handleIncomingRpcRequest$1.L$2;
                        str6 = (String) localParticipant$handleIncomingRpcRequest$1.L$1;
                        LocalParticipant localParticipant3 = (LocalParticipant) localParticipant$handleIncomingRpcRequest$1.L$0;
                        sn.a.g(obj2);
                        m2586publishRpcAcksjKNNEs = ((sn.m) obj2).f31603a;
                        str5 = str20;
                        localParticipant = localParticipant3;
                    }
                } else {
                    sn.a.g(obj2);
                    localParticipant$handleIncomingRpcRequest$1.L$0 = this;
                    localParticipant$handleIncomingRpcRequest$1.L$1 = str;
                    localParticipant$handleIncomingRpcRequest$1.L$2 = str2;
                    str5 = str3;
                    localParticipant$handleIncomingRpcRequest$1.L$3 = str5;
                    localParticipant$handleIncomingRpcRequest$1.L$4 = str4;
                    j10 = j4;
                    localParticipant$handleIncomingRpcRequest$1.J$0 = j10;
                    localParticipant$handleIncomingRpcRequest$1.I$0 = i10;
                    localParticipant$handleIncomingRpcRequest$1.label = 1;
                    m2586publishRpcAcksjKNNEs = m2586publishRpcAcksjKNNEs(str, str2, localParticipant$handleIncomingRpcRequest$1);
                    if (m2586publishRpcAcksjKNNEs != aVar) {
                        str6 = str;
                        i12 = i10;
                        str7 = str2;
                        str8 = str4;
                        localParticipant = this;
                    }
                    return aVar;
                }
                if (!(m2586publishRpcAcksjKNNEs instanceof sn.l)) {
                    LKLog.Companion companion6 = LKLog.INSTANCE;
                    Throwable a13 = sn.m.a(m2586publishRpcAcksjKNNEs);
                    if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                        et.d.f(a13, f.c('.', "Error sending ack for request ", str7), new Object[0]);
                        return zVar;
                    }
                    return zVar;
                }
                if (i12 != 1) {
                    RpcError create$default2 = RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.UNSUPPORTED_VERSION, null, null, 3, null);
                    localParticipant$handleIncomingRpcRequest$1.L$0 = str7;
                    localParticipant$handleIncomingRpcRequest$1.L$1 = null;
                    localParticipant$handleIncomingRpcRequest$1.L$2 = null;
                    localParticipant$handleIncomingRpcRequest$1.L$3 = null;
                    localParticipant$handleIncomingRpcRequest$1.L$4 = null;
                    localParticipant$handleIncomingRpcRequest$1.label = 2;
                    m2589publishRpcResponseiYZDETE2 = localParticipant.m2589publishRpcResponseiYZDETE(str6, str7, null, create$default2, localParticipant$handleIncomingRpcRequest$1);
                    if (m2589publishRpcResponseiYZDETE2 != aVar) {
                        str15 = str7;
                        if (m2589publishRpcResponseiYZDETE2 instanceof sn.l) {
                        }
                        return zVar;
                    }
                } else {
                    LocalParticipant localParticipant4 = localParticipant;
                    p pVar = localParticipant4.rpcHandlers.get(str5);
                    if (pVar == null) {
                        RpcError create$default3 = RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.UNSUPPORTED_METHOD, null, null, 3, null);
                        localParticipant$handleIncomingRpcRequest$1.L$0 = str7;
                        localParticipant$handleIncomingRpcRequest$1.L$1 = null;
                        localParticipant$handleIncomingRpcRequest$1.L$2 = null;
                        localParticipant$handleIncomingRpcRequest$1.L$3 = null;
                        localParticipant$handleIncomingRpcRequest$1.L$4 = null;
                        localParticipant$handleIncomingRpcRequest$1.label = 3;
                        m2589publishRpcResponseiYZDETE = localParticipant4.m2589publishRpcResponseiYZDETE(str6, str7, null, create$default3, localParticipant$handleIncomingRpcRequest$1);
                        if (m2589publishRpcResponseiYZDETE != aVar) {
                            str14 = str7;
                            if (m2589publishRpcResponseiYZDETE instanceof sn.l) {
                            }
                            return zVar;
                        }
                    } else {
                        try {
                            str12 = str7;
                            str13 = str6;
                        } catch (Exception e11) {
                            e = e11;
                        }
                        try {
                            RpcInvocationData rpcInvocationData = new RpcInvocationData(str12, str13, str8, j10, null);
                            localParticipant$handleIncomingRpcRequest$1.L$0 = localParticipant4;
                            localParticipant$handleIncomingRpcRequest$1.L$1 = str6;
                            localParticipant$handleIncomingRpcRequest$1.L$2 = str7;
                            localParticipant$handleIncomingRpcRequest$1.L$3 = str5;
                            localParticipant$handleIncomingRpcRequest$1.L$4 = null;
                            localParticipant$handleIncomingRpcRequest$1.label = 4;
                            Object invoke = pVar.invoke(rpcInvocationData, localParticipant$handleIncomingRpcRequest$1);
                            if (invoke != aVar) {
                                str9 = str5;
                                str10 = str7;
                                localParticipant2 = localParticipant4;
                                str11 = str6;
                                obj2 = invoke;
                                str18 = (String) obj2;
                                if (StringByteUtilsKt.byteLength(str18) <= 15360) {
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str7 = str12;
                            str6 = str13;
                            str9 = str5;
                            str10 = str7;
                            localParticipant2 = localParticipant4;
                            str11 = str6;
                            if (!(e instanceof RpcError)) {
                            }
                        }
                    }
                }
                return aVar;
            }
        }
        localParticipant$handleIncomingRpcRequest$1 = new LocalParticipant$handleIncomingRpcRequest$1(this, cVar);
        Object obj22 = localParticipant$handleIncomingRpcRequest$1.result;
        i11 = localParticipant$handleIncomingRpcRequest$1.label;
        sn.z zVar2 = sn.z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
        if (i11 == 0) {
        }
        if (!(m2586publishRpcAcksjKNNEs instanceof sn.l)) {
        }
    }

    private final void handleIncomingRpcResponse(String requestId, String payload, RpcError error) {
        PendingRpcResponse remove = this.pendingResponses.remove(requestId);
        if (remove != null) {
            remove.getOnResolve().invoke(payload, error);
            return;
        }
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
            et.d.b(null, f.i("Response received for unexpected RPC request, id = ", requestId), new Object[0]);
        }
    }

    private final boolean hasPermissionsToPublish(Track.Source source) {
        ParticipantPermission permissions = getPermissions();
        if (permissions == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "No permissions present for publishing track.", new Object[0]);
                return false;
            }
        } else {
            boolean canPublish = permissions.getCanPublish();
            List<Track.Source> canPublishSources = permissions.getCanPublishSources();
            boolean contains = canPublishSources.contains(source);
            if (canPublish && (canPublishSources.isEmpty() || contains)) {
                return true;
            }
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "insufficient permissions to publish", new Object[0]);
            }
        }
        return false;
    }

    private final void publishAdditionalCodecForTrack(LocalVideoTrack track, VideoCodec codec, VideoTrackPublishOptions options) {
        TrackPublication trackPublication = getTrackPublications().get(track.getSid());
        if (trackPublication == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "attempting to publish additional codec for non-published track?!", new Object[0]);
                return;
            }
            return;
        }
        k computeTrackBackupOptionsAndEncodings = computeTrackBackupOptionsAndEncodings(track, codec, options);
        if (computeTrackBackupOptionsAndEncodings == null) {
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.INFO.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.c(null, "backup codec has been disabled, ignoring request to add additional codec for track", new Object[0]);
                return;
            }
            return;
        }
        VideoTrackPublishOptions videoTrackPublishOptions = (VideoTrackPublishOptions) computeTrackBackupOptionsAndEncodings.f31600a;
        List<? extends RtpParameters.Encoding> list = (List) computeTrackBackupOptionsAndEncodings.f31601b;
        SimulcastTrackInfo addSimulcastTrack$livekit_android_sdk_release = track.addSimulcastTrack$livekit_android_sdk_release(codec, list);
        g0.D(getScope(), null, null, new LocalParticipant$publishAdditionalCodecForTrack$1(this, track, new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, ig.f.H(getSid()), list), codec, trackPublication, list, videoTrackPublishOptions, addSimulcastTrack$livekit_android_sdk_release, options, null), 3);
    }

    public static /* synthetic */ Object publishAudioTrack$default(LocalParticipant localParticipant, LocalAudioTrack localAudioTrack, AudioTrackPublishOptions audioTrackPublishOptions, PublishListener publishListener, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            audioTrackPublishOptions = AudioTrackPublishOptions.copy$default(new AudioTrackPublishOptions(null, localParticipant.getAudioTrackPublishDefaults(), null, null, 12, null), null, null, false, false, null, null, localParticipant.defaultsManager.getIsPrerecording(), 63, null);
        }
        if ((i10 & 4) != 0) {
            publishListener = null;
        }
        return localParticipant.publishAudioTrack(localAudioTrack, audioTrackPublishOptions, publishListener, cVar);
    }

    /* renamed from: publishData-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m2585publishDatayxL6bBk$default(LocalParticipant localParticipant, byte[] bArr, DataPublishReliability dataPublishReliability, String str, List list, c cVar, int i10, Object obj) {
        String str2;
        List list2;
        if ((i10 & 2) != 0) {
            dataPublishReliability = DataPublishReliability.RELIABLE;
        }
        DataPublishReliability dataPublishReliability2 = dataPublishReliability;
        if ((i10 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i10 & 8) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        return localParticipant.m2592publishDatayxL6bBk(bArr, dataPublishReliability2, str2, list2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: publishRpcAck-sjKNNEs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2586publishRpcAcksjKNNEs(String str, String str2, c<? super sn.m> cVar) {
        LocalParticipant$publishRpcAck$1 localParticipant$publishRpcAck$1;
        int i10;
        if (cVar instanceof LocalParticipant$publishRpcAck$1) {
            localParticipant$publishRpcAck$1 = (LocalParticipant$publishRpcAck$1) cVar;
            int i11 = localParticipant$publishRpcAck$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localParticipant$publishRpcAck$1.label = i11 - Integer.MIN_VALUE;
                Object obj = localParticipant$publishRpcAck$1.result;
                i10 = localParticipant$publishRpcAck$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        return ((sn.m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                livekit.a newBuilder = LivekitModels$DataPacket.newBuilder();
                newBuilder.c(str);
                newBuilder.f(c7.RELIABLE);
                k8 newBuilder2 = LivekitModels$RpcAck.newBuilder();
                newBuilder2.b(str2);
                newBuilder.h((LivekitModels$RpcAck) newBuilder2.build());
                LivekitModels$DataPacket livekitModels$DataPacket = (LivekitModels$DataPacket) newBuilder.build();
                livekitModels$DataPacket.getClass();
                localParticipant$publishRpcAck$1.label = 1;
                Object m2590rpcSendDatagIAlus = m2590rpcSendDatagIAlus(livekitModels$DataPacket, localParticipant$publishRpcAck$1);
                Object obj2 = xn.a.f37986a;
                if (m2590rpcSendDatagIAlus == obj2) {
                    return obj2;
                }
                return m2590rpcSendDatagIAlus;
            }
        }
        localParticipant$publishRpcAck$1 = new LocalParticipant$publishRpcAck$1(this, cVar);
        Object obj3 = localParticipant$publishRpcAck$1.result;
        i10 = localParticipant$publishRpcAck$1.label;
        if (i10 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: publishRpcRequest-k7jHMGI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2587publishRpcRequestk7jHMGI(String str, String str2, String str3, String str4, long j4, c<? super sn.m> cVar) {
        LocalParticipant$publishRpcRequest$1 localParticipant$publishRpcRequest$1;
        int i10;
        if (cVar instanceof LocalParticipant$publishRpcRequest$1) {
            localParticipant$publishRpcRequest$1 = (LocalParticipant$publishRpcRequest$1) cVar;
            int i11 = localParticipant$publishRpcRequest$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localParticipant$publishRpcRequest$1.label = i11 - Integer.MIN_VALUE;
                Object obj = localParticipant$publishRpcRequest$1.result;
                i10 = localParticipant$publishRpcRequest$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        return ((sn.m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                if (StringByteUtilsKt.byteLength(str4) <= 15360) {
                    livekit.a newBuilder = LivekitModels$DataPacket.newBuilder();
                    newBuilder.c(str);
                    newBuilder.f(c7.RELIABLE);
                    m8 newBuilder2 = LivekitModels$RpcRequest.newBuilder();
                    newBuilder2.b(str2);
                    newBuilder2.c(str3);
                    newBuilder2.d(str4);
                    newBuilder2.e((int) b.d(j4));
                    newBuilder2.f();
                    newBuilder.i((LivekitModels$RpcRequest) newBuilder2.build());
                    LivekitModels$DataPacket livekitModels$DataPacket = (LivekitModels$DataPacket) newBuilder.build();
                    livekitModels$DataPacket.getClass();
                    localParticipant$publishRpcRequest$1.label = 1;
                    Object m2590rpcSendDatagIAlus = m2590rpcSendDatagIAlus(livekitModels$DataPacket, localParticipant$publishRpcRequest$1);
                    Object obj2 = xn.a.f37986a;
                    if (m2590rpcSendDatagIAlus == obj2) {
                        return obj2;
                    }
                    return m2590rpcSendDatagIAlus;
                }
                c6.t("cannot publish data larger than 15360");
                return null;
            }
        }
        localParticipant$publishRpcRequest$1 = new LocalParticipant$publishRpcRequest$1(this, cVar);
        Object obj3 = localParticipant$publishRpcRequest$1.result;
        i10 = localParticipant$publishRpcRequest$1.label;
        if (i10 == 0) {
        }
    }

    /* renamed from: publishRpcRequest-k7jHMGI$default, reason: not valid java name */
    public static /* synthetic */ Object m2588publishRpcRequestk7jHMGI$default(LocalParticipant localParticipant, String str, String str2, String str3, String str4, long j4, c cVar, int i10, Object obj) {
        long j10;
        if ((i10 & 16) != 0) {
            xq.a aVar = b.f38124b;
            j10 = g.n(10, xq.d.SECONDS);
        } else {
            j10 = j4;
        }
        return localParticipant.m2587publishRpcRequestk7jHMGI(str, str2, str3, str4, j10, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: publishRpcResponse-iYZDETE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2589publishRpcResponseiYZDETE(String str, String str2, String str3, RpcError rpcError, c<? super sn.m> cVar) {
        LocalParticipant$publishRpcResponse$1 localParticipant$publishRpcResponse$1;
        int i10;
        if (cVar instanceof LocalParticipant$publishRpcResponse$1) {
            localParticipant$publishRpcResponse$1 = (LocalParticipant$publishRpcResponse$1) cVar;
            int i11 = localParticipant$publishRpcResponse$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localParticipant$publishRpcResponse$1.label = i11 - Integer.MIN_VALUE;
                Object obj = localParticipant$publishRpcResponse$1.result;
                i10 = localParticipant$publishRpcResponse$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        return ((sn.m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                if (StringByteUtilsKt.byteLength(str3) <= 15360) {
                    livekit.a newBuilder = LivekitModels$DataPacket.newBuilder();
                    newBuilder.c(str);
                    newBuilder.f(c7.RELIABLE);
                    n8 newBuilder2 = LivekitModels$RpcResponse.newBuilder();
                    newBuilder2.d(str2);
                    if (rpcError != null) {
                        newBuilder2.b(rpcError.toProto());
                    } else {
                        if (str3 == null) {
                            str3 = "";
                        }
                        newBuilder2.c(str3);
                    }
                    newBuilder.j((LivekitModels$RpcResponse) newBuilder2.build());
                    LivekitModels$DataPacket livekitModels$DataPacket = (LivekitModels$DataPacket) newBuilder.build();
                    livekitModels$DataPacket.getClass();
                    localParticipant$publishRpcResponse$1.label = 1;
                    Object m2590rpcSendDatagIAlus = m2590rpcSendDatagIAlus(livekitModels$DataPacket, localParticipant$publishRpcResponse$1);
                    Object obj2 = xn.a.f37986a;
                    if (m2590rpcSendDatagIAlus == obj2) {
                        return obj2;
                    }
                    return m2590rpcSendDatagIAlus;
                }
                c6.t("cannot publish data larger than 15360");
                return null;
            }
        }
        localParticipant$publishRpcResponse$1 = new LocalParticipant$publishRpcResponse$1(this, cVar);
        Object obj3 = localParticipant$publishRpcResponse$1.result;
        i10 = localParticipant$publishRpcResponse$1.label;
        if (i10 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object publishTrackImpl(Track track, TrackPublishOptions trackPublishOptions, l lVar, List<? extends RtpParameters.Encoding> list, PublishListener publishListener, c<? super LocalTrackPublication> cVar) {
        LocalParticipant$publishTrackImpl$1 localParticipant$publishTrackImpl$1;
        int i10;
        Track track2;
        PublishListener publishListener2;
        d0 d0Var;
        String str;
        d0 d0Var2;
        LocalParticipant localParticipant;
        Track track3;
        d0 d0Var3;
        PublishListener publishListener3;
        LivekitModels$TrackInfo livekitModels$TrackInfo;
        LivekitModels$TrackInfo livekitModels$TrackInfo2;
        LocalParticipant localParticipant2;
        Track track4;
        PublishListener publishListener4;
        String str2;
        String mimeTypeToVideoCodec;
        if (cVar instanceof LocalParticipant$publishTrackImpl$1) {
            localParticipant$publishTrackImpl$1 = (LocalParticipant$publishTrackImpl$1) cVar;
            int i11 = localParticipant$publishTrackImpl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localParticipant$publishTrackImpl$1.label = i11 - Integer.MIN_VALUE;
                LocalParticipant$publishTrackImpl$1 localParticipant$publishTrackImpl$12 = localParticipant$publishTrackImpl$1;
                Object obj = localParticipant$publishTrackImpl$12.result;
                i10 = localParticipant$publishTrackImpl$12.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                livekitModels$TrackInfo2 = (LivekitModels$TrackInfo) localParticipant$publishTrackImpl$12.L$4;
                                d0Var3 = (d0) localParticipant$publishTrackImpl$12.L$3;
                                publishListener4 = (PublishListener) localParticipant$publishTrackImpl$12.L$2;
                                track4 = (Track) localParticipant$publishTrackImpl$12.L$1;
                                localParticipant2 = (LocalParticipant) localParticipant$publishTrackImpl$12.L$0;
                                sn.a.g(obj);
                                livekitModels$TrackInfo = livekitModels$TrackInfo2;
                                publishListener3 = publishListener4;
                                track3 = track4;
                                localParticipant = localParticipant2;
                                if (livekitModels$TrackInfo != null) {
                                    LocalTrackPublication localTrackPublication = new LocalTrackPublication(livekitModels$TrackInfo, track3, localParticipant, (TrackPublishOptions) d0Var3.f20559a);
                                    localParticipant.addTrackPublication(localTrackPublication);
                                    LKLog.Companion companion = LKLog.INSTANCE;
                                    if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                        et.d.e(null, "add track publication " + localTrackPublication, new Object[0]);
                                    }
                                    if (publishListener3 != null) {
                                        publishListener3.onPublishSuccess(localTrackPublication);
                                    }
                                    ParticipantListener internalListener = localParticipant.getInternalListener();
                                    if (internalListener != null) {
                                        internalListener.onTrackPublished(localTrackPublication, localParticipant);
                                    }
                                    localParticipant.getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.LocalTrackPublished(localParticipant, localTrackPublication), localParticipant.getScope());
                                    return localTrackPublication;
                                }
                            } else {
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            String str3 = (String) localParticipant$publishTrackImpl$12.L$5;
                            d0 d0Var4 = (d0) localParticipant$publishTrackImpl$12.L$4;
                            d0Var2 = (d0) localParticipant$publishTrackImpl$12.L$3;
                            PublishListener publishListener5 = (PublishListener) localParticipant$publishTrackImpl$12.L$2;
                            Track track5 = (Track) localParticipant$publishTrackImpl$12.L$1;
                            LocalParticipant localParticipant3 = (LocalParticipant) localParticipant$publishTrackImpl$12.L$0;
                            sn.a.g(obj);
                            str = str3;
                            publishListener2 = publishListener5;
                            localParticipant = localParticipant3;
                            track2 = track5;
                            d0Var = d0Var4;
                            livekitModels$TrackInfo2 = (LivekitModels$TrackInfo) obj;
                            if (livekitModels$TrackInfo2 == null) {
                                if (d0Var2.f20559a instanceof VideoTrackPublishOptions) {
                                    List<LivekitModels$SimulcastCodecInfo> codecsList = livekitModels$TrackInfo2.getCodecsList();
                                    codecsList.getClass();
                                    LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo = (LivekitModels$SimulcastCodecInfo) o.y0(codecsList);
                                    if (livekitModels$SimulcastCodecInfo != null) {
                                        str2 = livekitModels$SimulcastCodecInfo.getMimeType();
                                    } else {
                                        str2 = null;
                                    }
                                    if (str2 != null && (mimeTypeToVideoCodec = PublishUtilsKt.mimeTypeToVideoCodec(str2)) != null && !mimeTypeToVideoCodec.equals(((VideoTrackPublishOptions) d0Var2.f20559a).getVideoCodec())) {
                                        LKLog.Companion companion2 = LKLog.INSTANCE;
                                        if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                            et.d.a(null, "falling back to server selected codec: ".concat(mimeTypeToVideoCodec), new Object[0]);
                                        }
                                        d0Var2.f20559a = VideoTrackPublishOptions.copy$default((VideoTrackPublishOptions) d0Var2.f20559a, null, null, false, mimeTypeToVideoCodec, null, null, null, null, null, null, 1015, null);
                                        track2.getClass();
                                        LocalVideoTrack localVideoTrack = (LocalVideoTrack) track2;
                                        d0Var.f20559a = localParticipant.computeVideoEncodings(localVideoTrack.getOptions().isScreencast(), localVideoTrack.getDimensions(), (VideoTrackPublishOptions) d0Var2.f20559a);
                                    }
                                }
                                localParticipant$publishTrackImpl$12.L$0 = localParticipant;
                                localParticipant$publishTrackImpl$12.L$1 = track2;
                                localParticipant$publishTrackImpl$12.L$2 = publishListener2;
                                localParticipant$publishTrackImpl$12.L$3 = d0Var2;
                                localParticipant$publishTrackImpl$12.L$4 = livekitModels$TrackInfo2;
                                localParticipant$publishTrackImpl$12.L$5 = null;
                                localParticipant$publishTrackImpl$12.label = 3;
                                d0 d0Var5 = d0Var2;
                                if (publishTrackImpl$negotiate(localParticipant, d0Var, track2, d0Var5, str, publishListener2, localParticipant$publishTrackImpl$12) != aVar) {
                                    localParticipant2 = localParticipant;
                                    track4 = track2;
                                    d0Var3 = d0Var5;
                                    publishListener4 = publishListener2;
                                    livekitModels$TrackInfo = livekitModels$TrackInfo2;
                                    publishListener3 = publishListener4;
                                    track3 = track4;
                                    localParticipant = localParticipant2;
                                    if (livekitModels$TrackInfo != null) {
                                    }
                                }
                                return aVar;
                            }
                            d0 d0Var6 = d0Var2;
                            livekitModels$TrackInfo = livekitModels$TrackInfo2;
                            track3 = track2;
                            d0Var3 = d0Var6;
                            publishListener3 = publishListener2;
                            if (livekitModels$TrackInfo != null) {
                            }
                        }
                    } else {
                        d0 d0Var7 = (d0) localParticipant$publishTrackImpl$12.L$3;
                        PublishListener publishListener6 = (PublishListener) localParticipant$publishTrackImpl$12.L$2;
                        track3 = (Track) localParticipant$publishTrackImpl$12.L$1;
                        localParticipant = (LocalParticipant) localParticipant$publishTrackImpl$12.L$0;
                        sn.a.g(obj);
                        d0Var3 = d0Var7;
                        publishListener3 = publishListener6;
                        livekitModels$TrackInfo = (LivekitModels$TrackInfo) obj;
                        if (livekitModels$TrackInfo != null) {
                        }
                    }
                } else {
                    sn.a.g(obj);
                    if (track.isDisposed$livekit_android_sdk_release()) {
                        LKLog.Companion companion3 = LKLog.INSTANCE;
                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                            et.d.f(null, "Attempting to publish a disposed track, ignoring.", new Object[0]);
                            return null;
                        }
                    } else {
                        jb newBuilder = LivekitRtc$AddTrackRequest.newBuilder();
                        newBuilder.getClass();
                        lVar.invoke(newBuilder);
                        Track.Source.Companion companion4 = Track.Source.INSTANCE;
                        d9 f10 = newBuilder.f();
                        if (f10 == null) {
                            f10 = d9.UNRECOGNIZED;
                        }
                        if (hasPermissionsToPublish(companion4.fromProto(f10))) {
                            ?? obj2 = new Object();
                            obj2.f20559a = trackPublishOptions;
                            ?? obj3 = new Object();
                            obj3.f20559a = list;
                            List<LocalTrackPublication> localTrackPublications = getLocalTrackPublications();
                            if (localTrackPublications == null || !localTrackPublications.isEmpty()) {
                                Iterator<T> it = localTrackPublications.iterator();
                                while (it.hasNext()) {
                                    if (m.c(((LocalTrackPublication) it.next()).getTrack(), track)) {
                                        publishTrackImpl$onPublishFailure(publishListener, this, track, new TrackException.PublishException("Track has already been published", null, 2, null), false);
                                        return null;
                                    }
                                }
                            }
                            if (this.engine.getConnectionState() == ConnectionState.DISCONNECTED) {
                                publishTrackImpl$onPublishFailure$default(publishListener, this, track, new TrackException.PublishException("Not connected!", null, 2, null), false, 16, null);
                                return null;
                            }
                            try {
                                String id2 = track.getRtcTrack().id();
                                List<LivekitModels$Codec> list2 = this.enabledPublishVideoCodecs;
                                list2.getClass();
                                if (!list2.isEmpty()) {
                                    LocalParticipant$publishTrackImpl$4 localParticipant$publishTrackImpl$4 = new LocalParticipant$publishTrackImpl$4(this, obj3, track, obj2, id2, publishListener, newBuilder, null);
                                    track3 = track;
                                    d0Var3 = obj2;
                                    publishListener3 = publishListener;
                                    localParticipant$publishTrackImpl$12.L$0 = this;
                                    localParticipant$publishTrackImpl$12.L$1 = track3;
                                    localParticipant$publishTrackImpl$12.L$2 = publishListener3;
                                    localParticipant$publishTrackImpl$12.L$3 = d0Var3;
                                    localParticipant$publishTrackImpl$12.label = 1;
                                    obj = g0.l(localParticipant$publishTrackImpl$4, localParticipant$publishTrackImpl$12);
                                    if (obj != aVar) {
                                        localParticipant = this;
                                        livekitModels$TrackInfo = (LivekitModels$TrackInfo) obj;
                                        if (livekitModels$TrackInfo != null) {
                                        }
                                    }
                                } else {
                                    localParticipant$publishTrackImpl$12.L$0 = this;
                                    localParticipant$publishTrackImpl$12.L$1 = track;
                                    localParticipant$publishTrackImpl$12.L$2 = publishListener;
                                    localParticipant$publishTrackImpl$12.L$3 = obj2;
                                    localParticipant$publishTrackImpl$12.L$4 = obj3;
                                    localParticipant$publishTrackImpl$12.L$5 = id2;
                                    localParticipant$publishTrackImpl$12.label = 2;
                                    Object publishTrackImpl$requestAddTrack = publishTrackImpl$requestAddTrack(this, id2, obj2, track, newBuilder, publishListener, localParticipant$publishTrackImpl$12);
                                    if (publishTrackImpl$requestAddTrack != aVar) {
                                        track2 = track;
                                        publishListener2 = publishListener;
                                        d0Var = obj3;
                                        str = id2;
                                        d0Var2 = obj2;
                                        obj = publishTrackImpl$requestAddTrack;
                                        localParticipant = this;
                                        livekitModels$TrackInfo2 = (LivekitModels$TrackInfo) obj;
                                        if (livekitModels$TrackInfo2 == null) {
                                        }
                                    }
                                }
                                return aVar;
                            } catch (Exception e10) {
                                publishTrackImpl$onPublishFailure$default(publishListener, this, track, new TrackException.PublishException("Failed to get track id", e10), false, 16, null);
                                return null;
                            }
                        }
                        TrackException.PublishException publishException = new TrackException.PublishException("Failed to publish track, insufficient permissions", null, 2, null);
                        publishTrackImpl$onPublishFailure$default(publishListener, this, track, publishException, false, 16, null);
                        throw publishException;
                    }
                }
                return null;
            }
        }
        localParticipant$publishTrackImpl$1 = new LocalParticipant$publishTrackImpl$1(this, cVar);
        LocalParticipant$publishTrackImpl$1 localParticipant$publishTrackImpl$122 = localParticipant$publishTrackImpl$1;
        Object obj4 = localParticipant$publishTrackImpl$122.result;
        i10 = localParticipant$publishTrackImpl$122.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        return null;
    }

    public static /* synthetic */ Object publishTrackImpl$default(LocalParticipant localParticipant, Track track, TrackPublishOptions trackPublishOptions, l lVar, List list, PublishListener publishListener, c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            list = t.f33547a;
        }
        List list2 = list;
        if ((i10 & 16) != 0) {
            publishListener = null;
        }
        return localParticipant.publishTrackImpl(track, trackPublishOptions, lVar, list2, publishListener, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object publishTrackImpl$negotiate(LocalParticipant localParticipant, d0 d0Var, Track track, d0 d0Var2, String str, PublishListener publishListener, c<? super sn.z> cVar) {
        LocalParticipant$publishTrackImpl$negotiate$1 localParticipant$publishTrackImpl$negotiate$1;
        int i10;
        Track track2;
        RtpTransceiver rtpTransceiver;
        int i11;
        if (cVar instanceof LocalParticipant$publishTrackImpl$negotiate$1) {
            localParticipant$publishTrackImpl$negotiate$1 = (LocalParticipant$publishTrackImpl$negotiate$1) cVar;
            int i12 = localParticipant$publishTrackImpl$negotiate$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                localParticipant$publishTrackImpl$negotiate$1.label = i12 - Integer.MIN_VALUE;
                Object obj = localParticipant$publishTrackImpl$negotiate$1.result;
                i10 = localParticipant$publishTrackImpl$negotiate$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        publishListener = (PublishListener) localParticipant$publishTrackImpl$negotiate$1.L$5;
                        str = (String) localParticipant$publishTrackImpl$negotiate$1.L$4;
                        d0Var2 = (d0) localParticipant$publishTrackImpl$negotiate$1.L$3;
                        track = (Track) localParticipant$publishTrackImpl$negotiate$1.L$2;
                        d0Var = (d0) localParticipant$publishTrackImpl$negotiate$1.L$1;
                        localParticipant = (LocalParticipant) localParticipant$publishTrackImpl$negotiate$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    if (localParticipant.engine.getPublisher() != null) {
                        RtpTransceiver.RtpTransceiverInit rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, ig.f.H(localParticipant.getSid()), (List) d0Var.f20559a);
                        RTCEngine rTCEngine = localParticipant.engine;
                        MediaStreamTrack rtcTrack = track.getRtcTrack();
                        localParticipant$publishTrackImpl$negotiate$1.L$0 = localParticipant;
                        localParticipant$publishTrackImpl$negotiate$1.L$1 = d0Var;
                        localParticipant$publishTrackImpl$negotiate$1.L$2 = track;
                        localParticipant$publishTrackImpl$negotiate$1.L$3 = d0Var2;
                        localParticipant$publishTrackImpl$negotiate$1.L$4 = str;
                        localParticipant$publishTrackImpl$negotiate$1.L$5 = publishListener;
                        localParticipant$publishTrackImpl$negotiate$1.label = 1;
                        obj = rTCEngine.createSenderTransceiver$livekit_android_sdk_release(rtcTrack, rtpTransceiverInit, localParticipant$publishTrackImpl$negotiate$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        c6.x("publisher is not configured yet!");
                        return null;
                    }
                }
                LocalParticipant localParticipant2 = localParticipant;
                track2 = track;
                PublishListener publishListener2 = publishListener;
                rtpTransceiver = (RtpTransceiver) obj;
                if (!(track2 instanceof LocalVideoTrack)) {
                    ((LocalVideoTrack) track2).setTransceiver$livekit_android_sdk_release(rtpTransceiver);
                } else if (track2 instanceof LocalAudioTrack) {
                    ((LocalAudioTrack) track2).setTransceiver$livekit_android_sdk_release(rtpTransceiver);
                } else {
                    c6.k(track2.getClass(), "Trying to publish a non local track of type ");
                    return null;
                }
                Integer num = null;
                if (rtpTransceiver == null) {
                    RTCEngine rTCEngine2 = localParticipant2.engine;
                    RtpSender sender = rtpTransceiver.getSender();
                    sender.getClass();
                    track2.setStatsGetter(rTCEngine2.createStatsGetter(sender));
                    TrackPublishOptions trackPublishOptions = (TrackPublishOptions) d0Var2.f20559a;
                    if (!((Collection) d0Var.f20559a).isEmpty() && (trackPublishOptions instanceof VideoTrackPublishOptions)) {
                        VideoTrackPublishOptions videoTrackPublishOptions = (VideoTrackPublishOptions) trackPublishOptions;
                        if (PeerConnectionTransportKt.isSVCCodec(videoTrackPublishOptions.getVideoCodec())) {
                            RtpParameters.Encoding encoding = (RtpParameters.Encoding) o.y0((List) d0Var.f20559a);
                            if (encoding != null) {
                                num = encoding.maxBitrateBps;
                            }
                            if (num != null) {
                                RTCEngine rTCEngine3 = localParticipant2.engine;
                                str.getClass();
                                String videoCodec = videoTrackPublishOptions.getVideoCodec();
                                Integer num2 = ((RtpParameters.Encoding) o.w0((List) d0Var.f20559a)).maxBitrateBps;
                                if (num2 != null) {
                                    i11 = num2.intValue() / SignalClient.CLOSE_REASON_NORMAL_CLOSURE;
                                } else {
                                    i11 = 0;
                                }
                                rTCEngine3.registerTrackBitrateInfo$livekit_android_sdk_release(str, new TrackBitrateInfo(videoCodec, i11));
                            }
                        }
                    }
                    if (trackPublishOptions instanceof VideoTrackPublishOptions) {
                        VideoTrackPublishOptions videoTrackPublishOptions2 = (VideoTrackPublishOptions) trackPublishOptions;
                        RtpTransceiverExtKt.sortVideoCodecPreferences(rtpTransceiver, videoTrackPublishOptions2.getVideoCodec(), localParticipant2.capabilitiesGetter);
                        ((LocalVideoTrack) track2).setCodec$livekit_android_sdk_release(videoTrackPublishOptions2.getVideoCodec());
                        RtpParameters parameters = rtpTransceiver.getSender().getParameters();
                        parameters.degradationPreference = videoTrackPublishOptions2.getDegradationPreference();
                        rtpTransceiver.getSender().setParameters(parameters);
                    }
                    return sn.z.f31622a;
                }
                TrackException.PublishException publishException = new TrackException.PublishException("null sender returned from peer connection", null, 2, null);
                publishTrackImpl$onPublishFailure$default(publishListener2, localParticipant2, track2, publishException, false, 16, null);
                throw publishException;
            }
        }
        localParticipant$publishTrackImpl$negotiate$1 = new LocalParticipant$publishTrackImpl$negotiate$1(cVar);
        Object obj2 = localParticipant$publishTrackImpl$negotiate$1.result;
        i10 = localParticipant$publishTrackImpl$negotiate$1.label;
        if (i10 == 0) {
        }
        LocalParticipant localParticipant22 = localParticipant;
        track2 = track;
        PublishListener publishListener22 = publishListener;
        rtpTransceiver = (RtpTransceiver) obj2;
        if (!(track2 instanceof LocalVideoTrack)) {
        }
        Integer num3 = null;
        if (rtpTransceiver == null) {
        }
    }

    private static final void publishTrackImpl$onPublishFailure(PublishListener publishListener, LocalParticipant localParticipant, Track track, TrackException.PublishException publishException, boolean z6) {
        if (publishListener != null) {
            publishListener.onPublishFailure(publishException);
        }
        if (z6) {
            localParticipant.getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.LocalTrackPublicationFailed(localParticipant, track, publishException), localParticipant.getScope());
        }
    }

    public static /* synthetic */ void publishTrackImpl$onPublishFailure$default(PublishListener publishListener, LocalParticipant localParticipant, Track track, TrackException.PublishException publishException, boolean z6, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z6 = true;
        }
        publishTrackImpl$onPublishFailure(publishListener, localParticipant, track, publishException, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object publishTrackImpl$requestAddTrack(LocalParticipant localParticipant, String str, d0 d0Var, Track track, jb jbVar, PublishListener publishListener, c<? super LivekitModels$TrackInfo> cVar) {
        LocalParticipant$publishTrackImpl$requestAddTrack$1 localParticipant$publishTrackImpl$requestAddTrack$1;
        int i10;
        try {
            if (cVar instanceof LocalParticipant$publishTrackImpl$requestAddTrack$1) {
                localParticipant$publishTrackImpl$requestAddTrack$1 = (LocalParticipant$publishTrackImpl$requestAddTrack$1) cVar;
                int i11 = localParticipant$publishTrackImpl$requestAddTrack$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    localParticipant$publishTrackImpl$requestAddTrack$1.label = i11 - Integer.MIN_VALUE;
                    LocalParticipant$publishTrackImpl$requestAddTrack$1 localParticipant$publishTrackImpl$requestAddTrack$12 = localParticipant$publishTrackImpl$requestAddTrack$1;
                    Object obj = localParticipant$publishTrackImpl$requestAddTrack$12.result;
                    i10 = localParticipant$publishTrackImpl$requestAddTrack$12.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            publishListener = (PublishListener) localParticipant$publishTrackImpl$requestAddTrack$12.L$2;
                            track = (Track) localParticipant$publishTrackImpl$requestAddTrack$12.L$1;
                            localParticipant = (LocalParticipant) localParticipant$publishTrackImpl$requestAddTrack$12.L$0;
                            sn.a.g(obj);
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        RTCEngine rTCEngine = localParticipant.engine;
                        str.getClass();
                        String name = ((TrackPublishOptions) d0Var.f20559a).getName();
                        if (name == null) {
                            name = track.getName();
                        }
                        e9 proto = track.getKind().toProto();
                        String stream = ((TrackPublishOptions) d0Var.f20559a).getStream();
                        jbVar.getClass();
                        localParticipant$publishTrackImpl$requestAddTrack$12.L$0 = localParticipant;
                        localParticipant$publishTrackImpl$requestAddTrack$12.L$1 = track;
                        localParticipant$publishTrackImpl$requestAddTrack$12.L$2 = publishListener;
                        localParticipant$publishTrackImpl$requestAddTrack$12.label = 1;
                        obj = rTCEngine.addTrack(str, name, proto, stream, jbVar, localParticipant$publishTrackImpl$requestAddTrack$12);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return (LivekitModels$TrackInfo) obj;
                }
            }
            if (i10 == 0) {
            }
            return (LivekitModels$TrackInfo) obj;
        } catch (Exception e10) {
            publishTrackImpl$onPublishFailure$default(publishListener, localParticipant, track, new TrackException.PublishException("Failed to publish track", e10), false, 16, null);
            return null;
        }
        localParticipant$publishTrackImpl$requestAddTrack$1 = new LocalParticipant$publishTrackImpl$requestAddTrack$1(cVar);
        LocalParticipant$publishTrackImpl$requestAddTrack$1 localParticipant$publishTrackImpl$requestAddTrack$122 = localParticipant$publishTrackImpl$requestAddTrack$1;
        Object obj2 = localParticipant$publishTrackImpl$requestAddTrack$122.result;
        i10 = localParticipant$publishTrackImpl$requestAddTrack$122.label;
    }

    public static /* synthetic */ Object publishVideoTrack$default(LocalParticipant localParticipant, LocalVideoTrack localVideoTrack, VideoTrackPublishOptions videoTrackPublishOptions, PublishListener publishListener, c cVar, int i10, Object obj) {
        VideoTrackPublishDefaults videoTrackPublishDefaults;
        if ((i10 & 2) != 0) {
            if (localVideoTrack.getOptions().isScreencast()) {
                videoTrackPublishDefaults = localParticipant.getScreenShareTrackPublishDefaults();
            } else {
                videoTrackPublishDefaults = localParticipant.getVideoTrackPublishDefaults();
            }
            videoTrackPublishOptions = new VideoTrackPublishOptions(null, videoTrackPublishDefaults, null, null, 12, null);
        }
        if ((i10 & 4) != 0) {
            publishListener = null;
        }
        return localParticipant.publishVideoTrack(localVideoTrack, videoTrackPublishOptions, publishListener, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: rpcSendData-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2590rpcSendDatagIAlus(LivekitModels$DataPacket livekitModels$DataPacket, c<? super sn.m> cVar) {
        LocalParticipant$rpcSendData$1 localParticipant$rpcSendData$1;
        int i10;
        Object m2529sendDatagIAlus$livekit_android_sdk_release;
        if (cVar instanceof LocalParticipant$rpcSendData$1) {
            localParticipant$rpcSendData$1 = (LocalParticipant$rpcSendData$1) cVar;
            int i11 = localParticipant$rpcSendData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localParticipant$rpcSendData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = localParticipant$rpcSendData$1.result;
                i10 = localParticipant$rpcSendData$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        m2529sendDatagIAlus$livekit_android_sdk_release = ((sn.m) obj).f31603a;
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    RTCEngine rTCEngine = this.engine;
                    localParticipant$rpcSendData$1.label = 1;
                    m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, localParticipant$rpcSendData$1);
                    xn.a aVar = xn.a.f37986a;
                    if (m2529sendDatagIAlus$livekit_android_sdk_release == aVar) {
                        return aVar;
                    }
                }
                if (!(m2529sendDatagIAlus$livekit_android_sdk_release instanceof sn.l)) {
                    return sn.a.b(RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.SEND_FAILED, null, sn.m.a(m2529sendDatagIAlus$livekit_android_sdk_release), 1, null));
                }
                return m2529sendDatagIAlus$livekit_android_sdk_release;
            }
        }
        localParticipant$rpcSendData$1 = new LocalParticipant$rpcSendData$1(this, cVar);
        Object obj2 = localParticipant$rpcSendData$1.result;
        i10 = localParticipant$rpcSendData$1.label;
        if (i10 == 0) {
        }
        if (!(m2529sendDatagIAlus$livekit_android_sdk_release instanceof sn.l)) {
        }
    }

    public static /* synthetic */ Object setScreenShareEnabled$default(LocalParticipant localParticipant, boolean z6, ScreenCaptureParams screenCaptureParams, c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            screenCaptureParams = null;
        }
        return localParticipant.setScreenShareEnabled(z6, screenCaptureParams, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b5 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:16:0x0048, B:17:0x01ad, B:19:0x01b5, B:21:0x01bb, B:22:0x01be, B:27:0x01c8, B:31:0x006a, B:33:0x0175, B:39:0x007f, B:40:0x01fa, B:42:0x0202, B:43:0x0209, B:45:0x0090, B:46:0x0231, B:48:0x0239, B:49:0x0240, B:51:0x00e1, B:54:0x00ea, B:56:0x00f1, B:58:0x00f9, B:60:0x0101, B:62:0x0107, B:64:0x010a, B:65:0x010e, B:69:0x011c, B:71:0x012c, B:73:0x0132, B:75:0x013d, B:79:0x01cd, B:80:0x01d4, B:81:0x01d5, B:85:0x020c, B:89:0x0245, B:91:0x024b, B:93:0x0253, B:94:0x0257, B:96:0x0262, B:98:0x0266, B:99:0x026b), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c8 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:16:0x0048, B:17:0x01ad, B:19:0x01b5, B:21:0x01bb, B:22:0x01be, B:27:0x01c8, B:31:0x006a, B:33:0x0175, B:39:0x007f, B:40:0x01fa, B:42:0x0202, B:43:0x0209, B:45:0x0090, B:46:0x0231, B:48:0x0239, B:49:0x0240, B:51:0x00e1, B:54:0x00ea, B:56:0x00f1, B:58:0x00f9, B:60:0x0101, B:62:0x0107, B:64:0x010a, B:65:0x010e, B:69:0x011c, B:71:0x012c, B:73:0x0132, B:75:0x013d, B:79:0x01cd, B:80:0x01d4, B:81:0x01d5, B:85:0x020c, B:89:0x0245, B:91:0x024b, B:93:0x0253, B:94:0x0257, B:96:0x0262, B:98:0x0266, B:99:0x026b), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0202 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:16:0x0048, B:17:0x01ad, B:19:0x01b5, B:21:0x01bb, B:22:0x01be, B:27:0x01c8, B:31:0x006a, B:33:0x0175, B:39:0x007f, B:40:0x01fa, B:42:0x0202, B:43:0x0209, B:45:0x0090, B:46:0x0231, B:48:0x0239, B:49:0x0240, B:51:0x00e1, B:54:0x00ea, B:56:0x00f1, B:58:0x00f9, B:60:0x0101, B:62:0x0107, B:64:0x010a, B:65:0x010e, B:69:0x011c, B:71:0x012c, B:73:0x0132, B:75:0x013d, B:79:0x01cd, B:80:0x01d4, B:81:0x01d5, B:85:0x020c, B:89:0x0245, B:91:0x024b, B:93:0x0253, B:94:0x0257, B:96:0x0262, B:98:0x0266, B:99:0x026b), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0209 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:16:0x0048, B:17:0x01ad, B:19:0x01b5, B:21:0x01bb, B:22:0x01be, B:27:0x01c8, B:31:0x006a, B:33:0x0175, B:39:0x007f, B:40:0x01fa, B:42:0x0202, B:43:0x0209, B:45:0x0090, B:46:0x0231, B:48:0x0239, B:49:0x0240, B:51:0x00e1, B:54:0x00ea, B:56:0x00f1, B:58:0x00f9, B:60:0x0101, B:62:0x0107, B:64:0x010a, B:65:0x010e, B:69:0x011c, B:71:0x012c, B:73:0x0132, B:75:0x013d, B:79:0x01cd, B:80:0x01d4, B:81:0x01d5, B:85:0x020c, B:89:0x0245, B:91:0x024b, B:93:0x0253, B:94:0x0257, B:96:0x0262, B:98:0x0266, B:99:0x026b), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0239 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:16:0x0048, B:17:0x01ad, B:19:0x01b5, B:21:0x01bb, B:22:0x01be, B:27:0x01c8, B:31:0x006a, B:33:0x0175, B:39:0x007f, B:40:0x01fa, B:42:0x0202, B:43:0x0209, B:45:0x0090, B:46:0x0231, B:48:0x0239, B:49:0x0240, B:51:0x00e1, B:54:0x00ea, B:56:0x00f1, B:58:0x00f9, B:60:0x0101, B:62:0x0107, B:64:0x010a, B:65:0x010e, B:69:0x011c, B:71:0x012c, B:73:0x0132, B:75:0x013d, B:79:0x01cd, B:80:0x01d4, B:81:0x01d5, B:85:0x020c, B:89:0x0245, B:91:0x024b, B:93:0x0253, B:94:0x0257, B:96:0x0262, B:98:0x0266, B:99:0x026b), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0240 A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:16:0x0048, B:17:0x01ad, B:19:0x01b5, B:21:0x01bb, B:22:0x01be, B:27:0x01c8, B:31:0x006a, B:33:0x0175, B:39:0x007f, B:40:0x01fa, B:42:0x0202, B:43:0x0209, B:45:0x0090, B:46:0x0231, B:48:0x0239, B:49:0x0240, B:51:0x00e1, B:54:0x00ea, B:56:0x00f1, B:58:0x00f9, B:60:0x0101, B:62:0x0107, B:64:0x010a, B:65:0x010e, B:69:0x011c, B:71:0x012c, B:73:0x0132, B:75:0x013d, B:79:0x01cd, B:80:0x01d4, B:81:0x01d5, B:85:0x020c, B:89:0x0245, B:91:0x024b, B:93:0x0253, B:94:0x0257, B:96:0x0262, B:98:0x0266, B:99:0x026b), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0243  */
    /* JADX WARN: Type inference failed for: r3v3, types: [or.a, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setTrackEnabled(Track.Source source, boolean z6, ScreenCaptureParams screenCaptureParams, c<? super Boolean> cVar) {
        LocalParticipant$setTrackEnabled$1 localParticipant$setTrackEnabled$1;
        ?? r32;
        a aVar;
        ScreenCaptureParams screenCaptureParams2;
        Track.Source source2;
        LocalParticipant localParticipant;
        boolean z10;
        kotlin.jvm.internal.z zVar;
        Track track;
        kotlin.jvm.internal.z zVar2;
        LocalVideoTrack localVideoTrack;
        LocalAudioTrack localAudioTrack;
        LocalParticipant localParticipant2;
        LocalScreencastVideoTrack localScreencastVideoTrack;
        ScreenCaptureParams screenCaptureParams3;
        LocalVideoTrack localVideoTrack2;
        kotlin.jvm.internal.z zVar3;
        Object publishVideoTrack$default;
        ScreenCaptureParams screenCaptureParams4;
        LocalScreencastVideoTrack localScreencastVideoTrack2;
        kotlin.jvm.internal.z zVar4;
        try {
            if (cVar instanceof LocalParticipant$setTrackEnabled$1) {
                localParticipant$setTrackEnabled$1 = (LocalParticipant$setTrackEnabled$1) cVar;
                int i10 = localParticipant$setTrackEnabled$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    localParticipant$setTrackEnabled$1.label = i10 - Integer.MIN_VALUE;
                    LocalParticipant$setTrackEnabled$1 localParticipant$setTrackEnabled$12 = localParticipant$setTrackEnabled$1;
                    Object obj = localParticipant$setTrackEnabled$12.result;
                    r32 = localParticipant$setTrackEnabled$12.label;
                    xn.a aVar2 = xn.a.f37986a;
                    if (r32 == 0) {
                        if (r32 != 1) {
                            if (r32 != 2) {
                                if (r32 != 3) {
                                    if (r32 != 4) {
                                        if (r32 == 5) {
                                            localScreencastVideoTrack2 = (LocalScreencastVideoTrack) localParticipant$setTrackEnabled$12.L$3;
                                            aVar = (a) localParticipant$setTrackEnabled$12.L$2;
                                            zVar2 = (kotlin.jvm.internal.z) localParticipant$setTrackEnabled$12.L$1;
                                            screenCaptureParams4 = (ScreenCaptureParams) localParticipant$setTrackEnabled$12.L$0;
                                            sn.a.g(obj);
                                            if (((Boolean) obj).booleanValue()) {
                                                ho.a onStop = screenCaptureParams4.getOnStop();
                                                if (onStop != null) {
                                                    onStop.invoke();
                                                }
                                                localScreencastVideoTrack2.stopCapture();
                                                localScreencastVideoTrack2.stop();
                                                localScreencastVideoTrack2.dispose();
                                            } else {
                                                zVar2.f20568a = true;
                                            }
                                            zVar4 = zVar2;
                                            aVar.n(null);
                                            return Boolean.valueOf(zVar4.f20568a);
                                        }
                                        c6.x("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    LocalScreencastVideoTrack localScreencastVideoTrack3 = (LocalScreencastVideoTrack) localParticipant$setTrackEnabled$12.L$4;
                                    aVar = (a) localParticipant$setTrackEnabled$12.L$3;
                                    kotlin.jvm.internal.z zVar5 = (kotlin.jvm.internal.z) localParticipant$setTrackEnabled$12.L$2;
                                    ScreenCaptureParams screenCaptureParams5 = (ScreenCaptureParams) localParticipant$setTrackEnabled$12.L$1;
                                    LocalParticipant localParticipant3 = (LocalParticipant) localParticipant$setTrackEnabled$12.L$0;
                                    sn.a.g(obj);
                                    zVar3 = zVar5;
                                    localParticipant2 = localParticipant3;
                                    localScreencastVideoTrack = localScreencastVideoTrack3;
                                    screenCaptureParams3 = screenCaptureParams5;
                                    localScreencastVideoTrack.startCapture();
                                    VideoTrackPublishOptions videoTrackPublishOptions = new VideoTrackPublishOptions(null, localParticipant2.getScreenShareTrackPublishDefaults(), null, null, 12, null);
                                    localParticipant$setTrackEnabled$12.L$0 = screenCaptureParams3;
                                    localParticipant$setTrackEnabled$12.L$1 = zVar3;
                                    localParticipant$setTrackEnabled$12.L$2 = aVar;
                                    localParticipant$setTrackEnabled$12.L$3 = localScreencastVideoTrack;
                                    localParticipant$setTrackEnabled$12.L$4 = null;
                                    localParticipant$setTrackEnabled$12.label = 5;
                                    publishVideoTrack$default = publishVideoTrack$default(localParticipant2, localScreencastVideoTrack, videoTrackPublishOptions, null, localParticipant$setTrackEnabled$12, 4, null);
                                    if (publishVideoTrack$default == aVar2) {
                                        LocalScreencastVideoTrack localScreencastVideoTrack4 = localScreencastVideoTrack;
                                        screenCaptureParams4 = screenCaptureParams3;
                                        localScreencastVideoTrack2 = localScreencastVideoTrack4;
                                        zVar2 = zVar3;
                                        obj = publishVideoTrack$default;
                                        if (((Boolean) obj).booleanValue()) {
                                        }
                                        zVar4 = zVar2;
                                        aVar.n(null);
                                        return Boolean.valueOf(zVar4.f20568a);
                                    }
                                    return aVar2;
                                }
                                localAudioTrack = (LocalAudioTrack) localParticipant$setTrackEnabled$12.L$2;
                                aVar = (a) localParticipant$setTrackEnabled$12.L$1;
                                zVar2 = (kotlin.jvm.internal.z) localParticipant$setTrackEnabled$12.L$0;
                                sn.a.g(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    localAudioTrack.stop();
                                    localAudioTrack.stopPrewarm();
                                } else {
                                    zVar2.f20568a = true;
                                }
                                zVar4 = zVar2;
                                aVar.n(null);
                                return Boolean.valueOf(zVar4.f20568a);
                            }
                            localVideoTrack = (LocalVideoTrack) localParticipant$setTrackEnabled$12.L$2;
                            aVar = (a) localParticipant$setTrackEnabled$12.L$1;
                            zVar2 = (kotlin.jvm.internal.z) localParticipant$setTrackEnabled$12.L$0;
                            sn.a.g(obj);
                            if (((Boolean) obj).booleanValue()) {
                                localVideoTrack.stopCapture();
                                localVideoTrack.stop();
                            } else {
                                zVar2.f20568a = true;
                            }
                            zVar4 = zVar2;
                            aVar.n(null);
                            return Boolean.valueOf(zVar4.f20568a);
                        }
                        z10 = localParticipant$setTrackEnabled$12.Z$0;
                        aVar = (a) localParticipant$setTrackEnabled$12.L$4;
                        kotlin.jvm.internal.z zVar6 = (kotlin.jvm.internal.z) localParticipant$setTrackEnabled$12.L$3;
                        ScreenCaptureParams screenCaptureParams6 = (ScreenCaptureParams) localParticipant$setTrackEnabled$12.L$2;
                        source2 = (Track.Source) localParticipant$setTrackEnabled$12.L$1;
                        localParticipant = (LocalParticipant) localParticipant$setTrackEnabled$12.L$0;
                        sn.a.g(obj);
                        zVar = zVar6;
                        screenCaptureParams2 = screenCaptureParams6;
                    } else {
                        sn.a.g(obj);
                        Object obj2 = new Object();
                        a aVar3 = this.sourcePubLocks.get(source);
                        aVar3.getClass();
                        aVar = aVar3;
                        localParticipant$setTrackEnabled$12.L$0 = this;
                        localParticipant$setTrackEnabled$12.L$1 = source;
                        screenCaptureParams2 = screenCaptureParams;
                        localParticipant$setTrackEnabled$12.L$2 = screenCaptureParams2;
                        localParticipant$setTrackEnabled$12.L$3 = obj2;
                        localParticipant$setTrackEnabled$12.L$4 = aVar;
                        localParticipant$setTrackEnabled$12.Z$0 = z6;
                        localParticipant$setTrackEnabled$12.label = 1;
                        if (aVar.a(localParticipant$setTrackEnabled$12) != aVar2) {
                            source2 = source;
                            localParticipant = this;
                            z10 = z6;
                            zVar = obj2;
                        }
                        return aVar2;
                    }
                    LocalTrackPublication trackPublication = localParticipant.getTrackPublication(source2);
                    if (!z10) {
                        if (trackPublication != null) {
                            trackPublication.setMuted$livekit_android_sdk_release(false);
                            if (source2 == Track.Source.CAMERA && (trackPublication.getTrack() instanceof LocalVideoTrack)) {
                                Track track2 = trackPublication.getTrack();
                                if (track2 instanceof LocalVideoTrack) {
                                    localVideoTrack2 = (LocalVideoTrack) track2;
                                } else {
                                    localVideoTrack2 = null;
                                }
                                if (localVideoTrack2 != null) {
                                    localVideoTrack2.startCapture();
                                }
                            }
                            zVar.f20568a = true;
                            zVar4 = zVar;
                        } else {
                            int i11 = WhenMappings.$EnumSwitchMapping$0[source2.ordinal()];
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        LKLog.Companion companion = LKLog.INSTANCE;
                                        zVar4 = zVar;
                                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                                            zVar4 = zVar;
                                            if (et.d.d() > 0) {
                                                et.d.f(null, "Attempting to enable an unknown source, ignoring.", new Object[0]);
                                                zVar4 = zVar;
                                            }
                                        }
                                    } else if (screenCaptureParams2 != null) {
                                        LocalScreencastVideoTrack createScreencastTrack$default = createScreencastTrack$default(localParticipant, null, screenCaptureParams2.getMediaProjectionPermissionResultData(), null, null, new LocalParticipant$setTrackEnabled$2$track$1(localParticipant, screenCaptureParams2), 13, null);
                                        localParticipant2 = localParticipant;
                                        Integer notificationId = screenCaptureParams2.getNotificationId();
                                        Notification notification = screenCaptureParams2.getNotification();
                                        localParticipant$setTrackEnabled$12.L$0 = localParticipant2;
                                        localParticipant$setTrackEnabled$12.L$1 = screenCaptureParams2;
                                        localParticipant$setTrackEnabled$12.L$2 = zVar;
                                        localParticipant$setTrackEnabled$12.L$3 = aVar;
                                        localParticipant$setTrackEnabled$12.L$4 = createScreencastTrack$default;
                                        localParticipant$setTrackEnabled$12.label = 4;
                                        if (createScreencastTrack$default.startForegroundService(notificationId, notification, localParticipant$setTrackEnabled$12) != aVar2) {
                                            localScreencastVideoTrack = createScreencastTrack$default;
                                            screenCaptureParams3 = screenCaptureParams2;
                                            zVar3 = zVar;
                                            localScreencastVideoTrack.startCapture();
                                            VideoTrackPublishOptions videoTrackPublishOptions2 = new VideoTrackPublishOptions(null, localParticipant2.getScreenShareTrackPublishDefaults(), null, null, 12, null);
                                            localParticipant$setTrackEnabled$12.L$0 = screenCaptureParams3;
                                            localParticipant$setTrackEnabled$12.L$1 = zVar3;
                                            localParticipant$setTrackEnabled$12.L$2 = aVar;
                                            localParticipant$setTrackEnabled$12.L$3 = localScreencastVideoTrack;
                                            localParticipant$setTrackEnabled$12.L$4 = null;
                                            localParticipant$setTrackEnabled$12.label = 5;
                                            publishVideoTrack$default = publishVideoTrack$default(localParticipant2, localScreencastVideoTrack, videoTrackPublishOptions2, null, localParticipant$setTrackEnabled$12, 4, null);
                                            if (publishVideoTrack$default == aVar2) {
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Media Projection params is required to create a screen share track.");
                                    }
                                } else {
                                    LocalParticipant localParticipant4 = localParticipant;
                                    LocalAudioTrack orCreateDefaultAudioTrack = localParticipant4.getOrCreateDefaultAudioTrack();
                                    orCreateDefaultAudioTrack.prewarm();
                                    orCreateDefaultAudioTrack.start();
                                    localParticipant$setTrackEnabled$12.L$0 = zVar;
                                    localParticipant$setTrackEnabled$12.L$1 = aVar;
                                    localParticipant$setTrackEnabled$12.L$2 = orCreateDefaultAudioTrack;
                                    localParticipant$setTrackEnabled$12.L$3 = null;
                                    localParticipant$setTrackEnabled$12.L$4 = null;
                                    localParticipant$setTrackEnabled$12.label = 3;
                                    Object publishAudioTrack$default = publishAudioTrack$default(localParticipant4, orCreateDefaultAudioTrack, null, null, localParticipant$setTrackEnabled$12, 6, null);
                                    if (publishAudioTrack$default != aVar2) {
                                        zVar2 = zVar;
                                        obj = publishAudioTrack$default;
                                        localAudioTrack = orCreateDefaultAudioTrack;
                                        if (((Boolean) obj).booleanValue()) {
                                        }
                                        zVar4 = zVar2;
                                    }
                                }
                            } else {
                                LocalParticipant localParticipant5 = localParticipant;
                                LocalVideoTrack orCreateDefaultVideoTrack = localParticipant5.getOrCreateDefaultVideoTrack();
                                orCreateDefaultVideoTrack.start();
                                orCreateDefaultVideoTrack.startCapture();
                                localParticipant$setTrackEnabled$12.L$0 = zVar;
                                localParticipant$setTrackEnabled$12.L$1 = aVar;
                                localParticipant$setTrackEnabled$12.L$2 = orCreateDefaultVideoTrack;
                                localParticipant$setTrackEnabled$12.L$3 = null;
                                localParticipant$setTrackEnabled$12.L$4 = null;
                                localParticipant$setTrackEnabled$12.label = 2;
                                Object publishVideoTrack$default2 = publishVideoTrack$default(localParticipant5, orCreateDefaultVideoTrack, null, null, localParticipant$setTrackEnabled$12, 6, null);
                                if (publishVideoTrack$default2 != aVar2) {
                                    zVar2 = zVar;
                                    obj = publishVideoTrack$default2;
                                    localVideoTrack = orCreateDefaultVideoTrack;
                                    if (((Boolean) obj).booleanValue()) {
                                    }
                                    zVar4 = zVar2;
                                }
                            }
                            return aVar2;
                        }
                    } else {
                        if (trackPublication != null && (track = trackPublication.getTrack()) != null) {
                            if (trackPublication.getSource() == Track.Source.SCREEN_SHARE) {
                                unpublishTrack$default(localParticipant, track, false, 2, null);
                            } else {
                                trackPublication.setMuted$livekit_android_sdk_release(true);
                                if (trackPublication.getSource() == Track.Source.CAMERA && (track instanceof LocalVideoTrack)) {
                                    ((LocalVideoTrack) track).stopCapture();
                                }
                            }
                        }
                        zVar.f20568a = true;
                        zVar4 = zVar;
                    }
                    aVar.n(null);
                    return Boolean.valueOf(zVar4.f20568a);
                }
            }
            if (r32 == 0) {
            }
            LocalTrackPublication trackPublication2 = localParticipant.getTrackPublication(source2);
            if (!z10) {
            }
            aVar.n(null);
            return Boolean.valueOf(zVar4.f20568a);
        } catch (Throwable th) {
            r32.n(null);
            throw th;
        }
        localParticipant$setTrackEnabled$1 = new LocalParticipant$setTrackEnabled$1(this, cVar);
        LocalParticipant$setTrackEnabled$1 localParticipant$setTrackEnabled$122 = localParticipant$setTrackEnabled$1;
        Object obj3 = localParticipant$setTrackEnabled$122.result;
        r32 = localParticipant$setTrackEnabled$122.label;
        xn.a aVar22 = xn.a.f37986a;
    }

    public static /* synthetic */ Object setTrackEnabled$default(LocalParticipant localParticipant, Track.Source source, boolean z6, ScreenCaptureParams screenCaptureParams, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            screenCaptureParams = null;
        }
        return localParticipant.setTrackEnabled(source, z6, screenCaptureParams, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTrackSubscriptionPermissions$default(LocalParticipant localParticipant, boolean z6, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = t.f33547a;
        }
        localParticipant.setTrackSubscriptionPermissions(z6, list);
    }

    public static /* synthetic */ void unpublishTrack$default(LocalParticipant localParticipant, Track track, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = true;
        }
        localParticipant.unpublishTrack(track, z6);
    }

    public final void cleanup() {
        for (TrackPublication trackPublication : getTrackPublications().values()) {
            Track track = trackPublication.getTrack();
            if (track != null) {
                track.stop();
                unpublishTrack(track, false);
                try {
                    track.dispose();
                } catch (Exception e10) {
                    LKLog.Companion companion = LKLog.INSTANCE;
                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                        et.d.a(e10, "Exception thrown when cleaning up local participant track " + trackPublication + ':', new Object[0]);
                    }
                }
            }
        }
        LocalAudioTrack localAudioTrack = this.defaultAudioTrack;
        if (localAudioTrack != null) {
            localAudioTrack.dispose();
        }
        this.defaultAudioTrack = null;
        LocalVideoTrack localVideoTrack = this.defaultVideoTrack;
        if (localVideoTrack != null) {
            localVideoTrack.dispose();
        }
        this.defaultVideoTrack = null;
    }

    public final LocalAudioTrack createAudioTrack(String name, LocalAudioTrackOptions options) {
        name.getClass();
        options.getClass();
        return LocalAudioTrack.INSTANCE.createTrack$livekit_android_sdk_release(this.context, this.peerConnectionFactory, options, this.audioTrackFactory, name);
    }

    public final LocalScreencastVideoTrack createScreencastTrack(String name, Intent mediaProjectionPermissionResultData, LocalVideoTrackOptions options, VideoProcessor videoProcessor, l onStop) {
        name.getClass();
        mediaProjectionPermissionResultData.getClass();
        options.getClass();
        onStop.getClass();
        return LocalScreencastVideoTrack.INSTANCE.createTrack$livekit_android_sdk_release(mediaProjectionPermissionResultData, this.peerConnectionFactory, this.context, name, LocalVideoTrackOptions.copy$default(options, true, null, null, null, 14, null), this.eglBase, this.screencastVideoTrackFactory, videoProcessor, onStop);
    }

    public final LocalVideoTrack createVideoTrack(String name, VideoCapturer capturer, LocalVideoTrackOptions options, VideoProcessor videoProcessor) {
        name.getClass();
        capturer.getClass();
        options.getClass();
        return LocalVideoTrack.INSTANCE.createTrack$livekit_android_sdk_release(this.peerConnectionFactory, this.context, name, capturer, options, this.eglBase, this.videoTrackFactory, videoProcessor);
    }

    @Override // io.livekit.android.room.participant.Participant
    public void dispose() {
        cleanup();
        this.enabledPublishVideoCodecs.clear();
        super.dispose();
    }

    public final LocalAudioTrackOptions getAudioTrackCaptureDefaults() {
        return this.defaultsManager.getAudioTrackCaptureDefaults();
    }

    public final AudioTrackPublishDefaults getAudioTrackPublishDefaults() {
        return this.defaultsManager.getAudioTrackPublishDefaults();
    }

    /* renamed from: getDynacast$livekit_android_sdk_release, reason: from getter */
    public final boolean getDynacast() {
        return this.dynacast;
    }

    public final List<LivekitModels$Codec> getEnabledPublishVideoCodecs$livekit_android_sdk_release() {
        return this.enabledPublishVideoCodecs;
    }

    /* renamed from: getEngine$livekit_android_sdk_release, reason: from getter */
    public final RTCEngine getEngine() {
        return this.engine;
    }

    public final LocalAudioTrack getOrCreateDefaultAudioTrack() {
        LocalAudioTrack localAudioTrack = this.defaultAudioTrack;
        if (localAudioTrack == null) {
            LocalAudioTrack createAudioTrack$default = createAudioTrack$default(this, null, null, 3, null);
            this.defaultAudioTrack = createAudioTrack$default;
            return createAudioTrack$default;
        }
        return localAudioTrack;
    }

    public final LocalVideoTrack getOrCreateDefaultVideoTrack() {
        LocalVideoTrack localVideoTrack = this.defaultVideoTrack;
        if (localVideoTrack == null) {
            LocalVideoTrack createVideoTrack$default = createVideoTrack$default(this, null, null, null, 7, null);
            this.defaultVideoTrack = createVideoTrack$default;
            return createVideoTrack$default;
        }
        return localVideoTrack;
    }

    public final LocalVideoTrackOptions getScreenShareTrackCaptureDefaults() {
        return this.defaultsManager.getScreenShareTrackCaptureDefaults();
    }

    public final VideoTrackPublishDefaults getScreenShareTrackPublishDefaults() {
        return this.defaultsManager.getScreenShareTrackPublishDefaults();
    }

    @Override // io.livekit.android.room.participant.Participant
    public LocalTrackPublication getTrackPublication(Track.Source source) {
        source.getClass();
        TrackPublication trackPublication = super.getTrackPublication(source);
        if (trackPublication instanceof LocalTrackPublication) {
            return (LocalTrackPublication) trackPublication;
        }
        return null;
    }

    @Override // io.livekit.android.room.participant.Participant
    public LocalTrackPublication getTrackPublicationByName(String name) {
        name.getClass();
        TrackPublication trackPublicationByName = super.getTrackPublicationByName(name);
        if (trackPublicationByName instanceof LocalTrackPublication) {
            return (LocalTrackPublication) trackPublicationByName;
        }
        return null;
    }

    public final LocalVideoTrackOptions getVideoTrackCaptureDefaults() {
        return this.defaultsManager.getVideoTrackCaptureDefaults();
    }

    public final VideoTrackPublishDefaults getVideoTrackPublishDefaults() {
        return this.defaultsManager.getVideoTrackPublishDefaults();
    }

    public final void handleDataPacket$livekit_android_sdk_release(LivekitModels$DataPacket packet) {
        RpcError rpcError;
        packet.getClass();
        String str = null;
        if (packet.hasRpcRequest()) {
            g0.D(getScope(), null, null, new LocalParticipant$handleDataPacket$1(this, packet, packet.getRpcRequest(), null), 3);
            return;
        }
        if (packet.hasRpcResponse()) {
            LivekitModels$RpcResponse rpcResponse = packet.getRpcResponse();
            if (rpcResponse.hasPayload()) {
                str = rpcResponse.getPayload();
                rpcError = null;
            } else if (rpcResponse.hasError()) {
                RpcError.Companion companion = RpcError.INSTANCE;
                LivekitModels$RpcError error = rpcResponse.getError();
                error.getClass();
                rpcError = companion.fromProto(error);
            } else {
                rpcError = null;
            }
            String requestId = rpcResponse.getRequestId();
            requestId.getClass();
            handleIncomingRpcResponse(requestId, str, rpcError);
            return;
        }
        if (packet.hasRpcAck()) {
            String requestId2 = packet.getRpcAck().getRequestId();
            requestId2.getClass();
            handleIncomingRpcAck(requestId2);
        }
    }

    public final void handleLocalTrackUnpublished$livekit_android_sdk_release(LivekitRtc$TrackUnpublishedResponse unpublishedResponse) {
        Track track;
        unpublishedResponse.getClass();
        TrackPublication trackPublication = getTrackPublications().get(unpublishedResponse.getTrackSid());
        if (trackPublication != null) {
            track = trackPublication.getTrack();
        } else {
            track = null;
        }
        if (track == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "Received unpublished track response for unknown or non-published track: " + unpublishedResponse.getTrackSid(), new Object[0]);
                return;
            }
            return;
        }
        unpublishTrack$default(this, track, false, 2, null);
    }

    /* renamed from: handleParticipantDisconnect-p2YI31Y$livekit_android_sdk_release, reason: not valid java name */
    public final void m2591handleParticipantDisconnectp2YI31Y$livekit_android_sdk_release(String identity) {
        identity.getClass();
        Map<String, PendingRpcAck> map = this.pendingAcks;
        map.getClass();
        synchronized (map) {
            Map<String, PendingRpcAck> map2 = this.pendingAcks;
            map2.getClass();
            Iterator<Map.Entry<String, PendingRpcAck>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                if (Participant.Identity.m2607equalsimpl0(it.next().getValue().m2621getParticipantIdentityXNTvU(), identity)) {
                    it.remove();
                }
            }
        }
        Map<String, PendingRpcResponse> map3 = this.pendingResponses;
        map3.getClass();
        synchronized (map3) {
            Map<String, PendingRpcResponse> map4 = this.pendingResponses;
            map4.getClass();
            Iterator<Map.Entry<String, PendingRpcResponse>> it2 = map4.entrySet().iterator();
            while (it2.hasNext()) {
                PendingRpcResponse value = it2.next().getValue();
                if (Participant.Identity.m2607equalsimpl0(value.m2625getParticipantIdentityXNTvU(), identity)) {
                    it2.remove();
                    value.getOnResolve().invoke(null, RpcError.BuiltinRpcError.create$default(RpcError.BuiltinRpcError.RECIPIENT_DISCONNECTED, null, null, 3, null));
                }
            }
        }
    }

    public final void handleSubscribedQualityUpdate$livekit_android_sdk_release(LivekitRtc$SubscribedQualityUpdate subscribedQualityUpdate) {
        LocalTrackPublication localTrackPublication;
        LocalVideoTrack localVideoTrack;
        VideoTrackPublishOptions videoTrackPublishOptions;
        subscribedQualityUpdate.getClass();
        if (this.dynacast) {
            String trackSid = subscribedQualityUpdate.getTrackSid();
            List<LivekitRtc$SubscribedCodec> subscribedCodecsList = subscribedQualityUpdate.getSubscribedCodecsList();
            List<LivekitRtc$SubscribedQuality> subscribedQualitiesList = subscribedQualityUpdate.getSubscribedQualitiesList();
            TrackPublication trackPublication = getTrackPublications().get(trackSid);
            if (trackPublication instanceof LocalTrackPublication) {
                localTrackPublication = (LocalTrackPublication) trackPublication;
            } else {
                localTrackPublication = null;
            }
            if (localTrackPublication != null) {
                Track track = localTrackPublication.getTrack();
                if (track instanceof LocalVideoTrack) {
                    localVideoTrack = (LocalVideoTrack) track;
                } else {
                    localVideoTrack = null;
                }
                if (localVideoTrack != null) {
                    TrackPublishOptions options = localTrackPublication.getOptions();
                    if (options instanceof VideoTrackPublishOptions) {
                        videoTrackPublishOptions = (VideoTrackPublishOptions) options;
                    } else {
                        videoTrackPublishOptions = null;
                    }
                    if (videoTrackPublishOptions != null) {
                        subscribedCodecsList.getClass();
                        if (!subscribedCodecsList.isEmpty()) {
                            for (VideoCodec videoCodec : localVideoTrack.setPublishingCodecs$livekit_android_sdk_release(subscribedCodecsList)) {
                                if (LocalParticipantKt.access$isBackupCodec(videoCodec.getCodecName())) {
                                    LKLog.Companion companion = LKLog.INSTANCE;
                                    if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                        et.d.a(null, "publish " + videoCodec + " for " + trackSid, new Object[0]);
                                    }
                                    publishAdditionalCodecForTrack(localVideoTrack, videoCodec, videoTrackPublishOptions);
                                }
                            }
                        }
                        subscribedQualitiesList.getClass();
                        if (!subscribedQualitiesList.isEmpty()) {
                            localVideoTrack.setPublishingLayers$livekit_android_sdk_release(subscribedQualitiesList);
                        }
                    }
                }
            }
        }
    }

    public final void onLocalTrackSubscribed$livekit_android_sdk_release(LocalTrackPublication publication) {
        publication.getClass();
        if (!getTrackPublications().containsKey(publication.getSid())) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.f(null, "Could not find local track publication for subscribed event ", new Object[0]);
                return;
            }
            return;
        }
        getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.LocalTrackSubscribed(this, publication), getScope());
    }

    public final void onRemoteMuteChanged$livekit_android_sdk_release(String trackSid, boolean muted) {
        trackSid.getClass();
        TrackPublication trackPublication = getTrackPublications().get(trackSid);
        if (trackPublication == null) {
            return;
        }
        trackPublication.setMuted$livekit_android_sdk_release(muted);
    }

    @Override // io.livekit.android.room.rpc.RpcManager
    /* renamed from: performRpc-9o0yd6Q */
    public Object mo2540performRpc9o0yd6Q(String str, String str2, String str3, long j4, c<? super String> cVar) {
        return g0.l(new LocalParticipant$performRpc$2(str3, this, j4, str, str2, null), cVar);
    }

    public final void prepareForFullReconnect$livekit_android_sdk_release() {
        List<LocalTrackPublication> g12 = o.g1(getLocalTrackPublications());
        if (this.republishes == null) {
            this.republishes = g12;
        }
        LinkedHashMap T = a0.T(getTrackPublications());
        T.clear();
        setTrackPublications(T);
        for (LocalTrackPublication localTrackPublication : g12) {
            ParticipantListener internalListener = getInternalListener();
            if (internalListener != null) {
                internalListener.onTrackUnpublished(localTrackPublication, this);
            }
            getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.LocalTrackUnpublished(this, localTrackPublication), getScope());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|7|(1:(4:10|11|12|13)(2:36|37))(2:38|(4:40|(1:44)|45|46)(7:47|(1:51)|52|53|54|55|(1:57)(1:58)))|14|15|16|17|(1:19)|20|(1:22)|23|24))|62|6|7|(0)(0)|14|15|16|17|(0)|20|(0)|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object publishAudioTrack(LocalAudioTrack localAudioTrack, AudioTrackPublishOptions audioTrackPublishOptions, PublishListener publishListener, c<? super Boolean> cVar) {
        LocalParticipant$publishAudioTrack$1 localParticipant$publishAudioTrack$1;
        int i10;
        LocalParticipant localParticipant;
        LocalAudioTrack localAudioTrack2;
        AudioTrackPublishOptions audioTrackPublishOptions2;
        Object obj;
        d0 d0Var;
        d0 d0Var2;
        if (cVar instanceof LocalParticipant$publishAudioTrack$1) {
            localParticipant$publishAudioTrack$1 = (LocalParticipant$publishAudioTrack$1) cVar;
            int i11 = localParticipant$publishAudioTrack$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localParticipant$publishAudioTrack$1.label = i11 - Integer.MIN_VALUE;
                LocalParticipant$publishAudioTrack$1 localParticipant$publishAudioTrack$12 = localParticipant$publishAudioTrack$1;
                Object obj2 = localParticipant$publishAudioTrack$12.result;
                i10 = localParticipant$publishAudioTrack$12.label;
                boolean z6 = false;
                if (i10 == 0) {
                    if (i10 == 1) {
                        d0 d0Var3 = (d0) localParticipant$publishAudioTrack$12.L$4;
                        obj = (d0) localParticipant$publishAudioTrack$12.L$3;
                        audioTrackPublishOptions2 = (AudioTrackPublishOptions) localParticipant$publishAudioTrack$12.L$2;
                        localAudioTrack2 = (LocalAudioTrack) localParticipant$publishAudioTrack$12.L$1;
                        LocalParticipant localParticipant2 = (LocalParticipant) localParticipant$publishAudioTrack$12.L$0;
                        try {
                            sn.a.g(obj2);
                            localParticipant = localParticipant2;
                            d0Var2 = d0Var3;
                        } catch (TrackException.PublishException e10) {
                            e = e10;
                            localParticipant = localParticipant2;
                            LKLog.Companion companion = LKLog.INSTANCE;
                            if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0) {
                            }
                            LocalParticipant localParticipant3 = localParticipant;
                            d0Var = obj;
                            AudioTrackPublishOptions audioTrackPublishOptions3 = audioTrackPublishOptions2;
                            LocalAudioTrack localAudioTrack3 = localAudioTrack2;
                            if (d0Var.f20559a != null) {
                            }
                            if (d0Var.f20559a != null) {
                            }
                            return Boolean.valueOf(z6);
                        }
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj2);
                    if (localAudioTrack.isDisposed$livekit_android_sdk_release()) {
                        LKLog.Companion companion2 = LKLog.INSTANCE;
                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                            et.d.f(null, "Attempting to publish a disposed track, ignoring.", new Object[0]);
                        }
                        return Boolean.FALSE;
                    }
                    RtpParameters.Encoding encoding = new RtpParameters.Encoding(null, true, null);
                    if (audioTrackPublishOptions.getAudioBitrate() != null && audioTrackPublishOptions.getAudioBitrate().intValue() > 0) {
                        encoding.maxBitrateBps = audioTrackPublishOptions.getAudioBitrate();
                    }
                    List H = ig.f.H(encoding);
                    Object obj3 = new Object();
                    try {
                        LocalParticipant$publishAudioTrack$3 localParticipant$publishAudioTrack$3 = new LocalParticipant$publishAudioTrack$3(audioTrackPublishOptions);
                        localParticipant$publishAudioTrack$12.L$0 = this;
                        localParticipant$publishAudioTrack$12.L$1 = localAudioTrack;
                        localParticipant$publishAudioTrack$12.L$2 = audioTrackPublishOptions;
                        localParticipant$publishAudioTrack$12.L$3 = obj3;
                        localParticipant$publishAudioTrack$12.L$4 = obj3;
                        localParticipant$publishAudioTrack$12.label = 1;
                        obj2 = publishTrackImpl(localAudioTrack, audioTrackPublishOptions, localParticipant$publishAudioTrack$3, H, publishListener, localParticipant$publishAudioTrack$12);
                        xn.a aVar = xn.a.f37986a;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                        localParticipant = this;
                        localAudioTrack2 = localAudioTrack;
                        audioTrackPublishOptions2 = audioTrackPublishOptions;
                        Object obj4 = obj3;
                        obj = obj4;
                        d0Var2 = obj4;
                    } catch (TrackException.PublishException e11) {
                        e = e11;
                        localParticipant = this;
                        localAudioTrack2 = localAudioTrack;
                        audioTrackPublishOptions2 = audioTrackPublishOptions;
                        obj = obj3;
                        LKLog.Companion companion3 = LKLog.INSTANCE;
                        if (LoggingLevel.ERROR.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                            et.d.b(e, "Error thrown when publishing track:", new Object[0]);
                        }
                        LocalParticipant localParticipant32 = localParticipant;
                        d0Var = obj;
                        AudioTrackPublishOptions audioTrackPublishOptions32 = audioTrackPublishOptions2;
                        LocalAudioTrack localAudioTrack32 = localAudioTrack2;
                        if (d0Var.f20559a != null) {
                        }
                        if (d0Var.f20559a != null) {
                        }
                        return Boolean.valueOf(z6);
                    }
                }
                d0Var2.f20559a = obj2;
                LocalParticipant localParticipant322 = localParticipant;
                d0Var = obj;
                AudioTrackPublishOptions audioTrackPublishOptions322 = audioTrackPublishOptions2;
                LocalAudioTrack localAudioTrack322 = localAudioTrack2;
                if (d0Var.f20559a != null) {
                    localParticipant322.jobs.put(d0Var.f20559a, g0.D(localParticipant322.getScope(), null, null, new LocalParticipant$publishAudioTrack$job$1(localAudioTrack322, localParticipant322, d0Var, audioTrackPublishOptions322, null), 3));
                }
                if (d0Var.f20559a != null) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            }
        }
        localParticipant$publishAudioTrack$1 = new LocalParticipant$publishAudioTrack$1(this, cVar);
        LocalParticipant$publishAudioTrack$1 localParticipant$publishAudioTrack$122 = localParticipant$publishAudioTrack$1;
        Object obj22 = localParticipant$publishAudioTrack$122.result;
        i10 = localParticipant$publishAudioTrack$122.label;
        boolean z62 = false;
        if (i10 == 0) {
        }
        d0Var2.f20559a = obj22;
        LocalParticipant localParticipant3222 = localParticipant;
        d0Var = obj;
        AudioTrackPublishOptions audioTrackPublishOptions3222 = audioTrackPublishOptions2;
        LocalAudioTrack localAudioTrack3222 = localAudioTrack2;
        if (d0Var.f20559a != null) {
        }
        if (d0Var.f20559a != null) {
        }
        return Boolean.valueOf(z62);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: publishData-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2592publishDatayxL6bBk(byte[] bArr, DataPublishReliability dataPublishReliability, String str, List<Participant.Identity> list, c<? super sn.m> cVar) {
        LocalParticipant$publishData$1 localParticipant$publishData$1;
        int i10;
        c7 c7Var;
        if (cVar instanceof LocalParticipant$publishData$1) {
            localParticipant$publishData$1 = (LocalParticipant$publishData$1) cVar;
            int i11 = localParticipant$publishData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localParticipant$publishData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = localParticipant$publishData$1.result;
                i10 = localParticipant$publishData$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                        return ((sn.m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                if (bArr.length <= 15360) {
                    int i12 = WhenMappings.$EnumSwitchMapping$1[dataPublishReliability.ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            c7Var = c7.LOSSY;
                        } else {
                            c6.p();
                            return null;
                        }
                    } else {
                        c7Var = c7.RELIABLE;
                    }
                    i9 newBuilder = LivekitModels$UserPacket.newBuilder();
                    newBuilder.d(com.google.protobuf.p.d(bArr, 0, bArr.length));
                    newBuilder.c(getSid());
                    if (str != null) {
                        newBuilder.e(str);
                    }
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(tn.p.a0(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Participant.Identity) it.next()).m2610unboximpl());
                        }
                        newBuilder.b(arrayList);
                    }
                    livekit.a newBuilder2 = LivekitModels$DataPacket.newBuilder();
                    newBuilder2.p(newBuilder);
                    newBuilder2.f(c7Var);
                    LivekitModels$DataPacket livekitModels$DataPacket = (LivekitModels$DataPacket) newBuilder2.build();
                    RTCEngine rTCEngine = this.engine;
                    livekitModels$DataPacket.getClass();
                    localParticipant$publishData$1.label = 1;
                    Object m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, localParticipant$publishData$1);
                    xn.a aVar = xn.a.f37986a;
                    if (m2529sendDatagIAlus$livekit_android_sdk_release == aVar) {
                        return aVar;
                    }
                    return m2529sendDatagIAlus$livekit_android_sdk_release;
                }
                c6.t("cannot publish data larger than 15360");
                return null;
            }
        }
        localParticipant$publishData$1 = new LocalParticipant$publishData$1(this, cVar);
        Object obj2 = localParticipant$publishData$1.result;
        i10 = localParticipant$publishData$1.label;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: publishDtmf-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2593publishDtmf0E7RQCE(int i10, String str, c<? super sn.m> cVar) {
        LocalParticipant$publishDtmf$1 localParticipant$publishDtmf$1;
        int i11;
        if (cVar instanceof LocalParticipant$publishDtmf$1) {
            localParticipant$publishDtmf$1 = (LocalParticipant$publishDtmf$1) cVar;
            int i12 = localParticipant$publishDtmf$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                localParticipant$publishDtmf$1.label = i12 - Integer.MIN_VALUE;
                Object obj = localParticipant$publishDtmf$1.result;
                i11 = localParticipant$publishDtmf$1.label;
                if (i11 == 0) {
                    if (i11 == 1) {
                        sn.a.g(obj);
                        return ((sn.m) obj).f31603a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                t8 newBuilder = LivekitModels$SipDTMF.newBuilder();
                newBuilder.b(i10);
                newBuilder.c(str);
                LivekitModels$SipDTMF livekitModels$SipDTMF = (LivekitModels$SipDTMF) newBuilder.build();
                livekit.a newBuilder2 = LivekitModels$DataPacket.newBuilder();
                newBuilder2.l(livekitModels$SipDTMF);
                newBuilder2.f(c7.RELIABLE);
                LivekitModels$DataPacket livekitModels$DataPacket = (LivekitModels$DataPacket) newBuilder2.build();
                RTCEngine rTCEngine = this.engine;
                livekitModels$DataPacket.getClass();
                localParticipant$publishDtmf$1.label = 1;
                Object m2529sendDatagIAlus$livekit_android_sdk_release = rTCEngine.m2529sendDatagIAlus$livekit_android_sdk_release(livekitModels$DataPacket, localParticipant$publishDtmf$1);
                xn.a aVar = xn.a.f37986a;
                if (m2529sendDatagIAlus$livekit_android_sdk_release == aVar) {
                    return aVar;
                }
                return m2529sendDatagIAlus$livekit_android_sdk_release;
            }
        }
        localParticipant$publishDtmf$1 = new LocalParticipant$publishDtmf$1(this, cVar);
        Object obj2 = localParticipant$publishDtmf$1.result;
        i11 = localParticipant$publishDtmf$1.label;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|8|(1:(1:11)(2:20|21))(2:22|(4:24|(1:28)|29|30)(5:31|(3:100|(2:104|(2:106|(1:108))(1:109))|102)|33|34|(4:36|(1:40)|41|42)(7:43|d6|85|(4:87|(1:89)|90|(1:92))|93|94|(1:96))))|12|13|(1:15)|16|17))|116|6|7|8|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00aa, code lost:
    
        if (r3 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x025f, code lost:
    
        r1 = io.livekit.android.util.LKLog.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026d, code lost:
    
        if (io.livekit.android.util.LoggingLevel.ERROR.compareTo(io.livekit.android.util.LKLog.INSTANCE.getLoggingLevel()) >= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0275, code lost:
    
        et.d.b(r0, "Error thrown when publishing track:", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object publishVideoTrack(final LocalVideoTrack localVideoTrack, VideoTrackPublishOptions videoTrackPublishOptions, PublishListener publishListener, c<? super Boolean> cVar) {
        LocalParticipant$publishVideoTrack$1 localParticipant$publishVideoTrack$1;
        int i10;
        final LocalTrackPublication localTrackPublication;
        Object obj;
        Object obj2;
        String str;
        String mime;
        if (cVar instanceof LocalParticipant$publishVideoTrack$1) {
            localParticipant$publishVideoTrack$1 = (LocalParticipant$publishVideoTrack$1) cVar;
            int i11 = localParticipant$publishVideoTrack$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localParticipant$publishVideoTrack$1.label = i11 - Integer.MIN_VALUE;
                LocalParticipant$publishVideoTrack$1 localParticipant$publishVideoTrack$12 = localParticipant$publishVideoTrack$1;
                Object obj3 = localParticipant$publishVideoTrack$12.result;
                Object obj4 = xn.a.f37986a;
                i10 = localParticipant$publishVideoTrack$12.label;
                boolean z6 = true;
                localTrackPublication = null;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj3);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj3);
                    ?? obj5 = new Object();
                    obj5.f20559a = videoTrackPublishOptions;
                    if (localVideoTrack.isDisposed$livekit_android_sdk_release()) {
                        LKLog.Companion companion = LKLog.INSTANCE;
                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                            et.d.f(null, "Attempting to publish a disposed track, ignoring.", new Object[0]);
                        }
                        return Boolean.FALSE;
                    }
                    if (!localVideoTrack.isDisposed$livekit_android_sdk_release()) {
                        final RTCThreadToken rtcThreadToken = localVideoTrack.getRtcThreadToken();
                        if (!rtcThreadToken.isDisposed()) {
                            if (i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                                if (!localVideoTrack.isDisposed$livekit_android_sdk_release()) {
                                    obj = localVideoTrack.getRtcTrack().id();
                                }
                            } else {
                                obj = RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.room.participant.LocalParticipant$publishVideoTrack$$inlined$withRTCTrack$livekit_android_sdk_release$1
                                    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.String] */
                                    @Override // java.util.concurrent.Callable
                                    public final String call() {
                                        if (RTCThreadToken.this.isDisposed()) {
                                            return null;
                                        }
                                        if (localVideoTrack.isDisposed$livekit_android_sdk_release()) {
                                            return localTrackPublication;
                                        }
                                        return localVideoTrack.getRtcTrack().id();
                                    }
                                }).get();
                            }
                        }
                        obj = null;
                    }
                    obj = null;
                    String str2 = (String) obj;
                    if (str2 == null) {
                        LKLog.Companion companion2 = LKLog.INSTANCE;
                        if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                            et.d.f(null, "Attempting to publish a disposed track, ignoring.", new Object[0]);
                        }
                        return Boolean.FALSE;
                    }
                    List<LivekitModels$Codec> list = this.enabledPublishVideoCodecs;
                    list.getClass();
                    synchronized (list) {
                        try {
                            List<LivekitModels$Codec> list2 = this.enabledPublishVideoCodecs;
                            list2.getClass();
                            if (!list2.isEmpty()) {
                                List<LivekitModels$Codec> list3 = this.enabledPublishVideoCodecs;
                                list3.getClass();
                                if (!list3.isEmpty()) {
                                    Iterator<T> it = list3.iterator();
                                    while (it.hasNext()) {
                                        String mime2 = ((LivekitModels$Codec) it.next()).getMime();
                                        mime2.getClass();
                                        if (m.c(PublishUtilsKt.mimeTypeToVideoCodec(mime2), ((VideoTrackPublishOptions) obj5.f20559a).getVideoCodec())) {
                                            break;
                                        }
                                    }
                                }
                                String videoCodec = ((VideoTrackPublishOptions) obj5.f20559a).getVideoCodec();
                                List<LivekitModels$Codec> list4 = this.enabledPublishVideoCodecs;
                                list4.getClass();
                                Iterator<T> it2 = list4.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        String mime3 = ((LivekitModels$Codec) obj2).getMime();
                                        mime3.getClass();
                                        if (PublishUtilsKt.mimeTypeToVideoCodec(mime3) != null) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                LivekitModels$Codec livekitModels$Codec = (LivekitModels$Codec) obj2;
                                if (livekitModels$Codec != null && (mime = livekitModels$Codec.getMime()) != null) {
                                    str = PublishUtilsKt.mimeTypeToVideoCodec(mime);
                                } else {
                                    str = null;
                                }
                                if (str != null) {
                                    LKLog.Companion companion3 = LKLog.INSTANCE;
                                    if (LoggingLevel.WARN.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                        et.d.f(null, videoCodec + " not enabled on server, falling back to supported codec " + str, new Object[0]);
                                    }
                                    obj5.f20559a = VideoTrackPublishOptions.copy$default((VideoTrackPublishOptions) obj5.f20559a, null, null, false, str, null, null, null, null, null, null, 1015, null);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    boolean isSVCCodec = PeerConnectionTransportKt.isSVCCodec(((VideoTrackPublishOptions) obj5.f20559a).getVideoCodec());
                    if (isSVCCodec) {
                        this.dynacast = true;
                        if (((VideoTrackPublishOptions) obj5.f20559a).getBackupCodec() == null) {
                            obj5.f20559a = VideoTrackPublishOptions.copy$default((VideoTrackPublishOptions) obj5.f20559a, null, null, false, null, null, new BackupVideoCodec(null, null, false, 7, null), null, null, null, null, 991, null);
                        }
                        if (((VideoTrackPublishOptions) obj5.f20559a).getScalabilityMode() == null) {
                            obj5.f20559a = VideoTrackPublishOptions.copy$default((VideoTrackPublishOptions) obj5.f20559a, null, null, false, null, "L3T3_KEY", null, null, null, null, null, 1007, null);
                        }
                    }
                    List<RtpParameters.Encoding> computeVideoEncodings = computeVideoEncodings(localVideoTrack.getOptions().isScreencast(), localVideoTrack.getDimensions(), (VideoTrackPublishOptions) obj5.f20559a);
                    List<LivekitModels$VideoLayer> videoLayersFromEncodings = EncodingUtils.INSTANCE.videoLayersFromEncodings(localVideoTrack.getDimensions().getWidth(), localVideoTrack.getDimensions().getHeight(), computeVideoEncodings, isSVCCodec);
                    TrackPublishOptions trackPublishOptions = (TrackPublishOptions) obj5.f20559a;
                    l localParticipant$publishVideoTrack$5 = new LocalParticipant$publishVideoTrack$5(localVideoTrack, obj5, videoLayersFromEncodings, str2);
                    localParticipant$publishVideoTrack$12.label = 1;
                    obj3 = publishTrackImpl(localVideoTrack, trackPublishOptions, localParticipant$publishVideoTrack$5, computeVideoEncodings, publishListener, localParticipant$publishVideoTrack$12);
                    if (obj3 == obj4) {
                        return obj4;
                    }
                }
                localTrackPublication = (LocalTrackPublication) obj3;
                if (localTrackPublication == null) {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            }
        }
        localParticipant$publishVideoTrack$1 = new LocalParticipant$publishVideoTrack$1(this, cVar);
        LocalParticipant$publishVideoTrack$1 localParticipant$publishVideoTrack$122 = localParticipant$publishVideoTrack$1;
        Object obj32 = localParticipant$publishVideoTrack$122.result;
        Object obj42 = xn.a.f37986a;
        i10 = localParticipant$publishVideoTrack$122.label;
        boolean z62 = true;
        localTrackPublication = null;
        if (i10 == 0) {
        }
        localTrackPublication = (LocalTrackPublication) obj32;
        if (localTrackPublication == null) {
        }
        return Boolean.valueOf(z62);
    }

    @Override // io.livekit.android.room.rpc.RpcManager
    public void registerRpcMethod(String method, p handler) {
        method.getClass();
        handler.getClass();
        Map<String, p> map = this.rpcHandlers;
        map.getClass();
        map.put(method, handler);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
    
        if (r10 == r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c4 -> B:11:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object republishTracks$livekit_android_sdk_release(c<? super sn.z> cVar) {
        LocalParticipant$republishTracks$1 localParticipant$republishTracks$1;
        int i10;
        List list;
        LocalParticipant localParticipant;
        Iterator it;
        Track track;
        boolean booleanValue;
        if (cVar instanceof LocalParticipant$republishTracks$1) {
            localParticipant$republishTracks$1 = (LocalParticipant$republishTracks$1) cVar;
            int i11 = localParticipant$republishTracks$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                localParticipant$republishTracks$1.label = i11 - Integer.MIN_VALUE;
                Object obj = localParticipant$republishTracks$1.result;
                i10 = localParticipant$republishTracks$1.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            track = (Track) localParticipant$republishTracks$1.L$2;
                            it = (Iterator) localParticipant$republishTracks$1.L$1;
                            localParticipant = (LocalParticipant) localParticipant$republishTracks$1.L$0;
                            sn.a.g(obj);
                            booleanValue = ((Boolean) obj).booleanValue();
                            if (!booleanValue) {
                                track.stop();
                            }
                            while (it.hasNext()) {
                                LocalTrackPublication localTrackPublication = (LocalTrackPublication) it.next();
                                track = localTrackPublication.getTrack();
                                if (track != null) {
                                    localParticipant.unpublishTrack(track, false);
                                    if (!localTrackPublication.getMuted()) {
                                        boolean z6 = track instanceof LocalAudioTrack;
                                        xn.a aVar = xn.a.f37986a;
                                        if (z6) {
                                            TrackPublishOptions options = localTrackPublication.getOptions();
                                            options.getClass();
                                            localParticipant$republishTracks$1.L$0 = localParticipant;
                                            localParticipant$republishTracks$1.L$1 = it;
                                            localParticipant$republishTracks$1.L$2 = track;
                                            localParticipant$republishTracks$1.label = 1;
                                            Object publishAudioTrack = localParticipant.publishAudioTrack((LocalAudioTrack) track, (AudioTrackPublishOptions) options, null, localParticipant$republishTracks$1);
                                            if (publishAudioTrack != aVar) {
                                                booleanValue = ((Boolean) publishAudioTrack).booleanValue();
                                                if (!booleanValue) {
                                                }
                                                while (it.hasNext()) {
                                                }
                                            }
                                        } else if (track instanceof LocalVideoTrack) {
                                            TrackPublishOptions options2 = localTrackPublication.getOptions();
                                            options2.getClass();
                                            localParticipant$republishTracks$1.L$0 = localParticipant;
                                            localParticipant$republishTracks$1.L$1 = it;
                                            localParticipant$republishTracks$1.L$2 = track;
                                            localParticipant$republishTracks$1.label = 2;
                                            obj = localParticipant.publishVideoTrack((LocalVideoTrack) track, (VideoTrackPublishOptions) options2, null, localParticipant$republishTracks$1);
                                        } else {
                                            c6.x("LocalParticipant has a non local track publish?");
                                            return null;
                                        }
                                        return aVar;
                                    }
                                }
                            }
                            return sn.z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    track = (Track) localParticipant$republishTracks$1.L$2;
                    it = (Iterator) localParticipant$republishTracks$1.L$1;
                    localParticipant = (LocalParticipant) localParticipant$republishTracks$1.L$0;
                    sn.a.g(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (!booleanValue) {
                    }
                    while (it.hasNext()) {
                    }
                    return sn.z.f31622a;
                }
                sn.a.g(obj);
                List<LocalTrackPublication> list2 = this.republishes;
                if (list2 != null) {
                    list = o.g1(list2);
                } else {
                    list = t.f33547a;
                }
                this.republishes = null;
                localParticipant = this;
                it = list.iterator();
                while (it.hasNext()) {
                }
                return sn.z.f31622a;
            }
        }
        localParticipant$republishTracks$1 = new LocalParticipant$republishTracks$1(this, cVar);
        Object obj2 = localParticipant$republishTracks$1.result;
        i10 = localParticipant$republishTracks$1.label;
        if (i10 == 0) {
        }
    }

    @Override // io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager
    /* renamed from: sendFile-0E7RQCE */
    public Object mo2559sendFile0E7RQCE(File file, StreamBytesOptions streamBytesOptions, c<? super sn.m> cVar) {
        return this.outgoingDataStreamManager.mo2559sendFile0E7RQCE(file, streamBytesOptions, cVar);
    }

    @Override // io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager
    /* renamed from: sendText-0E7RQCE */
    public Object mo2560sendText0E7RQCE(String str, StreamTextOptions streamTextOptions, c<? super sn.m> cVar) {
        return this.outgoingDataStreamManager.mo2560sendText0E7RQCE(str, streamTextOptions, cVar);
    }

    public final void setAudioTrackCaptureDefaults(LocalAudioTrackOptions localAudioTrackOptions) {
        localAudioTrackOptions.getClass();
        this.defaultsManager.setAudioTrackCaptureDefaults(localAudioTrackOptions);
    }

    public final void setAudioTrackPublishDefaults(AudioTrackPublishDefaults audioTrackPublishDefaults) {
        audioTrackPublishDefaults.getClass();
        this.defaultsManager.setAudioTrackPublishDefaults(audioTrackPublishDefaults);
    }

    public final Object setCameraEnabled(boolean z6, c<? super Boolean> cVar) {
        return setTrackEnabled$default(this, Track.Source.CAMERA, z6, null, cVar, 4, null);
    }

    public final void setDynacast$livekit_android_sdk_release(boolean z6) {
        this.dynacast = z6;
    }

    public final void setEnabledPublishCodecs$livekit_android_sdk_release(List<LivekitModels$Codec> codecs) {
        String str;
        codecs.getClass();
        List<LivekitModels$Codec> list = this.enabledPublishVideoCodecs;
        list.getClass();
        synchronized (list) {
            try {
                this.enabledPublishVideoCodecs.clear();
                List<LivekitModels$Codec> list2 = this.enabledPublishVideoCodecs;
                ArrayList arrayList = new ArrayList();
                for (Object obj : codecs) {
                    String mime = ((LivekitModels$Codec) obj).getMime();
                    mime.getClass();
                    List A0 = n.A0(mime, new char[]{'/'}, 6);
                    String str2 = null;
                    if (A0.isEmpty()) {
                        A0 = null;
                    }
                    if (A0 != null && (str = (String) A0.get(0)) != null) {
                        str2 = str.toLowerCase(Locale.ROOT);
                        str2.getClass();
                    }
                    if (m.c(str2, "video")) {
                        arrayList.add(obj);
                    }
                }
                list2.addAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object setMicrophoneEnabled(boolean z6, c<? super Boolean> cVar) {
        return setTrackEnabled$default(this, Track.Source.MICROPHONE, z6, null, cVar, 4, null);
    }

    public final Object setScreenShareEnabled(boolean z6, ScreenCaptureParams screenCaptureParams, c<? super Boolean> cVar) {
        return setTrackEnabled(Track.Source.SCREEN_SHARE, z6, screenCaptureParams, cVar);
    }

    public final void setScreenShareTrackCaptureDefaults(LocalVideoTrackOptions localVideoTrackOptions) {
        localVideoTrackOptions.getClass();
        this.defaultsManager.setScreenShareTrackCaptureDefaults(localVideoTrackOptions);
    }

    public final void setScreenShareTrackPublishDefaults(VideoTrackPublishDefaults videoTrackPublishDefaults) {
        videoTrackPublishDefaults.getClass();
        this.defaultsManager.setScreenShareTrackPublishDefaults(videoTrackPublishDefaults);
    }

    public final void setTrackSubscriptionPermissions(boolean allParticipantsAllowed, List<ParticipantTrackPermission> participantTrackPermissions) {
        participantTrackPermissions.getClass();
        this.engine.updateSubscriptionPermissions(allParticipantsAllowed, participantTrackPermissions);
    }

    public final void setVideoTrackCaptureDefaults(LocalVideoTrackOptions localVideoTrackOptions) {
        localVideoTrackOptions.getClass();
        this.defaultsManager.setVideoTrackCaptureDefaults(localVideoTrackOptions);
    }

    public final void setVideoTrackPublishDefaults(VideoTrackPublishDefaults videoTrackPublishDefaults) {
        videoTrackPublishDefaults.getClass();
        this.defaultsManager.setVideoTrackPublishDefaults(videoTrackPublishDefaults);
    }

    @Override // io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager
    public Object streamBytes(StreamBytesOptions streamBytesOptions, c<? super ByteStreamSender> cVar) {
        return this.outgoingDataStreamManager.streamBytes(streamBytesOptions, cVar);
    }

    @Override // io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager
    public Object streamText(StreamTextOptions streamTextOptions, c<? super TextStreamSender> cVar) {
        return this.outgoingDataStreamManager.streamText(streamTextOptions, cVar);
    }

    public final void unpublishTrack(Track track, boolean stopOnUnpublish) {
        Object obj;
        track.getClass();
        Iterator<T> it = getLocalTrackPublications().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (m.c(((LocalTrackPublication) obj).getTrack(), track)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LocalTrackPublication localTrackPublication = (LocalTrackPublication) obj;
        if (localTrackPublication == null) {
            LKLog.Companion companion = LKLog.INSTANCE;
            if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                et.d.a(null, "this track was never published.", new Object[0]);
                return;
            }
            return;
        }
        k1 k1Var = this.jobs.get(localTrackPublication);
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
            this.jobs.remove(k1Var);
        }
        String sid = localTrackPublication.getSid();
        LinkedHashMap T = a0.T(getTrackPublications());
        T.remove(sid);
        setTrackPublications(T);
        if (this.engine.getConnectionState() == ConnectionState.CONNECTED) {
            this.engine.removeTrack$livekit_android_sdk_release(track.getRtcTrack());
        }
        if (stopOnUnpublish) {
            track.stop();
        }
        ParticipantListener internalListener = getInternalListener();
        if (internalListener != null) {
            internalListener.onTrackUnpublished(localTrackPublication, this);
        }
        getEventBus().postEvent((BroadcastEventBus<ParticipantEvent>) new ParticipantEvent.LocalTrackUnpublished(this, localTrackPublication), getScope());
    }

    @Override // io.livekit.android.room.rpc.RpcManager
    public void unregisterRpcMethod(String method) {
        method.getClass();
        this.rpcHandlers.remove(method);
    }

    public final void updateAttributes(Map<String, String> attributes) {
        attributes.getClass();
        this.engine.getClient().sendUpdateLocalMetadata(getMetadata(), getName(), attributes);
    }

    @Override // io.livekit.android.room.participant.Participant
    public void updateFromInfo(LivekitModels$ParticipantInfo info) {
        LocalTrackPublication localTrackPublication;
        boolean muted;
        info.getClass();
        super.updateFromInfo(info);
        for (LivekitModels$TrackInfo livekitModels$TrackInfo : info.getTracksList()) {
            TrackPublication trackPublication = getTrackPublications().get(livekitModels$TrackInfo.getSid());
            if (trackPublication instanceof LocalTrackPublication) {
                localTrackPublication = (LocalTrackPublication) trackPublication;
            } else {
                localTrackPublication = null;
            }
            if (localTrackPublication != null && livekitModels$TrackInfo.getMuted() != (muted = localTrackPublication.getMuted())) {
                this.engine.updateMuteStatus(getSid(), muted);
            }
        }
    }

    public final void updateMetadata(String metadata) {
        metadata.getClass();
        SignalClient.sendUpdateLocalMetadata$default(this.engine.getClient(), metadata, getName(), null, 4, null);
    }

    public final void updateName(String name) {
        name.getClass();
        SignalClient.sendUpdateLocalMetadata$default(this.engine.getClient(), getMetadata(), name, null, 4, null);
    }

    public final LocalVideoTrack createVideoTrack(String name, LocalVideoTrackOptions options, VideoProcessor videoProcessor) {
        name.getClass();
        options.getClass();
        return LocalVideoTrack.INSTANCE.createCameraTrack$livekit_android_sdk_release(this.peerConnectionFactory, this.context, name, options, this.eglBase, this.videoTrackFactory, videoProcessor);
    }

    public static /* synthetic */ LocalVideoTrack createVideoTrack$default(LocalParticipant localParticipant, String str, LocalVideoTrackOptions localVideoTrackOptions, VideoProcessor videoProcessor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        if ((i10 & 2) != 0) {
            localVideoTrackOptions = LocalVideoTrackOptions.copy$default(localParticipant.getVideoTrackCaptureDefaults(), false, null, null, null, 15, null);
        }
        if ((i10 & 4) != 0) {
            videoProcessor = null;
        }
        return localParticipant.createVideoTrack(str, localVideoTrackOptions, videoProcessor);
    }
}
