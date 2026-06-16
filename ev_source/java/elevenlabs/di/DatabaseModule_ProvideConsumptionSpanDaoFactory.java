package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvideConsumptionSpanDaoFactory implements ul.c {
    private final f appDatabaseProvider;

    private DatabaseModule_ProvideConsumptionSpanDaoFactory(f fVar) {
        this.appDatabaseProvider = fVar;
    }

    public static DatabaseModule_ProvideConsumptionSpanDaoFactory create(f fVar) {
        return new DatabaseModule_ProvideConsumptionSpanDaoFactory(fVar);
    }

    public static ConsumptionSpanDao provideConsumptionSpanDao(AppDatabase appDatabase) {
        ConsumptionSpanDao provideConsumptionSpanDao = DatabaseModule.INSTANCE.provideConsumptionSpanDao(appDatabase);
        m0.n(provideConsumptionSpanDao);
        return provideConsumptionSpanDao;
    }

    @Override // rn.a
    public ConsumptionSpanDao get() {
        return provideConsumptionSpanDao((AppDatabase) this.appDatabaseProvider.get());
    }
}
