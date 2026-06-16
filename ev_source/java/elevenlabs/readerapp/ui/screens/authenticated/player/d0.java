package io.elevenlabs.readerapp.ui.screens.authenticated.player;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerPreferencesViewModel f16034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16035c;

    public /* synthetic */ d0(PlayerPreferencesViewModel playerPreferencesViewModel, boolean z6, int i10) {
        this.f16033a = i10;
        this.f16034b = playerPreferencesViewModel;
        this.f16035c = z6;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerPreferencesState playerPreferencesState;
        PlayerPreferencesState playerPreferencesState2;
        switch (this.f16033a) {
            case 0:
                playerPreferencesState = PlayerPreferencesViewModel.toggleTapToShowControls$lambda$0(this.f16034b, this.f16035c, (PlayerPreferencesState) obj);
                return playerPreferencesState;
            default:
                playerPreferencesState2 = PlayerPreferencesViewModel.toggleAutoFullscreen$lambda$0(this.f16034b, this.f16035c, (PlayerPreferencesState) obj);
                return playerPreferencesState2;
        }
    }
}
