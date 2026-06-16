package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.api.CustomerAPI;
import ul.f;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NetworkModule_CustomerApiFactory implements ul.c {
    private final f retrofitProvider;

    private NetworkModule_CustomerApiFactory(f fVar) {
        this.retrofitProvider = fVar;
    }

    public static NetworkModule_CustomerApiFactory create(f fVar) {
        return new NetworkModule_CustomerApiFactory(fVar);
    }

    public static CustomerAPI customerApi(s0 s0Var) {
        CustomerAPI customerApi = NetworkModule.INSTANCE.customerApi(s0Var);
        m0.n(customerApi);
        return customerApi;
    }

    @Override // rn.a
    public CustomerAPI get() {
        return customerApi((s0) this.retrofitProvider.get());
    }
}
