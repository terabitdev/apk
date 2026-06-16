package io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.usecase.ResolveMultiFactorResult;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.MfaVerificationViewModel$onSubmitCode$2", f = "MfaViewModel.kt", l = {122}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class MfaVerificationViewModel$onSubmitCode$2 extends yn.i implements p {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ MfaVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaVerificationViewModel$onSubmitCode$2(MfaVerificationViewModel mfaVerificationViewModel, String str, wn.c<? super MfaVerificationViewModel$onSubmitCode$2> cVar) {
        super(2, cVar);
        this.this$0 = mfaVerificationViewModel;
        this.$code = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new MfaVerificationViewModel$onSubmitCode$2(this.this$0, this.$code, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((MfaVerificationViewModel$onSubmitCode$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        AuthService authService;
        Logger logger;
        Logger logger2;
        int i10;
        Logger logger3;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            authService = this.this$0.authService;
            String str = this.$code;
            this.label = 1;
            obj = authService.verifyMfaCode(str, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AuthService.AuthResult authResult = (AuthService.AuthResult) obj;
        if (authResult instanceof AuthService.AuthResult.Success) {
            logger3 = this.this$0.logger;
            logger3.log("MfaViewModel", "MFA verification successful, navigating away");
            this.this$0.queueStateUpdate(new i(0));
        } else {
            boolean z6 = authResult instanceof AuthService.AuthResult.Error.MultiFactorError;
            MfaVerificationViewModel mfaVerificationViewModel = this.this$0;
            if (z6) {
                logger2 = mfaVerificationViewModel.logger;
                AuthService.AuthResult.Error.MultiFactorError multiFactorError = (AuthService.AuthResult.Error.MultiFactorError) authResult;
                Logger.logWarning$default(logger2, "MfaViewModel", "MFA verification failed: " + multiFactorError.getError(), null, 4, null);
                ResolveMultiFactorResult.Error error = multiFactorError.getError();
                if (m.c(error, ResolveMultiFactorResult.Error.InvalidCode.INSTANCE)) {
                    i10 = R.string.signin_error_invalid_verification_code;
                } else if (m.c(error, ResolveMultiFactorResult.Error.TooManyAttempts.INSTANCE)) {
                    i10 = R.string.signin_error_too_many_attempts;
                } else if (m.c(error, ResolveMultiFactorResult.Error.Unknown.INSTANCE)) {
                    i10 = R.string.signin_error_unknown;
                } else {
                    c6.p();
                    return null;
                }
                this.this$0.showErrorToast(i10);
                this.this$0.queueStateUpdate(new i(1));
            } else {
                logger = mfaVerificationViewModel.logger;
                Logger.logWarning$default(logger, "MfaViewModel", "Unexpected auth result: " + authResult, null, 4, null);
                this.this$0.showErrorToast(R.string.signin_error_unknown);
                this.this$0.queueStateUpdate(new i(2));
            }
        }
        return z.f31622a;
    }
}
