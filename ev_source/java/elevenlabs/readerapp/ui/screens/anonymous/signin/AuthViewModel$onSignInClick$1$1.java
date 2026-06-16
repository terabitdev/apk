package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthViewModel$onSignInClick$1$1", f = "AuthViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AuthViewModel$onSignInClick$1$1 extends yn.i implements p {
    final /* synthetic */ SignInState $this_queueStateUpdate;
    int label;
    final /* synthetic */ AuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthViewModel$onSignInClick$1$1(AuthViewModel authViewModel, SignInState signInState, wn.c<? super AuthViewModel$onSignInClick$1$1> cVar) {
        super(2, cVar);
        this.this$0 = authViewModel;
        this.$this_queueStateUpdate = signInState;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AuthViewModel$onSignInClick$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AuthViewModel$onSignInClick$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        String str;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            aVar = this.this$0.authService;
            AuthService authService = (AuthService) aVar.get();
            String email = this.$this_queueStateUpdate.getEmail();
            String password = this.$this_queueStateUpdate.getPassword();
            this.label = 1;
            obj = authService.signInWithEmailPassword(email, password, this);
            xn.a aVar2 = xn.a.f37986a;
            if (obj == aVar2) {
                return aVar2;
            }
        }
        AuthService.AuthResult authResult = (AuthService.AuthResult) obj;
        Logger logger = this.this$0.getLogger();
        str = this.this$0.tag;
        logger.log(str, "result: " + authResult);
        if (!kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.InvalidEmail.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.AccountBanned.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.AccountDeleted.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.FailedToConnect.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.Unknown.INSTANCE) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.TooManyRequests.INSTANCE) && !(authResult instanceof AuthService.AuthResult.Error.FirebaseGeneric) && !kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.InvalidCredentials.INSTANCE)) {
            if (!kotlin.jvm.internal.m.c(authResult, AuthService.AuthResult.Error.AccountNotVerified.INSTANCE) && !(authResult instanceof AuthService.AuthResult.Error.MultiFactorRequired) && !(authResult instanceof AuthService.AuthResult.Success)) {
                if (authResult instanceof AuthService.AuthResult.Error.MultiFactorError) {
                    this.this$0.getAnalytics().log(Analytics.Event.SignupLoginError.INSTANCE);
                } else {
                    c6.p();
                    return null;
                }
            }
        } else {
            this.this$0.getAnalytics().log(Analytics.Event.SignupLoginError.INSTANCE);
        }
        this.this$0.handleAuthResult(authResult);
        return z.f31622a;
    }
}
