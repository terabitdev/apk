package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/RateTitleState;", "", "readId", "", "userRating", "", "isLoading", "", "close", "<init>", "(Ljava/lang/String;Ljava/lang/Long;ZZ)V", "getReadId", "()Ljava/lang/String;", "getUserRating", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getClose", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;ZZ)Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/RateTitleState;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class RateTitleState {
    public static final int $stable = 0;
    private final boolean close;
    private final boolean isLoading;
    private final String readId;
    private final Long userRating;

    public /* synthetic */ RateTitleState(String str, Long l4, boolean z6, boolean z10, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l4, (i10 & 4) != 0 ? false : z6, (i10 & 8) != 0 ? false : z10);
    }

    public static /* synthetic */ RateTitleState copy$default(RateTitleState rateTitleState, String str, Long l4, boolean z6, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rateTitleState.readId;
        }
        if ((i10 & 2) != 0) {
            l4 = rateTitleState.userRating;
        }
        if ((i10 & 4) != 0) {
            z6 = rateTitleState.isLoading;
        }
        if ((i10 & 8) != 0) {
            z10 = rateTitleState.close;
        }
        return rateTitleState.copy(str, l4, z6, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getUserRating() {
        return this.userRating;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getClose() {
        return this.close;
    }

    public final RateTitleState copy(String readId, Long userRating, boolean isLoading, boolean close) {
        return new RateTitleState(readId, userRating, isLoading, close);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateTitleState)) {
            return false;
        }
        RateTitleState rateTitleState = (RateTitleState) other;
        if (kotlin.jvm.internal.m.c(this.readId, rateTitleState.readId) && kotlin.jvm.internal.m.c(this.userRating, rateTitleState.userRating) && this.isLoading == rateTitleState.isLoading && this.close == rateTitleState.close) {
            return true;
        }
        return false;
    }

    public final boolean getClose() {
        return this.close;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final Long getUserRating() {
        return this.userRating;
    }

    public int hashCode() {
        int hashCode;
        String str = this.readId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        Long l4 = this.userRating;
        if (l4 != null) {
            i10 = l4.hashCode();
        }
        return Boolean.hashCode(this.close) + com.google.android.gms.internal.play_billing.b.f((i11 + i10) * 31, 31, this.isLoading);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "RateTitleState(readId=" + this.readId + ", userRating=" + this.userRating + ", isLoading=" + this.isLoading + ", close=" + this.close + Separators.RPAREN;
    }

    public RateTitleState(String str, Long l4, boolean z6, boolean z10) {
        this.readId = str;
        this.userRating = l4;
        this.isLoading = z6;
        this.close = z10;
    }

    public RateTitleState() {
        this(null, null, false, false, 15, null);
    }
}
