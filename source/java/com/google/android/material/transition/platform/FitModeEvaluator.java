package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RequiresApi(21)
/* loaded from: classes4.dex */
public interface FitModeEvaluator {
    void applyMask(RectF rectF, float f7, FitModeResult fitModeResult);

    FitModeResult evaluate(float f7, float f10, float f11, float f12, float f13, float f14, float f15);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
