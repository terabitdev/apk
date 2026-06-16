package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition;", "", "Tts", "AudioOnly", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition$AudioOnly;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition$Tts;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface PlaybackPosition {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition$AudioOnly;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition;", "seconds", "", "<init>", "(D)V", "getSeconds", "()D", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class AudioOnly implements PlaybackPosition {
        public static final int $stable = 0;
        private final double seconds;

        public AudioOnly(double d10) {
            this.seconds = d10;
        }

        public static /* synthetic */ AudioOnly copy$default(AudioOnly audioOnly, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = audioOnly.seconds;
            }
            return audioOnly.copy(d10);
        }

        /* renamed from: component1, reason: from getter */
        public final double getSeconds() {
            return this.seconds;
        }

        public final AudioOnly copy(double seconds) {
            return new AudioOnly(seconds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof AudioOnly) && Double.compare(this.seconds, ((AudioOnly) other).seconds) == 0) {
                return true;
            }
            return false;
        }

        public final double getSeconds() {
            return this.seconds;
        }

        public int hashCode() {
            return Double.hashCode(this.seconds);
        }

        public String toString() {
            return "AudioOnly(seconds=" + this.seconds + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition$Tts;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlaybackPosition;", "offset", "", "<init>", "(J)V", "getOffset", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Tts implements PlaybackPosition {
        public static final int $stable = 0;
        private final long offset;

        public Tts(long j4) {
            this.offset = j4;
        }

        public static /* synthetic */ Tts copy$default(Tts tts, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = tts.offset;
            }
            return tts.copy(j4);
        }

        /* renamed from: component1, reason: from getter */
        public final long getOffset() {
            return this.offset;
        }

        public final Tts copy(long offset) {
            return new Tts(offset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Tts) && this.offset == ((Tts) other).offset) {
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
            return android.gov.nist.javax.sip.header.a.k("Tts(offset=", this.offset, Separators.RPAREN);
        }
    }
}
