package io.livekit.android.room.participant;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant", f = "LocalParticipant.kt", l = {1304, 1312, 1329, 1347, 1371}, m = "handleIncomingRpcRequest-OYFzt6o")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LocalParticipant$handleIncomingRpcRequest$1 extends c {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$handleIncomingRpcRequest$1(LocalParticipant localParticipant, wn.c<? super LocalParticipant$handleIncomingRpcRequest$1> cVar) {
        super(cVar);
        this.this$0 = localParticipant;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object m2584handleIncomingRpcRequestOYFzt6o;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m2584handleIncomingRpcRequestOYFzt6o = this.this$0.m2584handleIncomingRpcRequestOYFzt6o(null, null, null, null, 0L, 0, this);
        return m2584handleIncomingRpcRequestOYFzt6o;
    }
}
