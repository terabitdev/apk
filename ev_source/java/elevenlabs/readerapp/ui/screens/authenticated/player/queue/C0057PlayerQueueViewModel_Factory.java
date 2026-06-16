package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.services.player.PlayerService;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0057PlayerQueueViewModel_Factory {
    private final f analyticsProvider;
    private final f dispatcherFactoryProvider;
    private final f playerServiceProvider;

    private C0057PlayerQueueViewModel_Factory(f fVar, f fVar2, f fVar3) {
        this.dispatcherFactoryProvider = fVar;
        this.playerServiceProvider = fVar2;
        this.analyticsProvider = fVar3;
    }

    public static C0057PlayerQueueViewModel_Factory create(f fVar, f fVar2, f fVar3) {
        return new C0057PlayerQueueViewModel_Factory(fVar, fVar2, fVar3);
    }

    public static PlayerQueueViewModel newInstance(DispatcherFactory dispatcherFactory, PlayerService playerService, MediaItemState mediaItemState, Analytics analytics) {
        return new PlayerQueueViewModel(dispatcherFactory, playerService, mediaItemState, analytics);
    }

    public PlayerQueueViewModel get(MediaItemState mediaItemState) {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (PlayerService) this.playerServiceProvider.get(), mediaItemState, (Analytics) this.analyticsProvider.get());
    }
}
