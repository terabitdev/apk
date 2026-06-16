package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.PlayerPreferencesService;
import io.elevenlabs.domain.services.UserConfigService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class PlayerPreferencesViewModel_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f playerPreferencesServiceProvider;
    private final ul.f userConfigServiceProvider;

    private PlayerPreferencesViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.userConfigServiceProvider = fVar2;
        this.playerPreferencesServiceProvider = fVar3;
        this.analyticsProvider = fVar4;
    }

    public static PlayerPreferencesViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new PlayerPreferencesViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static PlayerPreferencesViewModel newInstance(DispatcherFactory dispatcherFactory, UserConfigService userConfigService, PlayerPreferencesService playerPreferencesService, Analytics analytics) {
        return new PlayerPreferencesViewModel(dispatcherFactory, userConfigService, playerPreferencesService, analytics);
    }

    @Override // rn.a
    public PlayerPreferencesViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (UserConfigService) this.userConfigServiceProvider.get(), (PlayerPreferencesService) this.playerPreferencesServiceProvider.get(), (Analytics) this.analyticsProvider.get());
    }
}
