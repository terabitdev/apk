package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.DragDropState$onDrag$1$1$3$1$1", f = "ReorderableRow.kt", l = {218, 219}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class DragDropState$onDrag$1$1$3$1$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ DragDropState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragDropState$onDrag$1$1$3$1$1(DragDropState dragDropState, wn.c<? super DragDropState$onDrag$1$1$3$1$1> cVar) {
        super(2, cVar);
        this.this$0 = dragDropState;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new DragDropState$onDrag$1$1$3$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((DragDropState$onDrag$1$1$3$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (j1.d.c(r4, r5, r6, null, r10, 12) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r11.e(r4, r10) == r3) goto L15;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            j1.d previousItemOffset = this.this$0.getPreviousItemOffset();
            Float f10 = new Float(this.this$0.getDraggingItemOffset$ui_release());
            this.label = 1;
        }
        j1.d previousItemOffset2 = this.this$0.getPreviousItemOffset();
        Float f11 = new Float(t2.u.P);
        j1.a2 s10 = j1.e.s(100, 0, null, 6);
        this.label = 2;
    }
}
