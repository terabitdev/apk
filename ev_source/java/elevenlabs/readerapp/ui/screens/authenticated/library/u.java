package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f15893b;

    public /* synthetic */ u(z0 z0Var, int i10) {
        this.f15892a = i10;
        this.f15893b = z0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z LibraryScreen$lambda$12$2$0;
        sn.z LibraryScreen$lambda$19$0;
        sn.z LibraryScreenUI$lambda$7$0$9$0;
        switch (this.f15892a) {
            case 0:
                LibraryScreen$lambda$12$2$0 = LibraryScreenKt.LibraryScreen$lambda$12$2$0(this.f15893b, (String) obj);
                return LibraryScreen$lambda$12$2$0;
            case 1:
                LibraryScreen$lambda$19$0 = LibraryScreenKt.LibraryScreen$lambda$19$0(this.f15893b, (String) obj);
                return LibraryScreen$lambda$19$0;
            default:
                LibraryScreenUI$lambda$7$0$9$0 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$9$0(this.f15893b, ((Boolean) obj).booleanValue());
                return LibraryScreenUI$lambda$7$0$9$0;
        }
    }
}
