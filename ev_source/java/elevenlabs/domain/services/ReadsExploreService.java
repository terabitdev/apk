package io.elevenlabs.domain.services;

import a9.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadsExploreSearchResults;
import ir.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJp\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00112\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0013\u0010\u0014Jf\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00112\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0011H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b%\u0010&¨\u0006'À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/ReadsExploreService;", "", "", "category", "Lio/elevenlabs/domain/model/AsyncCallResult;", "", "Lio/elevenlabs/domain/model/ReadMeta;", "getExploreReads", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "language", FirebaseAnalytics.Param.CURRENCY, "", "filters", "cursor", "sortBy", "", "useCache", "Lir/i;", "Lio/elevenlabs/domain/model/ReadsExplorePage;", "getExploreIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLwn/c;)Ljava/lang/Object;", "getExploreFilter", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "query", "Lio/elevenlabs/domain/model/ReadsExploreSearchResults;", FirebaseAnalytics.Event.SEARCH, "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "searchId", "itemId", "itemType", "Lsn/z;", "postSearchItemClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "getPersistedExploreLanguage", "()Ljava/lang/String;", "observePersistedExploreLanguage", "()Lir/i;", "setPersistedExploreLanguage", "(Ljava/lang/String;)V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadsExploreService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getExploreFilter$default(ReadsExploreService readsExploreService, String str, String str2, Map map, String str3, String str4, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 8) != 0) {
                str3 = null;
            }
            if ((i10 & 16) != 0) {
                str4 = null;
            }
            return readsExploreService.getExploreFilter(str, str2, map, str3, str4, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: getExploreFilter");
        return null;
    }

    static /* synthetic */ Object getExploreIndex$default(ReadsExploreService readsExploreService, String str, String str2, Map map, String str3, String str4, boolean z6, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 8) != 0) {
                str3 = null;
            }
            if ((i10 & 16) != 0) {
                str4 = null;
            }
            if ((i10 & 32) != 0) {
                z6 = true;
            }
            return readsExploreService.getExploreIndex(str, str2, map, str3, str4, z6, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: getExploreIndex");
        return null;
    }

    static /* synthetic */ Object search$default(ReadsExploreService readsExploreService, String str, String str2, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return readsExploreService.search(str, str2, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: search");
        return null;
    }

    Object getExploreFilter(String str, String str2, Map<String, ? extends List<String>> map, String str3, String str4, c<? super i> cVar);

    Object getExploreIndex(String str, String str2, Map<String, ? extends List<String>> map, String str3, String str4, boolean z6, c<? super i> cVar);

    Object getExploreReads(String str, c<? super AsyncCallResult<List<ReadMeta>>> cVar);

    String getPersistedExploreLanguage();

    i observePersistedExploreLanguage();

    Object postSearchItemClick(String str, String str2, String str3, c<? super z> cVar);

    Object search(String str, String str2, c<? super AsyncCallResult<ReadsExploreSearchResults>> cVar);

    void setPersistedExploreLanguage(String language);
}
