package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import android.app.Activity;
import androidx.lifecycle.c1;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.OneTimeProductsPage;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.PurchaseAndRefreshCreditsUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/HoursLowViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/HoursLowState;", "dispatcherFactory", "Lio/elevenlabs/domain/DispatcherFactory;", "readsService", "Lio/elevenlabs/domain/services/ReadsService;", "productsService", "Lio/elevenlabs/domain/services/ProductsService;", "purchaseAndRefreshCreditsUseCase", "Lio/elevenlabs/domain/usecase/PurchaseAndRefreshCreditsUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "analytics", "Lio/elevenlabs/domain/Analytics;", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/ProductsService;Lio/elevenlabs/domain/usecase/PurchaseAndRefreshCreditsUseCase;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Analytics;)V", "load", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "purchaseProduct", "activity", "Landroid/app/Activity;", "product", "Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "closePurchaseError", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HoursLowViewModel extends MviViewModel<HoursLowState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final ProductsService productsService;
    private final PurchaseAndRefreshCreditsUseCase purchaseAndRefreshCreditsUseCase;
    private final ReadsService readsService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel$1", f = "HoursLowScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel$1$1", f = "HoursLowScreen.kt", l = {88, 92}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.HoursLowViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00441 extends yn.i implements ho.p {
            int label;
            final /* synthetic */ HoursLowViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00441(HoursLowViewModel hoursLowViewModel, wn.c<? super C00441> cVar) {
                super(2, cVar);
                this.this$0 = hoursLowViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HoursLowState invokeSuspend$lambda$0(String str, HoursLowState hoursLowState) {
                return HoursLowState.copy$default(hoursLowState, false, str, null, null, null, false, null, null, 253, null);
            }

            @Override // yn.a
            public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                return new C00441(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
                return ((C00441) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
            
                if (r6 == r3) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
            
                return r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
            
                if (r6 == r3) goto L15;
             */
            @Override // yn.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                String str;
                ReadMeta readMeta;
                int i10 = this.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            List list = (List) obj;
                            if (list != null && (readMeta = (ReadMeta) tn.o.y0(list)) != null) {
                                str = readMeta.getReadId();
                            } else {
                                str = null;
                            }
                            this.this$0.queueStateUpdate(new p(str, 0));
                            this.this$0.load();
                            return sn.z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsService readsService = this.this$0.readsService;
                    Boolean bool = Boolean.FALSE;
                    ReadsService.SortBy sortBy = ReadsService.SortBy.UpdatedAt;
                    this.label = 1;
                    obj = readsService.getReads(1, bool, sortBy, this);
                }
                this.label = 2;
                obj = ir.r.w((ir.i) obj, this);
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            d0 d0Var = (d0) this.L$0;
            if (this.label == 0) {
                sn.a.g(obj);
                g0.D(d0Var, null, null, new C00441(HoursLowViewModel.this, null), 3);
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HoursLowViewModel(DispatcherFactory dispatcherFactory, ReadsService readsService, ProductsService productsService, PurchaseAndRefreshCreditsUseCase purchaseAndRefreshCreditsUseCase, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics) {
        super(new HoursLowState(false, null, null, null, null, false, null, null, 255, null), dispatcherFactory, r3, 4, 0 == true ? 1 : 0);
        dispatcherFactory.getClass();
        readsService.getClass();
        productsService.getClass();
        purchaseAndRefreshCreditsUseCase.getClass();
        resolveErrorMessageUseCase.getClass();
        analytics.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.readsService = readsService;
        this.productsService = productsService;
        this.purchaseAndRefreshCreditsUseCase = purchaseAndRefreshCreditsUseCase;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.analytics = analytics;
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HoursLowState closePurchaseError$lambda$0(HoursLowState hoursLowState) {
        hoursLowState.getClass();
        return HoursLowState.copy$default(hoursLowState, false, null, null, "", null, false, null, null, 247, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HoursLowState load$lambda$0(HoursLowViewModel hoursLowViewModel, HoursLowState hoursLowState) {
        hoursLowState.getClass();
        if (hoursLowState.isLoading()) {
            return hoursLowState;
        }
        g0.D(c1.h(hoursLowViewModel), hoursLowViewModel.getDispatcherFactory().getDefault(), null, new HoursLowViewModel$load$1$1(hoursLowViewModel, null), 2);
        return HoursLowState.copy$default(hoursLowState, true, null, "", null, null, false, null, null, 250, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HoursLowState purchaseProduct$lambda$0(HoursLowViewModel hoursLowViewModel, OneTimeCreditsProduct oneTimeCreditsProduct, Activity activity, HoursLowState hoursLowState) {
        Analytics.Event.CreditPackSource creditPackSource;
        hoursLowState.getClass();
        if (hoursLowState.isLoadingPurchase()) {
            return hoursLowState;
        }
        OneTimeProductsPage data = ((HoursLowState) hoursLowViewModel.getStateFlow().getValue()).getData();
        if (data != null && data.getCurrentMinutes() == 0) {
            creditPackSource = Analytics.Event.CreditPackSource.NoCreditsSheet;
        } else {
            creditPackSource = Analytics.Event.CreditPackSource.LowCreditsSheet;
        }
        Analytics.Event.CreditPackSource creditPackSource2 = creditPackSource;
        hoursLowViewModel.analytics.log(new Analytics.Event.PaymentClickedCreditPackPurchaseButton(creditPackSource2));
        g0.D(c1.h(hoursLowViewModel), hoursLowViewModel.getDispatcherFactory().getDefault(), null, new HoursLowViewModel$purchaseProduct$1$1(hoursLowViewModel, oneTimeCreditsProduct, activity, creditPackSource2, null), 2);
        return HoursLowState.copy$default(hoursLowState, false, null, null, null, null, true, null, null, 223, null);
    }

    public final MviViewModel.StateUpdate closePurchaseError() {
        return queueStateUpdate(new k(13));
    }

    public final MviViewModel.StateUpdate load() {
        return queueStateUpdate(new o(this, 1));
    }

    public final MviViewModel.StateUpdate purchaseProduct(Activity activity, OneTimeCreditsProduct product) {
        activity.getClass();
        product.getClass();
        return queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.o(this, product, activity, 1));
    }
}
