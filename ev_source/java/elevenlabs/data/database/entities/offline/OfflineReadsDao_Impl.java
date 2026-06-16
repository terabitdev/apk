package io.elevenlabs.data.database.entities.offline;

import a2.t;
import ae.l;
import android.gov.nist.core.Separators;
import androidx.room.j0;
import androidx.room.m0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import g1.r;
import g1.x0;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import io.elevenlabs.data.database.entities.reads.ReadChapterEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.SampleConfigEntity;
import io.elevenlabs.data.database.entities.reads.SyncState;
import io.elevenlabs.data.worker.OfflineReadsDownloadWorker;
import io.elevenlabs.di.ListTypeConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 q2\u00020\u0001:\u0001qB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\nJ\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\nJ\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001d\u0010\u0015J\u001a\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000b0\u0016H\u0016¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b'\u0010\u0015J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0013\u001a\u00020\bH\u0096@¢\u0006\u0004\b(\u0010\u0015J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010)\u001a\u00020\bH\u0096@¢\u0006\u0004\b*\u0010\u0015J(\u00100\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0096@¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b2\u0010!J\u0010\u00103\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b3\u0010&J(\u00105\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010-\u001a\u0002042\u0006\u0010/\u001a\u00020.H\u0096@¢\u0006\u0004\b5\u00106J0\u00108\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u00107\u001a\u00020.2\u0006\u0010-\u001a\u0002042\u0006\u0010/\u001a\u00020.H\u0096@¢\u0006\u0004\b8\u00109J(\u0010;\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u00107\u001a\u00020.2\u0006\u0010:\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b;\u0010<J(\u0010>\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u00107\u001a\u00020.2\u0006\u0010=\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b>\u0010<J \u0010?\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u00107\u001a\u00020.H\u0096@¢\u0006\u0004\b?\u0010@J \u0010A\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u00107\u001a\u00020.H\u0096@¢\u0006\u0004\bA\u0010@J8\u0010C\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u00107\u001a\u00020.2\u0006\u0010-\u001a\u0002042\u0006\u0010/\u001a\u00020.2\u0006\u0010B\u001a\u00020\bH\u0096@¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020,H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u001e2\u0006\u0010F\u001a\u000204H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020E2\u0006\u0010F\u001a\u00020\u001eH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020,2\u0006\u0010F\u001a\u00020\u001eH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u0002042\u0006\u0010F\u001a\u00020\u001eH\u0002¢\u0006\u0004\bQ\u0010RJ+\u0010X\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020S2\u0012\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0V0UH\u0002¢\u0006\u0004\bX\u0010YJ1\u0010\\\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020S2\u0018\u0010W\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0V0ZH\u0002¢\u0006\u0004\b\\\u0010]J-\u0010^\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020S2\u0014\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00060ZH\u0002¢\u0006\u0004\b^\u0010]J1\u0010_\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020S2\u0018\u0010W\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0V0ZH\u0002¢\u0006\u0004\b_\u0010]J'\u0010a\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020S2\u000e\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010`0UH\u0002¢\u0006\u0004\ba\u0010YJ\u0017\u0010c\u001a\u00020b2\u0006\u0010F\u001a\u00020\u001eH\u0002¢\u0006\u0004\bc\u0010dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00060f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\f0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010hR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00060j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao_Impl;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "Landroidx/room/j0;", "__db", "<init>", "(Landroidx/room/j0;)V", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "offlineRead", "", "insert", "(Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;Lwn/c;)Ljava/lang/Object;", "", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "chapters", "Lsn/z;", "insertChapters", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "delete", "update", "offlineReadId", "recomputeReadAggregate", "(JLwn/c;)Ljava/lang/Object;", "Lir/i;", "observeAllOfflineReads", "()Lir/i;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadWithChapters;", "observeAllOfflineReadsWithChapters", "getAllOfflineReads", "()Ljava/util/List;", "getOfflineReadById", "", "readId", "getOfflineReadByReadId", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;", "getReadsWithOfflineEntries", "", "hasOfflineReads", "(Lwn/c;)Ljava/lang/Object;", "getChaptersToDownload", "getChaptersForRead", "nowMillis", "getOfflineReadIdsWithExpiredChapters", "id", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;", "status", "", "progress", "updateStatusAndProgress", "(JLio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;ILwn/c;)Ljava/lang/Object;", "deleteOfflineReads", "deleteAll", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;", "resetAllChapterStatuses", "(JLio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;ILwn/c;)Ljava/lang/Object;", "chapterIndex", "updateChapterStatus", "(JILio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;ILwn/c;)Ljava/lang/Object;", "url", "updateChapterManifestUrl", "(JILjava/lang/String;Lwn/c;)Ljava/lang/Object;", "keySetId", "updateChapterDrmKeySetId", "deleteChapter", "(JILwn/c;)Ljava/lang/Object;", "markChapterExpired", "expiresAtUnix", "updateChapterStatusAndExpiry", "(JILio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;IJLwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Type;", "_value", "__Type_enumToString", "(Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Type;)Ljava/lang/String;", "__Status_enumToString", "(Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;)Ljava/lang/String;", "__Status_enumToString_1", "(Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;)Ljava/lang/String;", "__Type_stringToEnum", "(Ljava/lang/String;)Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Type;", "__Status_stringToEnum", "(Ljava/lang/String;)Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;", "__Status_stringToEnum_1", "(Ljava/lang/String;)Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;", "Lmb/a;", "_connection", "Lg1/r;", "", "_map", "__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity", "(Lmb/a;Lg1/r;)V", "Lg1/e;", "Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity", "(Lmb/a;Lg1/e;)V", "__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity", "__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity_1", "Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "__SyncState_stringToEnum", "(Ljava/lang/String;)Lio/elevenlabs/data/database/entities/reads/SyncState;", "Landroidx/room/j0;", "Landroidx/room/e;", "__insertAdapterOfOfflineReadEntity", "Landroidx/room/e;", "__insertAdapterOfOfflineChapterEntity", "Landroidx/room/d;", "__deleteAdapterOfOfflineReadEntity", "Landroidx/room/d;", "__updateAdapterOfOfflineReadEntity", "Lio/elevenlabs/di/ListTypeConverters;", "__listTypeConverters", "Lio/elevenlabs/di/ListTypeConverters;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineReadsDao_Impl implements OfflineReadsDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final j0 __db;
    private final androidx.room.d __deleteAdapterOfOfflineReadEntity;
    private final androidx.room.e __insertAdapterOfOfflineChapterEntity;
    private final androidx.room.e __insertAdapterOfOfflineReadEntity;
    private final ListTypeConverters __listTypeConverters;
    private final androidx.room.d __updateAdapterOfOfflineReadEntity;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/offline/OfflineReadsDao_Impl$1", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends androidx.room.e {
        public AnonymousClass1() {
        }

        @Override // androidx.room.e
        public void bind(mb.c statement, OfflineReadEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.c(1, entity.getId());
            statement.s(2, entity.getReadId());
            statement.s(3, entity.getVoiceId());
            statement.s(4, OfflineReadsDao_Impl.this.__Type_enumToString(entity.getType()));
            statement.c(5, entity.getTotalCharCount());
            statement.c(6, entity.getCreatedAtUnix());
            statement.c(7, entity.getUpdatedAtUnix());
            statement.s(8, OfflineReadsDao_Impl.this.__Status_enumToString(entity.getStatus()));
            statement.c(9, entity.getProgress());
            String cachedManifestUrls = entity.getCachedManifestUrls();
            if (cachedManifestUrls == null) {
                statement.f(10);
            } else {
                statement.s(10, cachedManifestUrls);
            }
            String drmKeySetIds = entity.getDrmKeySetIds();
            if (drmKeySetIds == null) {
                statement.f(11);
            } else {
                statement.s(11, drmKeySetIds);
            }
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT OR REPLACE INTO `offline_read` (`id`,`read_id`,`voice_id`,`type`,`total_char_count`,`created_at_unix`,`updated_at_unix`,`status`,`progress`,`cached_manifest_urls`,`drm_key_set_ids`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/offline/OfflineReadsDao_Impl$2", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl$2 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends androidx.room.e {
        public AnonymousClass2() {
        }

        @Override // androidx.room.e
        public void bind(mb.c statement, OfflineChapterEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.c(1, entity.getOfflineReadId());
            statement.s(2, entity.getReadId());
            statement.c(3, entity.getChapterIndex());
            String fileNumber = entity.getFileNumber();
            if (fileNumber == null) {
                statement.f(4);
            } else {
                statement.s(4, fileNumber);
            }
            statement.s(5, OfflineReadsDao_Impl.this.__Status_enumToString_1(entity.getStatus()));
            statement.c(6, entity.getProgress());
            String cachedManifestUrl = entity.getCachedManifestUrl();
            if (cachedManifestUrl == null) {
                statement.f(7);
            } else {
                statement.s(7, cachedManifestUrl);
            }
            String drmKeySetId = entity.getDrmKeySetId();
            if (drmKeySetId == null) {
                statement.f(8);
            } else {
                statement.s(8, drmKeySetId);
            }
            statement.c(9, entity.getCreatedAtUnix());
            statement.c(10, entity.getExpiresAtUnix());
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT OR REPLACE INTO `offline_chapter` (`offline_read_id`,`read_id`,`chapter_index`,`file_number`,`status`,`progress`,`cached_manifest_url`,`drm_key_set_id`,`created_at_unix`,`expires_at_unix`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/offline/OfflineReadsDao_Impl$3", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl$3 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends androidx.room.d {
        @Override // androidx.room.d
        public void bind(mb.c statement, OfflineReadEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.c(1, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "DELETE FROM `offline_read` WHERE `id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/offline/OfflineReadsDao_Impl$4", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl$4 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends androidx.room.d {
        public AnonymousClass4() {
        }

        @Override // androidx.room.d
        public void bind(mb.c statement, OfflineReadEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.c(1, entity.getId());
            statement.s(2, entity.getReadId());
            statement.s(3, entity.getVoiceId());
            statement.s(4, OfflineReadsDao_Impl.this.__Type_enumToString(entity.getType()));
            statement.c(5, entity.getTotalCharCount());
            statement.c(6, entity.getCreatedAtUnix());
            statement.c(7, entity.getUpdatedAtUnix());
            statement.s(8, OfflineReadsDao_Impl.this.__Status_enumToString(entity.getStatus()));
            statement.c(9, entity.getProgress());
            String cachedManifestUrls = entity.getCachedManifestUrls();
            if (cachedManifestUrls == null) {
                statement.f(10);
            } else {
                statement.s(10, cachedManifestUrls);
            }
            String drmKeySetIds = entity.getDrmKeySetIds();
            if (drmKeySetIds == null) {
                statement.f(11);
            } else {
                statement.s(11, drmKeySetIds);
            }
            statement.c(12, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `offline_read` SET `id` = ?,`read_id` = ?,`voice_id` = ?,`type` = ?,`total_char_count` = ?,`created_at_unix` = ?,`updated_at_unix` = ?,`status` = ?,`progress` = ?,`cached_manifest_urls` = ?,`drm_key_set_ids` = ? WHERE `id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OfflineReadEntity.Type.values().length];
            try {
                iArr[OfflineReadEntity.Type.TTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineReadEntity.Type.MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OfflineReadEntity.Status.values().length];
            try {
                iArr2[OfflineReadEntity.Status.DOWNLOADING_HTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OfflineReadEntity.Status.CONVERTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OfflineReadEntity.Status.DOWNLOADING_CHUNKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OfflineReadEntity.Status.DOWNLOADING_MEDIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OfflineReadEntity.Status.READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OfflineReadEntity.Status.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OfflineChapterEntity.Status.values().length];
            try {
                iArr3[OfflineChapterEntity.Status.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OfflineChapterEntity.Status.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OfflineChapterEntity.Status.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OfflineChapterEntity.Status.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OfflineChapterEntity.Status.EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public OfflineReadsDao_Impl(j0 j0Var) {
        j0Var.getClass();
        this.__listTypeConverters = new ListTypeConverters();
        this.__db = j0Var;
        this.__insertAdapterOfOfflineReadEntity = new androidx.room.e() { // from class: io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl.1
            public AnonymousClass1() {
            }

            @Override // androidx.room.e
            public void bind(mb.c statement, OfflineReadEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.c(1, entity.getId());
                statement.s(2, entity.getReadId());
                statement.s(3, entity.getVoiceId());
                statement.s(4, OfflineReadsDao_Impl.this.__Type_enumToString(entity.getType()));
                statement.c(5, entity.getTotalCharCount());
                statement.c(6, entity.getCreatedAtUnix());
                statement.c(7, entity.getUpdatedAtUnix());
                statement.s(8, OfflineReadsDao_Impl.this.__Status_enumToString(entity.getStatus()));
                statement.c(9, entity.getProgress());
                String cachedManifestUrls = entity.getCachedManifestUrls();
                if (cachedManifestUrls == null) {
                    statement.f(10);
                } else {
                    statement.s(10, cachedManifestUrls);
                }
                String drmKeySetIds = entity.getDrmKeySetIds();
                if (drmKeySetIds == null) {
                    statement.f(11);
                } else {
                    statement.s(11, drmKeySetIds);
                }
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT OR REPLACE INTO `offline_read` (`id`,`read_id`,`voice_id`,`type`,`total_char_count`,`created_at_unix`,`updated_at_unix`,`status`,`progress`,`cached_manifest_urls`,`drm_key_set_ids`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__insertAdapterOfOfflineChapterEntity = new androidx.room.e() { // from class: io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl.2
            public AnonymousClass2() {
            }

            @Override // androidx.room.e
            public void bind(mb.c statement, OfflineChapterEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.c(1, entity.getOfflineReadId());
                statement.s(2, entity.getReadId());
                statement.c(3, entity.getChapterIndex());
                String fileNumber = entity.getFileNumber();
                if (fileNumber == null) {
                    statement.f(4);
                } else {
                    statement.s(4, fileNumber);
                }
                statement.s(5, OfflineReadsDao_Impl.this.__Status_enumToString_1(entity.getStatus()));
                statement.c(6, entity.getProgress());
                String cachedManifestUrl = entity.getCachedManifestUrl();
                if (cachedManifestUrl == null) {
                    statement.f(7);
                } else {
                    statement.s(7, cachedManifestUrl);
                }
                String drmKeySetId = entity.getDrmKeySetId();
                if (drmKeySetId == null) {
                    statement.f(8);
                } else {
                    statement.s(8, drmKeySetId);
                }
                statement.c(9, entity.getCreatedAtUnix());
                statement.c(10, entity.getExpiresAtUnix());
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT OR REPLACE INTO `offline_chapter` (`offline_read_id`,`read_id`,`chapter_index`,`file_number`,`status`,`progress`,`cached_manifest_url`,`drm_key_set_id`,`created_at_unix`,`expires_at_unix`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__deleteAdapterOfOfflineReadEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl.3
            @Override // androidx.room.d
            public void bind(mb.c statement, OfflineReadEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.c(1, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "DELETE FROM `offline_read` WHERE `id` = ?";
            }
        };
        this.__updateAdapterOfOfflineReadEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.offline.OfflineReadsDao_Impl.4
            public AnonymousClass4() {
            }

            @Override // androidx.room.d
            public void bind(mb.c statement, OfflineReadEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.c(1, entity.getId());
                statement.s(2, entity.getReadId());
                statement.s(3, entity.getVoiceId());
                statement.s(4, OfflineReadsDao_Impl.this.__Type_enumToString(entity.getType()));
                statement.c(5, entity.getTotalCharCount());
                statement.c(6, entity.getCreatedAtUnix());
                statement.c(7, entity.getUpdatedAtUnix());
                statement.s(8, OfflineReadsDao_Impl.this.__Status_enumToString(entity.getStatus()));
                statement.c(9, entity.getProgress());
                String cachedManifestUrls = entity.getCachedManifestUrls();
                if (cachedManifestUrls == null) {
                    statement.f(10);
                } else {
                    statement.s(10, cachedManifestUrls);
                }
                String drmKeySetIds = entity.getDrmKeySetIds();
                if (drmKeySetIds == null) {
                    statement.f(11);
                } else {
                    statement.s(11, drmKeySetIds);
                }
                statement.c(12, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `offline_read` SET `id` = ?,`read_id` = ?,`voice_id` = ?,`type` = ?,`total_char_count` = ?,`created_at_unix` = ?,`updated_at_unix` = ?,`status` = ?,`progress` = ?,`cached_manifest_urls` = ?,`drm_key_set_ids` = ? WHERE `id` = ?";
            }
        };
    }

    public final String __Status_enumToString(OfflineReadEntity.Status _value) {
        switch (WhenMappings.$EnumSwitchMapping$1[_value.ordinal()]) {
            case 1:
                return "DOWNLOADING_HTML";
            case 2:
                return "CONVERTING";
            case 3:
                return "DOWNLOADING_CHUNKS";
            case 4:
                return "DOWNLOADING_MEDIA";
            case 5:
                return "READY";
            case 6:
                return "ERROR";
            default:
                c6.p();
                return null;
        }
    }

    public final String __Status_enumToString_1(OfflineChapterEntity.Status _value) {
        int i10 = WhenMappings.$EnumSwitchMapping$2[_value.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return "EXPIRED";
                        }
                        c6.p();
                        return null;
                    }
                    return "ERROR";
                }
                return "READY";
            }
            return "DOWNLOADING";
        }
        return "PENDING";
    }

    private final OfflineReadEntity.Status __Status_stringToEnum(String _value) {
        switch (_value.hashCode()) {
            case -2063204993:
                if (_value.equals("DOWNLOADING_MEDIA")) {
                    return OfflineReadEntity.Status.DOWNLOADING_MEDIA;
                }
                break;
            case -1766611633:
                if (_value.equals("CONVERTING")) {
                    return OfflineReadEntity.Status.CONVERTING;
                }
                break;
            case -205236592:
                if (_value.equals("DOWNLOADING_HTML")) {
                    return OfflineReadEntity.Status.DOWNLOADING_HTML;
                }
                break;
            case 66247144:
                if (_value.equals("ERROR")) {
                    return OfflineReadEntity.Status.ERROR;
                }
                break;
            case 77848963:
                if (_value.equals("READY")) {
                    return OfflineReadEntity.Status.READY;
                }
                break;
            case 182145355:
                if (_value.equals("DOWNLOADING_CHUNKS")) {
                    return OfflineReadEntity.Status.DOWNLOADING_CHUNKS;
                }
                break;
        }
        c6.t("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    private final OfflineChapterEntity.Status __Status_stringToEnum_1(String _value) {
        switch (_value.hashCode()) {
            case -591252731:
                if (_value.equals("EXPIRED")) {
                    return OfflineChapterEntity.Status.EXPIRED;
                }
                break;
            case 35394935:
                if (_value.equals("PENDING")) {
                    return OfflineChapterEntity.Status.PENDING;
                }
                break;
            case 66247144:
                if (_value.equals("ERROR")) {
                    return OfflineChapterEntity.Status.ERROR;
                }
                break;
            case 77848963:
                if (_value.equals("READY")) {
                    return OfflineChapterEntity.Status.READY;
                }
                break;
            case 941831738:
                if (_value.equals("DOWNLOADING")) {
                    return OfflineChapterEntity.Status.DOWNLOADING;
                }
                break;
        }
        c6.t("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    private final SyncState __SyncState_stringToEnum(String _value) {
        int hashCode = _value.hashCode();
        if (hashCode != -2111333005) {
            if (hashCode != -1855995384) {
                if (hashCode == 483552411 && _value.equals("UPDATED")) {
                    return SyncState.UPDATED;
                }
            } else if (_value.equals("PENDING_UPDATE_PUSH")) {
                return SyncState.PENDING_UPDATE_PUSH;
            }
        } else if (_value.equals("PENDING_DELETE")) {
            return SyncState.PENDING_DELETE;
        }
        c6.t("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    public final String __Type_enumToString(OfflineReadEntity.Type _value) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[_value.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return "MEDIA";
            }
            c6.p();
            return null;
        }
        return "TTS";
    }

    private final OfflineReadEntity.Type __Type_stringToEnum(String _value) {
        if (m.c(_value, "TTS")) {
            return OfflineReadEntity.Type.TTS;
        }
        if (m.c(_value, "MEDIA")) {
            return OfflineReadEntity.Type.MEDIA;
        }
        c6.t(defpackage.f.i("Can't convert value to enum, unknown value: ", _value));
        return null;
    }

    private final void __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(mb.a _connection, r _map) {
        String Y;
        String Y2;
        if (_map.d()) {
            return;
        }
        if (_map.h() > 999) {
            x7.e.O(_map, true, new b(this, _connection, 1));
            return;
        }
        StringBuilder p10 = defpackage.f.p("SELECT `offline_read_id`,`read_id`,`chapter_index`,`file_number`,`status`,`progress`,`cached_manifest_url`,`drm_key_set_id`,`created_at_unix`,`expires_at_unix` FROM `offline_chapter` WHERE `offline_read_id` IN (");
        m0.j(_map.h(), p10);
        p10.append(Separators.RPAREN);
        mb.c l02 = _connection.l0(p10.toString());
        int h10 = _map.h();
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 0; i12 < h10; i12++) {
            l02.c(i11, _map.e(i12));
            i11++;
        }
        try {
            int E = l.E(l02, OfflineReadsDownloadWorker.KEY_OFFLINE_READ_ID);
            if (E == -1) {
                return;
            }
            while (l02.h0()) {
                List list = (List) _map.b(l02.getLong(E));
                if (list != null) {
                    long j4 = l02.getLong(i10);
                    String Y3 = l02.Y(1);
                    int i13 = (int) l02.getLong(2);
                    String str = null;
                    if (l02.isNull(3)) {
                        Y = null;
                    } else {
                        Y = l02.Y(3);
                    }
                    OfflineChapterEntity.Status __Status_stringToEnum_1 = __Status_stringToEnum_1(l02.Y(4));
                    int i14 = (int) l02.getLong(5);
                    if (l02.isNull(6)) {
                        Y2 = null;
                    } else {
                        Y2 = l02.Y(6);
                    }
                    if (!l02.isNull(7)) {
                        str = l02.Y(7);
                    }
                    list.add(new OfflineChapterEntity(j4, Y3, i13, Y, __Status_stringToEnum_1, i14, Y2, str, l02.getLong(8), l02.getLong(9)));
                    i10 = 0;
                }
            }
        } finally {
            l02.close();
        }
    }

    public static final z __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0(OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar, r rVar) {
        rVar.getClass();
        offlineReadsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, rVar);
        return z.f31622a;
    }

    private final void __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity_1(mb.a _connection, g1.e _map) {
        String Y;
        String Y2;
        g1.b bVar = (g1.b) _map.keySet();
        g1.e eVar = bVar.f10232a;
        if (eVar.isEmpty()) {
            return;
        }
        if (_map.f10374c > 999) {
            x7.e.N(_map, true, new b(this, _connection, 3));
            return;
        }
        StringBuilder p10 = defpackage.f.p("SELECT `offline_read_id`,`read_id`,`chapter_index`,`file_number`,`status`,`progress`,`cached_manifest_url`,`drm_key_set_id`,`created_at_unix`,`expires_at_unix` FROM `offline_chapter` WHERE `read_id` IN (");
        m0.j(eVar.f10374c, p10);
        p10.append(Separators.RPAREN);
        mb.c l02 = _connection.l0(p10.toString());
        Iterator it = bVar.iterator();
        int i10 = 1;
        while (true) {
            g1.a aVar = (g1.a) it;
            if (aVar.hasNext()) {
                l02.s(i10, (String) aVar.next());
                i10++;
            } else {
                try {
                    break;
                } finally {
                    l02.close();
                }
            }
        }
        int E = l.E(l02, "read_id");
        if (E == -1) {
            return;
        }
        while (l02.h0()) {
            List list = (List) _map.get(l02.Y(E));
            if (list != null) {
                long j4 = l02.getLong(0);
                String Y3 = l02.Y(1);
                int i11 = (int) l02.getLong(2);
                String str = null;
                if (l02.isNull(3)) {
                    Y = null;
                } else {
                    Y = l02.Y(3);
                }
                OfflineChapterEntity.Status __Status_stringToEnum_1 = __Status_stringToEnum_1(l02.Y(4));
                int i12 = (int) l02.getLong(5);
                if (l02.isNull(6)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(6);
                }
                if (!l02.isNull(7)) {
                    str = l02.Y(7);
                }
                list.add(new OfflineChapterEntity(j4, Y3, i11, Y, __Status_stringToEnum_1, i12, Y2, str, l02.getLong(8), l02.getLong(9)));
            }
        }
    }

    public static final z __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity_1$lambda$0(OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar, g1.e eVar) {
        eVar.getClass();
        offlineReadsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity_1(aVar, eVar);
        return z.f31622a;
    }

    private final void __fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(mb.a _connection, g1.e _map) {
        String Y;
        g1.b bVar = (g1.b) _map.keySet();
        g1.e eVar = bVar.f10232a;
        if (eVar.isEmpty()) {
            return;
        }
        int i10 = 0;
        if (_map.f10374c > 999) {
            x7.e.N(_map, false, new b(this, _connection, 2));
            return;
        }
        StringBuilder p10 = defpackage.f.p("SELECT `id`,`read_id`,`voice_id`,`type`,`total_char_count`,`created_at_unix`,`updated_at_unix`,`status`,`progress`,`cached_manifest_urls`,`drm_key_set_ids` FROM `offline_read` WHERE `read_id` IN (");
        m0.j(eVar.f10374c, p10);
        p10.append(Separators.RPAREN);
        mb.c l02 = _connection.l0(p10.toString());
        Iterator it = bVar.iterator();
        int i11 = 1;
        while (true) {
            g1.a aVar = (g1.a) it;
            if (aVar.hasNext()) {
                l02.s(i11, (String) aVar.next());
                i11++;
            } else {
                try {
                    break;
                } finally {
                    l02.close();
                }
            }
        }
        int E = l.E(l02, "read_id");
        if (E == -1) {
            return;
        }
        while (l02.h0()) {
            String Y2 = l02.Y(E);
            if (_map.containsKey(Y2)) {
                long j4 = l02.getLong(i10);
                String Y3 = l02.Y(1);
                String Y4 = l02.Y(2);
                OfflineReadEntity.Type __Type_stringToEnum = __Type_stringToEnum(l02.Y(3));
                long j10 = l02.getLong(4);
                long j11 = l02.getLong(5);
                long j12 = l02.getLong(6);
                OfflineReadEntity.Status __Status_stringToEnum = __Status_stringToEnum(l02.Y(7));
                int i12 = (int) l02.getLong(8);
                String str = null;
                if (l02.isNull(9)) {
                    Y = null;
                } else {
                    Y = l02.Y(9);
                }
                if (!l02.isNull(10)) {
                    str = l02.Y(10);
                }
                _map.put(Y2, new OfflineReadEntity(j4, Y3, Y4, __Type_stringToEnum, j10, j11, j12, __Status_stringToEnum, i12, Y, str));
                i10 = 0;
            }
        }
    }

    public static final z __fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0(OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar, g1.e eVar) {
        eVar.getClass();
        offlineReadsDao_Impl.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, eVar);
        return z.f31622a;
    }

    private final void __fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(mb.a _connection, g1.e _map) {
        boolean z6;
        Double valueOf;
        g1.b bVar = (g1.b) _map.keySet();
        g1.e eVar = bVar.f10232a;
        if (eVar.isEmpty()) {
            return;
        }
        if (_map.f10374c > 999) {
            x7.e.N(_map, true, new b(this, _connection, 4));
            return;
        }
        StringBuilder p10 = defpackage.f.p("SELECT `read_id`,`chapter_index`,`chapter_name`,`char_count`,`has_summary`,`word_count`,`starting_char_offset`,`duration_seconds`,`audio_file_number` FROM `reads_chapters` WHERE `read_id` IN (");
        m0.j(eVar.f10374c, p10);
        p10.append(Separators.RPAREN);
        mb.c l02 = _connection.l0(p10.toString());
        Iterator it = bVar.iterator();
        int i10 = 1;
        while (true) {
            g1.a aVar = (g1.a) it;
            if (aVar.hasNext()) {
                l02.s(i10, (String) aVar.next());
                i10++;
            } else {
                try {
                    break;
                } finally {
                    l02.close();
                }
            }
        }
        int E = l.E(l02, "read_id");
        if (E == -1) {
            return;
        }
        while (l02.h0()) {
            List list = (List) _map.get(l02.Y(E));
            if (list != null) {
                String Y = l02.Y(0);
                int i11 = (int) l02.getLong(1);
                String Y2 = l02.Y(2);
                long j4 = l02.getLong(3);
                if (((int) l02.getLong(4)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                long j10 = l02.getLong(5);
                long j11 = l02.getLong(6);
                String str = null;
                if (l02.isNull(7)) {
                    valueOf = null;
                } else {
                    valueOf = Double.valueOf(l02.getDouble(7));
                }
                if (!l02.isNull(8)) {
                    str = l02.Y(8);
                }
                list.add(new ReadChapterEntity(Y, i11, Y2, j4, z6, j10, j11, valueOf, str));
            }
        }
    }

    public static final z __fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0(OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar, g1.e eVar) {
        eVar.getClass();
        offlineReadsDao_Impl.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, eVar);
        return z.f31622a;
    }

    private final void __fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(mb.a _connection, r _map) {
        boolean z6;
        boolean z10;
        String Y;
        String Y2;
        if (_map.d()) {
            return;
        }
        if (_map.h() > 999) {
            x7.e.O(_map, false, new b(this, _connection, 0));
            return;
        }
        StringBuilder p10 = defpackage.f.p("SELECT `id`,`is_sample`,`parent_id`,`parent_type`,`chapter_ids` FROM `sample_config` WHERE `id` IN (");
        m0.j(_map.h(), p10);
        p10.append(Separators.RPAREN);
        mb.c l02 = _connection.l0(p10.toString());
        int h10 = _map.h();
        int i10 = 1;
        for (int i11 = 0; i11 < h10; i11++) {
            l02.c(i10, _map.e(i11));
            i10++;
        }
        try {
            int E = l.E(l02, "id");
            if (E == -1) {
                l02.close();
                return;
            }
            while (l02.h0()) {
                long j4 = l02.getLong(E);
                if (_map.c(j4) >= 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    long j10 = l02.getLong(0);
                    if (((int) l02.getLong(1)) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String str = null;
                    if (l02.isNull(2)) {
                        Y = null;
                    } else {
                        Y = l02.Y(2);
                    }
                    if (l02.isNull(3)) {
                        Y2 = null;
                    } else {
                        Y2 = l02.Y(3);
                    }
                    if (!l02.isNull(4)) {
                        str = l02.Y(4);
                    }
                    _map.f(j4, new SampleConfigEntity(j10, z10, Y, Y2, str));
                }
            }
        } finally {
            l02.close();
        }
    }

    public static final z __fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0(OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar, r rVar) {
        rVar.getClass();
        offlineReadsDao_Impl.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
        return z.f31622a;
    }

    public static final z delete$lambda$0(OfflineReadsDao_Impl offlineReadsDao_Impl, OfflineReadEntity offlineReadEntity, mb.a aVar) {
        aVar.getClass();
        offlineReadsDao_Impl.__deleteAdapterOfOfflineReadEntity.handle(aVar, offlineReadEntity);
        return z.f31622a;
    }

    public static final z deleteAll$lambda$0(String str, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z deleteChapter$lambda$0(String str, long j4, int i10, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.c(1, j4);
            l02.c(2, i10);
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z deleteOfflineReads$lambda$0(String str, String str2, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final List getAllOfflineReads$lambda$0(String str, OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar) {
        String Y;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "voice_id");
            int F4 = l.F(l02, "type");
            int F5 = l.F(l02, "total_char_count");
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "status");
            int F9 = l.F(l02, "progress");
            int F10 = l.F(l02, "cached_manifest_urls");
            int F11 = l.F(l02, "drm_key_set_ids");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                long j4 = l02.getLong(F);
                String Y2 = l02.Y(F2);
                String Y3 = l02.Y(F3);
                OfflineReadEntity.Type __Type_stringToEnum = offlineReadsDao_Impl.__Type_stringToEnum(l02.Y(F4));
                long j10 = l02.getLong(F5);
                long j11 = l02.getLong(F6);
                long j12 = l02.getLong(F7);
                OfflineReadEntity.Status __Status_stringToEnum = offlineReadsDao_Impl.__Status_stringToEnum(l02.Y(F8));
                int i10 = (int) l02.getLong(F9);
                String str2 = null;
                if (l02.isNull(F10)) {
                    Y = null;
                } else {
                    Y = l02.Y(F10);
                }
                if (!l02.isNull(F11)) {
                    str2 = l02.Y(F11);
                }
                arrayList.add(new OfflineReadEntity(j4, Y2, Y3, __Type_stringToEnum, j10, j11, j12, __Status_stringToEnum, i10, Y, str2));
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final List getChaptersForRead$lambda$0(String str, long j4, OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar) {
        String Y;
        String Y2;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.c(1, j4);
            int F = l.F(l02, OfflineReadsDownloadWorker.KEY_OFFLINE_READ_ID);
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "chapter_index");
            int F4 = l.F(l02, "file_number");
            int F5 = l.F(l02, "status");
            int F6 = l.F(l02, "progress");
            int F7 = l.F(l02, "cached_manifest_url");
            int F8 = l.F(l02, "drm_key_set_id");
            int F9 = l.F(l02, "created_at_unix");
            int F10 = l.F(l02, "expires_at_unix");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                long j10 = l02.getLong(F);
                String Y3 = l02.Y(F2);
                int i10 = (int) l02.getLong(F3);
                String str2 = null;
                if (l02.isNull(F4)) {
                    Y = null;
                } else {
                    Y = l02.Y(F4);
                }
                int i11 = F;
                OfflineChapterEntity.Status __Status_stringToEnum_1 = offlineReadsDao_Impl.__Status_stringToEnum_1(l02.Y(F5));
                int i12 = F2;
                int i13 = F3;
                int i14 = (int) l02.getLong(F6);
                if (l02.isNull(F7)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F7);
                }
                if (!l02.isNull(F8)) {
                    str2 = l02.Y(F8);
                }
                arrayList.add(new OfflineChapterEntity(j10, Y3, i10, Y, __Status_stringToEnum_1, i14, Y2, str2, l02.getLong(F9), l02.getLong(F10)));
                F = i11;
                F2 = i12;
                F3 = i13;
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final List getChaptersToDownload$lambda$0(String str, long j4, OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar) {
        String Y;
        String Y2;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.c(1, j4);
            int F = l.F(l02, OfflineReadsDownloadWorker.KEY_OFFLINE_READ_ID);
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "chapter_index");
            int F4 = l.F(l02, "file_number");
            int F5 = l.F(l02, "status");
            int F6 = l.F(l02, "progress");
            int F7 = l.F(l02, "cached_manifest_url");
            int F8 = l.F(l02, "drm_key_set_id");
            int F9 = l.F(l02, "created_at_unix");
            int F10 = l.F(l02, "expires_at_unix");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                long j10 = l02.getLong(F);
                String Y3 = l02.Y(F2);
                int i10 = (int) l02.getLong(F3);
                String str2 = null;
                if (l02.isNull(F4)) {
                    Y = null;
                } else {
                    Y = l02.Y(F4);
                }
                int i11 = F;
                OfflineChapterEntity.Status __Status_stringToEnum_1 = offlineReadsDao_Impl.__Status_stringToEnum_1(l02.Y(F5));
                int i12 = F2;
                int i13 = F3;
                int i14 = (int) l02.getLong(F6);
                if (l02.isNull(F7)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F7);
                }
                if (!l02.isNull(F8)) {
                    str2 = l02.Y(F8);
                }
                arrayList.add(new OfflineChapterEntity(j10, Y3, i10, Y, __Status_stringToEnum_1, i14, Y2, str2, l02.getLong(F9), l02.getLong(F10)));
                F = i11;
                F2 = i12;
                F3 = i13;
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final OfflineReadEntity getOfflineReadById$lambda$0(String str, long j4, OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar) {
        String Y;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.c(1, j4);
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "voice_id");
            int F4 = l.F(l02, "type");
            int F5 = l.F(l02, "total_char_count");
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "status");
            int F9 = l.F(l02, "progress");
            int F10 = l.F(l02, "cached_manifest_urls");
            int F11 = l.F(l02, "drm_key_set_ids");
            OfflineReadEntity offlineReadEntity = null;
            String Y2 = null;
            if (l02.h0()) {
                long j10 = l02.getLong(F);
                String Y3 = l02.Y(F2);
                String Y4 = l02.Y(F3);
                OfflineReadEntity.Type __Type_stringToEnum = offlineReadsDao_Impl.__Type_stringToEnum(l02.Y(F4));
                long j11 = l02.getLong(F5);
                long j12 = l02.getLong(F6);
                long j13 = l02.getLong(F7);
                OfflineReadEntity.Status __Status_stringToEnum = offlineReadsDao_Impl.__Status_stringToEnum(l02.Y(F8));
                int i10 = (int) l02.getLong(F9);
                if (l02.isNull(F10)) {
                    Y = null;
                } else {
                    Y = l02.Y(F10);
                }
                if (!l02.isNull(F11)) {
                    Y2 = l02.Y(F11);
                }
                offlineReadEntity = new OfflineReadEntity(j10, Y3, Y4, __Type_stringToEnum, j11, j12, j13, __Status_stringToEnum, i10, Y, Y2);
            }
            return offlineReadEntity;
        } finally {
            l02.close();
        }
    }

    public static final OfflineReadEntity getOfflineReadByReadId$lambda$0(String str, String str2, OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar) {
        String Y;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "voice_id");
            int F4 = l.F(l02, "type");
            int F5 = l.F(l02, "total_char_count");
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "status");
            int F9 = l.F(l02, "progress");
            int F10 = l.F(l02, "cached_manifest_urls");
            int F11 = l.F(l02, "drm_key_set_ids");
            OfflineReadEntity offlineReadEntity = null;
            String Y2 = null;
            if (l02.h0()) {
                long j4 = l02.getLong(F);
                String Y3 = l02.Y(F2);
                String Y4 = l02.Y(F3);
                OfflineReadEntity.Type __Type_stringToEnum = offlineReadsDao_Impl.__Type_stringToEnum(l02.Y(F4));
                long j10 = l02.getLong(F5);
                long j11 = l02.getLong(F6);
                long j12 = l02.getLong(F7);
                OfflineReadEntity.Status __Status_stringToEnum = offlineReadsDao_Impl.__Status_stringToEnum(l02.Y(F8));
                int i10 = (int) l02.getLong(F9);
                if (l02.isNull(F10)) {
                    Y = null;
                } else {
                    Y = l02.Y(F10);
                }
                if (!l02.isNull(F11)) {
                    Y2 = l02.Y(F11);
                }
                offlineReadEntity = new OfflineReadEntity(j4, Y3, Y4, __Type_stringToEnum, j10, j11, j12, __Status_stringToEnum, i10, Y, Y2);
            }
            return offlineReadEntity;
        } finally {
            l02.close();
        }
    }

    public static final List getOfflineReadIdsWithExpiredChapters$lambda$0(String str, long j4, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.c(1, j4);
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                arrayList.add(Long.valueOf(l02.getLong(0)));
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map, g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r12v2, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.util.Map, g1.x0, g1.e] */
    public static final List getReadsWithOfflineEntries$lambda$0(String str, OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar) {
        mb.c cVar;
        int i10;
        int i11;
        String Y;
        String Y2;
        int i12;
        String Y3;
        int i13;
        int i14;
        int i15;
        int i16;
        Float valueOf;
        int i17;
        int i18;
        Float valueOf2;
        String Y4;
        int i19;
        int i20;
        int i21;
        String Y5;
        int i22;
        Double valueOf3;
        int i23;
        SampleConfigEntity sampleConfigEntity;
        int i24;
        OfflineReadsDao_Impl offlineReadsDao_Impl2 = offlineReadsDao_Impl;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "read_id");
            int F2 = l.F(l02, "sync_state");
            int F3 = l.F(l02, "article_image_url");
            int F4 = l.F(l02, "author");
            int F5 = l.F(l02, "char_count");
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "added_at_unix");
            int F9 = l.F(l02, "description");
            int F10 = l.F(l02, "last_listened_char_offset");
            int F11 = l.F(l02, "source");
            int F12 = l.F(l02, "title");
            int F13 = l.F(l02, "subtitle");
            int F14 = l.F(l02, "url");
            int F15 = l.F(l02, "word_count");
            int F16 = l.F(l02, "original_file_type");
            int F17 = l.F(l02, "has_original_audio");
            int F18 = l.F(l02, "mature_content");
            int F19 = l.F(l02, FirebaseAnalytics.Param.ORIGIN);
            int F20 = l.F(l02, FirebaseAnalytics.Param.CONTENT_TYPE);
            int F21 = l.F(l02, "genre");
            int F22 = l.F(l02, "html_checksum");
            int F23 = l.F(l02, "from_user_import");
            int F24 = l.F(l02, "rating_average");
            int F25 = l.F(l02, "rating_count");
            int F26 = l.F(l02, "user_rating");
            int F27 = l.F(l02, "last_used_voice_id");
            int F28 = l.F(l02, "creation_status");
            int F29 = l.F(l02, "creation_progress");
            int F30 = l.F(l02, "is_archived");
            int F31 = l.F(l02, "marked_as_unread");
            int F32 = l.F(l02, "completed_at_unix");
            int F33 = l.F(l02, "publicationDate");
            int F34 = l.F(l02, "language");
            int F35 = l.F(l02, "publisherProfileId");
            int F36 = l.F(l02, "can_delete");
            int F37 = l.F(l02, "android_product_id");
            int F38 = l.F(l02, "is_paid");
            int F39 = l.F(l02, "previewAudio");
            int F40 = l.F(l02, "original_audio_voice_name");
            int F41 = l.F(l02, "original_audio_voice_image");
            int F42 = l.F(l02, "voice_selection_config");
            int F43 = l.F(l02, "sample_config_id");
            int i25 = F12;
            int F44 = l.F(l02, "display_mode");
            int F45 = l.F(l02, "in_user_library");
            int F46 = l.F(l02, "can_use_assistant");
            int F47 = l.F(l02, "audio_type");
            int F48 = l.F(l02, "use_drm");
            int F49 = l.F(l02, "last_listened_audio_file_number");
            int F50 = l.F(l02, "last_listened_audio_seconds");
            int F51 = l.F(l02, "audio_types");
            int F52 = l.F(l02, "is_voice_changer_on");
            int F53 = l.F(l02, "last_used_audio_type");
            int F54 = l.F(l02, "cover_image_urls");
            int F55 = l.F(l02, "cover_aspect_ratio");
            int F56 = l.F(l02, "blur_placeholder");
            int i26 = F11;
            ?? x0Var = new x0(0);
            int i27 = F10;
            ?? x0Var2 = new x0(0);
            int i28 = F9;
            ?? x0Var3 = new x0(0);
            int i29 = F8;
            String str2 = null;
            r rVar = new r((Object) null);
            while (l02.h0()) {
                String Y6 = l02.Y(F);
                if (x0Var.containsKey(Y6)) {
                    i24 = F7;
                } else {
                    i24 = F7;
                    x0Var.put(Y6, new ArrayList());
                }
                x0Var2.put(l02.Y(F), null);
                String Y7 = l02.Y(F);
                if (!x0Var3.containsKey(Y7)) {
                    x0Var3.put(Y7, new ArrayList());
                }
                Long valueOf4 = l02.isNull(F43) ? null : Long.valueOf(l02.getLong(F43));
                if (valueOf4 != null) {
                    rVar.f(valueOf4.longValue(), null);
                    str2 = null;
                    F7 = i24;
                    F43 = F43;
                } else {
                    F7 = i24;
                    str2 = null;
                }
            }
            int i30 = F7;
            int i31 = F43;
            String str3 = str2;
            l02.reset();
            offlineReadsDao_Impl2.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, x0Var);
            offlineReadsDao_Impl2.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, x0Var2);
            offlineReadsDao_Impl2.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity_1(aVar, x0Var3);
            offlineReadsDao_Impl2.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
            ArrayList arrayList = new ArrayList();
            OfflineReadsDao_Impl offlineReadsDao_Impl3 = offlineReadsDao_Impl2;
            while (l02.h0()) {
                String Y8 = l02.Y(F);
                SyncState __SyncState_stringToEnum = offlineReadsDao_Impl3.__SyncState_stringToEnum(l02.Y(F2));
                String Y9 = l02.isNull(F3) ? str3 : l02.Y(F3);
                String Y10 = l02.isNull(F4) ? str3 : l02.Y(F4);
                long j4 = l02.getLong(F5);
                long j10 = l02.getLong(F6);
                int i32 = i30;
                long j11 = l02.getLong(i32);
                int i33 = i29;
                Long valueOf5 = l02.isNull(i33) ? str3 : Long.valueOf(l02.getLong(i33));
                int i34 = i28;
                if (l02.isNull(i34)) {
                    int i35 = i27;
                    i10 = F2;
                    i11 = i35;
                    Y = null;
                } else {
                    int i36 = i27;
                    i10 = F2;
                    i11 = i36;
                    Y = l02.Y(i34);
                }
                long j12 = l02.getLong(i11);
                int i37 = i11;
                int i38 = i26;
                String Y11 = l02.isNull(i38) ? null : l02.Y(i38);
                i26 = i38;
                int i39 = i25;
                String Y12 = l02.isNull(i39) ? null : l02.Y(i39);
                i25 = i39;
                int i40 = F13;
                String Y13 = l02.isNull(i40) ? null : l02.Y(i40);
                F13 = i40;
                int i41 = F14;
                String Y14 = l02.isNull(i41) ? null : l02.Y(i41);
                F14 = i41;
                int i42 = F15;
                long j13 = l02.getLong(i42);
                F15 = i42;
                int i43 = F16;
                if (l02.isNull(i43)) {
                    Y2 = null;
                    F16 = i43;
                    i12 = F4;
                } else {
                    Y2 = l02.Y(i43);
                    i12 = F4;
                    F16 = i43;
                }
                int i44 = F17;
                int i45 = F3;
                boolean z6 = ((int) l02.getLong(i44)) != 0;
                int i46 = F18;
                int i47 = F5;
                boolean z10 = ((int) l02.getLong(i46)) != 0;
                int i48 = F19;
                String Y15 = l02.isNull(i48) ? null : l02.Y(i48);
                int i49 = F20;
                if (l02.isNull(i49)) {
                    Y3 = null;
                    i14 = i44;
                    i13 = i46;
                } else {
                    Y3 = l02.Y(i49);
                    i13 = i46;
                    i14 = i44;
                }
                int i50 = F21;
                F21 = i50;
                List<String> listStringFromString = offlineReadsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i50));
                int i51 = F22;
                String Y16 = l02.isNull(i51) ? null : l02.Y(i51);
                int i52 = F23;
                boolean z11 = ((int) l02.getLong(i52)) != 0;
                int i53 = F24;
                if (l02.isNull(i53)) {
                    i15 = i51;
                    i16 = i52;
                    valueOf = null;
                } else {
                    i15 = i51;
                    i16 = i52;
                    valueOf = Float.valueOf((float) l02.getDouble(i53));
                }
                int i54 = F25;
                Long valueOf6 = l02.isNull(i54) ? null : Long.valueOf(l02.getLong(i54));
                int i55 = F26;
                Long valueOf7 = l02.isNull(i55) ? null : Long.valueOf(l02.getLong(i55));
                F25 = i54;
                int i56 = F27;
                String Y17 = l02.isNull(i56) ? null : l02.Y(i56);
                F27 = i56;
                int i57 = F28;
                String Y18 = l02.isNull(i57) ? null : l02.Y(i57);
                F28 = i57;
                int i58 = F29;
                if (l02.isNull(i58)) {
                    i17 = i55;
                    i18 = i53;
                    valueOf2 = null;
                } else {
                    i17 = i55;
                    i18 = i53;
                    valueOf2 = Float.valueOf((float) l02.getDouble(i58));
                }
                int i59 = F30;
                int i60 = i15;
                boolean z12 = ((int) l02.getLong(i59)) != 0;
                int i61 = F31;
                boolean z13 = ((int) l02.getLong(i61)) != 0;
                int i62 = F32;
                Long valueOf8 = l02.isNull(i62) ? null : Long.valueOf(l02.getLong(i62));
                int i63 = F33;
                String Y19 = l02.isNull(i63) ? null : l02.Y(i63);
                F32 = i62;
                int i64 = F34;
                String Y20 = l02.isNull(i64) ? null : l02.Y(i64);
                F34 = i64;
                int i65 = F35;
                if (l02.isNull(i65)) {
                    Y4 = null;
                    F35 = i65;
                    i21 = i61;
                    i19 = F36;
                    i20 = i63;
                } else {
                    Y4 = l02.Y(i65);
                    F35 = i65;
                    i19 = F36;
                    i20 = i63;
                    i21 = i61;
                }
                boolean z14 = ((int) l02.getLong(i19)) != 0;
                int i66 = F37;
                String Y21 = l02.isNull(i66) ? null : l02.Y(i66);
                int i67 = i19;
                int i68 = F38;
                boolean z15 = ((int) l02.getLong(i68)) != 0;
                int i69 = F39;
                String Y22 = l02.isNull(i69) ? null : l02.Y(i69);
                int i70 = F40;
                String Y23 = l02.isNull(i70) ? null : l02.Y(i70);
                F39 = i69;
                int i71 = F41;
                String Y24 = l02.isNull(i71) ? null : l02.Y(i71);
                F41 = i71;
                int i72 = F42;
                String Y25 = l02.isNull(i72) ? null : l02.Y(i72);
                F42 = i72;
                int i73 = i31;
                Long valueOf9 = l02.isNull(i73) ? null : Long.valueOf(l02.getLong(i73));
                F40 = i70;
                int i74 = F44;
                if (l02.isNull(i74)) {
                    Y5 = null;
                    F44 = i74;
                    i22 = i68;
                } else {
                    Y5 = l02.Y(i74);
                    i22 = i68;
                    F44 = i74;
                }
                int i75 = F45;
                boolean z16 = ((int) l02.getLong(i75)) != 0;
                int i76 = F46;
                int i77 = F6;
                boolean z17 = ((int) l02.getLong(i76)) != 0;
                int i78 = F47;
                String Y26 = l02.isNull(i78) ? null : l02.Y(i78);
                int i79 = F48;
                boolean z18 = ((int) l02.getLong(i79)) != 0;
                int i80 = F49;
                String Y27 = l02.isNull(i80) ? null : l02.Y(i80);
                int i81 = F50;
                if (l02.isNull(i81)) {
                    valueOf3 = null;
                    F49 = i80;
                    F50 = i81;
                } else {
                    valueOf3 = Double.valueOf(l02.getDouble(i81));
                    F50 = i81;
                    F49 = i80;
                }
                int i82 = F51;
                F51 = i82;
                List<String> listStringFromString2 = offlineReadsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i82));
                int i83 = F52;
                boolean z19 = ((int) l02.getLong(i83)) != 0;
                int i84 = F53;
                String Y28 = l02.isNull(i84) ? null : l02.Y(i84);
                int i85 = F54;
                String Y29 = l02.isNull(i85) ? null : l02.Y(i85);
                int i86 = F55;
                Double valueOf10 = l02.isNull(i86) ? null : Double.valueOf(l02.getDouble(i86));
                F55 = i86;
                int i87 = F56;
                ReadMetaEntity readMetaEntity = new ReadMetaEntity(Y8, __SyncState_stringToEnum, Y9, Y10, j4, j10, j11, valueOf5, Y, j12, Y11, Y12, Y13, Y14, j13, Y2, z6, z10, Y15, Y3, listStringFromString, Y16, z11, valueOf, valueOf6, valueOf7, Y17, Y18, valueOf2, z12, z13, valueOf8, Y19, Y20, Y4, z14, Y21, z15, Y22, Y23, Y24, Y25, valueOf9, Y5, z16, z17, Y26, z18, Y27, valueOf3, listStringFromString2, z19, Y28, Y29, valueOf10, l02.isNull(i87) ? null : l02.Y(i87));
                F56 = i87;
                Object G = a0.G(x0Var, l02.Y(F));
                G.getClass();
                List list = (List) G;
                OfflineReadEntity offlineReadEntity = (OfflineReadEntity) x0Var2.get(l02.Y(F));
                Object G2 = a0.G(x0Var3, l02.Y(F));
                G2.getClass();
                List list2 = (List) G2;
                Long valueOf11 = l02.isNull(i73) ? null : Long.valueOf(l02.getLong(i73));
                if (valueOf11 != null) {
                    cVar = l02;
                    i23 = F;
                    try {
                        sampleConfigEntity = (SampleConfigEntity) rVar.b(valueOf11.longValue());
                    } catch (Throwable th) {
                        th = th;
                        cVar.close();
                        throw th;
                    }
                } else {
                    cVar = l02;
                    i23 = F;
                    sampleConfigEntity = null;
                }
                arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity, list, offlineReadEntity, list2, sampleConfigEntity));
                F48 = i79;
                F6 = i77;
                F46 = i76;
                offlineReadsDao_Impl3 = offlineReadsDao_Impl;
                i31 = i73;
                l02 = cVar;
                F = i23;
                F2 = i10;
                i27 = i37;
                F53 = i84;
                F54 = i85;
                i28 = i34;
                F5 = i47;
                F18 = i13;
                F20 = i49;
                F23 = i16;
                F24 = i18;
                F26 = i17;
                F29 = i58;
                F45 = i75;
                F47 = i78;
                F4 = i12;
                str3 = null;
                F52 = i83;
                i29 = i33;
                F3 = i45;
                F17 = i14;
                F19 = i48;
                F22 = i60;
                F30 = i59;
                F31 = i21;
                F33 = i20;
                F36 = i67;
                F37 = i66;
                F38 = i22;
                i30 = i32;
            }
            l02.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cVar = l02;
        }
    }

    public static final boolean hasOfflineReads$lambda$0(String str, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            boolean z6 = false;
            if (l02.h0()) {
                if (((int) l02.getLong(0)) != 0) {
                    z6 = true;
                }
            }
            return z6;
        } finally {
            l02.close();
        }
    }

    public static final long insert$lambda$0(OfflineReadsDao_Impl offlineReadsDao_Impl, OfflineReadEntity offlineReadEntity, mb.a aVar) {
        aVar.getClass();
        return offlineReadsDao_Impl.__insertAdapterOfOfflineReadEntity.insertAndReturnId(aVar, offlineReadEntity);
    }

    public static final z insertChapters$lambda$0(OfflineReadsDao_Impl offlineReadsDao_Impl, List list, mb.a aVar) {
        aVar.getClass();
        offlineReadsDao_Impl.__insertAdapterOfOfflineChapterEntity.insert(aVar, (Iterable<Object>) list);
        return z.f31622a;
    }

    public static final z markChapterExpired$lambda$0(String str, long j4, int i10, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.c(1, j4);
            l02.c(2, i10);
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final List observeAllOfflineReads$lambda$0(String str, OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar) {
        String Y;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "voice_id");
            int F4 = l.F(l02, "type");
            int F5 = l.F(l02, "total_char_count");
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "status");
            int F9 = l.F(l02, "progress");
            int F10 = l.F(l02, "cached_manifest_urls");
            int F11 = l.F(l02, "drm_key_set_ids");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                long j4 = l02.getLong(F);
                String Y2 = l02.Y(F2);
                String Y3 = l02.Y(F3);
                OfflineReadEntity.Type __Type_stringToEnum = offlineReadsDao_Impl.__Type_stringToEnum(l02.Y(F4));
                long j10 = l02.getLong(F5);
                long j11 = l02.getLong(F6);
                long j12 = l02.getLong(F7);
                OfflineReadEntity.Status __Status_stringToEnum = offlineReadsDao_Impl.__Status_stringToEnum(l02.Y(F8));
                int i10 = (int) l02.getLong(F9);
                String str2 = null;
                if (l02.isNull(F10)) {
                    Y = null;
                } else {
                    Y = l02.Y(F10);
                }
                if (!l02.isNull(F11)) {
                    str2 = l02.Y(F11);
                }
                arrayList.add(new OfflineReadEntity(j4, Y2, Y3, __Type_stringToEnum, j10, j11, j12, __Status_stringToEnum, i10, Y, str2));
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final List observeAllOfflineReadsWithChapters$lambda$0(String str, OfflineReadsDao_Impl offlineReadsDao_Impl, mb.a aVar) {
        String Y;
        String Y2;
        boolean z6;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "voice_id");
            int F4 = l.F(l02, "type");
            int F5 = l.F(l02, "total_char_count");
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "status");
            int F9 = l.F(l02, "progress");
            int F10 = l.F(l02, "cached_manifest_urls");
            int F11 = l.F(l02, "drm_key_set_ids");
            r rVar = new r((Object) null);
            while (l02.h0()) {
                int i10 = F10;
                int i11 = F11;
                long j4 = l02.getLong(F);
                if (rVar.c(j4) >= 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    rVar.f(j4, new ArrayList());
                    F10 = i10;
                    F11 = i11;
                } else {
                    F10 = i10;
                    F11 = i11;
                }
            }
            int i12 = F10;
            int i13 = F11;
            l02.reset();
            offlineReadsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, rVar);
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                long j10 = l02.getLong(F);
                String Y3 = l02.Y(F2);
                String Y4 = l02.Y(F3);
                OfflineReadEntity.Type __Type_stringToEnum = offlineReadsDao_Impl.__Type_stringToEnum(l02.Y(F4));
                long j11 = l02.getLong(F5);
                long j12 = l02.getLong(F6);
                long j13 = l02.getLong(F7);
                OfflineReadEntity.Status __Status_stringToEnum = offlineReadsDao_Impl.__Status_stringToEnum(l02.Y(F8));
                int i14 = (int) l02.getLong(F9);
                int i15 = i12;
                if (l02.isNull(i15)) {
                    Y = null;
                } else {
                    Y = l02.Y(i15);
                }
                int i16 = i13;
                if (l02.isNull(i16)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(i16);
                }
                OfflineReadEntity offlineReadEntity = new OfflineReadEntity(j10, Y3, Y4, __Type_stringToEnum, j11, j12, j13, __Status_stringToEnum, i14, Y, Y2);
                int i17 = F2;
                int i18 = F3;
                Object b10 = rVar.b(l02.getLong(F));
                if (b10 != null) {
                    arrayList.add(new OfflineReadWithChapters(offlineReadEntity, (List) b10));
                    F2 = i17;
                    i12 = i15;
                    F3 = i18;
                    i13 = i16;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            l02.close();
            return arrayList;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z resetAllChapterStatuses$lambda$0(String str, OfflineReadsDao_Impl offlineReadsDao_Impl, OfflineChapterEntity.Status status, int i10, long j4, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, offlineReadsDao_Impl.__Status_enumToString_1(status));
            l02.c(2, i10);
            l02.c(3, j4);
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z update$lambda$0(OfflineReadsDao_Impl offlineReadsDao_Impl, OfflineReadEntity offlineReadEntity, mb.a aVar) {
        aVar.getClass();
        offlineReadsDao_Impl.__updateAdapterOfOfflineReadEntity.handle(aVar, offlineReadEntity);
        return z.f31622a;
    }

    public static final z updateChapterDrmKeySetId$lambda$0(String str, String str2, long j4, int i10, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            l02.c(2, j4);
            l02.c(3, i10);
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z updateChapterManifestUrl$lambda$0(String str, String str2, long j4, int i10, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            l02.c(2, j4);
            l02.c(3, i10);
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z updateChapterStatus$lambda$0(String str, OfflineReadsDao_Impl offlineReadsDao_Impl, OfflineChapterEntity.Status status, int i10, long j4, int i11, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, offlineReadsDao_Impl.__Status_enumToString_1(status));
            l02.c(2, i10);
            l02.c(3, j4);
            l02.c(4, i11);
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z updateChapterStatusAndExpiry$lambda$0(String str, OfflineReadsDao_Impl offlineReadsDao_Impl, OfflineChapterEntity.Status status, int i10, long j4, long j10, int i11, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, offlineReadsDao_Impl.__Status_enumToString_1(status));
            l02.c(2, i10);
            l02.c(3, j4);
            l02.c(4, j10);
            l02.c(5, i11);
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z updateStatusAndProgress$lambda$0(String str, OfflineReadsDao_Impl offlineReadsDao_Impl, OfflineReadEntity.Status status, int i10, long j4, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, offlineReadsDao_Impl.__Status_enumToString(status));
            l02.c(2, i10);
            l02.c(3, j4);
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object delete(OfflineReadEntity offlineReadEntity, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new i(this, offlineReadEntity, 0), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object deleteAll(wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new fm.d(12), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object deleteChapter(long j4, int i10, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new d(j4, i10, 0), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object deleteOfflineReads(String str, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new am.c(str, 1), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public List<OfflineReadEntity> getAllOfflineReads() {
        return (List) us.g.C(this.__db, true, false, new a(this, 3));
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object getChaptersForRead(long j4, wn.c<? super List<OfflineChapterEntity>> cVar) {
        return us.g.E(this.__db, true, false, new e(j4, this, 2), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object getChaptersToDownload(long j4, wn.c<? super List<OfflineChapterEntity>> cVar) {
        return us.g.E(this.__db, true, false, new e(j4, this, 0), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object getOfflineReadById(long j4, wn.c<? super OfflineReadEntity> cVar) {
        return us.g.E(this.__db, true, false, new e(j4, this, 1), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object getOfflineReadByReadId(String str, wn.c<? super OfflineReadEntity> cVar) {
        return us.g.E(this.__db, true, false, new t(str, this, 18), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object getOfflineReadIdsWithExpiredChapters(long j4, wn.c<? super List<Long>> cVar) {
        return us.g.E(this.__db, true, false, new a2.g(j4, 3), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public ir.i getReadsWithOfflineEntries() {
        return tb.a.n(this.__db, true, new String[]{"reads_chapters", "offline_read", "offline_chapter", "sample_config", "reads"}, new a(this, 1));
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object hasOfflineReads(wn.c<? super Boolean> cVar) {
        return us.g.E(this.__db, true, false, new fm.d(13), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object insert(OfflineReadEntity offlineReadEntity, wn.c<? super Long> cVar) {
        return us.g.E(this.__db, false, true, new i(this, offlineReadEntity, 2), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object insertChapters(List<OfflineChapterEntity> list, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new t(this, list, 19), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object markChapterExpired(long j4, int i10, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new d(j4, i10, 1), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public ir.i observeAllOfflineReads() {
        return tb.a.n(this.__db, false, new String[]{"offline_read"}, new a(this, 0));
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public ir.i observeAllOfflineReadsWithChapters() {
        return tb.a.n(this.__db, true, new String[]{"offline_chapter", "offline_read"}, new a(this, 2));
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object recomputeReadAggregate(long j4, wn.c<? super z> cVar) {
        Object D = us.g.D(this.__db, new OfflineReadsDao_Impl$recomputeReadAggregate$2(this, j4, null), cVar);
        if (D == xn.a.f37986a) {
            return D;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object resetAllChapterStatuses(long j4, OfflineChapterEntity.Status status, int i10, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new h(this, status, i10, j4, 0), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object update(OfflineReadEntity offlineReadEntity, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new i(this, offlineReadEntity, 1), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object updateChapterDrmKeySetId(long j4, int i10, String str, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new f(i10, 0, j4, str), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object updateChapterManifestUrl(long j4, int i10, String str, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new f(i10, 1, j4, str), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object updateChapterStatus(final long j4, final int i10, final OfflineChapterEntity.Status status, final int i11, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new ho.l() { // from class: io.elevenlabs.data.database.entities.offline.c
            @Override // ho.l
            public final Object invoke(Object obj) {
                z updateChapterStatus$lambda$0;
                updateChapterStatus$lambda$0 = OfflineReadsDao_Impl.updateChapterStatus$lambda$0("UPDATE offline_chapter SET status = ?, progress = ?\n        WHERE offline_read_id = ? AND chapter_index = ?", OfflineReadsDao_Impl.this, status, i11, j4, i10, (mb.a) obj);
                return updateChapterStatus$lambda$0;
            }
        }, cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object updateChapterStatusAndExpiry(final long j4, final int i10, final OfflineChapterEntity.Status status, final int i11, final long j10, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new ho.l() { // from class: io.elevenlabs.data.database.entities.offline.g
            @Override // ho.l
            public final Object invoke(Object obj) {
                z updateChapterStatusAndExpiry$lambda$0;
                updateChapterStatusAndExpiry$lambda$0 = OfflineReadsDao_Impl.updateChapterStatusAndExpiry$lambda$0("UPDATE offline_chapter SET status = ?, progress = ?, expires_at_unix = ?\n        WHERE offline_read_id = ? AND chapter_index = ?", OfflineReadsDao_Impl.this, status, i11, j10, j4, i10, (mb.a) obj);
                return updateChapterStatusAndExpiry$lambda$0;
            }
        }, cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.offline.OfflineReadsDao
    public Object updateStatusAndProgress(long j4, OfflineReadEntity.Status status, int i10, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new h(this, status, i10, j4, 1), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao_Impl$Companion;", "", "<init>", "()V", "", "Loo/d;", "getRequiredConverters", "()Ljava/util/List;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final List<oo.d> getRequiredConverters() {
            return tn.t.f33547a;
        }

        private Companion() {
        }
    }
}
