package io.elevenlabs.readerapp.core.router;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.FeatureFlagService;
import io.elevenlabs.domain.services.WhatsNewService;
import io.elevenlabs.domain.services.player.PlayerService;
import io.elevenlabs.domain.usecase.DevicePerformanceMeasurer;
import io.elevenlabs.readerapp.core.CrashlyticsLogger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RouterViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f authServiceProvider;
    private final ul.f crashlyticsLoggerProvider;
    private final ul.f customerServiceProvider;
    private final ul.f devicePerformanceMeasurerProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f featureFlagServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f messagesServiceProvider;
    private final ul.f onboardingServiceProvider;
    private final ul.f playerServiceProvider;
    private final ul.f readsServiceProvider;
    private final ul.f singularServiceProvider;
    private final ul.f whatsNewServiceProvider;

    private RouterViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14) {
        this.authServiceProvider = fVar;
        this.onboardingServiceProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
        this.loggerProvider = fVar4;
        this.analyticsProvider = fVar5;
        this.readsServiceProvider = fVar6;
        this.singularServiceProvider = fVar7;
        this.customerServiceProvider = fVar8;
        this.messagesServiceProvider = fVar9;
        this.devicePerformanceMeasurerProvider = fVar10;
        this.playerServiceProvider = fVar11;
        this.whatsNewServiceProvider = fVar12;
        this.crashlyticsLoggerProvider = fVar13;
        this.featureFlagServiceProvider = fVar14;
    }

    public static RouterViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12, ul.f fVar13, ul.f fVar14) {
        return new RouterViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14);
    }

    public static RouterViewModel newInstance(jl.a aVar, jl.a aVar2, DispatcherFactory dispatcherFactory, Logger logger, Analytics analytics, jl.a aVar3, jl.a aVar4, jl.a aVar5, jl.a aVar6, DevicePerformanceMeasurer devicePerformanceMeasurer, PlayerService playerService, WhatsNewService whatsNewService, CrashlyticsLogger crashlyticsLogger, FeatureFlagService featureFlagService) {
        return new RouterViewModel(aVar, aVar2, dispatcherFactory, logger, analytics, aVar3, aVar4, aVar5, aVar6, devicePerformanceMeasurer, playerService, whatsNewService, crashlyticsLogger, featureFlagService);
    }

    @Override // rn.a
    public RouterViewModel get() {
        return newInstance(ul.b.a(this.authServiceProvider), ul.b.a(this.onboardingServiceProvider), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), (Analytics) this.analyticsProvider.get(), ul.b.a(this.readsServiceProvider), ul.b.a(this.singularServiceProvider), ul.b.a(this.customerServiceProvider), ul.b.a(this.messagesServiceProvider), (DevicePerformanceMeasurer) this.devicePerformanceMeasurerProvider.get(), (PlayerService) this.playerServiceProvider.get(), (WhatsNewService) this.whatsNewServiceProvider.get(), (CrashlyticsLogger) this.crashlyticsLoggerProvider.get(), (FeatureFlagService) this.featureFlagServiceProvider.get());
    }
}
