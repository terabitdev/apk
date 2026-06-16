package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import j0.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lio/elevenlabs/domain/model/OfflineChapterData;", "", "chapterIndex", "", "status", "Lio/elevenlabs/domain/model/OfflineChapterStatus;", "progressPercent", "createdAtUnix", "", "expiresAtUnix", "<init>", "(ILio/elevenlabs/domain/model/OfflineChapterStatus;IJJ)V", "getChapterIndex", "()I", "getStatus", "()Lio/elevenlabs/domain/model/OfflineChapterStatus;", "getProgressPercent", "getCreatedAtUnix", "()J", "getExpiresAtUnix", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class OfflineChapterData {
    private final int chapterIndex;
    private final long createdAtUnix;
    private final long expiresAtUnix;
    private final int progressPercent;
    private final OfflineChapterStatus status;

    public OfflineChapterData(int i10, OfflineChapterStatus offlineChapterStatus, int i11, long j4, long j10) {
        offlineChapterStatus.getClass();
        this.chapterIndex = i10;
        this.status = offlineChapterStatus;
        this.progressPercent = i11;
        this.createdAtUnix = j4;
        this.expiresAtUnix = j10;
    }

    public static /* synthetic */ OfflineChapterData copy$default(OfflineChapterData offlineChapterData, int i10, OfflineChapterStatus offlineChapterStatus, int i11, long j4, long j10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = offlineChapterData.chapterIndex;
        }
        if ((i12 & 2) != 0) {
            offlineChapterStatus = offlineChapterData.status;
        }
        if ((i12 & 4) != 0) {
            i11 = offlineChapterData.progressPercent;
        }
        if ((i12 & 8) != 0) {
            j4 = offlineChapterData.createdAtUnix;
        }
        if ((i12 & 16) != 0) {
            j10 = offlineChapterData.expiresAtUnix;
        }
        long j11 = j10;
        int i13 = i11;
        return offlineChapterData.copy(i10, offlineChapterStatus, i13, j4, j11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final OfflineChapterStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProgressPercent() {
        return this.progressPercent;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    /* renamed from: component5, reason: from getter */
    public final long getExpiresAtUnix() {
        return this.expiresAtUnix;
    }

    public final OfflineChapterData copy(int chapterIndex, OfflineChapterStatus status, int progressPercent, long createdAtUnix, long expiresAtUnix) {
        status.getClass();
        return new OfflineChapterData(chapterIndex, status, progressPercent, createdAtUnix, expiresAtUnix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineChapterData)) {
            return false;
        }
        OfflineChapterData offlineChapterData = (OfflineChapterData) other;
        if (this.chapterIndex == offlineChapterData.chapterIndex && this.status == offlineChapterData.status && this.progressPercent == offlineChapterData.progressPercent && this.createdAtUnix == offlineChapterData.createdAtUnix && this.expiresAtUnix == offlineChapterData.expiresAtUnix) {
            return true;
        }
        return false;
    }

    public final int getChapterIndex() {
        return this.chapterIndex;
    }

    public final long getCreatedAtUnix() {
        return this.createdAtUnix;
    }

    public final long getExpiresAtUnix() {
        return this.expiresAtUnix;
    }

    public final int getProgressPercent() {
        return this.progressPercent;
    }

    public final OfflineChapterStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Long.hashCode(this.expiresAtUnix) + b.g(this.createdAtUnix, c.b(this.progressPercent, (this.status.hashCode() + (Integer.hashCode(this.chapterIndex) * 31)) * 31, 31), 31);
    }

    public String toString() {
        return "OfflineChapterData(chapterIndex=" + this.chapterIndex + ", status=" + this.status + ", progressPercent=" + this.progressPercent + ", createdAtUnix=" + this.createdAtUnix + ", expiresAtUnix=" + this.expiresAtUnix + Separators.RPAREN;
    }
}
