package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float f7) {
        this.radius = f7 - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f7, float f10, float f11, @NonNull ShapePath shapePath) {
        float sqrt = (float) ((Math.sqrt(2.0d) * this.radius) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(this.radius, 2.0d) - Math.pow(sqrt, 2.0d));
        shapePath.reset(f10 - sqrt, ((float) (-((Math.sqrt(2.0d) * this.radius) - this.radius))) + sqrt2);
        shapePath.lineTo(f10, (float) (-((Math.sqrt(2.0d) * this.radius) - this.radius)));
        shapePath.lineTo(f10 + sqrt, ((float) (-((Math.sqrt(2.0d) * this.radius) - this.radius))) + sqrt2);
    }
}
