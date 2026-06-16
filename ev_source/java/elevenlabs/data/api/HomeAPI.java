package io.elevenlabs.data.api;

import ct.f;
import ct.s;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.HomeV3Response;
import io.elevenlabs.data.model.response.HomeV3SubpageResponse;
import io.elevenlabs.data.model.response.HomeV4Response;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/HomeAPI;", "", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/HomeV3Response;", "getHomeV3Data", "(Lwn/c;)Ljava/lang/Object;", "", "subpageId", "cursor", "", "pageSize", "Lio/elevenlabs/data/model/response/HomeV3SubpageResponse;", "getHomeV3Subpage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lwn/c;)Ljava/lang/Object;", "appStoreCountry", "Lio/elevenlabs/data/model/response/HomeV4Response;", "getHomeV4Data", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface HomeAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getHomeV3Subpage$default(HomeAPI homeAPI, String str, String str2, Integer num, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                num = null;
            }
            return homeAPI.getHomeV3Subpage(str, str2, num, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getHomeV3Subpage");
        return null;
    }

    static /* synthetic */ Object getHomeV4Data$default(HomeAPI homeAPI, String str, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return homeAPI.getHomeV4Data(str, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getHomeV4Data");
        return null;
    }

    @f("/v1/reader/home/v3")
    Object getHomeV3Data(c<? super ApiResult<HomeV3Response>> cVar);

    @f("/v1/reader/home/v3/subpages/{subpageId}")
    Object getHomeV3Subpage(@s("subpageId") String str, @t("cursor") String str2, @t("page_size") Integer num, c<? super ApiResult<HomeV3SubpageResponse>> cVar);

    @f("/v1/reader/home/v4")
    Object getHomeV4Data(@t("app_store_country") String str, c<? super ApiResult<HomeV4Response>> cVar);
}
