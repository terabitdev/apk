package io.livekit.android.room.datastream.outgoing;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManagerImpl", f = "OutgoingDataStreamManager.kt", l = {222, 223}, m = "closeStream")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OutgoingDataStreamManagerImpl$closeStream$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutgoingDataStreamManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingDataStreamManagerImpl$closeStream$1(OutgoingDataStreamManagerImpl outgoingDataStreamManagerImpl, wn.c<? super OutgoingDataStreamManagerImpl$closeStream$1> cVar) {
        super(cVar);
        this.this$0 = outgoingDataStreamManagerImpl;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.closeStream(null, null, this);
    }
}
