package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(@ColorInt int i) {
        if (ColorUtils.setAlphaComponent(i, 255) == this.colorSurface) {
            return true;
        }
        return false;
    }

    public int calculateOverlayAlpha(float f7) {
        return Math.round(calculateOverlayAlphaFraction(f7) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f7) {
        if (this.displayDensity <= 0.0f || f7 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f7 / r0)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i, float f7) {
        int i3;
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f7);
        int alpha = Color.alpha(i);
        int layer = MaterialColors.layer(ColorUtils.setAlphaComponent(i, 255), this.elevationOverlayColor, calculateOverlayAlphaFraction);
        if (calculateOverlayAlphaFraction > 0.0f && (i3 = this.elevationOverlayAccentColor) != 0) {
            layer = MaterialColors.layer(layer, ColorUtils.setAlphaComponent(i3, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return ColorUtils.setAlphaComponent(layer, alpha);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i, float f7) {
        if (this.elevationOverlayEnabled && isThemeSurfaceColor(i)) {
            return compositeOverlay(i, f7);
        }
        return i;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f7, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view) + f7);
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @ColorInt
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @ColorInt
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    @ColorInt
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f7) {
        return compositeOverlayIfNeeded(this.colorSurface, f7);
    }

    @ColorInt
    public int compositeOverlayIfNeeded(@ColorInt int i, float f7, @NonNull View view) {
        return compositeOverlayIfNeeded(i, getParentAbsoluteElevation(view) + f7);
    }

    public ElevationOverlayProvider(boolean z10, @ColorInt int i, @ColorInt int i3, @ColorInt int i8, float f7) {
        this.elevationOverlayEnabled = z10;
        this.elevationOverlayColor = i;
        this.elevationOverlayAccentColor = i3;
        this.colorSurface = i8;
        this.displayDensity = f7;
    }

    @ColorInt
    public int compositeOverlay(@ColorInt int i, float f7, @NonNull View view) {
        return compositeOverlay(i, getParentAbsoluteElevation(view) + f7);
    }
}
