package io.elevenlabs.di;

import androidx.room.j0;
import io.elevenlabs.data.database.entities.bookmarks.BookmarksDao;
import io.elevenlabs.data.database.entities.collections.CollectionsDao;
import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.di.migrations.Migration49to50Kt;
import io.elevenlabs.di.migrations.Migration53to54Kt;
import io.elevenlabs.di.migrations.Migration54to55Kt;
import io.elevenlabs.di.migrations.Migration55to56Kt;
import io.elevenlabs.di.migrations.Migration56to57Kt;
import io.elevenlabs.di.migrations.Migration57to58Kt;
import io.elevenlabs.di.migrations.Migration59to60Kt;
import io.elevenlabs.di.migrations.Migration61to62Kt;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001e\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/di/AppDatabase;", "Landroidx/room/j0;", "<init>", "()V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "readsDao", "()Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "voicesDao", "()Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "recentVoicesDao", "()Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "collectionsDao", "()Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "bookmarksDao", "()Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "offlineReadsDao", "()Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "persistentPlayerQueueDao", "()Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "consumptionSpanDao", "()Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "Companion", "DeleteCanSubscribeMigration", "DeleteCanMakePodcastMigration", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class AppDatabase extends j0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final gb.b[] manualMigrations = {Migration49to50Kt.getMIGRATION_49_50(), Migration53to54Kt.getMIGRATION_53_54(), Migration54to55Kt.getMIGRATION_54_55(), Migration55to56Kt.getMIGRATION_55_56(), Migration56to57Kt.getMIGRATION_56_57(), Migration57to58Kt.getMIGRATION_57_58(), Migration59to60Kt.getMIGRATION_59_60(), Migration61to62Kt.getMIGRATION_61_62()};

    public abstract BookmarksDao bookmarksDao();

    public abstract CollectionsDao collectionsDao();

    public abstract ConsumptionSpanDao consumptionSpanDao();

    public abstract OfflineReadsDao offlineReadsDao();

    public abstract PersistentPlayerQueueDao persistentPlayerQueueDao();

    public abstract ReadsDao readsDao();

    public abstract RecentVoicesDao recentVoicesDao();

    public abstract VoicesDao voicesDao();

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/di/AppDatabase$Companion;", "", "<init>", "()V", "", "Lgb/b;", "manualMigrations", "[Lgb/b;", "getManualMigrations", "()[Lgb/b;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final gb.b[] getManualMigrations() {
            return AppDatabase.manualMigrations;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/di/AppDatabase$DeleteCanMakePodcastMigration;", "Lgb/a;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DeleteCanMakePodcastMigration implements gb.a {
        @Override // gb.a
        public void onPostMigrate(nb.a aVar) {
            aVar.getClass();
        }

        @Override // gb.a
        public /* bridge */ void onPostMigrate(mb.a aVar) {
            super.onPostMigrate(aVar);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/elevenlabs/di/AppDatabase$DeleteCanSubscribeMigration;", "Lgb/a;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DeleteCanSubscribeMigration implements gb.a {
        @Override // gb.a
        public void onPostMigrate(nb.a aVar) {
            aVar.getClass();
        }

        @Override // gb.a
        public /* bridge */ void onPostMigrate(mb.a aVar) {
            super.onPostMigrate(aVar);
        }
    }
}
