package io.elevenlabs.data.services;

import io.elevenlabs.data.api.PasswordResetAPI;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RestPasswordResetService_Factory implements ul.c {
    private final ul.f passwordResetAPIProvider;

    private RestPasswordResetService_Factory(ul.f fVar) {
        this.passwordResetAPIProvider = fVar;
    }

    public static RestPasswordResetService_Factory create(ul.f fVar) {
        return new RestPasswordResetService_Factory(fVar);
    }

    public static RestPasswordResetService newInstance(PasswordResetAPI passwordResetAPI) {
        return new RestPasswordResetService(passwordResetAPI);
    }

    @Override // rn.a
    public RestPasswordResetService get() {
        return newInstance((PasswordResetAPI) this.passwordResetAPIProvider.get());
    }
}
