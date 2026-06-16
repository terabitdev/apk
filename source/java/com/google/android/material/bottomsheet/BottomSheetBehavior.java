package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import f2.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements MaterialBackHandler {
    private static final int CORNER_ANIMATION_DURATION = 500;

    @VisibleForTesting
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_BottomSheet_Modal;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";

    @VisibleForTesting
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    private static final int VIEW_INDEX_BOTTOM_SHEET = 0;

    @Nullable
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;

    @Nullable
    private ColorStateList backgroundTint;

    @Nullable
    MaterialBottomContainerBackHelper bottomContainerBackHelper;

    @NonNull
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final ViewDragHelper.Callback dragCallback;

    @Nullable
    WeakReference<View> dragHandleViewRef;
    private boolean draggable;
    private boolean draggableOnNestedScroll;
    private boolean draggableOnNestedScrollLastDragIgnored;
    float elevation;

    @VisibleForTesting
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;

    @Nullable
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;

    @Nullable
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;

    @Nullable
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;

    @Nullable
    private VelocityTracker velocityTracker;

    @Nullable
    ViewDragHelper viewDragHelper;

    @Nullable
    WeakReference<V> viewRef;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface SaveFlags {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface StableState {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes4.dex */
    public @interface State {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    ViewDragHelper viewDragHelper = BottomSheetBehavior.this.viewDragHelper;
                    if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        public void continueSettlingToState(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                this.targetState = i;
                if (!this.isContinueSettlingRunnablePosted) {
                    BottomSheetBehavior.this.viewRef.get().postOnAnimation(this.continueSettlingRunnable);
                    this.isContinueSettlingRunnablePosted = true;
                }
            }
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.draggableOnNestedScroll = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(@NonNull View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i3, int i8) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i3, int i8) {
                return MathUtils.clamp(i3, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                boolean canBeHiddenByDragging = BottomSheetBehavior.this.canBeHiddenByDragging();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (canBeHiddenByDragging) {
                    return bottomSheetBehavior.parentHeight;
                }
                return bottomSheetBehavior.collapsedOffset;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i3) {
                if (i3 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i3, int i8, int i10, int i11) {
                BottomSheetBehavior.this.dispatchOnSlide(i8);
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            
                if (r2.shouldExpandOnUpwardDrag(r0, (r10 * 100.0f) / r2.parentHeight) != false) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
            
                if (r10 > r2.halfExpandedOffset) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
            
                if (java.lang.Math.abs(r9.getTop() - r8.this$0.getExpandedOffset()) < java.lang.Math.abs(r9.getTop() - r8.this$0.halfExpandedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
            
                if (java.lang.Math.abs(r10 - r0.fitToContentsOffset) < java.lang.Math.abs(r10 - r8.this$0.collapsedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onViewReleased(@NonNull View view, float f7, float f10) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = 6;
                if (f10 < 0.0f) {
                    if (!bottomSheetBehavior.fitToContents) {
                        int top = view.getTop();
                        long uptimeMillis = SystemClock.uptimeMillis() - this.viewCapturedMillis;
                        boolean shouldSkipHalfExpandedStateWhenDragging = BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        if (shouldSkipHalfExpandedStateWhenDragging) {
                        }
                    }
                    i3 = 3;
                } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f10)) {
                    if ((Math.abs(f7) < Math.abs(f10) && f10 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view)) {
                        i3 = 5;
                    } else {
                        if (!BottomSheetBehavior.this.fitToContents) {
                        }
                        i3 = 3;
                    }
                } else if (f10 != 0.0f && Math.abs(f7) <= Math.abs(f10)) {
                    if (!BottomSheetBehavior.this.fitToContents) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                        }
                    }
                    i3 = 4;
                } else {
                    int top3 = view.getTop();
                    boolean z10 = BottomSheetBehavior.this.fitToContents;
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!z10) {
                        int i8 = bottomSheetBehavior3.halfExpandedOffset;
                        if (top3 < i8) {
                            if (top3 >= Math.abs(top3 - bottomSheetBehavior3.collapsedOffset)) {
                            }
                            i3 = 3;
                        } else {
                            if (Math.abs(top3 - i8) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                            }
                            i3 = 4;
                        }
                    }
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i3, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i3) {
                View view2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i8 = bottomSheetBehavior.state;
                if (i8 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i8 == 3 && bottomSheetBehavior.activePointerId == i3) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    if (weakReference != null) {
                        view2 = weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = SystemClock.uptimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                if (weakReference2 == null || weakReference2.get() != view) {
                    return false;
                }
                return true;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).build();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setDraggableOnNestedScroll(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true));
        setSaveFlags(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int addAccessibilityActionForState(View view, @StringRes int i, int i3) {
        return ViewCompat.addAccessibilityAction(view, view.getResources().getString(i), createAccessibilityViewCommandForState(i3));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        boolean z10 = this.fitToContents;
        int i = this.parentHeight;
        if (z10) {
            this.collapsedOffset = Math.max(i - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = i - calculatePeekHeight;
        }
    }

    @RequiresApi(31)
    private float calculateCornerInterpolation(float f7, @Nullable RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f7 > 0.0f) {
                return radius / f7;
            }
        }
        return 0.0f;
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.materialShapeDrawable != null && (weakReference = this.viewRef) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v = this.viewRef.get();
            if (isAtTopOfScreen() && (rootWindowInsets = v.getRootWindowInsets()) != null) {
                return Math.max(calculateCornerInterpolation(this.materialShapeDrawable.getTopLeftCornerResolvedSize(), rootWindowInsets.getRoundedCorner(0)), calculateCornerInterpolation(this.materialShapeDrawable.getTopRightCornerResolvedSize(), rootWindowInsets.getRoundedCorner(1)));
            }
            return 0.0f;
        }
        return 0.0f;
    }

    private int calculatePeekHeight() {
        int i;
        if (this.peekHeightAuto) {
            return Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom;
        }
        if (!this.gestureInsetBottomIgnored && !this.paddingBottomSystemWindowInsets && (i = this.gestureInsetBottom) > 0) {
            return Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
        }
        return this.peekHeight + this.insetBottom;
    }

    private float calculateSlideOffsetWithTop(int i) {
        float f7;
        float f10;
        int i3 = this.collapsedOffset;
        if (i <= i3 && i3 != getExpandedOffset()) {
            int i8 = this.collapsedOffset;
            f7 = i8 - i;
            f10 = i8 - getExpandedOffset();
        } else {
            int i10 = this.collapsedOffset;
            f7 = i10 - i;
            f10 = this.parentHeight - i10;
        }
        return f7 / f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        if (isHideable() && isHideableWhenDragging()) {
            return true;
        }
        return false;
    }

    private void clearAccessibilityAction(View view, int i) {
        if (view != null) {
            ViewCompat.removeAccessibilityAction(view, 524288);
            ViewCompat.removeAccessibilityAction(view, 262144);
            ViewCompat.removeAccessibilityAction(view, 1048576);
            int i3 = this.expandHalfwayActionIds.get(i, -1);
            if (i3 != -1) {
                ViewCompat.removeAccessibilityAction(view, i3);
                this.expandHalfwayActionIds.delete(i);
            }
        }
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(final int i) {
        return new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
                BottomSheetBehavior.this.setState(i);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(@NonNull Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> from(@NonNull V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            i.k("The view is not associated with BottomSheetBehavior");
            return null;
        }
        i.k("The view is not a child of CoordinatorLayout");
        return null;
    }

    private int getChildMeasureSpec(int i, int i3, int i8, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i3, i10);
        if (i8 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i8 = Math.min(size, i8);
            }
            return View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i8), 1073741824);
    }

    private int getTopOffsetForState(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.halfExpandedOffset;
                    }
                    i.k(i6.m(i, "Invalid state to get top offset: "));
                    return 0;
                }
                return this.parentHeight;
            }
            return this.collapsedOffset;
        }
        return getExpandedOffset();
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.viewRef.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        if (this.state == 3) {
            if (this.shouldRemoveExpandedCorners || isAtTopOfScreen()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean isLayouting(V v) {
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    private boolean isTouchingDragHandle(@NonNull CoordinatorLayout coordinatorLayout, int i, int i3) {
        View view;
        WeakReference<View> weakReference = this.dragHandleViewRef;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view != null && coordinatorLayout.isPointInChildBounds(view, i, i3)) {
            return true;
        }
        return false;
    }

    private boolean isTouchingScrollingChild(@NonNull CoordinatorLayout coordinatorLayout, int i, int i3) {
        View view;
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view != null && coordinatorLayout.isPointInChildBounds(view, i, i3)) {
            return true;
        }
        return false;
    }

    private void replaceAccessibilityActionForState(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i) {
        ViewCompat.replaceAccessibilityAction(view, accessibilityActionCompat, null, createAccessibilityViewCommandForState(i));
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(@NonNull SavedState savedState) {
        int i = this.saveFlags;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.peekHeight = savedState.peekHeight;
            }
            if (i == -1 || (i & 2) == 2) {
                this.fitToContents = savedState.fitToContents;
            }
            if (i == -1 || (i & 4) == 4) {
                this.hideable = savedState.hideable;
            }
            if (i != -1 && (i & 8) != 8) {
                return;
            }
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v, Runnable runnable) {
        if (isLayouting(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(@NonNull View view) {
        final boolean z10;
        if (Build.VERSION.SDK_INT >= 29 && !isGestureInsetBottomIgnored() && !this.peekHeightAuto) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.paddingBottomSystemWindowInsets && !this.paddingLeftSystemWindowInsets && !this.paddingRightSystemWindowInsets && !this.marginLeftSystemWindowInsets && !this.marginRightSystemWindowInsets && !this.marginTopSystemWindowInsets && !z10) {
            return;
        }
        ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                boolean z11;
                int i;
                int i3;
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.mandatorySystemGestures());
                BottomSheetBehavior.this.insetTop = insets.top;
                boolean isLayoutRtl = ViewUtils.isLayoutRtl(view2);
                int paddingBottom = view2.getPaddingBottom();
                int paddingLeft = view2.getPaddingLeft();
                int paddingRight = view2.getPaddingRight();
                if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                    BottomSheetBehavior.this.insetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
                    paddingBottom = relativePadding.bottom + BottomSheetBehavior.this.insetBottom;
                }
                if (BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                    if (isLayoutRtl) {
                        i3 = relativePadding.end;
                    } else {
                        i3 = relativePadding.start;
                    }
                    paddingLeft = i3 + insets.left;
                }
                if (BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                    if (isLayoutRtl) {
                        i = relativePadding.start;
                    } else {
                        i = relativePadding.end;
                    }
                    paddingRight = i + insets.right;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                boolean z12 = true;
                if (BottomSheetBehavior.this.marginLeftSystemWindowInsets) {
                    int i8 = marginLayoutParams.leftMargin;
                    int i10 = insets.left;
                    if (i8 != i10) {
                        marginLayoutParams.leftMargin = i10;
                        z11 = true;
                        if (BottomSheetBehavior.this.marginRightSystemWindowInsets) {
                            int i11 = marginLayoutParams.rightMargin;
                            int i12 = insets.right;
                            if (i11 != i12) {
                                marginLayoutParams.rightMargin = i12;
                                z11 = true;
                            }
                        }
                        if (BottomSheetBehavior.this.marginTopSystemWindowInsets) {
                            int i13 = marginLayoutParams.topMargin;
                            int i14 = insets.top;
                            if (i13 != i14) {
                                marginLayoutParams.topMargin = i14;
                                if (z12) {
                                    view2.setLayoutParams(marginLayoutParams);
                                }
                                view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                                if (z10) {
                                    BottomSheetBehavior.this.gestureInsetBottom = insets2.bottom;
                                }
                                if (!BottomSheetBehavior.this.paddingBottomSystemWindowInsets || z10) {
                                    BottomSheetBehavior.this.updatePeekHeight(false);
                                    return windowInsetsCompat;
                                }
                                return windowInsetsCompat;
                            }
                        }
                        z12 = z11;
                        if (z12) {
                        }
                        view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                        if (z10) {
                        }
                        if (!BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                        }
                        BottomSheetBehavior.this.updatePeekHeight(false);
                        return windowInsetsCompat;
                    }
                }
                z11 = false;
                if (BottomSheetBehavior.this.marginRightSystemWindowInsets) {
                }
                if (BottomSheetBehavior.this.marginTopSystemWindowInsets) {
                }
                z12 = z11;
                if (z12) {
                }
                view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                if (z10) {
                }
                if (!BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                }
                BottomSheetBehavior.this.updatePeekHeight(false);
                return windowInsetsCompat;
            }
        });
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            if (this.draggable || this.state == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i, boolean z10) {
        int topOffsetForState = getTopOffsetForState(i);
        ViewDragHelper viewDragHelper = this.viewDragHelper;
        if (viewDragHelper != null && (!z10 ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), topOffsetForState) : viewDragHelper.settleCapturedViewAt(view.getLeft(), topOffsetForState))) {
            setStateInternal(2);
            updateDrawableForTargetState(i, true);
            this.stateSettlingTracker.continueSettlingToState(i);
            return;
        }
        setStateInternal(i);
    }

    private void updateAccessibilityActions(View view, int i) {
        if (view != null) {
            clearAccessibilityAction(view, i);
            int i3 = 6;
            if (!this.fitToContents && this.state != 6) {
                this.expandHalfwayActionIds.put(i, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
            }
            if (this.hideable && isHideableWhenDragging() && this.state != 5) {
                replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, 5);
            }
            int i8 = this.state;
            if (i8 != 3) {
                if (i8 != 4) {
                    if (i8 != 6) {
                        return;
                    }
                    replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, 4);
                    replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, 3);
                    return;
                }
                if (this.fitToContents) {
                    i3 = 3;
                }
                replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, i3);
                return;
            }
            if (this.fitToContents) {
                i3 = 4;
            }
            replaceAccessibilityActionForState(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, i3);
        }
    }

    private void updateDrawableForTargetState(int i, boolean z10) {
        boolean isExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i != 2 && this.expandedCornersRemoved != (isExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) && this.materialShapeDrawable != null) {
            this.expandedCornersRemoved = isExpandedAndShouldRemoveCorners;
            float f7 = 1.0f;
            if (z10 && (valueAnimator = this.interpolatorAnimator) != null) {
                if (valueAnimator.isRunning()) {
                    this.interpolatorAnimator.reverse();
                    return;
                }
                float interpolation = this.materialShapeDrawable.getInterpolation();
                if (isExpandedAndShouldRemoveCorners) {
                    f7 = calculateInterpolationWithCornersRemoved();
                }
                this.interpolatorAnimator.setFloatValues(interpolation, f7);
                this.interpolatorAnimator.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (this.expandedCornersRemoved) {
                f7 = calculateInterpolationWithCornersRemoved();
            }
            materialShapeDrawable.setInterpolation(f7);
        }
    }

    private void updateImportantForAccessibility(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.importantForAccessibilityMap == null) {
                        this.importantForAccessibilityMap = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.viewRef.get()) {
                        if (z10) {
                            this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.updateImportantForAccessibilityOnSiblings) {
                                childAt.setImportantForAccessibility(4);
                            }
                        } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(this.importantForAccessibilityMap.get(childAt).intValue());
                        }
                    }
                }
                if (!z10) {
                    this.importantForAccessibilityMap = null;
                } else if (this.updateImportantForAccessibilityOnSiblings) {
                    this.viewRef.get().sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z10) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state == 4 && (v = this.viewRef.get()) != null) {
                if (z10) {
                    setState(4);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    public void addBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        if (!this.callbacks.contains(bottomSheetCallback)) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
        }
        return -1.0f;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.cancelBackProgress();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i) {
        V v = this.viewRef.get();
        if (v != null && !this.callbacks.isEmpty()) {
            float calculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i);
            for (int i3 = 0; i3 < this.callbacks.size(); i3++) {
                this.callbacks.get(i3).onSlide(v, calculateSlideOffsetWithTop);
            }
        }
    }

    @Nullable
    @VisibleForTesting
    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    public MaterialBottomContainerBackHelper getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        int i;
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        int i3 = this.expandedOffset;
        if (this.paddingTopSystemWindowInsets) {
            i = 0;
        } else {
            i = this.insetTop;
        }
        return Math.max(i3, i);
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getLastStableState() {
        return this.lastStableState;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    @Px
    public int getMaxHeight() {
        return this.maxHeight;
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    @VisibleForTesting
    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        BackEventCompat onHandleBackInvoked = materialBottomContainerBackHelper.onHandleBackInvoked();
        int i = 4;
        if (onHandleBackInvoked != null && Build.VERSION.SDK_INT >= 34) {
            boolean z10 = this.hideable;
            MaterialBottomContainerBackHelper materialBottomContainerBackHelper2 = this.bottomContainerBackHelper;
            if (z10) {
                materialBottomContainerBackHelper2.finishBackProgressNotPersistent(onHandleBackInvoked, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        BottomSheetBehavior.this.setStateInternal(5);
                        WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
                        if (weakReference != null && weakReference.get() != null) {
                            BottomSheetBehavior.this.viewRef.get().requestLayout();
                        }
                    }
                });
                return;
            } else {
                materialBottomContainerBackHelper2.finishBackProgressPersistent(onHandleBackInvoked, null);
                setState(4);
                return;
            }
        }
        if (this.hideable) {
            i = 5;
        }
        setState(i);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isDraggableOnNestedScroll() {
        return this.draggableOnNestedScroll;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isHideableWhenDragging() {
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        boolean z10;
        View view;
        int i;
        ViewDragHelper viewDragHelper;
        if (v.isShown() && this.draggable) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reset();
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.touchingScrollingChild = false;
                    this.activePointerId = -1;
                    if (this.ignoreEvents) {
                        this.ignoreEvents = false;
                        return false;
                    }
                }
            } else {
                int x5 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                this.initialY = y10;
                if (this.state != 2 && isTouchingScrollingChild(coordinatorLayout, x5, y10)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    if (!isTouchingDragHandle(coordinatorLayout, x5, this.initialY)) {
                        this.touchingScrollingChild = true;
                    }
                }
                if (this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x5, this.initialY)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.ignoreEvents = z10;
            }
            if (!this.ignoreEvents && (viewDragHelper = this.viewDragHelper) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference = this.nestedScrollingChildRef;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            if (actionMasked != 2 || view == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || (i = this.initialY) == -1 || Math.abs(i - motionEvent.getY()) <= this.viewDragHelper.getTouchSlop()) {
                return false;
            }
            return true;
        }
        this.ignoreEvents = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v);
            ViewCompat.setWindowInsetsAnimationCallback(v, new InsetsAnimationCallback(v));
            this.viewRef = new WeakReference<>(v);
            this.bottomContainerBackHelper = new MaterialBottomContainerBackHelper(v);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                v.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float f7 = this.elevation;
                if (f7 == -1.0f) {
                    f7 = v.getElevation();
                }
                materialShapeDrawable2.setElevation(f7);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            updateAccessibilityActions();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        int i3 = this.parentHeight;
        int i8 = i3 - height;
        int i10 = this.insetTop;
        if (i8 < i10) {
            boolean z10 = this.paddingTopSystemWindowInsets;
            int i11 = this.maxHeight;
            if (z10) {
                if (i11 != -1) {
                    i3 = Math.min(i3, i11);
                }
                this.childHeight = i3;
            } else {
                int i12 = i3 - i10;
                if (i11 != -1) {
                    i12 = Math.min(i12, i11);
                }
                this.childHeight = i12;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i13 = this.state;
        if (i13 == 3) {
            ViewCompat.offsetTopAndBottom(v, getExpandedOffset());
        } else if (i13 == 6) {
            ViewCompat.offsetTopAndBottom(v, this.halfExpandedOffset);
        } else if (this.hideable && i13 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.parentHeight);
        } else if (i13 == 4) {
            ViewCompat.offsetTopAndBottom(v, this.collapsedOffset);
        } else if (i13 == 1 || i13 == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        for (int i14 = 0; i14 < this.callbacks.size(); i14++) {
            this.callbacks.get(i14).onLayout(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i3, int i8, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f7, float f10) {
        WeakReference<View> weakReference;
        if (!isNestedScrollingCheckEnabled() || (weakReference = this.nestedScrollingChildRef) == null || view != weakReference.get() || ((this.state == 3 || this.draggableOnNestedScrollLastDragIgnored) && !super.onNestedPreFling(coordinatorLayout, v, view, f7, f10))) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i3, @NonNull int[] iArr, int i8) {
        View view2;
        if (i8 != 1) {
            WeakReference<View> weakReference = this.nestedScrollingChildRef;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (!isNestedScrollingCheckEnabled() || view == view2) {
                int top = v.getTop();
                int i10 = top - i3;
                if (i3 > 0) {
                    if (!this.nestedScrolled && !this.draggableOnNestedScroll && view == view2 && view.canScrollVertically(1)) {
                        this.draggableOnNestedScrollLastDragIgnored = true;
                        return;
                    }
                    if (i10 < getExpandedOffset()) {
                        int expandedOffset = top - getExpandedOffset();
                        iArr[1] = expandedOffset;
                        ViewCompat.offsetTopAndBottom(v, -expandedOffset);
                        setStateInternal(3);
                    } else if (this.draggable) {
                        iArr[1] = i3;
                        ViewCompat.offsetTopAndBottom(v, -i3);
                        setStateInternal(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0) {
                    boolean canScrollVertically = view.canScrollVertically(-1);
                    if (!this.nestedScrolled && !this.draggableOnNestedScroll && view == view2 && canScrollVertically) {
                        this.draggableOnNestedScrollLastDragIgnored = true;
                        return;
                    }
                    if (!canScrollVertically) {
                        if (i10 > this.collapsedOffset && !canBeHiddenByDragging()) {
                            int i11 = top - this.collapsedOffset;
                            iArr[1] = i11;
                            ViewCompat.offsetTopAndBottom(v, -i11);
                            setStateInternal(4);
                        } else {
                            if (!this.draggable) {
                                return;
                            }
                            iArr[1] = i3;
                            ViewCompat.offsetTopAndBottom(v, -i3);
                            setStateInternal(1);
                        }
                    }
                }
                dispatchOnSlide(v.getTop());
                this.lastNestedScrollDy = i3;
                this.nestedScrolled = true;
                this.draggableOnNestedScrollLastDragIgnored = false;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i = savedState.state;
        if (i != 1 && i != 2) {
            this.state = i;
            this.lastStableState = i;
        } else {
            this.state = 4;
            this.lastStableState = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i3) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.halfExpandedOffset) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        WeakReference<View> weakReference;
        int i3 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (isNestedScrollingCheckEnabled() && ((weakReference = this.nestedScrollingChildRef) == null || view != weakReference.get() || !this.nestedScrolled)) {
            return;
        }
        if (this.lastNestedScrollDy > 0) {
            if (!this.fitToContents) {
            }
            startSettling(v, i3, false);
            this.nestedScrolled = false;
        }
        if (this.hideable && shouldHide(v, getYVelocity())) {
            i3 = 5;
        } else if (this.lastNestedScrollDy == 0) {
            int top = v.getTop();
            if (!this.fitToContents) {
                int i8 = this.halfExpandedOffset;
                if (top < i8) {
                    if (top >= Math.abs(top - this.collapsedOffset)) {
                    }
                }
            }
        } else {
            if (!this.fitToContents) {
                int top2 = v.getTop();
            }
            i3 = 4;
        }
        startSettling(v, i3, false);
        this.nestedScrolled = false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.getTouchSlop()) {
            this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(@NonNull BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setAccessibilityDelegateView(@Nullable View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.accessibilityDelegateViewRef) != null) {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        } else {
            this.accessibilityDelegateViewRef = new WeakReference<>(view);
            updateAccessibilityActions(view, 1);
        }
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDragHandleView(@Nullable BottomSheetDragHandleView bottomSheetDragHandleView) {
        WeakReference<View> weakReference;
        if (bottomSheetDragHandleView != null) {
            weakReference = new WeakReference<>(bottomSheetDragHandleView);
        } else {
            weakReference = null;
        }
        this.dragHandleViewRef = weakReference;
    }

    public void setDraggable(boolean z10) {
        this.draggable = z10;
    }

    public void setDraggableOnNestedScroll(boolean z10) {
        this.draggableOnNestedScroll = z10;
    }

    public void setExpandedOffset(int i) {
        if (i >= 0) {
            this.expandedOffset = i;
            updateDrawableForTargetState(this.state, true);
        } else {
            i.k("offset must be greater than or equal to 0");
        }
    }

    public void setFitToContents(boolean z10) {
        int i;
        if (this.fitToContents == z10) {
            return;
        }
        this.fitToContents = z10;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        if (this.fitToContents && this.state == 6) {
            i = 3;
        } else {
            i = this.state;
        }
        setStateInternal(i);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z10) {
        this.gestureInsetBottomIgnored = z10;
    }

    public void setHalfExpandedRatio(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f7) {
        if (f7 > 0.0f && f7 < 1.0f) {
            this.halfExpandedRatio = f7;
            if (this.viewRef != null) {
                calculateHalfExpandedOffset();
                return;
            }
            return;
        }
        i.k("ratio must be a float value between 0 and 1");
    }

    public void setHideFriction(float f7) {
        this.hideFriction = f7;
    }

    public void setHideable(boolean z10) {
        if (this.hideable != z10) {
            this.hideable = z10;
            if (!z10 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setHideableInternal(boolean z10) {
        this.hideable = z10;
    }

    public void setMaxHeight(@Px int i) {
        this.maxHeight = i;
    }

    public void setMaxWidth(@Px int i) {
        this.maxWidth = i;
    }

    public final void setPeekHeight(int i, boolean z10) {
        boolean z11 = this.peekHeightAuto;
        if (i == -1) {
            if (!z11) {
                this.peekHeightAuto = true;
            } else {
                return;
            }
        } else {
            if (!z11 && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        updatePeekHeight(z10);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setShouldRemoveExpandedCorners(boolean z10) {
        if (this.shouldRemoveExpandedCorners != z10) {
            this.shouldRemoveExpandedCorners = z10;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i) {
        this.significantVelocityThreshold = i;
    }

    public void setSkipCollapsed(boolean z10) {
        this.skipCollapsed = z10;
    }

    public void setState(int i) {
        String str;
        final int i3;
        if (i != 1 && i != 2) {
            if (!this.hideable && i == 5) {
                i6.t(i, "Cannot set state: ", TAG);
                return;
            }
            if (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) {
                i3 = 3;
            } else {
                i3 = i;
            }
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                final V v = this.viewRef.get();
                runAfterLayout(v, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BottomSheetBehavior.this.startSettling(v, i3, false);
                    }
                });
                return;
            } else {
                setStateInternal(i);
                return;
            }
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(i6.q(sb, str, " should not be set externally."));
    }

    public void setStateInternal(int i) {
        V v;
        if (this.state != i) {
            this.state = i;
            if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
                this.lastStableState = i;
            }
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference == null || (v = weakReference.get()) == null) {
                return;
            }
            if (i == 3) {
                updateImportantForAccessibility(true);
            } else if (i == 6 || i == 5 || i == 4) {
                updateImportantForAccessibility(false);
            }
            updateDrawableForTargetState(i, true);
            for (int i3 = 0; i3 < this.callbacks.size(); i3++) {
                this.callbacks.get(i3).onStateChanged(v, i);
            }
            updateAccessibilityActions();
        }
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z10) {
        this.updateImportantForAccessibilityOnSiblings = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldExpandOnUpwardDrag(long j, @FloatRange(from = 0.0d, to = 100.0d) float f7) {
        return false;
    }

    public boolean shouldHide(@NonNull View view, float f7) {
        if (this.skipCollapsed) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.collapsedOffset) {
            return false;
        }
        if (Math.abs(((f7 * this.hideFriction) + view.getTop()) - this.collapsedOffset) / calculatePeekHeight() > 0.5f) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.startBackProgress(backEventCompat);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.bottomContainerBackHelper;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.updateBackProgress(backEventCompat);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static abstract class BottomSheetCallback {
        public abstract void onSlide(@NonNull View view, float f7);

        public abstract void onStateChanged(@NonNull View view, int i);

        public void onLayout(@NonNull View view) {
        }
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z10;
            boolean z11;
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            if (parcel.readInt() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.fitToContents = z10;
            if (parcel.readInt() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.hideable = z11;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.draggableOnNestedScroll = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = 0.1f;
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(@NonNull View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(@NonNull View view, int i3, int i8) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(@NonNull View view, int i3, int i8) {
                return MathUtils.clamp(i3, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(@NonNull View view) {
                boolean canBeHiddenByDragging = BottomSheetBehavior.this.canBeHiddenByDragging();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (canBeHiddenByDragging) {
                    return bottomSheetBehavior.parentHeight;
                }
                return bottomSheetBehavior.collapsedOffset;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i3) {
                if (i3 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(@NonNull View view, int i3, int i8, int i10, int i11) {
                BottomSheetBehavior.this.dispatchOnSlide(i8);
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            
                if (r2.shouldExpandOnUpwardDrag(r0, (r10 * 100.0f) / r2.parentHeight) != false) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
            
                if (r10 > r2.halfExpandedOffset) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
            
                if (java.lang.Math.abs(r9.getTop() - r8.this$0.getExpandedOffset()) < java.lang.Math.abs(r9.getTop() - r8.this$0.halfExpandedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
            
                if (java.lang.Math.abs(r10 - r0.fitToContentsOffset) < java.lang.Math.abs(r10 - r8.this$0.collapsedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onViewReleased(@NonNull View view, float f7, float f10) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = 6;
                if (f10 < 0.0f) {
                    if (!bottomSheetBehavior.fitToContents) {
                        int top = view.getTop();
                        long uptimeMillis = SystemClock.uptimeMillis() - this.viewCapturedMillis;
                        boolean shouldSkipHalfExpandedStateWhenDragging = BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        if (shouldSkipHalfExpandedStateWhenDragging) {
                        }
                    }
                    i3 = 3;
                } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f10)) {
                    if ((Math.abs(f7) < Math.abs(f10) && f10 > BottomSheetBehavior.this.significantVelocityThreshold) || releasedLow(view)) {
                        i3 = 5;
                    } else {
                        if (!BottomSheetBehavior.this.fitToContents) {
                        }
                        i3 = 3;
                    }
                } else if (f10 != 0.0f && Math.abs(f7) <= Math.abs(f10)) {
                    if (!BottomSheetBehavior.this.fitToContents) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.halfExpandedOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                        }
                    }
                    i3 = 4;
                } else {
                    int top3 = view.getTop();
                    boolean z10 = BottomSheetBehavior.this.fitToContents;
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!z10) {
                        int i8 = bottomSheetBehavior3.halfExpandedOffset;
                        if (top3 < i8) {
                            if (top3 >= Math.abs(top3 - bottomSheetBehavior3.collapsedOffset)) {
                            }
                            i3 = 3;
                        } else {
                            if (Math.abs(top3 - i8) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                            }
                            i3 = 4;
                        }
                    }
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i3, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(@NonNull View view, int i3) {
                View view2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i8 = bottomSheetBehavior.state;
                if (i8 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i8 == 3 && bottomSheetBehavior.activePointerId == i3) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    if (weakReference != null) {
                        view2 = weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = SystemClock.uptimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                if (weakReference2 == null || weakReference2.get() != view) {
                    return false;
                }
                return true;
            }
        };
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i3, int i8, int i10, int i11, @NonNull int[] iArr) {
    }
}
