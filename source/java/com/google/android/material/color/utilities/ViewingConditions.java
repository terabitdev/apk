package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);
    private final double aw;

    /* renamed from: c, reason: collision with root package name */
    private final double f4100c;
    private final double fl;
    private final double flRoot;

    /* renamed from: n, reason: collision with root package name */
    private final double f4101n;
    private final double nbb;
    private final double nc;
    private final double ncb;
    private final double[] rgbD;

    /* renamed from: z, reason: collision with root package name */
    private final double f4102z;

    private ViewingConditions(double d10, double d11, double d12, double d13, double d14, double d15, double[] dArr, double d16, double d17, double d18) {
        this.f4101n = d10;
        this.aw = d11;
        this.nbb = d12;
        this.ncb = d13;
        this.f4100c = d14;
        this.nc = d15;
        this.rgbD = dArr;
        this.fl = d16;
        this.flRoot = d17;
        this.f4102z = d18;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d10) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d10, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d10, double d11, double d12, boolean z10) {
        double lerp;
        double exp;
        double max = Math.max(0.1d, d11);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d13 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d14 = dArr3[0] * d13;
        double d15 = dArr[1];
        double d16 = (dArr3[1] * d15) + d14;
        double d17 = dArr[2];
        double d18 = (dArr3[2] * d17) + d16;
        double[] dArr4 = dArr2[1];
        double d19 = (dArr4[2] * d17) + (dArr4[1] * d15) + (dArr4[0] * d13);
        double[] dArr5 = dArr2[2];
        double d20 = (d17 * dArr5[2]) + (d15 * dArr5[1]) + (d13 * dArr5[0]);
        double d21 = (d12 / 10.0d) + 0.8d;
        if (d21 >= 0.9d) {
            lerp = MathUtils.lerp(0.59d, 0.69d, (d21 - 0.9d) * 10.0d);
        } else {
            lerp = MathUtils.lerp(0.525d, 0.59d, (d21 - 0.8d) * 10.0d);
        }
        double d22 = lerp;
        if (z10) {
            exp = 1.0d;
        } else {
            exp = (1.0d - (Math.exp(((-d10) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d21;
        }
        double clampDouble = MathUtils.clampDouble(0.0d, 1.0d, exp);
        double[] dArr6 = {(((100.0d / d18) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d19) * clampDouble) + 1.0d) - clampDouble, (((100.0d / d20) * clampDouble) + 1.0d) - clampDouble};
        double d23 = 5.0d * d10;
        double d24 = 1.0d / (d23 + 1.0d);
        double d25 = d24 * d24 * d24 * d24;
        double d26 = 1.0d - d25;
        double cbrt = (Math.cbrt(d23) * 0.1d * d26 * d26) + (d25 * d10);
        double yFromLstar = ColorUtils.yFromLstar(max) / dArr[1];
        double sqrt = Math.sqrt(yFromLstar) + 1.48d;
        double pow = 0.725d / Math.pow(yFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d18) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d19) / 100.0d, 0.42d), Math.pow(((dArr6[2] * cbrt) * d20) / 100.0d, 0.42d)};
        double d27 = dArr7[0];
        double d28 = (d27 * 400.0d) / (d27 + 27.13d);
        double d29 = dArr7[1];
        double d30 = (d29 * 400.0d) / (d29 + 27.13d);
        double d31 = dArr7[2];
        double[] dArr8 = {d28, d30, (400.0d * d31) / (d31 + 27.13d)};
        return new ViewingConditions(yFromLstar, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * pow, pow, pow, d22, d21, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }

    public double getAw() {
        return this.aw;
    }

    public double getC() {
        return this.f4100c;
    }

    public double getFl() {
        return this.fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f4101n;
    }

    public double getNbb() {
        return this.nbb;
    }

    public double getNc() {
        return this.nc;
    }

    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.f4102z;
    }
}
