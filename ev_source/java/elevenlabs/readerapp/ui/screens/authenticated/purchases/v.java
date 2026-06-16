package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReferFriendViewModel f16716b;

    public /* synthetic */ v(ReferFriendViewModel referFriendViewModel, int i10) {
        this.f16715a = i10;
        this.f16716b = referFriendViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z ReferFriendScreen$lambda$2$0;
        ReferFriendState share$lambda$0;
        switch (this.f16715a) {
            case 0:
                ReferFriendScreen$lambda$2$0 = ReferFriendScreenKt.ReferFriendScreen$lambda$2$0(this.f16716b, (ho.l) obj);
                return ReferFriendScreen$lambda$2$0;
            default:
                share$lambda$0 = ReferFriendViewModel.share$lambda$0(this.f16716b, (ReferFriendState) obj);
                return share$lambda$0;
        }
    }
}
