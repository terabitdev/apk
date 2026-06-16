package io.elevenlabs.domain;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import defpackage.f;
import ib.i;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.usecase.DevicePerformanceClass;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import io.elevenlabs.ui.ShowkasePreviewGroup;
import io.livekit.android.room.SignalClient;
import j0.c;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import rd.c1;
import sn.k;
import tn.a0;
import wq.u;
import z.h;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/Analytics;", "", "Lio/elevenlabs/domain/Analytics$Event;", "event", "Lsn/z;", "log", "(Lio/elevenlabs/domain/Analytics$Event;)V", SIPHeaderNames.EVENT, "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface Analytics {
    void log(Event event);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u008f\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0003\bõ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:è\u0002\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001ß\u0001à\u0001á\u0001â\u0001ã\u0001ä\u0001å\u0001æ\u0001ç\u0001è\u0001é\u0001ê\u0001ë\u0001ì\u0001í\u0001î\u0001ï\u0001ð\u0001ñ\u0001ò\u0001ó\u0001ô\u0001õ\u0001ö\u0001÷\u0001ø\u0001ù\u0001ú\u0001B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0082\u0001º\u0003û\u0001ü\u0001ý\u0001þ\u0001ÿ\u0001\u0080\u0002\u0081\u0002\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002\u0086\u0002\u0087\u0002\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002\u0096\u0002\u0097\u0002\u0098\u0002\u0099\u0002\u009a\u0002\u009b\u0002\u009c\u0002\u009d\u0002\u009e\u0002\u009f\u0002 \u0002¡\u0002¢\u0002£\u0002¤\u0002¥\u0002¦\u0002§\u0002¨\u0002©\u0002ª\u0002«\u0002¬\u0002\u00ad\u0002®\u0002¯\u0002°\u0002±\u0002²\u0002³\u0002´\u0002µ\u0002¶\u0002·\u0002¸\u0002¹\u0002º\u0002»\u0002¼\u0002½\u0002¾\u0002¿\u0002À\u0002Á\u0002Â\u0002Ã\u0002Ä\u0002Å\u0002Æ\u0002Ç\u0002È\u0002É\u0002Ê\u0002Ë\u0002Ì\u0002Í\u0002Î\u0002Ï\u0002Ð\u0002Ñ\u0002Ò\u0002Ó\u0002Ô\u0002Õ\u0002Ö\u0002×\u0002Ø\u0002Ù\u0002Ú\u0002Û\u0002Ü\u0002Ý\u0002Þ\u0002ß\u0002à\u0002á\u0002â\u0002ã\u0002ä\u0002å\u0002æ\u0002ç\u0002è\u0002é\u0002ê\u0002ë\u0002ì\u0002í\u0002î\u0002ï\u0002ð\u0002ñ\u0002ò\u0002ó\u0002ô\u0002õ\u0002ö\u0002÷\u0002ø\u0002ù\u0002ú\u0002û\u0002ü\u0002ý\u0002þ\u0002ÿ\u0002\u0080\u0003\u0081\u0003\u0082\u0003\u0083\u0003\u0084\u0003\u0085\u0003\u0086\u0003\u0087\u0003\u0088\u0003\u0089\u0003\u008a\u0003\u008b\u0003\u008c\u0003\u008d\u0003\u008e\u0003\u008f\u0003\u0090\u0003\u0091\u0003\u0092\u0003\u0093\u0003\u0094\u0003\u0095\u0003\u0096\u0003\u0097\u0003\u0098\u0003\u0099\u0003\u009a\u0003\u009b\u0003\u009c\u0003\u009d\u0003\u009e\u0003\u009f\u0003 \u0003¡\u0003¢\u0003£\u0003¤\u0003¥\u0003¦\u0003§\u0003¨\u0003©\u0003ª\u0003«\u0003¬\u0003\u00ad\u0003®\u0003¯\u0003°\u0003±\u0003²\u0003³\u0003´\u0003µ\u0003¶\u0003·\u0003¸\u0003¹\u0003º\u0003»\u0003¼\u0003½\u0003¾\u0003¿\u0003À\u0003Á\u0003Â\u0003Ã\u0003Ä\u0003Å\u0003Æ\u0003Ç\u0003È\u0003É\u0003Ê\u0003Ë\u0003Ì\u0003Í\u0003Î\u0003Ï\u0003Ð\u0003Ñ\u0003Ò\u0003Ó\u0003Ô\u0003Õ\u0003Ö\u0003×\u0003¨\u0006Ø\u0003"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event;", "", DiagnosticsEntry.NAME_KEY, "", DiagnosticsEntry.PROPERTIES_KEY, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "setOncePersonProperties", "getSetOncePersonProperties", "ConversionEvent", "GlobalListenedActiveFirst", "GlobalListenedActive", "GlobalListenedError", "ChangedDefaultVoice", "ClickedResetPassword", "ClickedMyReadsItem", "ClickedStartListening", "ReadsDeletedReadItem", "ShareImportText", "ShareImportFile", "NotificationReceived", "NotificationClicked", "ExploreClickedReadItem", "ExploreClickedDeeplink", "ExploreClickedFilterChip", "ExploreClickedFilterBy", "ExploreClickedCollection", "ExploreClickedAddToReads", "ExploreClickedPreview", "ExploreClickedPlay", "ExploreViewedPage", "TabClicked", "HomeViewedPage", "HomeClickedListeningGoal", "HomeSavedListeningGoal", "HomeClickedRecentReadItem", "HomeClickedFilterPills", "HomeClickedFilteredItem", "HomeClickedContinueListeningRead", "HomeClickedUploadBannerButton", "HomeClickedSearchButton", "HomeClickedSearchResult", "HomeClickedAccountButton", "HomeClickedTopPicksCollectionBanner", "HomeClickedTopPicksRead", "HomeClickedWhatsNewAnnouncement", "HomeClickedTrendingReleaseRead", "HomeClickedDiscoverGenreTile", "HomeClickedSectionItem", "IsSignedIn", "SignupClickedForgotPassword", "SignupClickedLoginWithGoogle", "LoginWithGoogleTermsCanceled", "OnboardingCompletedOnboarding", "SignupClickedLoginWithEmail", "SignupClickedSignupWithEmail", "OnboardingSelectedVoice", "OnboardingDOBInput", "OnboardingSelectedDOB", "OnboardingSelectedContentType", "OnboardingSelectedTopics", "OnboardingSelectedSource", "VoicesClickedPlayVoice", "VoicesClickedVoiceDetail", "VoicesSetDefaultVoice", "SignupLoginSubmitted", "SignupLoginError", "SignupSubmitted", "SignupSubmissionError", "SignupSignupSuccess", "SignupLoginSuccess", "SignedUp", "SignedIn", "SignedOut", "PlayerClickedPlaybackSpeed", "PlayerUpdatedPlaybackSpeed", "PlayerClickedShareButton", "PlayerClickedReturnToPosition", "PlayerClickedChaptersIcon", "PlayerClickedJumpToChapter", "PlayerClickedPause", "PlayerClickedPlay", "PlayerClickedSeekBackward", "PlayerClickedSeekForward", "PlayerOpenedVoicePicker", "PlayerUpdatedDefaultVoice", "PlayerUpdatedFontFamily", "PlayerUpdatedFontSize", "PlayerUpdatedTheme", "PlayerUpdatedNextMediaButton", "PlayerUpdatedPreviousMediaButton", "PlayerUpdatedForwardSeekButton", "PlayerUpdatedBackwardSeekButton", "PlayerUpdatedInAppForwardSkipDuration", "PlayerUpdatedInAppBackwardSkipDuration", "PlayerUpdatedAutoFullscreen", "PlayerUpdatedTapToShowControls", "PlayerClickedResetPreferences", "PlayerPressedMediaButton", "PlayerClickedSleepTimer", "PlayerLoadedReadItemHtml", "PlayerClickedExportDropdown", "PlayerClickedExportWebsiteRedirect", "PlayerClickedExportElevenLabsRedirect", "PlayerReachedReadEndOfFile", "PlayerInitialised", "PlayerQueueConfirmationShown", "PlayerQueueConfirmationClicked", "PlayerAddToQueueClicked", "PlayerRemoveFromQueueClicked", "ReadLaterAdded", "ReadLaterRemoved", "ReadDetailsClickedShare", "ReadDetailsClickedAddToCollection", "ReadDetailsClickedHelp", "ReadDetailsActionSource", "PlayerQueueScreenShown", "PlayerQueueScreenHidden", "PlayerQueueScreenItemsReordered", "PlayerQueueScreenItemClicked", "OfflineDownloadStarted", "OfflineActionClicked", "OfflineDownloadFinished", "OfflineDownloadRemoved", "OfflineDownloadsRemovedAll", "OfflineDownloadExpired", "NotificationsDisplayedAllowDialog", "NotificationsAllowedNotifications", "NotificationsRejectedNotifications", "NotificationsViewedPrimer", "NotificationsPrimerCtaClicked", "NotificationsNotificationSettingsOpened", "GenfmClickedPlayerCreateButton", "BookmarksSavedBookmark", "BookmarksExportedBookmarks", "BookmarksAddedNote", "BookmarksViewedBookmarksPage", "PaymentIntendedPurchase", "PaymentRedeemedCode", "PaidReadUnlocked", "SharingClickedShare", "IntroPageViewed", "AgentOpened", "AgentClosed", "AgentSuggestedPromptClicked", "AgentOpenTextModeClicked", "AgentOpenVoiceModeClicked", "AgentMicMuteClicked", "AgentMicUnmuteClicked", "AgentSpeakerUnmuteClicked", "AgentSpeakerMuteClicked", "AgentTermsAcceptClicked", "AgentTermsDeclineClicked", "SupportAgentOpened", "SupportAgentClosed", "SupportAgentConnected", "SupportAgentConnectionError", "SupportAgentMessageSent", "SupportAgentToolCall", "SupportAgentRetry", "CustomerCenterRestoreStarted", "CustomerCenterRestoreCompleted", "CustomerCenterRestoreFailed", "CustomerCenterShowingManageSubscriptions", "CustomerCenterFeedbackSurveyCompleted", "CustomerCenterManagementOptionSelected", "CustomerCenterCustomAction", "CustomerCenterDismissed", "PlayerClickedAddPronunciation", "PronunciationClickedPreview", "PronunciationClickedSave", "PlayerClickedPronunciationsOption", "PlayerClickedDisplayMode", "PlayerClickedCustomize", "PlayerClickedSearchButton", "PlayerClickedVoiceChat", "PlayerClickedRateTitle", "PlayerClickedAddToCollection", "AddToCollectionSheetToggledRead", "AddToCollectionSheetClickedCreateNew", "AddToCollectionSheetCreatedCollection", "PlayerClickedDownload", "PlayerClickedRename", "PlayerClickedDelete", "PlayerClickedViewDetails", "PlayerClickedOpenInBrowser", "PlayerClickedReportIssue", "PlayerClickedUpsellBanner", "SettingsClickedPronunciationsOption", "PronunciationsListShown", "PronunciationsListClickedPreview", "PronunciationsListClickedEditOption", "PronunciationsListClickedDeleteOption", "PronunciationExistsDialogShown", "PronunciationExistsDialogClickedEditOption", "PaymentViewedSubscriptionPaywall", "PaymentClosedSubscriptionPaywall", "PaymentClickedPaywallCTA", "PaymentStartedTrial", "PaymentViewedCreditPackPage", "PaymentViewedCreditPackSheet", "PaymentClickedCreditPackPurchaseButton", "PaymentActivatedCreditPack", "PaymentError", "PaymentCompletedPurchase", "SoundscapesEnabledTrack", "SoundscapesDisabledTrack", "SoundscapesAdjustedVolume", "SoundscapesPreviewStarted", "SoundscapesClickedPlayerSheetButton", "PerformanceMeasured", "ShareSource", "ShareType", "ShareContent", "ShareOption", "PaywallSource", "CreditPackSource", "PaymentErrorSource", "AuthMethod", "PlayerVisibility", "PlayerControlEventSource", "SleepTimerSource", "PlayerActionSource", "PlayerActivationSource", "VoiceDesignOpened", "VoiceDesignClosed", "VoiceDesignGenerateTapped", "VoiceDesignSuggestionTapped", "VoiceDesignTipsOpened", "VoiceDesignGenerateSuccess", "VoiceDesignGenerateError", "VoiceDesignPreviewSwiped", "VoiceDesignPreviewPlayTapped", "VoiceDesignPreviewSelected", "VoiceDesignSaveTapped", "VoiceDesignSaveSuccess", "VoiceDesignSaveError", "VoiceChangerPickerShown", "VoiceChangerVoicePreviewed", "VoiceChangerVoiceSelected", "VoiceChangerOriginalAudioRestored", "SideloadDetected", "CertificateHashMismatch", "SingularAdAttributionRecorded", "SingularOrganicAttributionRecorded", "ConsumptionSpanTracked", "Lio/elevenlabs/domain/Analytics$Event$AddToCollectionSheetClickedCreateNew;", "Lio/elevenlabs/domain/Analytics$Event$AddToCollectionSheetCreatedCollection;", "Lio/elevenlabs/domain/Analytics$Event$AddToCollectionSheetToggledRead;", "Lio/elevenlabs/domain/Analytics$Event$AgentClosed;", "Lio/elevenlabs/domain/Analytics$Event$AgentMicMuteClicked;", "Lio/elevenlabs/domain/Analytics$Event$AgentMicUnmuteClicked;", "Lio/elevenlabs/domain/Analytics$Event$AgentOpenTextModeClicked;", "Lio/elevenlabs/domain/Analytics$Event$AgentOpenVoiceModeClicked;", "Lio/elevenlabs/domain/Analytics$Event$AgentOpened;", "Lio/elevenlabs/domain/Analytics$Event$AgentSpeakerMuteClicked;", "Lio/elevenlabs/domain/Analytics$Event$AgentSpeakerUnmuteClicked;", "Lio/elevenlabs/domain/Analytics$Event$AgentSuggestedPromptClicked;", "Lio/elevenlabs/domain/Analytics$Event$AgentTermsAcceptClicked;", "Lio/elevenlabs/domain/Analytics$Event$AgentTermsDeclineClicked;", "Lio/elevenlabs/domain/Analytics$Event$BookmarksAddedNote;", "Lio/elevenlabs/domain/Analytics$Event$BookmarksExportedBookmarks;", "Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark;", "Lio/elevenlabs/domain/Analytics$Event$BookmarksViewedBookmarksPage;", "Lio/elevenlabs/domain/Analytics$Event$CertificateHashMismatch;", "Lio/elevenlabs/domain/Analytics$Event$ChangedDefaultVoice;", "Lio/elevenlabs/domain/Analytics$Event$ClickedMyReadsItem;", "Lio/elevenlabs/domain/Analytics$Event$ClickedResetPassword;", "Lio/elevenlabs/domain/Analytics$Event$ClickedStartListening;", "Lio/elevenlabs/domain/Analytics$Event$ConsumptionSpanTracked;", "Lio/elevenlabs/domain/Analytics$Event$CustomerCenterCustomAction;", "Lio/elevenlabs/domain/Analytics$Event$CustomerCenterDismissed;", "Lio/elevenlabs/domain/Analytics$Event$CustomerCenterFeedbackSurveyCompleted;", "Lio/elevenlabs/domain/Analytics$Event$CustomerCenterManagementOptionSelected;", "Lio/elevenlabs/domain/Analytics$Event$CustomerCenterRestoreCompleted;", "Lio/elevenlabs/domain/Analytics$Event$CustomerCenterRestoreFailed;", "Lio/elevenlabs/domain/Analytics$Event$CustomerCenterRestoreStarted;", "Lio/elevenlabs/domain/Analytics$Event$CustomerCenterShowingManageSubscriptions;", "Lio/elevenlabs/domain/Analytics$Event$ExploreClickedAddToReads;", "Lio/elevenlabs/domain/Analytics$Event$ExploreClickedCollection;", "Lio/elevenlabs/domain/Analytics$Event$ExploreClickedDeeplink;", "Lio/elevenlabs/domain/Analytics$Event$ExploreClickedFilterBy;", "Lio/elevenlabs/domain/Analytics$Event$ExploreClickedFilterChip;", "Lio/elevenlabs/domain/Analytics$Event$ExploreClickedPlay;", "Lio/elevenlabs/domain/Analytics$Event$ExploreClickedPreview;", "Lio/elevenlabs/domain/Analytics$Event$ExploreClickedReadItem;", "Lio/elevenlabs/domain/Analytics$Event$ExploreViewedPage;", "Lio/elevenlabs/domain/Analytics$Event$GenfmClickedPlayerCreateButton;", "Lio/elevenlabs/domain/Analytics$Event$GlobalListenedActive;", "Lio/elevenlabs/domain/Analytics$Event$GlobalListenedActiveFirst;", "Lio/elevenlabs/domain/Analytics$Event$GlobalListenedError;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedAccountButton;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedContinueListeningRead;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedDiscoverGenreTile;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedFilterPills;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedFilteredItem;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedListeningGoal;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedRecentReadItem;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedSearchButton;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedSearchResult;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedSectionItem;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedTopPicksCollectionBanner;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedTopPicksRead;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedTrendingReleaseRead;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedUploadBannerButton;", "Lio/elevenlabs/domain/Analytics$Event$HomeClickedWhatsNewAnnouncement;", "Lio/elevenlabs/domain/Analytics$Event$HomeSavedListeningGoal;", "Lio/elevenlabs/domain/Analytics$Event$HomeViewedPage;", "Lio/elevenlabs/domain/Analytics$Event$IntroPageViewed;", "Lio/elevenlabs/domain/Analytics$Event$IsSignedIn;", "Lio/elevenlabs/domain/Analytics$Event$LoginWithGoogleTermsCanceled;", "Lio/elevenlabs/domain/Analytics$Event$NotificationClicked;", "Lio/elevenlabs/domain/Analytics$Event$NotificationReceived;", "Lio/elevenlabs/domain/Analytics$Event$NotificationsAllowedNotifications;", "Lio/elevenlabs/domain/Analytics$Event$NotificationsDisplayedAllowDialog;", "Lio/elevenlabs/domain/Analytics$Event$NotificationsNotificationSettingsOpened;", "Lio/elevenlabs/domain/Analytics$Event$NotificationsPrimerCtaClicked;", "Lio/elevenlabs/domain/Analytics$Event$NotificationsRejectedNotifications;", "Lio/elevenlabs/domain/Analytics$Event$NotificationsViewedPrimer;", "Lio/elevenlabs/domain/Analytics$Event$OfflineActionClicked;", "Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadExpired;", "Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadFinished;", "Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadRemoved;", "Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadStarted;", "Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadsRemovedAll;", "Lio/elevenlabs/domain/Analytics$Event$OnboardingCompletedOnboarding;", "Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedContentType;", "Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedDOB;", "Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedSource;", "Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedTopics;", "Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedVoice;", "Lio/elevenlabs/domain/Analytics$Event$PaidReadUnlocked;", "Lio/elevenlabs/domain/Analytics$Event$PaymentActivatedCreditPack;", "Lio/elevenlabs/domain/Analytics$Event$PaymentClickedCreditPackPurchaseButton;", "Lio/elevenlabs/domain/Analytics$Event$PaymentClickedPaywallCTA;", "Lio/elevenlabs/domain/Analytics$Event$PaymentClosedSubscriptionPaywall;", "Lio/elevenlabs/domain/Analytics$Event$PaymentCompletedPurchase;", "Lio/elevenlabs/domain/Analytics$Event$PaymentError;", "Lio/elevenlabs/domain/Analytics$Event$PaymentIntendedPurchase;", "Lio/elevenlabs/domain/Analytics$Event$PaymentRedeemedCode;", "Lio/elevenlabs/domain/Analytics$Event$PaymentStartedTrial;", "Lio/elevenlabs/domain/Analytics$Event$PaymentViewedCreditPackPage;", "Lio/elevenlabs/domain/Analytics$Event$PaymentViewedCreditPackSheet;", "Lio/elevenlabs/domain/Analytics$Event$PaymentViewedSubscriptionPaywall;", "Lio/elevenlabs/domain/Analytics$Event$PerformanceMeasured;", "Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedAddPronunciation;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedAddToCollection;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedChaptersIcon;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedCustomize;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedDelete;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedDisplayMode;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedDownload;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedExportDropdown;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedExportElevenLabsRedirect;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedExportWebsiteRedirect;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedJumpToChapter;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedOpenInBrowser;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedPause;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedPlay;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedPlaybackSpeed;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedPronunciationsOption;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedRateTitle;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedRename;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedReportIssue;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedResetPreferences;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedReturnToPosition;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedSearchButton;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedSeekBackward;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedSeekForward;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedShareButton;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedSleepTimer;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedUpsellBanner;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedViewDetails;", "Lio/elevenlabs/domain/Analytics$Event$PlayerClickedVoiceChat;", "Lio/elevenlabs/domain/Analytics$Event$PlayerInitialised;", "Lio/elevenlabs/domain/Analytics$Event$PlayerLoadedReadItemHtml;", "Lio/elevenlabs/domain/Analytics$Event$PlayerOpenedVoicePicker;", "Lio/elevenlabs/domain/Analytics$Event$PlayerPressedMediaButton;", "Lio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationClicked;", "Lio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationShown;", "Lio/elevenlabs/domain/Analytics$Event$PlayerQueueScreenHidden;", "Lio/elevenlabs/domain/Analytics$Event$PlayerQueueScreenItemClicked;", "Lio/elevenlabs/domain/Analytics$Event$PlayerQueueScreenItemsReordered;", "Lio/elevenlabs/domain/Analytics$Event$PlayerQueueScreenShown;", "Lio/elevenlabs/domain/Analytics$Event$PlayerReachedReadEndOfFile;", "Lio/elevenlabs/domain/Analytics$Event$PlayerRemoveFromQueueClicked;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedAutoFullscreen;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedBackwardSeekButton;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedDefaultVoice;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedFontFamily;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedFontSize;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedForwardSeekButton;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedInAppBackwardSkipDuration;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedInAppForwardSkipDuration;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedNextMediaButton;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedPlaybackSpeed;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedPreviousMediaButton;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedTapToShowControls;", "Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedTheme;", "Lio/elevenlabs/domain/Analytics$Event$PronunciationClickedPreview;", "Lio/elevenlabs/domain/Analytics$Event$PronunciationClickedSave;", "Lio/elevenlabs/domain/Analytics$Event$PronunciationExistsDialogClickedEditOption;", "Lio/elevenlabs/domain/Analytics$Event$PronunciationExistsDialogShown;", "Lio/elevenlabs/domain/Analytics$Event$PronunciationsListClickedDeleteOption;", "Lio/elevenlabs/domain/Analytics$Event$PronunciationsListClickedEditOption;", "Lio/elevenlabs/domain/Analytics$Event$PronunciationsListClickedPreview;", "Lio/elevenlabs/domain/Analytics$Event$PronunciationsListShown;", "Lio/elevenlabs/domain/Analytics$Event$ReadDetailsClickedAddToCollection;", "Lio/elevenlabs/domain/Analytics$Event$ReadDetailsClickedHelp;", "Lio/elevenlabs/domain/Analytics$Event$ReadDetailsClickedShare;", "Lio/elevenlabs/domain/Analytics$Event$ReadLaterAdded;", "Lio/elevenlabs/domain/Analytics$Event$ReadLaterRemoved;", "Lio/elevenlabs/domain/Analytics$Event$ReadsDeletedReadItem;", "Lio/elevenlabs/domain/Analytics$Event$SettingsClickedPronunciationsOption;", "Lio/elevenlabs/domain/Analytics$Event$ShareImportFile;", "Lio/elevenlabs/domain/Analytics$Event$ShareImportText;", "Lio/elevenlabs/domain/Analytics$Event$SharingClickedShare;", "Lio/elevenlabs/domain/Analytics$Event$SideloadDetected;", "Lio/elevenlabs/domain/Analytics$Event$SignedIn;", "Lio/elevenlabs/domain/Analytics$Event$SignedOut;", "Lio/elevenlabs/domain/Analytics$Event$SignedUp;", "Lio/elevenlabs/domain/Analytics$Event$SignupClickedForgotPassword;", "Lio/elevenlabs/domain/Analytics$Event$SignupClickedLoginWithEmail;", "Lio/elevenlabs/domain/Analytics$Event$SignupClickedLoginWithGoogle;", "Lio/elevenlabs/domain/Analytics$Event$SignupClickedSignupWithEmail;", "Lio/elevenlabs/domain/Analytics$Event$SignupLoginError;", "Lio/elevenlabs/domain/Analytics$Event$SignupLoginSubmitted;", "Lio/elevenlabs/domain/Analytics$Event$SignupLoginSuccess;", "Lio/elevenlabs/domain/Analytics$Event$SignupSignupSuccess;", "Lio/elevenlabs/domain/Analytics$Event$SignupSubmissionError;", "Lio/elevenlabs/domain/Analytics$Event$SignupSubmitted;", "Lio/elevenlabs/domain/Analytics$Event$SingularAdAttributionRecorded;", "Lio/elevenlabs/domain/Analytics$Event$SingularOrganicAttributionRecorded;", "Lio/elevenlabs/domain/Analytics$Event$SoundscapesAdjustedVolume;", "Lio/elevenlabs/domain/Analytics$Event$SoundscapesClickedPlayerSheetButton;", "Lio/elevenlabs/domain/Analytics$Event$SoundscapesDisabledTrack;", "Lio/elevenlabs/domain/Analytics$Event$SoundscapesEnabledTrack;", "Lio/elevenlabs/domain/Analytics$Event$SoundscapesPreviewStarted;", "Lio/elevenlabs/domain/Analytics$Event$SupportAgentClosed;", "Lio/elevenlabs/domain/Analytics$Event$SupportAgentConnected;", "Lio/elevenlabs/domain/Analytics$Event$SupportAgentConnectionError;", "Lio/elevenlabs/domain/Analytics$Event$SupportAgentMessageSent;", "Lio/elevenlabs/domain/Analytics$Event$SupportAgentOpened;", "Lio/elevenlabs/domain/Analytics$Event$SupportAgentRetry;", "Lio/elevenlabs/domain/Analytics$Event$SupportAgentToolCall;", "Lio/elevenlabs/domain/Analytics$Event$TabClicked;", "Lio/elevenlabs/domain/Analytics$Event$VoiceChangerOriginalAudioRestored;", "Lio/elevenlabs/domain/Analytics$Event$VoiceChangerPickerShown;", "Lio/elevenlabs/domain/Analytics$Event$VoiceChangerVoicePreviewed;", "Lio/elevenlabs/domain/Analytics$Event$VoiceChangerVoiceSelected;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignClosed;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignGenerateError;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignGenerateSuccess;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignGenerateTapped;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignOpened;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignPreviewPlayTapped;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignPreviewSelected;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignPreviewSwiped;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignSaveError;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignSaveSuccess;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignSaveTapped;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignSuggestionTapped;", "Lio/elevenlabs/domain/Analytics$Event$VoiceDesignTipsOpened;", "Lio/elevenlabs/domain/Analytics$Event$VoicesClickedPlayVoice;", "Lio/elevenlabs/domain/Analytics$Event$VoicesClickedVoiceDetail;", "Lio/elevenlabs/domain/Analytics$Event$VoicesSetDefaultVoice;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static abstract class Event {
        private final String name;
        private final Map<String, Object> properties;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AddToCollectionSheetClickedCreateNew;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AddToCollectionSheetClickedCreateNew extends Event {
            private final String readId;

            public AddToCollectionSheetClickedCreateNew(String str) {
                super("reader_add_to_collection_sheet_clicked_create_new", i.l(str, "read_id", str), null);
                this.readId = str;
            }

            public static /* synthetic */ AddToCollectionSheetClickedCreateNew copy$default(AddToCollectionSheetClickedCreateNew addToCollectionSheetClickedCreateNew, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = addToCollectionSheetClickedCreateNew.readId;
                }
                return addToCollectionSheetClickedCreateNew.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final AddToCollectionSheetClickedCreateNew copy(String readId) {
                readId.getClass();
                return new AddToCollectionSheetClickedCreateNew(readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof AddToCollectionSheetClickedCreateNew) && m.c(this.readId, ((AddToCollectionSheetClickedCreateNew) other).readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.readId.hashCode();
            }

            public String toString() {
                return f.C("AddToCollectionSheetClickedCreateNew(readId=", this.readId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AddToCollectionSheetCreatedCollection;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "collectionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getCollectionId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AddToCollectionSheetCreatedCollection extends Event {
            private final String collectionId;
            private final String readId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddToCollectionSheetCreatedCollection(String str, String str2) {
                super("reader_add_to_collection_sheet_created_collection", a0.J(new k("read_id", str), new k("collection_id", str2)), null);
                str.getClass();
                str2.getClass();
                this.readId = str;
                this.collectionId = str2;
            }

            public static /* synthetic */ AddToCollectionSheetCreatedCollection copy$default(AddToCollectionSheetCreatedCollection addToCollectionSheetCreatedCollection, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = addToCollectionSheetCreatedCollection.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = addToCollectionSheetCreatedCollection.collectionId;
                }
                return addToCollectionSheetCreatedCollection.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCollectionId() {
                return this.collectionId;
            }

            public final AddToCollectionSheetCreatedCollection copy(String readId, String collectionId) {
                readId.getClass();
                collectionId.getClass();
                return new AddToCollectionSheetCreatedCollection(readId, collectionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddToCollectionSheetCreatedCollection)) {
                    return false;
                }
                AddToCollectionSheetCreatedCollection addToCollectionSheetCreatedCollection = (AddToCollectionSheetCreatedCollection) other;
                if (m.c(this.readId, addToCollectionSheetCreatedCollection.readId) && m.c(this.collectionId, addToCollectionSheetCreatedCollection.collectionId)) {
                    return true;
                }
                return false;
            }

            public final String getCollectionId() {
                return this.collectionId;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.collectionId.hashCode() + (this.readId.hashCode() * 31);
            }

            public String toString() {
                return h.c("AddToCollectionSheetCreatedCollection(readId=", this.readId, ", collectionId=", this.collectionId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AddToCollectionSheetToggledRead;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "collectionId", "added", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getReadId", "()Ljava/lang/String;", "getCollectionId", "getAdded", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AddToCollectionSheetToggledRead extends Event {
            private final boolean added;
            private final String collectionId;
            private final String readId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddToCollectionSheetToggledRead(String str, String str2, boolean z6) {
                super("reader_add_to_collection_sheet_toggled_read", a0.J(new k("read_id", str), new k("collection_id", str2), new k("added", Boolean.valueOf(z6))), null);
                str.getClass();
                str2.getClass();
                this.readId = str;
                this.collectionId = str2;
                this.added = z6;
            }

            public static /* synthetic */ AddToCollectionSheetToggledRead copy$default(AddToCollectionSheetToggledRead addToCollectionSheetToggledRead, String str, String str2, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = addToCollectionSheetToggledRead.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = addToCollectionSheetToggledRead.collectionId;
                }
                if ((i10 & 4) != 0) {
                    z6 = addToCollectionSheetToggledRead.added;
                }
                return addToCollectionSheetToggledRead.copy(str, str2, z6);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCollectionId() {
                return this.collectionId;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getAdded() {
                return this.added;
            }

            public final AddToCollectionSheetToggledRead copy(String readId, String collectionId, boolean added) {
                readId.getClass();
                collectionId.getClass();
                return new AddToCollectionSheetToggledRead(readId, collectionId, added);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddToCollectionSheetToggledRead)) {
                    return false;
                }
                AddToCollectionSheetToggledRead addToCollectionSheetToggledRead = (AddToCollectionSheetToggledRead) other;
                if (m.c(this.readId, addToCollectionSheetToggledRead.readId) && m.c(this.collectionId, addToCollectionSheetToggledRead.collectionId) && this.added == addToCollectionSheetToggledRead.added) {
                    return true;
                }
                return false;
            }

            public final boolean getAdded() {
                return this.added;
            }

            public final String getCollectionId() {
                return this.collectionId;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return Boolean.hashCode(this.added) + c.c(this.readId.hashCode() * 31, 31, this.collectionId);
            }

            public String toString() {
                String str = this.readId;
                String str2 = this.collectionId;
                return n.j(Separators.RPAREN, f.s("AddToCollectionSheetToggledRead(readId=", str, ", collectionId=", str2, ", added="), this.added);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentClosed;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "voiceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentClosed extends Event {
            private final String readId;
            private final String voiceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AgentClosed(String str, String str2) {
                super("reader_assistant_closed", a0.J(new k("read_id", str), new k("voice_id", str2)), null);
                str.getClass();
                str2.getClass();
                this.readId = str;
                this.voiceId = str2;
            }

            public static /* synthetic */ AgentClosed copy$default(AgentClosed agentClosed, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = agentClosed.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = agentClosed.voiceId;
                }
                return agentClosed.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final AgentClosed copy(String readId, String voiceId) {
                readId.getClass();
                voiceId.getClass();
                return new AgentClosed(readId, voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AgentClosed)) {
                    return false;
                }
                AgentClosed agentClosed = (AgentClosed) other;
                if (m.c(this.readId, agentClosed.readId) && m.c(this.voiceId, agentClosed.voiceId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                return this.voiceId.hashCode() + (this.readId.hashCode() * 31);
            }

            public String toString() {
                return h.c("AgentClosed(readId=", this.readId, ", voiceId=", this.voiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentMicMuteClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentMicMuteClicked extends Event {
            public static final AgentMicMuteClicked INSTANCE = new AgentMicMuteClicked();

            /* JADX WARN: Multi-variable type inference failed */
            private AgentMicMuteClicked() {
                super("reader_assistant_mic_mute_clicked", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof AgentMicMuteClicked)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1027457435;
            }

            public String toString() {
                return "AgentMicMuteClicked";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentMicUnmuteClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentMicUnmuteClicked extends Event {
            public static final AgentMicUnmuteClicked INSTANCE = new AgentMicUnmuteClicked();

            /* JADX WARN: Multi-variable type inference failed */
            private AgentMicUnmuteClicked() {
                super("reader_assistant_mic_unmute_clicked", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof AgentMicUnmuteClicked)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1254227052;
            }

            public String toString() {
                return "AgentMicUnmuteClicked";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentOpenTextModeClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentOpenTextModeClicked extends Event {
            public static final AgentOpenTextModeClicked INSTANCE = new AgentOpenTextModeClicked();

            /* JADX WARN: Multi-variable type inference failed */
            private AgentOpenTextModeClicked() {
                super("reader_assistant_open_text_mode_clicked", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof AgentOpenTextModeClicked)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 255946063;
            }

            public String toString() {
                return "AgentOpenTextModeClicked";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentOpenVoiceModeClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentOpenVoiceModeClicked extends Event {
            public static final AgentOpenVoiceModeClicked INSTANCE = new AgentOpenVoiceModeClicked();

            /* JADX WARN: Multi-variable type inference failed */
            private AgentOpenVoiceModeClicked() {
                super("reader_assistant_open_voice_mode_clicked", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof AgentOpenVoiceModeClicked)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1100157882;
            }

            public String toString() {
                return "AgentOpenVoiceModeClicked";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentOpened;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "voiceId", "mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "getMode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentOpened extends Event {
            private final String mode;
            private final String readId;
            private final String voiceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AgentOpened(String str, String str2, String str3) {
                super("reader_assistant_opened", a0.J(new k("read_id", str), new k("voice_id", str2), new k("mode", str3)), null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.readId = str;
                this.voiceId = str2;
                this.mode = str3;
            }

            public static /* synthetic */ AgentOpened copy$default(AgentOpened agentOpened, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = agentOpened.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = agentOpened.voiceId;
                }
                if ((i10 & 4) != 0) {
                    str3 = agentOpened.mode;
                }
                return agentOpened.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getMode() {
                return this.mode;
            }

            public final AgentOpened copy(String readId, String voiceId, String mode) {
                readId.getClass();
                voiceId.getClass();
                mode.getClass();
                return new AgentOpened(readId, voiceId, mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AgentOpened)) {
                    return false;
                }
                AgentOpened agentOpened = (AgentOpened) other;
                if (m.c(this.readId, agentOpened.readId) && m.c(this.voiceId, agentOpened.voiceId) && m.c(this.mode, agentOpened.mode)) {
                    return true;
                }
                return false;
            }

            public final String getMode() {
                return this.mode;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                return this.mode.hashCode() + c.c(this.readId.hashCode() * 31, 31, this.voiceId);
            }

            public String toString() {
                return f.l(this.mode, Separators.RPAREN, f.s("AgentOpened(readId=", this.readId, ", voiceId=", this.voiceId, ", mode="));
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentSpeakerMuteClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentSpeakerMuteClicked extends Event {
            public static final AgentSpeakerMuteClicked INSTANCE = new AgentSpeakerMuteClicked();

            /* JADX WARN: Multi-variable type inference failed */
            private AgentSpeakerMuteClicked() {
                super("reader_assistant_speaker_mute_clicked", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof AgentSpeakerMuteClicked)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1884429651;
            }

            public String toString() {
                return "AgentSpeakerMuteClicked";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentSpeakerUnmuteClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentSpeakerUnmuteClicked extends Event {
            public static final AgentSpeakerUnmuteClicked INSTANCE = new AgentSpeakerUnmuteClicked();

            /* JADX WARN: Multi-variable type inference failed */
            private AgentSpeakerUnmuteClicked() {
                super("reader_assistant_speaker_unmute_clicked", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof AgentSpeakerUnmuteClicked)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1957318988;
            }

            public String toString() {
                return "AgentSpeakerUnmuteClicked";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentSuggestedPromptClicked;", "Lio/elevenlabs/domain/Analytics$Event;", SDPKeywords.PROMPT, "", "<init>", "(Ljava/lang/String;)V", "getPrompt", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentSuggestedPromptClicked extends Event {
            private final String prompt;

            public AgentSuggestedPromptClicked(String str) {
                super("reader_assistant_suggested_prompt_clicked", i.l(str, "prompt_text", str), null);
                this.prompt = str;
            }

            public static /* synthetic */ AgentSuggestedPromptClicked copy$default(AgentSuggestedPromptClicked agentSuggestedPromptClicked, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = agentSuggestedPromptClicked.prompt;
                }
                return agentSuggestedPromptClicked.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            public final AgentSuggestedPromptClicked copy(String prompt) {
                prompt.getClass();
                return new AgentSuggestedPromptClicked(prompt);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof AgentSuggestedPromptClicked) && m.c(this.prompt, ((AgentSuggestedPromptClicked) other).prompt)) {
                    return true;
                }
                return false;
            }

            public final String getPrompt() {
                return this.prompt;
            }

            public int hashCode() {
                return this.prompt.hashCode();
            }

            public String toString() {
                return f.C("AgentSuggestedPromptClicked(prompt=", this.prompt, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentTermsAcceptClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentTermsAcceptClicked extends Event {
            public static final AgentTermsAcceptClicked INSTANCE = new AgentTermsAcceptClicked();

            /* JADX WARN: Multi-variable type inference failed */
            private AgentTermsAcceptClicked() {
                super("reader_assistant_terms_accept_clicked", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof AgentTermsAcceptClicked)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -454206442;
            }

            public String toString() {
                return "AgentTermsAcceptClicked";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AgentTermsDeclineClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AgentTermsDeclineClicked extends Event {
            public static final AgentTermsDeclineClicked INSTANCE = new AgentTermsDeclineClicked();

            /* JADX WARN: Multi-variable type inference failed */
            private AgentTermsDeclineClicked() {
                super("reader_assistant_terms_decline_clicked", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof AgentTermsDeclineClicked)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2121909530;
            }

            public String toString() {
                return "AgentTermsDeclineClicked";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$AuthMethod;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Google", "Email", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class AuthMethod {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ AuthMethod[] $VALUES;
            private final String value;
            public static final AuthMethod Google = new AuthMethod("Google", 0, "google");
            public static final AuthMethod Email = new AuthMethod("Email", 1, "email");

            private static final /* synthetic */ AuthMethod[] $values() {
                return new AuthMethod[]{Google, Email};
            }

            static {
                AuthMethod[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private AuthMethod(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static AuthMethod valueOf(String str) {
                return (AuthMethod) Enum.valueOf(AuthMethod.class, str);
            }

            public static AuthMethod[] values() {
                return (AuthMethod[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$BookmarksAddedNote;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class BookmarksAddedNote extends Event {
            public static final BookmarksAddedNote INSTANCE = new BookmarksAddedNote();

            /* JADX WARN: Multi-variable type inference failed */
            private BookmarksAddedNote() {
                super("reader_bookmarks_added_note", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof BookmarksAddedNote)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1274132612;
            }

            public String toString() {
                return "BookmarksAddedNote";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$BookmarksExportedBookmarks;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class BookmarksExportedBookmarks extends Event {
            public static final BookmarksExportedBookmarks INSTANCE = new BookmarksExportedBookmarks();

            /* JADX WARN: Multi-variable type inference failed */
            private BookmarksExportedBookmarks() {
                super("reader_bookmarks_exported_bookmarks", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof BookmarksExportedBookmarks)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 148825172;
            }

            public String toString() {
                return "BookmarksExportedBookmarks";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark$BookmarkSource;", "type", "Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark$BookmarkType;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark$BookmarkSource;Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark$BookmarkType;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark$BookmarkSource;", "getType", "()Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark$BookmarkType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "BookmarkSource", "BookmarkType", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class BookmarksSavedBookmark extends Event {
            private final BookmarkSource source;
            private final BookmarkType type;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark$BookmarkSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PlayerBar", "TextSelection", "OverlayTextSelection", "Share", "RemoteControl", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class BookmarkSource {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ BookmarkSource[] $VALUES;
                private final String value;
                public static final BookmarkSource PlayerBar = new BookmarkSource("PlayerBar", 0, "player_bar");
                public static final BookmarkSource TextSelection = new BookmarkSource("TextSelection", 1, "text_selection");
                public static final BookmarkSource OverlayTextSelection = new BookmarkSource("OverlayTextSelection", 2, "overlay_text_selection");
                public static final BookmarkSource Share = new BookmarkSource("Share", 3, FirebaseAnalytics.Event.SHARE);
                public static final BookmarkSource RemoteControl = new BookmarkSource("RemoteControl", 4, "remote_control");

                private static final /* synthetic */ BookmarkSource[] $values() {
                    return new BookmarkSource[]{PlayerBar, TextSelection, OverlayTextSelection, Share, RemoteControl};
                }

                static {
                    BookmarkSource[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = c1.q($values);
                }

                private BookmarkSource(String str, int i10, String str2) {
                    this.value = str2;
                }

                public static a getEntries() {
                    return $ENTRIES;
                }

                public static BookmarkSource valueOf(String str) {
                    return (BookmarkSource) Enum.valueOf(BookmarkSource.class, str);
                }

                public static BookmarkSource[] values() {
                    return (BookmarkSource[]) $VALUES.clone();
                }

                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$BookmarksSavedBookmark$BookmarkType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Media", "Tts", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class BookmarkType {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ BookmarkType[] $VALUES;
                public static final BookmarkType Media = new BookmarkType("Media", 0, "media");
                public static final BookmarkType Tts = new BookmarkType("Tts", 1, "tts");
                private final String value;

                private static final /* synthetic */ BookmarkType[] $values() {
                    return new BookmarkType[]{Media, Tts};
                }

                static {
                    BookmarkType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = c1.q($values);
                }

                private BookmarkType(String str, int i10, String str2) {
                    this.value = str2;
                }

                public static a getEntries() {
                    return $ENTRIES;
                }

                public static BookmarkType valueOf(String str) {
                    return (BookmarkType) Enum.valueOf(BookmarkType.class, str);
                }

                public static BookmarkType[] values() {
                    return (BookmarkType[]) $VALUES.clone();
                }

                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BookmarksSavedBookmark(BookmarkSource bookmarkSource, BookmarkType bookmarkType) {
                super("reader_bookmarks_saved_bookmark", a0.J(new k("source", bookmarkSource.getValue()), new k("type", bookmarkType.getValue())), null);
                bookmarkSource.getClass();
                bookmarkType.getClass();
                this.source = bookmarkSource;
                this.type = bookmarkType;
            }

            public static /* synthetic */ BookmarksSavedBookmark copy$default(BookmarksSavedBookmark bookmarksSavedBookmark, BookmarkSource bookmarkSource, BookmarkType bookmarkType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bookmarkSource = bookmarksSavedBookmark.source;
                }
                if ((i10 & 2) != 0) {
                    bookmarkType = bookmarksSavedBookmark.type;
                }
                return bookmarksSavedBookmark.copy(bookmarkSource, bookmarkType);
            }

            /* renamed from: component1, reason: from getter */
            public final BookmarkSource getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final BookmarkType getType() {
                return this.type;
            }

            public final BookmarksSavedBookmark copy(BookmarkSource source, BookmarkType type) {
                source.getClass();
                type.getClass();
                return new BookmarksSavedBookmark(source, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BookmarksSavedBookmark)) {
                    return false;
                }
                BookmarksSavedBookmark bookmarksSavedBookmark = (BookmarksSavedBookmark) other;
                if (this.source == bookmarksSavedBookmark.source && this.type == bookmarksSavedBookmark.type) {
                    return true;
                }
                return false;
            }

            public final BookmarkSource getSource() {
                return this.source;
            }

            public final BookmarkType getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode() + (this.source.hashCode() * 31);
            }

            public String toString() {
                return "BookmarksSavedBookmark(source=" + this.source + ", type=" + this.type + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$BookmarksViewedBookmarksPage;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class BookmarksViewedBookmarksPage extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public BookmarksViewedBookmarksPage(PlayerActionSource playerActionSource) {
                super("reader_bookmarks_viewed_bookmarks_page", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ BookmarksViewedBookmarksPage copy$default(BookmarksViewedBookmarksPage bookmarksViewedBookmarksPage, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = bookmarksViewedBookmarksPage.source;
                }
                return bookmarksViewedBookmarksPage.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final BookmarksViewedBookmarksPage copy(PlayerActionSource source) {
                source.getClass();
                return new BookmarksViewedBookmarksPage(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof BookmarksViewedBookmarksPage) && this.source == ((BookmarksViewedBookmarksPage) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "BookmarksViewedBookmarksPage(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CertificateHashMismatch;", "Lio/elevenlabs/domain/Analytics$Event;", DiagnosticsTracker.HOST_KEY, "", "certChain", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getCertChain", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CertificateHashMismatch extends Event {
            private final String certChain;
            private final String host;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CertificateHashMismatch(String str, String str2) {
                super("reader_certificate_hash_mismatch", a0.J(new k(DiagnosticsTracker.HOST_KEY, str), new k("cert_chain", str2)), null);
                str.getClass();
                str2.getClass();
                this.host = str;
                this.certChain = str2;
            }

            public static /* synthetic */ CertificateHashMismatch copy$default(CertificateHashMismatch certificateHashMismatch, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = certificateHashMismatch.host;
                }
                if ((i10 & 2) != 0) {
                    str2 = certificateHashMismatch.certChain;
                }
                return certificateHashMismatch.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getHost() {
                return this.host;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCertChain() {
                return this.certChain;
            }

            public final CertificateHashMismatch copy(String host, String certChain) {
                host.getClass();
                certChain.getClass();
                return new CertificateHashMismatch(host, certChain);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CertificateHashMismatch)) {
                    return false;
                }
                CertificateHashMismatch certificateHashMismatch = (CertificateHashMismatch) other;
                if (m.c(this.host, certificateHashMismatch.host) && m.c(this.certChain, certificateHashMismatch.certChain)) {
                    return true;
                }
                return false;
            }

            public final String getCertChain() {
                return this.certChain;
            }

            public final String getHost() {
                return this.host;
            }

            public int hashCode() {
                return this.certChain.hashCode() + (this.host.hashCode() * 31);
            }

            public String toString() {
                return h.c("CertificateHashMismatch(host=", this.host, ", certChain=", this.certChain, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ChangedDefaultVoice;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ChangedDefaultVoice extends Event {
            public static final ChangedDefaultVoice INSTANCE = new ChangedDefaultVoice();

            /* JADX WARN: Multi-variable type inference failed */
            private ChangedDefaultVoice() {
                super("reader_changed_default_voice", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ChangedDefaultVoice)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1925748418;
            }

            public String toString() {
                return "ChangedDefaultVoice";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ClickedMyReadsItem;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ClickedMyReadsItem extends Event {
            public static final ClickedMyReadsItem INSTANCE = new ClickedMyReadsItem();

            /* JADX WARN: Multi-variable type inference failed */
            private ClickedMyReadsItem() {
                super("reader_reads_clicked_read_item", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ClickedMyReadsItem)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -524851388;
            }

            public String toString() {
                return "ClickedMyReadsItem";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ClickedResetPassword;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ClickedResetPassword extends Event {
            public static final ClickedResetPassword INSTANCE = new ClickedResetPassword();

            /* JADX WARN: Multi-variable type inference failed */
            private ClickedResetPassword() {
                super("reader_clicked_reset_password", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ClickedResetPassword)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1133915722;
            }

            public String toString() {
                return "ClickedResetPassword";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0019¨\u0006)"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ConsumptionSpanTracked;", "Lio/elevenlabs/domain/Analytics$Event;", "audioType", "", "readId", "durationSeconds", "", "durationChars", "", "playbackSource", "deviceOnline", "", "isVoiceChangerActive", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Long;Ljava/lang/String;ZZ)V", "getAudioType", "()Ljava/lang/String;", "getReadId", "getDurationSeconds", "()D", "getDurationChars", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPlaybackSource", "getDeviceOnline", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/Long;Ljava/lang/String;ZZ)Lio/elevenlabs/domain/Analytics$Event$ConsumptionSpanTracked;", "equals", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ConsumptionSpanTracked extends Event {
            private final String audioType;
            private final boolean deviceOnline;
            private final Long durationChars;
            private final double durationSeconds;
            private final boolean isVoiceChangerActive;
            private final String playbackSource;
            private final String readId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConsumptionSpanTracked(String str, String str2, double d10, Long l4, String str3, boolean z6, boolean z10) {
                super("reader_consumption_span_tracked", a0.J(new k("audio_type", str), new k("read_id", str2), new k("duration_seconds", Double.valueOf(d10)), new k("duration_chars", l4), new k("playback_source", str3), new k("device_online", Boolean.valueOf(z6)), new k("is_voice_changer_active", Boolean.valueOf(z10))), null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.audioType = str;
                this.readId = str2;
                this.durationSeconds = d10;
                this.durationChars = l4;
                this.playbackSource = str3;
                this.deviceOnline = z6;
                this.isVoiceChangerActive = z10;
            }

            public static /* synthetic */ ConsumptionSpanTracked copy$default(ConsumptionSpanTracked consumptionSpanTracked, String str, String str2, double d10, Long l4, String str3, boolean z6, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = consumptionSpanTracked.audioType;
                }
                if ((i10 & 2) != 0) {
                    str2 = consumptionSpanTracked.readId;
                }
                if ((i10 & 4) != 0) {
                    d10 = consumptionSpanTracked.durationSeconds;
                }
                if ((i10 & 8) != 0) {
                    l4 = consumptionSpanTracked.durationChars;
                }
                if ((i10 & 16) != 0) {
                    str3 = consumptionSpanTracked.playbackSource;
                }
                if ((i10 & 32) != 0) {
                    z6 = consumptionSpanTracked.deviceOnline;
                }
                if ((i10 & 64) != 0) {
                    z10 = consumptionSpanTracked.isVoiceChangerActive;
                }
                double d11 = d10;
                return consumptionSpanTracked.copy(str, str2, d11, l4, str3, z6, z10);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAudioType() {
                return this.audioType;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component3, reason: from getter */
            public final double getDurationSeconds() {
                return this.durationSeconds;
            }

            /* renamed from: component4, reason: from getter */
            public final Long getDurationChars() {
                return this.durationChars;
            }

            /* renamed from: component5, reason: from getter */
            public final String getPlaybackSource() {
                return this.playbackSource;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getDeviceOnline() {
                return this.deviceOnline;
            }

            /* renamed from: component7, reason: from getter */
            public final boolean getIsVoiceChangerActive() {
                return this.isVoiceChangerActive;
            }

            public final ConsumptionSpanTracked copy(String audioType, String readId, double durationSeconds, Long durationChars, String playbackSource, boolean deviceOnline, boolean isVoiceChangerActive) {
                audioType.getClass();
                readId.getClass();
                playbackSource.getClass();
                return new ConsumptionSpanTracked(audioType, readId, durationSeconds, durationChars, playbackSource, deviceOnline, isVoiceChangerActive);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConsumptionSpanTracked)) {
                    return false;
                }
                ConsumptionSpanTracked consumptionSpanTracked = (ConsumptionSpanTracked) other;
                if (m.c(this.audioType, consumptionSpanTracked.audioType) && m.c(this.readId, consumptionSpanTracked.readId) && Double.compare(this.durationSeconds, consumptionSpanTracked.durationSeconds) == 0 && m.c(this.durationChars, consumptionSpanTracked.durationChars) && m.c(this.playbackSource, consumptionSpanTracked.playbackSource) && this.deviceOnline == consumptionSpanTracked.deviceOnline && this.isVoiceChangerActive == consumptionSpanTracked.isVoiceChangerActive) {
                    return true;
                }
                return false;
            }

            public final String getAudioType() {
                return this.audioType;
            }

            public final boolean getDeviceOnline() {
                return this.deviceOnline;
            }

            public final Long getDurationChars() {
                return this.durationChars;
            }

            public final double getDurationSeconds() {
                return this.durationSeconds;
            }

            public final String getPlaybackSource() {
                return this.playbackSource;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                int hashCode;
                int c5 = n.c(c.c(this.audioType.hashCode() * 31, 31, this.readId), 31, this.durationSeconds);
                Long l4 = this.durationChars;
                if (l4 == null) {
                    hashCode = 0;
                } else {
                    hashCode = l4.hashCode();
                }
                return Boolean.hashCode(this.isVoiceChangerActive) + b.f(c.c((c5 + hashCode) * 31, 31, this.playbackSource), 31, this.deviceOnline);
            }

            public final boolean isVoiceChangerActive() {
                return this.isVoiceChangerActive;
            }

            public String toString() {
                String str = this.audioType;
                String str2 = this.readId;
                double d10 = this.durationSeconds;
                Long l4 = this.durationChars;
                String str3 = this.playbackSource;
                boolean z6 = this.deviceOnline;
                boolean z10 = this.isVoiceChangerActive;
                StringBuilder s10 = f.s("ConsumptionSpanTracked(audioType=", str, ", readId=", str2, ", durationSeconds=");
                s10.append(d10);
                s10.append(", durationChars=");
                s10.append(l4);
                s10.append(", playbackSource=");
                s10.append(str3);
                s10.append(", deviceOnline=");
                s10.append(z6);
                s10.append(", isVoiceChangerActive=");
                s10.append(z10);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ConversionEvent;", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public interface ConversionEvent {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LowCreditsSheet", "NoCreditsSheet", "AccountPage", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class CreditPackSource {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ CreditPackSource[] $VALUES;
            private final String value;
            public static final CreditPackSource LowCreditsSheet = new CreditPackSource("LowCreditsSheet", 0, "low_credits_sheet");
            public static final CreditPackSource NoCreditsSheet = new CreditPackSource("NoCreditsSheet", 1, "no_credits_sheet");
            public static final CreditPackSource AccountPage = new CreditPackSource("AccountPage", 2, "account_page");

            private static final /* synthetic */ CreditPackSource[] $values() {
                return new CreditPackSource[]{LowCreditsSheet, NoCreditsSheet, AccountPage};
            }

            static {
                CreditPackSource[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private CreditPackSource(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static CreditPackSource valueOf(String str) {
                return (CreditPackSource) Enum.valueOf(CreditPackSource.class, str);
            }

            public static CreditPackSource[] values() {
                return (CreditPackSource[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CustomerCenterCustomAction;", "Lio/elevenlabs/domain/Analytics$Event;", "actionIdentifier", "", "<init>", "(Ljava/lang/String;)V", "getActionIdentifier", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CustomerCenterCustomAction extends Event {
            private final String actionIdentifier;

            public CustomerCenterCustomAction(String str) {
                super("reader_customer_center_custom_action", i.l(str, "action_identifier", str), null);
                this.actionIdentifier = str;
            }

            public static /* synthetic */ CustomerCenterCustomAction copy$default(CustomerCenterCustomAction customerCenterCustomAction, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = customerCenterCustomAction.actionIdentifier;
                }
                return customerCenterCustomAction.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getActionIdentifier() {
                return this.actionIdentifier;
            }

            public final CustomerCenterCustomAction copy(String actionIdentifier) {
                actionIdentifier.getClass();
                return new CustomerCenterCustomAction(actionIdentifier);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof CustomerCenterCustomAction) && m.c(this.actionIdentifier, ((CustomerCenterCustomAction) other).actionIdentifier)) {
                    return true;
                }
                return false;
            }

            public final String getActionIdentifier() {
                return this.actionIdentifier;
            }

            public int hashCode() {
                return this.actionIdentifier.hashCode();
            }

            public String toString() {
                return f.C("CustomerCenterCustomAction(actionIdentifier=", this.actionIdentifier, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CustomerCenterDismissed;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CustomerCenterDismissed extends Event {
            public static final CustomerCenterDismissed INSTANCE = new CustomerCenterDismissed();

            /* JADX WARN: Multi-variable type inference failed */
            private CustomerCenterDismissed() {
                super("reader_customer_center_dismissed", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof CustomerCenterDismissed)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 73631887;
            }

            public String toString() {
                return "CustomerCenterDismissed";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CustomerCenterFeedbackSurveyCompleted;", "Lio/elevenlabs/domain/Analytics$Event;", "optionId", "", "<init>", "(Ljava/lang/String;)V", "getOptionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CustomerCenterFeedbackSurveyCompleted extends Event {
            private final String optionId;

            public CustomerCenterFeedbackSurveyCompleted(String str) {
                super("reader_customer_center_feedback_survey_completed", i.l(str, "option_id", str), null);
                this.optionId = str;
            }

            public static /* synthetic */ CustomerCenterFeedbackSurveyCompleted copy$default(CustomerCenterFeedbackSurveyCompleted customerCenterFeedbackSurveyCompleted, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = customerCenterFeedbackSurveyCompleted.optionId;
                }
                return customerCenterFeedbackSurveyCompleted.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getOptionId() {
                return this.optionId;
            }

            public final CustomerCenterFeedbackSurveyCompleted copy(String optionId) {
                optionId.getClass();
                return new CustomerCenterFeedbackSurveyCompleted(optionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof CustomerCenterFeedbackSurveyCompleted) && m.c(this.optionId, ((CustomerCenterFeedbackSurveyCompleted) other).optionId)) {
                    return true;
                }
                return false;
            }

            public final String getOptionId() {
                return this.optionId;
            }

            public int hashCode() {
                return this.optionId.hashCode();
            }

            public String toString() {
                return f.C("CustomerCenterFeedbackSurveyCompleted(optionId=", this.optionId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CustomerCenterManagementOptionSelected;", "Lio/elevenlabs/domain/Analytics$Event;", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CustomerCenterManagementOptionSelected extends Event {
            private final String action;

            public CustomerCenterManagementOptionSelected(String str) {
                super("reader_customer_center_management_option_selected", i.l(str, "action", str), null);
                this.action = str;
            }

            public static /* synthetic */ CustomerCenterManagementOptionSelected copy$default(CustomerCenterManagementOptionSelected customerCenterManagementOptionSelected, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = customerCenterManagementOptionSelected.action;
                }
                return customerCenterManagementOptionSelected.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            public final CustomerCenterManagementOptionSelected copy(String action) {
                action.getClass();
                return new CustomerCenterManagementOptionSelected(action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof CustomerCenterManagementOptionSelected) && m.c(this.action, ((CustomerCenterManagementOptionSelected) other).action)) {
                    return true;
                }
                return false;
            }

            public final String getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return f.C("CustomerCenterManagementOptionSelected(action=", this.action, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CustomerCenterRestoreCompleted;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CustomerCenterRestoreCompleted extends Event {
            public static final CustomerCenterRestoreCompleted INSTANCE = new CustomerCenterRestoreCompleted();

            /* JADX WARN: Multi-variable type inference failed */
            private CustomerCenterRestoreCompleted() {
                super("reader_customer_center_restore_completed", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof CustomerCenterRestoreCompleted)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1058795703;
            }

            public String toString() {
                return "CustomerCenterRestoreCompleted";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CustomerCenterRestoreFailed;", "Lio/elevenlabs/domain/Analytics$Event;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CustomerCenterRestoreFailed extends Event {
            private final String error;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public CustomerCenterRestoreFailed(String str) {
                super("reader_customer_center_restore_failed", a0.R(ig.f.J(r1)), r0);
                k kVar;
                kotlin.jvm.internal.f fVar = null;
                if (str != null) {
                    kVar = new k(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
                } else {
                    kVar = null;
                }
                this.error = str;
            }

            public static /* synthetic */ CustomerCenterRestoreFailed copy$default(CustomerCenterRestoreFailed customerCenterRestoreFailed, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = customerCenterRestoreFailed.error;
                }
                return customerCenterRestoreFailed.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            public final CustomerCenterRestoreFailed copy(String error) {
                return new CustomerCenterRestoreFailed(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof CustomerCenterRestoreFailed) && m.c(this.error, ((CustomerCenterRestoreFailed) other).error)) {
                    return true;
                }
                return false;
            }

            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                String str = this.error;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return f.C("CustomerCenterRestoreFailed(error=", this.error, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CustomerCenterRestoreStarted;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CustomerCenterRestoreStarted extends Event {
            public static final CustomerCenterRestoreStarted INSTANCE = new CustomerCenterRestoreStarted();

            /* JADX WARN: Multi-variable type inference failed */
            private CustomerCenterRestoreStarted() {
                super("reader_customer_center_restore_started", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof CustomerCenterRestoreStarted)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -625351187;
            }

            public String toString() {
                return "CustomerCenterRestoreStarted";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$CustomerCenterShowingManageSubscriptions;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CustomerCenterShowingManageSubscriptions extends Event {
            public static final CustomerCenterShowingManageSubscriptions INSTANCE = new CustomerCenterShowingManageSubscriptions();

            /* JADX WARN: Multi-variable type inference failed */
            private CustomerCenterShowingManageSubscriptions() {
                super("reader_customer_center_showing_manage_subscriptions", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof CustomerCenterShowingManageSubscriptions)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 602746470;
            }

            public String toString() {
                return "CustomerCenterShowingManageSubscriptions";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ExploreClickedAddToReads;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ExploreClickedAddToReads extends Event {
            private final String readId;

            public ExploreClickedAddToReads(String str) {
                super("reader_explore_clicked_add_to_reads", i.l(str, "read_id", str), null);
                this.readId = str;
            }

            public static /* synthetic */ ExploreClickedAddToReads copy$default(ExploreClickedAddToReads exploreClickedAddToReads, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = exploreClickedAddToReads.readId;
                }
                return exploreClickedAddToReads.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ExploreClickedAddToReads copy(String readId) {
                readId.getClass();
                return new ExploreClickedAddToReads(readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ExploreClickedAddToReads) && m.c(this.readId, ((ExploreClickedAddToReads) other).readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.readId.hashCode();
            }

            public String toString() {
                return f.C("ExploreClickedAddToReads(readId=", this.readId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ExploreClickedCollection;", "Lio/elevenlabs/domain/Analytics$Event;", "collectionId", "", "<init>", "(Ljava/lang/String;)V", "getCollectionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ExploreClickedCollection extends Event {
            private final String collectionId;

            public ExploreClickedCollection(String str) {
                super("reader_explore_clicked_collection", i.l(str, "id", str), null);
                this.collectionId = str;
            }

            public static /* synthetic */ ExploreClickedCollection copy$default(ExploreClickedCollection exploreClickedCollection, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = exploreClickedCollection.collectionId;
                }
                return exploreClickedCollection.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCollectionId() {
                return this.collectionId;
            }

            public final ExploreClickedCollection copy(String collectionId) {
                collectionId.getClass();
                return new ExploreClickedCollection(collectionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ExploreClickedCollection) && m.c(this.collectionId, ((ExploreClickedCollection) other).collectionId)) {
                    return true;
                }
                return false;
            }

            public final String getCollectionId() {
                return this.collectionId;
            }

            public int hashCode() {
                return this.collectionId.hashCode();
            }

            public String toString() {
                return f.C("ExploreClickedCollection(collectionId=", this.collectionId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ExploreClickedDeeplink;", "Lio/elevenlabs/domain/Analytics$Event;", "deeplink", "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ExploreClickedDeeplink extends Event {
            private final String deeplink;

            public ExploreClickedDeeplink(String str) {
                super("reader_explore_clicked_deeplink", i.l(str, "deeplink", str), null);
                this.deeplink = str;
            }

            public static /* synthetic */ ExploreClickedDeeplink copy$default(ExploreClickedDeeplink exploreClickedDeeplink, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = exploreClickedDeeplink.deeplink;
                }
                return exploreClickedDeeplink.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final ExploreClickedDeeplink copy(String deeplink) {
                deeplink.getClass();
                return new ExploreClickedDeeplink(deeplink);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ExploreClickedDeeplink) && m.c(this.deeplink, ((ExploreClickedDeeplink) other).deeplink)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public int hashCode() {
                return this.deeplink.hashCode();
            }

            public String toString() {
                return f.C("ExploreClickedDeeplink(deeplink=", this.deeplink, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ExploreClickedFilterBy;", "Lio/elevenlabs/domain/Analytics$Event;", "filterName", "", "<init>", "(Ljava/lang/String;)V", "getFilterName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ExploreClickedFilterBy extends Event {
            private final String filterName;

            public ExploreClickedFilterBy(String str) {
                super("reader_explore_clicked_filter_by", i.l(str, "filter_name", str), null);
                this.filterName = str;
            }

            public static /* synthetic */ ExploreClickedFilterBy copy$default(ExploreClickedFilterBy exploreClickedFilterBy, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = exploreClickedFilterBy.filterName;
                }
                return exploreClickedFilterBy.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getFilterName() {
                return this.filterName;
            }

            public final ExploreClickedFilterBy copy(String filterName) {
                filterName.getClass();
                return new ExploreClickedFilterBy(filterName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ExploreClickedFilterBy) && m.c(this.filterName, ((ExploreClickedFilterBy) other).filterName)) {
                    return true;
                }
                return false;
            }

            public final String getFilterName() {
                return this.filterName;
            }

            public int hashCode() {
                return this.filterName.hashCode();
            }

            public String toString() {
                return f.C("ExploreClickedFilterBy(filterName=", this.filterName, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ExploreClickedFilterChip;", "Lio/elevenlabs/domain/Analytics$Event;", "pageId", "", "selected", "", "<init>", "(Ljava/lang/String;Z)V", "getPageId", "()Ljava/lang/String;", "getSelected", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ExploreClickedFilterChip extends Event {
            private final String pageId;
            private final boolean selected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExploreClickedFilterChip(String str, boolean z6) {
                super("reader_explore_clicked_filter_chip", a0.J(new k("id", str), new k("selected", Boolean.valueOf(z6))), null);
                str.getClass();
                this.pageId = str;
                this.selected = z6;
            }

            public static /* synthetic */ ExploreClickedFilterChip copy$default(ExploreClickedFilterChip exploreClickedFilterChip, String str, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = exploreClickedFilterChip.pageId;
                }
                if ((i10 & 2) != 0) {
                    z6 = exploreClickedFilterChip.selected;
                }
                return exploreClickedFilterChip.copy(str, z6);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPageId() {
                return this.pageId;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getSelected() {
                return this.selected;
            }

            public final ExploreClickedFilterChip copy(String pageId, boolean selected) {
                pageId.getClass();
                return new ExploreClickedFilterChip(pageId, selected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ExploreClickedFilterChip)) {
                    return false;
                }
                ExploreClickedFilterChip exploreClickedFilterChip = (ExploreClickedFilterChip) other;
                if (m.c(this.pageId, exploreClickedFilterChip.pageId) && this.selected == exploreClickedFilterChip.selected) {
                    return true;
                }
                return false;
            }

            public final String getPageId() {
                return this.pageId;
            }

            public final boolean getSelected() {
                return this.selected;
            }

            public int hashCode() {
                return Boolean.hashCode(this.selected) + (this.pageId.hashCode() * 31);
            }

            public String toString() {
                return "ExploreClickedFilterChip(pageId=" + this.pageId + ", selected=" + this.selected + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ExploreClickedPlay;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ExploreClickedPlay extends Event {
            private final String readId;

            public ExploreClickedPlay(String str) {
                super("reader_explore_clicked_play", i.l(str, "read_id", str), null);
                this.readId = str;
            }

            public static /* synthetic */ ExploreClickedPlay copy$default(ExploreClickedPlay exploreClickedPlay, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = exploreClickedPlay.readId;
                }
                return exploreClickedPlay.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ExploreClickedPlay copy(String readId) {
                readId.getClass();
                return new ExploreClickedPlay(readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ExploreClickedPlay) && m.c(this.readId, ((ExploreClickedPlay) other).readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.readId.hashCode();
            }

            public String toString() {
                return f.C("ExploreClickedPlay(readId=", this.readId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ExploreClickedPreview;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ExploreClickedPreview extends Event {
            private final String readId;

            public ExploreClickedPreview(String str) {
                super("reader_explore_clicked_preview", i.l(str, "read_id", str), null);
                this.readId = str;
            }

            public static /* synthetic */ ExploreClickedPreview copy$default(ExploreClickedPreview exploreClickedPreview, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = exploreClickedPreview.readId;
                }
                return exploreClickedPreview.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ExploreClickedPreview copy(String readId) {
                readId.getClass();
                return new ExploreClickedPreview(readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ExploreClickedPreview) && m.c(this.readId, ((ExploreClickedPreview) other).readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.readId.hashCode();
            }

            public String toString() {
                return f.C("ExploreClickedPreview(readId=", this.readId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ExploreClickedReadItem;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ExploreClickedReadItem extends Event {
            private final String readId;

            public ExploreClickedReadItem(String str) {
                super("reader_explore_clicked_read_item", i.l(str, "read_id", str), null);
                this.readId = str;
            }

            public static /* synthetic */ ExploreClickedReadItem copy$default(ExploreClickedReadItem exploreClickedReadItem, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = exploreClickedReadItem.readId;
                }
                return exploreClickedReadItem.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ExploreClickedReadItem copy(String readId) {
                readId.getClass();
                return new ExploreClickedReadItem(readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ExploreClickedReadItem) && m.c(this.readId, ((ExploreClickedReadItem) other).readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.readId.hashCode();
            }

            public String toString() {
                return f.C("ExploreClickedReadItem(readId=", this.readId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ExploreViewedPage;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ExploreViewedPage extends Event {
            public static final ExploreViewedPage INSTANCE = new ExploreViewedPage();

            /* JADX WARN: Multi-variable type inference failed */
            private ExploreViewedPage() {
                super("reader_explore_viewed_page", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ExploreViewedPage)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1345744673;
            }

            public String toString() {
                return "ExploreViewedPage";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$GenfmClickedPlayerCreateButton;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GenfmClickedPlayerCreateButton extends Event {
            private final String readId;

            public GenfmClickedPlayerCreateButton(String str) {
                super("reader_genfm_clicked_player_create_button", i.l(str, "read_id", str), null);
                this.readId = str;
            }

            public static /* synthetic */ GenfmClickedPlayerCreateButton copy$default(GenfmClickedPlayerCreateButton genfmClickedPlayerCreateButton, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = genfmClickedPlayerCreateButton.readId;
                }
                return genfmClickedPlayerCreateButton.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final GenfmClickedPlayerCreateButton copy(String readId) {
                readId.getClass();
                return new GenfmClickedPlayerCreateButton(readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof GenfmClickedPlayerCreateButton) && m.c(this.readId, ((GenfmClickedPlayerCreateButton) other).readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.readId.hashCode();
            }

            public String toString() {
                return f.C("GenfmClickedPlayerCreateButton(readId=", this.readId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$GlobalListenedActive;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "visibility", "Lio/elevenlabs/domain/Analytics$Event$PlayerVisibility;", "offlineVersions", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PlayerVisibility;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getVisibility", "()Lio/elevenlabs/domain/Analytics$Event$PlayerVisibility;", "getOfflineVersions", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GlobalListenedActive extends Event {
            private final String offlineVersions;
            private final String readId;
            private final PlayerVisibility visibility;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public GlobalListenedActive(String str, PlayerVisibility playerVisibility, String str2) {
                super("reader_global_listened_active", a0.J(r0, new k("type", r1), new k("visibility", playerVisibility.getValue()), new k("offline_versions", str2)), null);
                String str3;
                str.getClass();
                playerVisibility.getClass();
                str2.getClass();
                k kVar = new k("read_id", str);
                if (u.W(str, "u:", false)) {
                    str3 = "imported";
                } else {
                    str3 = "premade";
                }
                this.readId = str;
                this.visibility = playerVisibility;
                this.offlineVersions = str2;
            }

            public static /* synthetic */ GlobalListenedActive copy$default(GlobalListenedActive globalListenedActive, String str, PlayerVisibility playerVisibility, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = globalListenedActive.readId;
                }
                if ((i10 & 2) != 0) {
                    playerVisibility = globalListenedActive.visibility;
                }
                if ((i10 & 4) != 0) {
                    str2 = globalListenedActive.offlineVersions;
                }
                return globalListenedActive.copy(str, playerVisibility, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final PlayerVisibility getVisibility() {
                return this.visibility;
            }

            /* renamed from: component3, reason: from getter */
            public final String getOfflineVersions() {
                return this.offlineVersions;
            }

            public final GlobalListenedActive copy(String readId, PlayerVisibility visibility, String offlineVersions) {
                readId.getClass();
                visibility.getClass();
                offlineVersions.getClass();
                return new GlobalListenedActive(readId, visibility, offlineVersions);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GlobalListenedActive)) {
                    return false;
                }
                GlobalListenedActive globalListenedActive = (GlobalListenedActive) other;
                if (m.c(this.readId, globalListenedActive.readId) && this.visibility == globalListenedActive.visibility && m.c(this.offlineVersions, globalListenedActive.offlineVersions)) {
                    return true;
                }
                return false;
            }

            public final String getOfflineVersions() {
                return this.offlineVersions;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final PlayerVisibility getVisibility() {
                return this.visibility;
            }

            public int hashCode() {
                return this.offlineVersions.hashCode() + ((this.visibility.hashCode() + (this.readId.hashCode() * 31)) * 31);
            }

            public String toString() {
                String str = this.readId;
                PlayerVisibility playerVisibility = this.visibility;
                String str2 = this.offlineVersions;
                StringBuilder sb = new StringBuilder("GlobalListenedActive(readId=");
                sb.append(str);
                sb.append(", visibility=");
                sb.append(playerVisibility);
                sb.append(", offlineVersions=");
                return f.l(str2, Separators.RPAREN, sb);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$GlobalListenedActiveFirst;", "Lio/elevenlabs/domain/Analytics$Event;", "time", "", "readId", "", "visibility", "Lio/elevenlabs/domain/Analytics$Event$PlayerVisibility;", "offlineVersions", "<init>", "(FLjava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PlayerVisibility;Ljava/lang/String;)V", "getTime", "()F", "getReadId", "()Ljava/lang/String;", "getVisibility", "()Lio/elevenlabs/domain/Analytics$Event$PlayerVisibility;", "getOfflineVersions", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GlobalListenedActiveFirst extends Event {
            private final String offlineVersions;
            private final String readId;
            private final float time;
            private final PlayerVisibility visibility;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public GlobalListenedActiveFirst(float f10, String str, PlayerVisibility playerVisibility, String str2) {
                super("reader_global_listened_active_first", a0.J(r1, r0, new k("type", r2), new k("visibility", playerVisibility.getValue()), new k("offline_versions", str2)), null);
                String str3;
                str.getClass();
                playerVisibility.getClass();
                str2.getClass();
                k kVar = new k("time", Float.valueOf(f10));
                k kVar2 = new k("read_id", str);
                if (u.W(str, "u:", false)) {
                    str3 = "imported";
                } else {
                    str3 = "premade";
                }
                this.time = f10;
                this.readId = str;
                this.visibility = playerVisibility;
                this.offlineVersions = str2;
            }

            public static /* synthetic */ GlobalListenedActiveFirst copy$default(GlobalListenedActiveFirst globalListenedActiveFirst, float f10, String str, PlayerVisibility playerVisibility, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = globalListenedActiveFirst.time;
                }
                if ((i10 & 2) != 0) {
                    str = globalListenedActiveFirst.readId;
                }
                if ((i10 & 4) != 0) {
                    playerVisibility = globalListenedActiveFirst.visibility;
                }
                if ((i10 & 8) != 0) {
                    str2 = globalListenedActiveFirst.offlineVersions;
                }
                return globalListenedActiveFirst.copy(f10, str, playerVisibility, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final float getTime() {
                return this.time;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component3, reason: from getter */
            public final PlayerVisibility getVisibility() {
                return this.visibility;
            }

            /* renamed from: component4, reason: from getter */
            public final String getOfflineVersions() {
                return this.offlineVersions;
            }

            public final GlobalListenedActiveFirst copy(float time, String readId, PlayerVisibility visibility, String offlineVersions) {
                readId.getClass();
                visibility.getClass();
                offlineVersions.getClass();
                return new GlobalListenedActiveFirst(time, readId, visibility, offlineVersions);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GlobalListenedActiveFirst)) {
                    return false;
                }
                GlobalListenedActiveFirst globalListenedActiveFirst = (GlobalListenedActiveFirst) other;
                if (Float.compare(this.time, globalListenedActiveFirst.time) == 0 && m.c(this.readId, globalListenedActiveFirst.readId) && this.visibility == globalListenedActiveFirst.visibility && m.c(this.offlineVersions, globalListenedActiveFirst.offlineVersions)) {
                    return true;
                }
                return false;
            }

            public final String getOfflineVersions() {
                return this.offlineVersions;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final float getTime() {
                return this.time;
            }

            public final PlayerVisibility getVisibility() {
                return this.visibility;
            }

            public int hashCode() {
                return this.offlineVersions.hashCode() + ((this.visibility.hashCode() + c.c(Float.hashCode(this.time) * 31, 31, this.readId)) * 31);
            }

            public String toString() {
                return "GlobalListenedActiveFirst(time=" + this.time + ", readId=" + this.readId + ", visibility=" + this.visibility + ", offlineVersions=" + this.offlineVersions + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$GlobalListenedError;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "voiceId", "isOffline", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "()Z", "getError", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class GlobalListenedError extends Event {
            private final String error;
            private final String errorMessage;
            private final boolean isOffline;
            private final String readId;
            private final String voiceId;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public GlobalListenedError(String str, String str2, boolean z6, String str3, String str4) {
                super("reader_global_listened_error", a0.R(tn.n.F0(new k[]{r1, r2, r4, r3, r5})), r0);
                k kVar;
                k kVar2;
                k kVar3;
                k kVar4;
                kotlin.jvm.internal.f fVar = null;
                if (str != null) {
                    kVar = new k("read_id", str);
                } else {
                    kVar = null;
                }
                if (str2 != null) {
                    kVar2 = new k("voice_id", str2);
                } else {
                    kVar2 = null;
                }
                k kVar5 = new k("is_offline", Boolean.valueOf(z6));
                if (str3 != null) {
                    kVar3 = new k(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str3);
                } else {
                    kVar3 = null;
                }
                if (str4 != null) {
                    kVar4 = new k(DiagnosticsTracker.ERROR_MESSAGE_KEY, str4);
                } else {
                    kVar4 = null;
                }
                this.readId = str;
                this.voiceId = str2;
                this.isOffline = z6;
                this.error = str3;
                this.errorMessage = str4;
            }

            public static /* synthetic */ GlobalListenedError copy$default(GlobalListenedError globalListenedError, String str, String str2, boolean z6, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = globalListenedError.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = globalListenedError.voiceId;
                }
                if ((i10 & 4) != 0) {
                    z6 = globalListenedError.isOffline;
                }
                if ((i10 & 8) != 0) {
                    str3 = globalListenedError.error;
                }
                if ((i10 & 16) != 0) {
                    str4 = globalListenedError.errorMessage;
                }
                String str5 = str4;
                boolean z10 = z6;
                return globalListenedError.copy(str, str2, z10, str3, str5);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsOffline() {
                return this.isOffline;
            }

            /* renamed from: component4, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* renamed from: component5, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final GlobalListenedError copy(String readId, String voiceId, boolean isOffline, String error, String errorMessage) {
                return new GlobalListenedError(readId, voiceId, isOffline, error, errorMessage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GlobalListenedError)) {
                    return false;
                }
                GlobalListenedError globalListenedError = (GlobalListenedError) other;
                if (m.c(this.readId, globalListenedError.readId) && m.c(this.voiceId, globalListenedError.voiceId) && this.isOffline == globalListenedError.isOffline && m.c(this.error, globalListenedError.error) && m.c(this.errorMessage, globalListenedError.errorMessage)) {
                    return true;
                }
                return false;
            }

            public final String getError() {
                return this.error;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                String str = this.readId;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.voiceId;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int f10 = b.f((i11 + hashCode2) * 31, 31, this.isOffline);
                String str3 = this.error;
                if (str3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str3.hashCode();
                }
                int i12 = (f10 + hashCode3) * 31;
                String str4 = this.errorMessage;
                if (str4 != null) {
                    i10 = str4.hashCode();
                }
                return i12 + i10;
            }

            public final boolean isOffline() {
                return this.isOffline;
            }

            public String toString() {
                String str = this.readId;
                String str2 = this.voiceId;
                boolean z6 = this.isOffline;
                String str3 = this.error;
                String str4 = this.errorMessage;
                StringBuilder s10 = f.s("GlobalListenedError(readId=", str, ", voiceId=", str2, ", isOffline=");
                f.z(s10, z6, ", error=", str3, ", errorMessage=");
                return f.l(str4, Separators.RPAREN, s10);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedAccountButton;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedAccountButton extends Event {
            public static final HomeClickedAccountButton INSTANCE = new HomeClickedAccountButton();

            /* JADX WARN: Multi-variable type inference failed */
            private HomeClickedAccountButton() {
                super("reader_home_clicked_account_button", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof HomeClickedAccountButton)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -790048514;
            }

            public String toString() {
                return "HomeClickedAccountButton";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedContinueListeningRead;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedContinueListeningRead extends Event {
            public static final HomeClickedContinueListeningRead INSTANCE = new HomeClickedContinueListeningRead();

            /* JADX WARN: Multi-variable type inference failed */
            private HomeClickedContinueListeningRead() {
                super("reader_home_clicked_continue_listening_read", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof HomeClickedContinueListeningRead)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1117422135;
            }

            public String toString() {
                return "HomeClickedContinueListeningRead";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedDiscoverGenreTile;", "Lio/elevenlabs/domain/Analytics$Event;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedDiscoverGenreTile extends Event {
            private final String value;

            public HomeClickedDiscoverGenreTile(String str) {
                super("reader_home_clicked_discover_genre_tile", i.l(str, "value", str), null);
                this.value = str;
            }

            public static /* synthetic */ HomeClickedDiscoverGenreTile copy$default(HomeClickedDiscoverGenreTile homeClickedDiscoverGenreTile, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedDiscoverGenreTile.value;
                }
                return homeClickedDiscoverGenreTile.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final HomeClickedDiscoverGenreTile copy(String value) {
                value.getClass();
                return new HomeClickedDiscoverGenreTile(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HomeClickedDiscoverGenreTile) && m.c(this.value, ((HomeClickedDiscoverGenreTile) other).value)) {
                    return true;
                }
                return false;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return f.C("HomeClickedDiscoverGenreTile(value=", this.value, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedFilterPills;", "Lio/elevenlabs/domain/Analytics$Event;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedFilterPills extends Event {
            private final String value;

            public HomeClickedFilterPills(String str) {
                super("reader_home_clicked_filter_pills", i.l(str, "value", str), null);
                this.value = str;
            }

            public static /* synthetic */ HomeClickedFilterPills copy$default(HomeClickedFilterPills homeClickedFilterPills, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedFilterPills.value;
                }
                return homeClickedFilterPills.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final HomeClickedFilterPills copy(String value) {
                value.getClass();
                return new HomeClickedFilterPills(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HomeClickedFilterPills) && m.c(this.value, ((HomeClickedFilterPills) other).value)) {
                    return true;
                }
                return false;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return f.C("HomeClickedFilterPills(value=", this.value, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedFilteredItem;", "Lio/elevenlabs/domain/Analytics$Event;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedFilteredItem extends Event {
            private final String value;

            public HomeClickedFilteredItem(String str) {
                super("reader_home_clicked_filtered_item", i.l(str, "value", str), null);
                this.value = str;
            }

            public static /* synthetic */ HomeClickedFilteredItem copy$default(HomeClickedFilteredItem homeClickedFilteredItem, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedFilteredItem.value;
                }
                return homeClickedFilteredItem.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final HomeClickedFilteredItem copy(String value) {
                value.getClass();
                return new HomeClickedFilteredItem(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HomeClickedFilteredItem) && m.c(this.value, ((HomeClickedFilteredItem) other).value)) {
                    return true;
                }
                return false;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return f.C("HomeClickedFilteredItem(value=", this.value, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedListeningGoal;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedListeningGoal extends Event {
            public static final HomeClickedListeningGoal INSTANCE = new HomeClickedListeningGoal();

            /* JADX WARN: Multi-variable type inference failed */
            private HomeClickedListeningGoal() {
                super("reader_home_clicked_listening_goal", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof HomeClickedListeningGoal)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 310265773;
            }

            public String toString() {
                return "HomeClickedListeningGoal";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedRecentReadItem;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedRecentReadItem extends Event {
            public static final HomeClickedRecentReadItem INSTANCE = new HomeClickedRecentReadItem();

            /* JADX WARN: Multi-variable type inference failed */
            private HomeClickedRecentReadItem() {
                super("reader_home_clicked_recent_read_item", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof HomeClickedRecentReadItem)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1880591333;
            }

            public String toString() {
                return "HomeClickedRecentReadItem";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedSearchButton;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedSearchButton extends Event {
            public static final HomeClickedSearchButton INSTANCE = new HomeClickedSearchButton();

            /* JADX WARN: Multi-variable type inference failed */
            private HomeClickedSearchButton() {
                super("reader_home_clicked_search_button", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof HomeClickedSearchButton)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2009748005;
            }

            public String toString() {
                return "HomeClickedSearchButton";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedSearchResult;", "Lio/elevenlabs/domain/Analytics$Event;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedSearchResult extends Event {
            private final String type;

            public HomeClickedSearchResult(String str) {
                super("reader_home_clicked_search_result", i.l(str, "type", str), null);
                this.type = str;
            }

            public static /* synthetic */ HomeClickedSearchResult copy$default(HomeClickedSearchResult homeClickedSearchResult, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedSearchResult.type;
                }
                return homeClickedSearchResult.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final HomeClickedSearchResult copy(String type) {
                type.getClass();
                return new HomeClickedSearchResult(type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HomeClickedSearchResult) && m.c(this.type, ((HomeClickedSearchResult) other).type)) {
                    return true;
                }
                return false;
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                return f.C("HomeClickedSearchResult(type=", this.type, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedSectionItem;", "Lio/elevenlabs/domain/Analytics$Event;", "sectionType", "", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSectionType", "()Ljava/lang/String;", "getItemId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedSectionItem extends Event {
            private final String itemId;
            private final String sectionType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HomeClickedSectionItem(String str, String str2) {
                super("reader_home_clicked_section_item", a0.J(new k("section_type", str), new k(FirebaseAnalytics.Param.ITEM_ID, str2)), null);
                str.getClass();
                this.sectionType = str;
                this.itemId = str2;
            }

            public static /* synthetic */ HomeClickedSectionItem copy$default(HomeClickedSectionItem homeClickedSectionItem, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedSectionItem.sectionType;
                }
                if ((i10 & 2) != 0) {
                    str2 = homeClickedSectionItem.itemId;
                }
                return homeClickedSectionItem.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSectionType() {
                return this.sectionType;
            }

            /* renamed from: component2, reason: from getter */
            public final String getItemId() {
                return this.itemId;
            }

            public final HomeClickedSectionItem copy(String sectionType, String itemId) {
                sectionType.getClass();
                return new HomeClickedSectionItem(sectionType, itemId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeClickedSectionItem)) {
                    return false;
                }
                HomeClickedSectionItem homeClickedSectionItem = (HomeClickedSectionItem) other;
                if (m.c(this.sectionType, homeClickedSectionItem.sectionType) && m.c(this.itemId, homeClickedSectionItem.itemId)) {
                    return true;
                }
                return false;
            }

            public final String getItemId() {
                return this.itemId;
            }

            public final String getSectionType() {
                return this.sectionType;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.sectionType.hashCode() * 31;
                String str = this.itemId;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return h.c("HomeClickedSectionItem(sectionType=", this.sectionType, ", itemId=", this.itemId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedTopPicksCollectionBanner;", "Lio/elevenlabs/domain/Analytics$Event;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedTopPicksCollectionBanner extends Event {
            private final String value;

            public HomeClickedTopPicksCollectionBanner(String str) {
                super("reader_home_clicked_top_picks_collection_banner", i.l(str, "value", str), null);
                this.value = str;
            }

            public static /* synthetic */ HomeClickedTopPicksCollectionBanner copy$default(HomeClickedTopPicksCollectionBanner homeClickedTopPicksCollectionBanner, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedTopPicksCollectionBanner.value;
                }
                return homeClickedTopPicksCollectionBanner.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final HomeClickedTopPicksCollectionBanner copy(String value) {
                value.getClass();
                return new HomeClickedTopPicksCollectionBanner(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HomeClickedTopPicksCollectionBanner) && m.c(this.value, ((HomeClickedTopPicksCollectionBanner) other).value)) {
                    return true;
                }
                return false;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return f.C("HomeClickedTopPicksCollectionBanner(value=", this.value, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedTopPicksRead;", "Lio/elevenlabs/domain/Analytics$Event;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedTopPicksRead extends Event {
            private final String value;

            public HomeClickedTopPicksRead(String str) {
                super("reader_home_clicked_top_picks_read", i.l(str, "value", str), null);
                this.value = str;
            }

            public static /* synthetic */ HomeClickedTopPicksRead copy$default(HomeClickedTopPicksRead homeClickedTopPicksRead, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedTopPicksRead.value;
                }
                return homeClickedTopPicksRead.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final HomeClickedTopPicksRead copy(String value) {
                value.getClass();
                return new HomeClickedTopPicksRead(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HomeClickedTopPicksRead) && m.c(this.value, ((HomeClickedTopPicksRead) other).value)) {
                    return true;
                }
                return false;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return f.C("HomeClickedTopPicksRead(value=", this.value, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedTrendingReleaseRead;", "Lio/elevenlabs/domain/Analytics$Event;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedTrendingReleaseRead extends Event {
            private final String value;

            public HomeClickedTrendingReleaseRead(String str) {
                super("reader_home_clicked_trending_release_read", i.l(str, "value", str), null);
                this.value = str;
            }

            public static /* synthetic */ HomeClickedTrendingReleaseRead copy$default(HomeClickedTrendingReleaseRead homeClickedTrendingReleaseRead, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedTrendingReleaseRead.value;
                }
                return homeClickedTrendingReleaseRead.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final HomeClickedTrendingReleaseRead copy(String value) {
                value.getClass();
                return new HomeClickedTrendingReleaseRead(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HomeClickedTrendingReleaseRead) && m.c(this.value, ((HomeClickedTrendingReleaseRead) other).value)) {
                    return true;
                }
                return false;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return f.C("HomeClickedTrendingReleaseRead(value=", this.value, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedUploadBannerButton;", "Lio/elevenlabs/domain/Analytics$Event;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedUploadBannerButton extends Event {
            private final String type;

            public HomeClickedUploadBannerButton(String str) {
                super("reader_home_clicked_upload_banner_button", i.l(str, "type", str), null);
                this.type = str;
            }

            public static /* synthetic */ HomeClickedUploadBannerButton copy$default(HomeClickedUploadBannerButton homeClickedUploadBannerButton, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedUploadBannerButton.type;
                }
                return homeClickedUploadBannerButton.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final HomeClickedUploadBannerButton copy(String type) {
                type.getClass();
                return new HomeClickedUploadBannerButton(type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HomeClickedUploadBannerButton) && m.c(this.type, ((HomeClickedUploadBannerButton) other).type)) {
                    return true;
                }
                return false;
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                return f.C("HomeClickedUploadBannerButton(type=", this.type, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeClickedWhatsNewAnnouncement;", "Lio/elevenlabs/domain/Analytics$Event;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeClickedWhatsNewAnnouncement extends Event {
            private final String value;

            public HomeClickedWhatsNewAnnouncement(String str) {
                super("reader_home_clicked_whats_new_announcement", i.l(str, "value", str), null);
                this.value = str;
            }

            public static /* synthetic */ HomeClickedWhatsNewAnnouncement copy$default(HomeClickedWhatsNewAnnouncement homeClickedWhatsNewAnnouncement, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeClickedWhatsNewAnnouncement.value;
                }
                return homeClickedWhatsNewAnnouncement.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final HomeClickedWhatsNewAnnouncement copy(String value) {
                value.getClass();
                return new HomeClickedWhatsNewAnnouncement(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof HomeClickedWhatsNewAnnouncement) && m.c(this.value, ((HomeClickedWhatsNewAnnouncement) other).value)) {
                    return true;
                }
                return false;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return f.C("HomeClickedWhatsNewAnnouncement(value=", this.value, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeSavedListeningGoal;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeSavedListeningGoal extends Event {
            public static final HomeSavedListeningGoal INSTANCE = new HomeSavedListeningGoal();

            /* JADX WARN: Multi-variable type inference failed */
            private HomeSavedListeningGoal() {
                super("reader_home_saved_listening_goal", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof HomeSavedListeningGoal)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1668093645;
            }

            public String toString() {
                return "HomeSavedListeningGoal";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$HomeViewedPage;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeViewedPage extends Event {
            public static final HomeViewedPage INSTANCE = new HomeViewedPage();

            /* JADX WARN: Multi-variable type inference failed */
            private HomeViewedPage() {
                super("reader_home_viewed_page", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof HomeViewedPage)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -597643175;
            }

            public String toString() {
                return "HomeViewedPage";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$IntroPageViewed;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class IntroPageViewed extends Event {
            public static final IntroPageViewed INSTANCE = new IntroPageViewed();

            /* JADX WARN: Multi-variable type inference failed */
            private IntroPageViewed() {
                super("reader_intro_page_viewed", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof IntroPageViewed)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -623841672;
            }

            public String toString() {
                return "IntroPageViewed";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$IsSignedIn;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class IsSignedIn extends Event {
            public static final IsSignedIn INSTANCE = new IsSignedIn();

            /* JADX WARN: Multi-variable type inference failed */
            private IsSignedIn() {
                super("reader_global_is_signed_in", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof IsSignedIn)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -645113966;
            }

            public String toString() {
                return "IsSignedIn";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$LoginWithGoogleTermsCanceled;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class LoginWithGoogleTermsCanceled extends Event {
            public static final LoginWithGoogleTermsCanceled INSTANCE = new LoginWithGoogleTermsCanceled();

            /* JADX WARN: Multi-variable type inference failed */
            private LoginWithGoogleTermsCanceled() {
                super("reader_login_with_google_terms_canceled", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof LoginWithGoogleTermsCanceled)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1477835871;
            }

            public String toString() {
                return "LoginWithGoogleTermsCanceled";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$NotificationClicked;", "Lio/elevenlabs/domain/Analytics$Event;", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NotificationClicked extends Event {
            private final String label;

            public NotificationClicked(String str) {
                super("reader_global_push_notification_clicked", i.l(str, Constants.ScionAnalytics.PARAM_LABEL, str), null);
                this.label = str;
            }

            public static /* synthetic */ NotificationClicked copy$default(NotificationClicked notificationClicked, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = notificationClicked.label;
                }
                return notificationClicked.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            public final NotificationClicked copy(String label) {
                label.getClass();
                return new NotificationClicked(label);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof NotificationClicked) && m.c(this.label, ((NotificationClicked) other).label)) {
                    return true;
                }
                return false;
            }

            public final String getLabel() {
                return this.label;
            }

            public int hashCode() {
                return this.label.hashCode();
            }

            public String toString() {
                return f.C("NotificationClicked(label=", this.label, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$NotificationReceived;", "Lio/elevenlabs/domain/Analytics$Event;", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NotificationReceived extends Event {
            private final String label;

            public NotificationReceived(String str) {
                super("reader_global_push_notification_received_android", i.l(str, Constants.ScionAnalytics.PARAM_LABEL, str), null);
                this.label = str;
            }

            public static /* synthetic */ NotificationReceived copy$default(NotificationReceived notificationReceived, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = notificationReceived.label;
                }
                return notificationReceived.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            public final NotificationReceived copy(String label) {
                label.getClass();
                return new NotificationReceived(label);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof NotificationReceived) && m.c(this.label, ((NotificationReceived) other).label)) {
                    return true;
                }
                return false;
            }

            public final String getLabel() {
                return this.label;
            }

            public int hashCode() {
                return this.label.hashCode();
            }

            public String toString() {
                return f.C("NotificationReceived(label=", this.label, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$NotificationsAllowedNotifications;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NotificationsAllowedNotifications extends Event {
            public static final NotificationsAllowedNotifications INSTANCE = new NotificationsAllowedNotifications();

            /* JADX WARN: Multi-variable type inference failed */
            private NotificationsAllowedNotifications() {
                super("reader_notifications_allowed_notifications", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof NotificationsAllowedNotifications)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2085644703;
            }

            public String toString() {
                return "NotificationsAllowedNotifications";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$NotificationsDisplayedAllowDialog;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NotificationsDisplayedAllowDialog extends Event {
            public static final NotificationsDisplayedAllowDialog INSTANCE = new NotificationsDisplayedAllowDialog();

            /* JADX WARN: Multi-variable type inference failed */
            private NotificationsDisplayedAllowDialog() {
                super("reader_notifications_displayed_allow_dialog", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof NotificationsDisplayedAllowDialog)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 368023697;
            }

            public String toString() {
                return "NotificationsDisplayedAllowDialog";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$NotificationsNotificationSettingsOpened;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NotificationsNotificationSettingsOpened extends Event {
            private final String source;

            public NotificationsNotificationSettingsOpened(String str) {
                super("reader_notifications_notification_settings_opened", i.l(str, "source", str), null);
                this.source = str;
            }

            public static /* synthetic */ NotificationsNotificationSettingsOpened copy$default(NotificationsNotificationSettingsOpened notificationsNotificationSettingsOpened, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = notificationsNotificationSettingsOpened.source;
                }
                return notificationsNotificationSettingsOpened.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public final NotificationsNotificationSettingsOpened copy(String source) {
                source.getClass();
                return new NotificationsNotificationSettingsOpened(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof NotificationsNotificationSettingsOpened) && m.c(this.source, ((NotificationsNotificationSettingsOpened) other).source)) {
                    return true;
                }
                return false;
            }

            public final String getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return f.C("NotificationsNotificationSettingsOpened(source=", this.source, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$NotificationsPrimerCtaClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NotificationsPrimerCtaClicked extends Event {
            private final String source;

            public NotificationsPrimerCtaClicked(String str) {
                super("reader_notifications_primer_cta_clicked", i.l(str, "source", str), null);
                this.source = str;
            }

            public static /* synthetic */ NotificationsPrimerCtaClicked copy$default(NotificationsPrimerCtaClicked notificationsPrimerCtaClicked, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = notificationsPrimerCtaClicked.source;
                }
                return notificationsPrimerCtaClicked.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public final NotificationsPrimerCtaClicked copy(String source) {
                source.getClass();
                return new NotificationsPrimerCtaClicked(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof NotificationsPrimerCtaClicked) && m.c(this.source, ((NotificationsPrimerCtaClicked) other).source)) {
                    return true;
                }
                return false;
            }

            public final String getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return f.C("NotificationsPrimerCtaClicked(source=", this.source, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$NotificationsRejectedNotifications;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NotificationsRejectedNotifications extends Event {
            public static final NotificationsRejectedNotifications INSTANCE = new NotificationsRejectedNotifications();

            /* JADX WARN: Multi-variable type inference failed */
            private NotificationsRejectedNotifications() {
                super("reader_notifications_rejected_notifications", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof NotificationsRejectedNotifications)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 820957929;
            }

            public String toString() {
                return "NotificationsRejectedNotifications";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$NotificationsViewedPrimer;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NotificationsViewedPrimer extends Event {
            private final String source;

            public NotificationsViewedPrimer(String str) {
                super("reader_notifications_viewed_primer", i.l(str, "source", str), null);
                this.source = str;
            }

            public static /* synthetic */ NotificationsViewedPrimer copy$default(NotificationsViewedPrimer notificationsViewedPrimer, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = notificationsViewedPrimer.source;
                }
                return notificationsViewedPrimer.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public final NotificationsViewedPrimer copy(String source) {
                source.getClass();
                return new NotificationsViewedPrimer(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof NotificationsViewedPrimer) && m.c(this.source, ((NotificationsViewedPrimer) other).source)) {
                    return true;
                }
                return false;
            }

            public final String getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return f.C("NotificationsViewedPrimer(source=", this.source, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadExpired;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "voiceId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OfflineDownloadExpired extends Event {
            private final String readId;
            private final String type;
            private final String voiceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OfflineDownloadExpired(String str, String str2, String str3) {
                super("reader_offline_download_expired", a0.J(new k("read_id", str), new k("voice_id", str2), new k("type", str3)), null);
                str.getClass();
                str2.getClass();
                str3.getClass();
                this.readId = str;
                this.voiceId = str2;
                this.type = str3;
            }

            public static /* synthetic */ OfflineDownloadExpired copy$default(OfflineDownloadExpired offlineDownloadExpired, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = offlineDownloadExpired.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = offlineDownloadExpired.voiceId;
                }
                if ((i10 & 4) != 0) {
                    str3 = offlineDownloadExpired.type;
                }
                return offlineDownloadExpired.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final OfflineDownloadExpired copy(String readId, String voiceId, String type) {
                readId.getClass();
                voiceId.getClass();
                type.getClass();
                return new OfflineDownloadExpired(readId, voiceId, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfflineDownloadExpired)) {
                    return false;
                }
                OfflineDownloadExpired offlineDownloadExpired = (OfflineDownloadExpired) other;
                if (m.c(this.readId, offlineDownloadExpired.readId) && m.c(this.voiceId, offlineDownloadExpired.voiceId) && m.c(this.type, offlineDownloadExpired.type)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getType() {
                return this.type;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                return this.type.hashCode() + c.c(this.readId.hashCode() * 31, 31, this.voiceId);
            }

            public String toString() {
                return f.l(this.type, Separators.RPAREN, f.s("OfflineDownloadExpired(readId=", this.readId, ", voiceId=", this.voiceId, ", type="));
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadRemoved;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "voiceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OfflineDownloadRemoved extends Event {
            private final String readId;
            private final String voiceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OfflineDownloadRemoved(String str, String str2) {
                super("reader_offline_download_removed", a0.R(tn.n.F0(new k[]{new k("read_id", str), str2 == null ? null : new k("voice_id", str2)})), null);
                str.getClass();
                this.readId = str;
                this.voiceId = str2;
            }

            public static /* synthetic */ OfflineDownloadRemoved copy$default(OfflineDownloadRemoved offlineDownloadRemoved, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = offlineDownloadRemoved.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = offlineDownloadRemoved.voiceId;
                }
                return offlineDownloadRemoved.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final OfflineDownloadRemoved copy(String readId, String voiceId) {
                readId.getClass();
                return new OfflineDownloadRemoved(readId, voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfflineDownloadRemoved)) {
                    return false;
                }
                OfflineDownloadRemoved offlineDownloadRemoved = (OfflineDownloadRemoved) other;
                if (m.c(this.readId, offlineDownloadRemoved.readId) && m.c(this.voiceId, offlineDownloadRemoved.voiceId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.readId.hashCode() * 31;
                String str = this.voiceId;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return h.c("OfflineDownloadRemoved(readId=", this.readId, ", voiceId=", this.voiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadsRemovedAll;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OfflineDownloadsRemovedAll extends Event {
            public static final OfflineDownloadsRemovedAll INSTANCE = new OfflineDownloadsRemovedAll();

            /* JADX WARN: Multi-variable type inference failed */
            private OfflineDownloadsRemovedAll() {
                super("reader_offline_downloads_removed_all", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof OfflineDownloadsRemovedAll)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1530480;
            }

            public String toString() {
                return "OfflineDownloadsRemovedAll";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OnboardingCompletedOnboarding;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OnboardingCompletedOnboarding extends Event {
            public static final OnboardingCompletedOnboarding INSTANCE = new OnboardingCompletedOnboarding();

            /* JADX WARN: Multi-variable type inference failed */
            private OnboardingCompletedOnboarding() {
                super("reader_onboarding_completed_onboarding", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof OnboardingCompletedOnboarding)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 195589732;
            }

            public String toString() {
                return "OnboardingCompletedOnboarding";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OnboardingDOBInput;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SubmittedDOB", "Skipped", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class OnboardingDOBInput {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ OnboardingDOBInput[] $VALUES;
            private final String value;
            public static final OnboardingDOBInput SubmittedDOB = new OnboardingDOBInput("SubmittedDOB", 0, "submitted_dob");
            public static final OnboardingDOBInput Skipped = new OnboardingDOBInput("Skipped", 1, "skipped");

            private static final /* synthetic */ OnboardingDOBInput[] $values() {
                return new OnboardingDOBInput[]{SubmittedDOB, Skipped};
            }

            static {
                OnboardingDOBInput[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private OnboardingDOBInput(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static OnboardingDOBInput valueOf(String str) {
                return (OnboardingDOBInput) Enum.valueOf(OnboardingDOBInput.class, str);
            }

            public static OnboardingDOBInput[] values() {
                return (OnboardingDOBInput[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedContentType;", "Lio/elevenlabs/domain/Analytics$Event;", "contentTypes", "", "", "<init>", "(Ljava/util/List;)V", "getContentTypes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OnboardingSelectedContentType extends Event {
            private final List<String> contentTypes;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public OnboardingSelectedContentType(List<String> list) {
                super("reader_onboarding_selected_content_type", r0, null);
                list.getClass();
                Map singletonMap = Collections.singletonMap("content_types", list);
                singletonMap.getClass();
                this.contentTypes = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OnboardingSelectedContentType copy$default(OnboardingSelectedContentType onboardingSelectedContentType, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = onboardingSelectedContentType.contentTypes;
                }
                return onboardingSelectedContentType.copy(list);
            }

            public final List<String> component1() {
                return this.contentTypes;
            }

            public final OnboardingSelectedContentType copy(List<String> contentTypes) {
                contentTypes.getClass();
                return new OnboardingSelectedContentType(contentTypes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof OnboardingSelectedContentType) && m.c(this.contentTypes, ((OnboardingSelectedContentType) other).contentTypes)) {
                    return true;
                }
                return false;
            }

            public final List<String> getContentTypes() {
                return this.contentTypes;
            }

            public int hashCode() {
                return this.contentTypes.hashCode();
            }

            public String toString() {
                return i.k("OnboardingSelectedContentType(contentTypes=", Separators.RPAREN, this.contentTypes);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedDOB;", "Lio/elevenlabs/domain/Analytics$Event;", "input", "Lio/elevenlabs/domain/Analytics$Event$OnboardingDOBInput;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$OnboardingDOBInput;)V", "getInput", "()Lio/elevenlabs/domain/Analytics$Event$OnboardingDOBInput;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OnboardingSelectedDOB extends Event {
            private final OnboardingDOBInput input;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public OnboardingSelectedDOB(OnboardingDOBInput onboardingDOBInput) {
                super("reader_onboarding_selected_dob", r0, null);
                onboardingDOBInput.getClass();
                Map singletonMap = Collections.singletonMap("input", onboardingDOBInput.getValue());
                singletonMap.getClass();
                this.input = onboardingDOBInput;
            }

            public static /* synthetic */ OnboardingSelectedDOB copy$default(OnboardingSelectedDOB onboardingSelectedDOB, OnboardingDOBInput onboardingDOBInput, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    onboardingDOBInput = onboardingSelectedDOB.input;
                }
                return onboardingSelectedDOB.copy(onboardingDOBInput);
            }

            /* renamed from: component1, reason: from getter */
            public final OnboardingDOBInput getInput() {
                return this.input;
            }

            public final OnboardingSelectedDOB copy(OnboardingDOBInput input) {
                input.getClass();
                return new OnboardingSelectedDOB(input);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof OnboardingSelectedDOB) && this.input == ((OnboardingSelectedDOB) other).input) {
                    return true;
                }
                return false;
            }

            public final OnboardingDOBInput getInput() {
                return this.input;
            }

            public int hashCode() {
                return this.input.hashCode();
            }

            public String toString() {
                return "OnboardingSelectedDOB(input=" + this.input + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedSource;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OnboardingSelectedSource extends Event {
            private final String source;

            public OnboardingSelectedSource(String str) {
                super("reader_onboarding_selected_source", i.l(str, "source", str), null);
                this.source = str;
            }

            public static /* synthetic */ OnboardingSelectedSource copy$default(OnboardingSelectedSource onboardingSelectedSource, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = onboardingSelectedSource.source;
                }
                return onboardingSelectedSource.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public final OnboardingSelectedSource copy(String source) {
                source.getClass();
                return new OnboardingSelectedSource(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof OnboardingSelectedSource) && m.c(this.source, ((OnboardingSelectedSource) other).source)) {
                    return true;
                }
                return false;
            }

            public final String getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return f.C("OnboardingSelectedSource(source=", this.source, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedTopics;", "Lio/elevenlabs/domain/Analytics$Event;", "topics", "", "", "<init>", "(Ljava/util/List;)V", "getTopics", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OnboardingSelectedTopics extends Event {
            private final List<String> topics;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public OnboardingSelectedTopics(List<String> list) {
                super("reader_onboarding_selected_topics", r0, null);
                list.getClass();
                Map singletonMap = Collections.singletonMap("topics", list);
                singletonMap.getClass();
                this.topics = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OnboardingSelectedTopics copy$default(OnboardingSelectedTopics onboardingSelectedTopics, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = onboardingSelectedTopics.topics;
                }
                return onboardingSelectedTopics.copy(list);
            }

            public final List<String> component1() {
                return this.topics;
            }

            public final OnboardingSelectedTopics copy(List<String> topics) {
                topics.getClass();
                return new OnboardingSelectedTopics(topics);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof OnboardingSelectedTopics) && m.c(this.topics, ((OnboardingSelectedTopics) other).topics)) {
                    return true;
                }
                return false;
            }

            public final List<String> getTopics() {
                return this.topics;
            }

            public int hashCode() {
                return this.topics.hashCode();
            }

            public String toString() {
                return i.k("OnboardingSelectedTopics(topics=", Separators.RPAREN, this.topics);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OnboardingSelectedVoice;", "Lio/elevenlabs/domain/Analytics$Event;", "voiceId", "", "<init>", "(Ljava/lang/String;)V", "getVoiceId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OnboardingSelectedVoice extends Event {
            private final String voiceId;

            public OnboardingSelectedVoice(String str) {
                super("reader_onboarding_selected_voice", i.l(str, "voice_id", str), null);
                this.voiceId = str;
            }

            public static /* synthetic */ OnboardingSelectedVoice copy$default(OnboardingSelectedVoice onboardingSelectedVoice, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = onboardingSelectedVoice.voiceId;
                }
                return onboardingSelectedVoice.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final OnboardingSelectedVoice copy(String voiceId) {
                voiceId.getClass();
                return new OnboardingSelectedVoice(voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof OnboardingSelectedVoice) && m.c(this.voiceId, ((OnboardingSelectedVoice) other).voiceId)) {
                    return true;
                }
                return false;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                return this.voiceId.hashCode();
            }

            public String toString() {
                return f.C("OnboardingSelectedVoice(voiceId=", this.voiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaidReadUnlocked;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaidReadUnlocked extends Event {
            public static final PaidReadUnlocked INSTANCE = new PaidReadUnlocked();

            /* JADX WARN: Multi-variable type inference failed */
            private PaidReadUnlocked() {
                super("reader_paid_read_unlocked", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PaidReadUnlocked)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1919835436;
            }

            public String toString() {
                return "PaidReadUnlocked";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentActivatedCreditPack;", "Lio/elevenlabs/domain/Analytics$Event;", "packId", "", "source", "Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;)V", "getPackId", "()Ljava/lang/String;", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentActivatedCreditPack extends Event {
            private final String packId;
            private final CreditPackSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentActivatedCreditPack(String str, CreditPackSource creditPackSource) {
                super("reader_payment_activated_credit_pack", a0.J(new k("plan", str), new k("source", creditPackSource.getValue())), null);
                str.getClass();
                creditPackSource.getClass();
                this.packId = str;
                this.source = creditPackSource;
            }

            public static /* synthetic */ PaymentActivatedCreditPack copy$default(PaymentActivatedCreditPack paymentActivatedCreditPack, String str, CreditPackSource creditPackSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = paymentActivatedCreditPack.packId;
                }
                if ((i10 & 2) != 0) {
                    creditPackSource = paymentActivatedCreditPack.source;
                }
                return paymentActivatedCreditPack.copy(str, creditPackSource);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPackId() {
                return this.packId;
            }

            /* renamed from: component2, reason: from getter */
            public final CreditPackSource getSource() {
                return this.source;
            }

            public final PaymentActivatedCreditPack copy(String packId, CreditPackSource source) {
                packId.getClass();
                source.getClass();
                return new PaymentActivatedCreditPack(packId, source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentActivatedCreditPack)) {
                    return false;
                }
                PaymentActivatedCreditPack paymentActivatedCreditPack = (PaymentActivatedCreditPack) other;
                if (m.c(this.packId, paymentActivatedCreditPack.packId) && this.source == paymentActivatedCreditPack.source) {
                    return true;
                }
                return false;
            }

            public final String getPackId() {
                return this.packId;
            }

            public final CreditPackSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode() + (this.packId.hashCode() * 31);
            }

            public String toString() {
                return "PaymentActivatedCreditPack(packId=" + this.packId + ", source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentClickedCreditPackPurchaseButton;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentClickedCreditPackPurchaseButton extends Event {
            private final CreditPackSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PaymentClickedCreditPackPurchaseButton(CreditPackSource creditPackSource) {
                super("reader_payment_clciked_credit_pack_purchase_button", r0, null);
                creditPackSource.getClass();
                Map singletonMap = Collections.singletonMap("source", creditPackSource.getValue());
                singletonMap.getClass();
                this.source = creditPackSource;
            }

            public static /* synthetic */ PaymentClickedCreditPackPurchaseButton copy$default(PaymentClickedCreditPackPurchaseButton paymentClickedCreditPackPurchaseButton, CreditPackSource creditPackSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    creditPackSource = paymentClickedCreditPackPurchaseButton.source;
                }
                return paymentClickedCreditPackPurchaseButton.copy(creditPackSource);
            }

            /* renamed from: component1, reason: from getter */
            public final CreditPackSource getSource() {
                return this.source;
            }

            public final PaymentClickedCreditPackPurchaseButton copy(CreditPackSource source) {
                source.getClass();
                return new PaymentClickedCreditPackPurchaseButton(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PaymentClickedCreditPackPurchaseButton) && this.source == ((PaymentClickedCreditPackPurchaseButton) other).source) {
                    return true;
                }
                return false;
            }

            public final CreditPackSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PaymentClickedCreditPackPurchaseButton(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentClickedPaywallCTA;", "Lio/elevenlabs/domain/Analytics$Event;", "plan", "", "source", "Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "currentPlan", "isTrial", "", "revenueCatOfferingId", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PaywallSource;Ljava/lang/String;ZLjava/lang/String;)V", "getPlan", "()Ljava/lang/String;", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "getCurrentPlan", "()Z", "getRevenueCatOfferingId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentClickedPaywallCTA extends Event {
            private final String currentPlan;
            private final boolean isTrial;
            private final String plan;
            private final String revenueCatOfferingId;
            private final PaywallSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentClickedPaywallCTA(String str, PaywallSource paywallSource, String str2, boolean z6, String str3) {
                super("reader_payment_clicked_paywall_cta_button", a0.J(new k("plan", str), new k("source", paywallSource.getValue()), new k("current_plan", str2), new k("is_free_trial", Boolean.valueOf(z6)), new k("revenuecat_offering_id", str3)), null);
                str.getClass();
                paywallSource.getClass();
                str2.getClass();
                this.plan = str;
                this.source = paywallSource;
                this.currentPlan = str2;
                this.isTrial = z6;
                this.revenueCatOfferingId = str3;
            }

            public static /* synthetic */ PaymentClickedPaywallCTA copy$default(PaymentClickedPaywallCTA paymentClickedPaywallCTA, String str, PaywallSource paywallSource, String str2, boolean z6, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = paymentClickedPaywallCTA.plan;
                }
                if ((i10 & 2) != 0) {
                    paywallSource = paymentClickedPaywallCTA.source;
                }
                if ((i10 & 4) != 0) {
                    str2 = paymentClickedPaywallCTA.currentPlan;
                }
                if ((i10 & 8) != 0) {
                    z6 = paymentClickedPaywallCTA.isTrial;
                }
                if ((i10 & 16) != 0) {
                    str3 = paymentClickedPaywallCTA.revenueCatOfferingId;
                }
                String str4 = str3;
                String str5 = str2;
                return paymentClickedPaywallCTA.copy(str, paywallSource, str5, z6, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPlan() {
                return this.plan;
            }

            /* renamed from: component2, reason: from getter */
            public final PaywallSource getSource() {
                return this.source;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsTrial() {
                return this.isTrial;
            }

            /* renamed from: component5, reason: from getter */
            public final String getRevenueCatOfferingId() {
                return this.revenueCatOfferingId;
            }

            public final PaymentClickedPaywallCTA copy(String plan, PaywallSource source, String currentPlan, boolean isTrial, String revenueCatOfferingId) {
                plan.getClass();
                source.getClass();
                currentPlan.getClass();
                return new PaymentClickedPaywallCTA(plan, source, currentPlan, isTrial, revenueCatOfferingId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentClickedPaywallCTA)) {
                    return false;
                }
                PaymentClickedPaywallCTA paymentClickedPaywallCTA = (PaymentClickedPaywallCTA) other;
                if (m.c(this.plan, paymentClickedPaywallCTA.plan) && this.source == paymentClickedPaywallCTA.source && m.c(this.currentPlan, paymentClickedPaywallCTA.currentPlan) && this.isTrial == paymentClickedPaywallCTA.isTrial && m.c(this.revenueCatOfferingId, paymentClickedPaywallCTA.revenueCatOfferingId)) {
                    return true;
                }
                return false;
            }

            public final String getCurrentPlan() {
                return this.currentPlan;
            }

            public final String getPlan() {
                return this.plan;
            }

            public final String getRevenueCatOfferingId() {
                return this.revenueCatOfferingId;
            }

            public final PaywallSource getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                int f10 = b.f(c.c((this.source.hashCode() + (this.plan.hashCode() * 31)) * 31, 31, this.currentPlan), 31, this.isTrial);
                String str = this.revenueCatOfferingId;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return f10 + hashCode;
            }

            public final boolean isTrial() {
                return this.isTrial;
            }

            public String toString() {
                String str = this.plan;
                PaywallSource paywallSource = this.source;
                String str2 = this.currentPlan;
                boolean z6 = this.isTrial;
                String str3 = this.revenueCatOfferingId;
                StringBuilder sb = new StringBuilder("PaymentClickedPaywallCTA(plan=");
                sb.append(str);
                sb.append(", source=");
                sb.append(paywallSource);
                sb.append(", currentPlan=");
                f.y(sb, str2, ", isTrial=", z6, ", revenueCatOfferingId=");
                return f.l(str3, Separators.RPAREN, sb);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentClosedSubscriptionPaywall;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "revenueCatOfferingId", "", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PaywallSource;Ljava/lang/String;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "getRevenueCatOfferingId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentClosedSubscriptionPaywall extends Event {
            private final String revenueCatOfferingId;
            private final PaywallSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentClosedSubscriptionPaywall(PaywallSource paywallSource, String str) {
                super("reader_payment_closed_subscription_paywall", a0.J(new k("source", paywallSource.getValue()), new k("revenuecat_offering_id", str)), null);
                paywallSource.getClass();
                this.source = paywallSource;
                this.revenueCatOfferingId = str;
            }

            public static /* synthetic */ PaymentClosedSubscriptionPaywall copy$default(PaymentClosedSubscriptionPaywall paymentClosedSubscriptionPaywall, PaywallSource paywallSource, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    paywallSource = paymentClosedSubscriptionPaywall.source;
                }
                if ((i10 & 2) != 0) {
                    str = paymentClosedSubscriptionPaywall.revenueCatOfferingId;
                }
                return paymentClosedSubscriptionPaywall.copy(paywallSource, str);
            }

            /* renamed from: component1, reason: from getter */
            public final PaywallSource getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getRevenueCatOfferingId() {
                return this.revenueCatOfferingId;
            }

            public final PaymentClosedSubscriptionPaywall copy(PaywallSource source, String revenueCatOfferingId) {
                source.getClass();
                return new PaymentClosedSubscriptionPaywall(source, revenueCatOfferingId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentClosedSubscriptionPaywall)) {
                    return false;
                }
                PaymentClosedSubscriptionPaywall paymentClosedSubscriptionPaywall = (PaymentClosedSubscriptionPaywall) other;
                if (this.source == paymentClosedSubscriptionPaywall.source && m.c(this.revenueCatOfferingId, paymentClosedSubscriptionPaywall.revenueCatOfferingId)) {
                    return true;
                }
                return false;
            }

            public final String getRevenueCatOfferingId() {
                return this.revenueCatOfferingId;
            }

            public final PaywallSource getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.source.hashCode() * 31;
                String str = this.revenueCatOfferingId;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return "PaymentClosedSubscriptionPaywall(source=" + this.source + ", revenueCatOfferingId=" + this.revenueCatOfferingId + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentCompletedPurchase;", "Lio/elevenlabs/domain/Analytics$Event;", "Lio/elevenlabs/domain/Analytics$Event$ConversionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentCompletedPurchase extends Event implements ConversionEvent {
            public static final PaymentCompletedPurchase INSTANCE = new PaymentCompletedPurchase();

            /* JADX WARN: Multi-variable type inference failed */
            private PaymentCompletedPurchase() {
                super("reader_payment_completed_purchase", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PaymentCompletedPurchase)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -180130387;
            }

            public String toString() {
                return "PaymentCompletedPurchase";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentError;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PaymentErrorSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PaymentErrorSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PaymentErrorSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentError extends Event {
            private final PaymentErrorSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PaymentError(PaymentErrorSource paymentErrorSource) {
                super("reader_payment_error", r0, null);
                paymentErrorSource.getClass();
                Map singletonMap = Collections.singletonMap("source", paymentErrorSource.getValue());
                singletonMap.getClass();
                this.source = paymentErrorSource;
            }

            public static /* synthetic */ PaymentError copy$default(PaymentError paymentError, PaymentErrorSource paymentErrorSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    paymentErrorSource = paymentError.source;
                }
                return paymentError.copy(paymentErrorSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PaymentErrorSource getSource() {
                return this.source;
            }

            public final PaymentError copy(PaymentErrorSource source) {
                source.getClass();
                return new PaymentError(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PaymentError) && this.source == ((PaymentError) other).source) {
                    return true;
                }
                return false;
            }

            public final PaymentErrorSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PaymentError(source=" + this.source + Separators.RPAREN;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentErrorSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Paywall", "CreditPack", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class PaymentErrorSource {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ PaymentErrorSource[] $VALUES;
            private final String value;
            public static final PaymentErrorSource Paywall = new PaymentErrorSource("Paywall", 0, "paywall");
            public static final PaymentErrorSource CreditPack = new PaymentErrorSource("CreditPack", 1, "credit_pack");

            private static final /* synthetic */ PaymentErrorSource[] $values() {
                return new PaymentErrorSource[]{Paywall, CreditPack};
            }

            static {
                PaymentErrorSource[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private PaymentErrorSource(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static PaymentErrorSource valueOf(String str) {
                return (PaymentErrorSource) Enum.valueOf(PaymentErrorSource.class, str);
            }

            public static PaymentErrorSource[] values() {
                return (PaymentErrorSource[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentIntendedPurchase;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentIntendedPurchase extends Event {
            public static final PaymentIntendedPurchase INSTANCE = new PaymentIntendedPurchase();

            /* JADX WARN: Multi-variable type inference failed */
            private PaymentIntendedPurchase() {
                super("reader_payment_intended_purchase", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PaymentIntendedPurchase)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 773892331;
            }

            public String toString() {
                return "PaymentIntendedPurchase";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentRedeemedCode;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentRedeemedCode extends Event {
            public static final PaymentRedeemedCode INSTANCE = new PaymentRedeemedCode();

            /* JADX WARN: Multi-variable type inference failed */
            private PaymentRedeemedCode() {
                super("reader_payment_redeemed_code", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PaymentRedeemedCode)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -459026969;
            }

            public String toString() {
                return "PaymentRedeemedCode";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003JF\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0004HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentStartedTrial;", "Lio/elevenlabs/domain/Analytics$Event;", "Lio/elevenlabs/domain/Analytics$Event$ConversionEvent;", "plan", "", "source", "Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "revenueCatOfferingId", FirebaseAnalytics.Param.PRICE, "", FirebaseAnalytics.Param.CURRENCY, "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PaywallSource;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getPlan", "()Ljava/lang/String;", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "getRevenueCatOfferingId", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PaywallSource;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/domain/Analytics$Event$PaymentStartedTrial;", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentStartedTrial extends Event implements ConversionEvent {
            private final String currency;
            private final String plan;
            private final Double price;
            private final String revenueCatOfferingId;
            private final PaywallSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentStartedTrial(String str, PaywallSource paywallSource, String str2, Double d10, String str3) {
                super("reader_payment_started_trial", a0.J(new k("plan", str), new k("source", paywallSource.getValue()), new k("revenuecat_offering_id", str2), new k(FirebaseAnalytics.Param.PRICE, d10), new k(FirebaseAnalytics.Param.CURRENCY, str3)), null);
                str.getClass();
                paywallSource.getClass();
                this.plan = str;
                this.source = paywallSource;
                this.revenueCatOfferingId = str2;
                this.price = d10;
                this.currency = str3;
            }

            public static /* synthetic */ PaymentStartedTrial copy$default(PaymentStartedTrial paymentStartedTrial, String str, PaywallSource paywallSource, String str2, Double d10, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = paymentStartedTrial.plan;
                }
                if ((i10 & 2) != 0) {
                    paywallSource = paymentStartedTrial.source;
                }
                if ((i10 & 4) != 0) {
                    str2 = paymentStartedTrial.revenueCatOfferingId;
                }
                if ((i10 & 8) != 0) {
                    d10 = paymentStartedTrial.price;
                }
                if ((i10 & 16) != 0) {
                    str3 = paymentStartedTrial.currency;
                }
                String str4 = str3;
                String str5 = str2;
                return paymentStartedTrial.copy(str, paywallSource, str5, d10, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPlan() {
                return this.plan;
            }

            /* renamed from: component2, reason: from getter */
            public final PaywallSource getSource() {
                return this.source;
            }

            /* renamed from: component3, reason: from getter */
            public final String getRevenueCatOfferingId() {
                return this.revenueCatOfferingId;
            }

            /* renamed from: component4, reason: from getter */
            public final Double getPrice() {
                return this.price;
            }

            /* renamed from: component5, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            public final PaymentStartedTrial copy(String plan, PaywallSource source, String revenueCatOfferingId, Double price, String currency) {
                plan.getClass();
                source.getClass();
                return new PaymentStartedTrial(plan, source, revenueCatOfferingId, price, currency);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentStartedTrial)) {
                    return false;
                }
                PaymentStartedTrial paymentStartedTrial = (PaymentStartedTrial) other;
                if (m.c(this.plan, paymentStartedTrial.plan) && this.source == paymentStartedTrial.source && m.c(this.revenueCatOfferingId, paymentStartedTrial.revenueCatOfferingId) && m.c(this.price, paymentStartedTrial.price) && m.c(this.currency, paymentStartedTrial.currency)) {
                    return true;
                }
                return false;
            }

            public final String getCurrency() {
                return this.currency;
            }

            public final String getPlan() {
                return this.plan;
            }

            public final Double getPrice() {
                return this.price;
            }

            public final String getRevenueCatOfferingId() {
                return this.revenueCatOfferingId;
            }

            public final PaywallSource getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3 = (this.source.hashCode() + (this.plan.hashCode() * 31)) * 31;
                String str = this.revenueCatOfferingId;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (hashCode3 + hashCode) * 31;
                Double d10 = this.price;
                if (d10 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = d10.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str2 = this.currency;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return i12 + i10;
            }

            public String toString() {
                String str = this.plan;
                PaywallSource paywallSource = this.source;
                String str2 = this.revenueCatOfferingId;
                Double d10 = this.price;
                String str3 = this.currency;
                StringBuilder sb = new StringBuilder("PaymentStartedTrial(plan=");
                sb.append(str);
                sb.append(", source=");
                sb.append(paywallSource);
                sb.append(", revenueCatOfferingId=");
                sb.append(str2);
                sb.append(", price=");
                sb.append(d10);
                sb.append(", currency=");
                return f.l(str3, Separators.RPAREN, sb);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentViewedCreditPackPage;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentViewedCreditPackPage extends Event {
            public static final PaymentViewedCreditPackPage INSTANCE = new PaymentViewedCreditPackPage();

            /* JADX WARN: Multi-variable type inference failed */
            private PaymentViewedCreditPackPage() {
                super("reader_payment_viewed_credit_pack_page", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PaymentViewedCreditPackPage)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1765534556;
            }

            public String toString() {
                return "PaymentViewedCreditPackPage";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentViewedCreditPackSheet;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$CreditPackSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentViewedCreditPackSheet extends Event {
            private final CreditPackSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PaymentViewedCreditPackSheet(CreditPackSource creditPackSource) {
                super("reader_payment_viewed_credit_pack_sheet", r0, null);
                creditPackSource.getClass();
                Map singletonMap = Collections.singletonMap("source", creditPackSource.getValue());
                singletonMap.getClass();
                this.source = creditPackSource;
            }

            public static /* synthetic */ PaymentViewedCreditPackSheet copy$default(PaymentViewedCreditPackSheet paymentViewedCreditPackSheet, CreditPackSource creditPackSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    creditPackSource = paymentViewedCreditPackSheet.source;
                }
                return paymentViewedCreditPackSheet.copy(creditPackSource);
            }

            /* renamed from: component1, reason: from getter */
            public final CreditPackSource getSource() {
                return this.source;
            }

            public final PaymentViewedCreditPackSheet copy(CreditPackSource source) {
                source.getClass();
                return new PaymentViewedCreditPackSheet(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PaymentViewedCreditPackSheet) && this.source == ((PaymentViewedCreditPackSheet) other).source) {
                    return true;
                }
                return false;
            }

            public final CreditPackSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PaymentViewedCreditPackSheet(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaymentViewedSubscriptionPaywall;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "revenueCatOfferingId", "", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PaywallSource;Ljava/lang/String;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "getRevenueCatOfferingId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PaymentViewedSubscriptionPaywall extends Event {
            private final String revenueCatOfferingId;
            private final PaywallSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentViewedSubscriptionPaywall(PaywallSource paywallSource, String str) {
                super("reader_payment_viewed_subscription_paywall", a0.J(new k("source", paywallSource.getValue()), new k("revenuecat_offering_id", str)), null);
                paywallSource.getClass();
                this.source = paywallSource;
                this.revenueCatOfferingId = str;
            }

            public static /* synthetic */ PaymentViewedSubscriptionPaywall copy$default(PaymentViewedSubscriptionPaywall paymentViewedSubscriptionPaywall, PaywallSource paywallSource, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    paywallSource = paymentViewedSubscriptionPaywall.source;
                }
                if ((i10 & 2) != 0) {
                    str = paymentViewedSubscriptionPaywall.revenueCatOfferingId;
                }
                return paymentViewedSubscriptionPaywall.copy(paywallSource, str);
            }

            /* renamed from: component1, reason: from getter */
            public final PaywallSource getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getRevenueCatOfferingId() {
                return this.revenueCatOfferingId;
            }

            public final PaymentViewedSubscriptionPaywall copy(PaywallSource source, String revenueCatOfferingId) {
                source.getClass();
                return new PaymentViewedSubscriptionPaywall(source, revenueCatOfferingId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentViewedSubscriptionPaywall)) {
                    return false;
                }
                PaymentViewedSubscriptionPaywall paymentViewedSubscriptionPaywall = (PaymentViewedSubscriptionPaywall) other;
                if (this.source == paymentViewedSubscriptionPaywall.source && m.c(this.revenueCatOfferingId, paymentViewedSubscriptionPaywall.revenueCatOfferingId)) {
                    return true;
                }
                return false;
            }

            public final String getRevenueCatOfferingId() {
                return this.revenueCatOfferingId;
            }

            public final PaywallSource getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.source.hashCode() * 31;
                String str = this.revenueCatOfferingId;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return "PaymentViewedSubscriptionPaywall(source=" + this.source + ", revenueCatOfferingId=" + this.revenueCatOfferingId + Separators.RPAREN;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Onboarding", "CreditsPath", "PremiumContent", "OfflineMode", "Account", "LowCreditsSheet", "NoCreditsSheet", "GenFM", "CreditHistory", "PlayerMenu", "ImportSheet", "ReturningUser", "VoiceDesign", "WinBack", "Home", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class PaywallSource {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ PaywallSource[] $VALUES;
            private final String value;
            public static final PaywallSource Onboarding = new PaywallSource("Onboarding", 0, "onboarding");
            public static final PaywallSource CreditsPath = new PaywallSource("CreditsPath", 1, "credits_pack");
            public static final PaywallSource PremiumContent = new PaywallSource("PremiumContent", 2, "premium_content");
            public static final PaywallSource OfflineMode = new PaywallSource("OfflineMode", 3, "offline_mode");
            public static final PaywallSource Account = new PaywallSource("Account", 4, "account");
            public static final PaywallSource LowCreditsSheet = new PaywallSource("LowCreditsSheet", 5, "low_credits_sheet");
            public static final PaywallSource NoCreditsSheet = new PaywallSource("NoCreditsSheet", 6, "no_credits_sheet");
            public static final PaywallSource GenFM = new PaywallSource("GenFM", 7, "genfm");
            public static final PaywallSource CreditHistory = new PaywallSource("CreditHistory", 8, "credit_history");
            public static final PaywallSource PlayerMenu = new PaywallSource("PlayerMenu", 9, "player_menu");
            public static final PaywallSource ImportSheet = new PaywallSource("ImportSheet", 10, "import_sheet");
            public static final PaywallSource ReturningUser = new PaywallSource("ReturningUser", 11, "returning_user");
            public static final PaywallSource VoiceDesign = new PaywallSource("VoiceDesign", 12, "voice_design");
            public static final PaywallSource WinBack = new PaywallSource("WinBack", 13, "win_back");
            public static final PaywallSource Home = new PaywallSource("Home", 14, ShowkasePreviewGroup.HOME);

            private static final /* synthetic */ PaywallSource[] $values() {
                return new PaywallSource[]{Onboarding, CreditsPath, PremiumContent, OfflineMode, Account, LowCreditsSheet, NoCreditsSheet, GenFM, CreditHistory, PlayerMenu, ImportSheet, ReturningUser, VoiceDesign, WinBack, Home};
            }

            static {
                PaywallSource[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private PaywallSource(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static PaywallSource valueOf(String str) {
                return (PaywallSource) Enum.valueOf(PaywallSource.class, str);
            }

            public static PaywallSource[] values() {
                return (PaywallSource[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PerformanceMeasured;", "Lio/elevenlabs/domain/Analytics$Event;", "devicePerformanceClass", "Lio/elevenlabs/domain/usecase/DevicePerformanceClass;", "additionalProperties", "", "", "", "<init>", "(Lio/elevenlabs/domain/usecase/DevicePerformanceClass;Ljava/util/Map;)V", "getDevicePerformanceClass", "()Lio/elevenlabs/domain/usecase/DevicePerformanceClass;", "getAdditionalProperties", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PerformanceMeasured extends Event {
            private final Map<String, Object> additionalProperties;
            private final DevicePerformanceClass devicePerformanceClass;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PerformanceMeasured(DevicePerformanceClass devicePerformanceClass, Map<String, ? extends Object> map) {
                super("reader_device_performance_measured", a0.N(r0, map), null);
                devicePerformanceClass.getClass();
                map.getClass();
                Map singletonMap = Collections.singletonMap("performance_class", devicePerformanceClass.getValue());
                singletonMap.getClass();
                this.devicePerformanceClass = devicePerformanceClass;
                this.additionalProperties = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PerformanceMeasured copy$default(PerformanceMeasured performanceMeasured, DevicePerformanceClass devicePerformanceClass, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    devicePerformanceClass = performanceMeasured.devicePerformanceClass;
                }
                if ((i10 & 2) != 0) {
                    map = performanceMeasured.additionalProperties;
                }
                return performanceMeasured.copy(devicePerformanceClass, map);
            }

            /* renamed from: component1, reason: from getter */
            public final DevicePerformanceClass getDevicePerformanceClass() {
                return this.devicePerformanceClass;
            }

            public final Map<String, Object> component2() {
                return this.additionalProperties;
            }

            public final PerformanceMeasured copy(DevicePerformanceClass devicePerformanceClass, Map<String, ? extends Object> additionalProperties) {
                devicePerformanceClass.getClass();
                additionalProperties.getClass();
                return new PerformanceMeasured(devicePerformanceClass, additionalProperties);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PerformanceMeasured)) {
                    return false;
                }
                PerformanceMeasured performanceMeasured = (PerformanceMeasured) other;
                if (this.devicePerformanceClass == performanceMeasured.devicePerformanceClass && m.c(this.additionalProperties, performanceMeasured.additionalProperties)) {
                    return true;
                }
                return false;
            }

            public final Map<String, Object> getAdditionalProperties() {
                return this.additionalProperties;
            }

            public final DevicePerformanceClass getDevicePerformanceClass() {
                return this.devicePerformanceClass;
            }

            public int hashCode() {
                return this.additionalProperties.hashCode() + (this.devicePerformanceClass.hashCode() * 31);
            }

            public String toString() {
                return "PerformanceMeasured(devicePerformanceClass=" + this.devicePerformanceClass + ", additionalProperties=" + this.additionalProperties + Separators.RPAREN;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BottomBar", "ActionsSheetQuickAction", "ActionsSheetMenuItem", "FloatingButton", "MediaButton", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class PlayerActionSource {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ PlayerActionSource[] $VALUES;
            private final String value;
            public static final PlayerActionSource BottomBar = new PlayerActionSource("BottomBar", 0, "bottom_bar");
            public static final PlayerActionSource ActionsSheetQuickAction = new PlayerActionSource("ActionsSheetQuickAction", 1, "actions_sheet_quick_action");
            public static final PlayerActionSource ActionsSheetMenuItem = new PlayerActionSource("ActionsSheetMenuItem", 2, "actions_sheet_menu_item");
            public static final PlayerActionSource FloatingButton = new PlayerActionSource("FloatingButton", 3, "floating_button");
            public static final PlayerActionSource MediaButton = new PlayerActionSource("MediaButton", 4, "media_button");

            private static final /* synthetic */ PlayerActionSource[] $values() {
                return new PlayerActionSource[]{BottomBar, ActionsSheetQuickAction, ActionsSheetMenuItem, FloatingButton, MediaButton};
            }

            static {
                PlayerActionSource[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private PlayerActionSource(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static PlayerActionSource valueOf(String str) {
                return (PlayerActionSource) Enum.valueOf(PlayerActionSource.class, str);
            }

            public static PlayerActionSource[] values() {
                return (PlayerActionSource[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Explore", "Mini", "HomeItems", "LibraryArchived", "LibrarySaved", "LibraryCollection", "LibraryDownloads", "VoiceDetails", "ReadDetails", "WriteScreen", "OcrImport", "LinkImport", "FileImport", "SharedRead", "GenFMLoading", "Search", "Deeplink", "NotificationControls", "Queue", "MediaButton", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class PlayerActivationSource {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ PlayerActivationSource[] $VALUES;
            private final String value;
            public static final PlayerActivationSource Explore = new PlayerActivationSource("Explore", 0, ShowkasePreviewGroup.EXPLORE);
            public static final PlayerActivationSource Mini = new PlayerActivationSource("Mini", 1, "miniplayer");
            public static final PlayerActivationSource HomeItems = new PlayerActivationSource("HomeItems", 2, "home_items");
            public static final PlayerActivationSource LibraryArchived = new PlayerActivationSource("LibraryArchived", 3, "library_archived");
            public static final PlayerActivationSource LibrarySaved = new PlayerActivationSource("LibrarySaved", 4, "library_saved");
            public static final PlayerActivationSource LibraryCollection = new PlayerActivationSource("LibraryCollection", 5, "library_collection");
            public static final PlayerActivationSource LibraryDownloads = new PlayerActivationSource("LibraryDownloads", 6, "library_downloads");
            public static final PlayerActivationSource VoiceDetails = new PlayerActivationSource("VoiceDetails", 7, "voice_details");
            public static final PlayerActivationSource ReadDetails = new PlayerActivationSource("ReadDetails", 8, "read_details");
            public static final PlayerActivationSource WriteScreen = new PlayerActivationSource("WriteScreen", 9, "write_screen");
            public static final PlayerActivationSource OcrImport = new PlayerActivationSource("OcrImport", 10, "ocr_import");
            public static final PlayerActivationSource LinkImport = new PlayerActivationSource("LinkImport", 11, "link_import");
            public static final PlayerActivationSource FileImport = new PlayerActivationSource("FileImport", 12, "file_import");
            public static final PlayerActivationSource SharedRead = new PlayerActivationSource("SharedRead", 13, "shared_read");
            public static final PlayerActivationSource GenFMLoading = new PlayerActivationSource("GenFMLoading", 14, "genfm_loading");
            public static final PlayerActivationSource Search = new PlayerActivationSource("Search", 15, FirebaseAnalytics.Event.SEARCH);
            public static final PlayerActivationSource Deeplink = new PlayerActivationSource("Deeplink", 16, "deeplink");
            public static final PlayerActivationSource NotificationControls = new PlayerActivationSource("NotificationControls", 17, "notification_controls");
            public static final PlayerActivationSource Queue = new PlayerActivationSource("Queue", 18, "queue");
            public static final PlayerActivationSource MediaButton = new PlayerActivationSource("MediaButton", 19, "media_button");

            private static final /* synthetic */ PlayerActivationSource[] $values() {
                return new PlayerActivationSource[]{Explore, Mini, HomeItems, LibraryArchived, LibrarySaved, LibraryCollection, LibraryDownloads, VoiceDetails, ReadDetails, WriteScreen, OcrImport, LinkImport, FileImport, SharedRead, GenFMLoading, Search, Deeplink, NotificationControls, Queue, MediaButton};
            }

            static {
                PlayerActivationSource[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private PlayerActivationSource(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static PlayerActivationSource valueOf(String str) {
                return (PlayerActivationSource) Enum.valueOf(PlayerActivationSource.class, str);
            }

            public static PlayerActivationSource[] values() {
                return (PlayerActivationSource[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "readId", "", "collectionId", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "getReadId", "()Ljava/lang/String;", "getCollectionId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Source", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerAddToQueueClicked extends Event {
            private final String collectionId;
            private final String readId;
            private final Source source;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ReadDetailsMoreActions", "HomeLongClick", "LibrarySwipeAction", "CollectionDetailsLongClick", "CollectionDetailsMoreActions", "SearchResultsLongClick", "VoiceDetails", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Source {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Source[] $VALUES;
                private final String value;
                public static final Source ReadDetailsMoreActions = new Source("ReadDetailsMoreActions", 0, "read_details_more_actions");
                public static final Source HomeLongClick = new Source("HomeLongClick", 1, "home_long_click");
                public static final Source LibrarySwipeAction = new Source("LibrarySwipeAction", 2, "library_swipe_action");
                public static final Source CollectionDetailsLongClick = new Source("CollectionDetailsLongClick", 3, "collection_details_long_click");
                public static final Source CollectionDetailsMoreActions = new Source("CollectionDetailsMoreActions", 4, "collection_details_more_actions");
                public static final Source SearchResultsLongClick = new Source("SearchResultsLongClick", 5, "search_results_long_click");
                public static final Source VoiceDetails = new Source("VoiceDetails", 6, "voice_details_clear_queue");

                private static final /* synthetic */ Source[] $values() {
                    return new Source[]{ReadDetailsMoreActions, HomeLongClick, LibrarySwipeAction, CollectionDetailsLongClick, CollectionDetailsMoreActions, SearchResultsLongClick, VoiceDetails};
                }

                static {
                    Source[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = c1.q($values);
                }

                private Source(String str, int i10, String str2) {
                    this.value = str2;
                }

                public static a getEntries() {
                    return $ENTRIES;
                }

                public static Source valueOf(String str) {
                    return (Source) Enum.valueOf(Source.class, str);
                }

                public static Source[] values() {
                    return (Source[]) $VALUES.clone();
                }

                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerAddToQueueClicked(Source source, String str, String str2) {
                super("reader_player_add_to_queue_clicked", a0.R(tn.n.F0(new k[]{r1, r2, r3})), r0);
                k kVar;
                k kVar2;
                source.getClass();
                k kVar3 = new k("source", source.getValue());
                kotlin.jvm.internal.f fVar = null;
                if (str != null) {
                    kVar = new k("read_id", str);
                } else {
                    kVar = null;
                }
                if (str2 != null) {
                    kVar2 = new k("collection_id", str2);
                } else {
                    kVar2 = null;
                }
                this.source = source;
                this.readId = str;
                this.collectionId = str2;
            }

            public static /* synthetic */ PlayerAddToQueueClicked copy$default(PlayerAddToQueueClicked playerAddToQueueClicked, Source source, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    source = playerAddToQueueClicked.source;
                }
                if ((i10 & 2) != 0) {
                    str = playerAddToQueueClicked.readId;
                }
                if ((i10 & 4) != 0) {
                    str2 = playerAddToQueueClicked.collectionId;
                }
                return playerAddToQueueClicked.copy(source, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final Source getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCollectionId() {
                return this.collectionId;
            }

            public final PlayerAddToQueueClicked copy(Source source, String readId, String collectionId) {
                source.getClass();
                return new PlayerAddToQueueClicked(source, readId, collectionId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerAddToQueueClicked)) {
                    return false;
                }
                PlayerAddToQueueClicked playerAddToQueueClicked = (PlayerAddToQueueClicked) other;
                if (this.source == playerAddToQueueClicked.source && m.c(this.readId, playerAddToQueueClicked.readId) && m.c(this.collectionId, playerAddToQueueClicked.collectionId)) {
                    return true;
                }
                return false;
            }

            public final String getCollectionId() {
                return this.collectionId;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final Source getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.source.hashCode() * 31;
                String str = this.readId;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (hashCode2 + hashCode) * 31;
                String str2 = this.collectionId;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return i11 + i10;
            }

            public String toString() {
                Source source = this.source;
                String str = this.readId;
                String str2 = this.collectionId;
                StringBuilder sb = new StringBuilder("PlayerAddToQueueClicked(source=");
                sb.append(source);
                sb.append(", readId=");
                sb.append(str);
                sb.append(", collectionId=");
                return f.l(str2, Separators.RPAREN, sb);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedAddPronunciation;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedAddPronunciation extends Event {
            public static final PlayerClickedAddPronunciation INSTANCE = new PlayerClickedAddPronunciation();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedAddPronunciation() {
                super("reader_player_clicked_add_pronunciation", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedAddPronunciation)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 974157843;
            }

            public String toString() {
                return "PlayerClickedAddPronunciation";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedAddToCollection;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedAddToCollection extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedAddToCollection(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_add_to_collection", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedAddToCollection copy$default(PlayerClickedAddToCollection playerClickedAddToCollection, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedAddToCollection.source;
                }
                return playerClickedAddToCollection.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedAddToCollection copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedAddToCollection(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedAddToCollection) && this.source == ((PlayerClickedAddToCollection) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedAddToCollection(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedChaptersIcon;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedChaptersIcon extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedChaptersIcon(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_chapters_icon", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedChaptersIcon copy$default(PlayerClickedChaptersIcon playerClickedChaptersIcon, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedChaptersIcon.source;
                }
                return playerClickedChaptersIcon.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedChaptersIcon copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedChaptersIcon(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedChaptersIcon) && this.source == ((PlayerClickedChaptersIcon) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedChaptersIcon(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedCustomize;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedCustomize extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedCustomize(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_customize", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedCustomize copy$default(PlayerClickedCustomize playerClickedCustomize, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedCustomize.source;
                }
                return playerClickedCustomize.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedCustomize copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedCustomize(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedCustomize) && this.source == ((PlayerClickedCustomize) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedCustomize(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedDelete;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedDelete extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedDelete(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_delete", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedDelete copy$default(PlayerClickedDelete playerClickedDelete, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedDelete.source;
                }
                return playerClickedDelete.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedDelete copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedDelete(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedDelete) && this.source == ((PlayerClickedDelete) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedDelete(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedDisplayMode;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedDisplayMode extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedDisplayMode(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_display_mode", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedDisplayMode copy$default(PlayerClickedDisplayMode playerClickedDisplayMode, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedDisplayMode.source;
                }
                return playerClickedDisplayMode.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedDisplayMode copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedDisplayMode(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedDisplayMode) && this.source == ((PlayerClickedDisplayMode) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedDisplayMode(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedDownload;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "readId", "", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;Ljava/lang/String;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "getReadId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedDownload extends Event {
            private final String readId;
            private final PlayerActionSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayerClickedDownload(PlayerActionSource playerActionSource, String str) {
                super("reader_player_clicked_download", a0.J(new k("source", playerActionSource.getValue()), new k("read_id", str)), null);
                playerActionSource.getClass();
                str.getClass();
                this.source = playerActionSource;
                this.readId = str;
            }

            public static /* synthetic */ PlayerClickedDownload copy$default(PlayerClickedDownload playerClickedDownload, PlayerActionSource playerActionSource, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedDownload.source;
                }
                if ((i10 & 2) != 0) {
                    str = playerClickedDownload.readId;
                }
                return playerClickedDownload.copy(playerActionSource, str);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final PlayerClickedDownload copy(PlayerActionSource source, String readId) {
                source.getClass();
                readId.getClass();
                return new PlayerClickedDownload(source, readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerClickedDownload)) {
                    return false;
                }
                PlayerClickedDownload playerClickedDownload = (PlayerClickedDownload) other;
                if (this.source == playerClickedDownload.source && m.c(this.readId, playerClickedDownload.readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.readId.hashCode() + (this.source.hashCode() * 31);
            }

            public String toString() {
                return "PlayerClickedDownload(source=" + this.source + ", readId=" + this.readId + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedExportDropdown;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class PlayerClickedExportDropdown extends Event {
            public static final PlayerClickedExportDropdown INSTANCE = new PlayerClickedExportDropdown();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedExportDropdown() {
                super("reader_player_clicked_export_dropdown_option", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedExportElevenLabsRedirect;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedExportElevenLabsRedirect extends Event {
            public static final PlayerClickedExportElevenLabsRedirect INSTANCE = new PlayerClickedExportElevenLabsRedirect();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedExportElevenLabsRedirect() {
                super("reader_player_clicked_export_elevenlabs_redirect", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedExportElevenLabsRedirect)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1300162326;
            }

            public String toString() {
                return "PlayerClickedExportElevenLabsRedirect";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedExportWebsiteRedirect;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedExportWebsiteRedirect extends Event {
            public static final PlayerClickedExportWebsiteRedirect INSTANCE = new PlayerClickedExportWebsiteRedirect();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedExportWebsiteRedirect() {
                super("reader_player_clicked_export_website_redirect", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedExportWebsiteRedirect)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1225362748;
            }

            public String toString() {
                return "PlayerClickedExportWebsiteRedirect";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedJumpToChapter;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedJumpToChapter extends Event {
            public static final PlayerClickedJumpToChapter INSTANCE = new PlayerClickedJumpToChapter();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedJumpToChapter() {
                super("reader_player_clicked_jump_to_chapter", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedJumpToChapter)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1276927675;
            }

            public String toString() {
                return "PlayerClickedJumpToChapter";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedOpenInBrowser;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedOpenInBrowser extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedOpenInBrowser(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_open_in_browser", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedOpenInBrowser copy$default(PlayerClickedOpenInBrowser playerClickedOpenInBrowser, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedOpenInBrowser.source;
                }
                return playerClickedOpenInBrowser.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedOpenInBrowser copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedOpenInBrowser(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedOpenInBrowser) && this.source == ((PlayerClickedOpenInBrowser) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedOpenInBrowser(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedPause;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedPause extends Event {
            public static final PlayerClickedPause INSTANCE = new PlayerClickedPause();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedPause() {
                super("reader_player_clicked_pause", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedPause)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 949879671;
            }

            public String toString() {
                return "PlayerClickedPause";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedPlay;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedPlay extends Event {
            public static final PlayerClickedPlay INSTANCE = new PlayerClickedPlay();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedPlay() {
                super("reader_player_clicked_play", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedPlay)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1693219219;
            }

            public String toString() {
                return "PlayerClickedPlay";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedPlaybackSpeed;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedPlaybackSpeed extends Event {
            public static final PlayerClickedPlaybackSpeed INSTANCE = new PlayerClickedPlaybackSpeed();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedPlaybackSpeed() {
                super("reader_player_clicked_playback_speed", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedPlaybackSpeed)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1339973779;
            }

            public String toString() {
                return "PlayerClickedPlaybackSpeed";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedPronunciationsOption;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedPronunciationsOption extends Event {
            public static final PlayerClickedPronunciationsOption INSTANCE = new PlayerClickedPronunciationsOption();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedPronunciationsOption() {
                super("reader_player_clicked_pronunciations_option", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedPronunciationsOption)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1956597298;
            }

            public String toString() {
                return "PlayerClickedPronunciationsOption";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedRateTitle;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedRateTitle extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedRateTitle(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_rate_title", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedRateTitle copy$default(PlayerClickedRateTitle playerClickedRateTitle, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedRateTitle.source;
                }
                return playerClickedRateTitle.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedRateTitle copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedRateTitle(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedRateTitle) && this.source == ((PlayerClickedRateTitle) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedRateTitle(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedRename;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedRename extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedRename(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_rename", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedRename copy$default(PlayerClickedRename playerClickedRename, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedRename.source;
                }
                return playerClickedRename.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedRename copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedRename(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedRename) && this.source == ((PlayerClickedRename) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedRename(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedReportIssue;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedReportIssue extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedReportIssue(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_report_issue", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedReportIssue copy$default(PlayerClickedReportIssue playerClickedReportIssue, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedReportIssue.source;
                }
                return playerClickedReportIssue.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedReportIssue copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedReportIssue(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedReportIssue) && this.source == ((PlayerClickedReportIssue) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedReportIssue(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedResetPreferences;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedResetPreferences extends Event {
            public static final PlayerClickedResetPreferences INSTANCE = new PlayerClickedResetPreferences();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedResetPreferences() {
                super("reader_player_clicked_reset_preferences", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedResetPreferences)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 708749832;
            }

            public String toString() {
                return "PlayerClickedResetPreferences";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedReturnToPosition;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedReturnToPosition extends Event {
            public static final PlayerClickedReturnToPosition INSTANCE = new PlayerClickedReturnToPosition();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerClickedReturnToPosition() {
                super("reader_player_clicked_return_to_position", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerClickedReturnToPosition)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1487137293;
            }

            public String toString() {
                return "PlayerClickedReturnToPosition";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedSearchButton;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedSearchButton extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedSearchButton(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_search_button", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedSearchButton copy$default(PlayerClickedSearchButton playerClickedSearchButton, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedSearchButton.source;
                }
                return playerClickedSearchButton.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedSearchButton copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedSearchButton(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedSearchButton) && this.source == ((PlayerClickedSearchButton) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedSearchButton(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedSeekBackward;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedSeekBackward extends Event {
            private final PlayerControlEventSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedSeekBackward(PlayerControlEventSource playerControlEventSource) {
                super("reader_player_clicked_seek_backward", r0, null);
                playerControlEventSource.getClass();
                Map singletonMap = Collections.singletonMap("click_source", playerControlEventSource.getValue());
                singletonMap.getClass();
                this.source = playerControlEventSource;
            }

            public static /* synthetic */ PlayerClickedSeekBackward copy$default(PlayerClickedSeekBackward playerClickedSeekBackward, PlayerControlEventSource playerControlEventSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerControlEventSource = playerClickedSeekBackward.source;
                }
                return playerClickedSeekBackward.copy(playerControlEventSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerControlEventSource getSource() {
                return this.source;
            }

            public final PlayerClickedSeekBackward copy(PlayerControlEventSource source) {
                source.getClass();
                return new PlayerClickedSeekBackward(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedSeekBackward) && this.source == ((PlayerClickedSeekBackward) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerControlEventSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedSeekBackward(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedSeekForward;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedSeekForward extends Event {
            private final PlayerControlEventSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedSeekForward(PlayerControlEventSource playerControlEventSource) {
                super("reader_player_clicked_seek_forward", r0, null);
                playerControlEventSource.getClass();
                Map singletonMap = Collections.singletonMap("click_source", playerControlEventSource.getValue());
                singletonMap.getClass();
                this.source = playerControlEventSource;
            }

            public static /* synthetic */ PlayerClickedSeekForward copy$default(PlayerClickedSeekForward playerClickedSeekForward, PlayerControlEventSource playerControlEventSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerControlEventSource = playerClickedSeekForward.source;
                }
                return playerClickedSeekForward.copy(playerControlEventSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerControlEventSource getSource() {
                return this.source;
            }

            public final PlayerClickedSeekForward copy(PlayerControlEventSource source) {
                source.getClass();
                return new PlayerClickedSeekForward(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedSeekForward) && this.source == ((PlayerClickedSeekForward) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerControlEventSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedSeekForward(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedShareButton;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedShareButton extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedShareButton(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_share_button", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedShareButton copy$default(PlayerClickedShareButton playerClickedShareButton, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedShareButton.source;
                }
                return playerClickedShareButton.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedShareButton copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedShareButton(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedShareButton) && this.source == ((PlayerClickedShareButton) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedShareButton(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedSleepTimer;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$SleepTimerSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$SleepTimerSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$SleepTimerSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedSleepTimer extends Event {
            private final SleepTimerSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedSleepTimer(SleepTimerSource sleepTimerSource) {
                super("reader_player_clicked_sleep_timer", r0, null);
                sleepTimerSource.getClass();
                Map singletonMap = Collections.singletonMap("source", sleepTimerSource.getValue());
                singletonMap.getClass();
                this.source = sleepTimerSource;
            }

            public static /* synthetic */ PlayerClickedSleepTimer copy$default(PlayerClickedSleepTimer playerClickedSleepTimer, SleepTimerSource sleepTimerSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    sleepTimerSource = playerClickedSleepTimer.source;
                }
                return playerClickedSleepTimer.copy(sleepTimerSource);
            }

            /* renamed from: component1, reason: from getter */
            public final SleepTimerSource getSource() {
                return this.source;
            }

            public final PlayerClickedSleepTimer copy(SleepTimerSource source) {
                source.getClass();
                return new PlayerClickedSleepTimer(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedSleepTimer) && this.source == ((PlayerClickedSleepTimer) other).source) {
                    return true;
                }
                return false;
            }

            public final SleepTimerSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedSleepTimer(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedUpsellBanner;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedUpsellBanner extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedUpsellBanner(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_upsell_banner", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedUpsellBanner copy$default(PlayerClickedUpsellBanner playerClickedUpsellBanner, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedUpsellBanner.source;
                }
                return playerClickedUpsellBanner.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedUpsellBanner copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedUpsellBanner(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedUpsellBanner) && this.source == ((PlayerClickedUpsellBanner) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedUpsellBanner(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedViewDetails;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedViewDetails extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedViewDetails(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_view_details", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedViewDetails copy$default(PlayerClickedViewDetails playerClickedViewDetails, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedViewDetails.source;
                }
                return playerClickedViewDetails.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedViewDetails copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedViewDetails(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedViewDetails) && this.source == ((PlayerClickedViewDetails) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedViewDetails(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerClickedVoiceChat;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerClickedVoiceChat extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerClickedVoiceChat(PlayerActionSource playerActionSource) {
                super("reader_player_clicked_voice_chat", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerClickedVoiceChat copy$default(PlayerClickedVoiceChat playerClickedVoiceChat, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerClickedVoiceChat.source;
                }
                return playerClickedVoiceChat.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerClickedVoiceChat copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerClickedVoiceChat(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerClickedVoiceChat) && this.source == ((PlayerClickedVoiceChat) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerClickedVoiceChat(source=" + this.source + Separators.RPAREN;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerControlEventSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PlayerScreen", "MediaControls", "MiniPlayer", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class PlayerControlEventSource {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ PlayerControlEventSource[] $VALUES;
            private final String value;
            public static final PlayerControlEventSource PlayerScreen = new PlayerControlEventSource("PlayerScreen", 0, "player_screen");
            public static final PlayerControlEventSource MediaControls = new PlayerControlEventSource("MediaControls", 1, "media_controls");
            public static final PlayerControlEventSource MiniPlayer = new PlayerControlEventSource("MiniPlayer", 2, "mini_player");

            private static final /* synthetic */ PlayerControlEventSource[] $values() {
                return new PlayerControlEventSource[]{PlayerScreen, MediaControls, MiniPlayer};
            }

            static {
                PlayerControlEventSource[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private PlayerControlEventSource(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static PlayerControlEventSource valueOf(String str) {
                return (PlayerControlEventSource) Enum.valueOf(PlayerControlEventSource.class, str);
            }

            public static PlayerControlEventSource[] values() {
                return (PlayerControlEventSource[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerInitialised;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "readSource", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "getReadSource", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerInitialised extends Event {
            private final String readId;
            private final String readSource;
            private final PlayerActivationSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayerInitialised(String str, PlayerActivationSource playerActivationSource, String str2) {
                super("reader_player_initialised", a0.J(new k("read_id", str), new k("init_source", playerActivationSource.getValue()), new k("read_source", str2)), null);
                str.getClass();
                playerActivationSource.getClass();
                str2.getClass();
                this.readId = str;
                this.source = playerActivationSource;
                this.readSource = str2;
            }

            public static /* synthetic */ PlayerInitialised copy$default(PlayerInitialised playerInitialised, String str, PlayerActivationSource playerActivationSource, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playerInitialised.readId;
                }
                if ((i10 & 2) != 0) {
                    playerActivationSource = playerInitialised.source;
                }
                if ((i10 & 4) != 0) {
                    str2 = playerInitialised.readSource;
                }
                return playerInitialised.copy(str, playerActivationSource, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final PlayerActivationSource getSource() {
                return this.source;
            }

            /* renamed from: component3, reason: from getter */
            public final String getReadSource() {
                return this.readSource;
            }

            public final PlayerInitialised copy(String readId, PlayerActivationSource source, String readSource) {
                readId.getClass();
                source.getClass();
                readSource.getClass();
                return new PlayerInitialised(readId, source, readSource);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerInitialised)) {
                    return false;
                }
                PlayerInitialised playerInitialised = (PlayerInitialised) other;
                if (m.c(this.readId, playerInitialised.readId) && this.source == playerInitialised.source && m.c(this.readSource, playerInitialised.readSource)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getReadSource() {
                return this.readSource;
            }

            public final PlayerActivationSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.readSource.hashCode() + ((this.source.hashCode() + (this.readId.hashCode() * 31)) * 31);
            }

            public String toString() {
                String str = this.readId;
                PlayerActivationSource playerActivationSource = this.source;
                String str2 = this.readSource;
                StringBuilder sb = new StringBuilder("PlayerInitialised(readId=");
                sb.append(str);
                sb.append(", source=");
                sb.append(playerActivationSource);
                sb.append(", readSource=");
                return f.l(str2, Separators.RPAREN, sb);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerLoadedReadItemHtml;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerLoadedReadItemHtml extends Event {
            public static final PlayerLoadedReadItemHtml INSTANCE = new PlayerLoadedReadItemHtml();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerLoadedReadItemHtml() {
                super("reader_player_loaded_read_item_html", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerLoadedReadItemHtml)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1756606175;
            }

            public String toString() {
                return "PlayerLoadedReadItemHtml";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerOpenedVoicePicker;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerOpenedVoicePicker extends Event {
            private final PlayerActionSource source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerOpenedVoicePicker(PlayerActionSource playerActionSource) {
                super("reader_player_opened_voice_picker", r0, null);
                playerActionSource.getClass();
                Map singletonMap = Collections.singletonMap("source", playerActionSource.getValue());
                singletonMap.getClass();
                this.source = playerActionSource;
            }

            public static /* synthetic */ PlayerOpenedVoicePicker copy$default(PlayerOpenedVoicePicker playerOpenedVoicePicker, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playerActionSource = playerOpenedVoicePicker.source;
                }
                return playerOpenedVoicePicker.copy(playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final PlayerOpenedVoicePicker copy(PlayerActionSource source) {
                source.getClass();
                return new PlayerOpenedVoicePicker(source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerOpenedVoicePicker) && this.source == ((PlayerOpenedVoicePicker) other).source) {
                    return true;
                }
                return false;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.source.hashCode();
            }

            public String toString() {
                return "PlayerOpenedVoicePicker(source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerPressedMediaButton;", "Lio/elevenlabs/domain/Analytics$Event;", "keyCode", "", "keyName", "", "<init>", "(ILjava/lang/String;)V", "getKeyCode", "()I", "getKeyName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerPressedMediaButton extends Event {
            private final int keyCode;
            private final String keyName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayerPressedMediaButton(int i10, String str) {
                super("reader_player_pressed_media_button", a0.J(new k("key_code", Integer.valueOf(i10)), new k("key_name", str)), null);
                str.getClass();
                this.keyCode = i10;
                this.keyName = str;
            }

            public static /* synthetic */ PlayerPressedMediaButton copy$default(PlayerPressedMediaButton playerPressedMediaButton, int i10, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = playerPressedMediaButton.keyCode;
                }
                if ((i11 & 2) != 0) {
                    str = playerPressedMediaButton.keyName;
                }
                return playerPressedMediaButton.copy(i10, str);
            }

            /* renamed from: component1, reason: from getter */
            public final int getKeyCode() {
                return this.keyCode;
            }

            /* renamed from: component2, reason: from getter */
            public final String getKeyName() {
                return this.keyName;
            }

            public final PlayerPressedMediaButton copy(int keyCode, String keyName) {
                keyName.getClass();
                return new PlayerPressedMediaButton(keyCode, keyName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerPressedMediaButton)) {
                    return false;
                }
                PlayerPressedMediaButton playerPressedMediaButton = (PlayerPressedMediaButton) other;
                if (this.keyCode == playerPressedMediaButton.keyCode && m.c(this.keyName, playerPressedMediaButton.keyName)) {
                    return true;
                }
                return false;
            }

            public final int getKeyCode() {
                return this.keyCode;
            }

            public final String getKeyName() {
                return this.keyName;
            }

            public int hashCode() {
                return this.keyName.hashCode() + (Integer.hashCode(this.keyCode) * 31);
            }

            public String toString() {
                return "PlayerPressedMediaButton(keyCode=" + this.keyCode + ", keyName=" + this.keyName + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001%B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JI\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020\bHÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "readId", "", "collectionId", "queueSize", "", "remainingReadsCount", "decision", "Lio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationClicked$Decision;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;Ljava/lang/String;Ljava/lang/String;IILio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationClicked$Decision;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "getReadId", "()Ljava/lang/String;", "getCollectionId", "getQueueSize", "()I", "getRemainingReadsCount", "getDecision", "()Lio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationClicked$Decision;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "Decision", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerQueueConfirmationClicked extends Event {
            private final String collectionId;
            private final Decision decision;
            private final int queueSize;
            private final String readId;
            private final int remainingReadsCount;
            private final PlayerAddToQueueClicked.Source source;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationClicked$Decision;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Keep", "ClearAndAdd", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Decision {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Decision[] $VALUES;
                private final String value;
                public static final Decision Keep = new Decision("Keep", 0, "keep");
                public static final Decision ClearAndAdd = new Decision("ClearAndAdd", 1, "clear_and_add");

                private static final /* synthetic */ Decision[] $values() {
                    return new Decision[]{Keep, ClearAndAdd};
                }

                static {
                    Decision[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = c1.q($values);
                }

                private Decision(String str, int i10, String str2) {
                    this.value = str2;
                }

                public static a getEntries() {
                    return $ENTRIES;
                }

                public static Decision valueOf(String str) {
                    return (Decision) Enum.valueOf(Decision.class, str);
                }

                public static Decision[] values() {
                    return (Decision[]) $VALUES.clone();
                }

                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerQueueConfirmationClicked(PlayerAddToQueueClicked.Source source, String str, String str2, int i10, int i11, Decision decision) {
                super("reader_player_queue_confirmation_clicked", a0.R(tn.n.F0(new k[]{r1, r2, r3, new k("queue_size", Integer.valueOf(i10)), new k("remaining_reads_count", Integer.valueOf(i11)), new k("decision", decision.getValue())})), r0);
                k kVar;
                k kVar2;
                source.getClass();
                decision.getClass();
                k kVar3 = new k("source", source.getValue());
                kotlin.jvm.internal.f fVar = null;
                if (str != null) {
                    kVar = new k("read_id", str);
                } else {
                    kVar = null;
                }
                if (str2 != null) {
                    kVar2 = new k("collection_id", str2);
                } else {
                    kVar2 = null;
                }
                this.source = source;
                this.readId = str;
                this.collectionId = str2;
                this.queueSize = i10;
                this.remainingReadsCount = i11;
                this.decision = decision;
            }

            public static /* synthetic */ PlayerQueueConfirmationClicked copy$default(PlayerQueueConfirmationClicked playerQueueConfirmationClicked, PlayerAddToQueueClicked.Source source, String str, String str2, int i10, int i11, Decision decision, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    source = playerQueueConfirmationClicked.source;
                }
                if ((i12 & 2) != 0) {
                    str = playerQueueConfirmationClicked.readId;
                }
                if ((i12 & 4) != 0) {
                    str2 = playerQueueConfirmationClicked.collectionId;
                }
                if ((i12 & 8) != 0) {
                    i10 = playerQueueConfirmationClicked.queueSize;
                }
                if ((i12 & 16) != 0) {
                    i11 = playerQueueConfirmationClicked.remainingReadsCount;
                }
                if ((i12 & 32) != 0) {
                    decision = playerQueueConfirmationClicked.decision;
                }
                int i13 = i11;
                Decision decision2 = decision;
                return playerQueueConfirmationClicked.copy(source, str, str2, i10, i13, decision2);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerAddToQueueClicked.Source getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCollectionId() {
                return this.collectionId;
            }

            /* renamed from: component4, reason: from getter */
            public final int getQueueSize() {
                return this.queueSize;
            }

            /* renamed from: component5, reason: from getter */
            public final int getRemainingReadsCount() {
                return this.remainingReadsCount;
            }

            /* renamed from: component6, reason: from getter */
            public final Decision getDecision() {
                return this.decision;
            }

            public final PlayerQueueConfirmationClicked copy(PlayerAddToQueueClicked.Source source, String readId, String collectionId, int queueSize, int remainingReadsCount, Decision decision) {
                source.getClass();
                decision.getClass();
                return new PlayerQueueConfirmationClicked(source, readId, collectionId, queueSize, remainingReadsCount, decision);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerQueueConfirmationClicked)) {
                    return false;
                }
                PlayerQueueConfirmationClicked playerQueueConfirmationClicked = (PlayerQueueConfirmationClicked) other;
                if (this.source == playerQueueConfirmationClicked.source && m.c(this.readId, playerQueueConfirmationClicked.readId) && m.c(this.collectionId, playerQueueConfirmationClicked.collectionId) && this.queueSize == playerQueueConfirmationClicked.queueSize && this.remainingReadsCount == playerQueueConfirmationClicked.remainingReadsCount && this.decision == playerQueueConfirmationClicked.decision) {
                    return true;
                }
                return false;
            }

            public final String getCollectionId() {
                return this.collectionId;
            }

            public final Decision getDecision() {
                return this.decision;
            }

            public final int getQueueSize() {
                return this.queueSize;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final int getRemainingReadsCount() {
                return this.remainingReadsCount;
            }

            public final PlayerAddToQueueClicked.Source getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.source.hashCode() * 31;
                String str = this.readId;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (hashCode2 + hashCode) * 31;
                String str2 = this.collectionId;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return this.decision.hashCode() + c.b(this.remainingReadsCount, c.b(this.queueSize, (i11 + i10) * 31, 31), 31);
            }

            public String toString() {
                return "PlayerQueueConfirmationClicked(source=" + this.source + ", readId=" + this.readId + ", collectionId=" + this.collectionId + ", queueSize=" + this.queueSize + ", remainingReadsCount=" + this.remainingReadsCount + ", decision=" + this.decision + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerQueueConfirmationShown;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "readId", "", "collectionId", "queueSize", "", "remainingReadsCount", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;Ljava/lang/String;Ljava/lang/String;II)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerAddToQueueClicked$Source;", "getReadId", "()Ljava/lang/String;", "getCollectionId", "getQueueSize", "()I", "getRemainingReadsCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerQueueConfirmationShown extends Event {
            private final String collectionId;
            private final int queueSize;
            private final String readId;
            private final int remainingReadsCount;
            private final PlayerAddToQueueClicked.Source source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerQueueConfirmationShown(PlayerAddToQueueClicked.Source source, String str, String str2, int i10, int i11) {
                super("reader_player_queue_confirmation_shown", a0.R(tn.n.F0(new k[]{r1, r2, r3, new k("queue_size", Integer.valueOf(i10)), new k("remaining_reads_count", Integer.valueOf(i11))})), r0);
                k kVar;
                k kVar2;
                source.getClass();
                k kVar3 = new k("source", source.getValue());
                kotlin.jvm.internal.f fVar = null;
                if (str != null) {
                    kVar = new k("read_id", str);
                } else {
                    kVar = null;
                }
                if (str2 != null) {
                    kVar2 = new k("collection_id", str2);
                } else {
                    kVar2 = null;
                }
                this.source = source;
                this.readId = str;
                this.collectionId = str2;
                this.queueSize = i10;
                this.remainingReadsCount = i11;
            }

            public static /* synthetic */ PlayerQueueConfirmationShown copy$default(PlayerQueueConfirmationShown playerQueueConfirmationShown, PlayerAddToQueueClicked.Source source, String str, String str2, int i10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    source = playerQueueConfirmationShown.source;
                }
                if ((i12 & 2) != 0) {
                    str = playerQueueConfirmationShown.readId;
                }
                if ((i12 & 4) != 0) {
                    str2 = playerQueueConfirmationShown.collectionId;
                }
                if ((i12 & 8) != 0) {
                    i10 = playerQueueConfirmationShown.queueSize;
                }
                if ((i12 & 16) != 0) {
                    i11 = playerQueueConfirmationShown.remainingReadsCount;
                }
                int i13 = i11;
                String str3 = str2;
                return playerQueueConfirmationShown.copy(source, str, str3, i10, i13);
            }

            /* renamed from: component1, reason: from getter */
            public final PlayerAddToQueueClicked.Source getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCollectionId() {
                return this.collectionId;
            }

            /* renamed from: component4, reason: from getter */
            public final int getQueueSize() {
                return this.queueSize;
            }

            /* renamed from: component5, reason: from getter */
            public final int getRemainingReadsCount() {
                return this.remainingReadsCount;
            }

            public final PlayerQueueConfirmationShown copy(PlayerAddToQueueClicked.Source source, String readId, String collectionId, int queueSize, int remainingReadsCount) {
                source.getClass();
                return new PlayerQueueConfirmationShown(source, readId, collectionId, queueSize, remainingReadsCount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerQueueConfirmationShown)) {
                    return false;
                }
                PlayerQueueConfirmationShown playerQueueConfirmationShown = (PlayerQueueConfirmationShown) other;
                if (this.source == playerQueueConfirmationShown.source && m.c(this.readId, playerQueueConfirmationShown.readId) && m.c(this.collectionId, playerQueueConfirmationShown.collectionId) && this.queueSize == playerQueueConfirmationShown.queueSize && this.remainingReadsCount == playerQueueConfirmationShown.remainingReadsCount) {
                    return true;
                }
                return false;
            }

            public final String getCollectionId() {
                return this.collectionId;
            }

            public final int getQueueSize() {
                return this.queueSize;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final int getRemainingReadsCount() {
                return this.remainingReadsCount;
            }

            public final PlayerAddToQueueClicked.Source getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.source.hashCode() * 31;
                String str = this.readId;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (hashCode2 + hashCode) * 31;
                String str2 = this.collectionId;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return Integer.hashCode(this.remainingReadsCount) + c.b(this.queueSize, (i11 + i10) * 31, 31);
            }

            public String toString() {
                PlayerAddToQueueClicked.Source source = this.source;
                String str = this.readId;
                String str2 = this.collectionId;
                int i10 = this.queueSize;
                int i11 = this.remainingReadsCount;
                StringBuilder sb = new StringBuilder("PlayerQueueConfirmationShown(source=");
                sb.append(source);
                sb.append(", readId=");
                sb.append(str);
                sb.append(", collectionId=");
                sb.append(str2);
                sb.append(", queueSize=");
                sb.append(i10);
                sb.append(", remainingReadsCount=");
                return f.f(i11, Separators.RPAREN, sb);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerQueueScreenHidden;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "itemsCount", "", "isEmptyState", "", "currentPosition", "<init>", "(Ljava/lang/String;IZI)V", "getReadId", "()Ljava/lang/String;", "getItemsCount", "()I", "()Z", "getCurrentPosition", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerQueueScreenHidden extends Event {
            private final int currentPosition;
            private final boolean isEmptyState;
            private final int itemsCount;
            private final String readId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayerQueueScreenHidden(String str, int i10, boolean z6, int i11) {
                super("reader_player_queue_screen_hidden", a0.J(new k("read_id", str), new k("items_count", Integer.valueOf(i10)), new k("is_empty_state", Boolean.valueOf(z6)), new k("current_position", Integer.valueOf(i11))), null);
                str.getClass();
                this.readId = str;
                this.itemsCount = i10;
                this.isEmptyState = z6;
                this.currentPosition = i11;
            }

            public static /* synthetic */ PlayerQueueScreenHidden copy$default(PlayerQueueScreenHidden playerQueueScreenHidden, String str, int i10, boolean z6, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = playerQueueScreenHidden.readId;
                }
                if ((i12 & 2) != 0) {
                    i10 = playerQueueScreenHidden.itemsCount;
                }
                if ((i12 & 4) != 0) {
                    z6 = playerQueueScreenHidden.isEmptyState;
                }
                if ((i12 & 8) != 0) {
                    i11 = playerQueueScreenHidden.currentPosition;
                }
                return playerQueueScreenHidden.copy(str, i10, z6, i11);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final int getItemsCount() {
                return this.itemsCount;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsEmptyState() {
                return this.isEmptyState;
            }

            /* renamed from: component4, reason: from getter */
            public final int getCurrentPosition() {
                return this.currentPosition;
            }

            public final PlayerQueueScreenHidden copy(String readId, int itemsCount, boolean isEmptyState, int currentPosition) {
                readId.getClass();
                return new PlayerQueueScreenHidden(readId, itemsCount, isEmptyState, currentPosition);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerQueueScreenHidden)) {
                    return false;
                }
                PlayerQueueScreenHidden playerQueueScreenHidden = (PlayerQueueScreenHidden) other;
                if (m.c(this.readId, playerQueueScreenHidden.readId) && this.itemsCount == playerQueueScreenHidden.itemsCount && this.isEmptyState == playerQueueScreenHidden.isEmptyState && this.currentPosition == playerQueueScreenHidden.currentPosition) {
                    return true;
                }
                return false;
            }

            public final int getCurrentPosition() {
                return this.currentPosition;
            }

            public final int getItemsCount() {
                return this.itemsCount;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return Integer.hashCode(this.currentPosition) + b.f(c.b(this.itemsCount, this.readId.hashCode() * 31, 31), 31, this.isEmptyState);
            }

            public final boolean isEmptyState() {
                return this.isEmptyState;
            }

            public String toString() {
                String str = this.readId;
                int i10 = this.itemsCount;
                boolean z6 = this.isEmptyState;
                int i11 = this.currentPosition;
                StringBuilder o6 = android.gov.nist.javax.sip.header.a.o(i10, "PlayerQueueScreenHidden(readId=", str, ", itemsCount=", ", isEmptyState=");
                o6.append(z6);
                o6.append(", currentPosition=");
                o6.append(i11);
                o6.append(Separators.RPAREN);
                return o6.toString();
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerQueueScreenItemClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "relatedReadId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getRelatedReadId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerQueueScreenItemClicked extends Event {
            private final String readId;
            private final String relatedReadId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayerQueueScreenItemClicked(String str, String str2) {
                super("reader_player_queue_screen_item_clicked", a0.J(new k("read_id", str), new k("related_read_id", str2)), null);
                str.getClass();
                str2.getClass();
                this.readId = str;
                this.relatedReadId = str2;
            }

            public static /* synthetic */ PlayerQueueScreenItemClicked copy$default(PlayerQueueScreenItemClicked playerQueueScreenItemClicked, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playerQueueScreenItemClicked.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = playerQueueScreenItemClicked.relatedReadId;
                }
                return playerQueueScreenItemClicked.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getRelatedReadId() {
                return this.relatedReadId;
            }

            public final PlayerQueueScreenItemClicked copy(String readId, String relatedReadId) {
                readId.getClass();
                relatedReadId.getClass();
                return new PlayerQueueScreenItemClicked(readId, relatedReadId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerQueueScreenItemClicked)) {
                    return false;
                }
                PlayerQueueScreenItemClicked playerQueueScreenItemClicked = (PlayerQueueScreenItemClicked) other;
                if (m.c(this.readId, playerQueueScreenItemClicked.readId) && m.c(this.relatedReadId, playerQueueScreenItemClicked.relatedReadId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getRelatedReadId() {
                return this.relatedReadId;
            }

            public int hashCode() {
                return this.relatedReadId.hashCode() + (this.readId.hashCode() * 31);
            }

            public String toString() {
                return h.c("PlayerQueueScreenItemClicked(readId=", this.readId, ", relatedReadId=", this.relatedReadId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerQueueScreenItemsReordered;", "Lio/elevenlabs/domain/Analytics$Event;", "draggedReadId", "", "relatedReadId", "oldPosition", "", "newPosition", "playingItemPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;III)V", "getDraggedReadId", "()Ljava/lang/String;", "getRelatedReadId", "getOldPosition", "()I", "getNewPosition", "getPlayingItemPosition", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerQueueScreenItemsReordered extends Event {
            private final String draggedReadId;
            private final int newPosition;
            private final int oldPosition;
            private final int playingItemPosition;
            private final String relatedReadId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayerQueueScreenItemsReordered(String str, String str2, int i10, int i11, int i12) {
                super("reader_player_queue_screen_items_reordered", a0.J(new k("dragged_read_id", str), new k("related_read_id", str2), new k("old_position", Integer.valueOf(i10)), new k("new_position", Integer.valueOf(i11)), new k("playing_item_position", Integer.valueOf(i12))), null);
                str.getClass();
                str2.getClass();
                this.draggedReadId = str;
                this.relatedReadId = str2;
                this.oldPosition = i10;
                this.newPosition = i11;
                this.playingItemPosition = i12;
            }

            public static /* synthetic */ PlayerQueueScreenItemsReordered copy$default(PlayerQueueScreenItemsReordered playerQueueScreenItemsReordered, String str, String str2, int i10, int i11, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = playerQueueScreenItemsReordered.draggedReadId;
                }
                if ((i13 & 2) != 0) {
                    str2 = playerQueueScreenItemsReordered.relatedReadId;
                }
                if ((i13 & 4) != 0) {
                    i10 = playerQueueScreenItemsReordered.oldPosition;
                }
                if ((i13 & 8) != 0) {
                    i11 = playerQueueScreenItemsReordered.newPosition;
                }
                if ((i13 & 16) != 0) {
                    i12 = playerQueueScreenItemsReordered.playingItemPosition;
                }
                int i14 = i12;
                int i15 = i10;
                return playerQueueScreenItemsReordered.copy(str, str2, i15, i11, i14);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDraggedReadId() {
                return this.draggedReadId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getRelatedReadId() {
                return this.relatedReadId;
            }

            /* renamed from: component3, reason: from getter */
            public final int getOldPosition() {
                return this.oldPosition;
            }

            /* renamed from: component4, reason: from getter */
            public final int getNewPosition() {
                return this.newPosition;
            }

            /* renamed from: component5, reason: from getter */
            public final int getPlayingItemPosition() {
                return this.playingItemPosition;
            }

            public final PlayerQueueScreenItemsReordered copy(String draggedReadId, String relatedReadId, int oldPosition, int newPosition, int playingItemPosition) {
                draggedReadId.getClass();
                relatedReadId.getClass();
                return new PlayerQueueScreenItemsReordered(draggedReadId, relatedReadId, oldPosition, newPosition, playingItemPosition);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerQueueScreenItemsReordered)) {
                    return false;
                }
                PlayerQueueScreenItemsReordered playerQueueScreenItemsReordered = (PlayerQueueScreenItemsReordered) other;
                if (m.c(this.draggedReadId, playerQueueScreenItemsReordered.draggedReadId) && m.c(this.relatedReadId, playerQueueScreenItemsReordered.relatedReadId) && this.oldPosition == playerQueueScreenItemsReordered.oldPosition && this.newPosition == playerQueueScreenItemsReordered.newPosition && this.playingItemPosition == playerQueueScreenItemsReordered.playingItemPosition) {
                    return true;
                }
                return false;
            }

            public final String getDraggedReadId() {
                return this.draggedReadId;
            }

            public final int getNewPosition() {
                return this.newPosition;
            }

            public final int getOldPosition() {
                return this.oldPosition;
            }

            public final int getPlayingItemPosition() {
                return this.playingItemPosition;
            }

            public final String getRelatedReadId() {
                return this.relatedReadId;
            }

            public int hashCode() {
                return Integer.hashCode(this.playingItemPosition) + c.b(this.newPosition, c.b(this.oldPosition, c.c(this.draggedReadId.hashCode() * 31, 31, this.relatedReadId), 31), 31);
            }

            public String toString() {
                String str = this.draggedReadId;
                String str2 = this.relatedReadId;
                int i10 = this.oldPosition;
                int i11 = this.newPosition;
                int i12 = this.playingItemPosition;
                StringBuilder s10 = f.s("PlayerQueueScreenItemsReordered(draggedReadId=", str, ", relatedReadId=", str2, ", oldPosition=");
                android.gov.nist.javax.sip.header.a.t(s10, i10, ", newPosition=", i11, ", playingItemPosition=");
                return f.f(i12, Separators.RPAREN, s10);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerQueueScreenShown;", "Lio/elevenlabs/domain/Analytics$Event;", "relatedReadId", "", "currentPosition", "", "itemsCount", "isEmptyState", "", "<init>", "(Ljava/lang/String;IIZ)V", "getRelatedReadId", "()Ljava/lang/String;", "getCurrentPosition", "()I", "getItemsCount", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerQueueScreenShown extends Event {
            private final int currentPosition;
            private final boolean isEmptyState;
            private final int itemsCount;
            private final String relatedReadId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayerQueueScreenShown(String str, int i10, int i11, boolean z6) {
                super("reader_player_queue_screen_shown", a0.J(new k("related_read_id", str), new k("items_count", Integer.valueOf(i11)), new k("is_empty_state", Boolean.valueOf(z6)), new k("current_position", Integer.valueOf(i10))), null);
                str.getClass();
                this.relatedReadId = str;
                this.currentPosition = i10;
                this.itemsCount = i11;
                this.isEmptyState = z6;
            }

            public static /* synthetic */ PlayerQueueScreenShown copy$default(PlayerQueueScreenShown playerQueueScreenShown, String str, int i10, int i11, boolean z6, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = playerQueueScreenShown.relatedReadId;
                }
                if ((i12 & 2) != 0) {
                    i10 = playerQueueScreenShown.currentPosition;
                }
                if ((i12 & 4) != 0) {
                    i11 = playerQueueScreenShown.itemsCount;
                }
                if ((i12 & 8) != 0) {
                    z6 = playerQueueScreenShown.isEmptyState;
                }
                return playerQueueScreenShown.copy(str, i10, i11, z6);
            }

            /* renamed from: component1, reason: from getter */
            public final String getRelatedReadId() {
                return this.relatedReadId;
            }

            /* renamed from: component2, reason: from getter */
            public final int getCurrentPosition() {
                return this.currentPosition;
            }

            /* renamed from: component3, reason: from getter */
            public final int getItemsCount() {
                return this.itemsCount;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsEmptyState() {
                return this.isEmptyState;
            }

            public final PlayerQueueScreenShown copy(String relatedReadId, int currentPosition, int itemsCount, boolean isEmptyState) {
                relatedReadId.getClass();
                return new PlayerQueueScreenShown(relatedReadId, currentPosition, itemsCount, isEmptyState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerQueueScreenShown)) {
                    return false;
                }
                PlayerQueueScreenShown playerQueueScreenShown = (PlayerQueueScreenShown) other;
                if (m.c(this.relatedReadId, playerQueueScreenShown.relatedReadId) && this.currentPosition == playerQueueScreenShown.currentPosition && this.itemsCount == playerQueueScreenShown.itemsCount && this.isEmptyState == playerQueueScreenShown.isEmptyState) {
                    return true;
                }
                return false;
            }

            public final int getCurrentPosition() {
                return this.currentPosition;
            }

            public final int getItemsCount() {
                return this.itemsCount;
            }

            public final String getRelatedReadId() {
                return this.relatedReadId;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEmptyState) + c.b(this.itemsCount, c.b(this.currentPosition, this.relatedReadId.hashCode() * 31, 31), 31);
            }

            public final boolean isEmptyState() {
                return this.isEmptyState;
            }

            public String toString() {
                String str = this.relatedReadId;
                int i10 = this.currentPosition;
                int i11 = this.itemsCount;
                boolean z6 = this.isEmptyState;
                StringBuilder o6 = android.gov.nist.javax.sip.header.a.o(i10, "PlayerQueueScreenShown(relatedReadId=", str, ", currentPosition=", ", itemsCount=");
                o6.append(i11);
                o6.append(", isEmptyState=");
                o6.append(z6);
                o6.append(Separators.RPAREN);
                return o6.toString();
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerReachedReadEndOfFile;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "hasNext", "", "<init>", "(Ljava/lang/String;Z)V", "getReadId", "()Ljava/lang/String;", "getHasNext", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerReachedReadEndOfFile extends Event {
            private final boolean hasNext;
            private final String readId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayerReachedReadEndOfFile(String str, boolean z6) {
                super("reader_player_reached_read_eof", a0.J(new k("read_id", str), new k("has_next", Boolean.valueOf(z6))), null);
                str.getClass();
                this.readId = str;
                this.hasNext = z6;
            }

            public static /* synthetic */ PlayerReachedReadEndOfFile copy$default(PlayerReachedReadEndOfFile playerReachedReadEndOfFile, String str, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playerReachedReadEndOfFile.readId;
                }
                if ((i10 & 2) != 0) {
                    z6 = playerReachedReadEndOfFile.hasNext;
                }
                return playerReachedReadEndOfFile.copy(str, z6);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getHasNext() {
                return this.hasNext;
            }

            public final PlayerReachedReadEndOfFile copy(String readId, boolean hasNext) {
                readId.getClass();
                return new PlayerReachedReadEndOfFile(readId, hasNext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerReachedReadEndOfFile)) {
                    return false;
                }
                PlayerReachedReadEndOfFile playerReachedReadEndOfFile = (PlayerReachedReadEndOfFile) other;
                if (m.c(this.readId, playerReachedReadEndOfFile.readId) && this.hasNext == playerReachedReadEndOfFile.hasNext) {
                    return true;
                }
                return false;
            }

            public final boolean getHasNext() {
                return this.hasNext;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return Boolean.hashCode(this.hasNext) + (this.readId.hashCode() * 31);
            }

            public String toString() {
                return "PlayerReachedReadEndOfFile(readId=" + this.readId + ", hasNext=" + this.hasNext + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedAutoFullscreen;", "Lio/elevenlabs/domain/Analytics$Event;", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedAutoFullscreen extends Event {
            private final boolean enabled;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerUpdatedAutoFullscreen(boolean z6) {
                super("reader_player_updated_auto_fullscreen", r0, null);
                Map singletonMap = Collections.singletonMap("value", Boolean.valueOf(z6));
                singletonMap.getClass();
                this.enabled = z6;
            }

            public static /* synthetic */ PlayerUpdatedAutoFullscreen copy$default(PlayerUpdatedAutoFullscreen playerUpdatedAutoFullscreen, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z6 = playerUpdatedAutoFullscreen.enabled;
                }
                return playerUpdatedAutoFullscreen.copy(z6);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public final PlayerUpdatedAutoFullscreen copy(boolean enabled) {
                return new PlayerUpdatedAutoFullscreen(enabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedAutoFullscreen) && this.enabled == ((PlayerUpdatedAutoFullscreen) other).enabled) {
                    return true;
                }
                return false;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.enabled);
            }

            public String toString() {
                return "PlayerUpdatedAutoFullscreen(enabled=" + this.enabled + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedBackwardSeekButton;", "Lio/elevenlabs/domain/Analytics$Event;", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedBackwardSeekButton extends Event {
            private final String action;

            public PlayerUpdatedBackwardSeekButton(String str) {
                super("reader_player_updated_backward_seek_button", i.l(str, "value", str), null);
                this.action = str;
            }

            public static /* synthetic */ PlayerUpdatedBackwardSeekButton copy$default(PlayerUpdatedBackwardSeekButton playerUpdatedBackwardSeekButton, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playerUpdatedBackwardSeekButton.action;
                }
                return playerUpdatedBackwardSeekButton.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            public final PlayerUpdatedBackwardSeekButton copy(String action) {
                action.getClass();
                return new PlayerUpdatedBackwardSeekButton(action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedBackwardSeekButton) && m.c(this.action, ((PlayerUpdatedBackwardSeekButton) other).action)) {
                    return true;
                }
                return false;
            }

            public final String getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return f.C("PlayerUpdatedBackwardSeekButton(action=", this.action, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedDefaultVoice;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedDefaultVoice extends Event {
            public static final PlayerUpdatedDefaultVoice INSTANCE = new PlayerUpdatedDefaultVoice();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerUpdatedDefaultVoice() {
                super("reader_player_updated_default_voice", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerUpdatedDefaultVoice)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1785721500;
            }

            public String toString() {
                return "PlayerUpdatedDefaultVoice";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedFontFamily;", "Lio/elevenlabs/domain/Analytics$Event;", "fontFamily", "", "<init>", "(Ljava/lang/String;)V", "getFontFamily", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedFontFamily extends Event {
            private final String fontFamily;

            public PlayerUpdatedFontFamily(String str) {
                super("reader_player_updated_font_family", i.l(str, "value", str), null);
                this.fontFamily = str;
            }

            public static /* synthetic */ PlayerUpdatedFontFamily copy$default(PlayerUpdatedFontFamily playerUpdatedFontFamily, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playerUpdatedFontFamily.fontFamily;
                }
                return playerUpdatedFontFamily.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getFontFamily() {
                return this.fontFamily;
            }

            public final PlayerUpdatedFontFamily copy(String fontFamily) {
                fontFamily.getClass();
                return new PlayerUpdatedFontFamily(fontFamily);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedFontFamily) && m.c(this.fontFamily, ((PlayerUpdatedFontFamily) other).fontFamily)) {
                    return true;
                }
                return false;
            }

            public final String getFontFamily() {
                return this.fontFamily;
            }

            public int hashCode() {
                return this.fontFamily.hashCode();
            }

            public String toString() {
                return f.C("PlayerUpdatedFontFamily(fontFamily=", this.fontFamily, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedFontSize;", "Lio/elevenlabs/domain/Analytics$Event;", "fontSize", "", "<init>", "(J)V", "getFontSize", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedFontSize extends Event {
            private final long fontSize;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerUpdatedFontSize(long j4) {
                super("reader_player_updated_font_size", r0, null);
                Map singletonMap = Collections.singletonMap("value", Long.valueOf(j4));
                singletonMap.getClass();
                this.fontSize = j4;
            }

            public static /* synthetic */ PlayerUpdatedFontSize copy$default(PlayerUpdatedFontSize playerUpdatedFontSize, long j4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    j4 = playerUpdatedFontSize.fontSize;
                }
                return playerUpdatedFontSize.copy(j4);
            }

            /* renamed from: component1, reason: from getter */
            public final long getFontSize() {
                return this.fontSize;
            }

            public final PlayerUpdatedFontSize copy(long fontSize) {
                return new PlayerUpdatedFontSize(fontSize);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedFontSize) && this.fontSize == ((PlayerUpdatedFontSize) other).fontSize) {
                    return true;
                }
                return false;
            }

            public final long getFontSize() {
                return this.fontSize;
            }

            public int hashCode() {
                return Long.hashCode(this.fontSize);
            }

            public String toString() {
                return android.gov.nist.javax.sip.header.a.k("PlayerUpdatedFontSize(fontSize=", this.fontSize, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedForwardSeekButton;", "Lio/elevenlabs/domain/Analytics$Event;", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedForwardSeekButton extends Event {
            private final String action;

            public PlayerUpdatedForwardSeekButton(String str) {
                super("reader_player_updated_forward_seek_button", i.l(str, "value", str), null);
                this.action = str;
            }

            public static /* synthetic */ PlayerUpdatedForwardSeekButton copy$default(PlayerUpdatedForwardSeekButton playerUpdatedForwardSeekButton, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playerUpdatedForwardSeekButton.action;
                }
                return playerUpdatedForwardSeekButton.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            public final PlayerUpdatedForwardSeekButton copy(String action) {
                action.getClass();
                return new PlayerUpdatedForwardSeekButton(action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedForwardSeekButton) && m.c(this.action, ((PlayerUpdatedForwardSeekButton) other).action)) {
                    return true;
                }
                return false;
            }

            public final String getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return f.C("PlayerUpdatedForwardSeekButton(action=", this.action, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedInAppBackwardSkipDuration;", "Lio/elevenlabs/domain/Analytics$Event;", "seconds", "", "<init>", "(I)V", "getSeconds", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedInAppBackwardSkipDuration extends Event {
            private final int seconds;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerUpdatedInAppBackwardSkipDuration(int i10) {
                super("reader_player_updated_in_app_backward_skip_duration", r0, null);
                Map singletonMap = Collections.singletonMap("value", Integer.valueOf(i10));
                singletonMap.getClass();
                this.seconds = i10;
            }

            public static /* synthetic */ PlayerUpdatedInAppBackwardSkipDuration copy$default(PlayerUpdatedInAppBackwardSkipDuration playerUpdatedInAppBackwardSkipDuration, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = playerUpdatedInAppBackwardSkipDuration.seconds;
                }
                return playerUpdatedInAppBackwardSkipDuration.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getSeconds() {
                return this.seconds;
            }

            public final PlayerUpdatedInAppBackwardSkipDuration copy(int seconds) {
                return new PlayerUpdatedInAppBackwardSkipDuration(seconds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedInAppBackwardSkipDuration) && this.seconds == ((PlayerUpdatedInAppBackwardSkipDuration) other).seconds) {
                    return true;
                }
                return false;
            }

            public final int getSeconds() {
                return this.seconds;
            }

            public int hashCode() {
                return Integer.hashCode(this.seconds);
            }

            public String toString() {
                return b.j(this.seconds, "PlayerUpdatedInAppBackwardSkipDuration(seconds=", Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedInAppForwardSkipDuration;", "Lio/elevenlabs/domain/Analytics$Event;", "seconds", "", "<init>", "(I)V", "getSeconds", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedInAppForwardSkipDuration extends Event {
            private final int seconds;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerUpdatedInAppForwardSkipDuration(int i10) {
                super("reader_player_updated_in_app_forward_skip_duration", r0, null);
                Map singletonMap = Collections.singletonMap("value", Integer.valueOf(i10));
                singletonMap.getClass();
                this.seconds = i10;
            }

            public static /* synthetic */ PlayerUpdatedInAppForwardSkipDuration copy$default(PlayerUpdatedInAppForwardSkipDuration playerUpdatedInAppForwardSkipDuration, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = playerUpdatedInAppForwardSkipDuration.seconds;
                }
                return playerUpdatedInAppForwardSkipDuration.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getSeconds() {
                return this.seconds;
            }

            public final PlayerUpdatedInAppForwardSkipDuration copy(int seconds) {
                return new PlayerUpdatedInAppForwardSkipDuration(seconds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedInAppForwardSkipDuration) && this.seconds == ((PlayerUpdatedInAppForwardSkipDuration) other).seconds) {
                    return true;
                }
                return false;
            }

            public final int getSeconds() {
                return this.seconds;
            }

            public int hashCode() {
                return Integer.hashCode(this.seconds);
            }

            public String toString() {
                return b.j(this.seconds, "PlayerUpdatedInAppForwardSkipDuration(seconds=", Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedNextMediaButton;", "Lio/elevenlabs/domain/Analytics$Event;", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedNextMediaButton extends Event {
            private final String action;

            public PlayerUpdatedNextMediaButton(String str) {
                super("reader_player_updated_next_media_button", i.l(str, "value", str), null);
                this.action = str;
            }

            public static /* synthetic */ PlayerUpdatedNextMediaButton copy$default(PlayerUpdatedNextMediaButton playerUpdatedNextMediaButton, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playerUpdatedNextMediaButton.action;
                }
                return playerUpdatedNextMediaButton.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            public final PlayerUpdatedNextMediaButton copy(String action) {
                action.getClass();
                return new PlayerUpdatedNextMediaButton(action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedNextMediaButton) && m.c(this.action, ((PlayerUpdatedNextMediaButton) other).action)) {
                    return true;
                }
                return false;
            }

            public final String getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return f.C("PlayerUpdatedNextMediaButton(action=", this.action, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedPlaybackSpeed;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedPlaybackSpeed extends Event {
            public static final PlayerUpdatedPlaybackSpeed INSTANCE = new PlayerUpdatedPlaybackSpeed();

            /* JADX WARN: Multi-variable type inference failed */
            private PlayerUpdatedPlaybackSpeed() {
                super("reader_player_updated_playback_speed", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PlayerUpdatedPlaybackSpeed)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1507860647;
            }

            public String toString() {
                return "PlayerUpdatedPlaybackSpeed";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedPreviousMediaButton;", "Lio/elevenlabs/domain/Analytics$Event;", "action", "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedPreviousMediaButton extends Event {
            private final String action;

            public PlayerUpdatedPreviousMediaButton(String str) {
                super("reader_player_updated_previous_media_button", i.l(str, "value", str), null);
                this.action = str;
            }

            public static /* synthetic */ PlayerUpdatedPreviousMediaButton copy$default(PlayerUpdatedPreviousMediaButton playerUpdatedPreviousMediaButton, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playerUpdatedPreviousMediaButton.action;
                }
                return playerUpdatedPreviousMediaButton.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            public final PlayerUpdatedPreviousMediaButton copy(String action) {
                action.getClass();
                return new PlayerUpdatedPreviousMediaButton(action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedPreviousMediaButton) && m.c(this.action, ((PlayerUpdatedPreviousMediaButton) other).action)) {
                    return true;
                }
                return false;
            }

            public final String getAction() {
                return this.action;
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return f.C("PlayerUpdatedPreviousMediaButton(action=", this.action, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedTapToShowControls;", "Lio/elevenlabs/domain/Analytics$Event;", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedTapToShowControls extends Event {
            private final boolean enabled;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerUpdatedTapToShowControls(boolean z6) {
                super("reader_player_updated_tap_to_show_controls", r0, null);
                Map singletonMap = Collections.singletonMap("value", Boolean.valueOf(z6));
                singletonMap.getClass();
                this.enabled = z6;
            }

            public static /* synthetic */ PlayerUpdatedTapToShowControls copy$default(PlayerUpdatedTapToShowControls playerUpdatedTapToShowControls, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z6 = playerUpdatedTapToShowControls.enabled;
                }
                return playerUpdatedTapToShowControls.copy(z6);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public final PlayerUpdatedTapToShowControls copy(boolean enabled) {
                return new PlayerUpdatedTapToShowControls(enabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedTapToShowControls) && this.enabled == ((PlayerUpdatedTapToShowControls) other).enabled) {
                    return true;
                }
                return false;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.enabled);
            }

            public String toString() {
                return "PlayerUpdatedTapToShowControls(enabled=" + this.enabled + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerUpdatedTheme;", "Lio/elevenlabs/domain/Analytics$Event;", "theme", "", "<init>", "(Ljava/lang/String;)V", "getTheme", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerUpdatedTheme extends Event {
            private final String theme;

            public PlayerUpdatedTheme(String str) {
                super("reader_player_updated_theme", i.l(str, "value", str), null);
                this.theme = str;
            }

            public static /* synthetic */ PlayerUpdatedTheme copy$default(PlayerUpdatedTheme playerUpdatedTheme, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = playerUpdatedTheme.theme;
                }
                return playerUpdatedTheme.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTheme() {
                return this.theme;
            }

            public final PlayerUpdatedTheme copy(String theme) {
                theme.getClass();
                return new PlayerUpdatedTheme(theme);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PlayerUpdatedTheme) && m.c(this.theme, ((PlayerUpdatedTheme) other).theme)) {
                    return true;
                }
                return false;
            }

            public final String getTheme() {
                return this.theme;
            }

            public int hashCode() {
                return this.theme.hashCode();
            }

            public String toString() {
                return f.C("PlayerUpdatedTheme(theme=", this.theme, Separators.RPAREN);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerVisibility;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Text", "AudioOnly", "Mini", "Background", "Unknown", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class PlayerVisibility {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ PlayerVisibility[] $VALUES;
            private final String value;
            public static final PlayerVisibility Text = new PlayerVisibility("Text", 0, ParameterNames.TEXT);
            public static final PlayerVisibility AudioOnly = new PlayerVisibility("AudioOnly", 1, "audio_only");
            public static final PlayerVisibility Mini = new PlayerVisibility("Mini", 2, "miniplayer");
            public static final PlayerVisibility Background = new PlayerVisibility("Background", 3, "background");
            public static final PlayerVisibility Unknown = new PlayerVisibility("Unknown", 4, "unknown");

            private static final /* synthetic */ PlayerVisibility[] $values() {
                return new PlayerVisibility[]{Text, AudioOnly, Mini, Background, Unknown};
            }

            static {
                PlayerVisibility[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private PlayerVisibility(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static PlayerVisibility valueOf(String str) {
                return (PlayerVisibility) Enum.valueOf(PlayerVisibility.class, str);
            }

            public static PlayerVisibility[] values() {
                return (PlayerVisibility[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PronunciationClickedPreview;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PronunciationClickedPreview extends Event {
            public static final PronunciationClickedPreview INSTANCE = new PronunciationClickedPreview();

            /* JADX WARN: Multi-variable type inference failed */
            private PronunciationClickedPreview() {
                super("reader_pronunciation_clicked_preview", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PronunciationClickedPreview)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1702653007;
            }

            public String toString() {
                return "PronunciationClickedPreview";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PronunciationClickedSave;", "Lio/elevenlabs/domain/Analytics$Event;", "originalTextWordCount", "", "<init>", "(I)V", "getOriginalTextWordCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PronunciationClickedSave extends Event {
            private final int originalTextWordCount;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PronunciationClickedSave(int i10) {
                super("reader_pronunciation_clicked_save", r0, null);
                Map singletonMap = Collections.singletonMap("original_text_word_count", Integer.valueOf(i10));
                singletonMap.getClass();
                this.originalTextWordCount = i10;
            }

            public static /* synthetic */ PronunciationClickedSave copy$default(PronunciationClickedSave pronunciationClickedSave, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = pronunciationClickedSave.originalTextWordCount;
                }
                return pronunciationClickedSave.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getOriginalTextWordCount() {
                return this.originalTextWordCount;
            }

            public final PronunciationClickedSave copy(int originalTextWordCount) {
                return new PronunciationClickedSave(originalTextWordCount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PronunciationClickedSave) && this.originalTextWordCount == ((PronunciationClickedSave) other).originalTextWordCount) {
                    return true;
                }
                return false;
            }

            public final int getOriginalTextWordCount() {
                return this.originalTextWordCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.originalTextWordCount);
            }

            public String toString() {
                return b.j(this.originalTextWordCount, "PronunciationClickedSave(originalTextWordCount=", Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PronunciationExistsDialogClickedEditOption;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PronunciationExistsDialogClickedEditOption extends Event {
            public static final PronunciationExistsDialogClickedEditOption INSTANCE = new PronunciationExistsDialogClickedEditOption();

            /* JADX WARN: Multi-variable type inference failed */
            private PronunciationExistsDialogClickedEditOption() {
                super("reader_pronunciation_exists_dialog_clicked_edit_option", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PronunciationExistsDialogClickedEditOption)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2042399276;
            }

            public String toString() {
                return "PronunciationExistsDialogClickedEditOption";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PronunciationExistsDialogShown;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PronunciationExistsDialogShown extends Event {
            public static final PronunciationExistsDialogShown INSTANCE = new PronunciationExistsDialogShown();

            /* JADX WARN: Multi-variable type inference failed */
            private PronunciationExistsDialogShown() {
                super("reader_pronunciation_exists_dialog_shown", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PronunciationExistsDialogShown)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -250383041;
            }

            public String toString() {
                return "PronunciationExistsDialogShown";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PronunciationsListClickedDeleteOption;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PronunciationsListClickedDeleteOption extends Event {
            public static final PronunciationsListClickedDeleteOption INSTANCE = new PronunciationsListClickedDeleteOption();

            /* JADX WARN: Multi-variable type inference failed */
            private PronunciationsListClickedDeleteOption() {
                super("reader_pronunciations_list_clicked_delete_option", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PronunciationsListClickedDeleteOption)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1766743708;
            }

            public String toString() {
                return "PronunciationsListClickedDeleteOption";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PronunciationsListClickedEditOption;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PronunciationsListClickedEditOption extends Event {
            public static final PronunciationsListClickedEditOption INSTANCE = new PronunciationsListClickedEditOption();

            /* JADX WARN: Multi-variable type inference failed */
            private PronunciationsListClickedEditOption() {
                super("reader_pronunciations_list_clicked_edit_option", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PronunciationsListClickedEditOption)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -704508029;
            }

            public String toString() {
                return "PronunciationsListClickedEditOption";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PronunciationsListClickedPreview;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PronunciationsListClickedPreview extends Event {
            public static final PronunciationsListClickedPreview INSTANCE = new PronunciationsListClickedPreview();

            /* JADX WARN: Multi-variable type inference failed */
            private PronunciationsListClickedPreview() {
                super("reader_pronunciations_list_clicked_preview", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof PronunciationsListClickedPreview)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1250328092;
            }

            public String toString() {
                return "PronunciationsListClickedPreview";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PronunciationsListShown;", "Lio/elevenlabs/domain/Analytics$Event;", "pronunciationCount", "", "<init>", "(I)V", "getPronunciationCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PronunciationsListShown extends Event {
            private final int pronunciationCount;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PronunciationsListShown(int i10) {
                super("reader_pronunciations_list_shown", r0, null);
                Map singletonMap = Collections.singletonMap("pronunciation_count", Integer.valueOf(i10));
                singletonMap.getClass();
                this.pronunciationCount = i10;
            }

            public static /* synthetic */ PronunciationsListShown copy$default(PronunciationsListShown pronunciationsListShown, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = pronunciationsListShown.pronunciationCount;
                }
                return pronunciationsListShown.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getPronunciationCount() {
                return this.pronunciationCount;
            }

            public final PronunciationsListShown copy(int pronunciationCount) {
                return new PronunciationsListShown(pronunciationCount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof PronunciationsListShown) && this.pronunciationCount == ((PronunciationsListShown) other).pronunciationCount) {
                    return true;
                }
                return false;
            }

            public final int getPronunciationCount() {
                return this.pronunciationCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.pronunciationCount);
            }

            public String toString() {
                return b.j(this.pronunciationCount, "PronunciationsListShown(pronunciationCount=", Separators.RPAREN);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TopBar", "MoreActionsSheet", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class ReadDetailsActionSource {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ReadDetailsActionSource[] $VALUES;
            private final String value;
            public static final ReadDetailsActionSource TopBar = new ReadDetailsActionSource("TopBar", 0, "top_bar");
            public static final ReadDetailsActionSource MoreActionsSheet = new ReadDetailsActionSource("MoreActionsSheet", 1, "more_actions_sheet");

            private static final /* synthetic */ ReadDetailsActionSource[] $values() {
                return new ReadDetailsActionSource[]{TopBar, MoreActionsSheet};
            }

            static {
                ReadDetailsActionSource[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private ReadDetailsActionSource(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static ReadDetailsActionSource valueOf(String str) {
                return (ReadDetailsActionSource) Enum.valueOf(ReadDetailsActionSource.class, str);
            }

            public static ReadDetailsActionSource[] values() {
                return (ReadDetailsActionSource[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ReadDetailsClickedAddToCollection;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ReadDetailsClickedAddToCollection extends Event {
            private final String readId;

            public ReadDetailsClickedAddToCollection(String str) {
                super("reader_read_details_clicked_add_to_collection", i.l(str, "read_id", str), null);
                this.readId = str;
            }

            public static /* synthetic */ ReadDetailsClickedAddToCollection copy$default(ReadDetailsClickedAddToCollection readDetailsClickedAddToCollection, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = readDetailsClickedAddToCollection.readId;
                }
                return readDetailsClickedAddToCollection.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ReadDetailsClickedAddToCollection copy(String readId) {
                readId.getClass();
                return new ReadDetailsClickedAddToCollection(readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ReadDetailsClickedAddToCollection) && m.c(this.readId, ((ReadDetailsClickedAddToCollection) other).readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.readId.hashCode();
            }

            public String toString() {
                return f.C("ReadDetailsClickedAddToCollection(readId=", this.readId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ReadDetailsClickedHelp;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "<init>", "(Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ReadDetailsClickedHelp extends Event {
            private final String readId;

            public ReadDetailsClickedHelp(String str) {
                super("reader_read_details_clicked_help", i.l(str, "read_id", str), null);
                this.readId = str;
            }

            public static /* synthetic */ ReadDetailsClickedHelp copy$default(ReadDetailsClickedHelp readDetailsClickedHelp, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = readDetailsClickedHelp.readId;
                }
                return readDetailsClickedHelp.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ReadDetailsClickedHelp copy(String readId) {
                readId.getClass();
                return new ReadDetailsClickedHelp(readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ReadDetailsClickedHelp) && m.c(this.readId, ((ReadDetailsClickedHelp) other).readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.readId.hashCode();
            }

            public String toString() {
                return f.C("ReadDetailsClickedHelp(readId=", this.readId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ReadDetailsClickedShare;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;", "readId", "", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;Ljava/lang/String;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;", "getReadId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ReadDetailsClickedShare extends Event {
            private final String readId;
            private final ReadDetailsActionSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadDetailsClickedShare(ReadDetailsActionSource readDetailsActionSource, String str) {
                super("reader_read_details_clicked_share", a0.J(new k("source", readDetailsActionSource.getValue()), new k("read_id", str)), null);
                readDetailsActionSource.getClass();
                str.getClass();
                this.source = readDetailsActionSource;
                this.readId = str;
            }

            public static /* synthetic */ ReadDetailsClickedShare copy$default(ReadDetailsClickedShare readDetailsClickedShare, ReadDetailsActionSource readDetailsActionSource, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    readDetailsActionSource = readDetailsClickedShare.source;
                }
                if ((i10 & 2) != 0) {
                    str = readDetailsClickedShare.readId;
                }
                return readDetailsClickedShare.copy(readDetailsActionSource, str);
            }

            /* renamed from: component1, reason: from getter */
            public final ReadDetailsActionSource getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ReadDetailsClickedShare copy(ReadDetailsActionSource source, String readId) {
                source.getClass();
                readId.getClass();
                return new ReadDetailsClickedShare(source, readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadDetailsClickedShare)) {
                    return false;
                }
                ReadDetailsClickedShare readDetailsClickedShare = (ReadDetailsClickedShare) other;
                if (this.source == readDetailsClickedShare.source && m.c(this.readId, readDetailsClickedShare.readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final ReadDetailsActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.readId.hashCode() + (this.source.hashCode() * 31);
            }

            public String toString() {
                return "ReadDetailsClickedShare(source=" + this.source + ", readId=" + this.readId + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ReadLaterAdded;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;", "readId", "", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;Ljava/lang/String;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;", "getReadId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ReadLaterAdded extends Event {
            private final String readId;
            private final ReadDetailsActionSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadLaterAdded(ReadDetailsActionSource readDetailsActionSource, String str) {
                super("reader_read_later_added", a0.J(new k("source", readDetailsActionSource.getValue()), new k("read_id", str)), null);
                readDetailsActionSource.getClass();
                str.getClass();
                this.source = readDetailsActionSource;
                this.readId = str;
            }

            public static /* synthetic */ ReadLaterAdded copy$default(ReadLaterAdded readLaterAdded, ReadDetailsActionSource readDetailsActionSource, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    readDetailsActionSource = readLaterAdded.source;
                }
                if ((i10 & 2) != 0) {
                    str = readLaterAdded.readId;
                }
                return readLaterAdded.copy(readDetailsActionSource, str);
            }

            /* renamed from: component1, reason: from getter */
            public final ReadDetailsActionSource getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ReadLaterAdded copy(ReadDetailsActionSource source, String readId) {
                source.getClass();
                readId.getClass();
                return new ReadLaterAdded(source, readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadLaterAdded)) {
                    return false;
                }
                ReadLaterAdded readLaterAdded = (ReadLaterAdded) other;
                if (this.source == readLaterAdded.source && m.c(this.readId, readLaterAdded.readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final ReadDetailsActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.readId.hashCode() + (this.source.hashCode() * 31);
            }

            public String toString() {
                return "ReadLaterAdded(source=" + this.source + ", readId=" + this.readId + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ReadLaterRemoved;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;", "readId", "", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;Ljava/lang/String;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$ReadDetailsActionSource;", "getReadId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ReadLaterRemoved extends Event {
            private final String readId;
            private final ReadDetailsActionSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadLaterRemoved(ReadDetailsActionSource readDetailsActionSource, String str) {
                super("reader_read_later_removed", a0.J(new k("source", readDetailsActionSource.getValue()), new k("read_id", str)), null);
                readDetailsActionSource.getClass();
                str.getClass();
                this.source = readDetailsActionSource;
                this.readId = str;
            }

            public static /* synthetic */ ReadLaterRemoved copy$default(ReadLaterRemoved readLaterRemoved, ReadDetailsActionSource readDetailsActionSource, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    readDetailsActionSource = readLaterRemoved.source;
                }
                if ((i10 & 2) != 0) {
                    str = readLaterRemoved.readId;
                }
                return readLaterRemoved.copy(readDetailsActionSource, str);
            }

            /* renamed from: component1, reason: from getter */
            public final ReadDetailsActionSource getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            public final ReadLaterRemoved copy(ReadDetailsActionSource source, String readId) {
                source.getClass();
                readId.getClass();
                return new ReadLaterRemoved(source, readId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadLaterRemoved)) {
                    return false;
                }
                ReadLaterRemoved readLaterRemoved = (ReadLaterRemoved) other;
                if (this.source == readLaterRemoved.source && m.c(this.readId, readLaterRemoved.readId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final ReadDetailsActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.readId.hashCode() + (this.source.hashCode() * 31);
            }

            public String toString() {
                return "ReadLaterRemoved(source=" + this.source + ", readId=" + this.readId + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ReadsDeletedReadItem;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ReadsDeletedReadItem extends Event {
            public static final ReadsDeletedReadItem INSTANCE = new ReadsDeletedReadItem();

            /* JADX WARN: Multi-variable type inference failed */
            private ReadsDeletedReadItem() {
                super("reader_reads_deleted_read_item", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ReadsDeletedReadItem)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -917494836;
            }

            public String toString() {
                return "ReadsDeletedReadItem";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SettingsClickedPronunciationsOption;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SettingsClickedPronunciationsOption extends Event {
            public static final SettingsClickedPronunciationsOption INSTANCE = new SettingsClickedPronunciationsOption();

            /* JADX WARN: Multi-variable type inference failed */
            private SettingsClickedPronunciationsOption() {
                super("reader_settings_clicked_pronunciations_option", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SettingsClickedPronunciationsOption)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -574617232;
            }

            public String toString() {
                return "SettingsClickedPronunciationsOption";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ShareContent;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GenFM", "Imported", "Explore", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class ShareContent {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ShareContent[] $VALUES;
            private final String value;
            public static final ShareContent GenFM = new ShareContent("GenFM", 0, "genfm");
            public static final ShareContent Imported = new ShareContent("Imported", 1, "imported");
            public static final ShareContent Explore = new ShareContent("Explore", 2, ShowkasePreviewGroup.EXPLORE);

            private static final /* synthetic */ ShareContent[] $values() {
                return new ShareContent[]{GenFM, Imported, Explore};
            }

            static {
                ShareContent[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private ShareContent(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static ShareContent valueOf(String str) {
                return (ShareContent) Enum.valueOf(ShareContent.class, str);
            }

            public static ShareContent[] values() {
                return (ShareContent[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ShareImportFile;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShareImportFile extends Event {
            public static final ShareImportFile INSTANCE = new ShareImportFile();

            /* JADX WARN: Multi-variable type inference failed */
            private ShareImportFile() {
                super("reader_share_import_file", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof ShareImportFile)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1158132359;
            }

            public String toString() {
                return "ShareImportFile";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ShareImportText;", "Lio/elevenlabs/domain/Analytics$Event;", MetaStatKeys.KEY_LENGTH, "", "<init>", "(I)V", "getLength", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShareImportText extends Event {
            private final int length;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ShareImportText(int i10) {
                super("reader_share_import_text", r0, null);
                Map singletonMap = Collections.singletonMap(MetaStatKeys.KEY_LENGTH, Integer.valueOf(i10));
                singletonMap.getClass();
                this.length = i10;
            }

            public static /* synthetic */ ShareImportText copy$default(ShareImportText shareImportText, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = shareImportText.length;
                }
                return shareImportText.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getLength() {
                return this.length;
            }

            public final ShareImportText copy(int length) {
                return new ShareImportText(length);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof ShareImportText) && this.length == ((ShareImportText) other).length) {
                    return true;
                }
                return false;
            }

            public final int getLength() {
                return this.length;
            }

            public int hashCode() {
                return Integer.hashCode(this.length);
            }

            public String toString() {
                return b.j(this.length, "ShareImportText(length=", Separators.RPAREN);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ShareOption;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Instagram", "Twitter", "Whatsapp", "More", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class ShareOption {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ShareOption[] $VALUES;
            private final String value;
            public static final ShareOption Instagram = new ShareOption("Instagram", 0, "instagram");
            public static final ShareOption Twitter = new ShareOption("Twitter", 1, "twitter");
            public static final ShareOption Whatsapp = new ShareOption("Whatsapp", 2, "whatsapp");
            public static final ShareOption More = new ShareOption("More", 3, "more");

            private static final /* synthetic */ ShareOption[] $values() {
                return new ShareOption[]{Instagram, Twitter, Whatsapp, More};
            }

            static {
                ShareOption[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private ShareOption(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static ShareOption valueOf(String str) {
                return (ShareOption) Enum.valueOf(ShareOption.class, str);
            }

            public static ShareOption[] values() {
                return (ShareOption[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ShareSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Global", "BookmarkSheet", "BookmarksPage", "BookmarkSuccessToast", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class ShareSource {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ShareSource[] $VALUES;
            private final String value;
            public static final ShareSource Global = new ShareSource("Global", 0, "global");
            public static final ShareSource BookmarkSheet = new ShareSource("BookmarkSheet", 1, "bookmark_sheet");
            public static final ShareSource BookmarksPage = new ShareSource("BookmarksPage", 2, "bookmarks_page");
            public static final ShareSource BookmarkSuccessToast = new ShareSource("BookmarkSuccessToast", 3, "bookmark_success_toast");

            private static final /* synthetic */ ShareSource[] $values() {
                return new ShareSource[]{Global, BookmarkSheet, BookmarksPage, BookmarkSuccessToast};
            }

            static {
                ShareSource[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private ShareSource(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static ShareSource valueOf(String str) {
                return (ShareSource) Enum.valueOf(ShareSource.class, str);
            }

            public static ShareSource[] values() {
                return (ShareSource[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ShareType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Clip", "Link", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class ShareType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ShareType[] $VALUES;
            public static final ShareType Clip = new ShareType("Clip", 0, "clip");
            public static final ShareType Link = new ShareType("Link", 1, "link");
            private final String value;

            private static final /* synthetic */ ShareType[] $values() {
                return new ShareType[]{Clip, Link};
            }

            static {
                ShareType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private ShareType(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static ShareType valueOf(String str) {
                return (ShareType) Enum.valueOf(ShareType.class, str);
            }

            public static ShareType[] values() {
                return (ShareType[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SideloadDetected;", "Lio/elevenlabs/domain/Analytics$Event;", "installer", "", "<init>", "(Ljava/lang/String;)V", "getInstaller", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SideloadDetected extends Event {
            private final String installer;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public SideloadDetected(String str) {
                super("reader_android_rtl_canvas_validation", r0, null);
                Map singletonMap = Collections.singletonMap("installer", str);
                singletonMap.getClass();
                this.installer = str;
            }

            public static /* synthetic */ SideloadDetected copy$default(SideloadDetected sideloadDetected, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = sideloadDetected.installer;
                }
                return sideloadDetected.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getInstaller() {
                return this.installer;
            }

            public final SideloadDetected copy(String installer) {
                return new SideloadDetected(installer);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SideloadDetected) && m.c(this.installer, ((SideloadDetected) other).installer)) {
                    return true;
                }
                return false;
            }

            public final String getInstaller() {
                return this.installer;
            }

            public int hashCode() {
                String str = this.installer;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return f.C("SideloadDetected(installer=", this.installer, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignedIn;", "Lio/elevenlabs/domain/Analytics$Event;", FirebaseAnalytics.Param.METHOD, "Lio/elevenlabs/domain/Analytics$Event$AuthMethod;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$AuthMethod;)V", "getMethod", "()Lio/elevenlabs/domain/Analytics$Event$AuthMethod;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignedIn extends Event {
            private final AuthMethod method;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public SignedIn(AuthMethod authMethod) {
                super("reader_signed_in", r0, null);
                authMethod.getClass();
                Map singletonMap = Collections.singletonMap(FirebaseAnalytics.Param.METHOD, authMethod.getValue());
                singletonMap.getClass();
                this.method = authMethod;
            }

            public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, AuthMethod authMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authMethod = signedIn.method;
                }
                return signedIn.copy(authMethod);
            }

            /* renamed from: component1, reason: from getter */
            public final AuthMethod getMethod() {
                return this.method;
            }

            public final SignedIn copy(AuthMethod method) {
                method.getClass();
                return new SignedIn(method);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SignedIn) && this.method == ((SignedIn) other).method) {
                    return true;
                }
                return false;
            }

            public final AuthMethod getMethod() {
                return this.method;
            }

            public int hashCode() {
                return this.method.hashCode();
            }

            public String toString() {
                return "SignedIn(method=" + this.method + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignedOut;", "Lio/elevenlabs/domain/Analytics$Event;", "reason", "Lio/elevenlabs/domain/services/AuthService$SignOutReason;", "isConnected", "", "<init>", "(Lio/elevenlabs/domain/services/AuthService$SignOutReason;Z)V", "getReason", "()Lio/elevenlabs/domain/services/AuthService$SignOutReason;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignedOut extends Event {
            private final boolean isConnected;
            private final AuthService.SignOutReason reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignedOut(AuthService.SignOutReason signOutReason, boolean z6) {
                super("reader_signed_out", a0.J(new k("reason", signOutReason.getValue()), new k("is_connected", Boolean.valueOf(z6))), null);
                signOutReason.getClass();
                this.reason = signOutReason;
                this.isConnected = z6;
            }

            public static /* synthetic */ SignedOut copy$default(SignedOut signedOut, AuthService.SignOutReason signOutReason, boolean z6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    signOutReason = signedOut.reason;
                }
                if ((i10 & 2) != 0) {
                    z6 = signedOut.isConnected;
                }
                return signedOut.copy(signOutReason, z6);
            }

            /* renamed from: component1, reason: from getter */
            public final AuthService.SignOutReason getReason() {
                return this.reason;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsConnected() {
                return this.isConnected;
            }

            public final SignedOut copy(AuthService.SignOutReason reason, boolean isConnected) {
                reason.getClass();
                return new SignedOut(reason, isConnected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SignedOut)) {
                    return false;
                }
                SignedOut signedOut = (SignedOut) other;
                if (this.reason == signedOut.reason && this.isConnected == signedOut.isConnected) {
                    return true;
                }
                return false;
            }

            public final AuthService.SignOutReason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isConnected) + (this.reason.hashCode() * 31);
            }

            public final boolean isConnected() {
                return this.isConnected;
            }

            public String toString() {
                return "SignedOut(reason=" + this.reason + ", isConnected=" + this.isConnected + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignedUp;", "Lio/elevenlabs/domain/Analytics$Event;", FirebaseAnalytics.Param.METHOD, "Lio/elevenlabs/domain/Analytics$Event$AuthMethod;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$AuthMethod;)V", "getMethod", "()Lio/elevenlabs/domain/Analytics$Event$AuthMethod;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignedUp extends Event {
            private final AuthMethod method;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public SignedUp(AuthMethod authMethod) {
                super("reader_signed_up", r0, null);
                authMethod.getClass();
                Map singletonMap = Collections.singletonMap(FirebaseAnalytics.Param.METHOD, authMethod.getValue());
                singletonMap.getClass();
                this.method = authMethod;
            }

            public static /* synthetic */ SignedUp copy$default(SignedUp signedUp, AuthMethod authMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    authMethod = signedUp.method;
                }
                return signedUp.copy(authMethod);
            }

            /* renamed from: component1, reason: from getter */
            public final AuthMethod getMethod() {
                return this.method;
            }

            public final SignedUp copy(AuthMethod method) {
                method.getClass();
                return new SignedUp(method);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SignedUp) && this.method == ((SignedUp) other).method) {
                    return true;
                }
                return false;
            }

            public final AuthMethod getMethod() {
                return this.method;
            }

            public int hashCode() {
                return this.method.hashCode();
            }

            public String toString() {
                return "SignedUp(method=" + this.method + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupClickedForgotPassword;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupClickedForgotPassword extends Event {
            public static final SignupClickedForgotPassword INSTANCE = new SignupClickedForgotPassword();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupClickedForgotPassword() {
                super("reader_signup_clicked_forgot_password", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupClickedForgotPassword)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1307118426;
            }

            public String toString() {
                return "SignupClickedForgotPassword";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupClickedLoginWithEmail;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupClickedLoginWithEmail extends Event {
            public static final SignupClickedLoginWithEmail INSTANCE = new SignupClickedLoginWithEmail();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupClickedLoginWithEmail() {
                super("reader_signup_clicked_login_with_email", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupClickedLoginWithEmail)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 254309077;
            }

            public String toString() {
                return "SignupClickedLoginWithEmail";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupClickedLoginWithGoogle;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupClickedLoginWithGoogle extends Event {
            public static final SignupClickedLoginWithGoogle INSTANCE = new SignupClickedLoginWithGoogle();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupClickedLoginWithGoogle() {
                super("reader_signup_clicked_login_with_google", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupClickedLoginWithGoogle)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -646832608;
            }

            public String toString() {
                return "SignupClickedLoginWithGoogle";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupClickedSignupWithEmail;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupClickedSignupWithEmail extends Event {
            public static final SignupClickedSignupWithEmail INSTANCE = new SignupClickedSignupWithEmail();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupClickedSignupWithEmail() {
                super("reader_signup_clicked_signup_with_email", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupClickedSignupWithEmail)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -462318730;
            }

            public String toString() {
                return "SignupClickedSignupWithEmail";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupLoginError;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupLoginError extends Event {
            public static final SignupLoginError INSTANCE = new SignupLoginError();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupLoginError() {
                super("reader_signup_login_error", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupLoginError)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2115993346;
            }

            public String toString() {
                return "SignupLoginError";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupLoginSubmitted;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupLoginSubmitted extends Event {
            public static final SignupLoginSubmitted INSTANCE = new SignupLoginSubmitted();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupLoginSubmitted() {
                super("reader_signup_login_submitted", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupLoginSubmitted)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1394103055;
            }

            public String toString() {
                return "SignupLoginSubmitted";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupLoginSuccess;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupLoginSuccess extends Event {
            public static final SignupLoginSuccess INSTANCE = new SignupLoginSuccess();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupLoginSuccess() {
                super("reader_signup_login_success", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupLoginSuccess)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1956710777;
            }

            public String toString() {
                return "SignupLoginSuccess";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupSignupSuccess;", "Lio/elevenlabs/domain/Analytics$Event;", "Lio/elevenlabs/domain/Analytics$Event$ConversionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupSignupSuccess extends Event implements ConversionEvent {
            public static final SignupSignupSuccess INSTANCE = new SignupSignupSuccess();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupSignupSuccess() {
                super("reader_signup_signup_success", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupSignupSuccess)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 652084876;
            }

            public String toString() {
                return "SignupSignupSuccess";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupSubmissionError;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupSubmissionError extends Event {
            public static final SignupSubmissionError INSTANCE = new SignupSubmissionError();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupSubmissionError() {
                super("reader_signup_received_submission_error", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupSubmissionError)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -443829091;
            }

            public String toString() {
                return "SignupSubmissionError";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SignupSubmitted;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SignupSubmitted extends Event {
            public static final SignupSubmitted INSTANCE = new SignupSubmitted();

            /* JADX WARN: Multi-variable type inference failed */
            private SignupSubmitted() {
                super("reader_signup_signup_submitted", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SignupSubmitted)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -632259524;
            }

            public String toString() {
                return "SignupSubmitted";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SingularAdAttributionRecorded;", "Lio/elevenlabs/domain/Analytics$Event;", SignalClient.CONNECT_QUERY_NETWORK_TYPE, "", "campaign", "campaignId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNetwork", "()Ljava/lang/String;", "getCampaign", "getCampaignId", "setOncePersonProperties", "", "", "getSetOncePersonProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SingularAdAttributionRecorded extends Event {
            private final String campaign;
            private final String campaignId;
            private final String network;
            private final Map<String, Object> setOncePersonProperties;

            /* JADX WARN: Illegal instructions before constructor call */
            /* JADX WARN: Multi-variable type inference failed */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public SingularAdAttributionRecorded(String str, String str2, String str3) {
                super("reader_singular_ad_attribution_recorded", a0.R(tn.n.F0(new k[]{r0, r2, r3})), r1 == true ? 1 : 0);
                k kVar;
                k kVar2;
                k kVar3;
                str.getClass();
                k kVar4 = new k(SignalClient.CONNECT_QUERY_NETWORK_TYPE, str);
                Object[] objArr = 0;
                if (str2 != null) {
                    kVar = new k("campaign", str2);
                } else {
                    kVar = null;
                }
                if (str3 != null) {
                    kVar2 = new k(FirebaseAnalytics.Param.CAMPAIGN_ID, str3);
                } else {
                    kVar2 = null;
                }
                this.network = str;
                this.campaign = str2;
                this.campaignId = str3;
                k kVar5 = new k("arrived_from_ad", Boolean.TRUE);
                k kVar6 = new k("singular_network", str);
                if (str2 != null) {
                    kVar3 = new k("singular_campaign", str2);
                } else {
                    kVar3 = null;
                }
                this.setOncePersonProperties = a0.R(tn.n.F0(new k[]{kVar5, kVar6, kVar3, str3 != null ? new k("singular_campaign_id", str3) : null}));
            }

            public static /* synthetic */ SingularAdAttributionRecorded copy$default(SingularAdAttributionRecorded singularAdAttributionRecorded, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = singularAdAttributionRecorded.network;
                }
                if ((i10 & 2) != 0) {
                    str2 = singularAdAttributionRecorded.campaign;
                }
                if ((i10 & 4) != 0) {
                    str3 = singularAdAttributionRecorded.campaignId;
                }
                return singularAdAttributionRecorded.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getNetwork() {
                return this.network;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCampaign() {
                return this.campaign;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCampaignId() {
                return this.campaignId;
            }

            public final SingularAdAttributionRecorded copy(String network, String campaign, String campaignId) {
                network.getClass();
                return new SingularAdAttributionRecorded(network, campaign, campaignId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SingularAdAttributionRecorded)) {
                    return false;
                }
                SingularAdAttributionRecorded singularAdAttributionRecorded = (SingularAdAttributionRecorded) other;
                if (m.c(this.network, singularAdAttributionRecorded.network) && m.c(this.campaign, singularAdAttributionRecorded.campaign) && m.c(this.campaignId, singularAdAttributionRecorded.campaignId)) {
                    return true;
                }
                return false;
            }

            public final String getCampaign() {
                return this.campaign;
            }

            public final String getCampaignId() {
                return this.campaignId;
            }

            public final String getNetwork() {
                return this.network;
            }

            @Override // io.elevenlabs.domain.Analytics.Event
            public Map<String, Object> getSetOncePersonProperties() {
                return this.setOncePersonProperties;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.network.hashCode() * 31;
                String str = this.campaign;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (hashCode2 + hashCode) * 31;
                String str2 = this.campaignId;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return i11 + i10;
            }

            public String toString() {
                return f.l(this.campaignId, Separators.RPAREN, f.s("SingularAdAttributionRecorded(network=", this.network, ", campaign=", this.campaign, ", campaignId="));
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SingularOrganicAttributionRecorded;", "Lio/elevenlabs/domain/Analytics$Event;", SignalClient.CONNECT_QUERY_NETWORK_TYPE, "", "campaign", "campaignId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNetwork", "()Ljava/lang/String;", "getCampaign", "getCampaignId", "setOncePersonProperties", "", "", "getSetOncePersonProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SingularOrganicAttributionRecorded extends Event {
            private final String campaign;
            private final String campaignId;
            private final String network;
            private final Map<String, Boolean> setOncePersonProperties;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public SingularOrganicAttributionRecorded(String str, String str2, String str3) {
                super("reader_singular_organic_attribution_recorded", a0.R(tn.n.F0(new k[]{r1, r2, r3})), r0);
                k kVar;
                k kVar2;
                k kVar3;
                kotlin.jvm.internal.f fVar = null;
                if (str != null) {
                    kVar = new k(SignalClient.CONNECT_QUERY_NETWORK_TYPE, str);
                } else {
                    kVar = null;
                }
                if (str2 != null) {
                    kVar2 = new k("campaign", str2);
                } else {
                    kVar2 = null;
                }
                if (str3 != null) {
                    kVar3 = new k(FirebaseAnalytics.Param.CAMPAIGN_ID, str3);
                } else {
                    kVar3 = null;
                }
                this.network = str;
                this.campaign = str2;
                this.campaignId = str3;
                Map<String, Boolean> singletonMap = Collections.singletonMap("arrived_from_ad", Boolean.FALSE);
                singletonMap.getClass();
                this.setOncePersonProperties = singletonMap;
            }

            public static /* synthetic */ SingularOrganicAttributionRecorded copy$default(SingularOrganicAttributionRecorded singularOrganicAttributionRecorded, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = singularOrganicAttributionRecorded.network;
                }
                if ((i10 & 2) != 0) {
                    str2 = singularOrganicAttributionRecorded.campaign;
                }
                if ((i10 & 4) != 0) {
                    str3 = singularOrganicAttributionRecorded.campaignId;
                }
                return singularOrganicAttributionRecorded.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getNetwork() {
                return this.network;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCampaign() {
                return this.campaign;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCampaignId() {
                return this.campaignId;
            }

            public final SingularOrganicAttributionRecorded copy(String network, String campaign, String campaignId) {
                return new SingularOrganicAttributionRecorded(network, campaign, campaignId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SingularOrganicAttributionRecorded)) {
                    return false;
                }
                SingularOrganicAttributionRecorded singularOrganicAttributionRecorded = (SingularOrganicAttributionRecorded) other;
                if (m.c(this.network, singularOrganicAttributionRecorded.network) && m.c(this.campaign, singularOrganicAttributionRecorded.campaign) && m.c(this.campaignId, singularOrganicAttributionRecorded.campaignId)) {
                    return true;
                }
                return false;
            }

            public final String getCampaign() {
                return this.campaign;
            }

            public final String getCampaignId() {
                return this.campaignId;
            }

            public final String getNetwork() {
                return this.network;
            }

            @Override // io.elevenlabs.domain.Analytics.Event
            public Map<String, Boolean> getSetOncePersonProperties() {
                return this.setOncePersonProperties;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                String str = this.network;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.campaign;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str3 = this.campaignId;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return i12 + i10;
            }

            public String toString() {
                return f.l(this.campaignId, Separators.RPAREN, f.s("SingularOrganicAttributionRecorded(network=", this.network, ", campaign=", this.campaign, ", campaignId="));
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SleepTimerSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OverflowMenu", "BottomBar", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final class SleepTimerSource {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ SleepTimerSource[] $VALUES;
            private final String value;
            public static final SleepTimerSource OverflowMenu = new SleepTimerSource("OverflowMenu", 0, "overflow_menu");
            public static final SleepTimerSource BottomBar = new SleepTimerSource("BottomBar", 1, "bottom_bar");

            private static final /* synthetic */ SleepTimerSource[] $values() {
                return new SleepTimerSource[]{OverflowMenu, BottomBar};
            }

            static {
                SleepTimerSource[] $values = $values();
                $VALUES = $values;
                $ENTRIES = c1.q($values);
            }

            private SleepTimerSource(String str, int i10, String str2) {
                this.value = str2;
            }

            public static a getEntries() {
                return $ENTRIES;
            }

            public static SleepTimerSource valueOf(String str) {
                return (SleepTimerSource) Enum.valueOf(SleepTimerSource.class, str);
            }

            public static SleepTimerSource[] values() {
                return (SleepTimerSource[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SoundscapesAdjustedVolume;", "Lio/elevenlabs/domain/Analytics$Event;", "value", "", "soundscapeId", "", "<init>", "(FLjava/lang/String;)V", "getValue", "()F", "getSoundscapeId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SoundscapesAdjustedVolume extends Event {
            private final String soundscapeId;
            private final float value;

            public SoundscapesAdjustedVolume(float f10, String str) {
                super("reader_soundscapes_adjusted_volume", a0.J(new k("value", Float.valueOf(f10)), new k("track_id", str)), null);
                this.value = f10;
                this.soundscapeId = str;
            }

            public static /* synthetic */ SoundscapesAdjustedVolume copy$default(SoundscapesAdjustedVolume soundscapesAdjustedVolume, float f10, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = soundscapesAdjustedVolume.value;
                }
                if ((i10 & 2) != 0) {
                    str = soundscapesAdjustedVolume.soundscapeId;
                }
                return soundscapesAdjustedVolume.copy(f10, str);
            }

            /* renamed from: component1, reason: from getter */
            public final float getValue() {
                return this.value;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSoundscapeId() {
                return this.soundscapeId;
            }

            public final SoundscapesAdjustedVolume copy(float value, String soundscapeId) {
                return new SoundscapesAdjustedVolume(value, soundscapeId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SoundscapesAdjustedVolume)) {
                    return false;
                }
                SoundscapesAdjustedVolume soundscapesAdjustedVolume = (SoundscapesAdjustedVolume) other;
                if (Float.compare(this.value, soundscapesAdjustedVolume.value) == 0 && m.c(this.soundscapeId, soundscapesAdjustedVolume.soundscapeId)) {
                    return true;
                }
                return false;
            }

            public final String getSoundscapeId() {
                return this.soundscapeId;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = Float.hashCode(this.value) * 31;
                String str = this.soundscapeId;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return "SoundscapesAdjustedVolume(value=" + this.value + ", soundscapeId=" + this.soundscapeId + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SoundscapesClickedPlayerSheetButton;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;)V", "getReadId", "()Ljava/lang/String;", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SoundscapesClickedPlayerSheetButton extends Event {
            private final String readId;
            private final PlayerActionSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SoundscapesClickedPlayerSheetButton(String str, PlayerActionSource playerActionSource) {
                super("reader_soundscapes_clicked_player_sheet_button", a0.J(new k("read_id", str), new k("source", playerActionSource.getValue())), null);
                playerActionSource.getClass();
                this.readId = str;
                this.source = playerActionSource;
            }

            public static /* synthetic */ SoundscapesClickedPlayerSheetButton copy$default(SoundscapesClickedPlayerSheetButton soundscapesClickedPlayerSheetButton, String str, PlayerActionSource playerActionSource, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = soundscapesClickedPlayerSheetButton.readId;
                }
                if ((i10 & 2) != 0) {
                    playerActionSource = soundscapesClickedPlayerSheetButton.source;
                }
                return soundscapesClickedPlayerSheetButton.copy(str, playerActionSource);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            public final SoundscapesClickedPlayerSheetButton copy(String readId, PlayerActionSource source) {
                source.getClass();
                return new SoundscapesClickedPlayerSheetButton(readId, source);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SoundscapesClickedPlayerSheetButton)) {
                    return false;
                }
                SoundscapesClickedPlayerSheetButton soundscapesClickedPlayerSheetButton = (SoundscapesClickedPlayerSheetButton) other;
                if (m.c(this.readId, soundscapesClickedPlayerSheetButton.readId) && this.source == soundscapesClickedPlayerSheetButton.source) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                String str = this.readId;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return this.source.hashCode() + (hashCode * 31);
            }

            public String toString() {
                return "SoundscapesClickedPlayerSheetButton(readId=" + this.readId + ", source=" + this.source + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SoundscapesDisabledTrack;", "Lio/elevenlabs/domain/Analytics$Event;", "soundscapeId", "", "<init>", "(Ljava/lang/String;)V", "getSoundscapeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SoundscapesDisabledTrack extends Event {
            private final String soundscapeId;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public SoundscapesDisabledTrack(String str) {
                super("reader_soundscapes_disabled_track", r0, null);
                Map singletonMap = Collections.singletonMap("track_id", str);
                singletonMap.getClass();
                this.soundscapeId = str;
            }

            public static /* synthetic */ SoundscapesDisabledTrack copy$default(SoundscapesDisabledTrack soundscapesDisabledTrack, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = soundscapesDisabledTrack.soundscapeId;
                }
                return soundscapesDisabledTrack.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSoundscapeId() {
                return this.soundscapeId;
            }

            public final SoundscapesDisabledTrack copy(String soundscapeId) {
                return new SoundscapesDisabledTrack(soundscapeId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SoundscapesDisabledTrack) && m.c(this.soundscapeId, ((SoundscapesDisabledTrack) other).soundscapeId)) {
                    return true;
                }
                return false;
            }

            public final String getSoundscapeId() {
                return this.soundscapeId;
            }

            public int hashCode() {
                String str = this.soundscapeId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return f.C("SoundscapesDisabledTrack(soundscapeId=", this.soundscapeId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SoundscapesEnabledTrack;", "Lio/elevenlabs/domain/Analytics$Event;", "soundscapeId", "", "<init>", "(Ljava/lang/String;)V", "getSoundscapeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SoundscapesEnabledTrack extends Event {
            private final String soundscapeId;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public SoundscapesEnabledTrack(String str) {
                super("reader_soundscapes_enabled_track", r0, null);
                Map singletonMap = Collections.singletonMap("track_id", str);
                singletonMap.getClass();
                this.soundscapeId = str;
            }

            public static /* synthetic */ SoundscapesEnabledTrack copy$default(SoundscapesEnabledTrack soundscapesEnabledTrack, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = soundscapesEnabledTrack.soundscapeId;
                }
                return soundscapesEnabledTrack.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSoundscapeId() {
                return this.soundscapeId;
            }

            public final SoundscapesEnabledTrack copy(String soundscapeId) {
                return new SoundscapesEnabledTrack(soundscapeId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SoundscapesEnabledTrack) && m.c(this.soundscapeId, ((SoundscapesEnabledTrack) other).soundscapeId)) {
                    return true;
                }
                return false;
            }

            public final String getSoundscapeId() {
                return this.soundscapeId;
            }

            public int hashCode() {
                String str = this.soundscapeId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return f.C("SoundscapesEnabledTrack(soundscapeId=", this.soundscapeId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SoundscapesPreviewStarted;", "Lio/elevenlabs/domain/Analytics$Event;", "soundscapeId", "", "<init>", "(Ljava/lang/String;)V", "getSoundscapeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SoundscapesPreviewStarted extends Event {
            private final String soundscapeId;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public SoundscapesPreviewStarted(String str) {
                super("reader_soundscapes_preview_started", r0, null);
                Map singletonMap = Collections.singletonMap("soundscape_id", str);
                singletonMap.getClass();
                this.soundscapeId = str;
            }

            public static /* synthetic */ SoundscapesPreviewStarted copy$default(SoundscapesPreviewStarted soundscapesPreviewStarted, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = soundscapesPreviewStarted.soundscapeId;
                }
                return soundscapesPreviewStarted.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSoundscapeId() {
                return this.soundscapeId;
            }

            public final SoundscapesPreviewStarted copy(String soundscapeId) {
                return new SoundscapesPreviewStarted(soundscapeId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SoundscapesPreviewStarted) && m.c(this.soundscapeId, ((SoundscapesPreviewStarted) other).soundscapeId)) {
                    return true;
                }
                return false;
            }

            public final String getSoundscapeId() {
                return this.soundscapeId;
            }

            public int hashCode() {
                String str = this.soundscapeId;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return f.C("SoundscapesPreviewStarted(soundscapeId=", this.soundscapeId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SupportAgentClosed;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SupportAgentClosed extends Event {
            public static final SupportAgentClosed INSTANCE = new SupportAgentClosed();

            /* JADX WARN: Multi-variable type inference failed */
            private SupportAgentClosed() {
                super("reader_support_agent_closed", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SupportAgentClosed)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 247083369;
            }

            public String toString() {
                return "SupportAgentClosed";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SupportAgentConnected;", "Lio/elevenlabs/domain/Analytics$Event;", "mode", "", "<init>", "(Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SupportAgentConnected extends Event {
            private final String mode;

            public SupportAgentConnected(String str) {
                super("reader_support_agent_connected", i.l(str, "mode", str), null);
                this.mode = str;
            }

            public static /* synthetic */ SupportAgentConnected copy$default(SupportAgentConnected supportAgentConnected, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = supportAgentConnected.mode;
                }
                return supportAgentConnected.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMode() {
                return this.mode;
            }

            public final SupportAgentConnected copy(String mode) {
                mode.getClass();
                return new SupportAgentConnected(mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SupportAgentConnected) && m.c(this.mode, ((SupportAgentConnected) other).mode)) {
                    return true;
                }
                return false;
            }

            public final String getMode() {
                return this.mode;
            }

            public int hashCode() {
                return this.mode.hashCode();
            }

            public String toString() {
                return f.C("SupportAgentConnected(mode=", this.mode, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SupportAgentConnectionError;", "Lio/elevenlabs/domain/Analytics$Event;", "mode", "", "<init>", "(Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SupportAgentConnectionError extends Event {
            private final String mode;

            public SupportAgentConnectionError(String str) {
                super("reader_support_agent_connection_error", i.l(str, "mode", str), null);
                this.mode = str;
            }

            public static /* synthetic */ SupportAgentConnectionError copy$default(SupportAgentConnectionError supportAgentConnectionError, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = supportAgentConnectionError.mode;
                }
                return supportAgentConnectionError.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMode() {
                return this.mode;
            }

            public final SupportAgentConnectionError copy(String mode) {
                mode.getClass();
                return new SupportAgentConnectionError(mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SupportAgentConnectionError) && m.c(this.mode, ((SupportAgentConnectionError) other).mode)) {
                    return true;
                }
                return false;
            }

            public final String getMode() {
                return this.mode;
            }

            public int hashCode() {
                return this.mode.hashCode();
            }

            public String toString() {
                return f.C("SupportAgentConnectionError(mode=", this.mode, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SupportAgentMessageSent;", "Lio/elevenlabs/domain/Analytics$Event;", "mode", "", "<init>", "(Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SupportAgentMessageSent extends Event {
            private final String mode;

            public SupportAgentMessageSent(String str) {
                super("reader_support_agent_message_sent", i.l(str, "mode", str), null);
                this.mode = str;
            }

            public static /* synthetic */ SupportAgentMessageSent copy$default(SupportAgentMessageSent supportAgentMessageSent, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = supportAgentMessageSent.mode;
                }
                return supportAgentMessageSent.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMode() {
                return this.mode;
            }

            public final SupportAgentMessageSent copy(String mode) {
                mode.getClass();
                return new SupportAgentMessageSent(mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SupportAgentMessageSent) && m.c(this.mode, ((SupportAgentMessageSent) other).mode)) {
                    return true;
                }
                return false;
            }

            public final String getMode() {
                return this.mode;
            }

            public int hashCode() {
                return this.mode.hashCode();
            }

            public String toString() {
                return f.C("SupportAgentMessageSent(mode=", this.mode, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SupportAgentOpened;", "Lio/elevenlabs/domain/Analytics$Event;", "mode", "", "<init>", "(Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SupportAgentOpened extends Event {
            private final String mode;

            public SupportAgentOpened(String str) {
                super("reader_support_agent_opened", i.l(str, "mode", str), null);
                this.mode = str;
            }

            public static /* synthetic */ SupportAgentOpened copy$default(SupportAgentOpened supportAgentOpened, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = supportAgentOpened.mode;
                }
                return supportAgentOpened.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMode() {
                return this.mode;
            }

            public final SupportAgentOpened copy(String mode) {
                mode.getClass();
                return new SupportAgentOpened(mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SupportAgentOpened) && m.c(this.mode, ((SupportAgentOpened) other).mode)) {
                    return true;
                }
                return false;
            }

            public final String getMode() {
                return this.mode;
            }

            public int hashCode() {
                return this.mode.hashCode();
            }

            public String toString() {
                return f.C("SupportAgentOpened(mode=", this.mode, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SupportAgentRetry;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SupportAgentRetry extends Event {
            public static final SupportAgentRetry INSTANCE = new SupportAgentRetry();

            /* JADX WARN: Multi-variable type inference failed */
            private SupportAgentRetry() {
                super("reader_support_agent_retry", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof SupportAgentRetry)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1086759157;
            }

            public String toString() {
                return "SupportAgentRetry";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SupportAgentToolCall;", "Lio/elevenlabs/domain/Analytics$Event;", "toolName", "", "<init>", "(Ljava/lang/String;)V", "getToolName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SupportAgentToolCall extends Event {
            private final String toolName;

            public SupportAgentToolCall(String str) {
                super("reader_support_agent_tool_call", i.l(str, "tool_name", str), null);
                this.toolName = str;
            }

            public static /* synthetic */ SupportAgentToolCall copy$default(SupportAgentToolCall supportAgentToolCall, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = supportAgentToolCall.toolName;
                }
                return supportAgentToolCall.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getToolName() {
                return this.toolName;
            }

            public final SupportAgentToolCall copy(String toolName) {
                toolName.getClass();
                return new SupportAgentToolCall(toolName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof SupportAgentToolCall) && m.c(this.toolName, ((SupportAgentToolCall) other).toolName)) {
                    return true;
                }
                return false;
            }

            public final String getToolName() {
                return this.toolName;
            }

            public int hashCode() {
                return this.toolName.hashCode();
            }

            public String toString() {
                return f.C("SupportAgentToolCall(toolName=", this.toolName, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$TabClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "tab", "", "<init>", "(Ljava/lang/String;)V", "getTab", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class TabClicked extends Event {
            private final String tab;

            public TabClicked(String str) {
                super("reader_tab_clicked", i.l(str, "tab", str), null);
                this.tab = str;
            }

            public static /* synthetic */ TabClicked copy$default(TabClicked tabClicked, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = tabClicked.tab;
                }
                return tabClicked.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTab() {
                return this.tab;
            }

            public final TabClicked copy(String tab) {
                tab.getClass();
                return new TabClicked(tab);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof TabClicked) && m.c(this.tab, ((TabClicked) other).tab)) {
                    return true;
                }
                return false;
            }

            public final String getTab() {
                return this.tab;
            }

            public int hashCode() {
                return this.tab.hashCode();
            }

            public String toString() {
                return f.C("TabClicked(tab=", this.tab, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceChangerOriginalAudioRestored;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "previousVoiceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getPreviousVoiceId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceChangerOriginalAudioRestored extends Event {
            private final String previousVoiceId;
            private final String readId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VoiceChangerOriginalAudioRestored(String str, String str2) {
                super("reader_voice_changer_original_audio_restored", a0.J(new k("read_id", str), new k("previous_voice_id", str2)), null);
                str.getClass();
                str2.getClass();
                this.readId = str;
                this.previousVoiceId = str2;
            }

            public static /* synthetic */ VoiceChangerOriginalAudioRestored copy$default(VoiceChangerOriginalAudioRestored voiceChangerOriginalAudioRestored, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceChangerOriginalAudioRestored.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = voiceChangerOriginalAudioRestored.previousVoiceId;
                }
                return voiceChangerOriginalAudioRestored.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPreviousVoiceId() {
                return this.previousVoiceId;
            }

            public final VoiceChangerOriginalAudioRestored copy(String readId, String previousVoiceId) {
                readId.getClass();
                previousVoiceId.getClass();
                return new VoiceChangerOriginalAudioRestored(readId, previousVoiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceChangerOriginalAudioRestored)) {
                    return false;
                }
                VoiceChangerOriginalAudioRestored voiceChangerOriginalAudioRestored = (VoiceChangerOriginalAudioRestored) other;
                if (m.c(this.readId, voiceChangerOriginalAudioRestored.readId) && m.c(this.previousVoiceId, voiceChangerOriginalAudioRestored.previousVoiceId)) {
                    return true;
                }
                return false;
            }

            public final String getPreviousVoiceId() {
                return this.previousVoiceId;
            }

            public final String getReadId() {
                return this.readId;
            }

            public int hashCode() {
                return this.previousVoiceId.hashCode() + (this.readId.hashCode() * 31);
            }

            public String toString() {
                return h.c("VoiceChangerOriginalAudioRestored(readId=", this.readId, ", previousVoiceId=", this.previousVoiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceChangerPickerShown;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "currentAudioType", "currentVoiceId", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "getCurrentAudioType", "getCurrentVoiceId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceChangerPickerShown extends Event {
            private final String currentAudioType;
            private final String currentVoiceId;
            private final String readId;
            private final PlayerActionSource source;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VoiceChangerPickerShown(String str, PlayerActionSource playerActionSource, String str2, String str3) {
                super("reader_voice_changer_picker_shown", a0.J(new k("read_id", str), new k("source", playerActionSource.getValue()), new k("current_audio_type", str2), new k("current_voice_id", str3)), null);
                str.getClass();
                playerActionSource.getClass();
                str2.getClass();
                str3.getClass();
                this.readId = str;
                this.source = playerActionSource;
                this.currentAudioType = str2;
                this.currentVoiceId = str3;
            }

            public static /* synthetic */ VoiceChangerPickerShown copy$default(VoiceChangerPickerShown voiceChangerPickerShown, String str, PlayerActionSource playerActionSource, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceChangerPickerShown.readId;
                }
                if ((i10 & 2) != 0) {
                    playerActionSource = voiceChangerPickerShown.source;
                }
                if ((i10 & 4) != 0) {
                    str2 = voiceChangerPickerShown.currentAudioType;
                }
                if ((i10 & 8) != 0) {
                    str3 = voiceChangerPickerShown.currentVoiceId;
                }
                return voiceChangerPickerShown.copy(str, playerActionSource, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final PlayerActionSource getSource() {
                return this.source;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCurrentAudioType() {
                return this.currentAudioType;
            }

            /* renamed from: component4, reason: from getter */
            public final String getCurrentVoiceId() {
                return this.currentVoiceId;
            }

            public final VoiceChangerPickerShown copy(String readId, PlayerActionSource source, String currentAudioType, String currentVoiceId) {
                readId.getClass();
                source.getClass();
                currentAudioType.getClass();
                currentVoiceId.getClass();
                return new VoiceChangerPickerShown(readId, source, currentAudioType, currentVoiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceChangerPickerShown)) {
                    return false;
                }
                VoiceChangerPickerShown voiceChangerPickerShown = (VoiceChangerPickerShown) other;
                if (m.c(this.readId, voiceChangerPickerShown.readId) && this.source == voiceChangerPickerShown.source && m.c(this.currentAudioType, voiceChangerPickerShown.currentAudioType) && m.c(this.currentVoiceId, voiceChangerPickerShown.currentVoiceId)) {
                    return true;
                }
                return false;
            }

            public final String getCurrentAudioType() {
                return this.currentAudioType;
            }

            public final String getCurrentVoiceId() {
                return this.currentVoiceId;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final PlayerActionSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.currentVoiceId.hashCode() + c.c((this.source.hashCode() + (this.readId.hashCode() * 31)) * 31, 31, this.currentAudioType);
            }

            public String toString() {
                String str = this.readId;
                PlayerActionSource playerActionSource = this.source;
                String str2 = this.currentAudioType;
                String str3 = this.currentVoiceId;
                StringBuilder sb = new StringBuilder("VoiceChangerPickerShown(readId=");
                sb.append(str);
                sb.append(", source=");
                sb.append(playerActionSource);
                sb.append(", currentAudioType=");
                return f.n(sb, str2, ", currentVoiceId=", str3, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceChangerVoicePreviewed;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "voiceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceChangerVoicePreviewed extends Event {
            private final String readId;
            private final String voiceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VoiceChangerVoicePreviewed(String str, String str2) {
                super("reader_voice_changer_voice_previewed", a0.J(new k("read_id", str), new k("voice_id", str2)), null);
                str.getClass();
                str2.getClass();
                this.readId = str;
                this.voiceId = str2;
            }

            public static /* synthetic */ VoiceChangerVoicePreviewed copy$default(VoiceChangerVoicePreviewed voiceChangerVoicePreviewed, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceChangerVoicePreviewed.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = voiceChangerVoicePreviewed.voiceId;
                }
                return voiceChangerVoicePreviewed.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            public final VoiceChangerVoicePreviewed copy(String readId, String voiceId) {
                readId.getClass();
                voiceId.getClass();
                return new VoiceChangerVoicePreviewed(readId, voiceId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceChangerVoicePreviewed)) {
                    return false;
                }
                VoiceChangerVoicePreviewed voiceChangerVoicePreviewed = (VoiceChangerVoicePreviewed) other;
                if (m.c(this.readId, voiceChangerVoicePreviewed.readId) && m.c(this.voiceId, voiceChangerVoicePreviewed.voiceId)) {
                    return true;
                }
                return false;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                return this.voiceId.hashCode() + (this.readId.hashCode() * 31);
            }

            public String toString() {
                return h.c("VoiceChangerVoicePreviewed(readId=", this.readId, ", voiceId=", this.voiceId, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceChangerVoiceSelected;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "voiceId", "previousVoiceId", "previousAudioType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "getPreviousVoiceId", "getPreviousAudioType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceChangerVoiceSelected extends Event {
            private final String previousAudioType;
            private final String previousVoiceId;
            private final String readId;
            private final String voiceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VoiceChangerVoiceSelected(String str, String str2, String str3, String str4) {
                super("reader_voice_changer_voice_selected", a0.J(new k("read_id", str), new k("voice_id", str2), new k("previous_voice_id", str3), new k("previous_audio_type", str4)), null);
                str.getClass();
                str2.getClass();
                str4.getClass();
                this.readId = str;
                this.voiceId = str2;
                this.previousVoiceId = str3;
                this.previousAudioType = str4;
            }

            public static /* synthetic */ VoiceChangerVoiceSelected copy$default(VoiceChangerVoiceSelected voiceChangerVoiceSelected, String str, String str2, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceChangerVoiceSelected.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = voiceChangerVoiceSelected.voiceId;
                }
                if ((i10 & 4) != 0) {
                    str3 = voiceChangerVoiceSelected.previousVoiceId;
                }
                if ((i10 & 8) != 0) {
                    str4 = voiceChangerVoiceSelected.previousAudioType;
                }
                return voiceChangerVoiceSelected.copy(str, str2, str3, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPreviousVoiceId() {
                return this.previousVoiceId;
            }

            /* renamed from: component4, reason: from getter */
            public final String getPreviousAudioType() {
                return this.previousAudioType;
            }

            public final VoiceChangerVoiceSelected copy(String readId, String voiceId, String previousVoiceId, String previousAudioType) {
                readId.getClass();
                voiceId.getClass();
                previousAudioType.getClass();
                return new VoiceChangerVoiceSelected(readId, voiceId, previousVoiceId, previousAudioType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VoiceChangerVoiceSelected)) {
                    return false;
                }
                VoiceChangerVoiceSelected voiceChangerVoiceSelected = (VoiceChangerVoiceSelected) other;
                if (m.c(this.readId, voiceChangerVoiceSelected.readId) && m.c(this.voiceId, voiceChangerVoiceSelected.voiceId) && m.c(this.previousVoiceId, voiceChangerVoiceSelected.previousVoiceId) && m.c(this.previousAudioType, voiceChangerVoiceSelected.previousAudioType)) {
                    return true;
                }
                return false;
            }

            public final String getPreviousAudioType() {
                return this.previousAudioType;
            }

            public final String getPreviousVoiceId() {
                return this.previousVoiceId;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                int hashCode;
                int c5 = c.c(this.readId.hashCode() * 31, 31, this.voiceId);
                String str = this.previousVoiceId;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return this.previousAudioType.hashCode() + ((c5 + hashCode) * 31);
            }

            public String toString() {
                String str = this.readId;
                String str2 = this.voiceId;
                return f.n(f.s("VoiceChangerVoiceSelected(readId=", str, ", voiceId=", str2, ", previousVoiceId="), this.previousVoiceId, ", previousAudioType=", this.previousAudioType, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignClosed;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignClosed extends Event {
            public static final VoiceDesignClosed INSTANCE = new VoiceDesignClosed();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignClosed() {
                super("reader_voice_design_closed", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignClosed)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1787884117;
            }

            public String toString() {
                return "VoiceDesignClosed";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignGenerateError;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignGenerateError extends Event {
            public static final VoiceDesignGenerateError INSTANCE = new VoiceDesignGenerateError();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignGenerateError() {
                super("reader_voice_design_generate_error", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignGenerateError)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2037036170;
            }

            public String toString() {
                return "VoiceDesignGenerateError";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignGenerateSuccess;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignGenerateSuccess extends Event {
            public static final VoiceDesignGenerateSuccess INSTANCE = new VoiceDesignGenerateSuccess();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignGenerateSuccess() {
                super("reader_voice_design_generate_success", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignGenerateSuccess)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1301509627;
            }

            public String toString() {
                return "VoiceDesignGenerateSuccess";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignGenerateTapped;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignGenerateTapped extends Event {
            public static final VoiceDesignGenerateTapped INSTANCE = new VoiceDesignGenerateTapped();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignGenerateTapped() {
                super("reader_voice_design_generate_tapped", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignGenerateTapped)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -862709686;
            }

            public String toString() {
                return "VoiceDesignGenerateTapped";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignOpened;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignOpened extends Event {
            public static final VoiceDesignOpened INSTANCE = new VoiceDesignOpened();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignOpened() {
                super("reader_voice_design_opened", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignOpened)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2134825298;
            }

            public String toString() {
                return "VoiceDesignOpened";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignPreviewPlayTapped;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignPreviewPlayTapped extends Event {
            public static final VoiceDesignPreviewPlayTapped INSTANCE = new VoiceDesignPreviewPlayTapped();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignPreviewPlayTapped() {
                super("reader_voice_design_preview_play_tapped", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignPreviewPlayTapped)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 716702783;
            }

            public String toString() {
                return "VoiceDesignPreviewPlayTapped";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignPreviewSelected;", "Lio/elevenlabs/domain/Analytics$Event;", "previewIndex", "", "<init>", "(I)V", "getPreviewIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignPreviewSelected extends Event {
            private final int previewIndex;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public VoiceDesignPreviewSelected(int i10) {
                super("reader_voice_design_preview_selected", r0, null);
                Map singletonMap = Collections.singletonMap("preview_index", Integer.valueOf(i10));
                singletonMap.getClass();
                this.previewIndex = i10;
            }

            public static /* synthetic */ VoiceDesignPreviewSelected copy$default(VoiceDesignPreviewSelected voiceDesignPreviewSelected, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = voiceDesignPreviewSelected.previewIndex;
                }
                return voiceDesignPreviewSelected.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getPreviewIndex() {
                return this.previewIndex;
            }

            public final VoiceDesignPreviewSelected copy(int previewIndex) {
                return new VoiceDesignPreviewSelected(previewIndex);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof VoiceDesignPreviewSelected) && this.previewIndex == ((VoiceDesignPreviewSelected) other).previewIndex) {
                    return true;
                }
                return false;
            }

            public final int getPreviewIndex() {
                return this.previewIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.previewIndex);
            }

            public String toString() {
                return b.j(this.previewIndex, "VoiceDesignPreviewSelected(previewIndex=", Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignPreviewSwiped;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignPreviewSwiped extends Event {
            public static final VoiceDesignPreviewSwiped INSTANCE = new VoiceDesignPreviewSwiped();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignPreviewSwiped() {
                super("reader_voice_design_preview_swiped", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignPreviewSwiped)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 683034953;
            }

            public String toString() {
                return "VoiceDesignPreviewSwiped";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignSaveError;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignSaveError extends Event {
            public static final VoiceDesignSaveError INSTANCE = new VoiceDesignSaveError();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignSaveError() {
                super("reader_voice_design_save_error", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignSaveError)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1608474882;
            }

            public String toString() {
                return "VoiceDesignSaveError";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignSaveSuccess;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignSaveSuccess extends Event {
            public static final VoiceDesignSaveSuccess INSTANCE = new VoiceDesignSaveSuccess();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignSaveSuccess() {
                super("reader_voice_design_save_success", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignSaveSuccess)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -832046979;
            }

            public String toString() {
                return "VoiceDesignSaveSuccess";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignSaveTapped;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignSaveTapped extends Event {
            public static final VoiceDesignSaveTapped INSTANCE = new VoiceDesignSaveTapped();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignSaveTapped() {
                super("reader_voice_design_save_tapped", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignSaveTapped)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1263207726;
            }

            public String toString() {
                return "VoiceDesignSaveTapped";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignSuggestionTapped;", "Lio/elevenlabs/domain/Analytics$Event;", "suggestion", "", "<init>", "(Ljava/lang/String;)V", "getSuggestion", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignSuggestionTapped extends Event {
            private final String suggestion;

            public VoiceDesignSuggestionTapped(String str) {
                super("reader_voice_design_suggestion_tapped", i.l(str, "suggestion", str), null);
                this.suggestion = str;
            }

            public static /* synthetic */ VoiceDesignSuggestionTapped copy$default(VoiceDesignSuggestionTapped voiceDesignSuggestionTapped, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = voiceDesignSuggestionTapped.suggestion;
                }
                return voiceDesignSuggestionTapped.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSuggestion() {
                return this.suggestion;
            }

            public final VoiceDesignSuggestionTapped copy(String suggestion) {
                suggestion.getClass();
                return new VoiceDesignSuggestionTapped(suggestion);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof VoiceDesignSuggestionTapped) && m.c(this.suggestion, ((VoiceDesignSuggestionTapped) other).suggestion)) {
                    return true;
                }
                return false;
            }

            public final String getSuggestion() {
                return this.suggestion;
            }

            public int hashCode() {
                return this.suggestion.hashCode();
            }

            public String toString() {
                return f.C("VoiceDesignSuggestionTapped(suggestion=", this.suggestion, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoiceDesignTipsOpened;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoiceDesignTipsOpened extends Event {
            public static final VoiceDesignTipsOpened INSTANCE = new VoiceDesignTipsOpened();

            /* JADX WARN: Multi-variable type inference failed */
            private VoiceDesignTipsOpened() {
                super("reader_voice_design_tips_opened", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoiceDesignTipsOpened)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1195888086;
            }

            public String toString() {
                return "VoiceDesignTipsOpened";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoicesClickedPlayVoice;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoicesClickedPlayVoice extends Event {
            public static final VoicesClickedPlayVoice INSTANCE = new VoicesClickedPlayVoice();

            /* JADX WARN: Multi-variable type inference failed */
            private VoicesClickedPlayVoice() {
                super("reader_voices_clicked_play_voice", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoicesClickedPlayVoice)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1992353279;
            }

            public String toString() {
                return "VoicesClickedPlayVoice";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoicesClickedVoiceDetail;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoicesClickedVoiceDetail extends Event {
            public static final VoicesClickedVoiceDetail INSTANCE = new VoicesClickedVoiceDetail();

            /* JADX WARN: Multi-variable type inference failed */
            private VoicesClickedVoiceDetail() {
                super("reader_voices_clicked_voice_detail", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoicesClickedVoiceDetail)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1458703484;
            }

            public String toString() {
                return "VoicesClickedVoiceDetail";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$VoicesSetDefaultVoice;", "Lio/elevenlabs/domain/Analytics$Event;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class VoicesSetDefaultVoice extends Event {
            public static final VoicesSetDefaultVoice INSTANCE = new VoicesSetDefaultVoice();

            /* JADX WARN: Multi-variable type inference failed */
            private VoicesSetDefaultVoice() {
                super("reader_voices_set_default_voice", null, 2, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof VoicesSetDefaultVoice)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -887557141;
            }

            public String toString() {
                return "VoicesSetDefaultVoice";
            }
        }

        public /* synthetic */ Event(String str, Map map, int i10, kotlin.jvm.internal.f fVar) {
            this(str, (i10 & 2) != 0 ? null : map, null);
        }

        public final String getName() {
            return this.name;
        }

        public final Map<String, Object> getProperties() {
            return this.properties;
        }

        public Map<String, Object> getSetOncePersonProperties() {
            return null;
        }

        private Event(String str, Map<String, ? extends Object> map) {
            this.name = str;
            this.properties = map;
        }

        public /* synthetic */ Event(String str, Map map, kotlin.jvm.internal.f fVar) {
            this(str, map);
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$SharingClickedShare;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$ShareSource;", "type", "Lio/elevenlabs/domain/Analytics$Event$ShareType;", FirebaseAnalytics.Param.CONTENT, "Lio/elevenlabs/domain/Analytics$Event$ShareContent;", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$ShareSource;Lio/elevenlabs/domain/Analytics$Event$ShareType;Lio/elevenlabs/domain/Analytics$Event$ShareContent;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$ShareSource;", "getType", "()Lio/elevenlabs/domain/Analytics$Event$ShareType;", "getContent", "()Lio/elevenlabs/domain/Analytics$Event$ShareContent;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class SharingClickedShare extends Event {
            private final ShareContent content;
            private final ShareSource source;
            private final ShareType type;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public SharingClickedShare(ShareSource shareSource, ShareType shareType, ShareContent shareContent) {
                super("reader_sharing_clicked_share", a0.J(r1, r2, new k(FirebaseAnalytics.Param.CONTENT, r3)), r0);
                String str;
                shareSource.getClass();
                shareType.getClass();
                k kVar = new k("source", shareSource.getValue());
                k kVar2 = new k("type", shareType.getValue());
                kotlin.jvm.internal.f fVar = null;
                if (shareContent != null) {
                    str = shareContent.getValue();
                } else {
                    str = null;
                }
                this.source = shareSource;
                this.type = shareType;
                this.content = shareContent;
            }

            public static /* synthetic */ SharingClickedShare copy$default(SharingClickedShare sharingClickedShare, ShareSource shareSource, ShareType shareType, ShareContent shareContent, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    shareSource = sharingClickedShare.source;
                }
                if ((i10 & 2) != 0) {
                    shareType = sharingClickedShare.type;
                }
                if ((i10 & 4) != 0) {
                    shareContent = sharingClickedShare.content;
                }
                return sharingClickedShare.copy(shareSource, shareType, shareContent);
            }

            /* renamed from: component1, reason: from getter */
            public final ShareSource getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final ShareType getType() {
                return this.type;
            }

            /* renamed from: component3, reason: from getter */
            public final ShareContent getContent() {
                return this.content;
            }

            public final SharingClickedShare copy(ShareSource source, ShareType type, ShareContent content) {
                source.getClass();
                type.getClass();
                return new SharingClickedShare(source, type, content);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SharingClickedShare)) {
                    return false;
                }
                SharingClickedShare sharingClickedShare = (SharingClickedShare) other;
                if (this.source == sharingClickedShare.source && this.type == sharingClickedShare.type && this.content == sharingClickedShare.content) {
                    return true;
                }
                return false;
            }

            public final ShareContent getContent() {
                return this.content;
            }

            public final ShareSource getSource() {
                return this.source;
            }

            public final ShareType getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = (this.type.hashCode() + (this.source.hashCode() * 31)) * 31;
                ShareContent shareContent = this.content;
                if (shareContent == null) {
                    hashCode = 0;
                } else {
                    hashCode = shareContent.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return "SharingClickedShare(source=" + this.source + ", type=" + this.type + ", content=" + this.content + Separators.RPAREN;
            }

            public /* synthetic */ SharingClickedShare(ShareSource shareSource, ShareType shareType, ShareContent shareContent, int i10, kotlin.jvm.internal.f fVar) {
                this(shareSource, shareType, (i10 & 4) != 0 ? null : shareContent);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ClickedStartListening;", "Lio/elevenlabs/domain/Analytics$Event;", "type", "Lio/elevenlabs/domain/Analytics$Event$ClickedStartListening$Type;", "domain", "", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$ClickedStartListening$Type;Ljava/lang/String;)V", "getType", "()Lio/elevenlabs/domain/Analytics$Event$ClickedStartListening$Type;", "getDomain", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Type"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class ClickedStartListening extends Event {
            private final String domain;
            private final Type type;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$ClickedStartListening$Type;", "", "<init>", "(Ljava/lang/String;I)V", "File", "Text", "Website", "OCR", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Type {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type File = new Type("File", 0);
                public static final Type Text = new Type("Text", 1);
                public static final Type Website = new Type("Website", 2);
                public static final Type OCR = new Type("OCR", 3);

                private static final /* synthetic */ Type[] $values() {
                    return new Type[]{File, Text, Website, OCR};
                }

                static {
                    Type[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = c1.q($values);
                }

                private Type(String str, int i10) {
                }

                public static a getEntries() {
                    return $ENTRIES;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Type.values().length];
                    try {
                        iArr[Type.File.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Type.Text.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Type.Website.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Type.OCR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public ClickedStartListening(Type type, String str) {
                super("reader_clicked_start_listening", a0.J(new k("type", r0), new k("domain", str)), null);
                String str2;
                type.getClass();
                int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                str2 = "ocr";
                            } else {
                                c6.p();
                                throw null;
                            }
                        } else {
                            str2 = "website";
                        }
                    } else {
                        str2 = ParameterNames.TEXT;
                    }
                } else {
                    str2 = "file";
                }
                this.type = type;
                this.domain = str;
            }

            public static /* synthetic */ ClickedStartListening copy$default(ClickedStartListening clickedStartListening, Type type, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    type = clickedStartListening.type;
                }
                if ((i10 & 2) != 0) {
                    str = clickedStartListening.domain;
                }
                return clickedStartListening.copy(type, str);
            }

            /* renamed from: component1, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDomain() {
                return this.domain;
            }

            public final ClickedStartListening copy(Type type, String domain) {
                type.getClass();
                return new ClickedStartListening(type, domain);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClickedStartListening)) {
                    return false;
                }
                ClickedStartListening clickedStartListening = (ClickedStartListening) other;
                if (this.type == clickedStartListening.type && m.c(this.domain, clickedStartListening.domain)) {
                    return true;
                }
                return false;
            }

            public final String getDomain() {
                return this.domain;
            }

            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.type.hashCode() * 31;
                String str = this.domain;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return "ClickedStartListening(type=" + this.type + ", domain=" + this.domain + Separators.RPAREN;
            }

            public /* synthetic */ ClickedStartListening(Type type, String str, int i10, kotlin.jvm.internal.f fVar) {
                this(type, (i10 & 2) != 0 ? null : str);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerRemoveFromQueueClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "source", "Lio/elevenlabs/domain/Analytics$Event$PlayerRemoveFromQueueClicked$Source;", "readId", "", "collectionId", "relatedReadId", "<init>", "(Lio/elevenlabs/domain/Analytics$Event$PlayerRemoveFromQueueClicked$Source;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSource", "()Lio/elevenlabs/domain/Analytics$Event$PlayerRemoveFromQueueClicked$Source;", "getReadId", "()Ljava/lang/String;", "getCollectionId", "getRelatedReadId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Source", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class PlayerRemoveFromQueueClicked extends Event {
            private final String collectionId;
            private final String readId;
            private final String relatedReadId;
            private final Source source;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$PlayerRemoveFromQueueClicked$Source;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ReadDetailsMoreActions", "HomeLongClick", "LibrarySwipeAction", "PlayerQueue", "CollectionDetailsLongClick", "SearchResultsLongClick", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final class Source {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Source[] $VALUES;
                private final String value;
                public static final Source ReadDetailsMoreActions = new Source("ReadDetailsMoreActions", 0, "read_details_more_actions");
                public static final Source HomeLongClick = new Source("HomeLongClick", 1, "home_long_click");
                public static final Source LibrarySwipeAction = new Source("LibrarySwipeAction", 2, "library_swipe_action");
                public static final Source PlayerQueue = new Source("PlayerQueue", 3, "player_queue");
                public static final Source CollectionDetailsLongClick = new Source("CollectionDetailsLongClick", 4, "collection_details_long_click");
                public static final Source SearchResultsLongClick = new Source("SearchResultsLongClick", 5, "search_results_long_click");

                private static final /* synthetic */ Source[] $values() {
                    return new Source[]{ReadDetailsMoreActions, HomeLongClick, LibrarySwipeAction, PlayerQueue, CollectionDetailsLongClick, SearchResultsLongClick};
                }

                static {
                    Source[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = c1.q($values);
                }

                private Source(String str, int i10, String str2) {
                    this.value = str2;
                }

                public static a getEntries() {
                    return $ENTRIES;
                }

                public static Source valueOf(String str) {
                    return (Source) Enum.valueOf(Source.class, str);
                }

                public static Source[] values() {
                    return (Source[]) $VALUES.clone();
                }

                public final String getValue() {
                    return this.value;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PlayerRemoveFromQueueClicked(Source source, String str, String str2, String str3) {
                super("reader_player_remove_from_queue_clicked", a0.R(tn.n.F0(new k[]{r1, r0, r3, r4})), r2);
                k kVar;
                k kVar2;
                source.getClass();
                str.getClass();
                k kVar3 = new k("source", source.getValue());
                k kVar4 = new k("read_id", str);
                kotlin.jvm.internal.f fVar = null;
                if (str2 != null) {
                    kVar = new k("collection_id", str2);
                } else {
                    kVar = null;
                }
                if (str3 != null) {
                    kVar2 = new k("related_read_id", str3);
                } else {
                    kVar2 = null;
                }
                this.source = source;
                this.readId = str;
                this.collectionId = str2;
                this.relatedReadId = str3;
            }

            public static /* synthetic */ PlayerRemoveFromQueueClicked copy$default(PlayerRemoveFromQueueClicked playerRemoveFromQueueClicked, Source source, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    source = playerRemoveFromQueueClicked.source;
                }
                if ((i10 & 2) != 0) {
                    str = playerRemoveFromQueueClicked.readId;
                }
                if ((i10 & 4) != 0) {
                    str2 = playerRemoveFromQueueClicked.collectionId;
                }
                if ((i10 & 8) != 0) {
                    str3 = playerRemoveFromQueueClicked.relatedReadId;
                }
                return playerRemoveFromQueueClicked.copy(source, str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final Source getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCollectionId() {
                return this.collectionId;
            }

            /* renamed from: component4, reason: from getter */
            public final String getRelatedReadId() {
                return this.relatedReadId;
            }

            public final PlayerRemoveFromQueueClicked copy(Source source, String readId, String collectionId, String relatedReadId) {
                source.getClass();
                readId.getClass();
                return new PlayerRemoveFromQueueClicked(source, readId, collectionId, relatedReadId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PlayerRemoveFromQueueClicked)) {
                    return false;
                }
                PlayerRemoveFromQueueClicked playerRemoveFromQueueClicked = (PlayerRemoveFromQueueClicked) other;
                if (this.source == playerRemoveFromQueueClicked.source && m.c(this.readId, playerRemoveFromQueueClicked.readId) && m.c(this.collectionId, playerRemoveFromQueueClicked.collectionId) && m.c(this.relatedReadId, playerRemoveFromQueueClicked.relatedReadId)) {
                    return true;
                }
                return false;
            }

            public final String getCollectionId() {
                return this.collectionId;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getRelatedReadId() {
                return this.relatedReadId;
            }

            public final Source getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                int c5 = c.c(this.source.hashCode() * 31, 31, this.readId);
                String str = this.collectionId;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (c5 + hashCode) * 31;
                String str2 = this.relatedReadId;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return i11 + i10;
            }

            public String toString() {
                Source source = this.source;
                String str = this.readId;
                String str2 = this.collectionId;
                String str3 = this.relatedReadId;
                StringBuilder sb = new StringBuilder("PlayerRemoveFromQueueClicked(source=");
                sb.append(source);
                sb.append(", readId=");
                sb.append(str);
                sb.append(", collectionId=");
                return f.n(sb, str2, ", relatedReadId=", str3, Separators.RPAREN);
            }

            public /* synthetic */ PlayerRemoveFromQueueClicked(Source source, String str, String str2, String str3, int i10, kotlin.jvm.internal.f fVar) {
                this(source, str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OfflineActionClicked;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "action", "source", "chapterIndex", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getReadId", "()Ljava/lang/String;", "getAction", "getSource", "getChapterIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/elevenlabs/domain/Analytics$Event$OfflineActionClicked;", "equals", "", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OfflineActionClicked extends Event {
            private final String action;
            private final Integer chapterIndex;
            private final String readId;
            private final String source;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public OfflineActionClicked(String str, String str2, String str3, Integer num) {
                super("reader_offline_action_clicked", a0.R(tn.n.F0(new k[]{r0, r1, r2, r5})), r3);
                k kVar;
                str.getClass();
                str2.getClass();
                str3.getClass();
                k kVar2 = new k("read_id", str);
                k kVar3 = new k("action", str2);
                k kVar4 = new k("source", str3);
                kotlin.jvm.internal.f fVar = null;
                if (num != null) {
                    kVar = new k("chapter_index", Integer.valueOf(num.intValue()));
                } else {
                    kVar = null;
                }
                this.readId = str;
                this.action = str2;
                this.source = str3;
                this.chapterIndex = num;
            }

            public static /* synthetic */ OfflineActionClicked copy$default(OfflineActionClicked offlineActionClicked, String str, String str2, String str3, Integer num, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = offlineActionClicked.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = offlineActionClicked.action;
                }
                if ((i10 & 4) != 0) {
                    str3 = offlineActionClicked.source;
                }
                if ((i10 & 8) != 0) {
                    num = offlineActionClicked.chapterIndex;
                }
                return offlineActionClicked.copy(str, str2, str3, num);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getChapterIndex() {
                return this.chapterIndex;
            }

            public final OfflineActionClicked copy(String readId, String action, String source, Integer chapterIndex) {
                readId.getClass();
                action.getClass();
                source.getClass();
                return new OfflineActionClicked(readId, action, source, chapterIndex);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfflineActionClicked)) {
                    return false;
                }
                OfflineActionClicked offlineActionClicked = (OfflineActionClicked) other;
                if (m.c(this.readId, offlineActionClicked.readId) && m.c(this.action, offlineActionClicked.action) && m.c(this.source, offlineActionClicked.source) && m.c(this.chapterIndex, offlineActionClicked.chapterIndex)) {
                    return true;
                }
                return false;
            }

            public final String getAction() {
                return this.action;
            }

            public final Integer getChapterIndex() {
                return this.chapterIndex;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getSource() {
                return this.source;
            }

            public int hashCode() {
                int hashCode;
                int c5 = c.c(c.c(this.readId.hashCode() * 31, 31, this.action), 31, this.source);
                Integer num = this.chapterIndex;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                return c5 + hashCode;
            }

            public String toString() {
                String str = this.readId;
                String str2 = this.action;
                String str3 = this.source;
                Integer num = this.chapterIndex;
                StringBuilder s10 = f.s("OfflineActionClicked(readId=", str, ", action=", str2, ", source=");
                s10.append(str3);
                s10.append(", chapterIndex=");
                s10.append(num);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            public /* synthetic */ OfflineActionClicked(String str, String str2, String str3, Integer num, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, str3, (i10 & 8) != 0 ? null : num);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015JP\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020\tHÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015¨\u0006%"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadStarted;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "voiceId", "type", "allChapters", "", "chapterCount", "", "chapterIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "getType", "getAllChapters", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChapterCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChapterIndex", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadStarted;", "equals", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OfflineDownloadStarted extends Event {
            private final Boolean allChapters;
            private final Integer chapterCount;
            private final Integer chapterIndex;
            private final String readId;
            private final String type;
            private final String voiceId;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public OfflineDownloadStarted(String str, String str2, String str3, Boolean bool, Integer num, Integer num2) {
                super("reader_offline_download_started", a0.R(tn.n.F0(new k[]{r0, r1, r2, r3, r4, r5})), r6);
                k kVar;
                k kVar2;
                k kVar3;
                str.getClass();
                str2.getClass();
                str3.getClass();
                k kVar4 = new k("read_id", str);
                k kVar5 = new k("voice_id", str2);
                k kVar6 = new k("type", str3);
                kotlin.jvm.internal.f fVar = null;
                if (bool != null) {
                    kVar = new k("all_chapters", bool);
                } else {
                    kVar = null;
                }
                if (num != null) {
                    kVar2 = new k("chapter_count", Integer.valueOf(num.intValue()));
                } else {
                    kVar2 = null;
                }
                if (num2 != null) {
                    kVar3 = new k("chapter_index", Integer.valueOf(num2.intValue()));
                } else {
                    kVar3 = null;
                }
                this.readId = str;
                this.voiceId = str2;
                this.type = str3;
                this.allChapters = bool;
                this.chapterCount = num;
                this.chapterIndex = num2;
            }

            public static /* synthetic */ OfflineDownloadStarted copy$default(OfflineDownloadStarted offlineDownloadStarted, String str, String str2, String str3, Boolean bool, Integer num, Integer num2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = offlineDownloadStarted.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = offlineDownloadStarted.voiceId;
                }
                if ((i10 & 4) != 0) {
                    str3 = offlineDownloadStarted.type;
                }
                if ((i10 & 8) != 0) {
                    bool = offlineDownloadStarted.allChapters;
                }
                if ((i10 & 16) != 0) {
                    num = offlineDownloadStarted.chapterCount;
                }
                if ((i10 & 32) != 0) {
                    num2 = offlineDownloadStarted.chapterIndex;
                }
                Integer num3 = num;
                Integer num4 = num2;
                return offlineDownloadStarted.copy(str, str2, str3, bool, num3, num4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getAllChapters() {
                return this.allChapters;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getChapterCount() {
                return this.chapterCount;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getChapterIndex() {
                return this.chapterIndex;
            }

            public final OfflineDownloadStarted copy(String readId, String voiceId, String type, Boolean allChapters, Integer chapterCount, Integer chapterIndex) {
                readId.getClass();
                voiceId.getClass();
                type.getClass();
                return new OfflineDownloadStarted(readId, voiceId, type, allChapters, chapterCount, chapterIndex);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfflineDownloadStarted)) {
                    return false;
                }
                OfflineDownloadStarted offlineDownloadStarted = (OfflineDownloadStarted) other;
                if (m.c(this.readId, offlineDownloadStarted.readId) && m.c(this.voiceId, offlineDownloadStarted.voiceId) && m.c(this.type, offlineDownloadStarted.type) && m.c(this.allChapters, offlineDownloadStarted.allChapters) && m.c(this.chapterCount, offlineDownloadStarted.chapterCount) && m.c(this.chapterIndex, offlineDownloadStarted.chapterIndex)) {
                    return true;
                }
                return false;
            }

            public final Boolean getAllChapters() {
                return this.allChapters;
            }

            public final Integer getChapterCount() {
                return this.chapterCount;
            }

            public final Integer getChapterIndex() {
                return this.chapterIndex;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getType() {
                return this.type;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int c5 = c.c(c.c(this.readId.hashCode() * 31, 31, this.voiceId), 31, this.type);
                Boolean bool = this.allChapters;
                int i10 = 0;
                if (bool == null) {
                    hashCode = 0;
                } else {
                    hashCode = bool.hashCode();
                }
                int i11 = (c5 + hashCode) * 31;
                Integer num = this.chapterCount;
                if (num == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = num.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                Integer num2 = this.chapterIndex;
                if (num2 != null) {
                    i10 = num2.hashCode();
                }
                return i12 + i10;
            }

            public String toString() {
                String str = this.readId;
                String str2 = this.voiceId;
                String str3 = this.type;
                Boolean bool = this.allChapters;
                Integer num = this.chapterCount;
                Integer num2 = this.chapterIndex;
                StringBuilder s10 = f.s("OfflineDownloadStarted(readId=", str, ", voiceId=", str2, ", type=");
                s10.append(str3);
                s10.append(", allChapters=");
                s10.append(bool);
                s10.append(", chapterCount=");
                s10.append(num);
                s10.append(", chapterIndex=");
                s10.append(num2);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            public /* synthetic */ OfflineDownloadStarted(String str, String str2, String str3, Boolean bool, Integer num, Integer num2, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, str3, (i10 & 8) != 0 ? null : bool, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : num2);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JZ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadFinished;", "Lio/elevenlabs/domain/Analytics$Event;", "readId", "", "voiceId", "status", "type", "errorType", "errorMessage", "durationSeconds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getReadId", "()Ljava/lang/String;", "getVoiceId", "getStatus", "getType", "getErrorType", "getErrorMessage", "getDurationSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lio/elevenlabs/domain/Analytics$Event$OfflineDownloadFinished;", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class OfflineDownloadFinished extends Event {
            private final Double durationSeconds;
            private final String errorMessage;
            private final String errorType;
            private final String readId;
            private final String status;
            private final String type;
            private final String voiceId;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public OfflineDownloadFinished(String str, String str2, String str3, String str4, String str5, String str6, Double d10) {
                super("reader_offline_download_finished", a0.R(tn.n.F0(new k[]{r8, r9, r10, r11, r12, r13, r14})), null);
                k kVar;
                k kVar2;
                k kVar3;
                str.getClass();
                str2.getClass();
                str3.getClass();
                str4.getClass();
                k kVar4 = new k("read_id", str);
                k kVar5 = new k("voice_id", str2);
                k kVar6 = new k("status", str3);
                k kVar7 = new k("type", str4);
                if (str5 != null) {
                    kVar = new k("error_type", str5);
                } else {
                    kVar = null;
                }
                if (str6 != null) {
                    kVar2 = new k(DiagnosticsTracker.ERROR_MESSAGE_KEY, str6);
                } else {
                    kVar2 = null;
                }
                if (d10 != null) {
                    kVar3 = new k("duration_seconds", Double.valueOf(d10.doubleValue()));
                    kVar4 = kVar4;
                } else {
                    kVar3 = null;
                }
                this.readId = str;
                this.voiceId = str2;
                this.status = str3;
                this.type = str4;
                this.errorType = str5;
                this.errorMessage = str6;
                this.durationSeconds = d10;
            }

            public static /* synthetic */ OfflineDownloadFinished copy$default(OfflineDownloadFinished offlineDownloadFinished, String str, String str2, String str3, String str4, String str5, String str6, Double d10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = offlineDownloadFinished.readId;
                }
                if ((i10 & 2) != 0) {
                    str2 = offlineDownloadFinished.voiceId;
                }
                if ((i10 & 4) != 0) {
                    str3 = offlineDownloadFinished.status;
                }
                if ((i10 & 8) != 0) {
                    str4 = offlineDownloadFinished.type;
                }
                if ((i10 & 16) != 0) {
                    str5 = offlineDownloadFinished.errorType;
                }
                if ((i10 & 32) != 0) {
                    str6 = offlineDownloadFinished.errorMessage;
                }
                if ((i10 & 64) != 0) {
                    d10 = offlineDownloadFinished.durationSeconds;
                }
                String str7 = str6;
                Double d11 = d10;
                String str8 = str5;
                String str9 = str3;
                return offlineDownloadFinished.copy(str, str2, str9, str4, str8, str7, d11);
            }

            /* renamed from: component1, reason: from getter */
            public final String getReadId() {
                return this.readId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getVoiceId() {
                return this.voiceId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getStatus() {
                return this.status;
            }

            /* renamed from: component4, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* renamed from: component5, reason: from getter */
            public final String getErrorType() {
                return this.errorType;
            }

            /* renamed from: component6, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component7, reason: from getter */
            public final Double getDurationSeconds() {
                return this.durationSeconds;
            }

            public final OfflineDownloadFinished copy(String readId, String voiceId, String status, String type, String errorType, String errorMessage, Double durationSeconds) {
                readId.getClass();
                voiceId.getClass();
                status.getClass();
                type.getClass();
                return new OfflineDownloadFinished(readId, voiceId, status, type, errorType, errorMessage, durationSeconds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OfflineDownloadFinished)) {
                    return false;
                }
                OfflineDownloadFinished offlineDownloadFinished = (OfflineDownloadFinished) other;
                if (m.c(this.readId, offlineDownloadFinished.readId) && m.c(this.voiceId, offlineDownloadFinished.voiceId) && m.c(this.status, offlineDownloadFinished.status) && m.c(this.type, offlineDownloadFinished.type) && m.c(this.errorType, offlineDownloadFinished.errorType) && m.c(this.errorMessage, offlineDownloadFinished.errorMessage) && m.c(this.durationSeconds, offlineDownloadFinished.durationSeconds)) {
                    return true;
                }
                return false;
            }

            public final Double getDurationSeconds() {
                return this.durationSeconds;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final String getErrorType() {
                return this.errorType;
            }

            public final String getReadId() {
                return this.readId;
            }

            public final String getStatus() {
                return this.status;
            }

            public final String getType() {
                return this.type;
            }

            public final String getVoiceId() {
                return this.voiceId;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int c5 = c.c(c.c(c.c(this.readId.hashCode() * 31, 31, this.voiceId), 31, this.status), 31, this.type);
                String str = this.errorType;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = (c5 + hashCode) * 31;
                String str2 = this.errorMessage;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                Double d10 = this.durationSeconds;
                if (d10 != null) {
                    i10 = d10.hashCode();
                }
                return i12 + i10;
            }

            public String toString() {
                String str = this.readId;
                String str2 = this.voiceId;
                String str3 = this.status;
                String str4 = this.type;
                String str5 = this.errorType;
                String str6 = this.errorMessage;
                Double d10 = this.durationSeconds;
                StringBuilder s10 = f.s("OfflineDownloadFinished(readId=", str, ", voiceId=", str2, ", status=");
                f.x(s10, str3, ", type=", str4, ", errorType=");
                f.x(s10, str5, ", errorMessage=", str6, ", durationSeconds=");
                s10.append(d10);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }

            public /* synthetic */ OfflineDownloadFinished(String str, String str2, String str3, String str4, String str5, String str6, Double d10, int i10, kotlin.jvm.internal.f fVar) {
                this(str, str2, str3, str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : d10);
            }
        }
    }
}
