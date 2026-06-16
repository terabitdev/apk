package io.livekit.android.room.datastream.outgoing;

import io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManagerImpl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.datastream.outgoing.OutgoingDataStreamManagerImpl$ManagerStreamDestination", f = "OutgoingDataStreamManager.kt", l = {307}, m = "write-0E7RQCE")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OutgoingDataStreamManagerImpl$ManagerStreamDestination$write$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutgoingDataStreamManagerImpl.ManagerStreamDestination<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingDataStreamManagerImpl$ManagerStreamDestination$write$1(OutgoingDataStreamManagerImpl.ManagerStreamDestination<T> managerStreamDestination, wn.c<? super OutgoingDataStreamManagerImpl$ManagerStreamDestination$write$1> cVar) {
        super(cVar);
        this.this$0 = managerStreamDestination;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo2570write0E7RQCE = this.this$0.mo2570write0E7RQCE(null, null, this);
        if (mo2570write0E7RQCE == a.f37986a) {
            return mo2570write0E7RQCE;
        }
        return new m(mo2570write0E7RQCE);
    }
}
