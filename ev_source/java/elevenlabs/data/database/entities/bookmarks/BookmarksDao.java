package io.elevenlabs.data.database.entities.bookmarks;

import android.gov.nist.core.Separators;
import io.elevenlabs.data.database.entities.bookmarks.BookmarkEntity;
import io.elevenlabs.player.BackgroundPlayerAction;
import ir.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001:\u0001\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0007H'¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\rH'¢\u0006\u0004\b\u0012\u0010\u0010J-\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\b0\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\rH'¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0006J\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000bH'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u0006¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao;", "", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;", BackgroundPlayerAction.Bookmark.ACTION_ID, "Lsn/z;", "insert", "(Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity;)V", "Lir/i;", "", "getAllWithPendingSyncState", "()Lir/i;", "", "readId", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;", "syncState", "getAllWithSyncState", "(Ljava/lang/String;Lio/elevenlabs/data/database/entities/bookmarks/BookmarkEntity$SyncState;)Lir/i;", "deletedSyncState", "getAll", "Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao$BookmarkOffsetTuple;", "getOffsets", "deleteBookmark", "bookmarkId", "getById", "(Ljava/lang/String;)Lir/i;", "update", "BookmarkOffsetTuple", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface BookmarksDao {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/data/database/entities/bookmarks/BookmarksDao$BookmarkOffsetTuple;", "", "id", "", "startOffsetInclusive", "", "endOffsetExclusive", "<init>", "(Ljava/lang/String;JJ)V", "getId", "()Ljava/lang/String;", "getStartOffsetInclusive", "()J", "getEndOffsetExclusive", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class BookmarkOffsetTuple {
        private final long endOffsetExclusive;
        private final String id;
        private final long startOffsetInclusive;

        public BookmarkOffsetTuple(String str, long j4, long j10) {
            str.getClass();
            this.id = str;
            this.startOffsetInclusive = j4;
            this.endOffsetExclusive = j10;
        }

        public static /* synthetic */ BookmarkOffsetTuple copy$default(BookmarkOffsetTuple bookmarkOffsetTuple, String str, long j4, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bookmarkOffsetTuple.id;
            }
            if ((i10 & 2) != 0) {
                j4 = bookmarkOffsetTuple.startOffsetInclusive;
            }
            if ((i10 & 4) != 0) {
                j10 = bookmarkOffsetTuple.endOffsetExclusive;
            }
            return bookmarkOffsetTuple.copy(str, j4, j10);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartOffsetInclusive() {
            return this.startOffsetInclusive;
        }

        /* renamed from: component3, reason: from getter */
        public final long getEndOffsetExclusive() {
            return this.endOffsetExclusive;
        }

        public final BookmarkOffsetTuple copy(String id2, long startOffsetInclusive, long endOffsetExclusive) {
            id2.getClass();
            return new BookmarkOffsetTuple(id2, startOffsetInclusive, endOffsetExclusive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BookmarkOffsetTuple)) {
                return false;
            }
            BookmarkOffsetTuple bookmarkOffsetTuple = (BookmarkOffsetTuple) other;
            if (m.c(this.id, bookmarkOffsetTuple.id) && this.startOffsetInclusive == bookmarkOffsetTuple.startOffsetInclusive && this.endOffsetExclusive == bookmarkOffsetTuple.endOffsetExclusive) {
                return true;
            }
            return false;
        }

        public final long getEndOffsetExclusive() {
            return this.endOffsetExclusive;
        }

        public final String getId() {
            return this.id;
        }

        public final long getStartOffsetInclusive() {
            return this.startOffsetInclusive;
        }

        public int hashCode() {
            return Long.hashCode(this.endOffsetExclusive) + com.google.android.gms.internal.play_billing.b.g(this.startOffsetInclusive, this.id.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.id;
            long j4 = this.startOffsetInclusive;
            long j10 = this.endOffsetExclusive;
            StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("BookmarkOffsetTuple(id=", str, j4, ", startOffsetInclusive=");
            r10.append(", endOffsetExclusive=");
            r10.append(j10);
            r10.append(Separators.RPAREN);
            return r10.toString();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ i getAll$default(BookmarksDao bookmarksDao, String str, BookmarkEntity.SyncState syncState, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                syncState = BookmarkEntity.SyncState.PENDING_DELETE;
            }
            return bookmarksDao.getAll(str, syncState);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getAll");
        return null;
    }

    static /* synthetic */ i getOffsets$default(BookmarksDao bookmarksDao, String str, BookmarkEntity.SyncState syncState, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                syncState = BookmarkEntity.SyncState.PENDING_DELETE;
            }
            return bookmarksDao.getOffsets(str, syncState);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getOffsets");
        return null;
    }

    void deleteBookmark(BookmarkEntity bookmark);

    i getAll(String readId, BookmarkEntity.SyncState deletedSyncState);

    i getAllWithPendingSyncState();

    i getAllWithSyncState(String readId, BookmarkEntity.SyncState syncState);

    i getById(String bookmarkId);

    i getOffsets(String readId, BookmarkEntity.SyncState deletedSyncState);

    void insert(BookmarkEntity bookmark);

    void update(BookmarkEntity bookmark);
}
