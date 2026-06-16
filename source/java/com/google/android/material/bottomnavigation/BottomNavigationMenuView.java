package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List<Integer> tempChildWidths;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i3, int i8, int i10) {
        int childCount = getChildCount();
        int i11 = i8 - i;
        int i12 = i10 - i3;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i15 = i11 - i13;
                    childAt.layout(i15 - childAt.getMeasuredWidth(), 0, i15, i12);
                } else {
                    childAt.layout(i13, 0, childAt.getMeasuredWidth() + i13, i12);
                }
                i13 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        int i8;
        int i10;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE);
        int i14 = 1;
        int i15 = 0;
        if (getItemIconGravity() == 0) {
            if (isShifting(getLabelVisibilityMode(), currentVisibleContentItemCount) && isItemHorizontalTranslationEnabled()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int i16 = this.activeItemMinWidth;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                    i16 = Math.max(i16, childAt.getMeasuredWidth());
                }
                if (childAt.getVisibility() != 8) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                int i17 = currentVisibleContentItemCount - i12;
                int min = Math.min(size - (this.inactiveItemMinWidth * i17), Math.min(i16, this.activeItemMaxWidth));
                int i18 = size - min;
                if (i17 != 0) {
                    i14 = i17;
                }
                int min2 = Math.min(i18 / i14, this.inactiveItemMaxWidth);
                int i19 = i18 - (i17 * min2);
                for (int i20 = 0; i20 < childCount; i20++) {
                    if (getChildAt(i20).getVisibility() != 8) {
                        if (i20 == getSelectedItemPosition()) {
                            i13 = min;
                        } else {
                            i13 = min2;
                        }
                        if (i19 > 0) {
                            i13++;
                            i19--;
                        }
                    } else {
                        i13 = 0;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i13));
                }
            } else {
                if (currentVisibleContentItemCount != 0) {
                    i14 = currentVisibleContentItemCount;
                }
                int min3 = Math.min(size / i14, this.activeItemMaxWidth);
                int i21 = size - (currentVisibleContentItemCount * min3);
                for (int i22 = 0; i22 < childCount; i22++) {
                    if (getChildAt(i22).getVisibility() != 8) {
                        if (i21 > 0) {
                            i11 = min3 + 1;
                            i21--;
                        } else {
                            i11 = min3;
                        }
                    } else {
                        i11 = 0;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i11));
                }
            }
            i8 = 0;
            i10 = 0;
            while (i15 < childCount) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i15).intValue(), 1073741824), makeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    int measuredWidth = childAt2.getMeasuredWidth() + i8;
                    i10 = Math.max(i10, childAt2.getMeasuredHeight());
                    i8 = measuredWidth;
                }
                i15++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f7 = size;
            float min4 = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f7;
            float f10 = currentVisibleContentItemCount;
            int round = Math.round(min4 / f10);
            int round2 = Math.round(f7 / f10);
            int i23 = 0;
            int i24 = 0;
            while (i15 < childCount) {
                View childAt3 = getChildAt(i15);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(round2, Integer.MIN_VALUE), makeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < round) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(round, 1073741824), makeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i23;
                    i24 = Math.max(i24, childAt3.getMeasuredHeight());
                    i23 = measuredWidth2;
                }
                i15++;
            }
            i8 = i23;
            i10 = i24;
        }
        setMeasuredDimension(i8, Math.max(i10, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.itemHorizontalTranslationEnabled = z10;
    }
}
