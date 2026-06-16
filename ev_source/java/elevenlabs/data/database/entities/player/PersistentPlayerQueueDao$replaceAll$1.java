package io.elevenlabs.data.database.entities.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao", f = "PersistentPlayerQueueDao.kt", l = {22, 23}, m = "replaceAll$suspendImpl", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PersistentPlayerQueueDao$replaceAll$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PersistentPlayerQueueDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentPlayerQueueDao$replaceAll$1(PersistentPlayerQueueDao persistentPlayerQueueDao, wn.c<? super PersistentPlayerQueueDao$replaceAll$1> cVar) {
        super(cVar);
        this.this$0 = persistentPlayerQueueDao;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PersistentPlayerQueueDao.replaceAll$suspendImpl(this.this$0, null, this);
    }
}
