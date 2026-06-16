package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import android.gov.nist.core.Separators;
import io.elevenlabs.domain.model.Bookmark;
import io.elevenlabs.player.BackgroundPlayerAction;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkState;", "", "bookmarkId", "", BackgroundPlayerAction.Bookmark.ACTION_ID, "Lio/elevenlabs/domain/model/Bookmark;", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/model/Bookmark;)V", "getBookmarkId", "()Ljava/lang/String;", "getBookmark", "()Lio/elevenlabs/domain/model/Bookmark;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class BookmarkState {
    public static final int $stable = 8;
    private final Bookmark bookmark;
    private final String bookmarkId;

    public /* synthetic */ BookmarkState(String str, Bookmark bookmark, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bookmark);
    }

    public static /* synthetic */ BookmarkState copy$default(BookmarkState bookmarkState, String str, Bookmark bookmark, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bookmarkState.bookmarkId;
        }
        if ((i10 & 2) != 0) {
            bookmark = bookmarkState.bookmark;
        }
        return bookmarkState.copy(str, bookmark);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBookmarkId() {
        return this.bookmarkId;
    }

    /* renamed from: component2, reason: from getter */
    public final Bookmark getBookmark() {
        return this.bookmark;
    }

    public final BookmarkState copy(String bookmarkId, Bookmark bookmark) {
        return new BookmarkState(bookmarkId, bookmark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookmarkState)) {
            return false;
        }
        BookmarkState bookmarkState = (BookmarkState) other;
        if (kotlin.jvm.internal.m.c(this.bookmarkId, bookmarkState.bookmarkId) && kotlin.jvm.internal.m.c(this.bookmark, bookmarkState.bookmark)) {
            return true;
        }
        return false;
    }

    public final Bookmark getBookmark() {
        return this.bookmark;
    }

    public final String getBookmarkId() {
        return this.bookmarkId;
    }

    public int hashCode() {
        int hashCode;
        String str = this.bookmarkId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        Bookmark bookmark = this.bookmark;
        if (bookmark != null) {
            i10 = bookmark.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "BookmarkState(bookmarkId=" + this.bookmarkId + ", bookmark=" + this.bookmark + Separators.RPAREN;
    }

    public BookmarkState(String str, Bookmark bookmark) {
        this.bookmarkId = str;
        this.bookmark = bookmark;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BookmarkState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
