package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/ReferralResult;", "", "hoursAllocated", "", "subscriptionMonths", "<init>", "(JLjava/lang/Long;)V", "getHoursAllocated", "()J", "getSubscriptionMonths", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(JLjava/lang/Long;)Lio/elevenlabs/domain/model/ReferralResult;", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReferralResult {
    private final long hoursAllocated;
    private final Long subscriptionMonths;

    public ReferralResult(long j4, Long l4) {
        this.hoursAllocated = j4;
        this.subscriptionMonths = l4;
    }

    public static /* synthetic */ ReferralResult copy$default(ReferralResult referralResult, long j4, Long l4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j4 = referralResult.hoursAllocated;
        }
        if ((i10 & 2) != 0) {
            l4 = referralResult.subscriptionMonths;
        }
        return referralResult.copy(j4, l4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getHoursAllocated() {
        return this.hoursAllocated;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getSubscriptionMonths() {
        return this.subscriptionMonths;
    }

    public final ReferralResult copy(long hoursAllocated, Long subscriptionMonths) {
        return new ReferralResult(hoursAllocated, subscriptionMonths);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralResult)) {
            return false;
        }
        ReferralResult referralResult = (ReferralResult) other;
        if (this.hoursAllocated == referralResult.hoursAllocated && m.c(this.subscriptionMonths, referralResult.subscriptionMonths)) {
            return true;
        }
        return false;
    }

    public final long getHoursAllocated() {
        return this.hoursAllocated;
    }

    public final Long getSubscriptionMonths() {
        return this.subscriptionMonths;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.hoursAllocated) * 31;
        Long l4 = this.subscriptionMonths;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ReferralResult(hoursAllocated=" + this.hoursAllocated + ", subscriptionMonths=" + this.subscriptionMonths + Separators.RPAREN;
    }
}
