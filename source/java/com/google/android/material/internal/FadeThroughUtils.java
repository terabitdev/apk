package com.google.android.material.internal;

import androidx.annotation.FloatRange;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    private FadeThroughUtils() {
    }

    public static void calculateFadeOutAndInAlphas(@FloatRange(from = 0.0d, to = 1.0d) float f7, float[] fArr) {
        if (f7 <= 0.5f) {
            fArr[0] = 1.0f - (f7 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f7 * 2.0f) - 1.0f;
        }
    }
}
