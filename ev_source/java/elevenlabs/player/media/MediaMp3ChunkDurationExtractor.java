package io.elevenlabs.player.media;

import io.elevenlabs.domain.services.player.Mp3ChunkDurationExtractor;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/player/media/MediaMp3ChunkDurationExtractor;", "Lio/elevenlabs/domain/services/player/Mp3ChunkDurationExtractor;", "<init>", "()V", "getDurationUs", "", "bytes", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaMp3ChunkDurationExtractor implements Mp3ChunkDurationExtractor {
    @Override // io.elevenlabs.domain.services.player.Mp3ChunkDurationExtractor
    public long getDurationUs(long bytes) {
        if (bytes == -1) {
            return -9223372036854775807L;
        }
        return (Math.max(0L, bytes) * 8000000) / 128000;
    }
}
