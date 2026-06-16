package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class FadeThroughDrawable extends Drawable {
    private final float[] alphas;
    private final Drawable fadeInDrawable;
    private final Drawable fadeOutDrawable;
    private float progress;

    public FadeThroughDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        Drawable emptyDrawable;
        Drawable emptyDrawable2;
        int i;
        if (drawable != null) {
            emptyDrawable = drawable.getConstantState().newDrawable().mutate();
        } else {
            emptyDrawable = new EmptyDrawable();
        }
        this.fadeOutDrawable = emptyDrawable;
        if (drawable2 != null) {
            emptyDrawable2 = drawable2.getConstantState().newDrawable().mutate();
        } else {
            emptyDrawable2 = new EmptyDrawable();
        }
        this.fadeInDrawable = emptyDrawable2;
        if (drawable != null) {
            i = DrawableCompat.getLayoutDirection(drawable);
        } else {
            i = 3;
        }
        int layoutDirection = drawable2 != null ? DrawableCompat.getLayoutDirection(drawable2) : 3;
        DrawableCompat.setLayoutDirection(emptyDrawable, i);
        DrawableCompat.setLayoutDirection(emptyDrawable2, layoutDirection);
        emptyDrawable2.setAlpha(0);
        this.alphas = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.fadeOutDrawable.draw(canvas);
        this.fadeInDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.fadeOutDrawable.getIntrinsicHeight(), this.fadeInDrawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.fadeOutDrawable.getIntrinsicWidth(), this.fadeInDrawable.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.fadeOutDrawable.getMinimumHeight(), this.fadeInDrawable.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.fadeOutDrawable.getMinimumWidth(), this.fadeInDrawable.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.fadeOutDrawable.isStateful() && !this.fadeInDrawable.isStateful()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        float f7 = this.progress;
        Drawable drawable = this.fadeOutDrawable;
        if (f7 <= 0.5f) {
            drawable.setAlpha(i);
            this.fadeInDrawable.setAlpha(0);
        } else {
            drawable.setAlpha(0);
            this.fadeInDrawable.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i3, int i8, int i10) {
        super.setBounds(i, i3, i8, i10);
        this.fadeOutDrawable.setBounds(i, i3, i8, i10);
        this.fadeInDrawable.setBounds(i, i3, i8, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.fadeOutDrawable.setColorFilter(colorFilter);
        this.fadeInDrawable.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f7) {
        if (this.progress != f7) {
            this.progress = f7;
            FadeThroughUtils.calculateFadeOutAndInAlphas(f7, this.alphas);
            this.fadeOutDrawable.setAlpha((int) (this.alphas[0] * 255.0f));
            this.fadeInDrawable.setAlpha((int) (this.alphas[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.fadeOutDrawable.setState(iArr);
        boolean state2 = this.fadeInDrawable.setState(iArr);
        if (!state && !state2) {
            return false;
        }
        return true;
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class EmptyDrawable extends Drawable {
        private EmptyDrawable() {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }
}
