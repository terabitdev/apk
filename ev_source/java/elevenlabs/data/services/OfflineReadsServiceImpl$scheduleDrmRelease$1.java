package io.elevenlabs.data.services;

import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.OfflineReadsServiceImpl", f = "OfflineReadsServiceImpl.kt", l = {676}, m = "scheduleDrmRelease", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsServiceImpl$scheduleDrmRelease$1 extends yn.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsServiceImpl$scheduleDrmRelease$1(OfflineReadsServiceImpl offlineReadsServiceImpl, wn.c<? super OfflineReadsServiceImpl$scheduleDrmRelease$1> cVar) {
        super(cVar);
        this.this$0 = offlineReadsServiceImpl;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object scheduleDrmRelease;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        scheduleDrmRelease = this.this$0.scheduleDrmRelease((OfflineReadEntity) null, (wn.c<? super z>) this);
        return scheduleDrmRelease;
    }
}
