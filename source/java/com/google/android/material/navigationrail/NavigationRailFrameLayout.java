package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class NavigationRailFrameLayout extends FrameLayout {
    int paddingTop;
    boolean scrollingEnabled;

    public NavigationRailFrameLayout(@NonNull Context context) {
        super(context);
        this.paddingTop = 0;
        this.scrollingEnabled = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i3, int i8, int i10) {
        super.onLayout(z10, i, i3, i8, i10);
        int childCount = getChildCount();
        int i11 = this.paddingTop;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int max = Math.max(i11, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), max, childAt.getRight(), childAt.getMeasuredHeight() + max);
            i11 = max + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int childCount = getChildCount();
        int i8 = 0;
        View childAt = getChildAt(0);
        int size = View.MeasureSpec.getSize(i3);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i, i3);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            i8 = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int i10 = (size - i8) - this.paddingTop;
            childAt = getChildAt(1);
            if (!this.scrollingEnabled) {
                i3 = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i, i3);
        setMeasuredDimension(getMeasuredWidth(), Math.max(size, this.paddingTop + i8 + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }

    public void setPaddingTop(int i) {
        this.paddingTop = i;
    }

    public void setScrollingEnabled(boolean z10) {
        this.scrollingEnabled = z10;
    }
}
