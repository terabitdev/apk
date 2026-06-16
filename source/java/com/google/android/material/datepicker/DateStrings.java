package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
class DateStrings {
    private DateStrings() {
    }

    public static Pair<String, String> getDateRangeString(@Nullable Long l, @Nullable Long l10, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l == null && l10 == null) {
            return Pair.create(null, null);
        }
        if (l == null) {
            return Pair.create(null, getDateString(l10.longValue(), simpleDateFormat));
        }
        if (l10 == null) {
            return Pair.create(getDateString(l.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l10.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l10.longValue())));
        }
        if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            if (utcCalendar.get(1) == todayCalendar.get(1)) {
                return Pair.create(getMonthDay(l.longValue(), Locale.getDefault()), getMonthDay(l10.longValue(), Locale.getDefault()));
            }
            return Pair.create(getMonthDay(l.longValue(), Locale.getDefault()), getYearMonthDay(l10.longValue(), Locale.getDefault()));
        }
        return Pair.create(getYearMonthDay(l.longValue(), Locale.getDefault()), getYearMonthDay(l10.longValue(), Locale.getDefault()));
    }

    public static String getDateString(long j, @Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (isDateWithinCurrentYear(j)) {
            return getMonthDay(j);
        }
        return getYearMonthDay(j);
    }

    public static String getDayContentDescription(Context context, long j, boolean z10, boolean z11, boolean z12) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j);
        if (z10) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        if (z11) {
            return String.format(context.getString(R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay);
        }
        if (z12) {
            return String.format(context.getString(R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay);
        }
        return optionalYearMonthDayOfWeekDay;
    }

    public static String getMonthDay(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j));
        }
        return UtcDates.getMediumNoYear(locale).format(new Date(j));
    }

    public static String getMonthDayOfWeekDay(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j));
        }
        return UtcDates.getFullFormat(locale).format(new Date(j));
    }

    public static String getOptionalYearMonthDayOfWeekDay(long j) {
        if (isDateWithinCurrentYear(j)) {
            return getMonthDayOfWeekDay(j);
        }
        return getYearMonthDayOfWeekDay(j);
    }

    public static String getYearContentDescription(Context context, int i) {
        if (UtcDates.getTodayCalendar().get(1) == i) {
            return String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i));
        }
        return String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i));
    }

    public static String getYearMonth(long j) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j));
        }
        return DateUtils.formatDateTime(null, j, 8228);
    }

    public static String getYearMonthDay(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j));
        }
        return UtcDates.getMediumFormat(locale).format(new Date(j));
    }

    public static String getYearMonthDayOfWeekDay(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j));
        }
        return UtcDates.getFullFormat(locale).format(new Date(j));
    }

    private static boolean isDateWithinCurrentYear(long j) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        if (todayCalendar.get(1) == utcCalendar.get(1)) {
            return true;
        }
        return false;
    }

    public static String getDateString(long j) {
        return getDateString(j, null);
    }

    public static String getMonthDay(long j) {
        return getMonthDay(j, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j) {
        return getMonthDayOfWeekDay(j, Locale.getDefault());
    }

    public static String getYearMonthDay(long j) {
        return getYearMonthDay(j, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j) {
        return getYearMonthDayOfWeekDay(j, Locale.getDefault());
    }

    public static Pair<String, String> getDateRangeString(@Nullable Long l, @Nullable Long l10) {
        return getDateRangeString(l, l10, null);
    }
}
