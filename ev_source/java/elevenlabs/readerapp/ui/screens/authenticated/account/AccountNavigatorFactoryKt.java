package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import i4.q2;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.readerapp.core.router.NavigationExtensions;
import io.elevenlabs.readerapp.core.router.Routes;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import na.c0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lna/c0;", "navController", "Li4/q2;", "uriHandler", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountNavigator;", "rememberAccountNavigator", "(Lna/c0;Li4/q2;Lu2/m;I)Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountNavigator;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AccountNavigatorFactoryKt {
    public static final AccountNavigator rememberAccountNavigator(final c0 c0Var, final q2 q2Var, u2.m mVar, int i10) {
        c0Var.getClass();
        q2Var.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(c0Var) | qVar.f(q2Var);
        Object L = qVar.L();
        if (f10 || L == u2.l.f33918a) {
            L = new AccountNavigator() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigatorFactoryKt$rememberAccountNavigator$1$1
                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public boolean goBack() {
                    return c0.this.d();
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToContentPreferences() {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0.this, Routes.settingsContentPreferencesRoute, false, null, 6, null);
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToDeleteAccount() {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0.this, Routes.settingsDeleteAccountRoute, false, null, 6, null);
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToDev() {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0.this, Routes.RootRoutes.DEV, false, null, 6, null);
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToFriendReferral() {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0.this, Routes.referFriendRoute, false, null, 6, null);
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToGetMoreCredits() {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0.this, Routes.INSTANCE.purchaseCreditsRoute(null), false, null, 6, null);
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToHoursHistory() {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0.this, Routes.hoursHistoryRoute, false, null, 6, null);
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToLicences() {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0.this, Routes.settingsLicensesRoute, false, null, 6, null);
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToLink(String url) {
                    url.getClass();
                    if (!NavigationExtensions.INSTANCE.launchDeeplink(c0.this, url)) {
                        q2Var.openUri(url);
                    }
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToManagePurchases() {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0.this, Routes.settingsManagePurchasesRoute, false, null, 6, null);
                }

                @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
                public void navigateToPaywall() {
                    NavigationExtensions.navigateSingleTop$default(NavigationExtensions.INSTANCE, c0.this, Routes.paywallRoute$default(Routes.INSTANCE, ProductsService.PaywallSource.DEFAULT, Analytics.Event.PaywallSource.Account, (String) null, 4, (Object) null), false, null, 6, null);
                }
            };
            qVar.h0(L);
        }
        return (AccountNavigatorFactoryKt$rememberAccountNavigator$1$1) L;
    }
}
