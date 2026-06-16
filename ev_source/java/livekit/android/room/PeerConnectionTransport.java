package io.livekit.android.room;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import b.i;
import com.google.protobuf.c6;
import defpackage.f;
import fr.d0;
import fr.g0;
import fr.z;
import ho.l;
import ho.p;
import io.livekit.android.room.TrackBitrateInfoKey;
import io.livekit.android.util.CoroutineUtilKt;
import io.livekit.android.util.Either;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kr.d;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.SessionDescription;
import sn.a;
import wn.c;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002ghBK\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0014¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0014¢\u0006\u0004\b)\u0010%J\u0010\u0010*\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\u001d\u00101\u001a\u00020\u00142\u0006\u0010.\u001a\u00020!2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u001d\u00101\u001a\u00020\u00142\u0006\u00104\u001a\u0002032\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00105J\u0010\u00106\u001a\u00020&H\u0086@¢\u0006\u0004\b6\u0010+J\u0010\u00108\u001a\u000207H\u0086@¢\u0006\u0004\b8\u0010+J\u0010\u0010:\u001a\u000209H\u0086@¢\u0006\u0004\b:\u0010+J\u0010\u0010<\u001a\u00020;H\u0086@¢\u0006\u0004\b<\u0010+J\u001a\u0010?\u001a\u00020\u00142\b\b\u0002\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\b?\u0010@J*\u0010D\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020!2\b\b\u0002\u0010C\u001a\u00020&H\u0082@¢\u0006\u0004\bD\u0010EJK\u0010G\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172$\b\b\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020F\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018H\u0082H\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\bG\u0010\u001dJ2\u0010I\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000HH\u0002\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\bI\u0010JR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0014\u0010O\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR \u0010Q\u001a\u00020\u00198\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010%\u001a\u0004\bS\u0010TR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00120V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\"\u0010^\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020/0\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010'\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010aR%\u0010c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010=\u0012\u0004\u0012\u00020\u00140b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010f¨\u0006i"}, d2 = {"Lio/livekit/android/room/PeerConnectionTransport;", "", "Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "config", "Llivekit/org/webrtc/PeerConnection$Observer;", "pcObserver", "Lio/livekit/android/room/PeerConnectionTransport$Listener;", "listener", "Lfr/z;", "ioDispatcher", "Llivekit/org/webrtc/PeerConnectionFactory;", "connectionFactory", "Lb/i;", "sdpFactory", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Llivekit/org/webrtc/PeerConnection$RTCConfiguration;Llivekit/org/webrtc/PeerConnection$Observer;Lio/livekit/android/room/PeerConnectionTransport$Listener;Lfr/z;Llivekit/org/webrtc/PeerConnectionFactory;Lb/i;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "Llivekit/org/webrtc/IceCandidate;", "candidate", "Lsn/z;", "addIceCandidate", "(Llivekit/org/webrtc/IceCandidate;)V", TokenNames.T, "Lkotlin/Function2;", "Llivekit/org/webrtc/PeerConnection;", "Lwn/c;", "action", "withPeerConnection", "(Lho/p;Lwn/c;)Ljava/lang/Object;", "Llivekit/org/webrtc/SessionDescription;", "sd", "Lio/livekit/android/util/Either;", "", "setRemoteDescription", "(Llivekit/org/webrtc/SessionDescription;Lwn/c;)Ljava/lang/Object;", "prepareForIceRestart", "()V", "", "isClosed", "()Z", "closeBlocking", "close", "(Lwn/c;)Ljava/lang/Object;", "updateRTCConfig", "(Llivekit/org/webrtc/PeerConnection$RTCConfiguration;)V", "cid", "Lio/livekit/android/room/TrackBitrateInfo;", "trackBitrateInfo", "registerTrackBitrateInfo", "(Ljava/lang/String;Lio/livekit/android/room/TrackBitrateInfo;)V", "Llivekit/org/webrtc/RtpTransceiver;", "transceiver", "(Llivekit/org/webrtc/RtpTransceiver;Lio/livekit/android/room/TrackBitrateInfo;)V", "isConnected", "Llivekit/org/webrtc/PeerConnection$IceConnectionState;", "iceConnectionState", "Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "connectionState", "Llivekit/org/webrtc/PeerConnection$SignalingState;", "signalingState", "Llivekit/org/webrtc/MediaConstraints;", "constraints", "createAndSendOffer", "(Llivekit/org/webrtc/MediaConstraints;Lwn/c;)Ljava/lang/Object;", SIPServerTransaction.CONTENT_SUBTYPE_SDP, "mungedDescription", "remote", "setMungedSdp", "(Llivekit/org/webrtc/SessionDescription;Ljava/lang/String;ZLwn/c;)Ljava/lang/Object;", "Lfr/d0;", "launchRTCIfNotClosed", "Lkotlin/Function0;", "executeRTCIfNotClosed", "(Lho/a;)Ljava/lang/Object;", "Lio/livekit/android/room/PeerConnectionTransport$Listener;", "Lfr/z;", "Lb/i;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "coroutineScope", "Lfr/d0;", "peerConnection", "Llivekit/org/webrtc/PeerConnection;", "getPeerConnection$livekit_android_sdk_release", "()Llivekit/org/webrtc/PeerConnection;", "getPeerConnection$livekit_android_sdk_release$annotations", "", "pendingCandidates", "Ljava/util/List;", "restartingIce", "Z", "renegotiate", "", "Lio/livekit/android/room/TrackBitrateInfoKey;", "trackBitrates", "Ljava/util/Map;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/Function1;", "negotiate", "Lho/l;", "getNegotiate", "()Lho/l;", "Factory", "Listener", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PeerConnectionTransport {
    private final d0 coroutineScope;
    private final z ioDispatcher;
    private AtomicBoolean isClosed;
    private final Listener listener;
    private final l negotiate;
    private final PeerConnection peerConnection;
    private final List<IceCandidate> pendingCandidates;
    private boolean renegotiate;
    private boolean restartingIce;
    private final RTCThreadToken rtcThreadToken;
    private final i sdpFactory;
    private Map<TrackBitrateInfoKey, TrackBitrateInfo> trackBitrates;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lio/livekit/android/room/PeerConnectionTransport$Factory;", "", "create", "Lio/livekit/android/room/PeerConnectionTransport;", "config", "Llivekit/org/webrtc/PeerConnection$RTCConfiguration;", "pcObserver", "Llivekit/org/webrtc/PeerConnection$Observer;", "listener", "Lio/livekit/android/room/PeerConnectionTransport$Listener;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Factory {
        PeerConnectionTransport create(PeerConnection.RTCConfiguration config, PeerConnection.Observer pcObserver, Listener listener);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/PeerConnectionTransport$Listener;", "", "Llivekit/org/webrtc/SessionDescription;", "sd", "Lsn/z;", "onOffer", "(Llivekit/org/webrtc/SessionDescription;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public interface Listener {
        void onOffer(SessionDescription sd2);
    }

    public PeerConnectionTransport(final PeerConnection.RTCConfiguration rTCConfiguration, final PeerConnection.Observer observer, Listener listener, z zVar, final PeerConnectionFactory peerConnectionFactory, i iVar, final RTCThreadToken rTCThreadToken) {
        Object obj;
        rTCConfiguration.getClass();
        observer.getClass();
        zVar.getClass();
        peerConnectionFactory.getClass();
        iVar.getClass();
        rTCThreadToken.getClass();
        this.listener = listener;
        this.ioDispatcher = zVar;
        this.sdpFactory = iVar;
        this.rtcThreadToken = rTCThreadToken;
        d c5 = g0.c(zVar.plus(g0.f()));
        this.coroutineScope = c5;
        if (rTCThreadToken.isDisposed()) {
            obj = null;
        } else if (ib.i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
            obj = peerConnectionFactory.createPeerConnection(rTCConfiguration, observer);
            if (obj == null) {
                c6.x("peer connection creation failed?");
                throw null;
            }
        } else {
            obj = RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.room.PeerConnectionTransport$special$$inlined$executeBlockingOnRTCThread$1
                @Override // java.util.concurrent.Callable
                public final PeerConnection call() {
                    if (RTCThreadToken.this.isDisposed()) {
                        return null;
                    }
                    PeerConnection createPeerConnection = peerConnectionFactory.createPeerConnection(rTCConfiguration, observer);
                    if (createPeerConnection != null) {
                        return createPeerConnection;
                    }
                    c6.x("peer connection creation failed?");
                    return null;
                }
            }).get();
        }
        obj.getClass();
        this.peerConnection = (PeerConnection) obj;
        this.pendingCandidates = new ArrayList();
        this.trackBitrates = new LinkedHashMap();
        this.isClosed = new AtomicBoolean(false);
        this.negotiate = CoroutineUtilKt.debounce(20L, c5, new PeerConnectionTransport$negotiate$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createAndSendOffer(MediaConstraints mediaConstraints, c<? super sn.z> cVar) {
        PeerConnectionTransport$createAndSendOffer$1 peerConnectionTransport$createAndSendOffer$1;
        int i10;
        PeerConnectionTransport peerConnectionTransport;
        kotlin.jvm.internal.d0 d0Var;
        kotlin.jvm.internal.d0 d0Var2;
        Object obj;
        if (cVar instanceof PeerConnectionTransport$createAndSendOffer$1) {
            peerConnectionTransport$createAndSendOffer$1 = (PeerConnectionTransport$createAndSendOffer$1) cVar;
            int i11 = peerConnectionTransport$createAndSendOffer$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                peerConnectionTransport$createAndSendOffer$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = peerConnectionTransport$createAndSendOffer$1.result;
                i10 = peerConnectionTransport$createAndSendOffer$1.label;
                sn.z zVar = sn.z.f31622a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        d0Var = (kotlin.jvm.internal.d0) peerConnectionTransport$createAndSendOffer$1.L$1;
                        peerConnectionTransport = (PeerConnectionTransport) peerConnectionTransport$createAndSendOffer$1.L$0;
                        a.g(obj2);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj2);
                    if (this.listener == null) {
                        return zVar;
                    }
                    ?? obj3 = new Object();
                    PeerConnectionTransport$createAndSendOffer$2 peerConnectionTransport$createAndSendOffer$2 = new PeerConnectionTransport$createAndSendOffer$2(mediaConstraints, this, obj3, null);
                    if (isClosed()) {
                        peerConnectionTransport = this;
                        d0Var2 = obj3;
                        obj = d0Var2.f20559a;
                        if (obj != null) {
                            Listener listener = peerConnectionTransport.listener;
                            obj.getClass();
                            listener.onOffer((SessionDescription) obj);
                        }
                        return zVar;
                    }
                    RTCThreadToken rTCThreadToken = this.rtcThreadToken;
                    PeerConnectionTransport$launchRTCIfNotClosed$3 peerConnectionTransport$launchRTCIfNotClosed$3 = new PeerConnectionTransport$launchRTCIfNotClosed$3(this, peerConnectionTransport$createAndSendOffer$2, null);
                    peerConnectionTransport$createAndSendOffer$1.L$0 = this;
                    peerConnectionTransport$createAndSendOffer$1.L$1 = obj3;
                    peerConnectionTransport$createAndSendOffer$1.label = 1;
                    Object launchBlockingOnRTCThread = RTCThreadUtilsKt.launchBlockingOnRTCThread(rTCThreadToken, peerConnectionTransport$launchRTCIfNotClosed$3, peerConnectionTransport$createAndSendOffer$1);
                    xn.a aVar = xn.a.f37986a;
                    if (launchBlockingOnRTCThread == aVar) {
                        return aVar;
                    }
                    peerConnectionTransport = this;
                    d0Var = obj3;
                }
                d0Var2 = d0Var;
                obj = d0Var2.f20559a;
                if (obj != null) {
                }
                return zVar;
            }
        }
        peerConnectionTransport$createAndSendOffer$1 = new PeerConnectionTransport$createAndSendOffer$1(this, cVar);
        Object obj22 = peerConnectionTransport$createAndSendOffer$1.result;
        i10 = peerConnectionTransport$createAndSendOffer$1.label;
        sn.z zVar2 = sn.z.f31622a;
        if (i10 == 0) {
        }
        d0Var2 = d0Var;
        obj = d0Var2.f20559a;
        if (obj != null) {
        }
        return zVar2;
    }

    public static /* synthetic */ Object createAndSendOffer$default(PeerConnectionTransport peerConnectionTransport, MediaConstraints mediaConstraints, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mediaConstraints = new MediaConstraints();
        }
        return peerConnectionTransport.createAndSendOffer(mediaConstraints, cVar);
    }

    private final <T> T executeRTCIfNotClosed(final ho.a action) {
        if (!isClosed()) {
            final RTCThreadToken rTCThreadToken = this.rtcThreadToken;
            if (!rTCThreadToken.isDisposed()) {
                if (ib.i.u(RTCThreadUtilsKt.RTC_EXECUTOR_THREADNAME_PREFIX, false)) {
                    if (isClosed()) {
                        return null;
                    }
                    return (T) action.invoke();
                }
                return RTCThreadUtilsKt.executor.submit(new Callable() { // from class: io.livekit.android.room.PeerConnectionTransport$executeRTCIfNotClosed$$inlined$executeBlockingOnRTCThread$1
                    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final T call() {
                        if (RTCThreadToken.this.isDisposed() || this.isClosed()) {
                            return null;
                        }
                        return action.invoke();
                    }
                }).get();
            }
            return null;
        }
        return null;
    }

    private final <T> Object launchRTCIfNotClosed(p pVar, c<? super T> cVar) {
        if (isClosed()) {
            return null;
        }
        return RTCThreadUtilsKt.launchBlockingOnRTCThread(this.rtcThreadToken, new PeerConnectionTransport$launchRTCIfNotClosed$3(this, pVar, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Throwable, java.lang.Object, wn.c] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setMungedSdp(SessionDescription sessionDescription, String str, boolean z6, c<? super SessionDescription> cVar) {
        PeerConnectionTransport$setMungedSdp$1 peerConnectionTransport$setMungedSdp$1;
        int i10;
        SessionDescription sessionDescription2;
        String str2;
        String str3;
        c cVar2;
        Object launchBlockingOnRTCThread;
        PeerConnectionTransport peerConnectionTransport;
        PeerConnectionTransport peerConnectionTransport2;
        Object obj;
        Object obj2;
        String str4;
        ?? r13;
        SessionDescription sessionDescription3;
        boolean z10;
        String str5;
        Object obj3;
        Object obj4;
        Throwable th;
        int i11;
        String str6;
        SessionDescription sessionDescription4 = sessionDescription;
        boolean z11 = z6;
        if (cVar instanceof PeerConnectionTransport$setMungedSdp$1) {
            peerConnectionTransport$setMungedSdp$1 = (PeerConnectionTransport$setMungedSdp$1) cVar;
            int i12 = peerConnectionTransport$setMungedSdp$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                peerConnectionTransport$setMungedSdp$1.label = i12 - Integer.MIN_VALUE;
                Object obj5 = peerConnectionTransport$setMungedSdp$1.result;
                i10 = peerConnectionTransport$setMungedSdp$1.label;
                String str7 = "unknown sdp error";
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            z10 = peerConnectionTransport$setMungedSdp$1.Z$0;
                            sessionDescription3 = (SessionDescription) peerConnectionTransport$setMungedSdp$1.L$0;
                            a.g(obj5);
                            str2 = "local";
                            str3 = "remote";
                            SessionDescription sessionDescription5 = sessionDescription3;
                            z11 = z10;
                            sessionDescription4 = sessionDescription5;
                            obj3 = obj5;
                            obj4 = (Either) obj3;
                            if (obj4 == null) {
                                obj4 = new Either.Right("PCT closed");
                            }
                            if (obj4 instanceof Either.Right) {
                                Either.Right right = (Either.Right) obj4;
                                CharSequence charSequence = (CharSequence) right.getValue();
                                if (charSequence != null && !n.m0(charSequence)) {
                                    str7 = (String) right.getValue();
                                }
                                LKLog.Companion companion = LKLog.INSTANCE;
                                LoggingLevel loggingLevel = LoggingLevel.WARN;
                                LKLog.Companion companion2 = LKLog.INSTANCE;
                                if (loggingLevel.compareTo(companion2.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                    StringBuilder sb = new StringBuilder("setting original sdp for ");
                                    if (z11) {
                                        str6 = str3;
                                    } else {
                                        str6 = str2;
                                    }
                                    sb.append(str6);
                                    sb.append(" description, ");
                                    sb.append(sessionDescription4.type);
                                    sb.append(" type failed!");
                                    i11 = 0;
                                    th = null;
                                    et.d.f(null, sb.toString(), new Object[0]);
                                } else {
                                    th = null;
                                    i11 = 0;
                                }
                                if (loggingLevel.compareTo(companion2.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                    et.d.f(th, f.i("error: ", str7), new Object[i11]);
                                }
                            }
                            return sessionDescription4;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z12 = peerConnectionTransport$setMungedSdp$1.Z$0;
                    SessionDescription sessionDescription6 = (SessionDescription) peerConnectionTransport$setMungedSdp$1.L$2;
                    SessionDescription sessionDescription7 = (SessionDescription) peerConnectionTransport$setMungedSdp$1.L$1;
                    peerConnectionTransport = (PeerConnectionTransport) peerConnectionTransport$setMungedSdp$1.L$0;
                    a.g(obj5);
                    z11 = z12;
                    sessionDescription4 = sessionDescription7;
                    launchBlockingOnRTCThread = obj5;
                    sessionDescription2 = sessionDescription6;
                    str2 = "local";
                    str3 = "remote";
                } else {
                    a.g(obj5);
                    sessionDescription2 = new SessionDescription(sessionDescription4.type, str);
                    LKLog.Companion companion3 = LKLog.INSTANCE;
                    LoggingLevel loggingLevel2 = LoggingLevel.VERBOSE;
                    LKLog.Companion companion4 = LKLog.INSTANCE;
                    if (loggingLevel2.compareTo(companion4.getLoggingLevel()) < 0 || et.d.d() <= 0) {
                        str2 = "local";
                        str3 = "remote";
                    } else {
                        str2 = "local";
                        str3 = "remote";
                        et.d.e(null, "sdp type: " + sessionDescription4.type + "\ndescription:\n" + sessionDescription4.description, new Object[0]);
                    }
                    if (loggingLevel2.compareTo(companion4.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                        cVar2 = null;
                        et.d.e(null, "munged sdp type: " + sessionDescription2.type + "\ndescription:\n" + sessionDescription2.description, new Object[0]);
                    } else {
                        cVar2 = null;
                    }
                    PeerConnectionTransport$setMungedSdp$mungedResult$1 peerConnectionTransport$setMungedSdp$mungedResult$1 = new PeerConnectionTransport$setMungedSdp$mungedResult$1(z11, this, sessionDescription2, cVar2);
                    if (isClosed()) {
                        peerConnectionTransport2 = this;
                        obj = cVar2;
                        obj2 = (Either) obj;
                        if (obj2 == null) {
                            obj2 = new Either.Right("PCT closed");
                        }
                        if (obj2 instanceof Either.Left) {
                            return sessionDescription2;
                        }
                        if (obj2 instanceof Either.Right) {
                            Either.Right right2 = (Either.Right) obj2;
                            CharSequence charSequence2 = (CharSequence) right2.getValue();
                            if (charSequence2 == null || n.m0(charSequence2)) {
                                str4 = "unknown sdp error";
                            } else {
                                str4 = (String) right2.getValue();
                            }
                            LKLog.Companion companion5 = LKLog.INSTANCE;
                            LoggingLevel loggingLevel3 = LoggingLevel.WARN;
                            LKLog.Companion companion6 = LKLog.INSTANCE;
                            if (loggingLevel3.compareTo(companion6.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                StringBuilder sb2 = new StringBuilder("setting munged sdp for ");
                                if (z11) {
                                    str5 = str3;
                                } else {
                                    str5 = str2;
                                }
                                sb2.append(str5);
                                sb2.append(" description, ");
                                sb2.append(sessionDescription2.type);
                                sb2.append(" type failed, falling back to unmodified.");
                                r13 = 0;
                                et.d.f(null, sb2.toString(), new Object[0]);
                            } else {
                                r13 = 0;
                            }
                            if (loggingLevel3.compareTo(companion6.getLoggingLevel()) >= 0 && et.d.d() > 0) {
                                et.d.f(r13, f.i("error: ", str4), new Object[0]);
                            }
                            PeerConnectionTransport$setMungedSdp$result$1 peerConnectionTransport$setMungedSdp$result$1 = new PeerConnectionTransport$setMungedSdp$result$1(z11, peerConnectionTransport2, sessionDescription4, r13);
                            obj3 = r13;
                            if (!peerConnectionTransport2.isClosed()) {
                                RTCThreadToken rTCThreadToken = peerConnectionTransport2.rtcThreadToken;
                                PeerConnectionTransport$launchRTCIfNotClosed$3 peerConnectionTransport$launchRTCIfNotClosed$3 = new PeerConnectionTransport$launchRTCIfNotClosed$3(peerConnectionTransport2, peerConnectionTransport$setMungedSdp$result$1, r13);
                                peerConnectionTransport$setMungedSdp$1.L$0 = sessionDescription4;
                                peerConnectionTransport$setMungedSdp$1.L$1 = r13;
                                peerConnectionTransport$setMungedSdp$1.L$2 = r13;
                                peerConnectionTransport$setMungedSdp$1.Z$0 = z11;
                                peerConnectionTransport$setMungedSdp$1.label = 2;
                                obj5 = RTCThreadUtilsKt.launchBlockingOnRTCThread(rTCThreadToken, peerConnectionTransport$launchRTCIfNotClosed$3, peerConnectionTransport$setMungedSdp$1);
                                if (obj5 != aVar) {
                                    boolean z13 = z11;
                                    sessionDescription3 = sessionDescription4;
                                    z10 = z13;
                                    SessionDescription sessionDescription52 = sessionDescription3;
                                    z11 = z10;
                                    sessionDescription4 = sessionDescription52;
                                    obj3 = obj5;
                                }
                                return aVar;
                            }
                            obj4 = (Either) obj3;
                            if (obj4 == null) {
                            }
                            if (obj4 instanceof Either.Right) {
                            }
                            return sessionDescription4;
                        }
                        c6.p();
                        return null;
                    }
                    RTCThreadToken rTCThreadToken2 = this.rtcThreadToken;
                    PeerConnectionTransport$launchRTCIfNotClosed$3 peerConnectionTransport$launchRTCIfNotClosed$32 = new PeerConnectionTransport$launchRTCIfNotClosed$3(this, peerConnectionTransport$setMungedSdp$mungedResult$1, cVar2);
                    peerConnectionTransport$setMungedSdp$1.L$0 = this;
                    peerConnectionTransport$setMungedSdp$1.L$1 = sessionDescription4;
                    peerConnectionTransport$setMungedSdp$1.L$2 = sessionDescription2;
                    peerConnectionTransport$setMungedSdp$1.Z$0 = z11;
                    peerConnectionTransport$setMungedSdp$1.label = 1;
                    launchBlockingOnRTCThread = RTCThreadUtilsKt.launchBlockingOnRTCThread(rTCThreadToken2, peerConnectionTransport$launchRTCIfNotClosed$32, peerConnectionTransport$setMungedSdp$1);
                    if (launchBlockingOnRTCThread != aVar) {
                        peerConnectionTransport = this;
                    }
                    return aVar;
                }
                PeerConnectionTransport peerConnectionTransport3 = peerConnectionTransport;
                obj = launchBlockingOnRTCThread;
                peerConnectionTransport2 = peerConnectionTransport3;
                obj2 = (Either) obj;
                if (obj2 == null) {
                }
                if (obj2 instanceof Either.Left) {
                }
            }
        }
        peerConnectionTransport$setMungedSdp$1 = new PeerConnectionTransport$setMungedSdp$1(this, cVar);
        Object obj52 = peerConnectionTransport$setMungedSdp$1.result;
        i10 = peerConnectionTransport$setMungedSdp$1.label;
        String str72 = "unknown sdp error";
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        PeerConnectionTransport peerConnectionTransport32 = peerConnectionTransport;
        obj = launchBlockingOnRTCThread;
        peerConnectionTransport2 = peerConnectionTransport32;
        obj2 = (Either) obj;
        if (obj2 == null) {
        }
        if (obj2 instanceof Either.Left) {
        }
    }

    public static /* synthetic */ Object setMungedSdp$default(PeerConnectionTransport peerConnectionTransport, SessionDescription sessionDescription, String str, boolean z6, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return peerConnectionTransport.setMungedSdp(sessionDescription, str, z6, cVar);
    }

    public final void addIceCandidate(IceCandidate candidate) {
        candidate.getClass();
        executeRTCIfNotClosed(new PeerConnectionTransport$addIceCandidate$1(this, candidate));
    }

    public final Object close(c<? super sn.z> cVar) {
        PeerConnectionTransport$close$2 peerConnectionTransport$close$2 = new PeerConnectionTransport$close$2(this, null);
        if (isClosed()) {
            return null;
        }
        return RTCThreadUtilsKt.launchBlockingOnRTCThread(this.rtcThreadToken, new PeerConnectionTransport$launchRTCIfNotClosed$3(this, peerConnectionTransport$close$2, null), cVar);
    }

    public final void closeBlocking() {
        g0.I(wn.i.f37087a, new PeerConnectionTransport$closeBlocking$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object connectionState(c<? super PeerConnection.PeerConnectionState> cVar) {
        PeerConnectionTransport$connectionState$1 peerConnectionTransport$connectionState$1;
        int i10;
        Object obj;
        PeerConnection.PeerConnectionState peerConnectionState;
        if (cVar instanceof PeerConnectionTransport$connectionState$1) {
            peerConnectionTransport$connectionState$1 = (PeerConnectionTransport$connectionState$1) cVar;
            int i11 = peerConnectionTransport$connectionState$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                peerConnectionTransport$connectionState$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = peerConnectionTransport$connectionState$1.result;
                i10 = peerConnectionTransport$connectionState$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj2);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj2);
                    obj = null;
                    PeerConnectionTransport$connectionState$2 peerConnectionTransport$connectionState$2 = new PeerConnectionTransport$connectionState$2(this, null);
                    if (!isClosed()) {
                        RTCThreadToken rTCThreadToken = this.rtcThreadToken;
                        PeerConnectionTransport$launchRTCIfNotClosed$3 peerConnectionTransport$launchRTCIfNotClosed$3 = new PeerConnectionTransport$launchRTCIfNotClosed$3(this, peerConnectionTransport$connectionState$2, null);
                        peerConnectionTransport$connectionState$1.label = 1;
                        obj2 = RTCThreadUtilsKt.launchBlockingOnRTCThread(rTCThreadToken, peerConnectionTransport$launchRTCIfNotClosed$3, peerConnectionTransport$connectionState$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    }
                    peerConnectionState = (PeerConnection.PeerConnectionState) obj;
                    if (peerConnectionState == null) {
                        return PeerConnection.PeerConnectionState.CLOSED;
                    }
                    return peerConnectionState;
                }
                obj = obj2;
                peerConnectionState = (PeerConnection.PeerConnectionState) obj;
                if (peerConnectionState == null) {
                }
            }
        }
        peerConnectionTransport$connectionState$1 = new PeerConnectionTransport$connectionState$1(this, cVar);
        Object obj22 = peerConnectionTransport$connectionState$1.result;
        i10 = peerConnectionTransport$connectionState$1.label;
        if (i10 == 0) {
        }
        obj = obj22;
        peerConnectionState = (PeerConnection.PeerConnectionState) obj;
        if (peerConnectionState == null) {
        }
    }

    public final l getNegotiate() {
        return this.negotiate;
    }

    /* renamed from: getPeerConnection$livekit_android_sdk_release, reason: from getter */
    public final PeerConnection getPeerConnection() {
        return this.peerConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object iceConnectionState(c<? super PeerConnection.IceConnectionState> cVar) {
        PeerConnectionTransport$iceConnectionState$1 peerConnectionTransport$iceConnectionState$1;
        int i10;
        Object obj;
        PeerConnection.IceConnectionState iceConnectionState;
        if (cVar instanceof PeerConnectionTransport$iceConnectionState$1) {
            peerConnectionTransport$iceConnectionState$1 = (PeerConnectionTransport$iceConnectionState$1) cVar;
            int i11 = peerConnectionTransport$iceConnectionState$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                peerConnectionTransport$iceConnectionState$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = peerConnectionTransport$iceConnectionState$1.result;
                i10 = peerConnectionTransport$iceConnectionState$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj2);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj2);
                    obj = null;
                    PeerConnectionTransport$iceConnectionState$2 peerConnectionTransport$iceConnectionState$2 = new PeerConnectionTransport$iceConnectionState$2(this, null);
                    if (!isClosed()) {
                        RTCThreadToken rTCThreadToken = this.rtcThreadToken;
                        PeerConnectionTransport$launchRTCIfNotClosed$3 peerConnectionTransport$launchRTCIfNotClosed$3 = new PeerConnectionTransport$launchRTCIfNotClosed$3(this, peerConnectionTransport$iceConnectionState$2, null);
                        peerConnectionTransport$iceConnectionState$1.label = 1;
                        obj2 = RTCThreadUtilsKt.launchBlockingOnRTCThread(rTCThreadToken, peerConnectionTransport$launchRTCIfNotClosed$3, peerConnectionTransport$iceConnectionState$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    }
                    iceConnectionState = (PeerConnection.IceConnectionState) obj;
                    if (iceConnectionState == null) {
                        return PeerConnection.IceConnectionState.CLOSED;
                    }
                    return iceConnectionState;
                }
                obj = obj2;
                iceConnectionState = (PeerConnection.IceConnectionState) obj;
                if (iceConnectionState == null) {
                }
            }
        }
        peerConnectionTransport$iceConnectionState$1 = new PeerConnectionTransport$iceConnectionState$1(this, cVar);
        Object obj22 = peerConnectionTransport$iceConnectionState$1.result;
        i10 = peerConnectionTransport$iceConnectionState$1.label;
        if (i10 == 0) {
        }
        obj = obj22;
        iceConnectionState = (PeerConnection.IceConnectionState) obj;
        if (iceConnectionState == null) {
        }
    }

    public final boolean isClosed() {
        return this.isClosed.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isConnected(c<? super Boolean> cVar) {
        PeerConnectionTransport$isConnected$1 peerConnectionTransport$isConnected$1;
        int i10;
        Object obj;
        Boolean bool;
        boolean z6;
        if (cVar instanceof PeerConnectionTransport$isConnected$1) {
            peerConnectionTransport$isConnected$1 = (PeerConnectionTransport$isConnected$1) cVar;
            int i11 = peerConnectionTransport$isConnected$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                peerConnectionTransport$isConnected$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = peerConnectionTransport$isConnected$1.result;
                i10 = peerConnectionTransport$isConnected$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj2);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj2);
                    obj = null;
                    PeerConnectionTransport$isConnected$2 peerConnectionTransport$isConnected$2 = new PeerConnectionTransport$isConnected$2(this, null);
                    if (!isClosed()) {
                        RTCThreadToken rTCThreadToken = this.rtcThreadToken;
                        PeerConnectionTransport$launchRTCIfNotClosed$3 peerConnectionTransport$launchRTCIfNotClosed$3 = new PeerConnectionTransport$launchRTCIfNotClosed$3(this, peerConnectionTransport$isConnected$2, null);
                        peerConnectionTransport$isConnected$1.label = 1;
                        obj2 = RTCThreadUtilsKt.launchBlockingOnRTCThread(rTCThreadToken, peerConnectionTransport$launchRTCIfNotClosed$3, peerConnectionTransport$isConnected$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    }
                    bool = (Boolean) obj;
                    if (bool != null) {
                        z6 = bool.booleanValue();
                    } else {
                        z6 = false;
                    }
                    return Boolean.valueOf(z6);
                }
                obj = obj2;
                bool = (Boolean) obj;
                if (bool != null) {
                }
                return Boolean.valueOf(z6);
            }
        }
        peerConnectionTransport$isConnected$1 = new PeerConnectionTransport$isConnected$1(this, cVar);
        Object obj22 = peerConnectionTransport$isConnected$1.result;
        i10 = peerConnectionTransport$isConnected$1.label;
        if (i10 == 0) {
        }
        obj = obj22;
        bool = (Boolean) obj;
        if (bool != null) {
        }
        return Boolean.valueOf(z6);
    }

    public final void prepareForIceRestart() {
        this.restartingIce = true;
    }

    public final void registerTrackBitrateInfo(String cid, TrackBitrateInfo trackBitrateInfo) {
        cid.getClass();
        trackBitrateInfo.getClass();
        this.trackBitrates.put(new TrackBitrateInfoKey.Cid(cid), trackBitrateInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setRemoteDescription(SessionDescription sessionDescription, c<? super Either<sn.z, String>> cVar) {
        PeerConnectionTransport$setRemoteDescription$1 peerConnectionTransport$setRemoteDescription$1;
        int i10;
        PeerConnectionTransport peerConnectionTransport;
        Object obj;
        if (cVar instanceof PeerConnectionTransport$setRemoteDescription$1) {
            peerConnectionTransport$setRemoteDescription$1 = (PeerConnectionTransport$setRemoteDescription$1) cVar;
            int i11 = peerConnectionTransport$setRemoteDescription$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                peerConnectionTransport$setRemoteDescription$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = peerConnectionTransport$setRemoteDescription$1.result;
                i10 = peerConnectionTransport$setRemoteDescription$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            Either either = (Either) peerConnectionTransport$setRemoteDescription$1.L$0;
                            a.g(obj2);
                            return either;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    peerConnectionTransport = (PeerConnectionTransport) peerConnectionTransport$setRemoteDescription$1.L$0;
                    a.g(obj2);
                } else {
                    a.g(obj2);
                    PeerConnectionTransport$setRemoteDescription$result$1 peerConnectionTransport$setRemoteDescription$result$1 = new PeerConnectionTransport$setRemoteDescription$result$1(this, sessionDescription, null);
                    if (isClosed()) {
                        peerConnectionTransport = this;
                        obj2 = null;
                    } else {
                        RTCThreadToken rTCThreadToken = this.rtcThreadToken;
                        PeerConnectionTransport$launchRTCIfNotClosed$3 peerConnectionTransport$launchRTCIfNotClosed$3 = new PeerConnectionTransport$launchRTCIfNotClosed$3(this, peerConnectionTransport$setRemoteDescription$result$1, null);
                        peerConnectionTransport$setRemoteDescription$1.L$0 = this;
                        peerConnectionTransport$setRemoteDescription$1.label = 1;
                        obj2 = RTCThreadUtilsKt.launchBlockingOnRTCThread(rTCThreadToken, peerConnectionTransport$launchRTCIfNotClosed$3, peerConnectionTransport$setRemoteDescription$1);
                        if (obj2 != aVar) {
                            peerConnectionTransport = this;
                        }
                        return aVar;
                    }
                }
                obj = (Either) obj2;
                if (obj == null) {
                    obj = new Either.Right("PCT is closed.");
                }
                if (peerConnectionTransport.renegotiate) {
                    peerConnectionTransport.renegotiate = false;
                    peerConnectionTransport$setRemoteDescription$1.L$0 = obj;
                    peerConnectionTransport$setRemoteDescription$1.label = 2;
                    if (createAndSendOffer$default(peerConnectionTransport, null, peerConnectionTransport$setRemoteDescription$1, 1, null) == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }
        peerConnectionTransport$setRemoteDescription$1 = new PeerConnectionTransport$setRemoteDescription$1(this, cVar);
        Object obj22 = peerConnectionTransport$setRemoteDescription$1.result;
        i10 = peerConnectionTransport$setRemoteDescription$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        obj = (Either) obj22;
        if (obj == null) {
        }
        if (peerConnectionTransport.renegotiate) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signalingState(c<? super PeerConnection.SignalingState> cVar) {
        PeerConnectionTransport$signalingState$1 peerConnectionTransport$signalingState$1;
        int i10;
        Object obj;
        PeerConnection.SignalingState signalingState;
        if (cVar instanceof PeerConnectionTransport$signalingState$1) {
            peerConnectionTransport$signalingState$1 = (PeerConnectionTransport$signalingState$1) cVar;
            int i11 = peerConnectionTransport$signalingState$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                peerConnectionTransport$signalingState$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = peerConnectionTransport$signalingState$1.result;
                i10 = peerConnectionTransport$signalingState$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a.g(obj2);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    a.g(obj2);
                    obj = null;
                    PeerConnectionTransport$signalingState$2 peerConnectionTransport$signalingState$2 = new PeerConnectionTransport$signalingState$2(this, null);
                    if (!isClosed()) {
                        RTCThreadToken rTCThreadToken = this.rtcThreadToken;
                        PeerConnectionTransport$launchRTCIfNotClosed$3 peerConnectionTransport$launchRTCIfNotClosed$3 = new PeerConnectionTransport$launchRTCIfNotClosed$3(this, peerConnectionTransport$signalingState$2, null);
                        peerConnectionTransport$signalingState$1.label = 1;
                        obj2 = RTCThreadUtilsKt.launchBlockingOnRTCThread(rTCThreadToken, peerConnectionTransport$launchRTCIfNotClosed$3, peerConnectionTransport$signalingState$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    }
                    signalingState = (PeerConnection.SignalingState) obj;
                    if (signalingState == null) {
                        return PeerConnection.SignalingState.CLOSED;
                    }
                    return signalingState;
                }
                obj = obj2;
                signalingState = (PeerConnection.SignalingState) obj;
                if (signalingState == null) {
                }
            }
        }
        peerConnectionTransport$signalingState$1 = new PeerConnectionTransport$signalingState$1(this, cVar);
        Object obj22 = peerConnectionTransport$signalingState$1.result;
        i10 = peerConnectionTransport$signalingState$1.label;
        if (i10 == 0) {
        }
        obj = obj22;
        signalingState = (PeerConnection.SignalingState) obj;
        if (signalingState == null) {
        }
    }

    public final void updateRTCConfig(PeerConnection.RTCConfiguration config) {
        config.getClass();
        executeRTCIfNotClosed(new PeerConnectionTransport$updateRTCConfig$1(this, config));
    }

    public final <T> Object withPeerConnection(p pVar, c<? super T> cVar) {
        PeerConnectionTransport$withPeerConnection$2 peerConnectionTransport$withPeerConnection$2 = new PeerConnectionTransport$withPeerConnection$2(pVar, this, null);
        if (isClosed()) {
            return null;
        }
        return RTCThreadUtilsKt.launchBlockingOnRTCThread(this.rtcThreadToken, new PeerConnectionTransport$launchRTCIfNotClosed$3(this, peerConnectionTransport$withPeerConnection$2, null), cVar);
    }

    public final void registerTrackBitrateInfo(RtpTransceiver transceiver, TrackBitrateInfo trackBitrateInfo) {
        transceiver.getClass();
        trackBitrateInfo.getClass();
        this.trackBitrates.put(new TrackBitrateInfoKey.Transceiver(transceiver), trackBitrateInfo);
    }

    public static /* synthetic */ void getPeerConnection$livekit_android_sdk_release$annotations() {
    }
}
