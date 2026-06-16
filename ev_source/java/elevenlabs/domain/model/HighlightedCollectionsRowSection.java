package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import ib.i;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/HighlightedCollectionsRowSection;", "", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/HighlightedCollectionsRowSection$Item;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Item", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class HighlightedCollectionsRowSection {
    private final List<Item> items;
    private final String title;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/domain/model/HighlightedCollectionsRowSection$Item;", "", "title", "", "subtitle", "deeplink", "imageUrl", "analyticsId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getImageUrl", "getAnalyticsId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Item {
        private final String analyticsId;
        private final String deeplink;
        private final String imageUrl;
        private final String subtitle;
        private final String title;

        public Item(String str, String str2, String str3, String str4, String str5) {
            c.u(str, str3, str4, str5);
            this.title = str;
            this.subtitle = str2;
            this.deeplink = str3;
            this.imageUrl = str4;
            this.analyticsId = str5;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = item.title;
            }
            if ((i10 & 2) != 0) {
                str2 = item.subtitle;
            }
            if ((i10 & 4) != 0) {
                str3 = item.deeplink;
            }
            if ((i10 & 8) != 0) {
                str4 = item.imageUrl;
            }
            if ((i10 & 16) != 0) {
                str5 = item.analyticsId;
            }
            String str6 = str5;
            String str7 = str3;
            return item.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        public final Item copy(String title, String subtitle, String deeplink, String imageUrl, String analyticsId) {
            title.getClass();
            deeplink.getClass();
            imageUrl.getClass();
            analyticsId.getClass();
            return new Item(title, subtitle, deeplink, imageUrl, analyticsId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            if (m.c(this.title, item.title) && m.c(this.subtitle, item.subtitle) && m.c(this.deeplink, item.deeplink) && m.c(this.imageUrl, item.imageUrl) && m.c(this.analyticsId, item.analyticsId)) {
                return true;
            }
            return false;
        }

        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.title.hashCode() * 31;
            String str = this.subtitle;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.analyticsId.hashCode() + c.c(c.c((hashCode2 + hashCode) * 31, 31, this.deeplink), 31, this.imageUrl);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.deeplink;
            String str4 = this.imageUrl;
            String str5 = this.analyticsId;
            StringBuilder s10 = f.s("Item(title=", str, ", subtitle=", str2, ", deeplink=");
            f.x(s10, str3, ", imageUrl=", str4, ", analyticsId=");
            return f.l(str5, Separators.RPAREN, s10);
        }
    }

    public HighlightedCollectionsRowSection(String str, List<Item> list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlightedCollectionsRowSection copy$default(HighlightedCollectionsRowSection highlightedCollectionsRowSection, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = highlightedCollectionsRowSection.title;
        }
        if ((i10 & 2) != 0) {
            list = highlightedCollectionsRowSection.items;
        }
        return highlightedCollectionsRowSection.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Item> component2() {
        return this.items;
    }

    public final HighlightedCollectionsRowSection copy(String title, List<Item> items) {
        title.getClass();
        items.getClass();
        return new HighlightedCollectionsRowSection(title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightedCollectionsRowSection)) {
            return false;
        }
        HighlightedCollectionsRowSection highlightedCollectionsRowSection = (HighlightedCollectionsRowSection) other;
        if (m.c(this.title, highlightedCollectionsRowSection.title) && m.c(this.items, highlightedCollectionsRowSection.items)) {
            return true;
        }
        return false;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return i.j("HighlightedCollectionsRowSection(title=", this.title, ", items=", Separators.RPAREN, this.items);
    }
}
