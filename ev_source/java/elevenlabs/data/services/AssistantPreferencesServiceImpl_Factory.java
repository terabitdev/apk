package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.domain.services.UserConfigService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AssistantPreferencesServiceImpl_Factory implements ul.c {
    private final ul.f userConfigServiceProvider;
    private final ul.f userPreferencesProvider;

    private AssistantPreferencesServiceImpl_Factory(ul.f fVar, ul.f fVar2) {
        this.userPreferencesProvider = fVar;
        this.userConfigServiceProvider = fVar2;
    }

    public static AssistantPreferencesServiceImpl_Factory create(ul.f fVar, ul.f fVar2) {
        return new AssistantPreferencesServiceImpl_Factory(fVar, fVar2);
    }

    public static AssistantPreferencesServiceImpl newInstance(SharedPreferences sharedPreferences, UserConfigService userConfigService) {
        return new AssistantPreferencesServiceImpl(sharedPreferences, userConfigService);
    }

    @Override // rn.a
    public AssistantPreferencesServiceImpl get() {
        return newInstance((SharedPreferences) this.userPreferencesProvider.get(), (UserConfigService) this.userConfigServiceProvider.get());
    }
}
