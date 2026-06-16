package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.DragDropState$onDragInterrupted$1", f = "ReorderableRow.kt", l = {SensibleDefaults.X_OFFSET, 181}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class DragDropState$onDragInterrupted$1 extends yn.i implements ho.p {
    final /* synthetic */ float $startOffset;
    int label;
    final /* synthetic */ DragDropState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragDropState$onDragInterrupted$1(DragDropState dragDropState, float f10, wn.c<? super DragDropState$onDragInterrupted$1> cVar) {
        super(2, cVar);
        this.this$0 = dragDropState;
        this.$startOffset = f10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new DragDropState$onDragInterrupted$1(this.this$0, this.$startOffset, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((DragDropState$onDragInterrupted$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (j1.d.c(r4, r5, r6, null, r8, 12) == r3) goto L15;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DragDropState$onDragInterrupted$1 dragDropState$onDragInterrupted$1;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    dragDropState$onDragInterrupted$1 = this;
                    dragDropState$onDragInterrupted$1.this$0.setPreviousIndexOfDraggedItem(null);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            j1.d previousItemOffset = this.this$0.getPreviousItemOffset();
            Float f10 = new Float(this.$startOffset);
            this.label = 1;
            if (previousItemOffset.e(f10, this) == aVar) {
                return aVar;
            }
        }
        j1.d previousItemOffset2 = this.this$0.getPreviousItemOffset();
        Float f11 = new Float(t2.u.P);
        j1.a2 s10 = j1.e.s(0, 0, j1.y.f18446c, 3);
        this.label = 2;
        dragDropState$onDragInterrupted$1 = this;
    }
}
