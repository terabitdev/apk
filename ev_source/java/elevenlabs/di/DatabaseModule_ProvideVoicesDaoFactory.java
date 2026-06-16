package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvideVoicesDaoFactory implements ul.c {
    private final f appDatabaseProvider;

    private DatabaseModule_ProvideVoicesDaoFactory(f fVar) {
        this.appDatabaseProvider = fVar;
    }

    public static DatabaseModule_ProvideVoicesDaoFactory create(f fVar) {
        return new DatabaseModule_ProvideVoicesDaoFactory(fVar);
    }

    public static VoicesDao provideVoicesDao(AppDatabase appDatabase) {
        VoicesDao provideVoicesDao = DatabaseModule.INSTANCE.provideVoicesDao(appDatabase);
        m0.n(provideVoicesDao);
        return provideVoicesDao;
    }

    @Override // rn.a
    public VoicesDao get() {
        return provideVoicesDao((AppDatabase) this.appDatabaseProvider.get());
    }
}
