package io.elevenlabs.data.worker;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import yn.c;
import yn.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineReadsDownloader", f = "OfflineReadsDownloader.kt", l = {150, 152, ModuleDescriptor.MODULE_VERSION, 158, 159, 160, 166, 170, 173, 176}, m = "downloadChapter", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsDownloader$downloadChapter$1 extends c {
    int I$0;
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
    public OfflineReadsDownloader$downloadChapter$1(OfflineReadsDownloader offlineReadsDownloader, wn.c<? super OfflineReadsDownloader$downloadChapter$1> cVar) {
        super(cVar);
        this.this$0 = offlineReadsDownloader;
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object downloadChapter;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        downloadChapter = this.this$0.downloadChapter(0L, null, null, null, this);
        return downloadChapter;
    }
}
