package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.account.ManagePurchasesViewModel$restorePurchases$1$1", f = "ManagePurchasesViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ManagePurchasesViewModel$restorePurchases$1$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ ManagePurchasesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagePurchasesViewModel$restorePurchases$1$1(ManagePurchasesViewModel managePurchasesViewModel, wn.c<? super ManagePurchasesViewModel$restorePurchases$1$1> cVar) {
        super(2, cVar);
        this.this$0 = managePurchasesViewModel;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new ManagePurchasesViewModel$restorePurchases$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((ManagePurchasesViewModel$restorePurchases$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        PurchasesService purchasesService;
        jl.a aVar;
        jl.a aVar2;
        jl.a aVar3;
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
            purchasesService = this.this$0.purchasesService;
            this.label = 1;
            obj = purchasesService.restorePurchases(this);
            xn.a aVar5 = xn.a.f37986a;
            if (obj == aVar5) {
                return aVar5;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            aVar4 = this.this$0.toastService;
            Object obj2 = aVar4.get();
            obj2.getClass();
            ToastService toastService = (ToastService) obj2;
            resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
            ToastService.showToast$default(toastService, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, ToastService.ToastVariant.ERROR, 2, null);
            this.this$0.queueStateUpdate(new j(4));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            aVar = this.this$0.toastService;
            ToastService toastService2 = (ToastService) aVar.get();
            aVar2 = this.this$0.stringProvider;
            String string = ((StringProvider) aVar2.get()).getString(R.string.account_restore_purchases_success_title);
            aVar3 = this.this$0.stringProvider;
            toastService2.showToast(new ToastService.Toast.Action(string, ((StringProvider) aVar3.get()).getString(R.string.account_restore_purchases_success_body), null, 4, null));
            this.this$0.queueStateUpdate(new j(5));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
