package io.elevenlabs.player;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/player/CreateBookmarkResult;", "", "Success", "NotSupported", "Failed", "FailureReason", "Lio/elevenlabs/player/CreateBookmarkResult$Failed;", "Lio/elevenlabs/player/CreateBookmarkResult$NotSupported;", "Lio/elevenlabs/player/CreateBookmarkResult$Success;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface CreateBookmarkResult {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/player/CreateBookmarkResult$Failed;", "Lio/elevenlabs/player/CreateBookmarkResult;", "reason", "Lio/elevenlabs/player/CreateBookmarkResult$FailureReason;", "<init>", "(Lio/elevenlabs/player/CreateBookmarkResult$FailureReason;)V", "getReason", "()Lio/elevenlabs/player/CreateBookmarkResult$FailureReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Failed implements CreateBookmarkResult {
        private final FailureReason reason;

        public Failed(FailureReason failureReason) {
            failureReason.getClass();
            this.reason = failureReason;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, FailureReason failureReason, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                failureReason = failed.reason;
            }
            return failed.copy(failureReason);
        }

        /* renamed from: component1, reason: from getter */
        public final FailureReason getReason() {
            return this.reason;
        }

        public final Failed copy(FailureReason reason) {
            reason.getClass();
            return new Failed(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Failed) && this.reason == ((Failed) other).reason) {
                return true;
            }
            return false;
        }

        public final FailureReason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Failed(reason=" + this.reason + Separators.RPAREN;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/player/CreateBookmarkResult$FailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "ReadUnavailable", "OptimizedReadUnavailable", "ChapterIndexEmpty", "ChapterContentUnavailable", "OffsetLookupFailed", "HtmlUnparseable", "NoMatchingSpan", "BookmarkPersistFailed", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class FailureReason {
        private static final /* synthetic */ zn.a $ENTRIES;
        private static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason ReadUnavailable = new FailureReason("ReadUnavailable", 0);
        public static final FailureReason OptimizedReadUnavailable = new FailureReason("OptimizedReadUnavailable", 1);
        public static final FailureReason ChapterIndexEmpty = new FailureReason("ChapterIndexEmpty", 2);
        public static final FailureReason ChapterContentUnavailable = new FailureReason("ChapterContentUnavailable", 3);
        public static final FailureReason OffsetLookupFailed = new FailureReason("OffsetLookupFailed", 4);
        public static final FailureReason HtmlUnparseable = new FailureReason("HtmlUnparseable", 5);
        public static final FailureReason NoMatchingSpan = new FailureReason("NoMatchingSpan", 6);
        public static final FailureReason BookmarkPersistFailed = new FailureReason("BookmarkPersistFailed", 7);

        private static final /* synthetic */ FailureReason[] $values() {
            return new FailureReason[]{ReadUnavailable, OptimizedReadUnavailable, ChapterIndexEmpty, ChapterContentUnavailable, OffsetLookupFailed, HtmlUnparseable, NoMatchingSpan, BookmarkPersistFailed};
        }

        static {
            FailureReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private FailureReason(String str, int i10) {
        }

        public static zn.a getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/player/CreateBookmarkResult$NotSupported;", "Lio/elevenlabs/player/CreateBookmarkResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class NotSupported implements CreateBookmarkResult {
        public static final NotSupported INSTANCE = new NotSupported();

        private NotSupported() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof NotSupported)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1728854220;
        }

        public String toString() {
            return "NotSupported";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/player/CreateBookmarkResult$Success;", "Lio/elevenlabs/player/CreateBookmarkResult;", "bookmarkId", "", "<init>", "(Ljava/lang/String;)V", "getBookmarkId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Success implements CreateBookmarkResult {
        private final String bookmarkId;

        public Success(String str) {
            str.getClass();
            this.bookmarkId = str;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.bookmarkId;
            }
            return success.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBookmarkId() {
            return this.bookmarkId;
        }

        public final Success copy(String bookmarkId) {
            bookmarkId.getClass();
            return new Success(bookmarkId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Success) && m.c(this.bookmarkId, ((Success) other).bookmarkId)) {
                return true;
            }
            return false;
        }

        public final String getBookmarkId() {
            return this.bookmarkId;
        }

        public int hashCode() {
            return this.bookmarkId.hashCode();
        }

        public String toString() {
            return defpackage.f.C("Success(bookmarkId=", this.bookmarkId, Separators.RPAREN);
        }
    }
}
