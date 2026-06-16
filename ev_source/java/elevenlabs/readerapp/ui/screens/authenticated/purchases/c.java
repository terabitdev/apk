package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import r1.l2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16624b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f16623a = i10;
        this.f16624b = obj;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z BookPurchasesScreenUI$lambda$4$0;
        sn.z BookRefundScreenUI$lambda$2$0;
        sn.z HoursLowScreenUI$lambda$3$0;
        sn.z ReferFriendScreenUI$lambda$2$0;
        sn.z UseFriendReferralScreenUI$lambda$2$0;
        sn.z BookRefundScreenUI$lambda$3$0$10$1$0;
        switch (this.f16623a) {
            case 0:
                BookPurchasesScreenUI$lambda$4$0 = BookPurchasesScreenKt.BookPurchasesScreenUI$lambda$4$0((ho.a) this.f16624b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return BookPurchasesScreenUI$lambda$4$0;
            case 1:
                BookRefundScreenUI$lambda$2$0 = BookRefundScreenKt.BookRefundScreenUI$lambda$2$0((ho.a) this.f16624b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return BookRefundScreenUI$lambda$2$0;
            case 2:
                HoursLowScreenUI$lambda$3$0 = HoursLowScreenKt.HoursLowScreenUI$lambda$3$0((ho.a) this.f16624b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return HoursLowScreenUI$lambda$3$0;
            case 3:
                ReferFriendScreenUI$lambda$2$0 = ReferFriendScreenKt.ReferFriendScreenUI$lambda$2$0((ho.a) this.f16624b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return ReferFriendScreenUI$lambda$2$0;
            case 4:
                UseFriendReferralScreenUI$lambda$2$0 = UseFriendReferralScreenKt.UseFriendReferralScreenUI$lambda$2$0((ho.a) this.f16624b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return UseFriendReferralScreenUI$lambda$2$0;
            default:
                BookRefundScreenUI$lambda$3$0$10$1$0 = BookRefundScreenKt.BookRefundScreenUI$lambda$3$0$10$1$0((z0) this.f16624b, (l2) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                return BookRefundScreenUI$lambda$3$0$10$1$0;
        }
    }
}
