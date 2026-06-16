package io.elevenlabs.readerapp.ui.screens.authenticated.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16168b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16169c;

    public /* synthetic */ f2(long j4, u2.z0 z0Var) {
        this.f16167a = 2;
        this.f16168b = j4;
        this.f16169c = z0Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerPreferencesState onFontSizeChanged$lambda$0;
        sn.z PlayerScreenUI$lambda$44$0$15$0$0;
        switch (this.f16167a) {
            case 0:
                return PlayerViewModel$seekToOffset$1.i((ContentState) this.f16169c, this.f16168b, (PlayerState) obj);
            case 1:
                onFontSizeChanged$lambda$0 = PlayerPreferencesViewModel.onFontSizeChanged$lambda$0((PlayerPreferencesViewModel) this.f16169c, this.f16168b, (PlayerPreferencesState) obj);
                return onFontSizeChanged$lambda$0;
            default:
                PlayerScreenUI$lambda$44$0$15$0$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$15$0$0(this.f16168b, (u2.z0) this.f16169c, (PlayerViewModel) obj);
                return PlayerScreenUI$lambda$44$0$15$0$0;
        }
    }

    public /* synthetic */ f2(Object obj, long j4, int i10) {
        this.f16167a = i10;
        this.f16169c = obj;
        this.f16168b = j4;
    }
}
