package io.elevenlabs.data.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.OfflineReadsServiceImpl", f = "OfflineReadsServiceImpl.kt", l = {608, 614, 615, 628, 632}, m = "cleanupExpiredDownloads", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsServiceImpl$cleanupExpiredDownloads$1 extends yn.c {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsServiceImpl$cleanupExpiredDownloads$1(OfflineReadsServiceImpl offlineReadsServiceImpl, wn.c<? super OfflineReadsServiceImpl$cleanupExpiredDownloads$1> cVar) {
        super(cVar);
        this.this$0 = offlineReadsServiceImpl;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.cleanupExpiredDownloads(this);
    }
}
