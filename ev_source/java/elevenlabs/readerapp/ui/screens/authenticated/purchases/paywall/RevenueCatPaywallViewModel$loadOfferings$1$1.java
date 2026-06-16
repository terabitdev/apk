package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import com.revenuecat.purchases.CoroutinesExtensionsCommonKt;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesException;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel$loadOfferings$1$1", f = "RevenueCatPaywallScreen.kt", l = {120}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class RevenueCatPaywallViewModel$loadOfferings$1$1 extends i implements p {
    final /* synthetic */ RevenueCatPaywallState $this_queueStateUpdate;
    int label;
    final /* synthetic */ RevenueCatPaywallViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevenueCatPaywallViewModel$loadOfferings$1$1(RevenueCatPaywallViewModel revenueCatPaywallViewModel, RevenueCatPaywallState revenueCatPaywallState, wn.c<? super RevenueCatPaywallViewModel$loadOfferings$1$1> cVar) {
        super(2, cVar);
        this.this$0 = revenueCatPaywallViewModel;
        this.$this_queueStateUpdate = revenueCatPaywallState;
    }

    public static final RevenueCatPaywallState invokeSuspend$lambda$0(RevenueCatPaywallViewModel revenueCatPaywallViewModel, RevenueCatPaywallState revenueCatPaywallState) {
        StringProvider stringProvider;
        stringProvider = revenueCatPaywallViewModel.stringProvider;
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, stringProvider.invoke(R.string.error_network_error), false, null, false, null, false, false, 2027, null);
    }

    public static final RevenueCatPaywallState invokeSuspend$lambda$1(Offering offering, RevenueCatPaywallState revenueCatPaywallState) {
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, offering, null, false, null, false, null, false, false, 2035, null);
    }

    public static final RevenueCatPaywallState invokeSuspend$lambda$2(PurchasesException purchasesException, RevenueCatPaywallState revenueCatPaywallState) {
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, purchasesException.getMessage(), false, null, false, null, false, false, 2027, null);
    }

    public static final RevenueCatPaywallState invokeSuspend$lambda$3(RevenueCatPaywallViewModel revenueCatPaywallViewModel, RevenueCatPaywallState revenueCatPaywallState) {
        StringProvider stringProvider;
        stringProvider = revenueCatPaywallViewModel.stringProvider;
        return RevenueCatPaywallState.copy$default(revenueCatPaywallState, null, null, false, null, stringProvider.getString(R.string.common_error), false, null, false, null, false, false, 2027, null);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new RevenueCatPaywallViewModel$loadOfferings$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((RevenueCatPaywallViewModel$loadOfferings$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        Logger logger2;
        jl.a aVar;
        Offering current;
        Analytics analytics;
        Logger logger3;
        Logger logger4;
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                aVar = this.this$0.purchases;
                Object obj2 = aVar.get();
                obj2.getClass();
                this.label = 1;
                obj = CoroutinesExtensionsCommonKt.awaitOfferings((Purchases) obj2, this);
                xn.a aVar2 = xn.a.f37986a;
                if (obj == aVar2) {
                    return aVar2;
                }
            }
            Offerings offerings = (Offerings) obj;
            if (this.$this_queueStateUpdate.getAnalyticsSource() != null) {
                current = offerings.getCurrentOfferingForPlacement(this.$this_queueStateUpdate.getAnalyticsSource().getValue());
                if (current == null) {
                    current = offerings.getCurrent();
                }
            } else {
                current = offerings.getCurrent();
            }
            RevenueCatPaywallViewModel revenueCatPaywallViewModel = this.this$0;
            if (current == null) {
                logger4 = revenueCatPaywallViewModel.logger;
                logger4.log("RevenueCatPaywall", "loadOfferings::empty");
                RevenueCatPaywallViewModel revenueCatPaywallViewModel2 = this.this$0;
                revenueCatPaywallViewModel2.queueStateUpdate(new f(revenueCatPaywallViewModel2, 0));
            } else {
                analytics = revenueCatPaywallViewModel.analytics;
                Analytics.Event.PaywallSource analyticsSource = this.$this_queueStateUpdate.getAnalyticsSource();
                if (analyticsSource == null) {
                    analyticsSource = Analytics.Event.PaywallSource.Onboarding;
                }
                analytics.log(new Analytics.Event.PaymentViewedSubscriptionPaywall(analyticsSource, current.getIdentifier()));
                logger3 = this.this$0.logger;
                logger3.log("RevenueCatPaywall", "loadOfferings::loaded");
                this.this$0.queueStateUpdate(new e(current, 1));
            }
        } catch (PurchasesException e10) {
            logger2 = this.this$0.logger;
            logger2.log("RevenueCatPaywall", "loadOfferings::purchasesexception (" + e10.getCode() + " - " + e10.getMessage() + Separators.RPAREN);
            this.this$0.queueStateUpdate(new e(e10, 2));
        } catch (Exception e11) {
            logger = this.this$0.logger;
            logger.log("RevenueCatPaywall", "loadOfferings::exception (" + e11.getMessage() + Separators.RPAREN);
            RevenueCatPaywallViewModel revenueCatPaywallViewModel3 = this.this$0;
            revenueCatPaywallViewModel3.queueStateUpdate(new f(revenueCatPaywallViewModel3, 1));
        }
        return z.f31622a;
    }
}
