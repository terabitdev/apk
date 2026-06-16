package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.room.util.CoroutineSdpObserverKt;
import io.livekit.android.util.Either;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.PeerConnectionTransport$setRemoteDescription$result$1", f = "PeerConnectionTransport.kt", l = {117}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfr/d0;", "Lio/livekit/android/util/Either;", "Lsn/z;", "", "<anonymous>", "(Lfr/d0;)Lio/livekit/android/util/Either;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$setRemoteDescription$result$1 extends i implements p {
    final /* synthetic */ SessionDescription $sd;
    int label;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$setRemoteDescription$result$1(PeerConnectionTransport peerConnectionTransport, SessionDescription sessionDescription, c<? super PeerConnectionTransport$setRemoteDescription$result$1> cVar) {
        super(2, cVar);
        this.this$0 = peerConnectionTransport;
        this.$sd = sessionDescription;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new PeerConnectionTransport$setRemoteDescription$result$1(this.this$0, this.$sd, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super Either<z, String>> cVar) {
        return ((PeerConnectionTransport$setRemoteDescription$result$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
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
            PeerConnection peerConnection = this.this$0.getPeerConnection();
            SessionDescription sessionDescription = this.$sd;
            this.label = 1;
            obj = CoroutineSdpObserverKt.setRemoteDescription(peerConnection, sessionDescription, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        Either either = (Either) obj;
        if (either instanceof Either.Left) {
            list = this.this$0.pendingCandidates;
            PeerConnectionTransport peerConnectionTransport = this.this$0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                peerConnectionTransport.getPeerConnection().addIceCandidate((IceCandidate) it.next());
            }
            list2 = this.this$0.pendingCandidates;
            list2.clear();
            this.this$0.restartingIce = false;
        }
        return either;
    }
}
