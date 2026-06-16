package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.PlayerActionsSheetKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16135a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f16136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f16137c;

    public /* synthetic */ t(ho.a aVar, ho.l lVar) {
        this.f16136b = aVar;
        this.f16137c = lVar;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z SleepTimerSheetUI$lambda$2$1$0;
        sn.z SheetMenuItemDelete$lambda$5$0;
        switch (this.f16135a) {
            case 0:
                SleepTimerSheetUI$lambda$2$1$0 = SleepTimerSheetKt.SleepTimerSheetUI$lambda$2$1$0(this.f16137c, this.f16136b);
                return SleepTimerSheetUI$lambda$2$1$0;
            default:
                SheetMenuItemDelete$lambda$5$0 = PlayerActionsSheetKt.SheetMenuItemDelete$lambda$5$0(this.f16136b, this.f16137c);
                return SheetMenuItemDelete$lambda$5$0;
        }
    }

    public /* synthetic */ t(ho.l lVar, ho.a aVar) {
        this.f16137c = lVar;
        this.f16136b = aVar;
    }
}
