package io.elevenlabs.di;

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
import io.elevenlabs.data.services.DevServiceImpl;
import io.elevenlabs.data.services.DrmServiceImpl;
import io.elevenlabs.data.services.ExploreCollectionsServiceImpl;
import io.elevenlabs.data.services.ExploreVoicesServiceImpl;
import io.elevenlabs.data.services.FavoriteVoicesServiceImpl;
import io.elevenlabs.data.services.FirebaseAppCheckTokenService;
import io.elevenlabs.data.services.FirebaseAuthTokenService;
import io.elevenlabs.data.services.HomeServiceImpl;
import io.elevenlabs.data.services.InterestsServiceImpl;
import io.elevenlabs.data.services.LocalAppRatingService;
import io.elevenlabs.data.services.MediaManifestServiceImpl;
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
import io.elevenlabs.data.services.PublisherServiceImpl;
import io.elevenlabs.data.services.ReadBookmarkServiceImpl;
import io.elevenlabs.data.services.ReadMetadataSaver;
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
import io.elevenlabs.data.services.SoundscapesServiceImpl;
import io.elevenlabs.data.services.SupportAgentServiceImpl;
import io.elevenlabs.data.services.VoiceDesignServiceImpl;
import io.elevenlabs.data.services.VoicesServiceImpl;
import io.elevenlabs.data.services.WhatsNewServiceImpl;
import io.elevenlabs.domain.services.AccountService;
import io.elevenlabs.domain.services.AdAttributionService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.AppCompatibilityDialogService;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.services.AppRatingService;
import io.elevenlabs.domain.services.AssistantPreferencesService;
import io.elevenlabs.domain.services.AssistantService;
import io.elevenlabs.domain.services.AuthTokenService;
import io.elevenlabs.domain.services.AuthorService;
import io.elevenlabs.domain.services.CharacterReportingService;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.domain.services.ConsumptionTrackingService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.DevService;
import io.elevenlabs.domain.services.DeviceUuidService;
import io.elevenlabs.domain.services.DrmService;
import io.elevenlabs.domain.services.ExploreCollectionsService;
import io.elevenlabs.domain.services.ExploreVoicesService;
import io.elevenlabs.domain.services.FavoriteVoicesService;
import io.elevenlabs.domain.services.FileService;
import io.elevenlabs.domain.services.GooglePlayService;
import io.elevenlabs.domain.services.HomeService;
import io.elevenlabs.domain.services.InterestsService;
import io.elevenlabs.domain.services.LocaleService;
import io.elevenlabs.domain.services.MediaManifestService;
import io.elevenlabs.domain.services.MessagesService;
import io.elevenlabs.domain.services.NotificationPermissionService;
import io.elevenlabs.domain.services.NotificationService;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.OnboardingService;
import io.elevenlabs.domain.services.PasswordResetService;
import io.elevenlabs.domain.services.PasswordValidatorService;
import io.elevenlabs.domain.services.PersistentPlayerQueueService;
import io.elevenlabs.domain.services.PlayerPagerTeaserService;
import io.elevenlabs.domain.services.PlayerPreferencesService;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.PublisherService;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.domain.services.ReferralService;
import io.elevenlabs.domain.services.RuntimePermissionsService;
import io.elevenlabs.domain.services.SignUpService;
import io.elevenlabs.domain.services.SoundscapesService;
import io.elevenlabs.domain.services.StreamingService;
import io.elevenlabs.domain.services.SupportAgentService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.services.VibrationService;
import io.elevenlabs.domain.services.VoiceDesignService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.services.WhatsNewService;
import io.elevenlabs.domain.services.player.PlayerSeekEmitter;
import io.elevenlabs.domain.services.player.PlayerSeekObserver;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000ª\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u001bH'J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001eH'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H'J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020%H'J\u0010\u0010&\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020(H'J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020+H'J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H'J\u0010\u00100\u001a\u0002012\u0006\u0010\u0004\u001a\u000202H'J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H'J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H'J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H'J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH'J\u0010\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH'J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH'J\u0010\u0010K\u001a\u00020L2\u0006\u0010I\u001a\u00020MH'J\u0010\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH'J\u0010\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020UH'J\u0010\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH'J\u0010\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H'J\u0010\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aH'J\u0010\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020eH'J\u0010\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020iH'J\u0010\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mH'J\u0010\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020qH'J\u0010\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020uH'J\u0010\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020yH'J\u0010\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}H'J\u0011\u0010~\u001a\u00020\u007f2\u0007\u0010\u0004\u001a\u00030\u0080\u0001H'J\u0013\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0004\u001a\u00030\u0083\u0001H'J\u0014\u0010\u0084\u0001\u001a\u00030\u0085\u00012\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H'J\u0014\u0010\u0088\u0001\u001a\u00030\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H'J\u0014\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H'J\u0013\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0004\u001a\u00030\u0092\u0001H'J\u0014\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001H'J\u0014\u0010\u0097\u0001\u001a\u00030\u0098\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H'J\u0014\u0010\u009b\u0001\u001a\u00030\u009c\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H'J\u0014\u0010\u009f\u0001\u001a\u00030 \u00012\b\u0010¡\u0001\u001a\u00030¢\u0001H'J\u0014\u0010£\u0001\u001a\u00030¤\u00012\b\u0010¥\u0001\u001a\u00030¦\u0001H'J\u0014\u0010§\u0001\u001a\u00030¨\u00012\b\u0010©\u0001\u001a\u00030ª\u0001H'J\u0014\u0010«\u0001\u001a\u00030¬\u00012\b\u0010\u00ad\u0001\u001a\u00030®\u0001H'J\u0014\u0010¯\u0001\u001a\u00030°\u00012\b\u0010±\u0001\u001a\u00030²\u0001H'J\u0014\u0010³\u0001\u001a\u00030´\u00012\b\u0010µ\u0001\u001a\u00030¶\u0001H'J\u0013\u0010·\u0001\u001a\u00030¸\u00012\u0007\u0010\u0004\u001a\u00030¹\u0001H'J\u0013\u0010º\u0001\u001a\u00030»\u00012\u0007\u0010\u0004\u001a\u00030¼\u0001H'J\u0013\u0010½\u0001\u001a\u00030¾\u00012\u0007\u0010\u0004\u001a\u00030¼\u0001H'J\u0013\u0010¿\u0001\u001a\u00030À\u00012\u0007\u0010\u0004\u001a\u00030Á\u0001H'J\u0014\u0010Â\u0001\u001a\u00030Ã\u00012\b\u0010Ä\u0001\u001a\u00030Å\u0001H'J\u0014\u0010Æ\u0001\u001a\u00030Ç\u00012\b\u0010È\u0001\u001a\u00030É\u0001H'J\u0014\u0010Ê\u0001\u001a\u00030Ë\u00012\b\u0010Ì\u0001\u001a\u00030Í\u0001H'J\u0014\u0010Î\u0001\u001a\u00030Ï\u00012\b\u0010Ð\u0001\u001a\u00030Ñ\u0001H'J\u0013\u0010Ò\u0001\u001a\u00030Ó\u00012\u0007\u0010\u0004\u001a\u00030Ô\u0001H'J\u0014\u0010Õ\u0001\u001a\u00030Ö\u00012\b\u0010×\u0001\u001a\u00030Ø\u0001H'J\u0014\u0010Ù\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ü\u0001H'¨\u0006Ý\u0001À\u0006\u0003"}, d2 = {"Lio/elevenlabs/di/ServicesModule;", "", "bindAdAttributionService", "Lio/elevenlabs/domain/services/AdAttributionService;", "impl", "Lio/elevenlabs/data/services/AdAttributionServiceImpl;", "bindDevService", "Lio/elevenlabs/domain/services/DevService;", "devServiceImpl", "Lio/elevenlabs/data/services/DevServiceImpl;", "bindAuthAuthTokenService", "Lio/elevenlabs/domain/services/AuthTokenService;", "firebaseAuthTokenService", "Lio/elevenlabs/data/services/FirebaseAuthTokenService;", "bindAppCheckTokenService", "Lio/elevenlabs/domain/services/AppCheckTokenService;", "firebaseAppCheckTokenService", "Lio/elevenlabs/data/services/FirebaseAppCheckTokenService;", "bindAppCompatibilityDialogService", "Lio/elevenlabs/domain/services/AppCompatibilityDialogService;", "Lio/elevenlabs/data/services/AppCompatibilityDialogServiceImpl;", "bindPlayerVisibilityService", "Lio/elevenlabs/domain/services/PlayerVisibilityService;", "voicesServiceImpl", "Lio/elevenlabs/data/services/PlayerVisibilityServiceImpl;", "bindVoicesService", "Lio/elevenlabs/domain/services/VoicesService;", "Lio/elevenlabs/data/services/VoicesServiceImpl;", "bindVoiceDesignService", "Lio/elevenlabs/domain/services/VoiceDesignService;", "Lio/elevenlabs/data/services/VoiceDesignServiceImpl;", "bindSoundscapesService", "Lio/elevenlabs/domain/services/SoundscapesService;", "soundscapesServiceImpl", "Lio/elevenlabs/data/services/SoundscapesServiceImpl;", "bindCommunityVoicesService", "Lio/elevenlabs/domain/services/CommunityVoicesService;", "Lio/elevenlabs/data/services/CommunityVoicesServiceImpl;", "bindVoicesFavoritesService", "Lio/elevenlabs/domain/services/FavoriteVoicesService;", "Lio/elevenlabs/data/services/FavoriteVoicesServiceImpl;", "bindRecentVoicesService", "Lio/elevenlabs/domain/services/RecentVoicesService;", "Lio/elevenlabs/data/services/RecentVoicesServiceImpl;", "bindReadsService", "Lio/elevenlabs/domain/services/ReadsService;", "readsServiceImpl", "Lio/elevenlabs/data/services/ReadsServiceImpl;", "bindConsumptionTrackingService", "Lio/elevenlabs/domain/services/ConsumptionTrackingService;", "Lio/elevenlabs/data/services/ConsumptionRepository;", "bindOfflineReadsService", "Lio/elevenlabs/domain/services/OfflineReadsService;", "offlineReadsServiceImpl", "Lio/elevenlabs/data/services/OfflineReadsServiceImpl;", "bindReadBookmarkService", "Lio/elevenlabs/domain/services/ReadBookmarkService;", "readBookmarkServiceImpl", "Lio/elevenlabs/data/services/ReadBookmarkServiceImpl;", "bindReadsExploreService", "Lio/elevenlabs/domain/services/ReadsExploreService;", "readsExploreService", "Lio/elevenlabs/data/services/ReadsExploreServiceImpl;", "bindAccountService", "Lio/elevenlabs/domain/services/AccountService;", "accountService", "Lio/elevenlabs/data/services/RestAccountService;", "bindStreamingService", "Lio/elevenlabs/domain/services/StreamingService;", "readsStreamingService", "Lio/elevenlabs/data/services/ReadsStreamingService;", "bindAppConfigService", "Lio/elevenlabs/domain/services/AppConfigService;", "restConfigService", "Lio/elevenlabs/data/services/RestAppConfigService;", "bindUserConfigService", "Lio/elevenlabs/domain/services/UserConfigService;", "Lio/elevenlabs/data/services/RestUserConfigService;", "bindFileService", "Lio/elevenlabs/domain/services/FileService;", "androidFileService", "Lio/elevenlabs/data/services/AndroidFileService;", "bindLocaleService", "Lio/elevenlabs/domain/services/LocaleService;", "androidLocaleService", "Lio/elevenlabs/data/services/AndroidLocaleService;", "bindOnboardingService", "Lio/elevenlabs/domain/services/OnboardingService;", "onboardingService", "Lio/elevenlabs/data/services/OnboardingServiceImpl;", "bindGooglePlayService", "Lio/elevenlabs/domain/services/GooglePlayService;", "googlePlayService", "Lio/elevenlabs/data/services/RestGooglePlayService;", "bindPublisherService", "Lio/elevenlabs/domain/services/PublisherService;", "publisherServiceImpl", "Lio/elevenlabs/data/services/PublisherServiceImpl;", "bindAuthorService", "Lio/elevenlabs/domain/services/AuthorService;", "authorServiceImpl", "Lio/elevenlabs/data/services/AuthorServiceImpl;", "bindCollectionDetailsService", "Lio/elevenlabs/domain/services/ExploreCollectionsService;", "collectionDetailsServiceImpl", "Lio/elevenlabs/data/services/ExploreCollectionsServiceImpl;", "bindPermissionsService", "Lio/elevenlabs/domain/services/RuntimePermissionsService;", "permissionsServiceImpl", "Lio/elevenlabs/data/services/RuntimePermissionsServiceImpl;", "bindSignUpService", "Lio/elevenlabs/domain/services/SignUpService;", "signUpService", "Lio/elevenlabs/data/services/RestSignUpService;", "bindPasswordResetService", "Lio/elevenlabs/domain/services/PasswordResetService;", "passwordResetService", "Lio/elevenlabs/data/services/RestPasswordResetService;", "bindPasswordValidatorService", "Lio/elevenlabs/domain/services/PasswordValidatorService;", "passwordValidatorService", "Lio/elevenlabs/data/services/PasswordValidatorServiceImpl;", "bindRatingService", "Lio/elevenlabs/domain/services/AppRatingService;", "localRatingService", "Lio/elevenlabs/data/services/LocalAppRatingService;", "bindPlayerPagerTeaserService", "Lio/elevenlabs/domain/services/PlayerPagerTeaserService;", "Lio/elevenlabs/data/services/PlayerPagerTeaserServiceImpl;", "bindWhatsNewService", "Lio/elevenlabs/domain/services/WhatsNewService;", "Lio/elevenlabs/data/services/WhatsNewServiceImpl;", "bindNotificationService", "Lio/elevenlabs/domain/services/NotificationService;", "notificationServiceImpl", "Lio/elevenlabs/data/services/NotificationServiceImpl;", "bindNotificationPermissionService", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "notificationPermissionServiceImpl", "Lio/elevenlabs/data/services/NotificationPermissionServiceImpl;", "bindCollectionService", "Lio/elevenlabs/domain/services/CollectionsService;", "collectionServiceImpl", "Lio/elevenlabs/data/services/CollectionsServiceImpl;", "bindReadMetadataSaverImpl", "Lio/elevenlabs/data/services/ReadMetadataSaver;", "Lio/elevenlabs/data/services/ReadMetadataSaverImpl;", "bindHomeService", "Lio/elevenlabs/domain/services/HomeService;", "homeServiceImpl", "Lio/elevenlabs/data/services/HomeServiceImpl;", "bindExploreVoicesService", "Lio/elevenlabs/domain/services/ExploreVoicesService;", "readRecommendedVoicesServiceImpl", "Lio/elevenlabs/data/services/ExploreVoicesServiceImpl;", "bindDeviceUuidService", "Lio/elevenlabs/domain/services/DeviceUuidService;", "sharedPrefsDeviceUuidService", "Lio/elevenlabs/data/services/SharedPrefsDeviceUuidService;", "bindCustomerService", "Lio/elevenlabs/domain/services/CustomerService;", "customerServiceImpl", "Lio/elevenlabs/data/services/CustomerServiceImpl;", "bindProductsService", "Lio/elevenlabs/domain/services/ProductsService;", "restProductsService", "Lio/elevenlabs/data/services/RestProductsService;", "bindReferralService", "Lio/elevenlabs/domain/services/ReferralService;", "referralServiceImpl", "Lio/elevenlabs/data/services/ReferralServiceImpl;", "bindCharacterReportingService", "Lio/elevenlabs/domain/services/CharacterReportingService;", "characterReportingServiceImpl", "Lio/elevenlabs/data/services/CharacterReportingServiceImpl;", "bindMessagesService", "Lio/elevenlabs/domain/services/MessagesService;", "restMessagesService", "Lio/elevenlabs/data/services/RestMessagesService;", "bindPronunciationsService", "Lio/elevenlabs/domain/services/PronunciationsService;", "pronunciationsServiceImpl", "Lio/elevenlabs/data/services/PronunciationsServiceImpl;", "bindInterestsService", "Lio/elevenlabs/domain/services/InterestsService;", "Lio/elevenlabs/data/services/InterestsServiceImpl;", "bindPlayerSeekEmitter", "Lio/elevenlabs/domain/services/player/PlayerSeekEmitter;", "Lio/elevenlabs/data/services/PlayerSeekMediator;", "bindPlayerSeekObserver", "Lio/elevenlabs/domain/services/player/PlayerSeekObserver;", "bindPersistentPlayerQueueService", "Lio/elevenlabs/domain/services/PersistentPlayerQueueService;", "Lio/elevenlabs/data/services/PersistentPlayerQueueServiceImpl;", "bindAssistantService", "Lio/elevenlabs/domain/services/AssistantService;", "assistantServiceImpl", "Lio/elevenlabs/data/services/AssistantServiceImpl;", "bindSupportAgentService", "Lio/elevenlabs/domain/services/SupportAgentService;", "supportAgentServiceImpl", "Lio/elevenlabs/data/services/SupportAgentServiceImpl;", "bindAssistantPreferencesService", "Lio/elevenlabs/domain/services/AssistantPreferencesService;", "assistantPreferencesServiceImpl", "Lio/elevenlabs/data/services/AssistantPreferencesServiceImpl;", "bindPlayerPreferencesService", "Lio/elevenlabs/domain/services/PlayerPreferencesService;", "playerPreferencesServiceImpl", "Lio/elevenlabs/data/services/PlayerPreferencesServiceImpl;", "bindVibrationService", "Lio/elevenlabs/domain/services/VibrationService;", "Lio/elevenlabs/data/services/AndroidVibrationService;", "bindMediaManifestService", "Lio/elevenlabs/domain/services/MediaManifestService;", "mediaManifestServiceImpl", "Lio/elevenlabs/data/services/MediaManifestServiceImpl;", "bindDrmService", "Lio/elevenlabs/domain/services/DrmService;", "drmServiceImpl", "Lio/elevenlabs/data/services/DrmServiceImpl;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ServicesModule {
    AccountService bindAccountService(RestAccountService accountService);

    AdAttributionService bindAdAttributionService(AdAttributionServiceImpl impl);

    AppCheckTokenService bindAppCheckTokenService(FirebaseAppCheckTokenService firebaseAppCheckTokenService);

    AppCompatibilityDialogService bindAppCompatibilityDialogService(AppCompatibilityDialogServiceImpl impl);

    AppConfigService bindAppConfigService(RestAppConfigService restConfigService);

    AssistantPreferencesService bindAssistantPreferencesService(AssistantPreferencesServiceImpl assistantPreferencesServiceImpl);

    AssistantService bindAssistantService(AssistantServiceImpl assistantServiceImpl);

    AuthTokenService bindAuthAuthTokenService(FirebaseAuthTokenService firebaseAuthTokenService);

    AuthorService bindAuthorService(AuthorServiceImpl authorServiceImpl);

    CharacterReportingService bindCharacterReportingService(CharacterReportingServiceImpl characterReportingServiceImpl);

    ExploreCollectionsService bindCollectionDetailsService(ExploreCollectionsServiceImpl collectionDetailsServiceImpl);

    CollectionsService bindCollectionService(CollectionsServiceImpl collectionServiceImpl);

    CommunityVoicesService bindCommunityVoicesService(CommunityVoicesServiceImpl voicesServiceImpl);

    ConsumptionTrackingService bindConsumptionTrackingService(ConsumptionRepository impl);

    CustomerService bindCustomerService(CustomerServiceImpl customerServiceImpl);

    DevService bindDevService(DevServiceImpl devServiceImpl);

    DeviceUuidService bindDeviceUuidService(SharedPrefsDeviceUuidService sharedPrefsDeviceUuidService);

    DrmService bindDrmService(DrmServiceImpl drmServiceImpl);

    ExploreVoicesService bindExploreVoicesService(ExploreVoicesServiceImpl readRecommendedVoicesServiceImpl);

    FileService bindFileService(AndroidFileService androidFileService);

    GooglePlayService bindGooglePlayService(RestGooglePlayService googlePlayService);

    HomeService bindHomeService(HomeServiceImpl homeServiceImpl);

    InterestsService bindInterestsService(InterestsServiceImpl impl);

    LocaleService bindLocaleService(AndroidLocaleService androidLocaleService);

    MediaManifestService bindMediaManifestService(MediaManifestServiceImpl mediaManifestServiceImpl);

    MessagesService bindMessagesService(RestMessagesService restMessagesService);

    NotificationPermissionService bindNotificationPermissionService(NotificationPermissionServiceImpl notificationPermissionServiceImpl);

    NotificationService bindNotificationService(NotificationServiceImpl notificationServiceImpl);

    OfflineReadsService bindOfflineReadsService(OfflineReadsServiceImpl offlineReadsServiceImpl);

    OnboardingService bindOnboardingService(OnboardingServiceImpl onboardingService);

    PasswordResetService bindPasswordResetService(RestPasswordResetService passwordResetService);

    PasswordValidatorService bindPasswordValidatorService(PasswordValidatorServiceImpl passwordValidatorService);

    RuntimePermissionsService bindPermissionsService(RuntimePermissionsServiceImpl permissionsServiceImpl);

    PersistentPlayerQueueService bindPersistentPlayerQueueService(PersistentPlayerQueueServiceImpl impl);

    PlayerPagerTeaserService bindPlayerPagerTeaserService(PlayerPagerTeaserServiceImpl impl);

    PlayerPreferencesService bindPlayerPreferencesService(PlayerPreferencesServiceImpl playerPreferencesServiceImpl);

    PlayerSeekEmitter bindPlayerSeekEmitter(PlayerSeekMediator impl);

    PlayerSeekObserver bindPlayerSeekObserver(PlayerSeekMediator impl);

    PlayerVisibilityService bindPlayerVisibilityService(PlayerVisibilityServiceImpl voicesServiceImpl);

    ProductsService bindProductsService(RestProductsService restProductsService);

    PronunciationsService bindPronunciationsService(PronunciationsServiceImpl pronunciationsServiceImpl);

    PublisherService bindPublisherService(PublisherServiceImpl publisherServiceImpl);

    AppRatingService bindRatingService(LocalAppRatingService localRatingService);

    ReadBookmarkService bindReadBookmarkService(ReadBookmarkServiceImpl readBookmarkServiceImpl);

    ReadMetadataSaver bindReadMetadataSaverImpl(ReadMetadataSaverImpl impl);

    ReadsExploreService bindReadsExploreService(ReadsExploreServiceImpl readsExploreService);

    ReadsService bindReadsService(ReadsServiceImpl readsServiceImpl);

    RecentVoicesService bindRecentVoicesService(RecentVoicesServiceImpl impl);

    ReferralService bindReferralService(ReferralServiceImpl referralServiceImpl);

    SignUpService bindSignUpService(RestSignUpService signUpService);

    SoundscapesService bindSoundscapesService(SoundscapesServiceImpl soundscapesServiceImpl);

    StreamingService bindStreamingService(ReadsStreamingService readsStreamingService);

    SupportAgentService bindSupportAgentService(SupportAgentServiceImpl supportAgentServiceImpl);

    UserConfigService bindUserConfigService(RestUserConfigService restConfigService);

    VibrationService bindVibrationService(AndroidVibrationService impl);

    VoiceDesignService bindVoiceDesignService(VoiceDesignServiceImpl impl);

    FavoriteVoicesService bindVoicesFavoritesService(FavoriteVoicesServiceImpl impl);

    VoicesService bindVoicesService(VoicesServiceImpl voicesServiceImpl);

    WhatsNewService bindWhatsNewService(WhatsNewServiceImpl impl);
}
