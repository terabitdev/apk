package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class FirebaseAppCheckTokenService_Factory implements ul.c {
    private final ul.f configurationProvider;
    private final ul.f loggerProvider;
    private final ul.f sharedPreferencesProvider;

    private FirebaseAppCheckTokenService_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.loggerProvider = fVar;
        this.configurationProvider = fVar2;
        this.sharedPreferencesProvider = fVar3;
    }

    public static FirebaseAppCheckTokenService_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new FirebaseAppCheckTokenService_Factory(fVar, fVar2, fVar3);
    }

    public static FirebaseAppCheckTokenService newInstance(Logger logger, Configuration configuration, SharedPreferences sharedPreferences) {
        return new FirebaseAppCheckTokenService(logger, configuration, sharedPreferences);
    }

    @Override // rn.a
    public FirebaseAppCheckTokenService get() {
        return newInstance((Logger) this.loggerProvider.get(), (Configuration) this.configurationProvider.get(), (SharedPreferences) this.sharedPreferencesProvider.get());
    }
}
