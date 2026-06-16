package io.elevenlabs.readerapp.ui.screens.authenticated.home.elements;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.UserConfigService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class DailyStreakSettingsViewModel_Factory implements ul.c {
    private final f analyticsProvider;
    private final f dispatcherFactoryProvider;
    private final f resolveErrorMessageUseCaseProvider;
    private final f toastServiceProvider;
    private final f userConfigServiceProvider;

    private DailyStreakSettingsViewModel_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        this.dispatcherFactoryProvider = fVar;
        this.userConfigServiceProvider = fVar2;
        this.toastServiceProvider = fVar3;
        this.resolveErrorMessageUseCaseProvider = fVar4;
        this.analyticsProvider = fVar5;
    }

    public static DailyStreakSettingsViewModel_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        return new DailyStreakSettingsViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static DailyStreakSettingsViewModel newInstance(DispatcherFactory dispatcherFactory, UserConfigService userConfigService, ToastService toastService, ResolveErrorMessageUseCase resolveErrorMessageUseCase, Analytics analytics) {
        return new DailyStreakSettingsViewModel(dispatcherFactory, userConfigService, toastService, resolveErrorMessageUseCase, analytics);
    }

    @Override // rn.a
    public DailyStreakSettingsViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (UserConfigService) this.userConfigServiceProvider.get(), (ToastService) this.toastServiceProvider.get(), (ResolveErrorMessageUseCase) this.resolveErrorMessageUseCaseProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
