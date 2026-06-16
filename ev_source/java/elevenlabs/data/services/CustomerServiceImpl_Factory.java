package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.data.api.CustomerAPI;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CustomerServiceImpl_Factory implements ul.c {
    private final ul.f connectivityServiceProvider;
    private final ul.f customerAPIProvider;
    private final ul.f jsonProvider;
    private final ul.f loggerProvider;
    private final ul.f sharedPreferencesProvider;

    private CustomerServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.customerAPIProvider = fVar;
        this.jsonProvider = fVar2;
        this.loggerProvider = fVar3;
        this.sharedPreferencesProvider = fVar4;
        this.connectivityServiceProvider = fVar5;
    }

    public static CustomerServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new CustomerServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static CustomerServiceImpl newInstance(CustomerAPI customerAPI, vr.c cVar, Logger logger, SharedPreferences sharedPreferences, ConnectivityService connectivityService) {
        return new CustomerServiceImpl(customerAPI, cVar, logger, sharedPreferences, connectivityService);
    }

    @Override // rn.a
    public CustomerServiceImpl get() {
        return newInstance((CustomerAPI) this.customerAPIProvider.get(), (vr.c) this.jsonProvider.get(), (Logger) this.loggerProvider.get(), (SharedPreferences) this.sharedPreferencesProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get());
    }
}
