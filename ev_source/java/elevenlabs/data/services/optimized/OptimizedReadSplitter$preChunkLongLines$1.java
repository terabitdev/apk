package io.elevenlabs.data.services.optimized;

import com.google.protobuf.c6;
import ho.p;
import java.util.Iterator;
import kotlin.Metadata;
import sn.a;
import sn.z;
import vq.i;
import vq.j;
import wn.c;
import yn.e;
import yn.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.services.optimized.OptimizedReadSplitter$preChunkLongLines$1", f = "OptimizedReadSplitter.kt", l = {95, 97}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvq/j;", "", "Lsn/z;", "<anonymous>", "(Lvq/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OptimizedReadSplitter$preChunkLongLines$1 extends h implements p {
    final /* synthetic */ vq.h $lines;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OptimizedReadSplitter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptimizedReadSplitter$preChunkLongLines$1(vq.h hVar, OptimizedReadSplitter optimizedReadSplitter, c<? super OptimizedReadSplitter$preChunkLongLines$1> cVar) {
        super(2, cVar);
        this.$lines = hVar;
        this.this$0 = optimizedReadSplitter;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        OptimizedReadSplitter$preChunkLongLines$1 optimizedReadSplitter$preChunkLongLines$1 = new OptimizedReadSplitter$preChunkLongLines$1(this.$lines, this.this$0, cVar);
        optimizedReadSplitter$preChunkLongLines$1.L$0 = obj;
        return optimizedReadSplitter$preChunkLongLines$1;
    }

    @Override // ho.p
    public final Object invoke(j jVar, c<? super z> cVar) {
        return ((OptimizedReadSplitter$preChunkLongLines$1) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Object obj2;
        Object obj3;
        boolean exceedsSpanBudget;
        vq.h chunkBySpanClose;
        Object obj4;
        j jVar = (j) this.L$0;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$1;
            a.g(obj);
        } else {
            a.g(obj);
            it = this.$lines.iterator();
        }
        do {
            boolean hasNext = it.hasNext();
            obj2 = z.f31622a;
            if (hasNext) {
                String str = (String) it.next();
                int length = str.length();
                obj3 = xn.a.f37986a;
                if (length >= 4000) {
                    exceedsSpanBudget = this.this$0.exceedsSpanBudget(str);
                    if (exceedsSpanBudget) {
                        chunkBySpanClose = this.this$0.chunkBySpanClose(str);
                        this.L$0 = jVar;
                        this.L$1 = it;
                        this.L$2 = null;
                        this.label = 2;
                        jVar.getClass();
                        Iterator it2 = chunkBySpanClose.iterator();
                        i iVar = (i) jVar;
                        if (!it2.hasNext()) {
                            obj4 = obj2;
                        } else {
                            iVar.f35842c = it2;
                            iVar.f35840a = 2;
                            iVar.f35843d = this;
                            obj4 = obj3;
                        }
                        if (obj4 == obj3) {
                            obj2 = obj4;
                        }
                    }
                }
                this.L$0 = jVar;
                this.L$1 = it;
                this.L$2 = null;
                this.label = 1;
                jVar.b(str, this);
                return obj3;
            }
            return obj2;
        } while (obj2 != obj3);
        return obj3;
    }
}
