package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16625a;

    public /* synthetic */ d(int i10) {
        this.f16625a = i10;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f16625a) {
            case 0:
                return BookPurchasesScreenKt.r();
            case 1:
                return BookPurchasesScreenKt.a();
            case 2:
                return BookRefundScreenKt.h();
            case 3:
                return HoursLowScreenKt.r();
            case 4:
                return ReferFriendScreenKt.d();
            default:
                return UseFriendReferralScreenKt.s();
        }
    }
}
