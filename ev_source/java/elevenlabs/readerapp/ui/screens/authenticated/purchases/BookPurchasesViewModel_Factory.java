package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class BookPurchasesViewModel_Factory implements ul.c {
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;

    private BookPurchasesViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.dispatcherFactoryProvider = fVar;
        this.customerServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
    }

    public static BookPurchasesViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new BookPurchasesViewModel_Factory(fVar, fVar2, fVar3);
    }

    public static BookPurchasesViewModel newInstance(DispatcherFactory dispatcherFactory, CustomerService customerService, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        return new BookPurchasesViewModel(dispatcherFactory, customerService, resolveErrorMessageUseCase);
    }

    @Override // rn.a
    public BookPurchasesViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (CustomerService) this.customerServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get());
    }
}
