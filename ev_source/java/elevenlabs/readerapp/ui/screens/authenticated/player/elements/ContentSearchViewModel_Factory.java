package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class ContentSearchViewModel_Factory implements ul.c {
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f readsServiceProvider;

    private ContentSearchViewModel_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        this.dispatcherFactoryProvider = fVar;
        this.loggerProvider = fVar2;
        this.readsServiceProvider = fVar3;
    }

    public static ContentSearchViewModel_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3) {
        return new ContentSearchViewModel_Factory(fVar, fVar2, fVar3);
    }

    public static ContentSearchViewModel newInstance(DispatcherFactory dispatcherFactory, Logger logger, jl.a aVar) {
        return new ContentSearchViewModel(dispatcherFactory, logger, aVar);
    }

    @Override // rn.a
    public ContentSearchViewModel get() {
        return newInstance((DispatcherFactory) this.dispatcherFactoryProvider.get(), (Logger) this.loggerProvider.get(), ul.b.a(this.readsServiceProvider));
    }
}
