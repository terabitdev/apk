package io.elevenlabs.data.api;

import ct.f;
import ct.i;
import ct.s;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ExploreCollectionDetailsV4Response;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JN\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ExploreCollectionsAPI;", "", "", "collectionId", "cacheControl", "cursor", "", "pageSize", "language", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;", "getCollectionDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ExploreCollectionsAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getCollectionDetails$default(ExploreCollectionsAPI exploreCollectionsAPI, String str, String str2, String str3, Integer num, String str4, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            if ((i10 & 8) != 0) {
                num = null;
            }
            if ((i10 & 16) != 0) {
                str4 = null;
            }
            return exploreCollectionsAPI.getCollectionDetails(str, str2, str3, num, str4, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getCollectionDetails");
        return null;
    }

    @f("/v1/reader/collections/v4/{collection_id}")
    Object getCollectionDetails(@s("collection_id") String str, @i("Cache-Control") String str2, @t("cursor") String str3, @t("page_size") Integer num, @t("language") String str4, c<? super ApiResult<ExploreCollectionDetailsV4Response>> cVar);
}
