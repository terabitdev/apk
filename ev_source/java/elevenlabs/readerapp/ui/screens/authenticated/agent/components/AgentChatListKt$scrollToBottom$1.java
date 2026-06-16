package io.elevenlabs.readerapp.ui.screens.authenticated.agent.components;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatListKt", f = "AgentChatList.kt", l = {125, 131}, m = "scrollToBottom", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AgentChatListKt$scrollToBottom$1 extends yn.c {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public AgentChatListKt$scrollToBottom$1(wn.c<? super AgentChatListKt$scrollToBottom$1> cVar) {
        super(cVar);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AgentChatListKt.scrollToBottom(null, this);
    }
}
