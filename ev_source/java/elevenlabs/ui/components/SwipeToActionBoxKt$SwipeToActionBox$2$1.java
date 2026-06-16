package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.SwipeToActionBoxKt$SwipeToActionBox$2$1", f = "SwipeToActionBox.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SwipeToActionBoxKt$SwipeToActionBox$2$1 extends yn.i implements ho.p {
    final /* synthetic */ SwipeToActionMenuController $menuController;
    final /* synthetic */ u2.z0 $menuExpanded$delegate;
    final /* synthetic */ u2.z0 $menuOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToActionBoxKt$SwipeToActionBox$2$1(SwipeToActionMenuController swipeToActionMenuController, u2.z0 z0Var, u2.z0 z0Var2, wn.c<? super SwipeToActionBoxKt$SwipeToActionBox$2$1> cVar) {
        super(2, cVar);
        this.$menuController = swipeToActionMenuController;
        this.$menuOffset$delegate = z0Var;
        this.$menuExpanded$delegate = z0Var2;
    }

    public static final sn.z invokeSuspend$lambda$0$0(u2.z0 z0Var, u2.z0 z0Var2, h5.g gVar) {
        SwipeToActionBoxKt.SwipeToActionBox$lambda$6(z0Var, gVar.f12084a);
        SwipeToActionBoxKt.SwipeToActionBox$lambda$3(z0Var2, true);
        return sn.z.f31622a;
    }

    public static final sn.z invokeSuspend$lambda$0$1(u2.z0 z0Var) {
        SwipeToActionBoxKt.SwipeToActionBox$lambda$3(z0Var, false);
        return sn.z.f31622a;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new SwipeToActionBoxKt$SwipeToActionBox$2$1(this.$menuController, this.$menuOffset$delegate, this.$menuExpanded$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((SwipeToActionBoxKt$SwipeToActionBox$2$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sn.a.g(obj);
            SwipeToActionMenuController swipeToActionMenuController = this.$menuController;
            if (swipeToActionMenuController != null) {
                u2.z0 z0Var = this.$menuOffset$delegate;
                u2.z0 z0Var2 = this.$menuExpanded$delegate;
                swipeToActionMenuController.setShowMenu$ui_release(new u2(z0Var, z0Var2, 0));
                swipeToActionMenuController.setHideMenu$ui_release(new v2(z0Var2, 0));
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
