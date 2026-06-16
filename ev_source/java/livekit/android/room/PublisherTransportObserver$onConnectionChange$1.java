package io.livekit.android.room;

import et.d;
import ho.a;
import ho.l;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.org.webrtc.PeerConnection;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsn/z;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PublisherTransportObserver$onConnectionChange$1 extends n implements a {
    final /* synthetic */ PeerConnection.PeerConnectionState $newState;
    final /* synthetic */ PublisherTransportObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublisherTransportObserver$onConnectionChange$1(PublisherTransportObserver publisherTransportObserver, PeerConnection.PeerConnectionState peerConnectionState) {
        super(0);
        this.this$0 = publisherTransportObserver;
        this.$newState = peerConnectionState;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2524invoke() {
        LKLog.Companion companion = LKLog.INSTANCE;
        PeerConnection.PeerConnectionState peerConnectionState = this.$newState;
        if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
            d.e(null, "onConnection new state: " + peerConnectionState, new Object[0]);
        }
        l connectionChangeListener = this.this$0.getConnectionChangeListener();
        if (connectionChangeListener != null) {
            connectionChangeListener.invoke(this.$newState);
        }
        this.this$0.setConnectionState(this.$newState);
    }

    @Override // ho.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m2524invoke();
        return z.f31622a;
    }
}
