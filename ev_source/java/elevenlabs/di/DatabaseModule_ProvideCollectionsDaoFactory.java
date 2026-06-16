package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.database.entities.collections.CollectionsDao;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvideCollectionsDaoFactory implements ul.c {
    private final f appDatabaseProvider;

    private DatabaseModule_ProvideCollectionsDaoFactory(f fVar) {
        this.appDatabaseProvider = fVar;
    }

    public static DatabaseModule_ProvideCollectionsDaoFactory create(f fVar) {
        return new DatabaseModule_ProvideCollectionsDaoFactory(fVar);
    }

    public static CollectionsDao provideCollectionsDao(AppDatabase appDatabase) {
        CollectionsDao provideCollectionsDao = DatabaseModule.INSTANCE.provideCollectionsDao(appDatabase);
        m0.n(provideCollectionsDao);
        return provideCollectionsDao;
    }

    @Override // rn.a
    public CollectionsDao get() {
        return provideCollectionsDao((AppDatabase) this.appDatabaseProvider.get());
    }
}
