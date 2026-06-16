package io.elevenlabs.data.api;

import ct.f;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ReaderVoicesResponseModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/RecentVoicesApi;", "", "", "limit", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ReaderVoicesResponseModel;", "getRecentlyUsedVoices", "(Ljava/lang/Long;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface RecentVoicesApi {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getRecentlyUsedVoices$default(RecentVoicesApi recentVoicesApi, Long l4, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                l4 = null;
            }
            return recentVoicesApi.getRecentlyUsedVoices(l4, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getRecentlyUsedVoices");
        return null;
    }

    @f("v1/reader/voices/recent")
    Object getRecentlyUsedVoices(@t("limit") Long l4, c<? super ApiResult<ReaderVoicesResponseModel>> cVar);
}
