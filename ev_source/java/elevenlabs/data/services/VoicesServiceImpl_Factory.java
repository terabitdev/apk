package io.elevenlabs.data.services;

import android.content.Context;
import android.content.SharedPreferences;
import fr.d0;
import io.elevenlabs.data.api.VoicesAPI;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.services.ConnectivityService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class VoicesServiceImpl_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f anonCaptchaTokenServiceProvider;
    private final ul.f appCheckTokenServiceProvider;
    private final ul.f appConfigServiceProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f contextProvider;
    private final ul.f coroutineScopeProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f userSharedPreferencesProvider;
    private final ul.f voicesAPIProvider;
    private final ul.f voicesDaoProvider;

    private VoicesServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12) {
        this.contextProvider = fVar;
        this.voicesAPIProvider = fVar2;
        this.voicesDaoProvider = fVar3;
        this.loggerProvider = fVar4;
        this.userSharedPreferencesProvider = fVar5;
        this.appConfigServiceProvider = fVar6;
        this.dispatcherFactoryProvider = fVar7;
        this.analyticsProvider = fVar8;
        this.coroutineScopeProvider = fVar9;
        this.connectivityServiceProvider = fVar10;
        this.appCheckTokenServiceProvider = fVar11;
        this.anonCaptchaTokenServiceProvider = fVar12;
    }

    public static VoicesServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7, ul.f fVar8, ul.f fVar9, ul.f fVar10, ul.f fVar11, ul.f fVar12) {
        return new VoicesServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    public static VoicesServiceImpl newInstance(Context context, VoicesAPI voicesAPI, VoicesDao voicesDao, Logger logger, SharedPreferences sharedPreferences, AppConfigService appConfigService, DispatcherFactory dispatcherFactory, Analytics analytics, d0 d0Var, ConnectivityService connectivityService, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService) {
        return new VoicesServiceImpl(context, voicesAPI, voicesDao, logger, sharedPreferences, appConfigService, dispatcherFactory, analytics, d0Var, connectivityService, appCheckTokenService, anonCaptchaTokenService);
    }

    @Override // rn.a
    public VoicesServiceImpl get() {
        return newInstance((Context) this.contextProvider.get(), (VoicesAPI) this.voicesAPIProvider.get(), (VoicesDao) this.voicesDaoProvider.get(), (Logger) this.loggerProvider.get(), (SharedPreferences) this.userSharedPreferencesProvider.get(), (AppConfigService) this.appConfigServiceProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Analytics) this.analyticsProvider.get(), (d0) this.coroutineScopeProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.anonCaptchaTokenServiceProvider.get());
    }
}
