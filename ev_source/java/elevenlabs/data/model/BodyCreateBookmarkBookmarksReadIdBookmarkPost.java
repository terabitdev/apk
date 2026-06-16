package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.f0;
import ur.g1;
import ur.r;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010Bm\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010 Jr\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00104\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010\u0016R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\b<\u00107\u001a\u0004\b;\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b>\u00107\u001a\u0004\b=\u0010\u0016R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b@\u00107\u001a\u0004\b?\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\bB\u00107\u001a\u0004\bA\u0010\u0019R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010C\u0012\u0004\bE\u00107\u001a\u0004\bD\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010F\u0012\u0004\bH\u00107\u001a\u0004\bG\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010F\u0012\u0004\bJ\u00107\u001a\u0004\bI\u0010 ¨\u0006M"}, d2 = {"Lio/elevenlabs/data/model/BodyCreateBookmarkBookmarksReadIdBookmarkPost;", "", "", "startOffsetInclusive", "endOffsetExclusive", "", ParameterNames.TEXT, "createdAtUnix", "updatedAtUnix", "note", "", "chapterIndex", "", "startTimeSeconds", "endTimeSeconds", "<init>", "(JJLjava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lur/c1;", "serializationConstructorMarker", "(IJJLjava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Lur/c1;)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()Ljava/lang/Double;", "component9", "copy", "(JJLjava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lio/elevenlabs/data/model/BodyCreateBookmarkBookmarksReadIdBookmarkPost;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/BodyCreateBookmarkBookmarksReadIdBookmarkPost;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "J", "getStartOffsetInclusive", "getStartOffsetInclusive$annotations", "()V", "getEndOffsetExclusive", "getEndOffsetExclusive$annotations", "Ljava/lang/String;", "getText", "getText$annotations", "getCreatedAtUnix", "getCreatedAtUnix$annotations", "getUpdatedAtUnix", "getUpdatedAtUnix$annotations", "getNote", "getNote$annotations", "Ljava/lang/Integer;", "getChapterIndex", "getChapterIndex$annotations", "Ljava/lang/Double;", "getStartTimeSeconds", "getStartTimeSeconds$annotations", "getEndTimeSeconds", "getEndTimeSeconds$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BodyCreateBookmarkBookmarksReadIdBookmarkPost {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer chapterIndex;
    private final long createdAtUnix;
    private final long endOffsetExclusive;
    private final Double endTimeSeconds;
    private final String note;
    private final long startOffsetInclusive;
    private final Double startTimeSeconds;
    private final String text;
    private final long updatedAtUnix;

    public /* synthetic */ BodyCreateBookmarkBookmarksReadIdBookmarkPost(int i10, long j4, long j10, String str, long j11, long j12, String str2, Integer num, Double d10, Double d11, c1 c1Var) {
        if (31 == (i10 & 31)) {
            this.startOffsetInclusive = j4;
            this.endOffsetExclusive = j10;
            this.text = str;
            this.createdAtUnix = j11;
            this.updatedAtUnix = j12;
            if ((i10 & 32) == 0) {
                this.note = null;
            } else {
                this.note = str2;
            }
            if ((i10 & 64) == 0) {
                this.chapterIndex = null;
            } else {
                this.chapterIndex = num;
            }
            if ((i10 & 128) == 0) {
                this.startTimeSeconds = null;
            } else {
                this.startTimeSeconds = d10;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                this.endTimeSeconds = null;
                return;
            } else {
                this.endTimeSeconds = d11;
                return;
            }
        }
        t0.j(i10, 31, BodyCreateBookmarkBookmarksReadIdBookmarkPost$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ BodyCreateBookmarkBookmarksReadIdBookmarkPost copy$default(BodyCreateBookmarkBookmarksReadIdBookmarkPost bodyCreateBookmarkBookmarksReadIdBookmarkPost, long j4, long j10, String str, long j11, long j12, String str2, Integer num, Double d10, Double d11, int i10, Object obj) {
        long j13;
        long j14;
        String str3;
        long j15;
        long j16;
        String str4;
        Integer num2;
        Double d12;
        Double d13;
        if ((i10 & 1) != 0) {
            j13 = bodyCreateBookmarkBookmarksReadIdBookmarkPost.startOffsetInclusive;
        } else {
            j13 = j4;
        }
        if ((i10 & 2) != 0) {
            j14 = bodyCreateBookmarkBookmarksReadIdBookmarkPost.endOffsetExclusive;
        } else {
            j14 = j10;
        }
        if ((i10 & 4) != 0) {
            str3 = bodyCreateBookmarkBookmarksReadIdBookmarkPost.text;
        } else {
            str3 = str;
        }
        if ((i10 & 8) != 0) {
            j15 = bodyCreateBookmarkBookmarksReadIdBookmarkPost.createdAtUnix;
        } else {
            j15 = j11;
        }
        if ((i10 & 16) != 0) {
            j16 = bodyCreateBookmarkBookmarksReadIdBookmarkPost.updatedAtUnix;
        } else {
            j16 = j12;
        }
        if ((i10 & 32) != 0) {
            str4 = bodyCreateBookmarkBookmarksReadIdBookmarkPost.note;
        } else {
            str4 = str2;
        }
        if ((i10 & 64) != 0) {
            num2 = bodyCreateBookmarkBookmarksReadIdBookmarkPost.chapterIndex;
        } else {
            num2 = num;
        }
        if ((i10 & 128) != 0) {
            d12 = bodyCreateBookmarkBookmarksReadIdBookmarkPost.startTimeSeconds;
        } else {
            d12 = d10;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            d13 = bodyCreateBookmarkBookmarksReadIdBookmarkPost.endTimeSeconds;
        } else {
            d13 = d11;
        }
        return bodyCreateBookmarkBookmarksReadIdBookmarkPost.copy(j13, j14, str3, j15, j16, str4, num2, d12, d13);
    }

    public static final /* synthetic */ void write$Self$data_release(BodyCreateBookmarkBookmarksReadIdBookmarkPost self, b output, SerialDescriptor serialDesc) {
        output.h0(serialDesc, 0, self.startOffsetInclusive);
        output.h0(serialDesc, 1, self.endOffsetExclusive);
        output.V(serialDesc, 2, self.text);
        output.h0(serialDesc, 3, self.createdAtUnix);
        output.h0(serialDesc, 4, self.updatedAtUnix);
        if (output.C(serialDesc) || self.note != null) {
            output.o(serialDesc, 5, g1.f34588a, self.note);
        }
        Integer num = self.chapterIndex;
        if (num != null) {
            output.o(serialDesc, 6, f0.f34579a, num);
        }
        Double d10 = self.startTimeSeconds;
        if (d10 != null) {
            output.o(serialDesc, 7, r.f34640a, d10);
        }
        Double d11 = self.endTimeSeconds;
        if (d11 != null) {
            output.o(serialDesc, 8, r.f34640a, d11);
        }
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
    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    /* renamed from: component5, reason: from getter */
    public final long getUpdatedAtUnix() {
        return this.updatedAtUnix;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getChapterIndex() {
        return this.chapterIndex;
    }

    /* renamed from: component8, reason: from getter */
    public final Double getStartTimeSeconds() {
        return this.startTimeSeconds;
    }

    /* renamed from: component9, reason: from getter */
    public final Double getEndTimeSeconds() {
        return this.endTimeSeconds;
    }

    public final BodyCreateBookmarkBookmarksReadIdBookmarkPost copy(long startOffsetInclusive, long endOffsetExclusive, String text, long createdAtUnix, long updatedAtUnix, String note, Integer chapterIndex, Double startTimeSeconds, Double endTimeSeconds) {
        text.getClass();
        return new BodyCreateBookmarkBookmarksReadIdBookmarkPost(startOffsetInclusive, endOffsetExclusive, text, createdAtUnix, updatedAtUnix, note, chapterIndex, startTimeSeconds, endTimeSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyCreateBookmarkBookmarksReadIdBookmarkPost)) {
            return false;
        }
        BodyCreateBookmarkBookmarksReadIdBookmarkPost bodyCreateBookmarkBookmarksReadIdBookmarkPost = (BodyCreateBookmarkBookmarksReadIdBookmarkPost) other;
        if (this.startOffsetInclusive == bodyCreateBookmarkBookmarksReadIdBookmarkPost.startOffsetInclusive && this.endOffsetExclusive == bodyCreateBookmarkBookmarksReadIdBookmarkPost.endOffsetExclusive && m.c(this.text, bodyCreateBookmarkBookmarksReadIdBookmarkPost.text) && this.createdAtUnix == bodyCreateBookmarkBookmarksReadIdBookmarkPost.createdAtUnix && this.updatedAtUnix == bodyCreateBookmarkBookmarksReadIdBookmarkPost.updatedAtUnix && m.c(this.note, bodyCreateBookmarkBookmarksReadIdBookmarkPost.note) && m.c(this.chapterIndex, bodyCreateBookmarkBookmarksReadIdBookmarkPost.chapterIndex) && m.c(this.startTimeSeconds, bodyCreateBookmarkBookmarksReadIdBookmarkPost.startTimeSeconds) && m.c(this.endTimeSeconds, bodyCreateBookmarkBookmarksReadIdBookmarkPost.endTimeSeconds)) {
            return true;
        }
        return false;
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
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.updatedAtUnix, com.google.android.gms.internal.play_billing.b.g(this.createdAtUnix, c.c(com.google.android.gms.internal.play_billing.b.g(this.endOffsetExclusive, Long.hashCode(this.startOffsetInclusive) * 31, 31), 31, this.text), 31), 31);
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
        long j4 = this.startOffsetInclusive;
        long j10 = this.endOffsetExclusive;
        String str = this.text;
        long j11 = this.createdAtUnix;
        long j12 = this.updatedAtUnix;
        String str2 = this.note;
        Integer num = this.chapterIndex;
        Double d10 = this.startTimeSeconds;
        Double d11 = this.endTimeSeconds;
        StringBuilder q = com.google.android.gms.internal.play_billing.b.q("BodyCreateBookmarkBookmarksReadIdBookmarkPost(startOffsetInclusive=", j4, ", endOffsetExclusive=");
        q.append(j10);
        q.append(", text=");
        q.append(str);
        com.google.android.gms.internal.play_billing.b.w(q, ", createdAtUnix=", j11, ", updatedAtUnix=");
        q.append(j12);
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

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BodyCreateBookmarkBookmarksReadIdBookmarkPost$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BodyCreateBookmarkBookmarksReadIdBookmarkPost;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BodyCreateBookmarkBookmarksReadIdBookmarkPost$$serializer.INSTANCE;
        }

        private Companion() {
        }
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

    public static /* synthetic */ void getStartOffsetInclusive$annotations() {
    }

    public static /* synthetic */ void getStartTimeSeconds$annotations() {
    }

    public static /* synthetic */ void getText$annotations() {
    }

    public static /* synthetic */ void getUpdatedAtUnix$annotations() {
    }

    public BodyCreateBookmarkBookmarksReadIdBookmarkPost(long j4, long j10, String str, long j11, long j12, String str2, Integer num, Double d10, Double d11) {
        str.getClass();
        this.startOffsetInclusive = j4;
        this.endOffsetExclusive = j10;
        this.text = str;
        this.createdAtUnix = j11;
        this.updatedAtUnix = j12;
        this.note = str2;
        this.chapterIndex = num;
        this.startTimeSeconds = d10;
        this.endTimeSeconds = d11;
    }

    public /* synthetic */ BodyCreateBookmarkBookmarksReadIdBookmarkPost(long j4, long j10, String str, long j11, long j12, String str2, Integer num, Double d10, Double d11, int i10, f fVar) {
        this(j4, j10, str, j11, j12, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? null : d10, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : d11);
    }
}
