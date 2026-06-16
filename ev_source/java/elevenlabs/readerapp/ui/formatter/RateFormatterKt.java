package io.elevenlabs.readerapp.ui.formatter;

import android.gov.nist.core.Separators;
import android.icu.text.NumberFormat;
import io.elevenlabs.domain.model.Rating;
import jo.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.m;
import wq.u;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"", "", "formatRatingScore", "(F)Ljava/lang/String;", "Lio/elevenlabs/domain/model/Rating;", "formatRating", "(Lio/elevenlabs/domain/model/Rating;Lu2/m;I)Ljava/lang/String;", "formatLongRating", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RateFormatterKt {
    public static final String formatLongRating(Rating rating, m mVar, int i10) {
        rating.getClass();
        return u.R(a.y(rating.getAverage()), "★") + Separators.SP + formatRatingScore(rating.getAverage()) + " (" + NumberFormatterKt.formatInteger(rating.getCount(), mVar, 0) + Separators.RPAREN;
    }

    public static final String formatRating(Rating rating, m mVar, int i10) {
        rating.getClass();
        return h.c("★ ", formatRatingScore(rating.getAverage()), " (", NumberFormatterKt.formatInteger(rating.getCount(), mVar, 0), Separators.RPAREN);
    }

    public static final String formatRatingScore(float f10) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumFractionDigits(1);
        numberInstance.setMaximumFractionDigits(1);
        String format = numberInstance.format(f10);
        format.getClass();
        return format;
    }
}
