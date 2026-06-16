package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.SubscriptionProduct;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16662b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f16661a = i10;
        this.f16662b = obj;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z HoursLowScreenUI$lambda$4$0$1;
        sn.z OneTimeCreditsProductItem$lambda$0;
        sn.z SubscriptionProductItem$lambda$0;
        switch (this.f16661a) {
            case 0:
                HoursLowScreenUI$lambda$4$0$1 = HoursLowScreenKt.HoursLowScreenUI$lambda$4$0$1((ho.l) this.f16662b, (u2.m) obj, ((Integer) obj2).intValue());
                return HoursLowScreenUI$lambda$4$0$1;
            case 1:
                OneTimeCreditsProductItem$lambda$0 = OneTimeCreditProductsListKt.OneTimeCreditsProductItem$lambda$0((OneTimeCreditsProduct) this.f16662b, (u2.m) obj, ((Integer) obj2).intValue());
                return OneTimeCreditsProductItem$lambda$0;
            default:
                SubscriptionProductItem$lambda$0 = SubscriptionProductsListKt.SubscriptionProductItem$lambda$0((SubscriptionProduct) this.f16662b, (u2.m) obj, ((Integer) obj2).intValue());
                return SubscriptionProductItem$lambda$0;
        }
    }
}
