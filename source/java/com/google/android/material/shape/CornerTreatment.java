package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class CornerTreatment {
    public void getCornerPath(@NonNull ShapePath shapePath, float f7, float f10, @NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        getCornerPath(shapePath, f7, f10, cornerSize.getCornerSize(rectF));
    }

    public void getCornerPath(@NonNull ShapePath shapePath, float f7, float f10, float f11) {
        getCornerPath(f7, f10, shapePath);
    }

    @Deprecated
    public void getCornerPath(float f7, float f10, @NonNull ShapePath shapePath) {
    }
}
