package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import j0.c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/domain/model/ListeningProgress;", "", "currentUnits", "", "totalUnits", "progressPercent", "", "isAtEnd", "", "isAudioOnly", "<init>", "(DDIZZ)V", "getCurrentUnits", "()D", "getTotalUnits", "getProgressPercent", "()I", "()Z", "remainingUnits", "getRemainingUnits", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ListeningProgress {
    private final double currentUnits;
    private final boolean isAtEnd;
    private final boolean isAudioOnly;
    private final int progressPercent;
    private final double totalUnits;

    public ListeningProgress(double d10, double d11, int i10, boolean z6, boolean z10) {
        this.currentUnits = d10;
        this.totalUnits = d11;
        this.progressPercent = i10;
        this.isAtEnd = z6;
        this.isAudioOnly = z10;
    }

    public static /* synthetic */ ListeningProgress copy$default(ListeningProgress listeningProgress, double d10, double d11, int i10, boolean z6, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d10 = listeningProgress.currentUnits;
        }
        double d12 = d10;
        if ((i11 & 2) != 0) {
            d11 = listeningProgress.totalUnits;
        }
        double d13 = d11;
        if ((i11 & 4) != 0) {
            i10 = listeningProgress.progressPercent;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z6 = listeningProgress.isAtEnd;
        }
        boolean z11 = z6;
        if ((i11 & 16) != 0) {
            z10 = listeningProgress.isAudioOnly;
        }
        return listeningProgress.copy(d12, d13, i12, z11, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final double getCurrentUnits() {
        return this.currentUnits;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTotalUnits() {
        return this.totalUnits;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProgressPercent() {
        return this.progressPercent;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAtEnd() {
        return this.isAtEnd;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAudioOnly() {
        return this.isAudioOnly;
    }

    public final ListeningProgress copy(double currentUnits, double totalUnits, int progressPercent, boolean isAtEnd, boolean isAudioOnly) {
        return new ListeningProgress(currentUnits, totalUnits, progressPercent, isAtEnd, isAudioOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListeningProgress)) {
            return false;
        }
        ListeningProgress listeningProgress = (ListeningProgress) other;
        if (Double.compare(this.currentUnits, listeningProgress.currentUnits) == 0 && Double.compare(this.totalUnits, listeningProgress.totalUnits) == 0 && this.progressPercent == listeningProgress.progressPercent && this.isAtEnd == listeningProgress.isAtEnd && this.isAudioOnly == listeningProgress.isAudioOnly) {
            return true;
        }
        return false;
    }

    public final double getCurrentUnits() {
        return this.currentUnits;
    }

    public final int getProgressPercent() {
        return this.progressPercent;
    }

    public final double getRemainingUnits() {
        double d10 = this.totalUnits - this.currentUnits;
        if (d10 < 0.0d) {
            return 0.0d;
        }
        return d10;
    }

    public final double getTotalUnits() {
        return this.totalUnits;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAudioOnly) + b.f(c.b(this.progressPercent, n.c(Double.hashCode(this.currentUnits) * 31, 31, this.totalUnits), 31), 31, this.isAtEnd);
    }

    public final boolean isAtEnd() {
        return this.isAtEnd;
    }

    public final boolean isAudioOnly() {
        return this.isAudioOnly;
    }

    public String toString() {
        return "ListeningProgress(currentUnits=" + this.currentUnits + ", totalUnits=" + this.totalUnits + ", progressPercent=" + this.progressPercent + ", isAtEnd=" + this.isAtEnd + ", isAudioOnly=" + this.isAudioOnly + Separators.RPAREN;
    }
}
