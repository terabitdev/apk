package com.google.android.material.slider;

import androidx.annotation.NonNull;
import java.util.Locale;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class BasicLabelFormatter implements LabelFormatter {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final long TRILLION = 1000000000000L;

    @Override // com.google.android.material.slider.LabelFormatter
    @NonNull
    public String getFormattedValue(float f7) {
        if (f7 >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", Float.valueOf(f7 / 1.0E12f));
        }
        if (f7 >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", Float.valueOf(f7 / 1.0E9f));
        }
        if (f7 >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", Float.valueOf(f7 / 1000000.0f));
        }
        if (f7 >= 1000.0f) {
            return String.format(Locale.US, "%.1fK", Float.valueOf(f7 / 1000.0f));
        }
        return String.format(Locale.US, "%.0f", Float.valueOf(f7));
    }
}
