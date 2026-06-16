package io.elevenlabs.data.extensions;

import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.data.model.BigDecimalJson;
import io.elevenlabs.data.model.MetaItem;
import io.elevenlabs.data.model.SizeableHeaderImage;
import io.elevenlabs.data.model.response.ExploreReadResponseModel;
import io.elevenlabs.data.model.response.FlatCarouselItem;
import io.elevenlabs.data.model.response.MediaHeader;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import io.elevenlabs.data.model.response.ReadPurchaseConfigResponseModel;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.FlatCarouselSection;
import io.elevenlabs.domain.model.MediaHeaderSection;
import io.elevenlabs.domain.model.MetaSection;
import io.elevenlabs.domain.model.ReadSection;
import io.elevenlabs.domain.model.ReadsSection;
import io.elevenlabs.domain.model.ReadsV2Section;
import io.elevenlabs.domain.model.SeriesSection;
import io.elevenlabs.domain.model.Tag;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import t2.u;
import tn.p;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0000\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\u0000\u001a\u00020\r*\u00020\u000e\u001a\n\u0010\u0000\u001a\u00020\u000f*\u00020\u0010\u001a\n\u0010\u0000\u001a\u00020\u0011*\u00020\u0012\u001a\n\u0010\u0000\u001a\u00020\u0013*\u00020\u0014\u001a\n\u0010\u0000\u001a\u00020\u0015*\u00020\u0016¨\u0006\u0017"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/SizeableHeaderImage;", "Lio/elevenlabs/data/model/SizeableHeaderImage;", "Lio/elevenlabs/domain/model/Tag;", "Lio/elevenlabs/data/model/Tag;", "Lio/elevenlabs/domain/model/MetaSection;", "Lio/elevenlabs/data/model/response/MetaSection;", "Lio/elevenlabs/domain/model/SeriesSection;", "Lio/elevenlabs/data/model/response/SeriesSection;", "Lio/elevenlabs/domain/model/ReadsSection;", "Lio/elevenlabs/data/model/response/ReadsSection;", "Lio/elevenlabs/domain/model/ReadsV2Section;", "Lio/elevenlabs/data/model/response/ReadsV2Section;", "Lio/elevenlabs/domain/model/ReadSection;", "Lio/elevenlabs/data/model/response/ReadSection;", "Lio/elevenlabs/domain/model/MediaHeaderSection;", "Lio/elevenlabs/data/model/response/MediaHeader;", "Lio/elevenlabs/domain/model/FlatCarouselSection;", "Lio/elevenlabs/data/model/response/FlatCarouselSection;", "Lio/elevenlabs/domain/model/FlatCarouselItem;", "Lio/elevenlabs/data/model/response/FlatCarouselItem;", "Lio/elevenlabs/domain/model/ExploreRead;", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DataModelsToDomainModelsKt {
    public static final ExploreRead toDomain(ExploreReadResponseModel exploreReadResponseModel) {
        exploreReadResponseModel.getClass();
        String readId = exploreReadResponseModel.getReadId();
        String title = exploreReadResponseModel.getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        String author = exploreReadResponseModel.getAuthor();
        String articleImageUrl = exploreReadResponseModel.getArticleImageUrl();
        Float audioDurationSeconds = exploreReadResponseModel.getAudioDurationSeconds();
        Float averageRating = exploreReadResponseModel.getAverageRating();
        String str2 = null;
        if (averageRating == null || averageRating.floatValue() <= u.P) {
            averageRating = null;
        }
        Integer totalRatingCount = exploreReadResponseModel.getTotalRatingCount();
        ExplorePricingType fromString = ExplorePricingType.INSTANCE.fromString(exploreReadResponseModel.getPricingType());
        Float listPrice = exploreReadResponseModel.getListPrice();
        String currency = exploreReadResponseModel.getCurrency();
        Integer addedToLibraryCount = exploreReadResponseModel.getAddedToLibraryCount();
        ReadPurchaseConfigResponseModel purchaseConfig = exploreReadResponseModel.getPurchaseConfig();
        if (purchaseConfig != null) {
            str2 = purchaseConfig.getAndroidProductId();
        }
        return new ExploreRead(readId, str, author, articleImageUrl, audioDurationSeconds, averageRating, totalRatingCount, fromString, listPrice, currency, addedToLibraryCount, str2, exploreReadResponseModel.getPreviewAudioUrl(), exploreReadResponseModel.getCoverImageUrls(), exploreReadResponseModel.getCoverAspectRatio(), exploreReadResponseModel.getBlurPlaceholder());
    }

    public static final Tag toDomain(io.elevenlabs.data.model.Tag tag) {
        tag.getClass();
        return new Tag(tag.getTitle(), tag.getIconUrl());
    }

    public static final MetaSection toDomain(io.elevenlabs.data.model.response.MetaSection metaSection) {
        metaSection.getClass();
        List<MetaItem> items = metaSection.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        for (MetaItem metaItem : items) {
            arrayList.add(new io.elevenlabs.domain.model.MetaItem(metaItem.getTitle(), metaItem.getValue()));
        }
        return new MetaSection(arrayList);
    }

    public static final SeriesSection toDomain(io.elevenlabs.data.model.response.SeriesSection seriesSection) {
        seriesSection.getClass();
        return new SeriesSection(seriesSection.getDeeplink(), seriesSection.getTitle(), seriesSection.getSubtitle(), seriesSection.getImageUrl());
    }

    public static final ReadsSection toDomain(io.elevenlabs.data.model.response.ReadsSection readsSection) {
        readsSection.getClass();
        String title = readsSection.getTitle();
        List<ReadMetadataResponseModel> items = readsSection.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(ReadMappingKt.toDomain((ReadMetadataResponseModel) it.next()));
        }
        return new ReadsSection(title, arrayList);
    }

    public static final ReadsV2Section toDomain(io.elevenlabs.data.model.response.ReadsV2Section readsV2Section) {
        readsV2Section.getClass();
        String title = readsV2Section.getTitle();
        List<ExploreReadResponseModel> items = readsV2Section.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((ExploreReadResponseModel) it.next()));
        }
        return new ReadsV2Section(title, arrayList);
    }

    public static final ReadSection toDomain(io.elevenlabs.data.model.response.ReadSection readSection) {
        readSection.getClass();
        return new ReadSection(ReadMappingKt.toDomain(readSection.getRead()), readSection.getOrderLabel());
    }

    public static final MediaHeaderSection toDomain(MediaHeader mediaHeader) {
        List list;
        mediaHeader.getClass();
        SizeableHeaderImage image = mediaHeader.getImage();
        io.elevenlabs.domain.model.SizeableHeaderImage domain = image != null ? toDomain(image) : null;
        String title = mediaHeader.getTitle();
        String author = mediaHeader.getAuthor();
        String authorId = mediaHeader.getAuthorId();
        List<io.elevenlabs.data.model.Tag> tags = mediaHeader.getTags();
        if (tags != null) {
            list = new ArrayList(p.a0(tags, 10));
            Iterator<T> it = tags.iterator();
            while (it.hasNext()) {
                list.add(toDomain((io.elevenlabs.data.model.Tag) it.next()));
            }
        } else {
            list = t.f33547a;
        }
        return new MediaHeaderSection(domain, title, author, authorId, list, mediaHeader.getSubtitle(), mediaHeader.getMetaLabel());
    }

    public static final FlatCarouselSection toDomain(io.elevenlabs.data.model.response.FlatCarouselSection flatCarouselSection) {
        flatCarouselSection.getClass();
        String title = flatCarouselSection.getTitle();
        List<FlatCarouselItem> items = flatCarouselSection.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((FlatCarouselItem) it.next()));
        }
        return new FlatCarouselSection(title, arrayList);
    }

    public static final io.elevenlabs.domain.model.FlatCarouselItem toDomain(FlatCarouselItem flatCarouselItem) {
        flatCarouselItem.getClass();
        return new io.elevenlabs.domain.model.FlatCarouselItem(flatCarouselItem.getDeeplink(), flatCarouselItem.getTitle(), flatCarouselItem.getSubtitle(), flatCarouselItem.getImageUrl());
    }

    public static final io.elevenlabs.domain.model.SizeableHeaderImage toDomain(SizeableHeaderImage sizeableHeaderImage) {
        BigDecimal value;
        BigDecimal value2;
        sizeableHeaderImage.getClass();
        String imageUrl = sizeableHeaderImage.getImageUrl();
        float floatValue = sizeableHeaderImage.getAspectRatio().getValue().floatValue();
        float floatValue2 = sizeableHeaderImage.getScreenWidthRatio().getValue().floatValue();
        BigDecimalJson maxWidth = sizeableHeaderImage.getMaxWidth();
        float floatValue3 = (maxWidth == null || (value2 = maxWidth.getValue()) == null) ? Float.MAX_VALUE : value2.floatValue();
        BigDecimalJson cornerRadius = sizeableHeaderImage.getCornerRadius();
        return new io.elevenlabs.domain.model.SizeableHeaderImage(imageUrl, floatValue, floatValue2, floatValue3, (cornerRadius == null || (value = cornerRadius.getValue()) == null) ? null : Float.valueOf(value.floatValue()));
    }
}
