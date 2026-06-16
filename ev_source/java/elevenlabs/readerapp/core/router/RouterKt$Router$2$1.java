package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import io.elevenlabs.readerapp.core.router.PendingShare;
import kotlin.Metadata;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterKt$Router$2$1", f = "Router.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterKt$Router$2$1 extends yn.i implements ho.p {
    final /* synthetic */ z0 $initialHomeNavigationComplete$delegate;
    final /* synthetic */ na.c0 $rootNavController;
    final /* synthetic */ s2 $state$delegate;
    final /* synthetic */ RouterViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterKt$Router$2$1(na.c0 c0Var, RouterViewModel routerViewModel, z0 z0Var, s2 s2Var, wn.c<? super RouterKt$Router$2$1> cVar) {
        super(2, cVar);
        this.$rootNavController = c0Var;
        this.$vm = routerViewModel;
        this.$initialHomeNavigationComplete$delegate = z0Var;
        this.$state$delegate = s2Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterKt$Router$2$1(this.$rootNavController, this.$vm, this.$initialHomeNavigationComplete$delegate, this.$state$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterKt$Router$2$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean Router$lambda$2;
        RouterState Router$lambda$0;
        RouterState Router$lambda$02;
        RouterState Router$lambda$03;
        RouterState Router$lambda$04;
        RouterState Router$lambda$05;
        if (this.label == 0) {
            sn.a.g(obj);
            Router$lambda$2 = RouterKt.Router$lambda$2(this.$initialHomeNavigationComplete$delegate);
            sn.z zVar = sn.z.f31622a;
            if (Router$lambda$2) {
                Router$lambda$0 = RouterKt.Router$lambda$0(this.$state$delegate);
                Boolean ageOnboardingCompleted = Router$lambda$0.getAgeOnboardingCompleted();
                Boolean bool = Boolean.FALSE;
                if (!kotlin.jvm.internal.m.c(ageOnboardingCompleted, bool)) {
                    Router$lambda$02 = RouterKt.Router$lambda$0(this.$state$delegate);
                    PendingShare pendingShare = Router$lambda$02.getPendingShare();
                    Router$lambda$03 = RouterKt.Router$lambda$0(this.$state$delegate);
                    String pendingDeepLink = Router$lambda$03.getPendingDeepLink();
                    if (pendingShare != null) {
                        Router$lambda$05 = RouterKt.Router$lambda$0(this.$state$delegate);
                        Boolean signedIn = Router$lambda$05.getSignedIn();
                        if (kotlin.jvm.internal.m.c(signedIn, Boolean.TRUE)) {
                            if (pendingShare instanceof PendingShare.Text) {
                                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.readsImportTextRoute, false, null, 6, null);
                            } else if (pendingShare instanceof PendingShare.File) {
                                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.readsImportFileRoute, false, null, 6, null);
                            } else if (pendingShare instanceof PendingShare.Images) {
                                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.readsImportOcrRoute, false, null, 6, null);
                            } else if (pendingShare instanceof PendingShare.Link) {
                                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.INSTANCE.readsImportLinkRoute(((PendingShare.Link) pendingShare).getUrl(), true), false, null, 6, null);
                                this.$vm.onShareConsumed();
                            } else {
                                c6.p();
                                return null;
                            }
                        } else if (kotlin.jvm.internal.m.c(signedIn, bool)) {
                            this.$vm.onShareConsumed();
                        } else if (signedIn != null) {
                            c6.p();
                            return null;
                        }
                    } else if (pendingDeepLink != null) {
                        Router$lambda$04 = RouterKt.Router$lambda$0(this.$state$delegate);
                        Boolean signedIn2 = Router$lambda$04.getSignedIn();
                        if (kotlin.jvm.internal.m.c(signedIn2, Boolean.TRUE)) {
                            NavigationExtensions.INSTANCE.launchDeeplink(this.$rootNavController, pendingDeepLink);
                            this.$vm.onDeepLinkConsumed();
                        } else if (kotlin.jvm.internal.m.c(signedIn2, bool)) {
                            this.$vm.onDeepLinkConsumed();
                        } else if (signedIn2 != null) {
                            c6.p();
                            return null;
                        }
                    }
                }
            }
            return zVar;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
