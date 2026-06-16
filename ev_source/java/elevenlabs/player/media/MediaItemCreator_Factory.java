package io.elevenlabs.player.media;

import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class MediaItemCreator_Factory implements c {
    private final f configurationProvider;
    private final f loggerProvider;

    private MediaItemCreator_Factory(f fVar, f fVar2) {
        this.configurationProvider = fVar;
        this.loggerProvider = fVar2;
    }

    public static MediaItemCreator_Factory create(f fVar, f fVar2) {
        return new MediaItemCreator_Factory(fVar, fVar2);
    }

    public static MediaItemCreator newInstance(Configuration configuration, Logger logger) {
        return new MediaItemCreator(configuration, logger);
    }

    @Override // rn.a
    public MediaItemCreator get() {
        return newInstance((Configuration) this.configurationProvider.get(), (Logger) this.loggerProvider.get());
    }
}
