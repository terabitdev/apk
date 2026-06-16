package io.livekit.android.room.datastream.incoming;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.datastream.incoming.BaseStreamReceiver", f = "BaseStreamReceiver.kt", l = {56}, m = "readAll")
@Metadata(k = 3, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BaseStreamReceiver$readAll$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseStreamReceiver<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStreamReceiver$readAll$1(BaseStreamReceiver<T> baseStreamReceiver, wn.c<? super BaseStreamReceiver$readAll$1> cVar) {
        super(cVar);
        this.this$0 = baseStreamReceiver;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readAll(this);
    }
}
