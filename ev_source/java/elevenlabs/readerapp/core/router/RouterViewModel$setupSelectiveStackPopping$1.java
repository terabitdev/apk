package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import io.elevenlabs.readerapp.ui.models.UiAction;
import ir.l1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterViewModel$setupSelectiveStackPopping$1", f = "RouterViewModel.kt", l = {414}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterViewModel$setupSelectiveStackPopping$1 extends yn.i implements ho.p {
    final /* synthetic */ kotlin.jvm.internal.z $isClearing;
    final /* synthetic */ kotlin.jvm.internal.b0 $lastStackSize;
    final /* synthetic */ na.c0 $navController;
    final /* synthetic */ kotlin.jvm.internal.d0 $routes;
    int label;
    final /* synthetic */ RouterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterViewModel$setupSelectiveStackPopping$1(na.c0 c0Var, kotlin.jvm.internal.b0 b0Var, kotlin.jvm.internal.z zVar, RouterViewModel routerViewModel, kotlin.jvm.internal.d0 d0Var, wn.c<? super RouterViewModel$setupSelectiveStackPopping$1> cVar) {
        super(2, cVar);
        this.$navController = c0Var;
        this.$lastStackSize = b0Var;
        this.$isClearing = zVar;
        this.this$0 = routerViewModel;
        this.$routes = d0Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterViewModel$setupSelectiveStackPopping$1(this.$navController, this.$lastStackSize, this.$isClearing, this.this$0, this.$routes, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterViewModel$setupSelectiveStackPopping$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            final na.c0 c0Var = this.$navController;
            l1 l1Var = c0Var.f24352b.f28167i;
            final kotlin.jvm.internal.b0 b0Var = this.$lastStackSize;
            final kotlin.jvm.internal.z zVar = this.$isClearing;
            final RouterViewModel routerViewModel = this.this$0;
            final kotlin.jvm.internal.d0 d0Var = this.$routes;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.core.router.RouterViewModel$setupSelectiveStackPopping$1.1
                public final Object emit(List<na.j> list, wn.c<? super sn.z> cVar) {
                    String str;
                    boolean z6;
                    boolean z10;
                    na.x xVar;
                    na.j jVar2 = (na.j) tn.o.H0(list);
                    UiAction.Pending pending = null;
                    if (jVar2 != null && (xVar = jVar2.f24329b) != null) {
                        str = (String) xVar.f24395b.f1674e;
                    } else {
                        str = null;
                    }
                    int size = list.size();
                    if (size < kotlin.jvm.internal.b0.this.f20557a) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!zVar.f20568a && z6) {
                        UiAction<List<String>> startSelectiveStackPopping = ((RouterState) routerViewModel.getStateFlow().getValue()).getStartSelectiveStackPopping();
                        if (startSelectiveStackPopping instanceof UiAction.Pending) {
                            pending = (UiAction.Pending) startSelectiveStackPopping;
                        }
                        if (pending != null) {
                            RouterViewModel routerViewModel2 = routerViewModel;
                            kotlin.jvm.internal.d0 d0Var2 = d0Var;
                            kotlin.jvm.internal.z zVar2 = zVar;
                            routerViewModel2.clearStartSelectiveStackPopping();
                            d0Var2.f20559a = pending.getData();
                            zVar2.f20568a = true;
                        }
                    }
                    if (zVar.f20568a) {
                        z10 = RouterViewModel.setupSelectiveStackPopping$isRouteToClear(str, d0Var);
                        if (z10) {
                            c0Var.e();
                        } else {
                            zVar.f20568a = false;
                        }
                    }
                    kotlin.jvm.internal.b0.this.f20557a = size;
                    return sn.z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((List<na.j>) obj2, (wn.c<? super sn.z>) cVar);
                }
            };
            this.label = 1;
            Object collect = l1Var.f17979a.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        c6.u();
        return null;
    }
}
