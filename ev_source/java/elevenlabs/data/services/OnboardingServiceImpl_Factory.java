package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import io.elevenlabs.data.api.OnboardingAPI;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.services.WhatsNewService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OnboardingServiceImpl_Factory implements ul.c {
    private final ul.f analyticsProvider;
    private final ul.f onboardingAPIProvider;
    private final ul.f sharedPreferencesProvider;
    private final ul.f voicesDaoProvider;
    private final ul.f whatsNewServiceProvider;

    private OnboardingServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.sharedPreferencesProvider = fVar;
        this.onboardingAPIProvider = fVar2;
        this.analyticsProvider = fVar3;
        this.voicesDaoProvider = fVar4;
        this.whatsNewServiceProvider = fVar5;
    }

    public static OnboardingServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new OnboardingServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static OnboardingServiceImpl newInstance(SharedPreferences sharedPreferences, OnboardingAPI onboardingAPI, Analytics analytics, VoicesDao voicesDao, WhatsNewService whatsNewService) {
        return new OnboardingServiceImpl(sharedPreferences, onboardingAPI, analytics, voicesDao, whatsNewService);
    }

    @Override // rn.a
    public OnboardingServiceImpl get() {
        return newInstance((SharedPreferences) this.sharedPreferencesProvider.get(), (OnboardingAPI) this.onboardingAPIProvider.get(), (Analytics) this.analyticsProvider.get(), (VoicesDao) this.voicesDaoProvider.get(), (WhatsNewService) this.whatsNewServiceProvider.get());
    }
}
