package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import io.elevenlabs.readerapp.usecase.ValidateHCaptchaResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14864a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthViewModel f14865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ValidateHCaptchaResult f14866c;

    public /* synthetic */ f(AuthViewModel authViewModel, ValidateHCaptchaResult validateHCaptchaResult) {
        this.f14865b = authViewModel;
        this.f14866c = validateHCaptchaResult;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        SignInState onHCaptchaResult$lambda$1;
        SignInState onHCaptchaResult$lambda$2;
        switch (this.f14864a) {
            case 0:
                onHCaptchaResult$lambda$1 = AuthViewModel.onHCaptchaResult$lambda$1(this.f14866c, this.f14865b, (SignInState) obj);
                return onHCaptchaResult$lambda$1;
            default:
                onHCaptchaResult$lambda$2 = AuthViewModel.onHCaptchaResult$lambda$2(this.f14865b, this.f14866c, (SignInState) obj);
                return onHCaptchaResult$lambda$2;
        }
    }

    public /* synthetic */ f(ValidateHCaptchaResult validateHCaptchaResult, AuthViewModel authViewModel) {
        this.f14866c = validateHCaptchaResult;
        this.f14865b = authViewModel;
    }
}
