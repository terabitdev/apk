package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    public TriangleEdgeTreatment(float f7, boolean z10) {
        this.size = f7;
        this.inside = z10;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f7, float f10, float f11, @NonNull ShapePath shapePath) {
        boolean z10 = this.inside;
        float f12 = this.size;
        if (z10) {
            shapePath.lineTo(f10 - (f12 * f11), 0.0f);
            float f13 = this.size;
            shapePath.lineTo(f10, f13 * f11, (f13 * f11) + f10, 0.0f);
            shapePath.lineTo(f7, 0.0f);
            return;
        }
        shapePath.lineTo(f10 - (f12 * f11), 0.0f, f10, (-f12) * f11);
        shapePath.lineTo((this.size * f11) + f10, 0.0f, f7, 0.0f);
    }
}
