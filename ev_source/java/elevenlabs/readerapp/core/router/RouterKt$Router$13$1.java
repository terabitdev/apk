package io.elevenlabs.readerapp.core.router;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.Destination;
import io.elevenlabs.domain.services.ReadsService;
import java.util.Locale;
import kotlin.Metadata;
import na.l0;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.router.RouterKt$Router$13$1", f = "Router.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RouterKt$Router$13$1 extends yn.i implements ho.p {
    final /* synthetic */ na.c0 $rootNavController;
    final /* synthetic */ s2 $state$delegate;
    final /* synthetic */ RouterViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterKt$Router$13$1(na.c0 c0Var, RouterViewModel routerViewModel, s2 s2Var, wn.c<? super RouterKt$Router$13$1> cVar) {
        super(2, cVar);
        this.$rootNavController = c0Var;
        this.$vm = routerViewModel;
        this.$state$delegate = s2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [na.l0, java.lang.Object] */
    public static final sn.z invokeSuspend$lambda$1(na.g0 g0Var) {
        g0Var.getClass();
        g0Var.b(Routes.libraryPattern);
        g0Var.f24315d = -1;
        g0Var.f24317f = false;
        ?? obj = new Object();
        invokeSuspend$lambda$1$0(obj);
        g0Var.f24317f = obj.f24342a;
        g0Var.f24318g = false;
        g0Var.f24313b = true;
        g0Var.f24314c = false;
        return sn.z.f31622a;
    }

    private static final sn.z invokeSuspend$lambda$1$0(l0 l0Var) {
        l0Var.f24342a = true;
        return sn.z.f31622a;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new RouterKt$Router$13$1(this.$rootNavController, this.$vm, this.$state$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((RouterKt$Router$13$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        RouterState Router$lambda$0;
        String str;
        String name;
        if (this.label == 0) {
            sn.a.g(obj);
            Router$lambda$0 = RouterKt.Router$lambda$0(this.$state$delegate);
            Destination pendingNavigation = Router$lambda$0.getPendingNavigation();
            sn.z zVar = sn.z.f31622a;
            if (pendingNavigation == null) {
                return zVar;
            }
            if (pendingNavigation instanceof Destination.Authorized.OfflineDownloadLimitReached) {
                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.INSTANCE.offlineDownloadLimitReachedRoute(((Destination.Authorized.OfflineDownloadLimitReached) pendingNavigation).getMessage()), false, null, 6, null);
            } else if (pendingNavigation instanceof Destination.Authorized.Paywall) {
                Destination.Authorized.Paywall paywall = (Destination.Authorized.Paywall) pendingNavigation;
                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.paywallRoute$default(Routes.INSTANCE, paywall.getSource(), paywall.getAnalyticsSource(), (String) null, 4, (Object) null), false, null, 6, null);
            } else if (pendingNavigation instanceof Destination.Authorized.ReadDetails) {
                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.INSTANCE.readDetails(((Destination.Authorized.ReadDetails) pendingNavigation).getReadId()), false, null, 6, null);
            } else if (pendingNavigation instanceof Destination.Authorized.Library) {
                ReadsService.SortBy sortBy = ((Destination.Authorized.Library) pendingNavigation).getSortBy();
                if (sortBy != null && (name = sortBy.name()) != null) {
                    str = name.toLowerCase(Locale.ROOT);
                    str.getClass();
                } else {
                    str = null;
                }
                StringBuilder sb = new StringBuilder(Routes.libraryRoute);
                if (str != null && str.length() != 0) {
                    sb.append("?sortBy=" + str);
                }
                this.$rootNavController.b(new b0(0), sb.toString());
            } else if (pendingNavigation instanceof Destination.Authorized.AddPronunciationScreen) {
                Destination.Authorized.AddPronunciationScreen addPronunciationScreen = (Destination.Authorized.AddPronunciationScreen) pendingNavigation;
                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.INSTANCE.pronunciationAddRoute(addPronunciationScreen.getVoiceId(), addPronunciationScreen.getOriginalText()), false, null, 6, null);
            } else if (pendingNavigation instanceof Destination.Authorized.EditPronunciationScreen) {
                Destination.Authorized.EditPronunciationScreen editPronunciationScreen = (Destination.Authorized.EditPronunciationScreen) pendingNavigation;
                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.INSTANCE.pronunciationEditRoute(editPronunciationScreen.getVoiceId(), editPronunciationScreen.getPronunciationId(), editPronunciationScreen.getOriginalText(), editPronunciationScreen.getSpokenText()), false, null, 6, null);
            } else if (pendingNavigation.equals(Destination.Authorized.PronunciationsListScreen.INSTANCE)) {
                NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, this.$rootNavController, Routes.pronunciationsListRoute, false, null, 6, null);
            } else {
                c6.p();
                return null;
            }
            this.$vm.clearPendingNavigation();
            return zVar;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
