package io.elevenlabs.data.worker;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineReadsDownloader", f = "OfflineReadsDownloader.kt", l = {323, 328, 340, 349, 352}, m = "doDownloadHtmlStep", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsDownloader$doDownloadHtmlStep$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineReadsDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDownloader$doDownloadHtmlStep$1(OfflineReadsDownloader offlineReadsDownloader, wn.c<? super OfflineReadsDownloader$doDownloadHtmlStep$1> cVar) {
        super(cVar);
        this.this$0 = offlineReadsDownloader;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object doDownloadHtmlStep;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        doDownloadHtmlStep = this.this$0.doDownloadHtmlStep(0L, this);
        return doDownloadHtmlStep;
    }
}
