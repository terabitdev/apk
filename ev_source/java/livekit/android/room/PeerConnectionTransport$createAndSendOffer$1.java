package io.livekit.android.room;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.PeerConnectionTransport", f = "PeerConnectionTransport.kt", l = {498}, m = "createAndSendOffer")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PeerConnectionTransport$createAndSendOffer$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PeerConnectionTransport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerConnectionTransport$createAndSendOffer$1(PeerConnectionTransport peerConnectionTransport, wn.c<? super PeerConnectionTransport$createAndSendOffer$1> cVar) {
        super(cVar);
        this.this$0 = peerConnectionTransport;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object createAndSendOffer;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createAndSendOffer = this.this$0.createAndSendOffer(null, this);
        return createAndSendOffer;
    }
}
