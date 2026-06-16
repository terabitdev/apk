package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import android.app.Activity;
import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.usecase.PurchaseAndRefreshCreditsUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel$purchaseProduct$1$1", f = "HoursLowScreen.kt", l = {134}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class HoursLowViewModel$purchaseProduct$1$1 extends yn.i implements ho.p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Analytics.Event.CreditPackSource $creditPackSource;
    final /* synthetic */ OneTimeCreditsProduct $product;
    int label;
    final /* synthetic */ HoursLowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoursLowViewModel$purchaseProduct$1$1(HoursLowViewModel hoursLowViewModel, OneTimeCreditsProduct oneTimeCreditsProduct, Activity activity, Analytics.Event.CreditPackSource creditPackSource, wn.c<? super HoursLowViewModel$purchaseProduct$1$1> cVar) {
        super(2, cVar);
        this.this$0 = hoursLowViewModel;
        this.$product = oneTimeCreditsProduct;
        this.$activity = activity;
        this.$creditPackSource = creditPackSource;
    }

    public static final HoursLowState invokeSuspend$lambda$0(HoursLowViewModel hoursLowViewModel, AsyncCallResult asyncCallResult, HoursLowState hoursLowState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = hoursLowViewModel.resolveErrorMessageUseCase;
        return HoursLowState.copy$default(hoursLowState, false, null, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, false, null, null, 215, null);
    }

    public static final HoursLowState invokeSuspend$lambda$3(OneTimeCreditsProduct oneTimeCreditsProduct, HoursLowState hoursLowState) {
        return HoursLowState.copy$default(hoursLowState, false, null, null, null, null, false, oneTimeCreditsProduct, null, 159, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new HoursLowViewModel$purchaseProduct$1$1(this.this$0, this.$product, this.$activity, this.$creditPackSource, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((HoursLowViewModel$purchaseProduct$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        PurchaseAndRefreshCreditsUseCase purchaseAndRefreshCreditsUseCase;
        Analytics analytics;
        Analytics analytics2;
        Analytics analytics3;
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
            purchaseAndRefreshCreditsUseCase = this.this$0.purchaseAndRefreshCreditsUseCase;
            String id2 = this.$product.getId();
            Activity activity = this.$activity;
            this.label = 1;
            obj = purchaseAndRefreshCreditsUseCase.invoke(id2, activity, this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            HoursLowViewModel hoursLowViewModel = this.this$0;
            hoursLowViewModel.queueStateUpdate(new q(hoursLowViewModel, (AsyncCallResult.Error) asyncCallResult, 1));
            analytics3 = this.this$0.analytics;
            analytics3.log(new Analytics.Event.PaymentError(Analytics.Event.PaymentErrorSource.CreditPack));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            PurchasesService.PurchaseResult purchaseResult = (PurchasesService.PurchaseResult) ((AsyncCallResult.Success) asyncCallResult).getData();
            if (kotlin.jvm.internal.m.c(purchaseResult, PurchasesService.PurchaseResult.Cancelled.INSTANCE)) {
                this.this$0.queueStateUpdate(new k(2));
            } else if (purchaseResult instanceof PurchasesService.PurchaseResult.Purchased) {
                this.this$0.queueStateUpdate(new r(this.$product, 0));
                HoursLowViewModel hoursLowViewModel2 = this.this$0;
                OneTimeCreditsProduct oneTimeCreditsProduct = this.$product;
                Analytics.Event.CreditPackSource creditPackSource = this.$creditPackSource;
                analytics = hoursLowViewModel2.analytics;
                analytics.log(new Analytics.Event.PaymentActivatedCreditPack(oneTimeCreditsProduct.getId(), creditPackSource));
                analytics2 = hoursLowViewModel2.analytics;
                analytics2.log(Analytics.Event.PaymentCompletedPurchase.INSTANCE);
            } else {
                c6.p();
                return null;
            }
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
