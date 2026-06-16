package io.elevenlabs.data.database.entities.voices;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.database.entities.voices.RecentVoicesDao", f = "RecentVoicesDao.kt", l = {33, 42}, m = "insertAll$suspendImpl", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RecentVoicesDao$insertAll$1 extends yn.c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentVoicesDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentVoicesDao$insertAll$1(RecentVoicesDao recentVoicesDao, wn.c<? super RecentVoicesDao$insertAll$1> cVar) {
        super(cVar);
        this.this$0 = recentVoicesDao;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RecentVoicesDao.insertAll$suspendImpl(this.this$0, null, 0L, this);
    }
}
