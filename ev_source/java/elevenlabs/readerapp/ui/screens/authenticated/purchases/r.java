package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.BookRefundReason;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.SubscriptionProduct;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16705b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f16704a = i10;
        this.f16705b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        BookRefundState selectReason$lambda$0;
        sn.z HoursLowScreenUI$lambda$4$0$0$0$0$1$0;
        switch (this.f16704a) {
            case 0:
                return HoursLowViewModel$purchaseProduct$1$1.d((OneTimeCreditsProduct) this.f16705b, (HoursLowState) obj);
            case 1:
                selectReason$lambda$0 = BookRefundViewModel.selectReason$lambda$0((BookRefundReason) this.f16705b, (BookRefundState) obj);
                return selectReason$lambda$0;
            default:
                HoursLowScreenUI$lambda$4$0$0$0$0$1$0 = HoursLowScreenKt.HoursLowScreenUI$lambda$4$0$0$0$0$1$0((ho.l) this.f16705b, (SubscriptionProduct) obj);
                return HoursLowScreenUI$lambda$4$0$0$0$0$1$0;
        }
    }
}
