package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.l;
import ho.p;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RTCStatsReport;
import livekit.org.webrtc.RtpReceiver;
import sn.a;
import sn.z;
import tn.u;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llivekit/org/webrtc/RTCStatsCollectorCallback;", "statsCallback", "Lsn/z;", "invoke", "(Llivekit/org/webrtc/RTCStatsCollectorCallback;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$createStatsGetter$2 extends n implements l {
    final /* synthetic */ PeerConnectionTransport $p;
    final /* synthetic */ RtpReceiver $receiver;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.RTCEngine$createStatsGetter$2$1", f = "RTCEngine.kt", l = {1385}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.RTCEngine$createStatsGetter$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ PeerConnectionTransport $p;
        final /* synthetic */ RtpReceiver $receiver;
        final /* synthetic */ RTCStatsCollectorCallback $statsCallback;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @e(c = "io.livekit.android.room.RTCEngine$createStatsGetter$2$1$1", f = "RTCEngine.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llivekit/org/webrtc/PeerConnection;", "Lsn/z;", "<anonymous>", "(Llivekit/org/webrtc/PeerConnection;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: io.livekit.android.room.RTCEngine$createStatsGetter$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00561 extends i implements p {
            final /* synthetic */ RtpReceiver $receiver;
            final /* synthetic */ RTCStatsCollectorCallback $statsCallback;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00561(RtpReceiver rtpReceiver, RTCStatsCollectorCallback rTCStatsCollectorCallback, c<? super C00561> cVar) {
                super(2, cVar);
                this.$receiver = rtpReceiver;
                this.$statsCallback = rTCStatsCollectorCallback;
            }

            @Override // yn.a
            public final c<z> create(Object obj, c<?> cVar) {
                C00561 c00561 = new C00561(this.$receiver, this.$statsCallback, cVar);
                c00561.L$0 = obj;
                return c00561;
            }

            @Override // ho.p
            public final Object invoke(PeerConnection peerConnection, c<? super z> cVar) {
                return ((C00561) create(peerConnection, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    a.g(obj);
                    ((PeerConnection) this.L$0).getStats(this.$receiver, this.$statsCallback);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PeerConnectionTransport peerConnectionTransport, RTCStatsCollectorCallback rTCStatsCollectorCallback, RtpReceiver rtpReceiver, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$p = peerConnectionTransport;
            this.$statsCallback = rTCStatsCollectorCallback;
            this.$receiver = rtpReceiver;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$p, this.$statsCallback, this.$receiver, cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            z zVar;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                a.g(obj);
                PeerConnectionTransport peerConnectionTransport = this.$p;
                zVar = null;
                if (peerConnectionTransport != null) {
                    C00561 c00561 = new C00561(this.$receiver, this.$statsCallback, null);
                    this.label = 1;
                    obj = peerConnectionTransport.withPeerConnection(c00561, this);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (zVar == null) {
                    this.$statsCallback.onStatsDelivered(new RTCStatsReport(0L, u.f33548a));
                }
                return z.f31622a;
            }
            zVar = (z) obj;
            if (zVar == null) {
            }
            return z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$createStatsGetter$2(PeerConnectionTransport peerConnectionTransport, RtpReceiver rtpReceiver) {
        super(1);
        this.$p = peerConnectionTransport;
        this.$receiver = rtpReceiver;
    }

    public final void invoke(RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        rTCStatsCollectorCallback.getClass();
        g0.I(wn.i.f37087a, new AnonymousClass1(this.$p, rTCStatsCollectorCallback, this.$receiver, null));
    }

    @Override // ho.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RTCStatsCollectorCallback) obj);
        return z.f31622a;
    }
}
