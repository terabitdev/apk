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
@e(c = "io.livekit.android.room.PeerConnectionTransport$connectionState$2", f = "PeerConnectionTransport.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Llivekit/org/webrtc/PeerConnection$PeerConnectionState;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lfr/d0;)Llivekit/org/webrtc/PeerConnection$PeerConnectionState;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$connectionState$2 extends i implements p {
    int label;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$connectionState$2(PeerConnectionTransport peerConnectionTransport, c<? super PeerConnectionTransport$connectionState$2> cVar) {
        super(2, cVar);
        this.this$0 = peerConnectionTransport;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new PeerConnectionTransport$connectionState$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super PeerConnection.PeerConnectionState> cVar) {
        return ((PeerConnectionTransport$connectionState$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            a.g(obj);
            return this.this$0.getPeerConnection().connectionState();
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
