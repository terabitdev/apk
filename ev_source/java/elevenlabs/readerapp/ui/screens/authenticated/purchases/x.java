package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UseFriendReferralViewModel f16722b;

    public /* synthetic */ x(UseFriendReferralViewModel useFriendReferralViewModel, int i10) {
        this.f16721a = i10;
        this.f16722b = useFriendReferralViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z UseFriendReferralScreen$lambda$3$0;
        UseFriendReferralState load$lambda$0;
        UseFriendReferralState share$lambda$0;
        switch (this.f16721a) {
            case 0:
                UseFriendReferralScreen$lambda$3$0 = UseFriendReferralScreenKt.UseFriendReferralScreen$lambda$3$0(this.f16722b, (ho.l) obj);
                return UseFriendReferralScreen$lambda$3$0;
            case 1:
                load$lambda$0 = UseFriendReferralViewModel.load$lambda$0(this.f16722b, (UseFriendReferralState) obj);
                return load$lambda$0;
            default:
                share$lambda$0 = UseFriendReferralViewModel.share$lambda$0(this.f16722b, (UseFriendReferralState) obj);
                return share$lambda$0;
        }
    }
}
