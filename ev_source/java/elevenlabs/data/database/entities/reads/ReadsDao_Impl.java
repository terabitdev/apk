package io.elevenlabs.data.database.entities.reads;

import a2.o0;
import a2.t;
import ae.l;
import android.database.SQLException;
import android.gov.nist.core.Separators;
import androidx.room.j0;
import androidx.room.m0;
import androidx.room.r0;
import androidx.room.s0;
import androidx.room.t0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import g1.r;
import g1.x0;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.di.ListTypeConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020*H\u0096@¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b1\u0010\nJ\u001e\u00102\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b2\u0010\u000fJ\u0018\u00104\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b4\u0010\u0013J\u001b\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u000b05H\u0016¢\u0006\u0004\b7\u00108J=\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u000b052\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b7\u0010AJ\u0010\u0010B\u001a\u000209H\u0096@¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u0002060\u000b2\u0006\u0010D\u001a\u00020?H\u0016¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u0004\u0018\u0001062\u0006\u0010G\u001a\u00020;H\u0096@¢\u0006\u0004\bH\u0010IJ#\u0010J\u001a\b\u0012\u0004\u0012\u0002060\u000b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020;0\u000bH\u0016¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u000106052\u0006\u0010G\u001a\u00020;H\u0016¢\u0006\u0004\bL\u0010MJ\u001e\u0010O\u001a\b\u0012\u0004\u0012\u0002060\u000b2\u0006\u0010N\u001a\u00020;H\u0096@¢\u0006\u0004\bO\u0010IJ\"\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010P\u001a\u00020;2\u0006\u0010Q\u001a\u000209H\u0096@¢\u0006\u0004\bS\u0010TJ#\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u000b052\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020;2\u0006\u0010Y\u001a\u00020?H\u0002¢\u0006\u0004\bZ\u0010[J1\u0010a\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\2\u0018\u0010`\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0_0^H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020c2\u0006\u0010Y\u001a\u00020;H\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020f2\u0006\u0010Y\u001a\u00020;H\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\2\u0014\u0010`\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0006\u0012\u0004\u0018\u00010i0^H\u0002¢\u0006\u0004\bj\u0010bJ\u0017\u0010l\u001a\u00020k2\u0006\u0010Y\u001a\u00020;H\u0002¢\u0006\u0004\bl\u0010mJ1\u0010o\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\2\u0018\u0010`\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0_0^H\u0002¢\u0006\u0004\bo\u0010bJ'\u0010q\u001a\u00020\b2\u0006\u0010]\u001a\u00020\\2\u000e\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100pH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020?2\u0006\u0010Y\u001a\u00020;H\u0002¢\u0006\u0004\bs\u0010tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010uR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00060v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\f0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010xR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00100v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010xR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00140v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010xR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00180v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010xR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001b0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010xR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u001e0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010xR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020!0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010xR\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020$0v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010xR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020'0v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010xR\u001c\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020*0v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010xR\u001c\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020-0v8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010xR\u001e\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0086\u0001R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0086\u0001¨\u0006\u008d\u0001"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao_Impl;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "Landroidx/room/j0;", "__db", "<init>", "(Landroidx/room/j0;)V", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;", "readMeta", "Lsn/z;", "deleteRead", "(Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;Lwn/c;)Ljava/lang/Object;", "", "Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "chapters", "deleteChapters", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "sampleConfig", "deleteSampleConfig", "(Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "updateLastCharOffset", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;", "updateAudioPosition", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;", "updateTitle", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;", "updateMarkedAsUnread", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;", "updateCompletedAtUnix", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;", "updateLastVoiceId", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;", "updateRating", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;)V", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;", "updateStatus", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;", "updateArchivedStatus", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;)V", "read", "insertRead", "insertChapters", "", "insertSampleConfig", "Lir/i;", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;", "getAll", "()Lir/i;", "", "limit", "", "orderBy", "", "archived", "Lio/elevenlabs/data/database/entities/reads/SyncState;", "deletedSyncState", "(ILjava/lang/String;Ljava/lang/Boolean;Lio/elevenlabs/data/database/entities/reads/SyncState;)Lir/i;", "getCount", "(Lwn/c;)Ljava/lang/Object;", "syncState", "getAllWithSyncState", "(Lio/elevenlabs/data/database/entities/reads/SyncState;)Ljava/util/List;", "id", "getById", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "getAllById", "(Ljava/util/List;)Ljava/util/List;", "observeById", "(Ljava/lang/String;)Lir/i;", "parentId", "getSampleReadsByParentId", "readId", "chapterIndex", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ChapterCharRange;", "getChapterCharRange", "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "Lnb/f;", "query", FirebaseAnalytics.Event.SEARCH, "(Lnb/f;)Lir/i;", "_value", "__SyncState_enumToString", "(Lio/elevenlabs/data/database/entities/reads/SyncState;)Ljava/lang/String;", "Lmb/a;", "_connection", "Lg1/e;", "", "_map", "__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity", "(Lmb/a;Lg1/e;)V", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Type;", "__Type_stringToEnum", "(Ljava/lang/String;)Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Type;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;", "__Status_stringToEnum", "(Ljava/lang/String;)Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;", "__Status_stringToEnum_1", "(Ljava/lang/String;)Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity", "Lg1/r;", "__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity", "(Lmb/a;Lg1/r;)V", "__SyncState_stringToEnum", "(Ljava/lang/String;)Lio/elevenlabs/data/database/entities/reads/SyncState;", "Landroidx/room/j0;", "Landroidx/room/d;", "__deleteAdapterOfReadMetaEntity", "Landroidx/room/d;", "__deleteAdapterOfReadChapterEntity", "__deleteAdapterOfSampleConfigEntity", "__updateAdapterOfReadMetaLastCharOffsetUpdateAsReadMetaEntity", "__updateAdapterOfReadMetaAudioPositionUpdateAsReadMetaEntity", "__updateAdapterOfReadMetaTitleUpdateAsReadMetaEntity", "__updateAdapterOfReadMetaMarkedAsUnreadUpdateAsReadMetaEntity", "__updateAdapterOfReadMetaCompletedAtUnixUpdateAsReadMetaEntity", "__updateAdapterOfReadMetaLastVoiceIdUpdateAsReadMetaEntity", "__updateAdapterOfReadMetaRatingUpdateAsReadMetaEntity", "__updateAdapterOfReadMetaSyncStatusUpdateAsReadMetaEntity", "__updateAdapterOfReadMetaArchiveUpdateAsReadMetaEntity", "Landroidx/room/f;", "__upsertAdapterOfReadMetaEntity", "Landroidx/room/f;", "Lio/elevenlabs/di/ListTypeConverters;", "__listTypeConverters", "Lio/elevenlabs/di/ListTypeConverters;", "__upsertAdapterOfReadChapterEntity", "__upsertAdapterOfSampleConfigEntity", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsDao_Impl implements ReadsDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final j0 __db;
    private final androidx.room.d __deleteAdapterOfReadChapterEntity;
    private final androidx.room.d __deleteAdapterOfReadMetaEntity;
    private final androidx.room.d __deleteAdapterOfSampleConfigEntity;
    private final ListTypeConverters __listTypeConverters;
    private final androidx.room.d __updateAdapterOfReadMetaArchiveUpdateAsReadMetaEntity;
    private final androidx.room.d __updateAdapterOfReadMetaAudioPositionUpdateAsReadMetaEntity;
    private final androidx.room.d __updateAdapterOfReadMetaCompletedAtUnixUpdateAsReadMetaEntity;
    private final androidx.room.d __updateAdapterOfReadMetaLastCharOffsetUpdateAsReadMetaEntity;
    private final androidx.room.d __updateAdapterOfReadMetaLastVoiceIdUpdateAsReadMetaEntity;
    private final androidx.room.d __updateAdapterOfReadMetaMarkedAsUnreadUpdateAsReadMetaEntity;
    private final androidx.room.d __updateAdapterOfReadMetaRatingUpdateAsReadMetaEntity;
    private final androidx.room.d __updateAdapterOfReadMetaSyncStatusUpdateAsReadMetaEntity;
    private final androidx.room.d __updateAdapterOfReadMetaTitleUpdateAsReadMetaEntity;
    private final androidx.room.f __upsertAdapterOfReadChapterEntity;
    private final androidx.room.f __upsertAdapterOfReadMetaEntity;
    private final androidx.room.f __upsertAdapterOfSampleConfigEntity;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$1", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends androidx.room.d {
        @Override // androidx.room.d
        public void bind(mb.c statement, ReadMetaEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "DELETE FROM `reads` WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$10", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaRatingUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$10 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass10 extends androidx.room.d {
        @Override // androidx.room.d
        public void bind(mb.c statement, ReadsDao.ReadMetaRatingUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            Long user_rating = entity.getUser_rating();
            if (user_rating == null) {
                statement.f(2);
            } else {
                statement.c(2, user_rating.longValue());
            }
            statement.s(3, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `reads` SET `read_id` = ?,`user_rating` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$11", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaSyncStatusUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$11 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass11 extends androidx.room.d {
        public AnonymousClass11() {
        }

        @Override // androidx.room.d
        public void bind(mb.c statement, ReadsDao.ReadMetaSyncStatusUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.s(2, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            statement.s(3, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `reads` SET `read_id` = ?,`sync_state` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$12", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaArchiveUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$12 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass12 extends androidx.room.d {
        @Override // androidx.room.d
        public void bind(mb.c statement, ReadsDao.ReadMetaArchiveUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.c(2, entity.is_archived() ? 1L : 0L);
            statement.s(3, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `reads` SET `read_id` = ?,`is_archived` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$13", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$13 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass13 extends androidx.room.e {
        public AnonymousClass13() {
        }

        @Override // androidx.room.e
        public void bind(mb.c statement, ReadMetaEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.s(2, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            String article_image_url = entity.getArticle_image_url();
            if (article_image_url == null) {
                statement.f(3);
            } else {
                statement.s(3, article_image_url);
            }
            String author = entity.getAuthor();
            if (author == null) {
                statement.f(4);
            } else {
                statement.s(4, author);
            }
            statement.c(5, entity.getChar_count());
            statement.c(6, entity.getCreated_at_unix());
            statement.c(7, entity.getUpdated_at_unix());
            Long added_at_unix = entity.getAdded_at_unix();
            if (added_at_unix == null) {
                statement.f(8);
            } else {
                statement.c(8, added_at_unix.longValue());
            }
            String description = entity.getDescription();
            if (description == null) {
                statement.f(9);
            } else {
                statement.s(9, description);
            }
            statement.c(10, entity.getLast_listened_char_offset());
            String source = entity.getSource();
            if (source == null) {
                statement.f(11);
            } else {
                statement.s(11, source);
            }
            String title = entity.getTitle();
            if (title == null) {
                statement.f(12);
            } else {
                statement.s(12, title);
            }
            String subtitle = entity.getSubtitle();
            if (subtitle == null) {
                statement.f(13);
            } else {
                statement.s(13, subtitle);
            }
            String url = entity.getUrl();
            if (url == null) {
                statement.f(14);
            } else {
                statement.s(14, url);
            }
            statement.c(15, entity.getWord_count());
            String original_file_type = entity.getOriginal_file_type();
            if (original_file_type == null) {
                statement.f(16);
            } else {
                statement.s(16, original_file_type);
            }
            statement.c(17, entity.getHas_original_audio() ? 1L : 0L);
            statement.c(18, entity.getMature_content() ? 1L : 0L);
            String origin = entity.getOrigin();
            if (origin == null) {
                statement.f(19);
            } else {
                statement.s(19, origin);
            }
            String content_type = entity.getContent_type();
            if (content_type == null) {
                statement.f(20);
            } else {
                statement.s(20, content_type);
            }
            statement.s(21, ReadsDao_Impl.this.__listTypeConverters.fromListStringToString(entity.getGenre()));
            String html_checksum = entity.getHtml_checksum();
            if (html_checksum == null) {
                statement.f(22);
            } else {
                statement.s(22, html_checksum);
            }
            statement.c(23, entity.getFrom_user_import() ? 1L : 0L);
            if (entity.getRating_average() == null) {
                statement.f(24);
            } else {
                statement.e(r0.floatValue(), 24);
            }
            Long rating_count = entity.getRating_count();
            if (rating_count == null) {
                statement.f(25);
            } else {
                statement.c(25, rating_count.longValue());
            }
            Long user_rating = entity.getUser_rating();
            if (user_rating == null) {
                statement.f(26);
            } else {
                statement.c(26, user_rating.longValue());
            }
            String last_used_voice_id = entity.getLast_used_voice_id();
            if (last_used_voice_id == null) {
                statement.f(27);
            } else {
                statement.s(27, last_used_voice_id);
            }
            String creation_status = entity.getCreation_status();
            if (creation_status == null) {
                statement.f(28);
            } else {
                statement.s(28, creation_status);
            }
            if (entity.getCreation_progress() == null) {
                statement.f(29);
            } else {
                statement.e(r0.floatValue(), 29);
            }
            statement.c(30, entity.is_archived() ? 1L : 0L);
            statement.c(31, entity.getMarked_as_unread() ? 1L : 0L);
            Long completed_at_unix = entity.getCompleted_at_unix();
            if (completed_at_unix == null) {
                statement.f(32);
            } else {
                statement.c(32, completed_at_unix.longValue());
            }
            String publicationDate = entity.getPublicationDate();
            if (publicationDate == null) {
                statement.f(33);
            } else {
                statement.s(33, publicationDate);
            }
            String language = entity.getLanguage();
            if (language == null) {
                statement.f(34);
            } else {
                statement.s(34, language);
            }
            String publisherProfileId = entity.getPublisherProfileId();
            if (publisherProfileId == null) {
                statement.f(35);
            } else {
                statement.s(35, publisherProfileId);
            }
            statement.c(36, entity.getCan_delete() ? 1L : 0L);
            String android_product_id = entity.getAndroid_product_id();
            if (android_product_id == null) {
                statement.f(37);
            } else {
                statement.s(37, android_product_id);
            }
            statement.c(38, entity.is_paid() ? 1L : 0L);
            String previewAudio = entity.getPreviewAudio();
            if (previewAudio == null) {
                statement.f(39);
            } else {
                statement.s(39, previewAudio);
            }
            String original_audio_voice_name = entity.getOriginal_audio_voice_name();
            if (original_audio_voice_name == null) {
                statement.f(40);
            } else {
                statement.s(40, original_audio_voice_name);
            }
            String original_audio_voice_image = entity.getOriginal_audio_voice_image();
            if (original_audio_voice_image == null) {
                statement.f(41);
            } else {
                statement.s(41, original_audio_voice_image);
            }
            String voice_selection_config = entity.getVoice_selection_config();
            if (voice_selection_config == null) {
                statement.f(42);
            } else {
                statement.s(42, voice_selection_config);
            }
            Long sample_config_id = entity.getSample_config_id();
            if (sample_config_id == null) {
                statement.f(43);
            } else {
                statement.c(43, sample_config_id.longValue());
            }
            String display_mode = entity.getDisplay_mode();
            if (display_mode == null) {
                statement.f(44);
            } else {
                statement.s(44, display_mode);
            }
            statement.c(45, entity.getIn_user_library() ? 1L : 0L);
            statement.c(46, entity.getCan_use_assistant() ? 1L : 0L);
            String audio_type = entity.getAudio_type();
            if (audio_type == null) {
                statement.f(47);
            } else {
                statement.s(47, audio_type);
            }
            statement.c(48, entity.getUse_drm() ? 1L : 0L);
            String last_listened_audio_file_number = entity.getLast_listened_audio_file_number();
            if (last_listened_audio_file_number == null) {
                statement.f(49);
            } else {
                statement.s(49, last_listened_audio_file_number);
            }
            Double last_listened_audio_seconds = entity.getLast_listened_audio_seconds();
            if (last_listened_audio_seconds == null) {
                statement.f(50);
            } else {
                statement.e(last_listened_audio_seconds.doubleValue(), 50);
            }
            statement.s(51, ReadsDao_Impl.this.__listTypeConverters.fromListStringToString(entity.getAudio_types()));
            statement.c(52, entity.is_voice_changer_on() ? 1L : 0L);
            String last_used_audio_type = entity.getLast_used_audio_type();
            if (last_used_audio_type == null) {
                statement.f(53);
            } else {
                statement.s(53, last_used_audio_type);
            }
            String cover_image_urls = entity.getCover_image_urls();
            if (cover_image_urls == null) {
                statement.f(54);
            } else {
                statement.s(54, cover_image_urls);
            }
            Double cover_aspect_ratio = entity.getCover_aspect_ratio();
            if (cover_aspect_ratio == null) {
                statement.f(55);
            } else {
                statement.e(cover_aspect_ratio.doubleValue(), 55);
            }
            String blur_placeholder = entity.getBlur_placeholder();
            if (blur_placeholder == null) {
                statement.f(56);
            } else {
                statement.s(56, blur_placeholder);
            }
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT INTO `reads` (`read_id`,`sync_state`,`article_image_url`,`author`,`char_count`,`created_at_unix`,`updated_at_unix`,`added_at_unix`,`description`,`last_listened_char_offset`,`source`,`title`,`subtitle`,`url`,`word_count`,`original_file_type`,`has_original_audio`,`mature_content`,`origin`,`content_type`,`genre`,`html_checksum`,`from_user_import`,`rating_average`,`rating_count`,`user_rating`,`last_used_voice_id`,`creation_status`,`creation_progress`,`is_archived`,`marked_as_unread`,`completed_at_unix`,`publicationDate`,`language`,`publisherProfileId`,`can_delete`,`android_product_id`,`is_paid`,`previewAudio`,`original_audio_voice_name`,`original_audio_voice_image`,`voice_selection_config`,`sample_config_id`,`display_mode`,`in_user_library`,`can_use_assistant`,`audio_type`,`use_drm`,`last_listened_audio_file_number`,`last_listened_audio_seconds`,`audio_types`,`is_voice_changer_on`,`last_used_audio_type`,`cover_image_urls`,`cover_aspect_ratio`,`blur_placeholder`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$14", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadMetaEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$14 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass14 extends androidx.room.d {
        public AnonymousClass14() {
        }

        @Override // androidx.room.d
        public void bind(mb.c statement, ReadMetaEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.s(2, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            String article_image_url = entity.getArticle_image_url();
            if (article_image_url == null) {
                statement.f(3);
            } else {
                statement.s(3, article_image_url);
            }
            String author = entity.getAuthor();
            if (author == null) {
                statement.f(4);
            } else {
                statement.s(4, author);
            }
            statement.c(5, entity.getChar_count());
            statement.c(6, entity.getCreated_at_unix());
            statement.c(7, entity.getUpdated_at_unix());
            Long added_at_unix = entity.getAdded_at_unix();
            if (added_at_unix == null) {
                statement.f(8);
            } else {
                statement.c(8, added_at_unix.longValue());
            }
            String description = entity.getDescription();
            if (description == null) {
                statement.f(9);
            } else {
                statement.s(9, description);
            }
            statement.c(10, entity.getLast_listened_char_offset());
            String source = entity.getSource();
            if (source == null) {
                statement.f(11);
            } else {
                statement.s(11, source);
            }
            String title = entity.getTitle();
            if (title == null) {
                statement.f(12);
            } else {
                statement.s(12, title);
            }
            String subtitle = entity.getSubtitle();
            if (subtitle == null) {
                statement.f(13);
            } else {
                statement.s(13, subtitle);
            }
            String url = entity.getUrl();
            if (url == null) {
                statement.f(14);
            } else {
                statement.s(14, url);
            }
            statement.c(15, entity.getWord_count());
            String original_file_type = entity.getOriginal_file_type();
            if (original_file_type == null) {
                statement.f(16);
            } else {
                statement.s(16, original_file_type);
            }
            statement.c(17, entity.getHas_original_audio() ? 1L : 0L);
            statement.c(18, entity.getMature_content() ? 1L : 0L);
            String origin = entity.getOrigin();
            if (origin == null) {
                statement.f(19);
            } else {
                statement.s(19, origin);
            }
            String content_type = entity.getContent_type();
            if (content_type == null) {
                statement.f(20);
            } else {
                statement.s(20, content_type);
            }
            statement.s(21, ReadsDao_Impl.this.__listTypeConverters.fromListStringToString(entity.getGenre()));
            String html_checksum = entity.getHtml_checksum();
            if (html_checksum == null) {
                statement.f(22);
            } else {
                statement.s(22, html_checksum);
            }
            statement.c(23, entity.getFrom_user_import() ? 1L : 0L);
            if (entity.getRating_average() == null) {
                statement.f(24);
            } else {
                statement.e(r0.floatValue(), 24);
            }
            Long rating_count = entity.getRating_count();
            if (rating_count == null) {
                statement.f(25);
            } else {
                statement.c(25, rating_count.longValue());
            }
            Long user_rating = entity.getUser_rating();
            if (user_rating == null) {
                statement.f(26);
            } else {
                statement.c(26, user_rating.longValue());
            }
            String last_used_voice_id = entity.getLast_used_voice_id();
            if (last_used_voice_id == null) {
                statement.f(27);
            } else {
                statement.s(27, last_used_voice_id);
            }
            String creation_status = entity.getCreation_status();
            if (creation_status == null) {
                statement.f(28);
            } else {
                statement.s(28, creation_status);
            }
            if (entity.getCreation_progress() == null) {
                statement.f(29);
            } else {
                statement.e(r0.floatValue(), 29);
            }
            statement.c(30, entity.is_archived() ? 1L : 0L);
            statement.c(31, entity.getMarked_as_unread() ? 1L : 0L);
            Long completed_at_unix = entity.getCompleted_at_unix();
            if (completed_at_unix == null) {
                statement.f(32);
            } else {
                statement.c(32, completed_at_unix.longValue());
            }
            String publicationDate = entity.getPublicationDate();
            if (publicationDate == null) {
                statement.f(33);
            } else {
                statement.s(33, publicationDate);
            }
            String language = entity.getLanguage();
            if (language == null) {
                statement.f(34);
            } else {
                statement.s(34, language);
            }
            String publisherProfileId = entity.getPublisherProfileId();
            if (publisherProfileId == null) {
                statement.f(35);
            } else {
                statement.s(35, publisherProfileId);
            }
            statement.c(36, entity.getCan_delete() ? 1L : 0L);
            String android_product_id = entity.getAndroid_product_id();
            if (android_product_id == null) {
                statement.f(37);
            } else {
                statement.s(37, android_product_id);
            }
            statement.c(38, entity.is_paid() ? 1L : 0L);
            String previewAudio = entity.getPreviewAudio();
            if (previewAudio == null) {
                statement.f(39);
            } else {
                statement.s(39, previewAudio);
            }
            String original_audio_voice_name = entity.getOriginal_audio_voice_name();
            if (original_audio_voice_name == null) {
                statement.f(40);
            } else {
                statement.s(40, original_audio_voice_name);
            }
            String original_audio_voice_image = entity.getOriginal_audio_voice_image();
            if (original_audio_voice_image == null) {
                statement.f(41);
            } else {
                statement.s(41, original_audio_voice_image);
            }
            String voice_selection_config = entity.getVoice_selection_config();
            if (voice_selection_config == null) {
                statement.f(42);
            } else {
                statement.s(42, voice_selection_config);
            }
            Long sample_config_id = entity.getSample_config_id();
            if (sample_config_id == null) {
                statement.f(43);
            } else {
                statement.c(43, sample_config_id.longValue());
            }
            String display_mode = entity.getDisplay_mode();
            if (display_mode == null) {
                statement.f(44);
            } else {
                statement.s(44, display_mode);
            }
            statement.c(45, entity.getIn_user_library() ? 1L : 0L);
            statement.c(46, entity.getCan_use_assistant() ? 1L : 0L);
            String audio_type = entity.getAudio_type();
            if (audio_type == null) {
                statement.f(47);
            } else {
                statement.s(47, audio_type);
            }
            statement.c(48, entity.getUse_drm() ? 1L : 0L);
            String last_listened_audio_file_number = entity.getLast_listened_audio_file_number();
            if (last_listened_audio_file_number == null) {
                statement.f(49);
            } else {
                statement.s(49, last_listened_audio_file_number);
            }
            Double last_listened_audio_seconds = entity.getLast_listened_audio_seconds();
            if (last_listened_audio_seconds == null) {
                statement.f(50);
            } else {
                statement.e(last_listened_audio_seconds.doubleValue(), 50);
            }
            statement.s(51, ReadsDao_Impl.this.__listTypeConverters.fromListStringToString(entity.getAudio_types()));
            statement.c(52, entity.is_voice_changer_on() ? 1L : 0L);
            String last_used_audio_type = entity.getLast_used_audio_type();
            if (last_used_audio_type == null) {
                statement.f(53);
            } else {
                statement.s(53, last_used_audio_type);
            }
            String cover_image_urls = entity.getCover_image_urls();
            if (cover_image_urls == null) {
                statement.f(54);
            } else {
                statement.s(54, cover_image_urls);
            }
            Double cover_aspect_ratio = entity.getCover_aspect_ratio();
            if (cover_aspect_ratio == null) {
                statement.f(55);
            } else {
                statement.e(cover_aspect_ratio.doubleValue(), 55);
            }
            String blur_placeholder = entity.getBlur_placeholder();
            if (blur_placeholder == null) {
                statement.f(56);
            } else {
                statement.s(56, blur_placeholder);
            }
            statement.s(57, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE `reads` SET `read_id` = ?,`sync_state` = ?,`article_image_url` = ?,`author` = ?,`char_count` = ?,`created_at_unix` = ?,`updated_at_unix` = ?,`added_at_unix` = ?,`description` = ?,`last_listened_char_offset` = ?,`source` = ?,`title` = ?,`subtitle` = ?,`url` = ?,`word_count` = ?,`original_file_type` = ?,`has_original_audio` = ?,`mature_content` = ?,`origin` = ?,`content_type` = ?,`genre` = ?,`html_checksum` = ?,`from_user_import` = ?,`rating_average` = ?,`rating_count` = ?,`user_rating` = ?,`last_used_voice_id` = ?,`creation_status` = ?,`creation_progress` = ?,`is_archived` = ?,`marked_as_unread` = ?,`completed_at_unix` = ?,`publicationDate` = ?,`language` = ?,`publisherProfileId` = ?,`can_delete` = ?,`android_product_id` = ?,`is_paid` = ?,`previewAudio` = ?,`original_audio_voice_name` = ?,`original_audio_voice_image` = ?,`voice_selection_config` = ?,`sample_config_id` = ?,`display_mode` = ?,`in_user_library` = ?,`can_use_assistant` = ?,`audio_type` = ?,`use_drm` = ?,`last_listened_audio_file_number` = ?,`last_listened_audio_seconds` = ?,`audio_types` = ?,`is_voice_changer_on` = ?,`last_used_audio_type` = ?,`cover_image_urls` = ?,`cover_aspect_ratio` = ?,`blur_placeholder` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$15", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$15 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass15 extends androidx.room.e {
        @Override // androidx.room.e
        public void bind(mb.c statement, ReadChapterEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.c(2, entity.getChapter_index());
            statement.s(3, entity.getChapter_name());
            statement.c(4, entity.getChar_count());
            statement.c(5, entity.getHas_summary() ? 1L : 0L);
            statement.c(6, entity.getWord_count());
            statement.c(7, entity.getStarting_char_offset());
            Double duration_seconds = entity.getDuration_seconds();
            if (duration_seconds == null) {
                statement.f(8);
            } else {
                statement.e(duration_seconds.doubleValue(), 8);
            }
            String audio_file_number = entity.getAudio_file_number();
            if (audio_file_number == null) {
                statement.f(9);
            } else {
                statement.s(9, audio_file_number);
            }
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT INTO `reads_chapters` (`read_id`,`chapter_index`,`chapter_name`,`char_count`,`has_summary`,`word_count`,`starting_char_offset`,`duration_seconds`,`audio_file_number`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$16", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$16 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass16 extends androidx.room.d {
        @Override // androidx.room.d
        public void bind(mb.c statement, ReadChapterEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.c(2, entity.getChapter_index());
            statement.s(3, entity.getChapter_name());
            statement.c(4, entity.getChar_count());
            statement.c(5, entity.getHas_summary() ? 1L : 0L);
            statement.c(6, entity.getWord_count());
            statement.c(7, entity.getStarting_char_offset());
            Double duration_seconds = entity.getDuration_seconds();
            if (duration_seconds == null) {
                statement.f(8);
            } else {
                statement.e(duration_seconds.doubleValue(), 8);
            }
            String audio_file_number = entity.getAudio_file_number();
            if (audio_file_number == null) {
                statement.f(9);
            } else {
                statement.s(9, audio_file_number);
            }
            statement.s(10, entity.getRead_id());
            statement.c(11, entity.getChapter_index());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE `reads_chapters` SET `read_id` = ?,`chapter_index` = ?,`chapter_name` = ?,`char_count` = ?,`has_summary` = ?,`word_count` = ?,`starting_char_offset` = ?,`duration_seconds` = ?,`audio_file_number` = ? WHERE `read_id` = ? AND `chapter_index` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$17", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$17 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass17 extends androidx.room.e {
        @Override // androidx.room.e
        public void bind(mb.c statement, SampleConfigEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.c(1, entity.getId());
            statement.c(2, entity.isSample() ? 1L : 0L);
            String parentId = entity.getParentId();
            if (parentId == null) {
                statement.f(3);
            } else {
                statement.s(3, parentId);
            }
            String parentType = entity.getParentType();
            if (parentType == null) {
                statement.f(4);
            } else {
                statement.s(4, parentType);
            }
            String chapterIds = entity.getChapterIds();
            if (chapterIds == null) {
                statement.f(5);
            } else {
                statement.s(5, chapterIds);
            }
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT INTO `sample_config` (`id`,`is_sample`,`parent_id`,`parent_type`,`chapter_ids`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$18", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$18 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass18 extends androidx.room.d {
        @Override // androidx.room.d
        public void bind(mb.c statement, SampleConfigEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.c(1, entity.getId());
            statement.c(2, entity.isSample() ? 1L : 0L);
            String parentId = entity.getParentId();
            if (parentId == null) {
                statement.f(3);
            } else {
                statement.s(3, parentId);
            }
            String parentType = entity.getParentType();
            if (parentType == null) {
                statement.f(4);
            } else {
                statement.s(4, parentType);
            }
            String chapterIds = entity.getChapterIds();
            if (chapterIds == null) {
                statement.f(5);
            } else {
                statement.s(5, chapterIds);
            }
            statement.c(6, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE `sample_config` SET `id` = ?,`is_sample` = ?,`parent_id` = ?,`parent_type` = ?,`chapter_ids` = ? WHERE `id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$2", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$2 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends androidx.room.d {
        @Override // androidx.room.d
        public void bind(mb.c statement, ReadChapterEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.c(2, entity.getChapter_index());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "DELETE FROM `reads_chapters` WHERE `read_id` = ? AND `chapter_index` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$3", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$3 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends androidx.room.d {
        @Override // androidx.room.d
        public void bind(mb.c statement, SampleConfigEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.c(1, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "DELETE FROM `sample_config` WHERE `id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$4", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastCharOffsetUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$4 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends androidx.room.d {
        public AnonymousClass4() {
        }

        @Override // androidx.room.d
        public void bind(mb.c statement, ReadsDao.ReadMetaLastCharOffsetUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.c(2, entity.getLast_listened_char_offset());
            statement.s(3, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            statement.s(4, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `reads` SET `read_id` = ?,`last_listened_char_offset` = ?,`sync_state` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$5", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaAudioPositionUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$5 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass5 extends androidx.room.d {
        public AnonymousClass5() {
        }

        @Override // androidx.room.d
        public void bind(mb.c statement, ReadsDao.ReadMetaAudioPositionUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.s(2, entity.getLast_listened_audio_file_number());
            statement.e(entity.getLast_listened_audio_seconds(), 3);
            statement.s(4, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            statement.s(5, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `reads` SET `read_id` = ?,`last_listened_audio_file_number` = ?,`last_listened_audio_seconds` = ?,`sync_state` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$6", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaTitleUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$6 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass6 extends androidx.room.d {
        public AnonymousClass6() {
        }

        @Override // androidx.room.d
        public void bind(mb.c statement, ReadsDao.ReadMetaTitleUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.s(2, entity.getTitle());
            statement.s(3, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            statement.s(4, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `reads` SET `read_id` = ?,`title` = ?,`sync_state` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$7", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaMarkedAsUnreadUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$7 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass7 extends androidx.room.d {
        public AnonymousClass7() {
        }

        @Override // androidx.room.d
        public void bind(mb.c statement, ReadsDao.ReadMetaMarkedAsUnreadUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.c(2, entity.getMarked_as_unread() ? 1L : 0L);
            statement.s(3, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            statement.s(4, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `reads` SET `read_id` = ?,`marked_as_unread` = ?,`sync_state` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$8", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaCompletedAtUnixUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$8 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass8 extends androidx.room.d {
        public AnonymousClass8() {
        }

        @Override // androidx.room.d
        public void bind(mb.c statement, ReadsDao.ReadMetaCompletedAtUnixUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            Long completed_at_unix = entity.getCompleted_at_unix();
            if (completed_at_unix == null) {
                statement.f(2);
            } else {
                statement.c(2, completed_at_unix.longValue());
            }
            statement.s(3, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            statement.s(4, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `reads` SET `read_id` = ?,`completed_at_unix` = ?,`sync_state` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/reads/ReadsDao_Impl$9", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/reads/ReadsDao$ReadMetaLastVoiceIdUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl$9 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass9 extends androidx.room.d {
        @Override // androidx.room.d
        public void bind(mb.c statement, ReadsDao.ReadMetaLastVoiceIdUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getRead_id());
            statement.s(2, entity.getLast_used_voice_id());
            String last_used_audio_type = entity.getLast_used_audio_type();
            if (last_used_audio_type == null) {
                statement.f(3);
            } else {
                statement.s(3, last_used_audio_type);
            }
            statement.s(4, entity.getRead_id());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `reads` SET `read_id` = ?,`last_used_voice_id` = ?,`last_used_audio_type` = ? WHERE `read_id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SyncState.values().length];
            try {
                iArr[SyncState.UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SyncState.PENDING_DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SyncState.PENDING_UPDATE_PUSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReadsDao_Impl(j0 j0Var) {
        j0Var.getClass();
        this.__listTypeConverters = new ListTypeConverters();
        this.__db = j0Var;
        this.__deleteAdapterOfReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.1
            @Override // androidx.room.d
            public void bind(mb.c statement, ReadMetaEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "DELETE FROM `reads` WHERE `read_id` = ?";
            }
        };
        this.__deleteAdapterOfReadChapterEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.2
            @Override // androidx.room.d
            public void bind(mb.c statement, ReadChapterEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.c(2, entity.getChapter_index());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "DELETE FROM `reads_chapters` WHERE `read_id` = ? AND `chapter_index` = ?";
            }
        };
        this.__deleteAdapterOfSampleConfigEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.3
            @Override // androidx.room.d
            public void bind(mb.c statement, SampleConfigEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.c(1, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "DELETE FROM `sample_config` WHERE `id` = ?";
            }
        };
        this.__updateAdapterOfReadMetaLastCharOffsetUpdateAsReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.4
            public AnonymousClass4() {
            }

            @Override // androidx.room.d
            public void bind(mb.c statement, ReadsDao.ReadMetaLastCharOffsetUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.c(2, entity.getLast_listened_char_offset());
                statement.s(3, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                statement.s(4, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `reads` SET `read_id` = ?,`last_listened_char_offset` = ?,`sync_state` = ? WHERE `read_id` = ?";
            }
        };
        this.__updateAdapterOfReadMetaAudioPositionUpdateAsReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.5
            public AnonymousClass5() {
            }

            @Override // androidx.room.d
            public void bind(mb.c statement, ReadsDao.ReadMetaAudioPositionUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.s(2, entity.getLast_listened_audio_file_number());
                statement.e(entity.getLast_listened_audio_seconds(), 3);
                statement.s(4, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                statement.s(5, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `reads` SET `read_id` = ?,`last_listened_audio_file_number` = ?,`last_listened_audio_seconds` = ?,`sync_state` = ? WHERE `read_id` = ?";
            }
        };
        this.__updateAdapterOfReadMetaTitleUpdateAsReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.6
            public AnonymousClass6() {
            }

            @Override // androidx.room.d
            public void bind(mb.c statement, ReadsDao.ReadMetaTitleUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.s(2, entity.getTitle());
                statement.s(3, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                statement.s(4, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `reads` SET `read_id` = ?,`title` = ?,`sync_state` = ? WHERE `read_id` = ?";
            }
        };
        this.__updateAdapterOfReadMetaMarkedAsUnreadUpdateAsReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.7
            public AnonymousClass7() {
            }

            @Override // androidx.room.d
            public void bind(mb.c statement, ReadsDao.ReadMetaMarkedAsUnreadUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.c(2, entity.getMarked_as_unread() ? 1L : 0L);
                statement.s(3, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                statement.s(4, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `reads` SET `read_id` = ?,`marked_as_unread` = ?,`sync_state` = ? WHERE `read_id` = ?";
            }
        };
        this.__updateAdapterOfReadMetaCompletedAtUnixUpdateAsReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.8
            public AnonymousClass8() {
            }

            @Override // androidx.room.d
            public void bind(mb.c statement, ReadsDao.ReadMetaCompletedAtUnixUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                Long completed_at_unix = entity.getCompleted_at_unix();
                if (completed_at_unix == null) {
                    statement.f(2);
                } else {
                    statement.c(2, completed_at_unix.longValue());
                }
                statement.s(3, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                statement.s(4, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `reads` SET `read_id` = ?,`completed_at_unix` = ?,`sync_state` = ? WHERE `read_id` = ?";
            }
        };
        this.__updateAdapterOfReadMetaLastVoiceIdUpdateAsReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.9
            @Override // androidx.room.d
            public void bind(mb.c statement, ReadsDao.ReadMetaLastVoiceIdUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.s(2, entity.getLast_used_voice_id());
                String last_used_audio_type = entity.getLast_used_audio_type();
                if (last_used_audio_type == null) {
                    statement.f(3);
                } else {
                    statement.s(3, last_used_audio_type);
                }
                statement.s(4, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `reads` SET `read_id` = ?,`last_used_voice_id` = ?,`last_used_audio_type` = ? WHERE `read_id` = ?";
            }
        };
        this.__updateAdapterOfReadMetaRatingUpdateAsReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.10
            @Override // androidx.room.d
            public void bind(mb.c statement, ReadsDao.ReadMetaRatingUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                Long user_rating = entity.getUser_rating();
                if (user_rating == null) {
                    statement.f(2);
                } else {
                    statement.c(2, user_rating.longValue());
                }
                statement.s(3, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `reads` SET `read_id` = ?,`user_rating` = ? WHERE `read_id` = ?";
            }
        };
        this.__updateAdapterOfReadMetaSyncStatusUpdateAsReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.11
            public AnonymousClass11() {
            }

            @Override // androidx.room.d
            public void bind(mb.c statement, ReadsDao.ReadMetaSyncStatusUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.s(2, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                statement.s(3, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `reads` SET `read_id` = ?,`sync_state` = ? WHERE `read_id` = ?";
            }
        };
        this.__updateAdapterOfReadMetaArchiveUpdateAsReadMetaEntity = new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.12
            @Override // androidx.room.d
            public void bind(mb.c statement, ReadsDao.ReadMetaArchiveUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.c(2, entity.is_archived() ? 1L : 0L);
                statement.s(3, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `reads` SET `read_id` = ?,`is_archived` = ? WHERE `read_id` = ?";
            }
        };
        this.__upsertAdapterOfReadMetaEntity = new androidx.room.f(new androidx.room.e() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.13
            public AnonymousClass13() {
            }

            @Override // androidx.room.e
            public void bind(mb.c statement, ReadMetaEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.s(2, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                String article_image_url = entity.getArticle_image_url();
                if (article_image_url == null) {
                    statement.f(3);
                } else {
                    statement.s(3, article_image_url);
                }
                String author = entity.getAuthor();
                if (author == null) {
                    statement.f(4);
                } else {
                    statement.s(4, author);
                }
                statement.c(5, entity.getChar_count());
                statement.c(6, entity.getCreated_at_unix());
                statement.c(7, entity.getUpdated_at_unix());
                Long added_at_unix = entity.getAdded_at_unix();
                if (added_at_unix == null) {
                    statement.f(8);
                } else {
                    statement.c(8, added_at_unix.longValue());
                }
                String description = entity.getDescription();
                if (description == null) {
                    statement.f(9);
                } else {
                    statement.s(9, description);
                }
                statement.c(10, entity.getLast_listened_char_offset());
                String source = entity.getSource();
                if (source == null) {
                    statement.f(11);
                } else {
                    statement.s(11, source);
                }
                String title = entity.getTitle();
                if (title == null) {
                    statement.f(12);
                } else {
                    statement.s(12, title);
                }
                String subtitle = entity.getSubtitle();
                if (subtitle == null) {
                    statement.f(13);
                } else {
                    statement.s(13, subtitle);
                }
                String url = entity.getUrl();
                if (url == null) {
                    statement.f(14);
                } else {
                    statement.s(14, url);
                }
                statement.c(15, entity.getWord_count());
                String original_file_type = entity.getOriginal_file_type();
                if (original_file_type == null) {
                    statement.f(16);
                } else {
                    statement.s(16, original_file_type);
                }
                statement.c(17, entity.getHas_original_audio() ? 1L : 0L);
                statement.c(18, entity.getMature_content() ? 1L : 0L);
                String origin = entity.getOrigin();
                if (origin == null) {
                    statement.f(19);
                } else {
                    statement.s(19, origin);
                }
                String content_type = entity.getContent_type();
                if (content_type == null) {
                    statement.f(20);
                } else {
                    statement.s(20, content_type);
                }
                statement.s(21, ReadsDao_Impl.this.__listTypeConverters.fromListStringToString(entity.getGenre()));
                String html_checksum = entity.getHtml_checksum();
                if (html_checksum == null) {
                    statement.f(22);
                } else {
                    statement.s(22, html_checksum);
                }
                statement.c(23, entity.getFrom_user_import() ? 1L : 0L);
                if (entity.getRating_average() == null) {
                    statement.f(24);
                } else {
                    statement.e(r0.floatValue(), 24);
                }
                Long rating_count = entity.getRating_count();
                if (rating_count == null) {
                    statement.f(25);
                } else {
                    statement.c(25, rating_count.longValue());
                }
                Long user_rating = entity.getUser_rating();
                if (user_rating == null) {
                    statement.f(26);
                } else {
                    statement.c(26, user_rating.longValue());
                }
                String last_used_voice_id = entity.getLast_used_voice_id();
                if (last_used_voice_id == null) {
                    statement.f(27);
                } else {
                    statement.s(27, last_used_voice_id);
                }
                String creation_status = entity.getCreation_status();
                if (creation_status == null) {
                    statement.f(28);
                } else {
                    statement.s(28, creation_status);
                }
                if (entity.getCreation_progress() == null) {
                    statement.f(29);
                } else {
                    statement.e(r0.floatValue(), 29);
                }
                statement.c(30, entity.is_archived() ? 1L : 0L);
                statement.c(31, entity.getMarked_as_unread() ? 1L : 0L);
                Long completed_at_unix = entity.getCompleted_at_unix();
                if (completed_at_unix == null) {
                    statement.f(32);
                } else {
                    statement.c(32, completed_at_unix.longValue());
                }
                String publicationDate = entity.getPublicationDate();
                if (publicationDate == null) {
                    statement.f(33);
                } else {
                    statement.s(33, publicationDate);
                }
                String language = entity.getLanguage();
                if (language == null) {
                    statement.f(34);
                } else {
                    statement.s(34, language);
                }
                String publisherProfileId = entity.getPublisherProfileId();
                if (publisherProfileId == null) {
                    statement.f(35);
                } else {
                    statement.s(35, publisherProfileId);
                }
                statement.c(36, entity.getCan_delete() ? 1L : 0L);
                String android_product_id = entity.getAndroid_product_id();
                if (android_product_id == null) {
                    statement.f(37);
                } else {
                    statement.s(37, android_product_id);
                }
                statement.c(38, entity.is_paid() ? 1L : 0L);
                String previewAudio = entity.getPreviewAudio();
                if (previewAudio == null) {
                    statement.f(39);
                } else {
                    statement.s(39, previewAudio);
                }
                String original_audio_voice_name = entity.getOriginal_audio_voice_name();
                if (original_audio_voice_name == null) {
                    statement.f(40);
                } else {
                    statement.s(40, original_audio_voice_name);
                }
                String original_audio_voice_image = entity.getOriginal_audio_voice_image();
                if (original_audio_voice_image == null) {
                    statement.f(41);
                } else {
                    statement.s(41, original_audio_voice_image);
                }
                String voice_selection_config = entity.getVoice_selection_config();
                if (voice_selection_config == null) {
                    statement.f(42);
                } else {
                    statement.s(42, voice_selection_config);
                }
                Long sample_config_id = entity.getSample_config_id();
                if (sample_config_id == null) {
                    statement.f(43);
                } else {
                    statement.c(43, sample_config_id.longValue());
                }
                String display_mode = entity.getDisplay_mode();
                if (display_mode == null) {
                    statement.f(44);
                } else {
                    statement.s(44, display_mode);
                }
                statement.c(45, entity.getIn_user_library() ? 1L : 0L);
                statement.c(46, entity.getCan_use_assistant() ? 1L : 0L);
                String audio_type = entity.getAudio_type();
                if (audio_type == null) {
                    statement.f(47);
                } else {
                    statement.s(47, audio_type);
                }
                statement.c(48, entity.getUse_drm() ? 1L : 0L);
                String last_listened_audio_file_number = entity.getLast_listened_audio_file_number();
                if (last_listened_audio_file_number == null) {
                    statement.f(49);
                } else {
                    statement.s(49, last_listened_audio_file_number);
                }
                Double last_listened_audio_seconds = entity.getLast_listened_audio_seconds();
                if (last_listened_audio_seconds == null) {
                    statement.f(50);
                } else {
                    statement.e(last_listened_audio_seconds.doubleValue(), 50);
                }
                statement.s(51, ReadsDao_Impl.this.__listTypeConverters.fromListStringToString(entity.getAudio_types()));
                statement.c(52, entity.is_voice_changer_on() ? 1L : 0L);
                String last_used_audio_type = entity.getLast_used_audio_type();
                if (last_used_audio_type == null) {
                    statement.f(53);
                } else {
                    statement.s(53, last_used_audio_type);
                }
                String cover_image_urls = entity.getCover_image_urls();
                if (cover_image_urls == null) {
                    statement.f(54);
                } else {
                    statement.s(54, cover_image_urls);
                }
                Double cover_aspect_ratio = entity.getCover_aspect_ratio();
                if (cover_aspect_ratio == null) {
                    statement.f(55);
                } else {
                    statement.e(cover_aspect_ratio.doubleValue(), 55);
                }
                String blur_placeholder = entity.getBlur_placeholder();
                if (blur_placeholder == null) {
                    statement.f(56);
                } else {
                    statement.s(56, blur_placeholder);
                }
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT INTO `reads` (`read_id`,`sync_state`,`article_image_url`,`author`,`char_count`,`created_at_unix`,`updated_at_unix`,`added_at_unix`,`description`,`last_listened_char_offset`,`source`,`title`,`subtitle`,`url`,`word_count`,`original_file_type`,`has_original_audio`,`mature_content`,`origin`,`content_type`,`genre`,`html_checksum`,`from_user_import`,`rating_average`,`rating_count`,`user_rating`,`last_used_voice_id`,`creation_status`,`creation_progress`,`is_archived`,`marked_as_unread`,`completed_at_unix`,`publicationDate`,`language`,`publisherProfileId`,`can_delete`,`android_product_id`,`is_paid`,`previewAudio`,`original_audio_voice_name`,`original_audio_voice_image`,`voice_selection_config`,`sample_config_id`,`display_mode`,`in_user_library`,`can_use_assistant`,`audio_type`,`use_drm`,`last_listened_audio_file_number`,`last_listened_audio_seconds`,`audio_types`,`is_voice_changer_on`,`last_used_audio_type`,`cover_image_urls`,`cover_aspect_ratio`,`blur_placeholder`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }, new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.14
            public AnonymousClass14() {
            }

            @Override // androidx.room.d
            public void bind(mb.c statement, ReadMetaEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.s(2, ReadsDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                String article_image_url = entity.getArticle_image_url();
                if (article_image_url == null) {
                    statement.f(3);
                } else {
                    statement.s(3, article_image_url);
                }
                String author = entity.getAuthor();
                if (author == null) {
                    statement.f(4);
                } else {
                    statement.s(4, author);
                }
                statement.c(5, entity.getChar_count());
                statement.c(6, entity.getCreated_at_unix());
                statement.c(7, entity.getUpdated_at_unix());
                Long added_at_unix = entity.getAdded_at_unix();
                if (added_at_unix == null) {
                    statement.f(8);
                } else {
                    statement.c(8, added_at_unix.longValue());
                }
                String description = entity.getDescription();
                if (description == null) {
                    statement.f(9);
                } else {
                    statement.s(9, description);
                }
                statement.c(10, entity.getLast_listened_char_offset());
                String source = entity.getSource();
                if (source == null) {
                    statement.f(11);
                } else {
                    statement.s(11, source);
                }
                String title = entity.getTitle();
                if (title == null) {
                    statement.f(12);
                } else {
                    statement.s(12, title);
                }
                String subtitle = entity.getSubtitle();
                if (subtitle == null) {
                    statement.f(13);
                } else {
                    statement.s(13, subtitle);
                }
                String url = entity.getUrl();
                if (url == null) {
                    statement.f(14);
                } else {
                    statement.s(14, url);
                }
                statement.c(15, entity.getWord_count());
                String original_file_type = entity.getOriginal_file_type();
                if (original_file_type == null) {
                    statement.f(16);
                } else {
                    statement.s(16, original_file_type);
                }
                statement.c(17, entity.getHas_original_audio() ? 1L : 0L);
                statement.c(18, entity.getMature_content() ? 1L : 0L);
                String origin = entity.getOrigin();
                if (origin == null) {
                    statement.f(19);
                } else {
                    statement.s(19, origin);
                }
                String content_type = entity.getContent_type();
                if (content_type == null) {
                    statement.f(20);
                } else {
                    statement.s(20, content_type);
                }
                statement.s(21, ReadsDao_Impl.this.__listTypeConverters.fromListStringToString(entity.getGenre()));
                String html_checksum = entity.getHtml_checksum();
                if (html_checksum == null) {
                    statement.f(22);
                } else {
                    statement.s(22, html_checksum);
                }
                statement.c(23, entity.getFrom_user_import() ? 1L : 0L);
                if (entity.getRating_average() == null) {
                    statement.f(24);
                } else {
                    statement.e(r0.floatValue(), 24);
                }
                Long rating_count = entity.getRating_count();
                if (rating_count == null) {
                    statement.f(25);
                } else {
                    statement.c(25, rating_count.longValue());
                }
                Long user_rating = entity.getUser_rating();
                if (user_rating == null) {
                    statement.f(26);
                } else {
                    statement.c(26, user_rating.longValue());
                }
                String last_used_voice_id = entity.getLast_used_voice_id();
                if (last_used_voice_id == null) {
                    statement.f(27);
                } else {
                    statement.s(27, last_used_voice_id);
                }
                String creation_status = entity.getCreation_status();
                if (creation_status == null) {
                    statement.f(28);
                } else {
                    statement.s(28, creation_status);
                }
                if (entity.getCreation_progress() == null) {
                    statement.f(29);
                } else {
                    statement.e(r0.floatValue(), 29);
                }
                statement.c(30, entity.is_archived() ? 1L : 0L);
                statement.c(31, entity.getMarked_as_unread() ? 1L : 0L);
                Long completed_at_unix = entity.getCompleted_at_unix();
                if (completed_at_unix == null) {
                    statement.f(32);
                } else {
                    statement.c(32, completed_at_unix.longValue());
                }
                String publicationDate = entity.getPublicationDate();
                if (publicationDate == null) {
                    statement.f(33);
                } else {
                    statement.s(33, publicationDate);
                }
                String language = entity.getLanguage();
                if (language == null) {
                    statement.f(34);
                } else {
                    statement.s(34, language);
                }
                String publisherProfileId = entity.getPublisherProfileId();
                if (publisherProfileId == null) {
                    statement.f(35);
                } else {
                    statement.s(35, publisherProfileId);
                }
                statement.c(36, entity.getCan_delete() ? 1L : 0L);
                String android_product_id = entity.getAndroid_product_id();
                if (android_product_id == null) {
                    statement.f(37);
                } else {
                    statement.s(37, android_product_id);
                }
                statement.c(38, entity.is_paid() ? 1L : 0L);
                String previewAudio = entity.getPreviewAudio();
                if (previewAudio == null) {
                    statement.f(39);
                } else {
                    statement.s(39, previewAudio);
                }
                String original_audio_voice_name = entity.getOriginal_audio_voice_name();
                if (original_audio_voice_name == null) {
                    statement.f(40);
                } else {
                    statement.s(40, original_audio_voice_name);
                }
                String original_audio_voice_image = entity.getOriginal_audio_voice_image();
                if (original_audio_voice_image == null) {
                    statement.f(41);
                } else {
                    statement.s(41, original_audio_voice_image);
                }
                String voice_selection_config = entity.getVoice_selection_config();
                if (voice_selection_config == null) {
                    statement.f(42);
                } else {
                    statement.s(42, voice_selection_config);
                }
                Long sample_config_id = entity.getSample_config_id();
                if (sample_config_id == null) {
                    statement.f(43);
                } else {
                    statement.c(43, sample_config_id.longValue());
                }
                String display_mode = entity.getDisplay_mode();
                if (display_mode == null) {
                    statement.f(44);
                } else {
                    statement.s(44, display_mode);
                }
                statement.c(45, entity.getIn_user_library() ? 1L : 0L);
                statement.c(46, entity.getCan_use_assistant() ? 1L : 0L);
                String audio_type = entity.getAudio_type();
                if (audio_type == null) {
                    statement.f(47);
                } else {
                    statement.s(47, audio_type);
                }
                statement.c(48, entity.getUse_drm() ? 1L : 0L);
                String last_listened_audio_file_number = entity.getLast_listened_audio_file_number();
                if (last_listened_audio_file_number == null) {
                    statement.f(49);
                } else {
                    statement.s(49, last_listened_audio_file_number);
                }
                Double last_listened_audio_seconds = entity.getLast_listened_audio_seconds();
                if (last_listened_audio_seconds == null) {
                    statement.f(50);
                } else {
                    statement.e(last_listened_audio_seconds.doubleValue(), 50);
                }
                statement.s(51, ReadsDao_Impl.this.__listTypeConverters.fromListStringToString(entity.getAudio_types()));
                statement.c(52, entity.is_voice_changer_on() ? 1L : 0L);
                String last_used_audio_type = entity.getLast_used_audio_type();
                if (last_used_audio_type == null) {
                    statement.f(53);
                } else {
                    statement.s(53, last_used_audio_type);
                }
                String cover_image_urls = entity.getCover_image_urls();
                if (cover_image_urls == null) {
                    statement.f(54);
                } else {
                    statement.s(54, cover_image_urls);
                }
                Double cover_aspect_ratio = entity.getCover_aspect_ratio();
                if (cover_aspect_ratio == null) {
                    statement.f(55);
                } else {
                    statement.e(cover_aspect_ratio.doubleValue(), 55);
                }
                String blur_placeholder = entity.getBlur_placeholder();
                if (blur_placeholder == null) {
                    statement.f(56);
                } else {
                    statement.s(56, blur_placeholder);
                }
                statement.s(57, entity.getRead_id());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE `reads` SET `read_id` = ?,`sync_state` = ?,`article_image_url` = ?,`author` = ?,`char_count` = ?,`created_at_unix` = ?,`updated_at_unix` = ?,`added_at_unix` = ?,`description` = ?,`last_listened_char_offset` = ?,`source` = ?,`title` = ?,`subtitle` = ?,`url` = ?,`word_count` = ?,`original_file_type` = ?,`has_original_audio` = ?,`mature_content` = ?,`origin` = ?,`content_type` = ?,`genre` = ?,`html_checksum` = ?,`from_user_import` = ?,`rating_average` = ?,`rating_count` = ?,`user_rating` = ?,`last_used_voice_id` = ?,`creation_status` = ?,`creation_progress` = ?,`is_archived` = ?,`marked_as_unread` = ?,`completed_at_unix` = ?,`publicationDate` = ?,`language` = ?,`publisherProfileId` = ?,`can_delete` = ?,`android_product_id` = ?,`is_paid` = ?,`previewAudio` = ?,`original_audio_voice_name` = ?,`original_audio_voice_image` = ?,`voice_selection_config` = ?,`sample_config_id` = ?,`display_mode` = ?,`in_user_library` = ?,`can_use_assistant` = ?,`audio_type` = ?,`use_drm` = ?,`last_listened_audio_file_number` = ?,`last_listened_audio_seconds` = ?,`audio_types` = ?,`is_voice_changer_on` = ?,`last_used_audio_type` = ?,`cover_image_urls` = ?,`cover_aspect_ratio` = ?,`blur_placeholder` = ? WHERE `read_id` = ?";
            }
        });
        this.__upsertAdapterOfReadChapterEntity = new androidx.room.f(new androidx.room.e() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.15
            @Override // androidx.room.e
            public void bind(mb.c statement, ReadChapterEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.c(2, entity.getChapter_index());
                statement.s(3, entity.getChapter_name());
                statement.c(4, entity.getChar_count());
                statement.c(5, entity.getHas_summary() ? 1L : 0L);
                statement.c(6, entity.getWord_count());
                statement.c(7, entity.getStarting_char_offset());
                Double duration_seconds = entity.getDuration_seconds();
                if (duration_seconds == null) {
                    statement.f(8);
                } else {
                    statement.e(duration_seconds.doubleValue(), 8);
                }
                String audio_file_number = entity.getAudio_file_number();
                if (audio_file_number == null) {
                    statement.f(9);
                } else {
                    statement.s(9, audio_file_number);
                }
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT INTO `reads_chapters` (`read_id`,`chapter_index`,`chapter_name`,`char_count`,`has_summary`,`word_count`,`starting_char_offset`,`duration_seconds`,`audio_file_number`) VALUES (?,?,?,?,?,?,?,?,?)";
            }
        }, new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.16
            @Override // androidx.room.d
            public void bind(mb.c statement, ReadChapterEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getRead_id());
                statement.c(2, entity.getChapter_index());
                statement.s(3, entity.getChapter_name());
                statement.c(4, entity.getChar_count());
                statement.c(5, entity.getHas_summary() ? 1L : 0L);
                statement.c(6, entity.getWord_count());
                statement.c(7, entity.getStarting_char_offset());
                Double duration_seconds = entity.getDuration_seconds();
                if (duration_seconds == null) {
                    statement.f(8);
                } else {
                    statement.e(duration_seconds.doubleValue(), 8);
                }
                String audio_file_number = entity.getAudio_file_number();
                if (audio_file_number == null) {
                    statement.f(9);
                } else {
                    statement.s(9, audio_file_number);
                }
                statement.s(10, entity.getRead_id());
                statement.c(11, entity.getChapter_index());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE `reads_chapters` SET `read_id` = ?,`chapter_index` = ?,`chapter_name` = ?,`char_count` = ?,`has_summary` = ?,`word_count` = ?,`starting_char_offset` = ?,`duration_seconds` = ?,`audio_file_number` = ? WHERE `read_id` = ? AND `chapter_index` = ?";
            }
        });
        this.__upsertAdapterOfSampleConfigEntity = new androidx.room.f(new androidx.room.e() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.17
            @Override // androidx.room.e
            public void bind(mb.c statement, SampleConfigEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.c(1, entity.getId());
                statement.c(2, entity.isSample() ? 1L : 0L);
                String parentId = entity.getParentId();
                if (parentId == null) {
                    statement.f(3);
                } else {
                    statement.s(3, parentId);
                }
                String parentType = entity.getParentType();
                if (parentType == null) {
                    statement.f(4);
                } else {
                    statement.s(4, parentType);
                }
                String chapterIds = entity.getChapterIds();
                if (chapterIds == null) {
                    statement.f(5);
                } else {
                    statement.s(5, chapterIds);
                }
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT INTO `sample_config` (`id`,`is_sample`,`parent_id`,`parent_type`,`chapter_ids`) VALUES (nullif(?, 0),?,?,?,?)";
            }
        }, new androidx.room.d() { // from class: io.elevenlabs.data.database.entities.reads.ReadsDao_Impl.18
            @Override // androidx.room.d
            public void bind(mb.c statement, SampleConfigEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.c(1, entity.getId());
                statement.c(2, entity.isSample() ? 1L : 0L);
                String parentId = entity.getParentId();
                if (parentId == null) {
                    statement.f(3);
                } else {
                    statement.s(3, parentId);
                }
                String parentType = entity.getParentType();
                if (parentType == null) {
                    statement.f(4);
                } else {
                    statement.s(4, parentType);
                }
                String chapterIds = entity.getChapterIds();
                if (chapterIds == null) {
                    statement.f(5);
                } else {
                    statement.s(5, chapterIds);
                }
                statement.c(6, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE `sample_config` SET `id` = ?,`is_sample` = ?,`parent_id` = ?,`parent_type` = ?,`chapter_ids` = ? WHERE `id` = ?";
            }
        });
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

    public final String __SyncState_enumToString(SyncState _value) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[_value.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "PENDING_UPDATE_PUSH";
                }
                c6.p();
                return null;
            }
            return "PENDING_DELETE";
        }
        return "UPDATED";
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

    private final void __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(mb.a _connection, g1.e _map) {
        String Y;
        String Y2;
        g1.b bVar = (g1.b) _map.keySet();
        g1.e eVar = bVar.f10232a;
        if (eVar.isEmpty()) {
            return;
        }
        if (_map.f10374c > 999) {
            x7.e.N(_map, true, new c(this, _connection, 2));
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

    public static final z __fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity$lambda$0(ReadsDao_Impl readsDao_Impl, mb.a aVar, g1.e eVar) {
        eVar.getClass();
        readsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, eVar);
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
            x7.e.N(_map, false, new c(this, _connection, 0));
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

    public static final z __fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity$lambda$0(ReadsDao_Impl readsDao_Impl, mb.a aVar, g1.e eVar) {
        eVar.getClass();
        readsDao_Impl.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, eVar);
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
            x7.e.N(_map, true, new c(this, _connection, 1));
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

    public static final z __fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity$lambda$0(ReadsDao_Impl readsDao_Impl, mb.a aVar, g1.e eVar) {
        eVar.getClass();
        readsDao_Impl.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, eVar);
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
            x7.e.O(_map, false, new c(this, _connection, 3));
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

    public static final z __fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity$lambda$0(ReadsDao_Impl readsDao_Impl, mb.a aVar, r rVar) {
        rVar.getClass();
        readsDao_Impl.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
        return z.f31622a;
    }

    public static final z deleteChapters$lambda$0(ReadsDao_Impl readsDao_Impl, List list, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__deleteAdapterOfReadChapterEntity.handleMultiple(aVar, list);
        return z.f31622a;
    }

    public static final z deleteRead$lambda$0(ReadsDao_Impl readsDao_Impl, ReadMetaEntity readMetaEntity, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__deleteAdapterOfReadMetaEntity.handle(aVar, readMetaEntity);
        return z.f31622a;
    }

    public static final z deleteSampleConfig$lambda$0(ReadsDao_Impl readsDao_Impl, SampleConfigEntity sampleConfigEntity, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__deleteAdapterOfSampleConfigEntity.handle(aVar, sampleConfigEntity);
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map, g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r12v2, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.util.Map, g1.x0, g1.e] */
    public static final List getAll$lambda$0(String str, ReadsDao_Impl readsDao_Impl, mb.a aVar) {
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
        ReadsDao_Impl readsDao_Impl2 = readsDao_Impl;
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
            readsDao_Impl2.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, x0Var);
            readsDao_Impl2.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, x0Var2);
            readsDao_Impl2.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, x0Var3);
            readsDao_Impl2.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
            ArrayList arrayList = new ArrayList();
            ReadsDao_Impl readsDao_Impl3 = readsDao_Impl2;
            while (l02.h0()) {
                String Y8 = l02.Y(F);
                SyncState __SyncState_stringToEnum = readsDao_Impl3.__SyncState_stringToEnum(l02.Y(F2));
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
                List<String> listStringFromString = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i50));
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
                List<String> listStringFromString2 = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i82));
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
                readsDao_Impl3 = readsDao_Impl;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Map, g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r13v0, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Map, g1.x0, g1.e] */
    public static final List getAll$lambda$1(String str, Boolean bool, ReadsDao_Impl readsDao_Impl, SyncState syncState, String str2, int i10, mb.a aVar) {
        Integer valueOf;
        Integer num;
        String Y;
        String Y2;
        Long valueOf2;
        String Y3;
        String Y4;
        String Y5;
        String Y6;
        String Y7;
        String Y8;
        boolean z6;
        boolean z10;
        String Y9;
        String Y10;
        String Y11;
        boolean z11;
        Float valueOf3;
        Long valueOf4;
        Long valueOf5;
        String Y12;
        String Y13;
        Float valueOf6;
        boolean z12;
        boolean z13;
        Long valueOf7;
        String Y14;
        String Y15;
        String Y16;
        boolean z14;
        String Y17;
        boolean z15;
        String Y18;
        String Y19;
        String Y20;
        String Y21;
        Long valueOf8;
        String Y22;
        boolean z16;
        boolean z17;
        String Y23;
        boolean z18;
        String Y24;
        Double valueOf9;
        boolean z19;
        String Y25;
        String Y26;
        Double valueOf10;
        String Y27;
        Long valueOf11;
        SampleConfigEntity sampleConfigEntity;
        Long valueOf12;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        String str3 = null;
        if (bool != null) {
            try {
                valueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
            } catch (Throwable th) {
                l02.close();
                throw th;
            }
        } else {
            valueOf = null;
        }
        int i11 = 1;
        if (valueOf == null) {
            l02.f(1);
        } else {
            l02.c(1, valueOf.intValue());
        }
        if (bool != null) {
            num = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            num = null;
        }
        if (num == null) {
            l02.f(2);
        } else {
            l02.c(2, num.intValue());
        }
        l02.s(3, readsDao_Impl.__SyncState_enumToString(syncState));
        int i12 = 4;
        l02.s(4, str2);
        l02.s(5, str2);
        l02.s(6, str2);
        l02.c(7, i10);
        ?? x0Var = new x0(0);
        ?? x0Var2 = new x0(0);
        ?? x0Var3 = new x0(0);
        r rVar = new r((Object) null);
        while (l02.h0()) {
            String Y28 = l02.Y(0);
            if (!x0Var.containsKey(Y28)) {
                x0Var.put(Y28, new ArrayList());
            }
            x0Var2.put(l02.Y(0), null);
            String Y29 = l02.Y(0);
            if (!x0Var3.containsKey(Y29)) {
                x0Var3.put(Y29, new ArrayList());
            }
            if (l02.isNull(42)) {
                valueOf12 = null;
            } else {
                valueOf12 = Long.valueOf(l02.getLong(42));
            }
            if (valueOf12 != null) {
                rVar.f(valueOf12.longValue(), null);
            }
        }
        l02.reset();
        readsDao_Impl.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, x0Var);
        readsDao_Impl.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, x0Var2);
        readsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, x0Var3);
        readsDao_Impl.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
        ArrayList arrayList = new ArrayList();
        while (l02.h0()) {
            String Y30 = l02.Y(0);
            SyncState __SyncState_stringToEnum = readsDao_Impl.__SyncState_stringToEnum(l02.Y(i11));
            if (l02.isNull(2)) {
                Y = str3;
            } else {
                Y = l02.Y(2);
            }
            if (l02.isNull(3)) {
                Y2 = str3;
            } else {
                Y2 = l02.Y(3);
            }
            long j4 = l02.getLong(i12);
            long j10 = l02.getLong(5);
            long j11 = l02.getLong(6);
            if (l02.isNull(7)) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(l02.getLong(7));
            }
            if (l02.isNull(8)) {
                Y3 = null;
            } else {
                Y3 = l02.Y(8);
            }
            long j12 = l02.getLong(9);
            if (l02.isNull(10)) {
                Y4 = null;
            } else {
                Y4 = l02.Y(10);
            }
            if (l02.isNull(11)) {
                Y5 = null;
            } else {
                Y5 = l02.Y(11);
            }
            if (l02.isNull(12)) {
                Y6 = null;
            } else {
                Y6 = l02.Y(12);
            }
            if (l02.isNull(13)) {
                Y7 = null;
            } else {
                Y7 = l02.Y(13);
            }
            long j13 = l02.getLong(14);
            if (l02.isNull(15)) {
                Y8 = null;
            } else {
                Y8 = l02.Y(15);
            }
            if (((int) l02.getLong(16)) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (((int) l02.getLong(17)) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (l02.isNull(18)) {
                Y9 = null;
            } else {
                Y9 = l02.Y(18);
            }
            if (l02.isNull(19)) {
                Y10 = null;
            } else {
                Y10 = l02.Y(19);
            }
            List<String> listStringFromString = readsDao_Impl.__listTypeConverters.toListStringFromString(l02.Y(20));
            if (l02.isNull(21)) {
                Y11 = null;
            } else {
                Y11 = l02.Y(21);
            }
            if (((int) l02.getLong(22)) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (l02.isNull(23)) {
                valueOf3 = null;
            } else {
                valueOf3 = Float.valueOf((float) l02.getDouble(23));
            }
            if (l02.isNull(24)) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(l02.getLong(24));
            }
            if (l02.isNull(25)) {
                valueOf5 = null;
            } else {
                valueOf5 = Long.valueOf(l02.getLong(25));
            }
            if (l02.isNull(26)) {
                Y12 = null;
            } else {
                Y12 = l02.Y(26);
            }
            if (l02.isNull(27)) {
                Y13 = null;
            } else {
                Y13 = l02.Y(27);
            }
            if (l02.isNull(28)) {
                valueOf6 = null;
            } else {
                valueOf6 = Float.valueOf((float) l02.getDouble(28));
            }
            if (((int) l02.getLong(29)) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (((int) l02.getLong(30)) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (l02.isNull(31)) {
                valueOf7 = null;
            } else {
                valueOf7 = Long.valueOf(l02.getLong(31));
            }
            if (l02.isNull(32)) {
                Y14 = null;
            } else {
                Y14 = l02.Y(32);
            }
            if (l02.isNull(33)) {
                Y15 = null;
            } else {
                Y15 = l02.Y(33);
            }
            if (l02.isNull(34)) {
                Y16 = null;
            } else {
                Y16 = l02.Y(34);
            }
            if (((int) l02.getLong(35)) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (l02.isNull(36)) {
                Y17 = null;
            } else {
                Y17 = l02.Y(36);
            }
            if (((int) l02.getLong(37)) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (l02.isNull(38)) {
                Y18 = null;
            } else {
                Y18 = l02.Y(38);
            }
            if (l02.isNull(39)) {
                Y19 = null;
            } else {
                Y19 = l02.Y(39);
            }
            if (l02.isNull(40)) {
                Y20 = null;
            } else {
                Y20 = l02.Y(40);
            }
            if (l02.isNull(41)) {
                Y21 = null;
            } else {
                Y21 = l02.Y(41);
            }
            if (l02.isNull(42)) {
                valueOf8 = null;
            } else {
                valueOf8 = Long.valueOf(l02.getLong(42));
            }
            if (l02.isNull(43)) {
                Y22 = null;
            } else {
                Y22 = l02.Y(43);
            }
            if (((int) l02.getLong(44)) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (((int) l02.getLong(45)) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (l02.isNull(46)) {
                Y23 = null;
            } else {
                Y23 = l02.Y(46);
            }
            if (((int) l02.getLong(47)) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (l02.isNull(48)) {
                Y24 = null;
            } else {
                Y24 = l02.Y(48);
            }
            if (l02.isNull(49)) {
                valueOf9 = null;
            } else {
                valueOf9 = Double.valueOf(l02.getDouble(49));
            }
            List<String> listStringFromString2 = readsDao_Impl.__listTypeConverters.toListStringFromString(l02.Y(50));
            if (((int) l02.getLong(51)) != 0) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (l02.isNull(52)) {
                Y25 = null;
            } else {
                Y25 = l02.Y(52);
            }
            if (l02.isNull(53)) {
                Y26 = null;
            } else {
                Y26 = l02.Y(53);
            }
            if (l02.isNull(54)) {
                valueOf10 = null;
            } else {
                valueOf10 = Double.valueOf(l02.getDouble(54));
            }
            if (l02.isNull(55)) {
                Y27 = null;
            } else {
                Y27 = l02.Y(55);
            }
            ReadMetaEntity readMetaEntity = new ReadMetaEntity(Y30, __SyncState_stringToEnum, Y, Y2, j4, j10, j11, valueOf2, Y3, j12, Y4, Y5, Y6, Y7, j13, Y8, z6, z10, Y9, Y10, listStringFromString, Y11, z11, valueOf3, valueOf4, valueOf5, Y12, Y13, valueOf6, z12, z13, valueOf7, Y14, Y15, Y16, z14, Y17, z15, Y18, Y19, Y20, Y21, valueOf8, Y22, z16, z17, Y23, z18, Y24, valueOf9, listStringFromString2, z19, Y25, Y26, valueOf10, Y27);
            Object G = a0.G(x0Var, l02.Y(0));
            G.getClass();
            List list = (List) G;
            OfflineReadEntity offlineReadEntity = (OfflineReadEntity) x0Var2.get(l02.Y(0));
            Object G2 = a0.G(x0Var3, l02.Y(0));
            G2.getClass();
            List list2 = (List) G2;
            if (l02.isNull(42)) {
                valueOf11 = null;
            } else {
                valueOf11 = Long.valueOf(l02.getLong(42));
            }
            if (valueOf11 != null) {
                sampleConfigEntity = (SampleConfigEntity) rVar.b(valueOf11.longValue());
            } else {
                sampleConfigEntity = null;
            }
            arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity, list, offlineReadEntity, list2, sampleConfigEntity));
            str3 = null;
            i12 = 4;
            i11 = 1;
        }
        l02.close();
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map, g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r13v2, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.util.Map, g1.x0, g1.e] */
    public static final List getAllById$lambda$0(String str, List list, ReadsDao_Impl readsDao_Impl, mb.a aVar) {
        mb.c cVar;
        String Y;
        String Y2;
        Long valueOf;
        String Y3;
        String Y4;
        String Y5;
        String Y6;
        String Y7;
        String Y8;
        int i10;
        boolean z6;
        boolean z10;
        String Y9;
        String Y10;
        int i11;
        int i12;
        String Y11;
        boolean z11;
        int i13;
        int i14;
        Float valueOf2;
        Long valueOf3;
        Long valueOf4;
        String Y12;
        String Y13;
        int i15;
        int i16;
        Float valueOf5;
        boolean z12;
        boolean z13;
        Long valueOf6;
        String Y14;
        String Y15;
        String Y16;
        int i17;
        boolean z14;
        String Y17;
        boolean z15;
        String Y18;
        String Y19;
        String Y20;
        String Y21;
        Long valueOf7;
        String Y22;
        int i18;
        int i19;
        int i20;
        boolean z16;
        boolean z17;
        String Y23;
        boolean z18;
        String Y24;
        Double valueOf8;
        boolean z19;
        String Y25;
        String Y26;
        Double valueOf9;
        String Y27;
        Long valueOf10;
        int i21;
        SampleConfigEntity sampleConfigEntity;
        int i22;
        Long valueOf11;
        ReadsDao_Impl readsDao_Impl2 = readsDao_Impl;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            Iterator it = list.iterator();
            int i23 = 1;
            while (it.hasNext()) {
                l02.s(i23, (String) it.next());
                i23++;
            }
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
            int i24 = F12;
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
            int i25 = F11;
            ?? x0Var = new x0(0);
            int i26 = F10;
            ?? x0Var2 = new x0(0);
            int i27 = F9;
            ?? x0Var3 = new x0(0);
            int i28 = F8;
            String str2 = null;
            r rVar = new r((Object) null);
            while (l02.h0()) {
                String Y28 = l02.Y(F);
                if (!x0Var.containsKey(Y28)) {
                    i22 = F7;
                    x0Var.put(Y28, new ArrayList());
                } else {
                    i22 = F7;
                }
                x0Var2.put(l02.Y(F), null);
                String Y29 = l02.Y(F);
                if (!x0Var3.containsKey(Y29)) {
                    x0Var3.put(Y29, new ArrayList());
                }
                if (l02.isNull(F43)) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Long.valueOf(l02.getLong(F43));
                }
                if (valueOf11 != null) {
                    rVar.f(valueOf11.longValue(), null);
                    str2 = null;
                    F7 = i22;
                    F43 = F43;
                } else {
                    F7 = i22;
                    str2 = null;
                }
            }
            int i29 = F43;
            int i30 = F7;
            String str3 = str2;
            l02.reset();
            readsDao_Impl2.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, x0Var);
            readsDao_Impl2.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, x0Var2);
            readsDao_Impl2.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, x0Var3);
            readsDao_Impl2.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
            ArrayList arrayList = new ArrayList();
            ReadsDao_Impl readsDao_Impl3 = readsDao_Impl2;
            while (l02.h0()) {
                String Y30 = l02.Y(F);
                SyncState __SyncState_stringToEnum = readsDao_Impl3.__SyncState_stringToEnum(l02.Y(F2));
                if (l02.isNull(F3)) {
                    Y = str3;
                } else {
                    Y = l02.Y(F3);
                }
                if (l02.isNull(F4)) {
                    Y2 = str3;
                } else {
                    Y2 = l02.Y(F4);
                }
                long j4 = l02.getLong(F5);
                long j10 = l02.getLong(F6);
                int i31 = i30;
                long j11 = l02.getLong(i31);
                int i32 = i28;
                if (l02.isNull(i32)) {
                    valueOf = str3;
                } else {
                    valueOf = Long.valueOf(l02.getLong(i32));
                }
                int i33 = i27;
                if (l02.isNull(i33)) {
                    Y3 = null;
                } else {
                    Y3 = l02.Y(i33);
                }
                i27 = i33;
                int i34 = i26;
                long j12 = l02.getLong(i34);
                i26 = i34;
                int i35 = i25;
                if (l02.isNull(i35)) {
                    Y4 = null;
                } else {
                    Y4 = l02.Y(i35);
                }
                i25 = i35;
                int i36 = i24;
                if (l02.isNull(i36)) {
                    Y5 = null;
                } else {
                    Y5 = l02.Y(i36);
                }
                i24 = i36;
                int i37 = F13;
                if (l02.isNull(i37)) {
                    Y6 = null;
                } else {
                    Y6 = l02.Y(i37);
                }
                F13 = i37;
                int i38 = F14;
                if (l02.isNull(i38)) {
                    Y7 = null;
                } else {
                    Y7 = l02.Y(i38);
                }
                F14 = i38;
                int i39 = F15;
                long j13 = l02.getLong(i39);
                F15 = i39;
                int i40 = F16;
                if (l02.isNull(i40)) {
                    Y8 = null;
                    F16 = i40;
                    i10 = F3;
                } else {
                    Y8 = l02.Y(i40);
                    i10 = F3;
                    F16 = i40;
                }
                int i41 = F17;
                int i42 = F2;
                if (((int) l02.getLong(i41)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i43 = F18;
                int i44 = F4;
                if (((int) l02.getLong(i43)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i45 = F19;
                if (l02.isNull(i45)) {
                    Y9 = null;
                } else {
                    Y9 = l02.Y(i45);
                }
                int i46 = F20;
                if (l02.isNull(i46)) {
                    Y10 = null;
                    i12 = i41;
                    i11 = i43;
                } else {
                    Y10 = l02.Y(i46);
                    i11 = i43;
                    i12 = i41;
                }
                int i47 = F21;
                F21 = i47;
                List<String> listStringFromString = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i47));
                int i48 = F22;
                if (l02.isNull(i48)) {
                    Y11 = null;
                } else {
                    Y11 = l02.Y(i48);
                }
                int i49 = F23;
                if (((int) l02.getLong(i49)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i50 = F24;
                if (l02.isNull(i50)) {
                    i13 = i48;
                    i14 = i49;
                    valueOf2 = null;
                } else {
                    i13 = i48;
                    i14 = i49;
                    valueOf2 = Float.valueOf((float) l02.getDouble(i50));
                }
                int i51 = F25;
                if (l02.isNull(i51)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(l02.getLong(i51));
                }
                int i52 = F26;
                if (l02.isNull(i52)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(l02.getLong(i52));
                }
                F25 = i51;
                int i53 = F27;
                if (l02.isNull(i53)) {
                    Y12 = null;
                } else {
                    Y12 = l02.Y(i53);
                }
                F27 = i53;
                int i54 = F28;
                if (l02.isNull(i54)) {
                    Y13 = null;
                } else {
                    Y13 = l02.Y(i54);
                }
                F28 = i54;
                int i55 = F29;
                if (l02.isNull(i55)) {
                    i15 = i52;
                    i16 = i50;
                    valueOf5 = null;
                } else {
                    i15 = i52;
                    i16 = i50;
                    valueOf5 = Float.valueOf((float) l02.getDouble(i55));
                }
                int i56 = i13;
                int i57 = F30;
                if (((int) l02.getLong(i57)) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                F30 = i57;
                int i58 = F31;
                if (((int) l02.getLong(i58)) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i59 = F32;
                if (l02.isNull(i59)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(l02.getLong(i59));
                }
                int i60 = F33;
                if (l02.isNull(i60)) {
                    Y14 = null;
                } else {
                    Y14 = l02.Y(i60);
                }
                F32 = i59;
                int i61 = F34;
                if (l02.isNull(i61)) {
                    Y15 = null;
                } else {
                    Y15 = l02.Y(i61);
                }
                F34 = i61;
                int i62 = F35;
                if (l02.isNull(i62)) {
                    Y16 = null;
                    F35 = i62;
                    F33 = i60;
                    F31 = i58;
                    i17 = F36;
                } else {
                    Y16 = l02.Y(i62);
                    F35 = i62;
                    F33 = i60;
                    i17 = F36;
                    F31 = i58;
                }
                if (((int) l02.getLong(i17)) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i63 = F37;
                if (l02.isNull(i63)) {
                    Y17 = null;
                } else {
                    Y17 = l02.Y(i63);
                }
                F36 = i17;
                F37 = i63;
                int i64 = F38;
                if (((int) l02.getLong(i64)) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                int i65 = F39;
                if (l02.isNull(i65)) {
                    Y18 = null;
                } else {
                    Y18 = l02.Y(i65);
                }
                int i66 = F40;
                if (l02.isNull(i66)) {
                    Y19 = null;
                } else {
                    Y19 = l02.Y(i66);
                }
                F39 = i65;
                int i67 = F41;
                if (l02.isNull(i67)) {
                    Y20 = null;
                } else {
                    Y20 = l02.Y(i67);
                }
                F41 = i67;
                int i68 = F42;
                if (l02.isNull(i68)) {
                    Y21 = null;
                } else {
                    Y21 = l02.Y(i68);
                }
                F42 = i68;
                int i69 = i29;
                if (l02.isNull(i69)) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Long.valueOf(l02.getLong(i69));
                }
                F40 = i66;
                int i70 = F44;
                if (l02.isNull(i70)) {
                    Y22 = null;
                    F44 = i70;
                    i20 = i55;
                    i18 = F45;
                    i19 = i64;
                } else {
                    Y22 = l02.Y(i70);
                    F44 = i70;
                    i18 = F45;
                    i19 = i64;
                    i20 = i55;
                }
                if (((int) l02.getLong(i18)) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                int i71 = F46;
                int i72 = F5;
                if (((int) l02.getLong(i71)) != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                int i73 = F47;
                if (l02.isNull(i73)) {
                    Y23 = null;
                } else {
                    Y23 = l02.Y(i73);
                }
                int i74 = i18;
                int i75 = F48;
                if (((int) l02.getLong(i75)) != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                int i76 = F49;
                if (l02.isNull(i76)) {
                    Y24 = null;
                } else {
                    Y24 = l02.Y(i76);
                }
                int i77 = F50;
                if (l02.isNull(i77)) {
                    valueOf8 = null;
                    F49 = i76;
                    F50 = i77;
                } else {
                    valueOf8 = Double.valueOf(l02.getDouble(i77));
                    F50 = i77;
                    F49 = i76;
                }
                int i78 = F51;
                F51 = i78;
                List<String> listStringFromString2 = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i78));
                int i79 = F52;
                if (((int) l02.getLong(i79)) != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                int i80 = F53;
                if (l02.isNull(i80)) {
                    Y25 = null;
                } else {
                    Y25 = l02.Y(i80);
                }
                int i81 = F54;
                if (l02.isNull(i81)) {
                    Y26 = null;
                } else {
                    Y26 = l02.Y(i81);
                }
                int i82 = F55;
                if (l02.isNull(i82)) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Double.valueOf(l02.getDouble(i82));
                }
                F55 = i82;
                int i83 = F56;
                if (l02.isNull(i83)) {
                    Y27 = null;
                } else {
                    Y27 = l02.Y(i83);
                }
                ReadMetaEntity readMetaEntity = new ReadMetaEntity(Y30, __SyncState_stringToEnum, Y, Y2, j4, j10, j11, valueOf, Y3, j12, Y4, Y5, Y6, Y7, j13, Y8, z6, z10, Y9, Y10, listStringFromString, Y11, z11, valueOf2, valueOf3, valueOf4, Y12, Y13, valueOf5, z12, z13, valueOf6, Y14, Y15, Y16, z14, Y17, z15, Y18, Y19, Y20, Y21, valueOf7, Y22, z16, z17, Y23, z18, Y24, valueOf8, listStringFromString2, z19, Y25, Y26, valueOf9, Y27);
                F56 = i83;
                Object G = a0.G(x0Var, l02.Y(F));
                G.getClass();
                List list2 = (List) G;
                OfflineReadEntity offlineReadEntity = (OfflineReadEntity) x0Var2.get(l02.Y(F));
                Object G2 = a0.G(x0Var3, l02.Y(F));
                G2.getClass();
                List list3 = (List) G2;
                if (l02.isNull(i69)) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Long.valueOf(l02.getLong(i69));
                }
                if (valueOf10 != null) {
                    cVar = l02;
                    i21 = F;
                    try {
                        sampleConfigEntity = (SampleConfigEntity) rVar.b(valueOf10.longValue());
                    } catch (Throwable th) {
                        th = th;
                        cVar.close();
                        throw th;
                    }
                } else {
                    cVar = l02;
                    i21 = F;
                    sampleConfigEntity = null;
                }
                arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity, list2, offlineReadEntity, list3, sampleConfigEntity));
                F48 = i75;
                F5 = i72;
                F46 = i71;
                readsDao_Impl3 = readsDao_Impl;
                i29 = i69;
                i30 = i31;
                l02 = cVar;
                F = i21;
                str3 = null;
                F53 = i80;
                F54 = i81;
                F4 = i44;
                F18 = i11;
                F20 = i46;
                F23 = i14;
                F24 = i16;
                F26 = i15;
                F29 = i20;
                F38 = i19;
                F45 = i74;
                F47 = i73;
                F3 = i10;
                F52 = i79;
                i28 = i32;
                F2 = i42;
                F17 = i12;
                F19 = i45;
                F22 = i56;
            }
            l02.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cVar = l02;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map, g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r13v2, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.util.Map, g1.x0, g1.e] */
    public static final List getAllWithSyncState$lambda$0(String str, ReadsDao_Impl readsDao_Impl, SyncState syncState, mb.a aVar) {
        mb.c cVar;
        String Y;
        String Y2;
        Long valueOf;
        String Y3;
        String Y4;
        String Y5;
        String Y6;
        String Y7;
        String Y8;
        int i10;
        boolean z6;
        boolean z10;
        String Y9;
        String Y10;
        int i11;
        int i12;
        String Y11;
        boolean z11;
        int i13;
        int i14;
        Float valueOf2;
        Long valueOf3;
        Long valueOf4;
        String Y12;
        String Y13;
        int i15;
        int i16;
        Float valueOf5;
        boolean z12;
        boolean z13;
        Long valueOf6;
        String Y14;
        String Y15;
        String Y16;
        int i17;
        boolean z14;
        String Y17;
        boolean z15;
        String Y18;
        String Y19;
        String Y20;
        String Y21;
        Long valueOf7;
        String Y22;
        int i18;
        int i19;
        int i20;
        boolean z16;
        boolean z17;
        String Y23;
        boolean z18;
        String Y24;
        Double valueOf8;
        boolean z19;
        String Y25;
        String Y26;
        Double valueOf9;
        String Y27;
        Long valueOf10;
        int i21;
        SampleConfigEntity sampleConfigEntity;
        int i22;
        Long valueOf11;
        ReadsDao_Impl readsDao_Impl2 = readsDao_Impl;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, readsDao_Impl.__SyncState_enumToString(syncState));
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
            int i23 = F12;
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
            int i24 = F11;
            ?? x0Var = new x0(0);
            int i25 = F10;
            ?? x0Var2 = new x0(0);
            int i26 = F9;
            ?? x0Var3 = new x0(0);
            int i27 = F8;
            String str2 = null;
            r rVar = new r((Object) null);
            while (l02.h0()) {
                String Y28 = l02.Y(F);
                if (!x0Var.containsKey(Y28)) {
                    i22 = F7;
                    x0Var.put(Y28, new ArrayList());
                } else {
                    i22 = F7;
                }
                x0Var2.put(l02.Y(F), null);
                String Y29 = l02.Y(F);
                if (!x0Var3.containsKey(Y29)) {
                    x0Var3.put(Y29, new ArrayList());
                }
                if (l02.isNull(F43)) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Long.valueOf(l02.getLong(F43));
                }
                if (valueOf11 != null) {
                    rVar.f(valueOf11.longValue(), null);
                    str2 = null;
                    F7 = i22;
                    F43 = F43;
                } else {
                    F7 = i22;
                    str2 = null;
                }
            }
            int i28 = F43;
            int i29 = F7;
            String str3 = str2;
            l02.reset();
            readsDao_Impl2.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, x0Var);
            readsDao_Impl2.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, x0Var2);
            readsDao_Impl2.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, x0Var3);
            readsDao_Impl2.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
            ArrayList arrayList = new ArrayList();
            ReadsDao_Impl readsDao_Impl3 = readsDao_Impl2;
            while (l02.h0()) {
                String Y30 = l02.Y(F);
                SyncState __SyncState_stringToEnum = readsDao_Impl3.__SyncState_stringToEnum(l02.Y(F2));
                if (l02.isNull(F3)) {
                    Y = str3;
                } else {
                    Y = l02.Y(F3);
                }
                if (l02.isNull(F4)) {
                    Y2 = str3;
                } else {
                    Y2 = l02.Y(F4);
                }
                long j4 = l02.getLong(F5);
                long j10 = l02.getLong(F6);
                int i30 = i29;
                long j11 = l02.getLong(i30);
                int i31 = i27;
                if (l02.isNull(i31)) {
                    valueOf = str3;
                } else {
                    valueOf = Long.valueOf(l02.getLong(i31));
                }
                int i32 = i26;
                if (l02.isNull(i32)) {
                    Y3 = null;
                } else {
                    Y3 = l02.Y(i32);
                }
                i26 = i32;
                int i33 = i25;
                long j12 = l02.getLong(i33);
                i25 = i33;
                int i34 = i24;
                if (l02.isNull(i34)) {
                    Y4 = null;
                } else {
                    Y4 = l02.Y(i34);
                }
                i24 = i34;
                int i35 = i23;
                if (l02.isNull(i35)) {
                    Y5 = null;
                } else {
                    Y5 = l02.Y(i35);
                }
                i23 = i35;
                int i36 = F13;
                if (l02.isNull(i36)) {
                    Y6 = null;
                } else {
                    Y6 = l02.Y(i36);
                }
                F13 = i36;
                int i37 = F14;
                if (l02.isNull(i37)) {
                    Y7 = null;
                } else {
                    Y7 = l02.Y(i37);
                }
                F14 = i37;
                int i38 = F15;
                long j13 = l02.getLong(i38);
                F15 = i38;
                int i39 = F16;
                if (l02.isNull(i39)) {
                    Y8 = null;
                    F16 = i39;
                    i10 = F3;
                } else {
                    Y8 = l02.Y(i39);
                    i10 = F3;
                    F16 = i39;
                }
                int i40 = F17;
                int i41 = F2;
                if (((int) l02.getLong(i40)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i42 = F18;
                int i43 = F4;
                if (((int) l02.getLong(i42)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i44 = F19;
                if (l02.isNull(i44)) {
                    Y9 = null;
                } else {
                    Y9 = l02.Y(i44);
                }
                int i45 = F20;
                if (l02.isNull(i45)) {
                    Y10 = null;
                    i12 = i40;
                    i11 = i42;
                } else {
                    Y10 = l02.Y(i45);
                    i11 = i42;
                    i12 = i40;
                }
                int i46 = F21;
                F21 = i46;
                List<String> listStringFromString = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i46));
                int i47 = F22;
                if (l02.isNull(i47)) {
                    Y11 = null;
                } else {
                    Y11 = l02.Y(i47);
                }
                int i48 = F23;
                if (((int) l02.getLong(i48)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i49 = F24;
                if (l02.isNull(i49)) {
                    i13 = i47;
                    i14 = i48;
                    valueOf2 = null;
                } else {
                    i13 = i47;
                    i14 = i48;
                    valueOf2 = Float.valueOf((float) l02.getDouble(i49));
                }
                int i50 = F25;
                if (l02.isNull(i50)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(l02.getLong(i50));
                }
                int i51 = F26;
                if (l02.isNull(i51)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(l02.getLong(i51));
                }
                F25 = i50;
                int i52 = F27;
                if (l02.isNull(i52)) {
                    Y12 = null;
                } else {
                    Y12 = l02.Y(i52);
                }
                F27 = i52;
                int i53 = F28;
                if (l02.isNull(i53)) {
                    Y13 = null;
                } else {
                    Y13 = l02.Y(i53);
                }
                F28 = i53;
                int i54 = F29;
                if (l02.isNull(i54)) {
                    i15 = i51;
                    i16 = i49;
                    valueOf5 = null;
                } else {
                    i15 = i51;
                    i16 = i49;
                    valueOf5 = Float.valueOf((float) l02.getDouble(i54));
                }
                int i55 = i13;
                int i56 = F30;
                if (((int) l02.getLong(i56)) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                F30 = i56;
                int i57 = F31;
                if (((int) l02.getLong(i57)) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i58 = F32;
                if (l02.isNull(i58)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(l02.getLong(i58));
                }
                int i59 = F33;
                if (l02.isNull(i59)) {
                    Y14 = null;
                } else {
                    Y14 = l02.Y(i59);
                }
                F32 = i58;
                int i60 = F34;
                if (l02.isNull(i60)) {
                    Y15 = null;
                } else {
                    Y15 = l02.Y(i60);
                }
                F34 = i60;
                int i61 = F35;
                if (l02.isNull(i61)) {
                    Y16 = null;
                    F35 = i61;
                    F33 = i59;
                    F31 = i57;
                    i17 = F36;
                } else {
                    Y16 = l02.Y(i61);
                    F35 = i61;
                    F33 = i59;
                    i17 = F36;
                    F31 = i57;
                }
                if (((int) l02.getLong(i17)) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i62 = F37;
                if (l02.isNull(i62)) {
                    Y17 = null;
                } else {
                    Y17 = l02.Y(i62);
                }
                F36 = i17;
                F37 = i62;
                int i63 = F38;
                if (((int) l02.getLong(i63)) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                int i64 = F39;
                if (l02.isNull(i64)) {
                    Y18 = null;
                } else {
                    Y18 = l02.Y(i64);
                }
                int i65 = F40;
                if (l02.isNull(i65)) {
                    Y19 = null;
                } else {
                    Y19 = l02.Y(i65);
                }
                F39 = i64;
                int i66 = F41;
                if (l02.isNull(i66)) {
                    Y20 = null;
                } else {
                    Y20 = l02.Y(i66);
                }
                F41 = i66;
                int i67 = F42;
                if (l02.isNull(i67)) {
                    Y21 = null;
                } else {
                    Y21 = l02.Y(i67);
                }
                F42 = i67;
                int i68 = i28;
                if (l02.isNull(i68)) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Long.valueOf(l02.getLong(i68));
                }
                F40 = i65;
                int i69 = F44;
                if (l02.isNull(i69)) {
                    Y22 = null;
                    F44 = i69;
                    i20 = i54;
                    i18 = F45;
                    i19 = i63;
                } else {
                    Y22 = l02.Y(i69);
                    F44 = i69;
                    i18 = F45;
                    i19 = i63;
                    i20 = i54;
                }
                if (((int) l02.getLong(i18)) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                int i70 = F46;
                int i71 = F5;
                if (((int) l02.getLong(i70)) != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                int i72 = F47;
                if (l02.isNull(i72)) {
                    Y23 = null;
                } else {
                    Y23 = l02.Y(i72);
                }
                int i73 = i18;
                int i74 = F48;
                if (((int) l02.getLong(i74)) != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                int i75 = F49;
                if (l02.isNull(i75)) {
                    Y24 = null;
                } else {
                    Y24 = l02.Y(i75);
                }
                int i76 = F50;
                if (l02.isNull(i76)) {
                    valueOf8 = null;
                    F49 = i75;
                    F50 = i76;
                } else {
                    valueOf8 = Double.valueOf(l02.getDouble(i76));
                    F50 = i76;
                    F49 = i75;
                }
                int i77 = F51;
                F51 = i77;
                List<String> listStringFromString2 = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i77));
                int i78 = F52;
                if (((int) l02.getLong(i78)) != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                int i79 = F53;
                if (l02.isNull(i79)) {
                    Y25 = null;
                } else {
                    Y25 = l02.Y(i79);
                }
                int i80 = F54;
                if (l02.isNull(i80)) {
                    Y26 = null;
                } else {
                    Y26 = l02.Y(i80);
                }
                int i81 = F55;
                if (l02.isNull(i81)) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Double.valueOf(l02.getDouble(i81));
                }
                F55 = i81;
                int i82 = F56;
                if (l02.isNull(i82)) {
                    Y27 = null;
                } else {
                    Y27 = l02.Y(i82);
                }
                ReadMetaEntity readMetaEntity = new ReadMetaEntity(Y30, __SyncState_stringToEnum, Y, Y2, j4, j10, j11, valueOf, Y3, j12, Y4, Y5, Y6, Y7, j13, Y8, z6, z10, Y9, Y10, listStringFromString, Y11, z11, valueOf2, valueOf3, valueOf4, Y12, Y13, valueOf5, z12, z13, valueOf6, Y14, Y15, Y16, z14, Y17, z15, Y18, Y19, Y20, Y21, valueOf7, Y22, z16, z17, Y23, z18, Y24, valueOf8, listStringFromString2, z19, Y25, Y26, valueOf9, Y27);
                F56 = i82;
                Object G = a0.G(x0Var, l02.Y(F));
                G.getClass();
                List list = (List) G;
                OfflineReadEntity offlineReadEntity = (OfflineReadEntity) x0Var2.get(l02.Y(F));
                Object G2 = a0.G(x0Var3, l02.Y(F));
                G2.getClass();
                List list2 = (List) G2;
                if (l02.isNull(i68)) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Long.valueOf(l02.getLong(i68));
                }
                if (valueOf10 != null) {
                    cVar = l02;
                    i21 = F;
                    try {
                        sampleConfigEntity = (SampleConfigEntity) rVar.b(valueOf10.longValue());
                    } catch (Throwable th) {
                        th = th;
                        cVar.close();
                        throw th;
                    }
                } else {
                    cVar = l02;
                    i21 = F;
                    sampleConfigEntity = null;
                }
                arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity, list, offlineReadEntity, list2, sampleConfigEntity));
                F48 = i74;
                F5 = i71;
                F46 = i70;
                readsDao_Impl3 = readsDao_Impl;
                i28 = i68;
                i29 = i30;
                l02 = cVar;
                F = i21;
                str3 = null;
                F53 = i79;
                F54 = i80;
                F4 = i43;
                F18 = i11;
                F20 = i45;
                F23 = i14;
                F24 = i16;
                F26 = i15;
                F29 = i20;
                F38 = i19;
                F45 = i73;
                F47 = i72;
                F3 = i10;
                F52 = i78;
                i27 = i31;
                F2 = i41;
                F17 = i12;
                F19 = i44;
                F22 = i55;
            }
            l02.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cVar = l02;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map, g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r13v2, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.util.Map, g1.x0, g1.e] */
    public static final ReadMetaEntityWithChapters getById$lambda$0(String str, String str2, ReadsDao_Impl readsDao_Impl, mb.a aVar) {
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        String Y;
        String Y2;
        Long valueOf;
        String Y3;
        String Y4;
        String Y5;
        String Y6;
        String Y7;
        String Y8;
        boolean z6;
        boolean z10;
        String Y9;
        String Y10;
        String Y11;
        boolean z11;
        Float valueOf2;
        Long valueOf3;
        Long valueOf4;
        String Y12;
        String Y13;
        Float valueOf5;
        boolean z12;
        boolean z13;
        Long valueOf6;
        String Y14;
        String Y15;
        String Y16;
        boolean z14;
        String Y17;
        boolean z15;
        String Y18;
        String Y19;
        String Y20;
        String Y21;
        Long valueOf7;
        String Y22;
        boolean z16;
        boolean z17;
        String Y23;
        boolean z18;
        String Y24;
        Double valueOf8;
        boolean z19;
        String Y25;
        String Y26;
        Double valueOf9;
        String Y27;
        Long l4;
        SampleConfigEntity sampleConfigEntity;
        int i10;
        Long valueOf10;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
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
            ?? x0Var = new x0(0);
            ?? x0Var2 = new x0(0);
            ?? x0Var3 = new x0(0);
            String str3 = null;
            r rVar = new r((Object) null);
            while (l02.h0()) {
                String Y28 = l02.Y(F);
                if (!x0Var.containsKey(Y28)) {
                    i10 = F7;
                    x0Var.put(Y28, new ArrayList());
                } else {
                    i10 = F7;
                }
                x0Var2.put(l02.Y(F), null);
                String Y29 = l02.Y(F);
                if (!x0Var3.containsKey(Y29)) {
                    x0Var3.put(Y29, new ArrayList());
                }
                if (l02.isNull(F43)) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Long.valueOf(l02.getLong(F43));
                }
                if (valueOf10 != null) {
                    rVar.f(valueOf10.longValue(), null);
                    str3 = null;
                    F7 = i10;
                    F43 = F43;
                } else {
                    F7 = i10;
                    str3 = null;
                }
            }
            int i11 = F43;
            int i12 = F7;
            String str4 = str3;
            l02.reset();
            readsDao_Impl.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, x0Var);
            readsDao_Impl.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, x0Var2);
            readsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, x0Var3);
            readsDao_Impl.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
            if (l02.h0()) {
                String Y30 = l02.Y(F);
                SyncState __SyncState_stringToEnum = readsDao_Impl.__SyncState_stringToEnum(l02.Y(F2));
                if (l02.isNull(F3)) {
                    Y = str4;
                } else {
                    Y = l02.Y(F3);
                }
                if (l02.isNull(F4)) {
                    Y2 = str4;
                } else {
                    Y2 = l02.Y(F4);
                }
                long j4 = l02.getLong(F5);
                long j10 = l02.getLong(F6);
                long j11 = l02.getLong(i12);
                if (l02.isNull(F8)) {
                    valueOf = str4;
                } else {
                    valueOf = Long.valueOf(l02.getLong(F8));
                }
                if (l02.isNull(F9)) {
                    Y3 = str4;
                } else {
                    Y3 = l02.Y(F9);
                }
                long j12 = l02.getLong(F10);
                if (l02.isNull(F11)) {
                    Y4 = str4;
                } else {
                    Y4 = l02.Y(F11);
                }
                if (l02.isNull(F12)) {
                    Y5 = str4;
                } else {
                    Y5 = l02.Y(F12);
                }
                if (l02.isNull(F13)) {
                    Y6 = str4;
                } else {
                    Y6 = l02.Y(F13);
                }
                if (l02.isNull(F14)) {
                    Y7 = str4;
                } else {
                    Y7 = l02.Y(F14);
                }
                long j13 = l02.getLong(F15);
                if (l02.isNull(F16)) {
                    Y8 = str4;
                } else {
                    Y8 = l02.Y(F16);
                }
                if (((int) l02.getLong(F17)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (((int) l02.getLong(F18)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (l02.isNull(F19)) {
                    Y9 = str4;
                } else {
                    Y9 = l02.Y(F19);
                }
                if (l02.isNull(F20)) {
                    Y10 = str4;
                } else {
                    Y10 = l02.Y(F20);
                }
                List<String> listStringFromString = readsDao_Impl.__listTypeConverters.toListStringFromString(l02.Y(F21));
                if (l02.isNull(F22)) {
                    Y11 = str4;
                } else {
                    Y11 = l02.Y(F22);
                }
                if (((int) l02.getLong(F23)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (l02.isNull(F24)) {
                    valueOf2 = str4;
                } else {
                    valueOf2 = Float.valueOf((float) l02.getDouble(F24));
                }
                if (l02.isNull(F25)) {
                    valueOf3 = str4;
                } else {
                    valueOf3 = Long.valueOf(l02.getLong(F25));
                }
                if (l02.isNull(F26)) {
                    valueOf4 = str4;
                } else {
                    valueOf4 = Long.valueOf(l02.getLong(F26));
                }
                if (l02.isNull(F27)) {
                    Y12 = str4;
                } else {
                    Y12 = l02.Y(F27);
                }
                if (l02.isNull(F28)) {
                    Y13 = str4;
                } else {
                    Y13 = l02.Y(F28);
                }
                if (l02.isNull(F29)) {
                    valueOf5 = str4;
                } else {
                    valueOf5 = Float.valueOf((float) l02.getDouble(F29));
                }
                if (((int) l02.getLong(F30)) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (((int) l02.getLong(F31)) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (l02.isNull(F32)) {
                    valueOf6 = str4;
                } else {
                    valueOf6 = Long.valueOf(l02.getLong(F32));
                }
                if (l02.isNull(F33)) {
                    Y14 = str4;
                } else {
                    Y14 = l02.Y(F33);
                }
                if (l02.isNull(F34)) {
                    Y15 = str4;
                } else {
                    Y15 = l02.Y(F34);
                }
                if (l02.isNull(F35)) {
                    Y16 = str4;
                } else {
                    Y16 = l02.Y(F35);
                }
                if (((int) l02.getLong(F36)) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (l02.isNull(F37)) {
                    Y17 = str4;
                } else {
                    Y17 = l02.Y(F37);
                }
                if (((int) l02.getLong(F38)) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (l02.isNull(F39)) {
                    Y18 = str4;
                } else {
                    Y18 = l02.Y(F39);
                }
                if (l02.isNull(F40)) {
                    Y19 = str4;
                } else {
                    Y19 = l02.Y(F40);
                }
                if (l02.isNull(F41)) {
                    Y20 = str4;
                } else {
                    Y20 = l02.Y(F41);
                }
                if (l02.isNull(F42)) {
                    Y21 = str4;
                } else {
                    Y21 = l02.Y(F42);
                }
                if (l02.isNull(i11)) {
                    valueOf7 = str4;
                } else {
                    valueOf7 = Long.valueOf(l02.getLong(i11));
                }
                if (l02.isNull(F44)) {
                    Y22 = str4;
                } else {
                    Y22 = l02.Y(F44);
                }
                if (((int) l02.getLong(F45)) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (((int) l02.getLong(F46)) != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (l02.isNull(F47)) {
                    Y23 = str4;
                } else {
                    Y23 = l02.Y(F47);
                }
                if (((int) l02.getLong(F48)) != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (l02.isNull(F49)) {
                    Y24 = str4;
                } else {
                    Y24 = l02.Y(F49);
                }
                if (l02.isNull(F50)) {
                    valueOf8 = str4;
                } else {
                    valueOf8 = Double.valueOf(l02.getDouble(F50));
                }
                List<String> listStringFromString2 = readsDao_Impl.__listTypeConverters.toListStringFromString(l02.Y(F51));
                if (((int) l02.getLong(F52)) != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (l02.isNull(F53)) {
                    Y25 = str4;
                } else {
                    Y25 = l02.Y(F53);
                }
                if (l02.isNull(F54)) {
                    Y26 = str4;
                } else {
                    Y26 = l02.Y(F54);
                }
                if (l02.isNull(F55)) {
                    valueOf9 = str4;
                } else {
                    valueOf9 = Double.valueOf(l02.getDouble(F55));
                }
                if (l02.isNull(F56)) {
                    Y27 = str4;
                } else {
                    Y27 = l02.Y(F56);
                }
                ReadMetaEntity readMetaEntity = new ReadMetaEntity(Y30, __SyncState_stringToEnum, Y, Y2, j4, j10, j11, valueOf, Y3, j12, Y4, Y5, Y6, Y7, j13, Y8, z6, z10, Y9, Y10, listStringFromString, Y11, z11, valueOf2, valueOf3, valueOf4, Y12, Y13, valueOf5, z12, z13, valueOf6, Y14, Y15, Y16, z14, Y17, z15, Y18, Y19, Y20, Y21, valueOf7, Y22, z16, z17, Y23, z18, Y24, valueOf8, listStringFromString2, z19, Y25, Y26, valueOf9, Y27);
                Object G = a0.G(x0Var, l02.Y(F));
                G.getClass();
                List list = (List) G;
                OfflineReadEntity offlineReadEntity = (OfflineReadEntity) x0Var2.get(l02.Y(F));
                Object G2 = a0.G(x0Var3, l02.Y(F));
                G2.getClass();
                List list2 = (List) G2;
                if (l02.isNull(i11)) {
                    l4 = str4;
                } else {
                    l4 = Long.valueOf(l02.getLong(i11));
                }
                if (l4 != 0) {
                    sampleConfigEntity = (SampleConfigEntity) rVar.b(l4.longValue());
                } else {
                    sampleConfigEntity = str4;
                }
                readMetaEntityWithChapters = new ReadMetaEntityWithChapters(readMetaEntity, list, offlineReadEntity, list2, sampleConfigEntity);
            } else {
                readMetaEntityWithChapters = str4;
            }
            l02.close();
            return readMetaEntityWithChapters;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final ReadsDao.ChapterCharRange getChapterCharRange$lambda$0(String str, String str2, int i10, mb.a aVar) {
        ReadsDao.ChapterCharRange chapterCharRange;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            l02.c(2, i10);
            if (l02.h0()) {
                chapterCharRange = new ReadsDao.ChapterCharRange(l02.getLong(0), l02.getLong(1));
            } else {
                chapterCharRange = null;
            }
            return chapterCharRange;
        } finally {
            l02.close();
        }
    }

    public static final int getCount$lambda$0(String str, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            int i10 = 0;
            if (l02.h0()) {
                i10 = (int) l02.getLong(0);
            }
            return i10;
        } finally {
            l02.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map, g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r13v2, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.util.Map, g1.x0, g1.e] */
    public static final List getSampleReadsByParentId$lambda$0(String str, String str2, ReadsDao_Impl readsDao_Impl, mb.a aVar) {
        mb.c cVar;
        String Y;
        String Y2;
        Long valueOf;
        String Y3;
        String Y4;
        String Y5;
        String Y6;
        String Y7;
        String Y8;
        int i10;
        boolean z6;
        boolean z10;
        String Y9;
        String Y10;
        int i11;
        int i12;
        String Y11;
        boolean z11;
        int i13;
        Float valueOf2;
        Long valueOf3;
        Long valueOf4;
        String Y12;
        String Y13;
        int i14;
        int i15;
        Float valueOf5;
        boolean z12;
        boolean z13;
        Long valueOf6;
        String Y14;
        String Y15;
        String Y16;
        int i16;
        int i17;
        boolean z14;
        String Y17;
        boolean z15;
        String Y18;
        String Y19;
        String Y20;
        String Y21;
        Long valueOf7;
        String Y22;
        int i18;
        boolean z16;
        boolean z17;
        String Y23;
        boolean z18;
        String Y24;
        Double valueOf8;
        boolean z19;
        String Y25;
        String Y26;
        Double valueOf9;
        String Y27;
        Long valueOf10;
        SampleConfigEntity sampleConfigEntity;
        int i19;
        Long valueOf11;
        ReadsDao_Impl readsDao_Impl2 = readsDao_Impl;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
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
            int i20 = F12;
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
            int i21 = F11;
            ?? x0Var = new x0(0);
            int i22 = F10;
            ?? x0Var2 = new x0(0);
            int i23 = F9;
            ?? x0Var3 = new x0(0);
            int i24 = F8;
            String str3 = null;
            r rVar = new r((Object) null);
            while (l02.h0()) {
                String Y28 = l02.Y(F);
                if (!x0Var.containsKey(Y28)) {
                    i19 = F7;
                    x0Var.put(Y28, new ArrayList());
                } else {
                    i19 = F7;
                }
                x0Var2.put(l02.Y(F), null);
                String Y29 = l02.Y(F);
                if (!x0Var3.containsKey(Y29)) {
                    x0Var3.put(Y29, new ArrayList());
                }
                if (l02.isNull(F43)) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Long.valueOf(l02.getLong(F43));
                }
                if (valueOf11 != null) {
                    rVar.f(valueOf11.longValue(), null);
                    str3 = null;
                    F7 = i19;
                    F43 = F43;
                } else {
                    F7 = i19;
                    str3 = null;
                }
            }
            int i25 = F43;
            int i26 = F7;
            String str4 = str3;
            l02.reset();
            readsDao_Impl2.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, x0Var);
            readsDao_Impl2.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, x0Var2);
            readsDao_Impl2.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, x0Var3);
            readsDao_Impl2.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
            ArrayList arrayList = new ArrayList();
            ReadsDao_Impl readsDao_Impl3 = readsDao_Impl2;
            while (l02.h0()) {
                String Y30 = l02.Y(F);
                SyncState __SyncState_stringToEnum = readsDao_Impl3.__SyncState_stringToEnum(l02.Y(F2));
                if (l02.isNull(F3)) {
                    Y = str4;
                } else {
                    Y = l02.Y(F3);
                }
                if (l02.isNull(F4)) {
                    Y2 = str4;
                } else {
                    Y2 = l02.Y(F4);
                }
                long j4 = l02.getLong(F5);
                long j10 = l02.getLong(F6);
                int i27 = i26;
                long j11 = l02.getLong(i27);
                int i28 = i24;
                if (l02.isNull(i28)) {
                    valueOf = str4;
                } else {
                    valueOf = Long.valueOf(l02.getLong(i28));
                }
                int i29 = i23;
                if (l02.isNull(i29)) {
                    Y3 = null;
                } else {
                    Y3 = l02.Y(i29);
                }
                i23 = i29;
                int i30 = i22;
                long j12 = l02.getLong(i30);
                i22 = i30;
                int i31 = i21;
                if (l02.isNull(i31)) {
                    Y4 = null;
                } else {
                    Y4 = l02.Y(i31);
                }
                i21 = i31;
                int i32 = i20;
                if (l02.isNull(i32)) {
                    Y5 = null;
                } else {
                    Y5 = l02.Y(i32);
                }
                i20 = i32;
                int i33 = F13;
                if (l02.isNull(i33)) {
                    Y6 = null;
                } else {
                    Y6 = l02.Y(i33);
                }
                F13 = i33;
                int i34 = F14;
                if (l02.isNull(i34)) {
                    Y7 = null;
                } else {
                    Y7 = l02.Y(i34);
                }
                F14 = i34;
                int i35 = F15;
                long j13 = l02.getLong(i35);
                F15 = i35;
                int i36 = F16;
                if (l02.isNull(i36)) {
                    Y8 = null;
                    F16 = i36;
                    i10 = F3;
                } else {
                    Y8 = l02.Y(i36);
                    i10 = F3;
                    F16 = i36;
                }
                int i37 = F17;
                int i38 = F2;
                if (((int) l02.getLong(i37)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i39 = F18;
                int i40 = F4;
                if (((int) l02.getLong(i39)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i41 = F19;
                if (l02.isNull(i41)) {
                    Y9 = null;
                } else {
                    Y9 = l02.Y(i41);
                }
                int i42 = F20;
                if (l02.isNull(i42)) {
                    Y10 = null;
                    i12 = i37;
                    i11 = i39;
                } else {
                    Y10 = l02.Y(i42);
                    i11 = i39;
                    i12 = i37;
                }
                int i43 = F21;
                F21 = i43;
                List<String> listStringFromString = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i43));
                int i44 = F22;
                if (l02.isNull(i44)) {
                    Y11 = null;
                } else {
                    Y11 = l02.Y(i44);
                }
                int i45 = F23;
                if (((int) l02.getLong(i45)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i46 = F24;
                if (l02.isNull(i46)) {
                    i13 = F5;
                    valueOf2 = null;
                } else {
                    i13 = F5;
                    valueOf2 = Float.valueOf((float) l02.getDouble(i46));
                }
                int i47 = F25;
                if (l02.isNull(i47)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(l02.getLong(i47));
                }
                int i48 = F26;
                if (l02.isNull(i48)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(l02.getLong(i48));
                }
                int i49 = F27;
                if (l02.isNull(i49)) {
                    Y12 = null;
                } else {
                    Y12 = l02.Y(i49);
                }
                F27 = i49;
                int i50 = F28;
                if (l02.isNull(i50)) {
                    Y13 = null;
                } else {
                    Y13 = l02.Y(i50);
                }
                F28 = i50;
                int i51 = F29;
                if (l02.isNull(i51)) {
                    i14 = i45;
                    i15 = i46;
                    valueOf5 = null;
                } else {
                    i14 = i45;
                    i15 = i46;
                    valueOf5 = Float.valueOf((float) l02.getDouble(i51));
                }
                int i52 = F30;
                if (((int) l02.getLong(i52)) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i53 = F31;
                if (((int) l02.getLong(i53)) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i54 = F32;
                if (l02.isNull(i54)) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Long.valueOf(l02.getLong(i54));
                }
                int i55 = F33;
                if (l02.isNull(i55)) {
                    Y14 = null;
                } else {
                    Y14 = l02.Y(i55);
                }
                int i56 = F34;
                if (l02.isNull(i56)) {
                    Y15 = null;
                } else {
                    Y15 = l02.Y(i56);
                }
                F34 = i56;
                int i57 = F35;
                if (l02.isNull(i57)) {
                    Y16 = null;
                    F35 = i57;
                    i17 = i52;
                    i16 = F36;
                } else {
                    Y16 = l02.Y(i57);
                    F35 = i57;
                    i16 = F36;
                    i17 = i52;
                }
                if (((int) l02.getLong(i16)) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i58 = F37;
                if (l02.isNull(i58)) {
                    Y17 = null;
                } else {
                    Y17 = l02.Y(i58);
                }
                int i59 = F38;
                if (((int) l02.getLong(i59)) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                int i60 = F39;
                if (l02.isNull(i60)) {
                    Y18 = null;
                } else {
                    Y18 = l02.Y(i60);
                }
                int i61 = F40;
                if (l02.isNull(i61)) {
                    Y19 = null;
                } else {
                    Y19 = l02.Y(i61);
                }
                int i62 = i16;
                int i63 = F41;
                if (l02.isNull(i63)) {
                    Y20 = null;
                } else {
                    Y20 = l02.Y(i63);
                }
                F41 = i63;
                int i64 = F42;
                if (l02.isNull(i64)) {
                    Y21 = null;
                } else {
                    Y21 = l02.Y(i64);
                }
                F42 = i64;
                int i65 = i25;
                if (l02.isNull(i65)) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Long.valueOf(l02.getLong(i65));
                }
                int i66 = F44;
                if (l02.isNull(i66)) {
                    Y22 = null;
                    F44 = i66;
                    i18 = i60;
                } else {
                    Y22 = l02.Y(i66);
                    i18 = i60;
                    F44 = i66;
                }
                int i67 = F45;
                if (((int) l02.getLong(i67)) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                int i68 = F46;
                if (((int) l02.getLong(i68)) != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                int i69 = F47;
                if (l02.isNull(i69)) {
                    Y23 = null;
                } else {
                    Y23 = l02.Y(i69);
                }
                int i70 = F48;
                if (((int) l02.getLong(i70)) != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                int i71 = F49;
                if (l02.isNull(i71)) {
                    Y24 = null;
                } else {
                    Y24 = l02.Y(i71);
                }
                int i72 = F50;
                if (l02.isNull(i72)) {
                    valueOf8 = null;
                    F49 = i71;
                    F50 = i72;
                } else {
                    valueOf8 = Double.valueOf(l02.getDouble(i72));
                    F50 = i72;
                    F49 = i71;
                }
                int i73 = F51;
                F51 = i73;
                List<String> listStringFromString2 = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i73));
                int i74 = F52;
                if (((int) l02.getLong(i74)) != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                int i75 = F53;
                if (l02.isNull(i75)) {
                    Y25 = null;
                } else {
                    Y25 = l02.Y(i75);
                }
                int i76 = F54;
                if (l02.isNull(i76)) {
                    Y26 = null;
                } else {
                    Y26 = l02.Y(i76);
                }
                int i77 = F55;
                if (l02.isNull(i77)) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Double.valueOf(l02.getDouble(i77));
                }
                F55 = i77;
                int i78 = F56;
                if (l02.isNull(i78)) {
                    Y27 = null;
                } else {
                    Y27 = l02.Y(i78);
                }
                ReadMetaEntity readMetaEntity = new ReadMetaEntity(Y30, __SyncState_stringToEnum, Y, Y2, j4, j10, j11, valueOf, Y3, j12, Y4, Y5, Y6, Y7, j13, Y8, z6, z10, Y9, Y10, listStringFromString, Y11, z11, valueOf2, valueOf3, valueOf4, Y12, Y13, valueOf5, z12, z13, valueOf6, Y14, Y15, Y16, z14, Y17, z15, Y18, Y19, Y20, Y21, valueOf7, Y22, z16, z17, Y23, z18, Y24, valueOf8, listStringFromString2, z19, Y25, Y26, valueOf9, Y27);
                F56 = i78;
                Object G = a0.G(x0Var, l02.Y(F));
                G.getClass();
                List list = (List) G;
                OfflineReadEntity offlineReadEntity = (OfflineReadEntity) x0Var2.get(l02.Y(F));
                Object G2 = a0.G(x0Var3, l02.Y(F));
                G2.getClass();
                List list2 = (List) G2;
                if (l02.isNull(i65)) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Long.valueOf(l02.getLong(i65));
                }
                if (valueOf10 != null) {
                    cVar = l02;
                    i25 = i65;
                    try {
                        sampleConfigEntity = (SampleConfigEntity) rVar.b(valueOf10.longValue());
                    } catch (Throwable th) {
                        th = th;
                        cVar.close();
                        throw th;
                    }
                } else {
                    cVar = l02;
                    i25 = i65;
                    sampleConfigEntity = null;
                }
                arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity, list, offlineReadEntity, list2, sampleConfigEntity));
                F52 = i74;
                F2 = i38;
                F17 = i12;
                F19 = i41;
                F22 = i44;
                F25 = i47;
                F30 = i17;
                F33 = i55;
                F38 = i59;
                F45 = i67;
                F47 = i69;
                F48 = i70;
                F5 = i13;
                F24 = i15;
                F29 = i51;
                F32 = i54;
                F37 = i58;
                F40 = i61;
                F46 = i68;
                readsDao_Impl3 = readsDao_Impl;
                F54 = i76;
                F4 = i40;
                F18 = i11;
                F20 = i42;
                F23 = i14;
                F26 = i48;
                F31 = i53;
                F36 = i62;
                l02 = cVar;
                F39 = i18;
                str4 = null;
                F53 = i75;
                i26 = i27;
                F3 = i10;
                i24 = i28;
            }
            l02.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cVar = l02;
        }
    }

    public static final z insertChapters$lambda$0(ReadsDao_Impl readsDao_Impl, List list, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__upsertAdapterOfReadChapterEntity.c(aVar, list);
        return z.f31622a;
    }

    public static final z insertRead$lambda$0(ReadsDao_Impl readsDao_Impl, ReadMetaEntity readMetaEntity, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__upsertAdapterOfReadMetaEntity.b(aVar, readMetaEntity);
        return z.f31622a;
    }

    public static final long insertSampleConfig$lambda$0(ReadsDao_Impl readsDao_Impl, SampleConfigEntity sampleConfigEntity, mb.a aVar) {
        aVar.getClass();
        androidx.room.f fVar = readsDao_Impl.__upsertAdapterOfSampleConfigEntity;
        fVar.getClass();
        try {
            return fVar.f3103a.insertAndReturnId(aVar, sampleConfigEntity);
        } catch (SQLException e10) {
            androidx.room.f.a(e10);
            fVar.f3104b.handle(aVar, sampleConfigEntity);
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map, g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r13v2, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r15v28, types: [java.util.Map, g1.x0, g1.e] */
    public static final ReadMetaEntityWithChapters observeById$lambda$0(String str, String str2, ReadsDao_Impl readsDao_Impl, mb.a aVar) {
        ReadMetaEntityWithChapters readMetaEntityWithChapters;
        String Y;
        String Y2;
        Long valueOf;
        String Y3;
        String Y4;
        String Y5;
        String Y6;
        String Y7;
        String Y8;
        boolean z6;
        boolean z10;
        String Y9;
        String Y10;
        String Y11;
        boolean z11;
        Float valueOf2;
        Long valueOf3;
        Long valueOf4;
        String Y12;
        String Y13;
        Float valueOf5;
        boolean z12;
        boolean z13;
        Long valueOf6;
        String Y14;
        String Y15;
        String Y16;
        boolean z14;
        String Y17;
        boolean z15;
        String Y18;
        String Y19;
        String Y20;
        String Y21;
        Long valueOf7;
        String Y22;
        boolean z16;
        boolean z17;
        String Y23;
        boolean z18;
        String Y24;
        Double valueOf8;
        boolean z19;
        String Y25;
        String Y26;
        Double valueOf9;
        String Y27;
        Long l4;
        SampleConfigEntity sampleConfigEntity;
        int i10;
        Long valueOf10;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
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
            ?? x0Var = new x0(0);
            ?? x0Var2 = new x0(0);
            ?? x0Var3 = new x0(0);
            String str3 = null;
            r rVar = new r((Object) null);
            while (l02.h0()) {
                String Y28 = l02.Y(F);
                if (!x0Var.containsKey(Y28)) {
                    i10 = F7;
                    x0Var.put(Y28, new ArrayList());
                } else {
                    i10 = F7;
                }
                x0Var2.put(l02.Y(F), null);
                String Y29 = l02.Y(F);
                if (!x0Var3.containsKey(Y29)) {
                    x0Var3.put(Y29, new ArrayList());
                }
                if (l02.isNull(F43)) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Long.valueOf(l02.getLong(F43));
                }
                if (valueOf10 != null) {
                    rVar.f(valueOf10.longValue(), null);
                    str3 = null;
                    F7 = i10;
                    F43 = F43;
                } else {
                    F7 = i10;
                    str3 = null;
                }
            }
            int i11 = F43;
            int i12 = F7;
            String str4 = str3;
            l02.reset();
            readsDao_Impl.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, x0Var);
            readsDao_Impl.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, x0Var2);
            readsDao_Impl.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, x0Var3);
            readsDao_Impl.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar);
            if (l02.h0()) {
                String Y30 = l02.Y(F);
                SyncState __SyncState_stringToEnum = readsDao_Impl.__SyncState_stringToEnum(l02.Y(F2));
                if (l02.isNull(F3)) {
                    Y = str4;
                } else {
                    Y = l02.Y(F3);
                }
                if (l02.isNull(F4)) {
                    Y2 = str4;
                } else {
                    Y2 = l02.Y(F4);
                }
                long j4 = l02.getLong(F5);
                long j10 = l02.getLong(F6);
                long j11 = l02.getLong(i12);
                if (l02.isNull(F8)) {
                    valueOf = str4;
                } else {
                    valueOf = Long.valueOf(l02.getLong(F8));
                }
                if (l02.isNull(F9)) {
                    Y3 = str4;
                } else {
                    Y3 = l02.Y(F9);
                }
                long j12 = l02.getLong(F10);
                if (l02.isNull(F11)) {
                    Y4 = str4;
                } else {
                    Y4 = l02.Y(F11);
                }
                if (l02.isNull(F12)) {
                    Y5 = str4;
                } else {
                    Y5 = l02.Y(F12);
                }
                if (l02.isNull(F13)) {
                    Y6 = str4;
                } else {
                    Y6 = l02.Y(F13);
                }
                if (l02.isNull(F14)) {
                    Y7 = str4;
                } else {
                    Y7 = l02.Y(F14);
                }
                long j13 = l02.getLong(F15);
                if (l02.isNull(F16)) {
                    Y8 = str4;
                } else {
                    Y8 = l02.Y(F16);
                }
                if (((int) l02.getLong(F17)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (((int) l02.getLong(F18)) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (l02.isNull(F19)) {
                    Y9 = str4;
                } else {
                    Y9 = l02.Y(F19);
                }
                if (l02.isNull(F20)) {
                    Y10 = str4;
                } else {
                    Y10 = l02.Y(F20);
                }
                List<String> listStringFromString = readsDao_Impl.__listTypeConverters.toListStringFromString(l02.Y(F21));
                if (l02.isNull(F22)) {
                    Y11 = str4;
                } else {
                    Y11 = l02.Y(F22);
                }
                if (((int) l02.getLong(F23)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (l02.isNull(F24)) {
                    valueOf2 = str4;
                } else {
                    valueOf2 = Float.valueOf((float) l02.getDouble(F24));
                }
                if (l02.isNull(F25)) {
                    valueOf3 = str4;
                } else {
                    valueOf3 = Long.valueOf(l02.getLong(F25));
                }
                if (l02.isNull(F26)) {
                    valueOf4 = str4;
                } else {
                    valueOf4 = Long.valueOf(l02.getLong(F26));
                }
                if (l02.isNull(F27)) {
                    Y12 = str4;
                } else {
                    Y12 = l02.Y(F27);
                }
                if (l02.isNull(F28)) {
                    Y13 = str4;
                } else {
                    Y13 = l02.Y(F28);
                }
                if (l02.isNull(F29)) {
                    valueOf5 = str4;
                } else {
                    valueOf5 = Float.valueOf((float) l02.getDouble(F29));
                }
                if (((int) l02.getLong(F30)) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (((int) l02.getLong(F31)) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (l02.isNull(F32)) {
                    valueOf6 = str4;
                } else {
                    valueOf6 = Long.valueOf(l02.getLong(F32));
                }
                if (l02.isNull(F33)) {
                    Y14 = str4;
                } else {
                    Y14 = l02.Y(F33);
                }
                if (l02.isNull(F34)) {
                    Y15 = str4;
                } else {
                    Y15 = l02.Y(F34);
                }
                if (l02.isNull(F35)) {
                    Y16 = str4;
                } else {
                    Y16 = l02.Y(F35);
                }
                if (((int) l02.getLong(F36)) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (l02.isNull(F37)) {
                    Y17 = str4;
                } else {
                    Y17 = l02.Y(F37);
                }
                if (((int) l02.getLong(F38)) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (l02.isNull(F39)) {
                    Y18 = str4;
                } else {
                    Y18 = l02.Y(F39);
                }
                if (l02.isNull(F40)) {
                    Y19 = str4;
                } else {
                    Y19 = l02.Y(F40);
                }
                if (l02.isNull(F41)) {
                    Y20 = str4;
                } else {
                    Y20 = l02.Y(F41);
                }
                if (l02.isNull(F42)) {
                    Y21 = str4;
                } else {
                    Y21 = l02.Y(F42);
                }
                if (l02.isNull(i11)) {
                    valueOf7 = str4;
                } else {
                    valueOf7 = Long.valueOf(l02.getLong(i11));
                }
                if (l02.isNull(F44)) {
                    Y22 = str4;
                } else {
                    Y22 = l02.Y(F44);
                }
                if (((int) l02.getLong(F45)) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (((int) l02.getLong(F46)) != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (l02.isNull(F47)) {
                    Y23 = str4;
                } else {
                    Y23 = l02.Y(F47);
                }
                if (((int) l02.getLong(F48)) != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (l02.isNull(F49)) {
                    Y24 = str4;
                } else {
                    Y24 = l02.Y(F49);
                }
                if (l02.isNull(F50)) {
                    valueOf8 = str4;
                } else {
                    valueOf8 = Double.valueOf(l02.getDouble(F50));
                }
                List<String> listStringFromString2 = readsDao_Impl.__listTypeConverters.toListStringFromString(l02.Y(F51));
                if (((int) l02.getLong(F52)) != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (l02.isNull(F53)) {
                    Y25 = str4;
                } else {
                    Y25 = l02.Y(F53);
                }
                if (l02.isNull(F54)) {
                    Y26 = str4;
                } else {
                    Y26 = l02.Y(F54);
                }
                if (l02.isNull(F55)) {
                    valueOf9 = str4;
                } else {
                    valueOf9 = Double.valueOf(l02.getDouble(F55));
                }
                if (l02.isNull(F56)) {
                    Y27 = str4;
                } else {
                    Y27 = l02.Y(F56);
                }
                ReadMetaEntity readMetaEntity = new ReadMetaEntity(Y30, __SyncState_stringToEnum, Y, Y2, j4, j10, j11, valueOf, Y3, j12, Y4, Y5, Y6, Y7, j13, Y8, z6, z10, Y9, Y10, listStringFromString, Y11, z11, valueOf2, valueOf3, valueOf4, Y12, Y13, valueOf5, z12, z13, valueOf6, Y14, Y15, Y16, z14, Y17, z15, Y18, Y19, Y20, Y21, valueOf7, Y22, z16, z17, Y23, z18, Y24, valueOf8, listStringFromString2, z19, Y25, Y26, valueOf9, Y27);
                Object G = a0.G(x0Var, l02.Y(F));
                G.getClass();
                List list = (List) G;
                OfflineReadEntity offlineReadEntity = (OfflineReadEntity) x0Var2.get(l02.Y(F));
                Object G2 = a0.G(x0Var3, l02.Y(F));
                G2.getClass();
                List list2 = (List) G2;
                if (l02.isNull(i11)) {
                    l4 = str4;
                } else {
                    l4 = Long.valueOf(l02.getLong(i11));
                }
                if (l4 != 0) {
                    sampleConfigEntity = (SampleConfigEntity) rVar.b(l4.longValue());
                } else {
                    sampleConfigEntity = str4;
                }
                readMetaEntityWithChapters = new ReadMetaEntityWithChapters(readMetaEntity, list, offlineReadEntity, list2, sampleConfigEntity);
            } else {
                readMetaEntityWithChapters = str4;
            }
            l02.close();
            return readMetaEntityWithChapters;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0753 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0825 A[Catch: all -> 0x01f5, TRY_LEAVE, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07cf A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07b5 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x08ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x073c A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0722 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0708 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06ed A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06d3 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06b8 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x069d A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x067f A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0665 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x064b A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0631 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0617 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05fd A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05e2 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05c8 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05ad A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0593 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0579 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x055b A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0541 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0526 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04fe A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04e3 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c9 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04ab A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x048d A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0466 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0447 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x08b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0401 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03e7 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x03cd A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x03b2 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0395 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x038b A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x036d A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x034f A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0331 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0313 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x02fe A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x02e0 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x02be A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x02ae A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x02a2 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0297 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0414 A[Catch: all -> 0x01f5, TryCatch #1 {all -> 0x01f5, blocks: (B:3:0x000f, B:4:0x01da, B:6:0x01e0, B:8:0x01ea, B:9:0x01fc, B:11:0x020e, B:12:0x0216, B:21:0x0228, B:23:0x021e, B:26:0x023c, B:27:0x0255, B:31:0x025e, B:33:0x0264, B:77:0x0414, B:146:0x0753, B:158:0x07dc, B:174:0x0825, B:175:0x07cf, B:178:0x07d6, B:179:0x07b5, B:182:0x07bc, B:183:0x079b, B:186:0x07a2, B:187:0x0783, B:190:0x078a, B:191:0x076c, B:199:0x073c, B:202:0x0743, B:203:0x0722, B:206:0x0729, B:207:0x0708, B:212:0x06ed, B:215:0x06f4, B:216:0x06d3, B:221:0x06b8, B:226:0x069d, B:229:0x06a4, B:230:0x067f, B:233:0x0686, B:234:0x0665, B:237:0x066c, B:238:0x064b, B:241:0x0652, B:242:0x0631, B:245:0x0638, B:246:0x0617, B:249:0x061e, B:250:0x05fd, B:255:0x05e2, B:258:0x05e9, B:259:0x05c8, B:264:0x05ad, B:267:0x05b4, B:268:0x0593, B:271:0x059a, B:272:0x0579, B:275:0x0580, B:276:0x055b, B:279:0x0562, B:280:0x0541, B:285:0x0526, B:290:0x04fe, B:293:0x050c, B:294:0x04e3, B:297:0x04ea, B:298:0x04c9, B:301:0x04d0, B:302:0x04ab, B:305:0x04b2, B:306:0x048d, B:309:0x0494, B:310:0x0466, B:313:0x0473, B:314:0x0447, B:319:0x042c, B:322:0x0433, B:326:0x0401, B:329:0x0408, B:330:0x03e7, B:333:0x03ee, B:334:0x03cd, B:339:0x03b2, B:344:0x0395, B:347:0x039c, B:348:0x038b, B:349:0x036d, B:352:0x0374, B:353:0x034f, B:356:0x0356, B:357:0x0331, B:360:0x0338, B:361:0x0313, B:364:0x031a, B:365:0x02fe, B:366:0x02e0, B:369:0x02e7, B:370:0x02be, B:373:0x02c5, B:374:0x02ae, B:375:0x02a2, B:376:0x0297, B:377:0x0283, B:380:0x028a, B:381:0x0271, B:384:0x0278), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x051e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r12v2, types: [g1.x0, g1.e] */
    /* JADX WARN: Type inference failed for: r14v28, types: [g1.x0, g1.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List search$lambda$0(String str, r0 r0Var, ReadsDao_Impl readsDao_Impl, mb.a aVar) {
        mb.c cVar;
        String Y;
        String Y2;
        int i10;
        int i11;
        int i12;
        Long valueOf;
        int i13;
        int i14;
        String str2;
        long j4;
        int i15;
        int i16;
        int i17;
        int i18;
        String str3;
        int i19;
        int i20;
        String str4;
        int i21;
        int i22;
        String str5;
        int i23;
        int i24;
        String str6;
        int i25;
        String Y3;
        int i26;
        int i27;
        boolean z6;
        int i28;
        int i29;
        Map map;
        boolean z10;
        int i30;
        int i31;
        int i32;
        String Y4;
        int i33;
        String Y5;
        int i34;
        String Y6;
        int i35;
        x0 x0Var;
        boolean z11;
        int i36;
        int i37;
        int i38;
        int i39;
        Float valueOf2;
        int i40;
        int i41;
        Long valueOf3;
        int i42;
        Long valueOf4;
        int i43;
        String Y7;
        int i44;
        String Y8;
        int i45;
        int i46;
        Float valueOf5;
        int i47;
        int i48;
        int i49;
        boolean z12;
        int i50;
        int i51;
        int i52;
        boolean z13;
        int i53;
        int i54;
        Long valueOf6;
        int i55;
        int i56;
        String Y9;
        int i57;
        String Y10;
        int i58;
        String Y11;
        int i59;
        int i60;
        boolean z14;
        int i61;
        int i62;
        String Y12;
        int i63;
        int i64;
        boolean z15;
        int i65;
        int i66;
        String Y13;
        int i67;
        String Y14;
        int i68;
        String Y15;
        int i69;
        String Y16;
        int i70;
        Long valueOf7;
        int i71;
        int i72;
        String Y17;
        int i73;
        int i74;
        boolean z16;
        int i75;
        int i76;
        int i77;
        boolean z17;
        int i78;
        int i79;
        String Y18;
        int i80;
        int i81;
        r rVar;
        boolean z18;
        int i82;
        int i83;
        String Y19;
        int i84;
        int i85;
        Double valueOf8;
        int i86;
        Map map2;
        boolean z19;
        int i87;
        String Y20;
        int i88;
        String Y21;
        int i89;
        Double valueOf9;
        int i90;
        String Y22;
        Long valueOf10;
        int i91;
        r rVar2;
        SampleConfigEntity sampleConfigEntity;
        int i92;
        ReadsDao_Impl readsDao_Impl2 = readsDao_Impl;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            r0Var.f3192a.invoke(l02);
            int E = l.E(l02, "read_id");
            int s10 = l.s(l02, "sync_state");
            int s11 = l.s(l02, "article_image_url");
            int s12 = l.s(l02, "author");
            int s13 = l.s(l02, "char_count");
            int s14 = l.s(l02, "created_at_unix");
            int s15 = l.s(l02, "updated_at_unix");
            int s16 = l.s(l02, "added_at_unix");
            int s17 = l.s(l02, "description");
            int s18 = l.s(l02, "last_listened_char_offset");
            int s19 = l.s(l02, "source");
            int s20 = l.s(l02, "title");
            int s21 = l.s(l02, "subtitle");
            int s22 = l.s(l02, "url");
            int s23 = l.s(l02, "word_count");
            int s24 = l.s(l02, "original_file_type");
            int s25 = l.s(l02, "has_original_audio");
            int s26 = l.s(l02, "mature_content");
            int s27 = l.s(l02, FirebaseAnalytics.Param.ORIGIN);
            int s28 = l.s(l02, FirebaseAnalytics.Param.CONTENT_TYPE);
            int s29 = l.s(l02, "genre");
            int s30 = l.s(l02, "html_checksum");
            int s31 = l.s(l02, "from_user_import");
            int s32 = l.s(l02, "rating_average");
            int s33 = l.s(l02, "rating_count");
            int s34 = l.s(l02, "user_rating");
            int s35 = l.s(l02, "last_used_voice_id");
            int s36 = l.s(l02, "creation_status");
            int s37 = l.s(l02, "creation_progress");
            int s38 = l.s(l02, "is_archived");
            int s39 = l.s(l02, "marked_as_unread");
            int s40 = l.s(l02, "completed_at_unix");
            int s41 = l.s(l02, "publicationDate");
            int s42 = l.s(l02, "language");
            int s43 = l.s(l02, "publisherProfileId");
            int s44 = l.s(l02, "can_delete");
            int s45 = l.s(l02, "android_product_id");
            int s46 = l.s(l02, "is_paid");
            int s47 = l.s(l02, "previewAudio");
            int s48 = l.s(l02, "original_audio_voice_name");
            int s49 = l.s(l02, "original_audio_voice_image");
            int s50 = l.s(l02, "voice_selection_config");
            int s51 = l.s(l02, "sample_config_id");
            int i93 = s20;
            int s52 = l.s(l02, "display_mode");
            int s53 = l.s(l02, "in_user_library");
            int s54 = l.s(l02, "can_use_assistant");
            int s55 = l.s(l02, "audio_type");
            int s56 = l.s(l02, "use_drm");
            int s57 = l.s(l02, "last_listened_audio_file_number");
            int s58 = l.s(l02, "last_listened_audio_seconds");
            int s59 = l.s(l02, "audio_types");
            int s60 = l.s(l02, "is_voice_changer_on");
            int s61 = l.s(l02, "last_used_audio_type");
            int s62 = l.s(l02, "cover_image_urls");
            int s63 = l.s(l02, "cover_aspect_ratio");
            int s64 = l.s(l02, "blur_placeholder");
            int i94 = s19;
            ?? x0Var2 = new x0(0);
            int i95 = s18;
            ?? x0Var3 = new x0(0);
            int i96 = s17;
            ?? x0Var4 = new x0(0);
            int i97 = s16;
            String str7 = null;
            r rVar3 = new r((Object) null);
            while (l02.h0()) {
                String Y23 = l02.Y(E);
                if (x0Var2.containsKey(Y23)) {
                    i92 = s15;
                } else {
                    i92 = s15;
                    x0Var2.put(Y23, new ArrayList());
                }
                x0Var3.put(l02.Y(E), null);
                String Y24 = l02.Y(E);
                if (!x0Var4.containsKey(Y24)) {
                    x0Var4.put(Y24, new ArrayList());
                }
                Long valueOf11 = l02.isNull(s51) ? null : Long.valueOf(l02.getLong(s51));
                if (valueOf11 != null) {
                    rVar3.f(valueOf11.longValue(), null);
                    str7 = null;
                    s15 = i92;
                    s51 = s51;
                } else {
                    s15 = i92;
                    str7 = null;
                }
            }
            int i98 = s15;
            int i99 = s51;
            String str8 = str7;
            l02.reset();
            readsDao_Impl2.__fetchRelationshipreadsChaptersAsioElevenlabsDataDatabaseEntitiesReadsReadChapterEntity(aVar, x0Var2);
            readsDao_Impl2.__fetchRelationshipofflineReadAsioElevenlabsDataDatabaseEntitiesOfflineOfflineReadEntity(aVar, x0Var3);
            readsDao_Impl2.__fetchRelationshipofflineChapterAsioElevenlabsDataDatabaseEntitiesOfflineOfflineChapterEntity(aVar, x0Var4);
            readsDao_Impl2.__fetchRelationshipsampleConfigAsioElevenlabsDataDatabaseEntitiesReadsSampleConfigEntity(aVar, rVar3);
            ArrayList arrayList = new ArrayList();
            ReadsDao_Impl readsDao_Impl3 = readsDao_Impl2;
            Map map3 = x0Var4;
            x0 x0Var5 = x0Var3;
            Map map4 = x0Var2;
            while (l02.h0()) {
                if (E != -1) {
                    String Y25 = l02.Y(E);
                    if (s10 != -1) {
                        SyncState __SyncState_stringToEnum = readsDao_Impl3.__SyncState_stringToEnum(l02.Y(s10));
                        if (s11 != -1 && !l02.isNull(s11)) {
                            Y = l02.Y(s11);
                            if (s12 != -1 && !l02.isNull(s12)) {
                                Y2 = l02.Y(s12);
                                long j10 = s13 != -1 ? 0L : l02.getLong(s13);
                                long j11 = s14 != -1 ? 0L : l02.getLong(s14);
                                int i100 = i98;
                                long j12 = i100 != -1 ? 0L : l02.getLong(i100);
                                i10 = i97;
                                if (i10 != -1 && !l02.isNull(i10)) {
                                    int i101 = i96;
                                    i11 = s10;
                                    i12 = i101;
                                    valueOf = Long.valueOf(l02.getLong(i10));
                                    if (i12 != -1 && !l02.isNull(i12)) {
                                        String Y26 = l02.Y(i12);
                                        int i102 = i95;
                                        i13 = i12;
                                        i14 = i102;
                                        str2 = Y26;
                                        if (i14 != -1) {
                                            int i103 = i94;
                                            i15 = i14;
                                            i16 = i103;
                                            j4 = 0;
                                        } else {
                                            j4 = l02.getLong(i14);
                                            int i104 = i94;
                                            i15 = i14;
                                            i16 = i104;
                                        }
                                        if (i16 != -1 && !l02.isNull(i16)) {
                                            String Y27 = l02.Y(i16);
                                            int i105 = i93;
                                            i17 = i16;
                                            i18 = i105;
                                            str3 = Y27;
                                            if (i18 != -1 && !l02.isNull(i18)) {
                                                String Y28 = l02.Y(i18);
                                                int i106 = i18;
                                                i19 = s21;
                                                i20 = i106;
                                                str4 = Y28;
                                                if (i19 != -1 && !l02.isNull(i19)) {
                                                    String Y29 = l02.Y(i19);
                                                    int i107 = i19;
                                                    i21 = s22;
                                                    i22 = i107;
                                                    str5 = Y29;
                                                    if (i21 != -1 && !l02.isNull(i21)) {
                                                        String Y30 = l02.Y(i21);
                                                        int i108 = s23;
                                                        i23 = i21;
                                                        i24 = i108;
                                                        str6 = Y30;
                                                        i25 = s24;
                                                        int i109 = i24;
                                                        long j13 = i24 != -1 ? l02.getLong(i24) : 0L;
                                                        if (i25 != -1 && !l02.isNull(i25)) {
                                                            Y3 = l02.Y(i25);
                                                            boolean z20 = true;
                                                            i26 = s25;
                                                            if (i26 != -1) {
                                                                i27 = i100;
                                                                z6 = false;
                                                                i28 = -1;
                                                            } else {
                                                                i27 = i100;
                                                                z6 = ((int) l02.getLong(i26)) != 0;
                                                                i28 = -1;
                                                            }
                                                            i29 = s26;
                                                            if (i29 != i28) {
                                                                map = map3;
                                                                z10 = false;
                                                                i30 = i28;
                                                            } else {
                                                                map = map3;
                                                                z10 = ((int) l02.getLong(i29)) != 0;
                                                                i30 = -1;
                                                            }
                                                            i31 = s27;
                                                            if (i31 != i30 && !l02.isNull(i31)) {
                                                                i32 = i26;
                                                                Y4 = l02.Y(i31);
                                                                i33 = s28;
                                                                if (i33 != i30 && !l02.isNull(i33)) {
                                                                    s28 = i33;
                                                                    Y5 = l02.Y(i33);
                                                                    i34 = s29;
                                                                    if (i34 == i30) {
                                                                        s29 = i34;
                                                                        List<String> listStringFromString = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i34));
                                                                        int i110 = s30;
                                                                        if (i110 != -1 && !l02.isNull(i110)) {
                                                                            s30 = i110;
                                                                            Y6 = l02.Y(i110);
                                                                            i35 = s31;
                                                                            if (i35 != -1) {
                                                                                x0Var = x0Var5;
                                                                                z11 = false;
                                                                                i36 = -1;
                                                                            } else {
                                                                                x0Var = x0Var5;
                                                                                z11 = ((int) l02.getLong(i35)) != 0;
                                                                                i36 = -1;
                                                                            }
                                                                            i37 = s32;
                                                                            if (i37 != i36) {
                                                                                int i111 = i36;
                                                                                i39 = s11;
                                                                                i41 = i111;
                                                                                i38 = i35;
                                                                                i40 = s33;
                                                                            } else if (l02.isNull(i37)) {
                                                                                i38 = i35;
                                                                                i39 = s11;
                                                                                i40 = s33;
                                                                                i41 = -1;
                                                                            } else {
                                                                                i38 = i35;
                                                                                i39 = s11;
                                                                                valueOf2 = Float.valueOf((float) l02.getDouble(i37));
                                                                                i40 = s33;
                                                                                i41 = -1;
                                                                                if (i40 != i41 && !l02.isNull(i40)) {
                                                                                    s33 = i40;
                                                                                    valueOf3 = Long.valueOf(l02.getLong(i40));
                                                                                    i42 = s34;
                                                                                    if (i42 != i41 && !l02.isNull(i42)) {
                                                                                        s34 = i42;
                                                                                        valueOf4 = Long.valueOf(l02.getLong(i42));
                                                                                        i43 = s35;
                                                                                        if (i43 != i41 && !l02.isNull(i43)) {
                                                                                            s35 = i43;
                                                                                            Y7 = l02.Y(i43);
                                                                                            i44 = s36;
                                                                                            if (i44 != i41 && !l02.isNull(i44)) {
                                                                                                s36 = i44;
                                                                                                Y8 = l02.Y(i44);
                                                                                                i45 = s37;
                                                                                                if (i45 == i41) {
                                                                                                    i46 = s12;
                                                                                                    valueOf5 = null;
                                                                                                    i48 = i41;
                                                                                                    i47 = s38;
                                                                                                } else if (l02.isNull(i45)) {
                                                                                                    i46 = s12;
                                                                                                    i47 = s38;
                                                                                                    i48 = -1;
                                                                                                    valueOf5 = null;
                                                                                                } else {
                                                                                                    i46 = s12;
                                                                                                    valueOf5 = Float.valueOf((float) l02.getDouble(i45));
                                                                                                    i47 = s38;
                                                                                                    i48 = -1;
                                                                                                }
                                                                                                if (i47 == i48) {
                                                                                                    i49 = s13;
                                                                                                    z12 = false;
                                                                                                    i50 = i48;
                                                                                                } else {
                                                                                                    i49 = s13;
                                                                                                    z12 = ((int) l02.getLong(i47)) != 0;
                                                                                                    i50 = -1;
                                                                                                }
                                                                                                i51 = s39;
                                                                                                if (i51 == i50) {
                                                                                                    i52 = s14;
                                                                                                    z13 = false;
                                                                                                    i53 = i50;
                                                                                                } else {
                                                                                                    i52 = s14;
                                                                                                    z13 = ((int) l02.getLong(i51)) != 0;
                                                                                                    i53 = -1;
                                                                                                }
                                                                                                i54 = s40;
                                                                                                if (i54 != i53 && !l02.isNull(i54)) {
                                                                                                    valueOf6 = Long.valueOf(l02.getLong(i54));
                                                                                                    i55 = i45;
                                                                                                    i56 = s41;
                                                                                                    if (i56 != i53 && !l02.isNull(i56)) {
                                                                                                        s41 = i56;
                                                                                                        Y9 = l02.Y(i56);
                                                                                                        i57 = s42;
                                                                                                        if (i57 != i53 && !l02.isNull(i57)) {
                                                                                                            s42 = i57;
                                                                                                            Y10 = l02.Y(i57);
                                                                                                            i58 = s43;
                                                                                                            if (i58 != i53 && !l02.isNull(i58)) {
                                                                                                                s43 = i58;
                                                                                                                Y11 = l02.Y(i58);
                                                                                                                i59 = s44;
                                                                                                                if (i59 == i53) {
                                                                                                                    i60 = i29;
                                                                                                                    z14 = false;
                                                                                                                    i61 = i53;
                                                                                                                } else {
                                                                                                                    i60 = i29;
                                                                                                                    z14 = ((int) l02.getLong(i59)) != 0;
                                                                                                                    i61 = -1;
                                                                                                                }
                                                                                                                i62 = s45;
                                                                                                                if (i62 != i61 && !l02.isNull(i62)) {
                                                                                                                    Y12 = l02.Y(i62);
                                                                                                                    s44 = i59;
                                                                                                                    i63 = s46;
                                                                                                                    if (i63 == i61) {
                                                                                                                        i64 = i31;
                                                                                                                        z15 = false;
                                                                                                                        i65 = i61;
                                                                                                                    } else {
                                                                                                                        i64 = i31;
                                                                                                                        z15 = ((int) l02.getLong(i63)) != 0;
                                                                                                                        i65 = -1;
                                                                                                                    }
                                                                                                                    i66 = s47;
                                                                                                                    if (i66 != i65 && !l02.isNull(i66)) {
                                                                                                                        Y13 = l02.Y(i66);
                                                                                                                        s46 = i63;
                                                                                                                        i67 = s48;
                                                                                                                        if (i67 != i65 && !l02.isNull(i67)) {
                                                                                                                            s48 = i67;
                                                                                                                            Y14 = l02.Y(i67);
                                                                                                                            i68 = s49;
                                                                                                                            if (i68 != i65 && !l02.isNull(i68)) {
                                                                                                                                s49 = i68;
                                                                                                                                Y15 = l02.Y(i68);
                                                                                                                                i69 = s50;
                                                                                                                                if (i69 != i65 && !l02.isNull(i69)) {
                                                                                                                                    s50 = i69;
                                                                                                                                    Y16 = l02.Y(i69);
                                                                                                                                    i70 = i99;
                                                                                                                                    if (i70 != i65 && !l02.isNull(i70)) {
                                                                                                                                        valueOf7 = Long.valueOf(l02.getLong(i70));
                                                                                                                                        i71 = i47;
                                                                                                                                        i72 = s52;
                                                                                                                                        if (i72 != i65 && !l02.isNull(i72)) {
                                                                                                                                            Y17 = l02.Y(i72);
                                                                                                                                            s52 = i72;
                                                                                                                                            i73 = s53;
                                                                                                                                            if (i73 == i65) {
                                                                                                                                                i74 = i37;
                                                                                                                                                z16 = false;
                                                                                                                                                i75 = i65;
                                                                                                                                            } else {
                                                                                                                                                i74 = i37;
                                                                                                                                                z16 = ((int) l02.getLong(i73)) != 0;
                                                                                                                                                i75 = -1;
                                                                                                                                            }
                                                                                                                                            i76 = s54;
                                                                                                                                            if (i76 == i75) {
                                                                                                                                                i77 = i39;
                                                                                                                                                z17 = false;
                                                                                                                                                i78 = i75;
                                                                                                                                            } else {
                                                                                                                                                i77 = i39;
                                                                                                                                                z17 = ((int) l02.getLong(i76)) != 0;
                                                                                                                                                i78 = -1;
                                                                                                                                            }
                                                                                                                                            i79 = s55;
                                                                                                                                            if (i79 != i78 && !l02.isNull(i79)) {
                                                                                                                                                Y18 = l02.Y(i79);
                                                                                                                                                i80 = i73;
                                                                                                                                                i81 = s56;
                                                                                                                                                if (i81 == i78) {
                                                                                                                                                    rVar = rVar3;
                                                                                                                                                    z18 = false;
                                                                                                                                                    i82 = i78;
                                                                                                                                                } else {
                                                                                                                                                    rVar = rVar3;
                                                                                                                                                    z18 = ((int) l02.getLong(i81)) != 0;
                                                                                                                                                    i82 = -1;
                                                                                                                                                }
                                                                                                                                                i83 = s57;
                                                                                                                                                if (i83 != i82 && !l02.isNull(i83)) {
                                                                                                                                                    Y19 = l02.Y(i83);
                                                                                                                                                    i84 = i81;
                                                                                                                                                    i85 = s58;
                                                                                                                                                    if (i85 != i82 && !l02.isNull(i85)) {
                                                                                                                                                        valueOf8 = Double.valueOf(l02.getDouble(i85));
                                                                                                                                                        s58 = i85;
                                                                                                                                                        i86 = s59;
                                                                                                                                                        if (i86 != i82) {
                                                                                                                                                            s59 = i86;
                                                                                                                                                            List<String> listStringFromString2 = readsDao_Impl3.__listTypeConverters.toListStringFromString(l02.Y(i86));
                                                                                                                                                            int i112 = s60;
                                                                                                                                                            if (i112 == -1) {
                                                                                                                                                                map2 = map4;
                                                                                                                                                                z19 = false;
                                                                                                                                                                i87 = -1;
                                                                                                                                                            } else {
                                                                                                                                                                map2 = map4;
                                                                                                                                                                if (((int) l02.getLong(i112)) == 0) {
                                                                                                                                                                    z20 = false;
                                                                                                                                                                }
                                                                                                                                                                z19 = z20;
                                                                                                                                                                i87 = -1;
                                                                                                                                                            }
                                                                                                                                                            int i113 = s61;
                                                                                                                                                            if (i113 != i87 && !l02.isNull(i113)) {
                                                                                                                                                                Y20 = l02.Y(i113);
                                                                                                                                                                i88 = s62;
                                                                                                                                                                if (i88 != i87 && !l02.isNull(i88)) {
                                                                                                                                                                    s62 = i88;
                                                                                                                                                                    Y21 = l02.Y(i88);
                                                                                                                                                                    i89 = s63;
                                                                                                                                                                    if (i89 != i87 && !l02.isNull(i89)) {
                                                                                                                                                                        s63 = i89;
                                                                                                                                                                        valueOf9 = Double.valueOf(l02.getDouble(i89));
                                                                                                                                                                        i90 = s64;
                                                                                                                                                                        if (i90 != i87 && !l02.isNull(i90)) {
                                                                                                                                                                            Y22 = l02.Y(i90);
                                                                                                                                                                            ReadMetaEntity readMetaEntity = new ReadMetaEntity(Y25, __SyncState_stringToEnum, Y, Y2, j10, j11, j12, valueOf, str2, j4, str3, str4, str5, str6, j13, Y3, z6, z10, Y4, Y5, listStringFromString, Y6, z11, valueOf2, valueOf3, valueOf4, Y7, Y8, valueOf5, z12, z13, valueOf6, Y9, Y10, Y11, z14, Y12, z15, Y13, Y14, Y15, Y16, valueOf7, Y17, z16, z17, Y18, z18, Y19, valueOf8, listStringFromString2, z19, Y20, Y21, valueOf9, Y22);
                                                                                                                                                                            s64 = i90;
                                                                                                                                                                            Map map5 = map2;
                                                                                                                                                                            Object G = a0.G(map5, l02.Y(E));
                                                                                                                                                                            G.getClass();
                                                                                                                                                                            List list = (List) G;
                                                                                                                                                                            x0 x0Var6 = x0Var;
                                                                                                                                                                            OfflineReadEntity offlineReadEntity = (OfflineReadEntity) x0Var6.get(l02.Y(E));
                                                                                                                                                                            Map map6 = map;
                                                                                                                                                                            Object G2 = a0.G(map6, l02.Y(E));
                                                                                                                                                                            G2.getClass();
                                                                                                                                                                            List list2 = (List) G2;
                                                                                                                                                                            valueOf10 = !l02.isNull(i70) ? null : Long.valueOf(l02.getLong(i70));
                                                                                                                                                                            if (valueOf10 == null) {
                                                                                                                                                                                cVar = l02;
                                                                                                                                                                                i91 = E;
                                                                                                                                                                                try {
                                                                                                                                                                                    long longValue = valueOf10.longValue();
                                                                                                                                                                                    rVar2 = rVar;
                                                                                                                                                                                    sampleConfigEntity = (SampleConfigEntity) rVar2.b(longValue);
                                                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                                                    th = th;
                                                                                                                                                                                    cVar.close();
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                cVar = l02;
                                                                                                                                                                                i91 = E;
                                                                                                                                                                                rVar2 = rVar;
                                                                                                                                                                                sampleConfigEntity = null;
                                                                                                                                                                            }
                                                                                                                                                                            arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity, list, offlineReadEntity, list2, sampleConfigEntity));
                                                                                                                                                                            int i114 = i55;
                                                                                                                                                                            s39 = i51;
                                                                                                                                                                            s12 = i46;
                                                                                                                                                                            s37 = i114;
                                                                                                                                                                            i99 = i70;
                                                                                                                                                                            i97 = i10;
                                                                                                                                                                            l02 = cVar;
                                                                                                                                                                            s26 = i60;
                                                                                                                                                                            s56 = i84;
                                                                                                                                                                            E = i91;
                                                                                                                                                                            s10 = i11;
                                                                                                                                                                            i98 = i27;
                                                                                                                                                                            str8 = null;
                                                                                                                                                                            s40 = i54;
                                                                                                                                                                            s57 = i83;
                                                                                                                                                                            s61 = i113;
                                                                                                                                                                            rVar3 = rVar2;
                                                                                                                                                                            s13 = i49;
                                                                                                                                                                            s25 = i32;
                                                                                                                                                                            x0Var5 = x0Var6;
                                                                                                                                                                            s31 = i38;
                                                                                                                                                                            s27 = i64;
                                                                                                                                                                            s32 = i74;
                                                                                                                                                                            s53 = i80;
                                                                                                                                                                            map4 = map5;
                                                                                                                                                                            i96 = i13;
                                                                                                                                                                            s60 = i112;
                                                                                                                                                                            s45 = i62;
                                                                                                                                                                            s55 = i79;
                                                                                                                                                                            s14 = i52;
                                                                                                                                                                            s38 = i71;
                                                                                                                                                                            s11 = i77;
                                                                                                                                                                            i95 = i15;
                                                                                                                                                                            map3 = map6;
                                                                                                                                                                            s47 = i66;
                                                                                                                                                                            s54 = i76;
                                                                                                                                                                            i94 = i17;
                                                                                                                                                                            i93 = i20;
                                                                                                                                                                            s21 = i22;
                                                                                                                                                                            readsDao_Impl3 = readsDao_Impl;
                                                                                                                                                                            s22 = i23;
                                                                                                                                                                            s23 = i109;
                                                                                                                                                                            s24 = i25;
                                                                                                                                                                        }
                                                                                                                                                                        Y22 = null;
                                                                                                                                                                        ReadMetaEntity readMetaEntity2 = new ReadMetaEntity(Y25, __SyncState_stringToEnum, Y, Y2, j10, j11, j12, valueOf, str2, j4, str3, str4, str5, str6, j13, Y3, z6, z10, Y4, Y5, listStringFromString, Y6, z11, valueOf2, valueOf3, valueOf4, Y7, Y8, valueOf5, z12, z13, valueOf6, Y9, Y10, Y11, z14, Y12, z15, Y13, Y14, Y15, Y16, valueOf7, Y17, z16, z17, Y18, z18, Y19, valueOf8, listStringFromString2, z19, Y20, Y21, valueOf9, Y22);
                                                                                                                                                                        s64 = i90;
                                                                                                                                                                        Map map52 = map2;
                                                                                                                                                                        Object G3 = a0.G(map52, l02.Y(E));
                                                                                                                                                                        G3.getClass();
                                                                                                                                                                        List list3 = (List) G3;
                                                                                                                                                                        x0 x0Var62 = x0Var;
                                                                                                                                                                        OfflineReadEntity offlineReadEntity2 = (OfflineReadEntity) x0Var62.get(l02.Y(E));
                                                                                                                                                                        Map map62 = map;
                                                                                                                                                                        Object G22 = a0.G(map62, l02.Y(E));
                                                                                                                                                                        G22.getClass();
                                                                                                                                                                        List list22 = (List) G22;
                                                                                                                                                                        if (!l02.isNull(i70)) {
                                                                                                                                                                        }
                                                                                                                                                                        if (valueOf10 == null) {
                                                                                                                                                                        }
                                                                                                                                                                        arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity2, list3, offlineReadEntity2, list22, sampleConfigEntity));
                                                                                                                                                                        int i1142 = i55;
                                                                                                                                                                        s39 = i51;
                                                                                                                                                                        s12 = i46;
                                                                                                                                                                        s37 = i1142;
                                                                                                                                                                        i99 = i70;
                                                                                                                                                                        i97 = i10;
                                                                                                                                                                        l02 = cVar;
                                                                                                                                                                        s26 = i60;
                                                                                                                                                                        s56 = i84;
                                                                                                                                                                        E = i91;
                                                                                                                                                                        s10 = i11;
                                                                                                                                                                        i98 = i27;
                                                                                                                                                                        str8 = null;
                                                                                                                                                                        s40 = i54;
                                                                                                                                                                        s57 = i83;
                                                                                                                                                                        s61 = i113;
                                                                                                                                                                        rVar3 = rVar2;
                                                                                                                                                                        s13 = i49;
                                                                                                                                                                        s25 = i32;
                                                                                                                                                                        x0Var5 = x0Var62;
                                                                                                                                                                        s31 = i38;
                                                                                                                                                                        s27 = i64;
                                                                                                                                                                        s32 = i74;
                                                                                                                                                                        s53 = i80;
                                                                                                                                                                        map4 = map52;
                                                                                                                                                                        i96 = i13;
                                                                                                                                                                        s60 = i112;
                                                                                                                                                                        s45 = i62;
                                                                                                                                                                        s55 = i79;
                                                                                                                                                                        s14 = i52;
                                                                                                                                                                        s38 = i71;
                                                                                                                                                                        s11 = i77;
                                                                                                                                                                        i95 = i15;
                                                                                                                                                                        map3 = map62;
                                                                                                                                                                        s47 = i66;
                                                                                                                                                                        s54 = i76;
                                                                                                                                                                        i94 = i17;
                                                                                                                                                                        i93 = i20;
                                                                                                                                                                        s21 = i22;
                                                                                                                                                                        readsDao_Impl3 = readsDao_Impl;
                                                                                                                                                                        s22 = i23;
                                                                                                                                                                        s23 = i109;
                                                                                                                                                                        s24 = i25;
                                                                                                                                                                    }
                                                                                                                                                                    s63 = i89;
                                                                                                                                                                    i90 = s64;
                                                                                                                                                                    valueOf9 = null;
                                                                                                                                                                    if (i90 != i87) {
                                                                                                                                                                        Y22 = l02.Y(i90);
                                                                                                                                                                        ReadMetaEntity readMetaEntity22 = new ReadMetaEntity(Y25, __SyncState_stringToEnum, Y, Y2, j10, j11, j12, valueOf, str2, j4, str3, str4, str5, str6, j13, Y3, z6, z10, Y4, Y5, listStringFromString, Y6, z11, valueOf2, valueOf3, valueOf4, Y7, Y8, valueOf5, z12, z13, valueOf6, Y9, Y10, Y11, z14, Y12, z15, Y13, Y14, Y15, Y16, valueOf7, Y17, z16, z17, Y18, z18, Y19, valueOf8, listStringFromString2, z19, Y20, Y21, valueOf9, Y22);
                                                                                                                                                                        s64 = i90;
                                                                                                                                                                        Map map522 = map2;
                                                                                                                                                                        Object G32 = a0.G(map522, l02.Y(E));
                                                                                                                                                                        G32.getClass();
                                                                                                                                                                        List list32 = (List) G32;
                                                                                                                                                                        x0 x0Var622 = x0Var;
                                                                                                                                                                        OfflineReadEntity offlineReadEntity22 = (OfflineReadEntity) x0Var622.get(l02.Y(E));
                                                                                                                                                                        Map map622 = map;
                                                                                                                                                                        Object G222 = a0.G(map622, l02.Y(E));
                                                                                                                                                                        G222.getClass();
                                                                                                                                                                        List list222 = (List) G222;
                                                                                                                                                                        if (!l02.isNull(i70)) {
                                                                                                                                                                        }
                                                                                                                                                                        if (valueOf10 == null) {
                                                                                                                                                                        }
                                                                                                                                                                        arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity22, list32, offlineReadEntity22, list222, sampleConfigEntity));
                                                                                                                                                                        int i11422 = i55;
                                                                                                                                                                        s39 = i51;
                                                                                                                                                                        s12 = i46;
                                                                                                                                                                        s37 = i11422;
                                                                                                                                                                        i99 = i70;
                                                                                                                                                                        i97 = i10;
                                                                                                                                                                        l02 = cVar;
                                                                                                                                                                        s26 = i60;
                                                                                                                                                                        s56 = i84;
                                                                                                                                                                        E = i91;
                                                                                                                                                                        s10 = i11;
                                                                                                                                                                        i98 = i27;
                                                                                                                                                                        str8 = null;
                                                                                                                                                                        s40 = i54;
                                                                                                                                                                        s57 = i83;
                                                                                                                                                                        s61 = i113;
                                                                                                                                                                        rVar3 = rVar2;
                                                                                                                                                                        s13 = i49;
                                                                                                                                                                        s25 = i32;
                                                                                                                                                                        x0Var5 = x0Var622;
                                                                                                                                                                        s31 = i38;
                                                                                                                                                                        s27 = i64;
                                                                                                                                                                        s32 = i74;
                                                                                                                                                                        s53 = i80;
                                                                                                                                                                        map4 = map522;
                                                                                                                                                                        i96 = i13;
                                                                                                                                                                        s60 = i112;
                                                                                                                                                                        s45 = i62;
                                                                                                                                                                        s55 = i79;
                                                                                                                                                                        s14 = i52;
                                                                                                                                                                        s38 = i71;
                                                                                                                                                                        s11 = i77;
                                                                                                                                                                        i95 = i15;
                                                                                                                                                                        map3 = map622;
                                                                                                                                                                        s47 = i66;
                                                                                                                                                                        s54 = i76;
                                                                                                                                                                        i94 = i17;
                                                                                                                                                                        i93 = i20;
                                                                                                                                                                        s21 = i22;
                                                                                                                                                                        readsDao_Impl3 = readsDao_Impl;
                                                                                                                                                                        s22 = i23;
                                                                                                                                                                        s23 = i109;
                                                                                                                                                                        s24 = i25;
                                                                                                                                                                    }
                                                                                                                                                                    Y22 = null;
                                                                                                                                                                    ReadMetaEntity readMetaEntity222 = new ReadMetaEntity(Y25, __SyncState_stringToEnum, Y, Y2, j10, j11, j12, valueOf, str2, j4, str3, str4, str5, str6, j13, Y3, z6, z10, Y4, Y5, listStringFromString, Y6, z11, valueOf2, valueOf3, valueOf4, Y7, Y8, valueOf5, z12, z13, valueOf6, Y9, Y10, Y11, z14, Y12, z15, Y13, Y14, Y15, Y16, valueOf7, Y17, z16, z17, Y18, z18, Y19, valueOf8, listStringFromString2, z19, Y20, Y21, valueOf9, Y22);
                                                                                                                                                                    s64 = i90;
                                                                                                                                                                    Map map5222 = map2;
                                                                                                                                                                    Object G322 = a0.G(map5222, l02.Y(E));
                                                                                                                                                                    G322.getClass();
                                                                                                                                                                    List list322 = (List) G322;
                                                                                                                                                                    x0 x0Var6222 = x0Var;
                                                                                                                                                                    OfflineReadEntity offlineReadEntity222 = (OfflineReadEntity) x0Var6222.get(l02.Y(E));
                                                                                                                                                                    Map map6222 = map;
                                                                                                                                                                    Object G2222 = a0.G(map6222, l02.Y(E));
                                                                                                                                                                    G2222.getClass();
                                                                                                                                                                    List list2222 = (List) G2222;
                                                                                                                                                                    if (!l02.isNull(i70)) {
                                                                                                                                                                    }
                                                                                                                                                                    if (valueOf10 == null) {
                                                                                                                                                                    }
                                                                                                                                                                    arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity222, list322, offlineReadEntity222, list2222, sampleConfigEntity));
                                                                                                                                                                    int i114222 = i55;
                                                                                                                                                                    s39 = i51;
                                                                                                                                                                    s12 = i46;
                                                                                                                                                                    s37 = i114222;
                                                                                                                                                                    i99 = i70;
                                                                                                                                                                    i97 = i10;
                                                                                                                                                                    l02 = cVar;
                                                                                                                                                                    s26 = i60;
                                                                                                                                                                    s56 = i84;
                                                                                                                                                                    E = i91;
                                                                                                                                                                    s10 = i11;
                                                                                                                                                                    i98 = i27;
                                                                                                                                                                    str8 = null;
                                                                                                                                                                    s40 = i54;
                                                                                                                                                                    s57 = i83;
                                                                                                                                                                    s61 = i113;
                                                                                                                                                                    rVar3 = rVar2;
                                                                                                                                                                    s13 = i49;
                                                                                                                                                                    s25 = i32;
                                                                                                                                                                    x0Var5 = x0Var6222;
                                                                                                                                                                    s31 = i38;
                                                                                                                                                                    s27 = i64;
                                                                                                                                                                    s32 = i74;
                                                                                                                                                                    s53 = i80;
                                                                                                                                                                    map4 = map5222;
                                                                                                                                                                    i96 = i13;
                                                                                                                                                                    s60 = i112;
                                                                                                                                                                    s45 = i62;
                                                                                                                                                                    s55 = i79;
                                                                                                                                                                    s14 = i52;
                                                                                                                                                                    s38 = i71;
                                                                                                                                                                    s11 = i77;
                                                                                                                                                                    i95 = i15;
                                                                                                                                                                    map3 = map6222;
                                                                                                                                                                    s47 = i66;
                                                                                                                                                                    s54 = i76;
                                                                                                                                                                    i94 = i17;
                                                                                                                                                                    i93 = i20;
                                                                                                                                                                    s21 = i22;
                                                                                                                                                                    readsDao_Impl3 = readsDao_Impl;
                                                                                                                                                                    s22 = i23;
                                                                                                                                                                    s23 = i109;
                                                                                                                                                                    s24 = i25;
                                                                                                                                                                }
                                                                                                                                                                s62 = i88;
                                                                                                                                                                i89 = s63;
                                                                                                                                                                Y21 = null;
                                                                                                                                                                if (i89 != i87) {
                                                                                                                                                                    s63 = i89;
                                                                                                                                                                    valueOf9 = Double.valueOf(l02.getDouble(i89));
                                                                                                                                                                    i90 = s64;
                                                                                                                                                                    if (i90 != i87) {
                                                                                                                                                                    }
                                                                                                                                                                    Y22 = null;
                                                                                                                                                                    ReadMetaEntity readMetaEntity2222 = new ReadMetaEntity(Y25, __SyncState_stringToEnum, Y, Y2, j10, j11, j12, valueOf, str2, j4, str3, str4, str5, str6, j13, Y3, z6, z10, Y4, Y5, listStringFromString, Y6, z11, valueOf2, valueOf3, valueOf4, Y7, Y8, valueOf5, z12, z13, valueOf6, Y9, Y10, Y11, z14, Y12, z15, Y13, Y14, Y15, Y16, valueOf7, Y17, z16, z17, Y18, z18, Y19, valueOf8, listStringFromString2, z19, Y20, Y21, valueOf9, Y22);
                                                                                                                                                                    s64 = i90;
                                                                                                                                                                    Map map52222 = map2;
                                                                                                                                                                    Object G3222 = a0.G(map52222, l02.Y(E));
                                                                                                                                                                    G3222.getClass();
                                                                                                                                                                    List list3222 = (List) G3222;
                                                                                                                                                                    x0 x0Var62222 = x0Var;
                                                                                                                                                                    OfflineReadEntity offlineReadEntity2222 = (OfflineReadEntity) x0Var62222.get(l02.Y(E));
                                                                                                                                                                    Map map62222 = map;
                                                                                                                                                                    Object G22222 = a0.G(map62222, l02.Y(E));
                                                                                                                                                                    G22222.getClass();
                                                                                                                                                                    List list22222 = (List) G22222;
                                                                                                                                                                    if (!l02.isNull(i70)) {
                                                                                                                                                                    }
                                                                                                                                                                    if (valueOf10 == null) {
                                                                                                                                                                    }
                                                                                                                                                                    arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity2222, list3222, offlineReadEntity2222, list22222, sampleConfigEntity));
                                                                                                                                                                    int i1142222 = i55;
                                                                                                                                                                    s39 = i51;
                                                                                                                                                                    s12 = i46;
                                                                                                                                                                    s37 = i1142222;
                                                                                                                                                                    i99 = i70;
                                                                                                                                                                    i97 = i10;
                                                                                                                                                                    l02 = cVar;
                                                                                                                                                                    s26 = i60;
                                                                                                                                                                    s56 = i84;
                                                                                                                                                                    E = i91;
                                                                                                                                                                    s10 = i11;
                                                                                                                                                                    i98 = i27;
                                                                                                                                                                    str8 = null;
                                                                                                                                                                    s40 = i54;
                                                                                                                                                                    s57 = i83;
                                                                                                                                                                    s61 = i113;
                                                                                                                                                                    rVar3 = rVar2;
                                                                                                                                                                    s13 = i49;
                                                                                                                                                                    s25 = i32;
                                                                                                                                                                    x0Var5 = x0Var62222;
                                                                                                                                                                    s31 = i38;
                                                                                                                                                                    s27 = i64;
                                                                                                                                                                    s32 = i74;
                                                                                                                                                                    s53 = i80;
                                                                                                                                                                    map4 = map52222;
                                                                                                                                                                    i96 = i13;
                                                                                                                                                                    s60 = i112;
                                                                                                                                                                    s45 = i62;
                                                                                                                                                                    s55 = i79;
                                                                                                                                                                    s14 = i52;
                                                                                                                                                                    s38 = i71;
                                                                                                                                                                    s11 = i77;
                                                                                                                                                                    i95 = i15;
                                                                                                                                                                    map3 = map62222;
                                                                                                                                                                    s47 = i66;
                                                                                                                                                                    s54 = i76;
                                                                                                                                                                    i94 = i17;
                                                                                                                                                                    i93 = i20;
                                                                                                                                                                    s21 = i22;
                                                                                                                                                                    readsDao_Impl3 = readsDao_Impl;
                                                                                                                                                                    s22 = i23;
                                                                                                                                                                    s23 = i109;
                                                                                                                                                                    s24 = i25;
                                                                                                                                                                }
                                                                                                                                                                s63 = i89;
                                                                                                                                                                i90 = s64;
                                                                                                                                                                valueOf9 = null;
                                                                                                                                                                if (i90 != i87) {
                                                                                                                                                                }
                                                                                                                                                                Y22 = null;
                                                                                                                                                                ReadMetaEntity readMetaEntity22222 = new ReadMetaEntity(Y25, __SyncState_stringToEnum, Y, Y2, j10, j11, j12, valueOf, str2, j4, str3, str4, str5, str6, j13, Y3, z6, z10, Y4, Y5, listStringFromString, Y6, z11, valueOf2, valueOf3, valueOf4, Y7, Y8, valueOf5, z12, z13, valueOf6, Y9, Y10, Y11, z14, Y12, z15, Y13, Y14, Y15, Y16, valueOf7, Y17, z16, z17, Y18, z18, Y19, valueOf8, listStringFromString2, z19, Y20, Y21, valueOf9, Y22);
                                                                                                                                                                s64 = i90;
                                                                                                                                                                Map map522222 = map2;
                                                                                                                                                                Object G32222 = a0.G(map522222, l02.Y(E));
                                                                                                                                                                G32222.getClass();
                                                                                                                                                                List list32222 = (List) G32222;
                                                                                                                                                                x0 x0Var622222 = x0Var;
                                                                                                                                                                OfflineReadEntity offlineReadEntity22222 = (OfflineReadEntity) x0Var622222.get(l02.Y(E));
                                                                                                                                                                Map map622222 = map;
                                                                                                                                                                Object G222222 = a0.G(map622222, l02.Y(E));
                                                                                                                                                                G222222.getClass();
                                                                                                                                                                List list222222 = (List) G222222;
                                                                                                                                                                if (!l02.isNull(i70)) {
                                                                                                                                                                }
                                                                                                                                                                if (valueOf10 == null) {
                                                                                                                                                                }
                                                                                                                                                                arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity22222, list32222, offlineReadEntity22222, list222222, sampleConfigEntity));
                                                                                                                                                                int i11422222 = i55;
                                                                                                                                                                s39 = i51;
                                                                                                                                                                s12 = i46;
                                                                                                                                                                s37 = i11422222;
                                                                                                                                                                i99 = i70;
                                                                                                                                                                i97 = i10;
                                                                                                                                                                l02 = cVar;
                                                                                                                                                                s26 = i60;
                                                                                                                                                                s56 = i84;
                                                                                                                                                                E = i91;
                                                                                                                                                                s10 = i11;
                                                                                                                                                                i98 = i27;
                                                                                                                                                                str8 = null;
                                                                                                                                                                s40 = i54;
                                                                                                                                                                s57 = i83;
                                                                                                                                                                s61 = i113;
                                                                                                                                                                rVar3 = rVar2;
                                                                                                                                                                s13 = i49;
                                                                                                                                                                s25 = i32;
                                                                                                                                                                x0Var5 = x0Var622222;
                                                                                                                                                                s31 = i38;
                                                                                                                                                                s27 = i64;
                                                                                                                                                                s32 = i74;
                                                                                                                                                                s53 = i80;
                                                                                                                                                                map4 = map522222;
                                                                                                                                                                i96 = i13;
                                                                                                                                                                s60 = i112;
                                                                                                                                                                s45 = i62;
                                                                                                                                                                s55 = i79;
                                                                                                                                                                s14 = i52;
                                                                                                                                                                s38 = i71;
                                                                                                                                                                s11 = i77;
                                                                                                                                                                i95 = i15;
                                                                                                                                                                map3 = map622222;
                                                                                                                                                                s47 = i66;
                                                                                                                                                                s54 = i76;
                                                                                                                                                                i94 = i17;
                                                                                                                                                                i93 = i20;
                                                                                                                                                                s21 = i22;
                                                                                                                                                                readsDao_Impl3 = readsDao_Impl;
                                                                                                                                                                s22 = i23;
                                                                                                                                                                s23 = i109;
                                                                                                                                                                s24 = i25;
                                                                                                                                                            }
                                                                                                                                                            i88 = s62;
                                                                                                                                                            Y20 = null;
                                                                                                                                                            if (i88 != i87) {
                                                                                                                                                                s62 = i88;
                                                                                                                                                                Y21 = l02.Y(i88);
                                                                                                                                                                i89 = s63;
                                                                                                                                                                if (i89 != i87) {
                                                                                                                                                                }
                                                                                                                                                                s63 = i89;
                                                                                                                                                                i90 = s64;
                                                                                                                                                                valueOf9 = null;
                                                                                                                                                                if (i90 != i87) {
                                                                                                                                                                }
                                                                                                                                                                Y22 = null;
                                                                                                                                                                ReadMetaEntity readMetaEntity222222 = new ReadMetaEntity(Y25, __SyncState_stringToEnum, Y, Y2, j10, j11, j12, valueOf, str2, j4, str3, str4, str5, str6, j13, Y3, z6, z10, Y4, Y5, listStringFromString, Y6, z11, valueOf2, valueOf3, valueOf4, Y7, Y8, valueOf5, z12, z13, valueOf6, Y9, Y10, Y11, z14, Y12, z15, Y13, Y14, Y15, Y16, valueOf7, Y17, z16, z17, Y18, z18, Y19, valueOf8, listStringFromString2, z19, Y20, Y21, valueOf9, Y22);
                                                                                                                                                                s64 = i90;
                                                                                                                                                                Map map5222222 = map2;
                                                                                                                                                                Object G322222 = a0.G(map5222222, l02.Y(E));
                                                                                                                                                                G322222.getClass();
                                                                                                                                                                List list322222 = (List) G322222;
                                                                                                                                                                x0 x0Var6222222 = x0Var;
                                                                                                                                                                OfflineReadEntity offlineReadEntity222222 = (OfflineReadEntity) x0Var6222222.get(l02.Y(E));
                                                                                                                                                                Map map6222222 = map;
                                                                                                                                                                Object G2222222 = a0.G(map6222222, l02.Y(E));
                                                                                                                                                                G2222222.getClass();
                                                                                                                                                                List list2222222 = (List) G2222222;
                                                                                                                                                                if (!l02.isNull(i70)) {
                                                                                                                                                                }
                                                                                                                                                                if (valueOf10 == null) {
                                                                                                                                                                }
                                                                                                                                                                arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity222222, list322222, offlineReadEntity222222, list2222222, sampleConfigEntity));
                                                                                                                                                                int i114222222 = i55;
                                                                                                                                                                s39 = i51;
                                                                                                                                                                s12 = i46;
                                                                                                                                                                s37 = i114222222;
                                                                                                                                                                i99 = i70;
                                                                                                                                                                i97 = i10;
                                                                                                                                                                l02 = cVar;
                                                                                                                                                                s26 = i60;
                                                                                                                                                                s56 = i84;
                                                                                                                                                                E = i91;
                                                                                                                                                                s10 = i11;
                                                                                                                                                                i98 = i27;
                                                                                                                                                                str8 = null;
                                                                                                                                                                s40 = i54;
                                                                                                                                                                s57 = i83;
                                                                                                                                                                s61 = i113;
                                                                                                                                                                rVar3 = rVar2;
                                                                                                                                                                s13 = i49;
                                                                                                                                                                s25 = i32;
                                                                                                                                                                x0Var5 = x0Var6222222;
                                                                                                                                                                s31 = i38;
                                                                                                                                                                s27 = i64;
                                                                                                                                                                s32 = i74;
                                                                                                                                                                s53 = i80;
                                                                                                                                                                map4 = map5222222;
                                                                                                                                                                i96 = i13;
                                                                                                                                                                s60 = i112;
                                                                                                                                                                s45 = i62;
                                                                                                                                                                s55 = i79;
                                                                                                                                                                s14 = i52;
                                                                                                                                                                s38 = i71;
                                                                                                                                                                s11 = i77;
                                                                                                                                                                i95 = i15;
                                                                                                                                                                map3 = map6222222;
                                                                                                                                                                s47 = i66;
                                                                                                                                                                s54 = i76;
                                                                                                                                                                i94 = i17;
                                                                                                                                                                i93 = i20;
                                                                                                                                                                s21 = i22;
                                                                                                                                                                readsDao_Impl3 = readsDao_Impl;
                                                                                                                                                                s22 = i23;
                                                                                                                                                                s23 = i109;
                                                                                                                                                                s24 = i25;
                                                                                                                                                            }
                                                                                                                                                            s62 = i88;
                                                                                                                                                            i89 = s63;
                                                                                                                                                            Y21 = null;
                                                                                                                                                            if (i89 != i87) {
                                                                                                                                                            }
                                                                                                                                                            s63 = i89;
                                                                                                                                                            i90 = s64;
                                                                                                                                                            valueOf9 = null;
                                                                                                                                                            if (i90 != i87) {
                                                                                                                                                            }
                                                                                                                                                            Y22 = null;
                                                                                                                                                            ReadMetaEntity readMetaEntity2222222 = new ReadMetaEntity(Y25, __SyncState_stringToEnum, Y, Y2, j10, j11, j12, valueOf, str2, j4, str3, str4, str5, str6, j13, Y3, z6, z10, Y4, Y5, listStringFromString, Y6, z11, valueOf2, valueOf3, valueOf4, Y7, Y8, valueOf5, z12, z13, valueOf6, Y9, Y10, Y11, z14, Y12, z15, Y13, Y14, Y15, Y16, valueOf7, Y17, z16, z17, Y18, z18, Y19, valueOf8, listStringFromString2, z19, Y20, Y21, valueOf9, Y22);
                                                                                                                                                            s64 = i90;
                                                                                                                                                            Map map52222222 = map2;
                                                                                                                                                            Object G3222222 = a0.G(map52222222, l02.Y(E));
                                                                                                                                                            G3222222.getClass();
                                                                                                                                                            List list3222222 = (List) G3222222;
                                                                                                                                                            x0 x0Var62222222 = x0Var;
                                                                                                                                                            OfflineReadEntity offlineReadEntity2222222 = (OfflineReadEntity) x0Var62222222.get(l02.Y(E));
                                                                                                                                                            Map map62222222 = map;
                                                                                                                                                            Object G22222222 = a0.G(map62222222, l02.Y(E));
                                                                                                                                                            G22222222.getClass();
                                                                                                                                                            List list22222222 = (List) G22222222;
                                                                                                                                                            if (!l02.isNull(i70)) {
                                                                                                                                                            }
                                                                                                                                                            if (valueOf10 == null) {
                                                                                                                                                            }
                                                                                                                                                            arrayList.add(new ReadMetaEntityWithChapters(readMetaEntity2222222, list3222222, offlineReadEntity2222222, list22222222, sampleConfigEntity));
                                                                                                                                                            int i1142222222 = i55;
                                                                                                                                                            s39 = i51;
                                                                                                                                                            s12 = i46;
                                                                                                                                                            s37 = i1142222222;
                                                                                                                                                            i99 = i70;
                                                                                                                                                            i97 = i10;
                                                                                                                                                            l02 = cVar;
                                                                                                                                                            s26 = i60;
                                                                                                                                                            s56 = i84;
                                                                                                                                                            E = i91;
                                                                                                                                                            s10 = i11;
                                                                                                                                                            i98 = i27;
                                                                                                                                                            str8 = null;
                                                                                                                                                            s40 = i54;
                                                                                                                                                            s57 = i83;
                                                                                                                                                            s61 = i113;
                                                                                                                                                            rVar3 = rVar2;
                                                                                                                                                            s13 = i49;
                                                                                                                                                            s25 = i32;
                                                                                                                                                            x0Var5 = x0Var62222222;
                                                                                                                                                            s31 = i38;
                                                                                                                                                            s27 = i64;
                                                                                                                                                            s32 = i74;
                                                                                                                                                            s53 = i80;
                                                                                                                                                            map4 = map52222222;
                                                                                                                                                            i96 = i13;
                                                                                                                                                            s60 = i112;
                                                                                                                                                            s45 = i62;
                                                                                                                                                            s55 = i79;
                                                                                                                                                            s14 = i52;
                                                                                                                                                            s38 = i71;
                                                                                                                                                            s11 = i77;
                                                                                                                                                            i95 = i15;
                                                                                                                                                            map3 = map62222222;
                                                                                                                                                            s47 = i66;
                                                                                                                                                            s54 = i76;
                                                                                                                                                            i94 = i17;
                                                                                                                                                            i93 = i20;
                                                                                                                                                            s21 = i22;
                                                                                                                                                            readsDao_Impl3 = readsDao_Impl;
                                                                                                                                                            s22 = i23;
                                                                                                                                                            s23 = i109;
                                                                                                                                                            s24 = i25;
                                                                                                                                                        } else {
                                                                                                                                                            throw new IllegalStateException("Missing column 'audio_types' for a NON-NULL value, column not found in result.");
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    s58 = i85;
                                                                                                                                                    i86 = s59;
                                                                                                                                                    valueOf8 = null;
                                                                                                                                                    if (i86 != i82) {
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i84 = i81;
                                                                                                                                                i85 = s58;
                                                                                                                                                Y19 = null;
                                                                                                                                                if (i85 != i82) {
                                                                                                                                                    valueOf8 = Double.valueOf(l02.getDouble(i85));
                                                                                                                                                    s58 = i85;
                                                                                                                                                    i86 = s59;
                                                                                                                                                    if (i86 != i82) {
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                s58 = i85;
                                                                                                                                                i86 = s59;
                                                                                                                                                valueOf8 = null;
                                                                                                                                                if (i86 != i82) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            i80 = i73;
                                                                                                                                            i81 = s56;
                                                                                                                                            Y18 = null;
                                                                                                                                            if (i81 == i78) {
                                                                                                                                            }
                                                                                                                                            i83 = s57;
                                                                                                                                            if (i83 != i82) {
                                                                                                                                                Y19 = l02.Y(i83);
                                                                                                                                                i84 = i81;
                                                                                                                                                i85 = s58;
                                                                                                                                                if (i85 != i82) {
                                                                                                                                                }
                                                                                                                                                s58 = i85;
                                                                                                                                                i86 = s59;
                                                                                                                                                valueOf8 = null;
                                                                                                                                                if (i86 != i82) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            i84 = i81;
                                                                                                                                            i85 = s58;
                                                                                                                                            Y19 = null;
                                                                                                                                            if (i85 != i82) {
                                                                                                                                            }
                                                                                                                                            s58 = i85;
                                                                                                                                            i86 = s59;
                                                                                                                                            valueOf8 = null;
                                                                                                                                            if (i86 != i82) {
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        s52 = i72;
                                                                                                                                        i73 = s53;
                                                                                                                                        Y17 = null;
                                                                                                                                        if (i73 == i65) {
                                                                                                                                        }
                                                                                                                                        i76 = s54;
                                                                                                                                        if (i76 == i75) {
                                                                                                                                        }
                                                                                                                                        i79 = s55;
                                                                                                                                        if (i79 != i78) {
                                                                                                                                            Y18 = l02.Y(i79);
                                                                                                                                            i80 = i73;
                                                                                                                                            i81 = s56;
                                                                                                                                            if (i81 == i78) {
                                                                                                                                            }
                                                                                                                                            i83 = s57;
                                                                                                                                            if (i83 != i82) {
                                                                                                                                            }
                                                                                                                                            i84 = i81;
                                                                                                                                            i85 = s58;
                                                                                                                                            Y19 = null;
                                                                                                                                            if (i85 != i82) {
                                                                                                                                            }
                                                                                                                                            s58 = i85;
                                                                                                                                            i86 = s59;
                                                                                                                                            valueOf8 = null;
                                                                                                                                            if (i86 != i82) {
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        i80 = i73;
                                                                                                                                        i81 = s56;
                                                                                                                                        Y18 = null;
                                                                                                                                        if (i81 == i78) {
                                                                                                                                        }
                                                                                                                                        i83 = s57;
                                                                                                                                        if (i83 != i82) {
                                                                                                                                        }
                                                                                                                                        i84 = i81;
                                                                                                                                        i85 = s58;
                                                                                                                                        Y19 = null;
                                                                                                                                        if (i85 != i82) {
                                                                                                                                        }
                                                                                                                                        s58 = i85;
                                                                                                                                        i86 = s59;
                                                                                                                                        valueOf8 = null;
                                                                                                                                        if (i86 != i82) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i71 = i47;
                                                                                                                                    i72 = s52;
                                                                                                                                    valueOf7 = null;
                                                                                                                                    if (i72 != i65) {
                                                                                                                                        Y17 = l02.Y(i72);
                                                                                                                                        s52 = i72;
                                                                                                                                        i73 = s53;
                                                                                                                                        if (i73 == i65) {
                                                                                                                                        }
                                                                                                                                        i76 = s54;
                                                                                                                                        if (i76 == i75) {
                                                                                                                                        }
                                                                                                                                        i79 = s55;
                                                                                                                                        if (i79 != i78) {
                                                                                                                                        }
                                                                                                                                        i80 = i73;
                                                                                                                                        i81 = s56;
                                                                                                                                        Y18 = null;
                                                                                                                                        if (i81 == i78) {
                                                                                                                                        }
                                                                                                                                        i83 = s57;
                                                                                                                                        if (i83 != i82) {
                                                                                                                                        }
                                                                                                                                        i84 = i81;
                                                                                                                                        i85 = s58;
                                                                                                                                        Y19 = null;
                                                                                                                                        if (i85 != i82) {
                                                                                                                                        }
                                                                                                                                        s58 = i85;
                                                                                                                                        i86 = s59;
                                                                                                                                        valueOf8 = null;
                                                                                                                                        if (i86 != i82) {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    s52 = i72;
                                                                                                                                    i73 = s53;
                                                                                                                                    Y17 = null;
                                                                                                                                    if (i73 == i65) {
                                                                                                                                    }
                                                                                                                                    i76 = s54;
                                                                                                                                    if (i76 == i75) {
                                                                                                                                    }
                                                                                                                                    i79 = s55;
                                                                                                                                    if (i79 != i78) {
                                                                                                                                    }
                                                                                                                                    i80 = i73;
                                                                                                                                    i81 = s56;
                                                                                                                                    Y18 = null;
                                                                                                                                    if (i81 == i78) {
                                                                                                                                    }
                                                                                                                                    i83 = s57;
                                                                                                                                    if (i83 != i82) {
                                                                                                                                    }
                                                                                                                                    i84 = i81;
                                                                                                                                    i85 = s58;
                                                                                                                                    Y19 = null;
                                                                                                                                    if (i85 != i82) {
                                                                                                                                    }
                                                                                                                                    s58 = i85;
                                                                                                                                    i86 = s59;
                                                                                                                                    valueOf8 = null;
                                                                                                                                    if (i86 != i82) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                s50 = i69;
                                                                                                                                i70 = i99;
                                                                                                                                Y16 = null;
                                                                                                                                if (i70 != i65) {
                                                                                                                                    valueOf7 = Long.valueOf(l02.getLong(i70));
                                                                                                                                    i71 = i47;
                                                                                                                                    i72 = s52;
                                                                                                                                    if (i72 != i65) {
                                                                                                                                    }
                                                                                                                                    s52 = i72;
                                                                                                                                    i73 = s53;
                                                                                                                                    Y17 = null;
                                                                                                                                    if (i73 == i65) {
                                                                                                                                    }
                                                                                                                                    i76 = s54;
                                                                                                                                    if (i76 == i75) {
                                                                                                                                    }
                                                                                                                                    i79 = s55;
                                                                                                                                    if (i79 != i78) {
                                                                                                                                    }
                                                                                                                                    i80 = i73;
                                                                                                                                    i81 = s56;
                                                                                                                                    Y18 = null;
                                                                                                                                    if (i81 == i78) {
                                                                                                                                    }
                                                                                                                                    i83 = s57;
                                                                                                                                    if (i83 != i82) {
                                                                                                                                    }
                                                                                                                                    i84 = i81;
                                                                                                                                    i85 = s58;
                                                                                                                                    Y19 = null;
                                                                                                                                    if (i85 != i82) {
                                                                                                                                    }
                                                                                                                                    s58 = i85;
                                                                                                                                    i86 = s59;
                                                                                                                                    valueOf8 = null;
                                                                                                                                    if (i86 != i82) {
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                i71 = i47;
                                                                                                                                i72 = s52;
                                                                                                                                valueOf7 = null;
                                                                                                                                if (i72 != i65) {
                                                                                                                                }
                                                                                                                                s52 = i72;
                                                                                                                                i73 = s53;
                                                                                                                                Y17 = null;
                                                                                                                                if (i73 == i65) {
                                                                                                                                }
                                                                                                                                i76 = s54;
                                                                                                                                if (i76 == i75) {
                                                                                                                                }
                                                                                                                                i79 = s55;
                                                                                                                                if (i79 != i78) {
                                                                                                                                }
                                                                                                                                i80 = i73;
                                                                                                                                i81 = s56;
                                                                                                                                Y18 = null;
                                                                                                                                if (i81 == i78) {
                                                                                                                                }
                                                                                                                                i83 = s57;
                                                                                                                                if (i83 != i82) {
                                                                                                                                }
                                                                                                                                i84 = i81;
                                                                                                                                i85 = s58;
                                                                                                                                Y19 = null;
                                                                                                                                if (i85 != i82) {
                                                                                                                                }
                                                                                                                                s58 = i85;
                                                                                                                                i86 = s59;
                                                                                                                                valueOf8 = null;
                                                                                                                                if (i86 != i82) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                            s49 = i68;
                                                                                                                            i69 = s50;
                                                                                                                            Y15 = null;
                                                                                                                            if (i69 != i65) {
                                                                                                                                s50 = i69;
                                                                                                                                Y16 = l02.Y(i69);
                                                                                                                                i70 = i99;
                                                                                                                                if (i70 != i65) {
                                                                                                                                }
                                                                                                                                i71 = i47;
                                                                                                                                i72 = s52;
                                                                                                                                valueOf7 = null;
                                                                                                                                if (i72 != i65) {
                                                                                                                                }
                                                                                                                                s52 = i72;
                                                                                                                                i73 = s53;
                                                                                                                                Y17 = null;
                                                                                                                                if (i73 == i65) {
                                                                                                                                }
                                                                                                                                i76 = s54;
                                                                                                                                if (i76 == i75) {
                                                                                                                                }
                                                                                                                                i79 = s55;
                                                                                                                                if (i79 != i78) {
                                                                                                                                }
                                                                                                                                i80 = i73;
                                                                                                                                i81 = s56;
                                                                                                                                Y18 = null;
                                                                                                                                if (i81 == i78) {
                                                                                                                                }
                                                                                                                                i83 = s57;
                                                                                                                                if (i83 != i82) {
                                                                                                                                }
                                                                                                                                i84 = i81;
                                                                                                                                i85 = s58;
                                                                                                                                Y19 = null;
                                                                                                                                if (i85 != i82) {
                                                                                                                                }
                                                                                                                                s58 = i85;
                                                                                                                                i86 = s59;
                                                                                                                                valueOf8 = null;
                                                                                                                                if (i86 != i82) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                            s50 = i69;
                                                                                                                            i70 = i99;
                                                                                                                            Y16 = null;
                                                                                                                            if (i70 != i65) {
                                                                                                                            }
                                                                                                                            i71 = i47;
                                                                                                                            i72 = s52;
                                                                                                                            valueOf7 = null;
                                                                                                                            if (i72 != i65) {
                                                                                                                            }
                                                                                                                            s52 = i72;
                                                                                                                            i73 = s53;
                                                                                                                            Y17 = null;
                                                                                                                            if (i73 == i65) {
                                                                                                                            }
                                                                                                                            i76 = s54;
                                                                                                                            if (i76 == i75) {
                                                                                                                            }
                                                                                                                            i79 = s55;
                                                                                                                            if (i79 != i78) {
                                                                                                                            }
                                                                                                                            i80 = i73;
                                                                                                                            i81 = s56;
                                                                                                                            Y18 = null;
                                                                                                                            if (i81 == i78) {
                                                                                                                            }
                                                                                                                            i83 = s57;
                                                                                                                            if (i83 != i82) {
                                                                                                                            }
                                                                                                                            i84 = i81;
                                                                                                                            i85 = s58;
                                                                                                                            Y19 = null;
                                                                                                                            if (i85 != i82) {
                                                                                                                            }
                                                                                                                            s58 = i85;
                                                                                                                            i86 = s59;
                                                                                                                            valueOf8 = null;
                                                                                                                            if (i86 != i82) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                        s48 = i67;
                                                                                                                        i68 = s49;
                                                                                                                        Y14 = null;
                                                                                                                        if (i68 != i65) {
                                                                                                                            s49 = i68;
                                                                                                                            Y15 = l02.Y(i68);
                                                                                                                            i69 = s50;
                                                                                                                            if (i69 != i65) {
                                                                                                                            }
                                                                                                                            s50 = i69;
                                                                                                                            i70 = i99;
                                                                                                                            Y16 = null;
                                                                                                                            if (i70 != i65) {
                                                                                                                            }
                                                                                                                            i71 = i47;
                                                                                                                            i72 = s52;
                                                                                                                            valueOf7 = null;
                                                                                                                            if (i72 != i65) {
                                                                                                                            }
                                                                                                                            s52 = i72;
                                                                                                                            i73 = s53;
                                                                                                                            Y17 = null;
                                                                                                                            if (i73 == i65) {
                                                                                                                            }
                                                                                                                            i76 = s54;
                                                                                                                            if (i76 == i75) {
                                                                                                                            }
                                                                                                                            i79 = s55;
                                                                                                                            if (i79 != i78) {
                                                                                                                            }
                                                                                                                            i80 = i73;
                                                                                                                            i81 = s56;
                                                                                                                            Y18 = null;
                                                                                                                            if (i81 == i78) {
                                                                                                                            }
                                                                                                                            i83 = s57;
                                                                                                                            if (i83 != i82) {
                                                                                                                            }
                                                                                                                            i84 = i81;
                                                                                                                            i85 = s58;
                                                                                                                            Y19 = null;
                                                                                                                            if (i85 != i82) {
                                                                                                                            }
                                                                                                                            s58 = i85;
                                                                                                                            i86 = s59;
                                                                                                                            valueOf8 = null;
                                                                                                                            if (i86 != i82) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                        s49 = i68;
                                                                                                                        i69 = s50;
                                                                                                                        Y15 = null;
                                                                                                                        if (i69 != i65) {
                                                                                                                        }
                                                                                                                        s50 = i69;
                                                                                                                        i70 = i99;
                                                                                                                        Y16 = null;
                                                                                                                        if (i70 != i65) {
                                                                                                                        }
                                                                                                                        i71 = i47;
                                                                                                                        i72 = s52;
                                                                                                                        valueOf7 = null;
                                                                                                                        if (i72 != i65) {
                                                                                                                        }
                                                                                                                        s52 = i72;
                                                                                                                        i73 = s53;
                                                                                                                        Y17 = null;
                                                                                                                        if (i73 == i65) {
                                                                                                                        }
                                                                                                                        i76 = s54;
                                                                                                                        if (i76 == i75) {
                                                                                                                        }
                                                                                                                        i79 = s55;
                                                                                                                        if (i79 != i78) {
                                                                                                                        }
                                                                                                                        i80 = i73;
                                                                                                                        i81 = s56;
                                                                                                                        Y18 = null;
                                                                                                                        if (i81 == i78) {
                                                                                                                        }
                                                                                                                        i83 = s57;
                                                                                                                        if (i83 != i82) {
                                                                                                                        }
                                                                                                                        i84 = i81;
                                                                                                                        i85 = s58;
                                                                                                                        Y19 = null;
                                                                                                                        if (i85 != i82) {
                                                                                                                        }
                                                                                                                        s58 = i85;
                                                                                                                        i86 = s59;
                                                                                                                        valueOf8 = null;
                                                                                                                        if (i86 != i82) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                    s46 = i63;
                                                                                                                    i67 = s48;
                                                                                                                    Y13 = null;
                                                                                                                    if (i67 != i65) {
                                                                                                                        s48 = i67;
                                                                                                                        Y14 = l02.Y(i67);
                                                                                                                        i68 = s49;
                                                                                                                        if (i68 != i65) {
                                                                                                                        }
                                                                                                                        s49 = i68;
                                                                                                                        i69 = s50;
                                                                                                                        Y15 = null;
                                                                                                                        if (i69 != i65) {
                                                                                                                        }
                                                                                                                        s50 = i69;
                                                                                                                        i70 = i99;
                                                                                                                        Y16 = null;
                                                                                                                        if (i70 != i65) {
                                                                                                                        }
                                                                                                                        i71 = i47;
                                                                                                                        i72 = s52;
                                                                                                                        valueOf7 = null;
                                                                                                                        if (i72 != i65) {
                                                                                                                        }
                                                                                                                        s52 = i72;
                                                                                                                        i73 = s53;
                                                                                                                        Y17 = null;
                                                                                                                        if (i73 == i65) {
                                                                                                                        }
                                                                                                                        i76 = s54;
                                                                                                                        if (i76 == i75) {
                                                                                                                        }
                                                                                                                        i79 = s55;
                                                                                                                        if (i79 != i78) {
                                                                                                                        }
                                                                                                                        i80 = i73;
                                                                                                                        i81 = s56;
                                                                                                                        Y18 = null;
                                                                                                                        if (i81 == i78) {
                                                                                                                        }
                                                                                                                        i83 = s57;
                                                                                                                        if (i83 != i82) {
                                                                                                                        }
                                                                                                                        i84 = i81;
                                                                                                                        i85 = s58;
                                                                                                                        Y19 = null;
                                                                                                                        if (i85 != i82) {
                                                                                                                        }
                                                                                                                        s58 = i85;
                                                                                                                        i86 = s59;
                                                                                                                        valueOf8 = null;
                                                                                                                        if (i86 != i82) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                    s48 = i67;
                                                                                                                    i68 = s49;
                                                                                                                    Y14 = null;
                                                                                                                    if (i68 != i65) {
                                                                                                                    }
                                                                                                                    s49 = i68;
                                                                                                                    i69 = s50;
                                                                                                                    Y15 = null;
                                                                                                                    if (i69 != i65) {
                                                                                                                    }
                                                                                                                    s50 = i69;
                                                                                                                    i70 = i99;
                                                                                                                    Y16 = null;
                                                                                                                    if (i70 != i65) {
                                                                                                                    }
                                                                                                                    i71 = i47;
                                                                                                                    i72 = s52;
                                                                                                                    valueOf7 = null;
                                                                                                                    if (i72 != i65) {
                                                                                                                    }
                                                                                                                    s52 = i72;
                                                                                                                    i73 = s53;
                                                                                                                    Y17 = null;
                                                                                                                    if (i73 == i65) {
                                                                                                                    }
                                                                                                                    i76 = s54;
                                                                                                                    if (i76 == i75) {
                                                                                                                    }
                                                                                                                    i79 = s55;
                                                                                                                    if (i79 != i78) {
                                                                                                                    }
                                                                                                                    i80 = i73;
                                                                                                                    i81 = s56;
                                                                                                                    Y18 = null;
                                                                                                                    if (i81 == i78) {
                                                                                                                    }
                                                                                                                    i83 = s57;
                                                                                                                    if (i83 != i82) {
                                                                                                                    }
                                                                                                                    i84 = i81;
                                                                                                                    i85 = s58;
                                                                                                                    Y19 = null;
                                                                                                                    if (i85 != i82) {
                                                                                                                    }
                                                                                                                    s58 = i85;
                                                                                                                    i86 = s59;
                                                                                                                    valueOf8 = null;
                                                                                                                    if (i86 != i82) {
                                                                                                                    }
                                                                                                                }
                                                                                                                s44 = i59;
                                                                                                                i63 = s46;
                                                                                                                Y12 = null;
                                                                                                                if (i63 == i61) {
                                                                                                                }
                                                                                                                i66 = s47;
                                                                                                                if (i66 != i65) {
                                                                                                                    Y13 = l02.Y(i66);
                                                                                                                    s46 = i63;
                                                                                                                    i67 = s48;
                                                                                                                    if (i67 != i65) {
                                                                                                                    }
                                                                                                                    s48 = i67;
                                                                                                                    i68 = s49;
                                                                                                                    Y14 = null;
                                                                                                                    if (i68 != i65) {
                                                                                                                    }
                                                                                                                    s49 = i68;
                                                                                                                    i69 = s50;
                                                                                                                    Y15 = null;
                                                                                                                    if (i69 != i65) {
                                                                                                                    }
                                                                                                                    s50 = i69;
                                                                                                                    i70 = i99;
                                                                                                                    Y16 = null;
                                                                                                                    if (i70 != i65) {
                                                                                                                    }
                                                                                                                    i71 = i47;
                                                                                                                    i72 = s52;
                                                                                                                    valueOf7 = null;
                                                                                                                    if (i72 != i65) {
                                                                                                                    }
                                                                                                                    s52 = i72;
                                                                                                                    i73 = s53;
                                                                                                                    Y17 = null;
                                                                                                                    if (i73 == i65) {
                                                                                                                    }
                                                                                                                    i76 = s54;
                                                                                                                    if (i76 == i75) {
                                                                                                                    }
                                                                                                                    i79 = s55;
                                                                                                                    if (i79 != i78) {
                                                                                                                    }
                                                                                                                    i80 = i73;
                                                                                                                    i81 = s56;
                                                                                                                    Y18 = null;
                                                                                                                    if (i81 == i78) {
                                                                                                                    }
                                                                                                                    i83 = s57;
                                                                                                                    if (i83 != i82) {
                                                                                                                    }
                                                                                                                    i84 = i81;
                                                                                                                    i85 = s58;
                                                                                                                    Y19 = null;
                                                                                                                    if (i85 != i82) {
                                                                                                                    }
                                                                                                                    s58 = i85;
                                                                                                                    i86 = s59;
                                                                                                                    valueOf8 = null;
                                                                                                                    if (i86 != i82) {
                                                                                                                    }
                                                                                                                }
                                                                                                                s46 = i63;
                                                                                                                i67 = s48;
                                                                                                                Y13 = null;
                                                                                                                if (i67 != i65) {
                                                                                                                }
                                                                                                                s48 = i67;
                                                                                                                i68 = s49;
                                                                                                                Y14 = null;
                                                                                                                if (i68 != i65) {
                                                                                                                }
                                                                                                                s49 = i68;
                                                                                                                i69 = s50;
                                                                                                                Y15 = null;
                                                                                                                if (i69 != i65) {
                                                                                                                }
                                                                                                                s50 = i69;
                                                                                                                i70 = i99;
                                                                                                                Y16 = null;
                                                                                                                if (i70 != i65) {
                                                                                                                }
                                                                                                                i71 = i47;
                                                                                                                i72 = s52;
                                                                                                                valueOf7 = null;
                                                                                                                if (i72 != i65) {
                                                                                                                }
                                                                                                                s52 = i72;
                                                                                                                i73 = s53;
                                                                                                                Y17 = null;
                                                                                                                if (i73 == i65) {
                                                                                                                }
                                                                                                                i76 = s54;
                                                                                                                if (i76 == i75) {
                                                                                                                }
                                                                                                                i79 = s55;
                                                                                                                if (i79 != i78) {
                                                                                                                }
                                                                                                                i80 = i73;
                                                                                                                i81 = s56;
                                                                                                                Y18 = null;
                                                                                                                if (i81 == i78) {
                                                                                                                }
                                                                                                                i83 = s57;
                                                                                                                if (i83 != i82) {
                                                                                                                }
                                                                                                                i84 = i81;
                                                                                                                i85 = s58;
                                                                                                                Y19 = null;
                                                                                                                if (i85 != i82) {
                                                                                                                }
                                                                                                                s58 = i85;
                                                                                                                i86 = s59;
                                                                                                                valueOf8 = null;
                                                                                                                if (i86 != i82) {
                                                                                                                }
                                                                                                            }
                                                                                                            s43 = i58;
                                                                                                            i59 = s44;
                                                                                                            Y11 = null;
                                                                                                            if (i59 == i53) {
                                                                                                            }
                                                                                                            i62 = s45;
                                                                                                            if (i62 != i61) {
                                                                                                                Y12 = l02.Y(i62);
                                                                                                                s44 = i59;
                                                                                                                i63 = s46;
                                                                                                                if (i63 == i61) {
                                                                                                                }
                                                                                                                i66 = s47;
                                                                                                                if (i66 != i65) {
                                                                                                                }
                                                                                                                s46 = i63;
                                                                                                                i67 = s48;
                                                                                                                Y13 = null;
                                                                                                                if (i67 != i65) {
                                                                                                                }
                                                                                                                s48 = i67;
                                                                                                                i68 = s49;
                                                                                                                Y14 = null;
                                                                                                                if (i68 != i65) {
                                                                                                                }
                                                                                                                s49 = i68;
                                                                                                                i69 = s50;
                                                                                                                Y15 = null;
                                                                                                                if (i69 != i65) {
                                                                                                                }
                                                                                                                s50 = i69;
                                                                                                                i70 = i99;
                                                                                                                Y16 = null;
                                                                                                                if (i70 != i65) {
                                                                                                                }
                                                                                                                i71 = i47;
                                                                                                                i72 = s52;
                                                                                                                valueOf7 = null;
                                                                                                                if (i72 != i65) {
                                                                                                                }
                                                                                                                s52 = i72;
                                                                                                                i73 = s53;
                                                                                                                Y17 = null;
                                                                                                                if (i73 == i65) {
                                                                                                                }
                                                                                                                i76 = s54;
                                                                                                                if (i76 == i75) {
                                                                                                                }
                                                                                                                i79 = s55;
                                                                                                                if (i79 != i78) {
                                                                                                                }
                                                                                                                i80 = i73;
                                                                                                                i81 = s56;
                                                                                                                Y18 = null;
                                                                                                                if (i81 == i78) {
                                                                                                                }
                                                                                                                i83 = s57;
                                                                                                                if (i83 != i82) {
                                                                                                                }
                                                                                                                i84 = i81;
                                                                                                                i85 = s58;
                                                                                                                Y19 = null;
                                                                                                                if (i85 != i82) {
                                                                                                                }
                                                                                                                s58 = i85;
                                                                                                                i86 = s59;
                                                                                                                valueOf8 = null;
                                                                                                                if (i86 != i82) {
                                                                                                                }
                                                                                                            }
                                                                                                            s44 = i59;
                                                                                                            i63 = s46;
                                                                                                            Y12 = null;
                                                                                                            if (i63 == i61) {
                                                                                                            }
                                                                                                            i66 = s47;
                                                                                                            if (i66 != i65) {
                                                                                                            }
                                                                                                            s46 = i63;
                                                                                                            i67 = s48;
                                                                                                            Y13 = null;
                                                                                                            if (i67 != i65) {
                                                                                                            }
                                                                                                            s48 = i67;
                                                                                                            i68 = s49;
                                                                                                            Y14 = null;
                                                                                                            if (i68 != i65) {
                                                                                                            }
                                                                                                            s49 = i68;
                                                                                                            i69 = s50;
                                                                                                            Y15 = null;
                                                                                                            if (i69 != i65) {
                                                                                                            }
                                                                                                            s50 = i69;
                                                                                                            i70 = i99;
                                                                                                            Y16 = null;
                                                                                                            if (i70 != i65) {
                                                                                                            }
                                                                                                            i71 = i47;
                                                                                                            i72 = s52;
                                                                                                            valueOf7 = null;
                                                                                                            if (i72 != i65) {
                                                                                                            }
                                                                                                            s52 = i72;
                                                                                                            i73 = s53;
                                                                                                            Y17 = null;
                                                                                                            if (i73 == i65) {
                                                                                                            }
                                                                                                            i76 = s54;
                                                                                                            if (i76 == i75) {
                                                                                                            }
                                                                                                            i79 = s55;
                                                                                                            if (i79 != i78) {
                                                                                                            }
                                                                                                            i80 = i73;
                                                                                                            i81 = s56;
                                                                                                            Y18 = null;
                                                                                                            if (i81 == i78) {
                                                                                                            }
                                                                                                            i83 = s57;
                                                                                                            if (i83 != i82) {
                                                                                                            }
                                                                                                            i84 = i81;
                                                                                                            i85 = s58;
                                                                                                            Y19 = null;
                                                                                                            if (i85 != i82) {
                                                                                                            }
                                                                                                            s58 = i85;
                                                                                                            i86 = s59;
                                                                                                            valueOf8 = null;
                                                                                                            if (i86 != i82) {
                                                                                                            }
                                                                                                        }
                                                                                                        s42 = i57;
                                                                                                        i58 = s43;
                                                                                                        Y10 = null;
                                                                                                        if (i58 != i53) {
                                                                                                            s43 = i58;
                                                                                                            Y11 = l02.Y(i58);
                                                                                                            i59 = s44;
                                                                                                            if (i59 == i53) {
                                                                                                            }
                                                                                                            i62 = s45;
                                                                                                            if (i62 != i61) {
                                                                                                            }
                                                                                                            s44 = i59;
                                                                                                            i63 = s46;
                                                                                                            Y12 = null;
                                                                                                            if (i63 == i61) {
                                                                                                            }
                                                                                                            i66 = s47;
                                                                                                            if (i66 != i65) {
                                                                                                            }
                                                                                                            s46 = i63;
                                                                                                            i67 = s48;
                                                                                                            Y13 = null;
                                                                                                            if (i67 != i65) {
                                                                                                            }
                                                                                                            s48 = i67;
                                                                                                            i68 = s49;
                                                                                                            Y14 = null;
                                                                                                            if (i68 != i65) {
                                                                                                            }
                                                                                                            s49 = i68;
                                                                                                            i69 = s50;
                                                                                                            Y15 = null;
                                                                                                            if (i69 != i65) {
                                                                                                            }
                                                                                                            s50 = i69;
                                                                                                            i70 = i99;
                                                                                                            Y16 = null;
                                                                                                            if (i70 != i65) {
                                                                                                            }
                                                                                                            i71 = i47;
                                                                                                            i72 = s52;
                                                                                                            valueOf7 = null;
                                                                                                            if (i72 != i65) {
                                                                                                            }
                                                                                                            s52 = i72;
                                                                                                            i73 = s53;
                                                                                                            Y17 = null;
                                                                                                            if (i73 == i65) {
                                                                                                            }
                                                                                                            i76 = s54;
                                                                                                            if (i76 == i75) {
                                                                                                            }
                                                                                                            i79 = s55;
                                                                                                            if (i79 != i78) {
                                                                                                            }
                                                                                                            i80 = i73;
                                                                                                            i81 = s56;
                                                                                                            Y18 = null;
                                                                                                            if (i81 == i78) {
                                                                                                            }
                                                                                                            i83 = s57;
                                                                                                            if (i83 != i82) {
                                                                                                            }
                                                                                                            i84 = i81;
                                                                                                            i85 = s58;
                                                                                                            Y19 = null;
                                                                                                            if (i85 != i82) {
                                                                                                            }
                                                                                                            s58 = i85;
                                                                                                            i86 = s59;
                                                                                                            valueOf8 = null;
                                                                                                            if (i86 != i82) {
                                                                                                            }
                                                                                                        }
                                                                                                        s43 = i58;
                                                                                                        i59 = s44;
                                                                                                        Y11 = null;
                                                                                                        if (i59 == i53) {
                                                                                                        }
                                                                                                        i62 = s45;
                                                                                                        if (i62 != i61) {
                                                                                                        }
                                                                                                        s44 = i59;
                                                                                                        i63 = s46;
                                                                                                        Y12 = null;
                                                                                                        if (i63 == i61) {
                                                                                                        }
                                                                                                        i66 = s47;
                                                                                                        if (i66 != i65) {
                                                                                                        }
                                                                                                        s46 = i63;
                                                                                                        i67 = s48;
                                                                                                        Y13 = null;
                                                                                                        if (i67 != i65) {
                                                                                                        }
                                                                                                        s48 = i67;
                                                                                                        i68 = s49;
                                                                                                        Y14 = null;
                                                                                                        if (i68 != i65) {
                                                                                                        }
                                                                                                        s49 = i68;
                                                                                                        i69 = s50;
                                                                                                        Y15 = null;
                                                                                                        if (i69 != i65) {
                                                                                                        }
                                                                                                        s50 = i69;
                                                                                                        i70 = i99;
                                                                                                        Y16 = null;
                                                                                                        if (i70 != i65) {
                                                                                                        }
                                                                                                        i71 = i47;
                                                                                                        i72 = s52;
                                                                                                        valueOf7 = null;
                                                                                                        if (i72 != i65) {
                                                                                                        }
                                                                                                        s52 = i72;
                                                                                                        i73 = s53;
                                                                                                        Y17 = null;
                                                                                                        if (i73 == i65) {
                                                                                                        }
                                                                                                        i76 = s54;
                                                                                                        if (i76 == i75) {
                                                                                                        }
                                                                                                        i79 = s55;
                                                                                                        if (i79 != i78) {
                                                                                                        }
                                                                                                        i80 = i73;
                                                                                                        i81 = s56;
                                                                                                        Y18 = null;
                                                                                                        if (i81 == i78) {
                                                                                                        }
                                                                                                        i83 = s57;
                                                                                                        if (i83 != i82) {
                                                                                                        }
                                                                                                        i84 = i81;
                                                                                                        i85 = s58;
                                                                                                        Y19 = null;
                                                                                                        if (i85 != i82) {
                                                                                                        }
                                                                                                        s58 = i85;
                                                                                                        i86 = s59;
                                                                                                        valueOf8 = null;
                                                                                                        if (i86 != i82) {
                                                                                                        }
                                                                                                    }
                                                                                                    s41 = i56;
                                                                                                    i57 = s42;
                                                                                                    Y9 = null;
                                                                                                    if (i57 != i53) {
                                                                                                        s42 = i57;
                                                                                                        Y10 = l02.Y(i57);
                                                                                                        i58 = s43;
                                                                                                        if (i58 != i53) {
                                                                                                        }
                                                                                                        s43 = i58;
                                                                                                        i59 = s44;
                                                                                                        Y11 = null;
                                                                                                        if (i59 == i53) {
                                                                                                        }
                                                                                                        i62 = s45;
                                                                                                        if (i62 != i61) {
                                                                                                        }
                                                                                                        s44 = i59;
                                                                                                        i63 = s46;
                                                                                                        Y12 = null;
                                                                                                        if (i63 == i61) {
                                                                                                        }
                                                                                                        i66 = s47;
                                                                                                        if (i66 != i65) {
                                                                                                        }
                                                                                                        s46 = i63;
                                                                                                        i67 = s48;
                                                                                                        Y13 = null;
                                                                                                        if (i67 != i65) {
                                                                                                        }
                                                                                                        s48 = i67;
                                                                                                        i68 = s49;
                                                                                                        Y14 = null;
                                                                                                        if (i68 != i65) {
                                                                                                        }
                                                                                                        s49 = i68;
                                                                                                        i69 = s50;
                                                                                                        Y15 = null;
                                                                                                        if (i69 != i65) {
                                                                                                        }
                                                                                                        s50 = i69;
                                                                                                        i70 = i99;
                                                                                                        Y16 = null;
                                                                                                        if (i70 != i65) {
                                                                                                        }
                                                                                                        i71 = i47;
                                                                                                        i72 = s52;
                                                                                                        valueOf7 = null;
                                                                                                        if (i72 != i65) {
                                                                                                        }
                                                                                                        s52 = i72;
                                                                                                        i73 = s53;
                                                                                                        Y17 = null;
                                                                                                        if (i73 == i65) {
                                                                                                        }
                                                                                                        i76 = s54;
                                                                                                        if (i76 == i75) {
                                                                                                        }
                                                                                                        i79 = s55;
                                                                                                        if (i79 != i78) {
                                                                                                        }
                                                                                                        i80 = i73;
                                                                                                        i81 = s56;
                                                                                                        Y18 = null;
                                                                                                        if (i81 == i78) {
                                                                                                        }
                                                                                                        i83 = s57;
                                                                                                        if (i83 != i82) {
                                                                                                        }
                                                                                                        i84 = i81;
                                                                                                        i85 = s58;
                                                                                                        Y19 = null;
                                                                                                        if (i85 != i82) {
                                                                                                        }
                                                                                                        s58 = i85;
                                                                                                        i86 = s59;
                                                                                                        valueOf8 = null;
                                                                                                        if (i86 != i82) {
                                                                                                        }
                                                                                                    }
                                                                                                    s42 = i57;
                                                                                                    i58 = s43;
                                                                                                    Y10 = null;
                                                                                                    if (i58 != i53) {
                                                                                                    }
                                                                                                    s43 = i58;
                                                                                                    i59 = s44;
                                                                                                    Y11 = null;
                                                                                                    if (i59 == i53) {
                                                                                                    }
                                                                                                    i62 = s45;
                                                                                                    if (i62 != i61) {
                                                                                                    }
                                                                                                    s44 = i59;
                                                                                                    i63 = s46;
                                                                                                    Y12 = null;
                                                                                                    if (i63 == i61) {
                                                                                                    }
                                                                                                    i66 = s47;
                                                                                                    if (i66 != i65) {
                                                                                                    }
                                                                                                    s46 = i63;
                                                                                                    i67 = s48;
                                                                                                    Y13 = null;
                                                                                                    if (i67 != i65) {
                                                                                                    }
                                                                                                    s48 = i67;
                                                                                                    i68 = s49;
                                                                                                    Y14 = null;
                                                                                                    if (i68 != i65) {
                                                                                                    }
                                                                                                    s49 = i68;
                                                                                                    i69 = s50;
                                                                                                    Y15 = null;
                                                                                                    if (i69 != i65) {
                                                                                                    }
                                                                                                    s50 = i69;
                                                                                                    i70 = i99;
                                                                                                    Y16 = null;
                                                                                                    if (i70 != i65) {
                                                                                                    }
                                                                                                    i71 = i47;
                                                                                                    i72 = s52;
                                                                                                    valueOf7 = null;
                                                                                                    if (i72 != i65) {
                                                                                                    }
                                                                                                    s52 = i72;
                                                                                                    i73 = s53;
                                                                                                    Y17 = null;
                                                                                                    if (i73 == i65) {
                                                                                                    }
                                                                                                    i76 = s54;
                                                                                                    if (i76 == i75) {
                                                                                                    }
                                                                                                    i79 = s55;
                                                                                                    if (i79 != i78) {
                                                                                                    }
                                                                                                    i80 = i73;
                                                                                                    i81 = s56;
                                                                                                    Y18 = null;
                                                                                                    if (i81 == i78) {
                                                                                                    }
                                                                                                    i83 = s57;
                                                                                                    if (i83 != i82) {
                                                                                                    }
                                                                                                    i84 = i81;
                                                                                                    i85 = s58;
                                                                                                    Y19 = null;
                                                                                                    if (i85 != i82) {
                                                                                                    }
                                                                                                    s58 = i85;
                                                                                                    i86 = s59;
                                                                                                    valueOf8 = null;
                                                                                                    if (i86 != i82) {
                                                                                                    }
                                                                                                }
                                                                                                i55 = i45;
                                                                                                i56 = s41;
                                                                                                valueOf6 = null;
                                                                                                if (i56 != i53) {
                                                                                                    s41 = i56;
                                                                                                    Y9 = l02.Y(i56);
                                                                                                    i57 = s42;
                                                                                                    if (i57 != i53) {
                                                                                                    }
                                                                                                    s42 = i57;
                                                                                                    i58 = s43;
                                                                                                    Y10 = null;
                                                                                                    if (i58 != i53) {
                                                                                                    }
                                                                                                    s43 = i58;
                                                                                                    i59 = s44;
                                                                                                    Y11 = null;
                                                                                                    if (i59 == i53) {
                                                                                                    }
                                                                                                    i62 = s45;
                                                                                                    if (i62 != i61) {
                                                                                                    }
                                                                                                    s44 = i59;
                                                                                                    i63 = s46;
                                                                                                    Y12 = null;
                                                                                                    if (i63 == i61) {
                                                                                                    }
                                                                                                    i66 = s47;
                                                                                                    if (i66 != i65) {
                                                                                                    }
                                                                                                    s46 = i63;
                                                                                                    i67 = s48;
                                                                                                    Y13 = null;
                                                                                                    if (i67 != i65) {
                                                                                                    }
                                                                                                    s48 = i67;
                                                                                                    i68 = s49;
                                                                                                    Y14 = null;
                                                                                                    if (i68 != i65) {
                                                                                                    }
                                                                                                    s49 = i68;
                                                                                                    i69 = s50;
                                                                                                    Y15 = null;
                                                                                                    if (i69 != i65) {
                                                                                                    }
                                                                                                    s50 = i69;
                                                                                                    i70 = i99;
                                                                                                    Y16 = null;
                                                                                                    if (i70 != i65) {
                                                                                                    }
                                                                                                    i71 = i47;
                                                                                                    i72 = s52;
                                                                                                    valueOf7 = null;
                                                                                                    if (i72 != i65) {
                                                                                                    }
                                                                                                    s52 = i72;
                                                                                                    i73 = s53;
                                                                                                    Y17 = null;
                                                                                                    if (i73 == i65) {
                                                                                                    }
                                                                                                    i76 = s54;
                                                                                                    if (i76 == i75) {
                                                                                                    }
                                                                                                    i79 = s55;
                                                                                                    if (i79 != i78) {
                                                                                                    }
                                                                                                    i80 = i73;
                                                                                                    i81 = s56;
                                                                                                    Y18 = null;
                                                                                                    if (i81 == i78) {
                                                                                                    }
                                                                                                    i83 = s57;
                                                                                                    if (i83 != i82) {
                                                                                                    }
                                                                                                    i84 = i81;
                                                                                                    i85 = s58;
                                                                                                    Y19 = null;
                                                                                                    if (i85 != i82) {
                                                                                                    }
                                                                                                    s58 = i85;
                                                                                                    i86 = s59;
                                                                                                    valueOf8 = null;
                                                                                                    if (i86 != i82) {
                                                                                                    }
                                                                                                }
                                                                                                s41 = i56;
                                                                                                i57 = s42;
                                                                                                Y9 = null;
                                                                                                if (i57 != i53) {
                                                                                                }
                                                                                                s42 = i57;
                                                                                                i58 = s43;
                                                                                                Y10 = null;
                                                                                                if (i58 != i53) {
                                                                                                }
                                                                                                s43 = i58;
                                                                                                i59 = s44;
                                                                                                Y11 = null;
                                                                                                if (i59 == i53) {
                                                                                                }
                                                                                                i62 = s45;
                                                                                                if (i62 != i61) {
                                                                                                }
                                                                                                s44 = i59;
                                                                                                i63 = s46;
                                                                                                Y12 = null;
                                                                                                if (i63 == i61) {
                                                                                                }
                                                                                                i66 = s47;
                                                                                                if (i66 != i65) {
                                                                                                }
                                                                                                s46 = i63;
                                                                                                i67 = s48;
                                                                                                Y13 = null;
                                                                                                if (i67 != i65) {
                                                                                                }
                                                                                                s48 = i67;
                                                                                                i68 = s49;
                                                                                                Y14 = null;
                                                                                                if (i68 != i65) {
                                                                                                }
                                                                                                s49 = i68;
                                                                                                i69 = s50;
                                                                                                Y15 = null;
                                                                                                if (i69 != i65) {
                                                                                                }
                                                                                                s50 = i69;
                                                                                                i70 = i99;
                                                                                                Y16 = null;
                                                                                                if (i70 != i65) {
                                                                                                }
                                                                                                i71 = i47;
                                                                                                i72 = s52;
                                                                                                valueOf7 = null;
                                                                                                if (i72 != i65) {
                                                                                                }
                                                                                                s52 = i72;
                                                                                                i73 = s53;
                                                                                                Y17 = null;
                                                                                                if (i73 == i65) {
                                                                                                }
                                                                                                i76 = s54;
                                                                                                if (i76 == i75) {
                                                                                                }
                                                                                                i79 = s55;
                                                                                                if (i79 != i78) {
                                                                                                }
                                                                                                i80 = i73;
                                                                                                i81 = s56;
                                                                                                Y18 = null;
                                                                                                if (i81 == i78) {
                                                                                                }
                                                                                                i83 = s57;
                                                                                                if (i83 != i82) {
                                                                                                }
                                                                                                i84 = i81;
                                                                                                i85 = s58;
                                                                                                Y19 = null;
                                                                                                if (i85 != i82) {
                                                                                                }
                                                                                                s58 = i85;
                                                                                                i86 = s59;
                                                                                                valueOf8 = null;
                                                                                                if (i86 != i82) {
                                                                                                }
                                                                                            }
                                                                                            s36 = i44;
                                                                                            i45 = s37;
                                                                                            Y8 = null;
                                                                                            if (i45 == i41) {
                                                                                            }
                                                                                            if (i47 == i48) {
                                                                                            }
                                                                                            i51 = s39;
                                                                                            if (i51 == i50) {
                                                                                            }
                                                                                            i54 = s40;
                                                                                            if (i54 != i53) {
                                                                                                valueOf6 = Long.valueOf(l02.getLong(i54));
                                                                                                i55 = i45;
                                                                                                i56 = s41;
                                                                                                if (i56 != i53) {
                                                                                                }
                                                                                                s41 = i56;
                                                                                                i57 = s42;
                                                                                                Y9 = null;
                                                                                                if (i57 != i53) {
                                                                                                }
                                                                                                s42 = i57;
                                                                                                i58 = s43;
                                                                                                Y10 = null;
                                                                                                if (i58 != i53) {
                                                                                                }
                                                                                                s43 = i58;
                                                                                                i59 = s44;
                                                                                                Y11 = null;
                                                                                                if (i59 == i53) {
                                                                                                }
                                                                                                i62 = s45;
                                                                                                if (i62 != i61) {
                                                                                                }
                                                                                                s44 = i59;
                                                                                                i63 = s46;
                                                                                                Y12 = null;
                                                                                                if (i63 == i61) {
                                                                                                }
                                                                                                i66 = s47;
                                                                                                if (i66 != i65) {
                                                                                                }
                                                                                                s46 = i63;
                                                                                                i67 = s48;
                                                                                                Y13 = null;
                                                                                                if (i67 != i65) {
                                                                                                }
                                                                                                s48 = i67;
                                                                                                i68 = s49;
                                                                                                Y14 = null;
                                                                                                if (i68 != i65) {
                                                                                                }
                                                                                                s49 = i68;
                                                                                                i69 = s50;
                                                                                                Y15 = null;
                                                                                                if (i69 != i65) {
                                                                                                }
                                                                                                s50 = i69;
                                                                                                i70 = i99;
                                                                                                Y16 = null;
                                                                                                if (i70 != i65) {
                                                                                                }
                                                                                                i71 = i47;
                                                                                                i72 = s52;
                                                                                                valueOf7 = null;
                                                                                                if (i72 != i65) {
                                                                                                }
                                                                                                s52 = i72;
                                                                                                i73 = s53;
                                                                                                Y17 = null;
                                                                                                if (i73 == i65) {
                                                                                                }
                                                                                                i76 = s54;
                                                                                                if (i76 == i75) {
                                                                                                }
                                                                                                i79 = s55;
                                                                                                if (i79 != i78) {
                                                                                                }
                                                                                                i80 = i73;
                                                                                                i81 = s56;
                                                                                                Y18 = null;
                                                                                                if (i81 == i78) {
                                                                                                }
                                                                                                i83 = s57;
                                                                                                if (i83 != i82) {
                                                                                                }
                                                                                                i84 = i81;
                                                                                                i85 = s58;
                                                                                                Y19 = null;
                                                                                                if (i85 != i82) {
                                                                                                }
                                                                                                s58 = i85;
                                                                                                i86 = s59;
                                                                                                valueOf8 = null;
                                                                                                if (i86 != i82) {
                                                                                                }
                                                                                            }
                                                                                            i55 = i45;
                                                                                            i56 = s41;
                                                                                            valueOf6 = null;
                                                                                            if (i56 != i53) {
                                                                                            }
                                                                                            s41 = i56;
                                                                                            i57 = s42;
                                                                                            Y9 = null;
                                                                                            if (i57 != i53) {
                                                                                            }
                                                                                            s42 = i57;
                                                                                            i58 = s43;
                                                                                            Y10 = null;
                                                                                            if (i58 != i53) {
                                                                                            }
                                                                                            s43 = i58;
                                                                                            i59 = s44;
                                                                                            Y11 = null;
                                                                                            if (i59 == i53) {
                                                                                            }
                                                                                            i62 = s45;
                                                                                            if (i62 != i61) {
                                                                                            }
                                                                                            s44 = i59;
                                                                                            i63 = s46;
                                                                                            Y12 = null;
                                                                                            if (i63 == i61) {
                                                                                            }
                                                                                            i66 = s47;
                                                                                            if (i66 != i65) {
                                                                                            }
                                                                                            s46 = i63;
                                                                                            i67 = s48;
                                                                                            Y13 = null;
                                                                                            if (i67 != i65) {
                                                                                            }
                                                                                            s48 = i67;
                                                                                            i68 = s49;
                                                                                            Y14 = null;
                                                                                            if (i68 != i65) {
                                                                                            }
                                                                                            s49 = i68;
                                                                                            i69 = s50;
                                                                                            Y15 = null;
                                                                                            if (i69 != i65) {
                                                                                            }
                                                                                            s50 = i69;
                                                                                            i70 = i99;
                                                                                            Y16 = null;
                                                                                            if (i70 != i65) {
                                                                                            }
                                                                                            i71 = i47;
                                                                                            i72 = s52;
                                                                                            valueOf7 = null;
                                                                                            if (i72 != i65) {
                                                                                            }
                                                                                            s52 = i72;
                                                                                            i73 = s53;
                                                                                            Y17 = null;
                                                                                            if (i73 == i65) {
                                                                                            }
                                                                                            i76 = s54;
                                                                                            if (i76 == i75) {
                                                                                            }
                                                                                            i79 = s55;
                                                                                            if (i79 != i78) {
                                                                                            }
                                                                                            i80 = i73;
                                                                                            i81 = s56;
                                                                                            Y18 = null;
                                                                                            if (i81 == i78) {
                                                                                            }
                                                                                            i83 = s57;
                                                                                            if (i83 != i82) {
                                                                                            }
                                                                                            i84 = i81;
                                                                                            i85 = s58;
                                                                                            Y19 = null;
                                                                                            if (i85 != i82) {
                                                                                            }
                                                                                            s58 = i85;
                                                                                            i86 = s59;
                                                                                            valueOf8 = null;
                                                                                            if (i86 != i82) {
                                                                                            }
                                                                                        }
                                                                                        s35 = i43;
                                                                                        i44 = s36;
                                                                                        Y7 = null;
                                                                                        if (i44 != i41) {
                                                                                            s36 = i44;
                                                                                            Y8 = l02.Y(i44);
                                                                                            i45 = s37;
                                                                                            if (i45 == i41) {
                                                                                            }
                                                                                            if (i47 == i48) {
                                                                                            }
                                                                                            i51 = s39;
                                                                                            if (i51 == i50) {
                                                                                            }
                                                                                            i54 = s40;
                                                                                            if (i54 != i53) {
                                                                                            }
                                                                                            i55 = i45;
                                                                                            i56 = s41;
                                                                                            valueOf6 = null;
                                                                                            if (i56 != i53) {
                                                                                            }
                                                                                            s41 = i56;
                                                                                            i57 = s42;
                                                                                            Y9 = null;
                                                                                            if (i57 != i53) {
                                                                                            }
                                                                                            s42 = i57;
                                                                                            i58 = s43;
                                                                                            Y10 = null;
                                                                                            if (i58 != i53) {
                                                                                            }
                                                                                            s43 = i58;
                                                                                            i59 = s44;
                                                                                            Y11 = null;
                                                                                            if (i59 == i53) {
                                                                                            }
                                                                                            i62 = s45;
                                                                                            if (i62 != i61) {
                                                                                            }
                                                                                            s44 = i59;
                                                                                            i63 = s46;
                                                                                            Y12 = null;
                                                                                            if (i63 == i61) {
                                                                                            }
                                                                                            i66 = s47;
                                                                                            if (i66 != i65) {
                                                                                            }
                                                                                            s46 = i63;
                                                                                            i67 = s48;
                                                                                            Y13 = null;
                                                                                            if (i67 != i65) {
                                                                                            }
                                                                                            s48 = i67;
                                                                                            i68 = s49;
                                                                                            Y14 = null;
                                                                                            if (i68 != i65) {
                                                                                            }
                                                                                            s49 = i68;
                                                                                            i69 = s50;
                                                                                            Y15 = null;
                                                                                            if (i69 != i65) {
                                                                                            }
                                                                                            s50 = i69;
                                                                                            i70 = i99;
                                                                                            Y16 = null;
                                                                                            if (i70 != i65) {
                                                                                            }
                                                                                            i71 = i47;
                                                                                            i72 = s52;
                                                                                            valueOf7 = null;
                                                                                            if (i72 != i65) {
                                                                                            }
                                                                                            s52 = i72;
                                                                                            i73 = s53;
                                                                                            Y17 = null;
                                                                                            if (i73 == i65) {
                                                                                            }
                                                                                            i76 = s54;
                                                                                            if (i76 == i75) {
                                                                                            }
                                                                                            i79 = s55;
                                                                                            if (i79 != i78) {
                                                                                            }
                                                                                            i80 = i73;
                                                                                            i81 = s56;
                                                                                            Y18 = null;
                                                                                            if (i81 == i78) {
                                                                                            }
                                                                                            i83 = s57;
                                                                                            if (i83 != i82) {
                                                                                            }
                                                                                            i84 = i81;
                                                                                            i85 = s58;
                                                                                            Y19 = null;
                                                                                            if (i85 != i82) {
                                                                                            }
                                                                                            s58 = i85;
                                                                                            i86 = s59;
                                                                                            valueOf8 = null;
                                                                                            if (i86 != i82) {
                                                                                            }
                                                                                        }
                                                                                        s36 = i44;
                                                                                        i45 = s37;
                                                                                        Y8 = null;
                                                                                        if (i45 == i41) {
                                                                                        }
                                                                                        if (i47 == i48) {
                                                                                        }
                                                                                        i51 = s39;
                                                                                        if (i51 == i50) {
                                                                                        }
                                                                                        i54 = s40;
                                                                                        if (i54 != i53) {
                                                                                        }
                                                                                        i55 = i45;
                                                                                        i56 = s41;
                                                                                        valueOf6 = null;
                                                                                        if (i56 != i53) {
                                                                                        }
                                                                                        s41 = i56;
                                                                                        i57 = s42;
                                                                                        Y9 = null;
                                                                                        if (i57 != i53) {
                                                                                        }
                                                                                        s42 = i57;
                                                                                        i58 = s43;
                                                                                        Y10 = null;
                                                                                        if (i58 != i53) {
                                                                                        }
                                                                                        s43 = i58;
                                                                                        i59 = s44;
                                                                                        Y11 = null;
                                                                                        if (i59 == i53) {
                                                                                        }
                                                                                        i62 = s45;
                                                                                        if (i62 != i61) {
                                                                                        }
                                                                                        s44 = i59;
                                                                                        i63 = s46;
                                                                                        Y12 = null;
                                                                                        if (i63 == i61) {
                                                                                        }
                                                                                        i66 = s47;
                                                                                        if (i66 != i65) {
                                                                                        }
                                                                                        s46 = i63;
                                                                                        i67 = s48;
                                                                                        Y13 = null;
                                                                                        if (i67 != i65) {
                                                                                        }
                                                                                        s48 = i67;
                                                                                        i68 = s49;
                                                                                        Y14 = null;
                                                                                        if (i68 != i65) {
                                                                                        }
                                                                                        s49 = i68;
                                                                                        i69 = s50;
                                                                                        Y15 = null;
                                                                                        if (i69 != i65) {
                                                                                        }
                                                                                        s50 = i69;
                                                                                        i70 = i99;
                                                                                        Y16 = null;
                                                                                        if (i70 != i65) {
                                                                                        }
                                                                                        i71 = i47;
                                                                                        i72 = s52;
                                                                                        valueOf7 = null;
                                                                                        if (i72 != i65) {
                                                                                        }
                                                                                        s52 = i72;
                                                                                        i73 = s53;
                                                                                        Y17 = null;
                                                                                        if (i73 == i65) {
                                                                                        }
                                                                                        i76 = s54;
                                                                                        if (i76 == i75) {
                                                                                        }
                                                                                        i79 = s55;
                                                                                        if (i79 != i78) {
                                                                                        }
                                                                                        i80 = i73;
                                                                                        i81 = s56;
                                                                                        Y18 = null;
                                                                                        if (i81 == i78) {
                                                                                        }
                                                                                        i83 = s57;
                                                                                        if (i83 != i82) {
                                                                                        }
                                                                                        i84 = i81;
                                                                                        i85 = s58;
                                                                                        Y19 = null;
                                                                                        if (i85 != i82) {
                                                                                        }
                                                                                        s58 = i85;
                                                                                        i86 = s59;
                                                                                        valueOf8 = null;
                                                                                        if (i86 != i82) {
                                                                                        }
                                                                                    }
                                                                                    s34 = i42;
                                                                                    i43 = s35;
                                                                                    valueOf4 = null;
                                                                                    if (i43 != i41) {
                                                                                        s35 = i43;
                                                                                        Y7 = l02.Y(i43);
                                                                                        i44 = s36;
                                                                                        if (i44 != i41) {
                                                                                        }
                                                                                        s36 = i44;
                                                                                        i45 = s37;
                                                                                        Y8 = null;
                                                                                        if (i45 == i41) {
                                                                                        }
                                                                                        if (i47 == i48) {
                                                                                        }
                                                                                        i51 = s39;
                                                                                        if (i51 == i50) {
                                                                                        }
                                                                                        i54 = s40;
                                                                                        if (i54 != i53) {
                                                                                        }
                                                                                        i55 = i45;
                                                                                        i56 = s41;
                                                                                        valueOf6 = null;
                                                                                        if (i56 != i53) {
                                                                                        }
                                                                                        s41 = i56;
                                                                                        i57 = s42;
                                                                                        Y9 = null;
                                                                                        if (i57 != i53) {
                                                                                        }
                                                                                        s42 = i57;
                                                                                        i58 = s43;
                                                                                        Y10 = null;
                                                                                        if (i58 != i53) {
                                                                                        }
                                                                                        s43 = i58;
                                                                                        i59 = s44;
                                                                                        Y11 = null;
                                                                                        if (i59 == i53) {
                                                                                        }
                                                                                        i62 = s45;
                                                                                        if (i62 != i61) {
                                                                                        }
                                                                                        s44 = i59;
                                                                                        i63 = s46;
                                                                                        Y12 = null;
                                                                                        if (i63 == i61) {
                                                                                        }
                                                                                        i66 = s47;
                                                                                        if (i66 != i65) {
                                                                                        }
                                                                                        s46 = i63;
                                                                                        i67 = s48;
                                                                                        Y13 = null;
                                                                                        if (i67 != i65) {
                                                                                        }
                                                                                        s48 = i67;
                                                                                        i68 = s49;
                                                                                        Y14 = null;
                                                                                        if (i68 != i65) {
                                                                                        }
                                                                                        s49 = i68;
                                                                                        i69 = s50;
                                                                                        Y15 = null;
                                                                                        if (i69 != i65) {
                                                                                        }
                                                                                        s50 = i69;
                                                                                        i70 = i99;
                                                                                        Y16 = null;
                                                                                        if (i70 != i65) {
                                                                                        }
                                                                                        i71 = i47;
                                                                                        i72 = s52;
                                                                                        valueOf7 = null;
                                                                                        if (i72 != i65) {
                                                                                        }
                                                                                        s52 = i72;
                                                                                        i73 = s53;
                                                                                        Y17 = null;
                                                                                        if (i73 == i65) {
                                                                                        }
                                                                                        i76 = s54;
                                                                                        if (i76 == i75) {
                                                                                        }
                                                                                        i79 = s55;
                                                                                        if (i79 != i78) {
                                                                                        }
                                                                                        i80 = i73;
                                                                                        i81 = s56;
                                                                                        Y18 = null;
                                                                                        if (i81 == i78) {
                                                                                        }
                                                                                        i83 = s57;
                                                                                        if (i83 != i82) {
                                                                                        }
                                                                                        i84 = i81;
                                                                                        i85 = s58;
                                                                                        Y19 = null;
                                                                                        if (i85 != i82) {
                                                                                        }
                                                                                        s58 = i85;
                                                                                        i86 = s59;
                                                                                        valueOf8 = null;
                                                                                        if (i86 != i82) {
                                                                                        }
                                                                                    }
                                                                                    s35 = i43;
                                                                                    i44 = s36;
                                                                                    Y7 = null;
                                                                                    if (i44 != i41) {
                                                                                    }
                                                                                    s36 = i44;
                                                                                    i45 = s37;
                                                                                    Y8 = null;
                                                                                    if (i45 == i41) {
                                                                                    }
                                                                                    if (i47 == i48) {
                                                                                    }
                                                                                    i51 = s39;
                                                                                    if (i51 == i50) {
                                                                                    }
                                                                                    i54 = s40;
                                                                                    if (i54 != i53) {
                                                                                    }
                                                                                    i55 = i45;
                                                                                    i56 = s41;
                                                                                    valueOf6 = null;
                                                                                    if (i56 != i53) {
                                                                                    }
                                                                                    s41 = i56;
                                                                                    i57 = s42;
                                                                                    Y9 = null;
                                                                                    if (i57 != i53) {
                                                                                    }
                                                                                    s42 = i57;
                                                                                    i58 = s43;
                                                                                    Y10 = null;
                                                                                    if (i58 != i53) {
                                                                                    }
                                                                                    s43 = i58;
                                                                                    i59 = s44;
                                                                                    Y11 = null;
                                                                                    if (i59 == i53) {
                                                                                    }
                                                                                    i62 = s45;
                                                                                    if (i62 != i61) {
                                                                                    }
                                                                                    s44 = i59;
                                                                                    i63 = s46;
                                                                                    Y12 = null;
                                                                                    if (i63 == i61) {
                                                                                    }
                                                                                    i66 = s47;
                                                                                    if (i66 != i65) {
                                                                                    }
                                                                                    s46 = i63;
                                                                                    i67 = s48;
                                                                                    Y13 = null;
                                                                                    if (i67 != i65) {
                                                                                    }
                                                                                    s48 = i67;
                                                                                    i68 = s49;
                                                                                    Y14 = null;
                                                                                    if (i68 != i65) {
                                                                                    }
                                                                                    s49 = i68;
                                                                                    i69 = s50;
                                                                                    Y15 = null;
                                                                                    if (i69 != i65) {
                                                                                    }
                                                                                    s50 = i69;
                                                                                    i70 = i99;
                                                                                    Y16 = null;
                                                                                    if (i70 != i65) {
                                                                                    }
                                                                                    i71 = i47;
                                                                                    i72 = s52;
                                                                                    valueOf7 = null;
                                                                                    if (i72 != i65) {
                                                                                    }
                                                                                    s52 = i72;
                                                                                    i73 = s53;
                                                                                    Y17 = null;
                                                                                    if (i73 == i65) {
                                                                                    }
                                                                                    i76 = s54;
                                                                                    if (i76 == i75) {
                                                                                    }
                                                                                    i79 = s55;
                                                                                    if (i79 != i78) {
                                                                                    }
                                                                                    i80 = i73;
                                                                                    i81 = s56;
                                                                                    Y18 = null;
                                                                                    if (i81 == i78) {
                                                                                    }
                                                                                    i83 = s57;
                                                                                    if (i83 != i82) {
                                                                                    }
                                                                                    i84 = i81;
                                                                                    i85 = s58;
                                                                                    Y19 = null;
                                                                                    if (i85 != i82) {
                                                                                    }
                                                                                    s58 = i85;
                                                                                    i86 = s59;
                                                                                    valueOf8 = null;
                                                                                    if (i86 != i82) {
                                                                                    }
                                                                                }
                                                                                s33 = i40;
                                                                                i42 = s34;
                                                                                valueOf3 = null;
                                                                                if (i42 != i41) {
                                                                                    s34 = i42;
                                                                                    valueOf4 = Long.valueOf(l02.getLong(i42));
                                                                                    i43 = s35;
                                                                                    if (i43 != i41) {
                                                                                    }
                                                                                    s35 = i43;
                                                                                    i44 = s36;
                                                                                    Y7 = null;
                                                                                    if (i44 != i41) {
                                                                                    }
                                                                                    s36 = i44;
                                                                                    i45 = s37;
                                                                                    Y8 = null;
                                                                                    if (i45 == i41) {
                                                                                    }
                                                                                    if (i47 == i48) {
                                                                                    }
                                                                                    i51 = s39;
                                                                                    if (i51 == i50) {
                                                                                    }
                                                                                    i54 = s40;
                                                                                    if (i54 != i53) {
                                                                                    }
                                                                                    i55 = i45;
                                                                                    i56 = s41;
                                                                                    valueOf6 = null;
                                                                                    if (i56 != i53) {
                                                                                    }
                                                                                    s41 = i56;
                                                                                    i57 = s42;
                                                                                    Y9 = null;
                                                                                    if (i57 != i53) {
                                                                                    }
                                                                                    s42 = i57;
                                                                                    i58 = s43;
                                                                                    Y10 = null;
                                                                                    if (i58 != i53) {
                                                                                    }
                                                                                    s43 = i58;
                                                                                    i59 = s44;
                                                                                    Y11 = null;
                                                                                    if (i59 == i53) {
                                                                                    }
                                                                                    i62 = s45;
                                                                                    if (i62 != i61) {
                                                                                    }
                                                                                    s44 = i59;
                                                                                    i63 = s46;
                                                                                    Y12 = null;
                                                                                    if (i63 == i61) {
                                                                                    }
                                                                                    i66 = s47;
                                                                                    if (i66 != i65) {
                                                                                    }
                                                                                    s46 = i63;
                                                                                    i67 = s48;
                                                                                    Y13 = null;
                                                                                    if (i67 != i65) {
                                                                                    }
                                                                                    s48 = i67;
                                                                                    i68 = s49;
                                                                                    Y14 = null;
                                                                                    if (i68 != i65) {
                                                                                    }
                                                                                    s49 = i68;
                                                                                    i69 = s50;
                                                                                    Y15 = null;
                                                                                    if (i69 != i65) {
                                                                                    }
                                                                                    s50 = i69;
                                                                                    i70 = i99;
                                                                                    Y16 = null;
                                                                                    if (i70 != i65) {
                                                                                    }
                                                                                    i71 = i47;
                                                                                    i72 = s52;
                                                                                    valueOf7 = null;
                                                                                    if (i72 != i65) {
                                                                                    }
                                                                                    s52 = i72;
                                                                                    i73 = s53;
                                                                                    Y17 = null;
                                                                                    if (i73 == i65) {
                                                                                    }
                                                                                    i76 = s54;
                                                                                    if (i76 == i75) {
                                                                                    }
                                                                                    i79 = s55;
                                                                                    if (i79 != i78) {
                                                                                    }
                                                                                    i80 = i73;
                                                                                    i81 = s56;
                                                                                    Y18 = null;
                                                                                    if (i81 == i78) {
                                                                                    }
                                                                                    i83 = s57;
                                                                                    if (i83 != i82) {
                                                                                    }
                                                                                    i84 = i81;
                                                                                    i85 = s58;
                                                                                    Y19 = null;
                                                                                    if (i85 != i82) {
                                                                                    }
                                                                                    s58 = i85;
                                                                                    i86 = s59;
                                                                                    valueOf8 = null;
                                                                                    if (i86 != i82) {
                                                                                    }
                                                                                }
                                                                                s34 = i42;
                                                                                i43 = s35;
                                                                                valueOf4 = null;
                                                                                if (i43 != i41) {
                                                                                }
                                                                                s35 = i43;
                                                                                i44 = s36;
                                                                                Y7 = null;
                                                                                if (i44 != i41) {
                                                                                }
                                                                                s36 = i44;
                                                                                i45 = s37;
                                                                                Y8 = null;
                                                                                if (i45 == i41) {
                                                                                }
                                                                                if (i47 == i48) {
                                                                                }
                                                                                i51 = s39;
                                                                                if (i51 == i50) {
                                                                                }
                                                                                i54 = s40;
                                                                                if (i54 != i53) {
                                                                                }
                                                                                i55 = i45;
                                                                                i56 = s41;
                                                                                valueOf6 = null;
                                                                                if (i56 != i53) {
                                                                                }
                                                                                s41 = i56;
                                                                                i57 = s42;
                                                                                Y9 = null;
                                                                                if (i57 != i53) {
                                                                                }
                                                                                s42 = i57;
                                                                                i58 = s43;
                                                                                Y10 = null;
                                                                                if (i58 != i53) {
                                                                                }
                                                                                s43 = i58;
                                                                                i59 = s44;
                                                                                Y11 = null;
                                                                                if (i59 == i53) {
                                                                                }
                                                                                i62 = s45;
                                                                                if (i62 != i61) {
                                                                                }
                                                                                s44 = i59;
                                                                                i63 = s46;
                                                                                Y12 = null;
                                                                                if (i63 == i61) {
                                                                                }
                                                                                i66 = s47;
                                                                                if (i66 != i65) {
                                                                                }
                                                                                s46 = i63;
                                                                                i67 = s48;
                                                                                Y13 = null;
                                                                                if (i67 != i65) {
                                                                                }
                                                                                s48 = i67;
                                                                                i68 = s49;
                                                                                Y14 = null;
                                                                                if (i68 != i65) {
                                                                                }
                                                                                s49 = i68;
                                                                                i69 = s50;
                                                                                Y15 = null;
                                                                                if (i69 != i65) {
                                                                                }
                                                                                s50 = i69;
                                                                                i70 = i99;
                                                                                Y16 = null;
                                                                                if (i70 != i65) {
                                                                                }
                                                                                i71 = i47;
                                                                                i72 = s52;
                                                                                valueOf7 = null;
                                                                                if (i72 != i65) {
                                                                                }
                                                                                s52 = i72;
                                                                                i73 = s53;
                                                                                Y17 = null;
                                                                                if (i73 == i65) {
                                                                                }
                                                                                i76 = s54;
                                                                                if (i76 == i75) {
                                                                                }
                                                                                i79 = s55;
                                                                                if (i79 != i78) {
                                                                                }
                                                                                i80 = i73;
                                                                                i81 = s56;
                                                                                Y18 = null;
                                                                                if (i81 == i78) {
                                                                                }
                                                                                i83 = s57;
                                                                                if (i83 != i82) {
                                                                                }
                                                                                i84 = i81;
                                                                                i85 = s58;
                                                                                Y19 = null;
                                                                                if (i85 != i82) {
                                                                                }
                                                                                s58 = i85;
                                                                                i86 = s59;
                                                                                valueOf8 = null;
                                                                                if (i86 != i82) {
                                                                                }
                                                                            }
                                                                            valueOf2 = null;
                                                                            if (i40 != i41) {
                                                                                s33 = i40;
                                                                                valueOf3 = Long.valueOf(l02.getLong(i40));
                                                                                i42 = s34;
                                                                                if (i42 != i41) {
                                                                                }
                                                                                s34 = i42;
                                                                                i43 = s35;
                                                                                valueOf4 = null;
                                                                                if (i43 != i41) {
                                                                                }
                                                                                s35 = i43;
                                                                                i44 = s36;
                                                                                Y7 = null;
                                                                                if (i44 != i41) {
                                                                                }
                                                                                s36 = i44;
                                                                                i45 = s37;
                                                                                Y8 = null;
                                                                                if (i45 == i41) {
                                                                                }
                                                                                if (i47 == i48) {
                                                                                }
                                                                                i51 = s39;
                                                                                if (i51 == i50) {
                                                                                }
                                                                                i54 = s40;
                                                                                if (i54 != i53) {
                                                                                }
                                                                                i55 = i45;
                                                                                i56 = s41;
                                                                                valueOf6 = null;
                                                                                if (i56 != i53) {
                                                                                }
                                                                                s41 = i56;
                                                                                i57 = s42;
                                                                                Y9 = null;
                                                                                if (i57 != i53) {
                                                                                }
                                                                                s42 = i57;
                                                                                i58 = s43;
                                                                                Y10 = null;
                                                                                if (i58 != i53) {
                                                                                }
                                                                                s43 = i58;
                                                                                i59 = s44;
                                                                                Y11 = null;
                                                                                if (i59 == i53) {
                                                                                }
                                                                                i62 = s45;
                                                                                if (i62 != i61) {
                                                                                }
                                                                                s44 = i59;
                                                                                i63 = s46;
                                                                                Y12 = null;
                                                                                if (i63 == i61) {
                                                                                }
                                                                                i66 = s47;
                                                                                if (i66 != i65) {
                                                                                }
                                                                                s46 = i63;
                                                                                i67 = s48;
                                                                                Y13 = null;
                                                                                if (i67 != i65) {
                                                                                }
                                                                                s48 = i67;
                                                                                i68 = s49;
                                                                                Y14 = null;
                                                                                if (i68 != i65) {
                                                                                }
                                                                                s49 = i68;
                                                                                i69 = s50;
                                                                                Y15 = null;
                                                                                if (i69 != i65) {
                                                                                }
                                                                                s50 = i69;
                                                                                i70 = i99;
                                                                                Y16 = null;
                                                                                if (i70 != i65) {
                                                                                }
                                                                                i71 = i47;
                                                                                i72 = s52;
                                                                                valueOf7 = null;
                                                                                if (i72 != i65) {
                                                                                }
                                                                                s52 = i72;
                                                                                i73 = s53;
                                                                                Y17 = null;
                                                                                if (i73 == i65) {
                                                                                }
                                                                                i76 = s54;
                                                                                if (i76 == i75) {
                                                                                }
                                                                                i79 = s55;
                                                                                if (i79 != i78) {
                                                                                }
                                                                                i80 = i73;
                                                                                i81 = s56;
                                                                                Y18 = null;
                                                                                if (i81 == i78) {
                                                                                }
                                                                                i83 = s57;
                                                                                if (i83 != i82) {
                                                                                }
                                                                                i84 = i81;
                                                                                i85 = s58;
                                                                                Y19 = null;
                                                                                if (i85 != i82) {
                                                                                }
                                                                                s58 = i85;
                                                                                i86 = s59;
                                                                                valueOf8 = null;
                                                                                if (i86 != i82) {
                                                                                }
                                                                            }
                                                                            s33 = i40;
                                                                            i42 = s34;
                                                                            valueOf3 = null;
                                                                            if (i42 != i41) {
                                                                            }
                                                                            s34 = i42;
                                                                            i43 = s35;
                                                                            valueOf4 = null;
                                                                            if (i43 != i41) {
                                                                            }
                                                                            s35 = i43;
                                                                            i44 = s36;
                                                                            Y7 = null;
                                                                            if (i44 != i41) {
                                                                            }
                                                                            s36 = i44;
                                                                            i45 = s37;
                                                                            Y8 = null;
                                                                            if (i45 == i41) {
                                                                            }
                                                                            if (i47 == i48) {
                                                                            }
                                                                            i51 = s39;
                                                                            if (i51 == i50) {
                                                                            }
                                                                            i54 = s40;
                                                                            if (i54 != i53) {
                                                                            }
                                                                            i55 = i45;
                                                                            i56 = s41;
                                                                            valueOf6 = null;
                                                                            if (i56 != i53) {
                                                                            }
                                                                            s41 = i56;
                                                                            i57 = s42;
                                                                            Y9 = null;
                                                                            if (i57 != i53) {
                                                                            }
                                                                            s42 = i57;
                                                                            i58 = s43;
                                                                            Y10 = null;
                                                                            if (i58 != i53) {
                                                                            }
                                                                            s43 = i58;
                                                                            i59 = s44;
                                                                            Y11 = null;
                                                                            if (i59 == i53) {
                                                                            }
                                                                            i62 = s45;
                                                                            if (i62 != i61) {
                                                                            }
                                                                            s44 = i59;
                                                                            i63 = s46;
                                                                            Y12 = null;
                                                                            if (i63 == i61) {
                                                                            }
                                                                            i66 = s47;
                                                                            if (i66 != i65) {
                                                                            }
                                                                            s46 = i63;
                                                                            i67 = s48;
                                                                            Y13 = null;
                                                                            if (i67 != i65) {
                                                                            }
                                                                            s48 = i67;
                                                                            i68 = s49;
                                                                            Y14 = null;
                                                                            if (i68 != i65) {
                                                                            }
                                                                            s49 = i68;
                                                                            i69 = s50;
                                                                            Y15 = null;
                                                                            if (i69 != i65) {
                                                                            }
                                                                            s50 = i69;
                                                                            i70 = i99;
                                                                            Y16 = null;
                                                                            if (i70 != i65) {
                                                                            }
                                                                            i71 = i47;
                                                                            i72 = s52;
                                                                            valueOf7 = null;
                                                                            if (i72 != i65) {
                                                                            }
                                                                            s52 = i72;
                                                                            i73 = s53;
                                                                            Y17 = null;
                                                                            if (i73 == i65) {
                                                                            }
                                                                            i76 = s54;
                                                                            if (i76 == i75) {
                                                                            }
                                                                            i79 = s55;
                                                                            if (i79 != i78) {
                                                                            }
                                                                            i80 = i73;
                                                                            i81 = s56;
                                                                            Y18 = null;
                                                                            if (i81 == i78) {
                                                                            }
                                                                            i83 = s57;
                                                                            if (i83 != i82) {
                                                                            }
                                                                            i84 = i81;
                                                                            i85 = s58;
                                                                            Y19 = null;
                                                                            if (i85 != i82) {
                                                                            }
                                                                            s58 = i85;
                                                                            i86 = s59;
                                                                            valueOf8 = null;
                                                                            if (i86 != i82) {
                                                                            }
                                                                        }
                                                                        s30 = i110;
                                                                        i35 = s31;
                                                                        Y6 = null;
                                                                        if (i35 != -1) {
                                                                        }
                                                                        i37 = s32;
                                                                        if (i37 != i36) {
                                                                        }
                                                                        valueOf2 = null;
                                                                        if (i40 != i41) {
                                                                        }
                                                                        s33 = i40;
                                                                        i42 = s34;
                                                                        valueOf3 = null;
                                                                        if (i42 != i41) {
                                                                        }
                                                                        s34 = i42;
                                                                        i43 = s35;
                                                                        valueOf4 = null;
                                                                        if (i43 != i41) {
                                                                        }
                                                                        s35 = i43;
                                                                        i44 = s36;
                                                                        Y7 = null;
                                                                        if (i44 != i41) {
                                                                        }
                                                                        s36 = i44;
                                                                        i45 = s37;
                                                                        Y8 = null;
                                                                        if (i45 == i41) {
                                                                        }
                                                                        if (i47 == i48) {
                                                                        }
                                                                        i51 = s39;
                                                                        if (i51 == i50) {
                                                                        }
                                                                        i54 = s40;
                                                                        if (i54 != i53) {
                                                                        }
                                                                        i55 = i45;
                                                                        i56 = s41;
                                                                        valueOf6 = null;
                                                                        if (i56 != i53) {
                                                                        }
                                                                        s41 = i56;
                                                                        i57 = s42;
                                                                        Y9 = null;
                                                                        if (i57 != i53) {
                                                                        }
                                                                        s42 = i57;
                                                                        i58 = s43;
                                                                        Y10 = null;
                                                                        if (i58 != i53) {
                                                                        }
                                                                        s43 = i58;
                                                                        i59 = s44;
                                                                        Y11 = null;
                                                                        if (i59 == i53) {
                                                                        }
                                                                        i62 = s45;
                                                                        if (i62 != i61) {
                                                                        }
                                                                        s44 = i59;
                                                                        i63 = s46;
                                                                        Y12 = null;
                                                                        if (i63 == i61) {
                                                                        }
                                                                        i66 = s47;
                                                                        if (i66 != i65) {
                                                                        }
                                                                        s46 = i63;
                                                                        i67 = s48;
                                                                        Y13 = null;
                                                                        if (i67 != i65) {
                                                                        }
                                                                        s48 = i67;
                                                                        i68 = s49;
                                                                        Y14 = null;
                                                                        if (i68 != i65) {
                                                                        }
                                                                        s49 = i68;
                                                                        i69 = s50;
                                                                        Y15 = null;
                                                                        if (i69 != i65) {
                                                                        }
                                                                        s50 = i69;
                                                                        i70 = i99;
                                                                        Y16 = null;
                                                                        if (i70 != i65) {
                                                                        }
                                                                        i71 = i47;
                                                                        i72 = s52;
                                                                        valueOf7 = null;
                                                                        if (i72 != i65) {
                                                                        }
                                                                        s52 = i72;
                                                                        i73 = s53;
                                                                        Y17 = null;
                                                                        if (i73 == i65) {
                                                                        }
                                                                        i76 = s54;
                                                                        if (i76 == i75) {
                                                                        }
                                                                        i79 = s55;
                                                                        if (i79 != i78) {
                                                                        }
                                                                        i80 = i73;
                                                                        i81 = s56;
                                                                        Y18 = null;
                                                                        if (i81 == i78) {
                                                                        }
                                                                        i83 = s57;
                                                                        if (i83 != i82) {
                                                                        }
                                                                        i84 = i81;
                                                                        i85 = s58;
                                                                        Y19 = null;
                                                                        if (i85 != i82) {
                                                                        }
                                                                        s58 = i85;
                                                                        i86 = s59;
                                                                        valueOf8 = null;
                                                                        if (i86 != i82) {
                                                                        }
                                                                    } else {
                                                                        throw new IllegalStateException("Missing column 'genre' for a NON-NULL value, column not found in result.");
                                                                    }
                                                                }
                                                                s28 = i33;
                                                                i34 = s29;
                                                                Y5 = null;
                                                                if (i34 == i30) {
                                                                }
                                                            }
                                                            i32 = i26;
                                                            i33 = s28;
                                                            Y4 = null;
                                                            if (i33 != i30) {
                                                                s28 = i33;
                                                                Y5 = l02.Y(i33);
                                                                i34 = s29;
                                                                if (i34 == i30) {
                                                                }
                                                            }
                                                            s28 = i33;
                                                            i34 = s29;
                                                            Y5 = null;
                                                            if (i34 == i30) {
                                                            }
                                                        }
                                                        Y3 = null;
                                                        boolean z202 = true;
                                                        i26 = s25;
                                                        if (i26 != -1) {
                                                        }
                                                        i29 = s26;
                                                        if (i29 != i28) {
                                                        }
                                                        i31 = s27;
                                                        if (i31 != i30) {
                                                            i32 = i26;
                                                            Y4 = l02.Y(i31);
                                                            i33 = s28;
                                                            if (i33 != i30) {
                                                            }
                                                            s28 = i33;
                                                            i34 = s29;
                                                            Y5 = null;
                                                            if (i34 == i30) {
                                                            }
                                                        }
                                                        i32 = i26;
                                                        i33 = s28;
                                                        Y4 = null;
                                                        if (i33 != i30) {
                                                        }
                                                        s28 = i33;
                                                        i34 = s29;
                                                        Y5 = null;
                                                        if (i34 == i30) {
                                                        }
                                                    }
                                                    int i115 = s23;
                                                    i23 = i21;
                                                    i24 = i115;
                                                    str6 = null;
                                                    i25 = s24;
                                                    int i1092 = i24;
                                                    long j132 = i24 != -1 ? l02.getLong(i24) : 0L;
                                                    if (i25 != -1) {
                                                        Y3 = l02.Y(i25);
                                                        boolean z2022 = true;
                                                        i26 = s25;
                                                        if (i26 != -1) {
                                                        }
                                                        i29 = s26;
                                                        if (i29 != i28) {
                                                        }
                                                        i31 = s27;
                                                        if (i31 != i30) {
                                                        }
                                                        i32 = i26;
                                                        i33 = s28;
                                                        Y4 = null;
                                                        if (i33 != i30) {
                                                        }
                                                        s28 = i33;
                                                        i34 = s29;
                                                        Y5 = null;
                                                        if (i34 == i30) {
                                                        }
                                                    }
                                                    Y3 = null;
                                                    boolean z20222 = true;
                                                    i26 = s25;
                                                    if (i26 != -1) {
                                                    }
                                                    i29 = s26;
                                                    if (i29 != i28) {
                                                    }
                                                    i31 = s27;
                                                    if (i31 != i30) {
                                                    }
                                                    i32 = i26;
                                                    i33 = s28;
                                                    Y4 = null;
                                                    if (i33 != i30) {
                                                    }
                                                    s28 = i33;
                                                    i34 = s29;
                                                    Y5 = null;
                                                    if (i34 == i30) {
                                                    }
                                                }
                                                int i116 = i19;
                                                i21 = s22;
                                                i22 = i116;
                                                str5 = null;
                                                if (i21 != -1) {
                                                    String Y302 = l02.Y(i21);
                                                    int i1082 = s23;
                                                    i23 = i21;
                                                    i24 = i1082;
                                                    str6 = Y302;
                                                    i25 = s24;
                                                    int i10922 = i24;
                                                    long j1322 = i24 != -1 ? l02.getLong(i24) : 0L;
                                                    if (i25 != -1) {
                                                    }
                                                    Y3 = null;
                                                    boolean z202222 = true;
                                                    i26 = s25;
                                                    if (i26 != -1) {
                                                    }
                                                    i29 = s26;
                                                    if (i29 != i28) {
                                                    }
                                                    i31 = s27;
                                                    if (i31 != i30) {
                                                    }
                                                    i32 = i26;
                                                    i33 = s28;
                                                    Y4 = null;
                                                    if (i33 != i30) {
                                                    }
                                                    s28 = i33;
                                                    i34 = s29;
                                                    Y5 = null;
                                                    if (i34 == i30) {
                                                    }
                                                }
                                                int i1152 = s23;
                                                i23 = i21;
                                                i24 = i1152;
                                                str6 = null;
                                                i25 = s24;
                                                int i109222 = i24;
                                                long j13222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                                if (i25 != -1) {
                                                }
                                                Y3 = null;
                                                boolean z2022222 = true;
                                                i26 = s25;
                                                if (i26 != -1) {
                                                }
                                                i29 = s26;
                                                if (i29 != i28) {
                                                }
                                                i31 = s27;
                                                if (i31 != i30) {
                                                }
                                                i32 = i26;
                                                i33 = s28;
                                                Y4 = null;
                                                if (i33 != i30) {
                                                }
                                                s28 = i33;
                                                i34 = s29;
                                                Y5 = null;
                                                if (i34 == i30) {
                                                }
                                            }
                                            int i117 = i18;
                                            i19 = s21;
                                            i20 = i117;
                                            str4 = null;
                                            if (i19 != -1) {
                                                String Y292 = l02.Y(i19);
                                                int i1072 = i19;
                                                i21 = s22;
                                                i22 = i1072;
                                                str5 = Y292;
                                                if (i21 != -1) {
                                                }
                                                int i11522 = s23;
                                                i23 = i21;
                                                i24 = i11522;
                                                str6 = null;
                                                i25 = s24;
                                                int i1092222 = i24;
                                                long j132222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                                if (i25 != -1) {
                                                }
                                                Y3 = null;
                                                boolean z20222222 = true;
                                                i26 = s25;
                                                if (i26 != -1) {
                                                }
                                                i29 = s26;
                                                if (i29 != i28) {
                                                }
                                                i31 = s27;
                                                if (i31 != i30) {
                                                }
                                                i32 = i26;
                                                i33 = s28;
                                                Y4 = null;
                                                if (i33 != i30) {
                                                }
                                                s28 = i33;
                                                i34 = s29;
                                                Y5 = null;
                                                if (i34 == i30) {
                                                }
                                            }
                                            int i1162 = i19;
                                            i21 = s22;
                                            i22 = i1162;
                                            str5 = null;
                                            if (i21 != -1) {
                                            }
                                            int i115222 = s23;
                                            i23 = i21;
                                            i24 = i115222;
                                            str6 = null;
                                            i25 = s24;
                                            int i10922222 = i24;
                                            long j1322222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                            if (i25 != -1) {
                                            }
                                            Y3 = null;
                                            boolean z202222222 = true;
                                            i26 = s25;
                                            if (i26 != -1) {
                                            }
                                            i29 = s26;
                                            if (i29 != i28) {
                                            }
                                            i31 = s27;
                                            if (i31 != i30) {
                                            }
                                            i32 = i26;
                                            i33 = s28;
                                            Y4 = null;
                                            if (i33 != i30) {
                                            }
                                            s28 = i33;
                                            i34 = s29;
                                            Y5 = null;
                                            if (i34 == i30) {
                                            }
                                        }
                                        int i118 = i93;
                                        i17 = i16;
                                        i18 = i118;
                                        str3 = null;
                                        if (i18 != -1) {
                                            String Y282 = l02.Y(i18);
                                            int i1062 = i18;
                                            i19 = s21;
                                            i20 = i1062;
                                            str4 = Y282;
                                            if (i19 != -1) {
                                            }
                                            int i11622 = i19;
                                            i21 = s22;
                                            i22 = i11622;
                                            str5 = null;
                                            if (i21 != -1) {
                                            }
                                            int i1152222 = s23;
                                            i23 = i21;
                                            i24 = i1152222;
                                            str6 = null;
                                            i25 = s24;
                                            int i109222222 = i24;
                                            long j13222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                            if (i25 != -1) {
                                            }
                                            Y3 = null;
                                            boolean z2022222222 = true;
                                            i26 = s25;
                                            if (i26 != -1) {
                                            }
                                            i29 = s26;
                                            if (i29 != i28) {
                                            }
                                            i31 = s27;
                                            if (i31 != i30) {
                                            }
                                            i32 = i26;
                                            i33 = s28;
                                            Y4 = null;
                                            if (i33 != i30) {
                                            }
                                            s28 = i33;
                                            i34 = s29;
                                            Y5 = null;
                                            if (i34 == i30) {
                                            }
                                        }
                                        int i1172 = i18;
                                        i19 = s21;
                                        i20 = i1172;
                                        str4 = null;
                                        if (i19 != -1) {
                                        }
                                        int i116222 = i19;
                                        i21 = s22;
                                        i22 = i116222;
                                        str5 = null;
                                        if (i21 != -1) {
                                        }
                                        int i11522222 = s23;
                                        i23 = i21;
                                        i24 = i11522222;
                                        str6 = null;
                                        i25 = s24;
                                        int i1092222222 = i24;
                                        long j132222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                        if (i25 != -1) {
                                        }
                                        Y3 = null;
                                        boolean z20222222222 = true;
                                        i26 = s25;
                                        if (i26 != -1) {
                                        }
                                        i29 = s26;
                                        if (i29 != i28) {
                                        }
                                        i31 = s27;
                                        if (i31 != i30) {
                                        }
                                        i32 = i26;
                                        i33 = s28;
                                        Y4 = null;
                                        if (i33 != i30) {
                                        }
                                        s28 = i33;
                                        i34 = s29;
                                        Y5 = null;
                                        if (i34 == i30) {
                                        }
                                    }
                                    int i119 = i95;
                                    i13 = i12;
                                    i14 = i119;
                                    str2 = null;
                                    if (i14 != -1) {
                                    }
                                    if (i16 != -1) {
                                        String Y272 = l02.Y(i16);
                                        int i1052 = i93;
                                        i17 = i16;
                                        i18 = i1052;
                                        str3 = Y272;
                                        if (i18 != -1) {
                                        }
                                        int i11722 = i18;
                                        i19 = s21;
                                        i20 = i11722;
                                        str4 = null;
                                        if (i19 != -1) {
                                        }
                                        int i1162222 = i19;
                                        i21 = s22;
                                        i22 = i1162222;
                                        str5 = null;
                                        if (i21 != -1) {
                                        }
                                        int i115222222 = s23;
                                        i23 = i21;
                                        i24 = i115222222;
                                        str6 = null;
                                        i25 = s24;
                                        int i10922222222 = i24;
                                        long j1322222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                        if (i25 != -1) {
                                        }
                                        Y3 = null;
                                        boolean z202222222222 = true;
                                        i26 = s25;
                                        if (i26 != -1) {
                                        }
                                        i29 = s26;
                                        if (i29 != i28) {
                                        }
                                        i31 = s27;
                                        if (i31 != i30) {
                                        }
                                        i32 = i26;
                                        i33 = s28;
                                        Y4 = null;
                                        if (i33 != i30) {
                                        }
                                        s28 = i33;
                                        i34 = s29;
                                        Y5 = null;
                                        if (i34 == i30) {
                                        }
                                    }
                                    int i1182 = i93;
                                    i17 = i16;
                                    i18 = i1182;
                                    str3 = null;
                                    if (i18 != -1) {
                                    }
                                    int i117222 = i18;
                                    i19 = s21;
                                    i20 = i117222;
                                    str4 = null;
                                    if (i19 != -1) {
                                    }
                                    int i11622222 = i19;
                                    i21 = s22;
                                    i22 = i11622222;
                                    str5 = null;
                                    if (i21 != -1) {
                                    }
                                    int i1152222222 = s23;
                                    i23 = i21;
                                    i24 = i1152222222;
                                    str6 = null;
                                    i25 = s24;
                                    int i109222222222 = i24;
                                    long j13222222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                    if (i25 != -1) {
                                    }
                                    Y3 = null;
                                    boolean z2022222222222 = true;
                                    i26 = s25;
                                    if (i26 != -1) {
                                    }
                                    i29 = s26;
                                    if (i29 != i28) {
                                    }
                                    i31 = s27;
                                    if (i31 != i30) {
                                    }
                                    i32 = i26;
                                    i33 = s28;
                                    Y4 = null;
                                    if (i33 != i30) {
                                    }
                                    s28 = i33;
                                    i34 = s29;
                                    Y5 = null;
                                    if (i34 == i30) {
                                    }
                                }
                                int i120 = i96;
                                i11 = s10;
                                i12 = i120;
                                valueOf = null;
                                if (i12 != -1) {
                                    String Y262 = l02.Y(i12);
                                    int i1022 = i95;
                                    i13 = i12;
                                    i14 = i1022;
                                    str2 = Y262;
                                    if (i14 != -1) {
                                    }
                                    if (i16 != -1) {
                                    }
                                    int i11822 = i93;
                                    i17 = i16;
                                    i18 = i11822;
                                    str3 = null;
                                    if (i18 != -1) {
                                    }
                                    int i1172222 = i18;
                                    i19 = s21;
                                    i20 = i1172222;
                                    str4 = null;
                                    if (i19 != -1) {
                                    }
                                    int i116222222 = i19;
                                    i21 = s22;
                                    i22 = i116222222;
                                    str5 = null;
                                    if (i21 != -1) {
                                    }
                                    int i11522222222 = s23;
                                    i23 = i21;
                                    i24 = i11522222222;
                                    str6 = null;
                                    i25 = s24;
                                    int i1092222222222 = i24;
                                    long j132222222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                    if (i25 != -1) {
                                    }
                                    Y3 = null;
                                    boolean z20222222222222 = true;
                                    i26 = s25;
                                    if (i26 != -1) {
                                    }
                                    i29 = s26;
                                    if (i29 != i28) {
                                    }
                                    i31 = s27;
                                    if (i31 != i30) {
                                    }
                                    i32 = i26;
                                    i33 = s28;
                                    Y4 = null;
                                    if (i33 != i30) {
                                    }
                                    s28 = i33;
                                    i34 = s29;
                                    Y5 = null;
                                    if (i34 == i30) {
                                    }
                                }
                                int i1192 = i95;
                                i13 = i12;
                                i14 = i1192;
                                str2 = null;
                                if (i14 != -1) {
                                }
                                if (i16 != -1) {
                                }
                                int i118222 = i93;
                                i17 = i16;
                                i18 = i118222;
                                str3 = null;
                                if (i18 != -1) {
                                }
                                int i11722222 = i18;
                                i19 = s21;
                                i20 = i11722222;
                                str4 = null;
                                if (i19 != -1) {
                                }
                                int i1162222222 = i19;
                                i21 = s22;
                                i22 = i1162222222;
                                str5 = null;
                                if (i21 != -1) {
                                }
                                int i115222222222 = s23;
                                i23 = i21;
                                i24 = i115222222222;
                                str6 = null;
                                i25 = s24;
                                int i10922222222222 = i24;
                                long j1322222222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                if (i25 != -1) {
                                }
                                Y3 = null;
                                boolean z202222222222222 = true;
                                i26 = s25;
                                if (i26 != -1) {
                                }
                                i29 = s26;
                                if (i29 != i28) {
                                }
                                i31 = s27;
                                if (i31 != i30) {
                                }
                                i32 = i26;
                                i33 = s28;
                                Y4 = null;
                                if (i33 != i30) {
                                }
                                s28 = i33;
                                i34 = s29;
                                Y5 = null;
                                if (i34 == i30) {
                                }
                            }
                            Y2 = str8;
                            if (s13 != -1) {
                            }
                            if (s14 != -1) {
                            }
                            int i1002 = i98;
                            if (i1002 != -1) {
                            }
                            i10 = i97;
                            if (i10 != -1) {
                                int i1012 = i96;
                                i11 = s10;
                                i12 = i1012;
                                valueOf = Long.valueOf(l02.getLong(i10));
                                if (i12 != -1) {
                                }
                                int i11922 = i95;
                                i13 = i12;
                                i14 = i11922;
                                str2 = null;
                                if (i14 != -1) {
                                }
                                if (i16 != -1) {
                                }
                                int i1182222 = i93;
                                i17 = i16;
                                i18 = i1182222;
                                str3 = null;
                                if (i18 != -1) {
                                }
                                int i117222222 = i18;
                                i19 = s21;
                                i20 = i117222222;
                                str4 = null;
                                if (i19 != -1) {
                                }
                                int i11622222222 = i19;
                                i21 = s22;
                                i22 = i11622222222;
                                str5 = null;
                                if (i21 != -1) {
                                }
                                int i1152222222222 = s23;
                                i23 = i21;
                                i24 = i1152222222222;
                                str6 = null;
                                i25 = s24;
                                int i109222222222222 = i24;
                                long j13222222222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                                if (i25 != -1) {
                                }
                                Y3 = null;
                                boolean z2022222222222222 = true;
                                i26 = s25;
                                if (i26 != -1) {
                                }
                                i29 = s26;
                                if (i29 != i28) {
                                }
                                i31 = s27;
                                if (i31 != i30) {
                                }
                                i32 = i26;
                                i33 = s28;
                                Y4 = null;
                                if (i33 != i30) {
                                }
                                s28 = i33;
                                i34 = s29;
                                Y5 = null;
                                if (i34 == i30) {
                                }
                            }
                            int i1202 = i96;
                            i11 = s10;
                            i12 = i1202;
                            valueOf = null;
                            if (i12 != -1) {
                            }
                            int i119222 = i95;
                            i13 = i12;
                            i14 = i119222;
                            str2 = null;
                            if (i14 != -1) {
                            }
                            if (i16 != -1) {
                            }
                            int i11822222 = i93;
                            i17 = i16;
                            i18 = i11822222;
                            str3 = null;
                            if (i18 != -1) {
                            }
                            int i1172222222 = i18;
                            i19 = s21;
                            i20 = i1172222222;
                            str4 = null;
                            if (i19 != -1) {
                            }
                            int i116222222222 = i19;
                            i21 = s22;
                            i22 = i116222222222;
                            str5 = null;
                            if (i21 != -1) {
                            }
                            int i11522222222222 = s23;
                            i23 = i21;
                            i24 = i11522222222222;
                            str6 = null;
                            i25 = s24;
                            int i1092222222222222 = i24;
                            long j132222222222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                            if (i25 != -1) {
                            }
                            Y3 = null;
                            boolean z20222222222222222 = true;
                            i26 = s25;
                            if (i26 != -1) {
                            }
                            i29 = s26;
                            if (i29 != i28) {
                            }
                            i31 = s27;
                            if (i31 != i30) {
                            }
                            i32 = i26;
                            i33 = s28;
                            Y4 = null;
                            if (i33 != i30) {
                            }
                            s28 = i33;
                            i34 = s29;
                            Y5 = null;
                            if (i34 == i30) {
                            }
                        }
                        Y = str8;
                        if (s12 != -1) {
                            Y2 = l02.Y(s12);
                            if (s13 != -1) {
                            }
                            if (s14 != -1) {
                            }
                            int i10022 = i98;
                            if (i10022 != -1) {
                            }
                            i10 = i97;
                            if (i10 != -1) {
                            }
                            int i12022 = i96;
                            i11 = s10;
                            i12 = i12022;
                            valueOf = null;
                            if (i12 != -1) {
                            }
                            int i1192222 = i95;
                            i13 = i12;
                            i14 = i1192222;
                            str2 = null;
                            if (i14 != -1) {
                            }
                            if (i16 != -1) {
                            }
                            int i118222222 = i93;
                            i17 = i16;
                            i18 = i118222222;
                            str3 = null;
                            if (i18 != -1) {
                            }
                            int i11722222222 = i18;
                            i19 = s21;
                            i20 = i11722222222;
                            str4 = null;
                            if (i19 != -1) {
                            }
                            int i1162222222222 = i19;
                            i21 = s22;
                            i22 = i1162222222222;
                            str5 = null;
                            if (i21 != -1) {
                            }
                            int i115222222222222 = s23;
                            i23 = i21;
                            i24 = i115222222222222;
                            str6 = null;
                            i25 = s24;
                            int i10922222222222222 = i24;
                            long j1322222222222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                            if (i25 != -1) {
                            }
                            Y3 = null;
                            boolean z202222222222222222 = true;
                            i26 = s25;
                            if (i26 != -1) {
                            }
                            i29 = s26;
                            if (i29 != i28) {
                            }
                            i31 = s27;
                            if (i31 != i30) {
                            }
                            i32 = i26;
                            i33 = s28;
                            Y4 = null;
                            if (i33 != i30) {
                            }
                            s28 = i33;
                            i34 = s29;
                            Y5 = null;
                            if (i34 == i30) {
                            }
                        }
                        Y2 = str8;
                        if (s13 != -1) {
                        }
                        if (s14 != -1) {
                        }
                        int i100222 = i98;
                        if (i100222 != -1) {
                        }
                        i10 = i97;
                        if (i10 != -1) {
                        }
                        int i120222 = i96;
                        i11 = s10;
                        i12 = i120222;
                        valueOf = null;
                        if (i12 != -1) {
                        }
                        int i11922222 = i95;
                        i13 = i12;
                        i14 = i11922222;
                        str2 = null;
                        if (i14 != -1) {
                        }
                        if (i16 != -1) {
                        }
                        int i1182222222 = i93;
                        i17 = i16;
                        i18 = i1182222222;
                        str3 = null;
                        if (i18 != -1) {
                        }
                        int i117222222222 = i18;
                        i19 = s21;
                        i20 = i117222222222;
                        str4 = null;
                        if (i19 != -1) {
                        }
                        int i11622222222222 = i19;
                        i21 = s22;
                        i22 = i11622222222222;
                        str5 = null;
                        if (i21 != -1) {
                        }
                        int i1152222222222222 = s23;
                        i23 = i21;
                        i24 = i1152222222222222;
                        str6 = null;
                        i25 = s24;
                        int i109222222222222222 = i24;
                        long j13222222222222222 = i24 != -1 ? l02.getLong(i24) : 0L;
                        if (i25 != -1) {
                        }
                        Y3 = null;
                        boolean z2022222222222222222 = true;
                        i26 = s25;
                        if (i26 != -1) {
                        }
                        i29 = s26;
                        if (i29 != i28) {
                        }
                        i31 = s27;
                        if (i31 != i30) {
                        }
                        i32 = i26;
                        i33 = s28;
                        Y4 = null;
                        if (i33 != i30) {
                        }
                        s28 = i33;
                        i34 = s29;
                        Y5 = null;
                        if (i34 == i30) {
                        }
                    } else {
                        throw new IllegalStateException("Missing column 'sync_state' for a NON-NULL value, column not found in result.");
                    }
                } else {
                    throw new IllegalStateException("Missing column 'read_id' for a NON-NULL value, column not found in result.");
                }
            }
            l02.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cVar = l02;
        }
    }

    public static final z updateArchivedStatus$lambda$0(ReadsDao_Impl readsDao_Impl, ReadsDao.ReadMetaArchiveUpdate readMetaArchiveUpdate, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__updateAdapterOfReadMetaArchiveUpdateAsReadMetaEntity.handle(aVar, readMetaArchiveUpdate);
        return z.f31622a;
    }

    public static final z updateAudioPosition$lambda$0(ReadsDao_Impl readsDao_Impl, ReadsDao.ReadMetaAudioPositionUpdate readMetaAudioPositionUpdate, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__updateAdapterOfReadMetaAudioPositionUpdateAsReadMetaEntity.handle(aVar, readMetaAudioPositionUpdate);
        return z.f31622a;
    }

    public static final z updateCompletedAtUnix$lambda$0(ReadsDao_Impl readsDao_Impl, ReadsDao.ReadMetaCompletedAtUnixUpdate readMetaCompletedAtUnixUpdate, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__updateAdapterOfReadMetaCompletedAtUnixUpdateAsReadMetaEntity.handle(aVar, readMetaCompletedAtUnixUpdate);
        return z.f31622a;
    }

    public static final z updateLastCharOffset$lambda$0(ReadsDao_Impl readsDao_Impl, ReadsDao.ReadMetaLastCharOffsetUpdate readMetaLastCharOffsetUpdate, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__updateAdapterOfReadMetaLastCharOffsetUpdateAsReadMetaEntity.handle(aVar, readMetaLastCharOffsetUpdate);
        return z.f31622a;
    }

    public static final z updateLastVoiceId$lambda$0(ReadsDao_Impl readsDao_Impl, ReadsDao.ReadMetaLastVoiceIdUpdate readMetaLastVoiceIdUpdate, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__updateAdapterOfReadMetaLastVoiceIdUpdateAsReadMetaEntity.handle(aVar, readMetaLastVoiceIdUpdate);
        return z.f31622a;
    }

    public static final z updateMarkedAsUnread$lambda$0(ReadsDao_Impl readsDao_Impl, ReadsDao.ReadMetaMarkedAsUnreadUpdate readMetaMarkedAsUnreadUpdate, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__updateAdapterOfReadMetaMarkedAsUnreadUpdateAsReadMetaEntity.handle(aVar, readMetaMarkedAsUnreadUpdate);
        return z.f31622a;
    }

    public static final z updateRating$lambda$0(ReadsDao_Impl readsDao_Impl, ReadsDao.ReadMetaRatingUpdate readMetaRatingUpdate, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__updateAdapterOfReadMetaRatingUpdateAsReadMetaEntity.handle(aVar, readMetaRatingUpdate);
        return z.f31622a;
    }

    public static final z updateStatus$lambda$0(ReadsDao_Impl readsDao_Impl, ReadsDao.ReadMetaSyncStatusUpdate readMetaSyncStatusUpdate, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__updateAdapterOfReadMetaSyncStatusUpdateAsReadMetaEntity.handle(aVar, readMetaSyncStatusUpdate);
        return z.f31622a;
    }

    public static final z updateTitle$lambda$0(ReadsDao_Impl readsDao_Impl, ReadsDao.ReadMetaTitleUpdate readMetaTitleUpdate, mb.a aVar) {
        aVar.getClass();
        readsDao_Impl.__updateAdapterOfReadMetaTitleUpdateAsReadMetaEntity.handle(aVar, readMetaTitleUpdate);
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object deleteChapters(List<ReadChapterEntity> list, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new e(this, list, 0), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object deleteRead(ReadMetaEntity readMetaEntity, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new f(this, readMetaEntity, 0), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object deleteSampleConfig(SampleConfigEntity sampleConfigEntity, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new i(this, sampleConfigEntity, 0), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public ir.i getAll(int limit, String orderBy, Boolean archived, SyncState deletedSyncState) {
        orderBy.getClass();
        deletedSyncState.getClass();
        return tb.a.n(this.__db, true, new String[]{"reads_chapters", "offline_read", "offline_chapter", "sample_config", "reads"}, new g(archived, this, deletedSyncState, orderBy, limit));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public List<ReadMetaEntityWithChapters> getAllById(List<String> id2) {
        id2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM reads WHERE read_id in (");
        m0.j(id2.size(), sb);
        sb.append(Separators.RPAREN);
        return (List) us.g.C(this.__db, true, true, new o0(sb.toString(), id2, this, 6));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public List<ReadMetaEntityWithChapters> getAllWithSyncState(SyncState syncState) {
        syncState.getClass();
        return (List) us.g.C(this.__db, true, true, new t(this, syncState, 24));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object getById(String str, wn.c<? super ReadMetaEntityWithChapters> cVar) {
        return us.g.E(this.__db, true, true, new d(str, this, 0), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object getChapterCharRange(String str, int i10, wn.c<? super ReadsDao.ChapterCharRange> cVar) {
        return us.g.E(this.__db, true, false, new b(str, i10, 0), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object getCount(wn.c<? super Integer> cVar) {
        return us.g.E(this.__db, true, false, new fm.d(16), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object getSampleReadsByParentId(String str, wn.c<? super List<ReadMetaEntityWithChapters>> cVar) {
        return us.g.E(this.__db, true, true, new d(str, this, 1), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object insertChapters(List<ReadChapterEntity> list, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new e(this, list, 1), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object insertRead(ReadMetaEntity readMetaEntity, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new f(this, readMetaEntity, 1), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object insertSampleConfig(SampleConfigEntity sampleConfigEntity, wn.c<? super Long> cVar) {
        return us.g.E(this.__db, false, true, new i(this, sampleConfigEntity, 1), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public ir.i observeById(String id2) {
        id2.getClass();
        return tb.a.n(this.__db, true, new String[]{"reads_chapters", "offline_read", "offline_chapter", "sample_config", "reads"}, new d(id2, this, 2));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public ir.i search(nb.f fVar) {
        t0 t0Var;
        fVar.getClass();
        TreeMap treeMap = t0.Z;
        String z6 = fVar.z();
        int n2 = fVar.n();
        z6.getClass();
        TreeMap treeMap2 = t0.Z;
        synchronized (treeMap2) {
            Map.Entry ceilingEntry = treeMap2.ceilingEntry(Integer.valueOf(n2));
            if (ceilingEntry != null) {
                treeMap2.remove(ceilingEntry.getKey());
                t0Var = (t0) ceilingEntry.getValue();
                t0Var.getClass();
                t0Var.f3205a = z6;
                t0Var.Y = n2;
            } else {
                t0Var = new t0(n2);
                t0Var.f3205a = z6;
                t0Var.Y = n2;
            }
        }
        fVar.D(new s0(t0Var));
        String z10 = t0Var.z();
        return tb.a.n(this.__db, true, new String[]{"reads_chapters", "offline_read", "offline_chapter", "sample_config"}, new o0(z10, new r0(z10, new a2.b(t0Var, 5)), this, 7));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public void updateArchivedStatus(ReadsDao.ReadMetaArchiveUpdate r42) {
        r42.getClass();
        us.g.C(this.__db, false, true, new t(this, r42, 23));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public void updateAudioPosition(ReadsDao.ReadMetaAudioPositionUpdate r42) {
        r42.getClass();
        us.g.C(this.__db, false, true, new t(this, r42, 28));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public void updateCompletedAtUnix(ReadsDao.ReadMetaCompletedAtUnixUpdate r42) {
        r42.getClass();
        us.g.C(this.__db, false, true, new t(this, r42, 25));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public void updateLastCharOffset(ReadsDao.ReadMetaLastCharOffsetUpdate r42) {
        r42.getClass();
        us.g.C(this.__db, false, true, new t(this, r42, 26));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public void updateLastVoiceId(ReadsDao.ReadMetaLastVoiceIdUpdate r42) {
        r42.getClass();
        us.g.C(this.__db, false, true, new h(this, r42, 0));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public void updateMarkedAsUnread(ReadsDao.ReadMetaMarkedAsUnreadUpdate r42) {
        r42.getClass();
        us.g.C(this.__db, false, true, new t(this, r42, 27));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public void updateRating(ReadsDao.ReadMetaRatingUpdate r42) {
        r42.getClass();
        us.g.C(this.__db, false, true, new t(this, r42, 29));
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public Object updateStatus(ReadsDao.ReadMetaSyncStatusUpdate readMetaSyncStatusUpdate, wn.c<? super z> cVar) {
        Object E = us.g.E(this.__db, false, true, new t(this, readMetaSyncStatusUpdate, 21), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public void updateTitle(ReadsDao.ReadMetaTitleUpdate r42) {
        r42.getClass();
        us.g.C(this.__db, false, true, new t(this, r42, 22));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/database/entities/reads/ReadsDao_Impl$Companion;", "", "<init>", "()V", "", "Loo/d;", "getRequiredConverters", "()Ljava/util/List;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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

    @Override // io.elevenlabs.data.database.entities.reads.ReadsDao
    public ir.i getAll() {
        return tb.a.n(this.__db, true, new String[]{"reads_chapters", "offline_read", "offline_chapter", "sample_config", "reads"}, new a2.b(this, 22));
    }
}
