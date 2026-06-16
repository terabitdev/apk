package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.SignUpService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify.VerifyEmailViewModel$submitVerificationCode$1$1", f = "VerifyEmailViewModel.kt", l = {66, 77, 78}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class VerifyEmailViewModel$submitVerificationCode$1$1 extends i implements p {
    final /* synthetic */ VerifyEmailState $this_queueStateUpdate;
    Object L$0;
    int label;
    final /* synthetic */ VerifyEmailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailViewModel$submitVerificationCode$1$1(VerifyEmailViewModel verifyEmailViewModel, VerifyEmailState verifyEmailState, wn.c<? super VerifyEmailViewModel$submitVerificationCode$1$1> cVar) {
        super(2, cVar);
        this.this$0 = verifyEmailViewModel;
        this.$this_queueStateUpdate = verifyEmailState;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VerifyEmailViewModel$submitVerificationCode$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VerifyEmailViewModel$submitVerificationCode$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (r12 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r12 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
    
        if (r12 == r5) goto L71;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SignUpService signUpService;
        AuthService authService;
        Logger logger;
        ToastService toastService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        ToastService toastService2;
        StringProvider stringProvider;
        SignUpService signUpService2;
        Logger logger2;
        Analytics analytics;
        Analytics analytics2;
        Logger logger3;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        sn.a.g(obj);
                        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
                        if (asyncCallResult instanceof AsyncCallResult.Success) {
                            logger3 = this.this$0.logger;
                            logger3.log("VerifyEmailViewModel", "Post-registration setup successful");
                        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                            logger2 = this.this$0.logger;
                            Logger.logWarning$default(logger2, "VerifyEmailViewModel", "Post-registration setup failed: " + asyncCallResult, null, 4, null);
                        } else {
                            c6.p();
                            return null;
                        }
                        analytics = this.this$0.analytics;
                        analytics.log(Analytics.Event.SignupSignupSuccess.INSTANCE);
                        analytics2 = this.this$0.analytics;
                        analytics2.log(Analytics.Event.SignupLoginSuccess.INSTANCE);
                        return z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VerifyEmailViewModel verifyEmailViewModel = this.this$0;
                if (booleanValue) {
                    signUpService2 = verifyEmailViewModel.signUpService;
                    this.L$0 = null;
                    this.label = 3;
                    obj = signUpService2.postRegistrationSetup(this);
                } else {
                    toastService2 = verifyEmailViewModel.toastService;
                    stringProvider = this.this$0.stringProvider;
                    ToastService.showToast$default(toastService2, stringProvider.getString(R.string.verify_email_account_verified), null, ToastService.ToastVariant.SUCCESS, 2, null);
                    this.this$0.queueStateUpdate(new f(3));
                    return z.f31622a;
                }
            } else {
                sn.a.g(obj);
            }
        } else {
            sn.a.g(obj);
            signUpService = this.this$0.signUpService;
            String email = this.$this_queueStateUpdate.getEmail();
            String verificationCode = this.$this_queueStateUpdate.getVerificationCode();
            this.label = 1;
            obj = signUpService.sendVerificationCode(email, verificationCode, this);
        }
        AsyncCallResult asyncCallResult2 = (AsyncCallResult) obj;
        if (asyncCallResult2 instanceof AsyncCallResult.Error) {
            logger = this.this$0.logger;
            Logger.logWarning$default(logger, "VerifyEmailViewModel", "Error sending verification code", null, 4, null);
            toastService = this.this$0.toastService;
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult2, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
            this.this$0.queueStateUpdate(new f(2));
            return z.f31622a;
        }
        if (asyncCallResult2 instanceof AsyncCallResult.Success) {
            authService = this.this$0.authService;
            this.L$0 = null;
            this.label = 2;
            obj = authService.tryAutoSignInAfterCreateUserEmailVerification(this);
        } else {
            c6.p();
            return null;
        }
    }
}
