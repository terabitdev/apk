package io.elevenlabs.data.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ct.f;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.AvailableFiltersResponseModel;
import io.elevenlabs.data.model.response.ReaderVoicesExploreResponseModelV2;
import io.livekit.android.rpc.RpcError;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J¼\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/CommunityVoicesApi;", "", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/AvailableFiltersResponseModel;", "getAvailableFilters", "(Lwn/c;)Ljava/lang/Object;", "", "page", "pageSize", "", "category", "gender", "age", "accent", "language", FirebaseAnalytics.Event.SEARCH, "", "useCases", "descriptives", "", "featured", "ownerId", "sort", "Lio/elevenlabs/data/model/response/ReaderVoicesExploreResponseModelV2;", "getCommunityVoices", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface CommunityVoicesApi {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getCommunityVoices$default(CommunityVoicesApi communityVoicesApi, int i10, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Set set, Set set2, Boolean bool, String str7, String str8, c cVar, int i11, Object obj) {
        Integer num2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Set set3;
        Set set4;
        Boolean bool2;
        String str15;
        String str16;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            if ((i11 & 4) != 0) {
                str9 = null;
            } else {
                str9 = str;
            }
            if ((i11 & 8) != 0) {
                str10 = null;
            } else {
                str10 = str2;
            }
            if ((i11 & 16) != 0) {
                str11 = null;
            } else {
                str11 = str3;
            }
            if ((i11 & 32) != 0) {
                str12 = null;
            } else {
                str12 = str4;
            }
            if ((i11 & 64) != 0) {
                str13 = null;
            } else {
                str13 = str5;
            }
            if ((i11 & 128) != 0) {
                str14 = null;
            } else {
                str14 = str6;
            }
            if ((i11 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                set3 = null;
            } else {
                set3 = set;
            }
            if ((i11 & 512) != 0) {
                set4 = null;
            } else {
                set4 = set2;
            }
            if ((i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i11 & 2048) != 0) {
                str15 = null;
            } else {
                str15 = str7;
            }
            if ((i11 & 4096) != 0) {
                str16 = null;
            } else {
                str16 = str8;
            }
            return communityVoicesApi.getCommunityVoices(i10, num2, str9, str10, str11, str12, str13, str14, set3, set4, bool2, str15, str16, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getCommunityVoices");
        return null;
    }

    @f("/v1/reader/voices/explore/v2/filters")
    Object getAvailableFilters(c<? super ApiResult<AvailableFiltersResponseModel>> cVar);

    @f("/v1/reader/voices/explore/v2")
    Object getCommunityVoices(@t("page") int i10, @t("page_size") Integer num, @t("category") String str, @t("gender") String str2, @t("age") String str3, @t("accent") String str4, @t("language") String str5, @t("search") String str6, @t("use_cases") Set<String> set, @t("descriptives") Set<String> set2, @t("featured") Boolean bool, @t("owner_id") String str7, @t("sort") String str8, c<? super ApiResult<ReaderVoicesExploreResponseModelV2>> cVar);
}
