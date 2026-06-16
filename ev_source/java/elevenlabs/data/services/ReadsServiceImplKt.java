package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.extensions.DataModelsToDomainModelsKt;
import io.elevenlabs.data.model.DetailsItem;
import io.elevenlabs.data.model.response.ChapterItem;
import io.elevenlabs.data.model.response.FlatCarouselSection;
import io.elevenlabs.data.model.response.LimitedBasedReadApiErrorData;
import io.elevenlabs.data.model.response.MediaHeader;
import io.elevenlabs.data.model.response.MetaSection;
import io.elevenlabs.data.model.response.ReadDetailsAuthorSection;
import io.elevenlabs.data.model.response.ReadDetailsChaptersSection;
import io.elevenlabs.data.model.response.ReadDetailsDetailsSection;
import io.elevenlabs.data.model.response.ReadDetailsReadActions;
import io.elevenlabs.data.model.response.ReadDetailsSection;
import io.elevenlabs.data.model.response.ReadDetailsTitleDescriptionSection;
import io.elevenlabs.data.model.response.ReadSection;
import io.elevenlabs.data.model.response.ReadsSection;
import io.elevenlabs.data.model.response.ReadsV2Section;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.PaymentConfig;
import io.elevenlabs.domain.model.ReadDetailsButtons;
import io.elevenlabs.domain.model.ReadDetailsResponse;
import io.elevenlabs.domain.model.ReadDetailsSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0002\u001a\f\u0010\u0000\u001a\u00020\u000b*\u00020\fH\u0002\u001a\f\u0010\u0000\u001a\u00020\r*\u00020\u000eH\u0002\u001a\f\u0010\u0000\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0011*\u00020\u0012H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0013*\u00020\u0014H\u0002¨\u0006\u0015"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/LimitReachedData;", "Lio/elevenlabs/data/model/response/LimitedBasedReadApiErrorData;", "message", "", "Lio/elevenlabs/domain/model/ReadDetailsResponse;", "Lio/elevenlabs/data/model/response/ReadDetailsResponse;", "Lio/elevenlabs/domain/model/ReadDetailsButtons;", "Lio/elevenlabs/data/model/response/ReadDetailsButtons;", "Lio/elevenlabs/domain/model/PaymentConfig;", "Lio/elevenlabs/data/model/PaymentConfig;", "Lio/elevenlabs/domain/model/ReadDetailsTitleDescriptionSection;", "Lio/elevenlabs/data/model/response/ReadDetailsTitleDescriptionSection;", "Lio/elevenlabs/domain/model/ReadDetailsDetailsSection;", "Lio/elevenlabs/data/model/response/ReadDetailsDetailsSection;", "Lio/elevenlabs/domain/model/ReadDetailsReadActions;", "Lio/elevenlabs/data/model/response/ReadDetailsReadActions;", "Lio/elevenlabs/domain/model/ReadDetailsAuthorSection;", "Lio/elevenlabs/data/model/response/ReadDetailsAuthorSection;", "Lio/elevenlabs/domain/model/ReadDetailsChaptersSection;", "Lio/elevenlabs/data/model/response/ReadDetailsChaptersSection;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsServiceImplKt {
    public static final ReadDetailsResponse toDomain(io.elevenlabs.data.model.response.ReadDetailsResponse readDetailsResponse) {
        PaymentConfig paymentConfig;
        Object chapters;
        List<ReadDetailsSection> sections = readDetailsResponse.getSections();
        ArrayList arrayList = new ArrayList(p.a0(sections, 10));
        for (ReadDetailsSection readDetailsSection : sections) {
            if (readDetailsSection instanceof MediaHeader) {
                chapters = new ReadDetailsSection.MediaHeader(DataModelsToDomainModelsKt.toDomain((MediaHeader) readDetailsSection));
            } else if (readDetailsSection instanceof MetaSection) {
                chapters = new ReadDetailsSection.Meta(DataModelsToDomainModelsKt.toDomain((MetaSection) readDetailsSection));
            } else if (readDetailsSection instanceof ReadDetailsTitleDescriptionSection) {
                chapters = new ReadDetailsSection.TitleDescription(toDomain((ReadDetailsTitleDescriptionSection) readDetailsSection));
            } else if (readDetailsSection instanceof ReadDetailsDetailsSection) {
                chapters = new ReadDetailsSection.Details(toDomain((ReadDetailsDetailsSection) readDetailsSection));
            } else if (readDetailsSection instanceof ReadDetailsReadActions) {
                chapters = new ReadDetailsSection.ReadActions(toDomain((ReadDetailsReadActions) readDetailsSection));
            } else if (readDetailsSection instanceof ReadDetailsAuthorSection) {
                chapters = new ReadDetailsSection.Author(toDomain((ReadDetailsAuthorSection) readDetailsSection));
            } else if (readDetailsSection instanceof FlatCarouselSection) {
                chapters = new ReadDetailsSection.FlatCarousel(DataModelsToDomainModelsKt.toDomain((FlatCarouselSection) readDetailsSection));
            } else if (readDetailsSection instanceof ReadsSection) {
                chapters = new ReadDetailsSection.Reads(DataModelsToDomainModelsKt.toDomain((ReadsSection) readDetailsSection));
            } else if (readDetailsSection instanceof ReadsV2Section) {
                chapters = new ReadDetailsSection.ReadsV2(DataModelsToDomainModelsKt.toDomain((ReadsV2Section) readDetailsSection));
            } else if (readDetailsSection instanceof ReadSection) {
                chapters = new ReadDetailsSection.Read(DataModelsToDomainModelsKt.toDomain((ReadSection) readDetailsSection));
            } else if (readDetailsSection instanceof ReadDetailsChaptersSection) {
                chapters = new ReadDetailsSection.Chapters(toDomain((ReadDetailsChaptersSection) readDetailsSection));
            } else {
                c6.p();
                return null;
            }
            arrayList.add(chapters);
        }
        ExplorePricingType fromString = ExplorePricingType.INSTANCE.fromString(readDetailsResponse.getPricingType());
        io.elevenlabs.data.model.PaymentConfig paymentConfig2 = readDetailsResponse.getPaymentConfig();
        ReadDetailsButtons readDetailsButtons = null;
        if (paymentConfig2 != null) {
            paymentConfig = toDomain(paymentConfig2);
        } else {
            paymentConfig = null;
        }
        String previewUrl = readDetailsResponse.getPreviewUrl();
        String shareUrl = readDetailsResponse.getShareUrl();
        String sampleReadId = readDetailsResponse.getSampleReadId();
        io.elevenlabs.data.model.response.ReadDetailsButtons buttons = readDetailsResponse.getButtons();
        if (buttons != null) {
            readDetailsButtons = toDomain(buttons);
        }
        return new ReadDetailsResponse(arrayList, fromString, paymentConfig, previewUrl, shareUrl, sampleReadId, readDetailsButtons, readDetailsResponse.getInReadLater());
    }

    public static final LimitReachedData toDomain(LimitedBasedReadApiErrorData limitedBasedReadApiErrorData, String str) {
        return new LimitReachedData(str, limitedBasedReadApiErrorData.getLimit(), limitedBasedReadApiErrorData.getCanUpgrade());
    }

    private static final ReadDetailsButtons toDomain(io.elevenlabs.data.model.response.ReadDetailsButtons readDetailsButtons) {
        return new ReadDetailsButtons(readDetailsButtons.getDisabledReason());
    }

    private static final PaymentConfig toDomain(io.elevenlabs.data.model.PaymentConfig paymentConfig) {
        return new PaymentConfig(paymentConfig.getAndroidProductId(), paymentConfig.getWebUrl(), paymentConfig.getPriceFormatted(), paymentConfig.getZeroPriceFormatted());
    }

    private static final io.elevenlabs.domain.model.ReadDetailsTitleDescriptionSection toDomain(ReadDetailsTitleDescriptionSection readDetailsTitleDescriptionSection) {
        return new io.elevenlabs.domain.model.ReadDetailsTitleDescriptionSection(readDetailsTitleDescriptionSection.getTitle(), readDetailsTitleDescriptionSection.getDescription());
    }

    private static final io.elevenlabs.domain.model.ReadDetailsDetailsSection toDomain(ReadDetailsDetailsSection readDetailsDetailsSection) {
        List<DetailsItem> items = readDetailsDetailsSection.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        for (DetailsItem detailsItem : items) {
            arrayList.add(new io.elevenlabs.domain.model.DetailsItem(detailsItem.getTitle(), detailsItem.getValue()));
        }
        return new io.elevenlabs.domain.model.ReadDetailsDetailsSection(arrayList);
    }

    private static final io.elevenlabs.domain.model.ReadDetailsReadActions toDomain(ReadDetailsReadActions readDetailsReadActions) {
        return new io.elevenlabs.domain.model.ReadDetailsReadActions(readDetailsReadActions.getReadId());
    }

    private static final io.elevenlabs.domain.model.ReadDetailsAuthorSection toDomain(ReadDetailsAuthorSection readDetailsAuthorSection) {
        return new io.elevenlabs.domain.model.ReadDetailsAuthorSection(readDetailsAuthorSection.getAvatarUrl(), readDetailsAuthorSection.getName(), readDetailsAuthorSection.getPenName(), readDetailsAuthorSection.getBio(), readDetailsAuthorSection.getAuthorId());
    }

    private static final io.elevenlabs.domain.model.ReadDetailsChaptersSection toDomain(ReadDetailsChaptersSection readDetailsChaptersSection) {
        String title = readDetailsChaptersSection.getTitle();
        List<ChapterItem> items = readDetailsChaptersSection.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new io.elevenlabs.domain.model.ChapterItem(((ChapterItem) it.next()).getName()));
        }
        return new io.elevenlabs.domain.model.ReadDetailsChaptersSection(title, arrayList);
    }
}
