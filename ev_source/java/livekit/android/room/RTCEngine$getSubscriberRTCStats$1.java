package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RTCStatsReport;
import sn.a;
import sn.z;
import tn.u;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$getSubscriberRTCStats$1", f = "RTCEngine.kt", l = {1365}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$getSubscriberRTCStats$1 extends i implements p {
    final /* synthetic */ RTCStatsCollectorCallback $callback;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.RTCEngine$getSubscriberRTCStats$1$1", f = "RTCEngine.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llivekit/org/webrtc/PeerConnection;", "Lsn/z;", "<anonymous>", "(Llivekit/org/webrtc/PeerConnection;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.RTCEngine$getSubscriberRTCStats$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ RTCStatsCollectorCallback $callback;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RTCStatsCollectorCallback rTCStatsCollectorCallback, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$callback = rTCStatsCollectorCallback;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(PeerConnection peerConnection, c<? super z> cVar) {
            return ((AnonymousClass1) create(peerConnection, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                a.g(obj);
                ((PeerConnection) this.L$0).getStats(this.$callback);
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$getSubscriberRTCStats$1(RTCEngine rTCEngine, RTCStatsCollectorCallback rTCStatsCollectorCallback, c<? super RTCEngine$getSubscriberRTCStats$1> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
        this.$callback = rTCStatsCollectorCallback;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$getSubscriberRTCStats$1(this.this$0, this.$callback, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$getSubscriberRTCStats$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PeerConnectionTransport peerConnectionTransport;
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
            peerConnectionTransport = this.this$0.subscriber;
            zVar = null;
            if (peerConnectionTransport != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, null);
                this.label = 1;
                obj = peerConnectionTransport.withPeerConnection(anonymousClass1, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (zVar == null) {
                this.$callback.onStatsDelivered(new RTCStatsReport(0L, u.f33548a));
            }
            return z.f31622a;
        }
        zVar = (z) obj;
        if (zVar == null) {
        }
        return z.f31622a;
    }
}
