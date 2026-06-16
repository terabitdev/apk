package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.PurchaseAndRefreshCreditsUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class HoursLowViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f productsServiceProvider;
    private final ul.f purchaseAndRefreshCreditsUseCaseProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;

    private HoursLowViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.productsServiceProvider = fVar3;
        this.purchaseAndRefreshCreditsUseCaseProvider = fVar4;
        this.resolveErrorMessageUseCaseProvider = fVar5;
        this.analyticsProvider = fVar6;
    }

    public static HoursLowViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new HoursLowViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static HoursLowViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService, ProductsService productsService, PurchaseAndRefreshCreditsUseCase purchaseAndRefreshCreditsUseCase, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics) {
        return new HoursLowViewModel(dispatcherFactory, readsService, productsService, purchaseAndRefreshCreditsUseCase, resolveErrorMessageUseCase, analytics);
    }

    @Override // rn.a
    public HoursLowViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get(), (ProductsService) this.productsServiceProvider.get(), (PurchaseAndRefreshCreditsUseCase) this.purchaseAndRefreshCreditsUseCaseProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
