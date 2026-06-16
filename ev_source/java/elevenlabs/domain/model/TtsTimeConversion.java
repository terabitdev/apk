package io.elevenlabs.domain.model;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/domain/model/TtsTimeConversion;", "", "<init>", "()V", "MS_PER_CHAR", "", "charsToMs", "chars", "msToChars", "ms", "charsToSeconds", "", "secondsToChars", "seconds", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class TtsTimeConversion {
    public static final TtsTimeConversion INSTANCE = new TtsTimeConversion();
    public static final long MS_PER_CHAR = 60;

    private TtsTimeConversion() {
    }

    public final long charsToMs(long chars) {
        return chars * 60;
    }

    public final double charsToSeconds(long chars) {
        return (chars * 60) / 1000.0d;
    }

    public final long msToChars(long ms2) {
        return ms2 / 60;
    }

    public final long secondsToChars(int seconds) {
        return (seconds * 1000) / 60;
    }
}
