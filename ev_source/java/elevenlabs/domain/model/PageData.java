package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\bHÖ\u0081\u0004R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/model/PageData;", TokenNames.T, "", FirebaseAnalytics.Param.ITEMS, "", "hasMore", "", "nextCursor", "", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "getItems", "()Ljava/util/List;", "getHasMore", "()Z", "getNextCursor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class PageData<T> {
    private final boolean hasMore;
    private final List<T> items;
    private final String nextCursor;

    /* JADX WARN: Multi-variable type inference failed */
    public PageData(List<? extends T> list, boolean z6, String str) {
        list.getClass();
        this.items = list;
        this.hasMore = z6;
        this.nextCursor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageData copy$default(PageData pageData, List list, boolean z6, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = pageData.items;
        }
        if ((i10 & 2) != 0) {
            z6 = pageData.hasMore;
        }
        if ((i10 & 4) != 0) {
            str = pageData.nextCursor;
        }
        return pageData.copy(list, z6, str);
    }

    public final List<T> component1() {
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

    public final PageData<T> copy(List<? extends T> items, boolean hasMore, String nextCursor) {
        items.getClass();
        return new PageData<>(items, hasMore, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageData)) {
            return false;
        }
        PageData pageData = (PageData) other;
        if (m.c(this.items, pageData.items) && this.hasMore == pageData.hasMore && m.c(this.nextCursor, pageData.nextCursor)) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<T> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        int hashCode;
        int f10 = b.f(this.items.hashCode() * 31, 31, this.hasMore);
        String str = this.nextCursor;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return f10 + hashCode;
    }

    public String toString() {
        List<T> list = this.items;
        boolean z6 = this.hasMore;
        String str = this.nextCursor;
        StringBuilder sb = new StringBuilder("PageData(items=");
        sb.append(list);
        sb.append(", hasMore=");
        sb.append(z6);
        sb.append(", nextCursor=");
        return f.l(str, Separators.RPAREN, sb);
    }
}
