package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static final class Box {

        /* renamed from: b0, reason: collision with root package name */
        int f4094b0;

        /* renamed from: b1, reason: collision with root package name */
        int f4095b1;

        /* renamed from: g0, reason: collision with root package name */
        int f4096g0;

        /* renamed from: g1, reason: collision with root package name */
        int f4097g1;

        /* renamed from: r0, reason: collision with root package name */
        int f4098r0;

        /* renamed from: r1, reason: collision with root package name */
        int f4099r1;
        int vol;

        private Box() {
            this.f4098r0 = 0;
            this.f4099r1 = 0;
            this.f4096g0 = 0;
            this.f4097g1 = 0;
            this.f4094b0 = 0;
            this.f4095b1 = 0;
            this.vol = 0;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i, int i3) {
            this.resultCount = i3;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i, double d10) {
            this.cutLocation = i;
            this.maximum = d10;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i;
        int i3;
        int ordinal = direction.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = (-iArr[getIndex(box.f4099r1, box.f4097g1, box.f4094b0)]) + iArr[getIndex(box.f4099r1, box.f4096g0, box.f4094b0)] + iArr[getIndex(box.f4098r0, box.f4097g1, box.f4094b0)];
                    i3 = iArr[getIndex(box.f4098r0, box.f4096g0, box.f4094b0)];
                } else {
                    b.d.k(direction, "unexpected direction ");
                    return 0;
                }
            } else {
                i = (-iArr[getIndex(box.f4099r1, box.f4096g0, box.f4095b1)]) + iArr[getIndex(box.f4099r1, box.f4096g0, box.f4094b0)] + iArr[getIndex(box.f4098r0, box.f4096g0, box.f4095b1)];
                i3 = iArr[getIndex(box.f4098r0, box.f4096g0, box.f4094b0)];
            }
        } else {
            i = (-iArr[getIndex(box.f4098r0, box.f4097g1, box.f4095b1)]) + iArr[getIndex(box.f4098r0, box.f4097g1, box.f4094b0)] + iArr[getIndex(box.f4098r0, box.f4096g0, box.f4095b1)];
            i3 = iArr[getIndex(box.f4098r0, box.f4096g0, box.f4094b0)];
        }
        return i - i3;
    }

    public static int getIndex(int i, int i3, int i8) {
        return (i << 10) + (i << 6) + i + (i3 << 5) + i3 + i8;
    }

    public static int top(Box box, Direction direction, int i, int[] iArr) {
        int i3;
        int i8;
        int ordinal = direction.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i3 = (iArr[getIndex(box.f4099r1, box.f4097g1, i)] - iArr[getIndex(box.f4099r1, box.f4096g0, i)]) - iArr[getIndex(box.f4098r0, box.f4097g1, i)];
                    i8 = iArr[getIndex(box.f4098r0, box.f4096g0, i)];
                } else {
                    b.d.k(direction, "unexpected direction ");
                    return 0;
                }
            } else {
                i3 = (iArr[getIndex(box.f4099r1, i, box.f4095b1)] - iArr[getIndex(box.f4099r1, i, box.f4094b0)]) - iArr[getIndex(box.f4098r0, i, box.f4095b1)];
                i8 = iArr[getIndex(box.f4098r0, i, box.f4094b0)];
            }
        } else {
            i3 = (iArr[getIndex(i, box.f4097g1, box.f4095b1)] - iArr[getIndex(i, box.f4097g1, box.f4094b0)]) - iArr[getIndex(i, box.f4096g0, box.f4095b1)];
            i8 = iArr[getIndex(i, box.f4096g0, box.f4094b0)];
        }
        return i3 + i8;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f4099r1, box.f4097g1, box.f4095b1)] - iArr[getIndex(box.f4099r1, box.f4097g1, box.f4094b0)]) - iArr[getIndex(box.f4099r1, box.f4096g0, box.f4095b1)]) + iArr[getIndex(box.f4099r1, box.f4096g0, box.f4094b0)]) - iArr[getIndex(box.f4098r0, box.f4097g1, box.f4095b1)]) + iArr[getIndex(box.f4098r0, box.f4097g1, box.f4094b0)]) + iArr[getIndex(box.f4098r0, box.f4096g0, box.f4095b1)]) - iArr[getIndex(box.f4098r0, box.f4096g0, box.f4094b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int redFromArgb = ColorUtils.redFromArgb(intValue);
            int greenFromArgb = ColorUtils.greenFromArgb(intValue);
            int blueFromArgb = ColorUtils.blueFromArgb(intValue);
            int index = getIndex((redFromArgb >> 3) + 1, (greenFromArgb >> 3) + 1, (blueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + intValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = (redFromArgb * intValue2) + iArr2[index];
            int[] iArr3 = this.momentsG;
            iArr3[index] = (greenFromArgb * intValue2) + iArr3[index];
            int[] iArr4 = this.momentsB;
            iArr4[index] = (blueFromArgb * intValue2) + iArr4[index];
            double[] dArr = this.moments;
            int i = blueFromArgb * blueFromArgb;
            dArr[index] = dArr[index] + ((i + (greenFromArgb * greenFromArgb) + (redFromArgb * redFromArgb)) * intValue2);
        }
    }

    public CreateBoxesResult createBoxes(int i) {
        int i3;
        double d10;
        double d11;
        this.cubes = new Box[i];
        for (int i8 = 0; i8 < i; i8++) {
            this.cubes[i8] = new Box();
        }
        double[] dArr = new double[i];
        Box box = this.cubes[0];
        box.f4099r1 = 32;
        box.f4097g1 = 32;
        box.f4095b1 = 32;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            if (i11 < i) {
                Box[] boxArr = this.cubes;
                if (cut(boxArr[i10], boxArr[i11]).booleanValue()) {
                    Box box2 = this.cubes[i10];
                    if (box2.vol > 1) {
                        d10 = variance(box2);
                    } else {
                        d10 = 0.0d;
                    }
                    dArr[i10] = d10;
                    Box box3 = this.cubes[i11];
                    if (box3.vol > 1) {
                        d11 = variance(box3);
                    } else {
                        d11 = 0.0d;
                    }
                    dArr[i11] = d11;
                } else {
                    dArr[i10] = 0.0d;
                    i11--;
                }
                double d12 = dArr[0];
                int i12 = 0;
                for (int i13 = 1; i13 <= i11; i13++) {
                    double d13 = dArr[i13];
                    if (d13 > d12) {
                        i12 = i13;
                        d12 = d13;
                    }
                }
                if (d12 <= 0.0d) {
                    i3 = i11 + 1;
                    break;
                }
                i11++;
                i10 = i12;
            } else {
                i3 = i;
                break;
            }
        }
        return new CreateBoxesResult(i, i3);
    }

    public void createMoments() {
        int i = 1;
        while (true) {
            int i3 = 33;
            if (i < 33) {
                int[] iArr = new int[33];
                int[] iArr2 = new int[33];
                int[] iArr3 = new int[33];
                int[] iArr4 = new int[33];
                double[] dArr = new double[33];
                int i8 = 1;
                while (i8 < i3) {
                    int i10 = 0;
                    int i11 = 0;
                    double d10 = 0.0d;
                    int i12 = 1;
                    int i13 = 0;
                    int i14 = 0;
                    while (i12 < i3) {
                        int index = getIndex(i, i8, i12);
                        i10 += this.weights[index];
                        i13 += this.momentsR[index];
                        i14 += this.momentsG[index];
                        i11 += this.momentsB[index];
                        d10 += this.moments[index];
                        iArr[i12] = iArr[i12] + i10;
                        iArr2[i12] = iArr2[i12] + i13;
                        iArr3[i12] = iArr3[i12] + i14;
                        iArr4[i12] = iArr4[i12] + i11;
                        dArr[i12] = dArr[i12] + d10;
                        int index2 = getIndex(i - 1, i8, i12);
                        int i15 = i12;
                        int[] iArr5 = this.weights;
                        iArr5[index] = iArr5[index2] + iArr[i15];
                        int[] iArr6 = this.momentsR;
                        iArr6[index] = iArr6[index2] + iArr2[i15];
                        int[] iArr7 = this.momentsG;
                        iArr7[index] = iArr7[index2] + iArr3[i15];
                        int[] iArr8 = this.momentsB;
                        iArr8[index] = iArr8[index2] + iArr4[i15];
                        double[] dArr2 = this.moments;
                        dArr2[index] = dArr2[index2] + dArr[i15];
                        i12 = i15 + 1;
                        i3 = 33;
                    }
                    i8++;
                    i3 = 33;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public List<Integer> createResult(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i; i3++) {
            Box box = this.cubes[i3];
            int volume = volume(box, this.weights);
            if (volume > 0) {
                int volume2 = volume(box, this.momentsR) / volume;
                int volume3 = volume(box, this.momentsG) / volume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / volume) & 255) | ((volume2 & 255) << 16) | (-16777216) | ((volume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        int volume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximize = maximize(box, direction, box.f4098r0 + 1, box.f4099r1, volume, volume2, volume3, volume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximize2 = maximize(box, direction2, box.f4096g0 + 1, box.f4097g1, volume, volume2, volume3, volume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximize3 = maximize(box, direction3, box.f4094b0 + 1, box.f4095b1, volume, volume2, volume3, volume4);
        double d10 = maximize.maximum;
        double d11 = maximize2.maximum;
        double d12 = maximize3.maximum;
        if (d10 >= d11 && d10 >= d12) {
            if (maximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        } else if (d11 >= d10 && d11 >= d12) {
            direction3 = direction2;
        }
        box2.f4099r1 = box.f4099r1;
        box2.f4097g1 = box.f4097g1;
        box2.f4095b1 = box.f4095b1;
        int ordinal = direction3.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    int i = maximize3.cutLocation;
                    box.f4095b1 = i;
                    box2.f4098r0 = box.f4098r0;
                    box2.f4096g0 = box.f4096g0;
                    box2.f4094b0 = i;
                }
            } else {
                int i3 = maximize2.cutLocation;
                box.f4097g1 = i3;
                box2.f4098r0 = box.f4098r0;
                box2.f4096g0 = i3;
                box2.f4094b0 = box.f4094b0;
            }
        } else {
            int i8 = maximize.cutLocation;
            box.f4099r1 = i8;
            box2.f4098r0 = i8;
            box2.f4096g0 = box.f4096g0;
            box2.f4094b0 = box.f4094b0;
        }
        box.vol = (box.f4095b1 - box.f4094b0) * (box.f4097g1 - box.f4096g0) * (box.f4099r1 - box.f4098r0);
        box2.vol = (box2.f4095b1 - box2.f4094b0) * (box2.f4097g1 - box2.f4096g0) * (box2.f4099r1 - box2.f4098r0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i, int i3, int i8, int i10, int i11, int i12) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int bottom = bottom(box2, direction, quantizerWu.momentsR);
        int bottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int bottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int bottom4 = bottom(box2, direction, quantizerWu.weights);
        int i13 = -1;
        double d10 = 0.0d;
        int i14 = i;
        while (i14 < i3) {
            int pVar = top(box2, direction, i14, quantizerWu.momentsR) + bottom;
            int pVar2 = top(box2, direction, i14, quantizerWu.momentsG) + bottom2;
            int pVar3 = top(box2, direction, i14, quantizerWu.momentsB) + bottom3;
            int pVar4 = top(box2, direction, i14, quantizerWu.weights) + bottom4;
            if (pVar4 != 0) {
                double d11 = ((pVar3 * pVar3) + ((pVar2 * pVar2) + (pVar * pVar))) / pVar4;
                int i15 = i8 - pVar;
                int i16 = i10 - pVar2;
                int i17 = i11 - pVar3;
                int i18 = i12 - pVar4;
                if (i18 != 0) {
                    int i19 = i17 * i17;
                    double d12 = ((i19 + ((i16 * i16) + (i15 * i15))) / i18) + d11;
                    if (d12 > d10) {
                        i13 = i14;
                        d10 = d12;
                    }
                }
            }
            i14++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i13, d10);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i) {
        constructHistogram(new QuantizerMap().quantize(iArr, i).colorToCount);
        createMoments();
        List<Integer> createResult = createResult(createBoxes(i).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : createResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int volume = volume(box, this.momentsR);
        int volume2 = volume(box, this.momentsG);
        int volume3 = volume(box, this.momentsB);
        int i = volume3 * volume3;
        return (((((((this.moments[getIndex(box.f4099r1, box.f4097g1, box.f4095b1)] - this.moments[getIndex(box.f4099r1, box.f4097g1, box.f4094b0)]) - this.moments[getIndex(box.f4099r1, box.f4096g0, box.f4095b1)]) + this.moments[getIndex(box.f4099r1, box.f4096g0, box.f4094b0)]) - this.moments[getIndex(box.f4098r0, box.f4097g1, box.f4095b1)]) + this.moments[getIndex(box.f4098r0, box.f4097g1, box.f4094b0)]) + this.moments[getIndex(box.f4098r0, box.f4096g0, box.f4095b1)]) - this.moments[getIndex(box.f4098r0, box.f4096g0, box.f4094b0)]) - ((i + ((volume2 * volume2) + (volume * volume))) / volume(box, this.weights));
    }
}
