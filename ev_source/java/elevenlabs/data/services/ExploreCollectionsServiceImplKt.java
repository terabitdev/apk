package io.elevenlabs.data.services;

import io.elevenlabs.data.extensions.DataModelsToDomainModelsKt;
import io.elevenlabs.data.model.response.ExploreCollectionDetailsV4Response;
import io.elevenlabs.data.model.response.ExploreReadResponseModel;
import io.elevenlabs.domain.model.CollectionCategory;
import io.elevenlabs.domain.model.CollectionDetailsWithFirstPage;
import io.elevenlabs.domain.model.ExploreCollectionDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/CollectionDetailsWithFirstPage;", "Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ExploreCollectionsServiceImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CollectionDetailsWithFirstPage toDomain(ExploreCollectionDetailsV4Response exploreCollectionDetailsV4Response) {
        ExploreCollectionDetails exploreCollectionDetails = new ExploreCollectionDetails(exploreCollectionDetailsV4Response.getCollectionId(), exploreCollectionDetailsV4Response.getTitle(), exploreCollectionDetailsV4Response.getSubtitle(), exploreCollectionDetailsV4Response.getDescription(), CollectionCategory.INSTANCE.fromString(exploreCollectionDetailsV4Response.getCategory()), exploreCollectionDetailsV4Response.getShareUrl(), exploreCollectionDetailsV4Response.getMeta());
        List<ExploreReadResponseModel> items = exploreCollectionDetailsV4Response.getItems();
        ArrayList arrayList = new ArrayList(p.a0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(DataModelsToDomainModelsKt.toDomain((ExploreReadResponseModel) it.next()));
        }
        return new CollectionDetailsWithFirstPage(exploreCollectionDetails, arrayList, exploreCollectionDetailsV4Response.getHasMore(), exploreCollectionDetailsV4Response.getNextCursor());
    }
}
