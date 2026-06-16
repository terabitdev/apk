package io.elevenlabs.readerapp.ui.screens.authenticated.account.delete;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.delete.DeleteAccountViewModel$deleteAccount$1", f = "DeleteAccountViewModel.kt", l = {40}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class DeleteAccountViewModel$deleteAccount$1 extends i implements p {
    int label;
    final /* synthetic */ DeleteAccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountViewModel$deleteAccount$1(DeleteAccountViewModel deleteAccountViewModel, wn.c<? super DeleteAccountViewModel$deleteAccount$1> cVar) {
        super(2, cVar);
        this.this$0 = deleteAccountViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new DeleteAccountViewModel$deleteAccount$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((DeleteAccountViewModel$deleteAccount$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        ToastService toastService;
        ToastService toastService2;
        StringProvider stringProvider;
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
            this.this$0.queueStateUpdate(new e(0));
            AuthService authService = this.this$0.authService;
            this.label = 1;
            obj = authService.deleteUser(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            toastService2 = this.this$0.toastService;
            stringProvider = this.this$0.stringProvider;
            ToastService.showToast$default(toastService2, stringProvider.invoke(R.string.account_deleted), null, ToastService.ToastVariant.SUCCESS, 2, null);
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            this.this$0.queueStateUpdate(new e(1));
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            String invoke$default = ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null);
            toastService = this.this$0.toastService;
            ToastService.showToast$default(toastService, invoke$default, null, ToastService.ToastVariant.ERROR, 2, null);
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
