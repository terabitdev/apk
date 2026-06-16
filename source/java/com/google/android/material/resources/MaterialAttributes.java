package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.core.view.inputmethod.a;
import com.google.android.material.R;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class MaterialAttributes {
    @Nullable
    public static TypedValue resolve(@NonNull Context context, @AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@NonNull Context context, @AttrRes int i, boolean z10) {
        TypedValue resolve = resolve(context, i);
        if (resolve != null && resolve.type == 18) {
            if (resolve.data != 0) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public static boolean resolveBooleanOrThrow(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        if (resolveOrThrow(context, i, str) != 0) {
            return true;
        }
        return false;
    }

    @Px
    public static int resolveDimension(@NonNull Context context, @AttrRes int i, @DimenRes int i3) {
        float dimension;
        TypedValue resolve = resolve(context, i);
        if (resolve != null && resolve.type == 5) {
            dimension = resolve.getDimension(context.getResources().getDisplayMetrics());
        } else {
            dimension = context.getResources().getDimension(i3);
        }
        return (int) dimension;
    }

    public static int resolveInteger(@NonNull Context context, @AttrRes int i, int i3) {
        TypedValue resolve = resolve(context, i);
        if (resolve != null && resolve.type == 16) {
            return resolve.data;
        }
        return i3;
    }

    @Px
    public static int resolveMinimumAccessibleTouchTarget(@NonNull Context context) {
        return resolveDimension(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        return resolveTypedValueOrThrow(context, i, str).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        TypedValue resolve = resolve(context, i);
        if (resolve != null) {
            return resolve;
        }
        a.q("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }

    public static int resolveOrThrow(@NonNull View view, @AttrRes int i) {
        return resolveTypedValueOrThrow(view, i).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull View view, @AttrRes int i) {
        return resolveTypedValueOrThrow(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
