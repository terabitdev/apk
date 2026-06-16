package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i) {
        boolean z10;
        double[] dArr;
        double[] dArr2;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr3 = new double[iArr.length];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i3 = 0;
        int i8 = 0;
        while (true) {
            z10 = true;
            if (i3 >= iArr.length) {
                break;
            }
            int i10 = iArr[i3];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i10));
            if (num == null) {
                dArr3[i8] = pointProviderLab.fromInt(i10);
                iArr3[i8] = i10;
                i8++;
                linkedHashMap.put(Integer.valueOf(i10), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
            }
            i3++;
        }
        int[] iArr4 = new int[i8];
        for (int i11 = 0; i11 < i8; i11++) {
            iArr4[i11] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i11]))).intValue();
        }
        int min = Math.min(i, i8);
        if (iArr2.length != 0) {
            min = Math.min(min, iArr2.length);
        }
        double[][] dArr4 = new double[min];
        int i12 = 0;
        for (int i13 = 0; i13 < iArr2.length; i13++) {
            dArr4[i13] = pointProviderLab.fromInt(iArr2[i13]);
            i12++;
        }
        int i14 = min - i12;
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
            }
        }
        int[] iArr5 = new int[i8];
        for (int i16 = 0; i16 < i8; i16++) {
            iArr5[i16] = random.nextInt(min);
        }
        int[][] iArr6 = new int[min];
        for (int i17 = 0; i17 < min; i17++) {
            iArr6[i17] = new int[min];
        }
        Distance[][] distanceArr = new Distance[min];
        for (int i18 = 0; i18 < min; i18++) {
            distanceArr[i18] = new Distance[min];
            for (int i19 = 0; i19 < min; i19++) {
                distanceArr[i18][i19] = new Distance();
            }
        }
        int[] iArr7 = new int[min];
        int i20 = 0;
        while (i20 < 10) {
            int i21 = 0;
            while (i21 < min) {
                int i22 = i21 + 1;
                int i23 = i22;
                while (i23 < min) {
                    int[] iArr8 = iArr4;
                    double distance = pointProviderLab.distance(dArr4[i21], dArr4[i23]);
                    Distance distance2 = distanceArr[i23][i21];
                    distance2.distance = distance;
                    distance2.index = i21;
                    Distance distance3 = distanceArr[i21][i23];
                    distance3.distance = distance;
                    distance3.index = i23;
                    i23++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    z10 = z10;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                boolean z11 = z10;
                Arrays.sort(distanceArr[i21]);
                for (int i24 = 0; i24 < min; i24++) {
                    iArr6[i21][i24] = distanceArr[i21][i24].index;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i21 = i22;
                z10 = z11;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            boolean z12 = z10;
            int i25 = 0;
            int i26 = 0;
            while (i25 < i8) {
                double[] dArr5 = dArr3[i25];
                int i27 = iArr12[i25];
                double distance4 = pointProviderLab.distance(dArr5, dArr4[i27]);
                int i28 = i25;
                double d10 = distance4;
                int i29 = -1;
                int i30 = 0;
                while (i30 < min) {
                    int i31 = i26;
                    int[][] iArr13 = iArr6;
                    if (distanceArr[i27][i30].distance < 4.0d * distance4) {
                        double distance5 = pointProviderLab.distance(dArr5, dArr4[i30]);
                        if (distance5 < d10) {
                            d10 = distance5;
                            i29 = i30;
                        }
                    }
                    i30++;
                    iArr6 = iArr13;
                    i26 = i31;
                }
                int i32 = i26;
                int[][] iArr14 = iArr6;
                if (i29 != -1 && Math.abs(Math.sqrt(d10) - Math.sqrt(distance4)) > 3.0d) {
                    i26 = i32 + 1;
                    iArr12[i28] = i29;
                } else {
                    i26 = i32;
                }
                i25 = i28 + 1;
                iArr6 = iArr14;
            }
            int[][] iArr15 = iArr6;
            if (i26 == 0 && i20 != 0) {
                break;
            }
            double[] dArr6 = new double[min];
            double[] dArr7 = new double[min];
            double[] dArr8 = new double[min];
            boolean z13 = false;
            Arrays.fill(iArr7, 0);
            int i33 = 0;
            while (i33 < i8) {
                int i34 = iArr12[i33];
                double[] dArr9 = dArr3[i33];
                boolean z14 = z13;
                int i35 = iArr11[i33];
                iArr7[i34] = iArr7[i34] + i35;
                double d11 = i35;
                dArr6[i34] = (dArr9[z14 ? 1 : 0] * d11) + dArr6[i34];
                dArr7[i34] = (dArr9[z12 ? 1 : 0] * d11) + dArr7[i34];
                dArr8[i34] = (dArr9[2] * d11) + dArr8[i34];
                i33++;
                z13 = false;
            }
            int i36 = 0;
            while (i36 < min) {
                int i37 = iArr7[i36];
                if (i37 == 0) {
                    dArr4[i36] = new double[]{0.0d, 0.0d, 0.0d};
                    dArr = dArr6;
                    dArr2 = dArr7;
                } else {
                    double d12 = dArr6[i36];
                    dArr = dArr6;
                    dArr2 = dArr7;
                    double d13 = i37;
                    double d14 = d12 / d13;
                    double d15 = dArr2[i36] / d13;
                    double d16 = dArr8[i36] / d13;
                    double[] dArr10 = dArr4[i36];
                    dArr10[0] = d14;
                    dArr10[z12 ? 1 : 0] = d15;
                    dArr10[2] = d16;
                }
                i36++;
                dArr6 = dArr;
                dArr7 = dArr2;
            }
            i20++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            z10 = z12 ? 1 : 0;
            iArr6 = iArr15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i38 = 0; i38 < min; i38++) {
            int i39 = iArr7[i38];
            if (i39 != 0) {
                int i40 = pointProviderLab.toInt(dArr4[i38]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i40))) {
                    linkedHashMap2.put(Integer.valueOf(i40), Integer.valueOf(i39));
                }
            }
        }
        return linkedHashMap2;
    }
}
