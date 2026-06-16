package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import androidx.lifecycle.z0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.usecase.PurchaseAndRefreshCreditsUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class PurchaseHoursViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f productsServiceProvider;
    private final ul.f purchaseAndRefreshCreditsUseCaseProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f savedStateHandleProvider;

    private PurchaseHoursViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        this.savedStateHandleProvider = fVar;
        this.dispatcherFactoryProvider = fVar2;
        this.productsServiceProvider = fVar3;
        this.customerServiceProvider = fVar4;
        this.purchaseAndRefreshCreditsUseCaseProvider = fVar5;
        this.resolveErrorMessageUseCaseProvider = fVar6;
        this.analyticsProvider = fVar7;
    }

    public static PurchaseHoursViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        return new PurchaseHoursViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static PurchaseHoursViewModel newInstance(z0 z0Var, DispatcherFactory dispatcherFactory, ProductsService productsService, CustomerService customerService, PurchaseAndRefreshCreditsUseCase purchaseAndRefreshCreditsUseCase, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics) {
        return new PurchaseHoursViewModel(z0Var, dispatcherFactory, productsService, customerService, purchaseAndRefreshCreditsUseCase, resolveErrorMessageUseCase, analytics);
    }

    @Override // rn.a
    public PurchaseHoursViewModel get() {
        return newInstance((z0) this.savedStateHandleProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (ProductsService) this.productsServiceProvider.get(), (CustomerService) this.customerServiceProvider.get(), (PurchaseAndRefreshCreditsUseCase) this.purchaseAndRefreshCreditsUseCaseProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
