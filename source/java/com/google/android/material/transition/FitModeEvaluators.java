package com.google.android.material.transition;

import android.graphics.RectF;
import com.google.android.gms.internal.measurement.i6;
import f2.i;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f7, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f7;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
            float lerp = TransitionUtils.lerp(f12, f14, f10, f11, f7, true);
            float f16 = lerp / f12;
            float f17 = lerp / f14;
            return new FitModeResult(f16, f17, lerp, f13 * f16, lerp, f15 * f17);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            if (fitModeResult.currentStartHeight > fitModeResult.currentEndHeight) {
                return true;
            }
            return false;
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f7, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f7;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f7, float f10, float f11, float f12, float f13, float f14, float f15) {
            float lerp = TransitionUtils.lerp(f13, f15, f10, f11, f7, true);
            float f16 = lerp / f13;
            float f17 = lerp / f15;
            return new FitModeResult(f16, f17, f12 * f16, lerp, f14 * f17, lerp);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            if (fitModeResult.currentStartWidth > fitModeResult.currentEndWidth) {
                return true;
            }
            return false;
        }
    };

    private FitModeEvaluators() {
    }

    public static FitModeEvaluator get(int i, boolean z10, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return HEIGHT;
                }
                i.k(i6.m(i, "Invalid fit mode: "));
                return null;
            }
            return WIDTH;
        }
        if (shouldAutoFitToWidth(z10, rectF, rectF2)) {
            return WIDTH;
        }
        return HEIGHT;
    }

    private static boolean shouldAutoFitToWidth(boolean z10, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f7 = (height2 * width) / width2;
        float f10 = (width2 * height) / width;
        if (z10) {
            if (f7 < height) {
                return false;
            }
            return true;
        }
        if (f10 < height2) {
            return false;
        }
        return true;
    }
}
