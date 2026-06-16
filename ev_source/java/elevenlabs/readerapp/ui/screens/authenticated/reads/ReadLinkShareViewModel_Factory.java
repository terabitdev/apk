package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ReadLinkShareViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;

    private ReadLinkShareViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.loggerProvider = fVar4;
        this.analyticsProvider = fVar5;
    }

    public static ReadLinkShareViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new ReadLinkShareViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static ReadLinkShareViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger, Analytics analytics) {
        return new ReadLinkShareViewModel(dispatcherFactory, readsService, resolveErrorMessageUseCase, logger, analytics);
    }

    @Override // rn.a
    public ReadLinkShareViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
