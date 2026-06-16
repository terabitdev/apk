package io.elevenlabs.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService", f = "BackgroundPlayerService.kt", l = {832, 837}, m = "resolveBookmarkCharOffset", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$resolveBookmarkCharOffset$1 extends yn.c {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$resolveBookmarkCharOffset$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$resolveBookmarkCharOffset$1> cVar) {
        super(cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object resolveBookmarkCharOffset;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        resolveBookmarkCharOffset = this.this$0.resolveBookmarkCharOffset(null, null, this);
        return resolveBookmarkCharOffset;
    }
}
