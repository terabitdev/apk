package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AddSharedReadViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;

    private AddSharedReadViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
    }

    public static AddSharedReadViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new AddSharedReadViewModel_Factory(fVar, fVar2, fVar3);
    }

    public static AddSharedReadViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        return new AddSharedReadViewModel(dispatcherFactory, readsService, resolveErrorMessageUseCase);
    }

    @Override // rn.a
    public AddSharedReadViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get());
    }
}
