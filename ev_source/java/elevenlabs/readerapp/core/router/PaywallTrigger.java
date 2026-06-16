package io.elevenlabs.readerapp.core.router;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\n¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/readerapp/core/router/PaywallTrigger;", "", "canUpgrade", "", "isFreeUser", "shouldShowPaywall", "isWinBackEligible", "<init>", "(ZZZZ)V", "getCanUpgrade", "()Z", "getShouldShowPaywall", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class PaywallTrigger {
    private final boolean canUpgrade;
    private final boolean isFreeUser;
    private final boolean isWinBackEligible;
    private final boolean shouldShowPaywall;

    public PaywallTrigger(boolean z6, boolean z10, boolean z11, boolean z12) {
        this.canUpgrade = z6;
        this.isFreeUser = z10;
        this.shouldShowPaywall = z11;
        this.isWinBackEligible = z12;
    }

    public static /* synthetic */ PaywallTrigger copy$default(PaywallTrigger paywallTrigger, boolean z6, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = paywallTrigger.canUpgrade;
        }
        if ((i10 & 2) != 0) {
            z10 = paywallTrigger.isFreeUser;
        }
        if ((i10 & 4) != 0) {
            z11 = paywallTrigger.shouldShowPaywall;
        }
        if ((i10 & 8) != 0) {
            z12 = paywallTrigger.isWinBackEligible;
        }
        return paywallTrigger.copy(z6, z10, z11, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFreeUser() {
        return this.isFreeUser;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowPaywall() {
        return this.shouldShowPaywall;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsWinBackEligible() {
        return this.isWinBackEligible;
    }

    public final PaywallTrigger copy(boolean canUpgrade, boolean isFreeUser, boolean shouldShowPaywall, boolean isWinBackEligible) {
        return new PaywallTrigger(canUpgrade, isFreeUser, shouldShowPaywall, isWinBackEligible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallTrigger)) {
            return false;
        }
        PaywallTrigger paywallTrigger = (PaywallTrigger) other;
        if (this.canUpgrade == paywallTrigger.canUpgrade && this.isFreeUser == paywallTrigger.isFreeUser && this.shouldShowPaywall == paywallTrigger.shouldShowPaywall && this.isWinBackEligible == paywallTrigger.isWinBackEligible) {
            return true;
        }
        return false;
    }

    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final boolean getShouldShowPaywall() {
        return this.shouldShowPaywall;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isWinBackEligible) + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(Boolean.hashCode(this.canUpgrade) * 31, 31, this.isFreeUser), 31, this.shouldShowPaywall);
    }

    public final boolean isFreeUser() {
        return this.isFreeUser;
    }

    public final boolean isWinBackEligible() {
        return this.isWinBackEligible;
    }

    public String toString() {
        return "PaywallTrigger(canUpgrade=" + this.canUpgrade + ", isFreeUser=" + this.isFreeUser + ", shouldShowPaywall=" + this.shouldShowPaywall + ", isWinBackEligible=" + this.isWinBackEligible + Separators.RPAREN;
    }
}
