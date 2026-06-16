package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.support.v4.media.session.m;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import java.util.Arrays;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    static final float WAVE_SMOOTHNESS = 0.48f;
    final PathMeasure activePathMeasure;
    final Path cachedActivePath;
    final Path displayedActivePath;
    S spec;
    final Matrix transform;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public static class ActiveIndicator {

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float amplitudeFraction = 1.0f;

        @ColorInt
        int color;

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float endFraction;

        @Px
        int gapSize;
        boolean isDeterminate;

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float phaseFraction;
        float rotationDegree;

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float startFraction;
    }

    public DrawingDelegate(S s) {
        Path path = new Path();
        this.cachedActivePath = path;
        this.displayedActivePath = new Path();
        this.activePathMeasure = new PathMeasure(path, false);
        this.spec = s;
        this.transform = new Matrix();
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = -1.0d, to = 1.0d) float f7, boolean z10, boolean z11);

    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i, @IntRange(from = 0, to = 255) int i3);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f7, @FloatRange(from = 0.0d, to = 1.0d) float f10, @ColorInt int i, @IntRange(from = 0, to = 255) int i3, @Px int i8);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public abstract void invalidateCachedPaths();

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f7, boolean z10, boolean z11) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f7, z10, z11);
    }

    public float vectorToCanvasRotation(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public class PathPoint {
        float[] posVec;
        float[] tanVec;
        final Matrix transform;

        public PathPoint(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.posVec = fArr3;
            this.tanVec = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.tanVec, 0, 2);
            this.transform = new Matrix();
        }

        public float distance(DrawingDelegate<S>.PathPoint pathPoint) {
            float f7 = pathPoint.posVec[0];
            float[] fArr = this.posVec;
            return (float) Math.hypot(f7 - fArr[0], r5[1] - fArr[1]);
        }

        public void moveAcross(float f7) {
            float[] fArr = this.tanVec;
            float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            double d10 = f7;
            double d11 = atan2;
            this.posVec[0] = (float) ((Math.cos(d11) * d10) + r2[0]);
            this.posVec[1] = (float) m.e(d11, d10, r14[1]);
        }

        public void moveAlong(float f7) {
            float[] fArr = this.tanVec;
            float atan2 = (float) Math.atan2(fArr[1], fArr[0]);
            double d10 = f7;
            double d11 = atan2;
            this.posVec[0] = (float) ((Math.cos(d11) * d10) + r2[0]);
            this.posVec[1] = (float) m.e(d11, d10, r14[1]);
        }

        public void reset() {
            Arrays.fill(this.posVec, 0.0f);
            Arrays.fill(this.tanVec, 0.0f);
            this.tanVec[0] = 1.0f;
            this.transform.reset();
        }

        public void rotate(float f7) {
            this.transform.reset();
            this.transform.setRotate(f7);
            this.transform.mapPoints(this.posVec);
            this.transform.mapPoints(this.tanVec);
        }

        public void scale(float f7, float f10) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] * f7;
            fArr[1] = fArr[1] * f10;
            float[] fArr2 = this.tanVec;
            fArr2[0] = fArr2[0] * f7;
            fArr2[1] = fArr2[1] * f10;
        }

        public void translate(float f7, float f10) {
            float[] fArr = this.posVec;
            fArr[0] = fArr[0] + f7;
            fArr[1] = fArr[1] + f10;
        }

        public PathPoint(DrawingDelegate drawingDelegate, DrawingDelegate<S>.PathPoint pathPoint) {
            this(pathPoint.posVec, pathPoint.tanVec);
        }

        public PathPoint() {
            this.posVec = new float[2];
            this.tanVec = r3;
            float[] fArr = {1.0f};
            this.transform = new Matrix();
        }
    }
}
