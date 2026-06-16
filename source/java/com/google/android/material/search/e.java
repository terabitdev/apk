package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4140c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f4138a = i;
        this.f4139b = obj;
        this.f4140c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4138a) {
            case 0:
                SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1((MaterialShapeDrawable) this.f4139b, (View) this.f4140c, valueAnimator);
                return;
            default:
                ((SearchViewAnimationHelper) this.f4139b).lambda$addEditTextClipAnimator$6((Rect) this.f4140c, valueAnimator);
                return;
        }
    }
}
