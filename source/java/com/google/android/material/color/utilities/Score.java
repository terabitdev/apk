package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class ScoredHCT {
        public final Hct hct;
        public final double score;

        public ScoredHCT(Hct hct, double d10) {
            this.hct = hct;
            this.score = d10;
        }
    }

    private Score() {
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i, int i3, boolean z10) {
        double d10;
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d11 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Hct fromInt = Hct.fromInt(entry.getKey().intValue());
            arrayList.add(fromInt);
            int floor = (int) Math.floor(fromInt.getHue());
            int intValue = entry.getValue().intValue();
            iArr[floor] = iArr[floor] + intValue;
            d11 += intValue;
        }
        double[] dArr = new double[360];
        int i8 = 0;
        for (int i10 = 0; i10 < 360; i10++) {
            double d12 = iArr[i10] / d11;
            for (int i11 = i10 - 14; i11 < i10 + 16; i11++) {
                int sanitizeDegreesInt = MathUtils.sanitizeDegreesInt(i11);
                dArr[sanitizeDegreesInt] = dArr[sanitizeDegreesInt] + d12;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Hct hct = (Hct) obj;
            double d13 = dArr[MathUtils.sanitizeDegreesInt((int) Math.round(hct.getHue()))];
            if (!z10 || (hct.getChroma() >= CUTOFF_CHROMA && d13 > CUTOFF_EXCITED_PROPORTION)) {
                double d14 = d13 * 100.0d * WEIGHT_PROPORTION;
                if (hct.getChroma() < TARGET_CHROMA) {
                    d10 = WEIGHT_CHROMA_BELOW;
                } else {
                    d10 = WEIGHT_CHROMA_ABOVE;
                }
                arrayList2.add(new ScoredHCT(hct, ((hct.getChroma() - TARGET_CHROMA) * d10) + d14));
            }
        }
        Collections.sort(arrayList2, new ScoredComparator());
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 90; i13 >= 15; i13--) {
            arrayList3.clear();
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                Hct hct2 = ((ScoredHCT) obj2).hct;
                int size3 = arrayList3.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size3) {
                        Object obj3 = arrayList3.get(i15);
                        i15++;
                        if (MathUtils.differenceDegrees(hct2.getHue(), ((Hct) obj3).getHue()) < i13) {
                            break;
                        }
                    } else {
                        arrayList3.add(hct2);
                        break;
                    }
                }
                if (arrayList3.size() >= i) {
                    break;
                }
            }
            if (arrayList3.size() >= i) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i3));
            return arrayList4;
        }
        int size4 = arrayList3.size();
        while (i8 < size4) {
            Object obj4 = arrayList3.get(i8);
            i8++;
            arrayList4.add(Integer.valueOf(((Hct) obj4).toInt()));
        }
        return arrayList4;
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class ScoredComparator implements Comparator<ScoredHCT> {
        @Override // java.util.Comparator
        public int compare(ScoredHCT scoredHCT, ScoredHCT scoredHCT2) {
            return Double.compare(scoredHCT2.score, scoredHCT.score);
        }
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i) {
        return score(map, i, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i, int i3) {
        return score(map, i, i3, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        return score(map, 4, BLUE_500, true);
    }
}
