package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ManagePurchasesViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f purchasesServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private ManagePurchasesViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.purchasesServiceProvider = fVar;
        this.toastServiceProvider = fVar2;
        this.stringProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
        this.dispatcherFactoryProvider = fVar5;
    }

    public static ManagePurchasesViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new ManagePurchasesViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static ManagePurchasesViewModel newInstance(PurchasesService purchasesService, jl.a aVar, jl.a aVar2, ResolveErrorMessageUseCase resolveErrorMessageUseCase, DispatcherFactory dispatcherFactory) {
        return new ManagePurchasesViewModel(purchasesService, aVar, aVar2, resolveErrorMessageUseCase, dispatcherFactory);
    }

    @Override // rn.a
    public ManagePurchasesViewModel get() {
        return newInstance((PurchasesService) this.purchasesServiceProvider.get(), ul.b.a(this.toastServiceProvider), ul.b.a(this.stringProvider), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
