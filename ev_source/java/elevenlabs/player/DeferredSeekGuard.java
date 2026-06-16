package io.elevenlabs.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0005J\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/player/DeferredSeekGuard;", "", "<init>", "()V", "MIN_MEANINGFUL_SEEK_DELTA_MS", "", "isMeaningfulSeekDiscontinuity", "", "positionDeltaMs", "mediaItemChanged", "minSeekDeltaMs", "shouldExecuteDeferredInitialSeek", "playbackState", "", "seekPositionReady", "needsInitialSeek", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DeferredSeekGuard {
    public static final DeferredSeekGuard INSTANCE = new DeferredSeekGuard();
    private static final long MIN_MEANINGFUL_SEEK_DELTA_MS = 250;

    private DeferredSeekGuard() {
    }

    public static /* synthetic */ boolean isMeaningfulSeekDiscontinuity$default(DeferredSeekGuard deferredSeekGuard, long j4, boolean z6, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 250;
        }
        return deferredSeekGuard.isMeaningfulSeekDiscontinuity(j4, z6, j10);
    }

    public final boolean isMeaningfulSeekDiscontinuity(long positionDeltaMs, boolean mediaItemChanged, long minSeekDeltaMs) {
        if (!mediaItemChanged && positionDeltaMs < minSeekDeltaMs) {
            return false;
        }
        return true;
    }

    public final boolean shouldExecuteDeferredInitialSeek(int playbackState, boolean seekPositionReady, boolean needsInitialSeek) {
        if (playbackState == 3 && seekPositionReady && needsInitialSeek) {
            return true;
        }
        return false;
    }
}
