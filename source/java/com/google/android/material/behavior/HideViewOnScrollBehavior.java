package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.v4.media.session.m;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import f2.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ENTER_ANIMATION_DURATION_MS = 225;
    private static final int DEFAULT_EXIT_ANIMATION_DURATION_MS = 175;
    public static final int EDGE_BOTTOM = 1;
    public static final int EDGE_LEFT = 2;
    public static final int EDGE_RIGHT = 0;
    public static final int STATE_SCROLLED_IN = 2;
    public static final int STATE_SCROLLED_OUT = 1;
    private AccessibilityManager accessibilityManager;
    private int additionalHiddenOffset;

    @Nullable
    private ViewPropertyAnimator currentAnimator;
    private int currentState;
    private boolean disableOnTouchExploration;
    private int enterAnimDuration;

    @Nullable
    private TimeInterpolator enterAnimInterpolator;
    private int exitAnimDuration;

    @Nullable
    private TimeInterpolator exitAnimInterpolator;
    private HideViewOnScrollDelegate hideOnScrollViewDelegate;

    @NonNull
    private final LinkedHashSet<OnScrollStateChangedListener> onScrollStateChangedListeners;
    private int size;
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationListener;
    private boolean viewEdgeOverride;
    private static final int ENTER_ANIM_DURATION_ATTR = R.attr.motionDurationLong2;
    private static final int EXIT_ANIM_DURATION_ATTR = R.attr.motionDurationMedium4;
    private static final int ENTER_EXIT_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.currentAnimator = null;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, int i);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface ScrollState {
    }

    public HideViewOnScrollBehavior() {
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.viewEdgeOverride = false;
    }

    private void animateChildTo(@NonNull V v, int i, long j, @NonNull TimeInterpolator timeInterpolator) {
        this.currentAnimator = this.hideOnScrollViewDelegate.getViewTranslationAnimator(v, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.2
            public AnonymousClass2() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideViewOnScrollBehavior.this.currentAnimator = null;
            }
        });
    }

    private void disableIfTouchExplorationEnabled(V v) {
        if (this.accessibilityManager == null) {
            this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(v.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && this.touchExplorationListener == null) {
            a aVar = new a(this, v, 1);
            this.touchExplorationListener = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            v.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.behavior.HideViewOnScrollBehavior.1
                public AnonymousClass1() {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NonNull View view) {
                    if (HideViewOnScrollBehavior.this.touchExplorationListener != null && HideViewOnScrollBehavior.this.accessibilityManager != null) {
                        HideViewOnScrollBehavior.this.accessibilityManager.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.touchExplorationListener);
                        HideViewOnScrollBehavior.this.touchExplorationListener = null;
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NonNull View view) {
                }
            });
        }
    }

    @NonNull
    public static <V extends View> HideViewOnScrollBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof HideViewOnScrollBehavior) {
                return (HideViewOnScrollBehavior) behavior;
            }
            i.k("The view is not associated with HideViewOnScrollBehavior");
            return null;
        }
        i.k("The view is not a child of CoordinatorLayout");
        return null;
    }

    private boolean isGravityBottom(int i) {
        if (i != 80 && i != 81) {
            return false;
        }
        return true;
    }

    private boolean isGravityLeft(int i) {
        if (i != 3 && i != 19) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$disableIfTouchExplorationEnabled$0(View view, boolean z10) {
        if (this.disableOnTouchExploration && z10 && isScrolledOut()) {
            slideIn(view);
        }
    }

    private void setViewEdge(@NonNull V v, int i) {
        int i3;
        if (this.viewEdgeOverride) {
            return;
        }
        int i8 = ((CoordinatorLayout.LayoutParams) v.getLayoutParams()).gravity;
        if (isGravityBottom(i8)) {
            setViewEdgeInternal(1);
            return;
        }
        if (isGravityLeft(Gravity.getAbsoluteGravity(i8, i))) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        setViewEdgeInternal(i3);
    }

    private void setViewEdgeInternal(int i) {
        HideViewOnScrollDelegate hideViewOnScrollDelegate = this.hideOnScrollViewDelegate;
        if (hideViewOnScrollDelegate != null && hideViewOnScrollDelegate.getViewEdge() == i) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.hideOnScrollViewDelegate = new HideLeftViewOnScrollDelegate();
                    return;
                } else {
                    i.k(m.i(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                    return;
                }
            }
            this.hideOnScrollViewDelegate = new HideBottomViewOnScrollDelegate();
            return;
        }
        this.hideOnScrollViewDelegate = new HideRightViewOnScrollDelegate();
    }

    private void updateCurrentState(@NonNull V v, int i) {
        this.currentState = i;
        Iterator<OnScrollStateChangedListener> it = this.onScrollStateChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v, this.currentState);
        }
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.onScrollStateChangedListeners.clear();
    }

    public void disableOnTouchExploration(boolean z10) {
        this.disableOnTouchExploration = z10;
    }

    public boolean isDisabledOnTouchExploration() {
        return this.disableOnTouchExploration;
    }

    public boolean isScrolledIn() {
        if (this.currentState == 2) {
            return true;
        }
        return false;
    }

    public boolean isScrolledOut() {
        if (this.currentState == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        disableIfTouchExplorationEnabled(v);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        setViewEdge(v, i);
        this.size = this.hideOnScrollViewDelegate.getSize(v, marginLayoutParams);
        this.enterAnimDuration = MotionUtils.resolveThemeDuration(v.getContext(), ENTER_ANIM_DURATION_ATTR, DEFAULT_ENTER_ANIMATION_DURATION_MS);
        this.exitAnimDuration = MotionUtils.resolveThemeDuration(v.getContext(), EXIT_ANIM_DURATION_ATTR, DEFAULT_EXIT_ANIMATION_DURATION_MS);
        Context context = v.getContext();
        int i3 = ENTER_EXIT_ANIM_EASING_ATTR;
        this.enterAnimInterpolator = MotionUtils.resolveThemeInterpolator(context, i3, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.exitAnimInterpolator = MotionUtils.resolveThemeInterpolator(v.getContext(), i3, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i3, int i8, int i10, int i11, @NonNull int[] iArr) {
        if (i3 > 0) {
            slideOut(v);
        } else if (i3 < 0) {
            slideIn(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i3) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.onScrollStateChangedListeners.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffset(@NonNull V v, @Dimension int i) {
        this.additionalHiddenOffset = i;
        if (this.currentState == 1) {
            this.hideOnScrollViewDelegate.setAdditionalHiddenOffset(v, this.size, i);
        }
    }

    public void slideIn(@NonNull V v, boolean z10) {
        if (isScrolledIn()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        updateCurrentState(v, 2);
        int targetTranslation = this.hideOnScrollViewDelegate.getTargetTranslation();
        if (z10) {
            animateChildTo(v, targetTranslation, this.enterAnimDuration, this.enterAnimInterpolator);
        } else {
            this.hideOnScrollViewDelegate.setViewTranslation(v, targetTranslation);
        }
    }

    public void slideOut(@NonNull V v, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (!isScrolledOut()) {
            if (this.disableOnTouchExploration && (accessibilityManager = this.accessibilityManager) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.currentAnimator;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            updateCurrentState(v, 1);
            int i = this.size + this.additionalHiddenOffset;
            if (z10) {
                animateChildTo(v, i, this.exitAnimDuration, this.exitAnimInterpolator);
            } else {
                this.hideOnScrollViewDelegate.setViewTranslation(v, i);
            }
        }
    }

    public HideViewOnScrollBehavior(int i) {
        this();
        setViewEdge(i);
    }

    public HideViewOnScrollBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.disableOnTouchExploration = true;
        this.onScrollStateChangedListeners = new LinkedHashSet<>();
        this.size = 0;
        this.currentState = 2;
        this.additionalHiddenOffset = 0;
        this.viewEdgeOverride = false;
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements View.OnAttachStateChangeListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NonNull View view) {
            if (HideViewOnScrollBehavior.this.touchExplorationListener != null && HideViewOnScrollBehavior.this.accessibilityManager != null) {
                HideViewOnScrollBehavior.this.accessibilityManager.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.touchExplorationListener);
                HideViewOnScrollBehavior.this.touchExplorationListener = null;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
        }
    }

    public void setViewEdge(int i) {
        this.viewEdgeOverride = true;
        setViewEdgeInternal(i);
    }

    public void slideIn(@NonNull V v) {
        slideIn(v, true);
    }

    public void slideOut(@NonNull V v) {
        slideOut(v, true);
    }
}
