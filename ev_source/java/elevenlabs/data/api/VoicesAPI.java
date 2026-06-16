package io.elevenlabs.data.api;

import ct.b;
import ct.f;
import ct.i;
import ct.k;
import ct.o;
import ct.s;
import ct.t;
import ct.w;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.GetVoicesHomeResponse;
import io.elevenlabs.data.model.response.ReaderVoicesResponseModel;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.ResponseBody;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u000eJF\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/VoicesAPI;", "", "", "id", "cacheControl", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "getVoice", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/response/ReaderVoicesResponseModel;", "getVoices", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/response/GetVoicesHomeResponse;", "getVoicesHome", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "voiceId", "addVoice", "Lsn/z;", "deleteVoice", "readId", "", "charOffset", "appCheckToken", "hcaptchaToken", "Lokhttp3/ResponseBody;", "getContextualPreview", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface VoicesAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getContextualPreview$default(VoicesAPI voicesAPI, String str, String str2, long j4, String str3, String str4, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 16) != 0) {
                str4 = null;
            }
            return voicesAPI.getContextualPreview(str, str2, j4, str3, str4, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getContextualPreview");
        return null;
    }

    @o("/v1/reader/voices/add/{voiceId}")
    Object addVoice(@s("voiceId") String str, c<? super ApiResult<VoiceItemResponseModel>> cVar);

    @b("/v1/reader/voices/{voiceId}")
    Object deleteVoice(@s("voiceId") String str, c<? super ApiResult<z>> cVar);

    @w
    @f("/v1/reader/voices/{voiceId}/contextual-preview")
    Object getContextualPreview(@s("voiceId") String str, @t("read_id") String str2, @t("char_offset") long j4, @i("xi-app-check-token") String str3, @i("hcaptcha-token") String str4, c<? super ResponseBody> cVar);

    @f("/v1/reader/voices/{id}")
    Object getVoice(@s("id") String str, @i("Cache-Control") String str2, c<? super ApiResult<VoiceItemResponseModel>> cVar);

    @k({"Cache-Control: no-cache"})
    @f("/v1/reader/voices")
    Object getVoices(c<? super ApiResult<ReaderVoicesResponseModel>> cVar);

    @f("/v1/reader/voices/v2/home")
    Object getVoicesHome(@i("Cache-Control") String str, c<? super ApiResult<GetVoicesHomeResponse>> cVar);
}
