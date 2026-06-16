package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import com.google.protobuf.c6;
import fr.d0;
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
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.AccountViewModel$resetPassword$1$1", f = "AccountViewModel.kt", l = {166}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AccountViewModel$resetPassword$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $email;
    int label;
    final /* synthetic */ AccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountViewModel$resetPassword$1$1(AccountViewModel accountViewModel, String str, wn.c<? super AccountViewModel$resetPassword$1$1> cVar) {
        super(2, cVar);
        this.this$0 = accountViewModel;
        this.$email = str;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new AccountViewModel$resetPassword$1$1(this.this$0, this.$email, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((AccountViewModel$resetPassword$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        jl.a aVar2;
        jl.a aVar3;
        Logger logger;
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
            String str = this.$email;
            this.label = 1;
            obj = passwordResetService.resetPassword(str, this);
            xn.a aVar5 = xn.a.f37986a;
            if (obj == aVar5) {
                return aVar5;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            logger = this.this$0.logger;
            Logger.logWarning$default(logger, AccountViewModel.TAG, "Error resetting password", null, 4, null);
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
            ToastService.showToast$default(toastService2, ((StringProvider) aVar3.get()).getString(R.string.settings_password_reset_sent, this.$email), null, ToastService.ToastVariant.SUCCESS, 2, null);
        } else {
            c6.p();
            return null;
        }
        this.this$0.queueStateUpdate(new j(0));
        return z.f31622a;
    }
}
