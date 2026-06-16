package io.elevenlabs.ui.components.scaffolds;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import kotlin.Metadata;
import q2.u5;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1$close$1", f = "BottomSheetScaffold.kt", l = {160}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1$close$1 extends i implements p {
    final /* synthetic */ u5 $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1$close$1(u5 u5Var, c<? super BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1$close$1> cVar) {
        super(2, cVar);
        this.$sheetState = u5Var;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1$close$1(this.$sheetState, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1$close$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
            u5 u5Var = this.$sheetState;
            this.label = 1;
            Object c5 = u5Var.c(this);
            xn.a aVar = xn.a.f37986a;
            if (c5 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
