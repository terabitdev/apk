package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import android.app.Activity;
import androidx.lifecycle.c1;
import androidx.lifecycle.z0;
import com.google.protobuf.c6;
import fr.d0;
import fr.g0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.usecase.PurchaseAndRefreshCreditsUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.o;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/purchasehours/PurchaseHoursViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/purchasehours/PurchaseHoursState;", "Landroidx/lifecycle/z0;", "savedStateHandle", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/ProductsService;", "productsService", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/usecase/PurchaseAndRefreshCreditsUseCase;", "purchaseAndRefreshCreditsUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/Analytics;", "analytics", "<init>", "(Landroidx/lifecycle/z0;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/ProductsService;Lio/elevenlabs/domain/services/CustomerService;Lio/elevenlabs/domain/usecase/PurchaseAndRefreshCreditsUseCase;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Lio/elevenlabs/domain/Analytics;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "fetchData", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Landroid/app/Activity;", "activity", "Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "product", "purchaseProduct", "(Landroid/app/Activity;Lio/elevenlabs/domain/model/OneTimeCreditsProduct;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "closePurchaseError", "Lio/elevenlabs/domain/services/ProductsService;", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/domain/usecase/PurchaseAndRefreshCreditsUseCase;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/Analytics;", "", "productContext", "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PurchaseHoursViewModel extends MviViewModel<PurchaseHoursState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final CustomerService customerService;
    private final String productContext;
    private final ProductsService productsService;
    private final PurchaseAndRefreshCreditsUseCase purchaseAndRefreshCreditsUseCase;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PurchaseHoursViewModel(z0 z0Var, DispatcherFactory dispatcherFactory, ProductsService productsService, CustomerService customerService, PurchaseAndRefreshCreditsUseCase purchaseAndRefreshCreditsUseCase, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics) {
        super(new PurchaseHoursState(false, null, null, null, false, null, null, 127, null), dispatcherFactory, r3, 4, null);
        z0Var.getClass();
        dispatcherFactory.getClass();
        productsService.getClass();
        customerService.getClass();
        purchaseAndRefreshCreditsUseCase.getClass();
        resolveErrorMessageUseCase.getClass();
        analytics.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        this.productsService = productsService;
        this.customerService = customerService;
        this.purchaseAndRefreshCreditsUseCase = purchaseAndRefreshCreditsUseCase;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.analytics = analytics;
        this.productContext = (String) z0Var.a("context");
        g0.D(c1.h(this), dispatcherFactory.getDefault(), null, new AnonymousClass1(null), 2);
        fetchData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PurchaseHoursState closePurchaseError$lambda$0(PurchaseHoursState purchaseHoursState) {
        purchaseHoursState.getClass();
        return PurchaseHoursState.copy$default(purchaseHoursState, false, null, "", null, false, null, null, 123, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PurchaseHoursState fetchData$lambda$0(PurchaseHoursViewModel purchaseHoursViewModel, PurchaseHoursState purchaseHoursState) {
        purchaseHoursState.getClass();
        if (purchaseHoursState.isLoading()) {
            return purchaseHoursState;
        }
        purchaseHoursViewModel.analytics.log(Analytics.Event.PaymentViewedCreditPackPage.INSTANCE);
        g0.D(c1.h(purchaseHoursViewModel), purchaseHoursViewModel.getDispatcherFactory().getDefault(), null, new PurchaseHoursViewModel$fetchData$1$1(purchaseHoursViewModel, null), 2);
        return PurchaseHoursState.copy$default(purchaseHoursState, true, "", null, null, false, null, null, 124, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PurchaseHoursState purchaseProduct$lambda$0(PurchaseHoursViewModel purchaseHoursViewModel, OneTimeCreditsProduct oneTimeCreditsProduct, Activity activity, PurchaseHoursState purchaseHoursState) {
        purchaseHoursState.getClass();
        if (purchaseHoursState.isLoadingPurchase()) {
            return purchaseHoursState;
        }
        Analytics.Event.CreditPackSource creditPackSource = Analytics.Event.CreditPackSource.AccountPage;
        purchaseHoursViewModel.analytics.log(new Analytics.Event.PaymentClickedCreditPackPurchaseButton(creditPackSource));
        g0.D(c1.h(purchaseHoursViewModel), purchaseHoursViewModel.getDispatcherFactory().getDefault(), null, new PurchaseHoursViewModel$purchaseProduct$1$1(purchaseHoursViewModel, oneTimeCreditsProduct, activity, creditPackSource, null), 2);
        return PurchaseHoursState.copy$default(purchaseHoursState, false, null, null, null, true, null, null, 111, null);
    }

    public final MviViewModel.StateUpdate closePurchaseError() {
        return queueStateUpdate(new m(6));
    }

    public final MviViewModel.StateUpdate fetchData() {
        return queueStateUpdate(new i(this, 1));
    }

    public final MviViewModel.StateUpdate purchaseProduct(Activity activity, OneTimeCreditsProduct product) {
        activity.getClass();
        product.getClass();
        return queueStateUpdate(new o(this, product, activity, 3));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel$1", f = "PurchaseHoursViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel$1$1", f = "PurchaseHoursViewModel.kt", l = {39}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C00461 extends yn.i implements p {
            int label;
            final /* synthetic */ PurchaseHoursViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00461(PurchaseHoursViewModel purchaseHoursViewModel, wn.c<? super C00461> cVar) {
                super(2, cVar);
                this.this$0 = purchaseHoursViewModel;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                return new C00461(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
                return ((C00461) create(d0Var, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
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
                    ir.i sync = this.this$0.customerService.sync();
                    this.label = 1;
                    Object k4 = r.k(sync, this);
                    xn.a aVar = xn.a.f37986a;
                    if (k4 == aVar) {
                        return aVar;
                    }
                }
                return z.f31622a;
            }
        }

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            d0 d0Var = (d0) this.L$0;
            if (this.label == 0) {
                sn.a.g(obj);
                g0.D(d0Var, null, null, new C00461(PurchaseHoursViewModel.this, null), 3);
                g0.D(d0Var, null, null, new AnonymousClass2(PurchaseHoursViewModel.this, null), 3);
                return z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel$1$2", f = "PurchaseHoursViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends yn.i implements p {
            int label;
            final /* synthetic */ PurchaseHoursViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PurchaseHoursViewModel purchaseHoursViewModel, wn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = purchaseHoursViewModel;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                return new AnonymousClass2(this.this$0, cVar);
            }

            @Override // ho.p
            public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
                return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
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
                    ir.i customer = this.this$0.customerService.getCustomer();
                    C00471 c00471 = new C00471(this.this$0);
                    this.label = 1;
                    Object collect = customer.collect(c00471, this);
                    xn.a aVar = xn.a.f37986a;
                    if (collect == aVar) {
                        return aVar;
                    }
                }
                return z.f31622a;
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel$1$2$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C00471<T> implements ir.j {
                final /* synthetic */ PurchaseHoursViewModel this$0;

                public C00471(PurchaseHoursViewModel purchaseHoursViewModel) {
                    this.this$0 = purchaseHoursViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final PurchaseHoursState emit$lambda$0(Customer customer, PurchaseHoursState purchaseHoursState) {
                    purchaseHoursState.getClass();
                    return PurchaseHoursState.copy$default(purchaseHoursState, false, null, null, null, false, null, customer, 63, null);
                }

                public final Object emit(Customer customer, wn.c<? super z> cVar) {
                    this.this$0.queueStateUpdate(new k(customer, 0));
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                    return emit((Customer) obj, (wn.c<? super z>) cVar);
                }
            }
        }
    }
}
