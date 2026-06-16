package io.elevenlabs.readerapp.core;

import com.google.protobuf.c6;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.MviViewModel$2$3$1", f = "MviViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"State", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class MviViewModel$2$3$1 extends yn.i implements ho.p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MviViewModel<State> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MviViewModel$2$3$1(MviViewModel<State> mviViewModel, wn.c<? super MviViewModel$2$3$1> cVar) {
        super(2, cVar);
        this.this$0 = mviViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        MviViewModel$2$3$1 mviViewModel$2$3$1 = new MviViewModel$2$3$1(this.this$0, cVar);
        mviViewModel$2$3$1.L$0 = obj;
        return mviViewModel$2$3$1;
    }

    public final Object invoke(State state, wn.c<? super z> cVar) {
        return ((MviViewModel$2$3$1) create(state, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            ((MviViewModel) this.this$0).logger.verbose(((MviViewModel) this.this$0).debugTag, new g(this.this$0, obj2, 0));
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // ho.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((MviViewModel$2$3$1) obj, (wn.c<? super z>) obj2);
    }
}
