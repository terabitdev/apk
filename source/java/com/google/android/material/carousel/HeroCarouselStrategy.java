package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.compose.foundation.gestures.x;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int[] iArr;
        int i;
        int[] iArr2;
        int[] iArr3;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f7;
        float max = Math.max(getSmallItemSizeMax() + f7, smallItemSizeMin);
        float f10 = containerHeight;
        float min = Math.min(measuredWidth + f7, f10);
        float clamp = MathUtils.clamp((measuredWidth / 3.0f) + f7, smallItemSizeMin + f7, max + f7);
        float f11 = (min + clamp) / 2.0f;
        int[] iArr4 = SMALL_COUNTS;
        int i3 = 0;
        if (f10 < 2.0f * smallItemSizeMin) {
            iArr = new int[]{0};
        } else {
            iArr = iArr4;
        }
        int max2 = (int) Math.max(1.0d, Math.floor(x.d(max, CarouselStrategyHelper.maxValue(iArr4), f10, min)));
        int ceil = (((int) Math.ceil(f10 / min)) - max2) + 1;
        int[] iArr5 = new int[ceil];
        for (int i8 = 0; i8 < ceil; i8++) {
            iArr5[i8] = max2 + i8;
        }
        if (carousel.getCarouselAlignment() == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            iArr2 = CarouselStrategy.doubleCounts(iArr);
        } else {
            iArr2 = iArr;
        }
        if (i != 0) {
            iArr3 = CarouselStrategy.doubleCounts(MEDIUM_COUNTS);
        } else {
            iArr3 = MEDIUM_COUNTS;
        }
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, clamp, smallItemSizeMin, max, iArr2, f11, iArr3, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (findLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, clamp, smallItemSizeMin, max, iArr, f11, MEDIUM_COUNTS, min, iArr5);
        } else {
            i3 = i;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f7, containerHeight, findLowestCostArrangement, i3);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i) {
        if (carousel.getCarouselAlignment() == 1) {
            if ((i < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i >= this.keylineCount && carousel.getItemCount() < this.keylineCount)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
