package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.g1;
import ur.r;
import ur.t0;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBe\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016Jh\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010\u0018R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b:\u00105\u001a\u0004\b9\u0010\u0018R \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b<\u00105\u001a\u0004\b;\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u00105\u001a\u0004\b>\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\bA\u00105\u001a\u0004\b@\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010B\u0012\u0004\bD\u00105\u001a\u0004\bC\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\bF\u00105\u001a\u0004\bE\u0010\u0016¨\u0006I"}, d2 = {"Lio/elevenlabs/data/model/ReadMetadataChapterDBModel;", "", "", "chapterName", "", "wordCount", "charCount", "startingCharOffset", "", "hasParsedHtml", "hasSummary", "", "durationSeconds", "fileNumber", "<init>", "(Ljava/lang/String;JJJLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;JJJLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Lur/c1;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Ljava/lang/Double;", "component8", "copy", "(Ljava/lang/String;JJJLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/data/model/ReadMetadataChapterDBModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/ReadMetadataChapterDBModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getChapterName", "getChapterName$annotations", "()V", "J", "getWordCount", "getWordCount$annotations", "getCharCount", "getCharCount$annotations", "getStartingCharOffset", "getStartingCharOffset$annotations", "Ljava/lang/Boolean;", "getHasParsedHtml", "getHasParsedHtml$annotations", "getHasSummary", "getHasSummary$annotations", "Ljava/lang/Double;", "getDurationSeconds", "getDurationSeconds$annotations", "getFileNumber", "getFileNumber$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReadMetadataChapterDBModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String chapterName;
    private final long charCount;
    private final Double durationSeconds;
    private final String fileNumber;
    private final Boolean hasParsedHtml;
    private final Boolean hasSummary;
    private final long startingCharOffset;
    private final long wordCount;

    public /* synthetic */ ReadMetadataChapterDBModel(int i10, String str, long j4, long j10, long j11, Boolean bool, Boolean bool2, Double d10, String str2, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.chapterName = str;
            this.wordCount = j4;
            this.charCount = j10;
            this.startingCharOffset = j11;
            if ((i10 & 16) == 0) {
                this.hasParsedHtml = Boolean.FALSE;
            } else {
                this.hasParsedHtml = bool;
            }
            if ((i10 & 32) == 0) {
                this.hasSummary = Boolean.FALSE;
            } else {
                this.hasSummary = bool2;
            }
            if ((i10 & 64) == 0) {
                this.durationSeconds = null;
            } else {
                this.durationSeconds = d10;
            }
            if ((i10 & 128) == 0) {
                this.fileNumber = null;
                return;
            } else {
                this.fileNumber = str2;
                return;
            }
        }
        t0.j(i10, 15, ReadMetadataChapterDBModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ ReadMetadataChapterDBModel copy$default(ReadMetadataChapterDBModel readMetadataChapterDBModel, String str, long j4, long j10, long j11, Boolean bool, Boolean bool2, Double d10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readMetadataChapterDBModel.chapterName;
        }
        if ((i10 & 2) != 0) {
            j4 = readMetadataChapterDBModel.wordCount;
        }
        if ((i10 & 4) != 0) {
            j10 = readMetadataChapterDBModel.charCount;
        }
        if ((i10 & 8) != 0) {
            j11 = readMetadataChapterDBModel.startingCharOffset;
        }
        if ((i10 & 16) != 0) {
            bool = readMetadataChapterDBModel.hasParsedHtml;
        }
        if ((i10 & 32) != 0) {
            bool2 = readMetadataChapterDBModel.hasSummary;
        }
        if ((i10 & 64) != 0) {
            d10 = readMetadataChapterDBModel.durationSeconds;
        }
        if ((i10 & 128) != 0) {
            str2 = readMetadataChapterDBModel.fileNumber;
        }
        long j12 = j11;
        long j13 = j10;
        return readMetadataChapterDBModel.copy(str, j4, j13, j12, bool, bool2, d10, str2);
    }

    public static final /* synthetic */ void write$Self$data_release(ReadMetadataChapterDBModel self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.chapterName);
        output.h0(serialDesc, 1, self.wordCount);
        output.h0(serialDesc, 2, self.charCount);
        output.h0(serialDesc, 3, self.startingCharOffset);
        if (output.C(serialDesc) || !m.c(self.hasParsedHtml, Boolean.FALSE)) {
            output.o(serialDesc, 4, ur.g.f34583a, self.hasParsedHtml);
        }
        if (output.C(serialDesc) || !m.c(self.hasSummary, Boolean.FALSE)) {
            output.o(serialDesc, 5, ur.g.f34583a, self.hasSummary);
        }
        if (output.C(serialDesc) || self.durationSeconds != null) {
            output.o(serialDesc, 6, r.f34640a, self.durationSeconds);
        }
        if (output.C(serialDesc) || self.fileNumber != null) {
            output.o(serialDesc, 7, g1.f34588a, self.fileNumber);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getChapterName() {
        return this.chapterName;
    }

    /* renamed from: component2, reason: from getter */
    public final long getWordCount() {
        return this.wordCount;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCharCount() {
        return this.charCount;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartingCharOffset() {
        return this.startingCharOffset;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasParsedHtml() {
        return this.hasParsedHtml;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getHasSummary() {
        return this.hasSummary;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getDurationSeconds() {
        return this.durationSeconds;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFileNumber() {
        return this.fileNumber;
    }

    public final ReadMetadataChapterDBModel copy(String chapterName, long wordCount, long charCount, long startingCharOffset, Boolean hasParsedHtml, Boolean hasSummary, Double durationSeconds, String fileNumber) {
        chapterName.getClass();
        return new ReadMetadataChapterDBModel(chapterName, wordCount, charCount, startingCharOffset, hasParsedHtml, hasSummary, durationSeconds, fileNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadMetadataChapterDBModel)) {
            return false;
        }
        ReadMetadataChapterDBModel readMetadataChapterDBModel = (ReadMetadataChapterDBModel) other;
        if (m.c(this.chapterName, readMetadataChapterDBModel.chapterName) && this.wordCount == readMetadataChapterDBModel.wordCount && this.charCount == readMetadataChapterDBModel.charCount && this.startingCharOffset == readMetadataChapterDBModel.startingCharOffset && m.c(this.hasParsedHtml, readMetadataChapterDBModel.hasParsedHtml) && m.c(this.hasSummary, readMetadataChapterDBModel.hasSummary) && m.c(this.durationSeconds, readMetadataChapterDBModel.durationSeconds) && m.c(this.fileNumber, readMetadataChapterDBModel.fileNumber)) {
            return true;
        }
        return false;
    }

    public final String getChapterName() {
        return this.chapterName;
    }

    public final long getCharCount() {
        return this.charCount;
    }

    public final Double getDurationSeconds() {
        return this.durationSeconds;
    }

    public final String getFileNumber() {
        return this.fileNumber;
    }

    public final Boolean getHasParsedHtml() {
        return this.hasParsedHtml;
    }

    public final Boolean getHasSummary() {
        return this.hasSummary;
    }

    public final long getStartingCharOffset() {
        return this.startingCharOffset;
    }

    public final long getWordCount() {
        return this.wordCount;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.startingCharOffset, com.google.android.gms.internal.play_billing.b.g(this.charCount, com.google.android.gms.internal.play_billing.b.g(this.wordCount, this.chapterName.hashCode() * 31, 31), 31), 31);
        Boolean bool = this.hasParsedHtml;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        Boolean bool2 = this.hasSummary;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        Double d10 = this.durationSeconds;
        if (d10 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d10.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str = this.fileNumber;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        String str = this.chapterName;
        long j4 = this.wordCount;
        long j10 = this.charCount;
        long j11 = this.startingCharOffset;
        Boolean bool = this.hasParsedHtml;
        Boolean bool2 = this.hasSummary;
        Double d10 = this.durationSeconds;
        String str2 = this.fileNumber;
        StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("ReadMetadataChapterDBModel(chapterName=", str, j4, ", wordCount=");
        com.google.android.gms.internal.play_billing.b.w(r10, ", charCount=", j10, ", startingCharOffset=");
        r10.append(j11);
        r10.append(", hasParsedHtml=");
        r10.append(bool);
        r10.append(", hasSummary=");
        r10.append(bool2);
        r10.append(", durationSeconds=");
        r10.append(d10);
        return h.d(r10, ", fileNumber=", str2, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/ReadMetadataChapterDBModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/ReadMetadataChapterDBModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReadMetadataChapterDBModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getChapterName$annotations() {
    }

    public static /* synthetic */ void getCharCount$annotations() {
    }

    public static /* synthetic */ void getDurationSeconds$annotations() {
    }

    public static /* synthetic */ void getFileNumber$annotations() {
    }

    public static /* synthetic */ void getHasParsedHtml$annotations() {
    }

    public static /* synthetic */ void getHasSummary$annotations() {
    }

    public static /* synthetic */ void getStartingCharOffset$annotations() {
    }

    public static /* synthetic */ void getWordCount$annotations() {
    }

    public ReadMetadataChapterDBModel(String str, long j4, long j10, long j11, Boolean bool, Boolean bool2, Double d10, String str2) {
        str.getClass();
        this.chapterName = str;
        this.wordCount = j4;
        this.charCount = j10;
        this.startingCharOffset = j11;
        this.hasParsedHtml = bool;
        this.hasSummary = bool2;
        this.durationSeconds = d10;
        this.fileNumber = str2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ReadMetadataChapterDBModel(java.lang.String r15, long r16, long r18, long r20, java.lang.Boolean r22, java.lang.Boolean r23, java.lang.Double r24, java.lang.String r25, int r26, kotlin.jvm.internal.f r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 16
            if (r1 == 0) goto La
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r10 = r1
            goto Lc
        La:
            r10 = r22
        Lc:
            r1 = r0 & 32
            if (r1 == 0) goto L14
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11 = r1
            goto L16
        L14:
            r11 = r23
        L16:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L1d
            r12 = r2
            goto L1f
        L1d:
            r12 = r24
        L1f:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2d
            r13 = r2
            r3 = r15
            r4 = r16
            r6 = r18
            r8 = r20
            r2 = r14
            goto L37
        L2d:
            r13 = r25
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r8 = r20
        L37:
            r2.<init>(r3, r4, r6, r8, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.model.ReadMetadataChapterDBModel.<init>(java.lang.String, long, long, long, java.lang.Boolean, java.lang.Boolean, java.lang.Double, java.lang.String, int, kotlin.jvm.internal.f):void");
    }
}
