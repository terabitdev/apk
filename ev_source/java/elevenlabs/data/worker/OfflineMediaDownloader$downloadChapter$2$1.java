package io.elevenlabs.data.worker;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import kotlin.Metadata;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.worker.OfflineMediaDownloader$downloadChapter$2$1", f = "OfflineMediaDownloader.kt", l = {166, 169}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OfflineMediaDownloader$downloadChapter$2$1 extends i implements p {
    final /* synthetic */ int $chapterIndex;
    final /* synthetic */ int $chapterProgress;
    final /* synthetic */ long $offlineReadId;
    int label;
    final /* synthetic */ OfflineMediaDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineMediaDownloader$downloadChapter$2$1(OfflineMediaDownloader offlineMediaDownloader, long j4, int i10, int i11, c<? super OfflineMediaDownloader$downloadChapter$2$1> cVar) {
        super(2, cVar);
        this.this$0 = offlineMediaDownloader;
        this.$offlineReadId = j4;
        this.$chapterIndex = i10;
        this.$chapterProgress = i11;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new OfflineMediaDownloader$downloadChapter$2$1(this.this$0, this.$offlineReadId, this.$chapterIndex, this.$chapterProgress, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((OfflineMediaDownloader$downloadChapter$2$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r12.recomputeReadAggregate(r4, r11) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r4.updateChapterStatus(r5, r7, r8, r9, r10) == r3) goto L15;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OfflineReadsDao offlineReadsDao;
        OfflineMediaDownloader$downloadChapter$2$1 offlineMediaDownloader$downloadChapter$2$1;
        OfflineReadsDao offlineReadsDao2;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
            offlineMediaDownloader$downloadChapter$2$1 = this;
        } else {
            sn.a.g(obj);
            offlineReadsDao = this.this$0.offlineReadsDao;
            long j4 = this.$offlineReadId;
            int i11 = this.$chapterIndex;
            OfflineChapterEntity.Status status = OfflineChapterEntity.Status.DOWNLOADING;
            int i12 = this.$chapterProgress;
            this.label = 1;
            offlineMediaDownloader$downloadChapter$2$1 = this;
        }
        offlineReadsDao2 = offlineMediaDownloader$downloadChapter$2$1.this$0.offlineReadsDao;
        long j10 = offlineMediaDownloader$downloadChapter$2$1.$offlineReadId;
        offlineMediaDownloader$downloadChapter$2$1.label = 2;
    }
}
