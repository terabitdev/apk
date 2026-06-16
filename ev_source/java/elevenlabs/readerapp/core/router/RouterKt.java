package io.elevenlabs.readerapp.core.router;

import a2.v0;
import android.os.Bundle;
import androidx.lifecycle.k1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import g1.n0;
import i1.d1;
import i1.e1;
import i1.e2;
import i1.f1;
import i1.f2;
import i1.g1;
import i1.h2;
import i1.i2;
import i1.j2;
import i1.m2;
import i1.n2;
import i1.o2;
import i1.t1;
import i1.y0;
import i4.j1;
import i4.q2;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.Destination;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.ocr.OcrImportScreenKt;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MessageBottomSheetOverlayKt;
import io.elevenlabs.readerapp.core.extensions.AnimatedContentTransitionsKt;
import io.elevenlabs.readerapp.core.router.ClearPlayerQueueConfirmation;
import io.elevenlabs.readerapp.core.router.PendingShare;
import io.elevenlabs.readerapp.core.router.Routes;
import io.elevenlabs.readerapp.ui.DevScreenKt;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthScreenKt;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.SignInMode;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.MfaVerificationScreenKt;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify.VerifyEmailScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationItem;
import io.elevenlabs.readerapp.ui.screens.authenticated.BottomNavigationKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.ImportOptionsBottomSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.OfflineDownloadLimitReachedScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingType;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigatorFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManagePurchasesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.licenses.LicensesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDetailsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.EditCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.HomeScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryTab;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionRoute;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.PasteLinkScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchCorpus;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignScreenKt;
import io.elevenlabs.ui.ShowkasePreviewGroup;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.livekit.android.rpc.RpcError;
import ir.z1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import na.l0;
import rd.c1;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000f*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006$²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u0004\u0018\u00010\u001f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u0004\u0018\u00010!8\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u0004\u0018\u00010\"8\nX\u008a\u0084\u0002²\u0006\u000e\u0010#\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010#\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lna/c0;", "rootNavController", "Lio/elevenlabs/readerapp/core/router/RouterViewModel;", "vm", "Lsn/z;", "Router", "(Lna/c0;Lio/elevenlabs/readerapp/core/router/RouterViewModel;Lu2/m;I)V", "Lna/z;", "", "enterAnimationDuration", "unauthorizedRoutes", "(Lna/z;ILna/c0;)V", "exitAnimationDuration", "splashRoutes", "(Lna/z;I)V", "", "path", "getDeepLink", "(Ljava/lang/String;)Ljava/lang/String;", "Lna/j;", "resolvedRoute", "(Lna/j;)Ljava/lang/String;", "getPublicDeepLink", "Lwq/l;", "routeArgPattern", "Lwq/l;", "Lio/elevenlabs/readerapp/core/router/RouterState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "initialHomeNavigationComplete", "navBackStackEntry", "Lio/elevenlabs/readerapp/core/router/PendingShare$Text;", "pendingShare", "Lio/elevenlabs/readerapp/core/router/PendingShare$Images;", "Lio/elevenlabs/readerapp/core/router/PendingShare$File;", "createdVoiceId", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RouterKt {
    private static final wq.l routeArgPattern = new wq.l("\\{(\\w+)\\}");

    public static final void Router(na.c0 c0Var, RouterViewModel routerViewModel, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        na.c0 c0Var2;
        RouterViewModel routerViewModel2;
        u2.q qVar;
        String str;
        na.c0 c0Var3;
        boolean z10;
        boolean z11;
        Analytics.Event.PaywallSource paywallSource;
        RouterViewModel routerViewModel3;
        z0 z0Var;
        u2.q qVar2;
        RouterViewModel routerViewModel4;
        z0 z0Var2;
        na.c0 c0Var4;
        wn.c cVar;
        Object obj;
        boolean z12;
        u2.q qVar3;
        int i12;
        int i13;
        c0Var.getClass();
        routerViewModel.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-558232373);
        if ((i10 & 6) == 0) {
            if (qVar4.h(c0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar4.h(routerViewModel)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = i11;
        if ((i14 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar4.O(i14 & 1, z6)) {
            z0 o6 = u2.r.o(routerViewModel.getStateFlow(), qVar4, 0);
            h5.c cVar2 = (h5.c) qVar4.j(j1.f13129h);
            String str2 = Routes.homeRoute;
            List I = ig.f.I(Routes.homeRoute, Routes.exploreRoute, Routes.libraryRoute, Routes.voicesRoute);
            Object L = qVar4.L();
            Object obj2 = u2.l.f33918a;
            if (L == obj2) {
                L = u2.r.A(Boolean.FALSE);
                qVar4.h0(L);
            }
            z0 z0Var3 = (z0) L;
            na.j jVar = (na.j) android.support.v4.media.session.b.l(c0Var, qVar4).getValue();
            if (jVar != null) {
                str = resolvedRoute(jVar);
            } else {
                str = null;
            }
            boolean f10 = qVar4.f(str) | qVar4.h(routerViewModel);
            Object L2 = qVar4.L();
            if (f10 || L2 == obj2) {
                L2 = new RouterKt$Router$1$1(str, routerViewModel, z0Var3, null);
                qVar4.h0(L2);
            }
            u2.r.f((ho.p) L2, str, qVar4);
            Object[] objArr = {Router$lambda$0(o6).getPendingShare(), Router$lambda$0(o6).getPendingDeepLink(), Router$lambda$0(o6).getSignedIn(), Router$lambda$0(o6).getAgeOnboardingCompleted(), Boolean.valueOf(Router$lambda$2(z0Var3))};
            boolean f11 = qVar4.f(o6) | qVar4.h(c0Var) | qVar4.h(routerViewModel);
            Object L3 = qVar4.L();
            if (!f11 && L3 != obj2) {
                c0Var3 = c0Var;
            } else {
                Object routerKt$Router$2$1 = new RouterKt$Router$2$1(c0Var, routerViewModel, z0Var3, o6, null);
                c0Var3 = c0Var;
                qVar4.h0(routerKt$Router$2$1);
                L3 = routerKt$Router$2$1;
            }
            u2.r.i(objArr, (ho.p) L3, qVar4);
            RouterState Router$lambda$0 = Router$lambda$0(o6);
            boolean h10 = qVar4.h(routerViewModel);
            Object L4 = qVar4.L();
            if (h10 || L4 == obj2) {
                L4 = new RouterKt$Router$3$1(routerViewModel, null);
                qVar4.h0(L4);
            }
            u2.r.f((ho.p) L4, Router$lambda$0, qVar4);
            Object L5 = qVar4.L();
            if (L5 == obj2) {
                L5 = u2.r.q(qVar4);
                qVar4.h0(L5);
            }
            fr.d0 d0Var = (fr.d0) L5;
            if (Router$lambda$0(o6).getShouldShowPaywall() && !Router$lambda$0(o6).getHasRedeemDeepLink() && Router$lambda$0(o6).getPendingDeepLink() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Router$lambda$0(o6).getWinBackAvailable() && kotlin.jvm.internal.m.c(Router$lambda$0(o6).isFreeUser(), Boolean.TRUE) && !Router$lambda$0(o6).getShouldShowPaywall() && !Router$lambda$0(o6).getHasRedeemDeepLink() && Router$lambda$0(o6).getPendingDeepLink() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean g10 = qVar4.g(Router$lambda$0(o6).getShouldShowPaywall()) | qVar4.g(Router$lambda$0(o6).getWinBackAvailable()) | qVar4.f(Router$lambda$0(o6).getOnboardingCompleted()) | qVar4.f(Router$lambda$0(o6).getAgeOnboardingCompleted()) | qVar4.g(Router$lambda$0(o6).getHasRedeemDeepLink()) | qVar4.f(Router$lambda$0(o6).isFreeUser());
            Object L6 = qVar4.L();
            if (g10 || L6 == obj2) {
                if (kotlin.jvm.internal.m.c(Router$lambda$0(o6).getOnboardingCompleted(), Boolean.FALSE)) {
                    str2 = Routes.onboardingRoute;
                } else if (z10) {
                    Routes routes = Routes.INSTANCE;
                    ProductsService.PaywallSource paywallSource2 = ProductsService.PaywallSource.DEFAULT;
                    if (Router$lambda$0(o6).getWinBackAvailable()) {
                        paywallSource = Analytics.Event.PaywallSource.WinBack;
                    } else if (Router$lambda$0(o6).isReturningPaywall()) {
                        paywallSource = Analytics.Event.PaywallSource.ReturningUser;
                    } else {
                        paywallSource = Analytics.Event.PaywallSource.Onboarding;
                    }
                    str2 = Routes.paywallRoute$default(routes, paywallSource2, paywallSource, (String) null, 4, (Object) null);
                } else if (z11) {
                    str2 = Routes.winBackPaywallRoute;
                } else {
                    Boolean onboardingCompleted = Router$lambda$0(o6).getOnboardingCompleted();
                    Boolean bool = Boolean.TRUE;
                    if (!kotlin.jvm.internal.m.c(onboardingCompleted, bool) && (!Router$lambda$0(o6).getHasRedeemDeepLink() || !kotlin.jvm.internal.m.c(Router$lambda$0(o6).getAgeOnboardingCompleted(), bool))) {
                        str2 = Routes.authSplashRoute;
                    }
                }
                ib.i.r("startDestination: ", str2, routerViewModel.getLogger(), "Router");
                qVar4.h0(str2);
                L6 = str2;
            }
            String str3 = (String) L6;
            Boolean valueOf = Boolean.valueOf(z10);
            Boolean valueOf2 = Boolean.valueOf(z11);
            Boolean valueOf3 = Boolean.valueOf(Router$lambda$0(o6).getWinBackAvailable());
            boolean g11 = qVar4.g(z10) | qVar4.f(o6) | qVar4.g(z11) | qVar4.h(routerViewModel);
            Object L7 = qVar4.L();
            if (!g11 && L7 != obj2) {
                routerViewModel3 = routerViewModel;
                z0Var = o6;
            } else {
                Object routerKt$Router$4$1 = new RouterKt$Router$4$1(z10, z11, routerViewModel, o6, null);
                routerViewModel3 = routerViewModel;
                z0Var = o6;
                qVar4.h0(routerKt$Router$4$1);
                L7 = routerKt$Router$4$1;
            }
            u2.r.h(valueOf, valueOf2, valueOf3, (ho.p) L7, qVar4);
            if (Router$lambda$0(z0Var).getShowImportSheet()) {
                qVar4.X(-181969886);
                boolean canUpgrade = Router$lambda$0(z0Var).getCanUpgrade();
                boolean h11 = qVar4.h(routerViewModel3);
                Object L8 = qVar4.L();
                if (h11 || L8 == obj2) {
                    L8 = new s(routerViewModel3, 2);
                    qVar4.h0(L8);
                }
                ho.a aVar = (ho.a) L8;
                boolean h12 = qVar4.h(c0Var3);
                Object L9 = qVar4.L();
                if (h12 || L9 == obj2) {
                    L9 = new v(c0Var3, 22);
                    qVar4.h0(L9);
                }
                ho.a aVar2 = (ho.a) L9;
                boolean h13 = qVar4.h(c0Var3);
                Object L10 = qVar4.L();
                if (h13 || L10 == obj2) {
                    L10 = new v(c0Var3, 29);
                    qVar4.h0(L10);
                }
                ho.a aVar3 = (ho.a) L10;
                boolean h14 = qVar4.h(c0Var3);
                Object L11 = qVar4.L();
                if (h14 || L11 == obj2) {
                    L11 = new w(c0Var3, 6);
                    qVar4.h0(L11);
                }
                ho.a aVar4 = (ho.a) L11;
                boolean h15 = qVar4.h(c0Var3);
                Object L12 = qVar4.L();
                if (h15 || L12 == obj2) {
                    L12 = new w(c0Var3, 11);
                    qVar4.h0(L12);
                }
                ho.a aVar5 = (ho.a) L12;
                boolean h16 = qVar4.h(c0Var3);
                Object L13 = qVar4.L();
                if (h16 || L13 == obj2) {
                    L13 = new w(c0Var3, 17);
                    qVar4.h0(L13);
                }
                ImportOptionsBottomSheetKt.ImportOptionsBottomSheet(canUpgrade, aVar, aVar2, aVar3, aVar4, aVar5, (ho.a) L13, qVar4, 0);
                qVar2 = qVar4;
                qVar2.p(false);
            } else {
                qVar2 = qVar4;
                qVar2.X(-181027145);
                qVar2.p(false);
            }
            Object clearPlayerQueueConfirmation = Router$lambda$0(z0Var).getClearPlayerQueueConfirmation();
            if (clearPlayerQueueConfirmation instanceof ClearPlayerQueueConfirmation.Hidden) {
                qVar2.X(-180909035);
                qVar2.p(false);
                qVar3 = qVar2;
                obj = obj2;
                routerViewModel4 = routerViewModel3;
                c0Var4 = c0Var3;
                z0Var2 = z0Var;
                z12 = true;
                cVar = null;
            } else if (clearPlayerQueueConfirmation instanceof ClearPlayerQueueConfirmation.Shown) {
                qVar2.X(-180817988);
                ClearPlayerQueueConfirmation.Shown shown = (ClearPlayerQueueConfirmation.Shown) clearPlayerQueueConfirmation;
                String I2 = kj.c.I(R.plurals.player_clear_queue_confirmation_text_plurals, shown.getReadsRemaining(), new Object[]{Integer.valueOf(shown.getReadsRemaining())}, qVar2);
                String R = kj.c.R(qVar2, R.string.player_clear_queue_confirmation_play_now);
                String R2 = kj.c.R(qVar2, R.string.player_clear_queue_confirmation_keep_queue);
                boolean h17 = qVar2.h(routerViewModel3) | qVar2.h(clearPlayerQueueConfirmation);
                Object L14 = qVar2.L();
                if (h17 || L14 == obj2) {
                    L14 = new a2.q(routerViewModel3, shown, 16);
                    qVar2.h0(L14);
                }
                ho.a aVar6 = (ho.a) L14;
                boolean h18 = qVar2.h(clearPlayerQueueConfirmation) | qVar2.h(routerViewModel3) | qVar2.h(c0Var3);
                Object L15 = qVar2.L();
                if (h18 || L15 == obj2) {
                    L15 = new c3.b(routerViewModel3, shown, c0Var3, 6);
                    qVar2.h0(L15);
                }
                ho.a aVar7 = (ho.a) L15;
                u2.q qVar5 = qVar2;
                routerViewModel4 = routerViewModel3;
                z0Var2 = z0Var;
                c0Var4 = c0Var3;
                cVar = null;
                obj = obj2;
                z12 = true;
                ConfirmationDialogKt.ConfirmationDialog(aVar6, aVar7, null, I2, R2, R, false, qVar5, 1572864, 4);
                qVar3 = qVar5;
                qVar3.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(409804049, qVar2, false);
            }
            Destination pendingNavigation = Router$lambda$0(z0Var2).getPendingNavigation();
            boolean f12 = qVar3.f(z0Var2) | qVar3.h(c0Var4) | qVar3.h(routerViewModel4);
            Object L16 = qVar3.L();
            if (f12 || L16 == obj) {
                L16 = new RouterKt$Router$13$1(c0Var4, routerViewModel4, z0Var2, cVar);
                qVar3.h0(L16);
            }
            u2.r.f((ho.p) L16, pendingNavigation, qVar3);
            androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) qVar3.j(o7.e.f24864a);
            boolean h19 = qVar3.h(routerViewModel4) | qVar3.h(c0Var4) | qVar3.h(b0Var);
            Object L17 = qVar3.L();
            if (h19 || L17 == obj) {
                L17 = new RouterKt$Router$14$1(routerViewModel4, c0Var4, b0Var, cVar);
                qVar3.h0(L17);
            }
            u2.r.f((ho.p) L17, c0Var4, qVar3);
            q2 q2Var = (q2) qVar3.j(j1.f13138r);
            boolean h20 = qVar3.h(c0Var4) | qVar3.h(q2Var);
            Object L18 = qVar3.L();
            if (h20 || L18 == obj) {
                L18 = new k(c0Var4, q2Var, 6);
                qVar3.h0(L18);
            }
            ho.l lVar = (ho.l) L18;
            z0 z0Var4 = z0Var2;
            c0Var2 = c0Var4;
            routerViewModel2 = routerViewModel4;
            MessageBottomSheetOverlayKt.MessageBottomSheetOverlay(routerViewModel2, lVar, c3.k.d(562168277, z12, new x(c0Var4, routerViewModel4, d0Var, str3, cVar2, q2Var, z0Var4, I), qVar3), qVar3, ((i14 >> 3) & 14) | 384);
            qVar = qVar3;
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(Router$lambda$0(z0Var4).getShowLoading(), null, 0L, qVar, 0, 6);
        } else {
            c0Var2 = c0Var;
            routerViewModel2 = routerViewModel;
            qVar = qVar4;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(c0Var2, routerViewModel2, i10, 7);
        }
    }

    public static final RouterState Router$lambda$0(s2 s2Var) {
        return (RouterState) s2Var.getValue();
    }

    public static final sn.z Router$lambda$10$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.readsImportTextRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$11$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.readsPasteLinkRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$12$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.readsImportFileRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$13$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.readsImportOcrRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$14$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.paywallRoute$default(Routes.INSTANCE, ProductsService.PaywallSource.DEFAULT, Analytics.Event.PaywallSource.ImportSheet, (String) null, 4, (Object) null), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$15$0(RouterViewModel routerViewModel, ClearPlayerQueueConfirmation clearPlayerQueueConfirmation) {
        routerViewModel.hideClearPlayerQueueConfirmation((ClearPlayerQueueConfirmation.Shown) clearPlayerQueueConfirmation, Analytics.Event.PlayerQueueConfirmationClicked.Decision.Keep);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$16$0(RouterViewModel routerViewModel, ClearPlayerQueueConfirmation clearPlayerQueueConfirmation, na.c0 c0Var) {
        ClearPlayerQueueConfirmation.Shown shown = (ClearPlayerQueueConfirmation.Shown) clearPlayerQueueConfirmation;
        routerViewModel.hideClearPlayerQueueConfirmation(shown, Analytics.Event.PlayerQueueConfirmationClicked.Decision.ClearAndAdd);
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(shown.getReadId(), shown.getPlayerActivationSource().getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$19$0(na.c0 c0Var, q2 q2Var, String str) {
        str.getClass();
        if (!NavigationExtensions.INSTANCE.launchDeeplink(c0Var, str)) {
            q2Var.openUri(str);
        }
        return sn.z.f31622a;
    }

    public static final boolean Router$lambda$2(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final sn.z Router$lambda$20(na.c0 c0Var, RouterViewModel routerViewModel, fr.d0 d0Var, String str, h5.c cVar, q2 q2Var, s2 s2Var, List list, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i1.s2.a(null, c3.k.d(633034387, true, new o(c0Var, routerViewModel, d0Var, str, cVar, q2Var, s2Var, list, 0), qVar), qVar, 48);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0(na.c0 c0Var, RouterViewModel routerViewModel, fr.d0 d0Var, String str, h5.c cVar, q2 q2Var, s2 s2Var, List list, j2 j2Var, u2.m mVar, int i10) {
        j2 j2Var2;
        int i11;
        boolean z6;
        String str2;
        int i12;
        j2Var.getClass();
        if ((i10 & 6) == 0) {
            j2Var2 = j2Var;
            if (((u2.q) mVar).f(j2Var2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            j2Var2 = j2Var;
            i11 = i10;
        }
        boolean z10 = false;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            Boolean signedIn = Router$lambda$0(s2Var).getSignedIn();
            if (kotlin.jvm.internal.m.c(signedIn, Boolean.TRUE)) {
                str2 = Routes.RootRoutes.AUTHORIZED;
            } else if (kotlin.jvm.internal.m.c(signedIn, Boolean.FALSE)) {
                str2 = Routes.RootRoutes.ANONYMOUS;
            } else if (signedIn == null) {
                str2 = Routes.RootRoutes.SPLASH;
            } else {
                c6.p();
                return null;
            }
            String str3 = str2;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n(1);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n(2);
                qVar.h0(L2);
            }
            ho.l lVar2 = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new n(3);
                qVar.h0(L3);
            }
            ho.l lVar3 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new n(4);
                qVar.h0(L4);
            }
            ho.l lVar4 = (ho.l) L4;
            boolean h10 = qVar.h(routerViewModel) | qVar.h(d0Var) | qVar.f(str);
            if ((i11 & 14) == 4) {
                z10 = true;
            }
            boolean h11 = h10 | z10 | qVar.h(c0Var) | qVar.f(cVar) | qVar.h(q2Var);
            Object L5 = qVar.L();
            if (h11 || L5 == eVar) {
                io.elevenlabs.ocr.q qVar2 = new io.elevenlabs.ocr.q(str, c0Var, routerViewModel, list, cVar, d0Var, q2Var, j2Var2, 1);
                qVar.h0(qVar2);
                L5 = qVar2;
            }
            ec.t.f(c0Var, str3, null, null, lVar, lVar2, lVar3, lVar4, (ho.l) L5, qVar, 115015680);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$0$0(i1.q qVar) {
        qVar.getClass();
        return ((i1.x) qVar).e(0, j1.e.s(300, 0, null, 6), i1.e.f12733d);
    }

    public static final f1 Router$lambda$20$0$1$0(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeOut();
    }

    public static final d1 Router$lambda$20$0$2$0(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeIn();
    }

    public static final f1 Router$lambda$20$0$3$0(i1.q qVar) {
        qVar.getClass();
        return ((i1.x) qVar).f(1, j1.e.s(300, 0, null, 6), i1.e.f12734e);
    }

    public static final sn.z Router$lambda$20$0$4$0(String str, final na.c0 c0Var, final RouterViewModel routerViewModel, final List list, final h5.c cVar, final fr.d0 d0Var, final q2 q2Var, j2 j2Var, na.z zVar) {
        zVar.getClass();
        na.z zVar2 = new na.z(zVar.f24399f, str, Routes.RootRoutes.AUTHORIZED);
        ae.l.u(zVar2, Routes.authSplashRoute, null, null, new n(8), null, ComposableSingletons$RouterKt.INSTANCE.m1015getLambda$90396837$app_productionRelease(), 246);
        final int i10 = 10;
        ae.l.u(zVar2, Routes.onboardingRoute, null, null, new a0(5), null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
            @Override // ho.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                sn.z Router$lambda$20$0$4$0$0$132;
                sn.z Router$lambda$20$0$4$0$0$133;
                sn.z Router$lambda$20$0$4$0$0$134;
                sn.z Router$lambda$20$0$4$0$0$139;
                sn.z Router$lambda$20$0$4$0$0$142;
                sn.z Router$lambda$20$0$4$0$0$148;
                sn.z Router$lambda$20$0$4$0$0$151;
                sn.z Router$lambda$20$0$4$0$4;
                sn.z Router$lambda$20$0$4$0$0$25;
                sn.z Router$lambda$20$0$4$0$0$26;
                sn.z Router$lambda$20$0$4$0$0$4;
                switch (i10) {
                    case 0:
                        Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$132;
                    case 1:
                        Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$133;
                    case 2:
                        Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$134;
                    case 3:
                        Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$139;
                    case 4:
                        Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$142;
                    case 5:
                        Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$148;
                    case 6:
                        Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$151;
                    case 7:
                        Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$4;
                    case 8:
                        Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$25;
                    case 9:
                        Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$26;
                    default:
                        Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                        return Router$lambda$20$0$4$0$0$4;
                }
            }
        }, true, 603852242), 246);
        final int i11 = 0;
        ho.l lVar = new ho.l() { // from class: io.elevenlabs.readerapp.core.router.e
            @Override // ho.l
            public final Object invoke(Object obj) {
                d1 Router$lambda$20$0$4$0$0$5;
                f1 Router$lambda$20$0$4$0$0$6;
                d1 Router$lambda$20$0$4$0$0$12;
                d1 Router$lambda$20$0$4$0$0$115;
                f1 Router$lambda$20$0$4$0$0$116;
                f1 Router$lambda$20$0$4$0$0$13;
                d1 Router$lambda$20$0$4$0$0$19;
                f1 Router$lambda$20$0$4$0$0$20;
                switch (i11) {
                    case 0:
                        Router$lambda$20$0$4$0$0$5 = RouterKt.Router$lambda$20$0$4$0$0$5(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$5;
                    case 1:
                        Router$lambda$20$0$4$0$0$6 = RouterKt.Router$lambda$20$0$4$0$0$6(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$6;
                    case 2:
                        Router$lambda$20$0$4$0$0$12 = RouterKt.Router$lambda$20$0$4$0$0$12(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$12;
                    case 3:
                        Router$lambda$20$0$4$0$0$115 = RouterKt.Router$lambda$20$0$4$0$0$115(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$115;
                    case 4:
                        Router$lambda$20$0$4$0$0$116 = RouterKt.Router$lambda$20$0$4$0$0$116(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$116;
                    case 5:
                        Router$lambda$20$0$4$0$0$13 = RouterKt.Router$lambda$20$0$4$0$0$13(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$13;
                    case 6:
                        Router$lambda$20$0$4$0$0$19 = RouterKt.Router$lambda$20$0$4$0$0$19(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$19;
                    default:
                        Router$lambda$20$0$4$0$0$20 = RouterKt.Router$lambda$20$0$4$0$0$20(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$20;
                }
            }
        };
        final int i12 = 1;
        ae.l.u(zVar2, Routes.homeRoute, null, null, lVar, new ho.l() { // from class: io.elevenlabs.readerapp.core.router.e
            @Override // ho.l
            public final Object invoke(Object obj) {
                d1 Router$lambda$20$0$4$0$0$5;
                f1 Router$lambda$20$0$4$0$0$6;
                d1 Router$lambda$20$0$4$0$0$12;
                d1 Router$lambda$20$0$4$0$0$115;
                f1 Router$lambda$20$0$4$0$0$116;
                f1 Router$lambda$20$0$4$0$0$13;
                d1 Router$lambda$20$0$4$0$0$19;
                f1 Router$lambda$20$0$4$0$0$20;
                switch (i12) {
                    case 0:
                        Router$lambda$20$0$4$0$0$5 = RouterKt.Router$lambda$20$0$4$0$0$5(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$5;
                    case 1:
                        Router$lambda$20$0$4$0$0$6 = RouterKt.Router$lambda$20$0$4$0$0$6(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$6;
                    case 2:
                        Router$lambda$20$0$4$0$0$12 = RouterKt.Router$lambda$20$0$4$0$0$12(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$12;
                    case 3:
                        Router$lambda$20$0$4$0$0$115 = RouterKt.Router$lambda$20$0$4$0$0$115(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$115;
                    case 4:
                        Router$lambda$20$0$4$0$0$116 = RouterKt.Router$lambda$20$0$4$0$0$116(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$116;
                    case 5:
                        Router$lambda$20$0$4$0$0$13 = RouterKt.Router$lambda$20$0$4$0$0$13(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$13;
                    case 6:
                        Router$lambda$20$0$4$0$0$19 = RouterKt.Router$lambda$20$0$4$0$0$19(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$19;
                    default:
                        Router$lambda$20$0$4$0$0$20 = RouterKt.Router$lambda$20$0$4$0$0$20(list, cVar, (i1.q) obj);
                        return Router$lambda$20$0$4$0$0$20;
                }
            }
        }, new c3.j(new i(routerViewModel, c0Var, d0Var, q2Var, j2Var), true, 1436782803), 230);
        na.i iVar = new na.i();
        Router$lambda$20$0$4$0$0$8(iVar);
        na.g gVar = iVar.f24327a;
        na.d dVar = gVar.f24309a;
        na.d dVar2 = na.h0.f24325e;
        if (dVar == null) {
            dVar = dVar2;
        }
        na.f fVar = new na.f("sortBy", new na.h(dVar, gVar.f24310b, gVar.f24311c));
        na.i iVar2 = new na.i();
        Router$lambda$20$0$4$0$0$9(iVar2);
        na.g gVar2 = iVar2.f24327a;
        na.d dVar3 = gVar2.f24309a;
        if (dVar3 == null) {
            dVar3 = dVar2;
        }
        List I = ig.f.I(fVar, new na.f("pageId", new na.h(dVar3, gVar2.f24310b, gVar2.f24311c)));
        na.v vVar = new na.v();
        Router$lambda$20$0$4$0$0$10(vVar);
        String str2 = vVar.f24386b;
        if (str2 != null) {
            com.google.gson.internal.e eVar = vVar.f24385a;
            eVar.f6913b = str2;
            na.t a10 = eVar.a();
            na.v vVar2 = new na.v();
            Router$lambda$20$0$4$0$0$11(vVar2);
            String str3 = vVar2.f24386b;
            if (str3 != null) {
                com.google.gson.internal.e eVar2 = vVar2.f24385a;
                eVar2.f6913b = str3;
                List I2 = ig.f.I(a10, eVar2.a());
                final int i13 = 2;
                ho.l lVar2 = new ho.l() { // from class: io.elevenlabs.readerapp.core.router.e
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        d1 Router$lambda$20$0$4$0$0$5;
                        f1 Router$lambda$20$0$4$0$0$6;
                        d1 Router$lambda$20$0$4$0$0$12;
                        d1 Router$lambda$20$0$4$0$0$115;
                        f1 Router$lambda$20$0$4$0$0$116;
                        f1 Router$lambda$20$0$4$0$0$13;
                        d1 Router$lambda$20$0$4$0$0$19;
                        f1 Router$lambda$20$0$4$0$0$20;
                        switch (i13) {
                            case 0:
                                Router$lambda$20$0$4$0$0$5 = RouterKt.Router$lambda$20$0$4$0$0$5(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$5;
                            case 1:
                                Router$lambda$20$0$4$0$0$6 = RouterKt.Router$lambda$20$0$4$0$0$6(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$6;
                            case 2:
                                Router$lambda$20$0$4$0$0$12 = RouterKt.Router$lambda$20$0$4$0$0$12(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$12;
                            case 3:
                                Router$lambda$20$0$4$0$0$115 = RouterKt.Router$lambda$20$0$4$0$0$115(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$115;
                            case 4:
                                Router$lambda$20$0$4$0$0$116 = RouterKt.Router$lambda$20$0$4$0$0$116(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$116;
                            case 5:
                                Router$lambda$20$0$4$0$0$13 = RouterKt.Router$lambda$20$0$4$0$0$13(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$13;
                            case 6:
                                Router$lambda$20$0$4$0$0$19 = RouterKt.Router$lambda$20$0$4$0$0$19(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$19;
                            default:
                                Router$lambda$20$0$4$0$0$20 = RouterKt.Router$lambda$20$0$4$0$0$20(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$20;
                        }
                    }
                };
                final int i14 = 5;
                ae.l.u(zVar2, Routes.libraryPattern, I, I2, lVar2, new ho.l() { // from class: io.elevenlabs.readerapp.core.router.e
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        d1 Router$lambda$20$0$4$0$0$5;
                        f1 Router$lambda$20$0$4$0$0$6;
                        d1 Router$lambda$20$0$4$0$0$12;
                        d1 Router$lambda$20$0$4$0$0$115;
                        f1 Router$lambda$20$0$4$0$0$116;
                        f1 Router$lambda$20$0$4$0$0$13;
                        d1 Router$lambda$20$0$4$0$0$19;
                        f1 Router$lambda$20$0$4$0$0$20;
                        switch (i14) {
                            case 0:
                                Router$lambda$20$0$4$0$0$5 = RouterKt.Router$lambda$20$0$4$0$0$5(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$5;
                            case 1:
                                Router$lambda$20$0$4$0$0$6 = RouterKt.Router$lambda$20$0$4$0$0$6(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$6;
                            case 2:
                                Router$lambda$20$0$4$0$0$12 = RouterKt.Router$lambda$20$0$4$0$0$12(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$12;
                            case 3:
                                Router$lambda$20$0$4$0$0$115 = RouterKt.Router$lambda$20$0$4$0$0$115(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$115;
                            case 4:
                                Router$lambda$20$0$4$0$0$116 = RouterKt.Router$lambda$20$0$4$0$0$116(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$116;
                            case 5:
                                Router$lambda$20$0$4$0$0$13 = RouterKt.Router$lambda$20$0$4$0$0$13(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$13;
                            case 6:
                                Router$lambda$20$0$4$0$0$19 = RouterKt.Router$lambda$20$0$4$0$0$19(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$19;
                            default:
                                Router$lambda$20$0$4$0$0$20 = RouterKt.Router$lambda$20$0$4$0$0$20(list, cVar, (i1.q) obj);
                                return Router$lambda$20$0$4$0$0$20;
                        }
                    }
                }, new c3.j(new g(d0Var, routerViewModel, c0Var, j2Var), true, -2025253932), 224);
                Routes routes = Routes.INSTANCE;
                ae.l.u(zVar2, routes.searchRoute("{corpus}"), null, null, new n(25), new a0(2), new c3.j(new i(c0Var, d0Var, routerViewModel, q2Var, j2Var), true, -1192323371), 230);
                na.v vVar3 = new na.v();
                Router$lambda$20$0$4$0$0$18(vVar3);
                String str4 = vVar3.f24386b;
                if (str4 != null) {
                    com.google.gson.internal.e eVar3 = vVar3.f24385a;
                    eVar3.f6913b = str4;
                    List H = ig.f.H(eVar3.a());
                    final int i15 = 6;
                    ho.l lVar3 = new ho.l() { // from class: io.elevenlabs.readerapp.core.router.e
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            d1 Router$lambda$20$0$4$0$0$5;
                            f1 Router$lambda$20$0$4$0$0$6;
                            d1 Router$lambda$20$0$4$0$0$12;
                            d1 Router$lambda$20$0$4$0$0$115;
                            f1 Router$lambda$20$0$4$0$0$116;
                            f1 Router$lambda$20$0$4$0$0$13;
                            d1 Router$lambda$20$0$4$0$0$19;
                            f1 Router$lambda$20$0$4$0$0$20;
                            switch (i15) {
                                case 0:
                                    Router$lambda$20$0$4$0$0$5 = RouterKt.Router$lambda$20$0$4$0$0$5(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$5;
                                case 1:
                                    Router$lambda$20$0$4$0$0$6 = RouterKt.Router$lambda$20$0$4$0$0$6(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$6;
                                case 2:
                                    Router$lambda$20$0$4$0$0$12 = RouterKt.Router$lambda$20$0$4$0$0$12(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$12;
                                case 3:
                                    Router$lambda$20$0$4$0$0$115 = RouterKt.Router$lambda$20$0$4$0$0$115(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$115;
                                case 4:
                                    Router$lambda$20$0$4$0$0$116 = RouterKt.Router$lambda$20$0$4$0$0$116(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$116;
                                case 5:
                                    Router$lambda$20$0$4$0$0$13 = RouterKt.Router$lambda$20$0$4$0$0$13(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$13;
                                case 6:
                                    Router$lambda$20$0$4$0$0$19 = RouterKt.Router$lambda$20$0$4$0$0$19(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$19;
                                default:
                                    Router$lambda$20$0$4$0$0$20 = RouterKt.Router$lambda$20$0$4$0$0$20(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$20;
                            }
                        }
                    };
                    final int i16 = 7;
                    ae.l.u(zVar2, Routes.exploreRoute, null, H, lVar3, new ho.l() { // from class: io.elevenlabs.readerapp.core.router.e
                        @Override // ho.l
                        public final Object invoke(Object obj) {
                            d1 Router$lambda$20$0$4$0$0$5;
                            f1 Router$lambda$20$0$4$0$0$6;
                            d1 Router$lambda$20$0$4$0$0$12;
                            d1 Router$lambda$20$0$4$0$0$115;
                            f1 Router$lambda$20$0$4$0$0$116;
                            f1 Router$lambda$20$0$4$0$0$13;
                            d1 Router$lambda$20$0$4$0$0$19;
                            f1 Router$lambda$20$0$4$0$0$20;
                            switch (i16) {
                                case 0:
                                    Router$lambda$20$0$4$0$0$5 = RouterKt.Router$lambda$20$0$4$0$0$5(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$5;
                                case 1:
                                    Router$lambda$20$0$4$0$0$6 = RouterKt.Router$lambda$20$0$4$0$0$6(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$6;
                                case 2:
                                    Router$lambda$20$0$4$0$0$12 = RouterKt.Router$lambda$20$0$4$0$0$12(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$12;
                                case 3:
                                    Router$lambda$20$0$4$0$0$115 = RouterKt.Router$lambda$20$0$4$0$0$115(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$115;
                                case 4:
                                    Router$lambda$20$0$4$0$0$116 = RouterKt.Router$lambda$20$0$4$0$0$116(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$116;
                                case 5:
                                    Router$lambda$20$0$4$0$0$13 = RouterKt.Router$lambda$20$0$4$0$0$13(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$13;
                                case 6:
                                    Router$lambda$20$0$4$0$0$19 = RouterKt.Router$lambda$20$0$4$0$0$19(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$19;
                                default:
                                    Router$lambda$20$0$4$0$0$20 = RouterKt.Router$lambda$20$0$4$0$0$20(list, cVar, (i1.q) obj);
                                    return Router$lambda$20$0$4$0$0$20;
                            }
                        }
                    }, new c3.j(new g(c0Var, q2Var, j2Var, routerViewModel), true, -359392810), 226);
                    String libraryCollectionRoute = routes.libraryCollectionRoute("{id}");
                    na.v vVar4 = new na.v();
                    Router$lambda$20$0$4$0$0$22(vVar4);
                    String str5 = vVar4.f24386b;
                    if (str5 != null) {
                        com.google.gson.internal.e eVar4 = vVar4.f24385a;
                        eVar4.f6913b = str5;
                        final int i17 = 1;
                        ae.l.u(zVar2, libraryCollectionRoute, null, ig.f.H(eVar4.a()), null, null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.d
                            @Override // ho.r
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                sn.z Router$lambda$20$0$4$0$0$35;
                                sn.z Router$lambda$20$0$4$0$0$23;
                                switch (i17) {
                                    case 0:
                                        int intValue = ((Integer) obj4).intValue();
                                        Router$lambda$20$0$4$0$0$35 = RouterKt.Router$lambda$20$0$4$0$0$35(c0Var, d0Var, routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue);
                                        return Router$lambda$20$0$4$0$0$35;
                                    default:
                                        int intValue2 = ((Integer) obj4).intValue();
                                        Router$lambda$20$0$4$0$0$23 = RouterKt.Router$lambda$20$0$4$0$0$23(c0Var, d0Var, routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue2);
                                        return Router$lambda$20$0$4$0$0$23;
                                }
                            }
                        }, true, 473537751), 250);
                        String exploreCollectionRoute = routes.exploreCollectionRoute("{id}");
                        na.v vVar5 = new na.v();
                        Router$lambda$20$0$4$0$0$24(vVar5);
                        String str6 = vVar5.f24386b;
                        if (str6 != null) {
                            com.google.gson.internal.e eVar5 = vVar5.f24385a;
                            eVar5.f6913b = str6;
                            final int i18 = 8;
                            ae.l.u(zVar2, exploreCollectionRoute, null, ig.f.H(eVar5.a()), null, null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                @Override // ho.r
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    sn.z Router$lambda$20$0$4$0$0$132;
                                    sn.z Router$lambda$20$0$4$0$0$133;
                                    sn.z Router$lambda$20$0$4$0$0$134;
                                    sn.z Router$lambda$20$0$4$0$0$139;
                                    sn.z Router$lambda$20$0$4$0$0$142;
                                    sn.z Router$lambda$20$0$4$0$0$148;
                                    sn.z Router$lambda$20$0$4$0$0$151;
                                    sn.z Router$lambda$20$0$4$0$4;
                                    sn.z Router$lambda$20$0$4$0$0$25;
                                    sn.z Router$lambda$20$0$4$0$0$26;
                                    sn.z Router$lambda$20$0$4$0$0$4;
                                    switch (i18) {
                                        case 0:
                                            Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$132;
                                        case 1:
                                            Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$133;
                                        case 2:
                                            Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$134;
                                        case 3:
                                            Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$139;
                                        case 4:
                                            Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$142;
                                        case 5:
                                            Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$148;
                                        case 6:
                                            Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$151;
                                        case 7:
                                            Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$4;
                                        case 8:
                                            Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$25;
                                        case 9:
                                            Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$26;
                                        default:
                                            Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$4;
                                    }
                                }
                            }, true, 1306468312), 250);
                            final int i19 = 9;
                            ae.l.u(zVar2, routes.collectionAddReadsRoute("{id}"), null, null, null, null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                @Override // ho.r
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    sn.z Router$lambda$20$0$4$0$0$132;
                                    sn.z Router$lambda$20$0$4$0$0$133;
                                    sn.z Router$lambda$20$0$4$0$0$134;
                                    sn.z Router$lambda$20$0$4$0$0$139;
                                    sn.z Router$lambda$20$0$4$0$0$142;
                                    sn.z Router$lambda$20$0$4$0$0$148;
                                    sn.z Router$lambda$20$0$4$0$0$151;
                                    sn.z Router$lambda$20$0$4$0$4;
                                    sn.z Router$lambda$20$0$4$0$0$25;
                                    sn.z Router$lambda$20$0$4$0$0$26;
                                    sn.z Router$lambda$20$0$4$0$0$4;
                                    switch (i19) {
                                        case 0:
                                            Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$132;
                                        case 1:
                                            Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$133;
                                        case 2:
                                            Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$134;
                                        case 3:
                                            Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$139;
                                        case 4:
                                            Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$142;
                                        case 5:
                                            Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$148;
                                        case 6:
                                            Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$151;
                                        case 7:
                                            Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$4;
                                        case 8:
                                            Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$25;
                                        case 9:
                                            Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$26;
                                        default:
                                            Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                            return Router$lambda$20$0$4$0$0$4;
                                    }
                                }
                            }, true, 2139398873), 254);
                            ae.l.u(zVar2, routes.editCollectionRoute("{id}"), null, null, new a0(6), new a0(7), new c3.j(new c(c0Var, 0), true, -1322637862), 230);
                            String authorProfile = routes.authorProfile("{id}");
                            na.v vVar6 = new na.v();
                            Router$lambda$20$0$4$0$0$30(vVar6);
                            String str7 = vVar6.f24386b;
                            if (str7 != null) {
                                com.google.gson.internal.e eVar6 = vVar6.f24385a;
                                eVar6.f6913b = str7;
                                ae.l.u(zVar2, authorProfile, null, ig.f.H(eVar6.a()), null, null, new c3.j(new c(c0Var, 1), true, -1137538618), 250);
                                String voiceDetails = routes.voiceDetails("{id}");
                                na.v vVar7 = new na.v();
                                Router$lambda$20$0$4$0$0$32(vVar7);
                                String str8 = vVar7.f24386b;
                                if (str8 != null) {
                                    com.google.gson.internal.e eVar7 = vVar7.f24385a;
                                    eVar7.f6913b = str8;
                                    final int i20 = 0;
                                    ae.l.u(zVar2, voiceDetails, null, ig.f.H(eVar7.a()), new b0(8), new b0(9), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.d
                                        @Override // ho.r
                                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                            sn.z Router$lambda$20$0$4$0$0$35;
                                            sn.z Router$lambda$20$0$4$0$0$23;
                                            switch (i20) {
                                                case 0:
                                                    int intValue = ((Integer) obj4).intValue();
                                                    Router$lambda$20$0$4$0$0$35 = RouterKt.Router$lambda$20$0$4$0$0$35(c0Var, d0Var, routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue);
                                                    return Router$lambda$20$0$4$0$0$35;
                                                default:
                                                    int intValue2 = ((Integer) obj4).intValue();
                                                    Router$lambda$20$0$4$0$0$23 = RouterKt.Router$lambda$20$0$4$0$0$23(c0Var, d0Var, routerViewModel, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue2);
                                                    return Router$lambda$20$0$4$0$0$23;
                                            }
                                        }
                                    }, true, -304608057), 226);
                                    String askSupportAgent = routes.getAskSupportAgent();
                                    na.v vVar8 = new na.v();
                                    Router$lambda$20$0$4$0$0$36(vVar8);
                                    String str9 = vVar8.f24386b;
                                    if (str9 != null) {
                                        com.google.gson.internal.e eVar8 = vVar8.f24385a;
                                        eVar8.f6913b = str9;
                                        ae.l.u(zVar2, askSupportAgent, null, ig.f.H(eVar8.a()), new b0(10), new b0(11), new c3.j(new c(c0Var, 2), true, 528322504), 226);
                                        String readDetails = routes.readDetails("{id}");
                                        na.v vVar9 = new na.v();
                                        Router$lambda$20$0$4$0$0$40(vVar9);
                                        String str10 = vVar9.f24386b;
                                        if (str10 != null) {
                                            com.google.gson.internal.e eVar9 = vVar9.f24385a;
                                            eVar9.f6913b = str10;
                                            na.t a11 = eVar9.a();
                                            na.v vVar10 = new na.v();
                                            Router$lambda$20$0$4$0$0$41(vVar10);
                                            String str11 = vVar10.f24386b;
                                            if (str11 != null) {
                                                com.google.gson.internal.e eVar10 = vVar10.f24385a;
                                                eVar10.f6913b = str11;
                                                na.t a12 = eVar10.a();
                                                na.v vVar11 = new na.v();
                                                Router$lambda$20$0$4$0$0$42(vVar11);
                                                String str12 = vVar11.f24386b;
                                                if (str12 != null) {
                                                    com.google.gson.internal.e eVar11 = vVar11.f24385a;
                                                    eVar11.f6913b = str12;
                                                    na.t a13 = eVar11.a();
                                                    na.v vVar12 = new na.v();
                                                    Router$lambda$20$0$4$0$0$43(vVar12);
                                                    String str13 = vVar12.f24386b;
                                                    if (str13 != null) {
                                                        com.google.gson.internal.e eVar12 = vVar12.f24385a;
                                                        eVar12.f6913b = str13;
                                                        na.t a14 = eVar12.a();
                                                        na.v vVar13 = new na.v();
                                                        Router$lambda$20$0$4$0$0$44(vVar13);
                                                        String str14 = vVar13.f24386b;
                                                        if (str14 != null) {
                                                            com.google.gson.internal.e eVar13 = vVar13.f24385a;
                                                            eVar13.f6913b = str14;
                                                            ae.l.u(zVar2, readDetails, null, ig.f.I(a11, a12, a13, a14, eVar13.a()), null, null, new c3.j(new g(c0Var, d0Var, routerViewModel, q2Var, 0), true, 1361253065), 250);
                                                            na.v vVar14 = new na.v();
                                                            Router$lambda$20$0$4$0$0$46(vVar14);
                                                            String str15 = vVar14.f24386b;
                                                            if (str15 != null) {
                                                                com.google.gson.internal.e eVar14 = vVar14.f24385a;
                                                                eVar14.f6913b = str15;
                                                                ae.l.u(zVar2, Routes.settingsRoute, null, ig.f.H(eVar14.a()), new b0(12), new b0(13), new c3.j(new io.elevenlabs.readerapp.core.h(c0Var, q2Var, routerViewModel, 2), true, -2100783670), 226);
                                                                ae.l.u(zVar2, Routes.settingsDeleteAccountRoute, null, null, null, null, new c3.j(new c(c0Var, 3), true, -1267853109), 254);
                                                                na.i iVar3 = new na.i();
                                                                Router$lambda$20$0$4$0$0$51(iVar3);
                                                                na.g gVar3 = iVar3.f24327a;
                                                                na.d dVar4 = gVar3.f24309a;
                                                                if (dVar4 == null) {
                                                                    dVar4 = dVar2;
                                                                }
                                                                ae.l.u(zVar2, Routes.purchaseCreditsRoutePattern, ig.f.H(new na.f("context", new na.h(dVar4, gVar3.f24310b, gVar3.f24311c))), null, null, null, new c3.j(new c(c0Var, 4), true, -434922548), 252);
                                                                na.v vVar15 = new na.v();
                                                                Router$lambda$20$0$4$0$0$53(vVar15);
                                                                String str16 = vVar15.f24386b;
                                                                if (str16 != null) {
                                                                    com.google.gson.internal.e eVar15 = vVar15.f24385a;
                                                                    eVar15.f6913b = str16;
                                                                    ae.l.u(zVar2, Routes.hoursHistoryRoute, null, ig.f.H(eVar15.a()), null, null, new c3.j(new c(c0Var, 5), true, 398008013), 250);
                                                                    na.v vVar16 = new na.v();
                                                                    Router$lambda$20$0$4$0$0$55(vVar16);
                                                                    String str17 = vVar16.f24386b;
                                                                    if (str17 != null) {
                                                                        com.google.gson.internal.e eVar16 = vVar16.f24385a;
                                                                        eVar16.f6913b = str17;
                                                                        ae.l.u(zVar2, Routes.bookPurchasesRoute, null, ig.f.H(eVar16.a()), null, null, new c3.j(new c(c0Var, 6), true, 1230938574), 250);
                                                                        ae.l.u(zVar2, routes.bookRefundRoute("{readId}"), null, null, null, null, new c3.j(new c(c0Var, 7), true, 2063869135), 254);
                                                                        String paywallRoute = routes.paywallRoute("{productsSource}", "{analyticsSource}", "{defaultProductId}");
                                                                        na.v vVar17 = new na.v();
                                                                        Router$lambda$20$0$4$0$0$58(vVar17);
                                                                        String str18 = vVar17.f24386b;
                                                                        if (str18 != null) {
                                                                            com.google.gson.internal.e eVar17 = vVar17.f24385a;
                                                                            eVar17.f6913b = str18;
                                                                            ae.l.u(zVar2, paywallRoute, null, ig.f.H(eVar17.a()), new b0(14), new b0(15), new c3.j(new c(c0Var, 8), true, -1086495003), 226);
                                                                            na.v vVar18 = new na.v();
                                                                            Router$lambda$20$0$4$0$0$62(vVar18);
                                                                            String str19 = vVar18.f24386b;
                                                                            if (str19 != null) {
                                                                                com.google.gson.internal.e eVar18 = vVar18.f24385a;
                                                                                eVar18.f6913b = str19;
                                                                                ae.l.u(zVar2, Routes.winBackPaywallRoute, null, ig.f.H(eVar18.a()), new b0(16), new b0(17), new c3.j(new c(c0Var, 9), true, -253564442), 226);
                                                                                na.v vVar19 = new na.v();
                                                                                Router$lambda$20$0$4$0$0$66(vVar19);
                                                                                String str20 = vVar19.f24386b;
                                                                                if (str20 != null) {
                                                                                    com.google.gson.internal.e eVar19 = vVar19.f24385a;
                                                                                    eVar19.f6913b = str20;
                                                                                    ae.l.u(zVar2, Routes.lowCreditsRoute, null, ig.f.H(eVar19.a()), new b0(18), new b0(19), new c3.j(new c(c0Var, 10), true, 579366119), 226);
                                                                                    ae.l.u(zVar2, Routes.settingsPlayerPreferencesRoute, null, null, new b0(20), new b0(21), new c3.j(new c(c0Var, 11), true, 1412296680), 230);
                                                                                    na.v vVar20 = new na.v();
                                                                                    Router$lambda$20$0$4$0$0$73(vVar20);
                                                                                    String str21 = vVar20.f24386b;
                                                                                    if (str21 != null) {
                                                                                        com.google.gson.internal.e eVar20 = vVar20.f24385a;
                                                                                        eVar20.f6913b = str21;
                                                                                        ae.l.u(zVar2, Routes.referFriendRoute, null, ig.f.H(eVar20.a()), new b0(22), new b0(23), new c3.j(new c(c0Var, 12), true, -2049740055), 226);
                                                                                        ae.l.u(zVar2, Routes.settingsExploreLanguageRoute, null, null, null, null, new c3.j(new c(c0Var, 13), true, -1216809494), 254);
                                                                                        na.v vVar21 = new na.v();
                                                                                        Router$lambda$20$0$4$0$0$78(vVar21);
                                                                                        String str22 = vVar21.f24386b;
                                                                                        if (str22 != null) {
                                                                                            com.google.gson.internal.e eVar21 = vVar21.f24385a;
                                                                                            eVar21.f6913b = str22;
                                                                                            ae.l.u(zVar2, Routes.useReferralRoute, null, ig.f.H(eVar21.a()), new b0(24), new b0(25), new c3.j(new c(c0Var, 14), true, -383878933), 226);
                                                                                            ae.l.u(zVar2, Routes.settingsLicensesRoute, null, null, null, null, new c3.j(new c(c0Var, 15), true, 449051628), 254);
                                                                                            ae.l.u(zVar2, Routes.settingsContentPreferencesRoute, null, null, null, null, new c3.j(new c(c0Var, 16), true, 1281982189), 254);
                                                                                            ae.l.u(zVar2, Routes.settingsManageContentInterestsRoute, null, null, null, null, new c3.j(new c(c0Var, 17), true, 2114912750), 254);
                                                                                            ae.l.u(zVar2, Routes.settingsManagePurchasesRoute, null, null, null, null, new c3.j(new c(c0Var, 18), true, -1035451388), 254);
                                                                                            na.v vVar22 = new na.v();
                                                                                            Router$lambda$20$0$4$0$0$86(vVar22);
                                                                                            String str23 = vVar22.f24386b;
                                                                                            if (str23 != null) {
                                                                                                com.google.gson.internal.e eVar22 = vVar22.f24385a;
                                                                                                eVar22.f6913b = str23;
                                                                                                final int i21 = 0;
                                                                                                ae.l.u(zVar2, Routes.readsImportTextRoute, null, ig.f.H(eVar22.a()), null, null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.j
                                                                                                    @Override // ho.r
                                                                                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                        sn.z Router$lambda$20$0$4$0$0$87;
                                                                                                        sn.z Router$lambda$20$0$4$0$0$89;
                                                                                                        sn.z Router$lambda$20$0$4$0$0$96;
                                                                                                        sn.z Router$lambda$20$0$4$0$0$136;
                                                                                                        switch (i21) {
                                                                                                            case 0:
                                                                                                                int intValue = ((Integer) obj4).intValue();
                                                                                                                Router$lambda$20$0$4$0$0$87 = RouterKt.Router$lambda$20$0$4$0$0$87(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue);
                                                                                                                return Router$lambda$20$0$4$0$0$87;
                                                                                                            case 1:
                                                                                                                int intValue2 = ((Integer) obj4).intValue();
                                                                                                                Router$lambda$20$0$4$0$0$89 = RouterKt.Router$lambda$20$0$4$0$0$89(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue2);
                                                                                                                return Router$lambda$20$0$4$0$0$89;
                                                                                                            case 2:
                                                                                                                int intValue3 = ((Integer) obj4).intValue();
                                                                                                                Router$lambda$20$0$4$0$0$96 = RouterKt.Router$lambda$20$0$4$0$0$96(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue3);
                                                                                                                return Router$lambda$20$0$4$0$0$96;
                                                                                                            default:
                                                                                                                int intValue4 = ((Integer) obj4).intValue();
                                                                                                                Router$lambda$20$0$4$0$0$136 = RouterKt.Router$lambda$20$0$4$0$0$136(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue4);
                                                                                                                return Router$lambda$20$0$4$0$0$136;
                                                                                                        }
                                                                                                    }
                                                                                                }, true, -202520827), 250);
                                                                                                na.v vVar23 = new na.v();
                                                                                                Router$lambda$20$0$4$0$0$88(vVar23);
                                                                                                String str24 = vVar23.f24386b;
                                                                                                if (str24 != null) {
                                                                                                    com.google.gson.internal.e eVar23 = vVar23.f24385a;
                                                                                                    eVar23.f6913b = str24;
                                                                                                    final int i22 = 1;
                                                                                                    ae.l.u(zVar2, Routes.readsImportOcrRoute, null, ig.f.H(eVar23.a()), null, null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.j
                                                                                                        @Override // ho.r
                                                                                                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                            sn.z Router$lambda$20$0$4$0$0$87;
                                                                                                            sn.z Router$lambda$20$0$4$0$0$89;
                                                                                                            sn.z Router$lambda$20$0$4$0$0$96;
                                                                                                            sn.z Router$lambda$20$0$4$0$0$136;
                                                                                                            switch (i22) {
                                                                                                                case 0:
                                                                                                                    int intValue = ((Integer) obj4).intValue();
                                                                                                                    Router$lambda$20$0$4$0$0$87 = RouterKt.Router$lambda$20$0$4$0$0$87(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue);
                                                                                                                    return Router$lambda$20$0$4$0$0$87;
                                                                                                                case 1:
                                                                                                                    int intValue2 = ((Integer) obj4).intValue();
                                                                                                                    Router$lambda$20$0$4$0$0$89 = RouterKt.Router$lambda$20$0$4$0$0$89(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue2);
                                                                                                                    return Router$lambda$20$0$4$0$0$89;
                                                                                                                case 2:
                                                                                                                    int intValue3 = ((Integer) obj4).intValue();
                                                                                                                    Router$lambda$20$0$4$0$0$96 = RouterKt.Router$lambda$20$0$4$0$0$96(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue3);
                                                                                                                    return Router$lambda$20$0$4$0$0$96;
                                                                                                                default:
                                                                                                                    int intValue4 = ((Integer) obj4).intValue();
                                                                                                                    Router$lambda$20$0$4$0$0$136 = RouterKt.Router$lambda$20$0$4$0$0$136(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue4);
                                                                                                                    return Router$lambda$20$0$4$0$0$136;
                                                                                                            }
                                                                                                        }
                                                                                                    }, true, 630409734), 250);
                                                                                                    na.v vVar24 = new na.v();
                                                                                                    Router$lambda$20$0$4$0$0$90(vVar24);
                                                                                                    String str25 = vVar24.f24386b;
                                                                                                    if (str25 != null) {
                                                                                                        com.google.gson.internal.e eVar24 = vVar24.f24385a;
                                                                                                        eVar24.f6913b = str25;
                                                                                                        ae.l.u(zVar2, Routes.readsPasteLinkRoute, null, ig.f.H(eVar24.a()), null, null, new c3.j(new c(c0Var, 19), true, 1463340295), 250);
                                                                                                        ae.l.u(zVar2, routes.readsImportLinkRoute("{url}", false), null, null, null, null, new c3.j(new c(c0Var, 20), true, -1998696440), 254);
                                                                                                        na.v vVar25 = new na.v();
                                                                                                        Router$lambda$20$0$4$0$0$93(vVar25);
                                                                                                        String str26 = vVar25.f24386b;
                                                                                                        if (str26 != null) {
                                                                                                            com.google.gson.internal.e eVar25 = vVar25.f24385a;
                                                                                                            eVar25.f6913b = str26;
                                                                                                            final int i23 = 2;
                                                                                                            ae.l.u(zVar2, Routes.readsImportFileRoute, null, ig.f.H(eVar25.a()), new b0(26), new b0(27), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.j
                                                                                                                @Override // ho.r
                                                                                                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                    sn.z Router$lambda$20$0$4$0$0$87;
                                                                                                                    sn.z Router$lambda$20$0$4$0$0$89;
                                                                                                                    sn.z Router$lambda$20$0$4$0$0$96;
                                                                                                                    sn.z Router$lambda$20$0$4$0$0$136;
                                                                                                                    switch (i23) {
                                                                                                                        case 0:
                                                                                                                            int intValue = ((Integer) obj4).intValue();
                                                                                                                            Router$lambda$20$0$4$0$0$87 = RouterKt.Router$lambda$20$0$4$0$0$87(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue);
                                                                                                                            return Router$lambda$20$0$4$0$0$87;
                                                                                                                        case 1:
                                                                                                                            int intValue2 = ((Integer) obj4).intValue();
                                                                                                                            Router$lambda$20$0$4$0$0$89 = RouterKt.Router$lambda$20$0$4$0$0$89(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue2);
                                                                                                                            return Router$lambda$20$0$4$0$0$89;
                                                                                                                        case 2:
                                                                                                                            int intValue3 = ((Integer) obj4).intValue();
                                                                                                                            Router$lambda$20$0$4$0$0$96 = RouterKt.Router$lambda$20$0$4$0$0$96(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue3);
                                                                                                                            return Router$lambda$20$0$4$0$0$96;
                                                                                                                        default:
                                                                                                                            int intValue4 = ((Integer) obj4).intValue();
                                                                                                                            Router$lambda$20$0$4$0$0$136 = RouterKt.Router$lambda$20$0$4$0$0$136(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue4);
                                                                                                                            return Router$lambda$20$0$4$0$0$136;
                                                                                                                    }
                                                                                                                }
                                                                                                            }, true, -1165765879), 226);
                                                                                                            ae.l.u(zVar2, routes.addSharedReadRoute("{ownerId}", "{readId}"), null, null, new b0(28), new b0(29), new c3.j(new c(c0Var, 21), true, -332835318), 230);
                                                                                                            String playerRoute = routes.playerRoute("{id}", "{activationSource}");
                                                                                                            na.v vVar26 = new na.v();
                                                                                                            Router$lambda$20$0$4$0$0$100(vVar26);
                                                                                                            String str27 = vVar26.f24386b;
                                                                                                            if (str27 != null) {
                                                                                                                com.google.gson.internal.e eVar26 = vVar26.f24385a;
                                                                                                                eVar26.f6913b = str27;
                                                                                                                na.t a15 = eVar26.a();
                                                                                                                na.v vVar27 = new na.v();
                                                                                                                Router$lambda$20$0$4$0$0$101(vVar27);
                                                                                                                String str28 = vVar27.f24386b;
                                                                                                                if (str28 != null) {
                                                                                                                    com.google.gson.internal.e eVar27 = vVar27.f24385a;
                                                                                                                    eVar27.f6913b = str28;
                                                                                                                    na.t a16 = eVar27.a();
                                                                                                                    na.v vVar28 = new na.v();
                                                                                                                    Router$lambda$20$0$4$0$0$102(vVar28);
                                                                                                                    String str29 = vVar28.f24386b;
                                                                                                                    if (str29 != null) {
                                                                                                                        com.google.gson.internal.e eVar28 = vVar28.f24385a;
                                                                                                                        eVar28.f6913b = str29;
                                                                                                                        na.t a17 = eVar28.a();
                                                                                                                        na.v vVar29 = new na.v();
                                                                                                                        Router$lambda$20$0$4$0$0$103(vVar29);
                                                                                                                        String str30 = vVar29.f24386b;
                                                                                                                        if (str30 != null) {
                                                                                                                            com.google.gson.internal.e eVar29 = vVar29.f24385a;
                                                                                                                            eVar29.f6913b = str30;
                                                                                                                            na.t a18 = eVar29.a();
                                                                                                                            na.v vVar30 = new na.v();
                                                                                                                            Router$lambda$20$0$4$0$0$104(vVar30);
                                                                                                                            String str31 = vVar30.f24386b;
                                                                                                                            if (str31 != null) {
                                                                                                                                com.google.gson.internal.e eVar30 = vVar30.f24385a;
                                                                                                                                eVar30.f6913b = str31;
                                                                                                                                na.t a19 = eVar30.a();
                                                                                                                                na.v vVar31 = new na.v();
                                                                                                                                Router$lambda$20$0$4$0$0$105(vVar31);
                                                                                                                                String str32 = vVar31.f24386b;
                                                                                                                                if (str32 != null) {
                                                                                                                                    com.google.gson.internal.e eVar31 = vVar31.f24385a;
                                                                                                                                    eVar31.f6913b = str32;
                                                                                                                                    na.t a20 = eVar31.a();
                                                                                                                                    na.v vVar32 = new na.v();
                                                                                                                                    Router$lambda$20$0$4$0$0$106(vVar32);
                                                                                                                                    String str33 = vVar32.f24386b;
                                                                                                                                    if (str33 != null) {
                                                                                                                                        com.google.gson.internal.e eVar32 = vVar32.f24385a;
                                                                                                                                        eVar32.f6913b = str33;
                                                                                                                                        na.t a21 = eVar32.a();
                                                                                                                                        na.v vVar33 = new na.v();
                                                                                                                                        Router$lambda$20$0$4$0$0$107(vVar33);
                                                                                                                                        String str34 = vVar33.f24386b;
                                                                                                                                        if (str34 != null) {
                                                                                                                                            com.google.gson.internal.e eVar33 = vVar33.f24385a;
                                                                                                                                            eVar33.f6913b = str34;
                                                                                                                                            na.t a22 = eVar33.a();
                                                                                                                                            na.v vVar34 = new na.v();
                                                                                                                                            Router$lambda$20$0$4$0$0$108(vVar34);
                                                                                                                                            String str35 = vVar34.f24386b;
                                                                                                                                            if (str35 != null) {
                                                                                                                                                com.google.gson.internal.e eVar34 = vVar34.f24385a;
                                                                                                                                                eVar34.f6913b = str35;
                                                                                                                                                na.t a23 = eVar34.a();
                                                                                                                                                na.v vVar35 = new na.v();
                                                                                                                                                Router$lambda$20$0$4$0$0$109(vVar35);
                                                                                                                                                String str36 = vVar35.f24386b;
                                                                                                                                                if (str36 != null) {
                                                                                                                                                    com.google.gson.internal.e eVar35 = vVar35.f24385a;
                                                                                                                                                    eVar35.f6913b = str36;
                                                                                                                                                    na.t a24 = eVar35.a();
                                                                                                                                                    na.v vVar36 = new na.v();
                                                                                                                                                    Router$lambda$20$0$4$0$0$110(vVar36);
                                                                                                                                                    String str37 = vVar36.f24386b;
                                                                                                                                                    if (str37 != null) {
                                                                                                                                                        com.google.gson.internal.e eVar36 = vVar36.f24385a;
                                                                                                                                                        eVar36.f6913b = str37;
                                                                                                                                                        final int i24 = 0;
                                                                                                                                                        ae.l.u(zVar2, playerRoute, null, ig.f.I(a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, eVar36.a()), new n(9), new n(10), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.y
                                                                                                                                                            @Override // ho.r
                                                                                                                                                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                sn.z Router$lambda$20$0$4$0$0$113;
                                                                                                                                                                sn.z Router$lambda$20$0$4$0$0$145;
                                                                                                                                                                switch (i24) {
                                                                                                                                                                    case 0:
                                                                                                                                                                        int intValue = ((Integer) obj4).intValue();
                                                                                                                                                                        Router$lambda$20$0$4$0$0$113 = RouterKt.Router$lambda$20$0$4$0$0$113(c0Var, q2Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue);
                                                                                                                                                                        return Router$lambda$20$0$4$0$0$113;
                                                                                                                                                                    default:
                                                                                                                                                                        int intValue2 = ((Integer) obj4).intValue();
                                                                                                                                                                        Router$lambda$20$0$4$0$0$145 = RouterKt.Router$lambda$20$0$4$0$0$145(c0Var, q2Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue2);
                                                                                                                                                                        return Router$lambda$20$0$4$0$0$145;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }, true, 500095243), 226);
                                                                                                                                                        na.v vVar37 = new na.v();
                                                                                                                                                        Router$lambda$20$0$4$0$0$114(vVar37);
                                                                                                                                                        String str38 = vVar37.f24386b;
                                                                                                                                                        if (str38 != null) {
                                                                                                                                                            com.google.gson.internal.e eVar37 = vVar37.f24385a;
                                                                                                                                                            eVar37.f6913b = str38;
                                                                                                                                                            List H2 = ig.f.H(eVar37.a());
                                                                                                                                                            final int i25 = 3;
                                                                                                                                                            final int i26 = 4;
                                                                                                                                                            ae.l.u(zVar2, Routes.voicesRoute, null, H2, new ho.l() { // from class: io.elevenlabs.readerapp.core.router.e
                                                                                                                                                                @Override // ho.l
                                                                                                                                                                public final Object invoke(Object obj) {
                                                                                                                                                                    d1 Router$lambda$20$0$4$0$0$5;
                                                                                                                                                                    f1 Router$lambda$20$0$4$0$0$6;
                                                                                                                                                                    d1 Router$lambda$20$0$4$0$0$12;
                                                                                                                                                                    d1 Router$lambda$20$0$4$0$0$115;
                                                                                                                                                                    f1 Router$lambda$20$0$4$0$0$116;
                                                                                                                                                                    f1 Router$lambda$20$0$4$0$0$13;
                                                                                                                                                                    d1 Router$lambda$20$0$4$0$0$19;
                                                                                                                                                                    f1 Router$lambda$20$0$4$0$0$20;
                                                                                                                                                                    switch (i25) {
                                                                                                                                                                        case 0:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$5 = RouterKt.Router$lambda$20$0$4$0$0$5(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$5;
                                                                                                                                                                        case 1:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$6 = RouterKt.Router$lambda$20$0$4$0$0$6(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$6;
                                                                                                                                                                        case 2:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$12 = RouterKt.Router$lambda$20$0$4$0$0$12(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$12;
                                                                                                                                                                        case 3:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$115 = RouterKt.Router$lambda$20$0$4$0$0$115(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$115;
                                                                                                                                                                        case 4:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$116 = RouterKt.Router$lambda$20$0$4$0$0$116(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$116;
                                                                                                                                                                        case 5:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$13 = RouterKt.Router$lambda$20$0$4$0$0$13(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$13;
                                                                                                                                                                        case 6:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$19 = RouterKt.Router$lambda$20$0$4$0$0$19(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$19;
                                                                                                                                                                        default:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$20 = RouterKt.Router$lambda$20$0$4$0$0$20(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$20;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }, new ho.l() { // from class: io.elevenlabs.readerapp.core.router.e
                                                                                                                                                                @Override // ho.l
                                                                                                                                                                public final Object invoke(Object obj) {
                                                                                                                                                                    d1 Router$lambda$20$0$4$0$0$5;
                                                                                                                                                                    f1 Router$lambda$20$0$4$0$0$6;
                                                                                                                                                                    d1 Router$lambda$20$0$4$0$0$12;
                                                                                                                                                                    d1 Router$lambda$20$0$4$0$0$115;
                                                                                                                                                                    f1 Router$lambda$20$0$4$0$0$116;
                                                                                                                                                                    f1 Router$lambda$20$0$4$0$0$13;
                                                                                                                                                                    d1 Router$lambda$20$0$4$0$0$19;
                                                                                                                                                                    f1 Router$lambda$20$0$4$0$0$20;
                                                                                                                                                                    switch (i26) {
                                                                                                                                                                        case 0:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$5 = RouterKt.Router$lambda$20$0$4$0$0$5(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$5;
                                                                                                                                                                        case 1:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$6 = RouterKt.Router$lambda$20$0$4$0$0$6(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$6;
                                                                                                                                                                        case 2:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$12 = RouterKt.Router$lambda$20$0$4$0$0$12(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$12;
                                                                                                                                                                        case 3:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$115 = RouterKt.Router$lambda$20$0$4$0$0$115(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$115;
                                                                                                                                                                        case 4:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$116 = RouterKt.Router$lambda$20$0$4$0$0$116(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$116;
                                                                                                                                                                        case 5:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$13 = RouterKt.Router$lambda$20$0$4$0$0$13(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$13;
                                                                                                                                                                        case 6:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$19 = RouterKt.Router$lambda$20$0$4$0$0$19(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$19;
                                                                                                                                                                        default:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$20 = RouterKt.Router$lambda$20$0$4$0$0$20(list, cVar, (i1.q) obj);
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$20;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }, new c3.j(new io.elevenlabs.readerapp.core.h(c0Var, j2Var, routerViewModel, 3), true, 1333025804), 226);
                                                                                                                                                            ae.l.u(zVar2, routes.readVoicePicker("{id}"), null, null, new n(11), new n(12), new c3.j(new io.elevenlabs.readerapp.e(c0Var, j2Var), true, -2129010931), 230);
                                                                                                                                                            ae.l.u(zVar2, routes.readSoundscapes("{id}"), null, null, new n(13), new n(14), new c3.j(new c(c0Var, 27), true, -984407773), 230);
                                                                                                                                                            ae.l.u(zVar2, routes.voiceCollection("{collectionId}"), null, null, new n(15), new n(16), new c3.j(new c(c0Var, 28), true, -151477212), 230);
                                                                                                                                                            ae.l.u(zVar2, routes.voiceCollectionForRead("{collectionId}", "{readId}"), null, null, new n(17), new n(18), new c3.j(new c(c0Var, 29), true, 681453349), 230);
                                                                                                                                                            final int i27 = 0;
                                                                                                                                                            ae.l.u(zVar2, routes.readGenFMLoading("{id}"), null, null, new n(19), new n(20), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                                                                                                                                                @Override // ho.r
                                                                                                                                                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$4;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                    switch (i27) {
                                                                                                                                                                        case 0:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                        case 1:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                        case 2:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                        case 3:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                        case 4:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                        case 5:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                        case 6:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                        case 7:
                                                                                                                                                                            Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$4;
                                                                                                                                                                        case 8:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                        case 9:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                        default:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }, true, 1514383910), 230);
                                                                                                                                                            final int i28 = 1;
                                                                                                                                                            ae.l.u(zVar2, routes.readShareDetailsRoute("{readId}"), null, null, null, null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                                                                                                                                                @Override // ho.r
                                                                                                                                                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$4;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                    switch (i28) {
                                                                                                                                                                        case 0:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                        case 1:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                        case 2:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                        case 3:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                        case 4:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                        case 5:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                        case 6:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                        case 7:
                                                                                                                                                                            Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$4;
                                                                                                                                                                        case 8:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                        case 9:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                        default:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }, true, -1947652825), 254);
                                                                                                                                                            final int i29 = 2;
                                                                                                                                                            ae.l.u(zVar2, routes.bookmarkShareDetailsRoute("{bookmarkId}", "{voiceId}"), null, null, null, null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                                                                                                                                                @Override // ho.r
                                                                                                                                                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$4;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                    sn.z Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                    switch (i29) {
                                                                                                                                                                        case 0:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                        case 1:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                        case 2:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                        case 3:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                        case 4:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                        case 5:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                        case 6:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                        case 7:
                                                                                                                                                                            Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$4;
                                                                                                                                                                        case 8:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                        case 9:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                        default:
                                                                                                                                                                            Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                            return Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }, true, -1114722264), 254);
                                                                                                                                                            na.v vVar38 = new na.v();
                                                                                                                                                            Router$lambda$20$0$4$0$0$135(vVar38);
                                                                                                                                                            String str39 = vVar38.f24386b;
                                                                                                                                                            if (str39 != null) {
                                                                                                                                                                com.google.gson.internal.e eVar38 = vVar38.f24385a;
                                                                                                                                                                eVar38.f6913b = str39;
                                                                                                                                                                final int i30 = 3;
                                                                                                                                                                ae.l.u(zVar2, "importSheet", null, ig.f.H(eVar38.a()), null, null, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.j
                                                                                                                                                                    @Override // ho.r
                                                                                                                                                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$87;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$89;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$96;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$136;
                                                                                                                                                                        switch (i30) {
                                                                                                                                                                            case 0:
                                                                                                                                                                                int intValue = ((Integer) obj4).intValue();
                                                                                                                                                                                Router$lambda$20$0$4$0$0$87 = RouterKt.Router$lambda$20$0$4$0$0$87(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue);
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$87;
                                                                                                                                                                            case 1:
                                                                                                                                                                                int intValue2 = ((Integer) obj4).intValue();
                                                                                                                                                                                Router$lambda$20$0$4$0$0$89 = RouterKt.Router$lambda$20$0$4$0$0$89(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue2);
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$89;
                                                                                                                                                                            case 2:
                                                                                                                                                                                int intValue3 = ((Integer) obj4).intValue();
                                                                                                                                                                                Router$lambda$20$0$4$0$0$96 = RouterKt.Router$lambda$20$0$4$0$0$96(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue3);
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$96;
                                                                                                                                                                            default:
                                                                                                                                                                                int intValue4 = ((Integer) obj4).intValue();
                                                                                                                                                                                Router$lambda$20$0$4$0$0$136 = RouterKt.Router$lambda$20$0$4$0$0$136(routerViewModel, c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue4);
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$136;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }, true, -281791703), 250);
                                                                                                                                                                final int i31 = 3;
                                                                                                                                                                ae.l.u(zVar2, Routes.offlineDownloadLimitReachedRoute, null, null, new n(21), new n(22), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                                                                                                                                                    @Override // ho.r
                                                                                                                                                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$4;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                        switch (i31) {
                                                                                                                                                                            case 0:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                            case 1:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                            case 2:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                            case 3:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                            case 4:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                            case 5:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                            case 6:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                            case 7:
                                                                                                                                                                                Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$4;
                                                                                                                                                                            case 8:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                            case 9:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                            default:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }, true, 551138858), 230);
                                                                                                                                                                final int i32 = 4;
                                                                                                                                                                ae.l.u(zVar2, Routes.followedSeriesRoute, null, null, new n(23), new n(24), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                                                                                                                                                    @Override // ho.r
                                                                                                                                                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$4;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                        switch (i32) {
                                                                                                                                                                            case 0:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                            case 1:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                            case 2:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                            case 3:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                            case 4:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                            case 5:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                            case 6:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                            case 7:
                                                                                                                                                                                Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$4;
                                                                                                                                                                            case 8:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                            case 9:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                            default:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }, true, 1384069419), 230);
                                                                                                                                                                final int i33 = 1;
                                                                                                                                                                ae.l.u(zVar2, Routes.pronunciationsListRoute, null, null, new n(26), new n(27), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.y
                                                                                                                                                                    @Override // ho.r
                                                                                                                                                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$113;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$145;
                                                                                                                                                                        switch (i33) {
                                                                                                                                                                            case 0:
                                                                                                                                                                                int intValue = ((Integer) obj4).intValue();
                                                                                                                                                                                Router$lambda$20$0$4$0$0$113 = RouterKt.Router$lambda$20$0$4$0$0$113(c0Var, q2Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue);
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$113;
                                                                                                                                                                            default:
                                                                                                                                                                                int intValue2 = ((Integer) obj4).intValue();
                                                                                                                                                                                Router$lambda$20$0$4$0$0$145 = RouterKt.Router$lambda$20$0$4$0$0$145(c0Var, q2Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, intValue2);
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$145;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }, true, -2077967316), 230);
                                                                                                                                                                final int i34 = 5;
                                                                                                                                                                ae.l.u(zVar2, Routes.pronunciationAddRoute, null, null, new n(28), new n(29), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                                                                                                                                                    @Override // ho.r
                                                                                                                                                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$4;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                        switch (i34) {
                                                                                                                                                                            case 0:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                            case 1:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                            case 2:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                            case 3:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                            case 4:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                            case 5:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                            case 6:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                            case 7:
                                                                                                                                                                                Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$4;
                                                                                                                                                                            case 8:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                            case 9:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                            default:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }, true, -933364158), 230);
                                                                                                                                                                final int i35 = 6;
                                                                                                                                                                ae.l.u(zVar2, Routes.pronunciationEditRoute, null, null, new a0(0), new a0(1), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                                                                                                                                                    @Override // ho.r
                                                                                                                                                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$4;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                        sn.z Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                        switch (i35) {
                                                                                                                                                                            case 0:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                            case 1:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                            case 2:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                            case 3:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                            case 4:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                            case 5:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                            case 6:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                            case 7:
                                                                                                                                                                                Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$4;
                                                                                                                                                                            case 8:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                            case 9:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                            default:
                                                                                                                                                                                Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                return Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }, true, -100433597), 230);
                                                                                                                                                                zVar.f24401h.add(zVar2.a());
                                                                                                                                                                unauthorizedRoutes(zVar, 300, c0Var);
                                                                                                                                                                splashRoutes(zVar, 300);
                                                                                                                                                                na.v vVar39 = new na.v();
                                                                                                                                                                Router$lambda$20$0$4$0$1(vVar39);
                                                                                                                                                                String str40 = vVar39.f24386b;
                                                                                                                                                                if (str40 != null) {
                                                                                                                                                                    com.google.gson.internal.e eVar39 = vVar39.f24385a;
                                                                                                                                                                    eVar39.f6913b = str40;
                                                                                                                                                                    final int i36 = 7;
                                                                                                                                                                    ae.l.u(zVar, Routes.voiceDesignRoute, null, ig.f.H(eVar39.a()), new a0(3), new a0(4), new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.core.router.z
                                                                                                                                                                        @Override // ho.r
                                                                                                                                                                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$4;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                            sn.z Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                            switch (i36) {
                                                                                                                                                                                case 0:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$132 = RouterKt.Router$lambda$20$0$4$0$0$132((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$132;
                                                                                                                                                                                case 1:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$133 = RouterKt.Router$lambda$20$0$4$0$0$133((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$133;
                                                                                                                                                                                case 2:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$134 = RouterKt.Router$lambda$20$0$4$0$0$134((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$134;
                                                                                                                                                                                case 3:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$139 = RouterKt.Router$lambda$20$0$4$0$0$139((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$139;
                                                                                                                                                                                case 4:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$142 = RouterKt.Router$lambda$20$0$4$0$0$142((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$142;
                                                                                                                                                                                case 5:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$148 = RouterKt.Router$lambda$20$0$4$0$0$148((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$148;
                                                                                                                                                                                case 6:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$151 = RouterKt.Router$lambda$20$0$4$0$0$151((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$151;
                                                                                                                                                                                case 7:
                                                                                                                                                                                    Router$lambda$20$0$4$0$4 = RouterKt.Router$lambda$20$0$4$0$4((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$4;
                                                                                                                                                                                case 8:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$25 = RouterKt.Router$lambda$20$0$4$0$0$25((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$25;
                                                                                                                                                                                case 9:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$26 = RouterKt.Router$lambda$20$0$4$0$0$26((na.c0) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$26;
                                                                                                                                                                                default:
                                                                                                                                                                                    Router$lambda$20$0$4$0$0$4 = RouterKt.Router$lambda$20$0$4$0$0$4((RouterViewModel) c0Var, (i1.o) obj, (na.j) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                                                                                                                                                                                    return Router$lambda$20$0$4$0$0$4;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }, true, 1547010358), 226);
                                                                                                                                                                    return sn.z.f31622a;
                                                                                                                                                                }
                                                                                                                                                                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                                                                return null;
                                                                                                                                                            }
                                                                                                                                                            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                                                            return null;
                                                                                                                                                        }
                                                                                                                                                        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                                                        return null;
                                                                                                                                                    }
                                                                                                                                                    c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                                                    return null;
                                                                                                                                                }
                                                                                                                                                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                                                return null;
                                                                                                                                            }
                                                                                                                                            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                                            return null;
                                                                                                                                        }
                                                                                                                                        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                                        return null;
                                                                                                                                    }
                                                                                                                                    c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                                    return null;
                                                                                                                                }
                                                                                                                                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                                return null;
                                                                                                                            }
                                                                                                                            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                            return null;
                                                                                                                        }
                                                                                                                        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                        return null;
                                                                                                                    }
                                                                                                                    c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                    return null;
                                                                                                                }
                                                                                                                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                                return null;
                                                                                                            }
                                                                                                            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                            return null;
                                                                                                        }
                                                                                                        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                        return null;
                                                                                                    }
                                                                                                    c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                    return null;
                                                                                                }
                                                                                                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                                return null;
                                                                                            }
                                                                                            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                            return null;
                                                                                        }
                                                                                        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                        return null;
                                                                                    }
                                                                                    c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                    return null;
                                                                                }
                                                                                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                                return null;
                                                                            }
                                                                            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                            return null;
                                                                        }
                                                                        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                        return null;
                                                                    }
                                                                    c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                    return null;
                                                                }
                                                                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                                return null;
                                                            }
                                                            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                            return null;
                                                        }
                                                        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                        return null;
                                                    }
                                                    c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                    return null;
                                                }
                                                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                                return null;
                                            }
                                            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                            return null;
                                        }
                                        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                        return null;
                                    }
                                    c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                    return null;
                                }
                                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                                return null;
                            }
                            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                            return null;
                        }
                        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                        return null;
                    }
                    c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                    return null;
                }
                c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
                return null;
            }
            c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
            return null;
        }
        c6.x("The NavDeepLink must have an uri, action, and/or mimeType.");
        return null;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$10(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("library");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$100(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink(Routes.INSTANCE.playerRoute("{id}", "{activationSource}"));
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$101(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$102(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}?voiceId={voiceId}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$103(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}?activationSource={activationSource}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$104(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}?startAtChapter={startAtChapter}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$105(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}?refresh={refresh}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$106(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}?voiceId={voiceId}&startAtChapter={startAtChapter}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$107(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}?voiceId={voiceId}&refresh={refresh}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$108(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}?startAtChapter={startAtChapter}&refresh={refresh}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$109(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}?voiceId={voiceId}&startAtChapter={startAtChapter}&refresh={refresh}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$11(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("library/{pageId}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$110(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("player/{id}?activationSource={activationSource}&showAssistant={showAssistant}");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$111(i1.q qVar) {
        qVar.getClass();
        if (kotlin.jvm.internal.m.c((String) ((na.j) ((i1.x) qVar).b()).f24329b.f24395b.f1674e, Routes.RootRoutes.SPLASH)) {
            return y0.e(j1.e.s(300, 0, null, 6), 2);
        }
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$112(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final sn.z Router$lambda$20$0$4$0$0$113(na.c0 c0Var, q2 q2Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        String str2;
        Integer num;
        boolean z6;
        boolean z10;
        ho.a aVar;
        String string;
        String string2;
        String string3;
        String string4;
        oVar.getClass();
        jVar.getClass();
        qa.c cVar = jVar.Z;
        Bundle a10 = cVar.a();
        Analytics.Event.PlayerActivationSource playerActivationSource = null;
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        str.getClass();
        Bundle a11 = cVar.a();
        if (a11 != null) {
            str2 = a11.getString("voiceId");
        } else {
            str2 = null;
        }
        Bundle a12 = cVar.a();
        if (a12 != null && (string4 = a12.getString("startAtChapter")) != null) {
            num = wq.u.Y(string4);
        } else {
            num = null;
        }
        Bundle a13 = cVar.a();
        if (a13 != null && (string3 = a13.getString("refresh")) != null && Boolean.parseBoolean(string3)) {
            z6 = true;
        } else {
            z6 = false;
        }
        Bundle a14 = cVar.a();
        if (a14 != null && (string2 = a14.getString("activationSource")) != null) {
            Iterator<E> it = Analytics.Event.PlayerActivationSource.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.m.c(((Analytics.Event.PlayerActivationSource) next).getValue(), string2)) {
                    playerActivationSource = next;
                    break;
                }
            }
            playerActivationSource = playerActivationSource;
        }
        Bundle a15 = cVar.a();
        if (a15 != null && (string = a15.getString("showAssistant")) != null && Boolean.parseBoolean(string)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (playerActivationSource == null) {
            playerActivationSource = Analytics.Event.PlayerActivationSource.Deeplink;
        }
        Analytics.Event.PlayerActivationSource playerActivationSource2 = playerActivationSource;
        ho.r lambda$1695197395$app_productionRelease = ComposableSingletons$RouterKt.INSTANCE.getLambda$1695197395$app_productionRelease();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new w(c0Var, 22);
            qVar.h0(L);
        }
        ho.a aVar2 = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new b(c0Var, 25);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        boolean h12 = qVar.h(c0Var) | qVar.f(str);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new f(c0Var, str, 3);
            qVar.h0(L3);
        }
        ho.a aVar3 = (ho.a) L3;
        boolean h13 = qVar.h(c0Var) | qVar.f(str);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new f(c0Var, str, 0);
            qVar.h0(L4);
        }
        ho.a aVar4 = (ho.a) L4;
        boolean h14 = qVar.h(c0Var);
        Object L5 = qVar.L();
        if (!h14 && L5 != eVar) {
            aVar = aVar2;
        } else {
            aVar = aVar2;
            L5 = new h(c0Var, 0);
            qVar.h0(L5);
        }
        ho.p pVar = (ho.p) L5;
        boolean h15 = qVar.h(c0Var);
        Object L6 = qVar.L();
        if (h15 || L6 == eVar) {
            L6 = new b(c0Var, 1);
            qVar.h0(L6);
        }
        ho.l lVar2 = (ho.l) L6;
        boolean h16 = qVar.h(c0Var);
        Object L7 = qVar.L();
        if (h16 || L7 == eVar) {
            L7 = new h(c0Var, 1);
            qVar.h0(L7);
        }
        ho.p pVar2 = (ho.p) L7;
        boolean h17 = qVar.h(c0Var) | qVar.h(q2Var);
        Object L8 = qVar.L();
        if (h17 || L8 == eVar) {
            L8 = new k(c0Var, q2Var, 0);
            qVar.h0(L8);
        }
        ho.l lVar3 = (ho.l) L8;
        boolean h18 = qVar.h(c0Var);
        Object L9 = qVar.L();
        if (h18 || L9 == eVar) {
            L9 = new b(c0Var, 2);
            qVar.h0(L9);
        }
        ho.l lVar4 = (ho.l) L9;
        boolean h19 = qVar.h(c0Var);
        Object L10 = qVar.L();
        if (h19 || L10 == eVar) {
            L10 = new l(c0Var, 8);
            qVar.h0(L10);
        }
        ho.a aVar5 = (ho.a) L10;
        boolean h20 = qVar.h(c0Var);
        Object L11 = qVar.L();
        if (h20 || L11 == eVar) {
            L11 = new w(c0Var, 23);
            qVar.h0(L11);
        }
        ho.a aVar6 = (ho.a) L11;
        boolean h21 = qVar.h(c0Var);
        Object L12 = qVar.L();
        if (h21 || L12 == eVar) {
            L12 = new w(c0Var, 24);
            qVar.h0(L12);
        }
        PlayerScreenKt.PlayerScreen(playerActivationSource2, str, lambda$1695197395$app_productionRelease, aVar, str2, num, z6, z10, lVar, aVar3, aVar4, pVar, lVar2, pVar2, lVar3, lVar4, aVar5, aVar6, (ho.a) L12, null, qVar, 384, 0, 524288);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$1$0(na.c0 c0Var) {
        if (!c0Var.d()) {
            NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.RootRoutes.AUTHORIZED, false, null, 6, null);
        }
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$10$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.paywallRoute$default(Routes.INSTANCE, ProductsService.PaywallSource.VOICE_DESIGN, Analytics.Event.PaywallSource.VoiceDesign, (String) null, 4, (Object) null), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$11$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.paywallRoute$default(Routes.INSTANCE, ProductsService.PaywallSource.DEFAULT, Analytics.Event.PaywallSource.PremiumContent, (String) null, 4, (Object) null), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$12$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.settingsPlayerPreferencesRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$2$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.readDetails(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$3$0(na.c0 c0Var, String str) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.readVoicePicker(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$4$0(na.c0 c0Var, String str) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.readSoundscapes(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$5$0(na.c0 c0Var, String str, boolean z6) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.readGenFMLoading(str), z6, null, 4, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$6$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.readShareDetailsRoute(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$7$0(na.c0 c0Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.bookmarkShareDetailsRoute(str, str2), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$8$0(na.c0 c0Var, q2 q2Var, String str) {
        str.getClass();
        if (!NavigationExtensions.INSTANCE.launchDeeplink(c0Var, str)) {
            q2Var.openUri(str);
        }
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$113$9$0(na.c0 c0Var, String str) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.purchaseCreditsRoute(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$114(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("voices");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$115(List list, h5.c cVar, i1.q qVar) {
        qVar.getClass();
        return AnimatedContentTransitionsKt.getTabEnterTransition(qVar, list, cVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$116(List list, h5.c cVar, i1.q qVar) {
        qVar.getClass();
        return AnimatedContentTransitionsKt.getTabExitTransition(qVar, list, cVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$117(na.c0 c0Var, j2 j2Var, RouterViewModel routerViewModel, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        z0 m10 = c1.m(((androidx.lifecycle.z0) jVar.f24334x0.getValue()).b(), mVar, 0);
        VoicePickerMode.VoicesTab voicesTab = VoicePickerMode.VoicesTab.INSTANCE;
        String Router$lambda$20$0$4$0$0$117$0 = Router$lambda$20$0$4$0$0$117$0(m10);
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new w(c0Var, 5);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new b(c0Var, 21);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new w(c0Var, 7);
            qVar.h0(L3);
        }
        ho.a aVar2 = (ho.a) L3;
        boolean h13 = qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new h(c0Var, 10);
            qVar.h0(L4);
        }
        ho.p pVar = (ho.p) L4;
        c3.j d10 = c3.k.d(-1496462736, true, new p(oVar, j2Var, c0Var, routerViewModel, 3), qVar);
        boolean h14 = qVar.h(jVar);
        Object L5 = qVar.L();
        if (h14 || L5 == eVar) {
            L5 = new t(jVar, 1);
            qVar.h0(L5);
        }
        VoicePickerScreenKt.VoicePickerScreen(voicesTab, aVar, lVar, aVar2, pVar, d10, j2Var, oVar, Router$lambda$20$0$4$0$0$117$0, (ho.a) L5, null, qVar, ((i10 << 21) & 29360128) | 196614, 0, UserMetadata.MAX_ATTRIBUTE_SIZE);
        return sn.z.f31622a;
    }

    private static final String Router$lambda$20$0$4$0$0$117$0(s2 s2Var) {
        return (String) s2Var.getValue();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$117$1$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$117$2$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.voiceCollection(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$117$3$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.voiceDesignRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$117$4$0(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$117$5(i1.o oVar, j2 j2Var, na.c0 c0Var, RouterViewModel routerViewModel, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Router$lambda$20$0$4$0$0$BottomNav(j2Var, c0Var, routerViewModel, oVar, Routes.voicesRoute, qVar, 48);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$117$6$0(na.j jVar) {
        androidx.lifecycle.z0 z0Var = (androidx.lifecycle.z0) jVar.f24334x0.getValue();
        k1 k1Var = z0Var.f2915b;
        ((LinkedHashMap) k1Var.f2859a).remove("createdVoiceId");
        ((LinkedHashMap) k1Var.f2861c).remove("createdVoiceId");
        ((LinkedHashMap) k1Var.f2862d).remove("createdVoiceId");
        if (z0Var.f2914a.remove("createdVoiceId") == null) {
            return sn.z.f31622a;
        }
        a9.a.c();
        return null;
    }

    public static final d1 Router$lambda$20$0$4$0$0$118(i1.q qVar) {
        qVar.getClass();
        String str = (String) ((na.j) ((i1.x) qVar).b()).f24329b.f24395b.f1674e;
        Routes routes = Routes.INSTANCE;
        if (kotlin.jvm.internal.m.c(str, routes.voiceCollection("{collectionId}")) || kotlin.jvm.internal.m.c(str, routes.voiceCollectionForRead("{collectionId}", "{readId}"))) {
            return NavigationAnimations.INSTANCE.animationSlideInRight(qVar);
        }
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$119(i1.q qVar) {
        qVar.getClass();
        String str = (String) ((na.j) ((i1.x) qVar).a()).f24329b.f24395b.f1674e;
        Routes routes = Routes.INSTANCE;
        if (kotlin.jvm.internal.m.c(str, routes.voiceCollection("{collectionId}")) || kotlin.jvm.internal.m.c(str, routes.voiceCollectionForRead("{collectionId}", "{readId}"))) {
            return NavigationAnimations.INSTANCE.animationSlideOutLeft(qVar);
        }
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final d1 Router$lambda$20$0$4$0$0$12(List list, h5.c cVar, i1.q qVar) {
        qVar.getClass();
        return AnimatedContentTransitionsKt.getTabEnterTransition(qVar, list, cVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$120(na.c0 c0Var, j2 j2Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        str.getClass();
        z0 m10 = c1.m(((androidx.lifecycle.z0) jVar.f24334x0.getValue()).b(), mVar, 0);
        VoicePickerMode.VoicePicker voicePicker = new VoicePickerMode.VoicePicker(str);
        String Router$lambda$20$0$4$0$0$120$0 = Router$lambda$20$0$4$0$0$120$0(m10);
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new l(c0Var, 22);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var) | qVar.f(str);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new io.elevenlabs.data.database.entities.reads.h(c0Var, str, 3);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new l(c0Var, 23);
            qVar.h0(L3);
        }
        ho.a aVar2 = (ho.a) L3;
        boolean h13 = qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new h(c0Var, 6);
            qVar.h0(L4);
        }
        ho.p pVar = (ho.p) L4;
        boolean h14 = qVar.h(jVar);
        Object L5 = qVar.L();
        if (h14 || L5 == eVar) {
            L5 = new t(jVar, 0);
            qVar.h0(L5);
        }
        VoicePickerScreenKt.VoicePickerScreen(voicePicker, aVar, lVar, aVar2, pVar, null, j2Var, null, Router$lambda$20$0$4$0$0$120$0, (ho.a) L5, null, qVar, 196608, 0, 1152);
        return sn.z.f31622a;
    }

    private static final String Router$lambda$20$0$4$0$0$120$0(s2 s2Var) {
        return (String) s2Var.getValue();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$120$1$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$120$2$0(na.c0 c0Var, String str, String str2) {
        str2.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.voiceCollectionForRead(str2, str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$120$3$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.voiceDesignRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$120$4$0(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$120$5$0(na.j jVar) {
        androidx.lifecycle.z0 z0Var = (androidx.lifecycle.z0) jVar.f24334x0.getValue();
        k1 k1Var = z0Var.f2915b;
        ((LinkedHashMap) k1Var.f2859a).remove("createdVoiceId");
        ((LinkedHashMap) k1Var.f2861c).remove("createdVoiceId");
        ((LinkedHashMap) k1Var.f2862d).remove("createdVoiceId");
        if (z0Var.f2914a.remove("createdVoiceId") == null) {
            return sn.z.f31622a;
        }
        a9.a.c();
        return null;
    }

    public static final d1 Router$lambda$20$0$4$0$0$121(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$122(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$123(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new v(c0Var, 19);
            qVar.h0(L);
        }
        SoundscapesScreenKt.SoundscapesScreen(null, (ho.a) L, qVar, 0, 1);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$123$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$124(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInLeft(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$125(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutRight(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$126(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("collectionId");
        } else {
            str = null;
        }
        if (str != null) {
            VoicePickerCollectionRoute voicePickerCollectionRoute = new VoicePickerCollectionRoute(str, null);
            u2.q qVar = (u2.q) mVar;
            boolean h10 = qVar.h(c0Var);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new v(c0Var, 11);
                qVar.h0(L);
            }
            VoicePickerCollectionScreenKt.VoicePickerCollectionScreen(voicePickerCollectionRoute, (ho.a) L, null, qVar, 0, 4);
            return sn.z.f31622a;
        }
        c6.t("Required value was null.");
        return null;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$126$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$127(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInLeft(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$128(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutRight(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$129(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        qa.c cVar = jVar.Z;
        Bundle a10 = cVar.a();
        String str2 = null;
        if (a10 != null) {
            str = a10.getString("collectionId");
        } else {
            str = null;
        }
        if (str != null) {
            Bundle a11 = cVar.a();
            if (a11 != null) {
                str2 = a11.getString("readId");
            }
            if (str2 != null) {
                VoicePickerCollectionRoute voicePickerCollectionRoute = new VoicePickerCollectionRoute(str, str2);
                u2.q qVar = (u2.q) mVar;
                boolean h10 = qVar.h(c0Var);
                Object L = qVar.L();
                if (h10 || L == u2.l.f33918a) {
                    L = new l(c0Var, 6);
                    qVar.h0(L);
                }
                VoicePickerCollectionScreenKt.VoicePickerCollectionScreen(voicePickerCollectionRoute, (ho.a) L, null, qVar, 0, 4);
                return sn.z.f31622a;
            }
            c6.t("Required value was null.");
            return null;
        }
        c6.t("Required value was null.");
        return null;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$129$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final f1 Router$lambda$20$0$4$0$0$13(List list, h5.c cVar, i1.q qVar) {
        qVar.getClass();
        return AnimatedContentTransitionsKt.getTabExitTransition(qVar, list, cVar);
    }

    public static final d1 Router$lambda$20$0$4$0$0$130(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeIn();
    }

    public static final f1 Router$lambda$20$0$4$0$0$131(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeOut();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$132(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(c0Var, 20);
            qVar.h0(L);
        }
        ho.l lVar = (ho.l) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new w(c0Var, 4);
            qVar.h0(L2);
        }
        GenFMLoadingScreenKt.GenFMLoadingScreen(str2, lVar, (ho.a) L2, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$132$0$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, Analytics.Event.PlayerActivationSource.GenFMLoading.getValue()), false, Routes.RootRoutes.AUTHORIZED, 2, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$132$1$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.libraryRoute, false, Routes.RootRoutes.AUTHORIZED, 2, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$133(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("readId");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new w(c0Var, 20);
            qVar.h0(L);
        }
        ReadShareDetailsScreenKt.ReadShareDetailsScreen(str2, (ho.a) L, null, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$133$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$134(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        qa.c cVar = jVar.Z;
        Bundle a10 = cVar.a();
        String str2 = null;
        if (a10 != null) {
            str = a10.getString("bookmarkId");
        } else {
            str = null;
        }
        str.getClass();
        Bundle a11 = cVar.a();
        if (a11 != null) {
            str2 = a11.getString("voiceId");
        }
        String str3 = str2;
        str3.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new v(c0Var, 12);
            qVar.h0(L);
        }
        BookmarkShareDetailsScreenKt.BookmarkShareDetailsScreen(str, str3, (ho.a) L, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$134$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$135(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("importSheet");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$136(RouterViewModel routerViewModel, na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(routerViewModel) | qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new RouterKt$Router$16$1$5$1$1$135$1$1(routerViewModel, c0Var, null);
            qVar.h0(L);
        }
        sn.z zVar = sn.z.f31622a;
        u2.r.f((ho.p) L, zVar, qVar);
        return zVar;
    }

    public static final d1 Router$lambda$20$0$4$0$0$137(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$138(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$139(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        String string;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null && (string = a10.getString("encodedMessage")) != null) {
            str = RouterViewModelKt.decodeUrlParam(string);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new w(c0Var, 14);
            qVar.h0(L);
        }
        OfflineDownloadLimitReachedScreenKt.OfflineDownloadLimitReachedScreen(str, (ho.a) L, qVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$139$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sn.z Router$lambda$20$0$4$0$0$14(fr.d0 d0Var, RouterViewModel routerViewModel, na.c0 c0Var, j2 j2Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        LibraryTab libraryTab;
        Bundle a10;
        String str2;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        boolean h12;
        Object L3;
        boolean h13;
        Object L4;
        boolean h14;
        Object L5;
        boolean h15;
        Object L6;
        oVar.getClass();
        jVar.getClass();
        qa.c cVar = jVar.Z;
        Bundle a11 = cVar.a();
        ReadsService.SortBy sortBy = null;
        if (a11 != null) {
            str = a11.getString("pageId");
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -748101438) {
                if (hashCode != 109211271) {
                    if (hashCode == 1853891989 && str.equals("collections")) {
                        libraryTab = LibraryTab.COLLECTIONS;
                    }
                } else if (str.equals("saved")) {
                    libraryTab = LibraryTab.SAVED;
                }
            } else if (str.equals("archive")) {
                libraryTab = LibraryTab.ARCHIVE;
            }
            LibraryTab libraryTab2 = libraryTab;
            a10 = cVar.a();
            if (a10 == null) {
                str2 = a10.getString("sortBy");
            } else {
                str2 = null;
            }
            if (str2 != null) {
                int hashCode2 = str2.hashCode();
                if (hashCode2 != -1949193682) {
                    if (hashCode2 != -1148080845) {
                        if (hashCode2 == -1001078227 && str2.equals("progress")) {
                            sortBy = ReadsService.SortBy.Progress;
                        }
                    } else if (str2.equals("addedat")) {
                        sortBy = ReadsService.SortBy.AddedAt;
                    }
                } else if (str2.equals("updatedat")) {
                    sortBy = ReadsService.SortBy.UpdatedAt;
                }
            }
            ReadsService.SortBy sortBy2 = sortBy;
            u2.q qVar = (u2.q) mVar;
            h10 = qVar.h(d0Var) | qVar.h(routerViewModel) | qVar.h(c0Var);
            L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (!h10 || L == eVar) {
                L = new q(0, d0Var, routerViewModel, c0Var);
                qVar.h0(L);
            }
            ho.p pVar = (ho.p) L;
            h11 = qVar.h(c0Var);
            L2 = qVar.L();
            if (!h11 || L2 == eVar) {
                L2 = new h(c0Var, 5);
                qVar.h0(L2);
            }
            ho.p pVar2 = (ho.p) L2;
            h12 = qVar.h(c0Var);
            L3 = qVar.L();
            if (!h12 || L3 == eVar) {
                L3 = new b(c0Var, 6);
                qVar.h0(L3);
            }
            ho.l lVar = (ho.l) L3;
            h13 = qVar.h(c0Var);
            L4 = qVar.L();
            if (!h13 || L4 == eVar) {
                L4 = new l(c0Var, 14);
                qVar.h0(L4);
            }
            ho.a aVar = (ho.a) L4;
            h14 = qVar.h(routerViewModel);
            L5 = qVar.L();
            if (!h14 || L5 == eVar) {
                L5 = new s(routerViewModel, 0);
                qVar.h0(L5);
            }
            ho.a aVar2 = (ho.a) L5;
            h15 = qVar.h(c0Var);
            L6 = qVar.L();
            if (!h15 || L6 == eVar) {
                L6 = new l(c0Var, 15);
                qVar.h0(L6);
            }
            LibraryScreenKt.LibraryScreen(pVar, pVar2, lVar, aVar, aVar2, (ho.a) L6, c3.k.d(253689834, true, new p(oVar, j2Var, c0Var, routerViewModel, 1), qVar), j2Var, oVar, libraryTab2, sortBy2, null, qVar, ((i10 << 24) & 234881024) | 1572864, 0, 2048);
            return sn.z.f31622a;
        }
        libraryTab = LibraryTab.SAVED;
        LibraryTab libraryTab22 = libraryTab;
        a10 = cVar.a();
        if (a10 == null) {
        }
        if (str2 != null) {
        }
        ReadsService.SortBy sortBy22 = sortBy;
        u2.q qVar2 = (u2.q) mVar;
        h10 = qVar2.h(d0Var) | qVar2.h(routerViewModel) | qVar2.h(c0Var);
        L = qVar2.L();
        u2.e eVar2 = u2.l.f33918a;
        if (!h10) {
        }
        L = new q(0, d0Var, routerViewModel, c0Var);
        qVar2.h0(L);
        ho.p pVar3 = (ho.p) L;
        h11 = qVar2.h(c0Var);
        L2 = qVar2.L();
        if (!h11) {
        }
        L2 = new h(c0Var, 5);
        qVar2.h0(L2);
        ho.p pVar22 = (ho.p) L2;
        h12 = qVar2.h(c0Var);
        L3 = qVar2.L();
        if (!h12) {
        }
        L3 = new b(c0Var, 6);
        qVar2.h0(L3);
        ho.l lVar2 = (ho.l) L3;
        h13 = qVar2.h(c0Var);
        L4 = qVar2.L();
        if (!h13) {
        }
        L4 = new l(c0Var, 14);
        qVar2.h0(L4);
        ho.a aVar3 = (ho.a) L4;
        h14 = qVar2.h(routerViewModel);
        L5 = qVar2.L();
        if (!h14) {
        }
        L5 = new s(routerViewModel, 0);
        qVar2.h0(L5);
        ho.a aVar22 = (ho.a) L5;
        h15 = qVar2.h(c0Var);
        L6 = qVar2.L();
        if (!h15) {
        }
        L6 = new l(c0Var, 15);
        qVar2.h0(L6);
        LibraryScreenKt.LibraryScreen(pVar3, pVar22, lVar2, aVar3, aVar22, (ho.a) L6, c3.k.d(253689834, true, new p(oVar, j2Var, c0Var, routerViewModel, 1), qVar2), j2Var, oVar, libraryTab22, sortBy22, null, qVar2, ((i10 << 24) & 234881024) | 1572864, 0, 2048);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$14$0$0(fr.d0 d0Var, na.c0 c0Var, RouterViewModel routerViewModel, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        fr.g0.D(d0Var, null, null, new RouterKt$Router$16$1$5$1$1$13$1$1$1(c0Var, str, playerActivationSource, routerViewModel, null), 3);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$14$1$0(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$14$2$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.libraryCollectionRoute(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$14$3$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.searchRoute("LIBRARY_ONLY"), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$14$4$0(RouterViewModel routerViewModel) {
        routerViewModel.showImportSheet();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$14$5$0(na.c0 c0Var) {
        na.n.c(c0Var, Routes.exploreRoute);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$14$6(i1.o oVar, j2 j2Var, na.c0 c0Var, RouterViewModel routerViewModel, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Router$lambda$20$0$4$0$0$BottomNav(j2Var, c0Var, routerViewModel, oVar, Routes.libraryRoute, qVar, 48);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$140(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeIn();
    }

    public static final f1 Router$lambda$20$0$4$0$0$141(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeOut();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$142(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new l(c0Var, 0);
            qVar.h0(L);
        }
        FollowedSeriesScreenKt.FollowedSeriesScreen((ho.a) L, null, qVar, 0, 2);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$142$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$143(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$144(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$145(na.c0 c0Var, q2 q2Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new l(c0Var, 5);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new h(c0Var, 2);
            qVar.h0(L2);
        }
        ho.p pVar = (ho.p) L2;
        boolean h12 = qVar.h(c0Var) | qVar.h(q2Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new k(c0Var, q2Var, 1);
            qVar.h0(L3);
        }
        PronunciationsListScreenKt.PronunciationsListScreen(aVar, pVar, (ho.l) L3, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$145$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$145$1$0(na.c0 c0Var, String str, Pronunciation pronunciation) {
        str.getClass();
        pronunciation.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.pronunciationEditRoute(str, pronunciation.getId(), pronunciation.getOriginalText(), pronunciation.getSpokenText()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$145$2$0(na.c0 c0Var, q2 q2Var, String str) {
        str.getClass();
        if (!NavigationExtensions.INSTANCE.launchDeeplink(c0Var, str)) {
            q2Var.openUri(str);
        }
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$146(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$147(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$148(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        String string;
        oVar.getClass();
        jVar.getClass();
        qa.c cVar = jVar.Z;
        Bundle a10 = cVar.a();
        String str2 = null;
        if (a10 != null) {
            str = a10.getString("voiceId");
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        Bundle a11 = cVar.a();
        if (a11 != null && (string = a11.getString("encodedOriginalText")) != null) {
            str2 = RouterViewModelKt.decodeUrlParam(string);
        }
        if (str2 != null) {
            str3 = str2;
        }
        PronunciationScreenMode.Add add = new PronunciationScreenMode.Add(str, str3);
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new w(c0Var, 2);
            qVar.h0(L);
        }
        PronunciationScreenKt.PronunciationScreen(add, (ho.a) L, null, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$148$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$149(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final d1 Router$lambda$20$0$4$0$0$15(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeIn();
    }

    public static final f1 Router$lambda$20$0$4$0$0$150(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$151(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        String str2;
        String str3;
        String string;
        String string2;
        oVar.getClass();
        jVar.getClass();
        qa.c cVar = jVar.Z;
        Bundle a10 = cVar.a();
        String str4 = null;
        if (a10 != null) {
            str = a10.getString("voiceId");
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        Bundle a11 = cVar.a();
        if (a11 != null) {
            str2 = a11.getString("encodedPronunciationId");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        Bundle a12 = cVar.a();
        if (a12 != null && (string2 = a12.getString("encodedOriginalText")) != null) {
            str3 = RouterViewModelKt.decodeUrlParam(string2);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        Bundle a13 = cVar.a();
        if (a13 != null && (string = a13.getString("encodedSpokenText")) != null) {
            str4 = RouterViewModelKt.decodeUrlParam(string);
        }
        if (str4 != null) {
            str5 = str4;
        }
        PronunciationScreenMode.Edit edit = new PronunciationScreenMode.Edit(str, str2, str3, str5);
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new v(c0Var, 21);
            qVar.h0(L);
        }
        PronunciationScreenKt.PronunciationScreen(edit, (ho.a) L, null, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$151$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final f1 Router$lambda$20$0$4$0$0$16(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeOut();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$17(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, q2 q2Var, j2 j2Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 == null || (str = a10.getString("corpus")) == null) {
            str = "BOTH";
        }
        SearchCorpus valueOf = SearchCorpus.valueOf(str);
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new v(c0Var, 20);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(d0Var) | qVar.h(routerViewModel) | qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new u(1, d0Var, routerViewModel, c0Var);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new b(c0Var, 18);
            qVar.h0(L3);
        }
        ho.l lVar2 = (ho.l) L3;
        boolean h13 = qVar.h(d0Var) | qVar.h(routerViewModel) | qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new u(2, d0Var, routerViewModel, c0Var);
            qVar.h0(L4);
        }
        ho.l lVar3 = (ho.l) L4;
        boolean h14 = qVar.h(c0Var) | qVar.h(q2Var);
        Object L5 = qVar.L();
        if (h14 || L5 == eVar) {
            L5 = new k(c0Var, q2Var, 4);
            qVar.h0(L5);
        }
        SearchScreenKt.SearchScreen(valueOf, aVar, lVar, lVar2, lVar3, (ho.l) L5, j2Var, oVar, null, qVar, (i10 << 21) & 29360128, RpcError.MAX_MESSAGE_BYTES);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$17$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$17$1$0(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, String str) {
        str.getClass();
        Router$lambda$20$0$4$0$navigateToReadDetailsOrPlayer(c0Var, d0Var, routerViewModel, str, null, Analytics.Event.PlayerActivationSource.Search, Analytics.Event.PlayerAddToQueueClicked.Source.SearchResultsLongClick);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$17$2$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.exploreCollectionRoute(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$17$3$0(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, String str) {
        str.getClass();
        Router$lambda$20$0$4$0$navigateToReadDetailsOrPlayer(c0Var, d0Var, routerViewModel, str, null, Analytics.Event.PlayerActivationSource.Search, Analytics.Event.PlayerAddToQueueClicked.Source.SearchResultsLongClick);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$17$4$0(na.c0 c0Var, q2 q2Var, String str) {
        str.getClass();
        if (!NavigationExtensions.INSTANCE.launchDeeplink(c0Var, str)) {
            q2Var.openUri(str);
        }
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$18(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink(ShowkasePreviewGroup.EXPLORE);
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$19(List list, h5.c cVar, i1.q qVar) {
        qVar.getClass();
        return AnimatedContentTransitionsKt.getTabEnterTransition(qVar, list, cVar);
    }

    public static final d1 Router$lambda$20$0$4$0$0$2(i1.q qVar) {
        qVar.getClass();
        return y0.e(j1.e.s(300, 0, null, 6), 2);
    }

    public static final f1 Router$lambda$20$0$4$0$0$20(List list, h5.c cVar, i1.q qVar) {
        qVar.getClass();
        return AnimatedContentTransitionsKt.getTabExitTransition(qVar, list, cVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$21(na.c0 c0Var, q2 q2Var, j2 j2Var, RouterViewModel routerViewModel, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(c0Var, 4);
            qVar.h0(L);
        }
        ho.l lVar = (ho.l) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new h(c0Var, 3);
            qVar.h0(L2);
        }
        ho.p pVar = (ho.p) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new l(c0Var, 7);
            qVar.h0(L3);
        }
        ho.a aVar = (ho.a) L3;
        boolean h13 = qVar.h(c0Var) | qVar.h(q2Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new k(c0Var, q2Var, 2);
            qVar.h0(L4);
        }
        ExploreScreenKt.ExploreScreen(null, lVar, pVar, aVar, (ho.l) L4, c3.k.d(-2055999515, true, new p(oVar, j2Var, c0Var, routerViewModel, 0), qVar), j2Var, oVar, qVar, ((i10 << 21) & 29360128) | 196608, 1);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$21$0$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.readDetails(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$21$1$0(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$21$2$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.searchRoute("EXPLORE_ONLY"), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$21$3$0(na.c0 c0Var, q2 q2Var, String str) {
        str.getClass();
        if (!NavigationExtensions.INSTANCE.launchDeeplink(c0Var, str)) {
            q2Var.openUri(str);
        }
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$21$4(i1.o oVar, j2 j2Var, na.c0 c0Var, RouterViewModel routerViewModel, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Router$lambda$20$0$4$0$0$BottomNav(j2Var, c0Var, routerViewModel, oVar, Routes.exploreRoute, qVar, 48);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$22(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("libraryCollection/{id}");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        boolean equals = str2.equals("downloads");
        u2.e eVar = u2.l.f33918a;
        if (equals) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(-1804215804);
            boolean h10 = qVar.h(c0Var);
            Object L = qVar.L();
            if (h10 || L == eVar) {
                L = new l(c0Var, 25);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            boolean h11 = qVar.h(d0Var) | qVar.h(routerViewModel) | qVar.h(c0Var);
            Object L2 = qVar.L();
            if (h11 || L2 == eVar) {
                L2 = new u(0, d0Var, routerViewModel, c0Var);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            boolean h12 = qVar.h(c0Var);
            Object L3 = qVar.L();
            if (h12 || L3 == eVar) {
                L3 = new h(c0Var, 7);
                qVar.h0(L3);
            }
            ho.p pVar = (ho.p) L3;
            boolean h13 = qVar.h(c0Var);
            Object L4 = qVar.L();
            if (h13 || L4 == eVar) {
                L4 = new l(c0Var, 26);
                qVar.h0(L4);
            }
            DownloadsScreenKt.DownloadsScreen(aVar, lVar, pVar, (ho.a) L4, null, qVar, 0, 16);
            qVar.p(false);
        } else {
            u2.q qVar2 = (u2.q) mVar;
            qVar2.X(-1802879735);
            boolean h14 = qVar2.h(c0Var);
            Object L5 = qVar2.L();
            if (h14 || L5 == eVar) {
                L5 = new l(c0Var, 27);
                qVar2.h0(L5);
            }
            ho.a aVar2 = (ho.a) L5;
            boolean h15 = qVar2.h(d0Var) | qVar2.h(routerViewModel) | qVar2.h(c0Var) | qVar2.f(str2);
            Object L6 = qVar2.L();
            if (h15 || L6 == eVar) {
                v0 v0Var = new v0(c0Var, str2, d0Var, routerViewModel, 6);
                qVar2.h0(v0Var);
                L6 = v0Var;
            }
            ho.l lVar2 = (ho.l) L6;
            boolean h16 = qVar2.h(c0Var);
            Object L7 = qVar2.L();
            if (h16 || L7 == eVar) {
                L7 = new h(c0Var, 8);
                qVar2.h0(L7);
            }
            ho.p pVar2 = (ho.p) L7;
            boolean h17 = qVar2.h(c0Var) | qVar2.f(str2);
            Object L8 = qVar2.L();
            if (h17 || L8 == eVar) {
                L8 = new f(c0Var, str2, 1);
                qVar2.h0(L8);
            }
            ho.a aVar3 = (ho.a) L8;
            boolean h18 = qVar2.h(c0Var) | qVar2.f(str2);
            Object L9 = qVar2.L();
            if (h18 || L9 == eVar) {
                L9 = new f(c0Var, str2, 2);
                qVar2.h0(L9);
            }
            CollectionScreenKt.CollectionScreen(str2, aVar2, lVar2, pVar2, aVar3, (ho.a) L9, null, qVar2, 0, 64);
            qVar2.p(false);
        }
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23$1$0(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, String str) {
        str.getClass();
        Router$lambda$20$0$4$0$navigateToReadDetailsOrPlayer(c0Var, d0Var, routerViewModel, str, null, Analytics.Event.PlayerActivationSource.LibraryDownloads, Analytics.Event.PlayerAddToQueueClicked.Source.LibrarySwipeAction);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23$2$0(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23$3$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.libraryRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23$4$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23$5$0(na.c0 c0Var, String str, fr.d0 d0Var, RouterViewModel routerViewModel, String str2) {
        str2.getClass();
        Router$lambda$20$0$4$0$navigateToReadDetailsOrPlayer(c0Var, d0Var, routerViewModel, str2, str, Analytics.Event.PlayerActivationSource.LibraryCollection, Analytics.Event.PlayerAddToQueueClicked.Source.CollectionDetailsLongClick);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23$6$0(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23$7$0(na.c0 c0Var, String str) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.collectionAddReadsRoute(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$23$8$0(na.c0 c0Var, String str) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.editCollectionRoute(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$24(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("collection/{id}");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$25(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new l(c0Var, 13);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new b(c0Var, 5);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new h(c0Var, 4);
            qVar.h0(L3);
        }
        ExploreCollectionScreenKt.ExploreCollectionScreen(str2, aVar, lVar, (ho.p) L3, null, qVar, 0, 16);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$25$1$0(na.c0 c0Var, String str) {
        str.getClass();
        na.n.c(c0Var, Routes.INSTANCE.readDetails(str));
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$25$2$0(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$26(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new l(c0Var, 29);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new b(c0Var, 11);
            qVar.h0(L2);
        }
        AddReadsToCollectionScreenKt.AddReadsToCollectionScreen(str2, aVar, (ho.l) L2, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$26$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$26$1$0(na.c0 c0Var, String str) {
        str.getClass();
        String libraryCollectionRoute = Routes.INSTANCE.libraryCollectionRoute(str);
        c0Var.b(new m(libraryCollectionRoute, 0), libraryCollectionRoute);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$26$1$0$0(String str, na.g0 g0Var) {
        g0Var.getClass();
        g0Var.f24313b = true;
        g0Var.a(new n(5), str);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$26$1$0$0$0(l0 l0Var) {
        l0Var.getClass();
        l0Var.f24342a = true;
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$27(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$28(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$29(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new l(c0Var, 16);
            qVar.h0(L);
        }
        EditCollectionScreenKt.EditCollectionScreen(str2, (ho.a) L, null, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$29$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$3(i1.q qVar) {
        qVar.getClass();
        return y0.e(j1.e.s(300, 0, null, 6), 2);
    }

    private static final sn.z Router$lambda$20$0$4$0$0$30(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("publisher/{id}");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$31(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new w(c0Var, 16);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new b(c0Var, 24);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new h(c0Var, 11);
            qVar.h0(L3);
        }
        AuthorProfileScreenKt.AuthorProfileScreen(str2, aVar, lVar, (ho.p) L3, null, qVar, 0, 16);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$31$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$31$1$0(na.c0 c0Var, String str) {
        str.getClass();
        na.n.c(c0Var, Routes.INSTANCE.readDetails(str));
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$31$2$0(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$32(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("voice/{id}");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$33(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$34(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$35(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new w(c0Var, 8);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(d0Var) | qVar.h(routerViewModel) | qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new u(3, d0Var, routerViewModel, c0Var);
            qVar.h0(L2);
        }
        VoiceDetailsScreenKt.VoiceDetailsScreen(str2, aVar, (ho.l) L2, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$35$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$35$1$0(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, String str) {
        str.getClass();
        Router$lambda$20$0$4$0$navigateToReadDetailsOrPlayer(c0Var, d0Var, routerViewModel, str, null, Analytics.Event.PlayerActivationSource.VoiceDetails, Analytics.Event.PlayerAddToQueueClicked.Source.VoiceDetails);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$36(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("askSupportAgent");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$37(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInLeft(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$38(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$39(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new v(c0Var, 8);
            qVar.h0(L);
        }
        AskAgentScreenKt.AskAgentScreen((ho.a) L, null, qVar, 0, 2);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$39$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$4(RouterViewModel routerViewModel, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        OnboardingType onboardingType;
        oVar.getClass();
        jVar.getClass();
        z0 o6 = u2.r.o(routerViewModel.getStateFlow(), mVar, 0);
        if (Router$lambda$20$0$4$0$0$4$0(o6).getHasRedeemDeepLink() && kotlin.jvm.internal.m.c(Router$lambda$20$0$4$0$0$4$0(o6).getAgeOnboardingCompleted(), Boolean.FALSE)) {
            onboardingType = OnboardingType.AgeOnly;
        } else if (kotlin.jvm.internal.m.c(Router$lambda$20$0$4$0$0$4$0(o6).getAgeOnboardingCompleted(), Boolean.TRUE) && kotlin.jvm.internal.m.c(Router$lambda$20$0$4$0$0$4$0(o6).getOnboardingCompleted(), Boolean.FALSE)) {
            onboardingType = OnboardingType.DynamicQuestions;
        } else {
            onboardingType = OnboardingType.Entire;
        }
        OnboardingScreenKt.OnboardingScreen(null, onboardingType, mVar, 0, 1);
        return sn.z.f31622a;
    }

    private static final RouterState Router$lambda$20$0$4$0$0$4$0(s2 s2Var) {
        return (RouterState) s2Var.getValue();
    }

    private static final sn.z Router$lambda$20$0$4$0$0$40(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("read/{id}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$41(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("redeem/{id}/{code}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$42(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getPublicDeepLink("/app/reader/shared/{ownerId}/{id}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$43(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getPublicDeepLink("/audiobooks/{id}");
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$44(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getPublicDeepLink("/audiobooks/{slug}/{id}");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$45(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, q2 q2Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        qa.c cVar = jVar.Z;
        Bundle a10 = cVar.a();
        String str2 = null;
        if (a10 != null) {
            str = a10.getString("id");
        } else {
            str = null;
        }
        str.getClass();
        Bundle a11 = cVar.a();
        if (a11 != null) {
            str2 = a11.getString("code");
        }
        String str3 = str2;
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new l(c0Var, 20);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(d0Var) | qVar.h(routerViewModel) | qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new q(1, d0Var, routerViewModel, c0Var);
            qVar.h0(L2);
        }
        ho.p pVar = (ho.p) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new b(c0Var, 8);
            qVar.h0(L3);
        }
        ho.l lVar = (ho.l) L3;
        boolean h13 = qVar.h(c0Var) | qVar.h(q2Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new k(c0Var, q2Var, 3);
            qVar.h0(L4);
        }
        ho.l lVar2 = (ho.l) L4;
        boolean h14 = qVar.h(c0Var);
        Object L5 = qVar.L();
        if (h14 || L5 == eVar) {
            L5 = new b(c0Var, 9);
            qVar.h0(L5);
        }
        ho.l lVar3 = (ho.l) L5;
        boolean h15 = qVar.h(routerViewModel);
        Object L6 = qVar.L();
        if (h15 || L6 == eVar) {
            L6 = new s(routerViewModel, 1);
            qVar.h0(L6);
        }
        ReadDetailsScreenKt.ReadDetailsScreen(str, str3, aVar, pVar, lVar, lVar2, lVar3, (ho.a) L6, null, qVar, 0, RpcError.MAX_MESSAGE_BYTES);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$45$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$45$1$0(fr.d0 d0Var, na.c0 c0Var, RouterViewModel routerViewModel, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        fr.g0.D(d0Var, null, null, new RouterKt$Router$16$1$5$1$1$44$2$1$1(c0Var, str, playerActivationSource, routerViewModel, null), 3);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$45$2$0(na.c0 c0Var, String str) {
        str.getClass();
        na.n.c(c0Var, Routes.INSTANCE.authorProfile(str));
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$45$3$0(na.c0 c0Var, q2 q2Var, String str) {
        str.getClass();
        if (!NavigationExtensions.INSTANCE.launchDeeplink(c0Var, str)) {
            q2Var.openUri(str);
        }
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$45$4$0(na.c0 c0Var, String str) {
        str.getClass();
        na.n.c(c0Var, Routes.INSTANCE.readDetails(str));
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$45$5$0(RouterViewModel routerViewModel) {
        routerViewModel.requestStartSelectiveStackPopping(ig.f.I("player/", "read/"));
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$46(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("account");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$47(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$48(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeOut();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$49(na.c0 c0Var, q2 q2Var, RouterViewModel routerViewModel, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        na.x xVar;
        q7.c cVar;
        oVar.getClass();
        jVar.getClass();
        z0 l4 = android.support.v4.media.session.b.l(c0Var, mVar);
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(Router$lambda$20$0$4$0$0$49$0(l4));
        Object L = qVar.L();
        Object obj = u2.l.f33918a;
        if (f10 || L == obj) {
            na.j Router$lambda$20$0$4$0$0$49$0 = Router$lambda$20$0$4$0$0$49$0(l4);
            if (Router$lambda$20$0$4$0$0$49$0 != null && (xVar = Router$lambda$20$0$4$0$0$49$0.f24329b) != null) {
                str = (String) xVar.f24395b.f1674e;
            } else {
                str = null;
            }
            L = Boolean.valueOf(kotlin.jvm.internal.m.c(str, Routes.settingsRoute));
            qVar.h0(L);
        }
        Boolean bool = (Boolean) L;
        boolean booleanValue = bool.booleanValue();
        androidx.lifecycle.r1 a10 = r7.a.a(qVar);
        if (a10 != null) {
            pl.f o6 = tb.a.o(a10, qVar);
            if (a10 instanceof androidx.lifecycle.o) {
                cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
            } else {
                cVar = q7.a.f28123b;
            }
            AccountViewModel accountViewModel = (AccountViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(AccountViewModel.class), a10, null, o6, cVar, qVar);
            boolean h10 = qVar.h(accountViewModel) | qVar.g(booleanValue);
            Object L2 = qVar.L();
            if (h10 || L2 == obj) {
                L2 = new RouterKt$Router$16$1$5$1$1$48$1$1(accountViewModel, booleanValue, null);
                qVar.h0(L2);
            }
            u2.r.f((ho.p) L2, bool, qVar);
            AccountNavigator rememberAccountNavigator = AccountNavigatorFactoryKt.rememberAccountNavigator(c0Var, q2Var, qVar, 0);
            boolean h11 = qVar.h(routerViewModel);
            Object L3 = qVar.L();
            if (h11 || L3 == obj) {
                L3 = new r(routerViewModel, 0);
                qVar.h0(L3);
            }
            AccountScreenKt.AccountScreen(rememberAccountNavigator, accountViewModel, (ho.l) L3, qVar, 0, 0);
            return sn.z.f31622a;
        }
        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        return null;
    }

    private static final na.j Router$lambda$20$0$4$0$0$49$0(s2 s2Var) {
        return (na.j) s2Var.getValue();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$49$3$0(RouterViewModel routerViewModel, String str) {
        str.getClass();
        routerViewModel.dispatchCustomerCenterAction(str);
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$5(List list, h5.c cVar, i1.q qVar) {
        qVar.getClass();
        return AnimatedContentTransitionsKt.getTabEnterTransition(qVar, list, cVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$50(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new v(c0Var, 0);
            qVar.h0(L);
        }
        DeleteAccountScreenKt.DeleteAccountScreen((ho.a) L, null, qVar, 0, 2);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$50$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$51(na.i iVar) {
        iVar.getClass();
        na.g gVar = iVar.f24327a;
        gVar.f24309a = na.h0.f24325e;
        gVar.f24310b = true;
        gVar.f24311c = true;
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$52(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new v(c0Var, 9);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new b(c0Var, 16);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new v(c0Var, 10);
            qVar.h0(L3);
        }
        PurchaseHoursScreenKt.PurchaseHoursScreen(aVar, lVar, (ho.a) L3, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$52$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$52$1$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.paywallRoute(ProductsService.PaywallSource.DEFAULT, Analytics.Event.PaywallSource.CreditsPath, str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$52$2$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.referFriendRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$53(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("creditsHistory");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$54(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        na.x xVar;
        q7.c cVar;
        oVar.getClass();
        jVar.getClass();
        z0 l4 = android.support.v4.media.session.b.l(c0Var, mVar);
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(Router$lambda$20$0$4$0$0$54$0(l4));
        Object L = qVar.L();
        Object obj = u2.l.f33918a;
        if (f10 || L == obj) {
            na.j Router$lambda$20$0$4$0$0$54$0 = Router$lambda$20$0$4$0$0$54$0(l4);
            if (Router$lambda$20$0$4$0$0$54$0 != null && (xVar = Router$lambda$20$0$4$0$0$54$0.f24329b) != null) {
                str = (String) xVar.f24395b.f1674e;
            } else {
                str = null;
            }
            L = Boolean.valueOf(kotlin.jvm.internal.m.c(str, Routes.hoursHistoryRoute));
            qVar.h0(L);
        }
        Boolean bool = (Boolean) L;
        boolean booleanValue = bool.booleanValue();
        androidx.lifecycle.r1 a10 = r7.a.a(qVar);
        if (a10 != null) {
            pl.f o6 = tb.a.o(a10, qVar);
            if (a10 instanceof androidx.lifecycle.o) {
                cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
            } else {
                cVar = q7.a.f28123b;
            }
            HoursHistoryViewModel hoursHistoryViewModel = (HoursHistoryViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(HoursHistoryViewModel.class), a10, null, o6, cVar, qVar);
            boolean h10 = qVar.h(hoursHistoryViewModel) | qVar.g(booleanValue);
            Object L2 = qVar.L();
            if (h10 || L2 == obj) {
                L2 = new RouterKt$Router$16$1$5$1$1$53$1$1(hoursHistoryViewModel, booleanValue, null);
                qVar.h0(L2);
            }
            u2.r.f((ho.p) L2, bool, qVar);
            boolean h11 = qVar.h(c0Var);
            Object L3 = qVar.L();
            if (h11 || L3 == obj) {
                L3 = new l(c0Var, 11);
                qVar.h0(L3);
            }
            ho.a aVar = (ho.a) L3;
            boolean h12 = qVar.h(c0Var);
            Object L4 = qVar.L();
            if (h12 || L4 == obj) {
                L4 = new l(c0Var, 12);
                qVar.h0(L4);
            }
            HoursHistoryScreenKt.HoursHistoryScreen(aVar, (ho.a) L4, hoursHistoryViewModel, qVar, 0, 0);
            return sn.z.f31622a;
        }
        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        return null;
    }

    private static final na.j Router$lambda$20$0$4$0$0$54$0(s2 s2Var) {
        return (na.j) s2Var.getValue();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$54$3$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$54$4$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.purchaseCreditsRoute$default(Routes.INSTANCE, null, 1, null), false, null, 6, null);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$55(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("bookPurchases");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$56(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new v(c0Var, 6);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new v(c0Var, 7);
            qVar.h0(L2);
        }
        ho.a aVar2 = (ho.a) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new b(c0Var, 15);
            qVar.h0(L3);
        }
        BookPurchasesScreenKt.BookPurchasesScreen(aVar, aVar2, (ho.l) L3, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$56$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$56$1$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.exploreRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$56$2$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.bookRefundRoute(str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$57(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("readId");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new v(c0Var, 17);
            qVar.h0(L);
        }
        BookRefundScreenKt.BookRefundScreen(str2, (ho.a) L, null, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$57$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$58(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("paywall");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$59(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$6(List list, h5.c cVar, i1.q qVar) {
        qVar.getClass();
        return AnimatedContentTransitionsKt.getTabExitTransition(qVar, list, cVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$60(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$61(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        ProductsService.PaywallSource paywallSource;
        Analytics.Event.PaywallSource paywallSource2;
        String string;
        String string2;
        oVar.getClass();
        jVar.getClass();
        qa.c cVar = jVar.Z;
        Bundle a10 = cVar.a();
        if (a10 == null || (string2 = a10.getString("productsSource")) == null || (paywallSource = ProductsService.PaywallSource.valueOf(string2)) == null) {
            paywallSource = ProductsService.PaywallSource.DEFAULT;
        }
        ProductsService.PaywallSource paywallSource3 = paywallSource;
        Bundle a11 = cVar.a();
        if (a11 == null || (string = a11.getString("analyticsSource")) == null || (paywallSource2 = Analytics.Event.PaywallSource.valueOf(string)) == null) {
            paywallSource2 = Analytics.Event.PaywallSource.Account;
        }
        Analytics.Event.PaywallSource paywallSource4 = paywallSource2;
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new l(c0Var, 10);
            qVar.h0(L);
        }
        RevenueCatPaywallScreenKt.RevenueCatPaywallScreen(paywallSource3, paywallSource4, (ho.a) L, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$61$2$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$62(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("winback");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$63(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$64(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$65(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        ProductsService.PaywallSource paywallSource = ProductsService.PaywallSource.DEFAULT;
        Analytics.Event.PaywallSource paywallSource2 = Analytics.Event.PaywallSource.WinBack;
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new w(c0Var, 1);
            qVar.h0(L);
        }
        RevenueCatPaywallScreenKt.RevenueCatPaywallScreen(paywallSource, paywallSource2, (ho.a) L, null, qVar, 54, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$65$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$66(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("creditsLow");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$67(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$68(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$69(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(c0Var, 22);
            qVar.h0(L);
        }
        ho.l lVar = (ho.l) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new w(c0Var, 12);
            qVar.h0(L2);
        }
        HoursLowScreenKt.HoursLowScreen(lVar, (ho.a) L2, null, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$69$0$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.paywallRoute(ProductsService.PaywallSource.LISTENING_LIMIT, Analytics.Event.PaywallSource.LowCreditsSheet, str), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$69$1$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$7(RouterViewModel routerViewModel, na.c0 c0Var, fr.d0 d0Var, q2 q2Var, j2 j2Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        z1 isHomeV4Enabled = routerViewModel.getIsHomeV4Enabled();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new v(c0Var, 24);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        c3.j d10 = c3.k.d(-134787955, true, new p(oVar, j2Var, c0Var, routerViewModel, 2), qVar);
        boolean h11 = qVar.h(d0Var) | qVar.h(routerViewModel) | qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new q(c0Var, d0Var, routerViewModel);
            qVar.h0(L2);
        }
        ho.p pVar = (ho.p) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new h(c0Var, 9);
            qVar.h0(L3);
        }
        ho.p pVar2 = (ho.p) L3;
        boolean h13 = qVar.h(c0Var) | qVar.h(q2Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new k(c0Var, q2Var, 5);
            qVar.h0(L4);
        }
        ho.l lVar = (ho.l) L4;
        boolean h14 = qVar.h(c0Var);
        Object L5 = qVar.L();
        if (h14 || L5 == eVar) {
            L5 = new v(c0Var, 25);
            qVar.h0(L5);
        }
        ho.a aVar2 = (ho.a) L5;
        boolean h15 = qVar.h(c0Var);
        Object L6 = qVar.L();
        if (h15 || L6 == eVar) {
            L6 = new v(c0Var, 26);
            qVar.h0(L6);
        }
        HomeScreenKt.HomeScreen(isHomeV4Enabled, aVar, d10, pVar, pVar2, lVar, aVar2, (ho.a) L6, j2Var, oVar, qVar, ((i10 << 27) & 1879048192) | 384);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$7$0$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.settingsRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$7$1(i1.o oVar, j2 j2Var, na.c0 c0Var, RouterViewModel routerViewModel, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Router$lambda$20$0$4$0$0$BottomNav(j2Var, c0Var, routerViewModel, oVar, Routes.homeRoute, qVar, 48);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$7$2$0(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        Router$lambda$20$0$4$0$navigateToReadDetailsOrPlayer(c0Var, d0Var, routerViewModel, str, null, playerActivationSource, Analytics.Event.PlayerAddToQueueClicked.Source.HomeLongClick);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$7$3$0(na.c0 c0Var, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$7$4$0(na.c0 c0Var, q2 q2Var, String str) {
        str.getClass();
        if (!NavigationExtensions.INSTANCE.launchDeeplink(c0Var, str)) {
            q2Var.openUri(str);
        }
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$7$5$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.searchRoute("BOTH"), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$7$6$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.voiceDesignRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$70(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$71(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$72(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new l(c0Var, 21);
            qVar.h0(L);
        }
        PlayerPreferencesScreenKt.PlayerPreferencesScreen((ho.a) L, null, qVar, 0, 2);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$72$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$73(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("referralSheet");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$74(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$0$75(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$76(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new v(c0Var, 23);
            qVar.h0(L);
        }
        ReferFriendScreenKt.ReferFriendScreen((ho.a) L, null, qVar, 0, 2);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$76$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$77(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new v(c0Var, 18);
            qVar.h0(L);
        }
        ExploreLanguageSettingScreenKt.ExploreLanguageSettingScreen((ho.a) L, null, qVar, 0, 2);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$77$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$78(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("referral/{referral_code}");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$79(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    private static final sn.z Router$lambda$20$0$4$0$0$8(na.i iVar) {
        iVar.getClass();
        na.g gVar = iVar.f24327a;
        gVar.f24309a = na.h0.f24325e;
        gVar.f24310b = true;
        gVar.f24311c = true;
        return sn.z.f31622a;
    }

    public static final f1 Router$lambda$20$0$4$0$0$80(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$81(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("referral_code");
        } else {
            str = null;
        }
        String str2 = str;
        str2.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new w(c0Var, 15);
            qVar.h0(L);
        }
        UseFriendReferralScreenKt.UseFriendReferralScreen(str2, (ho.a) L, null, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$81$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$82(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new l(c0Var, 1);
            qVar.h0(L);
        }
        LicensesScreenKt.LicensesScreen((ho.a) L, qVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$82$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$83(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new RouterKt$Router$16$1$5$1$1$82$1$1(c0Var);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new v(c0Var, 27);
            qVar.h0(L2);
        }
        ho.a aVar2 = (ho.a) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new v(c0Var, 28);
            qVar.h0(L3);
        }
        ho.a aVar3 = (ho.a) L3;
        boolean h13 = qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new w(c0Var, 0);
            qVar.h0(L4);
        }
        ContentPreferencesScreenKt.ContentPreferencesScreen(aVar, aVar2, aVar3, (ho.a) L4, null, qVar, 0, 16);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$83$1$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.settingsManageContentInterestsRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$83$2$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.settingsExploreLanguageRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$83$3$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.pronunciationsListRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$84(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new RouterKt$Router$16$1$5$1$1$83$1$1(c0Var);
            qVar.h0(L);
        }
        ManageContentInterestsScreenKt.ManageContentInterestsScreen((ho.a) L, null, qVar, 0, 2);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$85(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new RouterKt$Router$16$1$5$1$1$84$1$1(c0Var);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new l(c0Var, 2);
            qVar.h0(L2);
        }
        ho.a aVar2 = (ho.a) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new l(c0Var, 3);
            qVar.h0(L3);
        }
        ManagePurchasesScreenKt.ManagePurchasesScreen(aVar, aVar2, (ho.a) L3, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$85$1$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.hoursHistoryRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$85$2$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.bookPurchasesRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$86(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("import/text");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$87(RouterViewModel routerViewModel, na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        z1 stateFlow = routerViewModel.getStateFlow();
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        Object obj = u2.l.f33918a;
        if (L == obj) {
            L = new n(0);
            qVar.h0(L);
        }
        s2 selectAsState = ComposeExtensionsKt.selectAsState(stateFlow, (ho.l) L, qVar, 48);
        PendingShare.Text Router$lambda$20$0$4$0$0$87$1 = Router$lambda$20$0$4$0$0$87$1(selectAsState);
        boolean f10 = qVar.f(selectAsState) | qVar.h(routerViewModel);
        Object L2 = qVar.L();
        String str = null;
        if (f10 || L2 == obj) {
            L2 = new RouterKt$Router$16$1$5$1$1$86$1$1(routerViewModel, selectAsState, null);
            qVar.h0(L2);
        }
        u2.r.f((ho.p) L2, Router$lambda$20$0$4$0$0$87$1, qVar);
        PendingShare.Text Router$lambda$20$0$4$0$0$87$12 = Router$lambda$20$0$4$0$0$87$1(selectAsState);
        if (Router$lambda$20$0$4$0$0$87$12 != null) {
            str = Router$lambda$20$0$4$0$0$87$12.getText();
        }
        String str2 = str;
        boolean h10 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h10 || L3 == obj) {
            L3 = new l(c0Var, 4);
            qVar.h0(L3);
        }
        ho.a aVar = (ho.a) L3;
        boolean h11 = qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h11 || L4 == obj) {
            L4 = new b(c0Var, 3);
            qVar.h0(L4);
        }
        WriteScreenKt.WriteScreen(aVar, (ho.l) L4, str2, false, null, null, qVar, 3072, 48);
        return sn.z.f31622a;
    }

    public static final PendingShare.Text Router$lambda$20$0$4$0$0$87$0$0(RouterState routerState) {
        routerState.getClass();
        PendingShare pendingShare = routerState.getPendingShare();
        if (pendingShare instanceof PendingShare.Text) {
            return (PendingShare.Text) pendingShare;
        }
        return null;
    }

    public static final PendingShare.Text Router$lambda$20$0$4$0$0$87$1(s2 s2Var) {
        return (PendingShare.Text) s2Var.getValue();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$87$3$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$87$4$0(na.c0 c0Var, ReadMeta readMeta) {
        readMeta.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.libraryRoute, false, Routes.RootRoutes.AUTHORIZED, 2, null);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$88(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("import/ocr");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$89(RouterViewModel routerViewModel, na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        z1 stateFlow = routerViewModel.getStateFlow();
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        Object obj = u2.l.f33918a;
        if (L == obj) {
            L = new n(7);
            qVar.h0(L);
        }
        s2 selectAsState = ComposeExtensionsKt.selectAsState(stateFlow, (ho.l) L, qVar, 48);
        PendingShare.Images Router$lambda$20$0$4$0$0$89$1 = Router$lambda$20$0$4$0$0$89$1(selectAsState);
        boolean f10 = qVar.f(selectAsState) | qVar.h(routerViewModel);
        Object L2 = qVar.L();
        List<String> list = null;
        if (f10 || L2 == obj) {
            L2 = new RouterKt$Router$16$1$5$1$1$88$1$1(routerViewModel, selectAsState, null);
            qVar.h0(L2);
        }
        u2.r.f((ho.p) L2, Router$lambda$20$0$4$0$0$89$1, qVar);
        PendingShare.Images Router$lambda$20$0$4$0$0$89$12 = Router$lambda$20$0$4$0$0$89$1(selectAsState);
        if (Router$lambda$20$0$4$0$0$89$12 != null) {
            list = Router$lambda$20$0$4$0$0$89$12.getUris();
        }
        if (list == null) {
            list = tn.t.f33547a;
        }
        List<String> list2 = list;
        boolean h10 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h10 || L3 == obj) {
            L3 = new b(c0Var, 23);
            qVar.h0(L3);
        }
        ho.l lVar = (ho.l) L3;
        boolean h11 = qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h11 || L4 == obj) {
            L4 = new w(c0Var, 13);
            qVar.h0(L4);
        }
        OcrImportScreenKt.OcrImportScreen(list2, lVar, (ho.a) L4, false, null, null, qVar, 3072, 48);
        return sn.z.f31622a;
    }

    public static final PendingShare.Images Router$lambda$20$0$4$0$0$89$0$0(RouterState routerState) {
        routerState.getClass();
        PendingShare pendingShare = routerState.getPendingShare();
        if (pendingShare instanceof PendingShare.Images) {
            return (PendingShare.Images) pendingShare;
        }
        return null;
    }

    public static final PendingShare.Images Router$lambda$20$0$4$0$0$89$1(s2 s2Var) {
        return (PendingShare.Images) s2Var.getValue();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$89$3$0(na.c0 c0Var, ReadMeta readMeta) {
        readMeta.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.libraryRoute, false, Routes.RootRoutes.AUTHORIZED, 2, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$89$4$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$9(na.i iVar) {
        iVar.getClass();
        na.g gVar = iVar.f24327a;
        gVar.f24309a = na.h0.f24325e;
        gVar.f24310b = true;
        gVar.f24311c = true;
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$90(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("import/link");
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$91(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new l(c0Var, 28);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new b(c0Var, 13);
            qVar.h0(L2);
        }
        PasteLinkScreenKt.PasteLinkScreen(aVar, (ho.l) L2, null, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$91$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$91$1$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.readsImportLinkRoute(str, true), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$92(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("url");
        } else {
            str = null;
        }
        str.getClass();
        String decodeUrlParam = RouterViewModelKt.decodeUrlParam(str);
        decodeUrlParam.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new l(c0Var, 19);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new b(c0Var, 10);
            qVar.h0(L2);
        }
        ImportLinkScreenKt.ImportLinkScreen(aVar, (ho.l) L2, decodeUrlParam, false, null, null, qVar, 3072, 48);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$92$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$92$1$0(na.c0 c0Var, ReadMeta readMeta) {
        readMeta.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.libraryRoute, false, Routes.RootRoutes.AUTHORIZED, 2, null);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$0$93(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("import/file");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$94(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeIn();
    }

    public static final f1 Router$lambda$20$0$4$0$0$95(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeOut();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$96(RouterViewModel routerViewModel, na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        z1 stateFlow = routerViewModel.getStateFlow();
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        Object obj = u2.l.f33918a;
        if (L == obj) {
            L = new n(6);
            qVar.h0(L);
        }
        s2 selectAsState = ComposeExtensionsKt.selectAsState(stateFlow, (ho.l) L, qVar, 48);
        PendingShare.File Router$lambda$20$0$4$0$0$96$1 = Router$lambda$20$0$4$0$0$96$1(selectAsState);
        boolean f10 = qVar.f(selectAsState) | qVar.h(routerViewModel);
        Object L2 = qVar.L();
        String str = null;
        if (f10 || L2 == obj) {
            L2 = new RouterKt$Router$16$1$5$1$1$95$1$1(routerViewModel, selectAsState, null);
            qVar.h0(L2);
        }
        u2.r.f((ho.p) L2, Router$lambda$20$0$4$0$0$96$1, qVar);
        PendingShare.File Router$lambda$20$0$4$0$0$96$12 = Router$lambda$20$0$4$0$0$96$1(selectAsState);
        if (Router$lambda$20$0$4$0$0$96$12 != null) {
            str = Router$lambda$20$0$4$0$0$96$12.getUri();
        }
        String str2 = str;
        boolean h10 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h10 || L3 == obj) {
            L3 = new w(c0Var, 3);
            qVar.h0(L3);
        }
        ho.a aVar = (ho.a) L3;
        boolean h11 = qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h11 || L4 == obj) {
            L4 = new b(c0Var, 19);
            qVar.h0(L4);
        }
        ImportFileScreenKt.ImportFileScreen(str2, aVar, (ho.l) L4, false, null, null, qVar, 3072, 48);
        return sn.z.f31622a;
    }

    public static final PendingShare.File Router$lambda$20$0$4$0$0$96$0$0(RouterState routerState) {
        routerState.getClass();
        PendingShare pendingShare = routerState.getPendingShare();
        if (pendingShare instanceof PendingShare.File) {
            return (PendingShare.File) pendingShare;
        }
        return null;
    }

    public static final PendingShare.File Router$lambda$20$0$4$0$0$96$1(s2 s2Var) {
        return (PendingShare.File) s2Var.getValue();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$96$3$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$96$4$0(na.c0 c0Var, ReadMeta readMeta) {
        readMeta.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.libraryRoute, false, Routes.RootRoutes.AUTHORIZED, 2, null);
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$0$97(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeIn();
    }

    public static final f1 Router$lambda$20$0$4$0$0$98(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.getAnimationFadeOut();
    }

    public static final sn.z Router$lambda$20$0$4$0$0$99(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        qa.c cVar = jVar.Z;
        Bundle a10 = cVar.a();
        String str2 = null;
        if (a10 != null) {
            str = a10.getString("ownerId");
        } else {
            str = null;
        }
        str.getClass();
        Bundle a11 = cVar.a();
        if (a11 != null) {
            str2 = a11.getString("readId");
        }
        String str3 = str2;
        str3.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(c0Var, 14);
            qVar.h0(L);
        }
        ho.l lVar = (ho.l) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new v(c0Var, 5);
            qVar.h0(L2);
        }
        AddSharedReadScreenKt.AddSharedReadScreen(str, str3, lVar, (ho.a) L2, null, qVar, 0, 16);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$99$0$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.INSTANCE.playerRoute(str, Analytics.Event.PlayerActivationSource.SharedRead.getValue()), true, null, 4, null);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$99$1$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [i3.t, java.lang.Object, i1.r1] */
    private static final void Router$lambda$20$0$4$0$0$BottomNav(j2 j2Var, na.c0 c0Var, RouterViewModel routerViewModel, i1.g0 g0Var, String str, u2.m mVar, int i10) {
        j2Var.getClass();
        i2 c5 = j2.c("bottom-navigation", mVar);
        List<BottomNavigationItem> bottomNavigationRoutes = BottomNavigationKt.getBottomNavigationRoutes();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(routerViewModel);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new s(routerViewModel, 3);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(routerViewModel);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new r(routerViewModel, 1);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        e1 e10 = y0.e(j1.e.s(150, 0, null, 6), 2);
        g1 f10 = y0.f(j1.e.s(150, 0, null, 6), 2);
        f4.p pVar = f4.q.f8841d;
        i3.l lVar2 = i3.d.f13001e;
        n0 n0Var = i1.s2.f12910c;
        Object g10 = n0Var.g(pVar);
        if (g10 == null) {
            g10 = new n0();
            n0Var.m(pVar, g10);
        }
        n0 n0Var2 = (n0) g10;
        Object g11 = n0Var2.g(lVar2);
        if (g11 == null) {
            g11 = new Object();
            n0Var2.m(lVar2, g11);
        }
        h2.f12775a.getClass();
        o2 o2Var = (o2) j2Var;
        i3.t a10 = i3.a.a(new n2(c5, g0Var.a(), i1.e.H0, o2Var, f2.f12756b, false, i1.s2.f12909b, e2.f12743a), i3.q.f13017a);
        i3.t a11 = i3.a.a(new m2(g0Var, e10, f10, c5, (t1) g11), a10);
        i1.a0 a0Var = new i1.a0(j2Var, 1);
        ?? obj = new Object();
        obj.f12892a = o2Var;
        obj.f12893b = a0Var;
        BottomNavigationKt.BottomNavigation(c0Var, bottomNavigationRoutes, str, aVar, lVar, a11.then(obj), qVar, (i10 << 3) & 896, 0);
    }

    public static final sn.z Router$lambda$20$0$4$0$0$BottomNav$0$0(RouterViewModel routerViewModel) {
        routerViewModel.showImportSheet();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$0$BottomNav$1$0(RouterViewModel routerViewModel, BottomNavigationItem bottomNavigationItem) {
        bottomNavigationItem.getClass();
        routerViewModel.getAnalytics().log(new Analytics.Event.TabClicked(bottomNavigationItem.getAnalyticsLabel()));
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$1(na.v vVar) {
        vVar.getClass();
        vVar.f24386b = getDeepLink("voiceDesign");
        return sn.z.f31622a;
    }

    public static final d1 Router$lambda$20$0$4$0$2(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideInUp(qVar);
    }

    public static final f1 Router$lambda$20$0$4$0$3(i1.q qVar) {
        qVar.getClass();
        return NavigationAnimations.INSTANCE.animationSlideOutDown(qVar);
    }

    public static final sn.z Router$lambda$20$0$4$0$4(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new l(c0Var, 17);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new b(c0Var, 7);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new l(c0Var, 18);
            qVar.h0(L3);
        }
        VoiceDesignScreenKt.VoiceDesignScreen(aVar, lVar, (ho.a) L3, null, qVar, 0, 8);
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$4$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$4$1$0(na.c0 c0Var, String str) {
        Object obj;
        androidx.lifecycle.z0 z0Var;
        str.getClass();
        Iterator it = tn.o.U0(c0Var.f24352b.f28164f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((vq.a) vq.k.j0(it)).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((na.j) obj).f24329b instanceof na.y)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        na.j jVar = (na.j) obj;
        if (jVar != null && (z0Var = (androidx.lifecycle.z0) jVar.f24334x0.getValue()) != null) {
            z0Var.c("createdVoiceId", str);
        }
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z Router$lambda$20$0$4$0$4$2$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.paywallRoute$default(Routes.INSTANCE, ProductsService.PaywallSource.VOICE_DESIGN, Analytics.Event.PaywallSource.VoiceDesign, (String) null, 4, (Object) null), false, null, 6, null);
        return sn.z.f31622a;
    }

    private static final sn.z Router$lambda$20$0$4$0$5(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        DevScreenKt.DevScreen(c0Var, mVar, 0);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Router$lambda$20$0$4$0$navigateToPlayerWithClearQueueConfirmation(na.c0 c0Var, RouterViewModel routerViewModel, String str, String str2, Analytics.Event.PlayerActivationSource playerActivationSource, Analytics.Event.PlayerAddToQueueClicked.Source source, wn.c<? super sn.z> cVar) {
        RouterKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1 routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1;
        Object obj;
        int i10;
        if (cVar instanceof RouterKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1) {
            routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1 = (RouterKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1) cVar;
            int i11 = routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.label = i11 - Integer.MIN_VALUE;
                obj = routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.result;
                i10 = routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        source = (Analytics.Event.PlayerAddToQueueClicked.Source) routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$5;
                        playerActivationSource = (Analytics.Event.PlayerActivationSource) routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$4;
                        str2 = (String) routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$3;
                        str = (String) routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$2;
                        routerViewModel = (RouterViewModel) routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$1;
                        c0Var = (na.c0) routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$0 = c0Var;
                    routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$1 = routerViewModel;
                    routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$2 = str;
                    routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$3 = str2;
                    routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$4 = playerActivationSource;
                    routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.L$5 = source;
                    routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.label = 1;
                    obj = routerViewModel.shouldConfirmBeforeNavigatingToPlayer(str, routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                na.c0 c0Var2 = c0Var;
                if (!((Boolean) obj).booleanValue()) {
                    routerViewModel.showClearPlayerQueueConfirmation(str, str2, playerActivationSource, source);
                } else {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var2, Routes.INSTANCE.playerRoute(str, playerActivationSource.getValue()), false, null, 6, null);
                }
                return sn.z.f31622a;
            }
        }
        routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1 = new RouterKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1(cVar);
        obj = routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.result;
        i10 = routerKt$Router$16$1$5$1$navigateToPlayerWithClearQueueConfirmation$1.label;
        if (i10 == 0) {
        }
        na.c0 c0Var22 = c0Var;
        if (!((Boolean) obj).booleanValue()) {
        }
        return sn.z.f31622a;
    }

    private static final void Router$lambda$20$0$4$0$navigateToReadDetailsOrPlayer(na.c0 c0Var, fr.d0 d0Var, RouterViewModel routerViewModel, String str, String str2, Analytics.Event.PlayerActivationSource playerActivationSource, Analytics.Event.PlayerAddToQueueClicked.Source source) {
        fr.g0.D(d0Var, null, null, new RouterKt$Router$16$1$5$1$navigateToReadDetailsOrPlayer$1(routerViewModel, str, c0Var, str2, playerActivationSource, source, null), 3);
    }

    public static final sn.z Router$lambda$21(na.c0 c0Var, RouterViewModel routerViewModel, int i10, u2.m mVar, int i11) {
        Router(c0Var, routerViewModel, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Router$lambda$3(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z Router$lambda$9$0(RouterViewModel routerViewModel) {
        routerViewModel.hideImportSheet();
        return sn.z.f31622a;
    }

    private static final String getDeepLink(String str) {
        return defpackage.f.i("elevenlabs://", str);
    }

    private static final String getPublicDeepLink(String str) {
        return defpackage.f.i("https://elevenreader.io", str);
    }

    private static final String resolvedRoute(na.j jVar) {
        String str = (String) jVar.f24329b.f24395b.f1674e;
        if (str == null) {
            return null;
        }
        Bundle a10 = jVar.Z.a();
        if (a10 == null) {
            return str;
        }
        return routeArgPattern.f(str, new g0(a10, 1));
    }

    public static final CharSequence resolvedRoute$lambda$0(Bundle bundle, wq.h hVar) {
        hVar.getClass();
        wq.i iVar = (wq.i) hVar;
        String string = bundle.getString((String) ((tn.c0) iVar.a()).get(1));
        if (string != null) {
            return string;
        }
        String group = iVar.f37255a.group();
        group.getClass();
        return group;
    }

    private static final void splashRoutes(na.z zVar, int i10) {
        ae.l.u(zVar, Routes.RootRoutes.SPLASH, null, null, null, new io.elevenlabs.highlighter.t(i10, 6), ComposableSingletons$RouterKt.INSTANCE.m1014getLambda$1170655502$app_productionRelease(), 238);
    }

    public static final f1 splashRoutes$lambda$0(int i10, i1.q qVar) {
        qVar.getClass();
        return y0.f(j1.e.s(i10, 0, null, 6), 2);
    }

    private static final void unauthorizedRoutes(na.z zVar, int i10, na.c0 c0Var) {
        na.z zVar2 = new na.z(zVar.f24399f, Routes.authRoute, Routes.RootRoutes.ANONYMOUS);
        ae.l.u(zVar2, Routes.authRoute, null, null, new io.elevenlabs.highlighter.t(i10, 7), null, new c3.j(new c(c0Var, 22), true, -43656043), 246);
        ae.l.u(zVar2, Routes.signInEmailRoute, null, null, null, null, new c3.j(new c(c0Var, 23), true, -831109250), 254);
        ae.l.u(zVar2, Routes.signUpEmailRoute, null, null, new io.elevenlabs.highlighter.t(i10, 8), null, new c3.j(new c(c0Var, 24), true, -1505176035), 246);
        ae.l.u(zVar2, unauthorizedRoutes$lambda$0$verifyEmailRoute("{email}", false), null, null, null, null, new c3.j(new c(c0Var, 25), true, 2115724476), 254);
        ae.l.u(zVar2, Routes.mfaVerificationRoute, null, null, new io.elevenlabs.highlighter.t(i10, 9), null, new c3.j(new c(c0Var, 26), true, 1441657691), 246);
        zVar.f24401h.add(zVar2.a());
    }

    public static final d1 unauthorizedRoutes$lambda$0$0(int i10, i1.q qVar) {
        qVar.getClass();
        return y0.e(j1.e.s(i10, 0, null, 6), 2);
    }

    public static final sn.z unauthorizedRoutes$lambda$0$1(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        SignInMode signInMode = SignInMode.INTRO;
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(c0Var, 17);
            qVar.h0(L);
        }
        ho.l lVar = (ho.l) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new v(c0Var, 13);
            qVar.h0(L2);
        }
        ho.a aVar = (ho.a) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new v(c0Var, 14);
            qVar.h0(L3);
        }
        ho.a aVar2 = (ho.a) L3;
        boolean h13 = qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new v(c0Var, 15);
            qVar.h0(L4);
        }
        ho.a aVar3 = (ho.a) L4;
        boolean h14 = qVar.h(c0Var);
        Object L5 = qVar.L();
        if (h14 || L5 == eVar) {
            L5 = new v(c0Var, 16);
            qVar.h0(L5);
        }
        AuthScreenKt.AuthScreen(signInMode, lVar, aVar, aVar2, aVar3, (ho.a) L5, null, qVar, 6, 64);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$1$0$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, unauthorizedRoutes$lambda$0$verifyEmailRoute(str, true), false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$1$1$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.signInEmailRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$1$2$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.signUpEmailRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$1$3$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.mfaVerificationRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$1$4$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$2(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        SignInMode signInMode = SignInMode.SIGN_IN_EMAIL;
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(c0Var, 0);
            qVar.h0(L);
        }
        ho.l lVar = (ho.l) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new l(c0Var, 24);
            qVar.h0(L2);
        }
        ho.a aVar = (ho.a) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new w(c0Var, 18);
            qVar.h0(L3);
        }
        ho.a aVar2 = (ho.a) L3;
        boolean h13 = qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new w(c0Var, 19);
            qVar.h0(L4);
        }
        ho.a aVar3 = (ho.a) L4;
        boolean h14 = qVar.h(c0Var);
        Object L5 = qVar.L();
        if (h14 || L5 == eVar) {
            L5 = new w(c0Var, 21);
            qVar.h0(L5);
        }
        AuthScreenKt.AuthScreen(signInMode, lVar, aVar, aVar2, aVar3, (ho.a) L5, null, qVar, 6, 64);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$2$0$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, unauthorizedRoutes$lambda$0$verifyEmailRoute(str, true), true, null, 4, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$2$1$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.signInEmailRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$2$2$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.signUpEmailRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$2$3$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.mfaVerificationRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$2$4$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final d1 unauthorizedRoutes$lambda$0$3(int i10, i1.q qVar) {
        qVar.getClass();
        return y0.e(j1.e.s(i10, 0, null, 6), 2);
    }

    public static final sn.z unauthorizedRoutes$lambda$0$4(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        SignInMode signInMode = SignInMode.SIGN_UP_EMAIL;
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(c0Var, 12);
            qVar.h0(L);
        }
        ho.l lVar = (ho.l) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new v(c0Var, 1);
            qVar.h0(L2);
        }
        ho.a aVar = (ho.a) L2;
        boolean h12 = qVar.h(c0Var);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new v(c0Var, 2);
            qVar.h0(L3);
        }
        ho.a aVar2 = (ho.a) L3;
        boolean h13 = qVar.h(c0Var);
        Object L4 = qVar.L();
        if (h13 || L4 == eVar) {
            L4 = new v(c0Var, 3);
            qVar.h0(L4);
        }
        ho.a aVar3 = (ho.a) L4;
        boolean h14 = qVar.h(c0Var);
        Object L5 = qVar.L();
        if (h14 || L5 == eVar) {
            L5 = new v(c0Var, 4);
            qVar.h0(L5);
        }
        AuthScreenKt.AuthScreen(signInMode, lVar, aVar, aVar2, aVar3, (ho.a) L5, null, qVar, 6, 64);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$4$0$0(na.c0 c0Var, String str) {
        str.getClass();
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, unauthorizedRoutes$lambda$0$verifyEmailRoute(str, true), true, null, 4, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$4$1$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.signInEmailRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$4$2$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.signUpEmailRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$4$3$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.mfaVerificationRoute, false, null, 6, null);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$4$4$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$5(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        String str;
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new w(c0Var, 9);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        Bundle a10 = jVar.Z.a();
        if (a10 != null) {
            str = a10.getString("email");
        } else {
            str = null;
        }
        str.getClass();
        String decodeUrlParam = RouterViewModelKt.decodeUrlParam(str);
        decodeUrlParam.getClass();
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new w(c0Var, 10);
            qVar.h0(L2);
        }
        VerifyEmailScreenKt.VerifyEmailScreen(aVar, decodeUrlParam, null, (ho.a) L2, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$5$0$0(na.c0 c0Var) {
        c0Var.d();
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$5$1$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.signInEmailRoute, true, null, 4, null);
        return sn.z.f31622a;
    }

    public static final d1 unauthorizedRoutes$lambda$0$6(int i10, i1.q qVar) {
        qVar.getClass();
        return y0.e(j1.e.s(i10, 0, null, 6), 2);
    }

    public static final sn.z unauthorizedRoutes$lambda$0$7(na.c0 c0Var, i1.o oVar, na.j jVar, u2.m mVar, int i10) {
        oVar.getClass();
        jVar.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(c0Var);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new l(c0Var, 9);
            qVar.h0(L);
        }
        ho.a aVar = (ho.a) L;
        boolean h11 = qVar.h(c0Var);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new RouterKt$unauthorizedRoutes$1$8$2$1(c0Var);
            qVar.h0(L2);
        }
        MfaVerificationScreenKt.MfaVerificationScreen(aVar, (ho.a) L2, null, qVar, 0, 4);
        return sn.z.f31622a;
    }

    public static final sn.z unauthorizedRoutes$lambda$0$7$0$0(na.c0 c0Var) {
        NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0Var, Routes.RootRoutes.AUTHORIZED, false, Routes.RootRoutes.ANONYMOUS, 2, null);
        return sn.z.f31622a;
    }

    private static final String unauthorizedRoutes$lambda$0$verifyEmailRoute(String str, boolean z6) {
        if (z6) {
            str = RouterViewModelKt.encodeUrlParam(str);
        }
        return defpackage.f.i("anonymous/verify-email/", str);
    }
}
