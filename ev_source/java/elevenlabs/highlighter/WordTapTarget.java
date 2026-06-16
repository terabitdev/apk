package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/highlighter/WordTapTarget;", "", "charOffset", "", "timestampSeconds", "", "audioFileNumber", "", "<init>", "(JLjava/lang/Double;Ljava/lang/String;)V", "getCharOffset", "()J", "getTimestampSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAudioFileNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(JLjava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/highlighter/WordTapTarget;", "equals", "", "other", "hashCode", "", "toString", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class WordTapTarget {
    public static final int $stable = 0;
    private final String audioFileNumber;
    private final long charOffset;
    private final Double timestampSeconds;

    public WordTapTarget(long j4, Double d10, String str) {
        this.charOffset = j4;
        this.timestampSeconds = d10;
        this.audioFileNumber = str;
    }

    public static /* synthetic */ WordTapTarget copy$default(WordTapTarget wordTapTarget, long j4, Double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = wordTapTarget.charOffset;
        }
        if ((i10 & 2) != 0) {
            d10 = wordTapTarget.timestampSeconds;
        }
        if ((i10 & 4) != 0) {
            str = wordTapTarget.audioFileNumber;
        }
        return wordTapTarget.copy(j4, d10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCharOffset() {
        return this.charOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getTimestampSeconds() {
        return this.timestampSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final WordTapTarget copy(long charOffset, Double timestampSeconds, String audioFileNumber) {
        return new WordTapTarget(charOffset, timestampSeconds, audioFileNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WordTapTarget)) {
            return false;
        }
        WordTapTarget wordTapTarget = (WordTapTarget) other;
        if (this.charOffset == wordTapTarget.charOffset && kotlin.jvm.internal.m.c(this.timestampSeconds, wordTapTarget.timestampSeconds) && kotlin.jvm.internal.m.c(this.audioFileNumber, wordTapTarget.audioFileNumber)) {
            return true;
        }
        return false;
    }

    public final String getAudioFileNumber() {
        return this.audioFileNumber;
    }

    public final long getCharOffset() {
        return this.charOffset;
    }

    public final Double getTimestampSeconds() {
        return this.timestampSeconds;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.charOffset) * 31;
        Double d10 = this.timestampSeconds;
        int i10 = 0;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        String str = this.audioFileNumber;
        if (str != null) {
            i10 = str.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        long j4 = this.charOffset;
        Double d10 = this.timestampSeconds;
        String str = this.audioFileNumber;
        StringBuilder sb = new StringBuilder("WordTapTarget(charOffset=");
        sb.append(j4);
        sb.append(", timestampSeconds=");
        sb.append(d10);
        return z.h.d(sb, ", audioFileNumber=", str, Separators.RPAREN);
    }
}
