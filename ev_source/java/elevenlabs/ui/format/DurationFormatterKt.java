package io.elevenlabs.ui.format;

import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.h;
import sn.o;
import u2.b0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\t\u001a\u00020\u0003*\u00020\u000b¢\u0006\u0004\b\t\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", "", "padHours", "", "formatMinutesDuration", "(JZ)Ljava/lang/String;", "", "totalSeconds", "leadingZeroOnMinutes", "formatSecondsAsTime", "(IZ)Ljava/lang/String;", "", "(D)Ljava/lang/String;", "formatTimeRemainingShort", "(J)Ljava/lang/String;", "Landroid/icu/text/MeasureFormat;", "REMAINING_TIME_FORMATTER_SHORT$delegate", "Lsn/h;", "getREMAINING_TIME_FORMATTER_SHORT", "()Landroid/icu/text/MeasureFormat;", "REMAINING_TIME_FORMATTER_SHORT", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DurationFormatterKt {
    private static final h REMAINING_TIME_FORMATTER_SHORT$delegate = new o(new b0(28));

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureFormat REMAINING_TIME_FORMATTER_SHORT_delegate$lambda$0() {
        return MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.NARROW);
    }

    public static final String formatMinutesDuration(long j4, boolean z6) {
        String str;
        long j10 = 60;
        long j11 = j4 / j10;
        long j12 = j4 % j10;
        if (z6) {
            str = "%02d";
        } else {
            str = "%d";
        }
        return String.format(Locale.getDefault(), str.concat(":%02d"), Arrays.copyOf(new Object[]{Long.valueOf(j11), Long.valueOf(j12)}, 2));
    }

    public static /* synthetic */ String formatMinutesDuration$default(long j4, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        return formatMinutesDuration(j4, z6);
    }

    public static final String formatSecondsAsTime(int i10, boolean z6) {
        String str;
        int i11 = i10 / 3600;
        int i12 = (i10 % 3600) / 60;
        int i13 = i10 % 60;
        if (i11 > 0) {
            return String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)}, 3));
        }
        if (z6) {
            str = "%02d";
        } else {
            str = "%d";
        }
        return String.format(Locale.getDefault(), str.concat(":%02d"), Arrays.copyOf(new Object[]{Integer.valueOf(i12), Integer.valueOf(i13)}, 2));
    }

    public static /* synthetic */ String formatSecondsAsTime$default(int i10, boolean z6, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z6 = false;
        }
        return formatSecondsAsTime(i10, z6);
    }

    public static final String formatTimeRemainingShort(long j4) {
        String formatMeasures;
        if (j4 < 100) {
            String format = getREMAINING_TIME_FORMATTER_SHORT().format(new Measure(Integer.valueOf((int) j4), MeasureUnit.SECOND));
            format.getClass();
            return format;
        }
        long j10 = 60;
        long j11 = (j4 + 59) / j10;
        int i10 = (int) (j11 / j10);
        int i11 = (int) (j11 % j10);
        if (i10 == 1) {
            if (i11 == 0) {
                formatMeasures = getREMAINING_TIME_FORMATTER_SHORT().format(new Measure(Integer.valueOf(i10), MeasureUnit.HOUR));
            } else {
                formatMeasures = getREMAINING_TIME_FORMATTER_SHORT().formatMeasures(new Measure(Integer.valueOf(i10), MeasureUnit.HOUR), new Measure(Integer.valueOf(i11), MeasureUnit.MINUTE));
            }
            formatMeasures.getClass();
            return formatMeasures;
        }
        if (i10 >= 2) {
            String format2 = getREMAINING_TIME_FORMATTER_SHORT().format(new Measure(Integer.valueOf(i10), MeasureUnit.HOUR));
            format2.getClass();
            return format2;
        }
        String format3 = getREMAINING_TIME_FORMATTER_SHORT().format(new Measure(Integer.valueOf(i11), MeasureUnit.MINUTE));
        format3.getClass();
        return format3;
    }

    private static final MeasureFormat getREMAINING_TIME_FORMATTER_SHORT() {
        Object value = REMAINING_TIME_FORMATTER_SHORT$delegate.getValue();
        value.getClass();
        return (MeasureFormat) value;
    }

    public static final String formatSecondsAsTime(double d10) {
        return formatSecondsAsTime((int) d10, false);
    }
}
