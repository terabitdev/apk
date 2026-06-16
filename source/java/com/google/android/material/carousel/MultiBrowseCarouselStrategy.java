package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.compose.foundation.gestures.x;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i) {
        boolean z10;
        int itemCount = arrangement.getItemCount() - i;
        if (itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        while (itemCount > 0) {
            int i3 = arrangement.smallCount;
            if (i3 > 0) {
                arrangement.smallCount = i3 - 1;
            } else {
                int i8 = arrangement.mediumCount;
                if (i8 > 1) {
                    arrangement.mediumCount = i8 - 1;
                }
            }
            itemCount--;
        }
        return z10;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        boolean z10;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f7;
        float max = Math.max(getSmallItemSizeMax() + f7, smallItemSizeMin);
        float f10 = containerHeight;
        float min = Math.min(measuredHeight + f7, f10);
        float clamp = MathUtils.clamp((measuredHeight / 3.0f) + f7, smallItemSizeMin + f7, max + f7);
        float f11 = (min + clamp) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        float f12 = 2.0f * smallItemSizeMin;
        if (f10 <= f12) {
            iArr = new int[]{0};
        }
        int[] iArr2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArr = CarouselStrategy.doubleCounts(iArr);
            iArr2 = CarouselStrategy.doubleCounts(iArr2);
        }
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        float f13 = f7;
        int max2 = (int) Math.max(1.0d, Math.floor(x.d(max, CarouselStrategyHelper.maxValue(iArr4), f10 - (CarouselStrategyHelper.maxValue(iArr3) * f11), min)));
        int ceil = (int) Math.ceil(f10 / min);
        int i = (ceil - max2) + 1;
        int[] iArr5 = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            iArr5[i3] = ceil - i3;
        }
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, clamp, smallItemSizeMin, max, iArr4, f11, iArr3, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        boolean ensureArrangementFitsItemCount = ensureArrangementFitsItemCount(findLowestCostArrangement, carousel.getItemCount());
        int i8 = findLowestCostArrangement.mediumCount;
        if (i8 == 0 && findLowestCostArrangement.smallCount == 0 && f10 > f12) {
            findLowestCostArrangement.smallCount = 1;
            z10 = true;
        } else {
            z10 = ensureArrangementFitsItemCount;
        }
        if (z10) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f10, clamp, smallItemSizeMin, max, new int[]{findLowestCostArrangement.smallCount}, f11, new int[]{i8}, min, new int[]{findLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f13, containerHeight, findLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i) {
        if (i >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            if (i >= this.keylineCount && carousel.getItemCount() < this.keylineCount) {
                return true;
            }
            return false;
        }
        return true;
    }
}
