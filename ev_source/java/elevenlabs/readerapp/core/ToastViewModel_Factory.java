package io.elevenlabs.readerapp.core;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ToastService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class ToastViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f toastServiceProvider;

    private ToastViewModel_Factory(ul.f fVar, ul.f fVar2) {
        this.dispatcherFactoryProvider = fVar;
        this.toastServiceProvider = fVar2;
    }

    public static ToastViewModel_Factory create(ul.f fVar, ul.f fVar2) {
        return new ToastViewModel_Factory(fVar, fVar2);
    }

    public static ToastViewModel newInstance(DispatcherFactory dispatcherFactory, ToastService toastService) {
        return new ToastViewModel(dispatcherFactory, toastService);
    }

    @Override // rn.a
    public ToastViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ToastService) this.toastServiceProvider.get());
    }
}
