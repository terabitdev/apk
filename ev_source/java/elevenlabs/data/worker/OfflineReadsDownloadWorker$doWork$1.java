package io.elevenlabs.data.worker;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineReadsDownloadWorker", f = "OfflineReadsDownloadWorker.kt", l = {31, 37, 38}, m = "doWork", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsDownloadWorker$doWork$1 extends c {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineReadsDownloadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDownloadWorker$doWork$1(OfflineReadsDownloadWorker offlineReadsDownloadWorker, wn.c<? super OfflineReadsDownloadWorker$doWork$1> cVar) {
        super(cVar);
        this.this$0 = offlineReadsDownloadWorker;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
