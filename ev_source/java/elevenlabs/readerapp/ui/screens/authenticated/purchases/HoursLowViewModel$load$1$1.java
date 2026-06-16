package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import com.google.protobuf.c6;
import fr.d0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.OneTimeProductsPage;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel$load$1$1", f = "HoursLowScreen.kt", l = {102}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class HoursLowViewModel$load$1$1 extends yn.i implements ho.p {
    int label;
    final /* synthetic */ HoursLowViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoursLowViewModel$load$1$1(HoursLowViewModel hoursLowViewModel, wn.c<? super HoursLowViewModel$load$1$1> cVar) {
        super(2, cVar);
        this.this$0 = hoursLowViewModel;
    }

    public static final HoursLowState invokeSuspend$lambda$0(HoursLowViewModel hoursLowViewModel, AsyncCallResult asyncCallResult, HoursLowState hoursLowState) {
        ResolveErrorMessageUseCase resolveErrorMessageUseCase;
        resolveErrorMessageUseCase = hoursLowViewModel.resolveErrorMessageUseCase;
        return HoursLowState.copy$default(hoursLowState, false, null, ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), null, null, false, null, null, 250, null);
    }

    public static final HoursLowState invokeSuspend$lambda$1(AsyncCallResult asyncCallResult, HoursLowState hoursLowState) {
        return HoursLowState.copy$default(hoursLowState, false, null, null, null, null, false, null, (OneTimeProductsPage) ((AsyncCallResult.Success) asyncCallResult).getData(), 126, null);
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new HoursLowViewModel$load$1$1(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((HoursLowViewModel$load$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ProductsService productsService;
        Analytics.Event.CreditPackSource creditPackSource;
        Analytics analytics;
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
            this.label = 1;
            obj = productsService.getLowHoursPage(this);
            xn.a aVar = xn.a.f37986a;
            if (obj == aVar) {
                return aVar;
            }
        }
        AsyncCallResult asyncCallResult = (AsyncCallResult) obj;
        if (asyncCallResult instanceof AsyncCallResult.Error) {
            HoursLowViewModel hoursLowViewModel = this.this$0;
            hoursLowViewModel.queueStateUpdate(new q(hoursLowViewModel, (AsyncCallResult.Error) asyncCallResult, 0));
        } else if (asyncCallResult instanceof AsyncCallResult.Success) {
            AsyncCallResult.Success success = (AsyncCallResult.Success) asyncCallResult;
            this.this$0.queueStateUpdate(new g(success, 1));
            HoursLowViewModel hoursLowViewModel2 = this.this$0;
            if (((OneTimeProductsPage) success.getData()).getCurrentMinutes() == 0) {
                creditPackSource = Analytics.Event.CreditPackSource.NoCreditsSheet;
            } else {
                creditPackSource = Analytics.Event.CreditPackSource.LowCreditsSheet;
            }
            analytics = hoursLowViewModel2.analytics;
            analytics.log(new Analytics.Event.PaymentViewedCreditPackSheet(creditPackSource));
        } else {
            c6.p();
            return null;
        }
        return sn.z.f31622a;
    }
}
