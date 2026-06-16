package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.services.optimized.ChapterContentBlob;
import io.elevenlabs.data.services.optimized.ChapterSlotIndexBlob;
import io.elevenlabs.data.services.optimized.OptimizedReadCache;
import io.elevenlabs.data.services.optimized.OptimizedReadIndexBlob;
import io.elevenlabs.data.services.optimized.OptimizedReadSplitterKt;
import io.elevenlabs.domain.model.ChapterContent;
import java.util.Iterator;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$loadAllChapterContent$2", f = "ReadsServiceImpl.kt", l = {385, 390}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/ChapterContent;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$loadAllChapterContent$2 extends yn.i implements p {
    final /* synthetic */ String $readId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ ReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$loadAllChapterContent$2(ReadsServiceImpl readsServiceImpl, String str, wn.c<? super ReadsServiceImpl$loadAllChapterContent$2> cVar) {
        super(2, cVar);
        this.this$0 = readsServiceImpl;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ReadsServiceImpl$loadAllChapterContent$2 readsServiceImpl$loadAllChapterContent$2 = new ReadsServiceImpl$loadAllChapterContent$2(this.this$0, this.$readId, cVar);
        readsServiceImpl$loadAllChapterContent$2.L$0 = obj;
        return readsServiceImpl$loadAllChapterContent$2;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((ReadsServiceImpl$loadAllChapterContent$2) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
    
        if (r10 == r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007a  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadsDao readsDao;
        String str;
        OptimizedReadCache optimizedReadCache;
        Iterator<ChapterSlotIndexBlob> it;
        String str2;
        ReadMetaEntity meta;
        OptimizedReadCache optimizedReadCache2;
        ChapterContent domain;
        ir.j jVar = (ir.j) this.L$0;
        int i10 = this.label;
        z zVar = z.f31622a;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = (Iterator) this.L$3;
                    str2 = (String) this.L$1;
                    sn.a.g(obj);
                    while (it.hasNext()) {
                        ChapterSlotIndexBlob next = it.next();
                        optimizedReadCache2 = this.this$0.optimizedReadCache;
                        ChapterContentBlob readChapter = optimizedReadCache2.readChapter(this.$readId, str2, next.getChapterIndex());
                        if (readChapter != null && (domain = OptimizedReadSplitterKt.toDomain(readChapter)) != null) {
                            this.L$0 = jVar;
                            this.L$1 = str2;
                            this.L$2 = null;
                            this.L$3 = it;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.I$0 = 0;
                            this.label = 2;
                            if (jVar.emit(domain, this) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    return zVar;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            readsDao = this.this$0.readsDao;
            String str3 = this.$readId;
            this.L$0 = jVar;
            this.label = 1;
            obj = readsDao.getById(str3, this);
        }
        ReadMetaEntityWithChapters readMetaEntityWithChapters = (ReadMetaEntityWithChapters) obj;
        if (readMetaEntityWithChapters != null && (meta = readMetaEntityWithChapters.getMeta()) != null) {
            str = meta.getHtml_checksum();
        } else {
            str = null;
        }
        optimizedReadCache = this.this$0.optimizedReadCache;
        OptimizedReadIndexBlob readIndex = optimizedReadCache.readIndex(this.$readId, str);
        if (readIndex == null) {
            return zVar;
        }
        it = readIndex.getChapters().iterator();
        str2 = str;
        while (it.hasNext()) {
        }
        return zVar;
    }
}
