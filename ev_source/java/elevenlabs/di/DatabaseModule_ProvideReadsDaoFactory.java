package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvideReadsDaoFactory implements ul.c {
    private final f appDatabaseProvider;

    private DatabaseModule_ProvideReadsDaoFactory(f fVar) {
        this.appDatabaseProvider = fVar;
    }

    public static DatabaseModule_ProvideReadsDaoFactory create(f fVar) {
        return new DatabaseModule_ProvideReadsDaoFactory(fVar);
    }

    public static ReadsDao provideReadsDao(AppDatabase appDatabase) {
        ReadsDao provideReadsDao = DatabaseModule.INSTANCE.provideReadsDao(appDatabase);
        m0.n(provideReadsDao);
        return provideReadsDao;
    }

    @Override // rn.a
    public ReadsDao get() {
        return provideReadsDao((AppDatabase) this.appDatabaseProvider.get());
    }
}
