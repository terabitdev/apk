package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvideRecentVoicesDaoFactory implements ul.c {
    private final f appDatabaseProvider;

    private DatabaseModule_ProvideRecentVoicesDaoFactory(f fVar) {
        this.appDatabaseProvider = fVar;
    }

    public static DatabaseModule_ProvideRecentVoicesDaoFactory create(f fVar) {
        return new DatabaseModule_ProvideRecentVoicesDaoFactory(fVar);
    }

    public static RecentVoicesDao provideRecentVoicesDao(AppDatabase appDatabase) {
        RecentVoicesDao provideRecentVoicesDao = DatabaseModule.INSTANCE.provideRecentVoicesDao(appDatabase);
        m0.n(provideRecentVoicesDao);
        return provideRecentVoicesDao;
    }

    @Override // rn.a
    public RecentVoicesDao get() {
        return provideRecentVoicesDao((AppDatabase) this.appDatabaseProvider.get());
    }
}
