package io.elevenlabs.readerapp.ui.screens.authenticated.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ir.z1 f16241b;

    public /* synthetic */ n0(ir.z1 z1Var, int i10) {
        this.f16240a = i10;
        this.f16241b = z1Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z PlayerScreenUI$lambda$44$22$0$0;
        sn.z PlayerScreenUI$lambda$44$21$0$0;
        sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$23$0$1;
        switch (this.f16240a) {
            case 0:
                PlayerScreenUI$lambda$44$22$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$22$0$0(this.f16241b, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$22$0$0;
            case 1:
                PlayerScreenUI$lambda$44$21$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$21$0$0(this.f16241b, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$21$0$0;
            default:
                PlayerScreenUI$lambda$44$0$18$1$0$2$23$0$1 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1$0$2$23$0$1(this.f16241b, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$0$18$1$0$2$23$0$1;
        }
    }
}
