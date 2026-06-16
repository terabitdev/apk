package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.m;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.foundation.gestures.x;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import f2.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final int HALO_ALPHA = 63;
    private static final float LEFT_LABEL_PIVOT_X = 1.2f;
    private static final float LEFT_LABEL_PIVOT_Y = 0.5f;
    private static final int MAX_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY = 120000;
    private static final int MIN_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY = 10000;
    private static final float RIGHT_LABEL_PIVOT_X = -0.2f;
    private static final float RIGHT_LABEL_PIVOT_Y = 0.5f;
    private static final String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    private static final float TOP_LABEL_PIVOT_X = 0.5f;
    private static final float TOP_LABEL_PIVOT_Y = 1.2f;
    private static final float TOUCH_SLOP_RATIO = 0.8f;
    private static final int TRACK_CORNER_SIZE_UNSET = -1;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private static final String WARNING_PARSE_ERROR = "Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;

    @NonNull
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;

    @NonNull
    private final Paint activeTicksPaint;

    @NonNull
    private final Paint activeTrackPaint;

    @NonNull
    private final RectF activeTrackRect;
    private boolean centered;

    @NonNull
    private final List<L> changeListeners;

    @NonNull
    private final RectF cornerRect;

    @Nullable
    private Drawable customThumbDrawable;

    @NonNull
    private List<Drawable> customThumbDrawablesForValues;

    @NonNull
    private final MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackThickness;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;

    @NonNull
    private ColorStateList haloColor;

    @NonNull
    private final Paint haloPaint;
    private int haloRadius;

    @NonNull
    private final Rect iconRect;

    @NonNull
    private final RectF iconRectF;

    @NonNull
    private final Paint inactiveTicksPaint;

    @NonNull
    private final RectF inactiveTrackLeftRect;

    @NonNull
    private final Paint inactiveTrackPaint;

    @NonNull
    private final RectF inactiveTrackRightRect;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;

    @NonNull
    private final Rect labelRect;
    private int labelStyle;

    @NonNull
    private final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTickSpacing;

    @Px
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetThickness;

    @NonNull
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;

    @NonNull
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;

    @NonNull
    private final Runnable resetActiveThumbIndex;

    @NonNull
    private final Matrix rotationMatrix;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;

    @NonNull
    private final Paint stopIndicatorPaint;
    private boolean thisAndAncestorsVisible;
    private int thumbHeight;
    private boolean thumbIsPressed;

    @NonNull
    private final Paint thumbPaint;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;

    @NonNull
    private ColorStateList tickColorActive;

    @NonNull
    private ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private int tickVisibilityMode;
    private float[] ticksCoordinates;
    private final int tooltipTimeoutMillis;
    private float touchDownAxis1;
    private float touchDownAxis2;

    @NonNull
    private final List<T> touchListeners;
    private float touchPosition;

    @NonNull
    private ColorStateList trackColorActive;

    @NonNull
    private ColorStateList trackColorInactive;
    private int trackCornerSize;

    @Nullable
    private ColorStateList trackIconActiveColor;

    @Nullable
    private Drawable trackIconActiveEnd;
    private boolean trackIconActiveEndMutated;

    @Nullable
    private Drawable trackIconActiveStart;
    private boolean trackIconActiveStartMutated;

    @Nullable
    private ColorStateList trackIconInactiveColor;

    @Nullable
    private Drawable trackIconInactiveEnd;
    private boolean trackIconInactiveEndMutated;

    @Nullable
    private Drawable trackIconInactiveStart;
    private boolean trackIconInactiveStartMutated;

    @Px
    private int trackIconPadding;

    @Px
    private int trackIconSize;
    private int trackInsideCornerSize;

    @NonNull
    private final Path trackPath;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackThickness;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetOrientation;
    private int widgetThickness;
    static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Slider;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = R.attr.motionDurationMedium4;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = R.attr.motionDurationShort3;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public class AccessibilityEventSender implements Runnable {
        int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.virtualViewId, 4);
        }

        public void setVirtualViewId(int i) {
            this.virtualViewId = i;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class AccessibilityHelper extends ExploreByTouchHelper {
        private final BaseSlider<?, ?, ?> slider;
        final Rect virtualViewBounds;

        public AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.virtualViewBounds = new Rect();
            this.slider = baseSlider;
        }

        @NonNull
        private String startOrEndDescription(int i) {
            if (i == this.slider.getValues().size() - 1) {
                return this.slider.getContext().getString(R.string.material_slider_range_end);
            }
            if (i == 0) {
                return this.slider.getContext().getString(R.string.material_slider_range_start);
            }
            return "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f7, float f10) {
            for (int i = 0; i < this.slider.getValues().size(); i++) {
                this.slider.updateBoundsForVirtualViewId(i, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f7, (int) f10)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(@NonNull List<Integer> list) {
            for (int i = 0; i < this.slider.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i, int i3, @Nullable Bundle bundle) {
            if (!this.slider.isEnabled()) {
                return false;
            }
            if (i3 == 4096 || i3 == 8192) {
                float calculateStepIncrement = this.slider.calculateStepIncrement(20);
                if (i3 == 8192) {
                    calculateStepIncrement = -calculateStepIncrement;
                }
                if (this.slider.isRtl()) {
                    calculateStepIncrement = -calculateStepIncrement;
                }
                if (!this.slider.snapThumbToValue(i, MathUtils.clamp(this.slider.getValues().get(i).floatValue() + calculateStepIncrement, this.slider.getValueFrom(), this.slider.getValueTo()))) {
                    return false;
                }
                this.slider.setActiveThumbIndex(i);
                this.slider.scheduleTooltipTimeout();
                this.slider.updateHaloHotspot();
                this.slider.postInvalidate();
                invalidateVirtualView(i);
                return true;
            }
            if (i3 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                if (this.slider.snapThumbToValue(i, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                    this.slider.updateHaloHotspot();
                    this.slider.postInvalidate();
                    invalidateVirtualView(i);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.slider.getValues();
            Float f7 = values.get(i);
            float floatValue = f7.floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (floatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (floatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                floatValue = numberInstance.parse(numberInstance.format(floatValue)).floatValue();
            } catch (ParseException unused) {
                Log.w(BaseSlider.TAG, "Error parsing value(" + f7 + "), valueFrom(" + valueFrom + "), and valueTo(" + valueTo + ") into a float.");
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, floatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb.append(this.slider.getContentDescription());
                sb.append(",");
            }
            String formatValue = this.slider.formatValue(floatValue);
            String string = this.slider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i);
            }
            CharSequence stateDescription = ViewCompat.getStateDescription(this.slider);
            if (!TextUtils.isEmpty(stateDescription)) {
                accessibilityNodeInfoCompat.setStateDescription(stateDescription);
            } else {
                Locale.getDefault();
                sb.append(string + ", " + formatValue);
            }
            accessibilityNodeInfoCompat.setContentDescription(sb.toString());
            this.slider.updateBoundsForVirtualViewId(i, this.virtualViewBounds);
            accessibilityNodeInfoCompat.setBoundsInParent(this.virtualViewBounds);
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Orientation {
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.defaultThumbWidth = -1;
        this.defaultThumbTrackGapSize = -1;
        this.centered = false;
        this.trackIconActiveStartMutated = false;
        this.trackIconActiveEndMutated = false;
        this.trackIconInactiveStartMutated = false;
        this.trackIconInactiveEndMutated = false;
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.isLongPress = false;
        this.trackPath = new Path();
        this.activeTrackRect = new RectF();
        this.inactiveTrackLeftRect = new RectF();
        this.inactiveTrackRightRect = new RectF();
        this.cornerRect = new RectF();
        this.labelRect = new Rect();
        this.iconRectF = new RectF();
        this.iconRect = new Rect();
        this.rotationMatrix = new Matrix();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.defaultThumbDrawable = materialShapeDrawable;
        this.customThumbDrawablesForValues = Collections.EMPTY_LIST;
        this.separationUnit = 0;
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BaseSlider.this.updateLabels();
            }
        };
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BaseSlider.this.updateLabels();
            }
        };
        this.resetActiveThumbIndex = new Runnable() { // from class: com.google.android.material.slider.d
            @Override // java.lang.Runnable
            public final void run() {
                BaseSlider.this.lambda$new$0();
            }
        };
        Context context2 = getContext();
        this.thisAndAncestorsVisible = isShown();
        this.inactiveTrackPaint = new Paint();
        this.activeTrackPaint = new Paint();
        Paint paint = new Paint(1);
        this.thumbPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.haloPaint = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.inactiveTicksPaint = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.activeTicksPaint = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.stopIndicatorPaint = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        loadResources(context2.getResources());
        processAttributes(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper;
        ViewCompat.setAccessibilityDelegate(this, accessibilityHelper);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.accessibilityManager = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.tooltipTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.tooltipTimeoutMillis = MAX_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY;
        }
    }

    private void adjustCustomThumbDrawableBounds(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        } else {
            float max = Math.max(this.thumbWidth, this.thumbHeight) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    private void calculateBoundsAndDrawTrackIcon(@NonNull Canvas canvas, @NonNull RectF rectF, @Nullable Drawable drawable, boolean z10) {
        if (drawable != null) {
            calculateTrackIconBounds(rectF, this.iconRectF, this.trackIconSize, this.trackIconPadding, z10);
            if (!this.iconRectF.isEmpty()) {
                drawTrackIcon(canvas, this.iconRectF, drawable);
            }
        }
    }

    private float calculateEndTrackCornerSize(float f7) {
        int i;
        if (!this.values.isEmpty() && hasGapBetweenThumbAndTrack()) {
            if (!isRtl() && !isVertical()) {
                i = this.values.size() - 1;
            } else {
                i = 0;
            }
            float valueToX = valueToX(this.values.get(i).floatValue()) - this.trackSidePadding;
            int i3 = this.trackWidth;
            if (valueToX > i3 - f7) {
                return Math.max(i3 - valueToX, this.trackInsideCornerSize);
            }
            return f7;
        }
        return f7;
    }

    @Nullable
    private Float calculateIncrementForKey(int i) {
        float calculateStepIncrement;
        if (this.isLongPress) {
            calculateStepIncrement = calculateStepIncrement(20);
        } else {
            calculateStepIncrement = calculateStepIncrement();
        }
        if (i != 69) {
            if (i != 70 && i != 81) {
                switch (i) {
                    case 19:
                        if (!isVertical()) {
                            return null;
                        }
                        return Float.valueOf(calculateStepIncrement);
                    case 20:
                        if (!isVertical()) {
                            return null;
                        }
                        return Float.valueOf(-calculateStepIncrement);
                    case 21:
                        if (!isRtl()) {
                            calculateStepIncrement = -calculateStepIncrement;
                        }
                        return Float.valueOf(calculateStepIncrement);
                    case 22:
                        if (isRtl()) {
                            calculateStepIncrement = -calculateStepIncrement;
                        }
                        return Float.valueOf(calculateStepIncrement);
                    default:
                        return null;
                }
            }
            return Float.valueOf(calculateStepIncrement);
        }
        return Float.valueOf(-calculateStepIncrement);
    }

    private void calculateLabelBounds(TooltipDrawable tooltipDrawable, float f7) {
        int normalizeValue;
        int intrinsicWidth;
        int calculateTrackCenter;
        int intrinsicHeight;
        int i;
        boolean isVertical = isVertical();
        int i3 = this.trackSidePadding;
        if (isVertical) {
            normalizeValue = (i3 + ((int) (normalizeValue(f7) * this.trackWidth))) - (tooltipDrawable.getIntrinsicHeight() / 2);
            intrinsicWidth = tooltipDrawable.getIntrinsicHeight() + normalizeValue;
            if (isRtl()) {
                calculateTrackCenter = calculateTrackCenter() - ((this.thumbHeight / 2) + this.labelPadding);
                intrinsicHeight = tooltipDrawable.getIntrinsicWidth();
            } else {
                int calculateTrackCenter2 = calculateTrackCenter() + (this.thumbHeight / 2) + this.labelPadding;
                calculateTrackCenter = tooltipDrawable.getIntrinsicWidth() + calculateTrackCenter2;
                i = calculateTrackCenter2;
                this.labelRect.set(normalizeValue, i, intrinsicWidth, calculateTrackCenter);
            }
        } else {
            normalizeValue = (i3 + ((int) (normalizeValue(f7) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
            intrinsicWidth = tooltipDrawable.getIntrinsicWidth() + normalizeValue;
            calculateTrackCenter = calculateTrackCenter() - ((this.thumbHeight / 2) + this.labelPadding);
            intrinsicHeight = tooltipDrawable.getIntrinsicHeight();
        }
        i = calculateTrackCenter - intrinsicHeight;
        this.labelRect.set(normalizeValue, i, intrinsicWidth, calculateTrackCenter);
    }

    private float calculateStartTrackCornerSize(float f7) {
        int size;
        if (!this.values.isEmpty() && hasGapBetweenThumbAndTrack()) {
            if (!isRtl() && !isVertical()) {
                size = 0;
            } else {
                size = this.values.size() - 1;
            }
            float valueToX = valueToX(this.values.get(size).floatValue()) - this.trackSidePadding;
            if (valueToX < f7) {
                return Math.max(valueToX, this.trackInsideCornerSize);
            }
            return f7;
        }
        return f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateStepIncrement(int i) {
        float calculateStepIncrement = calculateStepIncrement();
        if ((this.valueTo - this.valueFrom) / calculateStepIncrement <= i) {
            return calculateStepIncrement;
        }
        return Math.round(r1 / r4) * calculateStepIncrement;
    }

    private int calculateTrackCenter() {
        int i = this.widgetThickness / 2;
        int i3 = 0;
        if (this.labelBehavior == 1 || shouldAlwaysShowLabel()) {
            i3 = this.labels.get(0).getIntrinsicHeight();
        }
        return i + i3;
    }

    private void calculateTrackIconBounds(@NonNull RectF rectF, @NonNull RectF rectF2, @Px int i, @Px int i3, boolean z10) {
        boolean z11;
        float f7;
        if (rectF.right - rectF.left >= (i3 * 2) + i) {
            if (!isRtl() && !isVertical()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z10 ^ z11) {
                f7 = rectF.left + i3;
            } else {
                f7 = (rectF.right - i3) - i;
            }
            float f10 = i;
            float calculateTrackCenter = calculateTrackCenter() - (f10 / 2.0f);
            rectF2.set(f7, calculateTrackCenter, f7 + f10, f10 + calculateTrackCenter);
            return;
        }
        rectF2.setEmpty();
    }

    private int convertToTickVisibilityMode(boolean z10) {
        if (z10) {
            return 0;
        }
        return 2;
    }

    private ValueAnimator createLabelAnimator(boolean z10) {
        float f7;
        ValueAnimator valueAnimator;
        int resolveThemeDuration;
        TimeInterpolator resolveThemeInterpolator;
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (z10) {
            valueAnimator = this.labelsOutAnimator;
        } else {
            valueAnimator = this.labelsInAnimator;
        }
        float animatorCurrentValueOrDefault = getAnimatorCurrentValueOrDefault(valueAnimator, f7);
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(animatorCurrentValueOrDefault, f10);
        if (z10) {
            resolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_ENTER_DURATION_ATTR, DEFAULT_LABEL_ANIMATION_ENTER_DURATION);
            resolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_ENTER_EASING_ATTR, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            resolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_EXIT_DURATION_ATTR, DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
            resolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_EXIT_EASING_ATTR, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        ofFloat.setDuration(resolveThemeDuration);
        ofFloat.setInterpolator(resolveThemeInterpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BaseSlider.this.lambda$createLabelAnimator$1(valueAnimator2);
            }
        });
        return ofFloat;
    }

    private void createLabelPool() {
        int i;
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> subList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable tooltipDrawable : subList) {
                if (isAttachedToWindow()) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            subList.clear();
        }
        while (true) {
            i = 0;
            if (this.labels.size() >= this.values.size()) {
                break;
            }
            TooltipDrawable createFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.labelStyle);
            this.labels.add(createFromAttributes);
            if (isAttachedToWindow()) {
                attachLabelToContentView(createFromAttributes);
            }
        }
        if (this.labels.size() != 1) {
            i = 1;
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setStrokeWidth(i);
        }
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return;
        }
        contentView.getOverlay().remove(tooltipDrawable);
        tooltipDrawable.detachView(contentView);
    }

    private float dimenToValue(float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        float f10 = (f7 - this.trackSidePadding) / this.trackWidth;
        float f11 = this.valueFrom;
        return m.f(f11, this.valueTo, f10, f11);
    }

    private void dispatchOnChangedFromUser(int i) {
        Iterator<L> it = this.changeListeners.iterator();
        while (it.hasNext()) {
            it.next().onValueChange(this, this.values.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            scheduleAccessibilityEventSender(i);
        }
    }

    private void dispatchOnChangedProgrammatically() {
        for (L l : this.changeListeners) {
            ArrayList<Float> arrayList = this.values;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Float f7 = arrayList.get(i);
                i++;
                l.onValueChange(this, f7.floatValue(), false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void drawActiveTracks(@NonNull Canvas canvas, int i, int i3) {
        int i8;
        Canvas canvas2;
        float[] activeRange = getActiveRange();
        int i10 = this.trackSidePadding;
        float f7 = i;
        float f10 = (activeRange[1] * f7) + i10;
        float f11 = (activeRange[0] * f7) + i10;
        if (f11 >= f10) {
            this.activeTrackRect.setEmpty();
            return;
        }
        FullCornerDirection fullCornerDirection = FullCornerDirection.NONE;
        if (this.values.size() == 1 && !isCentered()) {
            fullCornerDirection = (isRtl() || isVertical()) ? FullCornerDirection.RIGHT : FullCornerDirection.LEFT;
        }
        FullCornerDirection fullCornerDirection2 = fullCornerDirection;
        int i11 = 0;
        while (i11 < this.values.size()) {
            if (this.values.size() > 1) {
                if (i11 > 0) {
                    f10 = valueToX(this.values.get(i11 - 1).floatValue());
                } else {
                    f10 = f11;
                }
                float valueToX = valueToX(this.values.get(i11).floatValue());
                if (!isRtl() && !isVertical()) {
                    f11 = f10;
                    f10 = valueToX;
                } else {
                    f11 = valueToX;
                }
            }
            int trackCornerSize = getTrackCornerSize();
            int ordinal = fullCornerDirection2.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!isCentered()) {
                            i8 = this.thumbTrackGapSize;
                            f11 += i8;
                        } else if (activeRange[1] == 0.5f) {
                            f11 += this.thumbTrackGapSize;
                        } else if (activeRange[0] == 0.5f) {
                            i8 = this.thumbTrackGapSize;
                        }
                    }
                } else {
                    f11 += this.thumbTrackGapSize;
                    f10 += trackCornerSize;
                }
                RectF rectF = this.activeTrackRect;
                if (f11 < f10) {
                    rectF.setEmpty();
                    canvas2 = canvas;
                } else {
                    float f12 = i3;
                    int i12 = this.trackThickness;
                    rectF.set(f11, f12 - (i12 / 2.0f), f10, (i12 / 2.0f) + f12);
                    canvas2 = canvas;
                    updateTrack(canvas2, this.activeTrackPaint, this.activeTrackRect, trackCornerSize, fullCornerDirection2);
                }
                i11++;
                canvas = canvas2;
            } else {
                f11 -= trackCornerSize;
                i8 = this.thumbTrackGapSize;
            }
            f10 -= i8;
            RectF rectF2 = this.activeTrackRect;
            if (f11 < f10) {
            }
            i11++;
            canvas = canvas2;
        }
    }

    private void drawInactiveTrackSection(float f7, float f10, float f11, float f12, @NonNull Canvas canvas, RectF rectF, FullCornerDirection fullCornerDirection) {
        if (f10 - f7 > getTrackCornerSize() - this.thumbTrackGapSize) {
            rectF.set(f7, f11, f10, f12);
        } else {
            rectF.setEmpty();
        }
        updateTrack(canvas, this.inactiveTrackPaint, rectF, getTrackCornerSize(), fullCornerDirection);
    }

    private void drawInactiveTracks(@NonNull Canvas canvas, int i, int i3) {
        float[] activeRange = getActiveRange();
        float f7 = i3;
        int i8 = this.trackThickness;
        float f10 = f7 - (i8 / 2.0f);
        float f11 = (i8 / 2.0f) + f7;
        float f12 = i;
        drawInactiveTrackSection(this.trackSidePadding - getTrackCornerSize(), ((activeRange[0] * f12) + this.trackSidePadding) - this.thumbTrackGapSize, f10, f11, canvas, this.inactiveTrackLeftRect, FullCornerDirection.LEFT);
        drawInactiveTrackSection((activeRange[1] * f12) + this.trackSidePadding + this.thumbTrackGapSize, r13 + i + getTrackCornerSize(), f10, f11, canvas, this.inactiveTrackRightRect, FullCornerDirection.RIGHT);
    }

    private void drawStopIndicator(@NonNull Canvas canvas, float f7, float f10) {
        ArrayList<Float> arrayList = this.values;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Float f11 = arrayList.get(i);
            i++;
            float valueToX = valueToX(f11.floatValue());
            float f12 = (this.thumbWidth / 2.0f) + this.thumbTrackGapSize;
            if (f7 >= valueToX - f12 && f7 <= valueToX + f12) {
                return;
            }
        }
        boolean isVertical = isVertical();
        Paint paint = this.stopIndicatorPaint;
        if (isVertical) {
            canvas.drawPoint(f10, f7, paint);
        } else {
            canvas.drawPoint(f7, f10, paint);
        }
    }

    private void drawThumbDrawable(@NonNull Canvas canvas, int i, int i3, float f7, @NonNull Drawable drawable) {
        canvas.save();
        if (isVertical()) {
            canvas.concat(this.rotationMatrix);
        }
        canvas.translate((this.trackSidePadding + ((int) (normalizeValue(f7) * i))) - (drawable.getBounds().width() / 2.0f), i3 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void drawThumbs(@NonNull Canvas canvas, int i, int i3) {
        Canvas canvas2;
        int i8;
        int i10;
        int i11 = 0;
        while (i11 < this.values.size()) {
            float floatValue = this.values.get(i11).floatValue();
            Drawable drawable = this.customThumbDrawable;
            if (drawable != null) {
                canvas2 = canvas;
                i8 = i;
                i10 = i3;
                drawThumbDrawable(canvas2, i8, i10, floatValue, drawable);
            } else {
                canvas2 = canvas;
                i8 = i;
                i10 = i3;
                if (i11 < this.customThumbDrawablesForValues.size()) {
                    drawThumbDrawable(canvas2, i8, i10, floatValue, this.customThumbDrawablesForValues.get(i11));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle((normalizeValue(floatValue) * i8) + this.trackSidePadding, i10, getThumbRadius(), this.thumbPaint);
                    }
                    drawThumbDrawable(canvas2, i8, i10, floatValue, this.defaultThumbDrawable);
                }
            }
            i11++;
            canvas = canvas2;
            i = i8;
            i3 = i10;
        }
    }

    private void drawTicks(int i, int i3, Canvas canvas, Paint paint) {
        float f7;
        while (i < i3) {
            boolean isVertical = isVertical();
            float[] fArr = this.ticksCoordinates;
            if (isVertical) {
                f7 = fArr[i + 1];
            } else {
                f7 = fArr[i];
            }
            if (!isOverlappingThumb(f7) && (!isCentered() || !isOverlappingCenterGap(f7))) {
                float[] fArr2 = this.ticksCoordinates;
                canvas.drawPoint(fArr2[i], fArr2[i + 1], paint);
            }
            i += 2;
        }
    }

    private void drawTrackIcon(@NonNull Canvas canvas, @NonNull RectF rectF, @NonNull Drawable drawable) {
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF);
        }
        rectF.round(this.iconRect);
        drawable.setBounds(this.iconRect);
        drawable.draw(canvas);
    }

    private void drawTrackIcons(@NonNull Canvas canvas, @NonNull RectF rectF, @NonNull RectF rectF2) {
        if (!hasTrackIcons()) {
            return;
        }
        if (this.values.size() > 1) {
            Log.w(TAG, "Track icons can only be used when only 1 thumb is present.");
        }
        calculateBoundsAndDrawTrackIcon(canvas, rectF, this.trackIconActiveStart, true);
        calculateBoundsAndDrawTrackIcon(canvas, rectF2, this.trackIconInactiveStart, true);
        calculateBoundsAndDrawTrackIcon(canvas, rectF, this.trackIconActiveEnd, false);
        calculateBoundsAndDrawTrackIcon(canvas, rectF2, this.trackIconInactiveEnd, false);
    }

    private void ensureLabelsAdded() {
        if (!this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = true;
            ValueAnimator createLabelAnimator = createLabelAnimator(true);
            this.labelsInAnimator = createLabelAnimator;
            this.labelsOutAnimator = null;
            createLabelAnimator.start();
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        for (int i = 0; i < this.values.size() && it.hasNext(); i++) {
            if (i != this.focusedThumbIdx) {
                setValueForLabel(it.next(), this.values.get(i).floatValue());
            }
        }
        if (it.hasNext()) {
            setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())));
    }

    private void ensureLabelsRemoved() {
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            ValueAnimator createLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = createLabelAnimator;
            this.labelsInAnimator = null;
            createLabelAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewOverlay contentViewOverlay = BaseSlider.this.getContentViewOverlay();
                    if (contentViewOverlay != null) {
                        Iterator it = BaseSlider.this.labels.iterator();
                        while (it.hasNext()) {
                            contentViewOverlay.remove((TooltipDrawable) it.next());
                        }
                    }
                }
            });
            this.labelsOutAnimator.start();
        }
    }

    private void focusThumbOnFocusGained(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 66) {
                        return;
                    }
                    moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
                    return;
                }
                moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
                return;
            }
            moveFocus(Integer.MIN_VALUE);
            return;
        }
        moveFocus(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatValue(float f7) {
        String str;
        if (hasLabelFormatter()) {
            return this.formatter.getFormattedValue(f7);
        }
        if (((int) f7) == f7) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, Float.valueOf(f7));
    }

    private float[] getActiveRange() {
        float floatValue = this.values.get(0).floatValue();
        ArrayList<Float> arrayList = this.values;
        float floatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.values.size() == 1) {
            floatValue = this.valueFrom;
        }
        float normalizeValue = normalizeValue(floatValue);
        float normalizeValue2 = normalizeValue(floatValue2);
        if (isCentered()) {
            float min = Math.min(0.5f, normalizeValue2);
            normalizeValue2 = Math.max(0.5f, normalizeValue2);
            normalizeValue = min;
        }
        if (!isCentered() && (isRtl() || isVertical())) {
            return new float[]{normalizeValue2, normalizeValue};
        }
        return new float[]{normalizeValue, normalizeValue2};
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f7) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f7;
    }

    private float getClampedValue(int i, float f7) {
        float floatValue;
        float floatValue2;
        float minSeparation = getMinSeparation();
        if (this.separationUnit == 0) {
            minSeparation = dimenToValue(minSeparation);
        }
        if (isRtl() || isVertical()) {
            minSeparation = -minSeparation;
        }
        int i3 = i + 1;
        if (i3 >= this.values.size()) {
            floatValue = this.valueTo;
        } else {
            floatValue = this.values.get(i3).floatValue() - minSeparation;
        }
        int i8 = i - 1;
        if (i8 < 0) {
            floatValue2 = this.valueFrom;
        } else {
            floatValue2 = this.values.get(i8).floatValue() + minSeparation;
        }
        return MathUtils.clamp(f7, floatValue2, floatValue);
    }

    @ColorInt
    private int getColorForState(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public ViewOverlay getContentViewOverlay() {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return null;
        }
        return contentView.getOverlay();
    }

    private float[] getCornerRadii(float f7, float f10) {
        if (isVertical()) {
            return new float[]{f7, f7, f7, f7, f10, f10, f10, f10};
        }
        return new float[]{f7, f7, f10, f10, f10, f10, f7, f7};
    }

    private int getDesiredTickCount() {
        return (int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f);
    }

    private int getMaxTickCount() {
        return (this.trackWidth / this.minTickSpacing) + 1;
    }

    private float getValueOfTouchPosition() {
        double snapPosition = snapPosition(this.touchPosition);
        if (isRtl() || isVertical()) {
            snapPosition = 1.0d - snapPosition;
        }
        float f7 = this.valueTo;
        return (float) ((snapPosition * (f7 - r3)) + this.valueFrom);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f7 = this.touchPosition;
        if (isRtl() || isVertical()) {
            f7 = 1.0f - f7;
        }
        float f10 = this.valueTo;
        float f11 = this.valueFrom;
        return m.f(f10, f11, f7, f11);
    }

    private boolean hasGapBetweenThumbAndTrack() {
        if (this.thumbTrackGapSize > 0) {
            return true;
        }
        return false;
    }

    private boolean hasTrackIcons() {
        if (this.trackIconActiveStart == null && this.trackIconActiveEnd == null && this.trackIconInactiveStart == null && this.trackIconInactiveEnd == null) {
            return false;
        }
        return true;
    }

    private Drawable initializeCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        adjustCustomThumbDrawableBounds(newDrawable);
        return newDrawable;
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth(this.trackThickness);
        this.activeTrackPaint.setStrokeWidth(this.trackThickness);
    }

    private boolean isInHorizontalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private boolean isInVerticalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMouseEvent(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            return false;
        }
        return true;
    }

    private boolean isMultipleOfStepSize(double d10) {
        if (Math.abs(Math.round(r3) - new BigDecimal(Double.toString(d10)).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue()) < THRESHOLD) {
            return true;
        }
        return false;
    }

    private boolean isOverlappingCenterGap(float f7) {
        float f10 = (this.thumbWidth / 2.0f) + this.thumbTrackGapSize;
        float f11 = ((this.trackSidePadding * 2) + this.trackWidth) / 2.0f;
        if (f7 >= f11 - f10 && f7 <= f11 + f10) {
            return true;
        }
        return false;
    }

    private boolean isOverlappingThumb(float f7) {
        float f10 = (this.thumbWidth / 2.0f) + this.thumbTrackGapSize;
        Iterator<Float> it = this.values.iterator();
        if (it.hasNext()) {
            float valueToX = valueToX(it.next().floatValue());
            if (f7 >= valueToX - f10 && f7 <= valueToX + f10) {
                return true;
            }
        }
        return false;
    }

    private boolean isPotentialHorizontalScroll(MotionEvent motionEvent) {
        if (!isMouseEvent(motionEvent) && isInHorizontalScrollingContainer()) {
            return true;
        }
        return false;
    }

    private boolean isPotentialVerticalScroll(MotionEvent motionEvent) {
        if (!isMouseEvent(motionEvent) && isInVerticalScrollingContainer()) {
            return true;
        }
        return false;
    }

    private boolean isSliderVisibleOnScreen() {
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        if (getLocalVisibleRect(rect) && isThisAndAncestorsVisible()) {
            return true;
        }
        return false;
    }

    private boolean isThisAndAncestorsVisible() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.thisAndAncestorsVisible;
        }
        return isShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createLabelAnimator$1(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setRevealFraction(floatValue);
        }
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        setActiveThumbIndex(-1);
        invalidate();
    }

    private void loadResources(@NonNull Resources resources) {
        this.minWidgetThickness = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.defaultTrackThickness = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.defaultTickActiveRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.defaultTickInactiveRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.minTickSpacing = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.labelPadding = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.trackIconPadding = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
    }

    private void maybeDrawCompatHalo(@NonNull Canvas canvas, int i, int i3) {
        Canvas canvas2;
        if (shouldDrawCompatHalo()) {
            float[] fArr = {(normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i) + this.trackSidePadding, i3};
            if (isVertical()) {
                this.rotationMatrix.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f7 = fArr[0];
                int i8 = this.haloRadius;
                float f10 = fArr[1];
                canvas2 = canvas;
                canvas2.clipRect(f7 - i8, f10 - i8, f7 + i8, f10 + i8, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(fArr[0], fArr[1], this.haloRadius, this.haloPaint);
        }
    }

    private void maybeDrawStopIndicator(@NonNull Canvas canvas, int i) {
        if (this.trackStopIndicatorSize > 0 && !this.values.isEmpty()) {
            ArrayList<Float> arrayList = this.values;
            float floatValue = arrayList.get(arrayList.size() - 1).floatValue();
            float f7 = this.valueTo;
            if (floatValue < f7) {
                drawStopIndicator(canvas, valueToX(f7), i);
            }
            if (isCentered() || (this.values.size() > 1 && this.values.get(0).floatValue() > this.valueFrom)) {
                drawStopIndicator(canvas, valueToX(this.valueFrom), i);
            }
        }
    }

    private void maybeDrawTicks(@NonNull Canvas canvas) {
        float[] fArr = this.ticksCoordinates;
        if (fArr != null && fArr.length != 0) {
            float[] activeRange = getActiveRange();
            int ceil = (int) Math.ceil(((this.ticksCoordinates.length / 2.0f) - 1.0f) * activeRange[0]);
            int floor = (int) Math.floor(((this.ticksCoordinates.length / 2.0f) - 1.0f) * activeRange[1]);
            if (ceil > 0) {
                drawTicks(0, ceil * 2, canvas, this.inactiveTicksPaint);
            }
            if (ceil <= floor) {
                drawTicks(ceil * 2, (floor + 1) * 2, canvas, this.activeTicksPaint);
            }
            int i = (floor + 1) * 2;
            float[] fArr2 = this.ticksCoordinates;
            if (i < fArr2.length) {
                drawTicks(i, fArr2.length, canvas, this.inactiveTicksPaint);
            }
        }
    }

    private boolean maybeIncreaseTrackSidePadding() {
        int width;
        int max = Math.max((this.thumbWidth / 2) - this.defaultThumbRadius, 0);
        int max2 = Math.max((this.trackThickness - this.defaultTrackThickness) / 2, 0);
        int max3 = Math.max(this.tickActiveRadius - this.defaultTickActiveRadius, 0);
        int max4 = Math.max(this.tickInactiveRadius - this.defaultTickInactiveRadius, 0);
        int max5 = Math.max(Math.max(max, max2), Math.max(max3, max4)) + this.minTrackSidePadding;
        if (this.trackSidePadding == max5) {
            return false;
        }
        this.trackSidePadding = max5;
        if (isLaidOut()) {
            if (isVertical()) {
                width = getHeight();
            } else {
                width = getWidth();
            }
            updateTrackWidth(width);
            return true;
        }
        return true;
    }

    private boolean maybeIncreaseWidgetThickness() {
        int paddingTop;
        int paddingBottom;
        if (isVertical()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingBottom + paddingTop;
        int max = Math.max(this.minWidgetThickness, Math.max(this.trackThickness + i, this.thumbHeight + i));
        if (max == this.widgetThickness) {
            return false;
        }
        this.widgetThickness = max;
        return true;
    }

    private boolean moveFocus(int i) {
        int i3 = this.focusedThumbIdx;
        int clamp = (int) MathUtils.clamp(i3 + i, 0L, this.values.size() - 1);
        this.focusedThumbIdx = clamp;
        if (clamp == i3) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = clamp;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i) {
        if (isRtl() || isVertical()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return moveFocus(i);
    }

    private float normalizeValue(float f7) {
        float f10 = this.valueFrom;
        float f11 = (f7 - f10) / (this.valueTo - f10);
        if (!isRtl() && !isVertical()) {
            return f11;
        }
        return 1.0f - f11;
    }

    @Nullable
    private Boolean onKeyDownNoActiveThumb(int i, @NonNull KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i != 69) {
                        if (i != 70) {
                            switch (i) {
                                case 21:
                                    moveFocusInAbsoluteDirection(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    moveFocusInAbsoluteDirection(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        moveFocus(-1);
                        return Boolean.TRUE;
                    }
                }
                moveFocus(1);
                return Boolean.TRUE;
            }
            this.activeThumbIdx = this.focusedThumbIdx;
            postInvalidate();
            return Boolean.TRUE;
        }
        if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(moveFocus(1));
        }
        if (keyEvent.isShiftPressed()) {
            return Boolean.valueOf(moveFocus(-1));
        }
        return Boolean.FALSE;
    }

    private void onStartTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(this);
        }
    }

    private void positionLabel(TooltipDrawable tooltipDrawable, float f7) {
        calculateLabelBounds(tooltipDrawable, f7);
        if (isVertical()) {
            RectF rectF = new RectF(this.labelRect);
            this.rotationMatrix.mapRect(rectF);
            rectF.round(this.labelRect);
        }
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, this.labelRect);
        tooltipDrawable.setBounds(this.labelRect);
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i) {
        int i3;
        int i8;
        int convertToTickVisibilityMode;
        int i10;
        int i11;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Slider, i, DEF_STYLE_RES, new int[0]);
        setOrientation(obtainStyledAttributes.getInt(R.styleable.Slider_android_orientation, 0));
        this.labelStyle = obtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.valueFrom = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = obtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        setCentered(obtainStyledAttributes.getBoolean(R.styleable.Slider_centered, false));
        this.stepSize = obtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.minTouchTargetSize = (int) Math.ceil(obtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, MaterialAttributes.resolveMinimumAccessibleTouchTarget(context)));
        boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.Slider_trackColor);
        if (hasValue) {
            i3 = R.styleable.Slider_trackColor;
        } else {
            i3 = R.styleable.Slider_trackColorInactive;
        }
        if (hasValue) {
            i8 = R.styleable.Slider_trackColor;
        } else {
            i8 = R.styleable.Slider_trackColorActive;
        }
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, i3);
        if (colorStateList == null) {
            colorStateList = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i8);
        if (colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateList2);
        this.defaultThumbDrawable.setFillColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_thumbColor));
        if (obtainStyledAttributes.hasValue(R.styleable.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(colorStateList3);
        if (obtainStyledAttributes.hasValue(R.styleable.Slider_tickVisibilityMode)) {
            convertToTickVisibilityMode = obtainStyledAttributes.getInt(R.styleable.Slider_tickVisibilityMode, -1);
        } else {
            convertToTickVisibilityMode = convertToTickVisibilityMode(obtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true));
        }
        this.tickVisibilityMode = convertToTickVisibilityMode;
        boolean hasValue2 = obtainStyledAttributes.hasValue(R.styleable.Slider_tickColor);
        if (hasValue2) {
            i10 = R.styleable.Slider_tickColor;
        } else {
            i10 = R.styleable.Slider_tickColorInactive;
        }
        if (hasValue2) {
            i11 = R.styleable.Slider_tickColor;
        } else {
            i11 = R.styleable.Slider_tickColorActive;
        }
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i10);
        if (colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, obtainStyledAttributes, i11);
        if (colorStateList5 == null) {
            colorStateList5 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateList5);
        setThumbTrackGapSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackCornerSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackCornerSize, -1));
        setTrackInsideCornerSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackInsideCornerSize, 0));
        setTrackIconActiveStart(MaterialResources.getDrawable(context, obtainStyledAttributes, R.styleable.Slider_trackIconActiveStart));
        setTrackIconActiveEnd(MaterialResources.getDrawable(context, obtainStyledAttributes, R.styleable.Slider_trackIconActiveEnd));
        setTrackIconActiveColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_trackIconActiveColor));
        setTrackIconInactiveStart(MaterialResources.getDrawable(context, obtainStyledAttributes, R.styleable.Slider_trackIconInactiveStart));
        setTrackIconInactiveEnd(MaterialResources.getDrawable(context, obtainStyledAttributes, R.styleable.Slider_trackIconInactiveEnd));
        setTrackIconInactiveColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.Slider_trackIconInactiveColor));
        setTrackIconSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackIconSize, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, this.trackStopIndicatorSize / 2));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, this.trackStopIndicatorSize / 2));
        setLabelBehavior(obtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!obtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        obtainStyledAttributes.recycle();
    }

    private void scheduleAccessibilityEventSender(int i) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.accessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.accessibilityEventSender.setVirtualViewId(i);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f7) {
        tooltipDrawable.setText(formatValue(f7));
        positionLabel(tooltipDrawable, f7);
        ViewOverlay contentViewOverlay = getContentViewOverlay();
        if (contentViewOverlay == null) {
            return;
        }
        contentViewOverlay.add(tooltipDrawable);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.values.size() == arrayList.size() && this.values.equals(arrayList)) {
                return;
            }
            this.values = arrayList;
            this.dirtyConfig = true;
            this.focusedThumbIdx = 0;
            updateHaloHotspot();
            createLabelPool();
            dispatchOnChangedProgrammatically();
            postInvalidate();
            return;
        }
        i.k("At least one value must be set");
    }

    private boolean shouldAlwaysShowLabel() {
        if (this.labelBehavior == 3) {
            return true;
        }
        return false;
    }

    private boolean shouldDrawCompatHalo() {
        if (!this.forceDrawCompatHalo && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    private boolean snapActiveThumbToValue(float f7) {
        return snapThumbToValue(this.activeThumbIdx, f7);
    }

    private double snapPosition(float f7) {
        float f10 = this.stepSize;
        if (f10 > 0.0f) {
            return Math.round(f7 * r0) / ((int) ((this.valueTo - this.valueFrom) / f10));
        }
        return f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean snapThumbToValue(int i, float f7) {
        this.focusedThumbIdx = i;
        if (Math.abs(f7 - this.values.get(i).floatValue()) < THRESHOLD) {
            return false;
        }
        this.values.set(i, Float.valueOf(getClampedValue(i, f7)));
        dispatchOnChangedFromUser(i);
        return true;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (!shouldDrawCompatHalo() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                float normalizeValue = (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding;
                int calculateTrackCenter = calculateTrackCenter();
                int i = this.haloRadius;
                float[] fArr = {normalizeValue - i, calculateTrackCenter - i, normalizeValue + i, calculateTrackCenter + i};
                if (isVertical()) {
                    this.rotationMatrix.mapPoints(fArr);
                }
                background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
            }
        }
    }

    private void updateLabelPivots() {
        float f7;
        boolean isVertical = isVertical();
        boolean isRtl = isRtl();
        float f10 = 0.5f;
        if (isVertical && isRtl) {
            f7 = 0.5f;
            f10 = -0.2f;
        } else {
            f7 = 1.2f;
            if (isVertical) {
                f10 = 1.2f;
                f7 = 0.5f;
            }
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setPivots(f10, f7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLabels() {
        updateLabelPivots();
        int i = this.labelBehavior;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (isEnabled() && isSliderVisibleOnScreen()) {
                        ensureLabelsAdded();
                        return;
                    } else {
                        ensureLabelsRemoved();
                        return;
                    }
                }
                androidx.core.view.inputmethod.a.e(this.labelBehavior, "Unexpected labelBehavior: ");
                return;
            }
            ensureLabelsRemoved();
            return;
        }
        if (this.activeThumbIdx != -1 && isEnabled()) {
            ensureLabelsAdded();
        } else {
            ensureLabelsRemoved();
        }
    }

    private void updateRotationMatrix() {
        float calculateTrackCenter = calculateTrackCenter();
        this.rotationMatrix.reset();
        this.rotationMatrix.setRotate(90.0f, calculateTrackCenter, calculateTrackCenter);
    }

    private void updateThumbWidthWhenPressed() {
        if (hasGapBetweenThumbAndTrack()) {
            int i = this.thumbWidth;
            this.defaultThumbWidth = i;
            this.defaultThumbTrackGapSize = this.thumbTrackGapSize;
            int round = Math.round(i * 0.5f);
            int i3 = this.thumbWidth - round;
            setThumbWidth(round);
            setThumbTrackGapSize(this.thumbTrackGapSize - (i3 / 2));
        }
    }

    private void updateTicksCoordinates(int i) {
        if (i == 0) {
            this.ticksCoordinates = null;
            return;
        }
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length != i * 2) {
            this.ticksCoordinates = new float[i * 2];
        }
        float f7 = this.trackWidth / (i - 1);
        float calculateTrackCenter = calculateTrackCenter();
        for (int i3 = 0; i3 < i * 2; i3 += 2) {
            float[] fArr2 = this.ticksCoordinates;
            fArr2[i3] = ((i3 / 2.0f) * f7) + this.trackSidePadding;
            fArr2[i3 + 1] = calculateTrackCenter;
        }
        if (isVertical()) {
            this.rotationMatrix.mapPoints(this.ticksCoordinates);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateTrack(Canvas canvas, Paint paint, RectF rectF, float f7, FullCornerDirection fullCornerDirection) {
        int i;
        if (rectF.isEmpty()) {
            return;
        }
        float calculateStartTrackCornerSize = calculateStartTrackCornerSize(f7);
        float calculateEndTrackCornerSize = calculateEndTrackCornerSize(f7);
        int ordinal = fullCornerDirection.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    i = this.trackInsideCornerSize;
                    calculateStartTrackCornerSize = i;
                }
            } else {
                calculateStartTrackCornerSize = this.trackInsideCornerSize;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            if (hasGapBetweenThumbAndTrack()) {
                paint.setAntiAlias(true);
            }
            RectF rectF2 = new RectF(rectF);
            if (isVertical()) {
                this.rotationMatrix.mapRect(rectF2);
            }
            this.trackPath.reset();
            if (rectF.width() < calculateStartTrackCornerSize + calculateEndTrackCornerSize) {
                this.trackPath.addRoundRect(rectF2, getCornerRadii(calculateStartTrackCornerSize, calculateEndTrackCornerSize), Path.Direction.CW);
                canvas.drawPath(this.trackPath, paint);
                return;
            }
            float min = Math.min(calculateStartTrackCornerSize, calculateEndTrackCornerSize);
            float max = Math.max(calculateStartTrackCornerSize, calculateEndTrackCornerSize);
            canvas.save();
            this.trackPath.addRoundRect(rectF2, min, min, Path.Direction.CW);
            canvas.clipPath(this.trackPath);
            int ordinal2 = fullCornerDirection.ordinal();
            if (ordinal2 != 1) {
                RectF rectF3 = this.cornerRect;
                if (ordinal2 != 2) {
                    rectF3.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
                } else {
                    float f10 = rectF.right;
                    rectF3.set(f10 - (2.0f * max), rectF.top, f10, rectF.bottom);
                }
            } else {
                RectF rectF4 = this.cornerRect;
                float f11 = rectF.left;
                rectF4.set(f11, rectF.top, (2.0f * max) + f11, rectF.bottom);
            }
            if (isVertical()) {
                this.rotationMatrix.mapRect(this.cornerRect);
            }
            canvas.drawRoundRect(this.cornerRect, max, max, paint);
            canvas.restore();
            return;
        }
        i = this.trackInsideCornerSize;
        calculateEndTrackCornerSize = i;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (hasGapBetweenThumbAndTrack()) {
        }
        RectF rectF22 = new RectF(rectF);
        if (isVertical()) {
        }
        this.trackPath.reset();
        if (rectF.width() < calculateStartTrackCornerSize + calculateEndTrackCornerSize) {
        }
    }

    private void updateTrackIconActiveEnd() {
        Drawable drawable = this.trackIconActiveEnd;
        if (drawable != null) {
            if (!this.trackIconActiveEndMutated && this.trackIconActiveColor != null) {
                this.trackIconActiveEnd = DrawableCompat.wrap(drawable).mutate();
                this.trackIconActiveEndMutated = true;
            }
            if (this.trackIconActiveEndMutated) {
                this.trackIconActiveEnd.setTintList(this.trackIconActiveColor);
            }
        }
    }

    private void updateTrackIconActiveStart() {
        Drawable drawable = this.trackIconActiveStart;
        if (drawable != null) {
            if (!this.trackIconActiveStartMutated && this.trackIconActiveColor != null) {
                this.trackIconActiveStart = DrawableCompat.wrap(drawable).mutate();
                this.trackIconActiveStartMutated = true;
            }
            if (this.trackIconActiveStartMutated) {
                this.trackIconActiveStart.setTintList(this.trackIconActiveColor);
            }
        }
    }

    private void updateTrackIconInactiveEnd() {
        Drawable drawable = this.trackIconInactiveEnd;
        if (drawable != null) {
            if (!this.trackIconInactiveEndMutated && this.trackIconInactiveColor != null) {
                this.trackIconInactiveEnd = DrawableCompat.wrap(drawable).mutate();
                this.trackIconInactiveEndMutated = true;
            }
            if (this.trackIconInactiveEndMutated) {
                this.trackIconInactiveEnd.setTintList(this.trackIconInactiveColor);
            }
        }
    }

    private void updateTrackIconInactiveStart() {
        Drawable drawable = this.trackIconInactiveStart;
        if (drawable != null) {
            if (!this.trackIconInactiveStartMutated && this.trackIconInactiveColor != null) {
                this.trackIconInactiveStart = DrawableCompat.wrap(drawable).mutate();
                this.trackIconInactiveStartMutated = true;
            }
            if (this.trackIconInactiveStartMutated) {
                this.trackIconInactiveStart.setTintList(this.trackIconInactiveColor);
            }
        }
    }

    private void updateTrackWidth(int i) {
        this.trackWidth = Math.max(i - (this.trackSidePadding * 2), 0);
        updateTicksCoordinates();
    }

    private void updateWidgetLayout(boolean z10) {
        boolean maybeIncreaseWidgetThickness = maybeIncreaseWidgetThickness();
        boolean maybeIncreaseTrackSidePadding = maybeIncreaseTrackSidePadding();
        if (isVertical()) {
            updateRotationMatrix();
        }
        if (!maybeIncreaseWidgetThickness && !z10) {
            if (maybeIncreaseTrackSidePadding) {
                postInvalidate();
                return;
            }
            return;
        }
        requestLayout();
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValues();
            validateStepSize();
            validateMinSeparation();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateMinSeparation() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f7 = this.stepSize;
            if (f7 > 0.0f && minSeparation > 0.0f) {
                if (this.separationUnit == 1) {
                    if (minSeparation < f7 || !isMultipleOfStepSize(minSeparation)) {
                        float f10 = this.stepSize;
                        float f11 = this.stepSize;
                        StringBuilder sb = new StringBuilder("minSeparation(");
                        sb.append(minSeparation);
                        sb.append(") must be greater or equal and a multiple of stepSize(");
                        sb.append(f10);
                        sb.append(") when using stepSize(");
                        b.d.j(x.p(sb, ")", f11));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.stepSize + ")");
            }
            return;
        }
        throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
    }

    private void validateStepSize() {
        if (this.stepSize > 0.0f && !valueLandsOnTick(this.valueTo)) {
            float f7 = this.stepSize;
            float f10 = this.valueFrom;
            float f11 = this.valueTo;
            StringBuilder sb = new StringBuilder("The stepSize(");
            sb.append(f7);
            sb.append(") must be 0, or a factor of the valueFrom(");
            sb.append(f10);
            sb.append(")-valueTo(");
            b.d.j(x.p(sb, ") range", f11));
        }
    }

    private void validateValues() {
        float f7 = this.valueFrom;
        if (f7 < this.valueTo) {
            ArrayList<Float> arrayList = this.values;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Float f10 = arrayList.get(i);
                i++;
                Float f11 = f10;
                if (f11.floatValue() >= this.valueFrom && f11.floatValue() <= this.valueTo) {
                    if (this.stepSize > 0.0f && !valueLandsOnTick(f11.floatValue())) {
                        throw new IllegalStateException("Value(" + f11 + ") must be equal to valueFrom(" + this.valueFrom + ") plus a multiple of stepSize(" + this.stepSize + ") when using stepSize(" + this.stepSize + ")");
                    }
                } else {
                    float f12 = this.valueFrom;
                    float f13 = this.valueTo;
                    StringBuilder sb = new StringBuilder("Slider value(");
                    sb.append(f11);
                    sb.append(") must be greater or equal to valueFrom(");
                    sb.append(f12);
                    sb.append("), and lower or equal to valueTo(");
                    b.d.j(x.p(sb, ")", f13));
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException("valueFrom(" + f7 + ") must be smaller than valueTo(" + this.valueTo + ")");
    }

    private boolean valueLandsOnTick(float f7) {
        return isMultipleOfStepSize(new BigDecimal(Float.toString(f7)).subtract(new BigDecimal(Float.toString(this.valueFrom)), MathContext.DECIMAL64).doubleValue());
    }

    private float valueToX(float f7) {
        return (normalizeValue(f7) * this.trackWidth) + this.trackSidePadding;
    }

    private void warnAboutFloatingPointError() {
        float f7 = this.stepSize;
        if (f7 != 0.0f) {
            if (((int) f7) != f7) {
                Log.w(TAG, "Floating point value used for stepSize(" + f7 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
            }
            float f10 = this.valueFrom;
            if (((int) f10) != f10) {
                Log.w(TAG, "Floating point value used for valueFrom(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
            }
            float f11 = this.valueTo;
            if (((int) f11) != f11) {
                Log.w(TAG, "Floating point value used for valueTo(" + f11 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
            }
        }
    }

    public void addOnChangeListener(@NonNull L l) {
        this.changeListeners.add(l);
    }

    public void addOnSliderTouchListener(@NonNull T t) {
        this.touchListeners.add(t);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (!this.accessibilityHelper.dispatchHoverEvent(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        this.stopIndicatorPaint.setColor(getColorForState(this.tickColorInactive));
        for (TooltipDrawable tooltipDrawable : this.labels) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.defaultThumbDrawable.isStateful()) {
            this.defaultThumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    @VisibleForTesting
    public void forceDrawCompatHalo(boolean z10) {
        this.forceDrawCompatHalo = z10;
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    @Px
    public int getHaloRadius() {
        return this.haloRadius;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.defaultThumbDrawable.getElevation();
    }

    @Px
    public int getThumbHeight() {
        return this.thumbHeight;
    }

    @Px
    public int getThumbRadius() {
        return this.thumbWidth / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.defaultThumbDrawable.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.defaultThumbDrawable.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.defaultThumbDrawable.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.thumbTrackGapSize;
    }

    @Px
    public int getThumbWidth() {
        return this.thumbWidth;
    }

    @Px
    public int getTickActiveRadius() {
        return this.tickActiveRadius;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.tickInactiveRadius;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        b.d.j("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        return null;
    }

    public int getTickVisibilityMode() {
        return this.tickVisibilityMode;
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    @Px
    public int getTrackCornerSize() {
        int i = this.trackCornerSize;
        if (i == -1) {
            return this.trackThickness / 2;
        }
        return i;
    }

    @Px
    public int getTrackHeight() {
        return this.trackThickness;
    }

    @Nullable
    public ColorStateList getTrackIconActiveColor() {
        return this.trackIconActiveColor;
    }

    @Nullable
    public Drawable getTrackIconActiveEnd() {
        return this.trackIconActiveEnd;
    }

    @Nullable
    public Drawable getTrackIconActiveStart() {
        return this.trackIconActiveStart;
    }

    @Nullable
    public ColorStateList getTrackIconInactiveColor() {
        return this.trackIconInactiveColor;
    }

    @Nullable
    public Drawable getTrackIconInactiveEnd() {
        return this.trackIconInactiveEnd;
    }

    @Nullable
    public Drawable getTrackIconInactiveStart() {
        return this.trackIconInactiveStart;
    }

    public int getTrackIconSize() {
        return this.trackIconSize;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackInsideCornerSize() {
        return this.trackInsideCornerSize;
    }

    @Px
    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public int getTrackStopIndicatorSize() {
        return this.trackStopIndicatorSize;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        b.d.j("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        return null;
    }

    @Px
    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        if (this.formatter != null) {
            return true;
        }
        return false;
    }

    public boolean isCentered() {
        return this.centered;
    }

    public final boolean isRtl() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public boolean isTickVisible() {
        int i = this.tickVisibilityMode;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            a8.c.t(this.tickVisibilityMode, "Unexpected tickVisibilityMode: ");
            return false;
        }
        if (getDesiredTickCount() <= getMaxTickCount()) {
            return true;
        }
        return false;
    }

    public boolean isVertical() {
        if (this.widgetOrientation == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.thisAndAncestorsVisible = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.onScrollChangedListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            attachLabelToContentView(it.next());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.labelsAreAnimatedIn = false;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            detachLabelFromContentView(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            updateTicksCoordinates();
        }
        super.onDraw(canvas);
        int calculateTrackCenter = calculateTrackCenter();
        drawInactiveTracks(canvas, this.trackWidth, calculateTrackCenter);
        drawActiveTracks(canvas, this.trackWidth, calculateTrackCenter);
        if (!isRtl() && !isVertical()) {
            drawTrackIcons(canvas, this.activeTrackRect, this.inactiveTrackRightRect);
        } else {
            drawTrackIcons(canvas, this.activeTrackRect, this.inactiveTrackLeftRect);
        }
        maybeDrawTicks(canvas);
        maybeDrawStopIndicator(canvas, calculateTrackCenter);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawCompatHalo(canvas, this.trackWidth, calculateTrackCenter);
        }
        updateLabels();
        drawThumbs(canvas, this.trackWidth, calculateTrackCenter);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i, @Nullable Rect rect) {
        super.onFocusChanged(z10, i, rect);
        if (!z10) {
            this.activeThumbIdx = -1;
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
        } else {
            focusThumbOnFocusGained(i);
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            Boolean onKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i, keyEvent);
            if (onKeyDownNoActiveThumb != null) {
                return onKeyDownNoActiveThumb.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float calculateIncrementForKey = calculateIncrementForKey(i);
        if (calculateIncrementForKey != null) {
            if (snapActiveThumbToValue(calculateIncrementForKey.floatValue() + this.values.get(this.activeThumbIdx).floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(1);
                }
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return moveFocus(-1);
            }
        }
        this.activeThumbIdx = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        int i8 = 0;
        if (this.labelBehavior == 1 || shouldAlwaysShowLabel()) {
            i8 = this.labels.get(0).getIntrinsicHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.widgetThickness + i8, 1073741824);
        if (isVertical()) {
            super.onMeasure(makeMeasureSpec, i3);
        } else {
            super.onMeasure(i, makeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i8, int i10) {
        if (isVertical()) {
            i = i3;
        }
        updateTrackWidth(i);
        updateHaloHotspot();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r3 != 3) goto L78;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        float x5;
        float y10;
        int i;
        if (!isEnabled()) {
            return false;
        }
        if (isVertical()) {
            x5 = motionEvent.getY();
        } else {
            x5 = motionEvent.getX();
        }
        if (isVertical()) {
            y10 = motionEvent.getX();
        } else {
            y10 = motionEvent.getY();
        }
        float f7 = (x5 - this.trackSidePadding) / this.trackWidth;
        this.touchPosition = f7;
        float max = Math.max(0.0f, f7);
        this.touchPosition = max;
        this.touchPosition = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.thumbIsPressed) {
                        if (!isVertical() && isPotentialVerticalScroll(motionEvent) && Math.abs(x5 - this.touchDownAxis1) < this.scaledTouchSlop) {
                            return false;
                        }
                        if (isVertical() && isPotentialHorizontalScroll(motionEvent) && Math.abs(y10 - this.touchDownAxis2) < this.scaledTouchSlop * 0.8f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (pickActiveThumb()) {
                            this.thumbIsPressed = true;
                            updateThumbWidthWhenPressed();
                            onStartTrackingTouch();
                        }
                    }
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                }
            }
            this.thumbIsPressed = false;
            MotionEvent motionEvent2 = this.lastEvent;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= this.scaledTouchSlop && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= this.scaledTouchSlop && pickActiveThumb()) {
                onStartTrackingTouch();
            }
            if (this.activeThumbIdx != -1) {
                snapTouchPosition();
                updateHaloHotspot();
                if (hasGapBetweenThumbAndTrack() && (i = this.defaultThumbWidth) != -1 && this.defaultThumbTrackGapSize != -1) {
                    setThumbWidth(i);
                    setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                }
                this.activeThumbIdx = -1;
                onStopTrackingTouch();
            }
            invalidate();
        } else {
            this.touchDownAxis1 = x5;
            this.touchDownAxis2 = y10;
            if ((isVertical() || !isPotentialVerticalScroll(motionEvent)) && (!isVertical() || !isPotentialHorizontalScroll(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    updateThumbWidthWhenPressed();
                    onStartTrackingTouch();
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                }
            }
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z10) {
        super.onVisibilityAggregated(z10);
        this.thisAndAncestorsVisible = z10;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        ViewOverlay contentViewOverlay;
        super.onVisibilityChanged(view, i);
        if (i != 0 && (contentViewOverlay = getContentViewOverlay()) != null) {
            Iterator<TooltipDrawable> it = this.labels.iterator();
            while (it.hasNext()) {
                contentViewOverlay.remove(it.next());
            }
        }
    }

    public boolean pickActiveThumb() {
        boolean z10;
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float valueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float abs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.values.size(); i++) {
            float abs2 = Math.abs(this.values.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float valueToX2 = valueToX(this.values.get(i).floatValue());
            if (Float.compare(abs2, abs) > 0) {
                break;
            }
            if (isRtl() || isVertical() ? valueToX2 - valueToX > 0.0f : valueToX2 - valueToX < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.activeThumbIdx = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(valueToX2 - valueToX) < this.scaledTouchSlop) {
                        this.activeThumbIdx = -1;
                        return false;
                    }
                    if (z10) {
                        this.activeThumbIdx = i;
                    }
                }
            }
            abs = abs2;
        }
        if (this.activeThumbIdx != -1) {
            return true;
        }
        return false;
    }

    public void removeOnChangeListener(@NonNull L l) {
        this.changeListeners.remove(l);
    }

    public void removeOnSliderTouchListener(@NonNull T t) {
        this.touchListeners.remove(t);
    }

    public void scheduleTooltipTimeout() {
        removeCallbacks(this.resetActiveThumbIndex);
        postDelayed(this.resetActiveThumbIndex, this.tooltipTimeoutMillis);
    }

    public void setActiveThumbIndex(int i) {
        this.activeThumbIdx = i;
    }

    public void setCentered(boolean z10) {
        if (this.centered == z10) {
            return;
        }
        this.centered = z10;
        float f7 = this.valueFrom;
        if (z10) {
            setValues(Float.valueOf((f7 + this.valueTo) / 2.0f));
        } else {
            setValues(Float.valueOf(f7));
        }
        updateWidgetLayout(true);
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.customThumbDrawable = initializeCustomThumbDrawable(drawable);
        this.customThumbDrawablesForValues.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.customThumbDrawable = null;
        this.customThumbDrawablesForValues = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.customThumbDrawablesForValues.add(initializeCustomThumbDrawable(drawable));
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        int i;
        super.setEnabled(z10);
        if (z10) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i >= 0 && i < this.values.size()) {
            this.focusedThumbIdx = i;
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(i);
            postInvalidate();
            return;
        }
        i.k("index out of range");
    }

    public void setHaloRadius(@IntRange(from = 0) @Px int i) {
        if (i == this.haloRadius) {
            return;
        }
        this.haloRadius = i;
        Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof RippleDrawable)) {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.haloRadius);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(@DimenRes int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.haloColor)) {
            return;
        }
        this.haloColor = colorStateList;
        Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.haloPaint.setColor(getColorForState(colorStateList));
        this.haloPaint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.labelBehavior != i) {
            this.labelBehavior = i;
            updateWidgetLayout(true);
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    public void setOrientation(int i) {
        if (this.widgetOrientation == i) {
            return;
        }
        this.widgetOrientation = i;
        updateWidgetLayout(true);
    }

    public void setSeparationUnit(int i) {
        this.separationUnit = i;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setStepSize(float f7) {
        if (f7 >= 0.0f) {
            if (this.stepSize != f7) {
                this.stepSize = f7;
                this.dirtyConfig = true;
                postInvalidate();
                return;
            }
            return;
        }
        float f10 = this.valueFrom;
        float f11 = this.valueTo;
        StringBuilder sb = new StringBuilder("The stepSize(");
        sb.append(f7);
        sb.append(") must be 0, or a factor of the valueFrom(");
        sb.append(f10);
        sb.append(")-valueTo(");
        i.k(x.p(sb, ") range", f11));
    }

    public void setThumbElevation(float f7) {
        this.defaultThumbDrawable.setElevation(f7);
    }

    public void setThumbElevationResource(@DimenRes int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbHeight(@IntRange(from = 0) @Px int i) {
        if (i == this.thumbHeight) {
            return;
        }
        this.thumbHeight = i;
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, i);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout(false);
    }

    public void setThumbHeightResource(@DimenRes int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(@IntRange(from = 0) @Px int i) {
        int i3 = i * 2;
        setThumbWidth(i3);
        setThumbHeight(i3);
    }

    public void setThumbRadiusResource(@DimenRes int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.defaultThumbDrawable.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i) {
        if (i != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f7) {
        this.defaultThumbDrawable.setStrokeWidth(f7);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.defaultThumbDrawable.getFillColor())) {
            return;
        }
        this.defaultThumbDrawable.setFillColor(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@Px int i) {
        if (this.thumbTrackGapSize == i) {
            return;
        }
        this.thumbTrackGapSize = i;
        invalidate();
    }

    public void setThumbWidth(@IntRange(from = 0) @Px int i) {
        if (i == this.thumbWidth) {
            return;
        }
        this.thumbWidth = i;
        this.defaultThumbDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.thumbWidth / 2.0f).build());
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout(false);
    }

    public void setThumbWidthResource(@DimenRes int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    public void setTickActiveRadius(@IntRange(from = 0) @Px int i) {
        if (this.tickActiveRadius != i) {
            this.tickActiveRadius = i;
            this.activeTicksPaint.setStrokeWidth(i * 2);
            updateWidgetLayout(false);
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorActive)) {
            return;
        }
        this.tickColorActive = colorStateList;
        this.activeTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = 0) @Px int i) {
        if (this.tickInactiveRadius != i) {
            this.tickInactiveRadius = i;
            this.inactiveTicksPaint.setStrokeWidth(i * 2);
            updateWidgetLayout(false);
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorInactive)) {
            return;
        }
        this.tickColorInactive = colorStateList;
        this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i) {
        if (this.tickVisibilityMode != i) {
            this.tickVisibilityMode = i;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z10) {
        setTickVisibilityMode(convertToTickVisibilityMode(z10));
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorActive)) {
            return;
        }
        this.trackColorActive = colorStateList;
        this.activeTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(@Px int i) {
        if (this.trackCornerSize == i) {
            return;
        }
        this.trackCornerSize = i;
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Px int i) {
        if (this.trackThickness != i) {
            this.trackThickness = i;
            invalidateTrack();
            updateWidgetLayout(false);
        }
    }

    public void setTrackIconActiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.trackIconActiveColor) {
            return;
        }
        this.trackIconActiveColor = colorStateList;
        updateTrackIconActiveStart();
        updateTrackIconActiveEnd();
        invalidate();
    }

    public void setTrackIconActiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.trackIconActiveEnd) {
            return;
        }
        this.trackIconActiveEnd = drawable;
        this.trackIconActiveEndMutated = false;
        updateTrackIconActiveEnd();
        invalidate();
    }

    public void setTrackIconActiveStart(@Nullable Drawable drawable) {
        if (drawable == this.trackIconActiveStart) {
            return;
        }
        this.trackIconActiveStart = drawable;
        this.trackIconActiveStartMutated = false;
        updateTrackIconActiveStart();
        invalidate();
    }

    public void setTrackIconInactiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.trackIconInactiveColor) {
            return;
        }
        this.trackIconInactiveColor = colorStateList;
        updateTrackIconInactiveStart();
        updateTrackIconInactiveEnd();
        invalidate();
    }

    public void setTrackIconInactiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.trackIconInactiveEnd) {
            return;
        }
        this.trackIconInactiveEnd = drawable;
        this.trackIconInactiveEndMutated = false;
        updateTrackIconInactiveEnd();
        invalidate();
    }

    public void setTrackIconInactiveStart(@Nullable Drawable drawable) {
        if (drawable == this.trackIconInactiveStart) {
            return;
        }
        this.trackIconInactiveStart = drawable;
        this.trackIconInactiveStartMutated = false;
        updateTrackIconInactiveStart();
        invalidate();
    }

    public void setTrackIconSize(@Px int i) {
        if (this.trackIconSize == i) {
            return;
        }
        this.trackIconSize = i;
        invalidate();
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorInactive)) {
            return;
        }
        this.trackColorInactive = colorStateList;
        this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@Px int i) {
        if (this.trackInsideCornerSize == i) {
            return;
        }
        this.trackInsideCornerSize = i;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i) {
        if (this.trackStopIndicatorSize == i) {
            return;
        }
        this.trackStopIndicatorSize = i;
        this.stopIndicatorPaint.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f7) {
        this.valueFrom = f7;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f7) {
        this.valueTo = f7;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public void updateBoundsForVirtualViewId(int i, Rect rect) {
        int normalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i).floatValue()) * this.trackWidth));
        int calculateTrackCenter = calculateTrackCenter();
        int max = Math.max(this.thumbWidth / 2, this.minTouchTargetSize / 2);
        int max2 = Math.max(this.thumbHeight / 2, this.minTouchTargetSize / 2);
        RectF rectF = new RectF(normalizeValue - max, calculateTrackCenter - max2, normalizeValue + max, calculateTrackCenter + max2);
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawable(@DrawableRes int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setTrackIconActiveEnd(@DrawableRes int i) {
        setTrackIconActiveEnd(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setTrackIconActiveStart(@DrawableRes int i) {
        setTrackIconActiveStart(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setTrackIconInactiveEnd(@DrawableRes int i) {
        setTrackIconInactiveEnd(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setTrackIconInactiveStart(@DrawableRes int i) {
        setTrackIconInactiveStart(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    private float calculateStepIncrement() {
        float f7 = this.stepSize;
        if (f7 == 0.0f) {
            return 1.0f;
        }
        return f7;
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        };
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void updateTicksCoordinates() {
        validateConfigurationIfDirty();
        int i = 0;
        if (this.stepSize <= 0.0f) {
            updateTicksCoordinates(0);
            return;
        }
        int i3 = this.tickVisibilityMode;
        if (i3 == 0) {
            i = Math.min(getDesiredTickCount(), getMaxTickCount());
        } else if (i3 == 1) {
            int desiredTickCount = getDesiredTickCount();
            if (desiredTickCount <= getMaxTickCount()) {
                i = desiredTickCount;
            }
        } else if (i3 != 2) {
            a8.c.t(this.tickVisibilityMode, "Unexpected tickVisibilityMode: ");
            return;
        }
        updateTicksCoordinates(i);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }
}
