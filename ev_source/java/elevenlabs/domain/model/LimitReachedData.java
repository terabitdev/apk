package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.a;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/model/LimitReachedData;", "", "message", "", "limit", "", "canUpgrade", "", "<init>", "(Ljava/lang/String;IZ)V", "getMessage", "()Ljava/lang/String;", "getLimit", "()I", "getCanUpgrade", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class LimitReachedData {
    private final boolean canUpgrade;
    private final int limit;
    private final String message;

    public LimitReachedData(String str, int i10, boolean z6) {
        str.getClass();
        this.message = str;
        this.limit = i10;
        this.canUpgrade = z6;
    }

    public static /* synthetic */ LimitReachedData copy$default(LimitReachedData limitReachedData, String str, int i10, boolean z6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = limitReachedData.message;
        }
        if ((i11 & 2) != 0) {
            i10 = limitReachedData.limit;
        }
        if ((i11 & 4) != 0) {
            z6 = limitReachedData.canUpgrade;
        }
        return limitReachedData.copy(str, i10, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final LimitReachedData copy(String message, int limit, boolean canUpgrade) {
        message.getClass();
        return new LimitReachedData(message, limit, canUpgrade);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitReachedData)) {
            return false;
        }
        LimitReachedData limitReachedData = (LimitReachedData) other;
        if (m.c(this.message, limitReachedData.message) && this.limit == limitReachedData.limit && this.canUpgrade == limitReachedData.canUpgrade) {
            return true;
        }
        return false;
    }

    public final boolean getCanUpgrade() {
        return this.canUpgrade;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Boolean.hashCode(this.canUpgrade) + c.b(this.limit, this.message.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.message;
        int i10 = this.limit;
        return n.j(Separators.RPAREN, a.o(i10, "LimitReachedData(message=", str, ", limit=", ", canUpgrade="), this.canUpgrade);
    }
}
