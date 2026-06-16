package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.SignUpService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class VerifyEmailViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f authServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f signUpServiceProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private VerifyEmailViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        this.dispatcherFactoryProvider = fVar;
        this.signUpServiceProvider = fVar2;
        this.loggerProvider = fVar3;
        this.toastServiceProvider = fVar4;
        this.resolveErrorMessageUseCaseProvider = fVar5;
        this.stringProvider = fVar6;
        this.authServiceProvider = fVar7;
        this.analyticsProvider = fVar8;
    }

    public static VerifyEmailViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        return new VerifyEmailViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8);
    }

    public static VerifyEmailViewModel newInstance(DispatcherFactory dispatcherFactory, SignUpService signUpService, Logger logger, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, StringProvider stringProvider, AuthService authService, Analytics analytics) {
        return new VerifyEmailViewModel(dispatcherFactory, signUpService, logger, toastService, resolveErrorMessageUseCase, stringProvider, authService, analytics);
    }

    @Override // rn.a
    public VerifyEmailViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (SignUpService) this.signUpServiceProvider.get(), (Logger) this.loggerProvider.get(), (ToastService) this.toastServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (StringProvider) this.stringProvider.get(), (AuthService) this.authServiceProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
