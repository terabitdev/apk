package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.services.AudioPreviewService;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.FeatureFlagService;
import io.elevenlabs.domain.services.PurchasesService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f audioPreviewServiceProvider;
    private final ul.f collectionsServiceProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f featureFlagServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f navigationServiceProvider;
    private final ul.f playerServiceProvider;
    private final ul.f purchasesServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;

    private ReadDetailsViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14) {
        this.dispatcherFactoryProvider = fVar;
        this.loggerProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.readsServiceProvider = fVar4;
        this.toastServiceProvider = fVar5;
        this.analyticsProvider = fVar6;
        this.purchasesServiceProvider = fVar7;
        this.audioPreviewServiceProvider = fVar8;
        this.stringProvider = fVar9;
        this.playerServiceProvider = fVar10;
        this.navigationServiceProvider = fVar11;
        this.customerServiceProvider = fVar12;
        this.collectionsServiceProvider = fVar13;
        this.featureFlagServiceProvider = fVar14;
    }

    public static ReadDetailsViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14) {
        return new ReadDetailsViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14);
    }

    public static ReadDetailsViewModel newInstance(DispatcherFactory dispatcherFactory, Logger logger, ResolveErrorMessageUseCase resolveErrorMessageUseCase, ReadsService readsService, ToastService toastService, Analytics analytics, PurchasesService purchasesService, AudioPreviewService audioPreviewService, StringProvider stringProvider, PlayerService playerService, jl.a aVar, CustomerService customerService, jl.a aVar2, FeatureFlagService featureFlagService) {
        return new ReadDetailsViewModel(dispatcherFactory, logger, resolveErrorMessageUseCase, readsService, toastService, analytics, purchasesService, audioPreviewService, stringProvider, playerService, aVar, customerService, aVar2, featureFlagService);
    }

    @Override // rn.a
    public ReadDetailsViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (ReadsService) this.readsServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (Analytics) this.analyticsProvider.get(), (PurchasesService) this.purchasesServiceProvider.get(), (AudioPreviewService) this.audioPreviewServiceProvider.get(), (StringProvider) this.stringProvider.get(), (PlayerService) this.playerServiceProvider.get(), ul.b.a(this.navigationServiceProvider), (CustomerService) this.customerServiceProvider.get(), ul.b.a(this.collectionsServiceProvider), (FeatureFlagService) this.featureFlagServiceProvider.get());
    }
}
