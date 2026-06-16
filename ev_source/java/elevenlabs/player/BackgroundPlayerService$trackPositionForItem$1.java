package io.elevenlabs.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService", f = "BackgroundPlayerService.kt", l = {508, 536}, m = "trackPositionForItem", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$trackPositionForItem$1 extends yn.c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$trackPositionForItem$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$trackPositionForItem$1> cVar) {
        super(cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object trackPositionForItem;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        trackPositionForItem = this.this$0.trackPositionForItem(null, null, this);
        return trackPositionForItem;
    }
}
