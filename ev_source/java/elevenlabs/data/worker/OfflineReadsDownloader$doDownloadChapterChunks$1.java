package io.elevenlabs.data.worker;

import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineReadsDownloader", f = "OfflineReadsDownloader.kt", l = {RpcError.MAX_MESSAGE_BYTES, 261, 266}, m = "doDownloadChapterChunks", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsDownloader$doDownloadChapterChunks$1 extends c {
    int I$0;
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OfflineReadsDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineReadsDownloader$doDownloadChapterChunks$1(OfflineReadsDownloader offlineReadsDownloader, wn.c<? super OfflineReadsDownloader$doDownloadChapterChunks$1> cVar) {
        super(cVar);
        this.this$0 = offlineReadsDownloader;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object doDownloadChapterChunks;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        doDownloadChapterChunks = this.this$0.doDownloadChapterChunks(0L, null, null, 0, 0L, 0L, this);
        return doDownloadChapterChunks;
    }
}
