package io.elevenlabs.readerapp.ui.formatter;

import defpackage.f;
import io.elevenlabs.domain.model.TtsTimeConversionKt;
import io.elevenlabs.ui.format.DurationFormatterKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.k;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsn/k;", "", "", "toSpokenDurationRangeText", "(Lsn/k;)Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OffsetRangeToTimeFormatterKt {
    public static final String toSpokenDurationRangeText(k kVar) {
        kVar.getClass();
        return f.j(DurationFormatterKt.formatSecondsAsTime((int) TtsTimeConversionKt.charsToSeconds(((Number) kVar.f31600a).longValue()), true), " - ", DurationFormatterKt.formatSecondsAsTime((int) TtsTimeConversionKt.charsToSeconds(((Number) kVar.f31601b).longValue()), true));
    }
}
