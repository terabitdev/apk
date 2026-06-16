package io.elevenlabs.di;

import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.room.l;
import androidx.room.o0;
import androidx.room.p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ec.t;
import ib.j;
import ib.k;
import ig.f;
import io.elevenlabs.data.database.entities.bookmarks.BookmarksDao;
import io.elevenlabs.data.database.entities.bookmarks.BookmarksDao_Impl;
import io.elevenlabs.data.database.entities.collections.CollectionsDao;
import io.elevenlabs.data.database.entities.collections.CollectionsDao_Impl;
import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao;
import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao_Impl;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl;
import io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao;
import io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao_Impl;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.database.entities.reads.ReadsDao_Impl;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.data.database.entities.voices.VoicesDao_Impl;
import io.elevenlabs.data.worker.OfflineReadsDownloadWorker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.WebrtcBuildVersion;
import oo.d;
import sn.h;
import sn.o;
import us.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0019018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\"018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020%018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020(018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020+018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00103R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020.018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00103¨\u0006;"}, d2 = {"Lio/elevenlabs/di/AppDatabase_Impl;", "Lio/elevenlabs/di/AppDatabase;", "<init>", "()V", "Landroidx/room/p0;", "createOpenDelegate", "()Landroidx/room/p0;", "Landroidx/room/l;", "createInvalidationTracker", "()Landroidx/room/l;", "Lsn/z;", "clearAllTables", "", "Loo/d;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Lgb/a;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Lgb/b;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "readsDao", "()Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "voicesDao", "()Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "recentVoicesDao", "()Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "collectionsDao", "()Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "bookmarksDao", "()Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "offlineReadsDao", "()Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "persistentPlayerQueueDao", "()Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "consumptionSpanDao", "()Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "Lsn/h;", "_readsDao", "Lsn/h;", "_voicesDao", "_recentVoicesDao", "_collectionsDao", "_bookmarksDao", "_offlineReadsDao", "_persistentPlayerQueueDao", "_consumptionSpanDao", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private final h _bookmarksDao;
    private final h _collectionsDao;
    private final h _consumptionSpanDao;
    private final h _offlineReadsDao;
    private final h _persistentPlayerQueueDao;
    private final h _readsDao;
    private final h _recentVoicesDao;
    private final h _voicesDao;

    public AppDatabase_Impl() {
        final int i10 = 0;
        this._readsDao = new o(new ho.a(this) { // from class: io.elevenlabs.di.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f14140b;

            {
                this.f14140b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                ReadsDao_Impl _readsDao$lambda$0;
                VoicesDao_Impl _voicesDao$lambda$0;
                RecentVoicesDao_Impl _recentVoicesDao$lambda$0;
                CollectionsDao_Impl _collectionsDao$lambda$0;
                BookmarksDao_Impl _bookmarksDao$lambda$0;
                OfflineReadsDao_Impl _offlineReadsDao$lambda$0;
                PersistentPlayerQueueDao_Impl _persistentPlayerQueueDao$lambda$0;
                ConsumptionSpanDao_Impl _consumptionSpanDao$lambda$0;
                switch (i10) {
                    case 0:
                        _readsDao$lambda$0 = AppDatabase_Impl._readsDao$lambda$0(this.f14140b);
                        return _readsDao$lambda$0;
                    case 1:
                        _voicesDao$lambda$0 = AppDatabase_Impl._voicesDao$lambda$0(this.f14140b);
                        return _voicesDao$lambda$0;
                    case 2:
                        _recentVoicesDao$lambda$0 = AppDatabase_Impl._recentVoicesDao$lambda$0(this.f14140b);
                        return _recentVoicesDao$lambda$0;
                    case 3:
                        _collectionsDao$lambda$0 = AppDatabase_Impl._collectionsDao$lambda$0(this.f14140b);
                        return _collectionsDao$lambda$0;
                    case 4:
                        _bookmarksDao$lambda$0 = AppDatabase_Impl._bookmarksDao$lambda$0(this.f14140b);
                        return _bookmarksDao$lambda$0;
                    case 5:
                        _offlineReadsDao$lambda$0 = AppDatabase_Impl._offlineReadsDao$lambda$0(this.f14140b);
                        return _offlineReadsDao$lambda$0;
                    case 6:
                        _persistentPlayerQueueDao$lambda$0 = AppDatabase_Impl._persistentPlayerQueueDao$lambda$0(this.f14140b);
                        return _persistentPlayerQueueDao$lambda$0;
                    default:
                        _consumptionSpanDao$lambda$0 = AppDatabase_Impl._consumptionSpanDao$lambda$0(this.f14140b);
                        return _consumptionSpanDao$lambda$0;
                }
            }
        });
        final int i11 = 1;
        this._voicesDao = new o(new ho.a(this) { // from class: io.elevenlabs.di.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f14140b;

            {
                this.f14140b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                ReadsDao_Impl _readsDao$lambda$0;
                VoicesDao_Impl _voicesDao$lambda$0;
                RecentVoicesDao_Impl _recentVoicesDao$lambda$0;
                CollectionsDao_Impl _collectionsDao$lambda$0;
                BookmarksDao_Impl _bookmarksDao$lambda$0;
                OfflineReadsDao_Impl _offlineReadsDao$lambda$0;
                PersistentPlayerQueueDao_Impl _persistentPlayerQueueDao$lambda$0;
                ConsumptionSpanDao_Impl _consumptionSpanDao$lambda$0;
                switch (i11) {
                    case 0:
                        _readsDao$lambda$0 = AppDatabase_Impl._readsDao$lambda$0(this.f14140b);
                        return _readsDao$lambda$0;
                    case 1:
                        _voicesDao$lambda$0 = AppDatabase_Impl._voicesDao$lambda$0(this.f14140b);
                        return _voicesDao$lambda$0;
                    case 2:
                        _recentVoicesDao$lambda$0 = AppDatabase_Impl._recentVoicesDao$lambda$0(this.f14140b);
                        return _recentVoicesDao$lambda$0;
                    case 3:
                        _collectionsDao$lambda$0 = AppDatabase_Impl._collectionsDao$lambda$0(this.f14140b);
                        return _collectionsDao$lambda$0;
                    case 4:
                        _bookmarksDao$lambda$0 = AppDatabase_Impl._bookmarksDao$lambda$0(this.f14140b);
                        return _bookmarksDao$lambda$0;
                    case 5:
                        _offlineReadsDao$lambda$0 = AppDatabase_Impl._offlineReadsDao$lambda$0(this.f14140b);
                        return _offlineReadsDao$lambda$0;
                    case 6:
                        _persistentPlayerQueueDao$lambda$0 = AppDatabase_Impl._persistentPlayerQueueDao$lambda$0(this.f14140b);
                        return _persistentPlayerQueueDao$lambda$0;
                    default:
                        _consumptionSpanDao$lambda$0 = AppDatabase_Impl._consumptionSpanDao$lambda$0(this.f14140b);
                        return _consumptionSpanDao$lambda$0;
                }
            }
        });
        final int i12 = 2;
        this._recentVoicesDao = new o(new ho.a(this) { // from class: io.elevenlabs.di.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f14140b;

            {
                this.f14140b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                ReadsDao_Impl _readsDao$lambda$0;
                VoicesDao_Impl _voicesDao$lambda$0;
                RecentVoicesDao_Impl _recentVoicesDao$lambda$0;
                CollectionsDao_Impl _collectionsDao$lambda$0;
                BookmarksDao_Impl _bookmarksDao$lambda$0;
                OfflineReadsDao_Impl _offlineReadsDao$lambda$0;
                PersistentPlayerQueueDao_Impl _persistentPlayerQueueDao$lambda$0;
                ConsumptionSpanDao_Impl _consumptionSpanDao$lambda$0;
                switch (i12) {
                    case 0:
                        _readsDao$lambda$0 = AppDatabase_Impl._readsDao$lambda$0(this.f14140b);
                        return _readsDao$lambda$0;
                    case 1:
                        _voicesDao$lambda$0 = AppDatabase_Impl._voicesDao$lambda$0(this.f14140b);
                        return _voicesDao$lambda$0;
                    case 2:
                        _recentVoicesDao$lambda$0 = AppDatabase_Impl._recentVoicesDao$lambda$0(this.f14140b);
                        return _recentVoicesDao$lambda$0;
                    case 3:
                        _collectionsDao$lambda$0 = AppDatabase_Impl._collectionsDao$lambda$0(this.f14140b);
                        return _collectionsDao$lambda$0;
                    case 4:
                        _bookmarksDao$lambda$0 = AppDatabase_Impl._bookmarksDao$lambda$0(this.f14140b);
                        return _bookmarksDao$lambda$0;
                    case 5:
                        _offlineReadsDao$lambda$0 = AppDatabase_Impl._offlineReadsDao$lambda$0(this.f14140b);
                        return _offlineReadsDao$lambda$0;
                    case 6:
                        _persistentPlayerQueueDao$lambda$0 = AppDatabase_Impl._persistentPlayerQueueDao$lambda$0(this.f14140b);
                        return _persistentPlayerQueueDao$lambda$0;
                    default:
                        _consumptionSpanDao$lambda$0 = AppDatabase_Impl._consumptionSpanDao$lambda$0(this.f14140b);
                        return _consumptionSpanDao$lambda$0;
                }
            }
        });
        final int i13 = 3;
        this._collectionsDao = new o(new ho.a(this) { // from class: io.elevenlabs.di.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f14140b;

            {
                this.f14140b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                ReadsDao_Impl _readsDao$lambda$0;
                VoicesDao_Impl _voicesDao$lambda$0;
                RecentVoicesDao_Impl _recentVoicesDao$lambda$0;
                CollectionsDao_Impl _collectionsDao$lambda$0;
                BookmarksDao_Impl _bookmarksDao$lambda$0;
                OfflineReadsDao_Impl _offlineReadsDao$lambda$0;
                PersistentPlayerQueueDao_Impl _persistentPlayerQueueDao$lambda$0;
                ConsumptionSpanDao_Impl _consumptionSpanDao$lambda$0;
                switch (i13) {
                    case 0:
                        _readsDao$lambda$0 = AppDatabase_Impl._readsDao$lambda$0(this.f14140b);
                        return _readsDao$lambda$0;
                    case 1:
                        _voicesDao$lambda$0 = AppDatabase_Impl._voicesDao$lambda$0(this.f14140b);
                        return _voicesDao$lambda$0;
                    case 2:
                        _recentVoicesDao$lambda$0 = AppDatabase_Impl._recentVoicesDao$lambda$0(this.f14140b);
                        return _recentVoicesDao$lambda$0;
                    case 3:
                        _collectionsDao$lambda$0 = AppDatabase_Impl._collectionsDao$lambda$0(this.f14140b);
                        return _collectionsDao$lambda$0;
                    case 4:
                        _bookmarksDao$lambda$0 = AppDatabase_Impl._bookmarksDao$lambda$0(this.f14140b);
                        return _bookmarksDao$lambda$0;
                    case 5:
                        _offlineReadsDao$lambda$0 = AppDatabase_Impl._offlineReadsDao$lambda$0(this.f14140b);
                        return _offlineReadsDao$lambda$0;
                    case 6:
                        _persistentPlayerQueueDao$lambda$0 = AppDatabase_Impl._persistentPlayerQueueDao$lambda$0(this.f14140b);
                        return _persistentPlayerQueueDao$lambda$0;
                    default:
                        _consumptionSpanDao$lambda$0 = AppDatabase_Impl._consumptionSpanDao$lambda$0(this.f14140b);
                        return _consumptionSpanDao$lambda$0;
                }
            }
        });
        final int i14 = 4;
        this._bookmarksDao = new o(new ho.a(this) { // from class: io.elevenlabs.di.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f14140b;

            {
                this.f14140b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                ReadsDao_Impl _readsDao$lambda$0;
                VoicesDao_Impl _voicesDao$lambda$0;
                RecentVoicesDao_Impl _recentVoicesDao$lambda$0;
                CollectionsDao_Impl _collectionsDao$lambda$0;
                BookmarksDao_Impl _bookmarksDao$lambda$0;
                OfflineReadsDao_Impl _offlineReadsDao$lambda$0;
                PersistentPlayerQueueDao_Impl _persistentPlayerQueueDao$lambda$0;
                ConsumptionSpanDao_Impl _consumptionSpanDao$lambda$0;
                switch (i14) {
                    case 0:
                        _readsDao$lambda$0 = AppDatabase_Impl._readsDao$lambda$0(this.f14140b);
                        return _readsDao$lambda$0;
                    case 1:
                        _voicesDao$lambda$0 = AppDatabase_Impl._voicesDao$lambda$0(this.f14140b);
                        return _voicesDao$lambda$0;
                    case 2:
                        _recentVoicesDao$lambda$0 = AppDatabase_Impl._recentVoicesDao$lambda$0(this.f14140b);
                        return _recentVoicesDao$lambda$0;
                    case 3:
                        _collectionsDao$lambda$0 = AppDatabase_Impl._collectionsDao$lambda$0(this.f14140b);
                        return _collectionsDao$lambda$0;
                    case 4:
                        _bookmarksDao$lambda$0 = AppDatabase_Impl._bookmarksDao$lambda$0(this.f14140b);
                        return _bookmarksDao$lambda$0;
                    case 5:
                        _offlineReadsDao$lambda$0 = AppDatabase_Impl._offlineReadsDao$lambda$0(this.f14140b);
                        return _offlineReadsDao$lambda$0;
                    case 6:
                        _persistentPlayerQueueDao$lambda$0 = AppDatabase_Impl._persistentPlayerQueueDao$lambda$0(this.f14140b);
                        return _persistentPlayerQueueDao$lambda$0;
                    default:
                        _consumptionSpanDao$lambda$0 = AppDatabase_Impl._consumptionSpanDao$lambda$0(this.f14140b);
                        return _consumptionSpanDao$lambda$0;
                }
            }
        });
        final int i15 = 5;
        this._offlineReadsDao = new o(new ho.a(this) { // from class: io.elevenlabs.di.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f14140b;

            {
                this.f14140b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                ReadsDao_Impl _readsDao$lambda$0;
                VoicesDao_Impl _voicesDao$lambda$0;
                RecentVoicesDao_Impl _recentVoicesDao$lambda$0;
                CollectionsDao_Impl _collectionsDao$lambda$0;
                BookmarksDao_Impl _bookmarksDao$lambda$0;
                OfflineReadsDao_Impl _offlineReadsDao$lambda$0;
                PersistentPlayerQueueDao_Impl _persistentPlayerQueueDao$lambda$0;
                ConsumptionSpanDao_Impl _consumptionSpanDao$lambda$0;
                switch (i15) {
                    case 0:
                        _readsDao$lambda$0 = AppDatabase_Impl._readsDao$lambda$0(this.f14140b);
                        return _readsDao$lambda$0;
                    case 1:
                        _voicesDao$lambda$0 = AppDatabase_Impl._voicesDao$lambda$0(this.f14140b);
                        return _voicesDao$lambda$0;
                    case 2:
                        _recentVoicesDao$lambda$0 = AppDatabase_Impl._recentVoicesDao$lambda$0(this.f14140b);
                        return _recentVoicesDao$lambda$0;
                    case 3:
                        _collectionsDao$lambda$0 = AppDatabase_Impl._collectionsDao$lambda$0(this.f14140b);
                        return _collectionsDao$lambda$0;
                    case 4:
                        _bookmarksDao$lambda$0 = AppDatabase_Impl._bookmarksDao$lambda$0(this.f14140b);
                        return _bookmarksDao$lambda$0;
                    case 5:
                        _offlineReadsDao$lambda$0 = AppDatabase_Impl._offlineReadsDao$lambda$0(this.f14140b);
                        return _offlineReadsDao$lambda$0;
                    case 6:
                        _persistentPlayerQueueDao$lambda$0 = AppDatabase_Impl._persistentPlayerQueueDao$lambda$0(this.f14140b);
                        return _persistentPlayerQueueDao$lambda$0;
                    default:
                        _consumptionSpanDao$lambda$0 = AppDatabase_Impl._consumptionSpanDao$lambda$0(this.f14140b);
                        return _consumptionSpanDao$lambda$0;
                }
            }
        });
        final int i16 = 6;
        this._persistentPlayerQueueDao = new o(new ho.a(this) { // from class: io.elevenlabs.di.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f14140b;

            {
                this.f14140b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                ReadsDao_Impl _readsDao$lambda$0;
                VoicesDao_Impl _voicesDao$lambda$0;
                RecentVoicesDao_Impl _recentVoicesDao$lambda$0;
                CollectionsDao_Impl _collectionsDao$lambda$0;
                BookmarksDao_Impl _bookmarksDao$lambda$0;
                OfflineReadsDao_Impl _offlineReadsDao$lambda$0;
                PersistentPlayerQueueDao_Impl _persistentPlayerQueueDao$lambda$0;
                ConsumptionSpanDao_Impl _consumptionSpanDao$lambda$0;
                switch (i16) {
                    case 0:
                        _readsDao$lambda$0 = AppDatabase_Impl._readsDao$lambda$0(this.f14140b);
                        return _readsDao$lambda$0;
                    case 1:
                        _voicesDao$lambda$0 = AppDatabase_Impl._voicesDao$lambda$0(this.f14140b);
                        return _voicesDao$lambda$0;
                    case 2:
                        _recentVoicesDao$lambda$0 = AppDatabase_Impl._recentVoicesDao$lambda$0(this.f14140b);
                        return _recentVoicesDao$lambda$0;
                    case 3:
                        _collectionsDao$lambda$0 = AppDatabase_Impl._collectionsDao$lambda$0(this.f14140b);
                        return _collectionsDao$lambda$0;
                    case 4:
                        _bookmarksDao$lambda$0 = AppDatabase_Impl._bookmarksDao$lambda$0(this.f14140b);
                        return _bookmarksDao$lambda$0;
                    case 5:
                        _offlineReadsDao$lambda$0 = AppDatabase_Impl._offlineReadsDao$lambda$0(this.f14140b);
                        return _offlineReadsDao$lambda$0;
                    case 6:
                        _persistentPlayerQueueDao$lambda$0 = AppDatabase_Impl._persistentPlayerQueueDao$lambda$0(this.f14140b);
                        return _persistentPlayerQueueDao$lambda$0;
                    default:
                        _consumptionSpanDao$lambda$0 = AppDatabase_Impl._consumptionSpanDao$lambda$0(this.f14140b);
                        return _consumptionSpanDao$lambda$0;
                }
            }
        });
        final int i17 = 7;
        this._consumptionSpanDao = new o(new ho.a(this) { // from class: io.elevenlabs.di.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f14140b;

            {
                this.f14140b = this;
            }

            @Override // ho.a
            public final Object invoke() {
                ReadsDao_Impl _readsDao$lambda$0;
                VoicesDao_Impl _voicesDao$lambda$0;
                RecentVoicesDao_Impl _recentVoicesDao$lambda$0;
                CollectionsDao_Impl _collectionsDao$lambda$0;
                BookmarksDao_Impl _bookmarksDao$lambda$0;
                OfflineReadsDao_Impl _offlineReadsDao$lambda$0;
                PersistentPlayerQueueDao_Impl _persistentPlayerQueueDao$lambda$0;
                ConsumptionSpanDao_Impl _consumptionSpanDao$lambda$0;
                switch (i17) {
                    case 0:
                        _readsDao$lambda$0 = AppDatabase_Impl._readsDao$lambda$0(this.f14140b);
                        return _readsDao$lambda$0;
                    case 1:
                        _voicesDao$lambda$0 = AppDatabase_Impl._voicesDao$lambda$0(this.f14140b);
                        return _voicesDao$lambda$0;
                    case 2:
                        _recentVoicesDao$lambda$0 = AppDatabase_Impl._recentVoicesDao$lambda$0(this.f14140b);
                        return _recentVoicesDao$lambda$0;
                    case 3:
                        _collectionsDao$lambda$0 = AppDatabase_Impl._collectionsDao$lambda$0(this.f14140b);
                        return _collectionsDao$lambda$0;
                    case 4:
                        _bookmarksDao$lambda$0 = AppDatabase_Impl._bookmarksDao$lambda$0(this.f14140b);
                        return _bookmarksDao$lambda$0;
                    case 5:
                        _offlineReadsDao$lambda$0 = AppDatabase_Impl._offlineReadsDao$lambda$0(this.f14140b);
                        return _offlineReadsDao$lambda$0;
                    case 6:
                        _persistentPlayerQueueDao$lambda$0 = AppDatabase_Impl._persistentPlayerQueueDao$lambda$0(this.f14140b);
                        return _persistentPlayerQueueDao$lambda$0;
                    default:
                        _consumptionSpanDao$lambda$0 = AppDatabase_Impl._consumptionSpanDao$lambda$0(this.f14140b);
                        return _consumptionSpanDao$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BookmarksDao_Impl _bookmarksDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new BookmarksDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionsDao_Impl _collectionsDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new CollectionsDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConsumptionSpanDao_Impl _consumptionSpanDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new ConsumptionSpanDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OfflineReadsDao_Impl _offlineReadsDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new OfflineReadsDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersistentPlayerQueueDao_Impl _persistentPlayerQueueDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new PersistentPlayerQueueDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadsDao_Impl _readsDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new ReadsDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecentVoicesDao_Impl _recentVoicesDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new RecentVoicesDao_Impl(appDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VoicesDao_Impl _voicesDao$lambda$0(AppDatabase_Impl appDatabase_Impl) {
        return new VoicesDao_Impl(appDatabase_Impl);
    }

    @Override // io.elevenlabs.di.AppDatabase
    public BookmarksDao bookmarksDao() {
        return (BookmarksDao) this._bookmarksDao.getValue();
    }

    @Override // androidx.room.j0
    public void clearAllTables() {
        performClear(true, "reads", "reads_chapters", "sample_config", "voices", "recent_voices", "collections", "bookmarks", "offline_read", "offline_chapter", "persistent_player_queue", "consumption_spans");
    }

    @Override // io.elevenlabs.di.AppDatabase
    public CollectionsDao collectionsDao() {
        return (CollectionsDao) this._collectionsDao.getValue();
    }

    @Override // io.elevenlabs.di.AppDatabase
    public ConsumptionSpanDao consumptionSpanDao() {
        return (ConsumptionSpanDao) this._consumptionSpanDao.getValue();
    }

    @Override // androidx.room.j0
    public List<gb.b> createAutoMigrations(Map<d, ? extends gb.a> autoMigrationSpecs) {
        autoMigrationSpecs.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AppDatabase_AutoMigration_27_28_Impl());
        arrayList.add(new AppDatabase_AutoMigration_28_30_Impl());
        arrayList.add(new AppDatabase_AutoMigration_30_31_Impl());
        arrayList.add(new AppDatabase_AutoMigration_31_32_Impl());
        arrayList.add(new AppDatabase_AutoMigration_32_33_Impl());
        arrayList.add(new AppDatabase_AutoMigration_33_34_Impl());
        arrayList.add(new AppDatabase_AutoMigration_34_35_Impl());
        arrayList.add(new AppDatabase_AutoMigration_35_36_Impl());
        arrayList.add(new AppDatabase_AutoMigration_36_37_Impl());
        arrayList.add(new AppDatabase_AutoMigration_37_38_Impl());
        arrayList.add(new AppDatabase_AutoMigration_38_39_Impl());
        arrayList.add(new AppDatabase_AutoMigration_39_40_Impl());
        arrayList.add(new AppDatabase_AutoMigration_40_41_Impl());
        arrayList.add(new AppDatabase_AutoMigration_41_42_Impl());
        arrayList.add(new AppDatabase_AutoMigration_42_43_Impl());
        arrayList.add(new AppDatabase_AutoMigration_43_44_Impl());
        arrayList.add(new AppDatabase_AutoMigration_44_45_Impl());
        arrayList.add(new AppDatabase_AutoMigration_45_46_Impl());
        arrayList.add(new AppDatabase_AutoMigration_46_47_Impl());
        arrayList.add(new AppDatabase_AutoMigration_47_48_Impl());
        arrayList.add(new AppDatabase_AutoMigration_48_49_Impl());
        arrayList.add(new AppDatabase_AutoMigration_50_51_Impl());
        arrayList.add(new AppDatabase_AutoMigration_51_52_Impl());
        arrayList.add(new AppDatabase_AutoMigration_52_53_Impl());
        arrayList.add(new AppDatabase_AutoMigration_58_59_Impl());
        arrayList.add(new AppDatabase_AutoMigration_60_61_Impl());
        arrayList.add(new AppDatabase_AutoMigration_62_63_Impl());
        return arrayList;
    }

    @Override // androidx.room.j0
    public l createInvalidationTracker() {
        return new l(this, new LinkedHashMap(), new LinkedHashMap(), "reads", "reads_chapters", "sample_config", "voices", "recent_voices", "collections", "bookmarks", "offline_read", "offline_chapter", "persistent_player_queue", "consumption_spans");
    }

    @Override // androidx.room.j0
    public p0 createOpenDelegate() {
        return new p0() { // from class: io.elevenlabs.di.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(63, "b62e0f8d7a97bd38f3bc7fa232cb8999", "701995bec4e6de95e774d42d00e938d2");
            }

            @Override // androidx.room.p0
            public void createAllTables(mb.a connection) {
                com.google.android.gms.internal.play_billing.b.x(connection, connection, "CREATE TABLE IF NOT EXISTS `reads` (`read_id` TEXT NOT NULL, `sync_state` TEXT NOT NULL, `article_image_url` TEXT, `author` TEXT, `char_count` INTEGER NOT NULL, `created_at_unix` INTEGER NOT NULL, `updated_at_unix` INTEGER NOT NULL, `added_at_unix` INTEGER, `description` TEXT, `last_listened_char_offset` INTEGER NOT NULL, `source` TEXT, `title` TEXT, `subtitle` TEXT DEFAULT NULL, `url` TEXT, `word_count` INTEGER NOT NULL, `original_file_type` TEXT, `has_original_audio` INTEGER NOT NULL, `mature_content` INTEGER NOT NULL, `origin` TEXT, `content_type` TEXT, `genre` TEXT NOT NULL, `html_checksum` TEXT, `from_user_import` INTEGER NOT NULL, `rating_average` REAL, `rating_count` INTEGER, `user_rating` INTEGER, `last_used_voice_id` TEXT, `creation_status` TEXT, `creation_progress` REAL, `is_archived` INTEGER NOT NULL, `marked_as_unread` INTEGER NOT NULL DEFAULT 0, `completed_at_unix` INTEGER DEFAULT NULL, `publicationDate` TEXT DEFAULT NULL, `language` TEXT DEFAULT NULL, `publisherProfileId` TEXT DEFAULT NULL, `can_delete` INTEGER NOT NULL DEFAULT 0, `android_product_id` TEXT DEFAULT NULL, `is_paid` INTEGER NOT NULL DEFAULT 0, `previewAudio` TEXT DEFAULT NULL, `original_audio_voice_name` TEXT DEFAULT NULL, `original_audio_voice_image` TEXT DEFAULT NULL, `voice_selection_config` TEXT DEFAULT NULL, `sample_config_id` INTEGER DEFAULT NULL, `display_mode` TEXT DEFAULT NULL, `in_user_library` INTEGER NOT NULL DEFAULT 0, `can_use_assistant` INTEGER NOT NULL DEFAULT 0, `audio_type` TEXT DEFAULT NULL, `use_drm` INTEGER NOT NULL DEFAULT 0, `last_listened_audio_file_number` TEXT DEFAULT NULL, `last_listened_audio_seconds` REAL DEFAULT NULL, `audio_types` TEXT NOT NULL DEFAULT '[]', `is_voice_changer_on` INTEGER NOT NULL DEFAULT 0, `last_used_audio_type` TEXT DEFAULT NULL, `cover_image_urls` TEXT DEFAULT NULL, `cover_aspect_ratio` REAL DEFAULT NULL, `blur_placeholder` TEXT DEFAULT NULL, PRIMARY KEY(`read_id`))", connection, "CREATE TABLE IF NOT EXISTS `reads_chapters` (`read_id` TEXT NOT NULL, `chapter_index` INTEGER NOT NULL, `chapter_name` TEXT NOT NULL, `char_count` INTEGER NOT NULL, `has_summary` INTEGER NOT NULL, `word_count` INTEGER NOT NULL, `starting_char_offset` INTEGER NOT NULL, `duration_seconds` REAL DEFAULT NULL, `audio_file_number` TEXT DEFAULT NULL, PRIMARY KEY(`read_id`, `chapter_index`))");
                tb.a.s("CREATE TABLE IF NOT EXISTS `sample_config` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_sample` INTEGER NOT NULL, `parent_id` TEXT, `parent_type` TEXT, `chapter_ids` TEXT)", connection);
                tb.a.s("CREATE TABLE IF NOT EXISTS `voices` (`voiceId` TEXT NOT NULL, `ownerId` TEXT, `name` TEXT NOT NULL, `accent` TEXT NOT NULL, `gender` TEXT NOT NULL, `age` TEXT NOT NULL, `descriptive` TEXT NOT NULL, `useCase` TEXT NOT NULL, `category` TEXT NOT NULL, `fromVoiceLibrary` INTEGER NOT NULL, `subtitle` TEXT, `description` TEXT, `previewUrl` TEXT, `imageUrl` TEXT, `favoritedAtUnix` INTEGER, `createdAtUnix` INTEGER, PRIMARY KEY(`voiceId`))", connection);
                tb.a.s("CREATE TABLE IF NOT EXISTS `recent_voices` (`voiceId` TEXT NOT NULL, `lastUsedAtUnixMillis` INTEGER NOT NULL, PRIMARY KEY(`voiceId`), FOREIGN KEY(`voiceId`) REFERENCES `voices`(`voiceId`) ON UPDATE NO ACTION ON DELETE CASCADE )", connection);
                tb.a.s("CREATE TABLE IF NOT EXISTS `collections` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT, `has_unread` INTEGER NOT NULL, `description` TEXT, `image_url` TEXT, `last_opened_at_unix` INTEGER, `updated_at_unix` INTEGER, `category` TEXT, `item_count` INTEGER, `is_owner` INTEGER DEFAULT NULL, `icon` TEXT DEFAULT NULL, PRIMARY KEY(`id`))", connection);
                tb.a.s("CREATE TABLE IF NOT EXISTS `bookmarks` (`id` TEXT NOT NULL, `read_id` TEXT NOT NULL, `start_offset_inclusive` INTEGER NOT NULL, `end_offset_exclusive` INTEGER NOT NULL, `text` TEXT NOT NULL, `created_at_unix` INTEGER NOT NULL, `updated_at_unix` INTEGER NOT NULL, `note` TEXT, `sync_state` TEXT NOT NULL, `created_id` TEXT, `chapter_index` INTEGER, `start_time_seconds` REAL, `end_time_seconds` REAL, PRIMARY KEY(`id`))", connection);
                tb.a.s("CREATE INDEX IF NOT EXISTS `index_bookmarks_read_id` ON `bookmarks` (`read_id`)", connection);
                tb.a.s("CREATE TABLE IF NOT EXISTS `offline_read` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `read_id` TEXT NOT NULL, `voice_id` TEXT NOT NULL, `type` TEXT NOT NULL DEFAULT 'TTS', `total_char_count` INTEGER NOT NULL, `created_at_unix` INTEGER NOT NULL, `updated_at_unix` INTEGER NOT NULL, `status` TEXT NOT NULL, `progress` INTEGER NOT NULL, `cached_manifest_urls` TEXT DEFAULT NULL, `drm_key_set_ids` TEXT DEFAULT NULL)", connection);
                tb.a.s("CREATE INDEX IF NOT EXISTS `index_offline_read_read_id` ON `offline_read` (`read_id`)", connection);
                tb.a.s("CREATE INDEX IF NOT EXISTS `index_offline_read_voice_id` ON `offline_read` (`voice_id`)", connection);
                tb.a.s("CREATE TABLE IF NOT EXISTS `offline_chapter` (`offline_read_id` INTEGER NOT NULL, `read_id` TEXT NOT NULL, `chapter_index` INTEGER NOT NULL, `file_number` TEXT, `status` TEXT NOT NULL, `progress` INTEGER NOT NULL, `cached_manifest_url` TEXT, `drm_key_set_id` TEXT, `created_at_unix` INTEGER NOT NULL, `expires_at_unix` INTEGER NOT NULL, PRIMARY KEY(`offline_read_id`, `chapter_index`), FOREIGN KEY(`offline_read_id`) REFERENCES `offline_read`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )", connection);
                tb.a.s("CREATE INDEX IF NOT EXISTS `index_offline_chapter_read_id` ON `offline_chapter` (`read_id`)", connection);
                tb.a.s("CREATE TABLE IF NOT EXISTS `persistent_player_queue` (`read_id` TEXT NOT NULL, `position` INTEGER NOT NULL, PRIMARY KEY(`read_id`))", connection);
                tb.a.s("CREATE TABLE IF NOT EXISTS `consumption_spans` (`id` TEXT NOT NULL, `read_id` TEXT NOT NULL, `audio_file_number` TEXT, `start_seconds` REAL NOT NULL, `end_seconds` REAL NOT NULL, `start_char_offset` INTEGER, `end_char_offset` INTEGER, `listened_at_unix` INTEGER NOT NULL, `playback_speed` REAL NOT NULL, `real_time_duration_seconds` REAL NOT NULL, `type` TEXT NOT NULL, `playback_source` TEXT, `device_online` INTEGER, `voice_id` TEXT, PRIMARY KEY(`id`))", connection);
                tb.a.s("CREATE INDEX IF NOT EXISTS `index_consumption_spans_read_id` ON `consumption_spans` (`read_id`)", connection);
                tb.a.s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", connection);
                tb.a.s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b62e0f8d7a97bd38f3bc7fa232cb8999')", connection);
            }

            @Override // androidx.room.p0
            public void dropAllTables(mb.a connection) {
                com.google.android.gms.internal.play_billing.b.x(connection, connection, "DROP TABLE IF EXISTS `reads`", connection, "DROP TABLE IF EXISTS `reads_chapters`");
                tb.a.s("DROP TABLE IF EXISTS `sample_config`", connection);
                tb.a.s("DROP TABLE IF EXISTS `voices`", connection);
                tb.a.s("DROP TABLE IF EXISTS `recent_voices`", connection);
                tb.a.s("DROP TABLE IF EXISTS `collections`", connection);
                tb.a.s("DROP TABLE IF EXISTS `bookmarks`", connection);
                tb.a.s("DROP TABLE IF EXISTS `offline_read`", connection);
                tb.a.s("DROP TABLE IF EXISTS `offline_chapter`", connection);
                tb.a.s("DROP TABLE IF EXISTS `persistent_player_queue`", connection);
                tb.a.s("DROP TABLE IF EXISTS `consumption_spans`", connection);
            }

            @Override // androidx.room.p0
            public void onCreate(mb.a connection) {
                connection.getClass();
            }

            @Override // androidx.room.p0
            public void onOpen(mb.a connection) {
                connection.getClass();
                tb.a.s("PRAGMA foreign_keys = ON", connection);
                AppDatabase_Impl.this.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.p0
            public void onPostMigrate(mb.a connection) {
                connection.getClass();
            }

            @Override // androidx.room.p0
            public void onPreMigrate(mb.a connection) {
                connection.getClass();
                g.j(connection);
            }

            @Override // androidx.room.p0
            public o0 onValidateSchema(mb.a connection) {
                connection.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("read_id", new ib.h(1, 1, "read_id", "TEXT", null, true));
                linkedHashMap.put("sync_state", new ib.h(0, 1, "sync_state", "TEXT", null, true));
                linkedHashMap.put("article_image_url", new ib.h(0, 1, "article_image_url", "TEXT", null, false));
                linkedHashMap.put("author", new ib.h(0, 1, "author", "TEXT", null, false));
                linkedHashMap.put("char_count", new ib.h(0, 1, "char_count", "INTEGER", null, true));
                linkedHashMap.put("created_at_unix", new ib.h(0, 1, "created_at_unix", "INTEGER", null, true));
                linkedHashMap.put("updated_at_unix", new ib.h(0, 1, "updated_at_unix", "INTEGER", null, true));
                linkedHashMap.put("added_at_unix", new ib.h(0, 1, "added_at_unix", "INTEGER", null, false));
                linkedHashMap.put("description", new ib.h(0, 1, "description", "TEXT", null, false));
                linkedHashMap.put("last_listened_char_offset", new ib.h(0, 1, "last_listened_char_offset", "INTEGER", null, true));
                linkedHashMap.put("source", new ib.h(0, 1, "source", "TEXT", null, false));
                linkedHashMap.put("title", new ib.h(0, 1, "title", "TEXT", null, false));
                linkedHashMap.put("subtitle", new ib.h(0, 1, "subtitle", "TEXT", "NULL", false));
                linkedHashMap.put("url", new ib.h(0, 1, "url", "TEXT", null, false));
                linkedHashMap.put("word_count", new ib.h(0, 1, "word_count", "INTEGER", null, true));
                linkedHashMap.put("original_file_type", new ib.h(0, 1, "original_file_type", "TEXT", null, false));
                linkedHashMap.put("has_original_audio", new ib.h(0, 1, "has_original_audio", "INTEGER", null, true));
                linkedHashMap.put("mature_content", new ib.h(0, 1, "mature_content", "INTEGER", null, true));
                linkedHashMap.put(FirebaseAnalytics.Param.ORIGIN, new ib.h(0, 1, FirebaseAnalytics.Param.ORIGIN, "TEXT", null, false));
                linkedHashMap.put(FirebaseAnalytics.Param.CONTENT_TYPE, new ib.h(0, 1, FirebaseAnalytics.Param.CONTENT_TYPE, "TEXT", null, false));
                linkedHashMap.put("genre", new ib.h(0, 1, "genre", "TEXT", null, true));
                linkedHashMap.put("html_checksum", new ib.h(0, 1, "html_checksum", "TEXT", null, false));
                linkedHashMap.put("from_user_import", new ib.h(0, 1, "from_user_import", "INTEGER", null, true));
                linkedHashMap.put("rating_average", new ib.h(0, 1, "rating_average", "REAL", null, false));
                linkedHashMap.put("rating_count", new ib.h(0, 1, "rating_count", "INTEGER", null, false));
                linkedHashMap.put("user_rating", new ib.h(0, 1, "user_rating", "INTEGER", null, false));
                linkedHashMap.put("last_used_voice_id", new ib.h(0, 1, "last_used_voice_id", "TEXT", null, false));
                linkedHashMap.put("creation_status", new ib.h(0, 1, "creation_status", "TEXT", null, false));
                linkedHashMap.put("creation_progress", new ib.h(0, 1, "creation_progress", "REAL", null, false));
                linkedHashMap.put("is_archived", new ib.h(0, 1, "is_archived", "INTEGER", null, true));
                linkedHashMap.put("marked_as_unread", new ib.h(0, 1, "marked_as_unread", "INTEGER", WebrtcBuildVersion.maint_version, true));
                linkedHashMap.put("completed_at_unix", new ib.h(0, 1, "completed_at_unix", "INTEGER", "NULL", false));
                linkedHashMap.put("publicationDate", new ib.h(0, 1, "publicationDate", "TEXT", "NULL", false));
                linkedHashMap.put("language", new ib.h(0, 1, "language", "TEXT", "NULL", false));
                linkedHashMap.put("publisherProfileId", new ib.h(0, 1, "publisherProfileId", "TEXT", "NULL", false));
                linkedHashMap.put("can_delete", new ib.h(0, 1, "can_delete", "INTEGER", WebrtcBuildVersion.maint_version, true));
                linkedHashMap.put("android_product_id", new ib.h(0, 1, "android_product_id", "TEXT", "NULL", false));
                linkedHashMap.put("is_paid", new ib.h(0, 1, "is_paid", "INTEGER", WebrtcBuildVersion.maint_version, true));
                linkedHashMap.put("previewAudio", new ib.h(0, 1, "previewAudio", "TEXT", "NULL", false));
                linkedHashMap.put("original_audio_voice_name", new ib.h(0, 1, "original_audio_voice_name", "TEXT", "NULL", false));
                linkedHashMap.put("original_audio_voice_image", new ib.h(0, 1, "original_audio_voice_image", "TEXT", "NULL", false));
                linkedHashMap.put("voice_selection_config", new ib.h(0, 1, "voice_selection_config", "TEXT", "NULL", false));
                linkedHashMap.put("sample_config_id", new ib.h(0, 1, "sample_config_id", "INTEGER", "NULL", false));
                linkedHashMap.put("display_mode", new ib.h(0, 1, "display_mode", "TEXT", "NULL", false));
                linkedHashMap.put("in_user_library", new ib.h(0, 1, "in_user_library", "INTEGER", WebrtcBuildVersion.maint_version, true));
                linkedHashMap.put("can_use_assistant", new ib.h(0, 1, "can_use_assistant", "INTEGER", WebrtcBuildVersion.maint_version, true));
                linkedHashMap.put("audio_type", new ib.h(0, 1, "audio_type", "TEXT", "NULL", false));
                linkedHashMap.put("use_drm", new ib.h(0, 1, "use_drm", "INTEGER", WebrtcBuildVersion.maint_version, true));
                linkedHashMap.put("last_listened_audio_file_number", new ib.h(0, 1, "last_listened_audio_file_number", "TEXT", "NULL", false));
                linkedHashMap.put("last_listened_audio_seconds", new ib.h(0, 1, "last_listened_audio_seconds", "REAL", "NULL", false));
                linkedHashMap.put("audio_types", new ib.h(0, 1, "audio_types", "TEXT", "'[]'", true));
                linkedHashMap.put("is_voice_changer_on", new ib.h(0, 1, "is_voice_changer_on", "INTEGER", WebrtcBuildVersion.maint_version, true));
                linkedHashMap.put("last_used_audio_type", new ib.h(0, 1, "last_used_audio_type", "TEXT", "NULL", false));
                linkedHashMap.put("cover_image_urls", new ib.h(0, 1, "cover_image_urls", "TEXT", "NULL", false));
                linkedHashMap.put("cover_aspect_ratio", new ib.h(0, 1, "cover_aspect_ratio", "REAL", "NULL", false));
                linkedHashMap.put("blur_placeholder", new ib.h(0, 1, "blur_placeholder", "TEXT", "NULL", false));
                ib.l lVar = new ib.l("reads", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                ib.l D = t.D("reads", connection);
                if (!lVar.equals(D)) {
                    return new o0(false, "reads(io.elevenlabs.data.database.entities.reads.ReadMetaEntity).\n Expected:\n" + lVar + "\n Found:\n" + D);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("read_id", new ib.h(1, 1, "read_id", "TEXT", null, true));
                linkedHashMap2.put("chapter_index", new ib.h(2, 1, "chapter_index", "INTEGER", null, true));
                linkedHashMap2.put("chapter_name", new ib.h(0, 1, "chapter_name", "TEXT", null, true));
                linkedHashMap2.put("char_count", new ib.h(0, 1, "char_count", "INTEGER", null, true));
                linkedHashMap2.put("has_summary", new ib.h(0, 1, "has_summary", "INTEGER", null, true));
                linkedHashMap2.put("word_count", new ib.h(0, 1, "word_count", "INTEGER", null, true));
                linkedHashMap2.put("starting_char_offset", new ib.h(0, 1, "starting_char_offset", "INTEGER", null, true));
                linkedHashMap2.put("duration_seconds", new ib.h(0, 1, "duration_seconds", "REAL", "NULL", false));
                linkedHashMap2.put("audio_file_number", new ib.h(0, 1, "audio_file_number", "TEXT", "NULL", false));
                ib.l lVar2 = new ib.l("reads_chapters", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                ib.l D2 = t.D("reads_chapters", connection);
                if (!lVar2.equals(D2)) {
                    return new o0(false, "reads_chapters(io.elevenlabs.data.database.entities.reads.ReadChapterEntity).\n Expected:\n" + lVar2 + "\n Found:\n" + D2);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("id", new ib.h(1, 1, "id", "INTEGER", null, true));
                linkedHashMap3.put("is_sample", new ib.h(0, 1, "is_sample", "INTEGER", null, true));
                linkedHashMap3.put("parent_id", new ib.h(0, 1, "parent_id", "TEXT", null, false));
                linkedHashMap3.put("parent_type", new ib.h(0, 1, "parent_type", "TEXT", null, false));
                linkedHashMap3.put("chapter_ids", new ib.h(0, 1, "chapter_ids", "TEXT", null, false));
                ib.l lVar3 = new ib.l("sample_config", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                ib.l D3 = t.D("sample_config", connection);
                if (!lVar3.equals(D3)) {
                    return new o0(false, "sample_config(io.elevenlabs.data.database.entities.reads.SampleConfigEntity).\n Expected:\n" + lVar3 + "\n Found:\n" + D3);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("voiceId", new ib.h(1, 1, "voiceId", "TEXT", null, true));
                linkedHashMap4.put("ownerId", new ib.h(0, 1, "ownerId", "TEXT", null, false));
                linkedHashMap4.put(DiagnosticsEntry.NAME_KEY, new ib.h(0, 1, DiagnosticsEntry.NAME_KEY, "TEXT", null, true));
                linkedHashMap4.put("accent", new ib.h(0, 1, "accent", "TEXT", null, true));
                linkedHashMap4.put("gender", new ib.h(0, 1, "gender", "TEXT", null, true));
                linkedHashMap4.put("age", new ib.h(0, 1, "age", "TEXT", null, true));
                linkedHashMap4.put("descriptive", new ib.h(0, 1, "descriptive", "TEXT", null, true));
                linkedHashMap4.put("useCase", new ib.h(0, 1, "useCase", "TEXT", null, true));
                linkedHashMap4.put("category", new ib.h(0, 1, "category", "TEXT", null, true));
                linkedHashMap4.put("fromVoiceLibrary", new ib.h(0, 1, "fromVoiceLibrary", "INTEGER", null, true));
                linkedHashMap4.put("subtitle", new ib.h(0, 1, "subtitle", "TEXT", null, false));
                linkedHashMap4.put("description", new ib.h(0, 1, "description", "TEXT", null, false));
                linkedHashMap4.put("previewUrl", new ib.h(0, 1, "previewUrl", "TEXT", null, false));
                linkedHashMap4.put("imageUrl", new ib.h(0, 1, "imageUrl", "TEXT", null, false));
                linkedHashMap4.put("favoritedAtUnix", new ib.h(0, 1, "favoritedAtUnix", "INTEGER", null, false));
                linkedHashMap4.put("createdAtUnix", new ib.h(0, 1, "createdAtUnix", "INTEGER", null, false));
                ib.l lVar4 = new ib.l("voices", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                ib.l D4 = t.D("voices", connection);
                if (!lVar4.equals(D4)) {
                    return new o0(false, "voices(io.elevenlabs.data.database.entities.voices.VoiceEntity).\n Expected:\n" + lVar4 + "\n Found:\n" + D4);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("voiceId", new ib.h(1, 1, "voiceId", "TEXT", null, true));
                linkedHashMap5.put("lastUsedAtUnixMillis", new ib.h(0, 1, "lastUsedAtUnixMillis", "INTEGER", null, true));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new j("voices", "CASCADE", "NO ACTION", f.H("voiceId"), f.H("voiceId")));
                ib.l lVar5 = new ib.l("recent_voices", linkedHashMap5, linkedHashSet, new LinkedHashSet());
                ib.l D5 = t.D("recent_voices", connection);
                if (!lVar5.equals(D5)) {
                    return new o0(false, "recent_voices(io.elevenlabs.data.database.entities.voices.RecentVoiceEntity).\n Expected:\n" + lVar5 + "\n Found:\n" + D5);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("id", new ib.h(1, 1, "id", "TEXT", null, true));
                linkedHashMap6.put("title", new ib.h(0, 1, "title", "TEXT", null, true));
                linkedHashMap6.put("subtitle", new ib.h(0, 1, "subtitle", "TEXT", null, false));
                linkedHashMap6.put("has_unread", new ib.h(0, 1, "has_unread", "INTEGER", null, true));
                linkedHashMap6.put("description", new ib.h(0, 1, "description", "TEXT", null, false));
                linkedHashMap6.put("image_url", new ib.h(0, 1, "image_url", "TEXT", null, false));
                linkedHashMap6.put("last_opened_at_unix", new ib.h(0, 1, "last_opened_at_unix", "INTEGER", null, false));
                linkedHashMap6.put("updated_at_unix", new ib.h(0, 1, "updated_at_unix", "INTEGER", null, false));
                linkedHashMap6.put("category", new ib.h(0, 1, "category", "TEXT", null, false));
                linkedHashMap6.put("item_count", new ib.h(0, 1, "item_count", "INTEGER", null, false));
                linkedHashMap6.put("is_owner", new ib.h(0, 1, "is_owner", "INTEGER", "NULL", false));
                linkedHashMap6.put(ParameterNames.ICON, new ib.h(0, 1, ParameterNames.ICON, "TEXT", "NULL", false));
                ib.l lVar6 = new ib.l("collections", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
                ib.l D6 = t.D("collections", connection);
                if (!lVar6.equals(D6)) {
                    return new o0(false, "collections(io.elevenlabs.data.database.entities.collections.CollectionEntity).\n Expected:\n" + lVar6 + "\n Found:\n" + D6);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("id", new ib.h(1, 1, "id", "TEXT", null, true));
                linkedHashMap7.put("read_id", new ib.h(0, 1, "read_id", "TEXT", null, true));
                linkedHashMap7.put("start_offset_inclusive", new ib.h(0, 1, "start_offset_inclusive", "INTEGER", null, true));
                linkedHashMap7.put("end_offset_exclusive", new ib.h(0, 1, "end_offset_exclusive", "INTEGER", null, true));
                linkedHashMap7.put(ParameterNames.TEXT, new ib.h(0, 1, ParameterNames.TEXT, "TEXT", null, true));
                linkedHashMap7.put("created_at_unix", new ib.h(0, 1, "created_at_unix", "INTEGER", null, true));
                linkedHashMap7.put("updated_at_unix", new ib.h(0, 1, "updated_at_unix", "INTEGER", null, true));
                linkedHashMap7.put("note", new ib.h(0, 1, "note", "TEXT", null, false));
                linkedHashMap7.put("sync_state", new ib.h(0, 1, "sync_state", "TEXT", null, true));
                linkedHashMap7.put("created_id", new ib.h(0, 1, "created_id", "TEXT", null, false));
                linkedHashMap7.put("chapter_index", new ib.h(0, 1, "chapter_index", "INTEGER", null, false));
                linkedHashMap7.put("start_time_seconds", new ib.h(0, 1, "start_time_seconds", "REAL", null, false));
                linkedHashMap7.put("end_time_seconds", new ib.h(0, 1, "end_time_seconds", "REAL", null, false));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                linkedHashSet3.add(new k(f.H("read_id"), f.H("ASC"), false, "index_bookmarks_read_id"));
                ib.l lVar7 = new ib.l("bookmarks", linkedHashMap7, linkedHashSet2, linkedHashSet3);
                ib.l D7 = t.D("bookmarks", connection);
                if (!lVar7.equals(D7)) {
                    return new o0(false, "bookmarks(io.elevenlabs.data.database.entities.bookmarks.BookmarkEntity).\n Expected:\n" + lVar7 + "\n Found:\n" + D7);
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("id", new ib.h(1, 1, "id", "INTEGER", null, true));
                linkedHashMap8.put("read_id", new ib.h(0, 1, "read_id", "TEXT", null, true));
                linkedHashMap8.put("voice_id", new ib.h(0, 1, "voice_id", "TEXT", null, true));
                linkedHashMap8.put("type", new ib.h(0, 1, "type", "TEXT", "'TTS'", true));
                linkedHashMap8.put("total_char_count", new ib.h(0, 1, "total_char_count", "INTEGER", null, true));
                linkedHashMap8.put("created_at_unix", new ib.h(0, 1, "created_at_unix", "INTEGER", null, true));
                linkedHashMap8.put("updated_at_unix", new ib.h(0, 1, "updated_at_unix", "INTEGER", null, true));
                linkedHashMap8.put("status", new ib.h(0, 1, "status", "TEXT", null, true));
                linkedHashMap8.put("progress", new ib.h(0, 1, "progress", "INTEGER", null, true));
                linkedHashMap8.put("cached_manifest_urls", new ib.h(0, 1, "cached_manifest_urls", "TEXT", "NULL", false));
                linkedHashMap8.put("drm_key_set_ids", new ib.h(0, 1, "drm_key_set_ids", "TEXT", "NULL", false));
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new k(f.H("read_id"), f.H("ASC"), false, "index_offline_read_read_id"));
                linkedHashSet5.add(new k(f.H("voice_id"), f.H("ASC"), false, "index_offline_read_voice_id"));
                ib.l lVar8 = new ib.l("offline_read", linkedHashMap8, linkedHashSet4, linkedHashSet5);
                ib.l D8 = t.D("offline_read", connection);
                if (!lVar8.equals(D8)) {
                    return new o0(false, "offline_read(io.elevenlabs.data.database.entities.offline.OfflineReadEntity).\n Expected:\n" + lVar8 + "\n Found:\n" + D8);
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put(OfflineReadsDownloadWorker.KEY_OFFLINE_READ_ID, new ib.h(1, 1, OfflineReadsDownloadWorker.KEY_OFFLINE_READ_ID, "INTEGER", null, true));
                linkedHashMap9.put("read_id", new ib.h(0, 1, "read_id", "TEXT", null, true));
                linkedHashMap9.put("chapter_index", new ib.h(2, 1, "chapter_index", "INTEGER", null, true));
                linkedHashMap9.put("file_number", new ib.h(0, 1, "file_number", "TEXT", null, false));
                linkedHashMap9.put("status", new ib.h(0, 1, "status", "TEXT", null, true));
                linkedHashMap9.put("progress", new ib.h(0, 1, "progress", "INTEGER", null, true));
                linkedHashMap9.put("cached_manifest_url", new ib.h(0, 1, "cached_manifest_url", "TEXT", null, false));
                linkedHashMap9.put("drm_key_set_id", new ib.h(0, 1, "drm_key_set_id", "TEXT", null, false));
                linkedHashMap9.put("created_at_unix", new ib.h(0, 1, "created_at_unix", "INTEGER", null, true));
                linkedHashMap9.put("expires_at_unix", new ib.h(0, 1, "expires_at_unix", "INTEGER", null, true));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new j("offline_read", "CASCADE", "NO ACTION", f.H(OfflineReadsDownloadWorker.KEY_OFFLINE_READ_ID), f.H("id")));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new k(f.H("read_id"), f.H("ASC"), false, "index_offline_chapter_read_id"));
                ib.l lVar9 = new ib.l("offline_chapter", linkedHashMap9, linkedHashSet6, linkedHashSet7);
                ib.l D9 = t.D("offline_chapter", connection);
                if (!lVar9.equals(D9)) {
                    return new o0(false, "offline_chapter(io.elevenlabs.data.database.entities.offline.OfflineChapterEntity).\n Expected:\n" + lVar9 + "\n Found:\n" + D9);
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put("read_id", new ib.h(1, 1, "read_id", "TEXT", null, true));
                linkedHashMap10.put("position", new ib.h(0, 1, "position", "INTEGER", null, true));
                ib.l lVar10 = new ib.l("persistent_player_queue", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
                ib.l D10 = t.D("persistent_player_queue", connection);
                if (!lVar10.equals(D10)) {
                    return new o0(false, "persistent_player_queue(io.elevenlabs.data.database.entities.player.PersistentPlayerQueueEntity).\n Expected:\n" + lVar10 + "\n Found:\n" + D10);
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                linkedHashMap11.put("id", new ib.h(1, 1, "id", "TEXT", null, true));
                linkedHashMap11.put("read_id", new ib.h(0, 1, "read_id", "TEXT", null, true));
                linkedHashMap11.put("audio_file_number", new ib.h(0, 1, "audio_file_number", "TEXT", null, false));
                linkedHashMap11.put("start_seconds", new ib.h(0, 1, "start_seconds", "REAL", null, true));
                linkedHashMap11.put("end_seconds", new ib.h(0, 1, "end_seconds", "REAL", null, true));
                linkedHashMap11.put("start_char_offset", new ib.h(0, 1, "start_char_offset", "INTEGER", null, false));
                linkedHashMap11.put("end_char_offset", new ib.h(0, 1, "end_char_offset", "INTEGER", null, false));
                linkedHashMap11.put("listened_at_unix", new ib.h(0, 1, "listened_at_unix", "INTEGER", null, true));
                linkedHashMap11.put("playback_speed", new ib.h(0, 1, "playback_speed", "REAL", null, true));
                linkedHashMap11.put("real_time_duration_seconds", new ib.h(0, 1, "real_time_duration_seconds", "REAL", null, true));
                linkedHashMap11.put("type", new ib.h(0, 1, "type", "TEXT", null, true));
                linkedHashMap11.put("playback_source", new ib.h(0, 1, "playback_source", "TEXT", null, false));
                linkedHashMap11.put("device_online", new ib.h(0, 1, "device_online", "INTEGER", null, false));
                linkedHashMap11.put("voice_id", new ib.h(0, 1, "voice_id", "TEXT", null, false));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new k(f.H("read_id"), f.H("ASC"), false, "index_consumption_spans_read_id"));
                ib.l lVar11 = new ib.l("consumption_spans", linkedHashMap11, linkedHashSet8, linkedHashSet9);
                ib.l D11 = t.D("consumption_spans", connection);
                if (!lVar11.equals(D11)) {
                    return new o0(false, "consumption_spans(io.elevenlabs.data.database.entities.consumption.ConsumptionSpanEntity).\n Expected:\n" + lVar11 + "\n Found:\n" + D11);
                }
                return new o0(true, null);
            }
        };
    }

    @Override // androidx.room.j0
    public Set<d> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.j0
    public Map<d, List<d>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f0 f0Var = e0.f20562a;
        linkedHashMap.put(f0Var.b(ReadsDao.class), ReadsDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(f0Var.b(VoicesDao.class), VoicesDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(f0Var.b(RecentVoicesDao.class), RecentVoicesDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(f0Var.b(CollectionsDao.class), CollectionsDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(f0Var.b(BookmarksDao.class), BookmarksDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(f0Var.b(OfflineReadsDao.class), OfflineReadsDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(f0Var.b(PersistentPlayerQueueDao.class), PersistentPlayerQueueDao_Impl.INSTANCE.getRequiredConverters());
        linkedHashMap.put(f0Var.b(ConsumptionSpanDao.class), ConsumptionSpanDao_Impl.INSTANCE.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // io.elevenlabs.di.AppDatabase
    public OfflineReadsDao offlineReadsDao() {
        return (OfflineReadsDao) this._offlineReadsDao.getValue();
    }

    @Override // io.elevenlabs.di.AppDatabase
    public PersistentPlayerQueueDao persistentPlayerQueueDao() {
        return (PersistentPlayerQueueDao) this._persistentPlayerQueueDao.getValue();
    }

    @Override // io.elevenlabs.di.AppDatabase
    public ReadsDao readsDao() {
        return (ReadsDao) this._readsDao.getValue();
    }

    @Override // io.elevenlabs.di.AppDatabase
    public RecentVoicesDao recentVoicesDao() {
        return (RecentVoicesDao) this._recentVoicesDao.getValue();
    }

    @Override // io.elevenlabs.di.AppDatabase
    public VoicesDao voicesDao() {
        return (VoicesDao) this._voicesDao.getValue();
    }
}
