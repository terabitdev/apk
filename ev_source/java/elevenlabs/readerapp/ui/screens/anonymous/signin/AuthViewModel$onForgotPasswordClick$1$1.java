package io.elevenlabs.readerapp.ui.screens.anonymous.signin;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.PasswordResetService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.anonymous.signin.AuthViewModel$onForgotPasswordClick$1$1", f = "AuthViewModel.kt", l = {277}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AuthViewModel$onForgotPasswordClick$1$1 extends yn.i implements p {
    final /* synthetic */ SignInState $this_queueStateUpdate;
    int label;
    final /* synthetic */ AuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthViewModel$onForgotPasswordClick$1$1(AuthViewModel authViewModel, SignInState signInState, wn.c<? super AuthViewModel$onForgotPasswordClick$1$1> cVar) {
        super(2, cVar);
        this.this$0 = authViewModel;
        this.$this_queueStateUpdate = signInState;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AuthViewModel$onForgotPasswordClick$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AuthViewModel$onForgotPasswordClick$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        jl.a aVar2;
        jl.a aVar3;
        String str;
        jl.a aVar4;
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
            aVar = this.this$0.passwordResetService;
            PasswordResetService passwordResetService = (PasswordResetService) aVar.get();
            String email = this.$this_queueStateUpdate.getEmail();
            this.label = 1;
            obj = passwordResetService.resetPassword(email, this);
            xn.a aVar5 = xn.a.f37986a;
            if (obj == aVar5) {
                return aVar5;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            Logger logger = this.this$0.getLogger();
            str = this.this$0.tag;
            Logger.logWarning$default(logger, str, "Error resetting password", null, 4, null);
            aVar4 = this.this$0.toastService;
            Object obj2 = aVar4.get();
            obj2.getClass();
            ToastService toastService = (ToastService) obj2;
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            aVar2 = this.this$0.toastService;
            Object obj3 = aVar2.get();
            obj3.getClass();
            ToastService toastService2 = (ToastService) obj3;
            aVar3 = this.this$0.stringProvider;
            ToastService.showToast$default(toastService2, ((StringProvider) aVar3.get()).getString(R.string.signin_password_reset_sent, this.$this_queueStateUpdate.getEmail()), null, ToastService.ToastVariant.SUCCESS, 2, null);
        } else {
            c6.p();
            return null;
        }
        this.this$0.queueStateUpdate(new g(0));
        return z.f31622a;
    }
}
