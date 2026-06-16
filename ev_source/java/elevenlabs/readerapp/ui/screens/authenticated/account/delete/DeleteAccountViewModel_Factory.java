package io.elevenlabs.readerapp.ui.screens.authenticated.account.delete;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class DeleteAccountViewModel_Factory implements ul.c {
    private final f authServiceProvider;
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;
    private final f resolveErrorMessageUseCaseProvider;
    private final f stringProvider;
    private final f toastServiceProvider;

    private DeleteAccountViewModel_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6) {
        this.authServiceProvider = fVar;
        this.toastServiceProvider = fVar2;
        this.stringProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
        this.dispatcherFactoryProvider = fVar5;
        this.loggerProvider = fVar6;
    }

    public static DeleteAccountViewModel_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6) {
        return new DeleteAccountViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static DeleteAccountViewModel newInstance(AuthService authService, ToastService toastService, StringProvider stringProvider, ResolveErrorMessageUseCase resolveErrorMessageUseCase, DispatcherFactory dispatcherFactory, Logger logger) {
        return new DeleteAccountViewModel(authService, toastService, stringProvider, resolveErrorMessageUseCase, dispatcherFactory, logger);
    }

    @Override // rn.a
    public DeleteAccountViewModel get() {
        return newInstance((AuthService) this.authServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (StringProvider) this.stringProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get());
    }
}
