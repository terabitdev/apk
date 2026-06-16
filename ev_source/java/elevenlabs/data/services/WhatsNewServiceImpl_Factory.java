package io.elevenlabs.data.services;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class WhatsNewServiceImpl_Factory implements ul.c {
    private final ul.f userPreferencesProvider;

    private WhatsNewServiceImpl_Factory(ul.f fVar) {
        this.userPreferencesProvider = fVar;
    }

    public static WhatsNewServiceImpl_Factory create(ul.f fVar) {
        return new WhatsNewServiceImpl_Factory(fVar);
    }

    public static WhatsNewServiceImpl newInstance(SharedPreferences sharedPreferences) {
        return new WhatsNewServiceImpl(sharedPreferences);
    }

    @Override // rn.a
    public WhatsNewServiceImpl get() {
        return newInstance((SharedPreferences) this.userPreferencesProvider.get());
    }
}
