package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountViewModel f15005b;

    public /* synthetic */ f(AccountViewModel accountViewModel, int i10) {
        this.f15004a = i10;
        this.f15005b = accountViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z AccountScreen$lambda$2$0;
        AccountState resetPassword$lambda$0;
        switch (this.f15004a) {
            case 0:
                AccountScreen$lambda$2$0 = AccountScreenKt.AccountScreen$lambda$2$0(this.f15005b, (ho.l) obj);
                return AccountScreen$lambda$2$0;
            default:
                resetPassword$lambda$0 = AccountViewModel.resetPassword$lambda$0(this.f15005b, (AccountState) obj);
                return resetPassword$lambda$0;
        }
    }
}
