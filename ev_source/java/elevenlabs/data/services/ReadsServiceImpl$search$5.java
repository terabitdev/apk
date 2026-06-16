package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.ReadMeta;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$search$5", f = "ReadsServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lio/elevenlabs/domain/model/ReadMeta;", "it", "Lsn/z;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$search$5 extends yn.i implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$search$5(ReadsServiceImpl readsServiceImpl, wn.c<? super ReadsServiceImpl$search$5> cVar) {
        super(2, cVar);
        this.this$0 = readsServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ReadsServiceImpl$search$5 readsServiceImpl$search$5 = new ReadsServiceImpl$search$5(this.this$0, cVar);
        readsServiceImpl$search$5.L$0 = obj;
        return readsServiceImpl$search$5;
    }

    @Override // ho.p
    public final Object invoke(List<ReadMeta> list, wn.c<? super z> cVar) {
        return ((ReadsServiceImpl$search$5) create(list, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        List list = (List) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            logger = this.this$0.logger;
            str = this.this$0.tag;
            DuplicateReadIdExceptionKt.reportDuplicateReadIds(logger, str, "search results", list);
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
