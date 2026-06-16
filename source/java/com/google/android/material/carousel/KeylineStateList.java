package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List<KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List<KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.carousel.KeylineStateList$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType;

        static {
            int[] iArr = new int[CarouselStrategy.StrategyType.values().length];
            $SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType = iArr;
            try {
                iArr[CarouselStrategy.StrategyType.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private KeylineStateList(@NonNull KeylineState keylineState, List<KeylineState> list, List<KeylineState> list2) {
        this.defaultState = keylineState;
        this.startStateSteps = DesugarCollections.unmodifiableList(list);
        this.endStateSteps = DesugarCollections.unmodifiableList(list2);
        float f7 = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f7;
        float f10 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.endShiftRange = f10;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f7, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f10, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f7, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f7, fArr);
        if (stateStepsRange[0] >= 0.5f) {
            return list.get((int) stateStepsRange[2]);
        }
        return list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f7) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f7 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i = 0; i < keylineState.getKeylines().size(); i++) {
            if (!keylineState.getKeylines().get(i).isAnchor) {
                return i;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f7) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f7 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
                return firstFocalKeylineIndex;
            }
        }
        return 0;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            if (!keylineState.getKeylines().get(size).isAnchor) {
                return size;
            }
        }
        return -1;
    }

    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f7, float f10, float f11, CarouselStrategy.StrategyType strategyType) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f7, f10, strategyType), getStateStepsEnd(carousel, keylineState, f7, f11, strategyType));
    }

    private static float[] getStateStepInterpolationPoints(float f7, List<KeylineState> list, boolean z10) {
        float f10;
        float f11;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i = 1; i < size; i++) {
            int i3 = i - 1;
            KeylineState keylineState = list.get(i3);
            KeylineState keylineState2 = list.get(i);
            if (z10) {
                f10 = keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
            } else {
                f10 = keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc;
            }
            float f12 = f10 / f7;
            if (i == size - 1) {
                f11 = 1.0f;
            } else {
                f11 = fArr[i3] + f12;
            }
            fArr[i] = f11;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f7, float f10, CarouselStrategy.StrategyType strategyType) {
        int containerHeight;
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        } else {
            containerHeight = carousel.getContainerHeight();
        }
        int i3 = containerHeight;
        if (!isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) && findLastNonAnchorKeylineIndex != -1) {
            int lastFocalKeylineIndex = findLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f11 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, (f11 - keylineState.getLastFocalKeyline().cutoff) - f10, i3));
                return arrayList;
            }
            float f12 = 0.0f;
            int i8 = 0;
            while (i8 < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i10 = findLastNonAnchorKeylineIndex - i8;
                float f13 = f12 + keylineState.getKeylines().get(i10).cutoff;
                int i11 = i10 + 1;
                if (i11 < keylineState.getKeylines().size()) {
                    i = findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i11).mask) + 1;
                } else {
                    i = 0;
                }
                int i12 = i3;
                KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findLastNonAnchorKeylineIndex, i, f11 - f13, keylineState.getFirstFocalKeylineIndex() + i8 + 1, keylineState.getLastFocalKeylineIndex() + i8 + 1, i12);
                if (i8 == lastFocalKeylineIndex - 1 && f10 > 0.0f) {
                    moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f10, i12, false, f7, strategyType);
                    i12 = i12;
                }
                arrayList.add(moveKeylineAndCreateKeylineState);
                i8++;
                i3 = i12;
                f12 = f13;
            }
        } else if (f10 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f10, i3, false, f7, strategyType));
        }
        return arrayList;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f7, float[] fArr) {
        int size = list.size();
        float f10 = fArr[0];
        int i = 1;
        while (i < size) {
            float f11 = fArr[i];
            if (f7 <= f11) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f10, f11, f7), i - 1, i};
            }
            i++;
            f10 = f11;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f7, float f10, CarouselStrategy.StrategyType strategyType) {
        int containerHeight;
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        } else {
            containerHeight = carousel.getContainerHeight();
        }
        int i = containerHeight;
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && findFirstNonAnchorKeylineIndex != -1) {
            int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - findFirstNonAnchorKeylineIndex;
            float f11 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f11 + keylineState.getFirstFocalKeyline().cutoff + f10, i));
                return arrayList;
            }
            float f12 = 0.0f;
            for (int i3 = 0; i3 < firstFocalKeylineIndex; i3++) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i8 = findFirstNonAnchorKeylineIndex + i3;
                int size = keylineState.getKeylines().size() - 1;
                f12 += keylineState.getKeylines().get(i8).cutoff;
                int i10 = i8 - 1;
                if (i10 >= 0) {
                    size = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i10).mask) - 1;
                }
                int i11 = i;
                KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findFirstNonAnchorKeylineIndex, size, f11 + f12, (keylineState.getFirstFocalKeylineIndex() - i3) - 1, (keylineState.getLastFocalKeylineIndex() - i3) - 1, i11);
                i = i11;
                if (i3 == firstFocalKeylineIndex - 1 && f10 > 0.0f) {
                    moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f10, i, true, f7, strategyType);
                }
                arrayList.add(moveKeylineAndCreateKeylineState);
            }
        } else if (f10 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f10, i, true, f7, strategyType));
        }
        return arrayList;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        if (keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && keylineState.getFirstFocalKeyline() == keylineState.getFirstNonAnchorKeyline()) {
            return true;
        }
        return false;
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        if ((keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) + keylineState.getLastFocalKeyline().locOffset <= containerHeight && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline()) {
            return true;
        }
        return false;
    }

    private static KeylineState lerp(List<KeylineState> list, float f7, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f7, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i, int i3, float f7, int i8, int i10, int i11) {
        boolean z10;
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i3, (KeylineState.Keyline) arrayList.remove(i));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i11);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i12);
            float f10 = keyline.maskedItemSize;
            float f11 = (f10 / 2.0f) + f7;
            if (i12 >= i8 && i12 <= i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            builder.addKeyline(f11, keyline.mask, f10, z10, keyline.isAnchor, keyline.cutoff);
            f7 += keyline.maskedItemSize;
        }
        return builder.build();
    }

    @NonNull
    private static KeylineState shiftKeylineStateForPadding(@NonNull KeylineState keylineState, float f7, int i, boolean z10, float f10, CarouselStrategy.StrategyType strategyType) {
        if (AnonymousClass1.$SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType[strategyType.ordinal()] != 1) {
            return shiftKeylineStateForPaddingUncontained(keylineState, f7, i, z10);
        }
        return shiftKeylineStateForPaddingContained(keylineState, f7, i, z10, f10);
    }

    private static KeylineState shiftKeylineStateForPaddingContained(KeylineState keylineState, float f7, int i, boolean z10, float f10) {
        float f11;
        boolean z11;
        float f12;
        float f13;
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i);
        float numberOfNonAnchorKeylines = f7 / keylineState.getNumberOfNonAnchorKeylines();
        if (z10) {
            f11 = f7;
        } else {
            f11 = 0.0f;
        }
        float f14 = f11;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i3);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                if (i3 >= keylineState.getFirstFocalKeylineIndex() && i3 <= keylineState.getLastFocalKeylineIndex()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f15 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f15, keylineState.getItemSize(), f10);
                float f16 = (f15 / 2.0f) + f14;
                float abs = Math.abs(f16 - keyline.locOffset);
                float f17 = keyline.cutoff;
                if (z10) {
                    f12 = abs;
                } else {
                    f12 = 0.0f;
                }
                if (z10) {
                    f13 = 0.0f;
                } else {
                    f13 = abs;
                }
                builder.addKeyline(f16, childMaskPercentage, f15, z11, false, f17, f12, f13);
                f14 += f15;
            }
        }
        return builder.build();
    }

    @NonNull
    private static KeylineState shiftKeylineStateForPaddingUncontained(@NonNull KeylineState keylineState, float f7, int i, boolean z10) {
        int size;
        float f10;
        float f11;
        float f12;
        boolean z11;
        float min;
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i);
        boolean z12 = true;
        if (z10) {
            size = 0;
        } else {
            size = arrayList.size() - 1;
        }
        int i3 = 0;
        while (i3 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i3);
            if (keyline.isAnchor && i3 == size) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                float f13 = keyline.locOffset;
                if (z10) {
                    f10 = f13 + f7;
                } else {
                    f10 = f13 - f7;
                }
                if (z10) {
                    f11 = f7;
                } else {
                    f11 = 0.0f;
                }
                if (z10) {
                    f12 = 0.0f;
                } else {
                    f12 = f7;
                }
                if (i3 >= keylineState.getFirstFocalKeylineIndex() && i3 <= keylineState.getLastFocalKeylineIndex()) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                float f14 = f10;
                float f15 = keyline.mask;
                float f16 = keyline.maskedItemSize;
                boolean z13 = keyline.isAnchor;
                if (z10) {
                    min = Math.max(0.0f, ((f16 / 2.0f) + f14) - i);
                } else {
                    min = Math.min(0.0f, f14 - (f16 / 2.0f));
                }
                builder.addKeyline(f14, f15, f16, z11, z13, Math.abs(min), f11, f12);
            }
            i3++;
            z12 = true;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f7, int i) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f7, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), i);
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getEndState() {
        return this.endStateSteps.get(r0.size() - 1);
    }

    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int i, int i3, int i8, boolean z10) {
        int i10;
        int i11;
        int i12;
        float itemSize = this.defaultState.getItemSize();
        HashMap hashMap = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = -1;
            if (i13 >= i) {
                break;
            }
            if (z10) {
                i12 = (i - i13) - 1;
            } else {
                i12 = i13;
            }
            float f7 = i12 * itemSize;
            if (!z10) {
                i15 = 1;
            }
            if (f7 * i15 > i8 - this.endShiftRange || i13 >= i - this.endStateSteps.size()) {
                Integer valueOf = Integer.valueOf(i12);
                List<KeylineState> list = this.endStateSteps;
                hashMap.put(valueOf, list.get(MathUtils.clamp(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i - 1; i17 >= 0; i17--) {
            if (z10) {
                i10 = (i - i17) - 1;
            } else {
                i10 = i17;
            }
            float f10 = i10 * itemSize;
            if (z10) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            if (f10 * i11 < i3 + this.startShiftRange || i17 < this.startStateSteps.size()) {
                Integer valueOf2 = Integer.valueOf(i10);
                List<KeylineState> list2 = this.startStateSteps;
                hashMap.put(valueOf2, list2.get(MathUtils.clamp(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return hashMap;
    }

    public KeylineState getShiftedState(float f7, float f10, float f11, boolean z10) {
        float lerp;
        List<KeylineState> list;
        float[] fArr;
        float f12 = this.startShiftRange + f10;
        float f13 = f11 - this.endShiftRange;
        float f14 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f15 = getEndState().getFirstFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f14) {
            f12 += f14;
        }
        if (this.endShiftRange == f15) {
            f13 -= f15;
        }
        if (f7 < f12) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, f10, f12, f7);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else if (f7 > f13) {
            lerp = AnimationUtils.lerp(0.0f, 1.0f, f13, f11, f7);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        } else {
            return this.defaultState;
        }
        if (z10) {
            return closestStateStepFromInterpolation(list, lerp, fArr);
        }
        return lerp(list, lerp, fArr);
    }

    public KeylineState getStartState() {
        return this.startStateSteps.get(r0.size() - 1);
    }

    @NonNull
    public KeylineState getShiftedState(float f7, float f10, float f11) {
        return getShiftedState(f7, f10, f11, false);
    }
}
