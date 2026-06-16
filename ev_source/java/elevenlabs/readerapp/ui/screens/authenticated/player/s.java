package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerTheme;
import io.elevenlabs.domain.model.Pronunciation;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16310c;

    public /* synthetic */ s(Object obj, Object obj2, int i10) {
        this.f16308a = i10;
        this.f16309b = obj;
        this.f16310c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z ThemeSelect$lambda$1$0$0$0;
        sn.z PlayerScreenDialogs$lambda$40$0;
        sn.z PlayerScreen$lambda$29$1$0;
        sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$26$0;
        boolean PlayerScreenUI$lambda$39$0;
        sn.z PlayerScreenUI$lambda$44$23$0;
        switch (this.f16308a) {
            case 0:
                ThemeSelect$lambda$1$0$0$0 = PlayerPreferencesScreenKt.ThemeSelect$lambda$1$0$0$0((ho.l) this.f16309b, (PlayerTheme) this.f16310c);
                return ThemeSelect$lambda$1$0$0$0;
            case 1:
                PlayerScreenDialogs$lambda$40$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$40$0((ho.l) this.f16309b, (Pronunciation) this.f16310c);
                return PlayerScreenDialogs$lambda$40$0;
            case 2:
                PlayerScreen$lambda$29$1$0 = PlayerScreenKt.PlayerScreen$lambda$29$1$0((String) this.f16309b, (u2.z0) this.f16310c);
                return PlayerScreen$lambda$29$1$0;
            case 3:
                PlayerScreenUI$lambda$44$0$18$1$0$2$26$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1$0$2$26$0((ho.l) this.f16309b, (u2.z0) this.f16310c);
                return PlayerScreenUI$lambda$44$0$18$1$0$2$26$0;
            case 4:
                PlayerScreenUI$lambda$39$0 = PlayerScreenKt.PlayerScreenUI$lambda$39$0((PlayerDisplayMode) this.f16309b, (s2) this.f16310c);
                return Boolean.valueOf(PlayerScreenUI$lambda$39$0);
            default:
                PlayerScreenUI$lambda$44$23$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$23$0((ho.l) this.f16309b, (ho.a) this.f16310c);
                return PlayerScreenUI$lambda$44$23$0;
        }
    }
}
