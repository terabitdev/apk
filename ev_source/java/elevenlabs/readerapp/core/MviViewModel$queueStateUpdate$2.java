package io.elevenlabs.readerapp.core;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.Logger;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.MviViewModel$queueStateUpdate$2", f = "MviViewModel.kt", l = {59}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class MviViewModel$queueStateUpdate$2 extends yn.i implements ho.p {
    final /* synthetic */ ho.l $reduce;
    int label;
    final /* synthetic */ MviViewModel<State> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MviViewModel$queueStateUpdate$2(MviViewModel<State> mviViewModel, ho.l lVar, wn.c<? super MviViewModel$queueStateUpdate$2> cVar) {
        super(2, cVar);
        this.this$0 = mviViewModel;
        this.$reduce = lVar;
    }

    public static final String invokeSuspend$lambda$0() {
        return "State update queued";
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new MviViewModel$queueStateUpdate$2(this.this$0, this.$reduce, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((MviViewModel$queueStateUpdate$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
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
            hr.n nVar = ((MviViewModel) this.this$0).events;
            ho.l lVar = this.$reduce;
            this.label = 1;
            Object c5 = nVar.c(lVar, this);
            xn.a aVar = xn.a.f37986a;
            if (c5 == aVar) {
                return aVar;
            }
        }
        Logger logger = ((MviViewModel) this.this$0).logger;
        if (logger != null) {
            logger.verbose(((MviViewModel) this.this$0).debugTag, new f(1));
        }
        return z.f31622a;
    }
}
