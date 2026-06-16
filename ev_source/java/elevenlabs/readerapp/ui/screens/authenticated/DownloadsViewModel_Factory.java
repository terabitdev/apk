package io.elevenlabs.readerapp.ui.screens.authenticated;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.OfflineReadsService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class DownloadsViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f offlineReadsServiceProvider;
    private final ul.f stringProvider;

    private DownloadsViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.stringProvider = fVar2;
        this.offlineReadsServiceProvider = fVar3;
        this.analyticsProvider = fVar4;
    }

    public static DownloadsViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new DownloadsViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static DownloadsViewModel newInstance(DispatcherFactory dispatcherFactory, StringProvider stringProvider, OfflineReadsService offlineReadsService, Analytics analytics) {
        return new DownloadsViewModel(dispatcherFactory, stringProvider, offlineReadsService, analytics);
    }

    @Override // rn.a
    public DownloadsViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (StringProvider) this.stringProvider.get(), (OfflineReadsService) this.offlineReadsServiceProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
