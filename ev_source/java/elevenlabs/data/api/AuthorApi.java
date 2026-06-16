package io.elevenlabs.data.api;

import ct.f;
import ct.i;
import ct.o;
import ct.s;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.AuthorProfileResponse;
import io.elevenlabs.data.model.response.AuthorSubpageResponse;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJN\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/AuthorApi;", "", "", "authorId", "cacheControl", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/AuthorProfileResponse;", "getAuthorProfile", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "subpageId", "cursor", "", "pageSize", "sortKey", "Lio/elevenlabs/data/model/response/AuthorSubpageResponse;", "getAuthorSubpage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "followAuthor", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "unfollowAuthor", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AuthorApi {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getAuthorSubpage$default(AuthorApi authorApi, String str, String str2, String str3, Integer num, String str4, c cVar, int i10, Object obj) {
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
            return authorApi.getAuthorSubpage(str, str2, str3, num, str4, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getAuthorSubpage");
        return null;
    }

    @o("/v1/reader/author/{author_id}/follow")
    Object followAuthor(@s("author_id") String str, c<? super ApiResult<z>> cVar);

    @f("/v1/reader/author/{author_id}")
    Object getAuthorProfile(@s("author_id") String str, @i("Cache-Control") String str2, c<? super ApiResult<AuthorProfileResponse>> cVar);

    @f("/v1/reader/author/{author_id}/subpages/{subpage_id}")
    Object getAuthorSubpage(@s("author_id") String str, @s("subpage_id") String str2, @t("cursor") String str3, @t("page_size") Integer num, @t("sort_by") String str4, c<? super ApiResult<AuthorSubpageResponse>> cVar);

    @o("/v1/reader/author/{author_id}/unfollow")
    Object unfollowAuthor(@s("author_id") String str, c<? super ApiResult<z>> cVar);
}
