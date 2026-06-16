package io.elevenlabs.data.worker;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineMediaDownloader", f = "OfflineMediaDownloader.kt", l = {55, 67, 70, 75, 77, 84, 85, 87, 99, 119, 120}, m = "doWork", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineMediaDownloader$doWork$1 extends c {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineMediaDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineMediaDownloader$doWork$1(OfflineMediaDownloader offlineMediaDownloader, wn.c<? super OfflineMediaDownloader$doWork$1> cVar) {
        super(cVar);
        this.this$0 = offlineMediaDownloader;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(0L, this);
    }
}
