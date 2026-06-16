package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.color.utilities.Contrast;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public interface Maskable {
    @NonNull
    RectF getMaskRectF();

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@NonNull RectF rectF);

    @Deprecated
    void setMaskXPercentage(@FloatRange(from = 0.0d, to = 1.0d) float f7);

    void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener);
}
