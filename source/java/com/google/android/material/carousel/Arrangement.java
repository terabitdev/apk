package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.gestures.x;
import androidx.core.math.MathUtils;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    public Arrangement(int i, float f7, float f10, float f11, int i3, float f12, int i8, float f13, int i10, float f14) {
        this.priority = i;
        this.smallSize = MathUtils.clamp(f7, f10, f11);
        this.smallCount = i3;
        this.mediumSize = f12;
        this.mediumCount = i8;
        this.largeSize = f13;
        this.largeCount = i10;
        fit(f14, f10, f11, f13);
        this.cost = cost(f13);
    }

    private float calculateLargeSize(float f7, int i, float f10, int i3, int i8) {
        if (i <= 0) {
            f10 = 0.0f;
        }
        float f11 = i3 / 2.0f;
        return (f7 - ((i + f11) * f10)) / (i8 + f11);
    }

    private float cost(float f7) {
        if (!isValid()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f7 - this.largeSize) * this.priority;
    }

    @Nullable
    public static Arrangement findLowestCostArrangement(float f7, float f10, float f11, float f12, @NonNull int[] iArr, float f13, @NonNull int[] iArr2, float f14, @NonNull int[] iArr3) {
        Arrangement arrangement = null;
        int i = 1;
        for (int i3 : iArr3) {
            int length = iArr2.length;
            int i8 = 0;
            while (i8 < length) {
                int i10 = iArr2[i8];
                int length2 = iArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    int i12 = length;
                    int i13 = i8;
                    int i14 = i;
                    int i15 = length2;
                    int i16 = i11;
                    Arrangement arrangement2 = new Arrangement(i14, f10, f11, f12, iArr[i11], f13, i10, f14, i3, f7);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i17 = i14 + 1;
                    i11 = i16 + 1;
                    i8 = i13;
                    i = i17;
                    length = i12;
                    length2 = i15;
                }
                i8++;
                i = i;
                length = length;
            }
        }
        return arrangement;
    }

    private void fit(float f7, float f10, float f11, float f12) {
        float f13;
        float space = f7 - getSpace();
        int i = this.smallCount;
        if (i > 0 && space > 0.0f) {
            float f14 = this.smallSize;
            this.smallSize = Math.min(space / i, f11 - f14) + f14;
        } else if (i > 0 && space < 0.0f) {
            float f15 = this.smallSize;
            this.smallSize = Math.max(space / i, f10 - f15) + f15;
        }
        int i3 = this.smallCount;
        if (i3 > 0) {
            f13 = this.smallSize;
        } else {
            f13 = 0.0f;
        }
        this.smallSize = f13;
        float calculateLargeSize = calculateLargeSize(f7, i3, f13, this.mediumCount, this.largeCount);
        this.largeSize = calculateLargeSize;
        float f16 = (this.smallSize + calculateLargeSize) / 2.0f;
        this.mediumSize = f16;
        int i8 = this.mediumCount;
        if (i8 > 0 && calculateLargeSize != f12) {
            float f17 = (f12 - calculateLargeSize) * this.largeCount;
            float min = Math.min(Math.abs(f17), f16 * 0.1f * i8);
            float f18 = this.mediumSize;
            if (f17 > 0.0f) {
                this.mediumSize = f18 - (min / this.mediumCount);
                this.largeSize = (min / this.largeCount) + this.largeSize;
            } else {
                this.mediumSize = (min / this.mediumCount) + f18;
                this.largeSize -= min / this.largeCount;
            }
        }
    }

    private float getSpace() {
        return (this.smallSize * this.smallCount) + (this.mediumSize * this.mediumCount) + (this.largeSize * this.largeCount);
    }

    private boolean isValid() {
        int i = this.largeCount;
        if (i > 0 && this.smallCount > 0 && this.mediumCount > 0) {
            float f7 = this.largeSize;
            float f10 = this.mediumSize;
            if (f7 <= f10 || f10 <= this.smallSize) {
                return false;
            }
            return true;
        }
        if (i > 0 && this.smallCount > 0 && this.largeSize <= this.smallSize) {
            return false;
        }
        return true;
    }

    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Arrangement [priority=");
        sb.append(this.priority);
        sb.append(", smallCount=");
        sb.append(this.smallCount);
        sb.append(", smallSize=");
        sb.append(this.smallSize);
        sb.append(", mediumCount=");
        sb.append(this.mediumCount);
        sb.append(", mediumSize=");
        sb.append(this.mediumSize);
        sb.append(", largeCount=");
        sb.append(this.largeCount);
        sb.append(", largeSize=");
        sb.append(this.largeSize);
        sb.append(", cost=");
        return x.p(sb, "]", this.cost);
    }
}
