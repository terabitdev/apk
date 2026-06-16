package io.elevenlabs.highlighter;

import io.elevenlabs.domain.model.AnnouncementBannerCarouselSection;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.MiniReadGridSection;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.ocr.usecase.RecognizeDocumentTextUseCase;
import io.elevenlabs.payments.InAppPurchasesService;
import io.elevenlabs.readerapp.core.extensions.StringExtensionsKt;
import io.elevenlabs.readerapp.paging.ExploreCollectionItemsPagingSource;
import io.elevenlabs.readerapp.paging.ExploreFilteredContentPagingSource;
import io.elevenlabs.readerapp.services.AndroidConnectivityService;
import io.elevenlabs.readerapp.ui.components.CategorieCollectionRowKt;
import io.elevenlabs.readerapp.ui.components.ComposableSingletons$AnnouncementBannerCarouselKt;
import io.elevenlabs.readerapp.ui.components.ComposableSingletons$MiniReadGridKt;
import io.elevenlabs.readerapp.ui.components.ComposableSingletons$ReadSectionKt;
import io.elevenlabs.readerapp.ui.components.FeedReadCarouselSectionKt;
import io.elevenlabs.readerapp.ui.components.ReadSmallRowKt;
import java.util.List;
import p4.b0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14258a;

    public /* synthetic */ z(int i10) {
        this.f14258a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        sn.z Preview_Highlighter_InfoBox$lambda$0$2$0;
        sn.z Preview_Highlighter_EmptyParagraphs$lambda$0$3$0;
        sn.z Preview_Highlighter_Styling$lambda$0$1$0;
        sn.z Preview_Highlighter_Styling$lambda$0$2$0;
        sn.z Preview_Highlighter_Styling$lambda$0$3$0;
        sn.z Preview_Highlighter_Lists_Ordered_Nested$lambda$0$1$0;
        sn.z Preview_Highlighter_Lists_Ordered_Nested$lambda$0$2$0;
        sn.z Preview_Highlighter_InfoBox$lambda$0$3$0;
        jd.x withBillingClient$lambda$0;
        InAppPurchasesService.BillingClientResult purchaseRead$lambda$2;
        jd.x withBillingClient$lambda$2;
        AsyncCallResult withBillingClient$lambda$4;
        CharSequence capitalizeWords$lambda$0;
        sn.z _init_$lambda$0;
        sn.z Preview_CategorieCollectionsRow$lambda$0$0$0;
        sn.z Preview_CategorieCollectionsRow$lambda$0$1$0;
        sn.z Preview_CategorieCollectionsRow$lambda$0$2$0;
        sn.z Preview_CategorieCollectionsRow$lambda$0$3$0;
        sn.z Preview_CategorieCollectionsRow$lambda$0$4$0;
        sn.z Preview_CategorieCollectionsRow$lambda$0$5$0;
        sn.z lambda_1896373561$lambda$0$0$0;
        sn.z lambda__1396625766$lambda$0$0$0;
        sn.z lambda_142583706$lambda$0$0$0;
        sn.z lambda__272376320$lambda$0$0$0;
        sn.z Preview_FeedReadCarouselSection$lambda$0$0;
        sn.z Preview_FeedReadCarouselSection$lambda$1$0;
        sn.z ReadSmallRow_gMrHQkA$lambda$2$0$0$0$0;
        switch (this.f14258a) {
            case 0:
                Preview_Highlighter_InfoBox$lambda$0$2$0 = HighlighterPreviewsKt.Preview_Highlighter_InfoBox$lambda$0$2$0((String) obj);
                return Preview_Highlighter_InfoBox$lambda$0$2$0;
            case 1:
                Preview_Highlighter_EmptyParagraphs$lambda$0$3$0 = HighlighterPreviewsKt.Preview_Highlighter_EmptyParagraphs$lambda$0$3$0((String) obj);
                return Preview_Highlighter_EmptyParagraphs$lambda$0$3$0;
            case 2:
                Preview_Highlighter_Styling$lambda$0$1$0 = HighlighterPreviewsKt.Preview_Highlighter_Styling$lambda$0$1$0((WordTapTarget) obj);
                return Preview_Highlighter_Styling$lambda$0$1$0;
            case 3:
                Preview_Highlighter_Styling$lambda$0$2$0 = HighlighterPreviewsKt.Preview_Highlighter_Styling$lambda$0$2$0((String) obj);
                return Preview_Highlighter_Styling$lambda$0$2$0;
            case 4:
                Preview_Highlighter_Styling$lambda$0$3$0 = HighlighterPreviewsKt.Preview_Highlighter_Styling$lambda$0$3$0((String) obj);
                return Preview_Highlighter_Styling$lambda$0$3$0;
            case 5:
                Preview_Highlighter_Lists_Ordered_Nested$lambda$0$1$0 = HighlighterPreviewsKt.Preview_Highlighter_Lists_Ordered_Nested$lambda$0$1$0((WordTapTarget) obj);
                return Preview_Highlighter_Lists_Ordered_Nested$lambda$0$1$0;
            case 6:
                Preview_Highlighter_Lists_Ordered_Nested$lambda$0$2$0 = HighlighterPreviewsKt.Preview_Highlighter_Lists_Ordered_Nested$lambda$0$2$0((String) obj);
                return Preview_Highlighter_Lists_Ordered_Nested$lambda$0$2$0;
            case 7:
                Preview_Highlighter_InfoBox$lambda$0$3$0 = HighlighterPreviewsKt.Preview_Highlighter_InfoBox$lambda$0$3$0((String) obj);
                return Preview_Highlighter_InfoBox$lambda$0$3$0;
            case 8:
                return RecognizeDocumentTextUseCase.a((lj.d) obj);
            case 9:
                withBillingClient$lambda$0 = InAppPurchasesService.withBillingClient$lambda$0((ho.l) obj);
                return withBillingClient$lambda$0;
            case 10:
                purchaseRead$lambda$2 = InAppPurchasesService.purchaseRead$lambda$2((Exception) obj);
                return purchaseRead$lambda$2;
            case 11:
                withBillingClient$lambda$2 = InAppPurchasesService.withBillingClient$lambda$2((ho.l) obj);
                return withBillingClient$lambda$2;
            case 12:
                withBillingClient$lambda$4 = InAppPurchasesService.withBillingClient$lambda$4((Exception) obj);
                return withBillingClient$lambda$4;
            case 13:
                capitalizeWords$lambda$0 = StringExtensionsKt.capitalizeWords$lambda$0((String) obj);
                return capitalizeWords$lambda$0;
            case 14:
                _init_$lambda$0 = ExploreCollectionItemsPagingSource._init_$lambda$0((List) obj);
                return _init_$lambda$0;
            case 15:
                return ExploreFilteredContentPagingSource.a((List) obj);
            case 16:
                return AndroidConnectivityService.a(((Boolean) obj).booleanValue());
            case 17:
                Preview_CategorieCollectionsRow$lambda$0$0$0 = CategorieCollectionRowKt.Preview_CategorieCollectionsRow$lambda$0$0$0((String) obj);
                return Preview_CategorieCollectionsRow$lambda$0$0$0;
            case 18:
                Preview_CategorieCollectionsRow$lambda$0$1$0 = CategorieCollectionRowKt.Preview_CategorieCollectionsRow$lambda$0$1$0((String) obj);
                return Preview_CategorieCollectionsRow$lambda$0$1$0;
            case 19:
                Preview_CategorieCollectionsRow$lambda$0$2$0 = CategorieCollectionRowKt.Preview_CategorieCollectionsRow$lambda$0$2$0((String) obj);
                return Preview_CategorieCollectionsRow$lambda$0$2$0;
            case 20:
                Preview_CategorieCollectionsRow$lambda$0$3$0 = CategorieCollectionRowKt.Preview_CategorieCollectionsRow$lambda$0$3$0((String) obj);
                return Preview_CategorieCollectionsRow$lambda$0$3$0;
            case 21:
                Preview_CategorieCollectionsRow$lambda$0$4$0 = CategorieCollectionRowKt.Preview_CategorieCollectionsRow$lambda$0$4$0((String) obj);
                return Preview_CategorieCollectionsRow$lambda$0$4$0;
            case 22:
                Preview_CategorieCollectionsRow$lambda$0$5$0 = CategorieCollectionRowKt.Preview_CategorieCollectionsRow$lambda$0$5$0((String) obj);
                return Preview_CategorieCollectionsRow$lambda$0$5$0;
            case 23:
                lambda_1896373561$lambda$0$0$0 = ComposableSingletons$AnnouncementBannerCarouselKt.lambda_1896373561$lambda$0$0$0((AnnouncementBannerCarouselSection.Banner) obj);
                return lambda_1896373561$lambda$0$0$0;
            case 24:
                lambda__1396625766$lambda$0$0$0 = ComposableSingletons$AnnouncementBannerCarouselKt.lambda__1396625766$lambda$0$0$0((AnnouncementBannerCarouselSection.Banner) obj);
                return lambda__1396625766$lambda$0$0$0;
            case 25:
                lambda_142583706$lambda$0$0$0 = ComposableSingletons$MiniReadGridKt.lambda_142583706$lambda$0$0$0((MiniReadGridSection.Item) obj);
                return lambda_142583706$lambda$0$0$0;
            case 26:
                lambda__272376320$lambda$0$0$0 = ComposableSingletons$ReadSectionKt.lambda__272376320$lambda$0$0$0((String) obj);
                return lambda__272376320$lambda$0$0$0;
            case 27:
                Preview_FeedReadCarouselSection$lambda$0$0 = FeedReadCarouselSectionKt.Preview_FeedReadCarouselSection$lambda$0$0((String) obj);
                return Preview_FeedReadCarouselSection$lambda$0$0;
            case 28:
                Preview_FeedReadCarouselSection$lambda$1$0 = FeedReadCarouselSectionKt.Preview_FeedReadCarouselSection$lambda$1$0((ReadMeta) obj);
                return Preview_FeedReadCarouselSection$lambda$1$0;
            default:
                ReadSmallRow_gMrHQkA$lambda$2$0$0$0$0 = ReadSmallRowKt.ReadSmallRow_gMrHQkA$lambda$2$0$0$0$0((b0) obj);
                return ReadSmallRow_gMrHQkA$lambda$2$0$0$0$0;
        }
    }
}
