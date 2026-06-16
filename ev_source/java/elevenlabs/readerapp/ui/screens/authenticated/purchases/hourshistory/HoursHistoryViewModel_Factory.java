package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class HoursHistoryViewModel_Factory implements ul.c {
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;

    private HoursHistoryViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.dispatcherFactoryProvider = fVar;
        this.customerServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
    }

    public static HoursHistoryViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new HoursHistoryViewModel_Factory(fVar, fVar2, fVar3);
    }

    public static HoursHistoryViewModel newInstance(DispatcherFactory dispatcherFactory, CustomerService customerService, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        return new HoursHistoryViewModel(dispatcherFactory, customerService, resolveErrorMessageUseCase);
    }

    @Override // rn.a
    public HoursHistoryViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (CustomerService) this.customerServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get());
    }
}
