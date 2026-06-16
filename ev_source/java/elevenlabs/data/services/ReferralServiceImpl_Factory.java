package io.elevenlabs.data.services;

import io.elevenlabs.data.api.ReferralAPI;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ReferralServiceImpl_Factory implements ul.c {
    private final ul.f anonCaptchaTokenServiceProvider;
    private final ul.f appCheckTokenServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f referralAPIProvider;

    private ReferralServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.referralAPIProvider = fVar;
        this.appCheckTokenServiceProvider = fVar2;
        this.anonCaptchaTokenServiceProvider = fVar3;
        this.loggerProvider = fVar4;
    }

    public static ReferralServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new ReferralServiceImpl_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static ReferralServiceImpl newInstance(ReferralAPI referralAPI, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Logger logger) {
        return new ReferralServiceImpl(referralAPI, appCheckTokenService, anonCaptchaTokenService, logger);
    }

    @Override // rn.a
    public ReferralServiceImpl get() {
        return newInstance((ReferralAPI) this.referralAPIProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.anonCaptchaTokenServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}
