package io.elevenlabs.data.model.response;

import io.elevenlabs.data.model.response.ExploreVoicesResponse;
import io.elevenlabs.data.model.response.GetAccountResponse;
import io.elevenlabs.data.model.response.GetCreditHistorySectionsResponse;
import io.elevenlabs.data.model.response.GetExploreSearchResponse;
import io.elevenlabs.data.model.response.GetReadsExplorePageResponseModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14108a;

    public /* synthetic */ a(int i10) {
        this.f14108a = i10;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f14108a) {
            case 0:
                return ExploreVoicesResponse.Section.HomeFeaturedSection.b();
            case 1:
                return ExploreVoicesResponse.Section.HomeFeaturedSection.a();
            case 2:
                return ExploreVoicesResponse.Section.HomeGridSection.a();
            case 3:
                return ExploreVoicesResponse.Section.HomeListSection.a();
            case 4:
                return ExploreVoicesResponse.Section.HomeVoiceCollectionSection.a();
            case 5:
                return ExploreVoicesResponse.Section.VoicePickerFeaturedSection.a();
            case 6:
                return ExploreVoicesResponse.Section.VoicePickerFeaturedSection.b();
            case 7:
                return ExploreVoicesResponse.Section.VoicePickerGridSection.a();
            case 8:
                return ExploreVoicesResponse.Section.VoicePickerListSection.a();
            case 9:
                return ExploreVoicesResponse.Section.VoicePickerVoiceCollectionSection.a();
            case 10:
                return FlatCarouselSection.a();
            case 11:
                return GetAccountResponse.a();
            case 12:
                return GetAccountResponse.Section.HelpfulResourcesV2.a();
            case 13:
                return GetAccountResponse.Section.LocalSettings.a();
            case 14:
                return GetAccountResponse.Section.TermsAndConditions.a();
            case 15:
                return GetCollectionResponse.a();
            case 16:
                return GetCreditHistoryResponse.a();
            case 17:
                return GetCreditHistorySectionsResponse.a();
            case 18:
                return GetCreditHistorySectionsResponse.Section.UsageExtraHours.a();
            case 19:
                return GetExploreSearchResponse.a();
            case 20:
                return GetExploreSearchResponse.Section.SearchList.a();
            case 21:
                return GetPublisherReadsResponse.a();
            case 22:
                return GetReadCollectionsResponse.a();
            case 23:
                return GetReadsChangesResponseModel.b();
            case 24:
                return GetReadsChangesResponseModel.a();
            case 25:
                return GetReadsExplorePageResponseModel.b();
            case 26:
                return GetReadsExplorePageResponseModel.c();
            case 27:
                return GetReadsExplorePageResponseModel.a();
            case 28:
                return GetReadsExplorePageResponseModel.PageFilter.ExplorePageMultiOptionFilterResponseModel.a();
            default:
                return GetReadsExplorePageResponseModel.PageFilter.ExplorePageOneOptionFilterResponseModel.a();
        }
    }
}
