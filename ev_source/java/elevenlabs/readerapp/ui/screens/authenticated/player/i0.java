package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.Bookmark;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bookmark f16195b;

    public /* synthetic */ i0(Bookmark bookmark, int i10) {
        this.f16194a = i10;
        this.f16195b = bookmark;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z PlayerScreenDialogs$lambda$30$0$0;
        sn.z PlayerScreenDialogs$lambda$27$0$0;
        switch (this.f16194a) {
            case 0:
                PlayerScreenDialogs$lambda$30$0$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$30$0$0(this.f16195b, (PlayerViewModel) obj);
                return PlayerScreenDialogs$lambda$30$0$0;
            default:
                PlayerScreenDialogs$lambda$27$0$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$27$0$0(this.f16195b, (PlayerViewModel) obj);
                return PlayerScreenDialogs$lambda$27$0$0;
        }
    }
}
