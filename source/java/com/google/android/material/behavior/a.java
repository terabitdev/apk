package com.google.android.material.behavior;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4081b;
    public final /* synthetic */ CoordinatorLayout.Behavior l;

    public /* synthetic */ a(CoordinatorLayout.Behavior behavior, View view, int i) {
        this.f4080a = i;
        this.l = behavior;
        this.f4081b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        switch (this.f4080a) {
            case 0:
                HideBottomViewOnScrollBehavior.a((HideBottomViewOnScrollBehavior) this.l, this.f4081b, z10);
                return;
            default:
                HideViewOnScrollBehavior.a((HideViewOnScrollBehavior) this.l, this.f4081b, z10);
                return;
        }
    }
}
