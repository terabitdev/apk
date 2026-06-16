package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.internal.ViewUtils;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements AnimatableView.Listener, ViewUtils.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4134a;

    public /* synthetic */ c(Object obj) {
        this.f4134a = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f4134a).start();
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        WindowInsetsCompat lambda$setUpToolbarInsetListener$4;
        lambda$setUpToolbarInsetListener$4 = ((SearchView) this.f4134a).lambda$setUpToolbarInsetListener$4(view, windowInsetsCompat, relativePadding);
        return lambda$setUpToolbarInsetListener$4;
    }
}
