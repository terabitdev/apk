package io.elevenlabs.readerapp;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.AppCheckTokenService;
import io.elevenlabs.domain.services.AppCompatibilityDialogService;
import io.elevenlabs.domain.services.CustomerService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class AppCompatibilityViewModel_Factory implements ul.c {
    private final ul.f appCheckTokenServiceProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dialogServiceProvider;
    private final ul.f dispatcherFactoryProvider;

    private AppCompatibilityViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        this.dispatcherFactoryProvider = fVar;
        this.appCheckTokenServiceProvider = fVar2;
        this.dialogServiceProvider = fVar3;
        this.customerServiceProvider = fVar4;
    }

    public static AppCompatibilityViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4) {
        return new AppCompatibilityViewModel_Factory(fVar, fVar2, fVar3, fVar4);
    }

    public static AppCompatibilityViewModel newInstance(DispatcherFactory dispatcherFactory, AppCheckTokenService appCheckTokenService, AppCompatibilityDialogService appCompatibilityDialogService, CustomerService customerService) {
        return new AppCompatibilityViewModel(dispatcherFactory, appCheckTokenService, appCompatibilityDialogService, customerService);
    }

    @Override // rn.a
    public AppCompatibilityViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (AppCheckTokenService) this.appCheckTokenServiceProvider.get(), (AppCompatibilityDialogService) this.dialogServiceProvider.get(), (CustomerService) this.customerServiceProvider.get());
    }
}
