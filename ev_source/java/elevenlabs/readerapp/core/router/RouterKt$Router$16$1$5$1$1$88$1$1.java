package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import io.elevenlabs.readerapp.core.router.PendingShare;
import kotlin.Metadata;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterKt$Router$16$1$5$1$1$88$1$1", f = "Router.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterKt$Router$16$1$5$1$1$88$1$1 extends yn.i implements ho.p {
    final /* synthetic */ s2 $pendingShare$delegate;
    final /* synthetic */ RouterViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterKt$Router$16$1$5$1$1$88$1$1(RouterViewModel routerViewModel, s2 s2Var, wn.c<? super RouterKt$Router$16$1$5$1$1$88$1$1> cVar) {
        super(2, cVar);
        this.$vm = routerViewModel;
        this.$pendingShare$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterKt$Router$16$1$5$1$1$88$1$1(this.$vm, this.$pendingShare$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterKt$Router$16$1$5$1$1$88$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        PendingShare.Images Router$lambda$20$0$4$0$0$89$1;
        if (this.label == 0) {
            sn.a.g(obj);
            Router$lambda$20$0$4$0$0$89$1 = RouterKt.Router$lambda$20$0$4$0$0$89$1(this.$pendingShare$delegate);
            if (Router$lambda$20$0$4$0$0$89$1 != null) {
                this.$vm.onShareConsumed();
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
