package io.elevenlabs.data.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import ct.b;
import ct.f;
import ct.i;
import ct.n;
import ct.o;
import ct.s;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.BodyRateAReadReadsReadIdRatePost;
import io.elevenlabs.data.model.ReadUpdateModel;
import io.elevenlabs.data.model.request.RedeemCodeRequest;
import io.elevenlabs.data.model.response.BulkConversionResponse;
import io.elevenlabs.data.model.response.ConvertReadResponseModel;
import io.elevenlabs.data.model.response.GetReadsChangesResponseModel;
import io.elevenlabs.data.model.response.GetReadsExplorePageResponseModel;
import io.elevenlabs.data.model.response.GetReadsResponseModel;
import io.elevenlabs.data.model.response.RateReadResponseModel;
import io.elevenlabs.data.model.response.ReadConversionResponseModel;
import io.elevenlabs.data.model.response.ReadDetailsResponse;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.u;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0011Jf\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001dH§@¢\u0006\u0004\b \u0010!J\\\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00062\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001dH§@¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010$\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010\u0011J*\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00062\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020&H§@¢\u0006\u0004\b)\u0010*J \u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010$\u001a\u00020\u0002H§@¢\u0006\u0004\b+\u0010\u0011J*\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020\u0002H§@¢\u0006\u0004\b-\u0010\u000eJ \u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010$\u001a\u00020\u0002H§@¢\u0006\u0004\b.\u0010\u0011J \u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010$\u001a\u00020\u0002H§@¢\u0006\u0004\b/\u0010\u0011J*\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u000200H§@¢\u0006\u0004\b1\u00102J4\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00062\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u000204H§@¢\u0006\u0004\b7\u00108J*\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00062\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u0002H§@¢\u0006\u0004\b:\u0010\u000eJ4\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00062\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u00022\b\b\u0001\u00105\u001a\u000204H§@¢\u0006\u0004\b<\u00108J*\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00062\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b>\u0010\u000e¨\u0006?À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ReadsAPI;", "", "", "lastSortId", "", "lastUpdatedAtUnix", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/GetReadsChangesResponseModel;", "getChanges", "(Ljava/lang/String;Ljava/lang/Long;Lwn/c;)Ljava/lang/Object;", "id", "cacheControl", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "getRead", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "removeRead", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/ReadUpdateModel;", "readMeta", "updateRead", "(Ljava/lang/String;Lio/elevenlabs/data/model/ReadUpdateModel;Lwn/c;)Ljava/lang/Object;", "category", "Lio/elevenlabs/data/model/response/GetReadsResponseModel;", "getExploreReads", "language", FirebaseAnalytics.Param.CURRENCY, "cursor", "sortBy", "", "filters", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel;", "getExploreIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lwn/c;)Ljava/lang/Object;", "getExploreFilter", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lwn/c;)Ljava/lang/Object;", "readId", "addExploreRead", "Lio/elevenlabs/data/model/BodyRateAReadReadsReadIdRatePost;", "body", "Lio/elevenlabs/data/model/response/RateReadResponseModel;", "rateRead", "(Ljava/lang/String;Lio/elevenlabs/data/model/BodyRateAReadReadsReadIdRatePost;Lwn/c;)Ljava/lang/Object;", "retryPodcast", "publicUserId", "addSharedRead", "archiveRead", "unarchiveRead", "Lio/elevenlabs/data/model/request/RedeemCodeRequest;", "redeemRead", "(Ljava/lang/String;Lio/elevenlabs/data/model/request/RedeemCodeRequest;Lwn/c;)Ljava/lang/Object;", "voiceId", "", "chapterIndex", "Lio/elevenlabs/data/model/response/ConvertReadResponseModel;", "convertChapterForDownload", "(Ljava/lang/String;Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/response/BulkConversionResponse;", "convertAllChaptersForDownload", "Lio/elevenlabs/data/model/response/ReadConversionResponseModel;", "getChapterConversionStatus", "Lio/elevenlabs/data/model/response/ReadDetailsResponse;", "getReadDetails", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadsAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getChanges$default(ReadsAPI readsAPI, String str, Long l4, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                l4 = 0L;
            }
            return readsAPI.getChanges(str, l4, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getChanges");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object getExploreFilter$default(ReadsAPI readsAPI, String str, String str2, String str3, String str4, Map map, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            if ((i10 & 8) != 0) {
                str4 = null;
            }
            if ((i10 & 16) != 0) {
                map = u.f33548a;
            }
            return readsAPI.getExploreFilter(str, str2, str3, str4, map, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getExploreFilter");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object getExploreIndex$default(ReadsAPI readsAPI, String str, String str2, String str3, String str4, String str5, Map map, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            if ((i10 & 8) != 0) {
                str4 = null;
            }
            if ((i10 & 16) != 0) {
                str5 = null;
            }
            if ((i10 & 32) != 0) {
                map = u.f33548a;
            }
            return readsAPI.getExploreIndex(str, str2, str3, str4, str5, map, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getExploreIndex");
        return null;
    }

    @o("/v1/reader/reads/explore/add/{read_id}")
    Object addExploreRead(@s("read_id") String str, c<? super ApiResult<z>> cVar);

    @o("/v1/reader/reads/{public_user_id}/{read_id}/add")
    Object addSharedRead(@s("public_user_id") String str, @s("read_id") String str2, c<? super ApiResult<ReadMetadataResponseModel>> cVar);

    @o("/v1/reader/reads/{read_id}/archive")
    Object archiveRead(@s("read_id") String str, c<? super ApiResult<z>> cVar);

    @o("/v1/reader/reads/{read_id}/convert-all/{voice_id}")
    Object convertAllChaptersForDownload(@s("read_id") String str, @s("voice_id") String str2, c<? super ApiResult<BulkConversionResponse>> cVar);

    @o("/v1/reader/reads/{read_id}/convert/{voice_id}")
    Object convertChapterForDownload(@s("read_id") String str, @s("voice_id") String str2, @t("chapter_index") int i10, c<? super ApiResult<ConvertReadResponseModel>> cVar);

    @f("/v1/reader/reads/changes")
    Object getChanges(@t("last_sort_id") String str, @t("last_updated_at_unix") Long l4, c<? super ApiResult<GetReadsChangesResponseModel>> cVar);

    @f("/v1/reader/reads/{read_id}/convert/{voice_id}/status")
    Object getChapterConversionStatus(@s("read_id") String str, @s("voice_id") String str2, @t("chapter_index") int i10, c<? super ApiResult<ReadConversionResponseModel>> cVar);

    @f("/v1/reader/reads/explore/filter/v4")
    Object getExploreFilter(@t("language") String str, @t("currency") String str2, @t("cursor") String str3, @t("sort_by") String str4, @ct.u(encoded = true) Map<String, String> map, c<? super ApiResult<GetReadsExplorePageResponseModel>> cVar);

    @f("/v1/reader/reads/explore/index/v4")
    Object getExploreIndex(@i("Cache-Control") String str, @t("language") String str2, @t("currency") String str3, @t("cursor") String str4, @t("sort_by") String str5, @ct.u(encoded = true) Map<String, String> map, c<? super ApiResult<GetReadsExplorePageResponseModel>> cVar);

    @f("/v1/reader/reads/explore")
    Object getExploreReads(@t("category") String str, c<? super ApiResult<GetReadsResponseModel>> cVar);

    @f("/v1/reader/reads/{id}")
    Object getRead(@s("id") String str, @i("Cache-Control") String str2, c<? super ApiResult<ReadMetadataResponseModel>> cVar);

    @f("/v1/reader/reads/details/{read_id}")
    Object getReadDetails(@s("read_id") String str, @i("Cache-Control") String str2, c<? super ApiResult<ReadDetailsResponse>> cVar);

    @o("/v1/reader/reads/{read_id}/rate")
    Object rateRead(@s("read_id") String str, @ct.a BodyRateAReadReadsReadIdRatePost bodyRateAReadReadsReadIdRatePost, c<? super ApiResult<RateReadResponseModel>> cVar);

    @o("/v1/reader/reads/purchase/{read_id}/redeem_code")
    Object redeemRead(@s("read_id") String str, @ct.a RedeemCodeRequest redeemCodeRequest, c<? super ApiResult<z>> cVar);

    @b("/v1/reader/reads/{id}")
    Object removeRead(@s("id") String str, c<? super ApiResult<z>> cVar);

    @o("/v1/reader/reads/{read_id}/retry_podcast")
    Object retryPodcast(@s("read_id") String str, c<? super ApiResult<z>> cVar);

    @o("/v1/reader/reads/{read_id}/unarchive")
    Object unarchiveRead(@s("read_id") String str, c<? super ApiResult<z>> cVar);

    @n("/v1/reader/reads/{id}")
    Object updateRead(@s("id") String str, @ct.a ReadUpdateModel readUpdateModel, c<? super ApiResult<z>> cVar);
}
