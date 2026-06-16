package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    @Px
    private int itemMinimumHeight;

    @Px
    private int itemSpacing;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        this.itemSpacing = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int makeSharedHeightSpec(int i, int i3, int i8) {
        int max = i3 / Math.max(1, i8);
        int i10 = this.itemMinimumHeight;
        if (i10 == -1) {
            i10 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i10, max), 0);
    }

    private int measureChildHeight(View view, int i, int i3) {
        view.measure(i, i3);
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int measureSharedChildHeights(int i, int i3, int i8, View view) {
        int makeMeasureSpec;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 0);
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof NavigationBarItemView)) {
                int measureChildHeight = measureChildHeight(childAt, i, makeMeasureSpec2);
                i3 -= measureChildHeight;
                i10 += measureChildHeight;
            }
        }
        int max = Math.max(i3, 0);
        if (view == null) {
            makeMeasureSpec = makeSharedHeightSpec(i, max, i8);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() == 0) {
                i12++;
            }
            if ((childAt2 instanceof NavigationBarItemView) && childAt2 != view) {
                i10 += measureChildHeight(childAt2, i, makeMeasureSpec);
            }
        }
        return (Math.max(0, i12 - 1) * this.itemSpacing) + i10;
    }

    private int measureShiftingChildHeights(int i, int i3, int i8) {
        int i10;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i10 = measureChildHeight(childAt, i, makeSharedHeightSpec(i, i3, i8));
            i3 -= i10;
            i8--;
        } else {
            i10 = 0;
        }
        return i10 + measureSharedChildHeights(i, i3, i8, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    @Px
    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i3, int i8, int i10) {
        int max;
        int childCount = getChildCount();
        int i11 = i8 - i;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                i13 += childAt.getMeasuredHeight();
                i12++;
            }
        }
        if (i12 <= 1) {
            max = 0;
        } else {
            max = Math.max(0, Math.min((getMeasuredHeight() - i13) / (i12 - 1), this.itemSpacing));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight = childAt2.getMeasuredHeight();
                childAt2.layout(0, i15, i11, measuredHeight + i15);
                i15 += measuredHeight + max;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        int measureSharedChildHeights;
        int size = View.MeasureSpec.getSize(i3);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        if (currentVisibleContentItemCount > 1 && isShifting(getLabelVisibilityMode(), currentVisibleContentItemCount)) {
            measureSharedChildHeights = measureShiftingChildHeights(i, size, currentVisibleContentItemCount);
        } else {
            measureSharedChildHeights = measureSharedChildHeights(i, size, currentVisibleContentItemCount, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(measureSharedChildHeights, i3, 0));
    }

    public void setItemMinimumHeight(@Px int i) {
        if (this.itemMinimumHeight != i) {
            this.itemMinimumHeight = i;
            requestLayout();
        }
    }

    public void setItemSpacing(@Px int i) {
        if (this.itemSpacing != i) {
            this.itemSpacing = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}
