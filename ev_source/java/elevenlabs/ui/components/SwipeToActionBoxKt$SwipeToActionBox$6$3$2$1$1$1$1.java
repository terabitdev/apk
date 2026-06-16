package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.SwipeToActionBoxKt$SwipeToActionBox$6$3$2$1$1$1$1", f = "SwipeToActionBox.kt", l = {253}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SwipeToActionBoxKt$SwipeToActionBox$6$3$2$1$1$1$1 extends yn.i implements ho.p {
    final /* synthetic */ ActionConfig $action;
    final /* synthetic */ ActionSpec $actionSpec;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToActionBoxKt$SwipeToActionBox$6$3$2$1$1$1$1(ActionSpec actionSpec, ActionConfig actionConfig, wn.c<? super SwipeToActionBoxKt$SwipeToActionBox$6$3$2$1$1$1$1> cVar) {
        super(2, cVar);
        this.$actionSpec = actionSpec;
        this.$action = actionConfig;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new SwipeToActionBoxKt$SwipeToActionBox$6$3$2$1$1$1$1(this.$actionSpec, this.$action, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((SwipeToActionBoxKt$SwipeToActionBox$6$3$2$1$1$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            ho.p onAction = this.$actionSpec.getOnAction();
            ActionConfig actionConfig = this.$action;
            this.label = 1;
            Object invoke = onAction.invoke(actionConfig, this);
            xn.a aVar = xn.a.f37986a;
            if (invoke == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
