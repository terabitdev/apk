package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.SubscriptionProduct;
import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours.PurchaseHoursViewModel;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16696b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f16695a = i10;
        this.f16696b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PurchaseHoursState emit$lambda$0;
        PurchaseHoursState invokeSuspend$lambda$3;
        z PurchaseHoursScreenUI$lambda$5$0$2$0$0$1$0$0;
        switch (this.f16695a) {
            case 0:
                emit$lambda$0 = PurchaseHoursViewModel.AnonymousClass1.AnonymousClass2.C00471.emit$lambda$0((Customer) this.f16696b, (PurchaseHoursState) obj);
                return emit$lambda$0;
            case 1:
                return PurchaseHoursViewModel$fetchData$1$1.h((AsyncCallResult.Success) this.f16696b, (PurchaseHoursState) obj);
            case 2:
                invokeSuspend$lambda$3 = PurchaseHoursViewModel$purchaseProduct$1$1.invokeSuspend$lambda$3((OneTimeCreditsProduct) this.f16696b, (PurchaseHoursState) obj);
                return invokeSuspend$lambda$3;
            default:
                PurchaseHoursScreenUI$lambda$5$0$2$0$0$1$0$0 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$5$0$2$0$0$1$0$0((ho.l) this.f16696b, (SubscriptionProduct) obj);
                return PurchaseHoursScreenUI$lambda$5$0$2$0$0$1$0$0;
        }
    }
}
