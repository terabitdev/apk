package io.elevenlabs.di;

import androidx.room.c0;
import androidx.room.m0;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvideDatabaseFactory implements ul.c {
    private final f builderProvider;

    private DatabaseModule_ProvideDatabaseFactory(f fVar) {
        this.builderProvider = fVar;
    }

    public static DatabaseModule_ProvideDatabaseFactory create(f fVar) {
        return new DatabaseModule_ProvideDatabaseFactory(fVar);
    }

    public static AppDatabase provideDatabase(c0 c0Var) {
        AppDatabase provideDatabase = DatabaseModule.INSTANCE.provideDatabase(c0Var);
        m0.n(provideDatabase);
        return provideDatabase;
    }

    @Override // rn.a
    public AppDatabase get() {
        return provideDatabase((c0) this.builderProvider.get());
    }
}
