package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class FloatingToolbarLayout extends FrameLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_FloatingToolbar;
    private static final String TAG = "FloatingToolbarLayout";
    private int bottomMarginWindowInset;
    private int leftMarginWindowInset;
    private boolean marginBottomSystemWindowInsets;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private Rect originalMargins;
    private int rightMarginWindowInset;
    private int topMarginWindowInset;

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i3) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i3), attributeSet, i);
        Context context2 = getContext();
        TintTypedArray obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.FloatingToolbar, i, i3, new int[0]);
        if (obtainTintedStyledAttributes.hasValue(R.styleable.FloatingToolbar_backgroundTint)) {
            int color = obtainTintedStyledAttributes.getColor(R.styleable.FloatingToolbar_backgroundTint, 0);
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i3).build());
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
            setBackground(materialShapeDrawable);
        }
        this.marginLeftSystemWindowInsets = obtainTintedStyledAttributes.getBoolean(R.styleable.FloatingToolbar_marginLeftSystemWindowInsets, true);
        this.marginTopSystemWindowInsets = obtainTintedStyledAttributes.getBoolean(R.styleable.FloatingToolbar_marginTopSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = obtainTintedStyledAttributes.getBoolean(R.styleable.FloatingToolbar_marginRightSystemWindowInsets, true);
        this.marginBottomSystemWindowInsets = obtainTintedStyledAttributes.getBoolean(R.styleable.FloatingToolbar_marginBottomSystemWindowInsets, true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.floatingtoolbar.FloatingToolbarLayout.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
                if (!FloatingToolbarLayout.this.marginLeftSystemWindowInsets && !FloatingToolbarLayout.this.marginRightSystemWindowInsets && !FloatingToolbarLayout.this.marginTopSystemWindowInsets && !FloatingToolbarLayout.this.marginBottomSystemWindowInsets) {
                    return windowInsetsCompat;
                }
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.ime());
                FloatingToolbarLayout.this.bottomMarginWindowInset = insets.bottom;
                FloatingToolbarLayout.this.topMarginWindowInset = insets.top;
                FloatingToolbarLayout.this.rightMarginWindowInset = insets.right;
                FloatingToolbarLayout.this.leftMarginWindowInset = insets.left;
                FloatingToolbarLayout.this.updateMargins();
                return windowInsetsCompat;
            }
        });
        obtainTintedStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateMargins() {
        int i;
        int i3;
        int i8;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.originalMargins;
        if (rect == null) {
            Log.w(TAG, "Unable to update margins because original view margins are not set");
            return;
        }
        int i10 = rect.left;
        int i11 = 0;
        if (this.marginLeftSystemWindowInsets) {
            i = this.leftMarginWindowInset;
        } else {
            i = 0;
        }
        int i12 = i10 + i;
        int i13 = rect.right;
        if (this.marginRightSystemWindowInsets) {
            i3 = this.rightMarginWindowInset;
        } else {
            i3 = 0;
        }
        int i14 = i13 + i3;
        int i15 = rect.top;
        if (this.marginTopSystemWindowInsets) {
            i8 = this.topMarginWindowInset;
        } else {
            i8 = 0;
        }
        int i16 = i15 + i8;
        int i17 = rect.bottom;
        if (this.marginBottomSystemWindowInsets) {
            i11 = this.bottomMarginWindowInset;
        }
        int i18 = i17 + i11;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i18 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i14 && marginLayoutParams.topMargin == i16) {
            return;
        }
        marginLayoutParams.bottomMargin = i18;
        marginLayoutParams.leftMargin = i12;
        marginLayoutParams.rightMargin = i14;
        marginLayoutParams.topMargin = i16;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.originalMargins = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            updateMargins();
            return;
        }
        this.originalMargins = null;
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, DEF_STYLE_RES);
    }

    public FloatingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }
}
