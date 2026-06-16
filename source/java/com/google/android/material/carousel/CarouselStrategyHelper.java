package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
    }

    public static float addEnd(float f7, float f10, int i) {
        return (Math.max(0, i - 1) * f10) + f7;
    }

    public static float addStart(float f7, float f10, int i) {
        if (i > 0) {
            return (f10 / 2.0f) + f7;
        }
        return f7;
    }

    public static KeylineState createCenterAlignedKeylineState(@NonNull Context context, float f7, int i, @NonNull Arrangement arrangement) {
        float f10;
        float f11;
        float min = Math.min(getExtraSmallSize(context) + f7, arrangement.largeSize);
        float f12 = min / 2.0f;
        float f13 = 0.0f - f12;
        float addStart = addStart(0.0f, arrangement.smallSize, arrangement.smallCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.smallSize, (int) Math.floor(arrangement.smallCount / 2.0f)), arrangement.smallSize, arrangement.smallCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float updateCurPosition2 = updateCurPosition(updateCurPosition, addEnd(addStart2, arrangement.mediumSize, (int) Math.floor(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition2, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition3 = updateCurPosition(updateCurPosition2, addEnd(addStart3, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart4 = addStart(updateCurPosition3, arrangement.mediumSize, arrangement.mediumCount);
        float addStart5 = addStart(updateCurPosition(updateCurPosition3, addEnd(addStart4, arrangement.mediumSize, (int) Math.ceil(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f14 = i + f12;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f7);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f7);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f7);
        KeylineState.Builder addAnchorKeyline = new KeylineState.Builder(arrangement.largeSize, i).addAnchorKeyline(f13, childMaskPercentage, min);
        if (arrangement.smallCount > 0) {
            f10 = 2.0f;
            f11 = childMaskPercentage;
            addAnchorKeyline.addKeylineRange(addStart, childMaskPercentage2, arrangement.smallSize, (int) Math.floor(r7 / 2.0f));
        } else {
            f10 = 2.0f;
            f11 = childMaskPercentage;
        }
        if (arrangement.mediumCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart2, childMaskPercentage3, arrangement.mediumSize, (int) Math.floor(r4 / f10));
        }
        addAnchorKeyline.addKeylineRange(addStart3, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart4, childMaskPercentage3, arrangement.mediumSize, (int) Math.ceil(r4 / f10));
        }
        if (arrangement.smallCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart5, childMaskPercentage2, arrangement.smallSize, (int) Math.ceil(r0 / f10));
        }
        addAnchorKeyline.addAnchorKeyline(f14, f11, min);
        return addAnchorKeyline.build();
    }

    public static KeylineState createKeylineState(@NonNull Context context, float f7, int i, @NonNull Arrangement arrangement, int i3) {
        if (i3 == 1) {
            return createCenterAlignedKeylineState(context, f7, i, arrangement);
        }
        return createLeftAlignedKeylineState(context, f7, i, arrangement);
    }

    public static KeylineState createLeftAlignedKeylineState(@NonNull Context context, float f7, int i, @NonNull Arrangement arrangement) {
        float min = Math.min(getExtraSmallSize(context) + f7, arrangement.largeSize);
        float f10 = min / 2.0f;
        float f11 = 0.0f - f10;
        float addStart = addStart(0.0f, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition(updateCurPosition, addStart2, arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f12 = i + f10;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f7);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f7);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f7);
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(arrangement.largeSize, i).addAnchorKeyline(f11, childMaskPercentage, min).addKeylineRange(addStart, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            addKeylineRange.addKeyline(addStart2, childMaskPercentage3, arrangement.mediumSize);
        }
        int i3 = arrangement.smallCount;
        if (i3 > 0) {
            addKeylineRange.addKeylineRange(addStart3, childMaskPercentage2, arrangement.smallSize, i3);
        }
        addKeylineRange.addAnchorKeyline(f12, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    public static float getExtraSmallSize(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    public static float getSmallSizeMax(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    public static float getSmallSizeMin(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    public static int maxValue(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i3 : iArr) {
            if (i3 > i) {
                i = i3;
            }
        }
        return i;
    }

    public static float updateCurPosition(float f7, float f10, float f11, int i) {
        if (i > 0) {
            return (f11 / 2.0f) + f10;
        }
        return f7;
    }
}
