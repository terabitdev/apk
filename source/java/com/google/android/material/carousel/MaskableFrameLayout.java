package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import androidx.core.view.inputmethod.b;
import b.d;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.ShapeableDelegate;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class MaskableFrameLayout extends FrameLayout implements Maskable, Shapeable {
    private static final int NOT_SET = -1;

    @Nullable
    private View.OnHoverListener hoverListener;
    private boolean isHovered;
    private final RectF maskRect;
    private float maskXPercentage;

    @Nullable
    private OnMaskChangedListener onMaskChangedListener;

    @Nullable
    private Boolean savedForceCompatClippingEnabled;
    private final Rect screenBoundsRect;

    @NonNull
    private ShapeAppearanceModel shapeAppearanceModel;
    private final ShapeableDelegate shapeableDelegate;

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maskXPercentage = -1.0f;
        this.maskRect = new RectF();
        this.screenBoundsRect = new Rect();
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.savedForceCompatClippingEnabled = null;
        this.isHovered = false;
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i, 0, 0).build());
    }

    public static /* synthetic */ void b(MaskableFrameLayout maskableFrameLayout, Canvas canvas) {
        maskableFrameLayout.lambda$dispatchDraw$1(canvas);
    }

    public /* synthetic */ void lambda$dispatchDraw$1(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public static /* synthetic */ CornerSize lambda$setShapeAppearanceModel$0(CornerSize cornerSize) {
        if (cornerSize instanceof AbsoluteCornerSize) {
            return ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize) cornerSize);
        }
        return cornerSize;
    }

    private void onMaskChanged() {
        this.shapeableDelegate.onMaskChanged(this, this.maskRect);
        OnMaskChangedListener onMaskChangedListener = this.onMaskChangedListener;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(this.maskRect);
        }
    }

    private void updateMaskRectForMaskXPercentage() {
        if (this.maskXPercentage != -1.0f) {
            float lerp = AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.maskXPercentage);
            setMaskRectF(new RectF(lerp, 0.0f, getWidth() - lerp, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new b(this, 5));
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.maskRect;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // com.google.android.material.carousel.Maskable
    @NonNull
    public RectF getMaskRectF() {
        return this.maskRect;
    }

    @Override // com.google.android.material.carousel.Maskable
    @Deprecated
    public float getMaskXPercentage() {
        return this.maskXPercentage;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.savedForceCompatClippingEnabled;
        if (bool != null) {
            this.shapeableDelegate.setForceCompatClippingEnabled(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.savedForceCompatClippingEnabled = Boolean.valueOf(this.shapeableDelegate.isForceCompatClippingEnabled());
        this.shapeableDelegate.setForceCompatClippingEnabled(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.maskRect.isEmpty() && (action == 9 || action == 10 || action == 7)) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                if (this.isHovered && this.hoverListener != null) {
                    motionEvent.setAction(10);
                    this.hoverListener.onHover(this, motionEvent);
                }
                this.isHovered = false;
                return false;
            }
        }
        if (this.hoverListener != null) {
            if (!this.isHovered && action == 7) {
                motionEvent.setAction(9);
                this.isHovered = true;
            }
            if (action == 7 || action == 9) {
                this.isHovered = true;
            }
            this.hoverListener.onHover(this, motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.getBoundsInScreen(this.screenBoundsRect);
        if (getX() > 0.0f) {
            this.screenBoundsRect.left = (int) (r0.left + this.maskRect.left);
        }
        if (getY() > 0.0f) {
            this.screenBoundsRect.top = (int) (r0.top + this.maskRect.top);
        }
        Rect rect = this.screenBoundsRect;
        rect.right = Math.round(this.maskRect.width()) + rect.left;
        Rect rect2 = this.screenBoundsRect;
        rect2.bottom = Math.round(this.maskRect.height()) + rect2.top;
        accessibilityNodeInfo.setBoundsInScreen(this.screenBoundsRect);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty()) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i8, int i10) {
        super.onSizeChanged(i, i3, i8, i10);
        if (this.maskXPercentage != -1.0f) {
            updateMaskRectForMaskXPercentage();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.maskRect.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.maskRect.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z10) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z10);
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setMaskRectF(@NonNull RectF rectF) {
        this.maskRect.set(rectF);
        onMaskChanged();
    }

    @Override // com.google.android.material.carousel.Maskable
    @Deprecated
    public void setMaskXPercentage(float f7) {
        float clamp = MathUtils.clamp(f7, 0.0f, 1.0f);
        if (this.maskXPercentage != clamp) {
            this.maskXPercentage = clamp;
            updateMaskRectForMaskXPercentage();
        }
    }

    @Override // android.view.View
    public void setOnHoverListener(@Nullable View.OnHoverListener onHoverListener) {
        this.hoverListener = onHoverListener;
    }

    @Override // com.google.android.material.carousel.Maskable
    public void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener) {
        this.onMaskChangedListener = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel withTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new d(7));
        this.shapeAppearanceModel = withTransformedCornerSizes;
        this.shapeableDelegate.onShapeAppearanceChanged(this, withTransformedCornerSizes);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@NonNull Context context) {
        this(context, null);
    }
}
