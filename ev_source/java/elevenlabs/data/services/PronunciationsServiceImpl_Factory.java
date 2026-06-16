package io.elevenlabs.data.services;

import fr.d0;
import io.elevenlabs.data.api.PronunciationsAPI;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PronunciationsServiceImpl_Factory implements ul.c {
    private final ul.f anonCaptchaTokenServiceProvider;
    private final ul.f appCheckTokenServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f pronunciationsApiProvider;
    private final ul.f scopeProvider;

    private PronunciationsServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        this.pronunciationsApiProvider = fVar;
        this.appCheckTokenServiceProvider = fVar2;
        this.anonCaptchaTokenServiceProvider = fVar3;
        this.loggerProvider = fVar4;
        this.dispatcherFactoryProvider = fVar5;
        this.scopeProvider = fVar6;
    }

    public static PronunciationsServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6) {
        return new PronunciationsServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6);
    }

    public static PronunciationsServiceImpl newInstance(PronunciationsAPI pronunciationsAPI, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Logger logger, DispatcherFactory dispatcherFactory, d0 d0Var) {
        return new PronunciationsServiceImpl(pronunciationsAPI, appCheckTokenService, anonCaptchaTokenService, logger, dispatcherFactory, d0Var);
    }

    @Override // rn.a
    public PronunciationsServiceImpl get() {
        return newInstance((PronunciationsAPI) this.pronunciationsApiProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.anonCaptchaTokenServiceProvider.get(), (Logger) this.loggerProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (d0) this.scopeProvider.get());
    }
}
