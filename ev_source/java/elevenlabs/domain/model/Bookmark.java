package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u0084\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00102J\u0014\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u00020\u000eHÖ\u0081\u0004J\n\u00107\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#¨\u00068"}, d2 = {"Lio/elevenlabs/domain/model/Bookmark;", "", "bookmarkId", "", "readId", "startOffsetInclusive", "", "endOffsetExclusive", ParameterNames.TEXT, "createdAt", "Ljava/util/Date;", "updatedAt", "note", "chapterIndex", "", "startTimeSeconds", "", "endTimeSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "getBookmarkId", "()Ljava/lang/String;", "getReadId", "getStartOffsetInclusive", "()J", "getEndOffsetExclusive", "getText", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getNote", "getChapterIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartTimeSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEndTimeSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lio/elevenlabs/domain/model/Bookmark;", "equals", "", "other", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Bookmark {
    private final String bookmarkId;
    private final Integer chapterIndex;
    private final Date createdAt;
    private final long endOffsetExclusive;
    private final Double endTimeSeconds;
    private final String note;
    private final String readId;
    private final long startOffsetInclusive;
    private final Double startTimeSeconds;
    private final String text;
    private final Date updatedAt;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Bookmark(String str, String str2, long j4, long j10, String str3, Date date, Date date2, String str4, Integer num, Double d10, Double d11, int i10, f fVar) {
        this(str, str2, j4, j10, str3, date, date2, r13, r14, r15, r16);
        String str5;
        Integer num2;
        Double d12;
        Double d13;
        if ((i10 & 128) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i10 & 512) != 0) {
            d12 = null;
        } else {
            d12 = d10;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            d13 = null;
        } else {
            d13 = d11;
        }
    }

    public static /* synthetic */ Bookmark copy$default(Bookmark bookmark, String str, String str2, long j4, long j10, String str3, Date date, Date date2, String str4, Integer num, Double d10, Double d11, int i10, Object obj) {
        String str5;
        long j11;
        long j12;
        String str6;
        Date date3;
        Date date4;
        String str7;
        Integer num2;
        Double d12;
        Double d13;
        if ((i10 & 1) != 0) {
            str = bookmark.bookmarkId;
        }
        if ((i10 & 2) != 0) {
            str5 = bookmark.readId;
        } else {
            str5 = str2;
        }
        if ((i10 & 4) != 0) {
            j11 = bookmark.startOffsetInclusive;
        } else {
            j11 = j4;
        }
        if ((i10 & 8) != 0) {
            j12 = bookmark.endOffsetExclusive;
        } else {
            j12 = j10;
        }
        if ((i10 & 16) != 0) {
            str6 = bookmark.text;
        } else {
            str6 = str3;
        }
        if ((i10 & 32) != 0) {
            date3 = bookmark.createdAt;
        } else {
            date3 = date;
        }
        if ((i10 & 64) != 0) {
            date4 = bookmark.updatedAt;
        } else {
            date4 = date2;
        }
        if ((i10 & 128) != 0) {
            str7 = bookmark.note;
        } else {
            str7 = str4;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            num2 = bookmark.chapterIndex;
        } else {
            num2 = num;
        }
        if ((i10 & 512) != 0) {
            d12 = bookmark.startTimeSeconds;
        } else {
            d12 = d10;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            d13 = bookmark.endTimeSeconds;
        } else {
            d13 = d11;
        }
        return bookmark.copy(str, str5, j11, j12, str6, date3, date4, str7, num2, d12, d13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBookmarkId() {
        return this.bookmarkId;
    }

    /* renamed from: component10, reason: from getter */
    public final Double getStartTimeSeconds() {
        return this.startTimeSeconds;
    }

    /* renamed from: component11, reason: from getter */
    public final Double getEndTimeSeconds() {
        return this.endTimeSeconds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartOffsetInclusive() {
        return this.startOffsetInclusive;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEndOffsetExclusive() {
        return this.endOffsetExclusive;
    }

    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getChapterIndex() {
        return this.chapterIndex;
    }

    public final Bookmark copy(String bookmarkId, String readId, long startOffsetInclusive, long endOffsetExclusive, String r21, Date createdAt, Date updatedAt, String note, Integer chapterIndex, Double startTimeSeconds, Double endTimeSeconds) {
        bookmarkId.getClass();
        readId.getClass();
        r21.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        return new Bookmark(bookmarkId, readId, startOffsetInclusive, endOffsetExclusive, r21, createdAt, updatedAt, note, chapterIndex, startTimeSeconds, endTimeSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bookmark)) {
            return false;
        }
        Bookmark bookmark = (Bookmark) other;
        if (m.c(this.bookmarkId, bookmark.bookmarkId) && m.c(this.readId, bookmark.readId) && this.startOffsetInclusive == bookmark.startOffsetInclusive && this.endOffsetExclusive == bookmark.endOffsetExclusive && m.c(this.text, bookmark.text) && m.c(this.createdAt, bookmark.createdAt) && m.c(this.updatedAt, bookmark.updatedAt) && m.c(this.note, bookmark.note) && m.c(this.chapterIndex, bookmark.chapterIndex) && m.c(this.startTimeSeconds, bookmark.startTimeSeconds) && m.c(this.endTimeSeconds, bookmark.endTimeSeconds)) {
            return true;
        }
        return false;
    }

    public final String getBookmarkId() {
        return this.bookmarkId;
    }

    public final Integer getChapterIndex() {
        return this.chapterIndex;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final long getEndOffsetExclusive() {
        return this.endOffsetExclusive;
    }

    public final Double getEndTimeSeconds() {
        return this.endTimeSeconds;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final long getStartOffsetInclusive() {
        return this.startOffsetInclusive;
    }

    public final Double getStartTimeSeconds() {
        return this.startTimeSeconds;
    }

    public final String getText() {
        return this.text;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.updatedAt.hashCode() + ((this.createdAt.hashCode() + c.c(b.g(this.endOffsetExclusive, b.g(this.startOffsetInclusive, c.c(this.bookmarkId.hashCode() * 31, 31, this.readId), 31), 31), 31, this.text)) * 31)) * 31;
        String str = this.note;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        Integer num = this.chapterIndex;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Double d10 = this.startTimeSeconds;
        if (d10 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d10.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Double d11 = this.endTimeSeconds;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        String str = this.bookmarkId;
        String str2 = this.readId;
        long j4 = this.startOffsetInclusive;
        long j10 = this.endOffsetExclusive;
        String str3 = this.text;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        String str4 = this.note;
        Integer num = this.chapterIndex;
        Double d10 = this.startTimeSeconds;
        Double d11 = this.endTimeSeconds;
        StringBuilder s10 = defpackage.f.s("Bookmark(bookmarkId=", str, ", readId=", str2, ", startOffsetInclusive=");
        s10.append(j4);
        b.w(s10, ", endOffsetExclusive=", j10, ", text=");
        s10.append(str3);
        s10.append(", createdAt=");
        s10.append(date);
        s10.append(", updatedAt=");
        s10.append(date2);
        s10.append(", note=");
        s10.append(str4);
        s10.append(", chapterIndex=");
        s10.append(num);
        s10.append(", startTimeSeconds=");
        s10.append(d10);
        s10.append(", endTimeSeconds=");
        s10.append(d11);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public Bookmark(String str, String str2, long j4, long j10, String str3, Date date, Date date2, String str4, Integer num, Double d10, Double d11) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        date.getClass();
        date2.getClass();
        this.bookmarkId = str;
        this.readId = str2;
        this.startOffsetInclusive = j4;
        this.endOffsetExclusive = j10;
        this.text = str3;
        this.createdAt = date;
        this.updatedAt = date2;
        this.note = str4;
        this.chapterIndex = num;
        this.startTimeSeconds = d10;
        this.endTimeSeconds = d11;
    }
}
