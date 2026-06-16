package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import livekit.org.webrtc.PeerConnection;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$onAnswer$signalingState$1", f = "RTCEngine.kt", l = {995}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Llivekit/org/webrtc/PeerConnection$SignalingState;", "<anonymous>", "(Lfr/d0;)Llivekit/org/webrtc/PeerConnection$SignalingState;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$onAnswer$signalingState$1 extends i implements p {
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$onAnswer$signalingState$1(RTCEngine rTCEngine, c<? super RTCEngine$onAnswer$signalingState$1> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$onAnswer$signalingState$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super PeerConnection.SignalingState> cVar) {
        return ((RTCEngine$onAnswer$signalingState$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            PeerConnectionTransport publisher = this.this$0.getPublisher();
            if (publisher != null) {
                this.label = 1;
                obj = publisher.signalingState(this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                return null;
            }
        }
        return (PeerConnection.SignalingState) obj;
    }
}
