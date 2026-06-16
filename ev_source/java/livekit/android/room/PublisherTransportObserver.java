package io.livekit.android.room;

import et.d;
import ho.l;
import io.livekit.android.room.PeerConnectionTransport;
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
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.RtpTransceiver;
import livekit.org.webrtc.SessionDescription;
import oo.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u000e2\u0010\u0010$\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b3\u00102J\u0019\u00106\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J+\u0010>\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010<2\u0010\u0010=\u001a\f\u0012\u0006\b\u0001\u0012\u000200\u0018\u00010-H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR6\u0010E\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e\u0018\u00010Cj\u0004\u0018\u0001`D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR1\u0010R\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020\u001c8W@RX\u0097\u008e\u0002¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bQ\u0010\u0012\u001a\u0004\bN\u0010O\"\u0004\bP\u0010\u001e¨\u0006S"}, d2 = {"Lio/livekit/android/room/PublisherTransportObserver;", "Llivekit/org/webrtc/PeerConnection$Observer;", "Lio/livekit/android/room/PeerConnectionTransport$Listener;", "Lio/livekit/android/room/util/PeerConnectionStateObservable;", "Lio/livekit/android/room/RTCEngine;", "engine", "Lio/livekit/android/room/SignalClient;", "client", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "rtcThreadToken", "<init>", "(Lio/livekit/android/room/RTCEngine;Lio/livekit/android/room/SignalClient;Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;)V", "Llivekit/org/webrtc/IceCandidate;", "iceCandidate", "Lsn/z;", "onIceCandidate", "(Llivekit/org/webrtc/IceCandidate;)V", "onRenegotiationNeeded", "()V", "Llivekit/org/webrtc/PeerConnection$IceConnectionState;", "newState", "onIceConnectionChange", "(Llivekit/org/webrtc/PeerConnection$IceConnectionState;)V", "Llivekit/org/webrtc/SessionDescription;", "sd", "onOffer", "(Llivekit/org/webrtc/SessionDescription;)V", "onStandardizedIceConnectionChange", "Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "onConnectionChange", "(Llivekit/org/webrtc/PeerConnection$PeerConnectionState;)V", "Llivekit/org/webrtc/CandidatePairChangeEvent;", "event", "onSelectedCandidatePairChanged", "(Llivekit/org/webrtc/CandidatePairChangeEvent;)V", "Llivekit/org/webrtc/PeerConnection$SignalingState;", "p0", "onSignalingChange", "(Llivekit/org/webrtc/PeerConnection$SignalingState;)V", "", "onIceConnectionReceivingChange", "(Z)V", "Llivekit/org/webrtc/PeerConnection$IceGatheringState;", "onIceGatheringChange", "(Llivekit/org/webrtc/PeerConnection$IceGatheringState;)V", "", "onIceCandidatesRemoved", "([Llivekit/org/webrtc/IceCandidate;)V", "Llivekit/org/webrtc/MediaStream;", "onAddStream", "(Llivekit/org/webrtc/MediaStream;)V", "onRemoveStream", "Llivekit/org/webrtc/DataChannel;", "dataChannel", "onDataChannel", "(Llivekit/org/webrtc/DataChannel;)V", "Llivekit/org/webrtc/RtpTransceiver;", "transceiver", "onTrack", "(Llivekit/org/webrtc/RtpTransceiver;)V", "Llivekit/org/webrtc/RtpReceiver;", "p1", "onAddTrack", "(Llivekit/org/webrtc/RtpReceiver;[Llivekit/org/webrtc/MediaStream;)V", "Lio/livekit/android/room/RTCEngine;", "Lio/livekit/android/room/SignalClient;", "Lio/livekit/android/webrtc/peerconnection/RTCThreadToken;", "Lkotlin/Function1;", "Lio/livekit/android/room/PeerConnectionStateListener;", "connectionChangeListener", "Lho/l;", "getConnectionChangeListener", "()Lho/l;", "setConnectionChangeListener", "(Lho/l;)V", "<set-?>", "connectionState$delegate", "Lio/livekit/android/util/MutableStateFlowDelegate;", "getConnectionState", "()Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "setConnectionState", "getConnectionState$annotations", "connectionState", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PublisherTransportObserver implements PeerConnection.Observer, PeerConnectionTransport.Listener, PeerConnectionStateObservable {
    static final /* synthetic */ u[] $$delegatedProperties = {e0.f20562a.e(new q(PublisherTransportObserver.class, "connectionState", "getConnectionState()Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", 0))};
    private final SignalClient client;
    private l connectionChangeListener;

    /* renamed from: connectionState$delegate, reason: from kotlin metadata */
    private final MutableStateFlowDelegate connectionState;
    private final RTCEngine engine;
    private final RTCThreadToken rtcThreadToken;

    public PublisherTransportObserver(RTCEngine rTCEngine, SignalClient signalClient, RTCThreadToken rTCThreadToken) {
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

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onConnectionChange(PeerConnection.PeerConnectionState newState) {
        newState.getClass();
        RTCThreadUtilsKt.executeOnRTCThread(this.rtcThreadToken, new PublisherTransportObserver$onConnectionChange$1(this, newState));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate iceCandidate) {
        RTCThreadUtilsKt.executeOnRTCThread(this.rtcThreadToken, new PublisherTransportObserver$onIceCandidate$1(iceCandidate, this));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState newState) {
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "onIceConnection new state: " + newState, new Object[0]);
        }
    }

    @Override // io.livekit.android.room.PeerConnectionTransport.Listener
    public void onOffer(SessionDescription sd2) {
        sd2.getClass();
        RTCThreadUtilsKt.executeOnRTCThread(this.rtcThreadToken, new PublisherTransportObserver$onOffer$1(this, sd2));
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        RTCThreadUtilsKt.executeOnRTCThread(this.rtcThreadToken, new PublisherTransportObserver$onRenegotiationNeeded$1(this));
    }

    public final void setConnectionChangeListener(l lVar) {
        this.connectionChangeListener = lVar;
    }

    public static /* synthetic */ void getConnectionState$annotations() {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream p02) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
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

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onTrack(RtpTransceiver transceiver) {
    }

    @Override // livekit.org.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver p02, MediaStream[] p12) {
    }
}
