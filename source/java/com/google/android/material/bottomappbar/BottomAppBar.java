package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    private static final int FAB_ALIGNMENT_ANIM_DURATION_DEFAULT = 300;
    private static final float FAB_ALIGNMENT_ANIM_EASING_MIDPOINT = 0.2f;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANCHOR_MODE_CRADLE = 1;
    public static final int FAB_ANCHOR_MODE_EMBED = 0;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    public static final int MENU_ALIGNMENT_MODE_AUTO = 0;
    public static final int MENU_ALIGNMENT_MODE_START = 1;
    private static final int NO_FAB_END_MARGIN = -1;
    private static final int NO_MENU_RES_ID = 0;
    private int animatingModeChangeCounter;
    private ArrayList<AnimationListener> animationListeners;
    private Behavior behavior;
    private int bottomInset;
    private int fabAlignmentMode;

    @Px
    private int fabAlignmentModeEndMargin;
    private int fabAnchorMode;

    @NonNull
    AnimatorListenerAdapter fabAnimationListener;
    private int fabAnimationMode;
    private boolean fabAttached;
    private final int fabOffsetEndMode;

    @NonNull
    TransformationCallback<FloatingActionButton> fabTransformationCallback;
    private boolean hideOnScroll;
    private int leftInset;
    private final MaterialShapeDrawable materialShapeDrawable;
    private int menuAlignmentMode;
    private boolean menuAnimatingWithFabAlignmentMode;

    @Nullable
    private Animator menuAnimator;

    @Nullable
    private Animator modeAnimator;

    @Nullable
    private Integer navigationIconTint;
    private final boolean paddingBottomSystemWindowInsets;
    private final boolean paddingLeftSystemWindowInsets;
    private final boolean paddingRightSystemWindowInsets;

    @MenuRes
    private int pendingMenuResId;
    private final boolean removeEmbeddedFabElevation;
    private int rightInset;
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_BottomAppBar;
    private static final int FAB_ALIGNMENT_ANIM_DURATION_ATTR = R.attr.motionDurationLong2;
    private static final int FAB_ALIGNMENT_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public AnonymousClass1() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.menuAnimatingWithFabAlignmentMode) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.maybeAnimateMenuView(bottomAppBar.fabAlignmentMode, BottomAppBar.this.fabAttached);
            }
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements TransformationCallback<FloatingActionButton> {
        public AnonymousClass2() {
        }

        @Override // com.google.android.material.animation.TransformationCallback
        public void onScaleChanged(@NonNull FloatingActionButton floatingActionButton) {
            float f7;
            MaterialShapeDrawable materialShapeDrawable = BottomAppBar.this.materialShapeDrawable;
            if (floatingActionButton.getVisibility() == 0 && BottomAppBar.this.fabAnchorMode == 1) {
                f7 = floatingActionButton.getScaleY();
            } else {
                f7 = 0.0f;
            }
            materialShapeDrawable.setInterpolation(f7);
        }

        @Override // com.google.android.material.animation.TransformationCallback
        public void onTranslationChanged(@NonNull FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.fabAnchorMode != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().getHorizontalOffset() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().setHorizontalOffset(translationX);
                BottomAppBar.this.materialShapeDrawable.invalidateSelf();
            }
            float f7 = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().getCradleVerticalOffset() != max) {
                BottomAppBar.this.getTopEdgeTreatment().setCradleVerticalOffset(max);
                BottomAppBar.this.materialShapeDrawable.invalidateSelf();
            }
            MaterialShapeDrawable materialShapeDrawable = BottomAppBar.this.materialShapeDrawable;
            if (floatingActionButton.getVisibility() == 0) {
                f7 = floatingActionButton.getScaleY();
            }
            materialShapeDrawable.setInterpolation(f7);
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$3 */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements ViewUtils.OnApplyWindowInsetsListener {
        public AnonymousClass3() {
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
            boolean z10;
            if (BottomAppBar.this.paddingBottomSystemWindowInsets) {
                BottomAppBar.this.bottomInset = windowInsetsCompat.getSystemWindowInsetBottom();
            }
            boolean z11 = true;
            boolean z12 = false;
            if (BottomAppBar.this.paddingLeftSystemWindowInsets) {
                if (BottomAppBar.this.leftInset != windowInsetsCompat.getSystemWindowInsetLeft()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                BottomAppBar.this.leftInset = windowInsetsCompat.getSystemWindowInsetLeft();
            } else {
                z10 = false;
            }
            if (BottomAppBar.this.paddingRightSystemWindowInsets) {
                if (BottomAppBar.this.rightInset == windowInsetsCompat.getSystemWindowInsetRight()) {
                    z11 = false;
                }
                BottomAppBar.this.rightInset = windowInsetsCompat.getSystemWindowInsetRight();
                z12 = z11;
            }
            if (z10 || z12) {
                BottomAppBar.this.cancelAnimations();
                BottomAppBar.this.setCutoutStateAndTranslateFab();
                BottomAppBar.this.setActionMenuViewPosition();
                return windowInsetsCompat;
            }
            return windowInsetsCompat;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$4 */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 extends AnimatorListenerAdapter {
        public AnonymousClass4() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.dispatchAnimationEnd();
            BottomAppBar.this.modeAnimator = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.dispatchAnimationStart();
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$5 */
    /* loaded from: classes4.dex */
    public class AnonymousClass5 extends FloatingActionButton.OnVisibilityChangedListener {
        final /* synthetic */ int val$targetMode;

        /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$5$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 extends FloatingActionButton.OnVisibilityChangedListener {
            public AnonymousClass1() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
            public void onShown(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.dispatchAnimationEnd();
            }
        }

        public AnonymousClass5(int i) {
            r2 = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
        public void onHidden(@NonNull FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.getFabTranslationX(r2));
            floatingActionButton.show(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5.1
                public AnonymousClass1() {
                }

                @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                public void onShown(FloatingActionButton floatingActionButton2) {
                    BottomAppBar.this.dispatchAnimationEnd();
                }
            });
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$6 */
    /* loaded from: classes4.dex */
    public class AnonymousClass6 extends AnimatorListenerAdapter {
        public AnonymousClass6() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.dispatchAnimationEnd();
            BottomAppBar.this.menuAnimatingWithFabAlignmentMode = false;
            BottomAppBar.this.menuAnimator = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.dispatchAnimationStart();
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$7 */
    /* loaded from: classes4.dex */
    public class AnonymousClass7 extends AnimatorListenerAdapter {
        public boolean cancelled;
        final /* synthetic */ ActionMenuView val$actionMenuView;
        final /* synthetic */ boolean val$targetAttached;
        final /* synthetic */ int val$targetMode;

        public AnonymousClass7(ActionMenuView actionMenuView, int i, boolean z10) {
            r2 = actionMenuView;
            r3 = i;
            r4 = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.cancelled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z10;
            if (!this.cancelled) {
                if (BottomAppBar.this.pendingMenuResId != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.replaceMenu(bottomAppBar.pendingMenuResId);
                BottomAppBar.this.translateActionMenuView(r2, r3, r4, z10);
            }
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$8 */
    /* loaded from: classes4.dex */
    public class AnonymousClass8 implements Runnable {
        final /* synthetic */ ActionMenuView val$actionMenuView;
        final /* synthetic */ int val$fabAlignmentMode;
        final /* synthetic */ boolean val$fabAttached;

        public AnonymousClass8(ActionMenuView actionMenuView, int i, boolean z10) {
            r2 = actionMenuView;
            r3 = i;
            r4 = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            r2.setTranslationX(BottomAppBar.this.getActionMenuViewTranslationX(r0, r3, r4));
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$9 */
    /* loaded from: classes4.dex */
    public class AnonymousClass9 extends AnimatorListenerAdapter {
        public AnonymousClass9() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.fabAnimationListener.onAnimationStart(animator);
            FloatingActionButton findDependentFab = BottomAppBar.this.findDependentFab();
            if (findDependentFab != null) {
                findDependentFab.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface AnimationListener {
        void onAnimationEnd(BottomAppBar bottomAppBar);

        void onAnimationStart(BottomAppBar bottomAppBar);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface FabAlignmentMode {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface FabAnchorMode {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface FabAnimationMode {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface MenuAlignmentMode {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, r4), attributeSet, i);
        int i3 = DEF_STYLE_RES;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.materialShapeDrawable = materialShapeDrawable;
        this.animatingModeChangeCounter = 0;
        this.pendingMenuResId = 0;
        this.menuAnimatingWithFabAlignmentMode = false;
        this.fabAttached = true;
        this.fabAnimationListener = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.1
            public AnonymousClass1() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (!BottomAppBar.this.menuAnimatingWithFabAlignmentMode) {
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    bottomAppBar.maybeAnimateMenuView(bottomAppBar.fabAlignmentMode, BottomAppBar.this.fabAttached);
                }
            }
        };
        this.fabTransformationCallback = new TransformationCallback<FloatingActionButton>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.2
            public AnonymousClass2() {
            }

            @Override // com.google.android.material.animation.TransformationCallback
            public void onScaleChanged(@NonNull FloatingActionButton floatingActionButton) {
                float f7;
                MaterialShapeDrawable materialShapeDrawable2 = BottomAppBar.this.materialShapeDrawable;
                if (floatingActionButton.getVisibility() == 0 && BottomAppBar.this.fabAnchorMode == 1) {
                    f7 = floatingActionButton.getScaleY();
                } else {
                    f7 = 0.0f;
                }
                materialShapeDrawable2.setInterpolation(f7);
            }

            @Override // com.google.android.material.animation.TransformationCallback
            public void onTranslationChanged(@NonNull FloatingActionButton floatingActionButton) {
                if (BottomAppBar.this.fabAnchorMode != 1) {
                    return;
                }
                float translationX = floatingActionButton.getTranslationX();
                if (BottomAppBar.this.getTopEdgeTreatment().getHorizontalOffset() != translationX) {
                    BottomAppBar.this.getTopEdgeTreatment().setHorizontalOffset(translationX);
                    BottomAppBar.this.materialShapeDrawable.invalidateSelf();
                }
                float f7 = 0.0f;
                float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
                if (BottomAppBar.this.getTopEdgeTreatment().getCradleVerticalOffset() != max) {
                    BottomAppBar.this.getTopEdgeTreatment().setCradleVerticalOffset(max);
                    BottomAppBar.this.materialShapeDrawable.invalidateSelf();
                }
                MaterialShapeDrawable materialShapeDrawable2 = BottomAppBar.this.materialShapeDrawable;
                if (floatingActionButton.getVisibility() == 0) {
                    f7 = floatingActionButton.getScaleY();
                }
                materialShapeDrawable2.setInterpolation(f7);
            }
        };
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.BottomAppBar, i, i3, new int[0]);
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.BottomAppBar_backgroundTint);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomAppBar_navigationIconTint)) {
            setNavigationIconTint(obtainStyledAttributes.getColor(R.styleable.BottomAppBar_navigationIconTint, -1));
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleVerticalOffset, 0);
        this.fabAlignmentMode = obtainStyledAttributes.getInt(R.styleable.BottomAppBar_fabAlignmentMode, 0);
        this.fabAnimationMode = obtainStyledAttributes.getInt(R.styleable.BottomAppBar_fabAnimationMode, 0);
        this.fabAnchorMode = obtainStyledAttributes.getInt(R.styleable.BottomAppBar_fabAnchorMode, 1);
        this.removeEmbeddedFabElevation = obtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_removeEmbeddedFabElevation, true);
        this.menuAlignmentMode = obtainStyledAttributes.getInt(R.styleable.BottomAppBar_menuAlignmentMode, 0);
        this.hideOnScroll = obtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_hideOnScroll, false);
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.fabAlignmentModeEndMargin = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z10 = obtainStyledAttributes.getBoolean(R.styleable.BottomAppBar_addElevationShadow, true);
        obtainStyledAttributes.recycle();
        this.fabOffsetEndMode = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        materialShapeDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setTopEdge(new BottomAppBarTopEdgeTreatment(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).build());
        if (z10) {
            materialShapeDrawable.setShadowCompatibilityMode(2);
        } else {
            materialShapeDrawable.setShadowCompatibilityMode(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setTintList(colorStateList);
        setElevation(dimensionPixelSize);
        setBackground(materialShapeDrawable);
        ViewUtils.doOnApplyWindowInsets(this, attributeSet, i, i3, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.3
            public AnonymousClass3() {
            }

            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
                boolean z102;
                if (BottomAppBar.this.paddingBottomSystemWindowInsets) {
                    BottomAppBar.this.bottomInset = windowInsetsCompat.getSystemWindowInsetBottom();
                }
                boolean z11 = true;
                boolean z12 = false;
                if (BottomAppBar.this.paddingLeftSystemWindowInsets) {
                    if (BottomAppBar.this.leftInset != windowInsetsCompat.getSystemWindowInsetLeft()) {
                        z102 = true;
                    } else {
                        z102 = false;
                    }
                    BottomAppBar.this.leftInset = windowInsetsCompat.getSystemWindowInsetLeft();
                } else {
                    z102 = false;
                }
                if (BottomAppBar.this.paddingRightSystemWindowInsets) {
                    if (BottomAppBar.this.rightInset == windowInsetsCompat.getSystemWindowInsetRight()) {
                        z11 = false;
                    }
                    BottomAppBar.this.rightInset = windowInsetsCompat.getSystemWindowInsetRight();
                    z12 = z11;
                }
                if (z102 || z12) {
                    BottomAppBar.this.cancelAnimations();
                    BottomAppBar.this.setCutoutStateAndTranslateFab();
                    BottomAppBar.this.setActionMenuViewPosition();
                    return windowInsetsCompat;
                }
                return windowInsetsCompat;
            }
        });
    }

    public void addFabAnimationListeners(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.addOnHideAnimationListener(this.fabAnimationListener);
        floatingActionButton.addOnShowAnimationListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
            public AnonymousClass9() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BottomAppBar.this.fabAnimationListener.onAnimationStart(animator);
                FloatingActionButton findDependentFab = BottomAppBar.this.findDependentFab();
                if (findDependentFab != null) {
                    findDependentFab.setTranslationX(BottomAppBar.this.getFabTranslationX());
                }
            }
        });
        floatingActionButton.addTransformationCallback(this.fabTransformationCallback);
    }

    public void cancelAnimations() {
        Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.modeAnimator;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void createFabTranslationXAnimation(int i, @NonNull List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findDependentFab(), "translationX", getFabTranslationX(i));
        ofFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    private void createMenuViewTranslationAnimation(int i, boolean z10, @NonNull List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
            if (Math.abs(actionMenuView.getTranslationX() - getActionMenuViewTranslationX(actionMenuView, i, z10)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
                ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
                    public boolean cancelled;
                    final /* synthetic */ ActionMenuView val$actionMenuView;
                    final /* synthetic */ boolean val$targetAttached;
                    final /* synthetic */ int val$targetMode;

                    public AnonymousClass7(ActionMenuView actionMenuView2, int i3, boolean z102) {
                        r2 = actionMenuView2;
                        r3 = i3;
                        r4 = z102;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        this.cancelled = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        boolean z102;
                        if (!this.cancelled) {
                            if (BottomAppBar.this.pendingMenuResId != 0) {
                                z102 = true;
                            } else {
                                z102 = false;
                            }
                            BottomAppBar bottomAppBar = BottomAppBar.this;
                            bottomAppBar.replaceMenu(bottomAppBar.pendingMenuResId);
                            BottomAppBar.this.translateActionMenuView(r2, r3, r4, z102);
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
                return;
            }
            if (actionMenuView2.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    public void dispatchAnimationEnd() {
        ArrayList<AnimationListener> arrayList;
        int i = this.animatingModeChangeCounter - 1;
        this.animatingModeChangeCounter = i;
        if (i == 0 && (arrayList = this.animationListeners) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                AnimationListener animationListener = arrayList.get(i3);
                i3++;
                animationListener.onAnimationEnd(this);
            }
        }
    }

    public void dispatchAnimationStart() {
        ArrayList<AnimationListener> arrayList;
        int i = this.animatingModeChangeCounter;
        this.animatingModeChangeCounter = i + 1;
        if (i == 0 && (arrayList = this.animationListeners) != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                AnimationListener animationListener = arrayList.get(i3);
                i3++;
                animationListener.onAnimationStart(this);
            }
        }
    }

    @Nullable
    public FloatingActionButton findDependentFab() {
        View findDependentView = findDependentView();
        if (findDependentView instanceof FloatingActionButton) {
            return (FloatingActionButton) findDependentView;
        }
        return null;
    }

    @Nullable
    public View findDependentView() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.resolveThemeDuration(getContext(), FAB_ALIGNMENT_ANIM_DURATION_ATTR, 300);
    }

    public float getFabTranslationX(int i) {
        int i3;
        int i8;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i10 = 1;
        if (i == 1) {
            View findDependentView = findDependentView();
            if (isLayoutRtl) {
                i3 = this.leftInset;
            } else {
                i3 = this.rightInset;
            }
            if (this.fabAlignmentModeEndMargin != -1 && findDependentView != null) {
                i8 = (findDependentView.getMeasuredWidth() / 2) + this.fabAlignmentModeEndMargin + i3;
            } else {
                i8 = this.fabOffsetEndMode + i3;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - i8;
            if (isLayoutRtl) {
                i10 = -1;
            }
            return measuredWidth * i10;
        }
        return 0.0f;
    }

    private float getFabTranslationY() {
        int i;
        if (this.fabAnchorMode == 1) {
            return -getTopEdgeTreatment().getCradleVerticalOffset();
        }
        View findDependentView = findDependentView();
        if (findDependentView != null) {
            i = (-((getMeasuredHeight() + getBottomInset()) - findDependentView.getMeasuredHeight())) / 2;
        } else {
            i = 0;
        }
        return i;
    }

    public int getLeftInset() {
        return this.leftInset;
    }

    public int getRightInset() {
        return this.rightInset;
    }

    @NonNull
    public BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        return (BottomAppBarTopEdgeTreatment) this.materialShapeDrawable.getShapeAppearanceModel().getTopEdge();
    }

    private boolean isFabVisibleOrWillBeShown() {
        FloatingActionButton findDependentFab = findDependentFab();
        if (findDependentFab != null && findDependentFab.isOrWillBeShown()) {
            return true;
        }
        return false;
    }

    public void maybeAnimateMenuView(int i, boolean z10) {
        if (!isLaidOut()) {
            this.menuAnimatingWithFabAlignmentMode = false;
            replaceMenu(this.pendingMenuResId);
            return;
        }
        Animator animator = this.menuAnimator;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!isFabVisibleOrWillBeShown()) {
            i = 0;
            z10 = false;
        }
        createMenuViewTranslationAnimation(i, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.menuAnimator = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
            public AnonymousClass6() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                BottomAppBar.this.dispatchAnimationEnd();
                BottomAppBar.this.menuAnimatingWithFabAlignmentMode = false;
                BottomAppBar.this.menuAnimator = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                BottomAppBar.this.dispatchAnimationStart();
            }
        });
        this.menuAnimator.start();
    }

    private void maybeAnimateModeChange(int i) {
        if (this.fabAlignmentMode != i && isLaidOut()) {
            Animator animator = this.modeAnimator;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.fabAnimationMode == 1) {
                createFabTranslationXAnimation(i, arrayList);
            } else {
                createFabDefaultXAnimation(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), FAB_ALIGNMENT_ANIM_EASING_ATTR, AnimationUtils.LINEAR_INTERPOLATOR));
            this.modeAnimator = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
                public AnonymousClass4() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    BottomAppBar.this.dispatchAnimationEnd();
                    BottomAppBar.this.modeAnimator = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    BottomAppBar.this.dispatchAnimationStart();
                }
            });
            this.modeAnimator.start();
        }
    }

    @Nullable
    private Drawable maybeTintNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.navigationIconTint != null) {
            Drawable wrap = DrawableCompat.wrap(drawable.mutate());
            wrap.setTint(this.navigationIconTint.intValue());
            return wrap;
        }
        return drawable;
    }

    public void setActionMenuViewPosition() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.menuAnimator == null) {
            actionMenuView.setAlpha(1.0f);
            if (!isFabVisibleOrWillBeShown()) {
                translateActionMenuView(actionMenuView, 0, false);
            } else {
                translateActionMenuView(actionMenuView, this.fabAlignmentMode, this.fabAttached);
            }
        }
    }

    public void setCutoutStateAndTranslateFab() {
        float f7;
        getTopEdgeTreatment().setHorizontalOffset(getFabTranslationX());
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (this.fabAttached && isFabVisibleOrWillBeShown() && this.fabAnchorMode == 1) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        materialShapeDrawable.setInterpolation(f7);
        View findDependentView = findDependentView();
        if (findDependentView != null) {
            findDependentView.setTranslationY(getFabTranslationY());
            findDependentView.setTranslationX(getFabTranslationX());
        }
    }

    public void translateActionMenuView(@NonNull ActionMenuView actionMenuView, int i, boolean z10, boolean z11) {
        AnonymousClass8 anonymousClass8 = new Runnable() { // from class: com.google.android.material.bottomappbar.BottomAppBar.8
            final /* synthetic */ ActionMenuView val$actionMenuView;
            final /* synthetic */ int val$fabAlignmentMode;
            final /* synthetic */ boolean val$fabAttached;

            public AnonymousClass8(ActionMenuView actionMenuView2, int i3, boolean z102) {
                r2 = actionMenuView2;
                r3 = i3;
                r4 = z102;
            }

            @Override // java.lang.Runnable
            public void run() {
                r2.setTranslationX(BottomAppBar.this.getActionMenuViewTranslationX(r0, r3, r4));
            }
        };
        if (z11) {
            actionMenuView2.post(anonymousClass8);
        } else {
            anonymousClass8.run();
        }
    }

    public static void updateFabAnchorGravity(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
        layoutParams.anchorGravity = 17;
        int i = bottomAppBar.fabAnchorMode;
        if (i == 1) {
            layoutParams.anchorGravity = 17 | 48;
        }
        if (i == 0) {
            layoutParams.anchorGravity |= 80;
        }
    }

    public void addAnimationListener(@NonNull AnimationListener animationListener) {
        if (this.animationListeners == null) {
            this.animationListeners = new ArrayList<>();
        }
        this.animationListeners.add(animationListener);
    }

    public void addOnScrollStateChangedListener(@NonNull HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().addOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        getBehavior().clearOnScrollStateChangedListeners();
    }

    public void createFabDefaultXAnimation(int i, List<Animator> list) {
        FloatingActionButton findDependentFab = findDependentFab();
        if (findDependentFab != null && !findDependentFab.isOrWillBeHidden()) {
            dispatchAnimationStart();
            findDependentFab.hide(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5
                final /* synthetic */ int val$targetMode;

                /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
                /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$5$1 */
                /* loaded from: classes4.dex */
                public class AnonymousClass1 extends FloatingActionButton.OnVisibilityChangedListener {
                    public AnonymousClass1() {
                    }

                    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                    public void onShown(FloatingActionButton floatingActionButton2) {
                        BottomAppBar.this.dispatchAnimationEnd();
                    }
                }

                public AnonymousClass5(int i3) {
                    r2 = i3;
                }

                @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                public void onHidden(@NonNull FloatingActionButton floatingActionButton) {
                    floatingActionButton.setTranslationX(BottomAppBar.this.getFabTranslationX(r2));
                    floatingActionButton.show(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5.1
                        public AnonymousClass1() {
                        }

                        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                        public void onShown(FloatingActionButton floatingActionButton2) {
                            BottomAppBar.this.dispatchAnimationEnd();
                        }
                    });
                }
            });
        }
    }

    public int getActionMenuViewTranslationX(@NonNull ActionMenuView actionMenuView, int i, boolean z10) {
        int i3;
        int left;
        int i8;
        int i10 = 0;
        if (this.menuAlignmentMode != 1 && (i != 1 || !z10)) {
            return 0;
        }
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        if (isLayoutRtl) {
            i3 = getMeasuredWidth();
        } else {
            i3 = 0;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                if (isLayoutRtl) {
                    i3 = Math.min(i3, childAt.getLeft());
                } else {
                    i3 = Math.max(i3, childAt.getRight());
                }
            }
        }
        if (isLayoutRtl) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (isLayoutRtl) {
            i8 = this.rightInset;
        } else {
            i8 = -this.leftInset;
        }
        if (getNavigationIcon() == null) {
            i10 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!isLayoutRtl) {
                i10 = -i10;
            }
        }
        return i3 - ((left + i8) + i10);
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        return this.materialShapeDrawable.getTintList();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        if (this.behavior == null) {
            this.behavior = new Behavior();
        }
        return this.behavior;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().getCradleVerticalOffset();
    }

    public int getFabAlignmentMode() {
        return this.fabAlignmentMode;
    }

    @Px
    public int getFabAlignmentModeEndMargin() {
        return this.fabAlignmentModeEndMargin;
    }

    public int getFabAnchorMode() {
        return this.fabAnchorMode;
    }

    public int getFabAnimationMode() {
        return this.fabAnimationMode;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().getFabCradleMargin();
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().getFabCradleRoundedCornerRadius();
    }

    public boolean getHideOnScroll() {
        return this.hideOnScroll;
    }

    public int getMenuAlignmentMode() {
        return this.menuAlignmentMode;
    }

    public boolean isScrolledDown() {
        return getBehavior().isScrolledDown();
    }

    public boolean isScrolledUp() {
        return getBehavior().isScrolledUp();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.materialShapeDrawable);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i3, int i8, int i10) {
        super.onLayout(z10, i, i3, i8, i10);
        if (z10) {
            cancelAnimations();
            setCutoutStateAndTranslateFab();
            View findDependentView = findDependentView();
            if (findDependentView != null && findDependentView.isLaidOut()) {
                findDependentView.post(new a(findDependentView, 0));
            }
        }
        setActionMenuViewPosition();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.fabAlignmentMode = savedState.fabAlignmentMode;
        this.fabAttached = savedState.fabAttached;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.fabAlignmentMode = this.fabAlignmentMode;
        savedState.fabAttached = this.fabAttached;
        return savedState;
    }

    public void performHide(boolean z10) {
        getBehavior().slideDown(this, z10);
    }

    public void performShow(boolean z10) {
        getBehavior().slideUp(this, z10);
    }

    public void removeAnimationListener(@NonNull AnimationListener animationListener) {
        ArrayList<AnimationListener> arrayList = this.animationListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animationListener);
    }

    public void removeOnScrollStateChangedListener(@NonNull HideBottomViewOnScrollBehavior.OnScrollStateChangedListener onScrollStateChangedListener) {
        getBehavior().removeOnScrollStateChangedListener(onScrollStateChangedListener);
    }

    public void replaceMenu(@MenuRes int i) {
        if (i != 0) {
            this.pendingMenuResId = 0;
            getMenu().clear();
            inflateMenu(i);
        }
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        this.materialShapeDrawable.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f7) {
        if (f7 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().setCradleVerticalOffset(f7);
            this.materialShapeDrawable.invalidateSelf();
            setCutoutStateAndTranslateFab();
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        this.materialShapeDrawable.setElevation(f7);
        getBehavior().setAdditionalHiddenOffsetY(this, this.materialShapeDrawable.getShadowRadius() - this.materialShapeDrawable.getShadowOffsetY());
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, @MenuRes int i3) {
        this.pendingMenuResId = i3;
        this.menuAnimatingWithFabAlignmentMode = true;
        maybeAnimateMenuView(i, this.fabAttached);
        maybeAnimateModeChange(i);
        this.fabAlignmentMode = i;
    }

    public void setFabAlignmentModeEndMargin(@Px int i) {
        if (this.fabAlignmentModeEndMargin != i) {
            this.fabAlignmentModeEndMargin = i;
            setCutoutStateAndTranslateFab();
        }
    }

    public void setFabAnchorMode(int i) {
        this.fabAnchorMode = i;
        setCutoutStateAndTranslateFab();
        View findDependentView = findDependentView();
        if (findDependentView != null) {
            updateFabAnchorGravity(this, findDependentView);
            findDependentView.requestLayout();
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i) {
        this.fabAnimationMode = i;
    }

    public void setFabCornerSize(@Dimension float f7) {
        if (f7 != getTopEdgeTreatment().getFabCornerRadius()) {
            getTopEdgeTreatment().setFabCornerSize(f7);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@Dimension float f7) {
        if (f7 != getFabCradleMargin()) {
            getTopEdgeTreatment().setFabCradleMargin(f7);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f7) {
        if (f7 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().setFabCradleRoundedCornerRadius(f7);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public boolean setFabDiameter(@Px int i) {
        float f7 = i;
        if (f7 != getTopEdgeTreatment().getFabDiameter()) {
            getTopEdgeTreatment().setFabDiameter(f7);
            this.materialShapeDrawable.invalidateSelf();
            return true;
        }
        return false;
    }

    public void setHideOnScroll(boolean z10) {
        this.hideOnScroll = z10;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.menuAlignmentMode != i) {
            this.menuAlignmentMode = i;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                translateActionMenuView(actionMenuView, this.fabAlignmentMode, isFabVisibleOrWillBeShown());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.navigationIconTint = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.SavedState.1
            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        int fabAlignmentMode;
        boolean fabAttached;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z10;
            this.fabAlignmentMode = parcel.readInt();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.fabAttached = z10;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.fabAlignmentMode);
            parcel.writeInt(this.fabAttached ? 1 : 0);
        }

        /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void performHide() {
        performHide(true);
    }

    public void performShow() {
        performShow(true);
    }

    private void translateActionMenuView(@NonNull ActionMenuView actionMenuView, int i, boolean z10) {
        translateActionMenuView(actionMenuView, i, z10, false);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        @NonNull
        private final Rect fabContentRect;
        private final View.OnLayoutChangeListener fabLayoutListener;
        private int originalBottomMargin;
        private WeakReference<BottomAppBar> viewRef;

        /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements View.OnLayoutChangeListener {
            public AnonymousClass1() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i3, int i8, int i10, int i11, int i12, int i13, int i14) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.viewRef.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.getMeasuredContentRect(Behavior.this.fabContentRect);
                        int height2 = Behavior.this.fabContentRect.height();
                        bottomAppBar.setFabDiameter(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(Behavior.this.fabContentRect)));
                        height = height2;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (Behavior.this.originalBottomMargin == 0) {
                        if (bottomAppBar.fabAnchorMode == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.isLayoutRtl(view)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                    }
                    bottomAppBar.setCutoutStateAndTranslateFab();
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.fabLayoutListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                public AnonymousClass1() {
                }

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i3, int i8, int i10, int i11, int i12, int i13, int i14) {
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.viewRef.get();
                    if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        int height = view.getHeight();
                        if (view instanceof FloatingActionButton) {
                            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                            floatingActionButton.getMeasuredContentRect(Behavior.this.fabContentRect);
                            int height2 = Behavior.this.fabContentRect.height();
                            bottomAppBar.setFabDiameter(height2);
                            bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(Behavior.this.fabContentRect)));
                            height = height2;
                        }
                        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                        if (Behavior.this.originalBottomMargin == 0) {
                            if (bottomAppBar.fabAnchorMode == 1) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                            }
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                            if (ViewUtils.isLayoutRtl(view)) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            }
                        }
                        bottomAppBar.setCutoutStateAndTranslateFab();
                        return;
                    }
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.fabContentRect = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i) {
            this.viewRef = new WeakReference<>(bottomAppBar);
            View findDependentView = bottomAppBar.findDependentView();
            if (findDependentView != null && !findDependentView.isLaidOut()) {
                BottomAppBar.updateFabAnchorGravity(bottomAppBar, findDependentView);
                this.originalBottomMargin = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) findDependentView.getLayoutParams())).bottomMargin;
                if (findDependentView instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) findDependentView;
                    if (bottomAppBar.fabAnchorMode == 0 && bottomAppBar.removeEmbeddedFabElevation) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.addFabAnimationListeners(floatingActionButton);
                }
                findDependentView.addOnLayoutChangeListener(this.fabLayoutListener);
                bottomAppBar.setCutoutStateAndTranslateFab();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i, int i3) {
            if (bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) bottomAppBar, view, view2, i, i3)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.fabLayoutListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                public AnonymousClass1() {
                }

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i3, int i8, int i10, int i11, int i12, int i13, int i14) {
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.viewRef.get();
                    if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        int height = view.getHeight();
                        if (view instanceof FloatingActionButton) {
                            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                            floatingActionButton.getMeasuredContentRect(Behavior.this.fabContentRect);
                            int height2 = Behavior.this.fabContentRect.height();
                            bottomAppBar.setFabDiameter(height2);
                            bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(Behavior.this.fabContentRect)));
                            height = height2;
                        }
                        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                        if (Behavior.this.originalBottomMargin == 0) {
                            if (bottomAppBar.fabAnchorMode == 1) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                            }
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                            if (ViewUtils.isLayoutRtl(view)) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.fabOffsetEndMode + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            }
                        }
                        bottomAppBar.setCutoutStateAndTranslateFab();
                        return;
                    }
                    view.removeOnLayoutChangeListener(this);
                }
            };
            this.fabContentRect = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public float getFabTranslationX() {
        return getFabTranslationX(this.fabAlignmentMode);
    }

    public BottomAppBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }
}
