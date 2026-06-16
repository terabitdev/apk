package io.elevenlabs.highlighter;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/highlighter/HighlighterPosition;", "", "Character", "Time", "Lio/elevenlabs/highlighter/HighlighterPosition$Character;", "Lio/elevenlabs/highlighter/HighlighterPosition$Time;", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface HighlighterPosition {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/highlighter/HighlighterPosition$Character;", "Lio/elevenlabs/highlighter/HighlighterPosition;", "offset", "", "<init>", "(J)V", "getOffset", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Character implements HighlighterPosition {
        public static final int $stable = 0;
        private final long offset;

        public Character(long j4) {
            this.offset = j4;
        }

        public static /* synthetic */ Character copy$default(Character character, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = character.offset;
            }
            return character.copy(j4);
        }

        /* renamed from: component1, reason: from getter */
        public final long getOffset() {
            return this.offset;
        }

        public final Character copy(long offset) {
            return new Character(offset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Character) && this.offset == ((Character) other).offset) {
                return true;
            }
            return false;
        }

        public final long getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return Long.hashCode(this.offset);
        }

        public String toString() {
            return android.gov.nist.javax.sip.header.a.k("Character(offset=", this.offset, Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/highlighter/HighlighterPosition$Time;", "Lio/elevenlabs/highlighter/HighlighterPosition;", "audioFileNumber", "", "seconds", "", "<init>", "(Ljava/lang/String;D)V", "getAudioFileNumber", "()Ljava/lang/String;", "getSeconds", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "highlighter_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Time implements HighlighterPosition {
        public static final int $stable = 0;
        private final String audioFileNumber;
        private final double seconds;

        public Time(String str, double d10) {
            str.getClass();
            this.audioFileNumber = str;
            this.seconds = d10;
        }

        public static /* synthetic */ Time copy$default(Time time, String str, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = time.audioFileNumber;
            }
            if ((i10 & 2) != 0) {
                d10 = time.seconds;
            }
            return time.copy(str, d10);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAudioFileNumber() {
            return this.audioFileNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final double getSeconds() {
            return this.seconds;
        }

        public final Time copy(String audioFileNumber, double seconds) {
            audioFileNumber.getClass();
            return new Time(audioFileNumber, seconds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Time)) {
                return false;
            }
            Time time = (Time) other;
            if (kotlin.jvm.internal.m.c(this.audioFileNumber, time.audioFileNumber) && Double.compare(this.seconds, time.seconds) == 0) {
                return true;
            }
            return false;
        }

        public final String getAudioFileNumber() {
            return this.audioFileNumber;
        }

        public final double getSeconds() {
            return this.seconds;
        }

        public int hashCode() {
            return Double.hashCode(this.seconds) + (this.audioFileNumber.hashCode() * 31);
        }

        public String toString() {
            return "Time(audioFileNumber=" + this.audioFileNumber + ", seconds=" + this.seconds + Separators.RPAREN;
        }
    }
}
