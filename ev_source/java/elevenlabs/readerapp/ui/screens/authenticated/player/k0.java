package io.elevenlabs.readerapp.ui.screens.authenticated.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ir.z1 f16203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f16204c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16205d;

    public /* synthetic */ k0(ir.z1 z1Var, ho.l lVar, int i10, int i11) {
        this.f16202a = i11;
        this.f16203b = z1Var;
        this.f16204c = lVar;
        this.f16205d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PlayerScreenDialogs$lambda$41;
        sn.z PlayerErrorToast$lambda$3;
        int i10 = this.f16202a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                PlayerScreenDialogs$lambda$41 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$41(this.f16203b, this.f16204c, this.f16205d, mVar, intValue);
                return PlayerScreenDialogs$lambda$41;
            default:
                PlayerErrorToast$lambda$3 = PlayerScreenKt.PlayerErrorToast$lambda$3(this.f16203b, this.f16204c, this.f16205d, mVar, intValue);
                return PlayerErrorToast$lambda$3;
        }
    }
}
