package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.SoundscapesService;
import io.elevenlabs.domain.services.player.PlayerService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class SoundscapesViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f playerServiceProvider;
    private final ul.f soundscapesServiceProvider;

    private SoundscapesViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.soundscapesServiceProvider = fVar;
        this.playerServiceProvider = fVar2;
        this.analyticsProvider = fVar3;
        this.loggerProvider = fVar4;
        this.dispatcherFactoryProvider = fVar5;
    }

    public static SoundscapesViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new SoundscapesViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static SoundscapesViewModel newInstance(SoundscapesService soundscapesService, PlayerService playerService, Analytics analytics, Logger logger, DispatcherFactory dispatcherFactory) {
        return new SoundscapesViewModel(soundscapesService, playerService, analytics, logger, dispatcherFactory);
    }

    @Override // rn.a
    public SoundscapesViewModel get() {
        return newInstance((SoundscapesService) this.soundscapesServiceProvider.get(), (PlayerService) this.playerServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
