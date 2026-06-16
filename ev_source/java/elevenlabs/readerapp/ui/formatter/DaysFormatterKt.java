package io.elevenlabs.readerapp.ui.formatter;

import io.elevenlabs.readerapp.R;
import kj.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"", "", "formatDays", "(ILu2/m;I)Ljava/lang/String;", "formatWeeks", "formatMonths", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DaysFormatterKt {
    public static final String formatDays(int i10, m mVar, int i11) {
        return c.I(R.plurals.time_days_long_plurals, i10, new Object[]{Integer.valueOf(i10)}, mVar);
    }

    public static final String formatMonths(int i10, m mVar, int i11) {
        return c.I(R.plurals.time_months_long_plurals, i10, new Object[]{Integer.valueOf(i10)}, mVar);
    }

    public static final String formatWeeks(int i10, m mVar, int i11) {
        return c.I(R.plurals.time_weeks_long_plurals, i10, new Object[]{Integer.valueOf(i10)}, mVar);
    }
}
