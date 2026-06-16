package io.elevenlabs.data.model.response;

import io.elevenlabs.data.model.response.GetReadsExplorePageResponseModel;
import io.elevenlabs.data.model.response.GetVoicesHomeResponse;
import io.elevenlabs.data.model.response.HomeV3Response;
import io.elevenlabs.data.model.response.HomeV4Response;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14109a;

    public /* synthetic */ b(int i10) {
        this.f14109a = i10;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f14109a) {
            case 0:
                return GetReadsExplorePageResponseModel.Section.GetReadsExploreCardCollectionResponseModel.a();
            case 1:
                return GetReadsExplorePageResponseModel.Section.GetReadsExploreHeroCarouselResponseModel.a();
            case 2:
                return GetReadsExplorePageResponseModel.Section.GetReadsExploreHighlightedCarouselResponseModel.a();
            case 3:
                return GetReadsExplorePageResponseModel.Section.GetReadsExploreLargeGridResponseModel.a();
            case 4:
                return GetReadsExplorePageResponseModel.Section.GetReadsExploreSmallGridResponseModel.a();
            case 5:
                return GetReadsExplorePageResponseModel.Section.GetReadsExploreVoiceCollectionResponseModel.a();
            case 6:
                return GetReadsExplorePageResponseModel.Section.GetReadsExploreVoiceCollectionResponseModel.VoiceItem.a();
            case 7:
                return GetReadsResponseModel.a();
            case 8:
                return GetSoundscapesResponse.a();
            case 9:
                return GetUserCollectionsResponse.a();
            case 10:
                return GetVoicesHomeResponse.a();
            case 11:
                return GetVoicesHomeResponse.Section.VoiceCarouselSection.a();
            case 12:
                return GetVoicesHomeResponse.Section.VoiceGridSection.a();
            case 13:
                return HomeV3Response.b();
            case 14:
                return HomeV3Response.a();
            case 15:
                return HomeV3Response.Section.AnnouncementBannerCarouselSection.a();
            case 16:
                return HomeV3Response.Section.CategoryReadsRow.a();
            case 17:
                return HomeV3Response.Section.GenreTilesGridRowSection.a();
            case 18:
                return HomeV3Response.Section.HighlightedCollectionsRowSection.a();
            case 19:
                return HomeV3Response.Section.HomeActionList.a();
            case 20:
                return HomeV3Response.Section.MiniReadGridSection.a();
            case 21:
                return HomeV3SubpageResponse.a();
            case 22:
                return HomeV4Response.a();
            case 23:
                return HomeV4Response.Section.ActionListSection.a();
            case 24:
                return HomeV4Response.Section.AnnouncementBannerCarouselSection.a();
            case 25:
                return HomeV4Response.Section.HeroCarouselSection.a();
            case 26:
                return HomeV4Response.Section.HighlightedCarouselSection.a();
            case 27:
                return HomeV4Response.Section.MediumCarouselSection.a();
            case 28:
                return HomeV4Response.Section.MiniReadGridSection.a();
            default:
                return MediaHeader.a();
        }
    }
}
