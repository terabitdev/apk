package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import kotlin.Metadata;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterKt$Router$4$1", f = "Router.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterKt$Router$4$1 extends yn.i implements ho.p {
    final /* synthetic */ boolean $independentWinBackShowing;
    final /* synthetic */ boolean $regularAutoPaywallShowing;
    final /* synthetic */ s2 $state$delegate;
    final /* synthetic */ RouterViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterKt$Router$4$1(boolean z6, boolean z10, RouterViewModel routerViewModel, s2 s2Var, wn.c<? super RouterKt$Router$4$1> cVar) {
        super(2, cVar);
        this.$regularAutoPaywallShowing = z6;
        this.$independentWinBackShowing = z10;
        this.$vm = routerViewModel;
        this.$state$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterKt$Router$4$1(this.$regularAutoPaywallShowing, this.$independentWinBackShowing, this.$vm, this.$state$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterKt$Router$4$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r1.$independentWinBackShowing != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r2.getWinBackAvailable() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r1.$vm.onWinBackAutoShowConsumed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        return sn.z.f31622a;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RouterState Router$lambda$0;
        if (this.label == 0) {
            sn.a.g(obj);
            if (this.$regularAutoPaywallShowing) {
                Router$lambda$0 = RouterKt.Router$lambda$0(this.$state$delegate);
            }
        } else {
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }
}
