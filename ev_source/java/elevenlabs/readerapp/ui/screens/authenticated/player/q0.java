package io.elevenlabs.readerapp.ui.screens.authenticated.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16273b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f16272a = i10;
        this.f16273b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z PlayerScreen$lambda$33$0;
        boolean PlayerScreenUI$lambda$37$0;
        switch (this.f16272a) {
            case 0:
                PlayerScreen$lambda$33$0 = PlayerScreenKt.PlayerScreen$lambda$33$0((PlayerViewModel) this.f16273b);
                return PlayerScreen$lambda$33$0;
            default:
                PlayerScreenUI$lambda$37$0 = PlayerScreenKt.PlayerScreenUI$lambda$37$0((t1.z) this.f16273b);
                return Boolean.valueOf(PlayerScreenUI$lambda$37$0);
        }
    }
}
