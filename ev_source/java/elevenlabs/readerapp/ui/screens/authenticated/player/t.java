package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.highlighter.WordTapTarget;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16343b;

    public /* synthetic */ t(ho.l lVar, int i10) {
        this.f16342a = i10;
        this.f16343b = lVar;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z FontSizeSelect$lambda$0$0$0;
        sn.z PlayerScreenDialogs$lambda$15$0;
        sn.z PlayerScreenDialogs$lambda$18$0;
        sn.z PlayerScreenDialogs$lambda$27$0;
        sn.z PlayerScreenDialogs$lambda$30$0;
        sn.z PlayerScreenUI$lambda$44$0$4$1$5$0;
        sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$5$0;
        sn.z PlayerScreenUI$lambda$44$0$18$1$0$2$6$0;
        sn.z PlayerScreenUI$lambda$44$0$4$1$9$0;
        sn.z PlayerScreenUI$lambda$44$0$4$1$11$0;
        sn.z PlayerScreenUI$lambda$44$16$0;
        sn.z PlayerScreenUI$lambda$44$18$0;
        sn.z PlayerScreenUI$lambda$44$27$0;
        sn.z PlayerScreenUI$lambda$44$0$4$1$3$0;
        sn.z PlayerScreenUI$lambda$44$30$0;
        sn.z PlayerScreenUI$lambda$44$0$4$1$4$0;
        switch (this.f16342a) {
            case 0:
                FontSizeSelect$lambda$0$0$0 = PlayerPreferencesScreenKt.FontSizeSelect$lambda$0$0$0(this.f16343b, ((Float) obj).floatValue());
                return FontSizeSelect$lambda$0$0$0;
            case 1:
                PlayerScreenDialogs$lambda$15$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$15$0(this.f16343b, (String) obj);
                return PlayerScreenDialogs$lambda$15$0;
            case 2:
                PlayerScreenDialogs$lambda$18$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$18$0(this.f16343b, ((Boolean) obj).booleanValue());
                return PlayerScreenDialogs$lambda$18$0;
            case 3:
                PlayerScreenDialogs$lambda$27$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$27$0(this.f16343b, (Bookmark) obj);
                return PlayerScreenDialogs$lambda$27$0;
            case 4:
                PlayerScreenDialogs$lambda$30$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$30$0(this.f16343b, (Bookmark) obj);
                return PlayerScreenDialogs$lambda$30$0;
            case 5:
                PlayerScreenUI$lambda$44$0$4$1$5$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1$5$0(this.f16343b, (String) obj);
                return PlayerScreenUI$lambda$44$0$4$1$5$0;
            case 6:
                PlayerScreenUI$lambda$44$0$18$1$0$2$5$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1$0$2$5$0(this.f16343b, (PlaybackPosition) obj);
                return PlayerScreenUI$lambda$44$0$18$1$0$2$5$0;
            case 7:
                PlayerScreenUI$lambda$44$0$18$1$0$2$6$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$18$1$0$2$6$0(this.f16343b, (PlaybackPosition) obj);
                return PlayerScreenUI$lambda$44$0$18$1$0$2$6$0;
            case 8:
                PlayerScreenUI$lambda$44$0$4$1$9$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1$9$0(this.f16343b, ((Boolean) obj).booleanValue());
                return PlayerScreenUI$lambda$44$0$4$1$9$0;
            case 9:
                PlayerScreenUI$lambda$44$0$4$1$11$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1$11$0(this.f16343b, ((Integer) obj).intValue());
                return PlayerScreenUI$lambda$44$0$4$1$11$0;
            case 10:
                PlayerScreenUI$lambda$44$16$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$16$0(this.f16343b, (Analytics.Event.PlayerActionSource) obj);
                return PlayerScreenUI$lambda$44$16$0;
            case 11:
                PlayerScreenUI$lambda$44$18$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$18$0(this.f16343b, (Analytics.Event.PlayerActionSource) obj);
                return PlayerScreenUI$lambda$44$18$0;
            case 12:
                PlayerScreenUI$lambda$44$27$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$27$0(this.f16343b, (Analytics.Event.PlayerActionSource) obj);
                return PlayerScreenUI$lambda$44$27$0;
            case 13:
                PlayerScreenUI$lambda$44$0$4$1$3$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1$3$0(this.f16343b, (WordTapTarget) obj);
                return PlayerScreenUI$lambda$44$0$4$1$3$0;
            case 14:
                PlayerScreenUI$lambda$44$30$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$30$0(this.f16343b, (Analytics.Event.PlayerActionSource) obj);
                return PlayerScreenUI$lambda$44$30$0;
            default:
                PlayerScreenUI$lambda$44$0$4$1$4$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$4$1$4$0(this.f16343b, (String) obj);
                return PlayerScreenUI$lambda$44$0$4$1$4$0;
        }
    }
}
