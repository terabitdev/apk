package com.uptodown.views;

import a6.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.measurement.a4;
import com.uptodown.R;
import d7.a0;
import java.util.List;
import kotlin.jvm.internal.h;
import s4.c;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class DonutChartView extends View {

    /* renamed from: a, reason: collision with root package name */
    public List f4515a;

    /* renamed from: b, reason: collision with root package name */
    public String f4516b;
    public final float l;
    public final Paint m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f4517n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonutChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.f4515a = a0.f4706a;
        this.f4516b = "";
        this.l = 50.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        this.m = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(c.u);
        paint2.setColor(ContextCompat.getColor(context, R.color.blue_primary));
        paint2.setTextSize(context.getResources().getDimension(R.dimen.font_size_26));
        this.f4517n = paint2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.f4515a.isEmpty()) {
            return;
        }
        float min = Math.min(getWidth(), getHeight());
        float f7 = this.l;
        float f10 = (min - f7) / 2.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Paint paint = this.m;
        paint.setStrokeWidth(f7);
        double d10 = 0.0d;
        while (this.f4515a.iterator().hasNext()) {
            d10 += ((k) r1.next()).f218a;
        }
        float f11 = (float) d10;
        RectF rectF = new RectF(width - f10, height - f10, width + f10, f10 + height);
        if (f11 <= 0.0f) {
            paint.setColor(ContextCompat.getColor(getContext(), R.color.light_grey));
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint);
        } else {
            canvas2 = canvas;
            float f12 = -90.0f;
            for (k kVar : this.f4515a) {
                float f13 = (kVar.f218a / f11) * 360.0f;
                paint.setColor(kVar.f219b);
                canvas2.drawArc(rectF, f12, f13, false, paint);
                f12 += f13;
            }
        }
        int length = this.f4516b.length();
        Paint paint2 = this.f4517n;
        if (length > 0) {
            canvas2.drawText(this.f4516b, width, height - ((paint2.ascent() + paint2.descent()) / 2.0f), paint2);
        } else {
            float ascent = height - ((paint2.ascent() + paint2.descent()) / 2.0f);
            Context context = getContext();
            context.getClass();
            canvas2.drawText(a4.x(context, 0L), width, ascent, paint2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = 240;
            }
        } else {
            size = Math.min(240, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = 240;
            }
        } else {
            size2 = Math.min(240, size2);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DonutChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ DonutChartView(Context context, AttributeSet attributeSet, int i, int i3, h hVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DonutChartView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
