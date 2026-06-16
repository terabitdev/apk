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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/GenreTilesGridRow;", "", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/GenreTilesGridRow$Tile;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tile", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class GenreTilesGridRow {
    private final List<Tile> items;
    private final String title;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/GenreTilesGridRow$Tile;", "", "title", "", "iconUrl", "deeplink", "analyticsId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getIconUrl", "getDeeplink", "getAnalyticsId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Tile {
        private final String analyticsId;
        private final String deeplink;
        private final String iconUrl;
        private final String title;

        public Tile(String str, String str2, String str3, String str4) {
            c.u(str, str2, str3, str4);
            this.title = str;
            this.iconUrl = str2;
            this.deeplink = str3;
            this.analyticsId = str4;
        }

        public static /* synthetic */ Tile copy$default(Tile tile, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = tile.title;
            }
            if ((i10 & 2) != 0) {
                str2 = tile.iconUrl;
            }
            if ((i10 & 4) != 0) {
                str3 = tile.deeplink;
            }
            if ((i10 & 8) != 0) {
                str4 = tile.analyticsId;
            }
            return tile.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        public final Tile copy(String title, String iconUrl, String deeplink, String analyticsId) {
            title.getClass();
            iconUrl.getClass();
            deeplink.getClass();
            analyticsId.getClass();
            return new Tile(title, iconUrl, deeplink, analyticsId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tile)) {
                return false;
            }
            Tile tile = (Tile) other;
            if (m.c(this.title, tile.title) && m.c(this.iconUrl, tile.iconUrl) && m.c(this.deeplink, tile.deeplink) && m.c(this.analyticsId, tile.analyticsId)) {
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

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.analyticsId.hashCode() + c.c(c.c(this.title.hashCode() * 31, 31, this.iconUrl), 31, this.deeplink);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.iconUrl;
            return f.n(f.s("Tile(title=", str, ", iconUrl=", str2, ", deeplink="), this.deeplink, ", analyticsId=", this.analyticsId, Separators.RPAREN);
        }
    }

    public GenreTilesGridRow(String str, List<Tile> list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenreTilesGridRow copy$default(GenreTilesGridRow genreTilesGridRow, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = genreTilesGridRow.title;
        }
        if ((i10 & 2) != 0) {
            list = genreTilesGridRow.items;
        }
        return genreTilesGridRow.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Tile> component2() {
        return this.items;
    }

    public final GenreTilesGridRow copy(String title, List<Tile> items) {
        title.getClass();
        items.getClass();
        return new GenreTilesGridRow(title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenreTilesGridRow)) {
            return false;
        }
        GenreTilesGridRow genreTilesGridRow = (GenreTilesGridRow) other;
        if (m.c(this.title, genreTilesGridRow.title) && m.c(this.items, genreTilesGridRow.items)) {
            return true;
        }
        return false;
    }

    public final List<Tile> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return i.j("GenreTilesGridRow(title=", this.title, ", items=", Separators.RPAREN, this.items);
    }
}
