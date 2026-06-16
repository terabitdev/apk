package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.support.v4.media.session.m;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f7, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f7;
        }
        if (f13 >= f12) {
            return f10;
        }
        return lerp(f7, f10, (f13 - f11) / (f12 - f11));
    }

    public static int lerp(int i, int i3, float f7) {
        return Math.round(f7 * (i3 - i)) + i;
    }

    public static float lerp(float f7, float f10, float f11) {
        return m.f(f10, f7, f11, f7);
    }
}
