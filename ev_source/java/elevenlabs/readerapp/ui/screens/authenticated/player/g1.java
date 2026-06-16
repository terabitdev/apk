package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u2.z0 f16177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u2.z0 f16178d;

    public /* synthetic */ g1(ho.l lVar, u2.z0 z0Var, u2.z0 z0Var2, int i10) {
        this.f16175a = i10;
        this.f16176b = lVar;
        this.f16177c = z0Var;
        this.f16178d = z0Var2;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z PlayerScreenUI$lambda$44$6$0;
        sn.z ReadDetailsScreenUi$lambda$25$0;
        switch (this.f16175a) {
            case 0:
                PlayerScreenUI$lambda$44$6$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$6$0(this.f16176b, this.f16177c, this.f16178d);
                return PlayerScreenUI$lambda$44$6$0;
            default:
                ReadDetailsScreenUi$lambda$25$0 = ReadDetailsScreenKt.ReadDetailsScreenUi$lambda$25$0(this.f16176b, this.f16177c, this.f16178d);
                return ReadDetailsScreenUi$lambda$25$0;
        }
    }
}
