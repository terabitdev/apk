package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lio/elevenlabs/highlighter/WordAnnotation;", "", "start", "", "end", "c", "", "ts", "", "audioFileNumber", "", "<init>", "(IIJLjava/lang/Double;Ljava/lang/String;)V", "getStart", "()I", "getEnd", "getC", "()J", "getTs", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAudioFileNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(IIJLjava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/highlighter/WordAnnotation;", "equals", "", "other", "hashCode", "toString", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class WordAnnotation {
    public static final int $stable = 0;
    private final String audioFileNumber;
    private final long c;
    private final int end;
    private final int start;
    private final Double ts;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WordAnnotation(int i10, int i11, long j4, Double d10, String str, int i12, kotlin.jvm.internal.f fVar) {
        this(i10, i11, j4, d10, r8);
        String str2;
        d10 = (i12 & 8) != 0 ? null : d10;
        if ((i12 & 16) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
    }

    public static /* synthetic */ WordAnnotation copy$default(WordAnnotation wordAnnotation, int i10, int i11, long j4, Double d10, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = wordAnnotation.start;
        }
        if ((i12 & 2) != 0) {
            i11 = wordAnnotation.end;
        }
        if ((i12 & 4) != 0) {
            j4 = wordAnnotation.c;
        }
        if ((i12 & 8) != 0) {
            d10 = wordAnnotation.ts;
        }
        if ((i12 & 16) != 0) {
            str = wordAnnotation.audioFileNumber;
        }
        long j10 = j4;
        return wordAnnotation.copy(i10, i11, j10, d10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: component3, reason: from getter */
    public final long getC() {
        return this.c;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getTs() {
        return this.ts;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final WordAnnotation copy(int start, int end, long c5, Double ts, String audioFileNumber) {
        return new WordAnnotation(start, end, c5, ts, audioFileNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WordAnnotation)) {
            return false;
        }
        WordAnnotation wordAnnotation = (WordAnnotation) other;
        if (this.start == wordAnnotation.start && this.end == wordAnnotation.end && this.c == wordAnnotation.c && kotlin.jvm.internal.m.c(this.ts, wordAnnotation.ts) && kotlin.jvm.internal.m.c(this.audioFileNumber, wordAnnotation.audioFileNumber)) {
            return true;
        }
        return false;
    }

    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final long getC() {
        return this.c;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final Double getTs() {
        return this.ts;
    }

    public int hashCode() {
        int hashCode;
        int g10 = com.google.android.gms.internal.play_billing.b.g(this.c, j0.c.b(this.end, Integer.hashCode(this.start) * 31, 31), 31);
        Double d10 = this.ts;
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
        int i10 = this.start;
        int i11 = this.end;
        long j4 = this.c;
        Double d10 = this.ts;
        String str = this.audioFileNumber;
        StringBuilder g10 = z.h.g("WordAnnotation(start=", i10, ", end=", i11, ", c=");
        g10.append(j4);
        g10.append(", ts=");
        g10.append(d10);
        return z.h.d(g10, ", audioFileNumber=", str, Separators.RPAREN);
    }

    public WordAnnotation(int i10, int i11, long j4, Double d10, String str) {
        this.start = i10;
        this.end = i11;
        this.c = j4;
        this.ts = d10;
        this.audioFileNumber = str;
    }
}
