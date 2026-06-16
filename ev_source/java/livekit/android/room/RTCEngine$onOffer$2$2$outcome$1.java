package io.livekit.android.room;

import com.google.protobuf.c6;
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
@e(c = "io.livekit.android.room.RTCEngine$onOffer$2$2$outcome$1", f = "RTCEngine.kt", l = {1045}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llivekit/org/webrtc/PeerConnection;", "Lio/livekit/android/util/Either;", "Lsn/z;", "", "<anonymous>", "(Llivekit/org/webrtc/PeerConnection;)Lio/livekit/android/util/Either;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$onOffer$2$2$outcome$1 extends i implements p {
    final /* synthetic */ SessionDescription $answer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$onOffer$2$2$outcome$1(SessionDescription sessionDescription, c<? super RTCEngine$onOffer$2$2$outcome$1> cVar) {
        super(2, cVar);
        this.$answer = sessionDescription;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCEngine$onOffer$2$2$outcome$1 rTCEngine$onOffer$2$2$outcome$1 = new RTCEngine$onOffer$2$2$outcome$1(this.$answer, cVar);
        rTCEngine$onOffer$2$2$outcome$1.L$0 = obj;
        return rTCEngine$onOffer$2$2$outcome$1;
    }

    @Override // ho.p
    public final Object invoke(PeerConnection peerConnection, c<? super Either<z, String>> cVar) {
        return ((RTCEngine$onOffer$2$2$outcome$1) create(peerConnection, cVar)).invokeSuspend(z.f31622a);
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
        PeerConnection peerConnection = (PeerConnection) this.L$0;
        SessionDescription sessionDescription = this.$answer;
        this.label = 1;
        Object localDescription = CoroutineSdpObserverKt.setLocalDescription(peerConnection, sessionDescription, this);
        xn.a aVar = xn.a.f37986a;
        if (localDescription == aVar) {
            return aVar;
        }
        return localDescription;
    }
}
