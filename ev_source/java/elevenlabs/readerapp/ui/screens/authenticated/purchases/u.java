package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import io.elevenlabs.readerapp.core.MviViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MviViewModel f16714b;

    public /* synthetic */ u(MviViewModel mviViewModel, int i10) {
        this.f16713a = i10;
        this.f16714b = mviViewModel;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z ReferFriendScreen$lambda$1$0;
        sn.z UseFriendReferralScreen$lambda$2$0;
        switch (this.f16713a) {
            case 0:
                ReferFriendScreen$lambda$1$0 = ReferFriendScreenKt.ReferFriendScreen$lambda$1$0((ReferFriendViewModel) this.f16714b);
                return ReferFriendScreen$lambda$1$0;
            default:
                UseFriendReferralScreen$lambda$2$0 = UseFriendReferralScreenKt.UseFriendReferralScreen$lambda$2$0((UseFriendReferralViewModel) this.f16714b);
                return UseFriendReferralScreen$lambda$2$0;
        }
    }
}
