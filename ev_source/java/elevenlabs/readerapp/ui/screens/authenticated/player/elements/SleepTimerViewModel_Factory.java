package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class SleepTimerViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f getCurrentTimeUseCaseProvider;
    private final ul.f playerServiceProvider;
    private final ul.f readsServiceProvider;

    private SleepTimerViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.playerServiceProvider = fVar3;
        this.getCurrentTimeUseCaseProvider = fVar4;
    }

    public static SleepTimerViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new SleepTimerViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static SleepTimerViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService, PlayerService playerService, GetCurrentTimeUseCase getCurrentTimeUseCase) {
        return new SleepTimerViewModel(dispatcherFactory, readsService, playerService, getCurrentTimeUseCase);
    }

    @Override // rn.a
    public SleepTimerViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get(), (PlayerService) this.playerServiceProvider.get(), (GetCurrentTimeUseCase) this.getCurrentTimeUseCaseProvider.get());
    }
}
