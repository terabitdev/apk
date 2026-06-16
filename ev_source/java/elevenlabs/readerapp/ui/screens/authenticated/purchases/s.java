package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.OneTimeCreditsProduct;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OneTimeCreditsProduct f16707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f16708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16709d;

    public /* synthetic */ s(OneTimeCreditsProduct oneTimeCreditsProduct, ho.a aVar, int i10, int i11) {
        this.f16706a = i11;
        this.f16707b = oneTimeCreditsProduct;
        this.f16708c = aVar;
        this.f16709d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z OneTimeCreditsProductItem$lambda$1;
        int i10 = this.f16706a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                OneTimeCreditsProductItem$lambda$1 = OneTimeCreditProductsListKt.OneTimeCreditsProductItem$lambda$1(this.f16707b, this.f16708c, this.f16709d, mVar, intValue);
                return OneTimeCreditsProductItem$lambda$1;
            default:
                return OneTimeCreditsPurchaseSuccessScreenKt.a(this.f16707b, this.f16708c, this.f16709d, mVar, intValue);
        }
    }
}
