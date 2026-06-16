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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection;", "", "title", "", FirebaseAnalytics.Param.ITEMS, "", "Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection$Banner;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Banner", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AnnouncementBannerCarouselSection {
    private final List<Banner> items;
    private final String title;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection$Banner;", "", "imageUrl", "", "deeplink", "analyticsId", "eyebrowText", "headerText", "buttonText", "colorHex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getDeeplink", "getAnalyticsId", "getEyebrowText", "getHeaderText", "getButtonText", "getColorHex", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Banner {
        private final String analyticsId;
        private final String buttonText;
        private final String colorHex;
        private final String deeplink;
        private final String eyebrowText;
        private final String headerText;
        private final String imageUrl;

        public Banner(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            str.getClass();
            str2.getClass();
            this.imageUrl = str;
            this.deeplink = str2;
            this.analyticsId = str3;
            this.eyebrowText = str4;
            this.headerText = str5;
            this.buttonText = str6;
            this.colorHex = str7;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = banner.imageUrl;
            }
            if ((i10 & 2) != 0) {
                str2 = banner.deeplink;
            }
            if ((i10 & 4) != 0) {
                str3 = banner.analyticsId;
            }
            if ((i10 & 8) != 0) {
                str4 = banner.eyebrowText;
            }
            if ((i10 & 16) != 0) {
                str5 = banner.headerText;
            }
            if ((i10 & 32) != 0) {
                str6 = banner.buttonText;
            }
            if ((i10 & 64) != 0) {
                str7 = banner.colorHex;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return banner.copy(str, str2, str11, str4, str10, str8, str9);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEyebrowText() {
            return this.eyebrowText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getButtonText() {
            return this.buttonText;
        }

        /* renamed from: component7, reason: from getter */
        public final String getColorHex() {
            return this.colorHex;
        }

        public final Banner copy(String imageUrl, String deeplink, String analyticsId, String eyebrowText, String headerText, String buttonText, String colorHex) {
            imageUrl.getClass();
            deeplink.getClass();
            return new Banner(imageUrl, deeplink, analyticsId, eyebrowText, headerText, buttonText, colorHex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            if (m.c(this.imageUrl, banner.imageUrl) && m.c(this.deeplink, banner.deeplink) && m.c(this.analyticsId, banner.analyticsId) && m.c(this.eyebrowText, banner.eyebrowText) && m.c(this.headerText, banner.headerText) && m.c(this.buttonText, banner.buttonText) && m.c(this.colorHex, banner.colorHex)) {
                return true;
            }
            return false;
        }

        public final String getAnalyticsId() {
            return this.analyticsId;
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final String getColorHex() {
            return this.colorHex;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getEyebrowText() {
            return this.eyebrowText;
        }

        public final String getHeaderText() {
            return this.headerText;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int c5 = c.c(this.imageUrl.hashCode() * 31, 31, this.deeplink);
            String str = this.analyticsId;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (c5 + hashCode) * 31;
            String str2 = this.eyebrowText;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (i11 + hashCode2) * 31;
            String str3 = this.headerText;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i13 = (i12 + hashCode3) * 31;
            String str4 = this.buttonText;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i14 = (i13 + hashCode4) * 31;
            String str5 = this.colorHex;
            if (str5 != null) {
                i10 = str5.hashCode();
            }
            return i14 + i10;
        }

        public String toString() {
            String str = this.imageUrl;
            String str2 = this.deeplink;
            String str3 = this.analyticsId;
            String str4 = this.eyebrowText;
            String str5 = this.headerText;
            String str6 = this.buttonText;
            String str7 = this.colorHex;
            StringBuilder s10 = f.s("Banner(imageUrl=", str, ", deeplink=", str2, ", analyticsId=");
            f.x(s10, str3, ", eyebrowText=", str4, ", headerText=");
            f.x(s10, str5, ", buttonText=", str6, ", colorHex=");
            return f.l(str7, Separators.RPAREN, s10);
        }
    }

    public AnnouncementBannerCarouselSection(String str, List<Banner> list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnnouncementBannerCarouselSection copy$default(AnnouncementBannerCarouselSection announcementBannerCarouselSection, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = announcementBannerCarouselSection.title;
        }
        if ((i10 & 2) != 0) {
            list = announcementBannerCarouselSection.items;
        }
        return announcementBannerCarouselSection.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Banner> component2() {
        return this.items;
    }

    public final AnnouncementBannerCarouselSection copy(String title, List<Banner> r32) {
        title.getClass();
        r32.getClass();
        return new AnnouncementBannerCarouselSection(title, r32);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnouncementBannerCarouselSection)) {
            return false;
        }
        AnnouncementBannerCarouselSection announcementBannerCarouselSection = (AnnouncementBannerCarouselSection) other;
        if (m.c(this.title, announcementBannerCarouselSection.title) && m.c(this.items, announcementBannerCarouselSection.items)) {
            return true;
        }
        return false;
    }

    public final List<Banner> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return i.j("AnnouncementBannerCarouselSection(title=", this.title, ", items=", Separators.RPAREN, this.items);
    }
}
