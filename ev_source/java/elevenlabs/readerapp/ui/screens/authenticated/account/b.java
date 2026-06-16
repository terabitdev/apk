package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import r1.z1;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14936a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccountState f14937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f14938c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AccountNavigator f14939d;

    public /* synthetic */ b(AccountState accountState, ho.l lVar, AccountNavigator accountNavigator) {
        this.f14937b = accountState;
        this.f14938c = lVar;
        this.f14939d = accountNavigator;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z AccountScreenUI$lambda$0$0$0$2$0;
        z AccountScreenUI$lambda$0;
        switch (this.f14936a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                AccountScreenUI$lambda$0$0$0$2$0 = AccountScreenKt.AccountScreenUI$lambda$0$0$0$2$0(this.f14937b, this.f14939d, this.f14938c, (r1.s) obj, (u2.m) obj2, intValue);
                return AccountScreenUI$lambda$0$0$0$2$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                AccountScreenUI$lambda$0 = AccountScreenKt.AccountScreenUI$lambda$0(this.f14937b, this.f14938c, this.f14939d, (z1) obj, (u2.m) obj2, intValue2);
                return AccountScreenUI$lambda$0;
        }
    }

    public /* synthetic */ b(AccountState accountState, AccountNavigator accountNavigator, ho.l lVar) {
        this.f14937b = accountState;
        this.f14939d = accountNavigator;
        this.f14938c = lVar;
    }
}
