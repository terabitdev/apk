package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\tHÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019¨\u0006*"}, d2 = {"Lio/elevenlabs/domain/model/CreateBookmarkRequest;", "", "startOffsetInclusive", "", "endOffsetExclusive", ParameterNames.TEXT, "", "note", "chapterIndex", "", "startTimeSeconds", "", "endTimeSeconds", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "getStartOffsetInclusive", "()J", "getEndOffsetExclusive", "getText", "()Ljava/lang/String;", "getNote", "getChapterIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartTimeSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEndTimeSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lio/elevenlabs/domain/model/CreateBookmarkRequest;", "equals", "", "other", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class CreateBookmarkRequest {
    private final Integer chapterIndex;
    private final long endOffsetExclusive;
    private final Double endTimeSeconds;
    private final String note;
    private final long startOffsetInclusive;
    private final Double startTimeSeconds;
    private final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CreateBookmarkRequest(long j4, long j10, String str, String str2, Integer num, Double d10, Double d11, int i10, f fVar) {
        this(j4, j10, str, str2, num, d10, r11);
        Double d12;
        str2 = (i10 & 8) != 0 ? null : str2;
        num = (i10 & 16) != 0 ? null : num;
        d10 = (i10 & 32) != 0 ? null : d10;
        if ((i10 & 64) != 0) {
            d12 = null;
        } else {
            d12 = d11;
        }
    }

    public static /* synthetic */ CreateBookmarkRequest copy$default(CreateBookmarkRequest createBookmarkRequest, long j4, long j10, String str, String str2, Integer num, Double d10, Double d11, int i10, Object obj) {
        String str3;
        Integer num2;
        Double d12;
        Double d13;
        if ((i10 & 1) != 0) {
            j4 = createBookmarkRequest.startOffsetInclusive;
        }
        long j11 = j4;
        if ((i10 & 2) != 0) {
            j10 = createBookmarkRequest.endOffsetExclusive;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            str = createBookmarkRequest.text;
        }
        String str4 = str;
        if ((i10 & 8) != 0) {
            str3 = createBookmarkRequest.note;
        } else {
            str3 = str2;
        }
        if ((i10 & 16) != 0) {
            num2 = createBookmarkRequest.chapterIndex;
        } else {
            num2 = num;
        }
        if ((i10 & 32) != 0) {
            d12 = createBookmarkRequest.startTimeSeconds;
        } else {
            d12 = d10;
        }
        if ((i10 & 64) != 0) {
            d13 = createBookmarkRequest.endTimeSeconds;
        } else {
            d13 = d11;
        }
        return createBookmarkRequest.copy(j11, j12, str4, str3, num2, d12, d13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartOffsetInclusive() {
        return this.startOffsetInclusive;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndOffsetExclusive() {
        return this.endOffsetExclusive;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getChapterIndex() {
        return this.chapterIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getStartTimeSeconds() {
        return this.startTimeSeconds;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getEndTimeSeconds() {
        return this.endTimeSeconds;
    }

    public final CreateBookmarkRequest copy(long startOffsetInclusive, long endOffsetExclusive, String text, String note, Integer chapterIndex, Double startTimeSeconds, Double endTimeSeconds) {
        text.getClass();
        return new CreateBookmarkRequest(startOffsetInclusive, endOffsetExclusive, text, note, chapterIndex, startTimeSeconds, endTimeSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateBookmarkRequest)) {
            return false;
        }
        CreateBookmarkRequest createBookmarkRequest = (CreateBookmarkRequest) other;
        if (this.startOffsetInclusive == createBookmarkRequest.startOffsetInclusive && this.endOffsetExclusive == createBookmarkRequest.endOffsetExclusive && m.c(this.text, createBookmarkRequest.text) && m.c(this.note, createBookmarkRequest.note) && m.c(this.chapterIndex, createBookmarkRequest.chapterIndex) && m.c(this.startTimeSeconds, createBookmarkRequest.startTimeSeconds) && m.c(this.endTimeSeconds, createBookmarkRequest.endTimeSeconds)) {
            return true;
        }
        return false;
    }

    public final Integer getChapterIndex() {
        return this.chapterIndex;
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

    public final long getStartOffsetInclusive() {
        return this.startOffsetInclusive;
    }

    public final Double getStartTimeSeconds() {
        return this.startTimeSeconds;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int c5 = c.c(b.g(this.endOffsetExclusive, Long.hashCode(this.startOffsetInclusive) * 31, 31), 31, this.text);
        String str = this.note;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (c5 + hashCode) * 31;
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
        long j4 = this.startOffsetInclusive;
        long j10 = this.endOffsetExclusive;
        String str = this.text;
        String str2 = this.note;
        Integer num = this.chapterIndex;
        Double d10 = this.startTimeSeconds;
        Double d11 = this.endTimeSeconds;
        StringBuilder q = b.q("CreateBookmarkRequest(startOffsetInclusive=", j4, ", endOffsetExclusive=");
        q.append(j10);
        q.append(", text=");
        q.append(str);
        q.append(", note=");
        q.append(str2);
        q.append(", chapterIndex=");
        q.append(num);
        q.append(", startTimeSeconds=");
        q.append(d10);
        q.append(", endTimeSeconds=");
        q.append(d11);
        q.append(Separators.RPAREN);
        return q.toString();
    }

    public CreateBookmarkRequest(long j4, long j10, String str, String str2, Integer num, Double d10, Double d11) {
        str.getClass();
        this.startOffsetInclusive = j4;
        this.endOffsetExclusive = j10;
        this.text = str;
        this.note = str2;
        this.chapterIndex = num;
        this.startTimeSeconds = d10;
        this.endTimeSeconds = d11;
    }
}
