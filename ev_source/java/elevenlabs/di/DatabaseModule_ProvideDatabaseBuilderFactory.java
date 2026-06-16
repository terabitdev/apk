package io.elevenlabs.di;

import android.content.Context;
import androidx.room.c0;
import androidx.room.m0;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvideDatabaseBuilderFactory implements ul.c {
    private final f contextProvider;

    private DatabaseModule_ProvideDatabaseBuilderFactory(f fVar) {
        this.contextProvider = fVar;
    }

    public static DatabaseModule_ProvideDatabaseBuilderFactory create(f fVar) {
        return new DatabaseModule_ProvideDatabaseBuilderFactory(fVar);
    }

    public static c0 provideDatabaseBuilder(Context context) {
        c0 provideDatabaseBuilder = DatabaseModule.INSTANCE.provideDatabaseBuilder(context);
        m0.n(provideDatabaseBuilder);
        return provideDatabaseBuilder;
    }

    @Override // rn.a
    public c0 get() {
        return provideDatabaseBuilder((Context) this.contextProvider.get());
    }
}
