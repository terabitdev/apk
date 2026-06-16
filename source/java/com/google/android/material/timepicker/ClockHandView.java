package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;

    @NonNull
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;

    @Px
    private final int selectorStrokeWidth;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0d, to = 360.0d) float f7, boolean z10);
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, to = 360.0d) float f7, boolean z10);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r7.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        initRotationAnimator();
    }

    private void adjustLevel(float f7, float f10) {
        int i = 2;
        if (MathUtils.dist(getWidth() / 2, getHeight() / 2, f7, f10) > getLeveledCircleRadius(2) + ViewUtils.dpToPx(getContext(), 12)) {
            i = 1;
        }
        this.currentLevel = i;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f7 = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + f7;
        float f10 = height;
        float sin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + f10;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.selectorRadius, this.paint);
        double sin2 = Math.sin(this.degRad);
        double cos2 = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f7, f10, width + ((int) (cos2 * r2)), height + ((int) (r2 * sin2)), this.paint);
        canvas.drawCircle(f7, f10, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f7, float f10) {
        int degrees = (int) Math.toDegrees(Math.atan2(f10 - (getHeight() / 2), f7 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            return degrees + 450;
        }
        return i;
    }

    @Dimension
    private int getLeveledCircleRadius(int i) {
        int i3 = this.circleRadius;
        if (i == 2) {
            return Math.round(i3 * 0.66f);
        }
        return i3;
    }

    private Pair<Float, Float> getValuesForAnimation(float f7) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f7) > 180.0f) {
            if (handRotation > 180.0f && f7 < 180.0f) {
                f7 += 360.0f;
            }
            if (handRotation < 180.0f && f7 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f7));
    }

    private boolean handleTouchInput(float f7, float f10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        float degreesFromXY = getDegreesFromXY(f7, f10);
        boolean z14 = false;
        if (getHandRotation() != degreesFromXY) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11 && z13) {
            return true;
        }
        if (!z13 && !z10) {
            return false;
        }
        if (z12 && this.animatingOnTouchUp) {
            z14 = true;
        }
        setHandRotation(degreesFromXY, z14);
        return true;
    }

    private void initRotationAnimator() {
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.this.lambda$initRotationAnimator$0(valueAnimator);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRotationAnimator$0(ValueAnimator valueAnimator) {
        setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void setHandRotationInternal(@FloatRange(from = 0.0d, to = 360.0d) float f7, boolean z10) {
        float f10 = f7 % 360.0f;
        this.originalDeg = f10;
        this.degRad = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + width;
        float sin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + height;
        RectF rectF = this.selectorBox;
        int i = this.selectorRadius;
        rectF.set(cos - i, sin - i, cos + i, sin + i);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f10, z10);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    @FloatRange(from = 0.0d, to = 360.0d)
    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i, int i3, int i8, int i10) {
        super.onLayout(z10, i, i3, i8, i10);
        if (!this.rotationAnimator.isRunning()) {
            setHandRotation(getHandRotation());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        OnActionUpListener onActionUpListener;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z11 = false;
                z10 = false;
                z12 = false;
            } else {
                int i = (int) (x5 - this.downX);
                int i3 = (int) (y10 - this.downY);
                if ((i3 * i3) + (i * i) > this.scaledTouchSlop) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.isInTapRegion = z13;
                z11 = this.changedDuringTouch;
                if (actionMasked == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.isMultiLevel) {
                    adjustLevel(x5, y10);
                }
                z12 = z14;
                z10 = false;
            }
        } else {
            this.downX = x5;
            this.downY = y10;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z10 = true;
            z11 = false;
            z12 = false;
        }
        boolean handleTouchInput = this.changedDuringTouch | handleTouchInput(x5, y10, z11, z10, z12);
        this.changedDuringTouch = handleTouchInput;
        if (handleTouchInput && z12 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x5, y10), this.isInTapRegion);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.animatingOnTouchUp = z10;
    }

    public void setCircleRadius(@Dimension int i) {
        this.circleRadius = i;
        invalidate();
    }

    public void setCurrentLevel(int i) {
        this.currentLevel = i;
        invalidate();
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f7, boolean z10) {
        this.rotationAnimator.cancel();
        if (!z10) {
            setHandRotationInternal(f7, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f7);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.start();
    }

    public void setMultiLevel(boolean z10) {
        if (this.isMultiLevel && !z10) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z10;
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f7) {
        setHandRotation(f7, false);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }
}
