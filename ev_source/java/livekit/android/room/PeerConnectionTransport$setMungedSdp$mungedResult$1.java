package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.room.util.CoroutineSdpObserverKt;
import io.livekit.android.util.Either;
import kotlin.Metadata;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.PeerConnectionTransport$setMungedSdp$mungedResult$1", f = "PeerConnectionTransport.kt", l = {216, 218}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfr/d0;", "Lio/livekit/android/util/Either;", "Lsn/z;", "", "<anonymous>", "(Lfr/d0;)Lio/livekit/android/util/Either;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$setMungedSdp$mungedResult$1 extends i implements p {
    final /* synthetic */ SessionDescription $mungedSdp;
    final /* synthetic */ boolean $remote;
    int label;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$setMungedSdp$mungedResult$1(boolean z6, PeerConnectionTransport peerConnectionTransport, SessionDescription sessionDescription, c<? super PeerConnectionTransport$setMungedSdp$mungedResult$1> cVar) {
        super(2, cVar);
        this.$remote = z6;
        this.this$0 = peerConnectionTransport;
        this.$mungedSdp = sessionDescription;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new PeerConnectionTransport$setMungedSdp$mungedResult$1(this.$remote, this.this$0, this.$mungedSdp, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super Either<z, String>> cVar) {
        return ((PeerConnectionTransport$setMungedSdp$mungedResult$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r5 == r3) goto L19;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    a.g(obj);
                    return (Either) obj;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.g(obj);
            return (Either) obj;
        }
        a.g(obj);
        boolean z6 = this.$remote;
        PeerConnectionTransport peerConnectionTransport = this.this$0;
        xn.a aVar = xn.a.f37986a;
        if (z6) {
            PeerConnection peerConnection = peerConnectionTransport.getPeerConnection();
            SessionDescription sessionDescription = this.$mungedSdp;
            this.label = 1;
            obj = CoroutineSdpObserverKt.setRemoteDescription(peerConnection, sessionDescription, this);
        } else {
            PeerConnection peerConnection2 = peerConnectionTransport.getPeerConnection();
            SessionDescription sessionDescription2 = this.$mungedSdp;
            this.label = 2;
            obj = CoroutineSdpObserverKt.setLocalDescription(peerConnection2, sessionDescription2, this);
        }
        return aVar;
    }
}
