package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;
import com.google.android.material.color.MaterialColors;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z10, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2) {
        boolean z11;
        boolean z12 = false;
        if (num != null && num.intValue() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (num2 == null || num2.intValue() == 0) {
            z12 = true;
        }
        if (z11 || z12) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(color);
            }
            if (z12) {
                num2 = Integer.valueOf(color);
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window, !z10);
        int statusBarColor = getStatusBarColor(window.getContext(), z10);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z10);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }

    private static int getNavigationBarColor(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return ColorUtils.setAlphaComponent(MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    private static int getStatusBarColor(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i, boolean z10) {
        if (!MaterialColors.isColorLight(i)) {
            if (i != 0 || !z10) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void setLightNavigationBar(@NonNull Window window, boolean z10) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z10);
    }

    public static void setLightStatusBar(@NonNull Window window, boolean z10) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z10);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z10) {
        applyEdgeToEdge(window, z10, null, null);
    }
}
