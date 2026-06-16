package io.elevenlabs.domain.services;

import a9.a;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.PageData;
import ir.i;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\b\u0010\tJH\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/ExploreCollectionsService;", "", "", "collectionId", "language", "Lir/i;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/CollectionDetailsWithFirstPage;", "getCollectionDetails", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "cursor", "", "pageSize", "Lio/elevenlabs/domain/model/PageData;", "Lio/elevenlabs/domain/model/ExploreRead;", "getCollectionItems", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ExploreCollectionsService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getCollectionDetails$default(ExploreCollectionsService exploreCollectionsService, String str, String str2, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return exploreCollectionsService.getCollectionDetails(str, str2, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: getCollectionDetails");
        return null;
    }

    static /* synthetic */ Object getCollectionItems$default(ExploreCollectionsService exploreCollectionsService, String str, String str2, Integer num, String str3, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                num = null;
            }
            if ((i10 & 8) != 0) {
                str3 = null;
            }
            return exploreCollectionsService.getCollectionItems(str, str2, num, str3, cVar);
        }
        a.y("Super calls with default arguments not supported in this target, function: getCollectionItems");
        return null;
    }

    Object getCollectionDetails(String str, String str2, c<? super i> cVar);

    Object getCollectionItems(String str, String str2, Integer num, String str3, c<? super AsyncCallResult<PageData<ExploreRead>>> cVar);
}
