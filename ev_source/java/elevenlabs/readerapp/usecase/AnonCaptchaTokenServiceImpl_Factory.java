package io.elevenlabs.readerapp.usecase;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.CustomerService;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class AnonCaptchaTokenServiceImpl_Factory implements c {
    private final f currentActivityProvider;
    private final f customerServiceProvider;
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;
    private final f siteKeyProvider;

    private AnonCaptchaTokenServiceImpl_Factory(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        this.currentActivityProvider = fVar;
        this.siteKeyProvider = fVar2;
        this.dispatcherFactoryProvider = fVar3;
        this.customerServiceProvider = fVar4;
        this.loggerProvider = fVar5;
    }

    public static AnonCaptchaTokenServiceImpl_Factory create(f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        return new AnonCaptchaTokenServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static AnonCaptchaTokenServiceImpl newInstance(CurrentActivityProvider currentActivityProvider, String str, DispatcherFactory dispatcherFactory, CustomerService customerService, Logger logger) {
        return new AnonCaptchaTokenServiceImpl(currentActivityProvider, str, dispatcherFactory, customerService, logger);
    }

    @Override // rn.a
    public AnonCaptchaTokenServiceImpl get() {
        return newInstance((CurrentActivityProvider) this.currentActivityProvider.get(), (String) this.siteKeyProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (CustomerService) this.customerServiceProvider.get(), (Logger) this.loggerProvider.get());
    }
}
