package io.elevenlabs.readerapp.ui.screens.authenticated.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlaybackPosition f16252b;

    public /* synthetic */ o0(PlaybackPosition playbackPosition, int i10) {
        this.f16251a = i10;
        this.f16252b = playbackPosition;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$5$0$0;
        sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$6$0$0;
        switch (this.f16251a) {
            case 0:
                PlayerScreenUI$lambda$44$0$18$1$0$2$5$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1$0$2$5$0$0(this.f16252b, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$0$18$1$0$2$5$0$0;
            default:
                PlayerScreenUI$lambda$44$0$18$1$0$2$6$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1$0$2$6$0$0(this.f16252b, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$0$18$1$0$2$6$0$0;
        }
    }
}
