package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.SkipDuration;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16271b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f16270a = i10;
        this.f16271b = obj;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PlayerPreferencesScreen$lambda$4$0;
        sn.z PlayerPreferencesScreen$lambda$6$0;
        sn.z ThemeSelect$lambda$1$0$1;
        switch (this.f16270a) {
            case 0:
                PlayerPreferencesScreen$lambda$4$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$4$0((PlayerPreferencesViewModel) this.f16271b, (BluetoothButton) obj, (BluetoothButtonAction) obj2);
                return PlayerPreferencesScreen$lambda$4$0;
            case 1:
                PlayerPreferencesScreen$lambda$6$0 = PlayerPreferencesScreenKt.PlayerPreferencesScreen$lambda$6$0((PlayerPreferencesViewModel) this.f16271b, (InAppSkipDirection) obj, (SkipDuration) obj2);
                return PlayerPreferencesScreen$lambda$6$0;
            default:
                ThemeSelect$lambda$1$0$1 = PlayerPreferencesScreenKt.ThemeSelect$lambda$1$0$1((PlayerTheme) this.f16271b, (u2.m) obj, ((Integer) obj2).intValue());
                return ThemeSelect$lambda$1$0$1;
        }
    }
}
