package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus;", "", "Downloaded", "Downloading", "NotDownloaded", "Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus$Downloaded;", "Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus$Downloading;", "Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus$NotDownloaded;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ChapterOfflineDownloadStatus {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus$Downloaded;", "Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Downloaded implements ChapterOfflineDownloadStatus {
        public static final Downloaded INSTANCE = new Downloaded();

        private Downloaded() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof Downloaded)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -13351467;
        }

        public String toString() {
            return "Downloaded";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus$Downloading;", "Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus;", "progressPercent", "", "<init>", "(I)V", "getProgressPercent", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Downloading implements ChapterOfflineDownloadStatus {
        private final int progressPercent;

        public Downloading(int i10) {
            this.progressPercent = i10;
        }

        public static /* synthetic */ Downloading copy$default(Downloading downloading, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = downloading.progressPercent;
            }
            return downloading.copy(i10);
        }

        /* renamed from: component1, reason: from getter */
        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public final Downloading copy(int progressPercent) {
            return new Downloading(progressPercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Downloading) && this.progressPercent == ((Downloading) other).progressPercent) {
                return true;
            }
            return false;
        }

        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public int hashCode() {
            return Integer.hashCode(this.progressPercent);
        }

        public String toString() {
            return b.j(this.progressPercent, "Downloading(progressPercent=", Separators.RPAREN);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus$NotDownloaded;", "Lio/elevenlabs/domain/model/ChapterOfflineDownloadStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class NotDownloaded implements ChapterOfflineDownloadStatus {
        public static final NotDownloaded INSTANCE = new NotDownloaded();

        private NotDownloaded() {
        }

        public boolean equals(Object other) {
            if (this == other || (other instanceof NotDownloaded)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1674996500;
        }

        public String toString() {
            return "NotDownloaded";
        }
    }
}
