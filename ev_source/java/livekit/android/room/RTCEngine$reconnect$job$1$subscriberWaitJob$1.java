package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.livekit.android.room.util.PeerConnectionStateObservableKt;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$reconnect$job$1$subscriberWaitJob$1", f = "RTCEngine.kt", l = {623}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$reconnect$job$1$subscriberWaitJob$1 extends i implements p {
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$reconnect$job$1$subscriberWaitJob$1(RTCEngine rTCEngine, c<? super RTCEngine$reconnect$job$1$subscriberWaitJob$1> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$reconnect$job$1$subscriberWaitJob$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$reconnect$job$1$subscriberWaitJob$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        SubscriberTransportObserver subscriberTransportObserver;
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
            subscriberTransportObserver = this.this$0.subscriberObserver;
            this.label = 1;
            Object waitUntilConnected = PeerConnectionStateObservableKt.waitUntilConnected(subscriberTransportObserver, this);
            xn.a aVar = xn.a.f37986a;
            if (waitUntilConnected == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
