package io.elevenlabs;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ConversationEventHandler", f = "ConversationEventHandler.kt", l = {143}, m = "handleAgentResponse")
@Metadata(k = 3, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConversationEventHandler$handleAgentResponse$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationEventHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationEventHandler$handleAgentResponse$1(ConversationEventHandler conversationEventHandler, wn.c<? super ConversationEventHandler$handleAgentResponse$1> cVar) {
        super(cVar);
        this.this$0 = conversationEventHandler;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object handleAgentResponse;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleAgentResponse = this.this$0.handleAgentResponse(null, this);
        return handleAgentResponse;
    }
}
