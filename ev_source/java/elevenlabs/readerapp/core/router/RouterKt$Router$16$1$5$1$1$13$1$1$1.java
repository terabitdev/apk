package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterKt$Router$16$1$5$1$1$13$1$1$1", f = "Router.kt", l = {612}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterKt$Router$16$1$5$1$1$13$1$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    final /* synthetic */ na.c0 $rootNavController;
    final /* synthetic */ Analytics.Event.PlayerActivationSource $source;
    final /* synthetic */ RouterViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterKt$Router$16$1$5$1$1$13$1$1$1(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource, RouterViewModel routerViewModel, wn.c<? super RouterKt$Router$16$1$5$1$1$13$1$1$1> cVar) {
        super(2, cVar);
        this.$rootNavController = c0Var;
        this.$readId = str;
        this.$source = playerActivationSource;
        this.$vm = routerViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterKt$Router$16$1$5$1$1$13$1$1$1(this.$rootNavController, this.$readId, this.$source, this.$vm, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterKt$Router$16$1$5$1$1$13$1$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object Router$lambda$20$0$4$0$navigateToPlayerWithClearQueueConfirmation;
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
            Analytics.Event.PlayerAddToQueueClicked.Source source = Analytics.Event.PlayerAddToQueueClicked.Source.LibrarySwipeAction;
            na.c0 c0Var = this.$rootNavController;
            RouterViewModel routerViewModel = this.$vm;
            String str = this.$readId;
            Analytics.Event.PlayerActivationSource playerActivationSource = this.$source;
            this.label = 1;
            Router$lambda$20$0$4$0$navigateToPlayerWithClearQueueConfirmation = RouterKt.Router$lambda$20$0$4$0$navigateToPlayerWithClearQueueConfirmation(c0Var, routerViewModel, str, null, playerActivationSource, source, this);
            xn.a aVar = xn.a.f37986a;
            if (Router$lambda$20$0$4$0$navigateToPlayerWithClearQueueConfirmation == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
