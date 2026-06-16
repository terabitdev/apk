package com.uptodown.util.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;
import kotlin.jvm.internal.h;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class UsernameTextView extends AppCompatTextView {
    public static final /* synthetic */ int s = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f4512a;

    /* renamed from: b, reason: collision with root package name */
    public float f4513b;
    public int[] l;
    public Integer m;

    /* renamed from: n, reason: collision with root package name */
    public long f4514n;
    public long o;
    public boolean p;
    public String q;
    public Handler r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.r = new Handler(Looper.getMainLooper());
        this.m = Integer.valueOf(getCurrentTextColor());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a() {
        int color;
        getPaint().setShader(null);
        String str = this.q;
        if (str != null) {
            switch (str.hashCode()) {
                case 110843959:
                    if (str.equals("type1")) {
                        color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_1_1);
                        break;
                    }
                    break;
                case 110843960:
                    if (str.equals("type2")) {
                        color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_2_1);
                        break;
                    }
                    break;
                case 110843961:
                    if (str.equals("type3")) {
                        color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_3_1);
                        break;
                    }
                    break;
            }
            setTextColor(color);
        }
        color = ContextCompat.getColor(getContext(), R.color.text_terciary);
        setTextColor(color);
    }

    public final Handler getAnimationHandler() {
        return this.r;
    }

    public final String getUsernameFormat() {
        return this.q;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (this.l != null) {
            ValueAnimator valueAnimator = this.f4512a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                float width = getWidth();
                int[] iArr = this.l;
                iArr.getClass();
                float f7 = this.f4513b;
                getPaint().setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, iArr, new float[]{0.0f, f7, f7, f7, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                a();
            }
        } else {
            Integer num = this.m;
            if (num != null) {
                num.getClass();
                setTextColor(num.intValue());
            }
        }
        super.onDraw(canvas);
    }

    public final void setAnimationHandler(Handler handler) {
        this.r = handler;
    }

    public final void setTurbo(boolean z10) {
        this.p = z10;
    }

    public final void setUsernameFormat(String str) {
        this.q = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ UsernameTextView(Context context, AttributeSet attributeSet, int i, int i3, h hVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
