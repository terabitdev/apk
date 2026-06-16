package com.google.android.material.transition;

import android.support.v4.media.session.m;
import com.google.android.gms.internal.measurement.i6;
import f2.i;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f7, float f10, float f11, float f12) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f10, f11, f7));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f7, float f10, float f11, float f12) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f10, f11, f7), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f7, float f10, float f11, float f12) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f10, f11, f7), TransitionUtils.lerp(0, 255, f10, f11, f7));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f7, float f10, float f11, float f12) {
            float f13 = m.f(f11, f10, f12, f10);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f10, f13, f7), TransitionUtils.lerp(0, 255, f13, f11, f7));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i, boolean z10) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return THROUGH;
                    }
                    i.k(i6.m(i, "Invalid fade mode: "));
                    return null;
                }
                return CROSS;
            }
            if (z10) {
                return OUT;
            }
            return IN;
        }
        if (z10) {
            return IN;
        }
        return OUT;
    }
}
