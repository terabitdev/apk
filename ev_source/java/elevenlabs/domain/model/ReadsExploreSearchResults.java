package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\bHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExploreSearchResults;", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/SearchSection;", "hasMore", "", "nextCursor", "", "searchId", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getHasMore", "()Z", "getNextCursor", "()Ljava/lang/String;", "getSearchId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadsExploreSearchResults {
    private final boolean hasMore;
    private final List<SearchSection> items;
    private final String nextCursor;
    private final String searchId;

    /* JADX WARN: Multi-variable type inference failed */
    public ReadsExploreSearchResults(List<? extends SearchSection> list, boolean z6, String str, String str2) {
        list.getClass();
        this.items = list;
        this.hasMore = z6;
        this.nextCursor = str;
        this.searchId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReadsExploreSearchResults copy$default(ReadsExploreSearchResults readsExploreSearchResults, List list, boolean z6, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = readsExploreSearchResults.items;
        }
        if ((i10 & 2) != 0) {
            z6 = readsExploreSearchResults.hasMore;
        }
        if ((i10 & 4) != 0) {
            str = readsExploreSearchResults.nextCursor;
        }
        if ((i10 & 8) != 0) {
            str2 = readsExploreSearchResults.searchId;
        }
        return readsExploreSearchResults.copy(list, z6, str, str2);
    }

    public final List<SearchSection> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSearchId() {
        return this.searchId;
    }

    public final ReadsExploreSearchResults copy(List<? extends SearchSection> items, boolean hasMore, String nextCursor, String searchId) {
        items.getClass();
        return new ReadsExploreSearchResults(items, hasMore, nextCursor, searchId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadsExploreSearchResults)) {
            return false;
        }
        ReadsExploreSearchResults readsExploreSearchResults = (ReadsExploreSearchResults) other;
        if (m.c(this.items, readsExploreSearchResults.items) && this.hasMore == readsExploreSearchResults.hasMore && m.c(this.nextCursor, readsExploreSearchResults.nextCursor) && m.c(this.searchId, readsExploreSearchResults.searchId)) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<SearchSection> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public int hashCode() {
        int hashCode;
        int f10 = b.f(this.items.hashCode() * 31, 31, this.hasMore);
        String str = this.nextCursor;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (f10 + hashCode) * 31;
        String str2 = this.searchId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        List<SearchSection> list = this.items;
        boolean z6 = this.hasMore;
        String str = this.nextCursor;
        String str2 = this.searchId;
        StringBuilder sb = new StringBuilder("ReadsExploreSearchResults(items=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(z6);
        sb.append(", nextCursor=");
        return f.n(sb, str, ", searchId=", str2, Separators.RPAREN);
    }
}
