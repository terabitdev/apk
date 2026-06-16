package io.elevenlabs.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService", f = "BackgroundPlayerControllerService.kt", l = {334}, m = "waitForController", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$waitForController$1 extends yn.c {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackgroundPlayerControllerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$waitForController$1(BackgroundPlayerControllerService backgroundPlayerControllerService, wn.c<? super BackgroundPlayerControllerService$waitForController$1> cVar) {
        super(cVar);
        this.this$0 = backgroundPlayerControllerService;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object waitForController;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        waitForController = this.this$0.waitForController(this);
        return waitForController;
    }
}
