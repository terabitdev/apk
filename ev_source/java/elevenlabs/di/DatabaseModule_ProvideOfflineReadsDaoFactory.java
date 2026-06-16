package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvideOfflineReadsDaoFactory implements ul.c {
    private final f appDatabaseProvider;

    private DatabaseModule_ProvideOfflineReadsDaoFactory(f fVar) {
        this.appDatabaseProvider = fVar;
    }

    public static DatabaseModule_ProvideOfflineReadsDaoFactory create(f fVar) {
        return new DatabaseModule_ProvideOfflineReadsDaoFactory(fVar);
    }

    public static OfflineReadsDao provideOfflineReadsDao(AppDatabase appDatabase) {
        OfflineReadsDao provideOfflineReadsDao = DatabaseModule.INSTANCE.provideOfflineReadsDao(appDatabase);
        m0.n(provideOfflineReadsDao);
        return provideOfflineReadsDao;
    }

    @Override // rn.a
    public OfflineReadsDao get() {
        return provideOfflineReadsDao((AppDatabase) this.appDatabaseProvider.get());
    }
}
