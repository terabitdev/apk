package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthViewModel f14850b;

    public /* synthetic */ a(AuthViewModel authViewModel, int i10) {
        this.f14849a = i10;
        this.f14850b = authViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z AuthScreen$lambda$8$0;
        SignInState handleAuthResult$lambda$2;
        SignInState handleAuthResult$lambda$4;
        SignInState handleAuthResult$lambda$5;
        SignInState handleAuthResult$lambda$6;
        SignInState handleAuthResult$lambda$7;
        SignInState handleAuthResult$lambda$8;
        SignInState handleAuthResult$lambda$9;
        SignInState onSignInClick$lambda$0;
        SignInState onForgotPasswordClick$lambda$0;
        SignInState handleAuthResult$lambda$10;
        SignInState handleAuthResult$lambda$1;
        switch (this.f14849a) {
            case 0:
                AuthScreen$lambda$8$0 = AuthScreenKt.AuthScreen$lambda$8$0(this.f14850b, (ho.l) obj);
                return AuthScreen$lambda$8$0;
            case 1:
                handleAuthResult$lambda$2 = AuthViewModel.handleAuthResult$lambda$2(this.f14850b, (SignInState) obj);
                return handleAuthResult$lambda$2;
            case 2:
                handleAuthResult$lambda$4 = AuthViewModel.handleAuthResult$lambda$4(this.f14850b, (SignInState) obj);
                return handleAuthResult$lambda$4;
            case 3:
                handleAuthResult$lambda$5 = AuthViewModel.handleAuthResult$lambda$5(this.f14850b, (SignInState) obj);
                return handleAuthResult$lambda$5;
            case 4:
                handleAuthResult$lambda$6 = AuthViewModel.handleAuthResult$lambda$6(this.f14850b, (SignInState) obj);
                return handleAuthResult$lambda$6;
            case 5:
                handleAuthResult$lambda$7 = AuthViewModel.handleAuthResult$lambda$7(this.f14850b, (SignInState) obj);
                return handleAuthResult$lambda$7;
            case 6:
                handleAuthResult$lambda$8 = AuthViewModel.handleAuthResult$lambda$8(this.f14850b, (SignInState) obj);
                return handleAuthResult$lambda$8;
            case 7:
                handleAuthResult$lambda$9 = AuthViewModel.handleAuthResult$lambda$9(this.f14850b, (SignInState) obj);
                return handleAuthResult$lambda$9;
            case 8:
                onSignInClick$lambda$0 = AuthViewModel.onSignInClick$lambda$0(this.f14850b, (SignInState) obj);
                return onSignInClick$lambda$0;
            case 9:
                onForgotPasswordClick$lambda$0 = AuthViewModel.onForgotPasswordClick$lambda$0(this.f14850b, (SignInState) obj);
                return onForgotPasswordClick$lambda$0;
            case 10:
                handleAuthResult$lambda$10 = AuthViewModel.handleAuthResult$lambda$10(this.f14850b, (SignInState) obj);
                return handleAuthResult$lambda$10;
            default:
                handleAuthResult$lambda$1 = AuthViewModel.handleAuthResult$lambda$1(this.f14850b, (SignInState) obj);
                return handleAuthResult$lambda$1;
        }
    }
}
