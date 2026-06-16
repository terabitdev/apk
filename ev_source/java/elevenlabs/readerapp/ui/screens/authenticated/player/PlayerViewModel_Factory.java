package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AppRatingService;
import io.elevenlabs.domain.services.AssistantPreferencesService;
import io.elevenlabs.domain.services.CharacterReportingService;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.FeatureFlagService;
import io.elevenlabs.domain.services.PlayerPagerTeaserService;
import io.elevenlabs.domain.services.PlayerPreferencesService;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.PronunciationsService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.services.player.PlayerSeekEmitter;
import io.elevenlabs.domain.services.player.PlayerSeekObserver;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import io.elevenlabs.domain.usecase.IsAudioBookmarksAllowedUseCase;
import io.elevenlabs.domain.usecase.IsScreenRecordingAllowedUseCase;
import io.elevenlabs.domain.usecase.MediaAudioPositionResolver;
import io.elevenlabs.domain.usecase.PlayPronunciationPreviewUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.usecase.GetBookmarkWindowUseCase;
import io.elevenlabs.readerapp.usecase.GetCharacterOffsetsFromHtmlRowUseCase;
import io.elevenlabs.readerapp.usecase.GetTextFromHtmlRowUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class PlayerViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f assistantPreferencesServiceProvider;
    private final ul.f bookmarkServiceProvider;
    private final ul.f characterReportingServiceProvider;
    private final ul.f configurationProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f downloadReadUseCaseProvider;
    private final ul.f featureFlagServiceProvider;
    private final ul.f getBookmarkWindowUseCaseProvider;
    private final ul.f getCharacterOffsetsFromHtmlRowUseCaseProvider;
    private final ul.f getCurrentTimeUseCaseProvider;
    private final ul.f getTextFromHtmlRowUseCaseProvider;
    private final ul.f isAudioBookmarksAllowedUseCaseProvider;
    private final ul.f isScreenRecordingAllowedUseCaseProvider;
    private final ul.f loggerProvider;
    private final ul.f mediaAudioPositionResolverProvider;
    private final ul.f navigationServiceProvider;
    private final ul.f offlineReadsServiceProvider;
    private final ul.f playPronunciationPreviewUseCaseProvider;
    private final ul.f playerPagerTeaserServiceProvider;
    private final ul.f playerPreferencesServiceProvider;
    private final ul.f playerServiceProvider;
    private final ul.f playerVisibilityServiceProvider;
    private final ul.f pronunciationsServiceProvider;
    private final ul.f ratingServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f seekEmitterProvider;
    private final ul.f seekObserverProvider;
    private final ul.f stringProvider;
    private final ul.f userConfigServiceProvider;
    private final ul.f voicesServiceProvider;

    private PlayerViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14, ul.f fVar15, ul.f fVar16, ul.f fVar17, ul.f fVar18, ul.f fVar19, ul.f fVar20, ul.f fVar21, ul.f fVar22, ul.f fVar23, ul.f fVar24, ul.f fVar25, ul.f fVar26, ul.f fVar27, ul.f fVar28, ul.f fVar29, ul.f fVar30, ul.f fVar31, ul.f fVar32, ul.f fVar33, ul.f fVar34) {
        this.playerServiceProvider = fVar;
        this.dispatcherFactoryProvider = fVar2;
        this.loggerProvider = fVar3;
        this.readsServiceProvider = fVar4;
        this.bookmarkServiceProvider = fVar5;
        this.voicesServiceProvider = fVar6;
        this.ratingServiceProvider = fVar7;
        this.userConfigServiceProvider = fVar8;
        this.offlineReadsServiceProvider = fVar9;
        this.pronunciationsServiceProvider = fVar10;
        this.getCurrentTimeUseCaseProvider = fVar11;
        this.resolveErrorMessageUseCaseProvider = fVar12;
        this.getCharacterOffsetsFromHtmlRowUseCaseProvider = fVar13;
        this.getTextFromHtmlRowUseCaseProvider = fVar14;
        this.getBookmarkWindowUseCaseProvider = fVar15;
        this.mediaAudioPositionResolverProvider = fVar16;
        this.isAudioBookmarksAllowedUseCaseProvider = fVar17;
        this.isScreenRecordingAllowedUseCaseProvider = fVar18;
        this.downloadReadUseCaseProvider = fVar19;
        this.playPronunciationPreviewUseCaseProvider = fVar20;
        this.navigationServiceProvider = fVar21;
        this.connectivityServiceProvider = fVar22;
        this.characterReportingServiceProvider = fVar23;
        this.configurationProvider = fVar24;
        this.analyticsProvider = fVar25;
        this.stringProvider = fVar26;
        this.playerPreferencesServiceProvider = fVar27;
        this.featureFlagServiceProvider = fVar28;
        this.assistantPreferencesServiceProvider = fVar29;
        this.customerServiceProvider = fVar30;
        this.playerPagerTeaserServiceProvider = fVar31;
        this.playerVisibilityServiceProvider = fVar32;
        this.seekObserverProvider = fVar33;
        this.seekEmitterProvider = fVar34;
    }

    public static PlayerViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14, ul.f fVar15, ul.f fVar16, ul.f fVar17, ul.f fVar18, ul.f fVar19, ul.f fVar20, ul.f fVar21, ul.f fVar22, ul.f fVar23, ul.f fVar24, ul.f fVar25, ul.f fVar26, ul.f fVar27, ul.f fVar28, ul.f fVar29, ul.f fVar30, ul.f fVar31, ul.f fVar32, ul.f fVar33, ul.f fVar34) {
        return new PlayerViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17, fVar18, fVar19, fVar20, fVar21, fVar22, fVar23, fVar24, fVar25, fVar26, fVar27, fVar28, fVar29, fVar30, fVar31, fVar32, fVar33, fVar34);
    }

    public static PlayerViewModel newInstance(jl.a aVar, DispatcherFactory dispatcherFactory, Logger logger, jl.a aVar2, jl.a aVar3, jl.a aVar4, AppRatingService appRatingService, UserConfigService userConfigService, jl.a aVar5, PronunciationsService pronunciationsService, GetCurrentTimeUseCase getCurrentTimeUseCase, ResolveErrorMessageUseCase resolveErrorMessageUseCase, GetCharacterOffsetsFromHtmlRowUseCase getCharacterOffsetsFromHtmlRowUseCase, GetTextFromHtmlRowUseCase getTextFromHtmlRowUseCase, GetBookmarkWindowUseCase getBookmarkWindowUseCase, MediaAudioPositionResolver mediaAudioPositionResolver, IsAudioBookmarksAllowedUseCase isAudioBookmarksAllowedUseCase, IsScreenRecordingAllowedUseCase isScreenRecordingAllowedUseCase, jl.a aVar6, PlayPronunciationPreviewUseCase playPronunciationPreviewUseCase, jl.a aVar7, ConnectivityService connectivityService, CharacterReportingService characterReportingService, Configuration configuration, Analytics analytics, jl.a aVar8, PlayerPreferencesService playerPreferencesService, FeatureFlagService featureFlagService, AssistantPreferencesService assistantPreferencesService, CustomerService customerService, PlayerPagerTeaserService playerPagerTeaserService, PlayerVisibilityService playerVisibilityService, PlayerSeekObserver playerSeekObserver, PlayerSeekEmitter playerSeekEmitter) {
        return new PlayerViewModel(aVar, dispatcherFactory, logger, aVar2, aVar3, aVar4, appRatingService, userConfigService, aVar5, pronunciationsService, getCurrentTimeUseCase, resolveErrorMessageUseCase, getCharacterOffsetsFromHtmlRowUseCase, getTextFromHtmlRowUseCase, getBookmarkWindowUseCase, mediaAudioPositionResolver, isAudioBookmarksAllowedUseCase, isScreenRecordingAllowedUseCase, aVar6, playPronunciationPreviewUseCase, aVar7, connectivityService, characterReportingService, configuration, analytics, aVar8, playerPreferencesService, featureFlagService, assistantPreferencesService, customerService, playerPagerTeaserService, playerVisibilityService, playerSeekObserver, playerSeekEmitter);
    }

    @Override // rn.a
    public PlayerViewModel get() {
        return newInstance(ul.b.a(this.playerServiceProvider), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), ul.b.a(this.readsServiceProvider), ul.b.a(this.bookmarkServiceProvider), ul.b.a(this.voicesServiceProvider), (AppRatingService) this.ratingServiceProvider.get(), (UserConfigService) this.userConfigServiceProvider.get(), ul.b.a(this.offlineReadsServiceProvider), (PronunciationsService) this.pronunciationsServiceProvider.get(), (GetCurrentTimeUseCase) this.getCurrentTimeUseCaseProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (GetCharacterOffsetsFromHtmlRowUseCase) this.getCharacterOffsetsFromHtmlRowUseCaseProvider.get(), (GetTextFromHtmlRowUseCase) this.getTextFromHtmlRowUseCaseProvider.get(), (GetBookmarkWindowUseCase) this.getBookmarkWindowUseCaseProvider.get(), (MediaAudioPositionResolver) this.mediaAudioPositionResolverProvider.get(), (IsAudioBookmarksAllowedUseCase) this.isAudioBookmarksAllowedUseCaseProvider.get(), (IsScreenRecordingAllowedUseCase) this.isScreenRecordingAllowedUseCaseProvider.get(), ul.b.a(this.downloadReadUseCaseProvider), (PlayPronunciationPreviewUseCase) this.playPronunciationPreviewUseCaseProvider.get(), ul.b.a(this.navigationServiceProvider), (ConnectivityService) this.connectivityServiceProvider.get(), (CharacterReportingService) this.characterReportingServiceProvider.get(), (Configuration) this.configurationProvider.get(), (Analytics) this.analyticsProvider.get(), ul.b.a(this.stringProvider), (PlayerPreferencesService) this.playerPreferencesServiceProvider.get(), (FeatureFlagService) this.featureFlagServiceProvider.get(), (AssistantPreferencesService) this.assistantPreferencesServiceProvider.get(), (CustomerService) this.customerServiceProvider.get(), (PlayerPagerTeaserService) this.playerPagerTeaserServiceProvider.get(), (PlayerVisibilityService) this.playerVisibilityServiceProvider.get(), (PlayerSeekObserver) this.seekObserverProvider.get(), (PlayerSeekEmitter) this.seekEmitterProvider.get());
    }
}
