package io.livekit.android.room;

import com.google.protobuf.c6;
import fr.d0;
import fr.k1;
import ho.p;
import io.livekit.android.webrtc.DataChannelManager;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import or.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$closeResources$1$1", f = "RTCEngine.kt", l = {1548}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$closeResources$1$1 extends i implements p {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$closeResources$1$1(RTCEngine rTCEngine, c<? super RTCEngine$closeResources$1$1> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$closeResources$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$closeResources$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        RTCEngine rTCEngine;
        a aVar2;
        PublisherTransportObserver publisherTransportObserver;
        SubscriberTransportObserver subscriberTransportObserver;
        PeerConnectionTransport peerConnectionTransport;
        k1 k1Var;
        DataChannelManager dataChannelManager;
        DataChannelManager dataChannelManager2;
        DataChannelManager dataChannelManager3;
        DataChannelManager dataChannelManager4;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                rTCEngine = (RTCEngine) this.L$1;
                aVar2 = (a) this.L$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            aVar = this.this$0.configurationLock;
            rTCEngine = this.this$0;
            this.L$0 = aVar;
            this.L$1 = rTCEngine;
            this.label = 1;
            Object a10 = aVar.a(this);
            xn.a aVar3 = xn.a.f37986a;
            if (a10 == aVar3) {
                return aVar3;
            }
            aVar2 = aVar;
        }
        try {
            publisherTransportObserver = rTCEngine.publisherObserver;
            publisherTransportObserver.setConnectionChangeListener(null);
            subscriberTransportObserver = rTCEngine.subscriberObserver;
            subscriberTransportObserver.setConnectionChangeListener(null);
            PeerConnectionTransport publisher = rTCEngine.getPublisher();
            if (publisher != null) {
                publisher.closeBlocking();
            }
            rTCEngine.setPublisher$livekit_android_sdk_release(null);
            peerConnectionTransport = rTCEngine.subscriber;
            if (peerConnectionTransport != null) {
                peerConnectionTransport.closeBlocking();
            }
            rTCEngine.subscriber = null;
            k1Var = rTCEngine.reliableBufferedAmountJob;
            if (k1Var != null) {
                k1Var.cancel((CancellationException) null);
            }
            rTCEngine.reliableBufferedAmountJob = null;
            dataChannelManager = rTCEngine.reliableDataChannelManager;
            if (dataChannelManager != null) {
                dataChannelManager.dispose();
            }
            rTCEngine.reliableDataChannelManager = null;
            rTCEngine.reliableDataChannel = null;
            dataChannelManager2 = rTCEngine.reliableDataChannelSubManager;
            if (dataChannelManager2 != null) {
                dataChannelManager2.dispose();
            }
            rTCEngine.reliableDataChannelSubManager = null;
            rTCEngine.reliableDataChannelSub = null;
            dataChannelManager3 = rTCEngine.lossyDataChannelManager;
            if (dataChannelManager3 != null) {
                dataChannelManager3.dispose();
            }
            rTCEngine.lossyDataChannelManager = null;
            rTCEngine.lossyDataChannel = null;
            dataChannelManager4 = rTCEngine.lossyDataChannelSubManager;
            if (dataChannelManager4 != null) {
                dataChannelManager4.dispose();
            }
            rTCEngine.lossyDataChannelSubManager = null;
            rTCEngine.lossyDataChannelSub = null;
            rTCEngine.isSubscriberPrimary = false;
            aVar2.n(null);
            return z.f31622a;
        } catch (Throwable th) {
            aVar2.n(null);
            throw th;
        }
    }
}
