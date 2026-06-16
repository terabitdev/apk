package io.elevenlabs.readerapp.ui.previews;

import android.gov.nist.javax.sip.header.ParameterNames;
import ig.f;
import io.elevenlabs.domain.model.AnnouncementBannerCarouselSection;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.MiniReadGridSection;
import io.elevenlabs.domain.model.StatsCarouselSection;
import io.elevenlabs.domain.model.User;
import io.elevenlabs.domain.model.home.HomePageV4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e\u001a:\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b\u001a\u0006\u0010\u0017\u001a\u00020\u0018\u001a\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b\u001a\u0006\u0010\u001b\u001a\u00020\u001c¨\u0006\u001d"}, d2 = {"stubUser", "Lio/elevenlabs/domain/model/User;", "stubStatsCarouselSectionDataV3", "Lio/elevenlabs/domain/model/StatsCarouselSection;", "stubStatsCarouselSectionData", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$StatsCarousel;", "stubActionListSection", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$HomeActionList;", "stubWarningSection", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$WarningSection;", "stubMiniReadGridItems", "", "Lio/elevenlabs/domain/model/MiniReadGridSection$Item;", "count", "", "stubMediumCarouselSection", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$MediumCarousel;", "title", "", "subtitle", "deeplink", "reads", "Lio/elevenlabs/domain/model/ExploreRead;", "stubHighlightedCarouselSection", "Lio/elevenlabs/domain/model/home/HomePageV4$Section$HighlightedCarousel;", "stubAnnouncementBanners", "Lio/elevenlabs/domain/model/AnnouncementBannerCarouselSection$Banner;", "stubHomePageV4", "Lio/elevenlabs/domain/model/home/HomePageV4;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HomeFactoryKt {
    public static final HomePageV4.Section.HomeActionList stubActionListSection() {
        return new HomePageV4.Section.HomeActionList("Bring your own", f.I(new HomePageV4.Section.HomeActionList.HomeActionItem("Write text", "", "elevenlabs://import/text", ParameterNames.TEXT), new HomePageV4.Section.HomeActionList.HomeActionItem("Upload file", "", "elevenlabs://import/file", "file"), new HomePageV4.Section.HomeActionList.HomeActionItem("Paste a link", "", "elevenlabs://import/link", "link")));
    }

    public static final List<AnnouncementBannerCarouselSection.Banner> stubAnnouncementBanners() {
        return f.I(new AnnouncementBannerCarouselSection.Banner("", "elevenlabs://explore", "banner-1", "Just landed", "Discover what's new", "Explore", "1F2937"), new AnnouncementBannerCarouselSection.Banner("", "elevenlabs://subscribe", "banner-2", "Limited time", "Try Ultra free for 7 days", "Start trial", "4338CA"), new AnnouncementBannerCarouselSection.Banner("", "elevenlabs://library", "banner-3", "Tip", "Listen to your library anywhere", "Open library", "059669"));
    }

    public static final HomePageV4.Section.HighlightedCarousel stubHighlightedCarouselSection() {
        return new HomePageV4.Section.HighlightedCarousel("Top Picks", "Curated for you", "elevenlabs://collection/explore_v4__top_picks", ExploreFactoryKt.stubExploreReadList(6));
    }

    public static final HomePageV4 stubHomePageV4() {
        return new HomePageV4(f.I(new HomePageV4.Section.RecentReadsSection("Continue listening"), stubActionListSection(), stubHighlightedCarouselSection(), stubMediumCarouselSection$default(null, null, null, null, 15, null), stubStatsCarouselSectionData()));
    }

    public static final HomePageV4.Section.MediumCarousel stubMediumCarouselSection(String str, String str2, String str3, List<ExploreRead> list) {
        list.getClass();
        return new HomePageV4.Section.MediumCarousel(str, str2, str3, list);
    }

    public static /* synthetic */ HomePageV4.Section.MediumCarousel stubMediumCarouselSection$default(String str, String str2, String str3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Budget Picks";
        }
        if ((i10 & 2) != 0) {
            str2 = "Great reads under $7";
        }
        if ((i10 & 4) != 0) {
            str3 = "elevenlabs://collection/explore_v4__top_picks_under_7";
        }
        if ((i10 & 8) != 0) {
            list = ExploreFactoryKt.stubExploreReadList(6);
        }
        return stubMediumCarouselSection(str, str2, str3, list);
    }

    public static final List<MiniReadGridSection.Item> stubMiniReadGridItems(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new MiniReadGridSection.Item((String) f.I("The Dystopian", "New York's Maze", "Harry Potter").get(i11 % 3), "", "placeholder", String.valueOf(i11)));
        }
        return arrayList;
    }

    public static /* synthetic */ List stubMiniReadGridItems$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 6;
        }
        return stubMiniReadGridItems(i10);
    }

    public static final HomePageV4.Section.StatsCarousel stubStatsCarouselSectionData() {
        return new HomePageV4.Section.StatsCarousel("", 5, 45);
    }

    public static final StatsCarouselSection stubStatsCarouselSectionDataV3() {
        return new StatsCarouselSection(5, 45);
    }

    public static final User stubUser() {
        return new User("1", "jane@example.com", null, "Jane Doe");
    }

    public static final HomePageV4.Section.WarningSection stubWarningSection() {
        return new HomePageV4.Section.WarningSection("Some content you uploaded may violate our [Prohibited Use Policy](https://elevenlabs.io). Continued violations could lead to suspension. Please [contact us](https://elevenlabs.io) if you believe this message is in error.");
    }
}
