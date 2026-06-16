package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.PlayerTheme;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15984d;

    public /* synthetic */ c(Object obj, Object obj2, int i10, int i11) {
        this.f15981a = i11;
        this.f15983c = obj;
        this.f15984d = obj2;
        this.f15982b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z AnimatedBlurredBackground$lambda$14;
        sn.z ThemeSelect$lambda$2;
        sn.z FontSizeSelect$lambda$1;
        switch (this.f15981a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AnimatedBlurredBackground$lambda$14 = AudioOnlyPlayerUiKt.AnimatedBlurredBackground$lambda$14((String) this.f15983c, (String) this.f15984d, this.f15982b, (u2.m) obj, intValue);
                return AnimatedBlurredBackground$lambda$14;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ThemeSelect$lambda$2 = PlayerPreferencesScreenKt.ThemeSelect$lambda$2((PlayerTheme) this.f15983c, (ho.l) this.f15984d, this.f15982b, (u2.m) obj, intValue2);
                return ThemeSelect$lambda$2;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                FontSizeSelect$lambda$1 = PlayerPreferencesScreenKt.FontSizeSelect$lambda$1((Long) this.f15983c, (ho.l) this.f15984d, this.f15982b, (u2.m) obj, intValue3);
                return FontSizeSelect$lambda$1;
        }
    }
}
