package io.elevenlabs.di;

import android.content.Context;
import androidx.room.c0;
import io.elevenlabs.data.database.entities.bookmarks.BookmarksDao;
import io.elevenlabs.data.database.entities.collections.CollectionsDao;
import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import java.util.Arrays;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lio/elevenlabs/di/DatabaseModule;", "", "<init>", "()V", "Landroidx/room/c0;", "Lio/elevenlabs/di/AppDatabase;", "builder", "provideDatabase", "(Landroidx/room/c0;)Lio/elevenlabs/di/AppDatabase;", "Landroid/content/Context;", "context", "provideDatabaseBuilder", "(Landroid/content/Context;)Landroidx/room/c0;", "appDatabase", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "provideReadsDao", "(Lio/elevenlabs/di/AppDatabase;)Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "provideVoicesDao", "(Lio/elevenlabs/di/AppDatabase;)Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "provideRecentVoicesDao", "(Lio/elevenlabs/di/AppDatabase;)Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "provideCollectionsDao", "(Lio/elevenlabs/di/AppDatabase;)Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "provideBookmarksDao", "(Lio/elevenlabs/di/AppDatabase;)Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "provideOfflineReadsDao", "(Lio/elevenlabs/di/AppDatabase;)Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "providePersistentPlayerQueueDao", "(Lio/elevenlabs/di/AppDatabase;)Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "provideConsumptionSpanDao", "(Lio/elevenlabs/di/AppDatabase;)Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DatabaseModule {
    public static final DatabaseModule INSTANCE = new DatabaseModule();

    private DatabaseModule() {
    }

    public final BookmarksDao provideBookmarksDao(AppDatabase appDatabase) {
        appDatabase.getClass();
        return appDatabase.bookmarksDao();
    }

    public final CollectionsDao provideCollectionsDao(AppDatabase appDatabase) {
        appDatabase.getClass();
        return appDatabase.collectionsDao();
    }

    public final ConsumptionSpanDao provideConsumptionSpanDao(AppDatabase appDatabase) {
        appDatabase.getClass();
        return appDatabase.consumptionSpanDao();
    }

    public final AppDatabase provideDatabase(c0 builder) {
        builder.getClass();
        gb.b[] manualMigrations = AppDatabase.INSTANCE.getManualMigrations();
        builder.a((gb.b[]) Arrays.copyOf(manualMigrations, manualMigrations.length));
        builder.f3079p = false;
        builder.q = true;
        builder.f3080r = true;
        return (AppDatabase) builder.b();
    }

    public final c0 provideDatabaseBuilder(Context context) {
        context.getClass();
        return gg.b.I(context, "database", AppDatabase.class);
    }

    public final OfflineReadsDao provideOfflineReadsDao(AppDatabase appDatabase) {
        appDatabase.getClass();
        return appDatabase.offlineReadsDao();
    }

    public final PersistentPlayerQueueDao providePersistentPlayerQueueDao(AppDatabase appDatabase) {
        appDatabase.getClass();
        return appDatabase.persistentPlayerQueueDao();
    }

    public final ReadsDao provideReadsDao(AppDatabase appDatabase) {
        appDatabase.getClass();
        return appDatabase.readsDao();
    }

    public final RecentVoicesDao provideRecentVoicesDao(AppDatabase appDatabase) {
        appDatabase.getClass();
        return appDatabase.recentVoicesDao();
    }

    public final VoicesDao provideVoicesDao(AppDatabase appDatabase) {
        appDatabase.getClass();
        return appDatabase.voicesDao();
    }
}
