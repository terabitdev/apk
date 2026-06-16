package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import android.app.Activity;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.BookRefundReason;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16630c;

    public /* synthetic */ f(Object obj, Object obj2, int i10) {
        this.f16628a = i10;
        this.f16630c = obj;
        this.f16629b = obj2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z BookPurchasesScreenUI$lambda$5$0$0$0;
        sn.z BookRefundScreenUI$lambda$3$0$10$1$1$0$0$0;
        sn.z BookRefundScreenUI$lambda$3$0$7$0;
        sn.z HoursLowScreenUI$lambda$4$0$0$0$0$3$0;
        sn.z HoursLowScreenUI$lambda$4$0$0$0$0$3$0$0;
        UseFriendReferralState code$lambda$0;
        switch (this.f16628a) {
            case 0:
                return BookPurchasesViewModel$load$1$1.d((BookPurchasesViewModel) this.f16630c, (AsyncCallResult.Error) this.f16629b, (BookPurchasesState) obj);
            case 1:
                return ReferFriendViewModel$share$1$1.h((ReferFriendViewModel) this.f16630c, (AsyncCallResult.Error) this.f16629b, (ReferFriendState) obj);
            case 2:
                BookPurchasesScreenUI$lambda$5$0$0$0 = BookPurchasesScreenKt.BookPurchasesScreenUI$lambda$5$0$0$0((BookPurchasesState) this.f16630c, (ho.l) this.f16629b, (t1.t) obj);
                return BookPurchasesScreenUI$lambda$5$0$0$0;
            case 3:
                BookRefundScreenUI$lambda$3$0$10$1$1$0$0$0 = BookRefundScreenKt.BookRefundScreenUI$lambda$3$0$10$1$1$0$0$0((BookRefundReason) this.f16630c, (z0) this.f16629b, (BookRefundViewModel) obj);
                return BookRefundScreenUI$lambda$3$0$10$1$1$0$0$0;
            case 4:
                BookRefundScreenUI$lambda$3$0$7$0 = BookRefundScreenKt.BookRefundScreenUI$lambda$3$0$7$0((ho.l) this.f16630c, (z0) this.f16629b, (String) obj);
                return BookRefundScreenUI$lambda$3$0$7$0;
            case 5:
                HoursLowScreenUI$lambda$4$0$0$0$0$3$0 = HoursLowScreenKt.HoursLowScreenUI$lambda$4$0$0$0$0$3$0((ho.l) this.f16630c, (Activity) this.f16629b, (OneTimeCreditsProduct) obj);
                return HoursLowScreenUI$lambda$4$0$0$0$0$3$0;
            case 6:
                HoursLowScreenUI$lambda$4$0$0$0$0$3$0$0 = HoursLowScreenKt.HoursLowScreenUI$lambda$4$0$0$0$0$3$0$0((Activity) this.f16630c, (OneTimeCreditsProduct) this.f16629b, (HoursLowViewModel) obj);
                return HoursLowScreenUI$lambda$4$0$0$0$0$3$0$0;
            default:
                code$lambda$0 = UseFriendReferralViewModel.setCode$lambda$0((UseFriendReferralViewModel) this.f16630c, (String) this.f16629b, (UseFriendReferralState) obj);
                return code$lambda$0;
        }
    }
}
