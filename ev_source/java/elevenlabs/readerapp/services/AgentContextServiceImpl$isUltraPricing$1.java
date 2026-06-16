package io.elevenlabs.readerapp.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.AgentContextServiceImpl", f = "AgentContextServiceImpl.kt", l = {117}, m = "isUltraPricing", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AgentContextServiceImpl$isUltraPricing$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AgentContextServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentContextServiceImpl$isUltraPricing$1(AgentContextServiceImpl agentContextServiceImpl, wn.c<? super AgentContextServiceImpl$isUltraPricing$1> cVar) {
        super(cVar);
        this.this$0 = agentContextServiceImpl;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object isUltraPricing;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        isUltraPricing = this.this$0.isUltraPricing(null, this);
        return isUltraPricing;
    }
}
