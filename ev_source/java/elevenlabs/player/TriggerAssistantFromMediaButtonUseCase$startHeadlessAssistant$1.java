package io.elevenlabs.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.TriggerAssistantFromMediaButtonUseCase", f = "TriggerAssistantFromMediaButtonUseCase.kt", l = {129, 138, 143}, m = "startHeadlessAssistant", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1 extends yn.c {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerAssistantFromMediaButtonUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1(TriggerAssistantFromMediaButtonUseCase triggerAssistantFromMediaButtonUseCase, wn.c<? super TriggerAssistantFromMediaButtonUseCase$startHeadlessAssistant$1> cVar) {
        super(cVar);
        this.this$0 = triggerAssistantFromMediaButtonUseCase;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object startHeadlessAssistant;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startHeadlessAssistant = this.this$0.startHeadlessAssistant(null, null, 0L, null, null, this);
        return startHeadlessAssistant;
    }
}
