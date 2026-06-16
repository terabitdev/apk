package io.elevenlabs.data.api;

import ct.f;
import ct.i;
import ct.s;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.GetPublisherReadsResponse;
import io.elevenlabs.data.model.response.ReaderPublisherProfileResponseModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/PublisherApi;", "", "", "publisherProfileId", "cacheControl", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;", "getPublisherProfileById", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "cursor", "", "pageSize", "Lio/elevenlabs/data/model/response/GetPublisherReadsResponse;", "getPublisherReads", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PublisherApi {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getPublisherReads$default(PublisherApi publisherApi, String str, String str2, Long l4, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                l4 = 10L;
            }
            return publisherApi.getPublisherReads(str, str2, l4, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getPublisherReads");
        return null;
    }

    @f("/v1/reader/publisher/{publisher_profile_id}")
    Object getPublisherProfileById(@s("publisher_profile_id") String str, @i("Cache-Control") String str2, c<? super ApiResult<ReaderPublisherProfileResponseModel>> cVar);

    @f("/v1/reader/reads/publisher/{publisher_profile_id}")
    Object getPublisherReads(@s("publisher_profile_id") String str, @t("cursor") String str2, @t("page_size") Long l4, c<? super ApiResult<GetPublisherReadsResponse>> cVar);
}
