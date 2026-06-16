package io.elevenlabs.readerapp.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.services.AgentContextServiceImpl", f = "AgentContextServiceImpl.kt", l = {39, 42}, m = "buildDynamicVariables", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AgentContextServiceImpl$buildDynamicVariables$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AgentContextServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentContextServiceImpl$buildDynamicVariables$1(AgentContextServiceImpl agentContextServiceImpl, wn.c<? super AgentContextServiceImpl$buildDynamicVariables$1> cVar) {
        super(cVar);
        this.this$0 = agentContextServiceImpl;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.buildDynamicVariables(null, this);
    }
}
