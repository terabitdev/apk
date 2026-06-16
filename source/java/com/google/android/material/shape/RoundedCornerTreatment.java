package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f7, float f10, float f11) {
        float f12 = f11 * f10;
        shapePath.reset(0.0f, f12, 180.0f, 180.0f - f7);
        float f13 = f12 * 2.0f;
        shapePath.addArc(0.0f, 0.0f, f13, f13, 180.0f, f7);
    }

    @Deprecated
    public RoundedCornerTreatment(float f7) {
        this.radius = f7;
    }
}
