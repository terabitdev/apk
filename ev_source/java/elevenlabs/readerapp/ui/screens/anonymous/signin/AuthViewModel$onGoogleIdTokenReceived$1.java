package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.SignUpService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthViewModel$onGoogleIdTokenReceived$1", f = "AuthViewModel.kt", l = {114, 117}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AuthViewModel$onGoogleIdTokenReceived$1 extends yn.i implements p {
    final /* synthetic */ String $idToken;
    Object L$0;
    int label;
    final /* synthetic */ AuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthViewModel$onGoogleIdTokenReceived$1(AuthViewModel authViewModel, String str, wn.c<? super AuthViewModel$onGoogleIdTokenReceived$1> cVar) {
        super(2, cVar);
        this.this$0 = authViewModel;
        this.$idToken = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AuthViewModel$onGoogleIdTokenReceived$1(this.this$0, this.$idToken, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AuthViewModel$onGoogleIdTokenReceived$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r9 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (r9 == r3) goto L19;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        AuthService.AuthResult authResult;
        String str;
        jl.a aVar2;
        String str2;
        String str3;
        int i10 = this.label;
        xn.a aVar3 = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    authResult = (AuthService.AuthResult) this.L$0;
                    sn.a.g(obj);
                    AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                    if (asyncCallResult instanceof AsyncCallResult.Success) {
                        Logger logger = this.this$0.getLogger();
                        str3 = this.this$0.tag;
                        logger.log(str3, "Post-registration setup successful");
                    } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                        Logger logger2 = this.this$0.getLogger();
                        str2 = this.this$0.tag;
                        Logger.logWarning$default(logger2, str2, "Post-registration setup failed: " + asyncCallResult, null, 4, null);
                    } else {
                        c6.p();
                        return null;
                    }
                    this.this$0.handleAuthResult(authResult);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            aVar = this.this$0.authService;
            AuthService authService = (AuthService) aVar.get();
            String str4 = this.$idToken;
            this.label = 1;
            obj = authService.signInWithGoogleToken(str4, this);
        }
        authResult = (AuthService.AuthResult) obj;
        Logger logger3 = this.this$0.getLogger();
        str = this.this$0.tag;
        logger3.log(str, "Google sign in result: " + authResult);
        if ((authResult instanceof AuthService.AuthResult.Success) && ((AuthService.AuthResult.Success) authResult).isNewUser()) {
            aVar2 = this.this$0.signUpService;
            SignUpService signUpService = (SignUpService) aVar2.get();
            this.L$0 = authResult;
            this.label = 2;
            obj = signUpService.postRegistrationSetup(this);
        }
        this.this$0.handleAuthResult(authResult);
        return z.f31622a;
    }
}
