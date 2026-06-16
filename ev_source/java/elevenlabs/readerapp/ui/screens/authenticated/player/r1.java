package io.elevenlabs.readerapp.ui.screens.authenticated.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerViewModel f16306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16307c;

    public /* synthetic */ r1(PlayerViewModel playerViewModel, String str, int i10) {
        this.f16305a = i10;
        this.f16306b = playerViewModel;
        this.f16307c = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState onPlayPronunciationPreview$lambda$0;
        PlayerState onAddPronunciation$lambda$0;
        PlayerState rename$lambda$0;
        switch (this.f16305a) {
            case 0:
                onPlayPronunciationPreview$lambda$0 = PlayerViewModel.onPlayPronunciationPreview$lambda$0(this.f16306b, this.f16307c, (PlayerState) obj);
                return onPlayPronunciationPreview$lambda$0;
            case 1:
                onAddPronunciation$lambda$0 = PlayerViewModel.onAddPronunciation$lambda$0(this.f16306b, this.f16307c, (PlayerState) obj);
                return onAddPronunciation$lambda$0;
            default:
                rename$lambda$0 = PlayerViewModel.rename$lambda$0(this.f16306b, this.f16307c, (PlayerState) obj);
                return rename$lambda$0;
        }
    }
}
