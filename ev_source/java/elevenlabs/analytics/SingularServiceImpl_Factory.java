package io.elevenlabs.analytics;

import fr.d0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AdAttributionService;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.CustomerService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class SingularServiceImpl_Factory implements c {
    private final f adAttributionServiceProvider;
    private final f analyticsProvider;
    private final f authServiceProvider;
    private final f coroutineScopeProvider;
    private final f customerServiceProvider;
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;

    private SingularServiceImpl_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7) {
        this.loggerProvider = fVar;
        this.authServiceProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
        this.coroutineScopeProvider = fVar4;
        this.customerServiceProvider = fVar5;
        this.analyticsProvider = fVar6;
        this.adAttributionServiceProvider = fVar7;
    }

    public static SingularServiceImpl_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7) {
        return new SingularServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static SingularServiceImpl newInstance(Logger logger, AuthService authService, DispatcherFactory dispatcherFactory, d0 d0Var, CustomerService customerService, jl.a aVar, AdAttributionService adAttributionService) {
        return new SingularServiceImpl(logger, authService, dispatcherFactory, d0Var, customerService, aVar, adAttributionService);
    }

    @Override // rn.a
    public SingularServiceImpl get() {
        return newInstance((Logger) this.loggerProvider.get(), (AuthService) this.authServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (d0) this.coroutineScopeProvider.get(), (CustomerService) this.customerServiceProvider.get(), ul.b.a(this.analyticsProvider), (AdAttributionService) this.adAttributionServiceProvider.get());
    }
}
