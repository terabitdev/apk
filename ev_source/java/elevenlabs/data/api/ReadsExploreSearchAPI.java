package io.elevenlabs.data.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import ct.f;
import ct.o;
import ct.s;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.SearchClickRequest;
import io.elevenlabs.data.model.response.GetExploreSearchResponse;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ReadsExploreSearchAPI;", "", "", "searchQuery", "", "pageSize", "cursor", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/GetExploreSearchResponse;", FirebaseAnalytics.Event.SEARCH, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "discovery", "(Lwn/c;)Ljava/lang/Object;", "searchId", "Lio/elevenlabs/data/model/SearchClickRequest;", "body", "Lsn/z;", "reportClick", "(Ljava/lang/String;Lio/elevenlabs/data/model/SearchClickRequest;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadsExploreSearchAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object search$default(ReadsExploreSearchAPI readsExploreSearchAPI, String str, Long l4, String str2, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                l4 = 10L;
            }
            if ((i10 & 4) != 0) {
                str2 = null;
            }
            return readsExploreSearchAPI.search(str, l4, str2, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: search");
        return null;
    }

    @f("/v1/reader/reads/explore/search/discovery")
    Object discovery(c<? super ApiResult<GetExploreSearchResponse>> cVar);

    @o("/v1/reader/reads/explore/search/{search_id}/click")
    Object reportClick(@s("search_id") String str, @ct.a SearchClickRequest searchClickRequest, c<? super ApiResult<z>> cVar);

    @f("/v1/reader/reads/explore/search")
    Object search(@t("search_query") String str, @t("page_size") Long l4, @t("cursor") String str2, c<? super ApiResult<GetExploreSearchResponse>> cVar);
}
