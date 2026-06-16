package io.elevenlabs.readerapp.ui.screens.authenticated.purchases;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/purchases/ReferFriendState;", "", "isLoadingLink", "", "link", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getLink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ReferFriendState {
    public static final int $stable = 0;
    private final boolean isLoadingLink;
    private final String link;

    public /* synthetic */ ReferFriendState(boolean z6, String str, int i10, kotlin.jvm.internal.f fVar) {
        this((i10 & 1) != 0 ? false : z6, (i10 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ ReferFriendState copy$default(ReferFriendState referFriendState, boolean z6, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = referFriendState.isLoadingLink;
        }
        if ((i10 & 2) != 0) {
            str = referFriendState.link;
        }
        return referFriendState.copy(z6, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoadingLink() {
        return this.isLoadingLink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    public final ReferFriendState copy(boolean isLoadingLink, String link) {
        return new ReferFriendState(isLoadingLink, link);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferFriendState)) {
            return false;
        }
        ReferFriendState referFriendState = (ReferFriendState) other;
        if (this.isLoadingLink == referFriendState.isLoadingLink && kotlin.jvm.internal.m.c(this.link, referFriendState.link)) {
            return true;
        }
        return false;
    }

    public final String getLink() {
        return this.link;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.isLoadingLink) * 31;
        String str = this.link;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean isLoadingLink() {
        return this.isLoadingLink;
    }

    public String toString() {
        return "ReferFriendState(isLoadingLink=" + this.isLoadingLink + ", link=" + this.link + Separators.RPAREN;
    }

    public ReferFriendState(boolean z6, String str) {
        this.isLoadingLink = z6;
        this.link = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReferFriendState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
