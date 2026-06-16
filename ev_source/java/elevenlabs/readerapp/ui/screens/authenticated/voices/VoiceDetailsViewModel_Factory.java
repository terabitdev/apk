package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.FavoriteVoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class VoiceDetailsViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f audioPreviewServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f favoriteVoicesServiceProvider;
    private final ul.f readsExploreServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f stringProvider;
    private final ul.f toastServiceProvider;
    private final ul.f voicesServiceProvider;

    private VoiceDetailsViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        this.dispatcherFactoryProvider = fVar;
        this.favoriteVoicesServiceProvider = fVar2;
        this.voicesServiceProvider = fVar3;
        this.readsExploreServiceProvider = fVar4;
        this.stringProvider = fVar5;
        this.toastServiceProvider = fVar6;
        this.resolveErrorMessageUseCaseProvider = fVar7;
        this.audioPreviewServiceProvider = fVar8;
        this.analyticsProvider = fVar9;
    }

    public static VoiceDetailsViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9) {
        return new VoiceDetailsViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9);
    }

    public static VoiceDetailsViewModel newInstance(DispatcherFactory dispatcherFactory, FavoriteVoicesService favoriteVoicesService, jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar5, Analytics analytics) {
        return new VoiceDetailsViewModel(dispatcherFactory, favoriteVoicesService, aVar, aVar2, aVar3, aVar4, resolveErrorMessageUseCase, aVar5, analytics);
    }

    @Override // rn.a
    public VoiceDetailsViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (FavoriteVoicesService) this.favoriteVoicesServiceProvider.get(), ul.b.a(this.voicesServiceProvider), ul.b.a(this.readsExploreServiceProvider), ul.b.a(this.stringProvider), ul.b.a(this.toastServiceProvider), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), ul.b.a(this.audioPreviewServiceProvider), (Analytics) this.analyticsProvider.get());
    }
}
