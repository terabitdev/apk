package io.elevenlabs.domain.usecase;

import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.PurchasesService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PurchaseAndRefreshCreditsUseCase_Factory implements c {
    private final f customerServiceProvider;
    private final f purchasesServiceProvider;

    private PurchaseAndRefreshCreditsUseCase_Factory(f fVar, f fVar2) {
        this.purchasesServiceProvider = fVar;
        this.customerServiceProvider = fVar2;
    }

    public static PurchaseAndRefreshCreditsUseCase_Factory create(f fVar, f fVar2) {
        return new PurchaseAndRefreshCreditsUseCase_Factory(fVar, fVar2);
    }

    public static PurchaseAndRefreshCreditsUseCase newInstance(PurchasesService purchasesService, CustomerService customerService) {
        return new PurchaseAndRefreshCreditsUseCase(purchasesService, customerService);
    }

    @Override // rn.a
    public PurchaseAndRefreshCreditsUseCase get() {
        return newInstance((PurchasesService) this.purchasesServiceProvider.get(), (CustomerService) this.customerServiceProvider.get());
    }
}
