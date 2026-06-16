package io.elevenlabs.data.services;

import io.elevenlabs.data.api.InterestsQuestionResponseModel;
import io.elevenlabs.data.model.ReaderOnboardingSurveyModelOutput;
import io.elevenlabs.data.model.response.AuthorSubpageResponse;
import io.elevenlabs.data.model.response.AvailableFiltersResponseModel;
import io.elevenlabs.data.model.response.BookmarkMarkdownResponseModel;
import io.elevenlabs.data.model.response.CollectionMetaResponse;
import io.elevenlabs.data.model.response.CustomerResponse;
import io.elevenlabs.data.model.response.ExploreCollectionDetailsV4Response;
import io.elevenlabs.data.model.response.GetCollectionResponse;
import io.elevenlabs.data.model.response.GetCreditHistoryResponse;
import io.elevenlabs.data.model.response.GetPublisherReadsResponse;
import io.elevenlabs.data.model.response.GetReadCollectionsResponse;
import io.elevenlabs.data.model.response.GetReadsResponseModel;
import io.elevenlabs.data.model.response.HomeV3Response;
import io.elevenlabs.data.model.response.HomeV3SubpageResponse;
import io.elevenlabs.data.model.response.HomeV4Response;
import io.elevenlabs.data.model.response.IntroScreensResponseModel;
import io.elevenlabs.data.model.response.RateReadResponseModel;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import io.elevenlabs.data.model.response.ReaderVoicesExploreResponseModelV2;
import io.elevenlabs.data.model.response.UseReferralResponse;
import io.elevenlabs.domain.model.InterestsQuestion;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.AddPodcastResult;
import io.elevenlabs.domain.services.MakePodcastResult;
import java.util.List;
import java.util.Map;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14114a;

    public /* synthetic */ b(int i10) {
        this.f14114a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        InterestsQuestion interests$lambda$0;
        AddPodcastResult addPodcast$lambda$1;
        ReadMeta addUpload$lambda$0;
        ReadMeta refreshRead$lambda$0;
        z rateRead$lambda$0;
        MakePodcastResult makePodcast$lambda$1;
        ReadMeta addSharedRead$lambda$0;
        switch (this.f14114a) {
            case 0:
                return CommunityVoicesServiceImpl$getCommunityVoices$2.d((ReaderVoicesExploreResponseModelV2) obj);
            case 1:
                return CommunityVoicesServiceImpl$getFilters$2.d((AvailableFiltersResponseModel) obj);
            case 2:
                return AuthorServiceImpl.a((AuthorSubpageResponse) obj);
            case 3:
                return CollectionsServiceImpl.b((GetCollectionResponse) obj);
            case 4:
                return CollectionsServiceImpl.e((CollectionMetaResponse) obj);
            case 5:
                return CollectionsServiceImpl.f((CollectionMetaResponse) obj);
            case 6:
                return CollectionsServiceImpl.a((CollectionMetaResponse) obj);
            case 7:
                return CollectionsServiceImpl.d((GetReadCollectionsResponse) obj);
            case 8:
                return CollectionsServiceImpl.c((CollectionMetaResponse) obj);
            case 9:
                return CustomerServiceImpl.a((CustomerResponse) obj);
            case 10:
                return CustomerServiceImpl.d((List) obj);
            case 11:
                return CustomerServiceImpl.b((GetCreditHistoryResponse) obj);
            case 12:
                return DuplicateReadIdExceptionKt.a((Map.Entry) obj);
            case 13:
                return ExploreCollectionsServiceImpl.a((ExploreCollectionDetailsV4Response) obj);
            case 14:
                return HomeServiceImpl.c((HomeV4Response) obj);
            case 15:
                return HomeServiceImpl.a((HomeV3SubpageResponse) obj);
            case 16:
                return HomeServiceImpl.b((HomeV3Response) obj);
            case 17:
                interests$lambda$0 = InterestsServiceImpl.getInterests$lambda$0((InterestsQuestionResponseModel) obj);
                return interests$lambda$0;
            case 18:
                return OnboardingServiceImpl.c((ReaderOnboardingSurveyModelOutput) obj);
            case 19:
                return OnboardingServiceImpl.b((IntroScreensResponseModel) obj);
            case 20:
                return PublisherServiceImpl.a((GetPublisherReadsResponse) obj);
            case 21:
                return ReadBookmarkServiceImpl.a((BookmarkMarkdownResponseModel) obj);
            case 22:
                return ReadsExploreServiceImpl.a((GetReadsResponseModel) obj);
            case 23:
                addPodcast$lambda$1 = ReadsServiceImpl.addPodcast$lambda$1((ReadMetadataResponseModel) obj);
                return addPodcast$lambda$1;
            case 24:
                addUpload$lambda$0 = ReadsServiceImpl.addUpload$lambda$0((ReadMetadataResponseModel) obj);
                return addUpload$lambda$0;
            case 25:
                refreshRead$lambda$0 = ReadsServiceImpl.refreshRead$lambda$0((ReadMetadataResponseModel) obj);
                return refreshRead$lambda$0;
            case 26:
                rateRead$lambda$0 = ReadsServiceImpl.rateRead$lambda$0((RateReadResponseModel) obj);
                return rateRead$lambda$0;
            case 27:
                makePodcast$lambda$1 = ReadsServiceImpl.makePodcast$lambda$1((ReadMetadataResponseModel) obj);
                return makePodcast$lambda$1;
            case 28:
                addSharedRead$lambda$0 = ReadsServiceImpl.addSharedRead$lambda$0((ReadMetadataResponseModel) obj);
                return addSharedRead$lambda$0;
            default:
                return ReferralServiceImpl.a((UseReferralResponse) obj);
        }
    }
}
