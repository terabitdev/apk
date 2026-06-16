package io.elevenlabs.data.services;

import com.google.firebase.auth.FirebaseAuth;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class FirebaseAuthTokenService_Factory implements ul.c {
    private final ul.f authProvider;
    private final ul.f loggerProvider;

    private FirebaseAuthTokenService_Factory(ul.f fVar, ul.f fVar2) {
        this.authProvider = fVar;
        this.loggerProvider = fVar2;
    }

    public static FirebaseAuthTokenService_Factory create(ul.f fVar, ul.f fVar2) {
        return new FirebaseAuthTokenService_Factory(fVar, fVar2);
    }

    public static FirebaseAuthTokenService newInstance(FirebaseAuth firebaseAuth, Logger logger) {
        return new FirebaseAuthTokenService(firebaseAuth, logger);
    }

    @Override // rn.a
    public FirebaseAuthTokenService get() {
        return newInstance((FirebaseAuth) this.authProvider.get(), (Logger) this.loggerProvider.get());
    }
}
