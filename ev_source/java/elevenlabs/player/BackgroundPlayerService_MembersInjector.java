package io.elevenlabs.player;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.CharacterReportingService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ConsumptionTrackingService;
import io.elevenlabs.domain.services.PersistentPlayerQueueService;
import io.elevenlabs.domain.services.PlayerPreferencesService;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.SoundscapesService;
import io.elevenlabs.domain.services.StreamingService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VibrationService;
import io.elevenlabs.domain.services.player.PlayerConfiguration;
import io.elevenlabs.domain.services.player.PlayerSeekEmitter;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import io.elevenlabs.domain.usecase.IsAudioBookmarksAllowedUseCase;
import io.elevenlabs.player.audio.LoopingAudioPlayer;
import io.elevenlabs.player.media.MediaItemCreator;
import w7.h1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class BackgroundPlayerService_MembersInjector implements jl.b {
    private final ul.f analyticsProvider;
    private final ul.f assistantSessionManagerProvider;
    private final ul.f assistantTriggerEmitterProvider;
    private final ul.f authServiceProvider;
    private final ul.f bookmarkServiceProvider;
    private final ul.f characterReportingServiceProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f consumptionTrackingServiceProvider;
    private final ul.f createBookmarkFromOffsetUseCaseProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f getCurrentTimeUseCaseProvider;
    private final ul.f isAudioBookmarksAllowedUseCaseProvider;
    private final ul.f loggerProvider;
    private final ul.f loopingAudioPlayerProvider;
    private final ul.f mediaItemCreatorProvider;
    private final ul.f persistentPlayerQueueServiceProvider;
    private final ul.f playerConfigurationProvider;
    private final ul.f playerPreferencesServiceProvider;
    private final ul.f playerProvider;
    private final ul.f playerServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f seekEmitterProvider;
    private final ul.f soundscapesServiceProvider;
    private final ul.f streamingServiceProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;
    private final ul.f triggerAssistantFromMediaButtonUseCaseProvider;
    private final ul.f vibrationServiceProvider;

    private BackgroundPlayerService_MembersInjector(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14, ul.f fVar15, ul.f fVar16, ul.f fVar17, ul.f fVar18, ul.f fVar19, ul.f fVar20, ul.f fVar21, ul.f fVar22, ul.f fVar23, ul.f fVar24, ul.f fVar25, ul.f fVar26, ul.f fVar27, ul.f fVar28) {
        this.playerConfigurationProvider = fVar;
        this.dispatcherFactoryProvider = fVar2;
        this.streamingServiceProvider = fVar3;
        this.playerProvider = fVar4;
        this.readsServiceProvider = fVar5;
        this.authServiceProvider = fVar6;
        this.loggerProvider = fVar7;
        this.getCurrentTimeUseCaseProvider = fVar8;
        this.characterReportingServiceProvider = fVar9;
        this.playerServiceProvider = fVar10;
        this.analyticsProvider = fVar11;
        this.seekEmitterProvider = fVar12;
        this.stringProvider = fVar13;
        this.soundscapesServiceProvider = fVar14;
        this.loopingAudioPlayerProvider = fVar15;
        this.persistentPlayerQueueServiceProvider = fVar16;
        this.playerPreferencesServiceProvider = fVar17;
        this.assistantTriggerEmitterProvider = fVar18;
        this.vibrationServiceProvider = fVar19;
        this.assistantSessionManagerProvider = fVar20;
        this.bookmarkServiceProvider = fVar21;
        this.toastServiceProvider = fVar22;
        this.createBookmarkFromOffsetUseCaseProvider = fVar23;
        this.isAudioBookmarksAllowedUseCaseProvider = fVar24;
        this.triggerAssistantFromMediaButtonUseCaseProvider = fVar25;
        this.mediaItemCreatorProvider = fVar26;
        this.consumptionTrackingServiceProvider = fVar27;
        this.connectivityServiceProvider = fVar28;
    }

    public static jl.b create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14, ul.f fVar15, ul.f fVar16, ul.f fVar17, ul.f fVar18, ul.f fVar19, ul.f fVar20, ul.f fVar21, ul.f fVar22, ul.f fVar23, ul.f fVar24, ul.f fVar25, ul.f fVar26, ul.f fVar27, ul.f fVar28) {
        return new BackgroundPlayerService_MembersInjector(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17, fVar18, fVar19, fVar20, fVar21, fVar22, fVar23, fVar24, fVar25, fVar26, fVar27, fVar28);
    }

    public static void injectAnalytics(BackgroundPlayerService backgroundPlayerService, Analytics analytics) {
        backgroundPlayerService.analytics = analytics;
    }

    public static void injectAssistantSessionManager(BackgroundPlayerService backgroundPlayerService, AssistantSessionManager assistantSessionManager) {
        backgroundPlayerService.assistantSessionManager = assistantSessionManager;
    }

    public static void injectAssistantTriggerEmitter(BackgroundPlayerService backgroundPlayerService, AssistantTriggerEmitter assistantTriggerEmitter) {
        backgroundPlayerService.assistantTriggerEmitter = assistantTriggerEmitter;
    }

    public static void injectAuthService(BackgroundPlayerService backgroundPlayerService, AuthService authService) {
        backgroundPlayerService.authService = authService;
    }

    public static void injectBookmarkService(BackgroundPlayerService backgroundPlayerService, ReadBookmarkService readBookmarkService) {
        backgroundPlayerService.bookmarkService = readBookmarkService;
    }

    public static void injectCharacterReportingService(BackgroundPlayerService backgroundPlayerService, CharacterReportingService characterReportingService) {
        backgroundPlayerService.characterReportingService = characterReportingService;
    }

    public static void injectConnectivityService(BackgroundPlayerService backgroundPlayerService, ConnectivityService connectivityService) {
        backgroundPlayerService.connectivityService = connectivityService;
    }

    public static void injectConsumptionTrackingService(BackgroundPlayerService backgroundPlayerService, ConsumptionTrackingService consumptionTrackingService) {
        backgroundPlayerService.consumptionTrackingService = consumptionTrackingService;
    }

    public static void injectCreateBookmarkFromOffsetUseCase(BackgroundPlayerService backgroundPlayerService, CreateBookmarkFromOffsetUseCase createBookmarkFromOffsetUseCase) {
        backgroundPlayerService.createBookmarkFromOffsetUseCase = createBookmarkFromOffsetUseCase;
    }

    public static void injectDispatcherFactory(BackgroundPlayerService backgroundPlayerService, DispatcherFactory dispatcherFactory) {
        backgroundPlayerService.dispatcherFactory = dispatcherFactory;
    }

    public static void injectGetCurrentTimeUseCase(BackgroundPlayerService backgroundPlayerService, GetCurrentTimeUseCase getCurrentTimeUseCase) {
        backgroundPlayerService.getCurrentTimeUseCase = getCurrentTimeUseCase;
    }

    public static void injectIsAudioBookmarksAllowedUseCase(BackgroundPlayerService backgroundPlayerService, IsAudioBookmarksAllowedUseCase isAudioBookmarksAllowedUseCase) {
        backgroundPlayerService.isAudioBookmarksAllowedUseCase = isAudioBookmarksAllowedUseCase;
    }

    public static void injectLogger(BackgroundPlayerService backgroundPlayerService, Logger logger) {
        backgroundPlayerService.logger = logger;
    }

    public static void injectLoopingAudioPlayer(BackgroundPlayerService backgroundPlayerService, LoopingAudioPlayer loopingAudioPlayer) {
        backgroundPlayerService.loopingAudioPlayer = loopingAudioPlayer;
    }

    public static void injectMediaItemCreator(BackgroundPlayerService backgroundPlayerService, MediaItemCreator mediaItemCreator) {
        backgroundPlayerService.mediaItemCreator = mediaItemCreator;
    }

    public static void injectPersistentPlayerQueueService(BackgroundPlayerService backgroundPlayerService, PersistentPlayerQueueService persistentPlayerQueueService) {
        backgroundPlayerService.persistentPlayerQueueService = persistentPlayerQueueService;
    }

    public static void injectPlayer(BackgroundPlayerService backgroundPlayerService, h1 h1Var) {
        backgroundPlayerService.player = h1Var;
    }

    public static void injectPlayerConfiguration(BackgroundPlayerService backgroundPlayerService, PlayerConfiguration playerConfiguration) {
        backgroundPlayerService.playerConfiguration = playerConfiguration;
    }

    public static void injectPlayerPreferencesService(BackgroundPlayerService backgroundPlayerService, PlayerPreferencesService playerPreferencesService) {
        backgroundPlayerService.playerPreferencesService = playerPreferencesService;
    }

    public static void injectPlayerService(BackgroundPlayerService backgroundPlayerService, PlayerService playerService) {
        backgroundPlayerService.playerService = playerService;
    }

    public static void injectReadsService(BackgroundPlayerService backgroundPlayerService, ReadsService readsService) {
        backgroundPlayerService.readsService = readsService;
    }

    public static void injectSeekEmitter(BackgroundPlayerService backgroundPlayerService, PlayerSeekEmitter playerSeekEmitter) {
        backgroundPlayerService.seekEmitter = playerSeekEmitter;
    }

    public static void injectSoundscapesService(BackgroundPlayerService backgroundPlayerService, SoundscapesService soundscapesService) {
        backgroundPlayerService.soundscapesService = soundscapesService;
    }

    public static void injectStreamingService(BackgroundPlayerService backgroundPlayerService, StreamingService streamingService) {
        backgroundPlayerService.streamingService = streamingService;
    }

    public static void injectStringProvider(BackgroundPlayerService backgroundPlayerService, StringProvider stringProvider) {
        backgroundPlayerService.stringProvider = stringProvider;
    }

    public static void injectToastService(BackgroundPlayerService backgroundPlayerService, ToastService toastService) {
        backgroundPlayerService.toastService = toastService;
    }

    public static void injectTriggerAssistantFromMediaButtonUseCase(BackgroundPlayerService backgroundPlayerService, TriggerAssistantFromMediaButtonUseCase triggerAssistantFromMediaButtonUseCase) {
        backgroundPlayerService.triggerAssistantFromMediaButtonUseCase = triggerAssistantFromMediaButtonUseCase;
    }

    public static void injectVibrationService(BackgroundPlayerService backgroundPlayerService, VibrationService vibrationService) {
        backgroundPlayerService.vibrationService = vibrationService;
    }

    public void injectMembers(BackgroundPlayerService backgroundPlayerService) {
        injectPlayerConfiguration(backgroundPlayerService, (PlayerConfiguration) this.playerConfigurationProvider.get());
        injectDispatcherFactory(backgroundPlayerService, (DispatcherFactory) this.dispatcherFactoryProvider.get());
        injectStreamingService(backgroundPlayerService, (StreamingService) this.streamingServiceProvider.get());
        injectPlayer(backgroundPlayerService, (h1) this.playerProvider.get());
        injectReadsService(backgroundPlayerService, (ReadsService) this.readsServiceProvider.get());
        injectAuthService(backgroundPlayerService, (AuthService) this.authServiceProvider.get());
        injectLogger(backgroundPlayerService, (Logger) this.loggerProvider.get());
        injectGetCurrentTimeUseCase(backgroundPlayerService, (GetCurrentTimeUseCase) this.getCurrentTimeUseCaseProvider.get());
        injectCharacterReportingService(backgroundPlayerService, (CharacterReportingService) this.characterReportingServiceProvider.get());
        injectPlayerService(backgroundPlayerService, (PlayerService) this.playerServiceProvider.get());
        injectAnalytics(backgroundPlayerService, (Analytics) this.analyticsProvider.get());
        injectSeekEmitter(backgroundPlayerService, (PlayerSeekEmitter) this.seekEmitterProvider.get());
        injectStringProvider(backgroundPlayerService, (StringProvider) this.stringProvider.get());
        injectSoundscapesService(backgroundPlayerService, (SoundscapesService) this.soundscapesServiceProvider.get());
        injectLoopingAudioPlayer(backgroundPlayerService, (LoopingAudioPlayer) this.loopingAudioPlayerProvider.get());
        injectPersistentPlayerQueueService(backgroundPlayerService, (PersistentPlayerQueueService) this.persistentPlayerQueueServiceProvider.get());
        injectPlayerPreferencesService(backgroundPlayerService, (PlayerPreferencesService) this.playerPreferencesServiceProvider.get());
        injectAssistantTriggerEmitter(backgroundPlayerService, (AssistantTriggerEmitter) this.assistantTriggerEmitterProvider.get());
        injectVibrationService(backgroundPlayerService, (VibrationService) this.vibrationServiceProvider.get());
        injectAssistantSessionManager(backgroundPlayerService, (AssistantSessionManager) this.assistantSessionManagerProvider.get());
        injectBookmarkService(backgroundPlayerService, (ReadBookmarkService) this.bookmarkServiceProvider.get());
        injectToastService(backgroundPlayerService, (ToastService) this.toastServiceProvider.get());
        injectCreateBookmarkFromOffsetUseCase(backgroundPlayerService, (CreateBookmarkFromOffsetUseCase) this.createBookmarkFromOffsetUseCaseProvider.get());
        injectIsAudioBookmarksAllowedUseCase(backgroundPlayerService, (IsAudioBookmarksAllowedUseCase) this.isAudioBookmarksAllowedUseCaseProvider.get());
        injectTriggerAssistantFromMediaButtonUseCase(backgroundPlayerService, (TriggerAssistantFromMediaButtonUseCase) this.triggerAssistantFromMediaButtonUseCaseProvider.get());
        injectMediaItemCreator(backgroundPlayerService, (MediaItemCreator) this.mediaItemCreatorProvider.get());
        injectConsumptionTrackingService(backgroundPlayerService, (ConsumptionTrackingService) this.consumptionTrackingServiceProvider.get());
        injectConnectivityService(backgroundPlayerService, (ConnectivityService) this.connectivityServiceProvider.get());
    }
}
