package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import android.gov.nist.core.Separators;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016Jf\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016¨\u0006("}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/UseFriendReferralState;", "", "isLoading", "", "code", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "showSuccess", "isLoadingLink", "link", "hoursAllocated", "", "subscriptionMonths", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "()Z", "getCode", "()Ljava/lang/String;", "getError", "getShowSuccess", "getLink", "getHoursAllocated", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSubscriptionMonths", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/UseFriendReferralState;", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class UseFriendReferralState {
    public static final int $stable = 0;
    private final String code;
    private final String error;
    private final Long hoursAllocated;
    private final boolean isLoading;
    private final boolean isLoadingLink;
    private final String link;
    private final boolean showSuccess;
    private final Long subscriptionMonths;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UseFriendReferralState(boolean z6, String str, String str2, boolean z10, boolean z11, String str3, Long l4, Long l7, int i10, kotlin.jvm.internal.f fVar) {
        this(z6, str, str2, z10, z11, str3, l4, r11);
        Long l10;
        z6 = (i10 & 1) != 0 ? false : z6;
        str = (i10 & 2) != 0 ? null : str;
        str2 = (i10 & 4) != 0 ? "" : str2;
        z10 = (i10 & 8) != 0 ? false : z10;
        z11 = (i10 & 16) != 0 ? false : z11;
        str3 = (i10 & 32) != 0 ? null : str3;
        l4 = (i10 & 64) != 0 ? null : l4;
        if ((i10 & 128) != 0) {
            l10 = null;
        } else {
            l10 = l7;
        }
    }

    public static /* synthetic */ UseFriendReferralState copy$default(UseFriendReferralState useFriendReferralState, boolean z6, String str, String str2, boolean z10, boolean z11, String str3, Long l4, Long l7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = useFriendReferralState.isLoading;
        }
        if ((i10 & 2) != 0) {
            str = useFriendReferralState.code;
        }
        if ((i10 & 4) != 0) {
            str2 = useFriendReferralState.error;
        }
        if ((i10 & 8) != 0) {
            z10 = useFriendReferralState.showSuccess;
        }
        if ((i10 & 16) != 0) {
            z11 = useFriendReferralState.isLoadingLink;
        }
        if ((i10 & 32) != 0) {
            str3 = useFriendReferralState.link;
        }
        if ((i10 & 64) != 0) {
            l4 = useFriendReferralState.hoursAllocated;
        }
        if ((i10 & 128) != 0) {
            l7 = useFriendReferralState.subscriptionMonths;
        }
        Long l10 = l4;
        Long l11 = l7;
        boolean z12 = z11;
        String str4 = str3;
        return useFriendReferralState.copy(z6, str, str2, z10, z12, str4, l10, l11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowSuccess() {
        return this.showSuccess;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoadingLink() {
        return this.isLoadingLink;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getHoursAllocated() {
        return this.hoursAllocated;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getSubscriptionMonths() {
        return this.subscriptionMonths;
    }

    public final UseFriendReferralState copy(boolean isLoading, String code, String error, boolean showSuccess, boolean isLoadingLink, String link, Long hoursAllocated, Long subscriptionMonths) {
        error.getClass();
        return new UseFriendReferralState(isLoading, code, error, showSuccess, isLoadingLink, link, hoursAllocated, subscriptionMonths);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UseFriendReferralState)) {
            return false;
        }
        UseFriendReferralState useFriendReferralState = (UseFriendReferralState) other;
        if (this.isLoading == useFriendReferralState.isLoading && kotlin.jvm.internal.m.c(this.code, useFriendReferralState.code) && kotlin.jvm.internal.m.c(this.error, useFriendReferralState.error) && this.showSuccess == useFriendReferralState.showSuccess && this.isLoadingLink == useFriendReferralState.isLoadingLink && kotlin.jvm.internal.m.c(this.link, useFriendReferralState.link) && kotlin.jvm.internal.m.c(this.hoursAllocated, useFriendReferralState.hoursAllocated) && kotlin.jvm.internal.m.c(this.subscriptionMonths, useFriendReferralState.subscriptionMonths)) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getError() {
        return this.error;
    }

    public final Long getHoursAllocated() {
        return this.hoursAllocated;
    }

    public final String getLink() {
        return this.link;
    }

    public final boolean getShowSuccess() {
        return this.showSuccess;
    }

    public final Long getSubscriptionMonths() {
        return this.subscriptionMonths;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = Boolean.hashCode(this.isLoading) * 31;
        String str = this.code;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(j0.c.c((hashCode4 + hashCode) * 31, 31, this.error), 31, this.showSuccess), 31, this.isLoadingLink);
        String str2 = this.link;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (f10 + hashCode2) * 31;
        Long l4 = this.hoursAllocated;
        if (l4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l4.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Long l7 = this.subscriptionMonths;
        if (l7 != null) {
            i10 = l7.hashCode();
        }
        return i12 + i10;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingLink() {
        return this.isLoadingLink;
    }

    public String toString() {
        boolean z6 = this.isLoading;
        String str = this.code;
        String str2 = this.error;
        boolean z10 = this.showSuccess;
        boolean z11 = this.isLoadingLink;
        String str3 = this.link;
        Long l4 = this.hoursAllocated;
        Long l7 = this.subscriptionMonths;
        StringBuilder sb = new StringBuilder("UseFriendReferralState(isLoading=");
        sb.append(z6);
        sb.append(", code=");
        sb.append(str);
        sb.append(", error=");
        defpackage.f.y(sb, str2, ", showSuccess=", z10, ", isLoadingLink=");
        defpackage.f.z(sb, z11, ", link=", str3, ", hoursAllocated=");
        sb.append(l4);
        sb.append(", subscriptionMonths=");
        sb.append(l7);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public UseFriendReferralState(boolean z6, String str, String str2, boolean z10, boolean z11, String str3, Long l4, Long l7) {
        str2.getClass();
        this.isLoading = z6;
        this.code = str;
        this.error = str2;
        this.showSuccess = z10;
        this.isLoadingLink = z11;
        this.link = str3;
        this.hoursAllocated = l4;
        this.subscriptionMonths = l7;
    }

    public UseFriendReferralState() {
        this(false, null, null, false, false, null, null, null, 255, null);
    }
}
