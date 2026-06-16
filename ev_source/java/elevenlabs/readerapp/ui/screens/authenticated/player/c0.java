package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.PlayerActionsSheetKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho.a f15989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15990f;

    public /* synthetic */ c0(String str, String str2, String str3, ho.a aVar, int i10, int i11) {
        this.f15985a = i11;
        this.f15986b = str;
        this.f15987c = str2;
        this.f15988d = str3;
        this.f15989e = aVar;
        this.f15990f = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PreferenceActionRow$lambda$1;
        sn.z SheetHeader$lambda$1;
        sn.z SheetMenuItemVoice$lambda$3;
        switch (this.f15985a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PreferenceActionRow$lambda$1 = PlayerPreferencesScreenKt.PreferenceActionRow$lambda$1(this.f15986b, this.f15987c, this.f15988d, this.f15989e, this.f15990f, (u2.m) obj, intValue);
                return PreferenceActionRow$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                SheetHeader$lambda$1 = PlayerActionsSheetKt.SheetHeader$lambda$1(this.f15986b, this.f15987c, this.f15988d, this.f15989e, this.f15990f, (u2.m) obj, intValue2);
                return SheetHeader$lambda$1;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                SheetMenuItemVoice$lambda$3 = PlayerActionsSheetKt.SheetMenuItemVoice$lambda$3(this.f15986b, this.f15987c, this.f15988d, this.f15989e, this.f15990f, (u2.m) obj, intValue3);
                return SheetMenuItemVoice$lambda$3;
        }
    }
}
