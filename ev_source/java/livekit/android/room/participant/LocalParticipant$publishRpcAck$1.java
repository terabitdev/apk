package io.livekit.android.room.participant;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.participant.LocalParticipant", f = "LocalParticipant.kt", l = {1271}, m = "publishRpcAck-sjKNNEs")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LocalParticipant$publishRpcAck$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalParticipant this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalParticipant$publishRpcAck$1(LocalParticipant localParticipant, wn.c<? super LocalParticipant$publishRpcAck$1> cVar) {
        super(cVar);
        this.this$0 = localParticipant;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object m2586publishRpcAcksjKNNEs;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m2586publishRpcAcksjKNNEs = this.this$0.m2586publishRpcAcksjKNNEs(null, null, this);
        if (m2586publishRpcAcksjKNNEs == a.f37986a) {
            return m2586publishRpcAcksjKNNEs;
        }
        return new m(m2586publishRpcAcksjKNNEs);
    }
}
