package com.google.android.material.navigationrail;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
class LabelMoveTransition extends Transition {
    private static final float HORIZONTAL_DISTANCE = -30.0f;
    private static final String LABEL_VISIBILITY = "NavigationRailLabelVisibility";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createAnimator$0(View view, ValueAnimator valueAnimator) {
        view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * HORIZONTAL_DISTANCE);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        transitionValues.values.put(LABEL_VISIBILITY, Integer.valueOf(transitionValues.view.getVisibility()));
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        transitionValues.values.put(LABEL_VISIBILITY, Integer.valueOf(transitionValues.view.getVisibility()));
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null && transitionValues.values.get(LABEL_VISIBILITY) != null && transitionValues2.values.get(LABEL_VISIBILITY) != null) {
            if (((Integer) transitionValues.values.get(LABEL_VISIBILITY)).intValue() == 8 && ((Integer) transitionValues2.values.get(LABEL_VISIBILITY)).intValue() == 0) {
                final View view = transitionValues2.view;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigationrail.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LabelMoveTransition.lambda$createAnimator$0(view, valueAnimator);
                    }
                });
                return ofFloat;
            }
            return super.createAnimator(viewGroup, transitionValues, transitionValues2);
        }
        return super.createAnimator(viewGroup, transitionValues, transitionValues2);
    }
}
