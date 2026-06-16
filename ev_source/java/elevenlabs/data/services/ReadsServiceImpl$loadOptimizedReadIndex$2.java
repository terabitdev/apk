package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.services.optimized.OptimizedReadCache;
import io.elevenlabs.data.services.optimized.OptimizedReadIndexBlob;
import io.elevenlabs.data.services.optimized.OptimizedReadSplitterKt;
import io.elevenlabs.domain.model.ChapterSlotIndex;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$loadOptimizedReadIndex$2", f = "ReadsServiceImpl.kt", l = {370}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "", "Lio/elevenlabs/domain/model/ChapterSlotIndex;", "<anonymous>", "(Lfr/d0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$loadOptimizedReadIndex$2 extends yn.i implements p {
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ ReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$loadOptimizedReadIndex$2(ReadsServiceImpl readsServiceImpl, String str, wn.c<? super ReadsServiceImpl$loadOptimizedReadIndex$2> cVar) {
        super(2, cVar);
        this.this$0 = readsServiceImpl;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ReadsServiceImpl$loadOptimizedReadIndex$2(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super List<ChapterSlotIndex>> cVar) {
        return ((ReadsServiceImpl$loadOptimizedReadIndex$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadsDao readsDao;
        String str;
        OptimizedReadCache optimizedReadCache;
        ReadMetaEntity meta;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            readsDao = this.this$0.readsDao;
            String str2 = this.$readId;
            this.label = 1;
            obj = readsDao.getById(str2, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
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
            return null;
        }
        return OptimizedReadSplitterKt.toDomain(readIndex);
    }
}
