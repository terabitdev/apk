package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.services.ReadsService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ReadShareOptionsViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f readsServiceProvider;

    private ReadShareOptionsViewModel_Factory(ul.f fVar, ul.f fVar2) {
        this.dispatcherFactoryProvider = fVar;
        this.readsServiceProvider = fVar2;
    }

    public static ReadShareOptionsViewModel_Factory create(ul.f fVar, ul.f fVar2) {
        return new ReadShareOptionsViewModel_Factory(fVar, fVar2);
    }

    public static ReadShareOptionsViewModel newInstance(DispatcherFactory dispatcherFactory, ReadsService readsService) {
        return new ReadShareOptionsViewModel(dispatcherFactory, readsService);
    }

    @Override // rn.a
    public ReadShareOptionsViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (ReadsService) this.readsServiceProvider.get());
    }
}
