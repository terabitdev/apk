package com.uptodown.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.h;
import n4.a;
import p6.c;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class CropImageView extends AppCompatImageView {

    /* renamed from: a, reason: collision with root package name */
    public c f4509a;

    /* renamed from: b, reason: collision with root package name */
    public int f4510b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.f4510b = -1;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f8304a);
        obtainStyledAttributes.getClass();
        this.f4510b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        setScaleType(ImageView.ScaleType.MATRIX);
        if (getDrawable() != null) {
            this.f4509a = new c(this);
        }
    }

    public final int getCropType() {
        return this.f4510b;
    }

    public final void setCropType(int i) {
        this.f4510b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        if (r5 != 7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    @Override // android.widget.ImageView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean setFrame(int i, int i3, int i8, int i10) {
        boolean z10;
        float f7;
        float f10;
        boolean frame = super.setFrame(i, i3, i8, i10);
        if (!isInEditMode() && this.f4509a != null && getDrawable() != null) {
            c cVar = this.f4509a;
            cVar.getClass();
            CropImageView cropImageView = (CropImageView) cVar.f9394a;
            int width = (cropImageView.getWidth() - cropImageView.getPaddingLeft()) - cropImageView.getPaddingRight();
            int height = (cropImageView.getHeight() - cropImageView.getPaddingTop()) - cropImageView.getPaddingBottom();
            int cropType = cropImageView.getCropType();
            Drawable drawable = cropImageView.getDrawable();
            if (cropType != -1 && height > 0 && width > 0 && drawable != null) {
                Matrix imageMatrix = cropImageView.getImageMatrix();
                imageMatrix.getClass();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                float f11 = height;
                float intrinsicHeight = drawable.getIntrinsicHeight();
                float f12 = f11 / intrinsicHeight;
                float f13 = width;
                float f14 = intrinsicWidth;
                float f15 = f13 / f14;
                if (f15 > f12) {
                    f12 = f15;
                }
                imageMatrix.setScale(f12, f12);
                if (f15 > f12) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f16 = f14 * f12;
                if (!z10) {
                    if (cropType != 3 && cropType != 4 && cropType != 5) {
                        if (cropType == 6 || cropType == 7) {
                            f7 = (f13 - f16) / 2.0f;
                        }
                    } else {
                        f7 = f13 - f16;
                    }
                    float f17 = intrinsicHeight * f12;
                    if (z10) {
                        if (cropType != 1) {
                            if (cropType != 2) {
                                if (cropType != 4) {
                                    if (cropType != 5) {
                                    }
                                }
                            }
                            f10 = f11 - f17;
                            imageMatrix.postTranslate(f7, f10);
                            cropImageView.setImageMatrix(imageMatrix);
                        }
                        f10 = (f11 - f17) / 2.0f;
                        imageMatrix.postTranslate(f7, f10);
                        cropImageView.setImageMatrix(imageMatrix);
                    }
                    f10 = 0.0f;
                    imageMatrix.postTranslate(f7, f10);
                    cropImageView.setImageMatrix(imageMatrix);
                }
                f7 = 0.0f;
                float f172 = intrinsicHeight * f12;
                if (z10) {
                }
                f10 = 0.0f;
                imageMatrix.postTranslate(f7, f10);
                cropImageView.setImageMatrix(imageMatrix);
            }
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        bitmap.getClass();
        super.setImageBitmap(bitmap);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context) {
        super(context);
        context.getClass();
        this.f4510b = -1;
        a();
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i, int i3, h hVar) {
        this(context, attributeSet, (i3 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }
}
