package io.elevenlabs.data.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.OfflineReadsServiceImpl", f = "OfflineReadsServiceImpl.kt", l = {582, 584, 586, 591}, m = "removeDownloadsForRead", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsServiceImpl$removeDownloadsForRead$1 extends yn.c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsServiceImpl$removeDownloadsForRead$1(OfflineReadsServiceImpl offlineReadsServiceImpl, wn.c<? super OfflineReadsServiceImpl$removeDownloadsForRead$1> cVar) {
        super(cVar);
        this.this$0 = offlineReadsServiceImpl;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeDownloadsForRead(null, this);
    }
}
