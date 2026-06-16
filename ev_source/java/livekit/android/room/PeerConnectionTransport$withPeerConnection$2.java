package io.livekit.android.room;

import android.gov.nist.javax.sip.parser.TokenNames;
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
@e(c = "io.livekit.android.room.PeerConnectionTransport$withPeerConnection$2", f = "PeerConnectionTransport.kt", l = {111}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {TokenNames.T, "Lfr/d0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$withPeerConnection$2 extends i implements p {
    final /* synthetic */ p $action;
    int label;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$withPeerConnection$2(p pVar, PeerConnectionTransport peerConnectionTransport, c<? super PeerConnectionTransport$withPeerConnection$2> cVar) {
        super(2, cVar);
        this.$action = pVar;
        this.this$0 = peerConnectionTransport;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new PeerConnectionTransport$withPeerConnection$2(this.$action, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super T> cVar) {
        return ((PeerConnectionTransport$withPeerConnection$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
                return obj;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a.g(obj);
        p pVar = this.$action;
        PeerConnection peerConnection = this.this$0.getPeerConnection();
        this.label = 1;
        Object invoke = pVar.invoke(peerConnection, this);
        xn.a aVar = xn.a.f37986a;
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
