package io.elevenlabs.data.api;

import ct.f;
import ct.i;
import ct.o;
import ct.s;
import ct.t;
import ct.w;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import wn.c;
import zs.p0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ReadsUploadAPI;", "", "", "id", "Lzs/p0;", "Lokhttp3/ResponseBody;", "getReadHtml", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "body", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "addRead", "(Lokhttp3/RequestBody;Lwn/c;)Ljava/lang/Object;", "", "mock", "addPodcast", "(Lokhttp3/RequestBody;Ljava/lang/Boolean;Lwn/c;)Ljava/lang/Object;", "makePodcast", "(Ljava/lang/String;Ljava/lang/Boolean;Lwn/c;)Ljava/lang/Object;", "readId", "appCheckToken", "hcaptchaToken", "shareRead", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadsUploadAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object shareRead$default(ReadsUploadAPI readsUploadAPI, String str, String str2, String str3, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            return readsUploadAPI.shareRead(str, str2, str3, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: shareRead");
        return null;
    }

    @o("/v1/reader/reads/add_podcast")
    Object addPodcast(@ct.a RequestBody requestBody, @t("mock") Boolean bool, c<? super ApiResult<ReadMetadataResponseModel>> cVar);

    @o("/v1/reader/reads/add/v2")
    Object addRead(@ct.a RequestBody requestBody, c<? super ApiResult<ReadMetadataResponseModel>> cVar);

    @w
    @f("/v1/reader/reads/{id}/simple-html")
    Object getReadHtml(@s("id") String str, c<? super p0<ResponseBody>> cVar);

    @o("/v1/reader/reads/{id}/make_podcast")
    Object makePodcast(@s("id") String str, @t("mock") Boolean bool, c<? super ApiResult<ReadMetadataResponseModel>> cVar);

    @o("/v1/reader/reads/{read_id}/share")
    @w
    Object shareRead(@s("read_id") String str, @i("xi-app-check-token") String str2, @i("hcaptcha-token") String str3, c<? super p0<ResponseBody>> cVar);
}
