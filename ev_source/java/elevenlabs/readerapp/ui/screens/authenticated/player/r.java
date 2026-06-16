package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.PlayerFontFamily;
import io.elevenlabs.domain.model.PlayerTheme;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerPreferencesViewModel f16295b;

    public /* synthetic */ r(PlayerPreferencesViewModel playerPreferencesViewModel, int i10) {
        this.f16294a = i10;
        this.f16295b = playerPreferencesViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z PlayerPreferencesScreen$lambda$5$0;
        sn.z PlayerPreferencesScreen$lambda$7$0;
        sn.z PlayerPreferencesScreen$lambda$8$0;
        sn.z PlayerPreferencesScreen$lambda$9$0;
        sn.z PlayerPreferencesScreen$lambda$1$0;
        sn.z PlayerPreferencesScreen$lambda$2$0;
        sn.z PlayerPreferencesScreen$lambda$3$0;
        PlayerPreferencesState reset$lambda$0;
        switch (this.f16294a) {
            case 0:
                PlayerPreferencesScreen$lambda$5$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$5$0(this.f16295b, (InAppSkipDirection) obj);
                return PlayerPreferencesScreen$lambda$5$0;
            case 1:
                PlayerPreferencesScreen$lambda$7$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$7$0(this.f16295b, ((Boolean) obj).booleanValue());
                return PlayerPreferencesScreen$lambda$7$0;
            case 2:
                PlayerPreferencesScreen$lambda$8$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$8$0(this.f16295b, ((Boolean) obj).booleanValue());
                return PlayerPreferencesScreen$lambda$8$0;
            case 3:
                PlayerPreferencesScreen$lambda$9$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$9$0(this.f16295b, (PlayerFontFamily) obj);
                return PlayerPreferencesScreen$lambda$9$0;
            case 4:
                PlayerPreferencesScreen$lambda$1$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$1$0(this.f16295b, ((Long) obj).longValue());
                return PlayerPreferencesScreen$lambda$1$0;
            case 5:
                PlayerPreferencesScreen$lambda$2$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$2$0(this.f16295b, (PlayerTheme) obj);
                return PlayerPreferencesScreen$lambda$2$0;
            case 6:
                PlayerPreferencesScreen$lambda$3$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$3$0(this.f16295b, (BluetoothButton) obj);
                return PlayerPreferencesScreen$lambda$3$0;
            default:
                reset$lambda$0 = PlayerPreferencesViewModel.reset$lambda$0(this.f16295b, (PlayerPreferencesState) obj);
                return reset$lambda$0;
        }
    }
}
