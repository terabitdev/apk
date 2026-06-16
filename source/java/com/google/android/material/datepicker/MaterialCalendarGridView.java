package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.nestedScrollable = MaterialDatePicker.isNestedScrollable(getContext());
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
    }

    private void gainFocus(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().lastPositionInMonth());
        } else if (i == 130) {
            setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    private View getChildAtPosition(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    private static int horizontalMidPoint(@NonNull View view) {
        return (view.getWidth() / 2) + view.getLeft();
    }

    private static boolean skipMonth(@Nullable Long l, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        if (l == null || l10 == null || l11 == null || l12 == null || l11.longValue() > l10.longValue() || l12.longValue() < l.longValue()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public ListAdapter getAdapter2() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int dayToPosition;
        int horizontalMidPoint;
        int dayToPosition2;
        int horizontalMidPoint2;
        int i;
        int i3;
        int i8;
        int i10;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = materialCalendarGridView.getAdapter();
        DateSelector<?> dateSelector = adapter.dateSelector;
        CalendarStyle calendarStyle = adapter.calendarStyle;
        int max = Math.max(adapter.firstPositionInMonth(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(adapter.lastPositionInMonth(), materialCalendarGridView.getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        for (Pair<Long, Long> pair : dateSelector.getSelectedRanges()) {
            Long l = pair.first;
            if (l != null) {
                if (pair.second != null) {
                    Long l10 = l;
                    long longValue = l10.longValue();
                    Long l11 = pair.second;
                    long longValue2 = l11.longValue();
                    if (!skipMonth(item, item2, l10, l11)) {
                        boolean isLayoutRtl = ViewUtils.isLayoutRtl(materialCalendarGridView);
                        if (longValue < item.longValue()) {
                            if (adapter.isFirstInRow(max)) {
                                left2 = 0;
                            } else if (!isLayoutRtl) {
                                left2 = materialCalendarGridView.getChildAtPosition(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.getChildAtPosition(max - 1).getLeft();
                            }
                            horizontalMidPoint = left2;
                            dayToPosition = max;
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue);
                            dayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(dayToPosition));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter.isLastInRow(min)) {
                                left = materialCalendarGridView.getWidth();
                            } else if (!isLayoutRtl) {
                                left = materialCalendarGridView.getChildAtPosition(min).getRight();
                            } else {
                                left = materialCalendarGridView.getChildAtPosition(min).getLeft();
                            }
                            horizontalMidPoint2 = left;
                            dayToPosition2 = min;
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(longValue2);
                            dayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            horizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAtPosition(dayToPosition2));
                        }
                        int itemId = (int) adapter.getItemId(dayToPosition);
                        int i11 = max;
                        int i12 = min;
                        int itemId2 = (int) adapter.getItemId(dayToPosition2);
                        while (itemId <= itemId2) {
                            int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                            int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                            View childAtPosition = materialCalendarGridView.getChildAtPosition(numColumns);
                            int top = childAtPosition.getTop() + calendarStyle.day.getTopInset();
                            MonthAdapter monthAdapter = adapter;
                            int bottom = childAtPosition.getBottom() - calendarStyle.day.getBottomInset();
                            if (!isLayoutRtl) {
                                if (numColumns > dayToPosition) {
                                    i10 = 0;
                                } else {
                                    i10 = horizontalMidPoint;
                                }
                                if (dayToPosition2 > numColumns2) {
                                    i8 = getWidth();
                                } else {
                                    i8 = horizontalMidPoint2;
                                }
                            } else {
                                if (dayToPosition2 > numColumns2) {
                                    i = 0;
                                } else {
                                    i = horizontalMidPoint2;
                                }
                                if (numColumns > dayToPosition) {
                                    i3 = getWidth();
                                } else {
                                    i3 = horizontalMidPoint;
                                }
                                int i13 = i;
                                i8 = i3;
                                i10 = i13;
                            }
                            canvas.drawRect(i10, top, i8, bottom, calendarStyle.rangeFill);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = monthAdapter;
                        }
                        materialCalendarGridView = this;
                        max = i11;
                        min = i12;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i, Rect rect) {
        if (z10) {
            gainFocus(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= getAdapter().firstPositionInMonth() && selectedItemPosition <= getAdapter().lastPositionInMonth())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().firstPositionInMonth());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i3) {
        if (this.nestedScrollable) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i3);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof MonthAdapter) {
            super.setAdapter(listAdapter);
        } else {
            androidx.core.view.inputmethod.a.q("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().firstPositionInMonth()) {
            super.setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
