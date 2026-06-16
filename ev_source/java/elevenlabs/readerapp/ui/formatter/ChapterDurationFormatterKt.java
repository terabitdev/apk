package io.elevenlabs.readerapp.ui.formatter;

import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.TtsTimeConversionKt;
import io.elevenlabs.ui.format.DurationFormatterKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getFormattedDuration", "", "Lio/elevenlabs/domain/model/Chapter;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ChapterDurationFormatterKt {
    public static final String getFormattedDuration(Chapter chapter) {
        String formatSecondsAsTime;
        chapter.getClass();
        Double durationSeconds = chapter.getDurationSeconds();
        if (durationSeconds != null && (formatSecondsAsTime = DurationFormatterKt.formatSecondsAsTime(durationSeconds.doubleValue())) != null) {
            return formatSecondsAsTime;
        }
        return DurationFormatterKt.formatSecondsAsTime(TtsTimeConversionKt.charsToSeconds(chapter.getCharCount()));
    }
}
