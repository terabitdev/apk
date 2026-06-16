package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/BookmarkSeekTarget;", "", "ChapterRelative", "CharOffset", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/BookmarkSeekTarget$ChapterRelative;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/BookmarkSeekTarget$CharOffset;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface BookmarkSeekTarget {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/BookmarkSeekTarget$ChapterRelative;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/BookmarkSeekTarget;", "chapterIndex", "", "startTimeSeconds", "", "<init>", "(ID)V", "getChapterIndex", "()I", "getStartTimeSeconds", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class ChapterRelative implements BookmarkSeekTarget {
        public static final int $stable = 0;
        private final int chapterIndex;
        private final double startTimeSeconds;

        public ChapterRelative(int i10, double d10) {
            this.chapterIndex = i10;
            this.startTimeSeconds = d10;
        }

        public static /* synthetic */ ChapterRelative copy$default(ChapterRelative chapterRelative, int i10, double d10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = chapterRelative.chapterIndex;
            }
            if ((i11 & 2) != 0) {
                d10 = chapterRelative.startTimeSeconds;
            }
            return chapterRelative.copy(i10, d10);
        }

        /* renamed from: component1, reason: from getter */
        public final int getChapterIndex() {
            return this.chapterIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final double getStartTimeSeconds() {
            return this.startTimeSeconds;
        }

        public final ChapterRelative copy(int chapterIndex, double startTimeSeconds) {
            return new ChapterRelative(chapterIndex, startTimeSeconds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChapterRelative)) {
                return false;
            }
            ChapterRelative chapterRelative = (ChapterRelative) other;
            if (this.chapterIndex == chapterRelative.chapterIndex && Double.compare(this.startTimeSeconds, chapterRelative.startTimeSeconds) == 0) {
                return true;
            }
            return false;
        }

        public final int getChapterIndex() {
            return this.chapterIndex;
        }

        public final double getStartTimeSeconds() {
            return this.startTimeSeconds;
        }

        public int hashCode() {
            return Double.hashCode(this.startTimeSeconds) + (Integer.hashCode(this.chapterIndex) * 31);
        }

        public String toString() {
            return "ChapterRelative(chapterIndex=" + this.chapterIndex + ", startTimeSeconds=" + this.startTimeSeconds + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/BookmarkSeekTarget$CharOffset;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/BookmarkSeekTarget;", "offset", "", "<init>", "(J)V", "getOffset", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class CharOffset implements BookmarkSeekTarget {
        public static final int $stable = 0;
        private final long offset;

        public CharOffset(long j4) {
            this.offset = j4;
        }

        public static /* synthetic */ CharOffset copy$default(CharOffset charOffset, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = charOffset.offset;
            }
            return charOffset.copy(j4);
        }

        /* renamed from: component1, reason: from getter */
        public final long getOffset() {
            return this.offset;
        }

        public final CharOffset copy(long offset) {
            return new CharOffset(offset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof CharOffset) && this.offset == ((CharOffset) other).offset) {
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
            return android.gov.nist.javax.sip.header.a.k("CharOffset(offset=", this.offset, Separators.RPAREN);
        }
    }
}
