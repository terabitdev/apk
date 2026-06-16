package io.elevenlabs.data.services;

import io.elevenlabs.data.api.SignUpAPI;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AppCheckTokenService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class RestSignUpService_Factory implements ul.c {
    private final ul.f appCheckTokenServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f signUpAPIProvider;

    private RestSignUpService_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.signUpAPIProvider = fVar;
        this.loggerProvider = fVar2;
        this.appCheckTokenServiceProvider = fVar3;
    }

    public static RestSignUpService_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new RestSignUpService_Factory(fVar, fVar2, fVar3);
    }

    public static RestSignUpService newInstance(SignUpAPI signUpAPI, Logger logger, AppCheckTokenService appCheckTokenService) {
        return new RestSignUpService(signUpAPI, logger, appCheckTokenService);
    }

    @Override // rn.a
    public RestSignUpService get() {
        return newInstance((SignUpAPI) this.signUpAPIProvider.get(), (Logger) this.loggerProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get());
    }
}
