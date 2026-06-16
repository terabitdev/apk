package io.elevenlabs.data.services;

import fr.d0;
import io.elevenlabs.data.api.CollectionsAPI;
import io.elevenlabs.data.database.entities.collections.CollectionsDao;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.ConnectivityService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class CollectionsServiceImpl_Factory implements ul.c {
    private final ul.f collectionsAPIProvider;
    private final ul.f collectionsDaoProvider;
    private final ul.f connectivityServiceProvider;
    private final ul.f coroutineScopeProvider;
    private final ul.f dispatcherFactoryProvider;
    private final ul.f loggerProvider;
    private final ul.f readMetadataSaverProvider;

    private CollectionsServiceImpl_Factory(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        this.loggerProvider = fVar;
        this.collectionsAPIProvider = fVar2;
        this.collectionsDaoProvider = fVar3;
        this.dispatcherFactoryProvider = fVar4;
        this.coroutineScopeProvider = fVar5;
        this.connectivityServiceProvider = fVar6;
        this.readMetadataSaverProvider = fVar7;
    }

    public static CollectionsServiceImpl_Factory create(ul.f fVar, ul.f fVar2, ul.f fVar3, ul.f fVar4, ul.f fVar5, ul.f fVar6, ul.f fVar7) {
        return new CollectionsServiceImpl_Factory(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    public static CollectionsServiceImpl newInstance(Logger logger, CollectionsAPI collectionsAPI, CollectionsDao collectionsDao, DispatcherFactory dispatcherFactory, d0 d0Var, ConnectivityService connectivityService, ReadMetadataSaver readMetadataSaver) {
        return new CollectionsServiceImpl(logger, collectionsAPI, collectionsDao, dispatcherFactory, d0Var, connectivityService, readMetadataSaver);
    }

    @Override // rn.a
    public CollectionsServiceImpl get() {
        return newInstance((Logger) this.loggerProvider.get(), (CollectionsAPI) this.collectionsAPIProvider.get(), (CollectionsDao) this.collectionsDaoProvider.get(), (DispatcherFactory) this.dispatcherFactoryProvider.get(), (d0) this.coroutineScopeProvider.get(), (ConnectivityService) this.connectivityServiceProvider.get(), (ReadMetadataSaver) this.readMetadataSaverProvider.get());
    }
}
