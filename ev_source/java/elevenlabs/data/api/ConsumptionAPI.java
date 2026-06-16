package io.elevenlabs.data.api;

import ct.o;
import ct.s;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.ConsumptionSyncRequest;
import io.elevenlabs.data.model.response.ConsumptionSyncResponse;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ConsumptionAPI;", "", "", "readId", "Lio/elevenlabs/data/model/request/ConsumptionSyncRequest;", "request", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ConsumptionSyncResponse;", "trackConsumption", "(Ljava/lang/String;Lio/elevenlabs/data/model/request/ConsumptionSyncRequest;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ConsumptionAPI {
    @o("/v1/reader/reads/{read_id}/consumption")
    Object trackConsumption(@s("read_id") String str, @ct.a ConsumptionSyncRequest consumptionSyncRequest, c<? super ApiResult<ConsumptionSyncResponse>> cVar);
}
