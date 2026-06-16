package io.livekit.android.room;

import com.google.protobuf.c6;
import et.d;
import fr.d0;
import ho.l;
import ho.p;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import kotlin.Metadata;
import livekit.org.webrtc.MediaConstraints;
import or.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RTCEngine$negotiatePublisher$1", f = "RTCEngine.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RTCEngine$negotiatePublisher$1 extends i implements p {
    int label;
    final /* synthetic */ RTCEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RTCEngine$negotiatePublisher$1(RTCEngine rTCEngine, c<? super RTCEngine$negotiatePublisher$1> cVar) {
        super(2, cVar);
        this.this$0 = rTCEngine;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RTCEngine$negotiatePublisher$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((RTCEngine$negotiatePublisher$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        l negotiate;
        MediaConstraints publisherOfferConstraints;
        if (this.label == 0) {
            sn.a.g(obj);
            aVar = this.this$0.negotiatePublisherMutex;
            if (aVar.tryLock()) {
                try {
                    PeerConnectionTransport publisher = this.this$0.getPublisher();
                    if (publisher != null && (negotiate = publisher.getNegotiate()) != null) {
                        publisherOfferConstraints = this.this$0.getPublisherOfferConstraints();
                        negotiate.invoke(publisherOfferConstraints);
                    }
                } finally {
                    aVar2 = this.this$0.negotiatePublisherMutex;
                    aVar2.n(null);
                }
            } else {
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.VERBOSE.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.e(null, "negotiatePublisher: skipping, negotiation already in progress", new Object[0]);
                }
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
