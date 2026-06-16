package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i, int i3, double d10) {
        Cam16 fromInt = Cam16.fromInt(i);
        Cam16 fromInt2 = Cam16.fromInt(i3);
        double jstar = fromInt.getJstar();
        double astar = fromInt.getAstar();
        double bstar = fromInt.getBstar();
        return Cam16.fromUcs(((fromInt2.getJstar() - jstar) * d10) + jstar, ((fromInt2.getAstar() - astar) * d10) + astar, ((fromInt2.getBstar() - bstar) * d10) + bstar).toInt();
    }

    public static int harmonize(int i, int i3) {
        Hct fromInt = Hct.fromInt(i);
        Hct fromInt2 = Hct.fromInt(i3);
        double min = Math.min(MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5d, 15.0d);
        return Hct.from(MathUtils.sanitizeDegreesDouble((MathUtils.rotationDirection(fromInt.getHue(), fromInt2.getHue()) * min) + fromInt.getHue()), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    public static int hctHue(int i, int i3, double d10) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i, i3, d10)).getHue(), Cam16.fromInt(i).getChroma(), ColorUtils.lstarFromArgb(i)).toInt();
    }
}
