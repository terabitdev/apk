package io.elevenlabs.data.api;

import ct.f;
import ct.o;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.ReaderOnboardingSurveyModelOutput;
import io.elevenlabs.data.model.response.IntroScreensResponseModel;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H§@¢\u0006\u0004\b\f\u0010\u0006J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0006¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/OnboardingAPI;", "", "Lio/elevenlabs/data/model/ApiResult;", "", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "getSuggestedVoices", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/ReaderOnboardingSurveyModelOutput;", "answers", "Lsn/z;", "postOnboardingAnswers", "(Lio/elevenlabs/data/model/ReaderOnboardingSurveyModelOutput;Lwn/c;)Ljava/lang/Object;", "getOnboardingAnswers", "Lio/elevenlabs/data/model/response/IntroScreensResponseModel;", "getIntro", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface OnboardingAPI {
    @f("/v1/reader/intro")
    Object getIntro(c<? super ApiResult<IntroScreensResponseModel>> cVar);

    @f("/v1/reader/onboarding")
    Object getOnboardingAnswers(c<? super ApiResult<ReaderOnboardingSurveyModelOutput>> cVar);

    @f("/v1/reader/onboarding/suggested-voices")
    Object getSuggestedVoices(c<? super ApiResult<List<VoiceItemResponseModel>>> cVar);

    @o("/v1/reader/onboarding")
    Object postOnboardingAnswers(@ct.a ReaderOnboardingSurveyModelOutput readerOnboardingSurveyModelOutput, c<? super ApiResult<z>> cVar);
}
