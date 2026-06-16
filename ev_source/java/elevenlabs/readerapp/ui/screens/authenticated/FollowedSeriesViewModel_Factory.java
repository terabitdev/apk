package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.CollectionsService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class FollowedSeriesViewModel_Factory implements ul.c {
    private final ul.f collectionsServiceProvider;
    private final ul.f dispatcherFactoryProvider;

    private FollowedSeriesViewModel_Factory(ul.f fVar, ul.f fVar2) {
        this.dispatcherFactoryProvider = fVar;
        this.collectionsServiceProvider = fVar2;
    }

    public static FollowedSeriesViewModel_Factory create(ul.f fVar, ul.f fVar2) {
        return new FollowedSeriesViewModel_Factory(fVar, fVar2);
    }

    public static FollowedSeriesViewModel newInstance(DispatcherFactory dispatcherFactory, CollectionsService collectionsService) {
        return new FollowedSeriesViewModel(dispatcherFactory, collectionsService);
    }

    @Override // rn.a
    public FollowedSeriesViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (CollectionsService) this.collectionsServiceProvider.get());
    }
}
