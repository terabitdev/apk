package io.elevenlabs.readerapp.core.router;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.ReadCreationStatus;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ProductsService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001]B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u001e\u001a\u00020\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J \u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\u0005J \u0010+\u001a\u00020\u00052\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\b\u0002\u0010.\u001a\u00020\u0005J\u0016\u0010%\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005J&\u0010&\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010;\u001a\u00020\u0005J\u0016\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010>\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u0005J\u000e\u0010A\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005J\u000e\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005J\u000e\u0010D\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010E\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u0005J\u0016\u0010H\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010I\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010J\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005J\u0016\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005J\u000e\u0010M\u001a\u00020\u00052\u0006\u0010N\u001a\u00020\u0005J\u0016\u0010O\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u00052\u0006\u0010Q\u001a\u00020\u0005J\u0016\u0010R\u001a\u00020\u00052\u0006\u0010S\u001a\u00020T2\u0006\u0010Q\u001a\u00020UJ\u000e\u0010V\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u0005J\u000e\u0010W\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u0005J\u000e\u0010X\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u0005J\u000e\u0010Y\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010Z\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lio/elevenlabs/readerapp/core/router/Routes;", "", "<init>", "()V", "onboardingRoute", "", "authSplashRoute", "readsImportTextRoute", "readsImportOcrRoute", "readsImportFileRoute", "readsPasteLinkRoute", "readsImportLinkRoute", "param", "encode", "", "homeRoute", "libraryRoute", "libraryPattern", "exploreRoute", "voicesRoute", "voiceDesignRoute", "settingsRoute", "settingsLicensesRoute", "settingsDeleteAccountRoute", "settingsExploreLanguageRoute", "settingsContentPreferencesRoute", "settingsPlayerPreferencesRoute", "settingsManageContentInterestsRoute", "settingsManagePurchasesRoute", "purchaseCreditsRoutePattern", "purchaseCreditsRoute", "context", "hoursHistoryRoute", "bookPurchasesRoute", "bookRefundRoute", "readId", "followedSeriesRoute", "pronunciationAddRoute", "pronunciationEditRoute", "authRoute", "signInEmailRoute", "signUpEmailRoute", "mfaVerificationRoute", "paywallRoute", "productsSourceString", "analyticsSourceString", "defaultProductId", "productsSource", "Lio/elevenlabs/domain/services/ProductsService$PaywallSource;", "analyticsSource", "Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "winBackPaywallRoute", "lowCreditsRoute", "referFriendRoute", "useReferralRoute", "pronunciationsListRoute", "voiceId", "originalText", "pronunciationId", "spokenText", "addSharedReadRoute", "ownerId", "readDetails", "authorProfile", "authorId", "voiceDetails", "searchRoute", "corpus", "readVoicePicker", "readSoundscapes", "voiceCollection", "collectionId", "voiceCollectionForRead", "readGenFMLoading", "readShareDetailsRoute", "bookmarkShareDetailsRoute", "bookmarkId", "offlineDownloadLimitReachedRoute", "message", "playerRoute", "id", "source", "playerOrLoaderRoute", "read", "Lio/elevenlabs/domain/model/ReadMeta;", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "libraryCollectionRoute", "exploreCollectionRoute", "collectionAddReadsRoute", "editCollectionRoute", "askSupportAgent", "getAskSupportAgent", "()Ljava/lang/String;", "RootRoutes", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class Routes {
    public static final int $stable = 0;
    public static final Routes INSTANCE = new Routes();
    private static final String askSupportAgent = "authorized/askSupportAgent";
    public static final String authRoute = "anonymous/auth";
    public static final String authSplashRoute = "authorized/splash";
    public static final String bookPurchasesRoute = "authorized/bookPurchases";
    public static final String exploreRoute = "authorized/explore";
    public static final String followedSeriesRoute = "authorized/followedSeries";
    public static final String homeRoute = "authorized/home";
    public static final String hoursHistoryRoute = "authorized/creditsHistory";
    public static final String libraryPattern = "authorized/reads?sortBy={sortBy}";
    public static final String libraryRoute = "authorized/reads";
    public static final String lowCreditsRoute = "authorized/creditsLow";
    public static final String mfaVerificationRoute = "anonymous/mfa-verification";
    public static final String offlineDownloadLimitReachedRoute = "authorized/offline-download-limit-reached/{encodedMessage}";
    public static final String onboardingRoute = "authorized/onboarding";
    public static final String pronunciationAddRoute = "authorized/pronunciations/add/{voiceId}/{encodedOriginalText}";
    public static final String pronunciationEditRoute = "authorized/pronunciations/edit/{voiceId}/{encodedPronunciationId}/{encodedOriginalText}/{encodedSpokenText}";
    public static final String pronunciationsListRoute = "authorized/pronunciations";
    public static final String purchaseCreditsRoutePattern = "authorized/get-more-credits?context={context}";
    public static final String readsImportFileRoute = "authorized/reads/import/file";
    public static final String readsImportOcrRoute = "authorized/reads/import/ocr";
    public static final String readsImportTextRoute = "authorized/reads/import/text";
    public static final String readsPasteLinkRoute = "authorized/reads/import/link";
    public static final String referFriendRoute = "authorized/referralSheet";
    public static final String settingsContentPreferencesRoute = "authorized/settings/content-preferences";
    public static final String settingsDeleteAccountRoute = "authorized/settings/delete-account";
    public static final String settingsExploreLanguageRoute = "authorized/settings/explore-language";
    public static final String settingsLicensesRoute = "authorized/settings/licenses";
    public static final String settingsManageContentInterestsRoute = "authorized/settings/manage-content-interests";
    public static final String settingsManagePurchasesRoute = "authorized/settings/manage-purchases";
    public static final String settingsPlayerPreferencesRoute = "authorized/settings/player-preferences";
    public static final String settingsRoute = "authorized/settings";
    public static final String signInEmailRoute = "anonymous/sign-in-email";
    public static final String signUpEmailRoute = "anonymous/sign-up-email";
    public static final String useReferralRoute = "authorized/useReferral";
    public static final String voiceDesignRoute = "authorized/voice-design";
    public static final String voicesRoute = "authorized/voices";
    public static final String winBackPaywallRoute = "authorized/winback";

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/elevenlabs/readerapp/core/router/Routes$RootRoutes;", "", "<init>", "()V", "AUTHORIZED", "", "ANONYMOUS", "SPLASH", "DEV", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class RootRoutes {
        public static final int $stable = 0;
        public static final String ANONYMOUS = "anonymous";
        public static final String AUTHORIZED = "authorized";
        public static final String DEV = "dev";
        public static final RootRoutes INSTANCE = new RootRoutes();
        public static final String SPLASH = "splash";

        private RootRoutes() {
        }
    }

    private Routes() {
    }

    public static /* synthetic */ String paywallRoute$default(Routes routes, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        return routes.paywallRoute(str, str2, str3);
    }

    public static /* synthetic */ String purchaseCreditsRoute$default(Routes routes, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return routes.purchaseCreditsRoute(str);
    }

    public final String addSharedReadRoute(String ownerId, String readId) {
        ownerId.getClass();
        readId.getClass();
        return "authorized/addSharedRead/" + ownerId + Separators.SLASH + readId;
    }

    public final String authorProfile(String authorId) {
        authorId.getClass();
        return "authorized/publisher/".concat(authorId);
    }

    public final String bookRefundRoute(String readId) {
        readId.getClass();
        return "authorized/bookPurchases/".concat(readId);
    }

    public final String bookmarkShareDetailsRoute(String bookmarkId, String voiceId) {
        bookmarkId.getClass();
        voiceId.getClass();
        return "bookmark-share/" + bookmarkId + Separators.SLASH + voiceId;
    }

    public final String collectionAddReadsRoute(String collectionId) {
        collectionId.getClass();
        return "authorized/explore/collection/" + collectionId + "/addReads";
    }

    public final String editCollectionRoute(String collectionId) {
        collectionId.getClass();
        return "authorized/explore/collection/" + collectionId + "/edit";
    }

    public final String exploreCollectionRoute(String collectionId) {
        collectionId.getClass();
        return "authorized/collection/".concat(collectionId);
    }

    public final String getAskSupportAgent() {
        return askSupportAgent;
    }

    public final String libraryCollectionRoute(String collectionId) {
        collectionId.getClass();
        return "authorized/explore/collection/".concat(collectionId);
    }

    public final String offlineDownloadLimitReachedRoute(String message) {
        message.getClass();
        return defpackage.f.i("authorized/offline-download-limit-reached/", RouterViewModelKt.encodeUrlParam(message));
    }

    public final String paywallRoute(String productsSourceString, String analyticsSourceString, String defaultProductId) {
        productsSourceString.getClass();
        analyticsSourceString.getClass();
        defaultProductId.getClass();
        StringBuilder sb = new StringBuilder("authorized/paywall/");
        sb.append(productsSourceString);
        return defpackage.f.n(sb, Separators.SLASH, analyticsSourceString, Separators.SLASH, defaultProductId);
    }

    public final String playerOrLoaderRoute(ReadMeta read, Analytics.Event.PlayerActivationSource source) {
        read.getClass();
        source.getClass();
        if (ig.f.I(null, ReadCreationStatus.Finished).contains(read.getCreationStatus())) {
            return playerRoute(read.getReadId(), source.getValue());
        }
        return readGenFMLoading(read.getReadId());
    }

    public final String playerRoute(String id2, String source) {
        id2.getClass();
        source.getClass();
        return "authorized/player/" + id2 + "?activationSource=" + source;
    }

    public final String pronunciationAddRoute(String voiceId, String originalText) {
        voiceId.getClass();
        originalText.getClass();
        return defpackage.f.k("authorized/pronunciations/add/", voiceId, Separators.SLASH, RouterViewModelKt.encodeUrlParam(originalText));
    }

    public final String pronunciationEditRoute(String voiceId, String pronunciationId, String originalText, String spokenText) {
        voiceId.getClass();
        pronunciationId.getClass();
        originalText.getClass();
        spokenText.getClass();
        return z.h.d(defpackage.f.s("authorized/pronunciations/edit/", voiceId, Separators.SLASH, pronunciationId, Separators.SLASH), RouterViewModelKt.encodeUrlParam(originalText), Separators.SLASH, RouterViewModelKt.encodeUrlParam(spokenText));
    }

    public final String purchaseCreditsRoute(String context) {
        if (context != null) {
            return "authorized/get-more-credits?context=".concat(context);
        }
        return "authorized/get-more-credits";
    }

    public final String readDetails(String readId) {
        readId.getClass();
        return "authorized/read/".concat(readId);
    }

    public final String readGenFMLoading(String readId) {
        readId.getClass();
        return "authorized/genfm-loading/".concat(readId);
    }

    public final String readShareDetailsRoute(String readId) {
        readId.getClass();
        return "authorized/read/" + readId + "/share";
    }

    public final String readSoundscapes(String readId) {
        readId.getClass();
        return "authorized/read/" + readId + "/soundscapes";
    }

    public final String readVoicePicker(String readId) {
        readId.getClass();
        return "authorized/read/" + readId + "/voice-picker";
    }

    public final String readsImportLinkRoute(String param, boolean encode) {
        param.getClass();
        if (encode) {
            param = RouterViewModelKt.encodeUrlParam(param);
        }
        return defpackage.f.i("authorized/reads/import/link/", param);
    }

    public final String searchRoute(String corpus) {
        corpus.getClass();
        return "authorized/search/".concat(corpus);
    }

    public final String voiceCollection(String collectionId) {
        collectionId.getClass();
        return "authorized/voices/voice-collections/".concat(collectionId);
    }

    public final String voiceCollectionForRead(String collectionId, String readId) {
        collectionId.getClass();
        readId.getClass();
        return "authorized/read/" + readId + "/voice-picker/voice-collections/" + collectionId;
    }

    public final String voiceDetails(String voiceId) {
        voiceId.getClass();
        return "authorized/voice/".concat(voiceId);
    }

    public static /* synthetic */ String paywallRoute$default(Routes routes, ProductsService.PaywallSource paywallSource, Analytics.Event.PaywallSource paywallSource2, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = "";
        }
        return routes.paywallRoute(paywallSource, paywallSource2, str);
    }

    public final String paywallRoute(ProductsService.PaywallSource productsSource, Analytics.Event.PaywallSource analyticsSource, String defaultProductId) {
        productsSource.getClass();
        analyticsSource.getClass();
        defaultProductId.getClass();
        return paywallRoute(productsSource.name(), analyticsSource.name(), defaultProductId);
    }
}
