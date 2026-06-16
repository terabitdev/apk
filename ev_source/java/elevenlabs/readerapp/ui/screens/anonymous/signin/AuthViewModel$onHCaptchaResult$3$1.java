package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.SignUpService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.usecase.ValidateHCaptchaResult;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthViewModel$onHCaptchaResult$3$1", f = "AuthViewModel.kt", l = {331, 341}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AuthViewModel$onHCaptchaResult$3$1 extends yn.i implements p {
    final /* synthetic */ ValidateHCaptchaResult $hCaptchaResult;
    final /* synthetic */ SignInState $this_queueStateUpdate;
    Object L$0;
    int label;
    final /* synthetic */ AuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthViewModel$onHCaptchaResult$3$1(AuthViewModel authViewModel, SignInState signInState, ValidateHCaptchaResult validateHCaptchaResult, wn.c<? super AuthViewModel$onHCaptchaResult$3$1> cVar) {
        super(2, cVar);
        this.this$0 = authViewModel;
        this.$this_queueStateUpdate = signInState;
        this.$hCaptchaResult = validateHCaptchaResult;
    }

    public static final SignInState invokeSuspend$lambda$0(AuthViewModel authViewModel, AsyncCallResult asyncCallResult, SignInState signInState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = authViewModel.resolveErrorMessageUseCase;
        return SignInState.copy$default(signInState, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), false, false, false, false, null, null, null, null, null, false, false, null, false, false, 32758, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AuthViewModel$onHCaptchaResult$3$1(this.this$0, this.$this_queueStateUpdate, this.$hCaptchaResult, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AuthViewModel$onHCaptchaResult$3$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r11 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0055, code lost:
    
        if (r11 == r3) goto L75;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        AuthViewModel$onHCaptchaResult$3$1 authViewModel$onHCaptchaResult$3$1;
        String str;
        jl.a aVar2;
        int i10 = this.label;
        xn.a aVar3 = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    authViewModel$onHCaptchaResult$3$1 = this;
                    AuthService.AuthResult authResult = (AuthService.AuthResult) obj;
                    if (!(authResult instanceof AuthService.AuthResult.Error.MultiFactorRequired) && !(authResult instanceof AuthService.AuthResult.Success) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.AccountNotVerified.INSTANCE)) {
                        if (!kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.Unknown.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.InvalidCredentials.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.InvalidEmail.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.AccountBanned.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.AccountDeleted.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.TooManyRequests.INSTANCE) && !(authResult instanceof AuthService.AuthResult.Error.FirebaseGeneric) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.FailedToConnect.INSTANCE)) {
                            if (authResult instanceof AuthService.AuthResult.Error.MultiFactorError) {
                                authViewModel$onHCaptchaResult$3$1.this$0.getAnalytics().log(Analytics.Event.SignupSubmissionError.INSTANCE);
                            } else {
                                c6.p();
                                return null;
                            }
                        } else {
                            authViewModel$onHCaptchaResult$3$1.this$0.getAnalytics().log(Analytics.Event.SignupSubmissionError.INSTANCE);
                        }
                    }
                    authViewModel$onHCaptchaResult$3$1.this$0.handleAuthResult(authResult);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
            authViewModel$onHCaptchaResult$3$1 = this;
        } else {
            sn.a.g(obj);
            aVar = this.this$0.signUpService;
            Object obj2 = aVar.get();
            obj2.getClass();
            String email = this.$this_queueStateUpdate.getEmail();
            boolean agreesToProductUpdates = this.$this_queueStateUpdate.getAgreesToProductUpdates();
            String token = ((ValidateHCaptchaResult.Success) this.$hCaptchaResult).getToken();
            String name = this.$this_queueStateUpdate.getName();
            this.label = 1;
            authViewModel$onHCaptchaResult$3$1 = this;
            obj = ((SignUpService) obj2).preSignUp(email, name, agreesToProductUpdates, token, authViewModel$onHCaptchaResult$3$1);
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            aVar2 = authViewModel$onHCaptchaResult$3$1.this$0.authService;
            AuthService authService = (AuthService) aVar2.get();
            String email2 = authViewModel$onHCaptchaResult$3$1.$this_queueStateUpdate.getEmail();
            String password = authViewModel$onHCaptchaResult$3$1.$this_queueStateUpdate.getPassword();
            authViewModel$onHCaptchaResult$3$1.L$0 = null;
            authViewModel$onHCaptchaResult$3$1.label = 2;
            obj = authService.createUserWithEmailPassword(email2, password, this);
        } else {
            if (asyncCallResult instanceof AsyncCallResult.Error) {
                authViewModel$onHCaptchaResult$3$1.this$0.getAnalytics().log(Analytics.Event.SignupSubmissionError.INSTANCE);
                Logger logger = authViewModel$onHCaptchaResult$3$1.this$0.getLogger();
                str = authViewModel$onHCaptchaResult$3$1.this$0.tag;
                Logger.logWarning$default(logger, str, "preSignUp error", null, 4, null);
                AuthViewModel authViewModel = authViewModel$onHCaptchaResult$3$1.this$0;
                authViewModel.queueStateUpdate(new h(authViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
                return z.f31622a;
            }
            c6.p();
            return null;
        }
    }
}
