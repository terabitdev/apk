package io.elevenlabs.data.services;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PlayerPagerTeaserServiceImpl_Factory implements ul.c {
    private final ul.f userPreferencesProvider;

    private PlayerPagerTeaserServiceImpl_Factory(ul.f fVar) {
        this.userPreferencesProvider = fVar;
    }

    public static PlayerPagerTeaserServiceImpl_Factory create(ul.f fVar) {
        return new PlayerPagerTeaserServiceImpl_Factory(fVar);
    }

    public static PlayerPagerTeaserServiceImpl newInstance(SharedPreferences sharedPreferences) {
        return new PlayerPagerTeaserServiceImpl(sharedPreferences);
    }

    @Override // rn.a
    public PlayerPagerTeaserServiceImpl get() {
        return newInstance((SharedPreferences) this.userPreferencesProvider.get());
    }
}
