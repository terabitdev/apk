package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import io.elevenlabs.ui.components.VerificationCodeInputKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16014a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f16016c;

    public /* synthetic */ h(int i10, ho.l lVar) {
        this.f16015b = i10;
        this.f16016c = lVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f16014a) {
            case 0:
                return PlayerContentsScreenKt.PlayerContentsScreenUI$lambda$3$0$0$0$1$0(this.f16016c, this.f16015b, ((Boolean) obj).booleanValue());
            default:
                return VerificationCodeInputKt.d(this.f16015b, this.f16016c, (String) obj);
        }
    }

    public /* synthetic */ h(ho.l lVar, int i10) {
        this.f16016c = lVar;
        this.f16015b = i10;
    }
}
