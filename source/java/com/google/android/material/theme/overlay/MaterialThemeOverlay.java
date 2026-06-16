package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, androidx.appcompat.R.attr.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {com.google.android.material.R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    @StyleRes
    private static int obtainAndroidThemeOverlayId(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    @NonNull
    private static int[] obtainMaterialOverlayIds(@NonNull Context context, @Nullable AttributeSet attributeSet, @NonNull int[] iArr, @AttrRes int i, @StyleRes int i3) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i3);
            for (int i8 = 0; i8 < iArr.length; i8++) {
                iArr2[i8] = obtainStyledAttributes.getResourceId(i8, 0);
            }
            obtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    @StyleRes
    private static int obtainMaterialThemeOverlayId(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i3) {
        return obtainMaterialOverlayIds(context, attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i, i3)[0];
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i3, @NonNull int[] iArr) {
        boolean z10;
        int obtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i, i3);
        if ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == obtainMaterialThemeOverlayId) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (obtainMaterialThemeOverlayId != 0 && !z10) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, obtainMaterialThemeOverlayId);
            for (int i8 : obtainMaterialOverlayIds(context, attributeSet, iArr, i, i3)) {
                if (i8 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(i8, true);
                }
            }
            int obtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
            if (obtainAndroidThemeOverlayId != 0) {
                contextThemeWrapper.getTheme().applyStyle(obtainAndroidThemeOverlayId, true);
            }
            return contextThemeWrapper;
        }
        return context;
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i3) {
        return wrap(context, attributeSet, i, i3, new int[0]);
    }
}
