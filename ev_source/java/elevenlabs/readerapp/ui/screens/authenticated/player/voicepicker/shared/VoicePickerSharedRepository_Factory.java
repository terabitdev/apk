package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import fr.d0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CommunityVoicesService;
import io.elevenlabs.domain.services.FavoriteVoicesService;
import io.elevenlabs.domain.services.FeatureFlagService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoicePickerSharedRepository_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f audioPreviewServiceProvider;
    private final ul.f communityVoicesServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f favoritesServiceProvider;
    private final ul.f featureFlagServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;
    private final ul.f recentVoicesServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f scopeProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;
    private final ul.f voicesServiceProvider;

    private VoicePickerSharedRepository_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14) {
        this.scopeProvider = fVar;
        this.dispatcherFactoryProvider = fVar2;
        this.audioPreviewServiceProvider = fVar3;
        this.stringProvider = fVar4;
        this.toastServiceProvider = fVar5;
        this.readsServiceProvider = fVar6;
        this.voicesServiceProvider = fVar7;
        this.communityVoicesServiceProvider = fVar8;
        this.favoritesServiceProvider = fVar9;
        this.resolveErrorMessageUseCaseProvider = fVar10;
        this.loggerProvider = fVar11;
        this.recentVoicesServiceProvider = fVar12;
        this.analyticsProvider = fVar13;
        this.featureFlagServiceProvider = fVar14;
    }

    public static VoicePickerSharedRepository_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14) {
        return new VoicePickerSharedRepository_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14);
    }

    public static VoicePickerSharedRepository newInstance(d0 d0Var, DispatcherFactory dispatcherFactory, AudioPreviewService audioPreviewService, StringProvider stringProvider, ToastService toastService, ReadsService readsService, VoicesService voicesService, CommunityVoicesService communityVoicesService, FavoriteVoicesService favoriteVoicesService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger, RecentVoicesService recentVoicesService, Analytics analytics, FeatureFlagService featureFlagService) {
        return new VoicePickerSharedRepository(d0Var, dispatcherFactory, audioPreviewService, stringProvider, toastService, readsService, voicesService, communityVoicesService, favoriteVoicesService, resolveErrorMessageUseCase, logger, recentVoicesService, analytics, featureFlagService);
    }

    @Override // rn.a
    public VoicePickerSharedRepository get() {
        return newInstance((d0) this.scopeProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (AudioPreviewService) this.audioPreviewServiceProvider.get(), (StringProvider) this.stringProvider.get(), (ToastService) this.toastServiceProvider.get(), (ReadsService) this.readsServiceProvider.get(), (VoicesService) this.voicesServiceProvider.get(), (CommunityVoicesService) this.communityVoicesServiceProvider.get(), (FavoriteVoicesService) this.favoritesServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Logger) this.loggerProvider.get(), (RecentVoicesService) this.recentVoicesServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (FeatureFlagService) this.featureFlagServiceProvider.get());
    }
}
