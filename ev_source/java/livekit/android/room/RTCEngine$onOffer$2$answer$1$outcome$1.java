package io.livekit.android.room;

import com.google.protobuf.c6;
import ho.p;
import io.livekit.android.room.util.CoroutineSdpObserverKt;
import io.livekit.android.util.Either;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.MediaConstraints;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.SessionDescription;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$onOffer$2$answer$1$outcome$1", f = "RTCEngine.kt", l = {1031}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lio/livekit/android/util/Either;", "Llivekit/org/webrtc/SessionDescription;", "", "Llivekit/org/webrtc/PeerConnection;"}, k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RTCEngine$onOffer$2$answer$1$outcome$1 extends i implements p {
    private /* synthetic */ Object L$0;
    int label;

    public RTCEngine$onOffer$2$answer$1$outcome$1(c<? super RTCEngine$onOffer$2$answer$1$outcome$1> cVar) {
        super(2, cVar);
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        RTCEngine$onOffer$2$answer$1$outcome$1 rTCEngine$onOffer$2$answer$1$outcome$1 = new RTCEngine$onOffer$2$answer$1$outcome$1(cVar);
        rTCEngine$onOffer$2$answer$1$outcome$1.L$0 = obj;
        return rTCEngine$onOffer$2$answer$1$outcome$1;
    }

    @Override // ho.p
    public final Object invoke(PeerConnection peerConnection, c<? super Either<? extends SessionDescription, String>> cVar) {
        return ((RTCEngine$onOffer$2$answer$1$outcome$1) create(peerConnection, cVar)).invokeSuspend(z.f31622a);
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
        MediaConstraints mediaConstraints = new MediaConstraints();
        this.label = 1;
        Object createAnswer = CoroutineSdpObserverKt.createAnswer(peerConnection, mediaConstraints, this);
        xn.a aVar = xn.a.f37986a;
        if (createAnswer == aVar) {
            return aVar;
        }
        return createAnswer;
    }
}
