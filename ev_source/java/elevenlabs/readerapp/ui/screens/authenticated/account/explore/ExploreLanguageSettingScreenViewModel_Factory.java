package io.elevenlabs.readerapp.ui.screens.authenticated.account.explore;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ReadsExploreService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ExploreLanguageSettingScreenViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f readsExploreServiceProvider;
    private final ul.f resolveErrorMessageUseCaseProvider;
    private final ul.f userConfigServiceProvider;

    private ExploreLanguageSettingScreenViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.readsExploreServiceProvider = fVar;
        this.userConfigServiceProvider = fVar2;
        this.resolveErrorMessageUseCaseProvider = fVar3;
        this.loggerProvider = fVar4;
        this.dispatcherFactoryProvider = fVar5;
    }

    public static ExploreLanguageSettingScreenViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new ExploreLanguageSettingScreenViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static ExploreLanguageSettingScreenViewModel newInstance(ReadsExploreService readsExploreService, UserConfigService userConfigService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Logger logger, DispatcherFactory dispatcherFactory) {
        return new ExploreLanguageSettingScreenViewModel(readsExploreService, userConfigService, resolveErrorMessageUseCase, logger, dispatcherFactory);
    }

    @Override // rn.a
    public ExploreLanguageSettingScreenViewModel get() {
        return newInstance((ReadsExploreService) this.readsExploreServiceProvider.get(), (UserConfigService) this.userConfigServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Logger) this.loggerProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
