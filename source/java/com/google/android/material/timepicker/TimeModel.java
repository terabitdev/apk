package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    };
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";
    final int format;
    int hour;
    private final MaxInputValidator hourInputValidator;
    int minute;
    private final MaxInputValidator minuteInputValidator;
    int period;
    int selection;

    public TimeModel(int i, int i3, int i8, int i10) {
        int i11;
        this.hour = i;
        this.minute = i3;
        this.selection = i8;
        this.format = i10;
        this.period = getPeriod(i);
        this.minuteInputValidator = new MaxInputValidator(59);
        if (i10 == 1) {
            i11 = 23;
        } else {
            i11 = 12;
        }
        this.hourInputValidator = new MaxInputValidator(i11);
    }

    @Nullable
    public static String formatText(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int getPeriod(int i) {
        if (i >= 12) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.hour == timeModel.hour && this.minute == timeModel.minute && this.format == timeModel.format && this.selection == timeModel.selection) {
            return true;
        }
        return false;
    }

    @StringRes
    public int getHourContentDescriptionResId() {
        if (this.format == 1) {
            return R.string.material_hour_24h_suffix;
        }
        return R.string.material_hour_suffix;
    }

    public int getHourForDisplay() {
        int i = this.format;
        int i3 = this.hour;
        if (i == 1) {
            return i3 % 24;
        }
        if (i3 % 12 == 0) {
            return 12;
        }
        if (this.period == 1) {
            return i3 - 12;
        }
        return i3;
    }

    public MaxInputValidator getHourInputValidator() {
        return this.hourInputValidator;
    }

    public MaxInputValidator getMinuteInputValidator() {
        return this.minuteInputValidator;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.format), Integer.valueOf(this.hour), Integer.valueOf(this.minute), Integer.valueOf(this.selection)});
    }

    public void setHour(int i) {
        if (this.format == 1) {
            this.hour = i;
            return;
        }
        int i3 = 12;
        int i8 = i % 12;
        if (this.period != 1) {
            i3 = 0;
        }
        this.hour = i8 + i3;
    }

    public void setHourOfDay(int i) {
        this.period = getPeriod(i);
        this.hour = i;
    }

    public void setMinute(@IntRange(from = 0, to = 59) int i) {
        this.minute = i % 60;
    }

    public void setPeriod(int i) {
        if (i != this.period) {
            this.period = i;
            int i3 = this.hour;
            if (i3 < 12 && i == 1) {
                this.hour = i3 + 12;
            } else if (i3 >= 12 && i == 0) {
                this.hour = i3 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hour);
        parcel.writeInt(this.minute);
        parcel.writeInt(this.selection);
        parcel.writeInt(this.format);
    }

    @Nullable
    public static String formatText(Resources resources, CharSequence charSequence) {
        return formatText(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel() {
        this(0);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
