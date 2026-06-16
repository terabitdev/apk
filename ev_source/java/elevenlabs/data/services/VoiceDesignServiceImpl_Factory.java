package io.elevenlabs.data.services;

import io.elevenlabs.data.api.VoiceDesignAPI;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class VoiceDesignServiceImpl_Factory implements ul.c {
    private final ul.f anonCaptchaTokenServiceProvider;
    private final ul.f appCheckTokenServiceProvider;
    private final ul.f loggerProvider;
    private final ul.f voiceDesignAPIProvider;

    private VoiceDesignServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.voiceDesignAPIProvider = fVar;
        this.appCheckTokenServiceProvider = fVar2;
        this.anonCaptchaTokenServiceProvider = fVar3;
        this.loggerProvider = fVar4;
    }

    public static VoiceDesignServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new VoiceDesignServiceImpl_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static VoiceDesignServiceImpl newInstance(VoiceDesignAPI voiceDesignAPI, AppCheckTokenService appCheckTokenService, AnonCaptchaTokenService anonCaptchaTokenService, Logger logger) {
        return new VoiceDesignServiceImpl(voiceDesignAPI, appCheckTokenService, anonCaptchaTokenService, logger);
    }

    @Override // rn.a
    public VoiceDesignServiceImpl get() {
        return newInstance((VoiceDesignAPI) this.voiceDesignAPIProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get(), (AnonCaptchaTokenService) this.anonCaptchaTokenServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}
