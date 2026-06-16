package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import com.google.android.material.internal.FadeThroughDrawable;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4132b;

    public /* synthetic */ a(Object obj, int i) {
        this.f4131a = i;
        this.f4132b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4131a) {
            case 0:
                SearchBarAnimationHelper.a(valueAnimator, (View) this.f4132b);
                return;
            case 1:
                SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$4((DrawerArrowDrawable) this.f4132b, valueAnimator);
                return;
            case 2:
                SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$5((FadeThroughDrawable) this.f4132b, valueAnimator);
                return;
            case 3:
                ((SearchViewAnimationHelper) this.f4132b).lambda$addTextFadeAnimatorIfNeeded$7(valueAnimator);
                return;
            default:
                SearchViewAnimationHelper.lambda$addBackButtonAnimatorIfNeeded$3((ImageButton) this.f4132b, valueAnimator);
                return;
        }
    }
}
