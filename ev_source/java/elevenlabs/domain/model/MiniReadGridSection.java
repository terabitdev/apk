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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/MiniReadGridSection;", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/MiniReadGridSection$Item;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Item", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class MiniReadGridSection {
    private final List<Item> items;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/MiniReadGridSection$Item;", "", "title", "", "imageUrl", "deeplink", "analyticsId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getImageUrl", "getDeeplink", "getAnalyticsId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Item {
        private final String analyticsId;
        private final String deeplink;
        private final String imageUrl;
        private final String title;

        public Item(String str, String str2, String str3, String str4) {
            i.s(str, str2, str3);
            this.title = str;
            this.imageUrl = str2;
            this.deeplink = str3;
            this.analyticsId = str4;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = item.title;
            }
            if ((i10 & 2) != 0) {
                str2 = item.imageUrl;
            }
            if ((i10 & 4) != 0) {
                str3 = item.deeplink;
            }
            if ((i10 & 8) != 0) {
                str4 = item.analyticsId;
            }
            return item.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        public final Item copy(String title, String imageUrl, String deeplink, String analyticsId) {
            title.getClass();
            imageUrl.getClass();
            deeplink.getClass();
            return new Item(title, imageUrl, deeplink, analyticsId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            if (m.c(this.title, item.title) && m.c(this.imageUrl, item.imageUrl) && m.c(this.deeplink, item.deeplink) && m.c(this.analyticsId, item.analyticsId)) {
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

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode;
            int c5 = c.c(c.c(this.title.hashCode() * 31, 31, this.imageUrl), 31, this.deeplink);
            String str = this.analyticsId;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return c5 + hashCode;
        }

        public String toString() {
            String str = this.title;
            String str2 = this.imageUrl;
            return f.n(f.s("Item(title=", str, ", imageUrl=", str2, ", deeplink="), this.deeplink, ", analyticsId=", this.analyticsId, Separators.RPAREN);
        }
    }

    public MiniReadGridSection(List<Item> list) {
        list.getClass();
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MiniReadGridSection copy$default(MiniReadGridSection miniReadGridSection, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = miniReadGridSection.items;
        }
        return miniReadGridSection.copy(list);
    }

    public final List<Item> component1() {
        return this.items;
    }

    public final MiniReadGridSection copy(List<Item> items) {
        items.getClass();
        return new MiniReadGridSection(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof MiniReadGridSection) && m.c(this.items, ((MiniReadGridSection) other).items)) {
            return true;
        }
        return false;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return i.k("MiniReadGridSection(items=", Separators.RPAREN, this.items);
    }
}
