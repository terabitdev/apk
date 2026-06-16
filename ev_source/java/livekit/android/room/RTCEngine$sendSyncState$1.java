package io.livekit.android.room;

import com.google.protobuf.c6;
import ho.p;
import io.livekit.android.webrtc.SessionDescriptionExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import livekit.LivekitRtc$SessionDescription;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$sendSyncState$1", f = "RTCEngine.kt", l = {1315}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$sendSyncState$1 extends i implements p {
    final /* synthetic */ d0 $answer;
    final /* synthetic */ d0 $offer;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @e(c = "io.livekit.android.room.RTCEngine$sendSyncState$1$1", f = "RTCEngine.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llivekit/org/webrtc/PeerConnection;", "Lsn/z;", "<anonymous>", "(Llivekit/org/webrtc/PeerConnection;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: io.livekit.android.room.RTCEngine$sendSyncState$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ d0 $answer;
        final /* synthetic */ d0 $offer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d0 d0Var, d0 d0Var2, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$answer = d0Var;
            this.$offer = d0Var2;
        }

        @Override // yn.a
        public final c<z> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$answer, this.$offer, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(PeerConnection peerConnection, c<? super z> cVar) {
            return ((AnonymousClass1) create(peerConnection, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            LivekitRtc$SessionDescription livekitRtc$SessionDescription;
            if (this.label == 0) {
                a.g(obj);
                PeerConnection peerConnection = (PeerConnection) this.L$0;
                d0 d0Var = this.$answer;
                SessionDescription localDescription = peerConnection.getLocalDescription();
                LivekitRtc$SessionDescription livekitRtc$SessionDescription2 = null;
                if (localDescription != null) {
                    livekitRtc$SessionDescription = SessionDescriptionExtKt.toProtoSessionDescription(localDescription);
                } else {
                    livekitRtc$SessionDescription = null;
                }
                d0Var.f20559a = livekitRtc$SessionDescription;
                d0 d0Var2 = this.$offer;
                SessionDescription remoteDescription = peerConnection.getRemoteDescription();
                if (remoteDescription != null) {
                    livekitRtc$SessionDescription2 = SessionDescriptionExtKt.toProtoSessionDescription(remoteDescription);
                }
                d0Var2.f20559a = livekitRtc$SessionDescription2;
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$sendSyncState$1(RTCEngine rTCEngine, d0 d0Var, d0 d0Var2, c<? super RTCEngine$sendSyncState$1> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
        this.$answer = d0Var;
        this.$offer = d0Var2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$sendSyncState$1(this.this$0, this.$answer, this.$offer, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$sendSyncState$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        PeerConnectionTransport peerConnectionTransport;
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
            if (peerConnectionTransport == null) {
                return null;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$answer, this.$offer, null);
            this.label = 1;
            obj = peerConnectionTransport.withPeerConnection(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        return (z) obj;
    }
}
