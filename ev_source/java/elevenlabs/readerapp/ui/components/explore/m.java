package io.elevenlabs.readerapp.ui.components.explore;

import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.ChatInputKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.PlayerHeaderKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import n3.v;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements ho.p {
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14613a = 3;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f14615c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f14616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f14617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f14618f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f14619x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f14620y0;

    /* renamed from: z0, reason: collision with root package name */
    public final /* synthetic */ Object f14621z0;

    public /* synthetic */ m(ho.q qVar, String str, ho.a aVar, t tVar, ButtonIconVariant buttonIconVariant, ButtonIconSize buttonIconSize, boolean z6, boolean z10, int i10, int i11) {
        this.f14619x0 = qVar;
        this.f14614b = str;
        this.f14615c = aVar;
        this.f14616d = tVar;
        this.f14620y0 = buttonIconVariant;
        this.f14621z0 = buttonIconSize;
        this.f14617e = z6;
        this.f14618f = z10;
        this.Y = i10;
        this.Z = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z HeroCard$lambda$2;
        z ChatInput$lambda$3;
        z PlayerHeader$lambda$1;
        z ButtonIcon$lambda$5;
        switch (this.f14613a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                HeroCard$lambda$2 = ExploreHeroCarouselKt.HeroCard$lambda$2(this.f14614b, (String) this.f14619x0, (String) this.f14620y0, (String) this.f14621z0, this.f14615c, this.f14616d, this.f14617e, this.f14618f, this.Y, this.Z, (u2.m) obj, intValue);
                return HeroCard$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ChatInput$lambda$3 = ChatInputKt.ChatInput$lambda$3(this.f14614b, (ho.l) this.f14619x0, this.f14615c, (ho.a) this.f14620y0, this.f14616d, (v) this.f14621z0, this.f14617e, this.f14618f, this.Y, this.Z, (u2.m) obj, intValue2);
                return ChatInput$lambda$3;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                PlayerHeader$lambda$1 = PlayerHeaderKt.PlayerHeader$lambda$1(this.f14614b, (String) this.f14619x0, this.f14617e, this.f14618f, this.f14615c, (ho.a) this.f14620y0, (ho.a) this.f14621z0, this.f14616d, this.Y, this.Z, (u2.m) obj, intValue3);
                return PlayerHeader$lambda$1;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                ButtonIcon$lambda$5 = ButtonIconKt.ButtonIcon$lambda$5((ho.q) this.f14619x0, this.f14614b, this.f14615c, this.f14616d, (ButtonIconVariant) this.f14620y0, (ButtonIconSize) this.f14621z0, this.f14617e, this.f14618f, this.Y, this.Z, (u2.m) obj, intValue4);
                return ButtonIcon$lambda$5;
        }
    }

    public /* synthetic */ m(String str, ho.l lVar, ho.a aVar, ho.a aVar2, t tVar, v vVar, boolean z6, boolean z10, int i10, int i11) {
        this.f14614b = str;
        this.f14619x0 = lVar;
        this.f14615c = aVar;
        this.f14620y0 = aVar2;
        this.f14616d = tVar;
        this.f14621z0 = vVar;
        this.f14617e = z6;
        this.f14618f = z10;
        this.Y = i10;
        this.Z = i11;
    }

    public /* synthetic */ m(String str, String str2, String str3, String str4, ho.a aVar, t tVar, boolean z6, boolean z10, int i10, int i11) {
        this.f14614b = str;
        this.f14619x0 = str2;
        this.f14620y0 = str3;
        this.f14621z0 = str4;
        this.f14615c = aVar;
        this.f14616d = tVar;
        this.f14617e = z6;
        this.f14618f = z10;
        this.Y = i10;
        this.Z = i11;
    }

    public /* synthetic */ m(String str, String str2, boolean z6, boolean z10, ho.a aVar, ho.a aVar2, ho.a aVar3, t tVar, int i10, int i11) {
        this.f14614b = str;
        this.f14619x0 = str2;
        this.f14617e = z6;
        this.f14618f = z10;
        this.f14615c = aVar;
        this.f14620y0 = aVar2;
        this.f14621z0 = aVar3;
        this.f14616d = tVar;
        this.Y = i10;
        this.Z = i11;
    }
}
