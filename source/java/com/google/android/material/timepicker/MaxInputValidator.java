package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
class MaxInputValidator implements InputFilter {
    private int max;

    public MaxInputValidator(int i) {
        this.max = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i3, Spanned spanned, int i8, int i10) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i8, i10, charSequence.subSequence(i, i3).toString());
            if (Integer.parseInt(sb.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int i) {
        this.max = i;
    }
}
