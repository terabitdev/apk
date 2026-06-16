package io.elevenlabs.analytics;

import fr.d0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CustomerService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PostHogFeatureFlagService_Factory implements c {
    private final f customerServiceProvider;
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;
    private final f scopeProvider;

    private PostHogFeatureFlagService_Factory(f fVar, f fVar2, f fVar3, f fVar4) {
        this.loggerProvider = fVar;
        this.customerServiceProvider = fVar2;
        this.scopeProvider = fVar3;
        this.dispatcherFactoryProvider = fVar4;
    }

    public static PostHogFeatureFlagService_Factory create(f fVar, f fVar2, f fVar3, f fVar4) {
        return new PostHogFeatureFlagService_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static PostHogFeatureFlagService newInstance(Logger logger, CustomerService customerService, d0 d0Var, DispatcherFactory dispatcherFactory) {
        return new PostHogFeatureFlagService(logger, customerService, d0Var, dispatcherFactory);
    }

    @Override // rn.a
    public PostHogFeatureFlagService get() {
        return newInstance((Logger) this.loggerProvider.get(), (CustomerService) this.customerServiceProvider.get(), (d0) this.scopeProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
