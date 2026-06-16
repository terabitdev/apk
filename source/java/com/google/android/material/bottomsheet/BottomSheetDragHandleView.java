package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.inputmethod.b;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_BottomSheet_DragHandle;

    @Nullable
    private final AccessibilityManager accessibilityManager;

    @Nullable
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    private final String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final String clickToExpandActionLabel;
    private final GestureDetector gestureDetector;
    private final GestureDetector.OnGestureListener gestureListener;
    private boolean hasClickListener;
    private boolean hasTouchListener;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 extends GestureDetector.SimpleOnGestureListener {
        public AnonymousClass2() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(@NonNull MotionEvent motionEvent) {
            if (BottomSheetDragHandleView.this.bottomSheetBehavior != null && BottomSheetDragHandleView.this.bottomSheetBehavior.isHideable()) {
                BottomSheetDragHandleView.this.bottomSheetBehavior.setState(5);
                return true;
            }
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(@NonNull MotionEvent motionEvent) {
            return BottomSheetDragHandleView.this.isClickable();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(@NonNull MotionEvent motionEvent) {
            return BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$3 */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 extends AccessibilityDelegateCompat {
        public AnonymousClass3() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.hasTouchListener = false;
        this.hasClickListener = false;
        this.clickToExpandActionLabel = getResources().getString(R.string.bottomsheet_action_expand);
        this.clickToCollapseActionLabel = getResources().getString(R.string.bottomsheet_action_collapse);
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            public AnonymousClass1() {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(@NonNull View view, int i3) {
                BottomSheetDragHandleView.this.onBottomSheetStateChanged(i3);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(@NonNull View view, float f7) {
            }
        };
        AnonymousClass2 anonymousClass2 = new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            public AnonymousClass2() {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(@NonNull MotionEvent motionEvent) {
                if (BottomSheetDragHandleView.this.bottomSheetBehavior != null && BottomSheetDragHandleView.this.bottomSheetBehavior.isHideable()) {
                    BottomSheetDragHandleView.this.bottomSheetBehavior.setState(5);
                    return true;
                }
                return super.onDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(@NonNull MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.isClickable();
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(@NonNull MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
            }
        };
        this.gestureListener = anonymousClass2;
        Context context2 = getContext();
        this.gestureDetector = new GestureDetector(context2, anonymousClass2, new Handler(Looper.getMainLooper()));
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.3
            public AnonymousClass3() {
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
                }
            }
        });
    }

    public static /* synthetic */ boolean a(BottomSheetDragHandleView bottomSheetDragHandleView, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return bottomSheetDragHandleView.lambda$onBottomSheetStateChanged$0(view, commandArguments);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r1 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean expandOrCollapseBottomSheetIfPossible() {
        boolean z10 = false;
        if (!hasAttachedBehavior()) {
            return false;
        }
        if (!this.bottomSheetBehavior.isFitToContents() && !this.bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
            z10 = true;
        }
        int state = this.bottomSheetBehavior.getState();
        int i = 6;
        int i3 = 3;
        if (state != 4) {
            if (state == 3) {
                if (!z10) {
                    i = 4;
                }
                this.bottomSheetBehavior.setState(i);
                return true;
            }
            if (!this.clickToExpand) {
                i3 = 4;
            }
            i = i3;
            this.bottomSheetBehavior.setState(i);
            return true;
        }
    }

    @Nullable
    private BottomSheetBehavior<?> findParentBottomSheetBehavior() {
        View view = this;
        while (true) {
            view = getParentView(view);
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                    if (behavior instanceof BottomSheetBehavior) {
                        return (BottomSheetBehavior) behavior;
                    }
                }
            } else {
                return null;
            }
        }
    }

    @Nullable
    private static View getParentView(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    private boolean hasAttachedBehavior() {
        if (this.bottomSheetBehavior != null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean lambda$onBottomSheetStateChanged$0(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return expandOrCollapseBottomSheetIfPossible();
    }

    public void onBottomSheetStateChanged(int i) {
        String str;
        if (i == 4) {
            this.clickToExpand = true;
        } else if (i == 3) {
            this.clickToExpand = false;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK;
        if (this.clickToExpand) {
            str = this.clickToExpandActionLabel;
        } else {
            str = this.clickToCollapseActionLabel;
        }
        ViewCompat.replaceAccessibilityAction(this, accessibilityActionCompat, str, new b(this, 3));
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.bottomSheetCallback);
            this.bottomSheetBehavior.setAccessibilityDelegateView(null);
            this.bottomSheetBehavior.setDragHandleView(null);
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView(this);
            this.bottomSheetBehavior.setDragHandleView(this);
            onBottomSheetStateChanged(this.bottomSheetBehavior.getState());
            this.bottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        }
        setClickable(hasAttachedBehavior());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(findParentBottomSheetBehavior());
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.hasClickListener && !this.hasTouchListener) {
            return this.gestureDetector.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        boolean z10;
        if (onClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.hasClickListener = z10;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        boolean z10;
        if (onTouchListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.hasTouchListener = z10;
        super.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends BottomSheetBehavior.BottomSheetCallback {
        public AnonymousClass1() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i3) {
            BottomSheetDragHandleView.this.onBottomSheetStateChanged(i3);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f7) {
        }
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }
}
