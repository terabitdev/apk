package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class CreateCollectionViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f collectionsServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private CreateCollectionViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        this.dispatcherFactoryProvider = fVar;
        this.collectionsServiceProvider = fVar2;
        this.toastServiceProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
        this.stringProvider = fVar5;
        this.analyticsProvider = fVar6;
        this.loggerProvider = fVar7;
    }

    public static CreateCollectionViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        return new CreateCollectionViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static CreateCollectionViewModel newInstance(DispatcherFactory dispatcherFactory, CollectionsService collectionsService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, StringProvider stringProvider, Analytics analytics, Logger logger) {
        return new CreateCollectionViewModel(dispatcherFactory, collectionsService, toastService, resolveErrorMessageUseCase, stringProvider, analytics, logger);
    }

    @Override // rn.a
    public CreateCollectionViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (CollectionsService) this.collectionsServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (StringProvider) this.stringProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get());
    }
}
