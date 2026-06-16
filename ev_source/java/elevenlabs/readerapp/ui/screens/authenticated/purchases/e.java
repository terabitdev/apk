package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f16627b;

    public /* synthetic */ e(int i10, ho.a aVar) {
        this.f16626a = i10;
        this.f16627b = aVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z BookPurchasesScreenUI$lambda$4;
        sn.z BookRefundScreenUI$lambda$2;
        sn.z HoursLowScreenUI$lambda$3;
        sn.z ReferFriendScreenUI$lambda$2;
        sn.z UseFriendReferralScreenUI$lambda$2;
        int i10 = this.f16626a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                BookPurchasesScreenUI$lambda$4 = BookPurchasesScreenKt.BookPurchasesScreenUI$lambda$4(this.f16627b, mVar, intValue);
                return BookPurchasesScreenUI$lambda$4;
            case 1:
                BookRefundScreenUI$lambda$2 = BookRefundScreenKt.BookRefundScreenUI$lambda$2(this.f16627b, mVar, intValue);
                return BookRefundScreenUI$lambda$2;
            case 2:
                HoursLowScreenUI$lambda$3 = HoursLowScreenKt.HoursLowScreenUI$lambda$3(this.f16627b, mVar, intValue);
                return HoursLowScreenUI$lambda$3;
            case 3:
                ReferFriendScreenUI$lambda$2 = ReferFriendScreenKt.ReferFriendScreenUI$lambda$2(this.f16627b, mVar, intValue);
                return ReferFriendScreenUI$lambda$2;
            default:
                UseFriendReferralScreenUI$lambda$2 = UseFriendReferralScreenKt.UseFriendReferralScreenUI$lambda$2(this.f16627b, mVar, intValue);
                return UseFriendReferralScreenUI$lambda$2;
        }
    }
}
