package io.elevenlabs.readerapp.core;

import io.elevenlabs.domain.DispatcherFactory;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ConfigViewModel_Factory implements ul.c {
    private final ul.f appConfigServiceProvider;
    private final ul.f authServiceProvider;
    private final ul.f customerServiceProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f userConfigServiceProvider;

    private ConfigViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        this.appConfigServiceProvider = fVar;
        this.customerServiceProvider = fVar2;
        this.userConfigServiceProvider = fVar3;
        this.authServiceProvider = fVar4;
        this.dispatcherFactoryProvider = fVar5;
    }

    public static ConfigViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5) {
        return new ConfigViewModel_Factory(fVar, fVar2, fVar3, fVar4, fVar5);
    }

    public static ConfigViewModel newInstance(jl.a aVar, jl.a aVar2, jl.a aVar3, jl.a aVar4, DispatcherFactory dispatcherFactory) {
        return new ConfigViewModel(aVar, aVar2, aVar3, aVar4, dispatcherFactory);
    }

    @Override // rn.a
    public ConfigViewModel get() {
        return newInstance(ul.b.a(this.appConfigServiceProvider), ul.b.a(this.customerServiceProvider), ul.b.a(this.userConfigServiceProvider), ul.b.a(this.authServiceProvider), (DispatcherFactory) this.dispatcherFactoryProvider.get());
    }
}
