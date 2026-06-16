package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ReferralService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class UseFriendReferralViewModel_Factory implements ul.c {
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f onboardingServiceProvider;
    private final ul.f referralServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f toastServiceProvider;

    private UseFriendReferralViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.dispatcherFactoryProvider = fVar;
        this.resolveErrorMessageUseCaseProvider = fVar2;
        this.referralServiceProvider = fVar3;
        this.toastServiceProvider = fVar4;
        this.onboardingServiceProvider = fVar5;
        this.customerServiceProvider = fVar6;
    }

    public static UseFriendReferralViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new UseFriendReferralViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static UseFriendReferralViewModel newInstance(DispatcherFactory dispatcherFactory, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ReferralService referralService, ToastService toastService, jl.a aVar, jl.a aVar2) {
        return new UseFriendReferralViewModel(dispatcherFactory, resolveErrorMessageUseCase, referralService, toastService, aVar, aVar2);
    }

    @Override // rn.a
    public UseFriendReferralViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (ReferralService) this.referralServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), ul.b.a(this.onboardingServiceProvider), ul.b.a(this.customerServiceProvider));
    }
}
