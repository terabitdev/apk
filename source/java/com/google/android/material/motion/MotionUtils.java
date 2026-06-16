package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.m;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.graphics.PathParser;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import f2.i;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class MotionUtils {
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    private static float getLegacyControlPoint(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        androidx.core.view.inputmethod.a.i("Motion easing control point value must be between 0 and 1; instead got: ", parseFloat);
        return 0.0f;
    }

    private static String getLegacyEasingContent(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String str) {
        if (isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER)) {
            String[] split = getLegacyEasingContent(str, EASING_TYPE_CUBIC_BEZIER).split(",");
            if (split.length == 4) {
                return new PathInterpolator(getLegacyControlPoint(split, 0), getLegacyControlPoint(split, 1), getLegacyControlPoint(split, 2), getLegacyControlPoint(split, 3));
            }
            androidx.core.view.inputmethod.a.e(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (isLegacyEasingType(str, EASING_TYPE_PATH)) {
            return new PathInterpolator(PathParser.createPathFromPathData(getLegacyEasingContent(str, EASING_TYPE_PATH)));
        }
        i.k(m.l("Invalid motion easing type: ", str));
        return null;
    }

    private static boolean isLegacyEasingAttribute(String str) {
        if (!isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER) && !isLegacyEasingType(str, EASING_TYPE_PATH)) {
            return false;
        }
        return true;
    }

    private static boolean isLegacyEasingType(String str, String str2) {
        if (str.startsWith(str2 + EASING_TYPE_FORMAT_START) && str.endsWith(EASING_TYPE_FORMAT_END)) {
            return true;
        }
        return false;
    }

    public static int resolveThemeDuration(@NonNull Context context, @AttrRes int i, int i3) {
        return MaterialAttributes.resolveInteger(context, i, i3);
    }

    @NonNull
    public static TimeInterpolator resolveThemeInterpolator(@NonNull Context context, @AttrRes int i, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (isLegacyEasingAttribute(valueOf)) {
                return getLegacyThemeInterpolator(valueOf);
            }
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        i.k("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    @NonNull
    public static SpringForce resolveThemeSpringForce(@NonNull Context context, @AttrRes int i, @StyleRes int i3) {
        TypedArray obtainStyledAttributes;
        TypedValue resolve = MaterialAttributes.resolve(context, i);
        if (resolve == null) {
            obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.MaterialSpring, 0, i3);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(resolve.resourceId, R.styleable.MaterialSpring);
        }
        SpringForce springForce = new SpringForce();
        try {
            float f7 = obtainStyledAttributes.getFloat(R.styleable.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f7 != Float.MIN_VALUE) {
                float f10 = obtainStyledAttributes.getFloat(R.styleable.MaterialSpring_damping, Float.MIN_VALUE);
                if (f10 != Float.MIN_VALUE) {
                    springForce.setStiffness(f7);
                    springForce.setDampingRatio(f10);
                    return springForce;
                }
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
