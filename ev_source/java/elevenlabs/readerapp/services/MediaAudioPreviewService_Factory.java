package io.elevenlabs.readerapp.services;

import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.player.PlayerService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class MediaAudioPreviewService_Factory implements c {
    private final f loggerProvider;
    private final f playerServiceProvider;

    private MediaAudioPreviewService_Factory(f fVar, f fVar2) {
        this.loggerProvider = fVar;
        this.playerServiceProvider = fVar2;
    }

    public static MediaAudioPreviewService_Factory create(f fVar, f fVar2) {
        return new MediaAudioPreviewService_Factory(fVar, fVar2);
    }

    public static MediaAudioPreviewService newInstance(Logger logger, PlayerService playerService) {
        return new MediaAudioPreviewService(logger, playerService);
    }

    @Override // rn.a
    public MediaAudioPreviewService get() {
        return newInstance((Logger) this.loggerProvider.get(), (PlayerService) this.playerServiceProvider.get());
    }
}
