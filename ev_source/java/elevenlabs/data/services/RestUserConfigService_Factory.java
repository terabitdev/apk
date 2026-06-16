package io.elevenlabs.data.services;

import android.content.Context;
import android.content.SharedPreferences;
import io.elevenlabs.data.api.ConfigAPI;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RestUserConfigService_Factory implements ul.c {
    private final ul.f appContextProvider;
    private final ul.f configAPIProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f jsonProvider;
    private final ul.f loggerProvider;
    private final ul.f sharedPreferencesProvider;

    private RestUserConfigService_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.configAPIProvider = fVar;
        this.sharedPreferencesProvider = fVar2;
        this.jsonProvider = fVar3;
        this.loggerProvider = fVar4;
        this.connectivityServiceProvider = fVar5;
        this.appContextProvider = fVar6;
    }

    public static RestUserConfigService_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new RestUserConfigService_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static RestUserConfigService newInstance(ConfigAPI configAPI, SharedPreferences sharedPreferences, vr.c cVar, Logger logger, ConnectivityService connectivityService, Context context) {
        return new RestUserConfigService(configAPI, sharedPreferences, cVar, logger, connectivityService, context);
    }

    @Override // rn.a
    public RestUserConfigService get() {
        return newInstance((ConfigAPI) this.configAPIProvider.get(), (SharedPreferences) this.sharedPreferencesProvider.get(), (vr.c) this.jsonProvider.get(), (Logger) this.loggerProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get(), (Context) this.appContextProvider.get());
    }
}
