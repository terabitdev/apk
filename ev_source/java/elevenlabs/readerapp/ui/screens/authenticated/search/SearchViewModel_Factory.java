package io.elevenlabs.readerapp.ui.screens.authenticated.search;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.GetCurrentTimeUseCase;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class SearchViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f getCurrentTimeUseCaseProvider;
    private final ul.f loggerProvider;
    private final ul.f playerServiceProvider;
    private final ul.f readsExploreServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private SearchViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
        this.readsExploreServiceProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
        this.getCurrentTimeUseCaseProvider = fVar5;
        this.loggerProvider = fVar6;
        this.analyticsProvider = fVar7;
        this.playerServiceProvider = fVar8;
        this.toastServiceProvider = fVar9;
        this.stringProvider = fVar10;
    }

    public static SearchViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10) {
        return new SearchViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10);
    }

    public static SearchViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService, ReadsExploreService readsExploreService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, GetCurrentTimeUseCase getCurrentTimeUseCase, Logger logger, Analytics analytics, PlayerService playerService, ToastService toastService, StringProvider stringProvider) {
        return new SearchViewModel(dispatcherFactory, readsService, readsExploreService, resolveErrorMessageUseCase, getCurrentTimeUseCase, logger, analytics, playerService, toastService, stringProvider);
    }

    @Override // rn.a
    public SearchViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get(), (ReadsExploreService) this.readsExploreServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (GetCurrentTimeUseCase) this.getCurrentTimeUseCaseProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get(), (PlayerService) this.playerServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (StringProvider) this.stringProvider.get());
    }
}
