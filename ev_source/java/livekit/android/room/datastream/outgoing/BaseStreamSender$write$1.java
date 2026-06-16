package io.livekit.android.room.datastream.outgoing;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.m;
import xn.a;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.datastream.outgoing.BaseStreamSender", f = "BaseStreamSender.kt", l = {38}, m = "write-gIAlu-s")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BaseStreamSender$write$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseStreamSender<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStreamSender$write$1(BaseStreamSender<T> baseStreamSender, wn.c<? super BaseStreamSender$write$1> cVar) {
        super(cVar);
        this.this$0 = baseStreamSender;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m2556writegIAlus = this.this$0.m2556writegIAlus(null, this);
        if (m2556writegIAlus == a.f37986a) {
            return m2556writegIAlus;
        }
        return new m(m2556writegIAlus);
    }
}
