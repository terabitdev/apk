package io.elevenlabs.readerapp.services;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class NavigationServiceImpl_Factory implements c {
    private final f dispatcherFactoryProvider;
    private final f loggerProvider;
    private final f navigationDispatcherProvider;

    private NavigationServiceImpl_Factory(f fVar, f fVar2, f fVar3) {
        this.navigationDispatcherProvider = fVar;
        this.dispatcherFactoryProvider = fVar2;
        this.loggerProvider = fVar3;
    }

    public static NavigationServiceImpl_Factory create(f fVar, f fVar2, f fVar3) {
        return new NavigationServiceImpl_Factory(fVar, fVar2, fVar3);
    }

    public static NavigationServiceImpl newInstance(NavigationDispatcherProvider navigationDispatcherProvider, DispatcherFactory dispatcherFactory, Logger logger) {
        return new NavigationServiceImpl(navigationDispatcherProvider, dispatcherFactory, logger);
    }

    @Override // rn.a
    public NavigationServiceImpl get() {
        return newInstance((NavigationDispatcherProvider) this.navigationDispatcherProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get());
    }
}
