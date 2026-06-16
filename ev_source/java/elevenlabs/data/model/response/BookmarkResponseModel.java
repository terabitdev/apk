package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.f;
import ib.i;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import ur.c1;
import ur.f0;
import ur.g1;
import ur.r;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0086\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010>\u0012\u0004\b@\u0010;\u001a\u0004\b?\u0010\u001bR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\bB\u0010;\u001a\u0004\bA\u0010\u001bR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\bD\u0010;\u001a\u0004\bC\u0010\u0018R \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\bF\u0010;\u001a\u0004\bE\u0010\u001bR \u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\bH\u0010;\u001a\u0004\bG\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\bJ\u0010;\u001a\u0004\bI\u0010\u0018R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010K\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010\"R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010N\u0012\u0004\bP\u0010;\u001a\u0004\bO\u0010$R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010N\u0012\u0004\bR\u0010;\u001a\u0004\bQ\u0010$¨\u0006U"}, d2 = {"Lio/elevenlabs/data/model/response/BookmarkResponseModel;", "", "", "bookmarkId", "readId", "", "startOffsetInclusive", "endOffsetExclusive", ParameterNames.TEXT, "createdAtUnix", "updatedAtUnix", "note", "", "chapterIndex", "", "startTimeSeconds", "endTimeSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JJLjava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "()Ljava/lang/Double;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lio/elevenlabs/data/model/response/BookmarkResponseModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/response/BookmarkResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getBookmarkId", "getBookmarkId$annotations", "()V", "getReadId", "getReadId$annotations", "J", "getStartOffsetInclusive", "getStartOffsetInclusive$annotations", "getEndOffsetExclusive", "getEndOffsetExclusive$annotations", "getText", "getText$annotations", "getCreatedAtUnix", "getCreatedAtUnix$annotations", "getUpdatedAtUnix", "getUpdatedAtUnix$annotations", "getNote", "getNote$annotations", "Ljava/lang/Integer;", "getChapterIndex", "getChapterIndex$annotations", "Ljava/lang/Double;", "getStartTimeSeconds", "getStartTimeSeconds$annotations", "getEndTimeSeconds", "getEndTimeSeconds$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BookmarkResponseModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String bookmarkId;
    private final Integer chapterIndex;
    private final long createdAtUnix;
    private final long endOffsetExclusive;
    private final Double endTimeSeconds;
    private final String note;
    private final String readId;
    private final long startOffsetInclusive;
    private final Double startTimeSeconds;
    private final String text;
    private final long updatedAtUnix;

    public /* synthetic */ BookmarkResponseModel(int i10, String str, String str2, long j4, long j10, String str3, long j11, long j12, String str4, Integer num, Double d10, Double d11, c1 c1Var) {
        if (127 == (i10 & 127)) {
            this.bookmarkId = str;
            this.readId = str2;
            this.startOffsetInclusive = j4;
            this.endOffsetExclusive = j10;
            this.text = str3;
            this.createdAtUnix = j11;
            this.updatedAtUnix = j12;
            if ((i10 & 128) == 0) {
                this.note = null;
            } else {
                this.note = str4;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.chapterIndex = null;
            } else {
                this.chapterIndex = num;
            }
            if ((i10 & 512) == 0) {
                this.startTimeSeconds = null;
            } else {
                this.startTimeSeconds = d10;
            }
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                this.endTimeSeconds = null;
                return;
            } else {
                this.endTimeSeconds = d11;
                return;
            }
        }
        t0.j(i10, 127, BookmarkResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ BookmarkResponseModel copy$default(BookmarkResponseModel bookmarkResponseModel, String str, String str2, long j4, long j10, String str3, long j11, long j12, String str4, Integer num, Double d10, Double d11, int i10, Object obj) {
        String str5;
        String str6;
        long j13;
        long j14;
        String str7;
        long j15;
        long j16;
        String str8;
        Integer num2;
        Double d12;
        Double d13;
        if ((i10 & 1) != 0) {
            str5 = bookmarkResponseModel.bookmarkId;
        } else {
            str5 = str;
        }
        if ((i10 & 2) != 0) {
            str6 = bookmarkResponseModel.readId;
        } else {
            str6 = str2;
        }
        if ((i10 & 4) != 0) {
            j13 = bookmarkResponseModel.startOffsetInclusive;
        } else {
            j13 = j4;
        }
        if ((i10 & 8) != 0) {
            j14 = bookmarkResponseModel.endOffsetExclusive;
        } else {
            j14 = j10;
        }
        if ((i10 & 16) != 0) {
            str7 = bookmarkResponseModel.text;
        } else {
            str7 = str3;
        }
        if ((i10 & 32) != 0) {
            j15 = bookmarkResponseModel.createdAtUnix;
        } else {
            j15 = j11;
        }
        if ((i10 & 64) != 0) {
            j16 = bookmarkResponseModel.updatedAtUnix;
        } else {
            j16 = j12;
        }
        if ((i10 & 128) != 0) {
            str8 = bookmarkResponseModel.note;
        } else {
            str8 = str4;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            num2 = bookmarkResponseModel.chapterIndex;
        } else {
            num2 = num;
        }
        if ((i10 & 512) != 0) {
            d12 = bookmarkResponseModel.startTimeSeconds;
        } else {
            d12 = d10;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            d13 = bookmarkResponseModel.endTimeSeconds;
        } else {
            d13 = d11;
        }
        return bookmarkResponseModel.copy(str5, str6, j13, j14, str7, j15, j16, str8, num2, d12, d13);
    }

    public static final /* synthetic */ void write$Self$data_release(BookmarkResponseModel self, tr.b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.bookmarkId);
        output.V(serialDesc, 1, self.readId);
        output.h0(serialDesc, 2, self.startOffsetInclusive);
        output.h0(serialDesc, 3, self.endOffsetExclusive);
        output.V(serialDesc, 4, self.text);
        output.h0(serialDesc, 5, self.createdAtUnix);
        output.h0(serialDesc, 6, self.updatedAtUnix);
        if (output.C(serialDesc) || self.note != null) {
            output.o(serialDesc, 7, g1.f34588a, self.note);
        }
        if (output.C(serialDesc) || self.chapterIndex != null) {
            output.o(serialDesc, 8, f0.f34579a, self.chapterIndex);
        }
        if (output.C(serialDesc) || self.startTimeSeconds != null) {
            output.o(serialDesc, 9, r.f34640a, self.startTimeSeconds);
        }
        if (output.C(serialDesc) || self.endTimeSeconds != null) {
            output.o(serialDesc, 10, r.f34640a, self.endTimeSeconds);
        }
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
    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    /* renamed from: component7, reason: from getter */
    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getChapterIndex() {
        return this.chapterIndex;
    }

    public final BookmarkResponseModel copy(String bookmarkId, String readId, long startOffsetInclusive, long endOffsetExclusive, String text, long createdAtUnix, long updatedAtUnix, String note, Integer chapterIndex, Double startTimeSeconds, Double endTimeSeconds) {
        bookmarkId.getClass();
        readId.getClass();
        text.getClass();
        return new BookmarkResponseModel(bookmarkId, readId, startOffsetInclusive, endOffsetExclusive, text, createdAtUnix, updatedAtUnix, note, chapterIndex, startTimeSeconds, endTimeSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookmarkResponseModel)) {
            return false;
        }
        BookmarkResponseModel bookmarkResponseModel = (BookmarkResponseModel) other;
        if (m.c(this.bookmarkId, bookmarkResponseModel.bookmarkId) && m.c(this.readId, bookmarkResponseModel.readId) && this.startOffsetInclusive == bookmarkResponseModel.startOffsetInclusive && this.endOffsetExclusive == bookmarkResponseModel.endOffsetExclusive && m.c(this.text, bookmarkResponseModel.text) && this.createdAtUnix == bookmarkResponseModel.createdAtUnix && this.updatedAtUnix == bookmarkResponseModel.updatedAtUnix && m.c(this.note, bookmarkResponseModel.note) && m.c(this.chapterIndex, bookmarkResponseModel.chapterIndex) && m.c(this.startTimeSeconds, bookmarkResponseModel.startTimeSeconds) && m.c(this.endTimeSeconds, bookmarkResponseModel.endTimeSeconds)) {
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

    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
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

    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.updatedAtUnix, com.google.android.gms.internal.play_billing.b.g(this.createdAtUnix, j0.c.c(com.google.android.gms.internal.play_billing.b.g(this.endOffsetExclusive, com.google.android.gms.internal.play_billing.b.g(this.startOffsetInclusive, j0.c.c(this.bookmarkId.hashCode() * 31, 31, this.readId), 31), 31), 31, this.text), 31), 31);
        String str = this.note;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
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
        long j11 = this.createdAtUnix;
        long j12 = this.updatedAtUnix;
        String str4 = this.note;
        Integer num = this.chapterIndex;
        Double d10 = this.startTimeSeconds;
        Double d11 = this.endTimeSeconds;
        StringBuilder s10 = f.s("BookmarkResponseModel(bookmarkId=", str, ", readId=", str2, ", startOffsetInclusive=");
        s10.append(j4);
        com.google.android.gms.internal.play_billing.b.w(s10, ", endOffsetExclusive=", j10, ", text=");
        s10.append(str3);
        s10.append(", createdAtUnix=");
        s10.append(j11);
        com.google.android.gms.internal.play_billing.b.w(s10, ", updatedAtUnix=", j12, ", note=");
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

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/response/BookmarkResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/response/BookmarkResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BookmarkResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBookmarkId$annotations() {
    }

    public static /* synthetic */ void getChapterIndex$annotations() {
    }

    public static /* synthetic */ void getCreatedAtUnix$annotations() {
    }

    public static /* synthetic */ void getEndOffsetExclusive$annotations() {
    }

    public static /* synthetic */ void getEndTimeSeconds$annotations() {
    }

    public static /* synthetic */ void getNote$annotations() {
    }

    public static /* synthetic */ void getReadId$annotations() {
    }

    public static /* synthetic */ void getStartOffsetInclusive$annotations() {
    }

    public static /* synthetic */ void getStartTimeSeconds$annotations() {
    }

    public static /* synthetic */ void getText$annotations() {
    }

    public static /* synthetic */ void getUpdatedAtUnix$annotations() {
    }

    public BookmarkResponseModel(String str, String str2, long j4, long j10, String str3, long j11, long j12, String str4, Integer num, Double d10, Double d11) {
        i.s(str, str2, str3);
        this.bookmarkId = str;
        this.readId = str2;
        this.startOffsetInclusive = j4;
        this.endOffsetExclusive = j10;
        this.text = str3;
        this.createdAtUnix = j11;
        this.updatedAtUnix = j12;
        this.note = str4;
        this.chapterIndex = num;
        this.startTimeSeconds = d10;
        this.endTimeSeconds = d11;
    }

    public /* synthetic */ BookmarkResponseModel(String str, String str2, long j4, long j10, String str3, long j11, long j12, String str4, Integer num, Double d10, Double d11, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, j4, j10, str3, j11, j12, (i10 & 128) != 0 ? null : str4, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : num, (i10 & 512) != 0 ? null : d10, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : d11);
    }
}
