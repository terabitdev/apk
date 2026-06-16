package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static double clampDouble(double d10, double d11, double d12) {
        if (d12 < d10) {
            return d10;
        }
        if (d12 > d11) {
            return d11;
        }
        return d12;
    }

    public static int clampInt(int i, int i3, int i8) {
        if (i8 < i) {
            return i;
        }
        if (i8 > i3) {
            return i3;
        }
        return i8;
    }

    public static double differenceDegrees(double d10, double d11) {
        return 180.0d - Math.abs(Math.abs(d10 - d11) - 180.0d);
    }

    public static double lerp(double d10, double d11, double d12) {
        return (d12 * d11) + ((1.0d - d12) * d10);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d10 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d11 = dArr3[0] * d10;
        double d12 = dArr[1];
        double d13 = (dArr3[1] * d12) + d11;
        double d14 = dArr[2];
        double d15 = (dArr3[2] * d14) + d13;
        double[] dArr4 = dArr2[1];
        double d16 = (dArr4[2] * d14) + (dArr4[1] * d12) + (dArr4[0] * d10);
        double[] dArr5 = dArr2[2];
        return new double[]{d15, d16, (d14 * dArr5[2]) + (d12 * dArr5[1]) + (d10 * dArr5[0])};
    }

    public static double rotationDirection(double d10, double d11) {
        if (sanitizeDegreesDouble(d11 - d10) <= 180.0d) {
            return 1.0d;
        }
        return -1.0d;
    }

    public static double sanitizeDegreesDouble(double d10) {
        double d11 = d10 % 360.0d;
        if (d11 < 0.0d) {
            return d11 + 360.0d;
        }
        return d11;
    }

    public static int sanitizeDegreesInt(int i) {
        int i3 = i % 360;
        if (i3 < 0) {
            return i3 + 360;
        }
        return i3;
    }

    public static int signum(double d10) {
        if (d10 < 0.0d) {
            return -1;
        }
        if (d10 == 0.0d) {
            return 0;
        }
        return 1;
    }
}
