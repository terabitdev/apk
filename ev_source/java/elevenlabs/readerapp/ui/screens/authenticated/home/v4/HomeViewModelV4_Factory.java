package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.HomeService;
import io.elevenlabs.domain.services.NotificationPermissionService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.RuntimePermissionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.services.WhatsNewService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class HomeViewModelV4_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f audioPreviewServiceProvider;
    private final ul.f authServiceProvider;
    private final ul.f configurationProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f homeServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f notificationPermissionServiceProvider;
    private final ul.f playerServiceProvider;
    private final ul.f purchasesServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f runtimePermissionsServiceProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;
    private final ul.f userConfigServiceProvider;
    private final ul.f whatsNewServiceProvider;

    private HomeViewModelV4_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14, ul.f fVar15, ul.f fVar16, ul.f fVar17, ul.f fVar18) {
        this.dispatcherFactoryProvider = fVar;
        this.homeServiceProvider = fVar2;
        this.readsServiceProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
        this.userConfigServiceProvider = fVar5;
        this.customerServiceProvider = fVar6;
        this.authServiceProvider = fVar7;
        this.playerServiceProvider = fVar8;
        this.toastServiceProvider = fVar9;
        this.stringProvider = fVar10;
        this.whatsNewServiceProvider = fVar11;
        this.configurationProvider = fVar12;
        this.notificationPermissionServiceProvider = fVar13;
        this.runtimePermissionsServiceProvider = fVar14;
        this.analyticsProvider = fVar15;
        this.purchasesServiceProvider = fVar16;
        this.audioPreviewServiceProvider = fVar17;
        this.loggerProvider = fVar18;
    }

    public static HomeViewModelV4_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14, ul.f fVar15, ul.f fVar16, ul.f fVar17, ul.f fVar18) {
        return new HomeViewModelV4_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17, fVar18);
    }

    public static HomeViewModelV4 newInstance(DispatcherFactory dispatcherFactory, HomeService homeService, ReadsService readsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, UserConfigService userConfigService, CustomerService customerService, AuthService authService, PlayerService playerService, ToastService toastService, StringProvider stringProvider, WhatsNewService whatsNewService, Configuration configuration, NotificationPermissionService notificationPermissionService, RuntimePermissionsService runtimePermissionsService, Analytics analytics, PurchasesService purchasesService, AudioPreviewService audioPreviewService, Logger logger) {
        return new HomeViewModelV4(dispatcherFactory, homeService, readsService, resolveErrorMessageUseCase, userConfigService, customerService, authService, playerService, toastService, stringProvider, whatsNewService, configuration, notificationPermissionService, runtimePermissionsService, analytics, purchasesService, audioPreviewService, logger);
    }

    @Override // rn.a
    public HomeViewModelV4 get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (HomeService) this.homeServiceProvider.get(), (ReadsService) this.readsServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (UserConfigService) this.userConfigServiceProvider.get(), (CustomerService) this.customerServiceProvider.get(), (AuthService) this.authServiceProvider.get(), (PlayerService) this.playerServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (StringProvider) this.stringProvider.get(), (WhatsNewService) this.whatsNewServiceProvider.get(), (Configuration) this.configurationProvider.get(), (NotificationPermissionService) this.notificationPermissionServiceProvider.get(), (RuntimePermissionsService) this.runtimePermissionsServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (PurchasesService) this.purchasesServiceProvider.get(), (AudioPreviewService) this.audioPreviewServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}
