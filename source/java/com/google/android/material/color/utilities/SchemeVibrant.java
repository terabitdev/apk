package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class SchemeVibrant extends DynamicScheme {
    private static final double[] HUES = {0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d};
    private static final double[] SECONDARY_ROTATIONS = {18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d};
    private static final double[] TERTIARY_ROTATIONS = {35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SchemeVibrant(Hct hct, boolean z10, double d10) {
        super(hct, r2, z10, d10, r6, TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, r0, SECONDARY_ROTATIONS), 24.0d), TonalPalette.fromHueAndChroma(DynamicScheme.getRotatedHue(hct, r0, TERTIARY_ROTATIONS), 32.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 10.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 12.0d));
        Variant variant = Variant.VIBRANT;
        TonalPalette fromHueAndChroma = TonalPalette.fromHueAndChroma(hct.getHue(), 200.0d);
        double[] dArr = HUES;
    }
}
