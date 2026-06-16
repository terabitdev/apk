package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ScatterMapKt;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import f2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {
    private static final boolean DEFAULT_DRAWABLE_RESTART = false;
    private static final float DEFAULT_MOCK_PHASE_FRACTION = -1.0f;
    private static final int GROW_DURATION = 500;
    private static final Property<DrawableWithAnimatedVisibilityChange, Float> GROW_FRACTION = new Property<DrawableWithAnimatedVisibilityChange, Float>(Float.class, "growFraction") { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
        @Override // android.util.Property
        public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.getGrowFraction());
        }

        @Override // android.util.Property
        public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f7) {
            drawableWithAnimatedVisibilityChange.setGrowFraction(f7.floatValue());
        }
    };
    private List<Animatable2Compat.AnimationCallback> animationCallbacks;
    final BaseProgressIndicatorSpec baseSpec;
    final Context context;
    private float growFraction;
    private ValueAnimator hideAnimator;
    private boolean ignoreCallbacks;
    private Animatable2Compat.AnimationCallback internalAnimationCallback;
    private float mockGrowFraction;
    private boolean mockHideAnimationRunning;
    private boolean mockShowAnimationRunning;
    private ValueAnimator showAnimator;

    @IntRange(from = 0, to = ScatterMapKt.Sentinel)
    private int totalAlpha;
    private float mockPhaseFraction = -1.0f;
    final Paint paint = new Paint();

    @NonNull
    Rect clipBounds = new Rect();
    AnimatorDurationScaleProvider animatorDurationScaleProvider = new AnimatorDurationScaleProvider();

    public DrawableWithAnimatedVisibilityChange(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.context = context;
        this.baseSpec = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    private void cancelAnimatorsWithoutCallbacks(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.ignoreCallbacks = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationEnd() {
        Animatable2Compat.AnimationCallback animationCallback = this.internalAnimationCallback;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list != null && !this.ignoreCallbacks) {
            Iterator<Animatable2Compat.AnimationCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchAnimationStart() {
        Animatable2Compat.AnimationCallback animationCallback = this.internalAnimationCallback;
        if (animationCallback != null) {
            animationCallback.onAnimationStart(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list != null && !this.ignoreCallbacks) {
            Iterator<Animatable2Compat.AnimationCallback> it = list.iterator();
            while (it.hasNext()) {
                it.next().onAnimationStart(this);
            }
        }
    }

    private void endAnimatorsWithoutCallbacks(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.ignoreCallbacks;
        this.ignoreCallbacks = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.ignoreCallbacks = z10;
    }

    private boolean isDeterminateDrawable() {
        return this instanceof DeterminateDrawable;
    }

    private void maybeInitializeAnimators() {
        if (this.showAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, GROW_FRACTION, 0.0f, 1.0f);
            this.showAnimator = ofFloat;
            ofFloat.setDuration(500L);
            this.showAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setShowAnimator(this.showAnimator);
        }
        if (this.hideAnimator == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, GROW_FRACTION, 1.0f, 0.0f);
            this.hideAnimator = ofFloat2;
            ofFloat2.setDuration(500L);
            this.hideAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            setHideAnimator(this.hideAnimator);
        }
    }

    private void setHideAnimator(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.hideAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            i.k("Cannot set hideAnimator while the current hideAnimator is running.");
        } else {
            this.hideAnimator = valueAnimator;
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                    DrawableWithAnimatedVisibilityChange.this.dispatchAnimationEnd();
                }
            });
        }
    }

    private void setShowAnimator(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.showAnimator;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            i.k("Cannot set showAnimator while the current showAnimator is running.");
        } else {
            this.showAnimator = valueAnimator;
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    DrawableWithAnimatedVisibilityChange.this.dispatchAnimationStart();
                }
            });
        }
    }

    public void clearAnimationCallbacks() {
        this.animationCallbacks.clear();
        this.animationCallbacks = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.totalAlpha;
    }

    public float getGrowFraction() {
        if (!this.baseSpec.isShowAnimationEnabled() && !this.baseSpec.isHideAnimationEnabled()) {
            return 1.0f;
        }
        if (!this.mockHideAnimationRunning && !this.mockShowAnimationRunning) {
            return this.growFraction;
        }
        return this.mockGrowFraction;
    }

    @NonNull
    public ValueAnimator getHideAnimator() {
        return this.hideAnimator;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getPhaseFraction() {
        int i;
        float f7 = this.mockPhaseFraction;
        if (f7 > 0.0f) {
            return f7;
        }
        if (this.baseSpec.hasWavyEffect(isDeterminateDrawable()) && this.baseSpec.waveSpeed != 0) {
            float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
            if (systemAnimatorDurationScale > 0.0f) {
                boolean isDeterminateDrawable = isDeterminateDrawable();
                BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
                if (isDeterminateDrawable) {
                    i = baseProgressIndicatorSpec.wavelengthDeterminate;
                } else {
                    i = baseProgressIndicatorSpec.wavelengthIndeterminate;
                }
                int i3 = (int) (((i * 1000.0f) / this.baseSpec.waveSpeed) * systemAnimatorDurationScale);
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() % i3)) / i3;
                if (uptimeMillis < 0.0f) {
                    return (uptimeMillis % 1.0f) + 1.0f;
                }
                return uptimeMillis;
            }
        }
        return 0.0f;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.hideAnimator;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.mockHideAnimationRunning) {
            return true;
        }
        return false;
    }

    public boolean isRunning() {
        if (!isShowing() && !isHiding()) {
            return false;
        }
        return true;
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.showAnimator;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.mockShowAnimationRunning) {
            return true;
        }
        return false;
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new ArrayList();
        }
        if (!this.animationCallbacks.contains(animationCallback)) {
            this.animationCallbacks.add(animationCallback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.totalAlpha = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowFraction(@FloatRange(from = 0.0d, to = 1.0d) float f7) {
        if (this.growFraction != f7) {
            this.growFraction = f7;
            invalidateSelf();
        }
    }

    public void setInternalAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.internalAnimationCallback = animationCallback;
    }

    @VisibleForTesting
    public void setMockHideAnimationRunning(boolean z10, @FloatRange(from = 0.0d, to = 1.0d) float f7) {
        this.mockHideAnimationRunning = z10;
        this.mockGrowFraction = f7;
    }

    @VisibleForTesting
    public void setMockPhaseFraction(@FloatRange(from = 0.0d, to = 1.0d) float f7) {
        this.mockPhaseFraction = f7;
    }

    @VisibleForTesting
    public void setMockShowAnimationRunning(boolean z10, @FloatRange(from = 0.0d, to = 1.0d) float f7) {
        this.mockShowAnimationRunning = z10;
        this.mockGrowFraction = f7;
    }

    public boolean setVisible(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float systemAnimatorDurationScale = this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver());
        if (z12 && systemAnimatorDurationScale > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        return setVisibleInternal(z10, z11, z13);
    }

    public boolean setVisibleInternal(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z13;
        boolean isHideAnimationEnabled;
        maybeInitializeAnimators();
        if (!isVisible() && !z10) {
            return false;
        }
        if (z10) {
            valueAnimator = this.showAnimator;
        } else {
            valueAnimator = this.hideAnimator;
        }
        if (z10) {
            valueAnimator2 = this.hideAnimator;
        } else {
            valueAnimator2 = this.showAnimator;
        }
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                cancelAnimatorsWithoutCallbacks(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                endAnimatorsWithoutCallbacks(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        if (z10 && !super.setVisible(z10, false)) {
            z13 = false;
        } else {
            z13 = true;
        }
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
        if (z10) {
            isHideAnimationEnabled = baseProgressIndicatorSpec.isShowAnimationEnabled();
        } else {
            isHideAnimationEnabled = baseProgressIndicatorSpec.isHideAnimationEnabled();
        }
        if (!isHideAnimationEnabled) {
            endAnimatorsWithoutCallbacks(valueAnimator);
            return z13;
        }
        if (!z11 && valueAnimator.isPaused()) {
            valueAnimator.resume();
            return z13;
        }
        valueAnimator.start();
        return z13;
    }

    public void start() {
        setVisibleInternal(true, true, false);
    }

    public void stop() {
        setVisibleInternal(false, true, false);
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.animationCallbacks;
        if (list != null && list.contains(animationCallback)) {
            this.animationCallbacks.remove(animationCallback);
            if (this.animationCallbacks.isEmpty()) {
                this.animationCallbacks = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return setVisible(z10, z11, true);
    }
}
