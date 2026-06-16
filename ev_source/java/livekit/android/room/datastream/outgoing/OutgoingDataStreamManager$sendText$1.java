package io.livekit.android.room.datastream.outgoing;

import io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManager$DefaultImpls", f = "OutgoingDataStreamManager.kt", l = {66, 67, 71, 74}, m = "sendText-0E7RQCE")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OutgoingDataStreamManager$sendText$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public OutgoingDataStreamManager$sendText$1(wn.c<? super OutgoingDataStreamManager$sendText$1> cVar) {
        super(cVar);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m2563sendText0E7RQCE = OutgoingDataStreamManager.DefaultImpls.m2563sendText0E7RQCE(null, null, null, this);
        if (m2563sendText0E7RQCE == a.f37986a) {
            return m2563sendText0E7RQCE;
        }
        return new m(m2563sendText0E7RQCE);
    }
}
