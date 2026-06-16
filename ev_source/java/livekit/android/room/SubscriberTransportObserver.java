package io.livekit.android.room;

import et.d;
import ho.l;
import io.livekit.android.room.util.PeerConnectionStateObservable;
import io.livekit.android.util.FlowDelegateKt;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.util.MutableStateFlowDelegate;
import io.livekit.android.webrtc.peerconnection.RTCThreadToken;
import io.livekit.android.webrtc.peerconnection.RTCThreadUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.CandidatePairChangeEvent;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.MediaStream;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.RtpTransceiver;
import oo.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010 \u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b.\u0010\"J\u0017\u00100\u001a\u00020\r2\u0006\u0010+\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020\r2\u0010\u0010+\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\u0012H\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010<R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010>R0\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER6\u0010G\u001a\u0016\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\r\u0018\u00010?j\u0004\u0018\u0001`F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER1\u0010Q\u001a\u00020#2\u0006\u0010J\u001a\u00020#8W@RX\u0097\u008e\u0002¢\u0006\u0018\n\u0004\bK\u0010L\u0012\u0004\bP\u0010;\u001a\u0004\bM\u0010N\"\u0004\bO\u0010%¨\u0006R"}, d2 = {"Lio/livekit/android/room/SubscriberTransportObserver;", "Llivekit/org/webrtc/PeerConnection$Observer;", "Lio/livekit/android/room/util/PeerConnectionStateObservable;", "Lio/livekit/android/room/RTCEngine;", "engine", "Lio/livekit/android/room/SignalClient;", "client", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Lio/livekit/android/room/RTCEngine;Lio/livekit/android/room/SignalClient;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "Llivekit/org/webrtc/IceCandidate;", "candidate", "Lsn/z;", "onIceCandidate", "(Llivekit/org/webrtc/IceCandidate;)V", "Llivekit/org/webrtc/RtpReceiver;", "receiver", "", "Llivekit/org/webrtc/MediaStream;", "streams", "onAddTrack", "(Llivekit/org/webrtc/RtpReceiver;[Llivekit/org/webrtc/MediaStream;)V", "Llivekit/org/webrtc/RtpTransceiver;", "transceiver", "onTrack", "(Llivekit/org/webrtc/RtpTransceiver;)V", "Llivekit/org/webrtc/DataChannel;", "channel", "onDataChannel", "(Llivekit/org/webrtc/DataChannel;)V", "Llivekit/org/webrtc/PeerConnection$IceConnectionState;", "newState", "onStandardizedIceConnectionChange", "(Llivekit/org/webrtc/PeerConnection$IceConnectionState;)V", "Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "onConnectionChange", "(Llivekit/org/webrtc/PeerConnection$PeerConnectionState;)V", "Llivekit/org/webrtc/CandidatePairChangeEvent;", "event", "onSelectedCandidatePairChanged", "(Llivekit/org/webrtc/CandidatePairChangeEvent;)V", "Llivekit/org/webrtc/PeerConnection$SignalingState;", "p0", "onSignalingChange", "(Llivekit/org/webrtc/PeerConnection$SignalingState;)V", "onIceConnectionChange", "", "onIceConnectionReceivingChange", "(Z)V", "Llivekit/org/webrtc/PeerConnection$IceGatheringState;", "onIceGatheringChange", "(Llivekit/org/webrtc/PeerConnection$IceGatheringState;)V", "onIceCandidatesRemoved", "([Llivekit/org/webrtc/IceCandidate;)V", "onAddStream", "(Llivekit/org/webrtc/MediaStream;)V", "onRemoveStream", "onRenegotiationNeeded", "()V", "Lio/livekit/android/room/RTCEngine;", "Lio/livekit/android/room/SignalClient;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "Lkotlin/Function1;", "dataChannelListener", "Lho/l;", "getDataChannelListener", "()Lho/l;", "setDataChannelListener", "(Lho/l;)V", "Lio/livekit/android/room/PeerConnectionStateListener;", "connectionChangeListener", "getConnectionChangeListener", "setConnectionChangeListener", "<set-?>", "connectionState$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getConnectionState", "()Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "setConnectionState", "getConnectionState$annotations", "connectionState", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SubscriberTransportObserver implements PeerConnection.Observer, PeerConnectionStateObservable {
    static final /* synthetic */ u[] $$delegatedProperties = {e0.f20562a.e(new q(SubscriberTransportObserver.class, "connectionState", "getConnectionState()Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", 0))};
    private final SignalClient client;
    private l connectionChangeListener;

    /* renamed from: connectionState$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate connectionState;
    private l dataChannelListener;
    private final RTCEngine engine;
    private final RTCThreadToken rtcThreadToken;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaStreamTrack.MediaType.values().length];
            try {
                iArr[MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SubscriberTransportObserver(RTCEngine rTCEngine, SignalClient signalClient, RTCThreadToken rTCThreadToken) {
        rTCEngine.getClass();
        signalClient.getClass();
        rTCThreadToken.getClass();
        this.engine = rTCEngine;
        this.client = signalClient;
        this.rtcThreadToken = rTCThreadToken;
        this.connectionState = FlowDelegateKt.flowDelegate$default(PeerConnection.PeerConnectionState.NEW, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionState(PeerConnection.PeerConnectionState peerConnectionState) {
        this.connectionState.setValue(this, $$delegatedProperties[0], peerConnectionState);
    }

    public final l getConnectionChangeListener() {
        return this.connectionChangeListener;
    }

    @Override // io.livekit.android.room.util.PeerConnectionStateObservable
    public PeerConnection.PeerConnectionState getConnectionState() {
        return (PeerConnection.PeerConnectionState) this.connectionState.getValue(this, $$delegatedProperties[0]);
    }

    public final l getDataChannelListener() {
        return this.dataChannelListener;
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver receiver, MediaStream[] streams) {
        receiver.getClass();
        streams.getClass();
        RTCThreadUtilsKt.executeOnRTCThread(this.rtcThreadToken, new SubscriberTransportObserver$onAddTrack$1(receiver, this, streams));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onConnectionChange(PeerConnection.PeerConnectionState newState) {
        newState.getClass();
        RTCThreadUtilsKt.executeOnRTCThread(this.rtcThreadToken, new SubscriberTransportObserver$onConnectionChange$1(this, newState));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel channel) {
        channel.getClass();
        RTCThreadUtilsKt.executeOnRTCThread(this.rtcThreadToken, new SubscriberTransportObserver$onDataChannel$1(this, channel));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate candidate) {
        candidate.getClass();
        RTCThreadUtilsKt.executeOnRTCThread(this.rtcThreadToken, new SubscriberTransportObserver$onIceCandidate$1(this, candidate));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState newState) {
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "onIceConnection new state: " + newState, new Object[0]);
        }
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onTrack(RtpTransceiver transceiver) {
        int i10;
        transceiver.getClass();
        MediaStreamTrack.MediaType mediaType = transceiver.getMediaType();
        if (mediaType == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[mediaType.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.a(null, "peerconn started receiving unknown media type: " + transceiver.getMediaType(), new Object[0]);
                    return;
                }
                return;
            }
            LKLog.Companion companion2 = LKLog.INSTANCE;
            if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                d.e(null, "peerconn started receiving video", new Object[0]);
                return;
            }
            return;
        }
        LKLog.Companion companion3 = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "peerconn started receiving audio", new Object[0]);
        }
    }

    public final void setConnectionChangeListener(l lVar) {
        this.connectionChangeListener = lVar;
    }

    public final void setDataChannelListener(l lVar) {
        this.dataChannelListener = lVar;
    }

    public static /* synthetic */ void getConnectionState$annotations() {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream p02) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] p02) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean p02) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState p02) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream p02) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent event) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState p02) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState newState) {
    }
}
