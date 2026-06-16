package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16700a;

    public /* synthetic */ m(int i10) {
        this.f16700a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z PurchaseHoursScreenUI$lambda$0$0;
        z PurchaseHoursScreenUI$lambda$2$0;
        z PurchaseHoursScreenUI$lambda$5$1$0$0;
        z PurchaseHoursScreenUI$lambda$5$0$1$0$0$0;
        z PurchaseHoursScreenUI$lambda$5$2$0$0;
        PurchaseHoursState closePurchaseError$lambda$0;
        switch (this.f16700a) {
            case 0:
                return PurchaseHoursViewModel$purchaseProduct$1$1.d((PurchaseHoursState) obj);
            case 1:
                PurchaseHoursScreenUI$lambda$0$0 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$0$0((ho.l) obj);
                return PurchaseHoursScreenUI$lambda$0$0;
            case 2:
                PurchaseHoursScreenUI$lambda$2$0 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$2$0((String) obj);
                return PurchaseHoursScreenUI$lambda$2$0;
            case 3:
                PurchaseHoursScreenUI$lambda$5$1$0$0 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$5$1$0$0((PurchaseHoursViewModel) obj);
                return PurchaseHoursScreenUI$lambda$5$1$0$0;
            case 4:
                PurchaseHoursScreenUI$lambda$5$0$1$0$0$0 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$5$0$1$0$0$0((PurchaseHoursViewModel) obj);
                return PurchaseHoursScreenUI$lambda$5$0$1$0$0$0;
            case 5:
                PurchaseHoursScreenUI$lambda$5$2$0$0 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$5$2$0$0((PurchaseHoursViewModel) obj);
                return PurchaseHoursScreenUI$lambda$5$2$0$0;
            default:
                closePurchaseError$lambda$0 = PurchaseHoursViewModel.closePurchaseError$lambda$0((PurchaseHoursState) obj);
                return closePurchaseError$lambda$0;
        }
    }
}
