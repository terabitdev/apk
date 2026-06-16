package io.elevenlabs.readerapp.ui.screens.authenticated.explore;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ExploreViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f audioPreviewServiceProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f purchasesServiceProvider;
    private final ul.f readsExploreServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f userConfigServiceProvider;

    private ExploreViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        this.dispatcherFactoryProvider = fVar;
        this.readsExploreServiceProvider = fVar2;
        this.userConfigServiceProvider = fVar3;
        this.customerServiceProvider = fVar4;
        this.purchasesServiceProvider = fVar5;
        this.audioPreviewServiceProvider = fVar6;
        this.resolveErrorMessageUseCaseProvider = fVar7;
        this.analyticsProvider = fVar8;
        this.loggerProvider = fVar9;
    }

    public static ExploreViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        return new ExploreViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
    }

    public static ExploreViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsExploreService readsExploreService, UserConfigService userConfigService, CustomerService customerService, PurchasesService purchasesService, AudioPreviewService audioPreviewService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics, Logger logger) {
        return new ExploreViewModel(dispatcherFactory, readsExploreService, userConfigService, customerService, purchasesService, audioPreviewService, resolveErrorMessageUseCase, analytics, logger);
    }

    @Override // rn.a
    public ExploreViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsExploreService) this.readsExploreServiceProvider.get(), (UserConfigService) this.userConfigServiceProvider.get(), (CustomerService) this.customerServiceProvider.get(), (PurchasesService) this.purchasesServiceProvider.get(), (AudioPreviewService) this.audioPreviewServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get());
    }
}
