package io.elevenlabs.injector.di;

import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.player.BackgroundPlayerControllerService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lio/elevenlabs/injector/di/PlayerServiceModule;", "", "<init>", "()V", "bindPlayerService", "Lio/elevenlabs/domain/services/player/PlayerService;", "backgroundControlledPlayerService", "Lio/elevenlabs/player/BackgroundPlayerControllerService;", "injector_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class PlayerServiceModule {
    public abstract PlayerService bindPlayerService(BackgroundPlayerControllerService backgroundControlledPlayerService);
}
