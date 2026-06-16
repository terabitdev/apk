package io.elevenlabs.player;

import io.elevenlabs.domain.model.MediaQueueState;
import io.elevenlabs.player.BackgroundPlayerService$observeQueueState$1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$observeQueueState$1$1", f = "BackgroundPlayerService.kt", l = {468, 471, 476}, m = "emit", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$observeQueueState$1$1$emit$1 extends yn.c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackgroundPlayerService$observeQueueState$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundPlayerService$observeQueueState$1$1$emit$1(BackgroundPlayerService$observeQueueState$1.AnonymousClass1<? super T> anonymousClass1, wn.c<? super BackgroundPlayerService$observeQueueState$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass1;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((MediaQueueState) null, (wn.c<? super z>) this);
    }
}
