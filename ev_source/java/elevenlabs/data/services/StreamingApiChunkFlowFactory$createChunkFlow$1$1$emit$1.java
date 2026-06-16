package io.elevenlabs.data.services;

import io.elevenlabs.data.services.StreamingApiChunkFlowFactory$createChunkFlow$1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.StreamingApiChunkFlowFactory$createChunkFlow$1$1", f = "ReadsStreamingService.kt", l = {382, 399}, m = "emit", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class StreamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1 extends yn.c {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StreamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1(StreamingApiChunkFlowFactory$createChunkFlow$1.AnonymousClass1<? super T> anonymousClass1, wn.c<? super StreamingApiChunkFlowFactory$createChunkFlow$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass1;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((sn.k) null, (wn.c<? super z>) this);
    }
}
