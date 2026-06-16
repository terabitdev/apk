package io.elevenlabs.data.database.entities.bookmarks;

import a2.t;
import ae.l;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.room.d;
import androidx.room.e;
import androidx.room.f;
import androidx.room.j0;
import com.google.protobuf.c6;
import io.elevenlabs.data.database.entities.bookmarks.BookmarkEntity;
import io.elevenlabs.data.database.entities.bookmarks.BookmarksDao;
import io.elevenlabs.player.BackgroundPlayerAction;
import ir.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mb.c;
import sn.z;
import us.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u00142\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u00142\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ+\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00150\u00142\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00142\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao_Impl;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "Landroidx/room/j0;", "__db", "<init>", "(Landroidx/room/j0;)V", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;", "_value", "", "__SyncState_enumToString", "(Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;)Ljava/lang/String;", "__SyncState_stringToEnum", "(Ljava/lang/String;)Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", BackgroundPlayerAction.Bookmark.ACTION_ID, "Lsn/z;", "deleteBookmark", "(Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;)V", "update", "insert", "Lir/i;", "", "getAllWithPendingSyncState", "()Lir/i;", "readId", "syncState", "getAllWithSyncState", "(Ljava/lang/String;Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;)Lir/i;", "deletedSyncState", "getAll", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao$BookmarkOffsetTuple;", "getOffsets", "bookmarkId", "getById", "(Ljava/lang/String;)Lir/i;", "Landroidx/room/j0;", "Landroidx/room/d;", "__deleteAdapterOfBookmarkEntity", "Landroidx/room/d;", "__updateAdapterOfBookmarkEntity", "Landroidx/room/f;", "__upsertAdapterOfBookmarkEntity", "Landroidx/room/f;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BookmarksDao_Impl implements BookmarksDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final j0 __db;
    private final d __deleteAdapterOfBookmarkEntity;
    private final d __updateAdapterOfBookmarkEntity;
    private final f __upsertAdapterOfBookmarkEntity;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/bookmarks/BookmarksDao_Impl$1", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.bookmarks.BookmarksDao_Impl$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends d {
        @Override // androidx.room.d
        public void bind(c statement, BookmarkEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "DELETE FROM `bookmarks` WHERE `id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/bookmarks/BookmarksDao_Impl$2", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.bookmarks.BookmarksDao_Impl$2 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends d {
        public AnonymousClass2() {
        }

        @Override // androidx.room.d
        public void bind(c statement, BookmarkEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getId());
            statement.s(2, entity.getRead_id());
            statement.c(3, entity.getStart_offset_inclusive());
            statement.c(4, entity.getEnd_offset_exclusive());
            statement.s(5, entity.getText());
            statement.c(6, entity.getCreated_at_unix());
            statement.c(7, entity.getUpdated_at_unix());
            String note = entity.getNote();
            if (note == null) {
                statement.f(8);
            } else {
                statement.s(8, note);
            }
            statement.s(9, BookmarksDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            String created_id = entity.getCreated_id();
            if (created_id == null) {
                statement.f(10);
            } else {
                statement.s(10, created_id);
            }
            if (entity.getChapter_index() == null) {
                statement.f(11);
            } else {
                statement.c(11, r0.intValue());
            }
            Double start_time_seconds = entity.getStart_time_seconds();
            if (start_time_seconds == null) {
                statement.f(12);
            } else {
                statement.e(start_time_seconds.doubleValue(), 12);
            }
            Double end_time_seconds = entity.getEnd_time_seconds();
            if (end_time_seconds == null) {
                statement.f(13);
            } else {
                statement.e(end_time_seconds.doubleValue(), 13);
            }
            statement.s(14, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `bookmarks` SET `id` = ?,`read_id` = ?,`start_offset_inclusive` = ?,`end_offset_exclusive` = ?,`text` = ?,`created_at_unix` = ?,`updated_at_unix` = ?,`note` = ?,`sync_state` = ?,`created_id` = ?,`chapter_index` = ?,`start_time_seconds` = ?,`end_time_seconds` = ? WHERE `id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/bookmarks/BookmarksDao_Impl$3", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.bookmarks.BookmarksDao_Impl$3 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends e {
        public AnonymousClass3() {
        }

        @Override // androidx.room.e
        public void bind(c statement, BookmarkEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getId());
            statement.s(2, entity.getRead_id());
            statement.c(3, entity.getStart_offset_inclusive());
            statement.c(4, entity.getEnd_offset_exclusive());
            statement.s(5, entity.getText());
            statement.c(6, entity.getCreated_at_unix());
            statement.c(7, entity.getUpdated_at_unix());
            String note = entity.getNote();
            if (note == null) {
                statement.f(8);
            } else {
                statement.s(8, note);
            }
            statement.s(9, BookmarksDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            String created_id = entity.getCreated_id();
            if (created_id == null) {
                statement.f(10);
            } else {
                statement.s(10, created_id);
            }
            if (entity.getChapter_index() == null) {
                statement.f(11);
            } else {
                statement.c(11, r0.intValue());
            }
            Double start_time_seconds = entity.getStart_time_seconds();
            if (start_time_seconds == null) {
                statement.f(12);
            } else {
                statement.e(start_time_seconds.doubleValue(), 12);
            }
            Double end_time_seconds = entity.getEnd_time_seconds();
            if (end_time_seconds == null) {
                statement.f(13);
            } else {
                statement.e(end_time_seconds.doubleValue(), 13);
            }
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT INTO `bookmarks` (`id`,`read_id`,`start_offset_inclusive`,`end_offset_exclusive`,`text`,`created_at_unix`,`updated_at_unix`,`note`,`sync_state`,`created_id`,`chapter_index`,`start_time_seconds`,`end_time_seconds`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/bookmarks/BookmarksDao_Impl$4", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.bookmarks.BookmarksDao_Impl$4 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends d {
        public AnonymousClass4() {
        }

        @Override // androidx.room.d
        public void bind(c statement, BookmarkEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getId());
            statement.s(2, entity.getRead_id());
            statement.c(3, entity.getStart_offset_inclusive());
            statement.c(4, entity.getEnd_offset_exclusive());
            statement.s(5, entity.getText());
            statement.c(6, entity.getCreated_at_unix());
            statement.c(7, entity.getUpdated_at_unix());
            String note = entity.getNote();
            if (note == null) {
                statement.f(8);
            } else {
                statement.s(8, note);
            }
            statement.s(9, BookmarksDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
            String created_id = entity.getCreated_id();
            if (created_id == null) {
                statement.f(10);
            } else {
                statement.s(10, created_id);
            }
            if (entity.getChapter_index() == null) {
                statement.f(11);
            } else {
                statement.c(11, r0.intValue());
            }
            Double start_time_seconds = entity.getStart_time_seconds();
            if (start_time_seconds == null) {
                statement.f(12);
            } else {
                statement.e(start_time_seconds.doubleValue(), 12);
            }
            Double end_time_seconds = entity.getEnd_time_seconds();
            if (end_time_seconds == null) {
                statement.f(13);
            } else {
                statement.e(end_time_seconds.doubleValue(), 13);
            }
            statement.s(14, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE `bookmarks` SET `id` = ?,`read_id` = ?,`start_offset_inclusive` = ?,`end_offset_exclusive` = ?,`text` = ?,`created_at_unix` = ?,`updated_at_unix` = ?,`note` = ?,`sync_state` = ?,`created_id` = ?,`chapter_index` = ?,`start_time_seconds` = ?,`end_time_seconds` = ? WHERE `id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookmarkEntity.SyncState.values().length];
            try {
                iArr[BookmarkEntity.SyncState.UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookmarkEntity.SyncState.PENDING_DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookmarkEntity.SyncState.PENDING_UPDATE_PUSH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BookmarkEntity.SyncState.PENDING_CREATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BookmarksDao_Impl(j0 j0Var) {
        j0Var.getClass();
        this.__db = j0Var;
        this.__deleteAdapterOfBookmarkEntity = new d() { // from class: io.elevenlabs.data.database.entities.bookmarks.BookmarksDao_Impl.1
            @Override // androidx.room.d
            public void bind(c statement, BookmarkEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "DELETE FROM `bookmarks` WHERE `id` = ?";
            }
        };
        this.__updateAdapterOfBookmarkEntity = new d() { // from class: io.elevenlabs.data.database.entities.bookmarks.BookmarksDao_Impl.2
            public AnonymousClass2() {
            }

            @Override // androidx.room.d
            public void bind(c statement, BookmarkEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getId());
                statement.s(2, entity.getRead_id());
                statement.c(3, entity.getStart_offset_inclusive());
                statement.c(4, entity.getEnd_offset_exclusive());
                statement.s(5, entity.getText());
                statement.c(6, entity.getCreated_at_unix());
                statement.c(7, entity.getUpdated_at_unix());
                String note = entity.getNote();
                if (note == null) {
                    statement.f(8);
                } else {
                    statement.s(8, note);
                }
                statement.s(9, BookmarksDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                String created_id = entity.getCreated_id();
                if (created_id == null) {
                    statement.f(10);
                } else {
                    statement.s(10, created_id);
                }
                if (entity.getChapter_index() == null) {
                    statement.f(11);
                } else {
                    statement.c(11, r0.intValue());
                }
                Double start_time_seconds = entity.getStart_time_seconds();
                if (start_time_seconds == null) {
                    statement.f(12);
                } else {
                    statement.e(start_time_seconds.doubleValue(), 12);
                }
                Double end_time_seconds = entity.getEnd_time_seconds();
                if (end_time_seconds == null) {
                    statement.f(13);
                } else {
                    statement.e(end_time_seconds.doubleValue(), 13);
                }
                statement.s(14, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `bookmarks` SET `id` = ?,`read_id` = ?,`start_offset_inclusive` = ?,`end_offset_exclusive` = ?,`text` = ?,`created_at_unix` = ?,`updated_at_unix` = ?,`note` = ?,`sync_state` = ?,`created_id` = ?,`chapter_index` = ?,`start_time_seconds` = ?,`end_time_seconds` = ? WHERE `id` = ?";
            }
        };
        this.__upsertAdapterOfBookmarkEntity = new f(new e() { // from class: io.elevenlabs.data.database.entities.bookmarks.BookmarksDao_Impl.3
            public AnonymousClass3() {
            }

            @Override // androidx.room.e
            public void bind(c statement, BookmarkEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getId());
                statement.s(2, entity.getRead_id());
                statement.c(3, entity.getStart_offset_inclusive());
                statement.c(4, entity.getEnd_offset_exclusive());
                statement.s(5, entity.getText());
                statement.c(6, entity.getCreated_at_unix());
                statement.c(7, entity.getUpdated_at_unix());
                String note = entity.getNote();
                if (note == null) {
                    statement.f(8);
                } else {
                    statement.s(8, note);
                }
                statement.s(9, BookmarksDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                String created_id = entity.getCreated_id();
                if (created_id == null) {
                    statement.f(10);
                } else {
                    statement.s(10, created_id);
                }
                if (entity.getChapter_index() == null) {
                    statement.f(11);
                } else {
                    statement.c(11, r0.intValue());
                }
                Double start_time_seconds = entity.getStart_time_seconds();
                if (start_time_seconds == null) {
                    statement.f(12);
                } else {
                    statement.e(start_time_seconds.doubleValue(), 12);
                }
                Double end_time_seconds = entity.getEnd_time_seconds();
                if (end_time_seconds == null) {
                    statement.f(13);
                } else {
                    statement.e(end_time_seconds.doubleValue(), 13);
                }
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT INTO `bookmarks` (`id`,`read_id`,`start_offset_inclusive`,`end_offset_exclusive`,`text`,`created_at_unix`,`updated_at_unix`,`note`,`sync_state`,`created_id`,`chapter_index`,`start_time_seconds`,`end_time_seconds`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }, new d() { // from class: io.elevenlabs.data.database.entities.bookmarks.BookmarksDao_Impl.4
            public AnonymousClass4() {
            }

            @Override // androidx.room.d
            public void bind(c statement, BookmarkEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getId());
                statement.s(2, entity.getRead_id());
                statement.c(3, entity.getStart_offset_inclusive());
                statement.c(4, entity.getEnd_offset_exclusive());
                statement.s(5, entity.getText());
                statement.c(6, entity.getCreated_at_unix());
                statement.c(7, entity.getUpdated_at_unix());
                String note = entity.getNote();
                if (note == null) {
                    statement.f(8);
                } else {
                    statement.s(8, note);
                }
                statement.s(9, BookmarksDao_Impl.this.__SyncState_enumToString(entity.getSync_state()));
                String created_id = entity.getCreated_id();
                if (created_id == null) {
                    statement.f(10);
                } else {
                    statement.s(10, created_id);
                }
                if (entity.getChapter_index() == null) {
                    statement.f(11);
                } else {
                    statement.c(11, r0.intValue());
                }
                Double start_time_seconds = entity.getStart_time_seconds();
                if (start_time_seconds == null) {
                    statement.f(12);
                } else {
                    statement.e(start_time_seconds.doubleValue(), 12);
                }
                Double end_time_seconds = entity.getEnd_time_seconds();
                if (end_time_seconds == null) {
                    statement.f(13);
                } else {
                    statement.e(end_time_seconds.doubleValue(), 13);
                }
                statement.s(14, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE `bookmarks` SET `id` = ?,`read_id` = ?,`start_offset_inclusive` = ?,`end_offset_exclusive` = ?,`text` = ?,`created_at_unix` = ?,`updated_at_unix` = ?,`note` = ?,`sync_state` = ?,`created_id` = ?,`chapter_index` = ?,`start_time_seconds` = ?,`end_time_seconds` = ? WHERE `id` = ?";
            }
        });
    }

    public final String __SyncState_enumToString(BookmarkEntity.SyncState _value) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[_value.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return "PENDING_CREATE";
                    }
                    c6.p();
                    return null;
                }
                return "PENDING_UPDATE_PUSH";
            }
            return "PENDING_DELETE";
        }
        return "UPDATED";
    }

    private final BookmarkEntity.SyncState __SyncState_stringToEnum(String _value) {
        switch (_value.hashCode()) {
            case -2128168764:
                if (_value.equals("PENDING_CREATE")) {
                    return BookmarkEntity.SyncState.PENDING_CREATE;
                }
                break;
            case -2111333005:
                if (_value.equals("PENDING_DELETE")) {
                    return BookmarkEntity.SyncState.PENDING_DELETE;
                }
                break;
            case -1855995384:
                if (_value.equals("PENDING_UPDATE_PUSH")) {
                    return BookmarkEntity.SyncState.PENDING_UPDATE_PUSH;
                }
                break;
            case 483552411:
                if (_value.equals("UPDATED")) {
                    return BookmarkEntity.SyncState.UPDATED;
                }
                break;
        }
        c6.t("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    public static final z deleteBookmark$lambda$0(BookmarksDao_Impl bookmarksDao_Impl, BookmarkEntity bookmarkEntity, mb.a aVar) {
        aVar.getClass();
        bookmarksDao_Impl.__deleteAdapterOfBookmarkEntity.handle(aVar, bookmarkEntity);
        return z.f31622a;
    }

    public static final List getAll$lambda$0(String str, String str2, BookmarksDao_Impl bookmarksDao_Impl, BookmarkEntity.SyncState syncState, mb.a aVar) {
        String Y;
        String Y2;
        int i10;
        int i11;
        Integer valueOf;
        Double valueOf2;
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            l02.s(2, bookmarksDao_Impl.__SyncState_enumToString(syncState));
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "start_offset_inclusive");
            int F4 = l.F(l02, "end_offset_exclusive");
            int F5 = l.F(l02, ParameterNames.TEXT);
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "note");
            int F9 = l.F(l02, "sync_state");
            int F10 = l.F(l02, "created_id");
            int F11 = l.F(l02, "chapter_index");
            int F12 = l.F(l02, "start_time_seconds");
            int F13 = l.F(l02, "end_time_seconds");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                String Y3 = l02.Y(F);
                String Y4 = l02.Y(F2);
                long j4 = l02.getLong(F3);
                long j10 = l02.getLong(F4);
                String Y5 = l02.Y(F5);
                long j11 = l02.getLong(F6);
                long j12 = l02.getLong(F7);
                Double d10 = null;
                if (l02.isNull(F8)) {
                    Y = null;
                } else {
                    Y = l02.Y(F8);
                }
                int i12 = F;
                BookmarkEntity.SyncState __SyncState_stringToEnum = bookmarksDao_Impl.__SyncState_stringToEnum(l02.Y(F9));
                if (l02.isNull(F10)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F10);
                }
                if (l02.isNull(F11)) {
                    i10 = F2;
                    i11 = F3;
                    valueOf = null;
                } else {
                    i10 = F2;
                    i11 = F3;
                    valueOf = Integer.valueOf((int) l02.getLong(F11));
                }
                if (l02.isNull(F12)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Double.valueOf(l02.getDouble(F12));
                }
                if (!l02.isNull(F13)) {
                    d10 = Double.valueOf(l02.getDouble(F13));
                }
                arrayList.add(new BookmarkEntity(Y3, Y4, j4, j10, Y5, j11, j12, Y, __SyncState_stringToEnum, Y2, valueOf, valueOf2, d10));
                F = i12;
                F2 = i10;
                F3 = i11;
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final List getAllWithPendingSyncState$lambda$0(String str, BookmarksDao_Impl bookmarksDao_Impl, mb.a aVar) {
        String Y;
        String Y2;
        int i10;
        int i11;
        Integer valueOf;
        Double valueOf2;
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "start_offset_inclusive");
            int F4 = l.F(l02, "end_offset_exclusive");
            int F5 = l.F(l02, ParameterNames.TEXT);
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "note");
            int F9 = l.F(l02, "sync_state");
            int F10 = l.F(l02, "created_id");
            int F11 = l.F(l02, "chapter_index");
            int F12 = l.F(l02, "start_time_seconds");
            int F13 = l.F(l02, "end_time_seconds");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                String Y3 = l02.Y(F);
                String Y4 = l02.Y(F2);
                long j4 = l02.getLong(F3);
                long j10 = l02.getLong(F4);
                String Y5 = l02.Y(F5);
                long j11 = l02.getLong(F6);
                long j12 = l02.getLong(F7);
                Double d10 = null;
                if (l02.isNull(F8)) {
                    Y = null;
                } else {
                    Y = l02.Y(F8);
                }
                int i12 = F;
                BookmarkEntity.SyncState __SyncState_stringToEnum = bookmarksDao_Impl.__SyncState_stringToEnum(l02.Y(F9));
                if (l02.isNull(F10)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F10);
                }
                if (l02.isNull(F11)) {
                    i10 = F2;
                    i11 = F3;
                    valueOf = null;
                } else {
                    i10 = F2;
                    i11 = F3;
                    valueOf = Integer.valueOf((int) l02.getLong(F11));
                }
                if (l02.isNull(F12)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Double.valueOf(l02.getDouble(F12));
                }
                if (!l02.isNull(F13)) {
                    d10 = Double.valueOf(l02.getDouble(F13));
                }
                arrayList.add(new BookmarkEntity(Y3, Y4, j4, j10, Y5, j11, j12, Y, __SyncState_stringToEnum, Y2, valueOf, valueOf2, d10));
                F = i12;
                F2 = i10;
                F3 = i11;
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final List getAllWithSyncState$lambda$0(String str, String str2, BookmarksDao_Impl bookmarksDao_Impl, BookmarkEntity.SyncState syncState, mb.a aVar) {
        String Y;
        String Y2;
        int i10;
        int i11;
        Integer valueOf;
        Double valueOf2;
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            l02.s(2, bookmarksDao_Impl.__SyncState_enumToString(syncState));
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "start_offset_inclusive");
            int F4 = l.F(l02, "end_offset_exclusive");
            int F5 = l.F(l02, ParameterNames.TEXT);
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "note");
            int F9 = l.F(l02, "sync_state");
            int F10 = l.F(l02, "created_id");
            int F11 = l.F(l02, "chapter_index");
            int F12 = l.F(l02, "start_time_seconds");
            int F13 = l.F(l02, "end_time_seconds");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                String Y3 = l02.Y(F);
                String Y4 = l02.Y(F2);
                long j4 = l02.getLong(F3);
                long j10 = l02.getLong(F4);
                String Y5 = l02.Y(F5);
                long j11 = l02.getLong(F6);
                long j12 = l02.getLong(F7);
                Double d10 = null;
                if (l02.isNull(F8)) {
                    Y = null;
                } else {
                    Y = l02.Y(F8);
                }
                int i12 = F;
                BookmarkEntity.SyncState __SyncState_stringToEnum = bookmarksDao_Impl.__SyncState_stringToEnum(l02.Y(F9));
                if (l02.isNull(F10)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F10);
                }
                if (l02.isNull(F11)) {
                    i10 = F2;
                    i11 = F3;
                    valueOf = null;
                } else {
                    i10 = F2;
                    i11 = F3;
                    valueOf = Integer.valueOf((int) l02.getLong(F11));
                }
                if (l02.isNull(F12)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Double.valueOf(l02.getDouble(F12));
                }
                if (!l02.isNull(F13)) {
                    d10 = Double.valueOf(l02.getDouble(F13));
                }
                arrayList.add(new BookmarkEntity(Y3, Y4, j4, j10, Y5, j11, j12, Y, __SyncState_stringToEnum, Y2, valueOf, valueOf2, d10));
                F = i12;
                F2 = i10;
                F3 = i11;
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final BookmarkEntity getById$lambda$0(String str, String str2, BookmarksDao_Impl bookmarksDao_Impl, mb.a aVar) {
        String Y;
        String Y2;
        Integer valueOf;
        Double valueOf2;
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            l02.s(2, str2);
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "start_offset_inclusive");
            int F4 = l.F(l02, "end_offset_exclusive");
            int F5 = l.F(l02, ParameterNames.TEXT);
            int F6 = l.F(l02, "created_at_unix");
            int F7 = l.F(l02, "updated_at_unix");
            int F8 = l.F(l02, "note");
            int F9 = l.F(l02, "sync_state");
            int F10 = l.F(l02, "created_id");
            int F11 = l.F(l02, "chapter_index");
            int F12 = l.F(l02, "start_time_seconds");
            int F13 = l.F(l02, "end_time_seconds");
            BookmarkEntity bookmarkEntity = null;
            Double valueOf3 = null;
            if (l02.h0()) {
                String Y3 = l02.Y(F);
                String Y4 = l02.Y(F2);
                long j4 = l02.getLong(F3);
                long j10 = l02.getLong(F4);
                String Y5 = l02.Y(F5);
                long j11 = l02.getLong(F6);
                long j12 = l02.getLong(F7);
                if (l02.isNull(F8)) {
                    Y = null;
                } else {
                    Y = l02.Y(F8);
                }
                BookmarkEntity.SyncState __SyncState_stringToEnum = bookmarksDao_Impl.__SyncState_stringToEnum(l02.Y(F9));
                if (l02.isNull(F10)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F10);
                }
                if (l02.isNull(F11)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf((int) l02.getLong(F11));
                }
                if (l02.isNull(F12)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Double.valueOf(l02.getDouble(F12));
                }
                if (!l02.isNull(F13)) {
                    valueOf3 = Double.valueOf(l02.getDouble(F13));
                }
                bookmarkEntity = new BookmarkEntity(Y3, Y4, j4, j10, Y5, j11, j12, Y, __SyncState_stringToEnum, Y2, valueOf, valueOf2, valueOf3);
            }
            return bookmarkEntity;
        } finally {
            l02.close();
        }
    }

    public static final List getOffsets$lambda$0(String str, String str2, BookmarksDao_Impl bookmarksDao_Impl, BookmarkEntity.SyncState syncState, mb.a aVar) {
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            l02.s(2, bookmarksDao_Impl.__SyncState_enumToString(syncState));
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                arrayList.add(new BookmarksDao.BookmarkOffsetTuple(l02.Y(0), l02.getLong(1), l02.getLong(2)));
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final z insert$lambda$0(BookmarksDao_Impl bookmarksDao_Impl, BookmarkEntity bookmarkEntity, mb.a aVar) {
        aVar.getClass();
        bookmarksDao_Impl.__upsertAdapterOfBookmarkEntity.b(aVar, bookmarkEntity);
        return z.f31622a;
    }

    public static final z update$lambda$0(BookmarksDao_Impl bookmarksDao_Impl, BookmarkEntity bookmarkEntity, mb.a aVar) {
        aVar.getClass();
        bookmarksDao_Impl.__updateAdapterOfBookmarkEntity.handle(aVar, bookmarkEntity);
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.bookmarks.BookmarksDao
    public void deleteBookmark(BookmarkEntity r42) {
        r42.getClass();
        g.C(this.__db, false, true, new b(this, r42, 2));
    }

    @Override // io.elevenlabs.data.database.entities.bookmarks.BookmarksDao
    public i getAll(String readId, BookmarkEntity.SyncState deletedSyncState) {
        readId.getClass();
        deletedSyncState.getClass();
        return tb.a.n(this.__db, true, new String[]{"bookmarks"}, new a(readId, this, deletedSyncState, 0));
    }

    @Override // io.elevenlabs.data.database.entities.bookmarks.BookmarksDao
    public i getAllWithPendingSyncState() {
        return tb.a.n(this.__db, true, new String[]{"bookmarks"}, new a2.b(this, 20));
    }

    @Override // io.elevenlabs.data.database.entities.bookmarks.BookmarksDao
    public i getAllWithSyncState(String readId, BookmarkEntity.SyncState syncState) {
        readId.getClass();
        syncState.getClass();
        return tb.a.n(this.__db, true, new String[]{"bookmarks"}, new a(readId, this, syncState, 2));
    }

    @Override // io.elevenlabs.data.database.entities.bookmarks.BookmarksDao
    public i getById(String bookmarkId) {
        bookmarkId.getClass();
        return tb.a.n(this.__db, true, new String[]{"bookmarks"}, new t(bookmarkId, this, 15));
    }

    @Override // io.elevenlabs.data.database.entities.bookmarks.BookmarksDao
    public i getOffsets(String readId, BookmarkEntity.SyncState deletedSyncState) {
        readId.getClass();
        deletedSyncState.getClass();
        return tb.a.n(this.__db, true, new String[]{"bookmarks"}, new a(readId, this, deletedSyncState, 1));
    }

    @Override // io.elevenlabs.data.database.entities.bookmarks.BookmarksDao
    public void insert(BookmarkEntity r42) {
        r42.getClass();
        g.C(this.__db, false, true, new b(this, r42, 0));
    }

    @Override // io.elevenlabs.data.database.entities.bookmarks.BookmarksDao
    public void update(BookmarkEntity r42) {
        r42.getClass();
        g.C(this.__db, false, true, new b(this, r42, 1));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao_Impl$Companion;", "", "<init>", "()V", "", "Loo/d;", "getRequiredConverters", "()Ljava/util/List;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
