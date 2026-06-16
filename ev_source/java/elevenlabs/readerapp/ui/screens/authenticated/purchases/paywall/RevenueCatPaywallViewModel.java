package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import fr.d0;
import ho.p;
import ib.i;
import io.elevenlabs.data.database.entities.reads.h;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.OnboardingService;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.readerapp.core.MviViewModel;
import ir.j;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019BG\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0014¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0014¢\u0006\u0004\b0\u0010/J\r\u00101\u001a\u00020\u0018¢\u0006\u0004\b1\u0010\u001aJ\r\u00102\u001a\u00020\u0018¢\u0006\u0004\b2\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108¨\u0006:"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/paywall/RevenueCatPaywallViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/paywall/RevenueCatPaywallState;", "Ljl/a;", "Lcom/revenuecat/purchases/Purchases;", "purchases", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/services/OnboardingService;", "onboardingService", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "<init>", "(Ljl/a;Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/services/OnboardingService;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/CustomerService;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/StringProvider;)V", "Lcom/revenuecat/purchases/Package;", "", "isTrial", "(Lcom/revenuecat/purchases/Package;)Z", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "loadOfferings", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/services/ProductsService$PaywallSource;", "productsSourceIn", "Lio/elevenlabs/domain/Analytics$Event$PaywallSource;", "analyticsSourceIn", "Lsn/z;", "setSources", "(Lio/elevenlabs/domain/services/ProductsService$PaywallSource;Lio/elevenlabs/domain/Analytics$Event$PaywallSource;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "purchaseCompleted", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lcom/revenuecat/purchases/PurchasesError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "purchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "force", "onDismiss", "(Z)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "rcPackage", "purchaseInitiated", "(Lcom/revenuecat/purchases/Package;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "purchaseStarted", "onDismissed", "purchaseCancelled", "Ljl/a;", "Lio/elevenlabs/domain/services/OnboardingService;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/CustomerService;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/StringProvider;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RevenueCatPaywallViewModel extends MviViewModel<RevenueCatPaywallState> {
    private static final String TAG = "RevenueCatPaywall";
    private final Analytics analytics;
    private final CustomerService customerService;
    private final Logger logger;
    private final OnboardingService onboardingService;
    private final jl.a purchases;
    private final StringProvider stringProvider;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RevenueCatPaywallViewModel(jl.a aVar, DispatcherFactory dispatcherFactory, OnboardingService onboardingService, Analytics analytics, CustomerService customerService, Logger logger, StringProvider stringProvider) {
        super(new RevenueCatPaywallState(null, null, false, null, null, false, null, false, null, false, false, 2047, null), dispatcherFactory, r3, 4, 0 == true ? 1 : 0);
        aVar.getClass();
        dispatcherFactory.getClass();
        onboardingService.getClass();
        analytics.getClass();
        customerService.getClass();
        logger.getClass();
        stringProvider.getClass();
        Logger logger2 = null;
        this.purchases = aVar;
        this.onboardingService = onboardingService;
        this.analytics = analytics;
        this.customerService = customerService;
        this.logger = logger;
        this.stringProvider = stringProvider;
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
    }

    private final boolean isTrial(Package r12) {
        PricingPhase pricingPhase;
        SubscriptionOption defaultOption = r12.getProduct().getDefaultOption();
        if (defaultOption != null) {
            pricingPhase = defaultOption.getFreePhase();
        } else {
            pricingPhase = null;
        }
        if (pricingPhase != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevenueCatPaywallState loadOfferings$lambda$0(RevenueCatPaywallViewModel revenueCatPaywallViewModel, RevenueCatPaywallState revenueCatPaywallState) {
        revenueCatPaywallState.getClass();
        revenueCatPaywallViewModel.logger.log(TAG, "loadOfferings");
        if (revenueCatPaywallState.isLoading()) {
            return revenueCatPaywallState;
        }
        MviViewModel.launch$default(revenueCatPaywallViewModel, null, new RevenueCatPaywallViewModel$loadOfferings$1$1(revenueCatPaywallViewModel, revenueCatPaywallState, null), 1, null);
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, true, null, "", false, null, false, null, false, false, 2027, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevenueCatPaywallState onDismiss$lambda$0(boolean z6, RevenueCatPaywallViewModel revenueCatPaywallViewModel, RevenueCatPaywallState revenueCatPaywallState) {
        String str;
        revenueCatPaywallState.getClass();
        if ((revenueCatPaywallState.getPurchaseInProgress() || revenueCatPaywallState.getPurchaseCompleted() || revenueCatPaywallState.getPurchaseRefreshing()) && !z6) {
            return revenueCatPaywallState;
        }
        if (revenueCatPaywallState.getAnalyticsSource() != null) {
            Analytics analytics = revenueCatPaywallViewModel.analytics;
            Analytics.Event.PaywallSource analyticsSource = revenueCatPaywallState.getAnalyticsSource();
            Offering offering = revenueCatPaywallState.getOffering();
            if (offering != null) {
                str = offering.getIdentifier();
            } else {
                str = null;
            }
            analytics.log(new Analytics.Event.PaymentClosedSubscriptionPaywall(analyticsSource, str));
        }
        revenueCatPaywallViewModel.onboardingService.seenPaywall();
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, null, false, null, true, null, false, false, 1919, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevenueCatPaywallState onDismissed$lambda$0(RevenueCatPaywallState revenueCatPaywallState) {
        revenueCatPaywallState.getClass();
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, null, false, null, false, null, false, false, 1919, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevenueCatPaywallState purchaseCancelled$lambda$0(RevenueCatPaywallState revenueCatPaywallState) {
        revenueCatPaywallState.getClass();
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, null, false, null, false, null, false, false, 1535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevenueCatPaywallState purchaseCompleted$lambda$0(RevenueCatPaywallViewModel revenueCatPaywallViewModel, StoreTransaction storeTransaction, RevenueCatPaywallState revenueCatPaywallState) {
        Boolean bool;
        Package currentPackage;
        String str;
        revenueCatPaywallState.getClass();
        revenueCatPaywallViewModel.logger.log(TAG, "purchaseCompleted");
        if (revenueCatPaywallState.getAnalyticsSource() != null && (currentPackage = revenueCatPaywallState.getCurrentPackage()) != null && revenueCatPaywallViewModel.isTrial(currentPackage)) {
            String str2 = (String) o.y0(storeTransaction.getProductIds());
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            double amountMicros = revenueCatPaywallState.getCurrentPackage().getProduct().getPrice().getAmountMicros() / 1000000.0d;
            String currencyCode = revenueCatPaywallState.getCurrentPackage().getProduct().getPrice().getCurrencyCode();
            Analytics analytics = revenueCatPaywallViewModel.analytics;
            Analytics.Event.PaywallSource analyticsSource = revenueCatPaywallState.getAnalyticsSource();
            Offering offering = revenueCatPaywallState.getOffering();
            if (offering != null) {
                str = offering.getIdentifier();
            } else {
                str = null;
            }
            analytics.log(new Analytics.Event.PaymentStartedTrial(str3, analyticsSource, str, Double.valueOf(amountMicros), currencyCode));
        } else {
            Logger logger = revenueCatPaywallViewModel.logger;
            Analytics.Event.PaywallSource analyticsSource2 = revenueCatPaywallState.getAnalyticsSource();
            Package currentPackage2 = revenueCatPaywallState.getCurrentPackage();
            if (currentPackage2 != null) {
                bool = Boolean.valueOf(revenueCatPaywallViewModel.isTrial(currentPackage2));
            } else {
                bool = null;
            }
            logger.log(TAG, "Not tracking reader_payment_started_trial because analyticsSource=" + analyticsSource2 + ", isTrial=" + bool);
        }
        revenueCatPaywallViewModel.analytics.log(Analytics.Event.PaymentCompletedPurchase.INSTANCE);
        MviViewModel.launch$default(revenueCatPaywallViewModel, null, new RevenueCatPaywallViewModel$purchaseCompleted$1$1(revenueCatPaywallViewModel, storeTransaction, null), 1, null);
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, null, false, null, false, null, false, true, 511, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevenueCatPaywallState purchaseError$lambda$0(RevenueCatPaywallViewModel revenueCatPaywallViewModel, PurchasesError purchasesError, RevenueCatPaywallState revenueCatPaywallState) {
        revenueCatPaywallState.getClass();
        i.r("purchaseError: ", purchasesError.getMessage(), revenueCatPaywallViewModel.logger, TAG);
        revenueCatPaywallViewModel.analytics.log(new Analytics.Event.PaymentError(Analytics.Event.PaymentErrorSource.Paywall));
        if (purchasesError.getCode() == PurchasesErrorCode.ProductAlreadyPurchasedError) {
            MviViewModel.launch$default(revenueCatPaywallViewModel, null, new RevenueCatPaywallViewModel$purchaseError$1$1(revenueCatPaywallViewModel, null), 1, null);
        }
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, null, false, null, false, null, false, false, 1535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevenueCatPaywallState purchaseInitiated$lambda$0(RevenueCatPaywallViewModel revenueCatPaywallViewModel, Package r82, RevenueCatPaywallState revenueCatPaywallState) {
        String str;
        revenueCatPaywallState.getClass();
        Analytics analytics = revenueCatPaywallViewModel.analytics;
        String id2 = r82.getProduct().getId();
        Analytics.Event.PaywallSource analyticsSource = revenueCatPaywallState.getAnalyticsSource();
        if (analyticsSource == null) {
            analyticsSource = Analytics.Event.PaywallSource.Onboarding;
        }
        String currentPlan = revenueCatPaywallState.getCurrentPlan();
        boolean isTrial = revenueCatPaywallViewModel.isTrial(r82);
        Offering offering = revenueCatPaywallState.getOffering();
        if (offering != null) {
            str = offering.getIdentifier();
        } else {
            str = null;
        }
        analytics.log(new Analytics.Event.PaymentClickedPaywallCTA(id2, analyticsSource, currentPlan, isTrial, str));
        return revenueCatPaywallState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevenueCatPaywallState purchaseStarted$lambda$0(Package r14, RevenueCatPaywallState revenueCatPaywallState) {
        revenueCatPaywallState.getClass();
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, null, false, null, false, r14, true, false, 1279, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RevenueCatPaywallState setSources$lambda$0(ProductsService.PaywallSource paywallSource, Analytics.Event.PaywallSource paywallSource2, RevenueCatPaywallState revenueCatPaywallState) {
        revenueCatPaywallState.getClass();
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, paywallSource, paywallSource2, false, null, null, false, null, false, null, false, false, 2044, null);
    }

    public final MviViewModel.StateUpdate loadOfferings() {
        return queueStateUpdate(new f(this, 4));
    }

    public final MviViewModel.StateUpdate onDismiss(boolean force) {
        return queueStateUpdate(new io.elevenlabs.readerapp.ui.screens.authenticated.account.g(force, this, 1));
    }

    public final MviViewModel.StateUpdate onDismissed() {
        return queueStateUpdate(new g(6));
    }

    public final MviViewModel.StateUpdate purchaseCancelled() {
        return queueStateUpdate(new g(5));
    }

    public final MviViewModel.StateUpdate purchaseCompleted(StoreTransaction storeTransaction) {
        storeTransaction.getClass();
        return queueStateUpdate(new h(this, storeTransaction, 21));
    }

    public final MviViewModel.StateUpdate purchaseError(PurchasesError error) {
        error.getClass();
        return queueStateUpdate(new h(this, error, 19));
    }

    public final MviViewModel.StateUpdate purchaseInitiated(Package rcPackage) {
        rcPackage.getClass();
        return queueStateUpdate(new h(this, rcPackage, 20));
    }

    public final MviViewModel.StateUpdate purchaseStarted(Package rcPackage) {
        rcPackage.getClass();
        return queueStateUpdate(new d(rcPackage, 2));
    }

    public final void setSources(ProductsService.PaywallSource productsSourceIn, Analytics.Event.PaywallSource analyticsSourceIn) {
        productsSourceIn.getClass();
        analyticsSourceIn.getClass();
        queueStateUpdate(new h(productsSourceIn, analyticsSourceIn, 18));
        loadOfferings();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel$1", f = "RevenueCatPaywallScreen.kt", l = {109}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements p {
        int label;

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
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
                final ir.i customer = RevenueCatPaywallViewModel.this.customerService.getCustomer();
                ir.i o6 = r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel$1$invokeSuspend$$inlined$map$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel$1$invokeSuspend$$inlined$map$1$2", f = "RevenueCatPaywallScreen.kt", l = {50}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        j jVar = this.$this_unsafeFlow;
                                        String plan = ((Customer) obj).getPlan();
                                        anonymousClass1.L$0 = null;
                                        anonymousClass1.L$1 = null;
                                        anonymousClass1.L$2 = null;
                                        anonymousClass1.L$3 = null;
                                        anonymousClass1.I$0 = 0;
                                        anonymousClass1.label = 1;
                                        Object emit = jVar.emit(plan, anonymousClass1);
                                        xn.a aVar = xn.a.f37986a;
                                        if (emit == aVar) {
                                            return aVar;
                                        }
                                    }
                                    return z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return z.f31622a;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(RevenueCatPaywallViewModel.this);
                this.label = 1;
                Object collect = o6.collect(anonymousClass2, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return z.f31622a;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2<T> implements j {
            final /* synthetic */ RevenueCatPaywallViewModel this$0;

            public AnonymousClass2(RevenueCatPaywallViewModel revenueCatPaywallViewModel) {
                this.this$0 = revenueCatPaywallViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final RevenueCatPaywallState emit$lambda$0(String str, RevenueCatPaywallState revenueCatPaywallState) {
                revenueCatPaywallState.getClass();
                return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, null, false, str, false, null, false, false, 1983, null);
            }

            public final Object emit(String str, wn.c<? super z> cVar) {
                this.this$0.queueStateUpdate(new e(str, 0));
                return z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
                return emit((String) obj, (wn.c<? super z>) cVar);
            }
        }
    }
}
