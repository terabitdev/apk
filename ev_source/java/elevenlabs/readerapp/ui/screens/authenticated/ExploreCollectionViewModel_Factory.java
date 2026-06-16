package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.ExploreCollectionsService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ExploreCollectionViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f audioPreviewServiceProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f exploreCollectionsServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f purchasesServiceProvider;
    private final ul.f readsExploreServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;

    private ExploreCollectionViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        this.dispatcherFactoryProvider = fVar;
        this.exploreCollectionsServiceProvider = fVar2;
        this.readsExploreServiceProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
        this.customerServiceProvider = fVar5;
        this.purchasesServiceProvider = fVar6;
        this.audioPreviewServiceProvider = fVar7;
        this.analyticsProvider = fVar8;
        this.loggerProvider = fVar9;
    }

    public static ExploreCollectionViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        return new ExploreCollectionViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
    }

    public static ExploreCollectionViewModel newInstance(DispatcherFactory dispatcherFactory, ExploreCollectionsService exploreCollectionsService, ReadsExploreService readsExploreService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, CustomerService customerService, PurchasesService purchasesService, AudioPreviewService audioPreviewService, Analytics analytics, Logger logger) {
        return new ExploreCollectionViewModel(dispatcherFactory, exploreCollectionsService, readsExploreService, resolveErrorMessageUseCase, customerService, purchasesService, audioPreviewService, analytics, logger);
    }

    @Override // rn.a
    public ExploreCollectionViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ExploreCollectionsService) this.exploreCollectionsServiceProvider.get(), (ReadsExploreService) this.readsExploreServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (CustomerService) this.customerServiceProvider.get(), (PurchasesService) this.purchasesServiceProvider.get(), (AudioPreviewService) this.audioPreviewServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get());
    }
}
