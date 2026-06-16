package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.domain.model.AsyncCallResult;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UseFriendReferralViewModel f16727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncCallResult.Error f16728c;

    public /* synthetic */ z(UseFriendReferralViewModel useFriendReferralViewModel, AsyncCallResult.Error error, int i10) {
        this.f16726a = i10;
        this.f16727b = useFriendReferralViewModel;
        this.f16728c = error;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        UseFriendReferralState invokeSuspend$lambda$0;
        UseFriendReferralState invokeSuspend$lambda$02;
        switch (this.f16726a) {
            case 0:
                invokeSuspend$lambda$0 = UseFriendReferralViewModel$load$1$1.invokeSuspend$lambda$0(this.f16727b, this.f16728c, (UseFriendReferralState) obj);
                return invokeSuspend$lambda$0;
            default:
                invokeSuspend$lambda$02 = UseFriendReferralViewModel$share$1$1.invokeSuspend$lambda$0(this.f16727b, this.f16728c, (UseFriendReferralState) obj);
                return invokeSuspend$lambda$02;
        }
    }
}
