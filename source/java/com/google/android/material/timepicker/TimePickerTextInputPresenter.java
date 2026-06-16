package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {
    private final TimePickerTextInputKeyController controller;
    private final EditText hourEditText;
    private final ChipTextInputComboView hourTextInput;
    private final EditText minuteEditText;
    private final ChipTextInputComboView minuteTextInput;
    private final TimeModel time;
    private final LinearLayout timePickerView;
    private MaterialButtonToggleGroup toggle;
    private final TextWatcher minuteTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.1
        public AnonymousClass1() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.time.setMinute(0);
                } else {
                    TimePickerTextInputPresenter.this.time.setMinute(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    };
    private final TextWatcher hourTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.2
        public AnonymousClass2() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.time.setHour(0);
                } else {
                    TimePickerTextInputPresenter.this.time.setHour(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    };

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends TextWatcherAdapter {
        public AnonymousClass1() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.time.setMinute(0);
                } else {
                    TimePickerTextInputPresenter.this.time.setMinute(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 extends TextWatcherAdapter {
        public AnonymousClass2() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.this.time.setHour(0);
                } else {
                    TimePickerTextInputPresenter.this.time.setHour(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$3 */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerTextInputPresenter.this.onSelectionChanged(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$4 */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 extends ClickActionDelegate {
        final /* synthetic */ Resources val$res;
        final /* synthetic */ TimeModel val$time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context, int i, Resources resources, TimeModel timeModel) {
            super(context, i);
            r4 = resources;
            r5 = timeModel;
        }

        @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(r4.getString(R.string.material_timepicker_hour) + " " + view.getResources().getString(r5.getHourContentDescriptionResId(), String.valueOf(r5.getHourForDisplay())));
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$5 */
    /* loaded from: classes4.dex */
    public class AnonymousClass5 extends ClickActionDelegate {
        final /* synthetic */ Resources val$res;
        final /* synthetic */ TimeModel val$time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Context context, int i, Resources resources, TimeModel timeModel) {
            super(context, i);
            r4 = resources;
            r5 = timeModel;
        }

        @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setContentDescription(r4.getString(R.string.material_timepicker_minute) + " " + view.getResources().getString(R.string.material_minute_suffix, String.valueOf(r5.minute)));
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$6 */
    /* loaded from: classes4.dex */
    public class AnonymousClass6 extends View.AccessibilityDelegate {
        final /* synthetic */ int val$contentDescriptionResId;
        final /* synthetic */ Resources val$res;

        public AnonymousClass6(Resources resources, int i) {
            r2 = resources;
            r3 = i;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setText(r2.getString(r3));
        }
    }

    public TimePickerTextInputPresenter(LinearLayout linearLayout, TimeModel timeModel) {
        this.timePickerView = linearLayout;
        this.time = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.minuteTextInput = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.hourTextInput = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(R.id.material_label);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView.setImportantForAccessibility(2);
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        textView2.setImportantForAccessibility(2);
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (timeModel.format == 0) {
            setupPeriodToggle();
        }
        AnonymousClass3 anonymousClass3 = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.3
            public AnonymousClass3() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TimePickerTextInputPresenter.this.onSelectionChanged(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        };
        chipTextInputComboView2.setOnClickListener(anonymousClass3);
        chipTextInputComboView.setOnClickListener(anonymousClass3);
        chipTextInputComboView2.addInputFilter(timeModel.getHourInputValidator());
        chipTextInputComboView.addInputFilter(timeModel.getMinuteInputValidator());
        EditText editText = chipTextInputComboView2.getTextInput().getEditText();
        this.hourEditText = editText;
        editText.setAccessibilityDelegate(setTimeUnitAccessiblityLabel(linearLayout.getResources(), R.string.material_timepicker_hour));
        EditText editText2 = chipTextInputComboView.getTextInput().getEditText();
        this.minuteEditText = editText2;
        editText2.setAccessibilityDelegate(setTimeUnitAccessiblityLabel(linearLayout.getResources(), R.string.material_timepicker_minute));
        this.controller = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new ClickActionDelegate(linearLayout.getContext(), R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.4
            final /* synthetic */ Resources val$res;
            final /* synthetic */ TimeModel val$time;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(Context context, int i, Resources resources2, TimeModel timeModel2) {
                super(context, i);
                r4 = resources2;
                r5 = timeModel2;
            }

            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(r4.getString(R.string.material_timepicker_hour) + " " + view.getResources().getString(r5.getHourContentDescriptionResId(), String.valueOf(r5.getHourForDisplay())));
            }
        });
        chipTextInputComboView.setChipDelegate(new ClickActionDelegate(linearLayout.getContext(), R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.5
            final /* synthetic */ Resources val$res;
            final /* synthetic */ TimeModel val$time;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(Context context, int i, Resources resources2, TimeModel timeModel2) {
                super(context, i);
                r4 = resources2;
                r5 = timeModel2;
            }

            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(r4.getString(R.string.material_timepicker_minute) + " " + view.getResources().getString(R.string.material_minute_suffix, String.valueOf(r5.minute)));
            }
        });
        initialize();
    }

    private void addTextWatchers() {
        this.hourEditText.addTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.addTextChangedListener(this.minuteTextWatcher);
    }

    public /* synthetic */ void lambda$setupPeriodToggle$0(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z10) {
        int i3;
        if (!z10) {
            return;
        }
        if (i == R.id.material_clock_period_pm_button) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.time.setPeriod(i3);
    }

    private void removeTextWatchers() {
        this.hourEditText.removeTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.removeTextChangedListener(this.minuteTextWatcher);
    }

    private void setTime(TimeModel timeModel) {
        removeTextWatchers();
        Locale locale = this.timePickerView.getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.minute));
        String format2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.getHourForDisplay()));
        this.minuteTextInput.setText(format);
        this.hourTextInput.setText(format2);
        addTextWatchers();
        updateSelection();
    }

    private View.AccessibilityDelegate setTimeUnitAccessiblityLabel(Resources resources, int i) {
        return new View.AccessibilityDelegate() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.6
            final /* synthetic */ int val$contentDescriptionResId;
            final /* synthetic */ Resources val$res;

            public AnonymousClass6(Resources resources2, int i3) {
                r2 = resources2;
                r3 = i3;
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(r2.getString(r3));
            }
        };
    }

    private void setupPeriodToggle() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.timePickerView.findViewById(R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new c(this, 0));
        this.toggle.setVisibility(0);
        updateSelection();
    }

    private void updateSelection() {
        int i;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.toggle;
        if (materialButtonToggleGroup == null) {
            return;
        }
        if (this.time.period == 0) {
            i = R.id.material_clock_period_am_button;
        } else {
            i = R.id.material_clock_period_pm_button;
        }
        materialButtonToggleGroup.check(i);
    }

    public void clearCheck() {
        this.minuteTextInput.setChecked(false);
        this.hourTextInput.setChecked(false);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        View focusedChild = this.timePickerView.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.hideKeyboard(focusedChild, false);
        }
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        addTextWatchers();
        setTime(this.time);
        this.controller.bind();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        setTime(this.time);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i) {
        boolean z10;
        this.time.selection = i;
        ChipTextInputComboView chipTextInputComboView = this.minuteTextInput;
        boolean z11 = false;
        if (i == 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        chipTextInputComboView.setChecked(z10);
        ChipTextInputComboView chipTextInputComboView2 = this.hourTextInput;
        if (i == 10) {
            z11 = true;
        }
        chipTextInputComboView2.setChecked(z11);
        updateSelection();
    }

    public void resetChecked() {
        boolean z10;
        ChipTextInputComboView chipTextInputComboView = this.minuteTextInput;
        boolean z11 = false;
        if (this.time.selection == 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        chipTextInputComboView.setChecked(z10);
        ChipTextInputComboView chipTextInputComboView2 = this.hourTextInput;
        if (this.time.selection == 10) {
            z11 = true;
        }
        chipTextInputComboView2.setChecked(z11);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
        onSelectionChanged(this.time.selection);
    }
}
