package io.elevenlabs.domain.model.home;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.a;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import defpackage.f;
import ib.i;
import io.elevenlabs.domain.model.AnnouncementBannerCarouselSection;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.MiniReadGridSection;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4;", "", "sections", "", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "<init>", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Section", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class HomePageV4 {
    private final List<Section> sections;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "", "RecentReadsSection", "HomeActionList", "StatsCarousel", "FeaturedCardList", "MiniReadGrid", "HeroCarousel", "HighlightedCarousel", "MediumCarousel", "WarningSection", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$FeaturedCardList;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$HeroCarousel;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$HighlightedCarousel;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$HomeActionList;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$MediumCarousel;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$MiniReadGrid;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$RecentReadsSection;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$StatsCarousel;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$WarningSection;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Section {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$FeaturedCardList;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection;", "<init>", "(Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection;)V", "getData", "()Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class FeaturedCardList implements Section {
            private final AnnouncementBannerCarouselSection data;

            public FeaturedCardList(AnnouncementBannerCarouselSection announcementBannerCarouselSection) {
                announcementBannerCarouselSection.getClass();
                this.data = announcementBannerCarouselSection;
            }

            public static /* synthetic */ FeaturedCardList copy$default(FeaturedCardList featuredCardList, AnnouncementBannerCarouselSection announcementBannerCarouselSection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    announcementBannerCarouselSection = featuredCardList.data;
                }
                return featuredCardList.copy(announcementBannerCarouselSection);
            }

            /* renamed from: component1, reason: from getter */
            public final AnnouncementBannerCarouselSection getData() {
                return this.data;
            }

            public final FeaturedCardList copy(AnnouncementBannerCarouselSection r22) {
                r22.getClass();
                return new FeaturedCardList(r22);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof FeaturedCardList) && m.c(this.data, ((FeaturedCardList) other).data)) {
                    return true;
                }
                return false;
            }

            public final AnnouncementBannerCarouselSection getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "FeaturedCardList(data=" + this.data + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$HeroCarousel;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "title", "", "subtitle", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$HeroCarousel$HeroItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "HeroItem", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HeroCarousel implements Section {
            private final List<HeroItem> items;
            private final String subtitle;
            private final String title;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$HeroCarousel$HeroItem;", "", "title", "", "subtitle", "swapTitleSubtitle", "", "backgroundImageUrl", "backgroundVideoUrl", "deeplink", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSwapTitleSubtitle", "()Z", "getBackgroundImageUrl", "getBackgroundVideoUrl", "getDeeplink", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class HeroItem {
                private final String backgroundImageUrl;
                private final String backgroundVideoUrl;
                private final String deeplink;
                private final String subtitle;
                private final boolean swapTitleSubtitle;
                private final String title;
                private final String url;

                public HeroItem(String str, String str2, boolean z6, String str3, String str4, String str5, String str6) {
                    str.getClass();
                    str5.getClass();
                    this.title = str;
                    this.subtitle = str2;
                    this.swapTitleSubtitle = z6;
                    this.backgroundImageUrl = str3;
                    this.backgroundVideoUrl = str4;
                    this.deeplink = str5;
                    this.url = str6;
                }

                public static /* synthetic */ HeroItem copy$default(HeroItem heroItem, String str, String str2, boolean z6, String str3, String str4, String str5, String str6, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = heroItem.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = heroItem.subtitle;
                    }
                    if ((i10 & 4) != 0) {
                        z6 = heroItem.swapTitleSubtitle;
                    }
                    if ((i10 & 8) != 0) {
                        str3 = heroItem.backgroundImageUrl;
                    }
                    if ((i10 & 16) != 0) {
                        str4 = heroItem.backgroundVideoUrl;
                    }
                    if ((i10 & 32) != 0) {
                        str5 = heroItem.deeplink;
                    }
                    if ((i10 & 64) != 0) {
                        str6 = heroItem.url;
                    }
                    String str7 = str5;
                    String str8 = str6;
                    String str9 = str4;
                    boolean z10 = z6;
                    return heroItem.copy(str, str2, z10, str3, str9, str7, str8);
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
                public final boolean getSwapTitleSubtitle() {
                    return this.swapTitleSubtitle;
                }

                /* renamed from: component4, reason: from getter */
                public final String getBackgroundImageUrl() {
                    return this.backgroundImageUrl;
                }

                /* renamed from: component5, reason: from getter */
                public final String getBackgroundVideoUrl() {
                    return this.backgroundVideoUrl;
                }

                /* renamed from: component6, reason: from getter */
                public final String getDeeplink() {
                    return this.deeplink;
                }

                /* renamed from: component7, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                public final HeroItem copy(String title, String subtitle, boolean swapTitleSubtitle, String backgroundImageUrl, String backgroundVideoUrl, String deeplink, String url) {
                    title.getClass();
                    deeplink.getClass();
                    return new HeroItem(title, subtitle, swapTitleSubtitle, backgroundImageUrl, backgroundVideoUrl, deeplink, url);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HeroItem)) {
                        return false;
                    }
                    HeroItem heroItem = (HeroItem) other;
                    if (m.c(this.title, heroItem.title) && m.c(this.subtitle, heroItem.subtitle) && this.swapTitleSubtitle == heroItem.swapTitleSubtitle && m.c(this.backgroundImageUrl, heroItem.backgroundImageUrl) && m.c(this.backgroundVideoUrl, heroItem.backgroundVideoUrl) && m.c(this.deeplink, heroItem.deeplink) && m.c(this.url, heroItem.url)) {
                        return true;
                    }
                    return false;
                }

                public final String getBackgroundImageUrl() {
                    return this.backgroundImageUrl;
                }

                public final String getBackgroundVideoUrl() {
                    return this.backgroundVideoUrl;
                }

                public final String getDeeplink() {
                    return this.deeplink;
                }

                public final String getSubtitle() {
                    return this.subtitle;
                }

                public final boolean getSwapTitleSubtitle() {
                    return this.swapTitleSubtitle;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3;
                    int hashCode4 = this.title.hashCode() * 31;
                    String str = this.subtitle;
                    int i10 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int f10 = b.f((hashCode4 + hashCode) * 31, 31, this.swapTitleSubtitle);
                    String str2 = this.backgroundImageUrl;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i11 = (f10 + hashCode2) * 31;
                    String str3 = this.backgroundVideoUrl;
                    if (str3 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = str3.hashCode();
                    }
                    int c5 = c.c((i11 + hashCode3) * 31, 31, this.deeplink);
                    String str4 = this.url;
                    if (str4 != null) {
                        i10 = str4.hashCode();
                    }
                    return c5 + i10;
                }

                public String toString() {
                    String str = this.title;
                    String str2 = this.subtitle;
                    boolean z6 = this.swapTitleSubtitle;
                    String str3 = this.backgroundImageUrl;
                    String str4 = this.backgroundVideoUrl;
                    String str5 = this.deeplink;
                    String str6 = this.url;
                    StringBuilder s10 = f.s("HeroItem(title=", str, ", subtitle=", str2, ", swapTitleSubtitle=");
                    f.z(s10, z6, ", backgroundImageUrl=", str3, ", backgroundVideoUrl=");
                    f.x(s10, str4, ", deeplink=", str5, ", url=");
                    return f.l(str6, Separators.RPAREN, s10);
                }
            }

            public HeroCarousel(String str, String str2, List<HeroItem> list) {
                str.getClass();
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.items = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HeroCarousel copy$default(HeroCarousel heroCarousel, String str, String str2, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = heroCarousel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = heroCarousel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    list = heroCarousel.items;
                }
                return heroCarousel.copy(str, str2, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            public final List<HeroItem> component3() {
                return this.items;
            }

            public final HeroCarousel copy(String title, String subtitle, List<HeroItem> r42) {
                title.getClass();
                r42.getClass();
                return new HeroCarousel(title, subtitle, r42);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HeroCarousel)) {
                    return false;
                }
                HeroCarousel heroCarousel = (HeroCarousel) other;
                if (m.c(this.title, heroCarousel.title) && m.c(this.subtitle, heroCarousel.subtitle) && m.c(this.items, heroCarousel.items)) {
                    return true;
                }
                return false;
            }

            public final List<HeroItem> getItems() {
                return this.items;
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
                return this.items.hashCode() + ((hashCode2 + hashCode) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                return h.e(f.s("HeroCarousel(title=", str, ", subtitle=", str2, ", items="), this.items, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$HighlightedCarousel;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "title", "", "subtitle", "deeplink", "reads", "", "Lio/elevenlabs/domain/model/ExploreRead;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getReads", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HighlightedCarousel implements Section {
            private final String deeplink;
            private final List<ExploreRead> reads;
            private final String subtitle;
            private final String title;

            public HighlightedCarousel(String str, String str2, String str3, List<ExploreRead> list) {
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HighlightedCarousel copy$default(HighlightedCarousel highlightedCarousel, String str, String str2, String str3, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = highlightedCarousel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = highlightedCarousel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = highlightedCarousel.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = highlightedCarousel.reads;
                }
                return highlightedCarousel.copy(str, str2, str3, list);
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

            public final List<ExploreRead> component4() {
                return this.reads;
            }

            public final HighlightedCarousel copy(String title, String subtitle, String deeplink, List<ExploreRead> reads) {
                reads.getClass();
                return new HighlightedCarousel(title, subtitle, deeplink, reads);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HighlightedCarousel)) {
                    return false;
                }
                HighlightedCarousel highlightedCarousel = (HighlightedCarousel) other;
                if (m.c(this.title, highlightedCarousel.title) && m.c(this.subtitle, highlightedCarousel.subtitle) && m.c(this.deeplink, highlightedCarousel.deeplink) && m.c(this.reads, highlightedCarousel.reads)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreRead> getReads() {
                return this.reads;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str3 = this.deeplink;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return this.reads.hashCode() + ((i12 + i10) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreRead> list = this.reads;
                StringBuilder s10 = f.s("HighlightedCarousel(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$HomeActionList;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$HomeActionList$HomeActionItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "HomeActionItem", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class HomeActionList implements Section {
            private final List<HomeActionItem> items;
            private final String title;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$HomeActionList$HomeActionItem;", "", "title", "", "iconUrl", "deeplink", "analyticsId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getIconUrl", "getDeeplink", "getAnalyticsId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class HomeActionItem {
                private final String analyticsId;
                private final String deeplink;
                private final String iconUrl;
                private final String title;

                public HomeActionItem(String str, String str2, String str3, String str4) {
                    c.u(str, str2, str3, str4);
                    this.title = str;
                    this.iconUrl = str2;
                    this.deeplink = str3;
                    this.analyticsId = str4;
                }

                public static /* synthetic */ HomeActionItem copy$default(HomeActionItem homeActionItem, String str, String str2, String str3, String str4, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = homeActionItem.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = homeActionItem.iconUrl;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = homeActionItem.deeplink;
                    }
                    if ((i10 & 8) != 0) {
                        str4 = homeActionItem.analyticsId;
                    }
                    return homeActionItem.copy(str, str2, str3, str4);
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

                public final HomeActionItem copy(String title, String iconUrl, String deeplink, String analyticsId) {
                    title.getClass();
                    iconUrl.getClass();
                    deeplink.getClass();
                    analyticsId.getClass();
                    return new HomeActionItem(title, iconUrl, deeplink, analyticsId);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HomeActionItem)) {
                        return false;
                    }
                    HomeActionItem homeActionItem = (HomeActionItem) other;
                    if (m.c(this.title, homeActionItem.title) && m.c(this.iconUrl, homeActionItem.iconUrl) && m.c(this.deeplink, homeActionItem.deeplink) && m.c(this.analyticsId, homeActionItem.analyticsId)) {
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
                    return f.n(f.s("HomeActionItem(title=", str, ", iconUrl=", str2, ", deeplink="), this.deeplink, ", analyticsId=", this.analyticsId, Separators.RPAREN);
                }
            }

            public HomeActionList(String str, List<HomeActionItem> list) {
                list.getClass();
                this.title = str;
                this.items = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HomeActionList copy$default(HomeActionList homeActionList, String str, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeActionList.title;
                }
                if ((i10 & 2) != 0) {
                    list = homeActionList.items;
                }
                return homeActionList.copy(str, list);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<HomeActionItem> component2() {
                return this.items;
            }

            public final HomeActionList copy(String title, List<HomeActionItem> r32) {
                r32.getClass();
                return new HomeActionList(title, r32);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeActionList)) {
                    return false;
                }
                HomeActionList homeActionList = (HomeActionList) other;
                if (m.c(this.title, homeActionList.title) && m.c(this.items, homeActionList.items)) {
                    return true;
                }
                return false;
            }

            public final List<HomeActionItem> getItems() {
                return this.items;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                String str = this.title;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return this.items.hashCode() + (hashCode * 31);
            }

            public String toString() {
                return i.j("HomeActionList(title=", this.title, ", items=", Separators.RPAREN, this.items);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$MediumCarousel;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "title", "", "subtitle", "deeplink", "reads", "", "Lio/elevenlabs/domain/model/ExploreRead;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDeeplink", "getReads", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class MediumCarousel implements Section {
            private final String deeplink;
            private final List<ExploreRead> reads;
            private final String subtitle;
            private final String title;

            public MediumCarousel(String str, String str2, String str3, List<ExploreRead> list) {
                list.getClass();
                this.title = str;
                this.subtitle = str2;
                this.deeplink = str3;
                this.reads = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MediumCarousel copy$default(MediumCarousel mediumCarousel, String str, String str2, String str3, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = mediumCarousel.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = mediumCarousel.subtitle;
                }
                if ((i10 & 4) != 0) {
                    str3 = mediumCarousel.deeplink;
                }
                if ((i10 & 8) != 0) {
                    list = mediumCarousel.reads;
                }
                return mediumCarousel.copy(str, str2, str3, list);
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

            public final List<ExploreRead> component4() {
                return this.reads;
            }

            public final MediumCarousel copy(String title, String subtitle, String deeplink, List<ExploreRead> reads) {
                reads.getClass();
                return new MediumCarousel(title, subtitle, deeplink, reads);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MediumCarousel)) {
                    return false;
                }
                MediumCarousel mediumCarousel = (MediumCarousel) other;
                if (m.c(this.title, mediumCarousel.title) && m.c(this.subtitle, mediumCarousel.subtitle) && m.c(this.deeplink, mediumCarousel.deeplink) && m.c(this.reads, mediumCarousel.reads)) {
                    return true;
                }
                return false;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final List<ExploreRead> getReads() {
                return this.reads;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                String str = this.title;
                int i10 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i11 = hashCode * 31;
                String str2 = this.subtitle;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i12 = (i11 + hashCode2) * 31;
                String str3 = this.deeplink;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return this.reads.hashCode() + ((i12 + i10) * 31);
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                String str3 = this.deeplink;
                List<ExploreRead> list = this.reads;
                StringBuilder s10 = f.s("MediumCarousel(title=", str, ", subtitle=", str2, ", deeplink=");
                s10.append(str3);
                s10.append(", reads=");
                s10.append(list);
                s10.append(Separators.RPAREN);
                return s10.toString();
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$MiniReadGrid;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/domain/model/MiniReadGridSection;", "<init>", "(Lio/elevenlabs/domain/model/MiniReadGridSection;)V", "getData", "()Lio/elevenlabs/domain/model/MiniReadGridSection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class MiniReadGrid implements Section {
            private final MiniReadGridSection data;

            public MiniReadGrid(MiniReadGridSection miniReadGridSection) {
                miniReadGridSection.getClass();
                this.data = miniReadGridSection;
            }

            public static /* synthetic */ MiniReadGrid copy$default(MiniReadGrid miniReadGrid, MiniReadGridSection miniReadGridSection, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    miniReadGridSection = miniReadGrid.data;
                }
                return miniReadGrid.copy(miniReadGridSection);
            }

            /* renamed from: component1, reason: from getter */
            public final MiniReadGridSection getData() {
                return this.data;
            }

            public final MiniReadGrid copy(MiniReadGridSection r22) {
                r22.getClass();
                return new MiniReadGrid(r22);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof MiniReadGrid) && m.c(this.data, ((MiniReadGrid) other).data)) {
                    return true;
                }
                return false;
            }

            public final MiniReadGridSection getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "MiniReadGrid(data=" + this.data + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$RecentReadsSection;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class RecentReadsSection implements Section {
            private final String title;

            public RecentReadsSection(String str) {
                str.getClass();
                this.title = str;
            }

            public static /* synthetic */ RecentReadsSection copy$default(RecentReadsSection recentReadsSection, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = recentReadsSection.title;
                }
                return recentReadsSection.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final RecentReadsSection copy(String title) {
                title.getClass();
                return new RecentReadsSection(title);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof RecentReadsSection) && m.c(this.title, ((RecentReadsSection) other).title)) {
                    return true;
                }
                return false;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode();
            }

            public String toString() {
                return f.C("RecentReadsSection(title=", this.title, Separators.RPAREN);
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$StatsCarousel;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "title", "", "daysInStreak", "", "minutesListenedToday", "<init>", "(Ljava/lang/String;II)V", "getTitle", "()Ljava/lang/String;", "getDaysInStreak", "()I", "getMinutesListenedToday", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class StatsCarousel implements Section {
            private final int daysInStreak;
            private final int minutesListenedToday;
            private final String title;

            public StatsCarousel(String str, int i10, int i11) {
                str.getClass();
                this.title = str;
                this.daysInStreak = i10;
                this.minutesListenedToday = i11;
            }

            public static /* synthetic */ StatsCarousel copy$default(StatsCarousel statsCarousel, String str, int i10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = statsCarousel.title;
                }
                if ((i12 & 2) != 0) {
                    i10 = statsCarousel.daysInStreak;
                }
                if ((i12 & 4) != 0) {
                    i11 = statsCarousel.minutesListenedToday;
                }
                return statsCarousel.copy(str, i10, i11);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final int getDaysInStreak() {
                return this.daysInStreak;
            }

            /* renamed from: component3, reason: from getter */
            public final int getMinutesListenedToday() {
                return this.minutesListenedToday;
            }

            public final StatsCarousel copy(String title, int daysInStreak, int minutesListenedToday) {
                title.getClass();
                return new StatsCarousel(title, daysInStreak, minutesListenedToday);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StatsCarousel)) {
                    return false;
                }
                StatsCarousel statsCarousel = (StatsCarousel) other;
                if (m.c(this.title, statsCarousel.title) && this.daysInStreak == statsCarousel.daysInStreak && this.minutesListenedToday == statsCarousel.minutesListenedToday) {
                    return true;
                }
                return false;
            }

            public final int getDaysInStreak() {
                return this.daysInStreak;
            }

            public final int getMinutesListenedToday() {
                return this.minutesListenedToday;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return Integer.hashCode(this.minutesListenedToday) + c.b(this.daysInStreak, this.title.hashCode() * 31, 31);
            }

            public String toString() {
                String str = this.title;
                return f.f(this.minutesListenedToday, Separators.RPAREN, a.o(this.daysInStreak, "StatsCarousel(title=", str, ", daysInStreak=", ", minutesListenedToday="));
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$WarningSection;", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "markdown", "", "<init>", "(Ljava/lang/String;)V", "getMarkdown", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class WarningSection implements Section {
            private final String markdown;

            public WarningSection(String str) {
                str.getClass();
                this.markdown = str;
            }

            public static /* synthetic */ WarningSection copy$default(WarningSection warningSection, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = warningSection.markdown;
                }
                return warningSection.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMarkdown() {
                return this.markdown;
            }

            public final WarningSection copy(String markdown) {
                markdown.getClass();
                return new WarningSection(markdown);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof WarningSection) && m.c(this.markdown, ((WarningSection) other).markdown)) {
                    return true;
                }
                return false;
            }

            public final String getMarkdown() {
                return this.markdown;
            }

            public int hashCode() {
                return this.markdown.hashCode();
            }

            public String toString() {
                return f.C("WarningSection(markdown=", this.markdown, Separators.RPAREN);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomePageV4(List<? extends Section> list) {
        list.getClass();
        this.sections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomePageV4 copy$default(HomePageV4 homePageV4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = homePageV4.sections;
        }
        return homePageV4.copy(list);
    }

    public final List<Section> component1() {
        return this.sections;
    }

    public final HomePageV4 copy(List<? extends Section> sections) {
        sections.getClass();
        return new HomePageV4(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof HomePageV4) && m.c(this.sections, ((HomePageV4) other).sections)) {
            return true;
        }
        return false;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public String toString() {
        return i.k("HomePageV4(sections=", Separators.RPAREN, this.sections);
    }
}
