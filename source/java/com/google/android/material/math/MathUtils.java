package com.google.android.material.math;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static boolean areAllElementsEqual(@NonNull float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f7 = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            if (fArr[i] != f7) {
                return false;
            }
        }
        return true;
    }

    public static float dist(float f7, float f10, float f11, float f12) {
        return (float) Math.hypot(f11 - f7, f12 - f10);
    }

    public static float distanceToFurthestCorner(float f7, float f10, float f11, float f12, float f13, float f14) {
        return max(dist(f7, f10, f11, f12), dist(f7, f10, f13, f12), dist(f7, f10, f13, f14), dist(f7, f10, f11, f14));
    }

    public static float floorMod(float f7, int i) {
        float f10 = i;
        int i3 = (int) (f7 / f10);
        if (Math.signum(f7) * f10 < 0.0f && i3 * i != f7) {
            i3--;
        }
        return f7 - (i3 * i);
    }

    public static boolean geq(float f7, float f10, float f11) {
        if (f7 + f11 >= f10) {
            return true;
        }
        return false;
    }

    public static float lerp(float f7, float f10, float f11) {
        return (f11 * f10) + ((1.0f - f11) * f7);
    }

    private static float max(float f7, float f10, float f11, float f12) {
        if (f7 > f10 && f7 > f11 && f7 > f12) {
            return f7;
        }
        if (f10 > f11 && f10 > f12) {
            return f10;
        }
        if (f11 > f12) {
            return f11;
        }
        return f12;
    }

    public static int floorMod(int i, int i3) {
        int i8 = i / i3;
        if ((i ^ i3) < 0 && i8 * i3 != i) {
            i8--;
        }
        return i - (i8 * i3);
    }
}
