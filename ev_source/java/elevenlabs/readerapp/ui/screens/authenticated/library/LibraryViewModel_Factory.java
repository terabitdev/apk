package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class LibraryViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f collectionsServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f downloadReadUseCaseProvider;
    private final ul.f loggerProvider;
    private final ul.f offlineReadsServiceProvider;
    private final ul.f playerServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private LibraryViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.offlineReadsServiceProvider = fVar3;
        this.collectionsServiceProvider = fVar4;
        this.downloadReadUseCaseProvider = fVar5;
        this.stringProvider = fVar6;
        this.playerServiceProvider = fVar7;
        this.toastServiceProvider = fVar8;
        this.analyticsProvider = fVar9;
        this.loggerProvider = fVar10;
    }

    public static LibraryViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        return new LibraryViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10);
    }

    public static LibraryViewModel newInstance(DispatcherFactory dispatcherFactory, jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, StringProvider stringProvider, PlayerService playerService, ToastService toastService, Analytics analytics, Logger logger) {
        return new LibraryViewModel(dispatcherFactory, aVar, aVar2, aVar3, aVar4, stringProvider, playerService, toastService, analytics, logger);
    }

    @Override // rn.a
    public LibraryViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), ul.b.a(this.readsServiceProvider), ul.b.a(this.offlineReadsServiceProvider), ul.b.a(this.collectionsServiceProvider), ul.b.a(this.downloadReadUseCaseProvider), (StringProvider) this.stringProvider.get(), (PlayerService) this.playerServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (Logger) this.loggerProvider.get());
    }
}
