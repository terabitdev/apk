package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.OneTimeProductsPage;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel$fetchData$1$1", f = "PurchaseHoursViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PurchaseHoursViewModel$fetchData$1$1 extends yn.i implements p {
    int label;
    final /* synthetic */ PurchaseHoursViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHoursViewModel$fetchData$1$1(PurchaseHoursViewModel purchaseHoursViewModel, wn.c<? super PurchaseHoursViewModel$fetchData$1$1> cVar) {
        super(2, cVar);
        this.this$0 = purchaseHoursViewModel;
    }

    public static final PurchaseHoursState invokeSuspend$lambda$0(AsyncCallResult asyncCallResult, PurchaseHoursState purchaseHoursState) {
        return PurchaseHoursState.copy$default(purchaseHoursState, false, null, null, (OneTimeProductsPage) ((AsyncCallResult.Success) asyncCallResult).getData(), false, null, null, 118, null);
    }

    public static final PurchaseHoursState invokeSuspend$lambda$1(PurchaseHoursViewModel purchaseHoursViewModel, AsyncCallResult asyncCallResult, PurchaseHoursState purchaseHoursState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = purchaseHoursViewModel.resolveErrorMessageUseCase;
        return PurchaseHoursState.copy$default(purchaseHoursState, false, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, false, null, null, 124, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new PurchaseHoursViewModel$fetchData$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((PurchaseHoursViewModel$fetchData$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ProductsService productsService;
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
            productsService = this.this$0.productsService;
            str = this.this$0.productContext;
            this.label = 1;
            obj = productsService.getOneTimeCreditsProductsPage(str, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Success) {
            this.this$0.queueStateUpdate(new k((AsyncCallResult.Success) asyncCallResult, 1));
        } else if (asyncCallResult instanceof AsyncCallResult.Error) {
            PurchaseHoursViewModel purchaseHoursViewModel = this.this$0;
            purchaseHoursViewModel.queueStateUpdate(new l(purchaseHoursViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
        } else {
            c6.p();
            return null;
        }
        return z.f31622a;
    }
}
