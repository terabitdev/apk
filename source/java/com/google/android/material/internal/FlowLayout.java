package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    private static int getMeasuredDimension(int i, int i3, int i8) {
        if (i3 != Integer.MIN_VALUE) {
            if (i3 != 1073741824) {
                return i8;
            }
            return i;
        }
        return Math.min(i8, i);
    }

    private void loadFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_horizontalItemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getLineSpacing() {
        return this.lineSpacing;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(@NonNull View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i3, int i8, int i10) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int i11;
        int i12;
        boolean z12;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        boolean z13 = true;
        this.rowCount = 1;
        if (getLayoutDirection() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i13 = 0;
        int i14 = paddingLeft;
        int i15 = paddingTop;
        while (i13 < getChildCount()) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z12 = z13;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.getMarginStart();
                    i11 = marginLayoutParams.getMarginEnd();
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i14 + i12;
                int i16 = i8 - i;
                int i17 = i16 - paddingRight;
                z12 = z13;
                if (!this.singleLine && measuredWidth > i17) {
                    measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i12;
                    i15 = paddingTop + this.lineSpacing;
                    this.rowCount++;
                    i14 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z11) {
                    childAt.layout(i16 - measuredWidth, i15, (i16 - i14) - i12, measuredHeight);
                } else {
                    childAt.layout(i14 + i12, i15, measuredWidth, measuredHeight);
                }
                i14 += childAt.getMeasuredWidth() + i12 + i11 + this.itemSpacing;
                paddingTop = measuredHeight;
            }
            i13++;
            z13 = z12;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        int i8;
        int i10;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i8 - getPaddingRight();
        int i13 = paddingTop;
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i10 = marginLayoutParams.leftMargin;
                    i11 = marginLayoutParams.rightMargin;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i10 > paddingRight && !isSingleLine()) {
                    i12 = getPaddingLeft();
                    i13 = this.lineSpacing + paddingTop;
                } else {
                    i12 = i16;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i12 + i10;
                int measuredHeight = childAt.getMeasuredHeight() + i13;
                if (measuredWidth > i14) {
                    i14 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i10 + i11 + this.itemSpacing + i12;
                if (i15 == getChildCount() - 1) {
                    i14 += i11;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, getPaddingRight() + i14), getMeasuredDimension(size2, mode2, getPaddingBottom() + paddingTop));
    }

    public void setItemSpacing(int i) {
        this.itemSpacing = i;
    }

    public void setLineSpacing(int i) {
        this.lineSpacing = i;
    }

    public void setSingleLine(boolean z10) {
        this.singleLine = z10;
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i3) {
        super(context, attributeSet, i, i3);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
