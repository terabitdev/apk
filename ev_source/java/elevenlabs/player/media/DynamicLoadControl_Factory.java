package io.elevenlabs.player.media;

import g8.h;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.StreamingService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DynamicLoadControl_Factory implements c {
    private final f delegateProvider;
    private final f loggerProvider;
    private final f streamingServiceProvider;

    private DynamicLoadControl_Factory(f fVar, f fVar2, f fVar3) {
        this.streamingServiceProvider = fVar;
        this.loggerProvider = fVar2;
        this.delegateProvider = fVar3;
    }

    public static DynamicLoadControl_Factory create(f fVar, f fVar2, f fVar3) {
        return new DynamicLoadControl_Factory(fVar, fVar2, fVar3);
    }

    public static DynamicLoadControl newInstance(StreamingService streamingService, Logger logger, h hVar) {
        return new DynamicLoadControl(streamingService, logger, hVar);
    }

    @Override // rn.a
    public DynamicLoadControl get() {
        return newInstance((StreamingService) this.streamingServiceProvider.get(), (Logger) this.loggerProvider.get(), (h) this.delegateProvider.get());
    }
}
