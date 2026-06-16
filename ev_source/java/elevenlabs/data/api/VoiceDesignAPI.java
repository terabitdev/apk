package io.elevenlabs.data.api;

import ct.i;
import ct.o;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.CreateVoiceDesignPreviewsRequest;
import io.elevenlabs.data.model.request.CreateVoiceFromPreviewRequest;
import io.elevenlabs.data.model.response.VoiceDesignCreateVoiceResponse;
import io.elevenlabs.data.model.response.VoiceDesignPreviewsResponse;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/VoiceDesignAPI;", "", "", "appCheckToken", "hcaptchaToken", "Lio/elevenlabs/data/model/request/CreateVoiceDesignPreviewsRequest;", "body", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/VoiceDesignPreviewsResponse;", "createPreviews", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/request/CreateVoiceDesignPreviewsRequest;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/request/CreateVoiceFromPreviewRequest;", "Lio/elevenlabs/data/model/response/VoiceDesignCreateVoiceResponse;", "createVoiceFromPreview", "(Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/data/model/request/CreateVoiceFromPreviewRequest;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface VoiceDesignAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object createPreviews$default(VoiceDesignAPI voiceDesignAPI, String str, String str2, CreateVoiceDesignPreviewsRequest createVoiceDesignPreviewsRequest, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return voiceDesignAPI.createPreviews(str, str2, createVoiceDesignPreviewsRequest, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: createPreviews");
        return null;
    }

    static /* synthetic */ Object createVoiceFromPreview$default(VoiceDesignAPI voiceDesignAPI, String str, String str2, CreateVoiceFromPreviewRequest createVoiceFromPreviewRequest, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return voiceDesignAPI.createVoiceFromPreview(str, str2, createVoiceFromPreviewRequest, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: createVoiceFromPreview");
        return null;
    }

    @o("/v1/reader/voices/voice-design/create-previews")
    Object createPreviews(@i("xi-app-check-token") String str, @i("hcaptcha-token") String str2, @ct.a CreateVoiceDesignPreviewsRequest createVoiceDesignPreviewsRequest, c<? super ApiResult<VoiceDesignPreviewsResponse>> cVar);

    @o("/v1/reader/voices/voice-design/create-voice-from-preview")
    Object createVoiceFromPreview(@i("xi-app-check-token") String str, @i("hcaptcha-token") String str2, @ct.a CreateVoiceFromPreviewRequest createVoiceFromPreviewRequest, c<? super ApiResult<VoiceDesignCreateVoiceResponse>> cVar);
}
