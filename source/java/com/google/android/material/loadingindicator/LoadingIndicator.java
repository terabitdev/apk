package com.google.android.material.loadingindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Arrays;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {
    static final int DEF_STYLE_RES = R.style.Widget_Material3_LoadingIndicator;

    @NonNull
    private final LoadingIndicatorDrawable drawable;

    @NonNull
    private final LoadingIndicatorSpec specs;

    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        Context context2 = getContext();
        LoadingIndicatorDrawable create = LoadingIndicatorDrawable.create(context2, new LoadingIndicatorSpec(context2, attributeSet, i));
        this.drawable = create;
        create.setCallback(this);
        this.specs = create.getDrawingDelegate().specs;
        setAnimatorDurationScaleProvider(new AnimatorDurationScaleProvider());
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    @ColorInt
    public int getContainerColor() {
        return this.specs.containerColor;
    }

    @Px
    public int getContainerHeight() {
        return this.specs.containerHeight;
    }

    @Px
    public int getContainerWidth() {
        return this.specs.containerWidth;
    }

    @NonNull
    public LoadingIndicatorDrawable getDrawable() {
        return this.drawable;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.specs.indicatorColors;
    }

    @Px
    public int getIndicatorSize() {
        return this.specs.indicatorSize;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidate();
    }

    public boolean isEffectivelyVisible() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingRight() + getPaddingLeft()), getHeight() - (getPaddingBottom() + getPaddingTop()));
        }
        this.drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i3);
        LoadingIndicatorDrawingDelegate drawingDelegate = this.drawable.getDrawingDelegate();
        int paddingRight = getPaddingRight() + getPaddingLeft() + drawingDelegate.getPreferredWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + drawingDelegate.getPreferredHeight();
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(size, paddingRight), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, paddingBottom), 1073741824);
        } else if (mode2 == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        super.onMeasure(i, i3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i8, int i10) {
        super.onSizeChanged(i, i3, i8, i10);
        this.drawable.setBounds(0, 0, i, i3);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        boolean z10;
        super.onVisibilityChanged(view, i);
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        boolean visibleToUser = visibleToUser();
        if (i == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        loadingIndicatorDrawable.setVisible(visibleToUser, false, z10);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        boolean z10;
        super.onWindowVisibilityChanged(i);
        LoadingIndicatorDrawable loadingIndicatorDrawable = this.drawable;
        boolean visibleToUser = visibleToUser();
        if (i == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        loadingIndicatorDrawable.setVisible(visibleToUser, false, z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.drawable.animatorDurationScaleProvider = animatorDurationScaleProvider;
    }

    public void setContainerColor(@ColorInt int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerColor != i) {
            loadingIndicatorSpec.containerColor = i;
            invalidate();
        }
    }

    public void setContainerHeight(@Px int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerHeight != i) {
            loadingIndicatorSpec.containerHeight = i;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(@Px int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.containerWidth != i) {
            loadingIndicatorSpec.containerWidth = i;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), androidx.appcompat.R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.specs.indicatorColors = iArr;
            this.drawable.getAnimatorDelegate().invalidateSpecValues();
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        if (loadingIndicatorSpec.indicatorSize != i) {
            loadingIndicatorSpec.indicatorSize = i;
            requestLayout();
            invalidate();
        }
    }

    public boolean visibleToUser() {
        if (isAttachedToWindow() && getWindowVisibility() == 0 && isEffectivelyVisible()) {
            return true;
        }
        return false;
    }

    public LoadingIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.loadingIndicatorStyle);
    }

    public LoadingIndicator(@NonNull Context context) {
        this(context, null);
    }
}
