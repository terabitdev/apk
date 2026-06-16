package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class GenFMLoadingViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;

    private GenFMLoadingViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.stringProvider = fVar4;
        this.loggerProvider = fVar5;
    }

    public static GenFMLoadingViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new GenFMLoadingViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static GenFMLoadingViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, StringProvider stringProvider, Logger logger) {
        return new GenFMLoadingViewModel(dispatcherFactory, readsService, resolveErrorMessageUseCase, stringProvider, logger);
    }

    @Override // rn.a
    public GenFMLoadingViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (StringProvider) this.stringProvider.get(), (Logger) this.loggerProvider.get());
    }
}
