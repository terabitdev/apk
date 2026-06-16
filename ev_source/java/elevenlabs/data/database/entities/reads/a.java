package io.elevenlabs.data.database.entities.reads;

import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.model.BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost;
import io.elevenlabs.data.model.BrowserExtensionConfig;
import io.elevenlabs.data.model.OneTimeProduct;
import io.elevenlabs.data.model.OneTimeProductV2;
import io.elevenlabs.data.model.PodcastUserRatings;
import io.elevenlabs.data.model.ReadRatingMap;
import io.elevenlabs.data.model.ReaderOnboardingQuestionModel;
import io.elevenlabs.data.model.ReaderOnboardingSurveyModelOutput;
import io.elevenlabs.data.model.ReaderSoundscape;
import io.elevenlabs.data.model.SizeableHeaderImage;
import io.elevenlabs.data.model.SubscriptionProductV2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14049a;

    public /* synthetic */ a(int i10) {
        this.f14049a = i10;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f14049a) {
            case 0:
                return ReadsDao.ReadMetaAudioPositionUpdate.a();
            case 1:
                return ReadsDao.ReadMetaCompletedAtUnixUpdate.a();
            case 2:
                return ReadsDao.ReadMetaLastCharOffsetUpdate.a();
            case 3:
                return ReadsDao.ReadMetaMarkedAsUnreadUpdate.a();
            case 4:
                return ReadsDao.ReadMetaSyncStatusUpdate.a();
            case 5:
                return ReadsDao.ReadMetaTitleUpdate.a();
            case 6:
                return BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost.a();
            case 7:
                return BodyBulkUpdateCollectionReadsUserCollectionsCollectionIdBulkReadsPost.b();
            case 8:
                return BrowserExtensionConfig.a();
            case 9:
                return BrowserExtensionConfig.ReviewPromptStatus.a();
            case 10:
                return OneTimeProduct.b();
            case 11:
                return OneTimeProduct.a();
            case 12:
                return OneTimeProduct.c();
            case 13:
                return OneTimeProductV2.a();
            case 14:
                return PodcastUserRatings.a();
            case 15:
                return PodcastUserRatings.b();
            case 16:
                return PodcastUserRatings.Content.a();
            case 17:
                return PodcastUserRatings.Voice.a();
            case 18:
                return ReadRatingMap.b();
            case 19:
                return ReadRatingMap.a();
            case 20:
                return ReaderOnboardingQuestionModel.a();
            case 21:
                return ReaderOnboardingSurveyModelOutput.a();
            case 22:
                return ReaderSoundscape.a();
            case 23:
                return SizeableHeaderImage.d();
            case 24:
                return SizeableHeaderImage.a();
            case 25:
                return SizeableHeaderImage.b();
            case 26:
                return SizeableHeaderImage.c();
            case 27:
                return SubscriptionProductV2.a();
            case 28:
                return SubscriptionProductV2.c();
            default:
                return SubscriptionProductV2.b();
        }
    }
}
