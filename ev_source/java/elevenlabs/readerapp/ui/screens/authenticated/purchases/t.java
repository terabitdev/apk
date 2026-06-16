package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.SubscriptionProduct;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16712c;

    public /* synthetic */ t(ho.l lVar, Object obj, int i10) {
        this.f16710a = i10;
        this.f16711b = lVar;
        this.f16712c = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z OneTimeCreditProductsList$lambda$0$0$0$0;
        sn.z SubscriptionProductsList$lambda$0$0$0$0;
        switch (this.f16710a) {
            case 0:
                OneTimeCreditProductsList$lambda$0$0$0$0 = OneTimeCreditProductsListKt.OneTimeCreditProductsList$lambda$0$0$0$0(this.f16711b, (OneTimeCreditsProduct) this.f16712c);
                return OneTimeCreditProductsList$lambda$0$0$0$0;
            default:
                SubscriptionProductsList$lambda$0$0$0$0 = SubscriptionProductsListKt.SubscriptionProductsList$lambda$0$0$0$0(this.f16711b, (SubscriptionProduct) this.f16712c);
                return SubscriptionProductsList$lambda$0$0$0$0;
        }
    }
}
