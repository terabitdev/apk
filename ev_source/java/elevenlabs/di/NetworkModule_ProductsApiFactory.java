package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.ProductsAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_ProductsApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_ProductsApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_ProductsApiFactory create(f fVar) {
        return new NetworkModule_ProductsApiFactory(fVar);
    }

    public static ProductsAPI productsApi(s0 s0Var) {
        ProductsAPI productsApi = NetworkModule.INSTANCE.productsApi(s0Var);
        m0.n(productsApi);
        return productsApi;
    }

    @Override // rn.a
    public ProductsAPI get() {
        return productsApi((s0) this.retrofitProvider.get());
    }
}
