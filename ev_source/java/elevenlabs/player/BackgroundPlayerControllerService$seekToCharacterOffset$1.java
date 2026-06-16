package io.elevenlabs.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService", f = "BackgroundPlayerControllerService.kt", l = {424, 429}, m = "seekToCharacterOffset", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$seekToCharacterOffset$1 extends yn.c {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackgroundPlayerControllerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$seekToCharacterOffset$1(BackgroundPlayerControllerService backgroundPlayerControllerService, wn.c<? super BackgroundPlayerControllerService$seekToCharacterOffset$1> cVar) {
        super(cVar);
        this.this$0 = backgroundPlayerControllerService;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.seekToCharacterOffset(0L, this);
    }
}
