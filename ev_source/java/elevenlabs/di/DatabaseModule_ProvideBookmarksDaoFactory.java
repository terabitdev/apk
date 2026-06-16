package io.elevenlabs.di;

import androidx.room.m0;
import io.elevenlabs.data.database.entities.bookmarks.BookmarksDao;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class DatabaseModule_ProvideBookmarksDaoFactory implements ul.c {
    private final f appDatabaseProvider;

    private DatabaseModule_ProvideBookmarksDaoFactory(f fVar) {
        this.appDatabaseProvider = fVar;
    }

    public static DatabaseModule_ProvideBookmarksDaoFactory create(f fVar) {
        return new DatabaseModule_ProvideBookmarksDaoFactory(fVar);
    }

    public static BookmarksDao provideBookmarksDao(AppDatabase appDatabase) {
        BookmarksDao provideBookmarksDao = DatabaseModule.INSTANCE.provideBookmarksDao(appDatabase);
        m0.n(provideBookmarksDao);
        return provideBookmarksDao;
    }

    @Override // rn.a
    public BookmarksDao get() {
        return provideBookmarksDao((AppDatabase) this.appDatabaseProvider.get());
    }
}
