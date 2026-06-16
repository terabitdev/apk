package io.elevenlabs.domain.usecase;

import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.HighlighterPositionConverter;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/domain/usecase/MediaAudioPositionResolver;", "", "<init>", "()V", "resolve", "Lio/elevenlabs/domain/usecase/MediaAudioPosition;", "chapter", "Lio/elevenlabs/domain/model/Chapter;", "converter", "Lio/elevenlabs/domain/model/HighlighterPositionConverter;", "startCharOffset", "", "endCharOffset", "Companion", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaAudioPositionResolver {
    public static final double MIN_END_NUDGE_SECONDS = 0.5d;

    public final MediaAudioPosition resolve(Chapter chapter, HighlighterPositionConverter converter, long startCharOffset, long endCharOffset) {
        Double time;
        double d10;
        chapter.getClass();
        converter.getClass();
        String audioFileNumber = chapter.getAudioFileNumber();
        if (audioFileNumber == null || (time = converter.toTime(audioFileNumber, startCharOffset)) == null) {
            return null;
        }
        double doubleValue = time.doubleValue();
        Double time2 = converter.toTime(audioFileNumber, endCharOffset);
        if (time2 != null) {
            d10 = time2.doubleValue();
        } else {
            d10 = doubleValue;
        }
        return new MediaAudioPosition(chapter.getIndex(), doubleValue, Math.max(d10, 0.5d + doubleValue));
    }
}
