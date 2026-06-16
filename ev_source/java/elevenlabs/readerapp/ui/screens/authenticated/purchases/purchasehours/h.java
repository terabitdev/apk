package io.elevenlabs.readerapp.ui.screens.authenticated.purchases.purchasehours;

import android.app.Activity;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16688a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f16689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16690c;

    public /* synthetic */ h(Activity activity, OneTimeCreditsProduct oneTimeCreditsProduct) {
        this.f16689b = activity;
        this.f16690c = oneTimeCreditsProduct;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0$0;
        z PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0;
        switch (this.f16688a) {
            case 0:
                PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0$0 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0$0(this.f16689b, (OneTimeCreditsProduct) this.f16690c, (PurchaseHoursViewModel) obj);
                return PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0$0;
            default:
                PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0 = PurchaseHoursScreenKt.PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0((ho.l) this.f16690c, this.f16689b, (OneTimeCreditsProduct) obj);
                return PurchaseHoursScreenUI$lambda$5$0$2$0$0$2$0$0;
        }
    }

    public /* synthetic */ h(ho.l lVar, Activity activity) {
        this.f16690c = lVar;
        this.f16689b = activity;
    }
}
