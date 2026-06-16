package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    @Deprecated
    public void getEdgePath(float f7, float f10, @NonNull ShapePath shapePath) {
        getEdgePath(f7, f7 / 2.0f, f10, shapePath);
    }

    public void getEdgePath(float f7, float f10, float f11, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f7, 0.0f);
    }
}
