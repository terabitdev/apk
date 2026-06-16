package io.elevenlabs.readerapp.ui.formatter;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.readerapp.R;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0003\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0005\u001a\u0013\u0010\t\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0005\u001a\u0013\u0010\t\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\u0003\u001a\u0013\u0010\n\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u0003\u001a!\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u0001*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "", "formatMinutesShort", "(ILu2/m;I)Ljava/lang/String;", "", "(JLu2/m;I)Ljava/lang/String;", "formatMinutesLong", "formatMinutesToHoursOrMinutesShort", "formatMinutesToHoursOrMinutesLong", "formatHoursShort", "formatHoursLong", "hours", "pluralHours", "formatHours", "(IILu2/m;I)Ljava/lang/String;", "", "formatSecondsAsDuration", "(DLu2/m;I)Ljava/lang/String;", "minutes", "pluralMinutes", "formatDuration", "(IIIILu2/m;I)Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MinutesFormatterKt {
    private static final String formatDuration(int i10, int i11, int i12, int i13, m mVar, int i14) {
        String I = c.I(i13, i12, new Object[]{Integer.valueOf(i12)}, mVar);
        String formatHours = formatHours(i10, i11, mVar, i14 & 126);
        if (i10 == 0) {
            return I;
        }
        if (i12 == 0) {
            return formatHours;
        }
        return f.j(formatHours, Separators.SP, I);
    }

    public static final String formatHours(int i10, int i11, m mVar, int i12) {
        return c.I(i11, i10, new Object[]{Integer.valueOf(i10)}, mVar);
    }

    public static final String formatHoursLong(int i10, m mVar, int i11) {
        return c.I(R.plurals.time_hours_long_plurals, i10, new Object[]{Integer.valueOf(i10)}, mVar);
    }

    public static final String formatHoursShort(int i10, m mVar, int i11) {
        return c.I(R.plurals.time_hours_plurals, i10, new Object[]{Integer.valueOf(i10)}, mVar);
    }

    public static final String formatMinutesLong(int i10, m mVar, int i11) {
        return formatDuration(i10 / 60, R.plurals.time_hours_long_plurals, i10 % 60, R.plurals.time_minutes_long_plurals, mVar, 0);
    }

    public static final String formatMinutesShort(int i10, m mVar, int i11) {
        return formatDuration(i10 / 60, R.plurals.time_hours_plurals, i10 % 60, R.plurals.time_minutes_plurals, mVar, 0);
    }

    public static final String formatMinutesToHoursOrMinutesLong(int i10, m mVar, int i11) {
        if (i10 >= 60) {
            q qVar = (q) mVar;
            qVar.X(-1671557731);
            String formatHoursLong = formatHoursLong(i10 / 60, (m) qVar, 0);
            qVar.p(false);
            return formatHoursLong;
        }
        q qVar2 = (q) mVar;
        qVar2.X(-1671556769);
        String formatMinutesLong = formatMinutesLong(i10, qVar2, i11 & 14);
        qVar2.p(false);
        return formatMinutesLong;
    }

    public static final String formatMinutesToHoursOrMinutesShort(int i10, m mVar, int i11) {
        if (i10 >= 60) {
            q qVar = (q) mVar;
            qVar.X(232926744);
            String formatHoursShort = formatHoursShort(i10 / 60, (m) qVar, 0);
            qVar.p(false);
            return formatHoursShort;
        }
        q qVar2 = (q) mVar;
        qVar2.X(232927738);
        String formatMinutesShort = formatMinutesShort(i10, (m) qVar2, i11 & 14);
        qVar2.p(false);
        return formatMinutesShort;
    }

    public static final String formatSecondsAsDuration(double d10, m mVar, int i10) {
        return formatMinutesToHoursOrMinutesShort((int) (d10 / 60), mVar, 0);
    }

    public static final String formatHoursLong(long j4, m mVar, int i10) {
        return formatHoursLong((int) j4, mVar, 0);
    }

    public static final String formatHoursShort(long j4, m mVar, int i10) {
        return formatHoursShort((int) j4, mVar, 0);
    }

    public static final String formatMinutesShort(long j4, m mVar, int i10) {
        return formatMinutesShort((int) j4, mVar, 0);
    }

    public static final String formatMinutesToHoursOrMinutesLong(long j4, m mVar, int i10) {
        return formatMinutesToHoursOrMinutesLong((int) j4, mVar, 0);
    }

    public static final String formatMinutesToHoursOrMinutesShort(long j4, m mVar, int i10) {
        return formatMinutesToHoursOrMinutesShort((int) j4, mVar, 0);
    }
}
