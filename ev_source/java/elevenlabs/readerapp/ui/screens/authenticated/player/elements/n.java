package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.PlayerActionsSheetKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16120a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f16122c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16123d;

    public /* synthetic */ n(ho.a aVar, ho.l lVar, int i10) {
        this.f16122c = aVar;
        this.f16121b = lVar;
        this.f16123d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ExportSheet$lambda$2;
        sn.z SheetMenuItemDelete$lambda$6;
        int i10 = this.f16120a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                ExportSheet$lambda$2 = ExportSheetKt.ExportSheet$lambda$2(this.f16122c, this.f16121b, this.f16123d, mVar, intValue);
                return ExportSheet$lambda$2;
            default:
                SheetMenuItemDelete$lambda$6 = PlayerActionsSheetKt.SheetMenuItemDelete$lambda$6(this.f16121b, this.f16122c, this.f16123d, mVar, intValue);
                return SheetMenuItemDelete$lambda$6;
        }
    }

    public /* synthetic */ n(ho.l lVar, ho.a aVar, int i10) {
        this.f16121b = lVar;
        this.f16122c = aVar;
        this.f16123d = i10;
    }
}
