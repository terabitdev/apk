package io.elevenlabs.domain.model;

import io.elevenlabs.domain.model.BookmarkAudioPositionResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/domain/model/InvalidBookmarkAudioPositionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "Lio/elevenlabs/domain/model/BookmarkAudioPositionResult$Invalid;", "<init>", "(Lio/elevenlabs/domain/model/BookmarkAudioPositionResult$Invalid;)V", "getReason", "()Lio/elevenlabs/domain/model/BookmarkAudioPositionResult$Invalid;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class InvalidBookmarkAudioPositionException extends Exception {
    private final BookmarkAudioPositionResult.Invalid reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidBookmarkAudioPositionException(BookmarkAudioPositionResult.Invalid invalid) {
        super("Invalid bookmark audio position: " + invalid);
        invalid.getClass();
        this.reason = invalid;
    }

    public final BookmarkAudioPositionResult.Invalid getReason() {
        return this.reason;
    }
}
