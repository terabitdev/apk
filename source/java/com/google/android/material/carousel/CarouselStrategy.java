package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.color.utilities.Contrast;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public enum StrategyType {
        CONTAINED,
        UNCONTAINED
    }

    public static int[] doubleCounts(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = iArr[i] * 2;
        }
        return iArr2;
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public static float getChildMaskPercentage(float f7, float f10, float f11) {
        return 1.0f - ((f7 - f11) / (f10 - f11));
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    public StrategyType getStrategyType() {
        return StrategyType.CONTAINED;
    }

    public void initialize(Context context) {
        float f7 = this.smallSizeMin;
        if (f7 <= 0.0f) {
            f7 = CarouselStrategyHelper.getSmallSizeMin(context);
        }
        this.smallSizeMin = f7;
        float f10 = this.smallSizeMax;
        if (f10 <= 0.0f) {
            f10 = CarouselStrategyHelper.getSmallSizeMax(context);
        }
        this.smallSizeMax = f10;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);

    public void setSmallItemSizeMax(float f7) {
        this.smallSizeMax = f7;
    }

    public void setSmallItemSizeMin(float f7) {
        this.smallSizeMin = f7;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i) {
        return false;
    }
}
