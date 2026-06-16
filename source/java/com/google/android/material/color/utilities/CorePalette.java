package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CorePalette {

    /* renamed from: a1, reason: collision with root package name */
    public TonalPalette f4090a1;

    /* renamed from: a2, reason: collision with root package name */
    public TonalPalette f4091a2;

    /* renamed from: a3, reason: collision with root package name */
    public TonalPalette f4092a3;
    public TonalPalette error;
    public TonalPalette n1;

    /* renamed from: n2, reason: collision with root package name */
    public TonalPalette f4093n2;

    private CorePalette(int i, boolean z10) {
        Hct fromInt = Hct.fromInt(i);
        double hue = fromInt.getHue();
        double chroma = fromInt.getChroma();
        if (z10) {
            this.f4090a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f4091a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f4092a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f4093n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f4090a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f4091a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f4092a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f4093n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    public static CorePalette of(int i) {
        return new CorePalette(i, false);
    }
}
