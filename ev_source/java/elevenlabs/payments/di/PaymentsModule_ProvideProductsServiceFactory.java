package io.elevenlabs.payments.di;

import androidx.room.m0;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.payments.InAppPurchasesService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PaymentsModule_ProvideProductsServiceFactory implements c {
    private final f inAppPurchasesServiceProvider;

    private PaymentsModule_ProvideProductsServiceFactory(f fVar) {
        this.inAppPurchasesServiceProvider = fVar;
    }

    public static PaymentsModule_ProvideProductsServiceFactory create(f fVar) {
        return new PaymentsModule_ProvideProductsServiceFactory(fVar);
    }

    public static PurchasesService provideProductsService(InAppPurchasesService inAppPurchasesService) {
        PurchasesService provideProductsService = PaymentsModule.INSTANCE.provideProductsService(inAppPurchasesService);
        m0.n(provideProductsService);
        return provideProductsService;
    }

    @Override // rn.a
    public PurchasesService get() {
        return provideProductsService((InAppPurchasesService) this.inAppPurchasesServiceProvider.get());
    }
}
