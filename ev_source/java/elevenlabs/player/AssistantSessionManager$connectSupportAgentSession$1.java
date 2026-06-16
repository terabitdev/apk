package io.elevenlabs.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.AssistantSessionManager", f = "AssistantSessionManager.kt", l = {203}, m = "connectSupportAgentSession-gIAlu-s", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AssistantSessionManager$connectSupportAgentSession$1 extends yn.c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssistantSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantSessionManager$connectSupportAgentSession$1(AssistantSessionManager assistantSessionManager, wn.c<? super AssistantSessionManager$connectSupportAgentSession$1> cVar) {
        super(cVar);
        this.this$0 = assistantSessionManager;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object m995connectSupportAgentSessiongIAlus;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m995connectSupportAgentSessiongIAlus = this.this$0.m995connectSupportAgentSessiongIAlus(null, this);
        if (m995connectSupportAgentSessiongIAlus == xn.a.f37986a) {
            return m995connectSupportAgentSessiongIAlus;
        }
        return new m(m995connectSupportAgentSessiongIAlus);
    }
}
