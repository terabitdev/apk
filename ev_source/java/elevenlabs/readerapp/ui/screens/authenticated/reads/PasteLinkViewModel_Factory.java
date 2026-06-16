package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.DispatcherFactory;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class PasteLinkViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f stringProvider;

    private PasteLinkViewModel_Factory(ul.f fVar, ul.f fVar2) {
        this.dispatcherFactoryProvider = fVar;
        this.stringProvider = fVar2;
    }

    public static PasteLinkViewModel_Factory create(ul.f fVar, ul.f fVar2) {
        return new PasteLinkViewModel_Factory(fVar, fVar2);
    }

    public static PasteLinkViewModel newInstance(DispatcherFactory dispatcherFactory, jl.a aVar) {
        return new PasteLinkViewModel(dispatcherFactory, aVar);
    }

    @Override // rn.a
    public PasteLinkViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), ul.b.a(this.stringProvider));
    }
}
