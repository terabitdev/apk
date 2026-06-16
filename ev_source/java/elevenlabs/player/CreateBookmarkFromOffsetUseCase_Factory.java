package io.elevenlabs.player;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ReadBookmarkService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.MediaAudioPositionResolver;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CreateBookmarkFromOffsetUseCase_Factory implements ul.c {
    private final ul.f bookmarkServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f mediaAudioPositionResolverProvider;
    private final ul.f readsServiceProvider;

    private CreateBookmarkFromOffsetUseCase_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.readsServiceProvider = fVar;
        this.bookmarkServiceProvider = fVar2;
        this.mediaAudioPositionResolverProvider = fVar3;
        this.dispatcherFactoryProvider = fVar4;
        this.loggerProvider = fVar5;
    }

    public static CreateBookmarkFromOffsetUseCase_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new CreateBookmarkFromOffsetUseCase_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static CreateBookmarkFromOffsetUseCase newInstance(ReadsService readsService, ReadBookmarkService readBookmarkService, MediaAudioPositionResolver mediaAudioPositionResolver, DispatcherFactory dispatcherFactory, Logger logger) {
        return new CreateBookmarkFromOffsetUseCase(readsService, readBookmarkService, mediaAudioPositionResolver, dispatcherFactory, logger);
    }

    @Override // rn.a
    public CreateBookmarkFromOffsetUseCase get() {
        return newInstance((ReadsService) this.readsServiceProvider.get(), (ReadBookmarkService) this.bookmarkServiceProvider.get(), (MediaAudioPositionResolver) this.mediaAudioPositionResolverProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get());
    }
}
