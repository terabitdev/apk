package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseHoursViewModel f16692b;

    public /* synthetic */ i(PurchaseHoursViewModel purchaseHoursViewModel, int i10) {
        this.f16691a = i10;
        this.f16692b = purchaseHoursViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z PurchaseHoursScreen$lambda$0$0;
        PurchaseHoursState fetchData$lambda$0;
        switch (this.f16691a) {
            case 0:
                PurchaseHoursScreen$lambda$0$0 = PurchaseHoursScreenKt.PurchaseHoursScreen$lambda$0$0(this.f16692b, (ho.l) obj);
                return PurchaseHoursScreen$lambda$0$0;
            default:
                fetchData$lambda$0 = PurchaseHoursViewModel.fetchData$lambda$0(this.f16692b, (PurchaseHoursState) obj);
                return fetchData$lambda$0;
        }
    }
}
