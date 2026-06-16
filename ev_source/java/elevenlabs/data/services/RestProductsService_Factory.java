package io.elevenlabs.data.services;

import io.elevenlabs.data.api.ProductsAPI;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.PurchasesService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RestProductsService_Factory implements ul.c {
    private final ul.f loggerProvider;
    private final ul.f productsAPIProvider;
    private final ul.f purchasesServiceProvider;

    private RestProductsService_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.productsAPIProvider = fVar;
        this.purchasesServiceProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static RestProductsService_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new RestProductsService_Factory(fVar, fVar2, fVar3);
    }

    public static RestProductsService newInstance(ProductsAPI productsAPI, PurchasesService purchasesService, Logger logger) {
        return new RestProductsService(productsAPI, purchasesService, logger);
    }

    @Override // rn.a
    public RestProductsService get() {
        return newInstance((ProductsAPI) this.productsAPIProvider.get(), (PurchasesService) this.purchasesServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}
