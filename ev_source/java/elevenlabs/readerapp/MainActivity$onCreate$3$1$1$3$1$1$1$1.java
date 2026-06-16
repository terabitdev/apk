package io.elevenlabs.readerapp;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.readerapp.core.router.RouterViewModel;
import io.elevenlabs.readerapp.services.NavigationDispatcherProvider;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.MainActivity$onCreate$3$1$1$3$1$1$1$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class MainActivity$onCreate$3$1$1$3$1$1$1$1 extends yn.i implements p {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$onCreate$3$1$1$3$1$1$1$1(MainActivity mainActivity, wn.c<? super MainActivity$onCreate$3$1$1$3$1$1$1$1> cVar) {
        super(2, cVar);
        this.this$0 = mainActivity;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new MainActivity$onCreate$3$1$1$3$1$1$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((MainActivity$onCreate$3$1$1$3$1$1$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        RouterViewModel routerViewModel;
        if (this.label == 0) {
            sn.a.g(obj);
            NavigationDispatcherProvider navigationDispatcherProvider = this.this$0.getNavigationDispatcherProvider();
            routerViewModel = this.this$0.getRouterViewModel();
            navigationDispatcherProvider.setupDispatcher(routerViewModel);
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
