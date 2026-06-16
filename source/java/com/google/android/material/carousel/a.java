package com.google.android.material.carousel;

import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4087b;

    public /* synthetic */ a(Object obj, int i) {
        this.f4086a = i;
        this.f4087b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i3, int i8, int i10, int i11, int i12, int i13, int i14) {
        switch (this.f4086a) {
            case 0:
                CarouselLayoutManager.b((CarouselLayoutManager) this.f4087b, view, i, i3, i8, i10, i11, i12, i13, i14);
                return;
            default:
                NavigationBarItemView.a((NavigationBarItemView) this.f4087b, view, i, i3, i8, i10, i11, i12, i13, i14);
                return;
        }
    }
}
