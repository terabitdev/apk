package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvidePersistentPlayerQueueDaoFactory implements ul.c {
    private final f appDatabaseProvider;

    private DatabaseModule_ProvidePersistentPlayerQueueDaoFactory(f fVar) {
        this.appDatabaseProvider = fVar;
    }

    public static DatabaseModule_ProvidePersistentPlayerQueueDaoFactory create(f fVar) {
        return new DatabaseModule_ProvidePersistentPlayerQueueDaoFactory(fVar);
    }

    public static PersistentPlayerQueueDao providePersistentPlayerQueueDao(AppDatabase appDatabase) {
        PersistentPlayerQueueDao providePersistentPlayerQueueDao = DatabaseModule.INSTANCE.providePersistentPlayerQueueDao(appDatabase);
        m0.n(providePersistentPlayerQueueDao);
        return providePersistentPlayerQueueDao;
    }

    @Override // rn.a
    public PersistentPlayerQueueDao get() {
        return providePersistentPlayerQueueDao((AppDatabase) this.appDatabaseProvider.get());
    }
}
