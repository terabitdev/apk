package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.DrawingDelegate;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float adjustedWavelength;
    private int cachedWavelength;
    private float displayedAmplitude;
    private float displayedCornerRadius;
    private float displayedInnerCornerRadius;
    private float displayedTrackThickness;
    private boolean drawingDeterminateIndicator;
    Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> endPoints;

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    private float totalTrackLengthFraction;
    private float trackLength;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
        this.endPoints = new Pair<>(new DrawingDelegate.PathPoint(), new DrawingDelegate.PathPoint());
    }

    private void calculateDisplayedPath(@NonNull PathMeasure pathMeasure, @NonNull Path path, @NonNull Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair, float f7, float f10, float f11, float f12) {
        int i;
        boolean z10 = this.drawingDeterminateIndicator;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.spec;
        if (z10) {
            i = linearProgressIndicatorSpec.wavelengthDeterminate;
        } else {
            i = linearProgressIndicatorSpec.wavelengthIndeterminate;
        }
        if (pathMeasure == this.activePathMeasure && i != this.cachedWavelength) {
            this.cachedWavelength = i;
            invalidateCachedPaths();
        }
        path.rewind();
        float f13 = (-this.trackLength) / 2.0f;
        boolean hasWavyEffect = ((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator);
        if (hasWavyEffect) {
            float f14 = this.trackLength;
            float f15 = this.adjustedWavelength;
            float f16 = f14 / f15;
            float f17 = f12 / f16;
            float f18 = f16 / (f16 + 1.0f);
            f7 = (f7 + f17) * f18;
            f10 = (f10 + f17) * f18;
            f13 -= f12 * f15;
        }
        float length = pathMeasure.getLength() * f7;
        float length2 = pathMeasure.getLength() * f10;
        pathMeasure.getSegment(length, length2, path, true);
        DrawingDelegate.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
        pathPoint.reset();
        pathMeasure.getPosTan(length, pathPoint.posVec, pathPoint.tanVec);
        DrawingDelegate.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair.second;
        pathPoint2.reset();
        pathMeasure.getPosTan(length2, pathPoint2.posVec, pathPoint2.tanVec);
        this.transform.reset();
        this.transform.setTranslate(f13, 0.0f);
        pathPoint.translate(f13, 0.0f);
        pathPoint2.translate(f13, 0.0f);
        if (hasWavyEffect) {
            float f19 = this.displayedAmplitude * f11;
            this.transform.postScale(1.0f, f19);
            pathPoint.scale(1.0f, f19);
            pathPoint2.scale(1.0f, f19);
        }
        path.transform(this.transform);
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f7, float f10, @ColorInt int i, @Px int i3, @Px int i8, float f11, float f12, boolean z10) {
        float f13;
        float f14;
        boolean z11;
        Paint.Cap cap;
        Paint paint2;
        Canvas canvas2;
        float clamp = MathUtils.clamp(f7, 0.0f, 1.0f);
        float clamp2 = MathUtils.clamp(f10, 0.0f, 1.0f);
        float lerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp);
        float lerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp2);
        int clamp3 = (int) ((MathUtils.clamp(lerp, 0.0f, 0.01f) * i3) / 0.01f);
        float clamp4 = 1.0f - MathUtils.clamp(lerp2, 0.99f, 1.0f);
        float f15 = this.trackLength;
        int i10 = (int) ((lerp * f15) + clamp3);
        int i11 = (int) ((lerp2 * f15) - ((int) ((clamp4 * i8) / 0.01f)));
        float f16 = this.displayedCornerRadius;
        float f17 = this.displayedInnerCornerRadius;
        if (f16 != f17) {
            float max = Math.max(f16, f17);
            float f18 = this.trackLength;
            float f19 = max / f18;
            float lerp3 = com.google.android.material.math.MathUtils.lerp(this.displayedCornerRadius, this.displayedInnerCornerRadius, MathUtils.clamp(i10 / f18, 0.0f, f19) / f19);
            float f20 = this.displayedCornerRadius;
            float f21 = this.displayedInnerCornerRadius;
            float f22 = this.trackLength;
            f14 = com.google.android.material.math.MathUtils.lerp(f20, f21, MathUtils.clamp((f22 - i11) / f22, 0.0f, f19) / f19);
            f13 = lerp3;
        } else {
            f13 = f16;
            f14 = f13;
        }
        float f23 = (-this.trackLength) / 2.0f;
        if (((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator) && z10 && f11 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 <= i11) {
            float f24 = i10 + f13;
            float f25 = i11 - f14;
            float f26 = f13 * 2.0f;
            float f27 = 2.0f * f14;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            ((DrawingDelegate.PathPoint) this.endPoints.first).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.second).reset();
            ((DrawingDelegate.PathPoint) this.endPoints.first).translate(f24 + f23, 0.0f);
            ((DrawingDelegate.PathPoint) this.endPoints.second).translate(f23 + f25, 0.0f);
            if (i10 == 0 && f25 + f14 < f24 + f13) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = (DrawingDelegate.PathPoint) pair.first;
                float f28 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint, f26, f28, f13, (DrawingDelegate.PathPoint) pair.second, f27, f28, f14, true);
                return;
            }
            if (f24 - f13 > f25 - f14) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair2 = this.endPoints;
                DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2 = (DrawingDelegate.PathPoint) pair2.second;
                float f29 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, pathPoint2, f27, f29, f14, (DrawingDelegate.PathPoint) pair2.first, f26, f29, f13, false);
                return;
            }
            float f30 = f14;
            float f31 = f13;
            paint.setStyle(Paint.Style.STROKE);
            if (((LinearProgressIndicatorSpec) this.spec).useStrokeCap()) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            if (!z11) {
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair3 = this.endPoints;
                Object obj = pair3.first;
                float f32 = ((DrawingDelegate.PathPoint) obj).posVec[0];
                float f33 = ((DrawingDelegate.PathPoint) obj).posVec[1];
                Object obj2 = pair3.second;
                canvas.drawLine(f32, f33, ((DrawingDelegate.PathPoint) obj2).posVec[0], ((DrawingDelegate.PathPoint) obj2).posVec[1], paint);
                paint2 = paint;
                canvas2 = canvas;
            } else {
                paint2 = paint;
                PathMeasure pathMeasure = this.activePathMeasure;
                Path path = this.displayedActivePath;
                Pair<DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint, DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint> pair4 = this.endPoints;
                float f34 = this.trackLength;
                calculateDisplayedPath(pathMeasure, path, pair4, f24 / f34, f25 / f34, f11, f12);
                canvas2 = canvas;
                canvas2.drawPath(this.displayedActivePath, paint2);
            }
            if (!((LinearProgressIndicatorSpec) this.spec).useStrokeCap()) {
                if (f24 > 0.0f && f31 > 0.0f) {
                    drawRoundedBlock(canvas2, paint2, (DrawingDelegate.PathPoint) this.endPoints.first, f26, this.displayedTrackThickness, f31);
                }
                if (f25 < this.trackLength && f30 > 0.0f) {
                    drawRoundedBlock(canvas, paint, (DrawingDelegate.PathPoint) this.endPoints.second, f27, this.displayedTrackThickness, f30);
                }
            }
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f7, float f10, float f11, @Nullable DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint2, float f12, float f13, float f14, boolean z10) {
        float f15;
        float f16;
        float min = Math.min(f10, this.displayedTrackThickness);
        float f17 = (-f7) / 2.0f;
        float f18 = (-min) / 2.0f;
        float f19 = f7 / 2.0f;
        float f20 = min / 2.0f;
        RectF rectF = new RectF(f17, f18, f19, f20);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pathPoint2 != null) {
            float min2 = Math.min(f13, this.displayedTrackThickness);
            float min3 = Math.min(f12 / 2.0f, (f14 * min2) / this.displayedTrackThickness);
            RectF rectF2 = new RectF();
            float[] fArr = pathPoint2.posVec;
            if (z10) {
                float f21 = (fArr[0] - min3) - (pathPoint.posVec[0] - f11);
                if (f21 > 0.0f) {
                    pathPoint2.translate((-f21) / 2.0f, 0.0f);
                    f16 = f12 + f21;
                } else {
                    f16 = f12;
                }
                rectF2.set(0.0f, f18, f19, f20);
            } else {
                float f22 = (fArr[0] + min3) - (pathPoint.posVec[0] + f11);
                if (f22 < 0.0f) {
                    pathPoint2.translate((-f22) / 2.0f, 0.0f);
                    f15 = f12 - f22;
                } else {
                    f15 = f12;
                }
                rectF2.set(f17, f18, 0.0f, f20);
                f16 = f15;
            }
            RectF rectF3 = new RectF((-f16) / 2.0f, (-min2) / 2.0f, f16 / 2.0f, min2 / 2.0f);
            float[] fArr2 = pathPoint2.posVec;
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint2.tanVec));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-vectorToCanvasRotation(pathPoint2.tanVec));
            float[] fArr3 = pathPoint2.posVec;
            canvas.translate(-fArr3[0], -fArr3[1]);
            float[] fArr4 = pathPoint.posVec;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f11, f11, paint);
        } else {
            float[] fArr5 = pathPoint.posVec;
            canvas.translate(fArr5[0], fArr5[1]);
            canvas.rotate(vectorToCanvasRotation(pathPoint.tanVec));
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f7, boolean z10, boolean z11) {
        if (this.trackLength != rect.width()) {
            this.trackLength = rect.width();
            invalidateCachedPaths();
        }
        float preferredHeight = getPreferredHeight();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - preferredHeight) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f10 = this.trackLength / 2.0f;
        float f11 = preferredHeight / 2.0f;
        canvas.clipRect(-f10, -f11, f10, f11);
        S s = this.spec;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s).trackThickness * f7;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s).trackThickness / 2, ((LinearProgressIndicatorSpec) s).getTrackCornerRadiusInPx()) * f7;
        S s3 = this.spec;
        this.displayedAmplitude = ((LinearProgressIndicatorSpec) s3).waveAmplitude * f7;
        this.displayedInnerCornerRadius = Math.min(((LinearProgressIndicatorSpec) s3).trackThickness / 2.0f, ((LinearProgressIndicatorSpec) s3).getTrackInnerCornerRadiusInPx()) * f7;
        if (z10 || z11) {
            if ((z10 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z11 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, ((1.0f - f7) * ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f);
            }
        }
        if (z11 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f7;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i, @IntRange(from = 0, to = 255) int i3) {
        float f7;
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i3);
        this.drawingDeterminateIndicator = false;
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize > 0 && compositeARGBWithAlpha != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(compositeARGBWithAlpha);
            S s = this.spec;
            if (((LinearProgressIndicatorSpec) s).trackStopIndicatorPadding != null) {
                f7 = (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize / 2.0f) + ((LinearProgressIndicatorSpec) s).trackStopIndicatorPadding.floatValue();
            } else {
                f7 = this.displayedTrackThickness / 2.0f;
            }
            DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint = new DrawingDelegate.PathPoint(new float[]{(this.trackLength / 2.0f) - f7, 0.0f}, new float[]{1.0f, 0.0f});
            S s3 = this.spec;
            drawRoundedBlock(canvas, paint, pathPoint, ((LinearProgressIndicatorSpec) s3).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s3).trackStopIndicatorSize, (this.displayedCornerRadius * ((LinearProgressIndicatorSpec) s3).trackStopIndicatorSize) / this.displayedTrackThickness);
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i);
        this.drawingDeterminateIndicator = activeIndicator.isDeterminate;
        float f7 = activeIndicator.startFraction;
        float f10 = activeIndicator.endFraction;
        int i3 = activeIndicator.gapSize;
        drawLine(canvas, paint, f7, f10, compositeARGBWithAlpha, i3, i3, activeIndicator.amplitudeFraction, activeIndicator.phaseFraction, true);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f7, float f10, int i, int i3, @Px int i8) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i3);
        this.drawingDeterminateIndicator = false;
        drawLine(canvas, paint, f7, f10, compositeARGBWithAlpha, i8, i8, 0.0f, 0.0f, false);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        S s = this.spec;
        return (((LinearProgressIndicatorSpec) s).waveAmplitude * 2) + ((LinearProgressIndicatorSpec) s).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void invalidateCachedPaths() {
        int i;
        this.cachedActivePath.rewind();
        if (((LinearProgressIndicatorSpec) this.spec).hasWavyEffect(this.drawingDeterminateIndicator)) {
            boolean z10 = this.drawingDeterminateIndicator;
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.spec;
            if (z10) {
                i = linearProgressIndicatorSpec.wavelengthDeterminate;
            } else {
                i = linearProgressIndicatorSpec.wavelengthIndeterminate;
            }
            float f7 = this.trackLength;
            int i3 = (int) (f7 / i);
            this.adjustedWavelength = f7 / i3;
            for (int i8 = 0; i8 <= i3; i8++) {
                int i10 = i8 * 2;
                float f10 = i10 + 1;
                this.cachedActivePath.cubicTo(i10 + 0.48f, 0.0f, f10 - 0.48f, 1.0f, f10, 1.0f);
                float f11 = i10 + 2;
                this.cachedActivePath.cubicTo(f10 + 0.48f, 1.0f, f11 - 0.48f, 0.0f, f11, 0.0f);
            }
            this.transform.reset();
            this.transform.setScale(this.adjustedWavelength / 2.0f, -2.0f);
            this.transform.postTranslate(0.0f, 1.0f);
            this.cachedActivePath.transform(this.transform);
        } else {
            this.cachedActivePath.lineTo(this.trackLength, 0.0f);
        }
        this.activePathMeasure.setPath(this.cachedActivePath, false);
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate<LinearProgressIndicatorSpec>.PathPoint pathPoint, float f7, float f10, float f11) {
        drawRoundedBlock(canvas, paint, pathPoint, f7, f10, f11, null, 0.0f, 0.0f, 0.0f, false);
    }
}
