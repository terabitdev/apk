package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements MultiViewUpdateListener.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4126a;

    public /* synthetic */ a(int i) {
        this.f4126a = i;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        switch (this.f4126a) {
            case 0:
                MultiViewUpdateListener.setTranslationX(valueAnimator, view);
                return;
            case 1:
                MultiViewUpdateListener.setScale(valueAnimator, view);
                return;
            case 2:
                MultiViewUpdateListener.setTranslationY(valueAnimator, view);
                return;
            default:
                MultiViewUpdateListener.setAlpha(valueAnimator, view);
                return;
        }
    }
}
