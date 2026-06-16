package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.PlayerDisplayMode;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16239b;

    public /* synthetic */ n(ho.l lVar, int i10) {
        this.f16238a = i10;
        this.f16239b = lVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PlayerFloatingBottomControls$lambda$0$0$0;
        sn.z PlayerFloatingBottomControls$lambda$0$1$0;
        sn.z PlayerScreenDialogs$lambda$32$0;
        sn.z PlayerScreenUI$lambda$44$24$0;
        sn.z PlayerScreenUI$lambda$44$25$0;
        sn.z PlayerScreenUI$lambda$44$0$10$0;
        switch (this.f16238a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PlayerFloatingBottomControls$lambda$0$0$0 = PlayerFloatingBottomControlsKt.PlayerFloatingBottomControls$lambda$0$0$0(this.f16239b, (u2.m) obj, intValue);
                return PlayerFloatingBottomControls$lambda$0$0$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                PlayerFloatingBottomControls$lambda$0$1$0 = PlayerFloatingBottomControlsKt.PlayerFloatingBottomControls$lambda$0$1$0(this.f16239b, (u2.m) obj, intValue2);
                return PlayerFloatingBottomControls$lambda$0$1$0;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                PlayerScreenDialogs$lambda$32$0 = PlayerScreenDialogsKt.PlayerScreenDialogs$lambda$32$0(this.f16239b, (u2.m) obj, intValue3);
                return PlayerScreenDialogs$lambda$32$0;
            case 3:
                PlayerScreenUI$lambda$44$24$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$24$0(this.f16239b, (DownloadAction) obj, (Analytics.Event.PlayerActionSource) obj2);
                return PlayerScreenUI$lambda$44$24$0;
            case 4:
                PlayerScreenUI$lambda$44$25$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$25$0(this.f16239b, (PlayerDisplayMode) obj, (Analytics.Event.PlayerActionSource) obj2);
                return PlayerScreenUI$lambda$44$25$0;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                PlayerScreenUI$lambda$44$0$10$0 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$10$0(this.f16239b, (u2.m) obj, intValue4);
                return PlayerScreenUI$lambda$44$0$10$0;
        }
    }
}
