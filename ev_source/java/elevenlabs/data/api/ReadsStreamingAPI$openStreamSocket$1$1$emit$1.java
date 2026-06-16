package io.elevenlabs.data.api;

import io.elevenlabs.data.api.ReadsStreamingAPI$openStreamSocket$1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import sn.z;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.api.ReadsStreamingAPI$openStreamSocket$1$1", f = "ReadsStreamingAPI.kt", l = {39, 47}, m = "emit", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsStreamingAPI$openStreamSocket$1$1$emit$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReadsStreamingAPI$openStreamSocket$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReadsStreamingAPI$openStreamSocket$1$1$emit$1(ReadsStreamingAPI$openStreamSocket$1.AnonymousClass1<? super T> anonymousClass1, wn.c<? super ReadsStreamingAPI$openStreamSocket$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass1;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((k) null, (wn.c<? super z>) this);
    }
}
