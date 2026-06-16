package io.elevenlabs.readerapp.ui.previews;

import ig.f;
import io.elevenlabs.domain.model.AccountPage;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\b\u001a\u0006\u0010\t\u001a\u00020\n\u001a\u0006\u0010\u000b\u001a\u00020\b\u001a\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"stubAccountPageFree", "Lio/elevenlabs/domain/model/AccountPage;", "stubAccountPagePaid", "stubCreditsSection", "Lio/elevenlabs/domain/model/AccountPage$Section$Credits;", "stubLocalSettingsSection", "Lio/elevenlabs/domain/model/AccountPage$Section$LocalSettings;", "stubHelpfulResources", "Lio/elevenlabs/domain/model/AccountPage$Section$HelpfulResourcesV2;", "stubTermsAndConditions", "Lio/elevenlabs/domain/model/AccountPage$Section$TermsAndConditions;", "stubHelpfulResourcesNoIcons", "stubAccountNavigator", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/AccountNavigator;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AccountFactoryKt {
    public static final AccountNavigator stubAccountNavigator() {
        return new AccountNavigator() { // from class: io.elevenlabs.readerapp.ui.previews.AccountFactoryKt$stubAccountNavigator$1
            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public boolean goBack() {
                return true;
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToLink(String url) {
                url.getClass();
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToContentPreferences() {
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToDeleteAccount() {
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToDev() {
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToFriendReferral() {
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToGetMoreCredits() {
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToHoursHistory() {
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToLicences() {
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToManagePurchases() {
            }

            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountNavigator
            public void navigateToPaywall() {
            }
        };
    }

    public static final AccountPage stubAccountPageFree() {
        return new AccountPage(f.I(stubCreditsSection(), stubLocalSettingsSection(), stubHelpfulResources()));
    }

    public static final AccountPage stubAccountPagePaid() {
        return new AccountPage(f.I(AccountPage.Section.Credits.copy$default(stubCreditsSection(), "ultra", true, false, null, null, null, 0, 124, null), stubLocalSettingsSection(), stubHelpfulResources()));
    }

    public static final AccountPage.Section.Credits stubCreditsSection() {
        return new AccountPage.Section.Credits("free", false, true, "2", "Hours of listening remaining", "2 credits expiring this week", 2);
    }

    public static final AccountPage.Section.HelpfulResourcesV2 stubHelpfulResources() {
        return new AccountPage.Section.HelpfulResourcesV2("Help & Support", f.I(new AccountPage.Section.HelpfulResourcesV2.Item("Report Copyright Issue", "https://example.com", "warning_bubble_filled"), new AccountPage.Section.HelpfulResourcesV2.Item("Report Inappropriate Content", "https://example.com", "warning_bubble_filled"), new AccountPage.Section.HelpfulResourcesV2.Item("Frequently Asked Questions", "https://example.com", "help_circle_filled"), new AccountPage.Section.HelpfulResourcesV2.Item("Help Center", "https://example.com", "lifebelt_filled")));
    }

    public static final AccountPage.Section.HelpfulResourcesV2 stubHelpfulResourcesNoIcons() {
        return new AccountPage.Section.HelpfulResourcesV2("Resources", f.I(new AccountPage.Section.HelpfulResourcesV2.Item("Apply to Publish Your Books", "https://example.com", null), new AccountPage.Section.HelpfulResourcesV2.Item("Share Product Feedback", "https://example.com", null)));
    }

    public static final AccountPage.Section.LocalSettings stubLocalSettingsSection() {
        return AccountPage.Section.LocalSettings.INSTANCE;
    }

    public static final AccountPage.Section.TermsAndConditions stubTermsAndConditions() {
        return new AccountPage.Section.TermsAndConditions("Terms & Conditions", f.I(new AccountPage.Section.TermsAndConditions.Item("Terms of Service", "https://example.com/terms", "book_filled"), new AccountPage.Section.TermsAndConditions.Item("Privacy Policy", "https://example.com/privacy", "warning_triangle_filled")));
    }
}
