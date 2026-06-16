package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.CollectionsService;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class CollectionViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f collectionsServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f downloadReadUseCaseProvider;
    private final ul.f offlineReadsServiceProvider;
    private final ul.f playerServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private CollectionViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        this.dispatcherFactoryProvider = fVar;
        this.collectionsServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.toastServiceProvider = fVar4;
        this.readsServiceProvider = fVar5;
        this.offlineReadsServiceProvider = fVar6;
        this.downloadReadUseCaseProvider = fVar7;
        this.stringProvider = fVar8;
        this.playerServiceProvider = fVar9;
        this.analyticsProvider = fVar10;
    }

    public static CollectionViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        return new CollectionViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10);
    }

    public static CollectionViewModel newInstance(DispatcherFactory dispatcherFactory, CollectionsService collectionsService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ToastService toastService, ReadsService readsService, OfflineReadsService offlineReadsService, jl.a aVar, StringProvider stringProvider, PlayerService playerService, Analytics analytics) {
        return new CollectionViewModel(dispatcherFactory, collectionsService, resolveErrorMessageUseCase, toastService, readsService, offlineReadsService, aVar, stringProvider, playerService, analytics);
    }

    @Override // rn.a
    public CollectionViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (CollectionsService) this.collectionsServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (ToastService) this.toastServiceProvider.get(), (ReadsService) this.readsServiceProvider.get(), (OfflineReadsService) this.offlineReadsServiceProvider.get(), ul.b.a(this.downloadReadUseCaseProvider), (StringProvider) this.stringProvider.get(), (PlayerService) this.playerServiceProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
