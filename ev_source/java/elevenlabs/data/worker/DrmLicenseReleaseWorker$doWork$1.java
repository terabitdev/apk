package io.elevenlabs.data.worker;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.DrmLicenseReleaseWorker", f = "DrmLicenseReleaseWorker.kt", l = {45}, m = "doWork", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DrmLicenseReleaseWorker$doWork$1 extends c {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DrmLicenseReleaseWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrmLicenseReleaseWorker$doWork$1(DrmLicenseReleaseWorker drmLicenseReleaseWorker, wn.c<? super DrmLicenseReleaseWorker$doWork$1> cVar) {
        super(cVar);
        this.this$0 = drmLicenseReleaseWorker;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
