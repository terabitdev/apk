package io.elevenlabs.domain.services.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.domain.services.player.AssistantSessionService", f = "AssistantSessionService.kt", l = {85}, m = "startSession-yxL6bBk$suspendImpl", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AssistantSessionService$startSession$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssistantSessionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantSessionService$startSession$1(AssistantSessionService assistantSessionService, wn.c<? super AssistantSessionService$startSession$1> cVar) {
        super(cVar);
        this.this$0 = assistantSessionService;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m950startSessionyxL6bBk$suspendImpl = AssistantSessionService.m950startSessionyxL6bBk$suspendImpl(this.this$0, null, 0L, null, false, this);
        if (m950startSessionyxL6bBk$suspendImpl == a.f37986a) {
            return m950startSessionyxL6bBk$suspendImpl;
        }
        return new m(m950startSessionyxL6bBk$suspendImpl);
    }
}
