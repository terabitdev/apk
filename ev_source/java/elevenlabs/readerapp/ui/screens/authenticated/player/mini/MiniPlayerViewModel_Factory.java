package io.elevenlabs.readerapp.ui.screens.authenticated.player.mini;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.PlayerVisibilityService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.player.PlayerService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class MiniPlayerViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f playerServiceProvider;
    private final ul.f playerVisibilityServiceProvider;
    private final ul.f readsServiceProvider;

    private MiniPlayerViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.playerServiceProvider = fVar3;
        this.playerVisibilityServiceProvider = fVar4;
    }

    public static MiniPlayerViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new MiniPlayerViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static MiniPlayerViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService, PlayerService playerService, PlayerVisibilityService playerVisibilityService) {
        return new MiniPlayerViewModel(dispatcherFactory, readsService, playerService, playerVisibilityService);
    }

    @Override // rn.a
    public MiniPlayerViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get(), (PlayerService) this.playerServiceProvider.get(), (PlayerVisibilityService) this.playerVisibilityServiceProvider.get());
    }
}
