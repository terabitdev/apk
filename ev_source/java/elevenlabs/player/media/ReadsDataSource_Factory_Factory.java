package io.elevenlabs.player.media;

import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.StreamingService;
import io.elevenlabs.player.media.ReadsDataSource;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReadsDataSource_Factory_Factory implements c {
    private final f loggerProvider;
    private final f streamingServiceProvider;

    private ReadsDataSource_Factory_Factory(f fVar, f fVar2) {
        this.loggerProvider = fVar;
        this.streamingServiceProvider = fVar2;
    }

    public static ReadsDataSource_Factory_Factory create(f fVar, f fVar2) {
        return new ReadsDataSource_Factory_Factory(fVar, fVar2);
    }

    public static ReadsDataSource.Factory newInstance(Logger logger, StreamingService streamingService) {
        return new ReadsDataSource.Factory(logger, streamingService);
    }

    @Override // rn.a
    public ReadsDataSource.Factory get() {
        return newInstance((Logger) this.loggerProvider.get(), (StreamingService) this.streamingServiceProvider.get());
    }
}
