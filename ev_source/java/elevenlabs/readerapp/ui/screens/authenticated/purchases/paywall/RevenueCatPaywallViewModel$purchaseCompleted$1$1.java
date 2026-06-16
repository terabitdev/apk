package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall;

import com.google.protobuf.c6;
import com.revenuecat.purchases.models.StoreTransaction;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.CustomerService;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.purchases.paywall.RevenueCatPaywallViewModel$purchaseCompleted$1$1", f = "RevenueCatPaywallScreen.kt", l = {205, 208}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class RevenueCatPaywallViewModel$purchaseCompleted$1$1 extends i implements p {
    final /* synthetic */ StoreTransaction $storeTransaction;
    Object L$0;
    int label;
    final /* synthetic */ RevenueCatPaywallViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevenueCatPaywallViewModel$purchaseCompleted$1$1(RevenueCatPaywallViewModel revenueCatPaywallViewModel, StoreTransaction storeTransaction, wn.c<? super RevenueCatPaywallViewModel$purchaseCompleted$1$1> cVar) {
        super(2, cVar);
        this.this$0 = revenueCatPaywallViewModel;
        this.$storeTransaction = storeTransaction;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new RevenueCatPaywallViewModel$purchaseCompleted$1$1(this.this$0, this.$storeTransaction, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((RevenueCatPaywallViewModel$purchaseCompleted$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        if (r11.invalidateAndSync(r10) == r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r11 == r3) goto L37;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    this.this$0.queueStateUpdate(new g(0));
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            CustomerService customerService = this.this$0.customerService;
            String orderId = this.$storeTransaction.getOrderId();
            this.label = 1;
            obj = customerService.refreshPurchase(orderId, this);
        }
        if (!(((AsyncCallResult) obj) instanceof AsyncCallResult.Success)) {
            logger = this.this$0.logger;
            Logger.logWarning$default(logger, "RevenueCatPaywall", "refreshPurchase failed, falling back to sync", null, 4, null);
            CustomerService customerService2 = this.this$0.customerService;
            this.L$0 = null;
            this.label = 2;
        }
        this.this$0.queueStateUpdate(new g(0));
        return z.f31622a;
    }
}
