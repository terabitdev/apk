package io.livekit.android.room;

import et.d;
import ho.l;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import io.livekit.android.webrtc.PeerConnectionExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.org.webrtc.PeerConnection;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "newState", "Lsn/z;", "invoke", "(Llivekit/org/webrtc/PeerConnection$PeerConnectionState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$configure$2$2$connectionStateListener$1 extends n implements l {
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$configure$2$2$connectionStateListener$1(RTCEngine rTCEngine) {
        super(1);
        this.this$0 = rTCEngine;
    }

    public final void invoke(PeerConnection.PeerConnectionState peerConnectionState) {
        peerConnectionState.getClass();
        LKLog.Companion companion = LKLog.INSTANCE;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "onIceConnection new state: " + peerConnectionState, new Object[0]);
        }
        if (PeerConnectionExtKt.isConnected(peerConnectionState)) {
            this.this$0.setConnectionState(ConnectionState.CONNECTED);
        } else if (PeerConnectionExtKt.isDisconnected(peerConnectionState)) {
            this.this$0.setConnectionState(ConnectionState.DISCONNECTED);
        }
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PeerConnection.PeerConnectionState) obj);
        return z.f31622a;
    }
}
