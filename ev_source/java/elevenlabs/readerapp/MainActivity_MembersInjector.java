package io.elevenlabs.readerapp;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.SingularService;
import io.elevenlabs.domain.services.StoreCountryCodeRecordingService;
import io.elevenlabs.readerapp.services.NavigationDispatcherProvider;
import io.elevenlabs.readerapp.usecase.RateAppUseCase;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class MainActivity_MembersInjector implements jl.b {
    private final ul.f analyticsProvider;
    private final ul.f configurationProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f navigationDispatcherProvider;
    private final ul.f rateAppUseCaseProvider;
    private final ul.f singularServiceProvider;
    private final ul.f storeCountryCodeRecordingServiceProvider;

    private MainActivity_MembersInjector(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        this.configurationProvider = fVar;
        this.analyticsProvider = fVar2;
        this.loggerProvider = fVar3;
        this.rateAppUseCaseProvider = fVar4;
        this.singularServiceProvider = fVar5;
        this.storeCountryCodeRecordingServiceProvider = fVar6;
        this.navigationDispatcherProvider = fVar7;
        this.connectivityServiceProvider = fVar8;
    }

    public static jl.b create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8) {
        return new MainActivity_MembersInjector(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8);
    }

    public static void injectAnalytics(MainActivity mainActivity, Analytics analytics) {
        mainActivity.analytics = analytics;
    }

    public static void injectConfiguration(MainActivity mainActivity, Configuration configuration) {
        mainActivity.configuration = configuration;
    }

    public static void injectConnectivityService(MainActivity mainActivity, ConnectivityService connectivityService) {
        mainActivity.connectivityService = connectivityService;
    }

    public static void injectLogger(MainActivity mainActivity, Logger logger) {
        mainActivity.logger = logger;
    }

    public static void injectNavigationDispatcherProvider(MainActivity mainActivity, NavigationDispatcherProvider navigationDispatcherProvider) {
        mainActivity.navigationDispatcherProvider = navigationDispatcherProvider;
    }

    public static void injectRateAppUseCase(MainActivity mainActivity, RateAppUseCase rateAppUseCase) {
        mainActivity.rateAppUseCase = rateAppUseCase;
    }

    public static void injectSingularService(MainActivity mainActivity, SingularService singularService) {
        mainActivity.singularService = singularService;
    }

    public static void injectStoreCountryCodeRecordingService(MainActivity mainActivity, StoreCountryCodeRecordingService storeCountryCodeRecordingService) {
        mainActivity.storeCountryCodeRecordingService = storeCountryCodeRecordingService;
    }

    public void injectMembers(MainActivity mainActivity) {
        injectConfiguration(mainActivity, (Configuration) this.configurationProvider.get());
        injectAnalytics(mainActivity, (Analytics) this.analyticsProvider.get());
        injectLogger(mainActivity, (Logger) this.loggerProvider.get());
        injectRateAppUseCase(mainActivity, (RateAppUseCase) this.rateAppUseCaseProvider.get());
        injectSingularService(mainActivity, (SingularService) this.singularServiceProvider.get());
        injectStoreCountryCodeRecordingService(mainActivity, (StoreCountryCodeRecordingService) this.storeCountryCodeRecordingServiceProvider.get());
        injectNavigationDispatcherProvider(mainActivity, (NavigationDispatcherProvider) this.navigationDispatcherProvider.get());
        injectConnectivityService(mainActivity, (ConnectivityService) this.connectivityServiceProvider.get());
    }
}
