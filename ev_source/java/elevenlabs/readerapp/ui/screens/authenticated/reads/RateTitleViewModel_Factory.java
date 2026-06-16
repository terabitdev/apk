package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class RateTitleViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f toastServiceProvider;

    private RateTitleViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.toastServiceProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
    }

    public static RateTitleViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new RateTitleViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static RateTitleViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        return new RateTitleViewModel(dispatcherFactory, readsService, toastService, resolveErrorMessageUseCase);
    }

    @Override // rn.a
    public RateTitleViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get());
    }
}
