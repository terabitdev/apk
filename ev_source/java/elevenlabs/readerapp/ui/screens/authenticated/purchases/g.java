package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.AsyncCallResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Success f16632b;

    public /* synthetic */ g(AsyncCallResult.Success success, int i10) {
        this.f16631a = i10;
        this.f16632b = success;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f16631a) {
            case 0:
                return BookPurchasesViewModel$load$1$1.h(this.f16632b, (BookPurchasesState) obj);
            case 1:
                return HoursLowViewModel$load$1$1.h(this.f16632b, (HoursLowState) obj);
            case 2:
                return ReferFriendViewModel$share$1$1.d(this.f16632b, (ReferFriendState) obj);
            case 3:
                return UseFriendReferralViewModel$load$1$1.d(this.f16632b, (UseFriendReferralState) obj);
            default:
                return UseFriendReferralViewModel$share$1$1.d(this.f16632b, (UseFriendReferralState) obj);
        }
    }
}
