package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.extensions.DataModelsToDomainModelsKt;
import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.data.model.response.BasicReadMeta;
import io.elevenlabs.data.model.response.ExploreReadResponseModel;
import io.elevenlabs.data.model.response.HomeV3Response;
import io.elevenlabs.data.model.response.HomeV4Response;
import io.elevenlabs.domain.model.AnnouncementBannerCarouselSection;
import io.elevenlabs.domain.model.CategoryReadsRowSection;
import io.elevenlabs.domain.model.EmptyStateSection;
import io.elevenlabs.domain.model.FollowedEntityType;
import io.elevenlabs.domain.model.GenreTilesGridRow;
import io.elevenlabs.domain.model.HighlightedCollectionsRowSection;
import io.elevenlabs.domain.model.MiniReadGridSection;
import io.elevenlabs.domain.model.ReadFromFollowingSection;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.StatsCarouselSection;
import io.elevenlabs.domain.model.home.HomePageV3;
import io.elevenlabs.domain.model.home.HomePageV4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/home/HomePageV4$Section;", "Lio/elevenlabs/data/model/response/HomeV4Response$Section;", "Lio/elevenlabs/domain/model/home/HomePageV3$Section;", "Lio/elevenlabs/data/model/response/HomeV3Response$Section;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HomeServiceImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HomePageV3.Section toDomain(HomeV3Response.Section section) {
        FollowedEntityType followedEntityType;
        if (section instanceof HomeV3Response.Section.RecentReadsSection) {
            return new HomePageV3.Section.RecentReadsSection(((HomeV3Response.Section.RecentReadsSection) section).getTitle());
        }
        if (section instanceof HomeV3Response.Section.StatsCarousel) {
            HomeV3Response.Section.StatsCarousel statsCarousel = (HomeV3Response.Section.StatsCarousel) section;
            return new HomePageV3.Section.StatsCarousel(new StatsCarouselSection(statsCarousel.getDays_in_streak(), statsCarousel.getMinutes_listened_today()));
        }
        if (section instanceof HomeV3Response.Section.HomeActionList) {
            HomeV3Response.Section.HomeActionList homeActionList = (HomeV3Response.Section.HomeActionList) section;
            String title = homeActionList.getTitle();
            List<HomeV3Response.Section.HomeActionList.Item> items = homeActionList.getItems();
            ArrayList arrayList = new ArrayList(p.a0(items, 10));
            for (HomeV3Response.Section.HomeActionList.Item item : items) {
                arrayList.add(new HomePageV3.Section.HomeActionList.HomeActionItem(item.getTitle(), item.getIcon_url(), item.getDeeplink(), item.getAnalytics_id()));
            }
            return new HomePageV3.Section.HomeActionList(title, arrayList);
        }
        if (section instanceof HomeV3Response.Section.CategoryReadsRow) {
            HomeV3Response.Section.CategoryReadsRow categoryReadsRow = (HomeV3Response.Section.CategoryReadsRow) section;
            String title2 = categoryReadsRow.getTitle();
            String deeplink = categoryReadsRow.getDeeplink();
            List<BasicReadMeta> reads = categoryReadsRow.getReads();
            ArrayList arrayList2 = new ArrayList(p.a0(reads, 10));
            for (BasicReadMeta basicReadMeta : reads) {
                arrayList2.add(new io.elevenlabs.domain.model.BasicReadMeta(basicReadMeta.getReadId(), basicReadMeta.getTitle(), basicReadMeta.getImageUrl()));
            }
            return new HomePageV3.Section.CategoryReadsRow(new CategoryReadsRowSection(title2, deeplink, arrayList2));
        }
        if (section instanceof HomeV3Response.Section.GenreTilesGridRowSection) {
            HomeV3Response.Section.GenreTilesGridRowSection genreTilesGridRowSection = (HomeV3Response.Section.GenreTilesGridRowSection) section;
            String title3 = genreTilesGridRowSection.getTitle();
            List<HomeV3Response.Section.GenreTilesGridRowSection.Item> items2 = genreTilesGridRowSection.getItems();
            ArrayList arrayList3 = new ArrayList(p.a0(items2, 10));
            for (HomeV3Response.Section.GenreTilesGridRowSection.Item item2 : items2) {
                arrayList3.add(new GenreTilesGridRow.Tile(item2.getTitle(), item2.getIcon_url(), item2.getDeeplink(), item2.getAnalytics_id()));
            }
            return new HomePageV3.Section.GenreTilesGridRow(new GenreTilesGridRow(title3, arrayList3));
        }
        if (section instanceof HomeV3Response.Section.AnnouncementBannerCarouselSection) {
            HomeV3Response.Section.AnnouncementBannerCarouselSection announcementBannerCarouselSection = (HomeV3Response.Section.AnnouncementBannerCarouselSection) section;
            String title4 = announcementBannerCarouselSection.getTitle();
            List<HomeV3Response.Section.AnnouncementBannerCarouselSection.Item> items3 = announcementBannerCarouselSection.getItems();
            ArrayList arrayList4 = new ArrayList(p.a0(items3, 10));
            for (HomeV3Response.Section.AnnouncementBannerCarouselSection.Item item3 : items3) {
                arrayList4.add(new AnnouncementBannerCarouselSection.Banner(item3.getImage_url(), item3.getDeeplink(), item3.getAnalytics_id(), item3.getEyebrow_text(), item3.getHeader_text(), item3.getButton_text(), item3.getColor_hex()));
            }
            return new HomePageV3.Section.FeaturedCardList(new AnnouncementBannerCarouselSection(title4, arrayList4));
        }
        if (section instanceof HomeV3Response.Section.MiniReadGridSection) {
            List<HomeV3Response.Section.MiniReadGridSection.Item> items4 = ((HomeV3Response.Section.MiniReadGridSection) section).getItems();
            ArrayList arrayList5 = new ArrayList(p.a0(items4, 10));
            for (HomeV3Response.Section.MiniReadGridSection.Item item4 : items4) {
                arrayList5.add(new MiniReadGridSection.Item(item4.getTitle(), item4.getImage_url(), item4.getDeeplink(), item4.getAnalytics_id()));
            }
            return new HomePageV3.Section.MiniReadGrid(new MiniReadGridSection(arrayList5));
        }
        if (section instanceof HomeV3Response.Section.HighlightedCollectionsRowSection) {
            HomeV3Response.Section.HighlightedCollectionsRowSection highlightedCollectionsRowSection = (HomeV3Response.Section.HighlightedCollectionsRowSection) section;
            String title5 = highlightedCollectionsRowSection.getTitle();
            List<HomeV3Response.Section.HighlightedCollectionsRowSection.Item> items5 = highlightedCollectionsRowSection.getItems();
            ArrayList arrayList6 = new ArrayList(p.a0(items5, 10));
            for (HomeV3Response.Section.HighlightedCollectionsRowSection.Item item5 : items5) {
                arrayList6.add(new HighlightedCollectionsRowSection.Item(item5.getTitle(), item5.getSubtitle(), item5.getDeeplink(), item5.getImage_url(), item5.getAnalytics_id()));
            }
            return new HomePageV3.Section.HighlightedCollectionsRow(new HighlightedCollectionsRowSection(title5, arrayList6));
        }
        if (section instanceof HomeV3Response.Section.EmptyStateSection) {
            HomeV3Response.Section.EmptyStateSection emptyStateSection = (HomeV3Response.Section.EmptyStateSection) section;
            return new HomePageV3.Section.EmptyState(new EmptyStateSection(emptyStateSection.getTitle(), emptyStateSection.getSubtitle(), emptyStateSection.getButton_text(), emptyStateSection.getDeeplink()));
        }
        if (section instanceof HomeV3Response.Section.ReadFromFollowingSection) {
            HomeV3Response.Section.ReadFromFollowingSection readFromFollowingSection = (HomeV3Response.Section.ReadFromFollowingSection) section;
            ReadMeta domain = ReadMappingKt.toDomain(readFromFollowingSection.getRead());
            String followed_entity_type = readFromFollowingSection.getFollowed_entity_type();
            if (m.c(followed_entity_type, "Author")) {
                followedEntityType = FollowedEntityType.AUTHOR;
            } else if (m.c(followed_entity_type, "Collection")) {
                followedEntityType = FollowedEntityType.COLLECTION;
            } else {
                followedEntityType = null;
            }
            return new HomePageV3.Section.ReadFromFollowing(new ReadFromFollowingSection(domain, followedEntityType, readFromFollowingSection.getFollowed_entity_name(), readFromFollowingSection.getReleased_on_unix()));
        }
        c6.p();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HomePageV4.Section toDomain(HomeV4Response.Section section) {
        if (section instanceof HomeV4Response.Section.RecentReadsSection) {
            return new HomePageV4.Section.RecentReadsSection(((HomeV4Response.Section.RecentReadsSection) section).getTitle());
        }
        if (section instanceof HomeV4Response.Section.ActionListSection) {
            HomeV4Response.Section.ActionListSection actionListSection = (HomeV4Response.Section.ActionListSection) section;
            String title = actionListSection.getTitle();
            List<HomeV4Response.Section.ActionListSection.ActionItem> items = actionListSection.getItems();
            ArrayList arrayList = new ArrayList(p.a0(items, 10));
            for (HomeV4Response.Section.ActionListSection.ActionItem actionItem : items) {
                arrayList.add(new HomePageV4.Section.HomeActionList.HomeActionItem(actionItem.getTitle(), actionItem.getIcon_url(), actionItem.getDeeplink(), actionItem.getAnalytics_id()));
            }
            return new HomePageV4.Section.HomeActionList(title, arrayList);
        }
        if (section instanceof HomeV4Response.Section.StatsCarouselSection) {
            HomeV4Response.Section.StatsCarouselSection statsCarouselSection = (HomeV4Response.Section.StatsCarouselSection) section;
            return new HomePageV4.Section.StatsCarousel(statsCarouselSection.getTitle(), statsCarouselSection.getDays_in_streak(), statsCarouselSection.getMinutes_listened_today());
        }
        if (section instanceof HomeV4Response.Section.AnnouncementBannerCarouselSection) {
            HomeV4Response.Section.AnnouncementBannerCarouselSection announcementBannerCarouselSection = (HomeV4Response.Section.AnnouncementBannerCarouselSection) section;
            String title2 = announcementBannerCarouselSection.getTitle();
            List<HomeV4Response.Section.AnnouncementBannerCarouselSection.Item> items2 = announcementBannerCarouselSection.getItems();
            ArrayList arrayList2 = new ArrayList(p.a0(items2, 10));
            for (HomeV4Response.Section.AnnouncementBannerCarouselSection.Item item : items2) {
                arrayList2.add(new AnnouncementBannerCarouselSection.Banner(item.getImage_url(), item.getDeeplink(), item.getAnalytics_id(), item.getEyebrow_text(), item.getHeader_text(), item.getButton_text(), item.getColor_hex()));
            }
            return new HomePageV4.Section.FeaturedCardList(new AnnouncementBannerCarouselSection(title2, arrayList2));
        }
        if (section instanceof HomeV4Response.Section.HeroCarouselSection) {
            HomeV4Response.Section.HeroCarouselSection heroCarouselSection = (HomeV4Response.Section.HeroCarouselSection) section;
            String title3 = heroCarouselSection.getTitle();
            String subtitle = heroCarouselSection.getSubtitle();
            List<HomeV4Response.Section.HeroCarouselSection.HeroItem> items3 = heroCarouselSection.getItems();
            ArrayList arrayList3 = new ArrayList(p.a0(items3, 10));
            for (HomeV4Response.Section.HeroCarouselSection.HeroItem heroItem : items3) {
                arrayList3.add(new HomePageV4.Section.HeroCarousel.HeroItem(heroItem.getTitle(), heroItem.getSubtitle(), heroItem.getSwap_title_subtitle(), heroItem.getBackground_image_url(), heroItem.getBackground_video_url(), heroItem.getDeeplink(), heroItem.getUrl()));
            }
            return new HomePageV4.Section.HeroCarousel(title3, subtitle, arrayList3);
        }
        if (section instanceof HomeV4Response.Section.HighlightedCarouselSection) {
            HomeV4Response.Section.HighlightedCarouselSection highlightedCarouselSection = (HomeV4Response.Section.HighlightedCarouselSection) section;
            String title4 = highlightedCarouselSection.getTitle();
            String subtitle2 = highlightedCarouselSection.getSubtitle();
            String deeplink = highlightedCarouselSection.getDeeplink();
            List<ExploreReadResponseModel> reads = highlightedCarouselSection.getReads();
            ArrayList arrayList4 = new ArrayList(p.a0(reads, 10));
            Iterator<T> it = reads.iterator();
            while (it.hasNext()) {
                arrayList4.add(DataModelsToDomainModelsKt.toDomain((ExploreReadResponseModel) it.next()));
            }
            return new HomePageV4.Section.HighlightedCarousel(title4, subtitle2, deeplink, arrayList4);
        }
        if (section instanceof HomeV4Response.Section.MediumCarouselSection) {
            HomeV4Response.Section.MediumCarouselSection mediumCarouselSection = (HomeV4Response.Section.MediumCarouselSection) section;
            String title5 = mediumCarouselSection.getTitle();
            String subtitle3 = mediumCarouselSection.getSubtitle();
            String deeplink2 = mediumCarouselSection.getDeeplink();
            List<ExploreReadResponseModel> reads2 = mediumCarouselSection.getReads();
            ArrayList arrayList5 = new ArrayList(p.a0(reads2, 10));
            Iterator<T> it2 = reads2.iterator();
            while (it2.hasNext()) {
                arrayList5.add(DataModelsToDomainModelsKt.toDomain((ExploreReadResponseModel) it2.next()));
            }
            return new HomePageV4.Section.MediumCarousel(title5, subtitle3, deeplink2, arrayList5);
        }
        if (section instanceof HomeV4Response.Section.MiniReadGridSection) {
            List<HomeV4Response.Section.MiniReadGridSection.Item> items4 = ((HomeV4Response.Section.MiniReadGridSection) section).getItems();
            ArrayList arrayList6 = new ArrayList(p.a0(items4, 10));
            for (HomeV4Response.Section.MiniReadGridSection.Item item2 : items4) {
                arrayList6.add(new MiniReadGridSection.Item(item2.getTitle(), item2.getImage_url(), item2.getDeeplink(), item2.getAnalytics_id()));
            }
            return new HomePageV4.Section.MiniReadGrid(new MiniReadGridSection(arrayList6));
        }
        if (section instanceof HomeV4Response.Section.WarningSection) {
            return new HomePageV4.Section.WarningSection(((HomeV4Response.Section.WarningSection) section).getMarkdown());
        }
        c6.p();
        return null;
    }
}
