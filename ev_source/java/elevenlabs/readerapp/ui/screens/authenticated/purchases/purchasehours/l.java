package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import io.elevenlabs.domain.model.AsyncCallResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseHoursViewModel f16698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Error f16699c;

    public /* synthetic */ l(PurchaseHoursViewModel purchaseHoursViewModel, AsyncCallResult.Error error, int i10) {
        this.f16697a = i10;
        this.f16698b = purchaseHoursViewModel;
        this.f16699c = error;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PurchaseHoursState invokeSuspend$lambda$1;
        PurchaseHoursState invokeSuspend$lambda$0;
        switch (this.f16697a) {
            case 0:
                invokeSuspend$lambda$1 = PurchaseHoursViewModel$fetchData$1$1.invokeSuspend$lambda$1(this.f16698b, this.f16699c, (PurchaseHoursState) obj);
                return invokeSuspend$lambda$1;
            default:
                invokeSuspend$lambda$0 = PurchaseHoursViewModel$purchaseProduct$1$1.invokeSuspend$lambda$0(this.f16698b, this.f16699c, (PurchaseHoursState) obj);
                return invokeSuspend$lambda$0;
        }
    }
}
