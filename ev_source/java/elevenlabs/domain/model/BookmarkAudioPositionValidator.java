package io.elevenlabs.domain.model;

import ig.f;
import io.elevenlabs.domain.model.BookmarkAudioPositionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/domain/model/BookmarkAudioPositionValidator;", "", "<init>", "()V", "MIN_END_NUDGE_SECONDS", "", "validate", "Lio/elevenlabs/domain/model/BookmarkAudioPositionResult;", "chapterIndex", "", "startTimeSeconds", "endTimeSeconds", "chapterDurationSeconds", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lio/elevenlabs/domain/model/BookmarkAudioPositionResult;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BookmarkAudioPositionValidator {
    public static final BookmarkAudioPositionValidator INSTANCE = new BookmarkAudioPositionValidator();
    private static final double MIN_END_NUDGE_SECONDS = 0.5d;

    private BookmarkAudioPositionValidator() {
    }

    public static /* synthetic */ BookmarkAudioPositionResult validate$default(BookmarkAudioPositionValidator bookmarkAudioPositionValidator, Integer num, Double d10, Double d11, Double d12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            d12 = null;
        }
        return bookmarkAudioPositionValidator.validate(num, d10, d11, d12);
    }

    public final BookmarkAudioPositionResult validate(Integer chapterIndex, Double startTimeSeconds, Double endTimeSeconds, Double chapterDurationSeconds) {
        List I = f.I(chapterIndex, startTimeSeconds, endTimeSeconds);
        int i10 = 0;
        if (!I.isEmpty()) {
            Iterator it = I.iterator();
            while (it.hasNext()) {
                if (it.next() == null && (i10 = i10 + 1) < 0) {
                    f.T();
                    throw null;
                }
            }
        }
        if (i10 == 3) {
            return BookmarkAudioPositionResult.Absent.INSTANCE;
        }
        if (1 <= i10 && i10 < 3) {
            return BookmarkAudioPositionResult.Invalid.PartialTuple.INSTANCE;
        }
        chapterIndex.getClass();
        int intValue = chapterIndex.intValue();
        startTimeSeconds.getClass();
        double doubleValue = startTimeSeconds.doubleValue();
        endTimeSeconds.getClass();
        double doubleValue2 = endTimeSeconds.doubleValue();
        if (intValue < 0) {
            return BookmarkAudioPositionResult.Invalid.NegativeChapterIndex.INSTANCE;
        }
        if (doubleValue < 0.0d) {
            return BookmarkAudioPositionResult.Invalid.NegativeStartTime.INSTANCE;
        }
        if (doubleValue2 <= doubleValue) {
            return BookmarkAudioPositionResult.Invalid.EndNotAfterStart.INSTANCE;
        }
        if (chapterDurationSeconds != null && doubleValue2 > chapterDurationSeconds.doubleValue()) {
            doubleValue2 = Math.max(chapterDurationSeconds.doubleValue(), 0.5d + doubleValue);
        }
        return new BookmarkAudioPositionResult.Valid(intValue, doubleValue, doubleValue2);
    }
}
