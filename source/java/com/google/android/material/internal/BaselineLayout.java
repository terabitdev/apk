package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class BaselineLayout extends ViewGroup {
    private int baseline;
    private boolean measurePaddingFromBaseline;

    public BaselineLayout(Context context) {
        super(context, null, 0);
        this.baseline = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.baseline;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i3, int i8, int i10) {
        int i11;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i8 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.baseline != -1 && childAt.getBaseline() != -1) {
                    i11 = (this.baseline + paddingTop) - childAt.getBaseline();
                } else {
                    i11 = paddingTop;
                }
                childAt.layout(i13, i11, measuredWidth + i13, measuredHeight + i11);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        int childCount = getChildCount();
        int i8 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i3);
                i8 = Math.max(i8, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i13 = Math.max(i13, baseline);
                    i14 = Math.max(i14, childAt.getMeasuredHeight() - baseline);
                }
                i11 = Math.max(i11, childAt.getMeasuredWidth());
                i10 = Math.max(i10, childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        if (i13 != -1) {
            if (this.measurePaddingFromBaseline) {
                i10 = Math.max(i10, Math.max(i14, getPaddingBottom()) + i13);
            }
            this.baseline = i13;
        }
        if (!this.measurePaddingFromBaseline) {
            i10 = getPaddingBottom() + i8;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i11, getSuggestedMinimumWidth()), i, i12), View.resolveSizeAndState(Math.max(i10, getSuggestedMinimumHeight()), i3, i12 << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z10) {
        this.measurePaddingFromBaseline = z10;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.baseline = -1;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.baseline = -1;
    }
}
