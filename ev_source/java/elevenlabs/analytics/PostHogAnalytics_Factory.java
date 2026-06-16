package io.elevenlabs.analytics;

import fr.d0;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.LocaleService;
import io.elevenlabs.domain.services.SingularService;
import io.elevenlabs.domain.usecase.DevicePerformanceMeasurer;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PostHogAnalytics_Factory implements c {
    private final f authServiceProvider;
    private final f coroutineScopeProvider;
    private final f devicePerformanceMeasurerProvider;
    private final f dispatcherFactoryProvider;
    private final f firebaseAnalyticsServiceProvider;
    private final f localeServiceProvider;
    private final f loggerProvider;
    private final f singularServiceProvider;

    private PostHogAnalytics_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8) {
        this.loggerProvider = fVar;
        this.authServiceProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
        this.localeServiceProvider = fVar4;
        this.coroutineScopeProvider = fVar5;
        this.singularServiceProvider = fVar6;
        this.devicePerformanceMeasurerProvider = fVar7;
        this.firebaseAnalyticsServiceProvider = fVar8;
    }

    public static PostHogAnalytics_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5, f fVar6, f fVar7, f fVar8) {
        return new PostHogAnalytics_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8);
    }

    public static PostHogAnalytics newInstance(Logger logger, AuthService authService, DispatcherFactory dispatcherFactory, LocaleService localeService, d0 d0Var, SingularService singularService, DevicePerformanceMeasurer devicePerformanceMeasurer, FirebaseAnalyticsService firebaseAnalyticsService) {
        return new PostHogAnalytics(logger, authService, dispatcherFactory, localeService, d0Var, singularService, devicePerformanceMeasurer, firebaseAnalyticsService);
    }

    @Override // rn.a
    public PostHogAnalytics get() {
        return newInstance((Logger) this.loggerProvider.get(), (AuthService) this.authServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (LocaleService) this.localeServiceProvider.get(), (d0) this.coroutineScopeProvider.get(), (SingularService) this.singularServiceProvider.get(), (DevicePerformanceMeasurer) this.devicePerformanceMeasurerProvider.get(), (FirebaseAnalyticsService) this.firebaseAnalyticsServiceProvider.get());
    }
}
