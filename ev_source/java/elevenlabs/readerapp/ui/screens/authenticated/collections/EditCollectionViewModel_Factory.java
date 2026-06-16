package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class EditCollectionViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f collectionsServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f toastServiceProvider;

    private EditCollectionViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.dispatcherFactoryProvider = fVar;
        this.collectionsServiceProvider = fVar2;
        this.analyticsProvider = fVar3;
        this.loggerProvider = fVar4;
        this.resolveErrorMessageUseCaseProvider = fVar5;
        this.toastServiceProvider = fVar6;
    }

    public static EditCollectionViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new EditCollectionViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static EditCollectionViewModel newInstance(DispatcherFactory dispatcherFactory, CollectionsService collectionsService, Analytics analytics, Logger logger, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService) {
        return new EditCollectionViewModel(dispatcherFactory, collectionsService, analytics, logger, resolveErrorMessageUseCase, toastService);
    }

    @Override // rn.a
    public EditCollectionViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (CollectionsService) this.collectionsServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (ToastService) this.toastServiceProvider.get());
    }
}
