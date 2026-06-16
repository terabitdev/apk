package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double d10, double d11, double d12, double d13) {
        this.low = d10;
        this.normal = d11;
        this.medium = d12;
        this.high = d13;
    }

    public double get(double d10) {
        if (d10 <= -1.0d) {
            return this.low;
        }
        if (d10 < 0.0d) {
            return MathUtils.lerp(this.low, this.normal, (d10 - (-1.0d)) / 1.0d);
        }
        if (d10 < 0.5d) {
            return MathUtils.lerp(this.normal, this.medium, (d10 - 0.0d) / 0.5d);
        }
        if (d10 < 1.0d) {
            return MathUtils.lerp(this.medium, this.high, (d10 - 0.5d) / 0.5d);
        }
        return this.high;
    }
}
