package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean checkAbsoluteGravity(@GravityInt int i, @GravityInt int i3) {
        if ((Gravity.getAbsoluteGravity(i, this.view.getLayoutDirection()) & i3) == i3) {
            return true;
        }
        return false;
    }

    private int getEdgeMargin(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z10) {
                return marginLayoutParams.leftMargin;
            }
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v = this.view;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt final int i, @Nullable Animator.AnimatorListener animatorListener, @Nullable ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z10;
        if (backEventCompat.getSwipeEdge() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i, 3);
        float scaleX = (this.view.getScaleX() * this.view.getWidth()) + getEdgeMargin(checkAbsoluteGravity);
        V v = this.view;
        Property property = View.TRANSLATION_X;
        if (checkAbsoluteGravity) {
            scaleX = -scaleX;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) property, scaleX);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new FastOutSlowInInterpolator());
        ofFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat.getProgress()));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z10, i);
            }
        });
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        super.onStartBackProgress(backEventCompat);
    }

    @VisibleForTesting
    public void updateBackProgress(float f7, boolean z10, @GravityInt int i) {
        boolean z11;
        float f10;
        float f11;
        float f12;
        float interpolateProgress = interpolateProgress(f7);
        boolean checkAbsoluteGravity = checkAbsoluteGravity(i, 3);
        if (z10 == checkAbsoluteGravity) {
            z11 = true;
        } else {
            z11 = false;
        }
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f13 = width;
        if (f13 > 0.0f) {
            float f14 = height;
            if (f14 > 0.0f) {
                float f15 = this.maxScaleXDistanceShrink / f13;
                float f16 = this.maxScaleXDistanceGrow / f13;
                float f17 = this.maxScaleYDistance / f14;
                V v = this.view;
                if (checkAbsoluteGravity) {
                    f13 = 0.0f;
                }
                v.setPivotX(f13);
                if (!z11) {
                    f16 = -f15;
                }
                float lerp = AnimationUtils.lerp(0.0f, f16, interpolateProgress);
                float f18 = lerp + 1.0f;
                float lerp2 = 1.0f - AnimationUtils.lerp(0.0f, f17, interpolateProgress);
                if (!Float.isNaN(f18) && !Float.isNaN(lerp2)) {
                    this.view.setScaleX(f18);
                    this.view.setScaleY(lerp2);
                    V v6 = this.view;
                    if (v6 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) v6;
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            View childAt = viewGroup.getChildAt(i3);
                            if (checkAbsoluteGravity) {
                                f10 = childAt.getWidth() + (width - childAt.getRight());
                            } else {
                                f10 = -childAt.getLeft();
                            }
                            childAt.setPivotX(f10);
                            childAt.setPivotY(-childAt.getTop());
                            if (z11) {
                                f11 = 1.0f - lerp;
                            } else {
                                f11 = 1.0f;
                            }
                            if (lerp2 != 0.0f) {
                                f12 = (f18 / lerp2) * f11;
                            } else {
                                f12 = 1.0f;
                            }
                            if (!Float.isNaN(f11) && !Float.isNaN(f12)) {
                                childAt.setScaleX(f11);
                                childAt.setScaleY(f12);
                            }
                        }
                    }
                }
            }
        }
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat, @GravityInt int i) {
        if (super.onUpdateBackProgress(backEventCompat) == null) {
            return;
        }
        updateBackProgress(backEventCompat.getProgress(), backEventCompat.getSwipeEdge() == 0, i);
    }
}
