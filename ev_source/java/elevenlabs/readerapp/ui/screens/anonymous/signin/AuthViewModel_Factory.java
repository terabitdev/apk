package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.PasswordValidatorService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AuthViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f authServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f passwordResetServiceProvider;
    private final ul.f passwordValidatorServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f signUpServiceProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private AuthViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        this.dispatcherFactoryProvider = fVar;
        this.authServiceProvider = fVar2;
        this.stringProvider = fVar3;
        this.toastServiceProvider = fVar4;
        this.passwordResetServiceProvider = fVar5;
        this.passwordValidatorServiceProvider = fVar6;
        this.signUpServiceProvider = fVar7;
        this.loggerProvider = fVar8;
        this.analyticsProvider = fVar9;
        this.resolveErrorMessageUseCaseProvider = fVar10;
    }

    public static AuthViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        return new AuthViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10);
    }

    public static AuthViewModel newInstance(DispatcherFactory dispatcherFactory, jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, PasswordValidatorService passwordValidatorService, jl.a aVar5, Logger logger, Analytics analytics, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        return new AuthViewModel(dispatcherFactory, aVar, aVar2, aVar3, aVar4, passwordValidatorService, aVar5, logger, analytics, resolveErrorMessageUseCase);
    }

    @Override // rn.a
    public AuthViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), ul.b.a(this.authServiceProvider), ul.b.a(this.stringProvider), ul.b.a(this.toastServiceProvider), ul.b.a(this.passwordResetServiceProvider), (PasswordValidatorService) this.passwordValidatorServiceProvider.get(), ul.b.a(this.signUpServiceProvider), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get());
    }
}
