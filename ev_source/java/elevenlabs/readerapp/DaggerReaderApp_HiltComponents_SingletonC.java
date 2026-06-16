package io.elevenlabs.readerapp;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.x;
import androidx.lifecycle.b0;
import androidx.lifecycle.z0;
import androidx.room.c0;
import androidx.room.m0;
import com.google.android.gms.common.api.internal.i1;
import com.google.firebase.auth.FirebaseAuth;
import com.revenuecat.purchases.utils.EventsFileHelper;
import d8.v;
import fr.d0;
import g8.s1;
import gh.b2;
import gh.d2;
import gh.o0;
import gh.t;
import gh.w0;
import io.elevenlabs.analytics.AnalyticsModule_Companion_ProvideCertificateMismatchReporterFactory;
import io.elevenlabs.analytics.FirebaseAnalyticsService;
import io.elevenlabs.analytics.PostHogAnalytics;
import io.elevenlabs.analytics.PostHogFeatureFlagService;
import io.elevenlabs.analytics.SingularServiceImpl;
import io.elevenlabs.data.api.AccountAPI;
import io.elevenlabs.data.api.AssistantAPI;
import io.elevenlabs.data.api.AuthorApi;
import io.elevenlabs.data.api.CollectionsAPI;
import io.elevenlabs.data.api.CommunityVoicesApi;
import io.elevenlabs.data.api.ConfigAPI;
import io.elevenlabs.data.api.ConsumptionAPI;
import io.elevenlabs.data.api.CustomerAPI;
import io.elevenlabs.data.api.DrmAPI;
import io.elevenlabs.data.api.ExploreCollectionsAPI;
import io.elevenlabs.data.api.ExploreVoiceCollectionsApi;
import io.elevenlabs.data.api.ExploreVoicesApi;
import io.elevenlabs.data.api.FavoriteVoicesApi;
import io.elevenlabs.data.api.GooglePlayAPI;
import io.elevenlabs.data.api.HomeAPI;
import io.elevenlabs.data.api.InterestsAPI;
import io.elevenlabs.data.api.MediaAPI;
import io.elevenlabs.data.api.MessagesAPI;
import io.elevenlabs.data.api.NotificationsApi;
import io.elevenlabs.data.api.OnboardingAPI;
import io.elevenlabs.data.api.PasswordResetAPI;
import io.elevenlabs.data.api.ProductsAPI;
import io.elevenlabs.data.api.PronunciationsAPI;
import io.elevenlabs.data.api.ReadBookmarksAPI;
import io.elevenlabs.data.api.ReadBookmarksVideoAPI;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.api.ReadsDownloadAPI;
import io.elevenlabs.data.api.ReadsExploreSearchAPI;
import io.elevenlabs.data.api.ReadsStreamingAPI;
import io.elevenlabs.data.api.ReadsUploadAPI;
import io.elevenlabs.data.api.RecentVoicesApi;
import io.elevenlabs.data.api.ReferralAPI;
import io.elevenlabs.data.api.SignUpAPI;
import io.elevenlabs.data.api.SoundscapesAPI;
import io.elevenlabs.data.api.StreamingAPI;
import io.elevenlabs.data.api.SupportAgentAPI;
import io.elevenlabs.data.api.VoiceDesignAPI;
import io.elevenlabs.data.api.VoicesAPI;
import io.elevenlabs.data.api.adapter.ResultCallAdapterFactory;
import io.elevenlabs.data.cache.ConcurrentHashMapMemoryCache;
import io.elevenlabs.data.database.entities.bookmarks.BookmarksDao;
import io.elevenlabs.data.database.entities.collections.CollectionsDao;
import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.data.services.AdAttributionServiceImpl;
import io.elevenlabs.data.services.AndroidFileService;
import io.elevenlabs.data.services.AndroidLocaleService;
import io.elevenlabs.data.services.AndroidVibrationService;
import io.elevenlabs.data.services.AppCompatibilityDialogServiceImpl;
import io.elevenlabs.data.services.AssistantPreferencesServiceImpl;
import io.elevenlabs.data.services.AssistantServiceImpl;
import io.elevenlabs.data.services.AuthorServiceImpl;
import io.elevenlabs.data.services.CharacterReportingServiceImpl;
import io.elevenlabs.data.services.CollectionsServiceImpl;
import io.elevenlabs.data.services.CommunityVoicesServiceImpl;
import io.elevenlabs.data.services.ConsumptionRepository;
import io.elevenlabs.data.services.CustomerServiceImpl;
import io.elevenlabs.data.services.DrmServiceImpl;
import io.elevenlabs.data.services.ExploreCollectionsServiceImpl;
import io.elevenlabs.data.services.ExploreVoicesServiceImpl;
import io.elevenlabs.data.services.FavoriteVoicesServiceImpl;
import io.elevenlabs.data.services.FirebaseAppCheckTokenService;
import io.elevenlabs.data.services.FirebaseAuthService;
import io.elevenlabs.data.services.FirebaseAuthTokenService;
import io.elevenlabs.data.services.HomeServiceImpl;
import io.elevenlabs.data.services.InterestsServiceImpl;
import io.elevenlabs.data.services.LocalAppRatingService;
import io.elevenlabs.data.services.MediaManifestServiceImpl;
import io.elevenlabs.data.services.MfaServiceImpl;
import io.elevenlabs.data.services.NotificationPermissionServiceImpl;
import io.elevenlabs.data.services.NotificationServiceImpl;
import io.elevenlabs.data.services.OfflineReadsServiceImpl;
import io.elevenlabs.data.services.OnboardingServiceImpl;
import io.elevenlabs.data.services.PasswordValidatorServiceImpl;
import io.elevenlabs.data.services.PersistentPlayerQueueServiceImpl;
import io.elevenlabs.data.services.PlayerPagerTeaserServiceImpl;
import io.elevenlabs.data.services.PlayerPreferencesServiceImpl;
import io.elevenlabs.data.services.PlayerSeekMediator;
import io.elevenlabs.data.services.PlayerVisibilityServiceImpl;
import io.elevenlabs.data.services.PronunciationsServiceImpl;
import io.elevenlabs.data.services.ReadBookmarkServiceImpl;
import io.elevenlabs.data.services.ReadMetadataSaverImpl;
import io.elevenlabs.data.services.ReadsExploreServiceImpl;
import io.elevenlabs.data.services.ReadsServiceImpl;
import io.elevenlabs.data.services.ReadsStreamingService;
import io.elevenlabs.data.services.RecentVoicesServiceImpl;
import io.elevenlabs.data.services.ReferralServiceImpl;
import io.elevenlabs.data.services.RestAccountService;
import io.elevenlabs.data.services.RestAppConfigService;
import io.elevenlabs.data.services.RestGooglePlayService;
import io.elevenlabs.data.services.RestMessagesService;
import io.elevenlabs.data.services.RestPasswordResetService;
import io.elevenlabs.data.services.RestProductsService;
import io.elevenlabs.data.services.RestSignUpService;
import io.elevenlabs.data.services.RestUserConfigService;
import io.elevenlabs.data.services.RuntimePermissionsServiceImpl;
import io.elevenlabs.data.services.SharedPrefsDeviceUuidService;
import io.elevenlabs.data.services.SoundscapeDownloader;
import io.elevenlabs.data.services.SoundscapesServiceImpl;
import io.elevenlabs.data.services.SupportAgentServiceImpl;
import io.elevenlabs.data.services.VoiceDesignServiceImpl;
import io.elevenlabs.data.services.VoicesServiceImpl;
import io.elevenlabs.data.services.WhatsNewServiceImpl;
import io.elevenlabs.data.services.optimized.ChapterContentMemoryCache;
import io.elevenlabs.data.services.optimized.OptimizedReadCache;
import io.elevenlabs.data.services.optimized.OptimizedReadSplitter;
import io.elevenlabs.data.usecase.CurrentTimeMillisUseCaseImpl;
import io.elevenlabs.data.usecase.firebase.DetermineMfaTypeUseCaseImpl;
import io.elevenlabs.data.usecase.firebase.ResolveMultiFactorAuthUseCaseImpl;
import io.elevenlabs.data.usecase.firebase.ResolveTotpMfaUseCaseImpl;
import io.elevenlabs.data.usecase.firebase.VerifyPhoneNumberForMfaUseCaseImpl;
import io.elevenlabs.data.worker.OfflineDrmLicenseHelper;
import io.elevenlabs.data.worker.OfflineMediaDownloader;
import io.elevenlabs.data.worker.OfflineReadsDownloader;
import io.elevenlabs.di.AppDatabase;
import io.elevenlabs.di.DatabaseModule_ProvideBookmarksDaoFactory;
import io.elevenlabs.di.DatabaseModule_ProvideCollectionsDaoFactory;
import io.elevenlabs.di.DatabaseModule_ProvideConsumptionSpanDaoFactory;
import io.elevenlabs.di.DatabaseModule_ProvideDatabaseBuilderFactory;
import io.elevenlabs.di.DatabaseModule_ProvideDatabaseFactory;
import io.elevenlabs.di.DatabaseModule_ProvideOfflineReadsDaoFactory;
import io.elevenlabs.di.DatabaseModule_ProvidePersistentPlayerQueueDaoFactory;
import io.elevenlabs.di.DatabaseModule_ProvideReadsDaoFactory;
import io.elevenlabs.di.DatabaseModule_ProvideRecentVoicesDaoFactory;
import io.elevenlabs.di.DatabaseModule_ProvideVoicesDaoFactory;
import io.elevenlabs.di.LifecycleModule_ProvideProcessLifecycleFactory;
import io.elevenlabs.di.NetworkModule_AccountApiFactory;
import io.elevenlabs.di.NetworkModule_AssistantApiFactory;
import io.elevenlabs.di.NetworkModule_AuthorApiFactory;
import io.elevenlabs.di.NetworkModule_CacheFactory;
import io.elevenlabs.di.NetworkModule_CollectionsApiFactory;
import io.elevenlabs.di.NetworkModule_CommunityVoicesApiFactory;
import io.elevenlabs.di.NetworkModule_ConfigApiFactory;
import io.elevenlabs.di.NetworkModule_ConsumptionApiFactory;
import io.elevenlabs.di.NetworkModule_CustomerApiFactory;
import io.elevenlabs.di.NetworkModule_DeleteAccountApiFactory;
import io.elevenlabs.di.NetworkModule_DrmApiFactory;
import io.elevenlabs.di.NetworkModule_ExploreCollectionsApiFactory;
import io.elevenlabs.di.NetworkModule_ExploreVoiceCollectionsApiFactory;
import io.elevenlabs.di.NetworkModule_ExploreVoicesApiFactory;
import io.elevenlabs.di.NetworkModule_FavoriteVoicesApiFactory;
import io.elevenlabs.di.NetworkModule_GooglePlayApiFactory;
import io.elevenlabs.di.NetworkModule_HomeApiFactory;
import io.elevenlabs.di.NetworkModule_InterestsApiFactory;
import io.elevenlabs.di.NetworkModule_MediaApiFactory;
import io.elevenlabs.di.NetworkModule_MessagesApiFactory;
import io.elevenlabs.di.NetworkModule_NotificationsApiFactory;
import io.elevenlabs.di.NetworkModule_OnboardingApiFactory;
import io.elevenlabs.di.NetworkModule_PasswordResetApiFactory;
import io.elevenlabs.di.NetworkModule_ProductsApiFactory;
import io.elevenlabs.di.NetworkModule_PronunciationApiFactory;
import io.elevenlabs.di.NetworkModule_ProvideDownloadOkHttpClientFactory;
import io.elevenlabs.di.NetworkModule_ProvideDownloadRetrofitFactory;
import io.elevenlabs.di.NetworkModule_ProvideJsonSerializerFactory;
import io.elevenlabs.di.NetworkModule_ProvideOkHttpClientFactory;
import io.elevenlabs.di.NetworkModule_ProvideRetrofitFactory;
import io.elevenlabs.di.NetworkModule_ProvideUploadRetrofitFactory;
import io.elevenlabs.di.NetworkModule_ReadBookmarksApiFactory;
import io.elevenlabs.di.NetworkModule_ReadBookmarksVideoApiFactory;
import io.elevenlabs.di.NetworkModule_ReadsApiFactory;
import io.elevenlabs.di.NetworkModule_ReadsDownloadApiFactory;
import io.elevenlabs.di.NetworkModule_ReadsExploreSearchApiFactory;
import io.elevenlabs.di.NetworkModule_ReadsUploadApiFactory;
import io.elevenlabs.di.NetworkModule_RecentVoicesApiFactory;
import io.elevenlabs.di.NetworkModule_ReferralApiFactory;
import io.elevenlabs.di.NetworkModule_SignUpApiFactory;
import io.elevenlabs.di.NetworkModule_SoundscapesApiFactory;
import io.elevenlabs.di.NetworkModule_StreamingApiFactory;
import io.elevenlabs.di.NetworkModule_SupportAgentApiFactory;
import io.elevenlabs.di.NetworkModule_VoiceDesignApiFactory;
import io.elevenlabs.di.NetworkModule_VoicesApiFactory;
import io.elevenlabs.di.PreferencesModule_GlobalSharedPreferencesFactory;
import io.elevenlabs.di.PreferencesModule_UserSharedPreferencesFactory;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.CertificateMismatchReporter;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.services.AdAttributionService;
import io.elevenlabs.domain.services.AgentContextService;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.AppCompatibilityDialogService;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.AuthTokenService;
import io.elevenlabs.domain.services.CharacterReportingService;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ConsumptionTrackingService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.DeviceUuidService;
import io.elevenlabs.domain.services.DrmService;
import io.elevenlabs.domain.services.FavoriteVoicesService;
import io.elevenlabs.domain.services.FeatureFlagService;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.MediaManifestService;
import io.elevenlabs.domain.services.MfaService;
import io.elevenlabs.domain.services.NavigationService;
import io.elevenlabs.domain.services.NotificationPermissionService;
import io.elevenlabs.domain.services.NotificationService;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.OnboardingService;
import io.elevenlabs.domain.services.PlayerPreferencesService;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.domain.services.RuntimePermissionsService;
import io.elevenlabs.domain.services.SignUpService;
import io.elevenlabs.domain.services.SingularService;
import io.elevenlabs.domain.services.SoundscapesService;
import io.elevenlabs.domain.services.StoreCountryCodeRecordingService;
import io.elevenlabs.domain.services.StreamingService;
import io.elevenlabs.domain.services.SupportToolEvents;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.services.VibrationService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.domain.services.player.PlayerSeekEmitter;
import io.elevenlabs.domain.services.player.PlayerSeekObserver;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.DevicePerformanceMeasurer;
import io.elevenlabs.domain.usecase.IsAudioBookmarksAllowedUseCase;
import io.elevenlabs.domain.usecase.IsScreenRecordingAllowedUseCase;
import io.elevenlabs.domain.usecase.MediaAudioPositionResolver;
import io.elevenlabs.domain.usecase.PurchaseAndRefreshCreditsUseCase;
import io.elevenlabs.ocr.OcrImportViewModel;
import io.elevenlabs.ocr.OcrImportViewModel_HiltModules;
import io.elevenlabs.ocr.OcrImportViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.ocr.OcrImportViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.ocr.usecase.RecognizeDocumentTextUseCase;
import io.elevenlabs.payments.InAppPurchasesService;
import io.elevenlabs.payments.StoreCountryCodeRecordingServiceImpl;
import io.elevenlabs.payments.di.PaymentsModule_ProvideProductsServiceFactory;
import io.elevenlabs.payments.di.PaymentsModule_ProvideRevenueCatPaymentsFactory;
import io.elevenlabs.payments.di.PaymentsModule_ProvideStoreCountryCodeRecordingServiceFactory;
import io.elevenlabs.player.AssistantSessionManager;
import io.elevenlabs.player.AssistantTriggerEmitter;
import io.elevenlabs.player.BackgroundPlayerControllerService;
import io.elevenlabs.player.BackgroundPlayerService;
import io.elevenlabs.player.BackgroundPlayerService_MembersInjector;
import io.elevenlabs.player.CreateBookmarkFromOffsetUseCase;
import io.elevenlabs.player.PlayerErrorHandler;
import io.elevenlabs.player.TriggerAssistantFromMediaButtonUseCase;
import io.elevenlabs.player.audio.LoopingAudioPlayer;
import io.elevenlabs.player.di.DrmNetworkModule_ProvideDrmOkHttpClientFactory;
import io.elevenlabs.player.di.MediaCacheModule_ProvideSimpleCacheFactory;
import io.elevenlabs.player.di.PlayerServiceModule_ProvideDefaultLoadControlFactory;
import io.elevenlabs.player.di.PlayerServiceModule_ProvideDrmSessionManagerProviderFactory;
import io.elevenlabs.player.di.PlayerServiceModule_ProvideMediaSourceFactoryFactory;
import io.elevenlabs.player.di.PlayerServiceModule_ProvidePlayerFactory;
import io.elevenlabs.player.di.PlayerServiceModule_ProvideRenderersFactoryFactory;
import io.elevenlabs.player.drm.AxinomDrmProvider;
import io.elevenlabs.player.media.DynamicLoadControl;
import io.elevenlabs.player.media.HlsMediaDataSource;
import io.elevenlabs.player.media.MediaItemCreator;
import io.elevenlabs.player.media.MediaMp3ChunkDurationExtractor;
import io.elevenlabs.player.media.ReadsDataSource;
import io.elevenlabs.player.tools.SupportClientToolsFactory;
import io.elevenlabs.player.tools.SupportToolEventsImpl;
import io.elevenlabs.readerapp.AppCompatibilityViewModel_HiltModules;
import io.elevenlabs.readerapp.LowDiskSpaceViewModel_HiltModules;
import io.elevenlabs.readerapp.ReaderApp_HiltComponents;
import io.elevenlabs.readerapp.core.ConfigViewModel;
import io.elevenlabs.readerapp.core.ConfigViewModel_HiltModules;
import io.elevenlabs.readerapp.core.ConfigViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.core.ConfigViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.core.CrashlyticsLogger;
import io.elevenlabs.readerapp.core.NotificationViewModel;
import io.elevenlabs.readerapp.core.NotificationViewModel_HiltModules;
import io.elevenlabs.readerapp.core.NotificationViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.core.NotificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.core.SurveyViewModel;
import io.elevenlabs.readerapp.core.SurveyViewModel_HiltModules;
import io.elevenlabs.readerapp.core.SurveyViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.core.SurveyViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.core.ToastViewModel;
import io.elevenlabs.readerapp.core.ToastViewModel_HiltModules;
import io.elevenlabs.readerapp.core.ToastViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.core.ToastViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.core.router.RouterViewModel;
import io.elevenlabs.readerapp.core.router.RouterViewModel_HiltModules;
import io.elevenlabs.readerapp.core.router.RouterViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.core.router.RouterViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.di.ActivityRetainedCoroutinesModule_ActivityRetainedCoroutineScopeFactory;
import io.elevenlabs.readerapp.di.AnonCaptchaModule_Companion_ProvidesAnonCaptchaSiteKeyFactory;
import io.elevenlabs.readerapp.di.ConfigModule_ConfigurationFactory;
import io.elevenlabs.readerapp.di.ConfigModule_PlayerConfigurationFactory;
import io.elevenlabs.readerapp.di.CoroutinesModule_ApplicationCoroutineScopeFactory;
import io.elevenlabs.readerapp.di.CoroutinesModule_DispatcherFactoryFactory;
import io.elevenlabs.readerapp.di.CurrentActivityProviderImpl;
import io.elevenlabs.readerapp.di.FirebaseModule_FirebaseAuthFactory;
import io.elevenlabs.readerapp.services.AgentContextServiceImpl;
import io.elevenlabs.readerapp.services.AndroidConnectivityService;
import io.elevenlabs.readerapp.services.AndroidStringProvider;
import io.elevenlabs.readerapp.services.MediaAudioPreviewService;
import io.elevenlabs.readerapp.services.NavigationDispatcherProvider;
import io.elevenlabs.readerapp.services.NavigationServiceImpl;
import io.elevenlabs.readerapp.services.NotificationRetrievalService;
import io.elevenlabs.readerapp.services.NotificationRetrievalService_MembersInjector;
import io.elevenlabs.readerapp.services.ToastServiceImpl;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthViewModel;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.MfaVerificationViewModel;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.MfaVerificationViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.MfaVerificationViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.MfaVerificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify.VerifyEmailViewModel;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify.VerifyEmailViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify.VerifyEmailViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify.VerifyEmailViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.DownloadsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.FollowedSeriesViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.NotificationPrimerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.NotificationPrimerViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.NotificationPrimerViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.NotificationPrimerViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ContentPreferencesViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManagePurchasesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManagePurchasesViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManagePurchasesViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.ManagePurchasesViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.ExploreLanguageSettingScreenViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.AskAgentViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.AskAssistantViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDetailsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDetailsViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkShareDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.BookmarkViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.EditBookmarkViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.EditCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.EditCollectionViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.EditCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.EditCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.ExploreViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.elements.DailyStreakSettingsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.HomeViewModelV3_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.HomeViewModelV4_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ContentSearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.ReadBookmarksViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.SleepTimerViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel_HiltModules_BindsModule_Bind_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionRoute;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel_HiltModules_BindsModule_Bind_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created.VoicePickerCreatedViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreStateMapper;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel_HiltModules_BindsModule_Bind_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListStateMapper;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedRepository;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookPurchasesViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.BookRefundViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.ReferFriendViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.UseFriendReferralViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.HoursHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.AddSharedReadViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.GenFMLoadingViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveyViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveyViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveyViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportContentBrowserSurveyViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportFileViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ImportLinkViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.PasteLinkViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.PasteLinkViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.PasteLinkViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.PasteLinkViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.RateTitleViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadLinkShareViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareOptionsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareOptionsViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareOptionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareOptionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.WriteViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.report.ReportProblemViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.VoiceDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignAudioStorage;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel_HiltModules;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import io.elevenlabs.readerapp.usecase.AnonCaptchaTokenServiceImpl;
import io.elevenlabs.readerapp.usecase.CurrentActivityProvider;
import io.elevenlabs.readerapp.usecase.DevicePerformanceMeasurerImpl;
import io.elevenlabs.readerapp.usecase.DownloadReadUseCaseImpl;
import io.elevenlabs.readerapp.usecase.GetBookmarkWindowUseCase;
import io.elevenlabs.readerapp.usecase.GetCharacterOffsetsFromHtmlRowUseCase;
import io.elevenlabs.readerapp.usecase.GetCurrentTimeUseCaseImpl;
import io.elevenlabs.readerapp.usecase.GetTextFromHtmlRowUseCase;
import io.elevenlabs.readerapp.usecase.PlayPronunciationPreviewUseCaseImpl;
import io.elevenlabs.readerapp.usecase.RateAppUseCase;
import io.elevenlabs.readerapp.usecase.ResolveErrorMessageUseCaseImpl;
import io.elevenlabs.readerapp.usecase.ShowImportingContentToast;
import j8.s;
import java.util.Map;
import java.util.Set;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import r8.g0;
import w7.h1;
import w7.n;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DaggerReaderApp_HiltComponents_SingletonC {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ActivityCImpl extends ReaderApp_HiltComponents.ActivityC {
        private final ActivityCImpl activityCImpl = this;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        public ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, Activity activity) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        private MainActivity injectMainActivity2(MainActivity mainActivity) {
            MainActivity_MembersInjector.injectConfiguration(mainActivity, (Configuration) this.singletonCImpl.configurationProvider.get());
            MainActivity_MembersInjector.injectAnalytics(mainActivity, (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
            MainActivity_MembersInjector.injectLogger(mainActivity, (Logger) this.singletonCImpl.loggerProvider.get());
            MainActivity_MembersInjector.injectRateAppUseCase(mainActivity, rateAppUseCase());
            MainActivity_MembersInjector.injectSingularService(mainActivity, (SingularService) this.singletonCImpl.singularServiceImplProvider.get());
            MainActivity_MembersInjector.injectStoreCountryCodeRecordingService(mainActivity, (StoreCountryCodeRecordingService) this.singletonCImpl.provideStoreCountryCodeRecordingServiceProvider.get());
            MainActivity_MembersInjector.injectNavigationDispatcherProvider(mainActivity, (NavigationDispatcherProvider) this.singletonCImpl.navigationDispatcherProvider.get());
            MainActivity_MembersInjector.injectConnectivityService(mainActivity, (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get());
            return mainActivity;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ActivityC
        public ol.c fragmentComponentBuilder() {
            return new FragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, 0);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ActivityC, pl.a
        public pl.b getHiltInternalFactoryFactory() {
            return new pl.b(getViewModelKeys(), new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl, 0));
        }

        @Override // pl.d
        public ol.f getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl, 0);
        }

        @Override // pl.d
        public Map<Class<?>, Boolean> getViewModelKeys() {
            return new ul.e(keySetMapOfClassOfAndBooleanBuilder());
        }

        @Override // io.elevenlabs.readerapp.MainActivity_GeneratedInjector
        public void injectMainActivity(MainActivity mainActivity) {
            injectMainActivity2(mainActivity);
        }

        public o0 keySetMapOfClassOfAndBooleanBuilder() {
            t.e(80, "expectedSize");
            i1 i1Var = new i1(80);
            i1Var.x(AccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AccountViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(AddReadToCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AddReadToCollectionViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(AddReadsToCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AddReadsToCollectionViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(AddSharedReadViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AddSharedReadViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(AppCompatibilityViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AppCompatibilityViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(AskAgentViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AskAgentViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(AskAssistantViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AskAssistantViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(AuthViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AuthViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(AuthorProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(AuthorProfileViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(BookPurchasesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(BookPurchasesViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(BookRefundViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(BookRefundViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(BookmarkShareDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(BookmarkShareDetailsViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(BookmarkViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(BookmarkViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(CollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(CollectionViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ConfigViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ConfigViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ContentPreferencesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ContentPreferencesViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ContentSearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ContentSearchViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(CreateCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(CreateCollectionViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(DailyStreakSettingsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(DailyStreakSettingsViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(DeleteAccountViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(DeleteAccountViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(DownloadsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(DownloadsViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(EditBookmarkViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(EditBookmarkViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(EditCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(EditCollectionViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ExploreCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ExploreCollectionViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ExploreLanguageSettingScreenViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ExploreLanguageSettingScreenViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ExploreViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ExploreViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(FollowedSeriesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(FollowedSeriesViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(GenFMLoadingViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(GenFMLoadingViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(HomeViewModelV3_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(HomeViewModelV3_HiltModules.KeyModule.provide()));
            i1Var.x(HomeViewModelV4_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(HomeViewModelV4_HiltModules.KeyModule.provide()));
            i1Var.x(HoursHistoryViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(HoursHistoryViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(HoursLowViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(HoursLowViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ImportContentBrowserSurveyViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ImportContentBrowserSurveyViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ImportFileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ImportFileViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ImportLinkViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ImportLinkViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(LibraryViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(LibraryViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(LowDiskSpaceViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(LowDiskSpaceViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ManageContentInterestsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ManageContentInterestsViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ManagePurchasesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ManagePurchasesViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(MfaVerificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(MfaVerificationViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(MiniPlayerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(MiniPlayerViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(NotificationPrimerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(NotificationPrimerViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(NotificationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(NotificationViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(OcrImportViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(OcrImportViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(OnboardingViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(OnboardingViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(PasteLinkViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(PasteLinkViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(PlayerPreferencesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(PlayerPreferencesViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(PlayerQueueViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(PlayerQueueViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(PlayerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(PlayerViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(PronunciationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(PronunciationViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(PronunciationsListViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(PronunciationsListViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(PurchaseHoursViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(PurchaseHoursViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(RateTitleViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(RateTitleViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ReadBookmarksViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ReadBookmarksViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ReadDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ReadDetailsViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ReadLinkShareViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ReadLinkShareViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ReadShareDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ReadShareDetailsViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ReadShareOptionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ReadShareOptionsViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ReferFriendViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ReferFriendViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ReportProblemViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ReportProblemViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(RevenueCatPaywallViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(RevenueCatPaywallViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(RouterViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(RouterViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(SearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(SearchViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(SleepTimerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(SleepTimerViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(SoundscapesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(SoundscapesViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(SurveyViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(SurveyViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(ToastViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ToastViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(UseFriendReferralViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(UseFriendReferralViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VerifyEmailViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VerifyEmailViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoiceDesignViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoiceDesignViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoiceDetailsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoiceDetailsViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoicePickerCollectionViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoicePickerCollectionViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoicePickerCreatedViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoicePickerCreatedViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoicePickerExploreViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoicePickerExploreViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoicePickerFavoritesViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoicePickerFavoritesViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoicePickerFilteredListViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoicePickerFilteredListViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoicePickerRecentsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoicePickerRecentsViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoicePickerSearchListViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoicePickerSearchListViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(VoicePickerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(VoicePickerViewModel_HiltModules.KeyModule.provide()));
            i1Var.x(WriteViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(WriteViewModel_HiltModules.KeyModule.provide()));
            return i1Var.c(true);
        }

        public RateAppUseCase rateAppUseCase() {
            Context context = this.singletonCImpl.applicationContextModule.f30240a;
            m0.n(context);
            return new RateAppUseCase(context, this.singletonCImpl.localAppRatingService(), (Logger) this.singletonCImpl.loggerProvider.get());
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ActivityC
        public ol.e viewComponentBuilder() {
            return new ViewCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ActivityRetainedCImpl extends ReaderApp_HiltComponents.ActivityRetainedC {
        private final ActivityRetainedCImpl activityRetainedCImpl = this;
        ul.f activityRetainedCoroutineScopeProvider;
        ul.f provideActivityRetainedLifecycleProvider;
        private final SingletonCImpl singletonCImpl;
        ul.f voicePickerSharedRepositoryProvider;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public static final class SwitchingProvider<T> implements ul.f {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f14336id;
            private final SingletonCImpl singletonCImpl;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int i10) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.f14336id = i10;
            }

            @Override // rn.a
            public T get() {
                int i10 = this.f14336id;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            return (T) ActivityRetainedCoroutinesModule_ActivityRetainedCoroutineScopeFactory.activityRetainedCoroutineScope((ll.a) this.activityRetainedCImpl.provideActivityRetainedLifecycleProvider.get());
                        }
                        throw new AssertionError(i10);
                    }
                    return (T) new VoicePickerSharedRepository((d0) this.activityRetainedCImpl.activityRetainedCoroutineScopeProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (AudioPreviewService) this.singletonCImpl.bindAudioPreviewPlayerServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (VoicesService) this.singletonCImpl.bindVoicesServiceProvider.get(), (CommunityVoicesService) this.singletonCImpl.bindCommunityVoicesServiceProvider.get(), (FavoriteVoicesService) this.singletonCImpl.bindVoicesFavoritesServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Logger) this.singletonCImpl.loggerProvider.get(), (RecentVoicesService) this.singletonCImpl.bindRecentVoicesServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (FeatureFlagService) this.singletonCImpl.postHogFeatureFlagServiceProvider.get());
                }
                return (T) new pl.h();
            }
        }

        public ActivityRetainedCImpl(SingletonCImpl singletonCImpl, ql.i iVar) {
            this.singletonCImpl = singletonCImpl;
            initialize(iVar);
        }

        private void initialize(ql.i iVar) {
            this.provideActivityRetainedLifecycleProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 0));
            this.activityRetainedCoroutineScopeProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 2));
            this.voicePickerSharedRepositoryProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 1));
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ActivityRetainedC, ql.a
        public ol.a activityComponentBuilder() {
            return new ActivityCBuilder(this.singletonCImpl, this.activityRetainedCImpl, 0);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ActivityRetainedC, ql.e
        public ll.a getActivityRetainedLifecycle() {
            return (ll.a) this.provideActivityRetainedLifecycleProvider.get();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class FragmentCImpl extends ReaderApp_HiltComponents.FragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl = this;
        private final SingletonCImpl singletonCImpl;

        public FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, x xVar) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.FragmentC
        public pl.b getHiltInternalFactoryFactory() {
            return this.activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.FragmentC
        public ol.g viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ServiceCImpl extends ReaderApp_HiltComponents.ServiceC {
        ul.f axinomDrmProvider;
        ul.f factoryProvider;
        ul.f factoryProvider2;
        ul.f provideDefaultLoadControlProvider;
        ul.f provideDrmSessionManagerProvider;
        ul.f provideMediaSourceFactoryProvider;
        ul.f providePlayerProvider;
        ul.f provideRenderersFactoryProvider;
        private final ServiceCImpl serviceCImpl = this;
        private final SingletonCImpl singletonCImpl;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public static final class SwitchingProvider<T> implements ul.f {

            /* renamed from: id, reason: collision with root package name */
            private final int f14337id;
            private final ServiceCImpl serviceCImpl;
            private final SingletonCImpl singletonCImpl;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ServiceCImpl serviceCImpl, int i10) {
                this.singletonCImpl = singletonCImpl;
                this.serviceCImpl = serviceCImpl;
                this.f14337id = i10;
            }

            @Override // rn.a
            public T get() {
                int i10 = this.f14337id;
                switch (i10) {
                    case 0:
                        Context context = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context);
                        return (T) PlayerServiceModule_ProvidePlayerFactory.providePlayer(context, (s1) this.serviceCImpl.provideRenderersFactoryProvider.get(), (g0) this.serviceCImpl.provideMediaSourceFactoryProvider.get(), this.serviceCImpl.dynamicLoadControl());
                    case 1:
                        Context context2 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context2);
                        return (T) PlayerServiceModule_ProvideRenderersFactoryFactory.provideRenderersFactory(context2);
                    case 2:
                        return (T) PlayerServiceModule_ProvideMediaSourceFactoryFactory.provideMediaSourceFactory((ReadsDataSource.Factory) this.serviceCImpl.factoryProvider.get(), (HlsMediaDataSource.Factory) this.serviceCImpl.factoryProvider2.get(), (s) this.serviceCImpl.provideDrmSessionManagerProvider.get(), this.singletonCImpl.mediaItemCreator());
                    case 3:
                        return (T) new ReadsDataSource.Factory((Logger) this.singletonCImpl.loggerProvider.get(), (StreamingService) this.singletonCImpl.bindStreamingServiceProvider.get());
                    case 4:
                        return (T) new HlsMediaDataSource.Factory((Logger) this.singletonCImpl.loggerProvider.get(), (MediaManifestService) this.singletonCImpl.mediaManifestServiceImplProvider.get(), (v) this.singletonCImpl.provideSimpleCacheProvider.get(), (Configuration) this.singletonCImpl.configurationProvider.get());
                    case 5:
                        return (T) PlayerServiceModule_ProvideDrmSessionManagerProviderFactory.provideDrmSessionManagerProvider((AxinomDrmProvider) this.serviceCImpl.axinomDrmProvider.get());
                    case 6:
                        return (T) new AxinomDrmProvider((DrmService) this.singletonCImpl.drmServiceImplProvider.get(), (OkHttpClient) this.singletonCImpl.provideDrmOkHttpClientProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 7:
                        return (T) PlayerServiceModule_ProvideDefaultLoadControlFactory.provideDefaultLoadControl();
                    default:
                        throw new AssertionError(i10);
                }
            }
        }

        public ServiceCImpl(SingletonCImpl singletonCImpl, Service service) {
            this.singletonCImpl = singletonCImpl;
            initialize(service);
        }

        private void initialize(Service service) {
            this.provideRenderersFactoryProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.serviceCImpl, 1));
            this.factoryProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.serviceCImpl, 3));
            this.factoryProvider2 = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.serviceCImpl, 4));
            this.axinomDrmProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.serviceCImpl, 6));
            this.provideDrmSessionManagerProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.serviceCImpl, 5));
            this.provideMediaSourceFactoryProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.serviceCImpl, 2));
            this.provideDefaultLoadControlProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.serviceCImpl, 7));
            this.providePlayerProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, this.serviceCImpl, 0));
        }

        private BackgroundPlayerService injectBackgroundPlayerService2(BackgroundPlayerService backgroundPlayerService) {
            BackgroundPlayerService_MembersInjector.injectPlayerConfiguration(backgroundPlayerService, ConfigModule_PlayerConfigurationFactory.playerConfiguration());
            BackgroundPlayerService_MembersInjector.injectDispatcherFactory(backgroundPlayerService, (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
            BackgroundPlayerService_MembersInjector.injectStreamingService(backgroundPlayerService, (StreamingService) this.singletonCImpl.bindStreamingServiceProvider.get());
            BackgroundPlayerService_MembersInjector.injectPlayer(backgroundPlayerService, (h1) this.providePlayerProvider.get());
            BackgroundPlayerService_MembersInjector.injectReadsService(backgroundPlayerService, (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get());
            BackgroundPlayerService_MembersInjector.injectAuthService(backgroundPlayerService, (AuthService) this.singletonCImpl.bindAuthServiceProvider.get());
            BackgroundPlayerService_MembersInjector.injectLogger(backgroundPlayerService, (Logger) this.singletonCImpl.loggerProvider.get());
            BackgroundPlayerService_MembersInjector.injectGetCurrentTimeUseCase(backgroundPlayerService, new GetCurrentTimeUseCaseImpl());
            BackgroundPlayerService_MembersInjector.injectCharacterReportingService(backgroundPlayerService, (CharacterReportingService) this.singletonCImpl.characterReportingServiceImplProvider.get());
            BackgroundPlayerService_MembersInjector.injectPlayerService(backgroundPlayerService, (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get());
            BackgroundPlayerService_MembersInjector.injectAnalytics(backgroundPlayerService, (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
            BackgroundPlayerService_MembersInjector.injectSeekEmitter(backgroundPlayerService, (PlayerSeekEmitter) this.singletonCImpl.playerSeekMediatorProvider.get());
            BackgroundPlayerService_MembersInjector.injectStringProvider(backgroundPlayerService, (StringProvider) this.singletonCImpl.stringProvider.get());
            BackgroundPlayerService_MembersInjector.injectSoundscapesService(backgroundPlayerService, (SoundscapesService) this.singletonCImpl.bindSoundscapesServiceProvider.get());
            BackgroundPlayerService_MembersInjector.injectLoopingAudioPlayer(backgroundPlayerService, loopingAudioPlayer());
            BackgroundPlayerService_MembersInjector.injectPersistentPlayerQueueService(backgroundPlayerService, this.singletonCImpl.persistentPlayerQueueServiceImpl());
            BackgroundPlayerService_MembersInjector.injectPlayerPreferencesService(backgroundPlayerService, (PlayerPreferencesService) this.singletonCImpl.bindPlayerPreferencesServiceProvider.get());
            BackgroundPlayerService_MembersInjector.injectAssistantTriggerEmitter(backgroundPlayerService, (AssistantTriggerEmitter) this.singletonCImpl.assistantTriggerEmitterProvider.get());
            BackgroundPlayerService_MembersInjector.injectVibrationService(backgroundPlayerService, (VibrationService) this.singletonCImpl.androidVibrationServiceProvider.get());
            BackgroundPlayerService_MembersInjector.injectAssistantSessionManager(backgroundPlayerService, (AssistantSessionManager) this.singletonCImpl.assistantSessionManagerProvider.get());
            BackgroundPlayerService_MembersInjector.injectBookmarkService(backgroundPlayerService, (ReadBookmarkService) this.singletonCImpl.bindReadBookmarkServiceProvider.get());
            BackgroundPlayerService_MembersInjector.injectToastService(backgroundPlayerService, (ToastService) this.singletonCImpl.bindToastServiceProvider.get());
            BackgroundPlayerService_MembersInjector.injectCreateBookmarkFromOffsetUseCase(backgroundPlayerService, createBookmarkFromOffsetUseCase());
            BackgroundPlayerService_MembersInjector.injectIsAudioBookmarksAllowedUseCase(backgroundPlayerService, isAudioBookmarksAllowedUseCase());
            BackgroundPlayerService_MembersInjector.injectTriggerAssistantFromMediaButtonUseCase(backgroundPlayerService, triggerAssistantFromMediaButtonUseCase());
            BackgroundPlayerService_MembersInjector.injectMediaItemCreator(backgroundPlayerService, this.singletonCImpl.mediaItemCreator());
            BackgroundPlayerService_MembersInjector.injectConsumptionTrackingService(backgroundPlayerService, (ConsumptionTrackingService) this.singletonCImpl.consumptionRepositoryProvider.get());
            BackgroundPlayerService_MembersInjector.injectConnectivityService(backgroundPlayerService, (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get());
            return backgroundPlayerService;
        }

        private NotificationRetrievalService injectNotificationRetrievalService2(NotificationRetrievalService notificationRetrievalService) {
            NotificationRetrievalService_MembersInjector.injectLogger(notificationRetrievalService, (Logger) this.singletonCImpl.loggerProvider.get());
            NotificationRetrievalService_MembersInjector.injectNotificationService(notificationRetrievalService, (NotificationService) this.singletonCImpl.notificationServiceImplProvider.get());
            NotificationRetrievalService_MembersInjector.injectAnalytics(notificationRetrievalService, (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
            NotificationRetrievalService_MembersInjector.injectToastService(notificationRetrievalService, (ToastService) this.singletonCImpl.bindToastServiceProvider.get());
            return notificationRetrievalService;
        }

        public CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase() {
            return new CreateBookmarkFromOffsetUseCase((ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (ReadBookmarkService) this.singletonCImpl.bindReadBookmarkServiceProvider.get(), new MediaAudioPositionResolver(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
        }

        public DynamicLoadControl dynamicLoadControl() {
            return new DynamicLoadControl((StreamingService) this.singletonCImpl.bindStreamingServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (g8.h) this.provideDefaultLoadControlProvider.get());
        }

        @Override // io.elevenlabs.player.BackgroundPlayerService_GeneratedInjector
        public void injectBackgroundPlayerService(BackgroundPlayerService backgroundPlayerService) {
            injectBackgroundPlayerService2(backgroundPlayerService);
        }

        @Override // io.elevenlabs.readerapp.services.NotificationRetrievalService_GeneratedInjector
        public void injectNotificationRetrievalService(NotificationRetrievalService notificationRetrievalService) {
            injectNotificationRetrievalService2(notificationRetrievalService);
        }

        public IsAudioBookmarksAllowedUseCase isAudioBookmarksAllowedUseCase() {
            return new IsAudioBookmarksAllowedUseCase((FeatureFlagService) this.singletonCImpl.postHogFeatureFlagServiceProvider.get());
        }

        public LoopingAudioPlayer loopingAudioPlayer() {
            return new LoopingAudioPlayer((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
        }

        public TriggerAssistantFromMediaButtonUseCase triggerAssistantFromMediaButtonUseCase() {
            return new TriggerAssistantFromMediaButtonUseCase((AssistantSessionManager) this.singletonCImpl.assistantSessionManagerProvider.get(), (AssistantTriggerEmitter) this.singletonCImpl.assistantTriggerEmitterProvider.get(), (CharacterReportingService) this.singletonCImpl.characterReportingServiceImplProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class SingletonCImpl extends ReaderApp_HiltComponents.SingletonC {
        ul.f adAttributionServiceImplProvider;
        ul.f agentContextServiceImplProvider;
        ul.f androidConnectivityServiceProvider;
        ul.f androidFileServiceProvider;
        ul.f androidStringProvider;
        ul.f androidVibrationServiceProvider;
        ul.f anonCaptchaTokenServiceImplProvider;
        ul.f appCompatibilityDialogServiceImplProvider;
        private final rl.a applicationContextModule;
        ul.f assistantSessionManagerProvider;
        ul.f assistantTriggerEmitterProvider;
        ul.f backgroundPlayerControllerServiceProvider;
        ul.f bindAppCheckTokenServiceProvider;
        ul.f bindAppCompatibilityDialogServiceProvider;
        ul.f bindAppConfigServiceProvider;
        ul.f bindAudioPreviewPlayerServiceProvider;
        ul.f bindAuthAuthTokenServiceProvider;
        ul.f bindAuthServiceProvider;
        ul.f bindCommunityVoicesServiceProvider;
        ul.f bindConnectivityServiceProvider;
        ul.f bindCustomerServiceProvider;
        ul.f bindDevicePerformanceMeasurerProvider;
        ul.f bindMessagesServiceProvider;
        ul.f bindNotificationPermissionServiceProvider;
        ul.f bindOfflineReadsServiceProvider;
        ul.f bindPlayerPreferencesServiceProvider;
        ul.f bindPlayerVisibilityServiceProvider;
        ul.f bindPostHogAnalyticsProvider;
        ul.f bindReadBookmarkServiceProvider;
        ul.f bindReadsServiceProvider;
        ul.f bindRecentVoicesServiceProvider;
        ul.f bindSoundscapesServiceProvider;
        ul.f bindStreamingServiceProvider;
        ul.f bindToastServiceProvider;
        ul.f bindUserConfigServiceProvider;
        ul.f bindVoicesFavoritesServiceProvider;
        ul.f bindVoicesServiceProvider;
        ul.f cacheProvider;
        ul.f chapterContentMemoryCacheProvider;
        ul.f characterReportingServiceImplProvider;
        ul.f collectionsServiceImplProvider;
        ul.f communityVoicesServiceImplProvider;
        ul.f configurationProvider;
        ul.f consumptionRepositoryProvider;
        ul.f crashlyticsLoggerProvider;
        ul.f currentActivityProviderImplProvider;
        ul.f customerServiceImplProvider;
        ul.f deleteAccountApiProvider;
        ul.f devicePerformanceMeasurerImplProvider;
        ul.f dispatcherFactoryProvider;
        ul.f downloadReadUseCaseImplProvider;
        ul.f drmServiceImplProvider;
        ul.f favoriteVoicesServiceImplProvider;
        ul.f firebaseAnalyticsServiceProvider;
        ul.f firebaseAppCheckTokenServiceProvider;
        ul.f firebaseAuthProvider;
        ul.f firebaseAuthServiceProvider;
        ul.f firebaseAuthTokenServiceProvider;
        ul.f installIntegrityCheckProvider;
        ul.f loggerImplProvider;
        ul.f loggerProvider;
        ul.f mediaAudioPreviewServiceProvider;
        ul.f mediaManifestServiceImplProvider;
        ul.f mfaServiceImplProvider;
        ul.f navigationDispatcherProvider;
        ul.f navigationServiceImplProvider;
        ul.f notificationPermissionServiceImplProvider;
        ul.f notificationServiceImplProvider;
        ul.f offlineDrmLicenseHelperProvider;
        ul.f offlineReadsServiceImplProvider;
        ul.f onboardingServiceImplProvider;
        ul.f playerErrorHandlerProvider;
        ul.f playerPreferencesServiceImplProvider;
        ul.f playerSeekMediatorProvider;
        ul.f playerVisibilityServiceImplProvider;
        ul.f postHogAnalyticsProvider;
        ul.f postHogFeatureFlagServiceProvider;
        ul.f pronunciationsServiceImplProvider;
        ul.f provideDatabaseBuilderProvider;
        ul.f provideDatabaseProvider;
        ul.f provideDownloadOkHttpClientProvider;
        ul.f provideDownloadRetrofitProvider;
        ul.f provideDrmOkHttpClientProvider;
        ul.f provideOkHttpClientProvider;
        ul.f provideProcessLifecycleProvider;
        ul.f provideProductsServiceProvider;
        ul.f provideRetrofitProvider;
        ul.f provideRevenueCatPaymentsProvider;
        ul.f provideSimpleCacheProvider;
        ul.f provideStoreCountryCodeRecordingServiceProvider;
        ul.f provideUploadRetrofitProvider;
        ul.f readBookmarkServiceImplProvider;
        ul.f readsExploreServiceImplProvider;
        ul.f readsServiceImplProvider;
        ul.f readsStreamingServiceProvider;
        ul.f recentVoicesServiceImplProvider;
        ul.f recognizeDocumentTextUseCaseProvider;
        ul.f restAppConfigServiceProvider;
        ul.f restGooglePlayServiceProvider;
        ul.f restMessagesServiceProvider;
        ul.f restPasswordResetServiceProvider;
        ul.f restSignUpServiceProvider;
        ul.f restUserConfigServiceProvider;
        ul.f runtimePermissionsServiceImplProvider;
        ul.f sharedPrefsDeviceUuidServiceProvider;
        private final SingletonCImpl singletonCImpl = this;
        ul.f singularServiceImplProvider;
        ul.f soundscapeDownloaderProvider;
        ul.f soundscapesServiceImplProvider;
        ul.f stringProvider;
        ul.f supportClientToolsFactoryProvider;
        ul.f supportToolEventsImplProvider;
        ul.f toastServiceImplProvider;
        ul.f voiceDesignAudioStorageProvider;
        ul.f voicesServiceImplProvider;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public static final class SwitchingProvider<T> implements ul.f {

            /* renamed from: id, reason: collision with root package name */
            private final int f14338id;
            private final SingletonCImpl singletonCImpl;

            public SwitchingProvider(SingletonCImpl singletonCImpl, int i10) {
                this.singletonCImpl = singletonCImpl;
                this.f14338id = i10;
            }

            @Override // rn.a
            public T get() {
                int i10 = this.f14338id;
                switch (i10) {
                    case 0:
                        return (T) DatabaseModule_ProvideDatabaseFactory.provideDatabase((c0) this.singletonCImpl.provideDatabaseBuilderProvider.get());
                    case 1:
                        Context context = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context);
                        return (T) DatabaseModule_ProvideDatabaseBuilderFactory.provideDatabaseBuilder(context);
                    case 2:
                        return (T) NetworkModule_ProvideRetrofitFactory.provideRetrofit((Configuration) this.singletonCImpl.configurationProvider.get(), (OkHttpClient) this.singletonCImpl.provideOkHttpClientProvider.get(), this.singletonCImpl.resultCallAdapterFactory());
                    case 3:
                        return (T) ConfigModule_ConfigurationFactory.configuration();
                    case 4:
                        return (T) NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient((AuthTokenService) this.singletonCImpl.bindAuthAuthTokenServiceProvider.get(), (AuthService) this.singletonCImpl.bindAuthServiceProvider.get(), (Configuration) this.singletonCImpl.configurationProvider.get(), (Cache) this.singletonCImpl.cacheProvider.get(), new AndroidLocaleService(), (DeviceUuidService) this.singletonCImpl.sharedPrefsDeviceUuidServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer(), this.singletonCImpl.certificateMismatchReporter());
                    case 5:
                        return (T) new FirebaseAuthTokenService((FirebaseAuth) this.singletonCImpl.firebaseAuthProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 6:
                        return (T) FirebaseModule_FirebaseAuthFactory.firebaseAuth();
                    case 7:
                        return (T) new LoggerImpl((CrashlyticsLogger) this.singletonCImpl.crashlyticsLoggerProvider.get());
                    case 8:
                        return (T) new CrashlyticsLogger();
                    case 9:
                        return (T) new FirebaseAuthService((FirebaseAuth) this.singletonCImpl.firebaseAuthProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), ul.b.a(this.singletonCImpl.bindPostHogAnalyticsProvider), (Cache) this.singletonCImpl.cacheProvider.get(), (AppDatabase) this.singletonCImpl.provideDatabaseProvider.get(), (FileService) this.singletonCImpl.androidFileServiceProvider.get(), this.singletonCImpl.userSharedPreferencesSharedPreferences(), ul.b.a(this.singletonCImpl.deleteAccountApiProvider), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get(), (MfaService) this.singletonCImpl.mfaServiceImplProvider.get(), new DetermineMfaTypeUseCaseImpl(), new ResolveMultiFactorAuthUseCaseImpl(), new ResolveTotpMfaUseCaseImpl());
                    case 10:
                        return (T) new PostHogAnalytics((Logger) this.singletonCImpl.loggerProvider.get(), (AuthService) this.singletonCImpl.bindAuthServiceProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), new AndroidLocaleService(), CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope(), (SingularService) this.singletonCImpl.singularServiceImplProvider.get(), (DevicePerformanceMeasurer) this.singletonCImpl.bindDevicePerformanceMeasurerProvider.get(), (FirebaseAnalyticsService) this.singletonCImpl.firebaseAnalyticsServiceProvider.get());
                    case 11:
                        return (T) CoroutinesModule_DispatcherFactoryFactory.dispatcherFactory();
                    case 12:
                        return (T) new SingularServiceImpl((Logger) this.singletonCImpl.loggerProvider.get(), (AuthService) this.singletonCImpl.bindAuthServiceProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), ul.b.a(this.singletonCImpl.bindPostHogAnalyticsProvider), (AdAttributionService) this.singletonCImpl.adAttributionServiceImplProvider.get());
                    case 13:
                        return (T) new CustomerServiceImpl(this.singletonCImpl.customerAPI(), NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer(), (Logger) this.singletonCImpl.loggerProvider.get(), this.singletonCImpl.userSharedPreferencesSharedPreferences(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get());
                    case 14:
                        Context context2 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context2);
                        return (T) new AndroidConnectivityService(context2, (Logger) this.singletonCImpl.loggerProvider.get());
                    case 15:
                        return (T) new AdAttributionServiceImpl(this.singletonCImpl.globalSharedPreferencesSharedPreferences());
                    case 16:
                        Context context3 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context3);
                        return (T) new DevicePerformanceMeasurerImpl(context3);
                    case 17:
                        return (T) new FirebaseAnalyticsService((Logger) this.singletonCImpl.loggerProvider.get());
                    case 18:
                        Context context4 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context4);
                        return (T) NetworkModule_CacheFactory.cache(context4);
                    case 19:
                        Context context5 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context5);
                        return (T) new AndroidFileService(context5, (Logger) this.singletonCImpl.loggerProvider.get());
                    case 20:
                        return (T) NetworkModule_DeleteAccountApiFactory.deleteAccountApi((s0) this.singletonCImpl.provideRetrofitProvider.get());
                    case 21:
                        return (T) new MfaServiceImpl();
                    case 22:
                        return (T) new SharedPrefsDeviceUuidService(this.singletonCImpl.globalSharedPreferencesSharedPreferences());
                    case 23:
                        return (T) NetworkModule_ProvideUploadRetrofitFactory.provideUploadRetrofit((s0) this.singletonCImpl.provideRetrofitProvider.get(), (OkHttpClient) this.singletonCImpl.provideOkHttpClientProvider.get());
                    case 24:
                        return (T) NetworkModule_ProvideDownloadRetrofitFactory.provideDownloadRetrofit((Configuration) this.singletonCImpl.configurationProvider.get(), (OkHttpClient) this.singletonCImpl.provideDownloadOkHttpClientProvider.get(), this.singletonCImpl.resultCallAdapterFactory());
                    case 25:
                        return (T) NetworkModule_ProvideDownloadOkHttpClientFactory.provideDownloadOkHttpClient((AuthTokenService) this.singletonCImpl.bindAuthAuthTokenServiceProvider.get(), (AuthService) this.singletonCImpl.bindAuthServiceProvider.get(), (Configuration) this.singletonCImpl.configurationProvider.get(), (Cache) this.singletonCImpl.cacheProvider.get(), new AndroidLocaleService(), (DeviceUuidService) this.singletonCImpl.sharedPrefsDeviceUuidServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer(), this.singletonCImpl.certificateMismatchReporter());
                    case 26:
                        return (T) new FirebaseAppCheckTokenService((Logger) this.singletonCImpl.loggerProvider.get(), (Configuration) this.singletonCImpl.configurationProvider.get(), this.singletonCImpl.globalSharedPreferencesSharedPreferences());
                    case 27:
                        return (T) new MediaManifestServiceImpl(this.singletonCImpl.mediaAPI());
                    case 28:
                        Context context6 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context6);
                        return (T) MediaCacheModule_ProvideSimpleCacheFactory.provideSimpleCache(context6);
                    case 29:
                        return (T) new OfflineDrmLicenseHelper((DrmService) this.singletonCImpl.drmServiceImplProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 30:
                        return (T) new DrmServiceImpl(this.singletonCImpl.drmAPI(), (DeviceUuidService) this.singletonCImpl.sharedPrefsDeviceUuidServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 31:
                        return (T) new AnonCaptchaTokenServiceImpl((CurrentActivityProvider) this.singletonCImpl.currentActivityProviderImplProvider.get(), AnonCaptchaModule_Companion_ProvidesAnonCaptchaSiteKeyFactory.providesAnonCaptchaSiteKey(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 32:
                        return (T) new CurrentActivityProviderImpl(x7.e.t(this.singletonCImpl.applicationContextModule.f30240a));
                    case 33:
                        return (T) new ChapterContentMemoryCache();
                    case 34:
                        ConsumptionSpanDao consumptionSpanDao = this.singletonCImpl.consumptionSpanDao();
                        ConsumptionAPI consumptionAPI = this.singletonCImpl.consumptionAPI();
                        Logger logger = (Logger) this.singletonCImpl.loggerProvider.get();
                        Analytics analytics = (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get();
                        jl.a a10 = ul.b.a(this.singletonCImpl.bindReadsServiceProvider);
                        Context context7 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context7);
                        return (T) new ConsumptionRepository(consumptionSpanDao, consumptionAPI, logger, analytics, a10, context7);
                    case 35:
                        FileService fileService = (FileService) this.singletonCImpl.androidFileServiceProvider.get();
                        ReadsUploadAPI readsUploadAPI = this.singletonCImpl.readsUploadAPI();
                        ReadsDao readsDao = this.singletonCImpl.readsDao();
                        Logger logger2 = (Logger) this.singletonCImpl.loggerProvider.get();
                        ReadsAPI readsAPI = this.singletonCImpl.readsAPI();
                        DispatcherFactory dispatcherFactory = (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get();
                        vr.c provideJsonSerializer = NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer();
                        d0 applicationCoroutineScope = CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope();
                        SharedPreferences userSharedPreferencesSharedPreferences = this.singletonCImpl.userSharedPreferencesSharedPreferences();
                        Configuration configuration = (Configuration) this.singletonCImpl.configurationProvider.get();
                        AppCheckTokenService appCheckTokenService = (AppCheckTokenService) this.singletonCImpl.bindAppCheckTokenServiceProvider.get();
                        AnonCaptchaTokenService anonCaptchaTokenService = (AnonCaptchaTokenService) this.singletonCImpl.anonCaptchaTokenServiceImplProvider.get();
                        Context context8 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context8);
                        return (T) new ReadsServiceImpl(fileService, readsUploadAPI, readsDao, logger2, readsAPI, dispatcherFactory, provideJsonSerializer, applicationCoroutineScope, userSharedPreferencesSharedPreferences, configuration, appCheckTokenService, anonCaptchaTokenService, context8, (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), this.singletonCImpl.readMetadataSaverImpl(), this.singletonCImpl.optimizedReadCache(), new OptimizedReadSplitter(), (ChapterContentMemoryCache) this.singletonCImpl.chapterContentMemoryCacheProvider.get());
                    case 36:
                        ConfigAPI configAPI = this.singletonCImpl.configAPI();
                        SharedPreferences userSharedPreferencesSharedPreferences2 = this.singletonCImpl.userSharedPreferencesSharedPreferences();
                        vr.c provideJsonSerializer2 = NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer();
                        Logger logger3 = (Logger) this.singletonCImpl.loggerProvider.get();
                        ConnectivityService connectivityService = (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get();
                        Context context9 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context9);
                        return (T) new RestUserConfigService(configAPI, userSharedPreferencesSharedPreferences2, provideJsonSerializer2, logger3, connectivityService, context9);
                    case 37:
                        SharedPreferences userSharedPreferencesSharedPreferences3 = this.singletonCImpl.userSharedPreferencesSharedPreferences();
                        AuthService authService = (AuthService) this.singletonCImpl.bindAuthServiceProvider.get();
                        NotificationsApi notificationsApi = this.singletonCImpl.notificationsApi();
                        Logger logger4 = (Logger) this.singletonCImpl.loggerProvider.get();
                        DeviceUuidService deviceUuidService = (DeviceUuidService) this.singletonCImpl.sharedPrefsDeviceUuidServiceProvider.get();
                        Context context10 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context10);
                        return (T) new NotificationServiceImpl(userSharedPreferencesSharedPreferences3, authService, notificationsApi, logger4, deviceUuidService, context10);
                    case 38:
                        Logger logger5 = (Logger) this.singletonCImpl.loggerProvider.get();
                        FileService fileService2 = (FileService) this.singletonCImpl.androidFileServiceProvider.get();
                        ReadBookmarksAPI readBookmarksAPI = this.singletonCImpl.readBookmarksAPI();
                        ReadBookmarksVideoAPI readBookmarksVideoAPI = this.singletonCImpl.readBookmarksVideoAPI();
                        BookmarksDao bookmarksDao = this.singletonCImpl.bookmarksDao();
                        GetCurrentTimeUseCaseImpl getCurrentTimeUseCaseImpl = new GetCurrentTimeUseCaseImpl();
                        DispatcherFactory dispatcherFactory2 = (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get();
                        d0 applicationCoroutineScope2 = CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope();
                        AppCheckTokenService appCheckTokenService2 = (AppCheckTokenService) this.singletonCImpl.bindAppCheckTokenServiceProvider.get();
                        AnonCaptchaTokenService anonCaptchaTokenService2 = (AnonCaptchaTokenService) this.singletonCImpl.anonCaptchaTokenServiceImplProvider.get();
                        ConnectivityService connectivityService2 = (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get();
                        Context context11 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context11);
                        return (T) new ReadBookmarkServiceImpl(logger5, fileService2, readBookmarksAPI, readBookmarksVideoAPI, bookmarksDao, getCurrentTimeUseCaseImpl, dispatcherFactory2, applicationCoroutineScope2, appCheckTokenService2, anonCaptchaTokenService2, connectivityService2, context11);
                    case 39:
                        Context context12 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context12);
                        return (T) new OfflineReadsServiceImpl(context12, this.singletonCImpl.readsAPI(), this.singletonCImpl.readsDao(), this.singletonCImpl.getOfflineReadsDao(), (v) this.singletonCImpl.provideSimpleCacheProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get());
                    case 40:
                        Context context13 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context13);
                        return (T) new InstallIntegrityCheck(context13, (AppConfigService) this.singletonCImpl.bindAppConfigServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 41:
                        return (T) new RestAppConfigService(this.singletonCImpl.configAPI(), this.singletonCImpl.globalSharedPreferencesSharedPreferences(), NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer(), (Logger) this.singletonCImpl.loggerProvider.get(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get());
                    case 42:
                        return (T) PaymentsModule_ProvideStoreCountryCodeRecordingServiceFactory.provideStoreCountryCodeRecordingService(this.singletonCImpl.storeCountryCodeRecordingServiceImpl());
                    case 43:
                        return (T) new NavigationDispatcherProvider();
                    case 44:
                        return (T) new RestPasswordResetService(this.singletonCImpl.passwordResetAPI());
                    case 45:
                        return (T) new ToastServiceImpl((Logger) this.singletonCImpl.loggerProvider.get());
                    case 46:
                        Context context14 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context14);
                        return (T) new AndroidStringProvider(context14);
                    case 47:
                        return (T) PaymentsModule_ProvideProductsServiceFactory.provideProductsService(this.singletonCImpl.inAppPurchasesService());
                    case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                        Configuration configuration2 = (Configuration) this.singletonCImpl.configurationProvider.get();
                        Context context15 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context15);
                        return (T) PaymentsModule_ProvideRevenueCatPaymentsFactory.provideRevenueCatPayments(configuration2, context15);
                    case 49:
                        return (T) new RestGooglePlayService(this.singletonCImpl.googlePlayAPI());
                    case 50:
                        return (T) new CollectionsServiceImpl((Logger) this.singletonCImpl.loggerProvider.get(), this.singletonCImpl.collectionsAPI(), this.singletonCImpl.collectionsDao(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get(), this.singletonCImpl.readMetadataSaverImpl());
                    case 51:
                        return (T) new AppCompatibilityDialogServiceImpl(this.singletonCImpl.globalSharedPreferencesSharedPreferences());
                    case 52:
                        AssistantServiceImpl assistantServiceImpl = this.singletonCImpl.assistantServiceImpl();
                        VibrationService vibrationService = (VibrationService) this.singletonCImpl.androidVibrationServiceProvider.get();
                        Logger logger6 = (Logger) this.singletonCImpl.loggerProvider.get();
                        Context context16 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context16);
                        return (T) new AssistantSessionManager(assistantServiceImpl, vibrationService, logger6, context16, CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope(), (SupportClientToolsFactory) this.singletonCImpl.supportClientToolsFactoryProvider.get());
                    case 53:
                        Context context17 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context17);
                        return (T) new AndroidVibrationService(context17);
                    case 54:
                        Context context18 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context18);
                        return (T) new SupportClientToolsFactory(context18, (SupportToolEvents) this.singletonCImpl.supportToolEventsImplProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 55:
                        return (T) new SupportToolEventsImpl();
                    case 56:
                        AuthService authService2 = (AuthService) this.singletonCImpl.bindAuthServiceProvider.get();
                        CustomerService customerService = (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get();
                        AndroidLocaleService androidLocaleService = new AndroidLocaleService();
                        Configuration configuration3 = (Configuration) this.singletonCImpl.configurationProvider.get();
                        ReadsService readsService = (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get();
                        Context context19 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context19);
                        return (T) new AgentContextServiceImpl(authService2, customerService, androidLocaleService, configuration3, readsService, context19, (Logger) this.singletonCImpl.loggerProvider.get());
                    case 57:
                        return (T) new RuntimePermissionsServiceImpl(this.singletonCImpl.globalSharedPreferencesSharedPreferences());
                    case 58:
                        return (T) new RestSignUpService(this.singletonCImpl.signUpAPI(), (Logger) this.singletonCImpl.loggerProvider.get(), (AppCheckTokenService) this.singletonCImpl.bindAppCheckTokenServiceProvider.get());
                    case 59:
                        SharedPreferences globalSharedPreferencesSharedPreferences = this.singletonCImpl.globalSharedPreferencesSharedPreferences();
                        Logger logger7 = (Logger) this.singletonCImpl.loggerProvider.get();
                        Context context20 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context20);
                        return (T) new NotificationPermissionServiceImpl(globalSharedPreferencesSharedPreferences, logger7, context20, this.singletonCImpl.notificationsApi());
                    case 60:
                        return (T) new DownloadReadUseCaseImpl((OfflineReadsService) this.singletonCImpl.bindOfflineReadsServiceProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (VoicesService) this.singletonCImpl.bindVoicesServiceProvider.get(), (NavigationService) this.singletonCImpl.navigationServiceImplProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 61:
                        Context context21 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context21);
                        return (T) new VoicesServiceImpl(context21, this.singletonCImpl.voicesAPI(), this.singletonCImpl.voicesDao(), (Logger) this.singletonCImpl.loggerProvider.get(), this.singletonCImpl.userSharedPreferencesSharedPreferences(), (AppConfigService) this.singletonCImpl.bindAppConfigServiceProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get(), (AppCheckTokenService) this.singletonCImpl.bindAppCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.singletonCImpl.anonCaptchaTokenServiceImplProvider.get());
                    case 62:
                        return (T) new NavigationServiceImpl((NavigationDispatcherProvider) this.singletonCImpl.navigationDispatcherProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 63:
                        Context context22 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context22);
                        return (T) new BackgroundPlayerControllerService(context22, (Logger) this.singletonCImpl.loggerProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (UserConfigService) this.singletonCImpl.bindUserConfigServiceProvider.get(), this.singletonCImpl.mediaItemCreator(), (AssistantTriggerEmitter) this.singletonCImpl.assistantTriggerEmitterProvider.get(), (PlayerErrorHandler) this.singletonCImpl.playerErrorHandlerProvider.get());
                    case 64:
                        return (T) new AssistantTriggerEmitter();
                    case 65:
                        return (T) new PlayerErrorHandler((Logger) this.singletonCImpl.loggerProvider.get());
                    case 66:
                        return (T) new ReadsExploreServiceImpl(this.singletonCImpl.readsAPI(), this.singletonCImpl.readsExploreSearchAPI(), this.singletonCImpl.userSharedPreferencesSharedPreferences());
                    case 67:
                        return (T) new MediaAudioPreviewService((Logger) this.singletonCImpl.loggerProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get());
                    case 68:
                        return (T) new PlayerVisibilityServiceImpl(CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope(), (b0) this.singletonCImpl.provideProcessLifecycleProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 69:
                        return (T) LifecycleModule_ProvideProcessLifecycleFactory.provideProcessLifecycle();
                    case 70:
                        return (T) new RecognizeDocumentTextUseCase((Configuration) this.singletonCImpl.configurationProvider.get());
                    case 71:
                        return (T) new OnboardingServiceImpl(this.singletonCImpl.userSharedPreferencesSharedPreferences(), this.singletonCImpl.onboardingAPI(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), this.singletonCImpl.voicesDao(), this.singletonCImpl.whatsNewServiceImpl());
                    case 72:
                        return (T) new RecentVoicesServiceImpl((Logger) this.singletonCImpl.loggerProvider.get(), this.singletonCImpl.recentVoicesApi(), this.singletonCImpl.recentVoicesDao(), new CurrentTimeMillisUseCaseImpl());
                    case 73:
                        return (T) new PlayerPreferencesServiceImpl(this.singletonCImpl.userSharedPreferencesSharedPreferences());
                    case 74:
                        return (T) new PronunciationsServiceImpl(this.singletonCImpl.pronunciationsAPI(), (AppCheckTokenService) this.singletonCImpl.bindAppCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.singletonCImpl.anonCaptchaTokenServiceImplProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope());
                    case 75:
                        return (T) new PostHogFeatureFlagService((Logger) this.singletonCImpl.loggerProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 76:
                        return (T) new CharacterReportingServiceImpl((Logger) this.singletonCImpl.loggerProvider.get());
                    case 77:
                        return (T) new PlayerSeekMediator();
                    case 78:
                        return (T) new RestMessagesService(this.singletonCImpl.messagesAPI(), (AuthService) this.singletonCImpl.bindAuthServiceProvider.get());
                    case 79:
                        return (T) new SoundscapesServiceImpl(this.singletonCImpl.soundscapesAPI(), (SoundscapeDownloader) this.singletonCImpl.soundscapeDownloaderProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                        Context context23 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context23);
                        return (T) new SoundscapeDownloader(context23, (OkHttpClient) this.singletonCImpl.provideOkHttpClientProvider.get());
                    case 81:
                        Context context24 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context24);
                        return (T) new VoiceDesignAudioStorage(context24, CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 82:
                        return (T) new FavoriteVoicesServiceImpl(this.singletonCImpl.favoriteVoicesApi(), this.singletonCImpl.voicesDao(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 83:
                        return (T) new CommunityVoicesServiceImpl((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.singletonCImpl.communityVoicesApi());
                    case 84:
                        Context context25 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context25);
                        return (T) new ReadsStreamingService(context25, (Logger) this.singletonCImpl.loggerProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (AppCheckTokenService) this.singletonCImpl.bindAppCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.singletonCImpl.anonCaptchaTokenServiceImplProvider.get(), new MediaMp3ChunkDurationExtractor(), this.singletonCImpl.streamingAPI(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer(), (PlayerVisibilityService) this.singletonCImpl.bindPlayerVisibilityServiceProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (VoicesService) this.singletonCImpl.bindVoicesServiceProvider.get(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get());
                    case 85:
                        return (T) DrmNetworkModule_ProvideDrmOkHttpClientFactory.provideDrmOkHttpClient((OkHttpClient) this.singletonCImpl.provideOkHttpClientProvider.get());
                    default:
                        throw new AssertionError(i10);
                }
            }
        }

        public SingletonCImpl(rl.a aVar) {
            this.applicationContextModule = aVar;
            initialize(aVar);
            initialize2(aVar);
            initialize3(aVar);
            initialize4(aVar);
            initialize5(aVar);
        }

        /* JADX WARN: Type inference failed for: r3v15, types: [ul.f, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v18, types: [ul.f, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v23, types: [ul.f, java.lang.Object] */
        private void initialize(rl.a aVar) {
            this.provideDatabaseBuilderProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 1));
            this.provideDatabaseProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 0));
            this.configurationProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 3));
            this.firebaseAuthProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 6));
            this.crashlyticsLoggerProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 8));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.singletonCImpl, 7);
            this.loggerImplProvider = switchingProvider;
            this.loggerProvider = ul.b.c(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.singletonCImpl, 5);
            this.firebaseAuthTokenServiceProvider = switchingProvider2;
            this.bindAuthAuthTokenServiceProvider = ul.b.c(switchingProvider2);
            this.bindAuthServiceProvider = new Object();
            this.dispatcherFactoryProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 11));
            this.provideRetrofitProvider = new Object();
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.singletonCImpl, 14);
            this.androidConnectivityServiceProvider = switchingProvider3;
            this.bindConnectivityServiceProvider = ul.b.c(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.singletonCImpl, 13);
            this.customerServiceImplProvider = switchingProvider4;
            this.bindCustomerServiceProvider = ul.b.c(switchingProvider4);
            this.bindPostHogAnalyticsProvider = new Object();
            this.adAttributionServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 15));
            this.singularServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 12));
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.singletonCImpl, 16);
            this.devicePerformanceMeasurerImplProvider = switchingProvider5;
            this.bindDevicePerformanceMeasurerProvider = ul.b.c(switchingProvider5);
            this.firebaseAnalyticsServiceProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 17));
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.singletonCImpl, 10);
            this.postHogAnalyticsProvider = switchingProvider6;
            ul.f fVar = this.bindPostHogAnalyticsProvider;
            ul.f c5 = ul.b.c(switchingProvider6);
            ul.a aVar2 = (ul.a) fVar;
            if (aVar2.f34375a == null) {
                aVar2.f34375a = c5;
                this.cacheProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 18));
            } else {
                n.a();
            }
        }

        private void initialize2(rl.a aVar) {
            this.androidFileServiceProvider = new SwitchingProvider(this.singletonCImpl, 19);
            this.deleteAccountApiProvider = new SwitchingProvider(this.singletonCImpl, 20);
            this.mfaServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 21));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.singletonCImpl, 9);
            this.firebaseAuthServiceProvider = switchingProvider;
            ul.f fVar = this.bindAuthServiceProvider;
            ul.f c5 = ul.b.c(switchingProvider);
            ul.a aVar2 = (ul.a) fVar;
            if (aVar2.f34375a == null) {
                aVar2.f34375a = c5;
                this.sharedPrefsDeviceUuidServiceProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 22));
                this.provideOkHttpClientProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 4));
                ul.f fVar2 = this.provideRetrofitProvider;
                ul.f c10 = ul.b.c(new SwitchingProvider(this.singletonCImpl, 2));
                ul.a aVar3 = (ul.a) fVar2;
                if (aVar3.f34375a == null) {
                    aVar3.f34375a = c10;
                    this.provideUploadRetrofitProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 23));
                    this.provideDownloadOkHttpClientProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 25));
                    this.provideDownloadRetrofitProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 24));
                    SwitchingProvider switchingProvider2 = new SwitchingProvider(this.singletonCImpl, 26);
                    this.firebaseAppCheckTokenServiceProvider = switchingProvider2;
                    this.bindAppCheckTokenServiceProvider = ul.b.c(switchingProvider2);
                    this.mediaManifestServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 27));
                    this.provideSimpleCacheProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 28));
                    this.drmServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 30));
                    this.offlineDrmLicenseHelperProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 29));
                    this.currentActivityProviderImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 32));
                    this.anonCaptchaTokenServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 31));
                    this.chapterContentMemoryCacheProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 33));
                    SwitchingProvider switchingProvider3 = new SwitchingProvider(this.singletonCImpl, 35);
                    this.readsServiceImplProvider = switchingProvider3;
                    this.bindReadsServiceProvider = ul.b.c(switchingProvider3);
                    this.consumptionRepositoryProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 34));
                    SwitchingProvider switchingProvider4 = new SwitchingProvider(this.singletonCImpl, 36);
                    this.restUserConfigServiceProvider = switchingProvider4;
                    this.bindUserConfigServiceProvider = ul.b.c(switchingProvider4);
                    return;
                }
                n.a();
                return;
            }
            n.a();
        }

        private void initialize3(rl.a aVar) {
            this.notificationServiceImplProvider = new SwitchingProvider(this.singletonCImpl, 37);
            SwitchingProvider switchingProvider = new SwitchingProvider(this.singletonCImpl, 38);
            this.readBookmarkServiceImplProvider = switchingProvider;
            this.bindReadBookmarkServiceProvider = ul.b.c(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.singletonCImpl, 39);
            this.offlineReadsServiceImplProvider = switchingProvider2;
            this.bindOfflineReadsServiceProvider = ul.b.c(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.singletonCImpl, 41);
            this.restAppConfigServiceProvider = switchingProvider3;
            this.bindAppConfigServiceProvider = ul.b.c(switchingProvider3);
            this.installIntegrityCheckProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 40));
            this.provideStoreCountryCodeRecordingServiceProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 42));
            this.navigationDispatcherProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 43));
            this.restPasswordResetServiceProvider = new SwitchingProvider(this.singletonCImpl, 44);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.singletonCImpl, 45);
            this.toastServiceImplProvider = switchingProvider4;
            this.bindToastServiceProvider = ul.b.c(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.singletonCImpl, 46);
            this.androidStringProvider = switchingProvider5;
            this.stringProvider = ul.b.c(switchingProvider5);
            this.provideRevenueCatPaymentsProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 48));
            this.restGooglePlayServiceProvider = new SwitchingProvider(this.singletonCImpl, 49);
            this.provideProductsServiceProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 47));
            this.collectionsServiceImplProvider = new SwitchingProvider(this.singletonCImpl, 50);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.singletonCImpl, 51);
            this.appCompatibilityDialogServiceImplProvider = switchingProvider6;
            this.bindAppCompatibilityDialogServiceProvider = ul.b.c(switchingProvider6);
            this.androidVibrationServiceProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 53));
            this.supportToolEventsImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 55));
            this.supportClientToolsFactoryProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 54));
            this.assistantSessionManagerProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 52));
        }

        private void initialize4(rl.a aVar) {
            this.agentContextServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 56));
            this.runtimePermissionsServiceImplProvider = new SwitchingProvider(this.singletonCImpl, 57);
            this.restSignUpServiceProvider = new SwitchingProvider(this.singletonCImpl, 58);
            SwitchingProvider switchingProvider = new SwitchingProvider(this.singletonCImpl, 59);
            this.notificationPermissionServiceImplProvider = switchingProvider;
            this.bindNotificationPermissionServiceProvider = ul.b.c(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.singletonCImpl, 61);
            this.voicesServiceImplProvider = switchingProvider2;
            this.bindVoicesServiceProvider = ul.b.c(switchingProvider2);
            this.navigationServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 62));
            this.downloadReadUseCaseImplProvider = new SwitchingProvider(this.singletonCImpl, 60);
            this.assistantTriggerEmitterProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 64));
            this.playerErrorHandlerProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 65));
            this.backgroundPlayerControllerServiceProvider = new SwitchingProvider(this.singletonCImpl, 63);
            this.readsExploreServiceImplProvider = new SwitchingProvider(this.singletonCImpl, 66);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.singletonCImpl, 67);
            this.mediaAudioPreviewServiceProvider = switchingProvider3;
            this.bindAudioPreviewPlayerServiceProvider = ul.b.c(switchingProvider3);
            this.provideProcessLifecycleProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 69));
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.singletonCImpl, 68);
            this.playerVisibilityServiceImplProvider = switchingProvider4;
            this.bindPlayerVisibilityServiceProvider = ul.b.c(switchingProvider4);
            this.recognizeDocumentTextUseCaseProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 70));
            this.onboardingServiceImplProvider = new SwitchingProvider(this.singletonCImpl, 71);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.singletonCImpl, 72);
            this.recentVoicesServiceImplProvider = switchingProvider5;
            this.bindRecentVoicesServiceProvider = ul.b.c(switchingProvider5);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.singletonCImpl, 73);
            this.playerPreferencesServiceImplProvider = switchingProvider6;
            this.bindPlayerPreferencesServiceProvider = ul.b.c(switchingProvider6);
            this.pronunciationsServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 74));
        }

        private void initialize5(rl.a aVar) {
            this.postHogFeatureFlagServiceProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 75));
            this.characterReportingServiceImplProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 76));
            this.playerSeekMediatorProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 77));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.singletonCImpl, 78);
            this.restMessagesServiceProvider = switchingProvider;
            this.bindMessagesServiceProvider = ul.b.c(switchingProvider);
            this.soundscapeDownloaderProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 80));
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.singletonCImpl, 79);
            this.soundscapesServiceImplProvider = switchingProvider2;
            this.bindSoundscapesServiceProvider = ul.b.c(switchingProvider2);
            this.voiceDesignAudioStorageProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 81));
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.singletonCImpl, 82);
            this.favoriteVoicesServiceImplProvider = switchingProvider3;
            this.bindVoicesFavoritesServiceProvider = ul.b.c(switchingProvider3);
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.singletonCImpl, 83);
            this.communityVoicesServiceImplProvider = switchingProvider4;
            this.bindCommunityVoicesServiceProvider = ul.b.c(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.singletonCImpl, 84);
            this.readsStreamingServiceProvider = switchingProvider5;
            this.bindStreamingServiceProvider = ul.b.c(switchingProvider5);
            this.provideDrmOkHttpClientProvider = ul.b.c(new SwitchingProvider(this.singletonCImpl, 85));
        }

        private ReaderApp injectReaderApp2(ReaderApp readerApp) {
            ReaderApp_MembersInjector.injectInstallIntegrityCheck(readerApp, (InstallIntegrityCheck) this.installIntegrityCheckProvider.get());
            ReaderApp_MembersInjector.injectCurrentActivityProvider(readerApp, (CurrentActivityProvider) this.currentActivityProviderImplProvider.get());
            return readerApp;
        }

        public AccountAPI accountAPI() {
            return NetworkModule_AccountApiFactory.accountApi((s0) this.provideRetrofitProvider.get());
        }

        public AssistantAPI assistantAPI() {
            return NetworkModule_AssistantApiFactory.assistantApi((s0) this.provideRetrofitProvider.get());
        }

        public AssistantPreferencesServiceImpl assistantPreferencesServiceImpl() {
            return new AssistantPreferencesServiceImpl(userSharedPreferencesSharedPreferences(), (UserConfigService) this.bindUserConfigServiceProvider.get());
        }

        public AssistantServiceImpl assistantServiceImpl() {
            return new AssistantServiceImpl(assistantAPI());
        }

        public AuthorApi authorApi() {
            return NetworkModule_AuthorApiFactory.authorApi((s0) this.provideRetrofitProvider.get());
        }

        public AuthorServiceImpl authorServiceImpl() {
            return new AuthorServiceImpl(authorApi(), (Logger) this.loggerProvider.get());
        }

        public BookmarksDao bookmarksDao() {
            return DatabaseModule_ProvideBookmarksDaoFactory.provideBookmarksDao((AppDatabase) this.provideDatabaseProvider.get());
        }

        public CertificateMismatchReporter certificateMismatchReporter() {
            return AnalyticsModule_Companion_ProvideCertificateMismatchReporterFactory.provideCertificateMismatchReporter(ul.b.a(this.bindPostHogAnalyticsProvider));
        }

        public CollectionsAPI collectionsAPI() {
            return NetworkModule_CollectionsApiFactory.collectionsApi((s0) this.provideRetrofitProvider.get());
        }

        public CollectionsDao collectionsDao() {
            return DatabaseModule_ProvideCollectionsDaoFactory.provideCollectionsDao((AppDatabase) this.provideDatabaseProvider.get());
        }

        public CommunityVoicesApi communityVoicesApi() {
            return NetworkModule_CommunityVoicesApiFactory.communityVoicesApi((s0) this.provideRetrofitProvider.get());
        }

        public ConfigAPI configAPI() {
            return NetworkModule_ConfigApiFactory.configApi((s0) this.provideRetrofitProvider.get());
        }

        public ConsumptionAPI consumptionAPI() {
            return NetworkModule_ConsumptionApiFactory.consumptionApi((s0) this.provideRetrofitProvider.get());
        }

        public ConsumptionSpanDao consumptionSpanDao() {
            return DatabaseModule_ProvideConsumptionSpanDaoFactory.provideConsumptionSpanDao((AppDatabase) this.provideDatabaseProvider.get());
        }

        public CustomerAPI customerAPI() {
            return NetworkModule_CustomerApiFactory.customerApi((s0) this.provideRetrofitProvider.get());
        }

        public DrmAPI drmAPI() {
            return NetworkModule_DrmApiFactory.drmApi((s0) this.provideRetrofitProvider.get());
        }

        public ExploreCollectionsAPI exploreCollectionsAPI() {
            return NetworkModule_ExploreCollectionsApiFactory.exploreCollectionsApi((s0) this.provideRetrofitProvider.get());
        }

        public ExploreCollectionsServiceImpl exploreCollectionsServiceImpl() {
            return new ExploreCollectionsServiceImpl(exploreCollectionsAPI(), (Logger) this.loggerProvider.get());
        }

        public ExploreVoiceCollectionsApi exploreVoiceCollectionsApi() {
            return NetworkModule_ExploreVoiceCollectionsApiFactory.exploreVoiceCollectionsApi((s0) this.provideRetrofitProvider.get());
        }

        public ExploreVoicesApi exploreVoicesApi() {
            return NetworkModule_ExploreVoicesApiFactory.exploreVoicesApi((s0) this.provideRetrofitProvider.get());
        }

        public ExploreVoicesServiceImpl exploreVoicesServiceImpl() {
            return new ExploreVoicesServiceImpl(exploreVoicesApi(), exploreVoiceCollectionsApi(), voicesDao(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), new ConcurrentHashMapMemoryCache());
        }

        public FavoriteVoicesApi favoriteVoicesApi() {
            return NetworkModule_FavoriteVoicesApiFactory.favoriteVoicesApi((s0) this.provideRetrofitProvider.get());
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public ConsumptionRepository getConsumptionRepository() {
            return (ConsumptionRepository) this.consumptionRepositoryProvider.get();
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.SingletonC
        public Set<Boolean> getDisableFragmentGetContextFix() {
            int i10 = w0.f11529c;
            return d2.f11407y0;
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public Logger getLogger() {
            return (Logger) this.loggerProvider.get();
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public NotificationService getNotificationService() {
            return (NotificationService) this.notificationServiceImplProvider.get();
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public OfflineDrmLicenseHelper getOfflineDrmLicenseHelper() {
            return (OfflineDrmLicenseHelper) this.offlineDrmLicenseHelperProvider.get();
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public OfflineMediaDownloader getOfflineMediaDownloader() {
            return new OfflineMediaDownloader(getOfflineReadsDao(), readsDao(), (MediaManifestService) this.mediaManifestServiceImplProvider.get(), (v) this.provideSimpleCacheProvider.get(), (Configuration) this.configurationProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.bindPostHogAnalyticsProvider.get(), (OfflineDrmLicenseHelper) this.offlineDrmLicenseHelperProvider.get());
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public OfflineReadsDao getOfflineReadsDao() {
            return DatabaseModule_ProvideOfflineReadsDaoFactory.provideOfflineReadsDao((AppDatabase) this.provideDatabaseProvider.get());
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public OfflineReadsDownloader getOfflineReadsDownloader() {
            Context context = this.applicationContextModule.f30240a;
            m0.n(context);
            return new OfflineReadsDownloader(context, getOfflineReadsDao(), readsDao(), readsAPI(), readsUploadAPI(), readsDownloadAPI(), (AppCheckTokenService) this.bindAppCheckTokenServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer(), (Analytics) this.bindPostHogAnalyticsProvider.get());
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public OfflineReadsService getOfflineReadsService() {
            return (OfflineReadsService) this.bindOfflineReadsServiceProvider.get();
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public ReadBookmarkService getReadBookmarkService() {
            return (ReadBookmarkService) this.bindReadBookmarkServiceProvider.get();
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public ReadsServiceImpl getReadsService() {
            FileService fileService = (FileService) this.androidFileServiceProvider.get();
            ReadsUploadAPI readsUploadAPI = readsUploadAPI();
            ReadsDao readsDao = readsDao();
            Logger logger = (Logger) this.loggerProvider.get();
            ReadsAPI readsAPI = readsAPI();
            DispatcherFactory dispatcherFactory = (DispatcherFactory) this.dispatcherFactoryProvider.get();
            vr.c provideJsonSerializer = NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer();
            d0 applicationCoroutineScope = CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope();
            SharedPreferences userSharedPreferencesSharedPreferences = userSharedPreferencesSharedPreferences();
            Configuration configuration = (Configuration) this.configurationProvider.get();
            AppCheckTokenService appCheckTokenService = (AppCheckTokenService) this.bindAppCheckTokenServiceProvider.get();
            AnonCaptchaTokenService anonCaptchaTokenService = (AnonCaptchaTokenService) this.anonCaptchaTokenServiceImplProvider.get();
            Context context = this.applicationContextModule.f30240a;
            m0.n(context);
            return new ReadsServiceImpl(fileService, readsUploadAPI, readsDao, logger, readsAPI, dispatcherFactory, provideJsonSerializer, applicationCoroutineScope, userSharedPreferencesSharedPreferences, configuration, appCheckTokenService, anonCaptchaTokenService, context, (ConnectivityService) this.bindConnectivityServiceProvider.get(), (Analytics) this.bindPostHogAnalyticsProvider.get(), readMetadataSaverImpl(), optimizedReadCache(), new OptimizedReadSplitter(), (ChapterContentMemoryCache) this.chapterContentMemoryCacheProvider.get());
        }

        @Override // io.elevenlabs.di.WorkerEntryPoint
        public UserConfigService getUserConfigService() {
            return (UserConfigService) this.bindUserConfigServiceProvider.get();
        }

        public SharedPreferences globalSharedPreferencesSharedPreferences() {
            Context context = this.applicationContextModule.f30240a;
            m0.n(context);
            return PreferencesModule_GlobalSharedPreferencesFactory.globalSharedPreferences(context);
        }

        public GooglePlayAPI googlePlayAPI() {
            return NetworkModule_GooglePlayApiFactory.googlePlayApi((s0) this.provideRetrofitProvider.get());
        }

        public HomeAPI homeAPI() {
            return NetworkModule_HomeApiFactory.homeApi((s0) this.provideRetrofitProvider.get());
        }

        public HomeServiceImpl homeServiceImpl() {
            return new HomeServiceImpl(homeAPI());
        }

        public InAppPurchasesService inAppPurchasesService() {
            jl.a a10 = ul.b.a(this.provideRevenueCatPaymentsProvider);
            jl.a a11 = ul.b.a(this.bindCustomerServiceProvider);
            jl.a a12 = ul.b.a(this.restGooglePlayServiceProvider);
            jl.a a13 = ul.b.a(this.bindPostHogAnalyticsProvider);
            DispatcherFactory dispatcherFactory = (DispatcherFactory) this.dispatcherFactoryProvider.get();
            Logger logger = (Logger) this.loggerProvider.get();
            d0 applicationCoroutineScope = CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope();
            Context context = this.applicationContextModule.f30240a;
            m0.n(context);
            return new InAppPurchasesService(a10, a11, a12, a13, dispatcherFactory, logger, applicationCoroutineScope, context);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_GeneratedInjector
        public void injectReaderApp(ReaderApp readerApp) {
            injectReaderApp2(readerApp);
        }

        public InterestsAPI interestsAPI() {
            return NetworkModule_InterestsApiFactory.interestsApi((s0) this.provideRetrofitProvider.get());
        }

        public InterestsServiceImpl interestsServiceImpl() {
            return new InterestsServiceImpl(interestsAPI());
        }

        public LocalAppRatingService localAppRatingService() {
            return new LocalAppRatingService(userSharedPreferencesSharedPreferences());
        }

        public MediaAPI mediaAPI() {
            return NetworkModule_MediaApiFactory.mediaApi((s0) this.provideRetrofitProvider.get());
        }

        public MediaItemCreator mediaItemCreator() {
            return new MediaItemCreator((Configuration) this.configurationProvider.get(), (Logger) this.loggerProvider.get());
        }

        public MessagesAPI messagesAPI() {
            return NetworkModule_MessagesApiFactory.messagesApi((s0) this.provideRetrofitProvider.get());
        }

        public NotificationsApi notificationsApi() {
            return NetworkModule_NotificationsApiFactory.notificationsApi((s0) this.provideRetrofitProvider.get());
        }

        public OnboardingAPI onboardingAPI() {
            return NetworkModule_OnboardingApiFactory.onboardingApi((s0) this.provideRetrofitProvider.get());
        }

        public OptimizedReadCache optimizedReadCache() {
            return new OptimizedReadCache((FileService) this.androidFileServiceProvider.get());
        }

        public PasswordResetAPI passwordResetAPI() {
            return NetworkModule_PasswordResetApiFactory.passwordResetApi((s0) this.provideRetrofitProvider.get());
        }

        public PersistentPlayerQueueDao persistentPlayerQueueDao() {
            return DatabaseModule_ProvidePersistentPlayerQueueDaoFactory.providePersistentPlayerQueueDao((AppDatabase) this.provideDatabaseProvider.get());
        }

        public PersistentPlayerQueueServiceImpl persistentPlayerQueueServiceImpl() {
            return new PersistentPlayerQueueServiceImpl(persistentPlayerQueueDao(), (ReadsService) this.bindReadsServiceProvider.get());
        }

        public PlayPronunciationPreviewUseCaseImpl playPronunciationPreviewUseCaseImpl() {
            return new PlayPronunciationPreviewUseCaseImpl((PronunciationsService) this.pronunciationsServiceImplProvider.get(), (AudioPreviewService) this.bindAudioPreviewPlayerServiceProvider.get(), (ToastService) this.bindToastServiceProvider.get(), resolveErrorMessageUseCaseImpl(), (Logger) this.loggerProvider.get());
        }

        public PlayerPagerTeaserServiceImpl playerPagerTeaserServiceImpl() {
            return new PlayerPagerTeaserServiceImpl(userSharedPreferencesSharedPreferences());
        }

        public ProductsAPI productsAPI() {
            return NetworkModule_ProductsApiFactory.productsApi((s0) this.provideRetrofitProvider.get());
        }

        public PronunciationsAPI pronunciationsAPI() {
            return NetworkModule_PronunciationApiFactory.pronunciationApi((s0) this.provideRetrofitProvider.get());
        }

        public ReadBookmarksAPI readBookmarksAPI() {
            return NetworkModule_ReadBookmarksApiFactory.readBookmarksApi((s0) this.provideRetrofitProvider.get());
        }

        public ReadBookmarksVideoAPI readBookmarksVideoAPI() {
            return NetworkModule_ReadBookmarksVideoApiFactory.readBookmarksVideoApi((s0) this.provideUploadRetrofitProvider.get());
        }

        public ReadMetadataSaverImpl readMetadataSaverImpl() {
            return new ReadMetadataSaverImpl(readsDao());
        }

        public ReadsAPI readsAPI() {
            return NetworkModule_ReadsApiFactory.readsApi((s0) this.provideRetrofitProvider.get());
        }

        public ReadsDao readsDao() {
            return DatabaseModule_ProvideReadsDaoFactory.provideReadsDao((AppDatabase) this.provideDatabaseProvider.get());
        }

        public ReadsDownloadAPI readsDownloadAPI() {
            return NetworkModule_ReadsDownloadApiFactory.readsDownloadApi((s0) this.provideDownloadRetrofitProvider.get());
        }

        public ReadsExploreSearchAPI readsExploreSearchAPI() {
            return NetworkModule_ReadsExploreSearchApiFactory.readsExploreSearchApi((s0) this.provideRetrofitProvider.get());
        }

        public ReadsStreamingAPI readsStreamingAPI() {
            return new ReadsStreamingAPI((OkHttpClient) this.provideOkHttpClientProvider.get(), (Logger) this.loggerProvider.get(), NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer());
        }

        public ReadsUploadAPI readsUploadAPI() {
            return NetworkModule_ReadsUploadApiFactory.readsUploadApi((s0) this.provideUploadRetrofitProvider.get());
        }

        public RecentVoicesApi recentVoicesApi() {
            return NetworkModule_RecentVoicesApiFactory.recentVoicesApi((s0) this.provideRetrofitProvider.get());
        }

        public RecentVoicesDao recentVoicesDao() {
            return DatabaseModule_ProvideRecentVoicesDaoFactory.provideRecentVoicesDao((AppDatabase) this.provideDatabaseProvider.get());
        }

        public ReferralAPI referralAPI() {
            return NetworkModule_ReferralApiFactory.referralApi((s0) this.provideRetrofitProvider.get());
        }

        public ReferralServiceImpl referralServiceImpl() {
            return new ReferralServiceImpl(referralAPI(), (AppCheckTokenService) this.bindAppCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.anonCaptchaTokenServiceImplProvider.get(), (Logger) this.loggerProvider.get());
        }

        public ResolveErrorMessageUseCaseImpl resolveErrorMessageUseCaseImpl() {
            return new ResolveErrorMessageUseCaseImpl((StringProvider) this.stringProvider.get());
        }

        public RestAccountService restAccountService() {
            return new RestAccountService(accountAPI());
        }

        public RestProductsService restProductsService() {
            return new RestProductsService(productsAPI(), (PurchasesService) this.provideProductsServiceProvider.get(), (Logger) this.loggerProvider.get());
        }

        public ResultCallAdapterFactory resultCallAdapterFactory() {
            return new ResultCallAdapterFactory(NetworkModule_ProvideJsonSerializerFactory.provideJsonSerializer(), (Logger) this.loggerProvider.get());
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.SingletonC, ql.c
        public ol.b retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.singletonCImpl, 0);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.SingletonC, ql.j
        public ol.d serviceComponentBuilder() {
            return new ServiceCBuilder(this.singletonCImpl, 0);
        }

        public SignUpAPI signUpAPI() {
            return NetworkModule_SignUpApiFactory.signUpApi((s0) this.provideRetrofitProvider.get());
        }

        public SoundscapesAPI soundscapesAPI() {
            return NetworkModule_SoundscapesApiFactory.soundscapesApi((s0) this.provideRetrofitProvider.get());
        }

        public StoreCountryCodeRecordingServiceImpl storeCountryCodeRecordingServiceImpl() {
            Context context = this.applicationContextModule.f30240a;
            m0.n(context);
            return new StoreCountryCodeRecordingServiceImpl(context, (UserConfigService) this.bindUserConfigServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), CoroutinesModule_ApplicationCoroutineScopeFactory.applicationCoroutineScope());
        }

        public StreamingAPI streamingAPI() {
            return NetworkModule_StreamingApiFactory.streamingApi(readsStreamingAPI());
        }

        public SupportAgentAPI supportAgentAPI() {
            return NetworkModule_SupportAgentApiFactory.supportAgentApi((s0) this.provideRetrofitProvider.get());
        }

        public SupportAgentServiceImpl supportAgentServiceImpl() {
            return new SupportAgentServiceImpl(supportAgentAPI());
        }

        public SharedPreferences userSharedPreferencesSharedPreferences() {
            Context context = this.applicationContextModule.f30240a;
            m0.n(context);
            return PreferencesModule_UserSharedPreferencesFactory.userSharedPreferences(context);
        }

        public VoiceDesignAPI voiceDesignAPI() {
            return NetworkModule_VoiceDesignApiFactory.voiceDesignApi((s0) this.provideRetrofitProvider.get());
        }

        public VoiceDesignServiceImpl voiceDesignServiceImpl() {
            return new VoiceDesignServiceImpl(voiceDesignAPI(), (AppCheckTokenService) this.bindAppCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.anonCaptchaTokenServiceImplProvider.get(), (Logger) this.loggerProvider.get());
        }

        public VoicesAPI voicesAPI() {
            return NetworkModule_VoicesApiFactory.voicesApi((s0) this.provideRetrofitProvider.get());
        }

        public VoicesDao voicesDao() {
            return DatabaseModule_ProvideVoicesDaoFactory.provideVoicesDao((AppDatabase) this.provideDatabaseProvider.get());
        }

        public WhatsNewServiceImpl whatsNewServiceImpl() {
            return new WhatsNewServiceImpl(userSharedPreferencesSharedPreferences());
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ViewCImpl extends ReaderApp_HiltComponents.ViewC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewCImpl viewCImpl = this;

        public ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View view) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ViewModelCImpl extends ReaderApp_HiltComponents.ViewModelC {
        ul.f accountViewModelProvider;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        ul.f addReadToCollectionViewModelProvider;
        ul.f addReadsToCollectionViewModelProvider;
        ul.f addSharedReadViewModelProvider;
        ul.f appCompatibilityViewModelProvider;
        ul.f askAgentViewModelProvider;
        ul.f askAssistantViewModelProvider;
        ul.f authViewModelProvider;
        ul.f authorProfileViewModelProvider;
        ul.f bookPurchasesViewModelProvider;
        ul.f bookRefundViewModelProvider;
        ul.f bookmarkShareDetailsViewModelProvider;
        ul.f bookmarkViewModelProvider;
        ul.f collectionViewModelProvider;
        ul.f configViewModelProvider;
        ul.f contentPreferencesViewModelProvider;
        ul.f contentSearchViewModelProvider;
        ul.f createCollectionViewModelProvider;
        ul.f dailyStreakSettingsViewModelProvider;
        ul.f deleteAccountViewModelProvider;
        ul.f downloadsViewModelProvider;
        ul.f editBookmarkViewModelProvider;
        ul.f editCollectionViewModelProvider;
        ul.f exploreCollectionViewModelProvider;
        ul.f exploreLanguageSettingScreenViewModelProvider;
        ul.f exploreViewModelProvider;
        ul.f factoryProvider;
        ul.f factoryProvider2;
        ul.f factoryProvider3;
        ul.f followedSeriesViewModelProvider;
        ul.f genFMLoadingViewModelProvider;
        ul.f homeViewModelV3Provider;
        ul.f homeViewModelV4Provider;
        ul.f hoursHistoryViewModelProvider;
        ul.f hoursLowViewModelProvider;
        ul.f importContentBrowserSurveyViewModelProvider;
        ul.f importFileViewModelProvider;
        ul.f importLinkViewModelProvider;
        ul.f libraryViewModelProvider;
        ul.f lowDiskSpaceViewModelProvider;
        ul.f manageContentInterestsViewModelProvider;
        ul.f managePurchasesViewModelProvider;
        ul.f mfaVerificationViewModelProvider;
        ul.f miniPlayerViewModelProvider;
        ul.f notificationPrimerViewModelProvider;
        ul.f notificationViewModelProvider;
        ul.f ocrImportViewModelProvider;
        ul.f onboardingViewModelProvider;
        ul.f pasteLinkViewModelProvider;
        ul.f playerPreferencesViewModelProvider;
        ul.f playerViewModelProvider;
        ul.f pronunciationViewModelProvider;
        ul.f pronunciationsListViewModelProvider;
        ul.f purchaseHoursViewModelProvider;
        ul.f rateTitleViewModelProvider;
        ul.f readBookmarksViewModelProvider;
        ul.f readDetailsViewModelProvider;
        ul.f readLinkShareViewModelProvider;
        ul.f readShareDetailsViewModelProvider;
        ul.f readShareOptionsViewModelProvider;
        ul.f referFriendViewModelProvider;
        ul.f reportProblemViewModelProvider;
        ul.f revenueCatPaywallViewModelProvider;
        ul.f routerViewModelProvider;
        private final z0 savedStateHandle;
        ul.f searchViewModelProvider;
        ul.f showImportingContentToastProvider;
        private final SingletonCImpl singletonCImpl;
        ul.f sleepTimerViewModelProvider;
        ul.f soundscapesViewModelProvider;
        ul.f surveyViewModelProvider;
        ul.f toastViewModelProvider;
        ul.f useFriendReferralViewModelProvider;
        ul.f verifyEmailViewModelProvider;
        private final ViewModelCImpl viewModelCImpl = this;
        ul.f voiceDesignViewModelProvider;
        ul.f voiceDetailsViewModelProvider;
        ul.f voicePickerCreatedViewModelProvider;
        ul.f voicePickerExploreViewModelProvider;
        ul.f voicePickerFavoritesViewModelProvider;
        ul.f voicePickerFilteredListViewModelProvider;
        ul.f voicePickerRecentsViewModelProvider;
        ul.f voicePickerSearchListViewModelProvider;
        ul.f writeViewModelProvider;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        /* loaded from: classes3.dex */
        public static final class SwitchingProvider<T> implements ul.f {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f14339id;
            private final SingletonCImpl singletonCImpl;
            private final ViewModelCImpl viewModelCImpl;

            public SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int i10) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.viewModelCImpl = viewModelCImpl;
                this.f14339id = i10;
            }

            @Override // rn.a
            public T get() {
                int i10 = this.f14339id;
                switch (i10) {
                    case 0:
                        return (T) new AccountViewModel(ul.b.a(this.singletonCImpl.bindAuthServiceProvider), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), ul.b.a(this.singletonCImpl.restPasswordResetServiceProvider), ul.b.a(this.singletonCImpl.bindToastServiceProvider), ul.b.a(this.singletonCImpl.stringProvider), (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (AppConfigService) this.singletonCImpl.bindAppConfigServiceProvider.get(), this.singletonCImpl.restAccountService(), (OfflineReadsService) this.singletonCImpl.bindOfflineReadsServiceProvider.get(), (PurchasesService) this.singletonCImpl.provideProductsServiceProvider.get());
                    case 1:
                        return (T) new AddReadToCollectionViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (CollectionsService) this.singletonCImpl.collectionsServiceImplProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (StringProvider) this.singletonCImpl.stringProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 2:
                        return (T) new AddReadsToCollectionViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (CollectionsService) this.singletonCImpl.collectionsServiceImplProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get());
                    case 3:
                        return (T) new AddSharedReadViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl());
                    case 4:
                        return (T) new AppCompatibilityViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (AppCheckTokenService) this.singletonCImpl.bindAppCheckTokenServiceProvider.get(), (AppCompatibilityDialogService) this.singletonCImpl.bindAppCompatibilityDialogServiceProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get());
                    case 5:
                        return (T) new AskAgentViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (AssistantSessionService) this.singletonCImpl.assistantSessionManagerProvider.get(), (AgentContextService) this.singletonCImpl.agentContextServiceImplProvider.get(), this.singletonCImpl.supportAgentServiceImpl(), (SupportToolEvents) this.singletonCImpl.supportToolEventsImplProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 6:
                        return (T) new AskAssistantViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), this.singletonCImpl.assistantPreferencesServiceImpl(), ul.b.a(this.singletonCImpl.runtimePermissionsServiceImplProvider), (AssistantSessionService) this.singletonCImpl.assistantSessionManagerProvider.get());
                    case 7:
                        return (T) new AuthViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), ul.b.a(this.singletonCImpl.bindAuthServiceProvider), ul.b.a(this.singletonCImpl.stringProvider), ul.b.a(this.singletonCImpl.bindToastServiceProvider), ul.b.a(this.singletonCImpl.restPasswordResetServiceProvider), new PasswordValidatorServiceImpl(), ul.b.a(this.singletonCImpl.restSignUpServiceProvider), (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl());
                    case 8:
                        return (T) new AuthorProfileViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.singletonCImpl.authorServiceImpl(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (NotificationPermissionService) this.singletonCImpl.bindNotificationPermissionServiceProvider.get());
                    case 9:
                        return (T) new BookPurchasesViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl());
                    case 10:
                        return (T) new BookRefundViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), ul.b.a(this.singletonCImpl.bindCustomerServiceProvider), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get());
                    case 11:
                        return (T) new BookmarkShareDetailsViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadBookmarkService) this.singletonCImpl.bindReadBookmarkServiceProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 12:
                        return (T) new BookmarkViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadBookmarkService) this.singletonCImpl.bindReadBookmarkServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 13:
                        return (T) new CollectionViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (CollectionsService) this.singletonCImpl.collectionsServiceImplProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (OfflineReadsService) this.singletonCImpl.bindOfflineReadsServiceProvider.get(), ul.b.a(this.singletonCImpl.downloadReadUseCaseImplProvider), (StringProvider) this.singletonCImpl.stringProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 14:
                        return (T) new ConfigViewModel(ul.b.a(this.singletonCImpl.bindAppConfigServiceProvider), ul.b.a(this.singletonCImpl.bindCustomerServiceProvider), ul.b.a(this.singletonCImpl.bindUserConfigServiceProvider), ul.b.a(this.singletonCImpl.bindAuthServiceProvider), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 15:
                        return (T) new ContentPreferencesViewModel(this.singletonCImpl.assistantPreferencesServiceImpl(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 16:
                        return (T) new ContentSearchViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), ul.b.a(this.singletonCImpl.bindReadsServiceProvider));
                    case 17:
                        return (T) new CreateCollectionViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (CollectionsService) this.singletonCImpl.collectionsServiceImplProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (StringProvider) this.singletonCImpl.stringProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 18:
                        return (T) new DailyStreakSettingsViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (UserConfigService) this.singletonCImpl.bindUserConfigServiceProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 19:
                        return (T) new DeleteAccountViewModel((AuthService) this.singletonCImpl.bindAuthServiceProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 20:
                        return (T) new DownloadsViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), (OfflineReadsService) this.singletonCImpl.bindOfflineReadsServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 21:
                        return (T) new EditBookmarkViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadBookmarkService) this.singletonCImpl.bindReadBookmarkServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 22:
                        return (T) new EditCollectionViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (CollectionsService) this.singletonCImpl.collectionsServiceImplProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get());
                    case 23:
                        return (T) new ExploreCollectionViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.singletonCImpl.exploreCollectionsServiceImpl(), (ReadsExploreService) this.singletonCImpl.readsExploreServiceImplProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), (PurchasesService) this.singletonCImpl.provideProductsServiceProvider.get(), (AudioPreviewService) this.singletonCImpl.bindAudioPreviewPlayerServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 24:
                        return (T) new ExploreLanguageSettingScreenViewModel((ReadsExploreService) this.singletonCImpl.readsExploreServiceImplProvider.get(), (UserConfigService) this.singletonCImpl.bindUserConfigServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Logger) this.singletonCImpl.loggerProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 25:
                        return (T) new ExploreViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsExploreService) this.singletonCImpl.readsExploreServiceImplProvider.get(), (UserConfigService) this.singletonCImpl.bindUserConfigServiceProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), (PurchasesService) this.singletonCImpl.provideProductsServiceProvider.get(), (AudioPreviewService) this.singletonCImpl.bindAudioPreviewPlayerServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 26:
                        return (T) new FollowedSeriesViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (CollectionsService) this.singletonCImpl.collectionsServiceImplProvider.get());
                    case 27:
                        return (T) new GenFMLoadingViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (StringProvider) this.singletonCImpl.stringProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 28:
                        return (T) new HomeViewModelV3((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.singletonCImpl.homeServiceImpl(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (UserConfigService) this.singletonCImpl.bindUserConfigServiceProvider.get(), (CollectionsService) this.singletonCImpl.collectionsServiceImplProvider.get(), (NavigationService) this.singletonCImpl.navigationServiceImplProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), this.singletonCImpl.whatsNewServiceImpl(), (Configuration) this.singletonCImpl.configurationProvider.get(), (NotificationPermissionService) this.singletonCImpl.bindNotificationPermissionServiceProvider.get(), (RuntimePermissionsService) this.singletonCImpl.runtimePermissionsServiceImplProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (PurchasesService) this.singletonCImpl.provideProductsServiceProvider.get());
                    case 29:
                        return (T) new HomeViewModelV4((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.singletonCImpl.homeServiceImpl(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (UserConfigService) this.singletonCImpl.bindUserConfigServiceProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), (AuthService) this.singletonCImpl.bindAuthServiceProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), this.singletonCImpl.whatsNewServiceImpl(), (Configuration) this.singletonCImpl.configurationProvider.get(), (NotificationPermissionService) this.singletonCImpl.bindNotificationPermissionServiceProvider.get(), (RuntimePermissionsService) this.singletonCImpl.runtimePermissionsServiceImplProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (PurchasesService) this.singletonCImpl.provideProductsServiceProvider.get(), (AudioPreviewService) this.singletonCImpl.bindAudioPreviewPlayerServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 30:
                        return (T) new HoursHistoryViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl());
                    case 31:
                        return (T) new HoursLowViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), this.singletonCImpl.restProductsService(), this.viewModelCImpl.purchaseAndRefreshCreditsUseCase(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 32:
                        return (T) new ImportContentBrowserSurveyViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 33:
                        return (T) new ImportFileViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), ul.b.a(this.singletonCImpl.bindReadsServiceProvider), (Logger) this.singletonCImpl.loggerProvider.get(), ul.b.a(this.singletonCImpl.androidFileServiceProvider), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), ul.b.a(this.viewModelCImpl.showImportingContentToastProvider), (NotificationPermissionService) this.singletonCImpl.bindNotificationPermissionServiceProvider.get(), ul.b.a(this.singletonCImpl.bindToastServiceProvider), (StringProvider) this.singletonCImpl.stringProvider.get());
                    case 34:
                        return (T) new ShowImportingContentToast((ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get());
                    case 35:
                        return (T) new ImportLinkViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), ul.b.a(this.singletonCImpl.bindReadsServiceProvider), ul.b.a(this.singletonCImpl.stringProvider), (FileService) this.singletonCImpl.androidFileServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), ul.b.a(this.viewModelCImpl.showImportingContentToastProvider));
                    case 36:
                        return (T) new LibraryViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), ul.b.a(this.singletonCImpl.bindReadsServiceProvider), ul.b.a(this.singletonCImpl.bindOfflineReadsServiceProvider), ul.b.a(this.singletonCImpl.collectionsServiceImplProvider), ul.b.a(this.singletonCImpl.downloadReadUseCaseImplProvider), (StringProvider) this.singletonCImpl.stringProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 37:
                        return (T) new LowDiskSpaceViewModel(rl.b.a(this.singletonCImpl.applicationContextModule), (Logger) this.singletonCImpl.loggerProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 38:
                        return (T) new ManageContentInterestsViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.singletonCImpl.interestsServiceImpl(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 39:
                        return (T) new ManagePurchasesViewModel((PurchasesService) this.singletonCImpl.provideProductsServiceProvider.get(), ul.b.a(this.singletonCImpl.bindToastServiceProvider), ul.b.a(this.singletonCImpl.stringProvider), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 40:
                        return (T) new MfaVerificationViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), (MfaService) this.singletonCImpl.mfaServiceImplProvider.get(), (AuthService) this.singletonCImpl.bindAuthServiceProvider.get(), new VerifyPhoneNumberForMfaUseCaseImpl());
                    case 41:
                        return (T) new MiniPlayerViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), (PlayerVisibilityService) this.singletonCImpl.bindPlayerVisibilityServiceProvider.get());
                    case 42:
                        return (T) new NotificationPrimerViewModel((Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (NotificationPermissionService) this.singletonCImpl.bindNotificationPermissionServiceProvider.get());
                    case 43:
                        Context context = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context);
                        return (T) new NotificationViewModel(context, ul.b.a(this.singletonCImpl.notificationServiceImplProvider), (AppConfigService) this.singletonCImpl.bindAppConfigServiceProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 44:
                        DispatcherFactory dispatcherFactory = (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get();
                        jl.a a10 = ul.b.a(this.singletonCImpl.bindReadsServiceProvider);
                        Analytics analytics = (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get();
                        FileService fileService = (FileService) this.singletonCImpl.androidFileServiceProvider.get();
                        jl.a a11 = ul.b.a(this.singletonCImpl.bindToastServiceProvider);
                        Logger logger = (Logger) this.singletonCImpl.loggerProvider.get();
                        ResolveErrorMessageUseCaseImpl resolveErrorMessageUseCaseImpl = this.singletonCImpl.resolveErrorMessageUseCaseImpl();
                        jl.a a12 = ul.b.a(this.singletonCImpl.recognizeDocumentTextUseCaseProvider);
                        Context context2 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context2);
                        return (T) new OcrImportViewModel(dispatcherFactory, a10, analytics, fileService, a11, logger, resolveErrorMessageUseCaseImpl, a12, context2);
                    case 45:
                        return (T) new OnboardingViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), ul.b.a(this.singletonCImpl.onboardingServiceImplProvider), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), ul.b.a(this.singletonCImpl.bindAudioPreviewPlayerServiceProvider), ul.b.a(this.singletonCImpl.bindVoicesServiceProvider), ul.b.a(this.singletonCImpl.bindToastServiceProvider), ul.b.a(this.singletonCImpl.stringProvider), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (RecentVoicesService) this.singletonCImpl.bindRecentVoicesServiceProvider.get(), ul.b.a(this.singletonCImpl.provideRevenueCatPaymentsProvider), ul.b.a(this.singletonCImpl.bindCustomerServiceProvider), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 46:
                        return (T) new PasteLinkViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), ul.b.a(this.singletonCImpl.stringProvider));
                    case 47:
                        return (T) new PlayerPreferencesViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (UserConfigService) this.singletonCImpl.bindUserConfigServiceProvider.get(), (PlayerPreferencesService) this.singletonCImpl.bindPlayerPreferencesServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                        return (T) new PlayerViewModel(ul.b.a(this.singletonCImpl.backgroundPlayerControllerServiceProvider), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), ul.b.a(this.singletonCImpl.bindReadsServiceProvider), ul.b.a(this.singletonCImpl.bindReadBookmarkServiceProvider), ul.b.a(this.singletonCImpl.bindVoicesServiceProvider), this.singletonCImpl.localAppRatingService(), (UserConfigService) this.singletonCImpl.bindUserConfigServiceProvider.get(), ul.b.a(this.singletonCImpl.bindOfflineReadsServiceProvider), (PronunciationsService) this.singletonCImpl.pronunciationsServiceImplProvider.get(), new GetCurrentTimeUseCaseImpl(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), new GetCharacterOffsetsFromHtmlRowUseCase(), new GetTextFromHtmlRowUseCase(), new GetBookmarkWindowUseCase(), new MediaAudioPositionResolver(), this.viewModelCImpl.isAudioBookmarksAllowedUseCase(), new IsScreenRecordingAllowedUseCase(), ul.b.a(this.singletonCImpl.downloadReadUseCaseImplProvider), this.singletonCImpl.playPronunciationPreviewUseCaseImpl(), ul.b.a(this.singletonCImpl.navigationServiceImplProvider), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get(), (CharacterReportingService) this.singletonCImpl.characterReportingServiceImplProvider.get(), (Configuration) this.singletonCImpl.configurationProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), ul.b.a(this.singletonCImpl.stringProvider), (PlayerPreferencesService) this.singletonCImpl.bindPlayerPreferencesServiceProvider.get(), (FeatureFlagService) this.singletonCImpl.postHogFeatureFlagServiceProvider.get(), this.singletonCImpl.assistantPreferencesServiceImpl(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), this.singletonCImpl.playerPagerTeaserServiceImpl(), (PlayerVisibilityService) this.singletonCImpl.bindPlayerVisibilityServiceProvider.get(), (PlayerSeekObserver) this.singletonCImpl.playerSeekMediatorProvider.get(), (PlayerSeekEmitter) this.singletonCImpl.playerSeekMediatorProvider.get());
                    case 49:
                        return (T) new PronunciationViewModel((PronunciationsService) this.singletonCImpl.pronunciationsServiceImplProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), this.singletonCImpl.playPronunciationPreviewUseCaseImpl(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 50:
                        return (T) new PronunciationsListViewModel((PronunciationsService) this.singletonCImpl.pronunciationsServiceImplProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), this.singletonCImpl.playPronunciationPreviewUseCaseImpl(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (VoicesService) this.singletonCImpl.bindVoicesServiceProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 51:
                        return (T) new PurchaseHoursViewModel(this.viewModelCImpl.savedStateHandle, (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.singletonCImpl.restProductsService(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), this.viewModelCImpl.purchaseAndRefreshCreditsUseCase(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 52:
                        return (T) new RateTitleViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl());
                    case 53:
                        DispatcherFactory dispatcherFactory2 = (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get();
                        ReadBookmarkService readBookmarkService = (ReadBookmarkService) this.singletonCImpl.bindReadBookmarkServiceProvider.get();
                        ToastService toastService = (ToastService) this.singletonCImpl.bindToastServiceProvider.get();
                        ReadsService readsService = (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get();
                        StringProvider stringProvider = (StringProvider) this.singletonCImpl.stringProvider.get();
                        Context context3 = this.singletonCImpl.applicationContextModule.f30240a;
                        m0.n(context3);
                        return (T) new ReadBookmarksViewModel(dispatcherFactory2, readBookmarkService, toastService, readsService, stringProvider, context3, (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 54:
                        return (T) new ReadDetailsViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (PurchasesService) this.singletonCImpl.provideProductsServiceProvider.get(), (AudioPreviewService) this.singletonCImpl.bindAudioPreviewPlayerServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), ul.b.a(this.singletonCImpl.navigationServiceImplProvider), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), ul.b.a(this.singletonCImpl.collectionsServiceImplProvider), (FeatureFlagService) this.singletonCImpl.postHogFeatureFlagServiceProvider.get());
                    case 55:
                        return (T) new ReadLinkShareViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 56:
                        return (T) new ReadShareDetailsViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get());
                    case 57:
                        return (T) new ReadShareOptionsViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get());
                    case 58:
                        return (T) new ReferFriendViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), this.singletonCImpl.referralServiceImpl());
                    case 59:
                        return (T) new ReportProblemViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (AppConfigService) this.singletonCImpl.bindAppConfigServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 60:
                        return (T) new RevenueCatPaywallViewModel(ul.b.a(this.singletonCImpl.provideRevenueCatPaymentsProvider), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (OnboardingService) this.singletonCImpl.onboardingServiceImplProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get());
                    case 61:
                        return (T) new RouterViewModel(ul.b.a(this.singletonCImpl.bindAuthServiceProvider), ul.b.a(this.singletonCImpl.onboardingServiceImplProvider), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), ul.b.a(this.singletonCImpl.bindReadsServiceProvider), ul.b.a(this.singletonCImpl.singularServiceImplProvider), ul.b.a(this.singletonCImpl.bindCustomerServiceProvider), ul.b.a(this.singletonCImpl.bindMessagesServiceProvider), (DevicePerformanceMeasurer) this.singletonCImpl.bindDevicePerformanceMeasurerProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), this.singletonCImpl.whatsNewServiceImpl(), (CrashlyticsLogger) this.singletonCImpl.crashlyticsLoggerProvider.get(), (FeatureFlagService) this.singletonCImpl.postHogFeatureFlagServiceProvider.get());
                    case 62:
                        return (T) new SearchViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (ReadsExploreService) this.singletonCImpl.readsExploreServiceImplProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), new GetCurrentTimeUseCaseImpl(), (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get());
                    case 63:
                        return (T) new SleepTimerViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ReadsService) this.singletonCImpl.bindReadsServiceProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), new GetCurrentTimeUseCaseImpl());
                    case 64:
                        return (T) new SoundscapesViewModel((SoundscapesService) this.singletonCImpl.bindSoundscapesServiceProvider.get(), (PlayerService) this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get());
                    case 65:
                        return (T) new SurveyViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 66:
                        return (T) new ToastViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get());
                    case 67:
                        return (T) new UseFriendReferralViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), this.singletonCImpl.referralServiceImpl(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), ul.b.a(this.singletonCImpl.onboardingServiceImplProvider), ul.b.a(this.singletonCImpl.bindCustomerServiceProvider));
                    case 68:
                        return (T) new VerifyEmailViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (SignUpService) this.singletonCImpl.restSignUpServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (StringProvider) this.singletonCImpl.stringProvider.get(), (AuthService) this.singletonCImpl.bindAuthServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 69:
                        return (T) new VoiceDesignViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.singletonCImpl.voiceDesignServiceImpl(), (VoicesService) this.singletonCImpl.bindVoicesServiceProvider.get(), (AudioPreviewService) this.singletonCImpl.bindAudioPreviewPlayerServiceProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (StringProvider) this.singletonCImpl.stringProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (VoiceDesignAudioStorage) this.singletonCImpl.voiceDesignAudioStorageProvider.get(), (ToastService) this.singletonCImpl.bindToastServiceProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get());
                    case 70:
                        return (T) new VoiceDetailsViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (FavoriteVoicesService) this.singletonCImpl.bindVoicesFavoritesServiceProvider.get(), ul.b.a(this.singletonCImpl.bindVoicesServiceProvider), ul.b.a(this.singletonCImpl.readsExploreServiceImplProvider), ul.b.a(this.singletonCImpl.stringProvider), ul.b.a(this.singletonCImpl.bindToastServiceProvider), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), ul.b.a(this.singletonCImpl.bindAudioPreviewPlayerServiceProvider), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                    case 71:
                        return (T) new VoicePickerCreatedViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get(), (VoicePickerSharedRepository) this.activityRetainedCImpl.voicePickerSharedRepositoryProvider.get(), (VoicesService) this.singletonCImpl.bindVoicesServiceProvider.get());
                    case 72:
                        return (T) new VoicePickerExploreViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), this.viewModelCImpl.voicePickerExploreStateMapper(), (VoicePickerSharedRepository) this.activityRetainedCImpl.voicePickerSharedRepositoryProvider.get(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get(), this.singletonCImpl.exploreVoicesServiceImpl(), (CommunityVoicesService) this.singletonCImpl.bindCommunityVoicesServiceProvider.get());
                    case 73:
                        return (T) new VoicePickerFavoritesViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get(), (VoicePickerSharedRepository) this.activityRetainedCImpl.voicePickerSharedRepositoryProvider.get(), (VoicesService) this.singletonCImpl.bindVoicesServiceProvider.get());
                    case 74:
                        return (T) new VoicePickerFilteredListViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (VoicePickerSharedRepository) this.activityRetainedCImpl.voicePickerSharedRepositoryProvider.get(), (CommunityVoicesService) this.singletonCImpl.bindCommunityVoicesServiceProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 75:
                        return (T) new VoicePickerRecentsViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), (ConnectivityService) this.singletonCImpl.bindConnectivityServiceProvider.get(), (VoicePickerSharedRepository) this.activityRetainedCImpl.voicePickerSharedRepositoryProvider.get(), (RecentVoicesService) this.singletonCImpl.bindRecentVoicesServiceProvider.get());
                    case 76:
                        return (T) new VoicePickerSearchListViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), this.viewModelCImpl.voicePickerSearchListStateMapper(), (VoicePickerSharedRepository) this.activityRetainedCImpl.voicePickerSharedRepositoryProvider.get(), (CommunityVoicesService) this.singletonCImpl.bindCommunityVoicesServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get());
                    case 77:
                        return (T) new WriteViewModel((DispatcherFactory) this.singletonCImpl.dispatcherFactoryProvider.get(), ul.b.a(this.singletonCImpl.bindReadsServiceProvider), ul.b.a(this.singletonCImpl.bindToastServiceProvider), (FileService) this.singletonCImpl.androidFileServiceProvider.get(), (Logger) this.singletonCImpl.loggerProvider.get(), (Analytics) this.singletonCImpl.bindPostHogAnalyticsProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl(), ul.b.a(this.viewModelCImpl.showImportingContentToastProvider));
                    case 78:
                        return (T) new PlayerQueueViewModel.Factory() { // from class: io.elevenlabs.readerapp.DaggerReaderApp_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.1
                            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel.Factory
                            public PlayerQueueViewModel create(MediaItemState mediaItemState) {
                                return new PlayerQueueViewModel((DispatcherFactory) SwitchingProvider.this.singletonCImpl.dispatcherFactoryProvider.get(), (PlayerService) SwitchingProvider.this.singletonCImpl.backgroundPlayerControllerServiceProvider.get(), mediaItemState, (Analytics) SwitchingProvider.this.singletonCImpl.bindPostHogAnalyticsProvider.get());
                            }
                        };
                    case 79:
                        return (T) new VoicePickerCollectionViewModel.Factory() { // from class: io.elevenlabs.readerapp.DaggerReaderApp_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.2
                            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel.Factory
                            public VoicePickerCollectionViewModel create(VoicePickerCollectionRoute voicePickerCollectionRoute) {
                                return new VoicePickerCollectionViewModel((DispatcherFactory) SwitchingProvider.this.singletonCImpl.dispatcherFactoryProvider.get(), voicePickerCollectionRoute, (Logger) SwitchingProvider.this.singletonCImpl.loggerProvider.get(), (VoicePickerSharedRepository) SwitchingProvider.this.activityRetainedCImpl.voicePickerSharedRepositoryProvider.get(), SwitchingProvider.this.singletonCImpl.exploreVoicesServiceImpl(), (ConnectivityService) SwitchingProvider.this.singletonCImpl.bindConnectivityServiceProvider.get());
                            }
                        };
                    case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                        return (T) new VoicePickerViewModel.Factory() { // from class: io.elevenlabs.readerapp.DaggerReaderApp_HiltComponents_SingletonC.ViewModelCImpl.SwitchingProvider.3
                            @Override // io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel.Factory
                            public VoicePickerViewModel create(VoicePickerMode voicePickerMode) {
                                return new VoicePickerViewModel((DispatcherFactory) SwitchingProvider.this.singletonCImpl.dispatcherFactoryProvider.get(), (VoicePickerSharedRepository) SwitchingProvider.this.activityRetainedCImpl.voicePickerSharedRepositoryProvider.get(), (VoicesService) SwitchingProvider.this.singletonCImpl.bindVoicesServiceProvider.get(), (ReadsService) SwitchingProvider.this.singletonCImpl.bindReadsServiceProvider.get(), (ToastService) SwitchingProvider.this.singletonCImpl.bindToastServiceProvider.get(), SwitchingProvider.this.singletonCImpl.resolveErrorMessageUseCaseImpl(), (Analytics) SwitchingProvider.this.singletonCImpl.bindPostHogAnalyticsProvider.get(), (ConnectivityService) SwitchingProvider.this.singletonCImpl.bindConnectivityServiceProvider.get(), (Logger) SwitchingProvider.this.singletonCImpl.loggerProvider.get(), voicePickerMode);
                            }
                        };
                    default:
                        throw new AssertionError(i10);
                }
            }
        }

        public ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, z0 z0Var, ll.b bVar) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.savedStateHandle = z0Var;
            initialize(z0Var, bVar);
            initialize2(z0Var, bVar);
            initialize3(z0Var, bVar);
            initialize4(z0Var, bVar);
        }

        private void initialize(z0 z0Var, ll.b bVar) {
            this.accountViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 0);
            this.addReadToCollectionViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 1);
            this.addReadsToCollectionViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 2);
            this.addSharedReadViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 3);
            this.appCompatibilityViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 4);
            this.askAgentViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 5);
            this.askAssistantViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 6);
            this.authViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 7);
            this.authorProfileViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 8);
            this.bookPurchasesViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 9);
            this.bookRefundViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 10);
            this.bookmarkShareDetailsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 11);
            this.bookmarkViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 12);
            this.collectionViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 13);
            this.configViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 14);
            this.contentPreferencesViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 15);
            this.contentSearchViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 16);
            this.createCollectionViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 17);
            this.dailyStreakSettingsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 18);
            this.deleteAccountViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 19);
            this.downloadsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 20);
            this.editBookmarkViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 21);
            this.editCollectionViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 22);
            this.exploreCollectionViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 23);
            this.exploreLanguageSettingScreenViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 24);
        }

        private void initialize2(z0 z0Var, ll.b bVar) {
            this.exploreViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 25);
            this.followedSeriesViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 26);
            this.genFMLoadingViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 27);
            this.homeViewModelV3Provider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 28);
            this.homeViewModelV4Provider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 29);
            this.hoursHistoryViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 30);
            this.hoursLowViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 31);
            this.importContentBrowserSurveyViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 32);
            this.showImportingContentToastProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 34);
            this.importFileViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 33);
            this.importLinkViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 35);
            this.libraryViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 36);
            this.lowDiskSpaceViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 37);
            this.manageContentInterestsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 38);
            this.managePurchasesViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 39);
            this.mfaVerificationViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 40);
            this.miniPlayerViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 41);
            this.notificationPrimerViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 42);
            this.notificationViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 43);
            this.ocrImportViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 44);
            this.onboardingViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 45);
            this.pasteLinkViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 46);
            this.playerPreferencesViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 47);
            this.playerViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 48);
            this.pronunciationViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 49);
        }

        private void initialize3(z0 z0Var, ll.b bVar) {
            this.pronunciationsListViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 50);
            this.purchaseHoursViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 51);
            this.rateTitleViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 52);
            this.readBookmarksViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 53);
            this.readDetailsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 54);
            this.readLinkShareViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 55);
            this.readShareDetailsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 56);
            this.readShareOptionsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 57);
            this.referFriendViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 58);
            this.reportProblemViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 59);
            this.revenueCatPaywallViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 60);
            this.routerViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 61);
            this.searchViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 62);
            this.sleepTimerViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 63);
            this.soundscapesViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 64);
            this.surveyViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 65);
            this.toastViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 66);
            this.useFriendReferralViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 67);
            this.verifyEmailViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 68);
            this.voiceDesignViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 69);
            this.voiceDetailsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 70);
            this.voicePickerCreatedViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 71);
            this.voicePickerExploreViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 72);
            this.voicePickerFavoritesViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 73);
            this.voicePickerFilteredListViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 74);
        }

        private void initialize4(z0 z0Var, ll.b bVar) {
            this.voicePickerRecentsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 75);
            this.voicePickerSearchListViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 76);
            this.writeViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 77);
            this.factoryProvider = ul.h.a(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 78));
            this.factoryProvider2 = ul.h.a(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 79));
            this.factoryProvider3 = ul.h.a(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 80));
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ViewModelC, pl.e
        public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
            String str = PlayerQueueViewModel_HiltModules_BindsModule_Bind_LazyMapKey.lazyClassKeyName;
            Object obj = this.factoryProvider.get();
            String str2 = VoicePickerCollectionViewModel_HiltModules_BindsModule_Bind_LazyMapKey.lazyClassKeyName;
            Object obj2 = this.factoryProvider2.get();
            String str3 = VoicePickerViewModel_HiltModules_BindsModule_Bind_LazyMapKey.lazyClassKeyName;
            Object obj3 = this.factoryProvider3.get();
            t.d(str, obj);
            t.d(str2, obj2);
            t.d(str3, obj3);
            return new ul.e(b2.i(3, new Object[]{str, obj, str2, obj2, str3, obj3}, null));
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ViewModelC, pl.e
        public Map<Class<?>, rn.a> getHiltViewModelMap() {
            return new ul.e(hiltViewModelMapMapOfClassOfAndProviderOfViewModelBuilder());
        }

        public o0 hiltViewModelMapMapOfClassOfAndProviderOfViewModelBuilder() {
            t.e(77, "expectedSize");
            i1 i1Var = new i1(77);
            i1Var.x(AccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.accountViewModelProvider);
            i1Var.x(AddReadToCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.addReadToCollectionViewModelProvider);
            i1Var.x(AddReadsToCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.addReadsToCollectionViewModelProvider);
            i1Var.x(AddSharedReadViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.addSharedReadViewModelProvider);
            i1Var.x(AppCompatibilityViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.appCompatibilityViewModelProvider);
            i1Var.x(AskAgentViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.askAgentViewModelProvider);
            i1Var.x(AskAssistantViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.askAssistantViewModelProvider);
            i1Var.x(AuthViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.authViewModelProvider);
            i1Var.x(AuthorProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.authorProfileViewModelProvider);
            i1Var.x(BookPurchasesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.bookPurchasesViewModelProvider);
            i1Var.x(BookRefundViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.bookRefundViewModelProvider);
            i1Var.x(BookmarkShareDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.bookmarkShareDetailsViewModelProvider);
            i1Var.x(BookmarkViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.bookmarkViewModelProvider);
            i1Var.x(CollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.collectionViewModelProvider);
            i1Var.x(ConfigViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.configViewModelProvider);
            i1Var.x(ContentPreferencesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.contentPreferencesViewModelProvider);
            i1Var.x(ContentSearchViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.contentSearchViewModelProvider);
            i1Var.x(CreateCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.createCollectionViewModelProvider);
            i1Var.x(DailyStreakSettingsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.dailyStreakSettingsViewModelProvider);
            i1Var.x(DeleteAccountViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.deleteAccountViewModelProvider);
            i1Var.x(DownloadsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.downloadsViewModelProvider);
            i1Var.x(EditBookmarkViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.editBookmarkViewModelProvider);
            i1Var.x(EditCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.editCollectionViewModelProvider);
            i1Var.x(ExploreCollectionViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.exploreCollectionViewModelProvider);
            i1Var.x(ExploreLanguageSettingScreenViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.exploreLanguageSettingScreenViewModelProvider);
            i1Var.x(ExploreViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.exploreViewModelProvider);
            i1Var.x(FollowedSeriesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.followedSeriesViewModelProvider);
            i1Var.x(GenFMLoadingViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.genFMLoadingViewModelProvider);
            i1Var.x(HomeViewModelV3_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.homeViewModelV3Provider);
            i1Var.x(HomeViewModelV4_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.homeViewModelV4Provider);
            i1Var.x(HoursHistoryViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.hoursHistoryViewModelProvider);
            i1Var.x(HoursLowViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.hoursLowViewModelProvider);
            i1Var.x(ImportContentBrowserSurveyViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.importContentBrowserSurveyViewModelProvider);
            i1Var.x(ImportFileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.importFileViewModelProvider);
            i1Var.x(ImportLinkViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.importLinkViewModelProvider);
            i1Var.x(LibraryViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.libraryViewModelProvider);
            i1Var.x(LowDiskSpaceViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.lowDiskSpaceViewModelProvider);
            i1Var.x(ManageContentInterestsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.manageContentInterestsViewModelProvider);
            i1Var.x(ManagePurchasesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.managePurchasesViewModelProvider);
            i1Var.x(MfaVerificationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.mfaVerificationViewModelProvider);
            i1Var.x(MiniPlayerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.miniPlayerViewModelProvider);
            i1Var.x(NotificationPrimerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.notificationPrimerViewModelProvider);
            i1Var.x(NotificationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.notificationViewModelProvider);
            i1Var.x(OcrImportViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.ocrImportViewModelProvider);
            i1Var.x(OnboardingViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.onboardingViewModelProvider);
            i1Var.x(PasteLinkViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.pasteLinkViewModelProvider);
            i1Var.x(PlayerPreferencesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.playerPreferencesViewModelProvider);
            i1Var.x(PlayerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.playerViewModelProvider);
            i1Var.x(PronunciationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.pronunciationViewModelProvider);
            i1Var.x(PronunciationsListViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.pronunciationsListViewModelProvider);
            i1Var.x(PurchaseHoursViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.purchaseHoursViewModelProvider);
            i1Var.x(RateTitleViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.rateTitleViewModelProvider);
            i1Var.x(ReadBookmarksViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.readBookmarksViewModelProvider);
            i1Var.x(ReadDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.readDetailsViewModelProvider);
            i1Var.x(ReadLinkShareViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.readLinkShareViewModelProvider);
            i1Var.x(ReadShareDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.readShareDetailsViewModelProvider);
            i1Var.x(ReadShareOptionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.readShareOptionsViewModelProvider);
            i1Var.x(ReferFriendViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.referFriendViewModelProvider);
            i1Var.x(ReportProblemViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.reportProblemViewModelProvider);
            i1Var.x(RevenueCatPaywallViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.revenueCatPaywallViewModelProvider);
            i1Var.x(RouterViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.routerViewModelProvider);
            i1Var.x(SearchViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.searchViewModelProvider);
            i1Var.x(SleepTimerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.sleepTimerViewModelProvider);
            i1Var.x(SoundscapesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.soundscapesViewModelProvider);
            i1Var.x(SurveyViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.surveyViewModelProvider);
            i1Var.x(ToastViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.toastViewModelProvider);
            i1Var.x(UseFriendReferralViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.useFriendReferralViewModelProvider);
            i1Var.x(VerifyEmailViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.verifyEmailViewModelProvider);
            i1Var.x(VoiceDesignViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.voiceDesignViewModelProvider);
            i1Var.x(VoiceDetailsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.voiceDetailsViewModelProvider);
            i1Var.x(VoicePickerCreatedViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.voicePickerCreatedViewModelProvider);
            i1Var.x(VoicePickerExploreViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.voicePickerExploreViewModelProvider);
            i1Var.x(VoicePickerFavoritesViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.voicePickerFavoritesViewModelProvider);
            i1Var.x(VoicePickerFilteredListViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.voicePickerFilteredListViewModelProvider);
            i1Var.x(VoicePickerRecentsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.voicePickerRecentsViewModelProvider);
            i1Var.x(VoicePickerSearchListViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.voicePickerSearchListViewModelProvider);
            i1Var.x(WriteViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.writeViewModelProvider);
            return i1Var.c(true);
        }

        public IsAudioBookmarksAllowedUseCase isAudioBookmarksAllowedUseCase() {
            return new IsAudioBookmarksAllowedUseCase((FeatureFlagService) this.singletonCImpl.postHogFeatureFlagServiceProvider.get());
        }

        public PurchaseAndRefreshCreditsUseCase purchaseAndRefreshCreditsUseCase() {
            return new PurchaseAndRefreshCreditsUseCase((PurchasesService) this.singletonCImpl.provideProductsServiceProvider.get(), (CustomerService) this.singletonCImpl.bindCustomerServiceProvider.get());
        }

        public VoicePickerExploreStateMapper voicePickerExploreStateMapper() {
            return new VoicePickerExploreStateMapper((StringProvider) this.singletonCImpl.stringProvider.get(), this.singletonCImpl.resolveErrorMessageUseCaseImpl());
        }

        public VoicePickerSearchListStateMapper voicePickerSearchListStateMapper() {
            return new VoicePickerSearchListStateMapper((StringProvider) this.singletonCImpl.stringProvider.get());
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ViewWithFragmentCImpl extends ReaderApp_HiltComponents.ViewWithFragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

        public ViewWithFragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, View view) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }
    }

    private DaggerReaderApp_HiltComponents_SingletonC() {
    }

    public static Builder builder() {
        return new Builder(0);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class Builder {
        private rl.a applicationContextModule;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public Builder applicationContextModule(rl.a aVar) {
            aVar.getClass();
            this.applicationContextModule = aVar;
            return this;
        }

        public ReaderApp_HiltComponents.SingletonC build() {
            m0.m(this.applicationContextModule, rl.a.class);
            return new SingletonCImpl(this.applicationContextModule);
        }

        private Builder() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ActivityRetainedCBuilder implements ReaderApp_HiltComponents.ActivityRetainedC.Builder {
        private ql.i savedStateHandleHolder;
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ActivityRetainedC.Builder, ol.b
        public ReaderApp_HiltComponents.ActivityRetainedC build() {
            m0.m(this.savedStateHandleHolder, ql.i.class);
            return new ActivityRetainedCImpl(this.singletonCImpl, this.savedStateHandleHolder);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ActivityRetainedC.Builder, ol.b
        public ActivityRetainedCBuilder savedStateHandleHolder(ql.i iVar) {
            iVar.getClass();
            this.savedStateHandleHolder = iVar;
            return this;
        }

        public /* synthetic */ ActivityRetainedCBuilder(SingletonCImpl singletonCImpl, int i10) {
            this(singletonCImpl);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ServiceCBuilder implements ReaderApp_HiltComponents.ServiceC.Builder {
        private Service service;
        private final SingletonCImpl singletonCImpl;

        private ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ServiceC.Builder, ol.d
        public ReaderApp_HiltComponents.ServiceC build() {
            m0.m(this.service, Service.class);
            return new ServiceCImpl(this.singletonCImpl, this.service);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ServiceC.Builder, ol.d
        public ServiceCBuilder service(Service service) {
            service.getClass();
            this.service = service;
            return this;
        }

        public /* synthetic */ ServiceCBuilder(SingletonCImpl singletonCImpl, int i10) {
            this(singletonCImpl);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ActivityCBuilder implements ReaderApp_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ActivityC.Builder, ol.a
        public ActivityCBuilder activity(Activity activity) {
            activity.getClass();
            this.activity = activity;
            return this;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ActivityC.Builder, ol.a
        public ReaderApp_HiltComponents.ActivityC build() {
            m0.m(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activity);
        }

        public /* synthetic */ ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int i10) {
            this(singletonCImpl, activityRetainedCImpl);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ViewModelCBuilder implements ReaderApp_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private z0 savedStateHandle;
        private final SingletonCImpl singletonCImpl;
        private ll.b viewModelLifecycle;

        private ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ViewModelC.Builder, ol.f
        public ReaderApp_HiltComponents.ViewModelC build() {
            m0.m(this.savedStateHandle, z0.class);
            m0.m(this.viewModelLifecycle, ll.b.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle, this.viewModelLifecycle);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ViewModelC.Builder, ol.f
        public ViewModelCBuilder savedStateHandle(z0 z0Var) {
            z0Var.getClass();
            this.savedStateHandle = z0Var;
            return this;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ViewModelC.Builder, ol.f
        public ViewModelCBuilder viewModelLifecycle(ll.b bVar) {
            bVar.getClass();
            this.viewModelLifecycle = bVar;
            return this;
        }

        public /* synthetic */ ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int i10) {
            this(singletonCImpl, activityRetainedCImpl);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class FragmentCBuilder implements ReaderApp_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private x fragment;
        private final SingletonCImpl singletonCImpl;

        private FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.FragmentC.Builder
        public ReaderApp_HiltComponents.FragmentC build() {
            m0.m(this.fragment, x.class);
            return new FragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragment);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.FragmentC.Builder
        public FragmentCBuilder fragment(x xVar) {
            xVar.getClass();
            this.fragment = xVar;
            return this;
        }

        public /* synthetic */ FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, int i10) {
            this(singletonCImpl, activityRetainedCImpl, activityCImpl);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ViewCBuilder implements ReaderApp_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ViewC.Builder
        public ReaderApp_HiltComponents.ViewC build() {
            m0.m(this.view, View.class);
            return new ViewCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.view);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ViewC.Builder
        public ViewCBuilder view(View view) {
            view.getClass();
            this.view = view;
            return this;
        }

        public /* synthetic */ ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, int i10) {
            this(singletonCImpl, activityRetainedCImpl, activityCImpl);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class ViewWithFragmentCBuilder implements ReaderApp_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ViewWithFragmentC.Builder
        public ReaderApp_HiltComponents.ViewWithFragmentC build() {
            m0.m(this.view, View.class);
            return new ViewWithFragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, this.view);
        }

        @Override // io.elevenlabs.readerapp.ReaderApp_HiltComponents.ViewWithFragmentC.Builder
        public ViewWithFragmentCBuilder view(View view) {
            view.getClass();
            this.view = view;
            return this;
        }

        public /* synthetic */ ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, int i10) {
            this(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
        }
    }
}
