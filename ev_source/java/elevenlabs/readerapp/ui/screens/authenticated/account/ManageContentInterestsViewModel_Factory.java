package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.InterestsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ManageContentInterestsViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f interestsServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f resolveErrorMessageProvider;
    private final ul.f toastServiceProvider;

    private ManageContentInterestsViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.dispatcherFactoryProvider = fVar;
        this.interestsServiceProvider = fVar2;
        this.toastServiceProvider = fVar3;
        this.resolveErrorMessageProvider = fVar4;
        this.loggerProvider = fVar5;
    }

    public static ManageContentInterestsViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new ManageContentInterestsViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static ManageContentInterestsViewModel newInstance(DispatcherFactory dispatcherFactory, InterestsService interestsService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger) {
        return new ManageContentInterestsViewModel(dispatcherFactory, interestsService, toastService, resolveErrorMessageUseCase, logger);
    }

    @Override // rn.a
    public ManageContentInterestsViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (InterestsService) this.interestsServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageProvider.get(), (Logger) this.loggerProvider.get());
    }
}
