package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ReferralService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ReferFriendViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f referralServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f toastServiceProvider;

    private ReferFriendViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.toastServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.referralServiceProvider = fVar4;
    }

    public static ReferFriendViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new ReferFriendViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static ReferFriendViewModel newInstance(DispatcherFactory dispatcherFactory, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ReferralService referralService) {
        return new ReferFriendViewModel(dispatcherFactory, toastService, resolveErrorMessageUseCase, referralService);
    }

    @Override // rn.a
    public ReferFriendViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ToastService) this.toastServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (ReferralService) this.referralServiceProvider.get());
    }
}
