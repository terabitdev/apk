package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static final class KeyColor {
        private static final double MAX_CHROMA_VALUE = 200.0d;
        private final Map<Integer, Double> chromaCache = new HashMap();
        private final double hue;
        private final double requestedChroma;

        public KeyColor(double d10, double d11) {
            this.hue = d10;
            this.requestedChroma = d11;
        }

        private double maxChroma(int i) {
            if (this.chromaCache.get(Integer.valueOf(i)) == null) {
                this.chromaCache.put(Integer.valueOf(i), Double.valueOf(Hct.from(this.hue, 200.0d, i).getChroma()));
            }
            return this.chromaCache.get(Integer.valueOf(i)).doubleValue();
        }

        public Hct create() {
            boolean z10;
            int i = 100;
            int i3 = 0;
            while (i3 < i) {
                int i8 = (i3 + i) / 2;
                int i10 = i8 + 1;
                if (maxChroma(i8) < maxChroma(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (maxChroma(i8) >= this.requestedChroma - 0.01d) {
                    if (Math.abs(i3 - 50) >= Math.abs(i - 50)) {
                        if (i3 == i8) {
                            return Hct.from(this.hue, this.requestedChroma, i3);
                        }
                        i3 = i8;
                    } else {
                        i = i8;
                    }
                } else if (z10) {
                    i3 = i10;
                } else {
                    i = i8;
                }
            }
            return Hct.from(this.hue, this.requestedChroma, i3);
        }
    }

    private TonalPalette(double d10, double d11, Hct hct) {
        this.hue = d10;
        this.chroma = d11;
        this.keyColor = hct;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d10, double d11) {
        return new TonalPalette(d10, d11, new KeyColor(d10, d11).create());
    }

    public static TonalPalette fromInt(int i) {
        return fromHct(Hct.fromInt(i));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d10) {
        return Hct.from(this.hue, this.chroma, d10);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i) {
        Integer num = this.cache.get(Integer.valueOf(i));
        if (num == null) {
            num = Integer.valueOf(Hct.from(this.hue, this.chroma, i).toInt());
            this.cache.put(Integer.valueOf(i), num);
        }
        return num.intValue();
    }
}
