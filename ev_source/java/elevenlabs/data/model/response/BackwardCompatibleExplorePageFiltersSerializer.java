package io.elevenlabs.data.model.response;

import io.elevenlabs.data.model.response.GetReadsExplorePageResponseModel;
import io.elevenlabs.data.serializer.FilteringListSerializer;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/model/response/BackwardCompatibleExplorePageFiltersSerializer;", "Lio/elevenlabs/data/serializer/FilteringListSerializer;", "Lio/elevenlabs/data/model/response/GetReadsExplorePageResponseModel$PageFilter;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackwardCompatibleExplorePageFiltersSerializer extends FilteringListSerializer<GetReadsExplorePageResponseModel.PageFilter> {
    public BackwardCompatibleExplorePageFiltersSerializer() {
        super(GetReadsExplorePageResponseModel.PageFilter.INSTANCE.serializer());
    }
}
