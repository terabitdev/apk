package io.elevenlabs.data.services;

import io.elevenlabs.data.api.GooglePlayAPI;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RestGooglePlayService_Factory implements ul.c {
    private final ul.f googlePlayAPIProvider;

    private RestGooglePlayService_Factory(ul.f fVar) {
        this.googlePlayAPIProvider = fVar;
    }

    public static RestGooglePlayService_Factory create(ul.f fVar) {
        return new RestGooglePlayService_Factory(fVar);
    }

    public static RestGooglePlayService newInstance(GooglePlayAPI googlePlayAPI) {
        return new RestGooglePlayService(googlePlayAPI);
    }

    @Override // rn.a
    public RestGooglePlayService get() {
        return newInstance((GooglePlayAPI) this.googlePlayAPIProvider.get());
    }
}
