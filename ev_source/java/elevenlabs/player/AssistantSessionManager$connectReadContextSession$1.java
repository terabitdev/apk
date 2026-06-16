package io.elevenlabs.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.AssistantSessionManager", f = "AssistantSessionManager.kt", l = {170}, m = "connectReadContextSession-0E7RQCE", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AssistantSessionManager$connectReadContextSession$1 extends yn.c {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssistantSessionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantSessionManager$connectReadContextSession$1(AssistantSessionManager assistantSessionManager, wn.c<? super AssistantSessionManager$connectReadContextSession$1> cVar) {
        super(cVar);
        this.this$0 = assistantSessionManager;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object m994connectReadContextSession0E7RQCE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m994connectReadContextSession0E7RQCE = this.this$0.m994connectReadContextSession0E7RQCE(null, false, this);
        if (m994connectReadContextSession0E7RQCE == xn.a.f37986a) {
            return m994connectReadContextSession0E7RQCE;
        }
        return new m(m994connectReadContextSession0E7RQCE);
    }
}
