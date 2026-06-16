package io.elevenlabs.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService", f = "BackgroundPlayerService.kt", l = {591}, m = "ttsPositionTrackingFlow", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$ttsPositionTrackingFlow$1 extends yn.c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$ttsPositionTrackingFlow$1(BackgroundPlayerService backgroundPlayerService, wn.c<? super BackgroundPlayerService$ttsPositionTrackingFlow$1> cVar) {
        super(cVar);
        this.this$0 = backgroundPlayerService;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object ttsPositionTrackingFlow;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ttsPositionTrackingFlow = this.this$0.ttsPositionTrackingFlow(null, null, null, this);
        return ttsPositionTrackingFlow;
    }
}
