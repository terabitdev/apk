package io.livekit.android.room;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.PeerConnectionTransport$launchRTCIfNotClosed$3", f = "PeerConnectionTransport.kt", l = {338}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {TokenNames.T, "Lfr/d0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$launchRTCIfNotClosed$3 extends i implements p {
    final /* synthetic */ p $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$launchRTCIfNotClosed$3(PeerConnectionTransport peerConnectionTransport, p pVar, c<? super PeerConnectionTransport$launchRTCIfNotClosed$3> cVar) {
        super(2, cVar);
        this.this$0 = peerConnectionTransport;
        this.$action = pVar;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        PeerConnectionTransport$launchRTCIfNotClosed$3 peerConnectionTransport$launchRTCIfNotClosed$3 = new PeerConnectionTransport$launchRTCIfNotClosed$3(this.this$0, this.$action, cVar);
        peerConnectionTransport$launchRTCIfNotClosed$3.L$0 = obj;
        return peerConnectionTransport$launchRTCIfNotClosed$3;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super T> cVar) {
        return ((PeerConnectionTransport$launchRTCIfNotClosed$3) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
        d0 d0Var = (d0) this.L$0;
        if (this.this$0.isClosed()) {
            return null;
        }
        p pVar = this.$action;
        this.label = 1;
        Object invoke = pVar.invoke(d0Var, this);
        xn.a aVar = xn.a.f37986a;
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
