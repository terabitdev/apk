package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class PlayerQueueViewModel_Factory_Impl implements PlayerQueueViewModel.Factory {
    private final C0057PlayerQueueViewModel_Factory delegateFactory;

    public PlayerQueueViewModel_Factory_Impl(C0057PlayerQueueViewModel_Factory c0057PlayerQueueViewModel_Factory) {
        this.delegateFactory = c0057PlayerQueueViewModel_Factory;
    }

    public static rn.a create(C0057PlayerQueueViewModel_Factory c0057PlayerQueueViewModel_Factory) {
        return ul.d.a(new PlayerQueueViewModel_Factory_Impl(c0057PlayerQueueViewModel_Factory));
    }

    public static f createFactoryProvider(C0057PlayerQueueViewModel_Factory c0057PlayerQueueViewModel_Factory) {
        return ul.d.a(new PlayerQueueViewModel_Factory_Impl(c0057PlayerQueueViewModel_Factory));
    }

    @Override // io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel.Factory
    public PlayerQueueViewModel create(MediaItemState mediaItemState) {
        return this.delegateFactory.get(mediaItemState);
    }
}
