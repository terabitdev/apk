package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jb\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010(J\u0014\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u0006-"}, d2 = {"Lio/elevenlabs/domain/model/Chapter;", "", FirebaseAnalytics.Param.INDEX, "", "startingCharOffset", "", "chapterName", "", "charCount", "hasSummary", "", "wordCount", "durationSeconds", "", "audioFileNumber", "<init>", "(IJLjava/lang/String;JZJLjava/lang/Double;Ljava/lang/String;)V", "getIndex", "()I", "getStartingCharOffset", "()J", "getChapterName", "()Ljava/lang/String;", "getCharCount", "getHasSummary", "()Z", "getWordCount", "getDurationSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAudioFileNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IJLjava/lang/String;JZJLjava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/domain/model/Chapter;", "equals", "other", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Chapter {
    private final String audioFileNumber;
    private final String chapterName;
    private final long charCount;
    private final Double durationSeconds;
    private final boolean hasSummary;
    private final int index;
    private final long startingCharOffset;
    private final long wordCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Chapter(int i10, long j4, String str, long j10, boolean z6, long j11, Double d10, String str2, int i11, f fVar) {
        this(i10, j4, str, j10, z6, j11, d10, r13);
        String str3;
        d10 = (i11 & 64) != 0 ? null : d10;
        if ((i11 & 128) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
    }

    public static /* synthetic */ Chapter copy$default(Chapter chapter, int i10, long j4, String str, long j10, boolean z6, long j11, Double d10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = chapter.index;
        }
        if ((i11 & 2) != 0) {
            j4 = chapter.startingCharOffset;
        }
        if ((i11 & 4) != 0) {
            str = chapter.chapterName;
        }
        if ((i11 & 8) != 0) {
            j10 = chapter.charCount;
        }
        if ((i11 & 16) != 0) {
            z6 = chapter.hasSummary;
        }
        if ((i11 & 32) != 0) {
            j11 = chapter.wordCount;
        }
        if ((i11 & 64) != 0) {
            d10 = chapter.durationSeconds;
        }
        if ((i11 & 128) != 0) {
            str2 = chapter.audioFileNumber;
        }
        boolean z10 = z6;
        String str3 = str;
        return chapter.copy(i10, j4, str3, j10, z10, j11, d10, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartingCharOffset() {
        return this.startingCharOffset;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChapterName() {
        return this.chapterName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCharCount() {
        return this.charCount;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasSummary() {
        return this.hasSummary;
    }

    /* renamed from: component6, reason: from getter */
    public final long getWordCount() {
        return this.wordCount;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getDurationSeconds() {
        return this.durationSeconds;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final Chapter copy(int r13, long startingCharOffset, String chapterName, long charCount, boolean hasSummary, long wordCount, Double durationSeconds, String audioFileNumber) {
        chapterName.getClass();
        return new Chapter(r13, startingCharOffset, chapterName, charCount, hasSummary, wordCount, durationSeconds, audioFileNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Chapter)) {
            return false;
        }
        Chapter chapter = (Chapter) other;
        if (this.index == chapter.index && this.startingCharOffset == chapter.startingCharOffset && m.c(this.chapterName, chapter.chapterName) && this.charCount == chapter.charCount && this.hasSummary == chapter.hasSummary && this.wordCount == chapter.wordCount && m.c(this.durationSeconds, chapter.durationSeconds) && m.c(this.audioFileNumber, chapter.audioFileNumber)) {
            return true;
        }
        return false;
    }

    public final String getAudioFileNumber() {
        return this.audioFileNumber;
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

    public final boolean getHasSummary() {
        return this.hasSummary;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getStartingCharOffset() {
        return this.startingCharOffset;
    }

    public final long getWordCount() {
        return this.wordCount;
    }

    public int hashCode() {
        int hashCode;
        int g10 = b.g(this.wordCount, b.f(b.g(this.charCount, c.c(b.g(this.startingCharOffset, Integer.hashCode(this.index) * 31, 31), 31, this.chapterName), 31), 31, this.hasSummary), 31);
        Double d10 = this.durationSeconds;
        int i10 = 0;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        String str = this.audioFileNumber;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        int i10 = this.index;
        long j4 = this.startingCharOffset;
        String str = this.chapterName;
        long j10 = this.charCount;
        boolean z6 = this.hasSummary;
        long j11 = this.wordCount;
        Double d10 = this.durationSeconds;
        String str2 = this.audioFileNumber;
        StringBuilder sb = new StringBuilder("Chapter(index=");
        sb.append(i10);
        sb.append(", startingCharOffset=");
        sb.append(j4);
        defpackage.f.w(sb, ", chapterName=", str, ", charCount=");
        sb.append(j10);
        sb.append(", hasSummary=");
        sb.append(z6);
        b.w(sb, ", wordCount=", j11, ", durationSeconds=");
        sb.append(d10);
        sb.append(", audioFileNumber=");
        sb.append(str2);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public Chapter(int i10, long j4, String str, long j10, boolean z6, long j11, Double d10, String str2) {
        str.getClass();
        this.index = i10;
        this.startingCharOffset = j4;
        this.chapterName = str;
        this.charCount = j10;
        this.hasSummary = z6;
        this.wordCount = j11;
        this.durationSeconds = d10;
        this.audioFileNumber = str2;
    }
}
