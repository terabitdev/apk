package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MaterialArcMotion extends PathMotion {
    private static PointF getControlPoint(float f7, float f10, float f11, float f12) {
        if (f10 > f12) {
            return new PointF(f11, f10);
        }
        return new PointF(f7, f12);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f7, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f7, f10);
        PointF controlPoint = getControlPoint(f7, f10, f11, f12);
        path.quadTo(controlPoint.x, controlPoint.y, f11, f12);
        return path;
    }
}
