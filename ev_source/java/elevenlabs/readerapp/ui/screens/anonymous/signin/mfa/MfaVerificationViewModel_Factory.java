package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.MfaService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.firebase.VerifyPhoneNumberForMfaUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class MfaVerificationViewModel_Factory implements ul.c {
    private final ul.f authServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f mfaServiceProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;
    private final ul.f verifyPhoneNumberForMfaUseCaseProvider;

    private MfaVerificationViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        this.dispatcherFactoryProvider = fVar;
        this.toastServiceProvider = fVar2;
        this.loggerProvider = fVar3;
        this.stringProvider = fVar4;
        this.mfaServiceProvider = fVar5;
        this.authServiceProvider = fVar6;
        this.verifyPhoneNumberForMfaUseCaseProvider = fVar7;
    }

    public static MfaVerificationViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        return new MfaVerificationViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static MfaVerificationViewModel newInstance(DispatcherFactory dispatcherFactory, ToastService toastService, Logger logger, StringProvider stringProvider, MfaService mfaService, AuthService authService, VerifyPhoneNumberForMfaUseCase verifyPhoneNumberForMfaUseCase) {
        return new MfaVerificationViewModel(dispatcherFactory, toastService, logger, stringProvider, mfaService, authService, verifyPhoneNumberForMfaUseCase);
    }

    @Override // rn.a
    public MfaVerificationViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ToastService) this.toastServiceProvider.get(), (Logger) this.loggerProvider.get(), (StringProvider) this.stringProvider.get(), (MfaService) this.mfaServiceProvider.get(), (AuthService) this.authServiceProvider.get(), (VerifyPhoneNumberForMfaUseCase) this.verifyPhoneNumberForMfaUseCaseProvider.get());
    }
}
