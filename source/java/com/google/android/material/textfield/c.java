package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f4174b;

    public /* synthetic */ c(EndIconDelegate endIconDelegate, int i) {
        this.f4173a = i;
        this.f4174b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4173a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f4174b).lambda$getAlphaAnimator$3(valueAnimator);
                return;
            case 1:
                ((ClearTextEndIconDelegate) this.f4174b).lambda$getScaleAnimator$4(valueAnimator);
                return;
            default:
                ((DropdownMenuEndIconDelegate) this.f4174b).lambda$getAlphaAnimator$6(valueAnimator);
                return;
        }
    }
}
