package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/domain/model/CollectionData;", "", "meta", "Lio/elevenlabs/domain/model/CollectionMeta;", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/ReadMeta;", "hasMore", "", "nextCursor", "", "<init>", "(Lio/elevenlabs/domain/model/CollectionMeta;Ljava/util/List;ZLjava/lang/String;)V", "getMeta", "()Lio/elevenlabs/domain/model/CollectionMeta;", "getItems", "()Ljava/util/List;", "getHasMore", "()Z", "getNextCursor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class CollectionData {
    private final boolean hasMore;
    private final List<ReadMeta> items;
    private final CollectionMeta meta;
    private final String nextCursor;

    public CollectionData(CollectionMeta collectionMeta, List<ReadMeta> list, boolean z6, String str) {
        collectionMeta.getClass();
        list.getClass();
        this.meta = collectionMeta;
        this.items = list;
        this.hasMore = z6;
        this.nextCursor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollectionData copy$default(CollectionData collectionData, CollectionMeta collectionMeta, List list, boolean z6, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            collectionMeta = collectionData.meta;
        }
        if ((i10 & 2) != 0) {
            list = collectionData.items;
        }
        if ((i10 & 4) != 0) {
            z6 = collectionData.hasMore;
        }
        if ((i10 & 8) != 0) {
            str = collectionData.nextCursor;
        }
        return collectionData.copy(collectionMeta, list, z6, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CollectionMeta getMeta() {
        return this.meta;
    }

    public final List<ReadMeta> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final CollectionData copy(CollectionMeta meta, List<ReadMeta> items, boolean hasMore, String nextCursor) {
        meta.getClass();
        items.getClass();
        return new CollectionData(meta, items, hasMore, nextCursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionData)) {
            return false;
        }
        CollectionData collectionData = (CollectionData) other;
        if (m.c(this.meta, collectionData.meta) && m.c(this.items, collectionData.items) && this.hasMore == collectionData.hasMore && m.c(this.nextCursor, collectionData.nextCursor)) {
            return true;
        }
        return false;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<ReadMeta> getItems() {
        return this.items;
    }

    public final CollectionMeta getMeta() {
        return this.meta;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        int hashCode;
        int f10 = b.f(n.d(this.meta.hashCode() * 31, 31, this.items), 31, this.hasMore);
        String str = this.nextCursor;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return f10 + hashCode;
    }

    public String toString() {
        return "CollectionData(meta=" + this.meta + ", items=" + this.items + ", hasMore=" + this.hasMore + ", nextCursor=" + this.nextCursor + Separators.RPAREN;
    }
}
