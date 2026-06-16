package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.OnboardingService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RevenueCatPaywallViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f onboardingServiceProvider;
    private final ul.f purchasesProvider;
    private final ul.f stringProvider;

    private RevenueCatPaywallViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        this.purchasesProvider = fVar;
        this.dispatcherFactoryProvider = fVar2;
        this.onboardingServiceProvider = fVar3;
        this.analyticsProvider = fVar4;
        this.customerServiceProvider = fVar5;
        this.loggerProvider = fVar6;
        this.stringProvider = fVar7;
    }

    public static RevenueCatPaywallViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        return new RevenueCatPaywallViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static RevenueCatPaywallViewModel newInstance(jl.a aVar, DispatcherFactory dispatcherFactory, OnboardingService onboardingService, Analytics analytics, CustomerService customerService, Logger logger, StringProvider stringProvider) {
        return new RevenueCatPaywallViewModel(aVar, dispatcherFactory, onboardingService, analytics, customerService, logger, stringProvider);
    }

    @Override // rn.a
    public RevenueCatPaywallViewModel get() {
        return newInstance(ul.b.a(this.purchasesProvider), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (OnboardingService) this.onboardingServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (CustomerService) this.customerServiceProvider.get(), (Logger) this.loggerProvider.get(), (StringProvider) this.stringProvider.get());
    }
}
