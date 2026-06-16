package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/model/BookmarkRange;", "", "bookmarkId", "", "startOffsetInclusive", "", "endOffsetExclusive", "<init>", "(Ljava/lang/String;JJ)V", "getBookmarkId", "()Ljava/lang/String;", "getStartOffsetInclusive", "()J", "getEndOffsetExclusive", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class BookmarkRange {
    private final String bookmarkId;
    private final long endOffsetExclusive;
    private final long startOffsetInclusive;

    public BookmarkRange(String str, long j4, long j10) {
        str.getClass();
        this.bookmarkId = str;
        this.startOffsetInclusive = j4;
        this.endOffsetExclusive = j10;
    }

    public static /* synthetic */ BookmarkRange copy$default(BookmarkRange bookmarkRange, String str, long j4, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bookmarkRange.bookmarkId;
        }
        if ((i10 & 2) != 0) {
            j4 = bookmarkRange.startOffsetInclusive;
        }
        if ((i10 & 4) != 0) {
            j10 = bookmarkRange.endOffsetExclusive;
        }
        return bookmarkRange.copy(str, j4, j10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBookmarkId() {
        return this.bookmarkId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartOffsetInclusive() {
        return this.startOffsetInclusive;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEndOffsetExclusive() {
        return this.endOffsetExclusive;
    }

    public final BookmarkRange copy(String bookmarkId, long startOffsetInclusive, long endOffsetExclusive) {
        bookmarkId.getClass();
        return new BookmarkRange(bookmarkId, startOffsetInclusive, endOffsetExclusive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookmarkRange)) {
            return false;
        }
        BookmarkRange bookmarkRange = (BookmarkRange) other;
        if (m.c(this.bookmarkId, bookmarkRange.bookmarkId) && this.startOffsetInclusive == bookmarkRange.startOffsetInclusive && this.endOffsetExclusive == bookmarkRange.endOffsetExclusive) {
            return true;
        }
        return false;
    }

    public final String getBookmarkId() {
        return this.bookmarkId;
    }

    public final long getEndOffsetExclusive() {
        return this.endOffsetExclusive;
    }

    public final long getStartOffsetInclusive() {
        return this.startOffsetInclusive;
    }

    public int hashCode() {
        return Long.hashCode(this.endOffsetExclusive) + b.g(this.startOffsetInclusive, this.bookmarkId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.bookmarkId;
        long j4 = this.startOffsetInclusive;
        long j10 = this.endOffsetExclusive;
        StringBuilder r10 = b.r("BookmarkRange(bookmarkId=", str, j4, ", startOffsetInclusive=");
        r10.append(", endOffsetExclusive=");
        r10.append(j10);
        r10.append(Separators.RPAREN);
        return r10.toString();
    }
}
