package io.elevenlabs.data.services;

import io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao;
import io.elevenlabs.domain.services.ReadsService;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PersistentPlayerQueueServiceImpl_Factory implements ul.c {
    private final ul.f daoProvider;
    private final ul.f readsServiceProvider;

    private PersistentPlayerQueueServiceImpl_Factory(ul.f fVar, ul.f fVar2) {
        this.daoProvider = fVar;
        this.readsServiceProvider = fVar2;
    }

    public static PersistentPlayerQueueServiceImpl_Factory create(ul.f fVar, ul.f fVar2) {
        return new PersistentPlayerQueueServiceImpl_Factory(fVar, fVar2);
    }

    public static PersistentPlayerQueueServiceImpl newInstance(PersistentPlayerQueueDao persistentPlayerQueueDao, ReadsService readsService) {
        return new PersistentPlayerQueueServiceImpl(persistentPlayerQueueDao, readsService);
    }

    @Override // rn.a
    public PersistentPlayerQueueServiceImpl get() {
        return newInstance((PersistentPlayerQueueDao) this.daoProvider.get(), (ReadsService) this.readsServiceProvider.get());
    }
}
