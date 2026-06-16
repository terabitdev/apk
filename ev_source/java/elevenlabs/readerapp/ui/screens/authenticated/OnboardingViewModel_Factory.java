package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class OnboardingViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f audioPreviewServiceProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f onboardingServiceProvider;
    private final ul.f purchasesProvider;
    private final ul.f recentVoicesServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;
    private final ul.f voicesServiceProvider;

    private OnboardingViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12) {
        this.dispatcherFactoryProvider = fVar;
        this.onboardingServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.audioPreviewServiceProvider = fVar4;
        this.voicesServiceProvider = fVar5;
        this.toastServiceProvider = fVar6;
        this.stringProvider = fVar7;
        this.analyticsProvider = fVar8;
        this.recentVoicesServiceProvider = fVar9;
        this.purchasesProvider = fVar10;
        this.customerServiceProvider = fVar11;
        this.loggerProvider = fVar12;
    }

    public static OnboardingViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12) {
        return new OnboardingViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    public static OnboardingViewModel newInstance(DispatcherFactory dispatcherFactory, jl.a aVar, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar2, jl.a aVar3, jl.a aVar4, jl.a aVar5, Analytics analytics, RecentVoicesService recentVoicesService, jl.a aVar6, jl.a aVar7, Logger logger) {
        return new OnboardingViewModel(dispatcherFactory, aVar, resolveErrorMessageUseCase, aVar2, aVar3, aVar4, aVar5, analytics, recentVoicesService, aVar6, aVar7, logger);
    }

    @Override // rn.a
    public OnboardingViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), ul.b.a(this.onboardingServiceProvider), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), ul.b.a(this.audioPreviewServiceProvider), ul.b.a(this.voicesServiceProvider), ul.b.a(this.toastServiceProvider), ul.b.a(this.stringProvider), (Analytics) this.analyticsProvider.get(), (RecentVoicesService) this.recentVoicesServiceProvider.get(), ul.b.a(this.purchasesProvider), ul.b.a(this.customerServiceProvider), (Logger) this.loggerProvider.get());
    }
}
