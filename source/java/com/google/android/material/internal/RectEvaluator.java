package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    public RectEvaluator(@NonNull Rect rect) {
        this.rect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f7, @NonNull Rect rect, @NonNull Rect rect2) {
        this.rect.set(rect.left + ((int) ((rect2.left - r0) * f7)), rect.top + ((int) ((rect2.top - r1) * f7)), rect.right + ((int) ((rect2.right - r2) * f7)), rect.bottom + ((int) ((rect2.bottom - r6) * f7)));
        return this.rect;
    }
}
