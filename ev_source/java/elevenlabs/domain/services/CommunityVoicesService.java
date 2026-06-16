package io.elevenlabs.domain.services;

import a9.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.AvailableFilters;
import io.elevenlabs.domain.model.CommunityVoicesPage;
import io.livekit.android.rpc.RpcError;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u008e\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/CommunityVoicesService;", "", "", "page", "pageSize", "", "sort", "accent", "category", "gender", "age", "", "useCases", "language", FirebaseAnalytics.Event.SEARCH, "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/CommunityVoicesPage;", "getCommunityVoices", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/AvailableFilters;", "getFilters", "(Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface CommunityVoicesService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getCommunityVoices$default(CommunityVoicesService communityVoicesService, int i10, int i11, String str, String str2, String str3, String str4, String str5, Set set, String str6, String str7, c cVar, int i12, Object obj) {
        int i13;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Set set2;
        String str13;
        String str14;
        CommunityVoicesService communityVoicesService2;
        int i14;
        c cVar2;
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i13 = 20;
            } else {
                i13 = i11;
            }
            if ((i12 & 4) != 0) {
                str8 = null;
            } else {
                str8 = str;
            }
            if ((i12 & 8) != 0) {
                str9 = null;
            } else {
                str9 = str2;
            }
            if ((i12 & 16) != 0) {
                str10 = null;
            } else {
                str10 = str3;
            }
            if ((i12 & 32) != 0) {
                str11 = null;
            } else {
                str11 = str4;
            }
            if ((i12 & 64) != 0) {
                str12 = null;
            } else {
                str12 = str5;
            }
            if ((i12 & 128) != 0) {
                set2 = null;
            } else {
                set2 = set;
            }
            if ((i12 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                str13 = null;
            } else {
                str13 = str6;
            }
            if ((i12 & 512) != 0) {
                str14 = null;
                i14 = i10;
                cVar2 = cVar;
                communityVoicesService2 = communityVoicesService;
            } else {
                str14 = str7;
                communityVoicesService2 = communityVoicesService;
                i14 = i10;
                cVar2 = cVar;
            }
            return communityVoicesService2.getCommunityVoices(i14, i13, str8, str9, str10, str11, str12, set2, str13, str14, cVar2);
        }
        a.y("Super calls with default arguments not supported in this target, function: getCommunityVoices");
        return null;
    }

    Object getCommunityVoices(int i10, int i11, String str, String str2, String str3, String str4, String str5, Set<String> set, String str6, String str7, c<? super AsyncCallResult<CommunityVoicesPage>> cVar);

    Object getFilters(c<? super AsyncCallResult<AvailableFilters>> cVar);
}
