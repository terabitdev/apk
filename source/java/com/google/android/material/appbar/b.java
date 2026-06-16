package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4079c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f4077a = i;
        this.f4078b = obj;
        this.f4079c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4077a) {
            case 0:
                AppBarLayout.a((AppBarLayout) this.f4078b, (MaterialShapeDrawable) this.f4079c, valueAnimator);
                return;
            case 1:
                ((ExpandCollapseAnimationHelper) this.f4078b).lambda$getExpandCollapseAnimator$0((Rect) this.f4079c, valueAnimator);
                return;
            default:
                DeterminateDrawable.a((DeterminateDrawable) this.f4078b, (BaseProgressIndicatorSpec) this.f4079c, valueAnimator);
                return;
        }
    }
}
