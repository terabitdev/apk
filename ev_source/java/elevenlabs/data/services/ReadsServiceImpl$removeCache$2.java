package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.services.optimized.OptimizedReadCache;
import java.io.File;
import kotlin.Metadata;
import sn.m;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$removeCache$2", f = "ReadsServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lsn/m;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)Lsn/m;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$removeCache$2 extends yn.i implements p {
    final /* synthetic */ String $htmlChecksum;
    final /* synthetic */ String $readId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReadsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$removeCache$2(ReadsServiceImpl readsServiceImpl, String str, String str2, wn.c<? super ReadsServiceImpl$removeCache$2> cVar) {
        super(2, cVar);
        this.this$0 = readsServiceImpl;
        this.$readId = str;
        this.$htmlChecksum = str2;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ReadsServiceImpl$removeCache$2 readsServiceImpl$removeCache$2 = new ReadsServiceImpl$removeCache$2(this.this$0, this.$readId, this.$htmlChecksum, cVar);
        readsServiceImpl$removeCache$2.L$0 = obj;
        return readsServiceImpl$removeCache$2;
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super m> cVar) {
        return ((ReadsServiceImpl$removeCache$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object lVar;
        OptimizedReadCache optimizedReadCache;
        File htmlCacheFile;
        if (this.label == 0) {
            sn.a.g(obj);
            try {
                htmlCacheFile = this.this$0.getHtmlCacheFile(this.$readId, this.$htmlChecksum);
                htmlCacheFile.delete();
            } catch (Throwable unused) {
            }
            ReadsServiceImpl readsServiceImpl = this.this$0;
            String str = this.$readId;
            String str2 = this.$htmlChecksum;
            try {
                optimizedReadCache = readsServiceImpl.optimizedReadCache;
                optimizedReadCache.clear(str, str2);
                lVar = z.f31622a;
            } catch (Throwable th) {
                lVar = new sn.l(th);
            }
            return new m(lVar);
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
