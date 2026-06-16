package io.elevenlabs.data.services;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AdAttributionServiceImpl_Factory implements ul.c {
    private final ul.f sharedPreferencesProvider;

    private AdAttributionServiceImpl_Factory(ul.f fVar) {
        this.sharedPreferencesProvider = fVar;
    }

    public static AdAttributionServiceImpl_Factory create(ul.f fVar) {
        return new AdAttributionServiceImpl_Factory(fVar);
    }

    public static AdAttributionServiceImpl newInstance(SharedPreferences sharedPreferences) {
        return new AdAttributionServiceImpl(sharedPreferences);
    }

    @Override // rn.a
    public AdAttributionServiceImpl get() {
        return newInstance((SharedPreferences) this.sharedPreferencesProvider.get());
    }
}
