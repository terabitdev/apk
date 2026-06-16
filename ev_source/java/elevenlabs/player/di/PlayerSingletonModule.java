package io.elevenlabs.player.di;

import io.elevenlabs.domain.services.SupportToolEvents;
import io.elevenlabs.domain.services.player.AssistantSessionService;
import io.elevenlabs.domain.services.player.Mp3ChunkDurationExtractor;
import io.elevenlabs.player.AssistantSessionManager;
import io.elevenlabs.player.media.MediaMp3ChunkDurationExtractor;
import io.elevenlabs.player.tools.SupportToolEventsImpl;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000eH'¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/player/di/PlayerSingletonModule;", "", "<init>", "()V", "bindMp3DurationExtractor", "Lio/elevenlabs/domain/services/player/Mp3ChunkDurationExtractor;", "mp3DurationExtractor", "Lio/elevenlabs/player/media/MediaMp3ChunkDurationExtractor;", "bindAssistantSessionService", "Lio/elevenlabs/domain/services/player/AssistantSessionService;", "impl", "Lio/elevenlabs/player/AssistantSessionManager;", "bindSupportToolEvents", "Lio/elevenlabs/domain/services/SupportToolEvents;", "Lio/elevenlabs/player/tools/SupportToolEventsImpl;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class PlayerSingletonModule {
    public abstract AssistantSessionService bindAssistantSessionService(AssistantSessionManager impl);

    public abstract Mp3ChunkDurationExtractor bindMp3DurationExtractor(MediaMp3ChunkDurationExtractor mp3DurationExtractor);

    public abstract SupportToolEvents bindSupportToolEvents(SupportToolEventsImpl impl);
}
