package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.domain.model.ReadMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$getReads$5", f = "ReadsServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "", "Lio/elevenlabs/domain/model/ReadMeta;", "<anonymous>", "(Lfr/d0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$getReads$5 extends yn.i implements p {
    final /* synthetic */ List<String> $ids;
    int label;
    final /* synthetic */ ReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$getReads$5(ReadsServiceImpl readsServiceImpl, List<String> list, wn.c<? super ReadsServiceImpl$getReads$5> cVar) {
        super(2, cVar);
        this.this$0 = readsServiceImpl;
        this.$ids = list;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ReadsServiceImpl$getReads$5(this.this$0, this.$ids, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super List<ReadMeta>> cVar) {
        return ((ReadsServiceImpl$getReads$5) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ReadsDao readsDao;
        if (this.label == 0) {
            sn.a.g(obj);
            readsDao = this.this$0.readsDao;
            List<ReadMetaEntityWithChapters> allById = readsDao.getAllById(this.$ids);
            ArrayList arrayList = new ArrayList(tn.p.a0(allById, 10));
            Iterator<T> it = allById.iterator();
            while (it.hasNext()) {
                arrayList.add(ReadMappingKt.toDomain((ReadMetaEntityWithChapters) it.next()));
            }
            return arrayList;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
