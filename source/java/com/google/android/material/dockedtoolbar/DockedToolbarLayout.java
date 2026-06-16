package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.TintTypedArray;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class DockedToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_DockedToolbar;
    private static final String TAG = "DockedToolbarLayout";
    private Boolean paddingBottomSystemWindowInsets;
    private Boolean paddingTopSystemWindowInsets;

    public DockedToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i3) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i3), attributeSet, i);
        Context context2 = getContext();
        TintTypedArray obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.DockedToolbar, i, i3, new int[0]);
        if (obtainTintedStyledAttributes.hasValue(R.styleable.DockedToolbar_backgroundTint)) {
            int color = obtainTintedStyledAttributes.getColor(R.styleable.DockedToolbar_backgroundTint, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i3).build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.DockedToolbar_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(obtainTintedStyledAttributes.getBoolean(R.styleable.DockedToolbar_paddingTopSystemWindowInsets, true));
        }
        if (obtainTintedStyledAttributes.hasValue(R.styleable.DockedToolbar_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(obtainTintedStyledAttributes.getBoolean(R.styleable.DockedToolbar_paddingBottomSystemWindowInsets, true));
        }
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.dockedtoolbar.DockedToolbarLayout.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
                int i8;
                int i10;
                if (DockedToolbarLayout.this.paddingTopSystemWindowInsets != null && DockedToolbarLayout.this.paddingBottomSystemWindowInsets != null && !DockedToolbarLayout.this.paddingTopSystemWindowInsets.booleanValue() && !DockedToolbarLayout.this.paddingBottomSystemWindowInsets.booleanValue()) {
                    return windowInsetsCompat;
                }
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.ime());
                int i11 = insets.bottom;
                int i12 = insets.top;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (DockedToolbarLayout.this.hasGravity(layoutParams, 48) && DockedToolbarLayout.this.paddingTopSystemWindowInsets == null && DockedToolbarLayout.this.getFitsSystemWindows()) {
                    i8 = i12;
                } else {
                    i8 = 0;
                }
                if (DockedToolbarLayout.this.hasGravity(layoutParams, 80) && DockedToolbarLayout.this.paddingBottomSystemWindowInsets == null && DockedToolbarLayout.this.getFitsSystemWindows()) {
                    i10 = i11;
                } else {
                    i10 = 0;
                }
                if (DockedToolbarLayout.this.paddingBottomSystemWindowInsets != null) {
                    if (!DockedToolbarLayout.this.paddingBottomSystemWindowInsets.booleanValue()) {
                        i11 = 0;
                    }
                    i10 = i11;
                }
                if (DockedToolbarLayout.this.paddingTopSystemWindowInsets != null) {
                    if (!DockedToolbarLayout.this.paddingTopSystemWindowInsets.booleanValue()) {
                        i12 = 0;
                    }
                    i8 = i12;
                }
                relativePadding.top += i8;
                relativePadding.bottom += i10;
                relativePadding.applyToView(view);
                return windowInsetsCompat;
            }
        });
        setImportantForAccessibility(1);
        obtainTintedStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasGravity(ViewGroup.LayoutParams layoutParams, int i) {
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            if ((((CoordinatorLayout.LayoutParams) layoutParams).gravity & i) == i) {
                return true;
            }
            return false;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i) == i) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            int childCount = getChildCount();
            int max = Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight());
            for (int i8 = 0; i8 < childCount; i8++) {
                measureChild(getChildAt(i8), i, View.MeasureSpec.makeMeasureSpec(max, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), max);
        }
    }

    public DockedToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dockedToolbarStyle);
    }

    public DockedToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, DEF_STYLE_RES);
    }

    public DockedToolbarLayout(@NonNull Context context) {
        this(context, null);
    }
}
