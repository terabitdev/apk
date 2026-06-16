package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.ReorderableRowKt$ReorderableRow$3$1$4$2$1", f = "ReorderableRow.kt", l = {86}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReorderableRowKt$ReorderableRow$3$1$4$2$1 extends yn.i implements ho.p {
    final /* synthetic */ DragDropState $dragDropState;
    final /* synthetic */ float $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableRowKt$ReorderableRow$3$1$4$2$1(DragDropState dragDropState, float f10, wn.c<? super ReorderableRowKt$ReorderableRow$3$1$4$2$1> cVar) {
        super(2, cVar);
        this.$dragDropState = dragDropState;
        this.$it = f10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReorderableRowKt$ReorderableRow$3$1$4$2$1(this.$dragDropState, this.$it, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReorderableRowKt$ReorderableRow$3$1$4$2$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            t1.z state = this.$dragDropState.getState();
            float f10 = this.$it * 1.3f;
            j1.a2 s10 = j1.e.s(0, 0, j1.y.f18446c, 3);
            this.label = 1;
            Object i11 = n1.g.i(state, f10, s10, this);
            xn.a aVar = xn.a.f37986a;
            if (i11 == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
