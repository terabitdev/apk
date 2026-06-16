package io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.SignUpService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.verify.VerifyEmailViewModel$sendVerificationEmail$1$1", f = "VerifyEmailViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class VerifyEmailViewModel$sendVerificationEmail$1$1 extends i implements p {
    final /* synthetic */ VerifyEmailState $this_queueStateUpdate;
    int label;
    final /* synthetic */ VerifyEmailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailViewModel$sendVerificationEmail$1$1(VerifyEmailViewModel verifyEmailViewModel, VerifyEmailState verifyEmailState, wn.c<? super VerifyEmailViewModel$sendVerificationEmail$1$1> cVar) {
        super(2, cVar);
        this.this$0 = verifyEmailViewModel;
        this.$this_queueStateUpdate = verifyEmailState;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VerifyEmailViewModel$sendVerificationEmail$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((VerifyEmailViewModel$sendVerificationEmail$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        SignUpService signUpService;
        Logger logger;
        ToastService toastService;
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
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
            signUpService = this.this$0.signUpService;
            String email = this.$this_queueStateUpdate.getEmail();
            this.label = 1;
            obj = signUpService.sendVerificationPasswordEmail(email, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            logger = this.this$0.logger;
            Logger.logWarning$default(logger, "VerifyEmailViewModel", "Error sending verification link", null, 4, null);
            toastService = this.this$0.toastService;
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
            this.this$0.queueStateUpdate(new f(0));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new f(1));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
