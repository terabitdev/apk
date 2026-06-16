package io.elevenlabs.data.api;

import ct.b;
import ct.f;
import ct.i;
import ct.o;
import ct.p;
import ct.s;
import ct.w;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.CreatePronunciationRequest;
import io.elevenlabs.data.model.request.PronunciationPreviewRequest;
import io.elevenlabs.data.model.request.UpdatePronunciationRequest;
import io.elevenlabs.data.model.response.PronunciationResponse;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.ResponseBody;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0013\u0010\nJ0\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0014\u001a\u00020\u00072\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\f\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/PronunciationsAPI;", "", "Lio/elevenlabs/data/model/ApiResult;", "", "Lio/elevenlabs/data/model/response/PronunciationResponse;", "getPronunciations", "(Lwn/c;)Ljava/lang/Object;", "", "id", "getPronunciation", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/request/CreatePronunciationRequest;", "request", "createPronunciation", "(Lio/elevenlabs/data/model/request/CreatePronunciationRequest;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/request/UpdatePronunciationRequest;", "updatePronunciation", "(Ljava/lang/String;Lio/elevenlabs/data/model/request/UpdatePronunciationRequest;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "deletePronunciation", "appCheckToken", "hcaptchaToken", "Lio/elevenlabs/data/model/request/PronunciationPreviewRequest;", "Lokhttp3/ResponseBody;", "previewPronunciation", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/request/PronunciationPreviewRequest;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PronunciationsAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object previewPronunciation$default(PronunciationsAPI pronunciationsAPI, String str, String str2, PronunciationPreviewRequest pronunciationPreviewRequest, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return pronunciationsAPI.previewPronunciation(str, str2, pronunciationPreviewRequest, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: previewPronunciation");
        return null;
    }

    @o("v1/reader/pronunciations")
    Object createPronunciation(@ct.a CreatePronunciationRequest createPronunciationRequest, c<? super ApiResult<PronunciationResponse>> cVar);

    @b("v1/reader/pronunciations/{id}")
    Object deletePronunciation(@s("id") String str, c<? super ApiResult<z>> cVar);

    @f("v1/reader/pronunciations/{id}")
    Object getPronunciation(@s("id") String str, c<? super ApiResult<PronunciationResponse>> cVar);

    @f("v1/reader/pronunciations")
    Object getPronunciations(c<? super ApiResult<List<PronunciationResponse>>> cVar);

    @o("v1/reader/pronunciations/preview")
    @w
    Object previewPronunciation(@i("xi-app-check-token") String str, @i("hcaptcha-token") String str2, @ct.a PronunciationPreviewRequest pronunciationPreviewRequest, c<? super ResponseBody> cVar);

    @p("v1/reader/pronunciations/{id}")
    Object updatePronunciation(@s("id") String str, @ct.a UpdatePronunciationRequest updatePronunciationRequest, c<? super ApiResult<PronunciationResponse>> cVar);
}
