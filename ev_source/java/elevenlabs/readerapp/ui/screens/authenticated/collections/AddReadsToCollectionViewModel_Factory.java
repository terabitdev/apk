package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AddReadsToCollectionViewModel_Factory implements ul.c {
    private final ul.f collectionsServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f toastServiceProvider;

    private AddReadsToCollectionViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.collectionsServiceProvider = fVar3;
        this.loggerProvider = fVar4;
        this.resolveErrorMessageUseCaseProvider = fVar5;
        this.toastServiceProvider = fVar6;
    }

    public static AddReadsToCollectionViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new AddReadsToCollectionViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static AddReadsToCollectionViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService, CollectionsService collectionsService, Logger logger, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService) {
        return new AddReadsToCollectionViewModel(dispatcherFactory, readsService, collectionsService, logger, resolveErrorMessageUseCase, toastService);
    }

    @Override // rn.a
    public AddReadsToCollectionViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get(), (CollectionsService) this.collectionsServiceProvider.get(), (Logger) this.loggerProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (ToastService) this.toastServiceProvider.get());
    }
}
